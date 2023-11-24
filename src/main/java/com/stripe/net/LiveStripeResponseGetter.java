package com.stripe.net;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.exception.oauth.InvalidGrantException;
import com.stripe.exception.oauth.InvalidScopeException;
import com.stripe.exception.oauth.OAuthException;
import com.stripe.exception.oauth.UnsupportedGrantTypeException;
import com.stripe.exception.oauth.UnsupportedResponseTypeException;
import com.stripe.model.*;
import com.stripe.model.oauth.OAuthError;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;

public class LiveStripeResponseGetter implements StripeResponseGetter {
  private final HttpClient httpClient;
  private final StripeResponseGetterOptions options;

  /**
   * Initializes a new instance of the {@link LiveStripeResponseGetter} class with default
   * parameters.
   */
  public LiveStripeResponseGetter() {
    this(null, null);
  }

  /**
   * Initializes a new instance of the {@link LiveStripeResponseGetter} class.
   *
   * @param httpClient the HTTP client to use
   */
  public LiveStripeResponseGetter(HttpClient httpClient) {
    this(null, httpClient);
  }

  public LiveStripeResponseGetter(StripeResponseGetterOptions options, HttpClient httpClient) {
    this.options = options != null ? options : GlobalStripeResponseGetterOptions.INSTANCE;
    this.httpClient = (httpClient != null) ? httpClient : buildDefaultHttpClient();
  }

  @Override
  @SuppressWarnings({"TypeParameterUnusedInFormals", "unchecked"})
  public <T extends StripeObjectInterface> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    String fullUrl = fullUrl(baseAddress, options, path);
    StripeRequest request =
        new StripeRequest(method, fullUrl, params, RequestOptions.merge(this.options, options));
    StripeResponse response = httpClient.requestWithRetries(request);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleError(response, apiMode);
    }

    T resource = null;
    try {
      resource = (T) ApiResource.deserializeStripeObject(responseBody, typeToken, this);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(responseBody, responseCode, requestId, e);
    }

    if (resource instanceof StripeCollectionInterface<?>) {
      ((StripeCollectionInterface<?>) resource).setRequestOptions(options);
      ((StripeCollectionInterface<?>) resource).setRequestParams(params);
    }

    resource.setLastResponse(response);

    return resource;
  }

  @Override
  public InputStream requestStream(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    String fullUrl = fullUrl(baseAddress, options, path);

    StripeRequest request =
        new StripeRequest(method, fullUrl, params, RequestOptions.merge(this.options, options));
    StripeResponseStream responseStream = httpClient.requestStreamWithRetries(request);

    int responseCode = responseStream.code();

    if (responseCode < 200 || responseCode >= 300) {
      StripeResponse response;
      try {
        response = responseStream.unstream();
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
      handleError(response, apiMode);
    }

    return responseStream.body();
  }

  private static HttpClient buildDefaultHttpClient() {
    return new HttpURLConnectionClient();
  }

  private static void raiseMalformedJsonError(
      String responseBody, int responseCode, String requestId, Throwable e) throws ApiException {
    String details = e == null ? "none" : e.getMessage();
    throw new ApiException(
        String.format(
            "Invalid response object from API: %s. (HTTP response code was %d). Additional details: %s.",
            responseBody, responseCode, details),
        requestId,
        null,
        responseCode,
        e);
  }

  private void handleError(StripeResponse response, ApiMode apiMode) throws StripeException {
    if (apiMode == ApiMode.V1) {
      handleApiError(response);
    } else if (apiMode == ApiMode.OAuth) {
      handleOAuthError(response);
    }
  }

  private void handleApiError(StripeResponse response) throws StripeException {
    StripeError error = checkJSONError(response);
    handleStripeException(error, response);
  }

  private StripeError checkJSONError(StripeResponse response) throws StripeException {
    StripeError error = null;
    try {
      JsonObject jsonObject =
        ApiResource.INTERNAL_GSON
          .fromJson(response.body(), JsonObject.class)
          .getAsJsonObject("error");
      error = ApiResource.deserializeStripeObject(jsonObject.toString(), StripeError.class, this);
      if (error == null) {
        raiseMalformedJsonError(response.body(), response.code(), response.requestId(), null);
      }
      error.setLastResponse(response);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId(), e);
    }
    return error;
  }

  private void handleStripeException(StripeError error, StripeResponse response) throws StripeException {
    StripeException exception = createStripeException(error, response);
    exception.setStripeError(error);
    throw exception;
  }

  private StripeException createStripeException(StripeError error, StripeResponse response) {
    switch (response.code()) {
      case 400:
      case 404:
        return createBadRequestException(error, response);
      case 401:
        return new AuthenticationException(
          error.getMessage(), response.requestId(), error.getCode(), response.code());
      case 402:
        return new CardException(
          error.getMessage(),
          response.requestId(),
          error.getCode(),
          error.getParam(),
          error.getDeclineCode(),
          error.getCharge(),
          response.code(),
          null);
      case 403:
        return new PermissionException(
          error.getMessage(), response.requestId(), error.getCode(), response.code());
      case 429:
        return new RateLimitException(
          error.getMessage(),
          error.getParam(),
          response.requestId(),
          error.getCode(),
          response.code(),
          null);
      default:
        return new ApiException(
          error.getMessage(), response.requestId(), error.getCode(), response.code(), null);
    }
  }

  private StripeException createBadRequestException(StripeError error, StripeResponse response) {
    if ("idempotency_error".equals(error.getType())) {
      return new IdempotencyException(
        error.getMessage(), response.requestId(), error.getCode(), response.code());
    } else {
      return new InvalidRequestException(
        error.getMessage(),
        error.getParam(),
        response.requestId(),
        error.getCode(),
        response.code(),
        null);
    }
  }

  private void handleOAuthError(StripeResponse response) throws StripeException {
    OAuthError error = null;
    StripeException exception = null;

    try {
      error = ApiResource.deserializeStripeObject(response.body(), OAuthError.class, this);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId(), e);
    }
    if (error == null) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId(), null);
    }

    error.setLastResponse(response);

    String code = error.getError();
    String description = (error.getErrorDescription() != null) ? error.getErrorDescription() : code;

    switch (code) {
      case "invalid_client":
        exception =
            new InvalidClientException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_grant":
        exception =
            new InvalidGrantException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_request":
        exception =
            new com.stripe.exception.oauth.InvalidRequestException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_scope":
        exception =
            new InvalidScopeException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "unsupported_grant_type":
        exception =
            new UnsupportedGrantTypeException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "unsupported_response_type":
        exception =
            new UnsupportedResponseTypeException(
                code, description, response.requestId(), response.code(), null);
        break;
      default:
        exception = new ApiException(code, response.requestId(), null, response.code(), null);
        break;
    }

    if (exception instanceof OAuthException) {
      ((OAuthException) exception).setOauthError(error);
    }

    throw exception;
  }

  @Override
  public void validateRequestOptions(RequestOptions options) {
    if ((options == null || options.getApiKey() == null) && this.options.getApiKey() == null) {
      throw new ApiKeyMissingException(
          "API key is not set. You can set the API key globally using Stripe.ApiKey, or by passing RequestOptions");
    }
  }

  private String fullUrl(BaseAddress baseAddress, RequestOptions options, String relativeUrl) {
    String baseUrl;
    switch (baseAddress) {
      case API:
        baseUrl = this.options.getApiBase();
        break;
      case CONNECT:
        baseUrl = this.options.getConnectBase();
        break;
      case FILES:
        baseUrl = this.options.getFilesBase();
        break;
      default:
        throw new IllegalArgumentException("Unknown base address " + baseAddress);
    }
    if (options != null && options.getBaseUrl() != null) {
      baseUrl = options.getBaseUrl();
    }
    return String.format("%s%s", baseUrl, relativeUrl);
  }
}
