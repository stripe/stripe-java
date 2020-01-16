package com.stripe.net;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.IdempotencyException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.PermissionException;
import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.exception.oauth.InvalidGrantException;
import com.stripe.exception.oauth.InvalidScopeException;
import com.stripe.exception.oauth.OAuthException;
import com.stripe.exception.oauth.UnsupportedGrantTypeException;
import com.stripe.exception.oauth.UnsupportedResponseTypeException;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeObjectInterface;
import com.stripe.model.oauth.OAuthError;
import java.util.Map;

public class LiveStripeResponseGetter implements StripeResponseGetter {
  private final HttpClient httpClient;

  /**
   * Initializes a new instance of the {@link LiveStripeResponseGetter} class with default
   * parameters.
   */
  public LiveStripeResponseGetter() {
    this(null);
  }

  /**
   * Initializes a new instance of the {@link LiveStripeResponseGetter} class.
   *
   * @param httpClient the HTTP client to use
   */
  public LiveStripeResponseGetter(HttpClient httpClient) {
    this.httpClient = (httpClient != null) ? httpClient : buildDefaultHttpClient();
  }

  @Override
  public <T extends StripeObjectInterface> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException {
    StripeRequest request = new StripeRequest(method, url, params, options);
    StripeResponse response = httpClient.requestWithRetries(request);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleApiError(response);
    }

    T resource = null;
    try {
      resource = ApiResource.GSON.fromJson(responseBody, clazz);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(responseBody, responseCode, requestId);
    }

    resource.setLastResponse(response);

    return resource;
  }

  @Override
  public <T extends StripeObjectInterface> T oauthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException {
    StripeRequest request = new StripeRequest(method, url, params, options);
    StripeResponse response = this.httpClient.requestWithRetries(request);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleOAuthError(response);
    }

    T resource = null;
    try {
      resource = ApiResource.GSON.fromJson(responseBody, clazz);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(responseBody, responseCode, requestId);
    }

    if (resource instanceof StripeObject) {
      StripeObject obj = (StripeObject) resource;
      obj.setLastResponse(response);
    }

    return resource;
  }

  private static HttpClient buildDefaultHttpClient() {
    return new HttpURLConnectionClient();
  }

  private static void raiseMalformedJsonError(
      String responseBody, int responseCode, String requestId) throws ApiException {
    throw new ApiException(
        String.format(
            "Invalid response object from API: %s. (HTTP response code was %d)",
            responseBody, responseCode),
        requestId,
        null,
        responseCode,
        null);
  }

  private static void handleApiError(StripeResponse response) throws StripeException {
    StripeError error = null;
    StripeException exception = null;

    try {
      JsonObject jsonObject =
          ApiResource.GSON.fromJson(response.body(), JsonObject.class).getAsJsonObject("error");
      error = ApiResource.GSON.fromJson(jsonObject, StripeError.class);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }
    if (error == null) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }

    error.setLastResponse(response);

    switch (response.code()) {
      case 400:
      case 404:
        if ("idempotency_error".equals(error.getType())) {
          exception =
              new IdempotencyException(
                  error.getMessage(), response.requestId(), error.getCode(), response.code());
        } else {
          exception =
              new InvalidRequestException(
                  error.getMessage(),
                  error.getParam(),
                  response.requestId(),
                  error.getCode(),
                  response.code(),
                  null);
        }
        break;
      case 401:
        exception =
            new AuthenticationException(
                error.getMessage(), response.requestId(), error.getCode(), response.code());
        break;
      case 402:
        exception =
            new CardException(
                error.getMessage(),
                response.requestId(),
                error.getCode(),
                error.getParam(),
                error.getDeclineCode(),
                error.getCharge(),
                response.code(),
                null);
        break;
      case 403:
        exception =
            new PermissionException(
                error.getMessage(), response.requestId(), error.getCode(), response.code());
        break;
      case 429:
        exception =
            new RateLimitException(
                error.getMessage(),
                error.getParam(),
                response.requestId(),
                error.getCode(),
                response.code(),
                null);
        break;
      default:
        exception =
            new ApiException(
                error.getMessage(), response.requestId(), error.getCode(), response.code(), null);
        break;
    }

    exception.setStripeError(error);

    throw exception;
  }

  private static void handleOAuthError(StripeResponse response) throws StripeException {
    OAuthError error = null;
    StripeException exception = null;

    try {
      error = ApiResource.GSON.fromJson(response.body(), OAuthError.class);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }
    if (error == null) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
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
}
