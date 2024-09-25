package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import java.io.IOException;
import java.net.URL;
import java.util.*;
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
   * @param params the parameters of the request
   * @param options the special modifiers of the request
   * @param apiMode version of the API
   * @throws StripeException if the request cannot be initialized for any reason
   */
  StripeRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    try {
      this.params = (params != null) ? Collections.unmodifiableMap(params) : null;
      this.options = options;
      this.method = method;
      this.url = buildURL(method, url, params, apiMode);
      this.content = buildContent(method, params, apiMode);
      this.headers = buildHeaders(method, this.options, this.content, apiMode);
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

  /**
   * Initializes a new instance of the {@link StripeRequest} class.
   *
   * @param method the HTTP method
   * @param url the URL of the request
   * @param params the parameters of the request
   * @param options the special modifiers of the request
   * @throws StripeException if the request cannot be initialized for any reason
   */
  public static StripeRequest create(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    if (options == null) {
      throw new IllegalArgumentException("options parameter should not be null");
    }

    StripeRequest request = new StripeRequest(method, url, params, options, apiMode);
    Authenticator authenticator = options.getAuthenticator();

    if (authenticator == null) {
      throw new AuthenticationException(
          "No API key provided. Set your API key using `Stripe.apiKey = \"<API-KEY>\"`. You can "
              + "generate API keys from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    }

    request = request.options().getAuthenticator().authenticate(request);

    return request;
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
      ApiResource.RequestMethod method, String spec, Map<String, Object> params, ApiMode apiMode)
      throws IOException {
    StringBuilder sb = new StringBuilder();

    sb.append(spec);

    URL specUrl = new URL(spec);
    String specQueryString = specUrl.getQuery();

    if ((method != ApiResource.RequestMethod.POST) && (params != null)) {
      String queryString =
          FormEncoder.createQueryString(params, apiMode == ApiMode.V2 ? true : false);

      if (queryString != null && !queryString.isEmpty()) {
        if (specQueryString != null && !specQueryString.isEmpty()) {
          sb.append("&");
        } else {
          sb.append("?");
        }
        sb.append(queryString);
      }
    }

    return new URL(sb.toString());
  }

  private static HttpContent buildContent(
      ApiResource.RequestMethod method, Map<String, Object> params, ApiMode apiMode)
      throws IOException {
    if (method != ApiResource.RequestMethod.POST) {
      return null;
    }

    if (apiMode == ApiMode.V2) {
      return JsonEncoder.createHttpContent(params);
    }

    return FormEncoder.createHttpContent(params);
  }

  private static HttpHeaders buildHeaders(
      ApiResource.RequestMethod method,
      RequestOptions options,
      HttpContent content,
      ApiMode apiMode) {
    Map<String, List<String>> headerMap = new HashMap<String, List<String>>();

    // Accept
    headerMap.put("Accept", Arrays.asList("application/json"));

    // Accept-Charset
    headerMap.put("Accept-Charset", Arrays.asList(ApiResource.CHARSET.name()));

    // Stripe-Version
    if (RequestOptions.unsafeGetStripeVersionOverride(options) != null) {
      headerMap.put(
          "Stripe-Version", Arrays.asList(RequestOptions.unsafeGetStripeVersionOverride(options)));
    } else if (options.getStripeVersion() != null) {
      headerMap.put("Stripe-Version", Arrays.asList(options.getStripeVersion()));
    }

    if (apiMode == ApiMode.V1) {
      if (options.getStripeContext() != null) {
        throw new UnsupportedOperationException("Context is not supported in V1 APIs");
      }
    } else {
      if (options.getStripeContext() != null) {
        headerMap.put("Stripe-Context", Arrays.asList(options.getStripeContext()));
      }
      if (content != null) {
        headerMap.put("Content-Type", Arrays.asList(content.contentType()));
      }
    }

    // Stripe-Account
    if (options.getStripeAccount() != null) {
      headerMap.put("Stripe-Account", Arrays.asList(options.getStripeAccount()));
    }

    // Idempotency-Key
    if (options.getIdempotencyKey() != null) {
      headerMap.put("Idempotency-Key", Arrays.asList(options.getIdempotencyKey()));
    } else if (method == ApiResource.RequestMethod.POST
        || (apiMode == ApiMode.V2 && method == ApiResource.RequestMethod.DELETE)) {
      headerMap.put("Idempotency-Key", Arrays.asList(UUID.randomUUID().toString()));
    }

    return HttpHeaders.of(headerMap);
  }
}
