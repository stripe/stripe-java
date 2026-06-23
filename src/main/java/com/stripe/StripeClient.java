package com.stripe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.EventNotification;
import com.stripe.net.*;
import com.stripe.net.Webhook.Signature;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import lombok.Builder;
import lombok.Getter;

/**
 * This is the primary entrypoint to make requests against Stripe's API. It provides a means of
 * accessing all the methods on the Stripe API, and the ability to set configuration such as apiKey
 * and connection timeouts.
 */
public class StripeClient {
  private final StripeResponseGetter responseGetter;

  /**
   * Constructs a StripeClient with default settings, using the provided API key. Use the builder
   * instead if you require more complex configuration.
   */
  public StripeClient(String apiKey) {
    this.responseGetter =
        new LiveStripeResponseGetter(builder().setApiKey(apiKey).buildOptions(), null);
  }

  /**
   * Constructs a StripeClient with a custom StripeResponseGetter.
   *
   * <p>Use this for testing, or advanced use cases where you need to make fundamental changes to
   * how the StripeClient makes requests.
   */
  public StripeClient(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  protected StripeResponseGetter getResponseGetter() {
    return responseGetter;
  }

  /** Gets the current StripeContext from the client's configuration. Used in unit testing. */
  protected String getContext() {
    // TODO(major): add getOptions to the StripeResponseGetter interface? that would simplify this
    if (!(responseGetter instanceof LiveStripeResponseGetter)) {
      return null;
    }

    LiveStripeResponseGetter liveGetter = (LiveStripeResponseGetter) responseGetter;
    StripeResponseGetterOptions options = liveGetter.getOptions();

    return options.getStripeContext();
  }

  /**
   * Creates a new StripeClient with the same configuration as this client but with a custom
   * StripeContext. This method is useful for creating thread-safe clients with different contexts,
   * such as when processing webhooks in parallel where each webhook has its own context.
   *
   * <p>The new client will share the same configuration (API key, timeouts, proxy settings, etc.)
   * and HTTP client as this client, but will have the specified context. This allows for efficient
   * parallel processing without reinitializing HTTP connections.
   *
   * @param context the custom stripe_context to use for the new client
   * @return a new StripeClient with the custom context
   * @throws IllegalStateException if this client doesn't use a LiveStripeResponseGetter
   */
  public StripeClient withStripeContext(StripeContext context) {
    // Convert StripeContext to String
    String contextString = (context == null) ? null : context.toString();

    StripeResponseGetter responseGetter = this.getResponseGetter();

    // We can only create a new client for LiveStripeResponseGetter because it's the only class with
    // `getOptions()`. If we add that method to the interface in a later major, we could remove this
    // check.
    if (!(responseGetter instanceof LiveStripeResponseGetter)) {
      throw new IllegalStateException(
          "Cannot create a client with custom context for non-Live response getters");
    }

    LiveStripeResponseGetter liveGetter = (LiveStripeResponseGetter) responseGetter;

    // Create a new LiveStripeResponseGetter with updated context, reusing the HTTP client
    LiveStripeResponseGetter newResponseGetter =
        liveGetter.withNewOptions(
            options -> {
              ClientStripeResponseGetterOptions existingOptions =
                  (ClientStripeResponseGetterOptions) options;

              return existingOptions.toBuilder().stripeContext(contextString).build();
            });

    // Create and return a new StripeClient with the new response getter
    return new StripeClient(newResponseGetter);
  }

  /**
   * Returns an StripeEvent instance using the provided JSON payload. Throws a JsonSyntaxException
   * if the payload is not valid JSON, and a SignatureVerificationException if the signature
   * verification fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @return the StripeEvent instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public EventNotification parseEventNotification(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    return parseEventNotification(payload, sigHeader, secret, Webhook.DEFAULT_TOLERANCE);
  }

  /**
   * Returns an StripeEvent instance using the provided JSON payload. Throws a JsonSyntaxException
   * if the payload is not valid JSON, and a SignatureVerificationException if the signature
   * verification fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance number of seconds that the event's timestamp can differ from the system time.
   *     Passing `0` will disable the time check entirely and is **strongly discouraged**.
   * @return the StripeEvent instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public EventNotification parseEventNotification(
      String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    Signature.verifyHeader(payload, sigHeader, secret, tolerance);

    // TODO(DEVSDK-2968): Remove once Custom Events are sent with the correct type.
    // Rewrite "v2.extend.objects.object_record.*" type using related_object.type from the raw JSON,
    // since the base EventNotification class does not expose getRelatedObject().
    String effectivePayload = payload;
    {
      JsonObject json = JsonParser.parseString(payload).getAsJsonObject();
      JsonElement typeEl = json.get("type");
      if (typeEl != null && !typeEl.isJsonNull()) {
        String eventType = typeEl.getAsString();
        if (eventType.startsWith("v2.extend.objects.object_record")) {
          JsonElement roEl = json.get("related_object");
          if (roEl != null && roEl.isJsonObject()) {
            JsonElement roTypeEl = roEl.getAsJsonObject().get("type");
            if (roTypeEl != null && !roTypeEl.isJsonNull()) {
              json.addProperty("type", eventType.replace("v2.extend.objects.object_record", roTypeEl.getAsString()));
              effectivePayload = json.toString();
            }
          }
        }
      }
    }

    EventNotification notification = EventNotification.fromJson(effectivePayload, this);

    return notification;
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public com.stripe.model.Event constructEvent(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    com.stripe.model.Event event = Webhook.constructEvent(payload, sigHeader, secret);
    event.setResponseGetter(this.getResponseGetter());
    return event;
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance maximum difference in seconds allowed between the header's timestamp and the
   *     current time
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public com.stripe.model.Event constructEvent(
      String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    com.stripe.model.Event event = Webhook.constructEvent(payload, sigHeader, secret, tolerance);
    event.setResponseGetter(this.getResponseGetter());
    return event;
  }

  // The beginning of the section generated from our OpenAPI spec
  // The end of the section generated from our OpenAPI spec
  @SuppressWarnings("ObjectToString")
  @Builder(toBuilder = true)
  static class ClientStripeResponseGetterOptions extends StripeResponseGetterOptions {
    // When adding setting here keep them in sync with settings in RequestOptions and
    // in the RequestOptions.merge method
    @Getter(onMethod_ = {@Override})
    private final Authenticator authenticator;

    @Getter(onMethod_ = {@Override})
    private final String clientId;

    @Getter(onMethod_ = {@Override})
    private final int connectTimeout;

    @Getter(onMethod_ = {@Override})
    private final int readTimeout;

    @Getter(onMethod_ = {@Override})
    private final int maxNetworkRetries;

    @Getter(onMethod_ = {@Override})
    private final Proxy connectionProxy;

    @Getter(onMethod_ = {@Override})
    private final PasswordAuthentication proxyCredential;

    @Getter(onMethod_ = {@Override})
    private final String apiBase;

    @Getter(onMethod_ = {@Override})
    private final String filesBase;

    @Getter(onMethod_ = {@Override})
    private final String connectBase;

    @Getter(onMethod_ = {@Override})
    private final String meterEventsBase;

    @Getter(onMethod_ = {@Override})
    private final String stripeAccount;

    @Getter(onMethod_ = {@Override})
    private final String stripeContext;

    ClientStripeResponseGetterOptions(
        Authenticator authenticator,
        String clientId,
        int connectTimeout,
        int readTimeout,
        int maxNetworkRetries,
        Proxy connectionProxy,
        PasswordAuthentication proxyCredential,
        String apiBase,
        String filesBase,
        String connectBase,
        String meterEventsBase,
        String stripeAccount,
        String stripeContext) {
      this.authenticator = authenticator;
      this.clientId = clientId;
      this.connectTimeout = connectTimeout;
      this.readTimeout = readTimeout;
      this.maxNetworkRetries = maxNetworkRetries;
      this.connectionProxy = connectionProxy;
      this.proxyCredential = proxyCredential;
      this.apiBase = apiBase;
      this.filesBase = filesBase;
      this.connectBase = connectBase;
      this.meterEventsBase = meterEventsBase;
      this.stripeAccount = stripeAccount;
      this.stripeContext = stripeContext;
    }
  }

  /**
   * Builder class for creating a {@link StripeClient} instance. Allows you to specify settings like
   * the API key, connect and read timeouts, and proxy settings.
   */
  public static StripeClientBuilder builder() {
    return new StripeClientBuilder();
  }

  public static final class StripeClientBuilder {
    private Authenticator authenticator;
    private String clientId;
    private int connectTimeout = Stripe.DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = Stripe.DEFAULT_READ_TIMEOUT;
    private int maxNetworkRetries;
    private Proxy connectionProxy;
    private PasswordAuthentication proxyCredential;
    private String apiBase = Stripe.LIVE_API_BASE;
    private String filesBase = Stripe.UPLOAD_API_BASE;
    private String connectBase = Stripe.CONNECT_API_BASE;
    private String meterEventsBase = Stripe.METER_EVENTS_API_BASE;
    private String stripeAccount;
    private String stripeContext;
    private HttpClient httpClient;

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public StripeClientBuilder() {}

    public Authenticator getAuthenticator() {
      return this.authenticator;
    }

    /**
     * Sets the authenticator used to authorize requests. Use this for custom authentication
     * strategies. For standard API key authentication, prefer {@link #setApiKey(String)}.
     *
     * <p>This shares a backing field with {@link #setApiKey(String)} — calling one overwrites the
     * other.
     *
     * @param authenticator the authenticator to use
     */
    public StripeClientBuilder setAuthenticator(Authenticator authenticator) {
      this.authenticator = authenticator;
      return this;
    }

    /**
     * Sets the API key for bearer token authentication. This is a convenience method equivalent to
     * calling {@code setAuthenticator(new BearerTokenAuthenticator(apiKey))}.
     *
     * <p>This shares a backing field with {@link #setAuthenticator(Authenticator)} — calling one
     * overwrites the other.
     *
     * @param apiKey the API key; if null, clears the authenticator
     */
    public StripeClientBuilder setApiKey(String apiKey) {
      if (apiKey == null) {
        this.authenticator = null;
      } else {
        this.authenticator = new BearerTokenAuthenticator(apiKey);
      }
      return this;
    }

    public StripeClientBuilder clearApiKey() {
      this.authenticator = null;
      return this;
    }

    public String getClientId() {
      return clientId;
    }

    /**
     * Set the client id, used for OAuth with Stripe Connect.
     *
     * @param clientId client ID
     */
    public StripeClientBuilder setClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public int getConnectTimeout() {
      return connectTimeout;
    }

    /**
     * Sets the timeout value that will be used for making new connections to the Stripe API (in
     * milliseconds).
     *
     * @param timeout timeout value in milliseconds
     */
    public StripeClientBuilder setConnectTimeout(int timeout) {
      this.connectTimeout = timeout;
      return this;
    }

    public int getReadTimeout() {
      return readTimeout;
    }

    /**
     * Sets the timeout value that will be used when reading data from an established connection to
     * the Stripe API (in milliseconds).
     *
     * <p>Note that this value should be set conservatively because some API requests can take time
     * and a short timeout increases the likelihood of causing a problem in the backend.
     *
     * @param timeout timeout value in milliseconds
     */
    public StripeClientBuilder setReadTimeout(int timeout) {
      this.readTimeout = timeout;
      return this;
    }

    public int getMaxNetworkRetries() {
      return maxNetworkRetries;
    }

    /**
     * Sets the maximum number of times the request will be retried in the event of a failure.
     *
     * @param maxNetworkRetries the number of times to retry the request
     */
    public StripeClientBuilder setMaxNetworkRetries(int maxNetworkRetries) {
      this.maxNetworkRetries = maxNetworkRetries;
      return this;
    }

    public Proxy getConnectionProxy() {
      return connectionProxy;
    }

    /**
     * Set proxy to tunnel all Stripe connections.
     *
     * @param connectionProxy proxy host and port setting
     */
    public StripeClientBuilder setConnectionProxy(Proxy connectionProxy) {
      this.connectionProxy = connectionProxy;
      return this;
    }

    public PasswordAuthentication getProxyCredential() {
      return proxyCredential;
    }

    /**
     * Provide credential for proxy authorization if required.
     *
     * @param proxyCredential proxy required userName and password
     */
    public StripeClientBuilder setProxyCredential(PasswordAuthentication proxyCredential) {
      this.proxyCredential = proxyCredential;
      return this;
    }

    /**
     * Set the base URL for the Stripe API. By default this is "https://api.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of API. Use
     * {@link #setFilesBase}, {@link #setConnectBase} or {@link #setMeterEventsBase} to interpect
     * requests with other bases.
     */
    public StripeClientBuilder setApiBase(String address) {
      this.apiBase = address;
      return this;
    }

    public String getApiBase() {
      return this.apiBase;
    }

    /**
     * Set the base URL for the Stripe Files API. By default this is "https://files.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of FILES.
     */
    public StripeClientBuilder setFilesBase(String address) {
      this.filesBase = address;
      return this;
    }

    public String getFilesBase() {
      return this.filesBase;
    }

    /**
     * Set the base URL for the Stripe Connect API. By default this is "https://connect.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of CONNECT.
     */
    public StripeClientBuilder setConnectBase(String address) {
      this.connectBase = address;
      return this;
    }

    public String getConnectBase() {
      return this.connectBase;
    }

    /**
     * Set the base URL for the Stripe Meter Events API. By default this is
     * "https://events.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of EVENTMES.
     */
    public StripeClientBuilder setMeterEventsBase(String address) {
      this.meterEventsBase = address;
      return this;
    }

    public String getMeterEventsBase() {
      return this.meterEventsBase;
    }

    public StripeClientBuilder setStripeAccount(String account) {
      this.stripeAccount = account;
      return this;
    }

    public String getStripeAccount() {
      return this.stripeAccount;
    }

    public StripeClientBuilder setStripeContext(String context) {
      this.stripeContext = context;
      return this;
    }

    public StripeClientBuilder setStripeContext(StripeContext context) {
      this.stripeContext = context == null ? null : context.toString();
      return this;
    }

    public String getStripeContext() {
      return this.stripeContext;
    }

    /**
     * Sets the HTTP client to use for making requests to the Stripe API. If not set, a default
     * {@link HttpURLConnectionClient} will be created.
     *
     * <p>This is useful for providing a custom HTTP client implementation, e.g. for testing or for
     * using a different HTTP library.
     *
     * @param httpClient the HTTP client to use
     */
    public StripeClientBuilder setHttpClient(HttpClient httpClient) {
      this.httpClient = httpClient;
      return this;
    }

    /** Constructs a {@link StripeResponseGetterOptions} with the specified values. */
    public StripeClient build() {
      return new StripeClient(new LiveStripeResponseGetter(buildOptions(), this.httpClient));
    }

    StripeResponseGetterOptions buildOptions() {
      if (this.authenticator == null) {
        throw new IllegalArgumentException(
            "No authentication settings provided. Use setApiKey to set the Stripe API key");
      }
      return new ClientStripeResponseGetterOptions(
          this.authenticator,
          this.clientId,
          this.connectTimeout,
          this.readTimeout,
          this.maxNetworkRetries,
          this.connectionProxy,
          this.proxyCredential,
          this.apiBase,
          this.filesBase,
          this.connectBase,
          this.meterEventsBase,
          this.stripeAccount,
          this.stripeContext);
    }
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @return the JSON response as a string
   */
  public StripeResponse rawRequest(
      final ApiResource.RequestMethod method, final String relativeUrl, final String content)
      throws StripeException {
    return rawRequest(method, relativeUrl, content, null);
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @param options the special modifiers of the request
   * @return the JSON response as a string
   */
  public StripeResponse rawRequest(
      final ApiResource.RequestMethod method,
      final String relativeUrl,
      final String content,
      RawRequestOptions options)
      throws StripeException {
    if (options == null) {
      options = RawRequestOptions.builder().build();
    }
    if (method != ApiResource.RequestMethod.POST && content != null && !content.equals("")) {
      throw new IllegalArgumentException(
          "content is not allowed for non-POST requests. Please pass null and add request parameters to the query string of the URL.");
    }
    RawApiRequest req = new RawApiRequest(BaseAddress.API, method, relativeUrl, content, options);
    req = req.addUsage("stripe_client");
    req = req.addUsage("raw_request");
    return this.getResponseGetter().rawRequest(req);
  }

  /** Deserializes StripeResponse returned by rawRequest into a similar class. */
  public StripeObject deserialize(String rawJson, ApiMode apiMode) throws StripeException {
    return StripeObject.deserializeStripeObject(rawJson, this.getResponseGetter(), apiMode);
  }

  public StripeEventNotificationHandler notificationHandler(
      String webhookSecret, StripeEventNotificationHandler.FallbackCallback fallbackCallback) {
    return new StripeEventNotificationHandler(webhookSecret, this, fallbackCallback);
  }
}
