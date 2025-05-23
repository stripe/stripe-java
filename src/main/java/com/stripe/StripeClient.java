package com.stripe;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.ThinEvent;
import com.stripe.net.*;
import com.stripe.net.Webhook.Signature;
import java.net.PasswordAuthentication;
import java.net.Proxy;
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
  public ThinEvent parseThinEvent(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    return parseThinEvent(payload, sigHeader, secret, Webhook.DEFAULT_TOLERANCE);
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
  public ThinEvent parseThinEvent(String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    Signature.verifyHeader(payload, sigHeader, secret, tolerance);

    return ApiResource.GSON.fromJson(payload, ThinEvent.class);
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
  public com.stripe.service.AccountLinkService accountLinks() {
    return new com.stripe.service.AccountLinkService(this.getResponseGetter());
  }

  public com.stripe.service.AccountSessionService accountSessions() {
    return new com.stripe.service.AccountSessionService(this.getResponseGetter());
  }

  public com.stripe.service.AccountService accounts() {
    return new com.stripe.service.AccountService(this.getResponseGetter());
  }

  public com.stripe.service.ApplePayDomainService applePayDomains() {
    return new com.stripe.service.ApplePayDomainService(this.getResponseGetter());
  }

  public com.stripe.service.ApplicationFeeService applicationFees() {
    return new com.stripe.service.ApplicationFeeService(this.getResponseGetter());
  }

  public com.stripe.service.AppsService apps() {
    return new com.stripe.service.AppsService(this.getResponseGetter());
  }

  public com.stripe.service.BalanceService balance() {
    return new com.stripe.service.BalanceService(this.getResponseGetter());
  }

  public com.stripe.service.BalanceTransactionService balanceTransactions() {
    return new com.stripe.service.BalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.BillingService billing() {
    return new com.stripe.service.BillingService(this.getResponseGetter());
  }

  public com.stripe.service.BillingPortalService billingPortal() {
    return new com.stripe.service.BillingPortalService(this.getResponseGetter());
  }

  public com.stripe.service.ChargeService charges() {
    return new com.stripe.service.ChargeService(this.getResponseGetter());
  }

  public com.stripe.service.CheckoutService checkout() {
    return new com.stripe.service.CheckoutService(this.getResponseGetter());
  }

  public com.stripe.service.ClimateService climate() {
    return new com.stripe.service.ClimateService(this.getResponseGetter());
  }

  public com.stripe.service.ConfirmationTokenService confirmationTokens() {
    return new com.stripe.service.ConfirmationTokenService(this.getResponseGetter());
  }

  public com.stripe.service.CountrySpecService countrySpecs() {
    return new com.stripe.service.CountrySpecService(this.getResponseGetter());
  }

  public com.stripe.service.CouponService coupons() {
    return new com.stripe.service.CouponService(this.getResponseGetter());
  }

  public com.stripe.service.CreditNoteService creditNotes() {
    return new com.stripe.service.CreditNoteService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerSessionService customerSessions() {
    return new com.stripe.service.CustomerSessionService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerService customers() {
    return new com.stripe.service.CustomerService(this.getResponseGetter());
  }

  public com.stripe.service.DisputeService disputes() {
    return new com.stripe.service.DisputeService(this.getResponseGetter());
  }

  public com.stripe.service.EntitlementsService entitlements() {
    return new com.stripe.service.EntitlementsService(this.getResponseGetter());
  }

  public com.stripe.service.EphemeralKeyService ephemeralKeys() {
    return new com.stripe.service.EphemeralKeyService(this.getResponseGetter());
  }

  public com.stripe.service.EventService events() {
    return new com.stripe.service.EventService(this.getResponseGetter());
  }

  public com.stripe.service.ExchangeRateService exchangeRates() {
    return new com.stripe.service.ExchangeRateService(this.getResponseGetter());
  }

  public com.stripe.service.FileLinkService fileLinks() {
    return new com.stripe.service.FileLinkService(this.getResponseGetter());
  }

  public com.stripe.service.FileService files() {
    return new com.stripe.service.FileService(this.getResponseGetter());
  }

  public com.stripe.service.FinancialConnectionsService financialConnections() {
    return new com.stripe.service.FinancialConnectionsService(this.getResponseGetter());
  }

  public com.stripe.service.ForwardingService forwarding() {
    return new com.stripe.service.ForwardingService(this.getResponseGetter());
  }

  public com.stripe.service.IdentityService identity() {
    return new com.stripe.service.IdentityService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceItemService invoiceItems() {
    return new com.stripe.service.InvoiceItemService(this.getResponseGetter());
  }

  public com.stripe.service.InvoicePaymentService invoicePayments() {
    return new com.stripe.service.InvoicePaymentService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceRenderingTemplateService invoiceRenderingTemplates() {
    return new com.stripe.service.InvoiceRenderingTemplateService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceService invoices() {
    return new com.stripe.service.InvoiceService(this.getResponseGetter());
  }

  public com.stripe.service.IssuingService issuing() {
    return new com.stripe.service.IssuingService(this.getResponseGetter());
  }

  public com.stripe.service.MandateService mandates() {
    return new com.stripe.service.MandateService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentIntentService paymentIntents() {
    return new com.stripe.service.PaymentIntentService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentLinkService paymentLinks() {
    return new com.stripe.service.PaymentLinkService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodConfigurationService paymentMethodConfigurations() {
    return new com.stripe.service.PaymentMethodConfigurationService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodDomainService paymentMethodDomains() {
    return new com.stripe.service.PaymentMethodDomainService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodService paymentMethods() {
    return new com.stripe.service.PaymentMethodService(this.getResponseGetter());
  }

  public com.stripe.service.PayoutService payouts() {
    return new com.stripe.service.PayoutService(this.getResponseGetter());
  }

  public com.stripe.service.PlanService plans() {
    return new com.stripe.service.PlanService(this.getResponseGetter());
  }

  public com.stripe.service.PriceService prices() {
    return new com.stripe.service.PriceService(this.getResponseGetter());
  }

  public com.stripe.service.ProductService products() {
    return new com.stripe.service.ProductService(this.getResponseGetter());
  }

  public com.stripe.service.PromotionCodeService promotionCodes() {
    return new com.stripe.service.PromotionCodeService(this.getResponseGetter());
  }

  public com.stripe.service.QuoteService quotes() {
    return new com.stripe.service.QuoteService(this.getResponseGetter());
  }

  public com.stripe.service.RadarService radar() {
    return new com.stripe.service.RadarService(this.getResponseGetter());
  }

  public com.stripe.service.RefundService refunds() {
    return new com.stripe.service.RefundService(this.getResponseGetter());
  }

  public com.stripe.service.ReportingService reporting() {
    return new com.stripe.service.ReportingService(this.getResponseGetter());
  }

  public com.stripe.service.ReviewService reviews() {
    return new com.stripe.service.ReviewService(this.getResponseGetter());
  }

  public com.stripe.service.SetupAttemptService setupAttempts() {
    return new com.stripe.service.SetupAttemptService(this.getResponseGetter());
  }

  public com.stripe.service.SetupIntentService setupIntents() {
    return new com.stripe.service.SetupIntentService(this.getResponseGetter());
  }

  public com.stripe.service.ShippingRateService shippingRates() {
    return new com.stripe.service.ShippingRateService(this.getResponseGetter());
  }

  public com.stripe.service.SigmaService sigma() {
    return new com.stripe.service.SigmaService(this.getResponseGetter());
  }

  public com.stripe.service.SourceService sources() {
    return new com.stripe.service.SourceService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionItemService subscriptionItems() {
    return new com.stripe.service.SubscriptionItemService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionScheduleService subscriptionSchedules() {
    return new com.stripe.service.SubscriptionScheduleService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionService subscriptions() {
    return new com.stripe.service.SubscriptionService(this.getResponseGetter());
  }

  public com.stripe.service.TaxService tax() {
    return new com.stripe.service.TaxService(this.getResponseGetter());
  }

  public com.stripe.service.TaxCodeService taxCodes() {
    return new com.stripe.service.TaxCodeService(this.getResponseGetter());
  }

  public com.stripe.service.TaxIdService taxIds() {
    return new com.stripe.service.TaxIdService(this.getResponseGetter());
  }

  public com.stripe.service.TaxRateService taxRates() {
    return new com.stripe.service.TaxRateService(this.getResponseGetter());
  }

  public com.stripe.service.TerminalService terminal() {
    return new com.stripe.service.TerminalService(this.getResponseGetter());
  }

  public com.stripe.service.TestHelpersService testHelpers() {
    return new com.stripe.service.TestHelpersService(this.getResponseGetter());
  }

  public com.stripe.service.TokenService tokens() {
    return new com.stripe.service.TokenService(this.getResponseGetter());
  }

  public com.stripe.service.TopupService topups() {
    return new com.stripe.service.TopupService(this.getResponseGetter());
  }

  public com.stripe.service.TransferService transfers() {
    return new com.stripe.service.TransferService(this.getResponseGetter());
  }

  public com.stripe.service.TreasuryService treasury() {
    return new com.stripe.service.TreasuryService(this.getResponseGetter());
  }

  public com.stripe.service.V2Services v2() {
    return new com.stripe.service.V2Services(this.getResponseGetter());
  }

  public com.stripe.service.WebhookEndpointService webhookEndpoints() {
    return new com.stripe.service.WebhookEndpointService(this.getResponseGetter());
  }

  // The end of the section generated from our OpenAPI spec
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

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public StripeClientBuilder() {}

    public Authenticator getAuthenticator() {
      return this.authenticator;
    }

    public StripeClientBuilder setAuthenticator(Authenticator authenticator) {
      this.authenticator = authenticator;
      return this;
    }

    public String getApiKey() {
      if (authenticator instanceof BearerTokenAuthenticator) {
        return ((BearerTokenAuthenticator) authenticator).getApiKey();
      }

      return null;
    }

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
     * {@link setFilesBase} or {@link setConnectBase} to interpect requests with other bases.
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

    public String getStripeContext() {
      return this.stripeContext;
    }

    /** Constructs a {@link StripeResponseGetterOptions} with the specified values. */
    public StripeClient build() {
      return new StripeClient(new LiveStripeResponseGetter(buildOptions(), null));
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
}
