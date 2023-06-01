package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import com.stripe.net.RawRequestOptions.ApiMode;
import com.stripe.util.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

/** A request to Stripe's API. */
@Value
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Accessors(fluent = true)
public class StripeRequest {
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
   * The HTTP headers of the request ({@code Authorization}, {@code Stripe-Version}, {@code
   * Stripe-Account}, {@code Idempotency-Key}...).
   */
  HttpHeaders headers;

  /** The parameters of the request (as an unmodifiable map). */
  Map<String, Object> params;

  /** The special modifiers of the request. */
  RequestOptions options;

  /**
   * Initializes a new instance of the {@link StripeRequest} class.
   *
   * @param method the HTTP method
   * @param url the URL of the request
   * @param content the body of the request
   * @param params the parameters of the request
   * @param options the special modifiers of the request
   * @throws StripeException if the request cannot be initialized for any reason
   */
  private StripeRequest(
      ApiResource.RequestMethod method,
      String url,
      HttpContent content,
      Map<String, Object> params,
      RequestOptions options)
      throws StripeException {
    this.content = content;
    this.params = (params != null) ? Collections.unmodifiableMap(params) : null;
    this.options = (options != null) ? options : RequestOptions.getDefault();
    this.method = method;
    this.url = buildURL(method, url, params);
    this.headers = buildHeaders(method, this.options);
  }

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
    this(method, url, buildContent(method, params), params, options);
  }

  /**
   * Initializes a new instance of the {@link StripeRequest} class.
   *
   * @param method the HTTP method
   * @param url the URL of the request
   * @param content the body of the request
   * @param options the special modifiers of the request
   * @throws StripeException if the request cannot be initialized for any reason
   */
  public static StripeRequest createWithStringContent(
      ApiResource.RequestMethod method, String url, String content, RequestOptions options)
      throws StripeException {
    ApiMode apiMode = calculateApiMode(options);

    StripeRequest request =
        new StripeRequest(method, url, buildContent(method, content, apiMode), null, options);

    if (apiMode == ApiMode.PREVIEW) {
      request = request.withAdditionalHeader("Stripe-Version", Stripe.PREVIEW_API_VERSION);
    }

    return request;
  }

  private static ApiMode calculateApiMode(RequestOptions options) {
    if (options instanceof RawRequestOptions) {
      return ((RawRequestOptions) options).getApiMode();
    } else {
      return ApiMode.STANDARD;
    }
  }

  /**
   * Returns a new {@link StripeRequest} instance with an additional header.
   *
   * @param name the additional header's name
   * @param value the additional header's value
   * @return the new {@link StripeRequest} instance
   */
  public StripeRequest withAdditionalHeader(String name, String value) {
    return new StripeRequest(
        this.method,
        this.url,
        this.content,
        this.headers.withAdditionalHeader(name, value),
        this.params,
        this.options);
  }

  private static URL buildURL(
      ApiResource.RequestMethod method, String spec, Map<String, Object> params)
      throws ApiConnectionException {
    StringBuilder sb = new StringBuilder();

    sb.append(spec);

    URL url = null;
    try {
      URL specUrl = new URL(spec);
      String specQueryString = specUrl.getQuery();

      if ((method != ApiResource.RequestMethod.POST) && (params != null)) {
        String queryString = FormEncoder.createQueryString(params);

        if (queryString != null && !queryString.isEmpty()) {
          if (specQueryString != null && !specQueryString.isEmpty()) {
            sb.append("&");
          } else {
            sb.append("?");
          }
          sb.append(queryString);
        }
      }

      url = new URL(sb.toString());
    } catch (IOException e) {
      handleIOException(e);
    }
    return url;
  }

  private static HttpContent buildContent(
      ApiResource.RequestMethod method, Map<String, Object> params) throws ApiConnectionException {
    if (method != ApiResource.RequestMethod.POST) {
      return null;
    }

    HttpContent httpContent = null;
    try {
      httpContent = FormEncoder.createHttpContent(params);
    } catch (IOException e) {
      handleIOException(e);
    }
    return httpContent;
  }

  private static HttpContent buildContent(
      ApiResource.RequestMethod method, String content, RawRequestOptions.ApiMode apiMode)
      throws ApiConnectionException {
    if (method != ApiResource.RequestMethod.POST) {
      return null;
    }

    if (apiMode == RawRequestOptions.ApiMode.PREVIEW) {
      return HttpContent.buildJsonContent(content);
    }

    HttpContent httpContent = null;
    try {
      httpContent = HttpContent.buildFormURLEncodedContent(content);
    } catch (IOException e) {
      handleIOException(e);
    }
    return httpContent;
  }

  private static void handleIOException(IOException e) throws ApiConnectionException {
    throw new ApiConnectionException(
        String.format(
            "IOException during API request to Stripe (%s): %s "
                + "Please check your internet connection and try again. If this problem persists,"
                + "you should check Stripe's service status at https://twitter.com/stripestatus,"
                + " or let us know at support@stripe.com.",
            Stripe.getApiBase(), e.getMessage()),
        e);
  }

  private static HttpHeaders buildHeaders(ApiResource.RequestMethod method, RequestOptions options)
      throws AuthenticationException {
    Map<String, List<String>> headerMap = new HashMap<String, List<String>>();

    // Accept
    headerMap.put("Accept", Arrays.asList("application/json"));

    // Accept-Charset
    headerMap.put("Accept-Charset", Arrays.asList(ApiResource.CHARSET.name()));

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
    headerMap.put("Authorization", Arrays.asList(String.format("Bearer %s", apiKey)));

    // Stripe-Version
    if (RequestOptions.unsafeGetStripeVersionOverride(options) != null) {
      headerMap.put(
          "Stripe-Version", Arrays.asList(RequestOptions.unsafeGetStripeVersionOverride(options)));
    } else if (options.getStripeVersion() != null) {
      headerMap.put("Stripe-Version", Arrays.asList(options.getStripeVersion()));
    } else {
      throw new IllegalStateException(
          "Either `stripeVersion` or `stripeVersionOverride` value must be set.");
    }

    // Stripe-Account
    if (options.getStripeAccount() != null) {
      headerMap.put("Stripe-Account", Arrays.asList(options.getStripeAccount()));
    }

    // Idempotency-Key
    if (options.getIdempotencyKey() != null) {
      headerMap.put("Idempotency-Key", Arrays.asList(options.getIdempotencyKey()));
    } else if (method == ApiResource.RequestMethod.POST) {
      headerMap.put("Idempotency-Key", Arrays.asList(UUID.randomUUID().toString()));
    }

    return HttpHeaders.of(headerMap);
  }
}
