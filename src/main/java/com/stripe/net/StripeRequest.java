package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import com.stripe.util.ReflectionUtils;
import com.stripe.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
public class StripeRequest {
  /*
   * Set this property to override your environment's default
   * URLStreamHandler; Settings the property should not be needed in most
   * environments.
   */
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME =
      "com.stripe.net.customURLStreamHandler";

  /** The HTTP method for the request (GET, POST or DELETE). */
  ApiResource.RequestMethod method;

  /**
   * The URL for the request. If this is a GET or DELETE request, the URL also includes the request
   * parameters in its query string.
   */
  URL url;

  /**
   * The body of the request. For POST requests, this will be either a {@code
   * application/x-www-form-urlencoded} or a {@code multipart/form-data} payload. For non-POST
   * requests, this will be {@code null}.
   */
  HttpContent content;

  /**
   * Map containing the headers of the request ({@code Authorization}, {@code Stripe-Version},
   * {@code Stripe-Account}, {@code Idempotency-Key}...).
   */
  Map<String, String> headers;

  /** The special modifiers of the request. */
  RequestOptions options;

  /**
   * Initializes a new instance of the {@link StripeRequest} class.
   *
   * @param method the HTTP method
   * @param url the URL of the request
   * @param params the parameters of the request
   * @param options the special modifiers of the request
   * @throws StripeException if the request cannot be initialized for any reason
   */
  public StripeRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws StripeException {
    try {
      this.options = (options != null) ? options : RequestOptions.getDefault();
      this.method = method;
      this.url = buildURL(method, url, params);
      this.content = buildContent(method, params);
      this.headers = buildHeaders(method, this.options);
    } catch (IOException e) {
      throw new ApiConnectionException(
          String.format(
              "IOException during API request to Stripe (%s): %s "
                  + "Please check your internet connection and try again. If this problem persists,"
                  + "you should check Stripe's service status at https://twitter.com/stripestatus,"
                  + " or let us know at support@stripe.com.",
              Stripe.getApiBase(), e.getMessage()),
          e);
    }
  }

  @SuppressWarnings("unchecked")
  private static URL buildURL(
      ApiResource.RequestMethod method, String spec, Map<String, Object> params)
      throws IOException {
    StringBuilder sb = new StringBuilder();

    sb.append(spec);

    if ((method != ApiResource.RequestMethod.POST) && (params != null)) {
      String queryString = FormEncoder.createQueryString(params);
      if (queryString != null && !queryString.isEmpty()) {
        sb.append("?");
        sb.append(queryString);
      }
    }

    URL url;
    String customUrlStreamHandlerClassName =
        System.getProperty(CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME, null);
    if (customUrlStreamHandlerClassName != null) {
      // instantiate the custom handler provided
      Class<URLStreamHandler> clazz =
          (Class<URLStreamHandler>) ReflectionUtils.getClassByName(customUrlStreamHandlerClassName);
      URLStreamHandler customHandler = ReflectionUtils.newInstance(clazz);
      url = new URL(null, sb.toString(), customHandler);
    } else {
      url = new URL(sb.toString());
    }
    return url;
  }

  private static HttpContent buildContent(
      ApiResource.RequestMethod method, Map<String, Object> params) throws IOException {
    if (method != ApiResource.RequestMethod.POST) {
      return null;
    }

    return FormEncoder.createHttpContent(params);
  }

  private static Map<String, String> buildHeaders(
      ApiResource.RequestMethod method, RequestOptions options) throws AuthenticationException {
    Map<String, String> headers = new HashMap<String, String>();

    // Authorization
    String apiKey = options.getApiKey();
    if (apiKey == null) {
      throw new AuthenticationException(
          "No API key provided. Set your API key using `Stripe.apiKey = \"<API-KEY>\"`. You can "
              + "generate API keys from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    } else if (apiKey.isEmpty()) {
      throw new AuthenticationException(
          "Your API key is invalid, as it is an empty string. You can double-check your API key "
              + "from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    } else if (StringUtils.containsWhitespace(apiKey)) {
      throw new AuthenticationException(
          "Your API key is invalid, as it contains whitespace. You can double-check your API key "
              + "from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    }
    headers.put("Authorization", String.format("Bearer %s", apiKey));

    // Stripe-Version
    if (options.getStripeVersionOverride() != null) {
      headers.put("Stripe-Version", options.getStripeVersionOverride());
    } else if (options.getStripeVersion() != null) {
      headers.put("Stripe-Version", options.getStripeVersion());
    } else {
      throw new IllegalStateException(
          "Either `stripeVersion` or `stripeVersionOverride` value must be set.");
    }

    // Stripe-Account
    if (options.getStripeAccount() != null) {
      headers.put("Stripe-Account", options.getStripeAccount());
    }

    // Idempotency-Key
    if (options.getIdempotencyKey() != null) {
      headers.put("Idempotency-Key", options.getIdempotencyKey());
    } else if (method == ApiResource.RequestMethod.POST) {
      headers.put("Idempotency-Key", UUID.randomUUID().toString());
    }

    return headers;
  }
}
