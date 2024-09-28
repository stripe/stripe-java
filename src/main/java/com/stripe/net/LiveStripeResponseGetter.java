package com.stripe.net;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.exception.ApiKeyMissingException;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.exception.oauth.InvalidGrantException;
import com.stripe.exception.oauth.InvalidScopeException;
import com.stripe.exception.oauth.OAuthException;
import com.stripe.exception.oauth.UnsupportedGrantTypeException;
import com.stripe.exception.oauth.UnsupportedResponseTypeException;
import com.stripe.model.*;
import com.stripe.model.oauth.OAuthError;
import com.stripe.util.Stopwatch;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LiveStripeResponseGetter implements StripeResponseGetter {
  private final HttpClient httpClient;
  private final StripeResponseGetterOptions options;

  private final RequestTelemetry requestTelemetry = new RequestTelemetry();

  @FunctionalInterface
  private interface RequestSendFunction<R> {
    R apply(StripeRequest request) throws StripeException;
  }

  private <T extends AbstractStripeResponse<?>> T sendWithTelemetry(
      StripeRequest request, List<String> usage, RequestSendFunction<T> send)
      throws StripeException {

    Stopwatch stopwatch = Stopwatch.startNew();

    T response = send.apply(request);

    stopwatch.stop();

    requestTelemetry.maybeEnqueueMetrics(response, stopwatch.getElapsed(), usage);

    return response;
  }

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

  /**
   * Initializes a new instance of the {@link LiveStripeResponseGetter} class.
   *
   * @param options the client options instance to use
   * @param httpClient the HTTP client to use
   */
  public LiveStripeResponseGetter(StripeResponseGetterOptions options, HttpClient httpClient) {
    this.options = options != null ? options : GlobalStripeResponseGetterOptions.INSTANCE;
    this.httpClient = (httpClient != null) ? httpClient : buildDefaultHttpClient();
  }

  private StripeRequest toStripeRequest(ApiRequest apiRequest, RequestOptions mergedOptions)
      throws StripeException {
    String fullUrl = fullUrl(apiRequest);

    Optional<String> telemetryHeaderValue = requestTelemetry.pollPayload();
    StripeRequest request =
        StripeRequest.create(
            apiRequest.getMethod(),
            fullUrl,
            apiRequest.getParams(),
            mergedOptions,
            apiRequest.getApiMode());
    if (telemetryHeaderValue.isPresent()) {
      request =
          request.withAdditionalHeader(RequestTelemetry.HEADER_NAME, telemetryHeaderValue.get());
    }
    return request;
  }

  private StripeRequest toRawStripeRequest(RawApiRequest apiRequest, RequestOptions mergedOptions)
      throws StripeException {

    String fullUrl = fullUrl(apiRequest);

    Optional<String> telemetryHeaderValue = requestTelemetry.pollPayload();
    StripeRequest request =
        StripeRequest.createWithStringContent(
            apiRequest.getMethod(),
            fullUrl,
            apiRequest.getRawContent(),
            mergedOptions,
            apiRequest.getApiMode());

    if (telemetryHeaderValue.isPresent()) {
      request =
          request.withAdditionalHeader(RequestTelemetry.HEADER_NAME, telemetryHeaderValue.get());
    }
    return request;
  }

  @Override
  @SuppressWarnings({"TypeParameterUnusedInFormals", "unchecked"})
  public <T extends StripeObjectInterface> T request(ApiRequest apiRequest, Type typeToken)
      throws StripeException {

    RequestOptions mergedOptions = RequestOptions.merge(this.options, apiRequest.getOptions());

    if (RequestOptions.unsafeGetStripeVersionOverride(mergedOptions) != null) {
      apiRequest = apiRequest.addUsage("unsafe_stripe_version_override");
    }

    StripeRequest request = toStripeRequest(apiRequest, mergedOptions);
    StripeResponse response =
        sendWithTelemetry(request, apiRequest.getUsage(), r -> httpClient.requestWithRetries(r));

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleError(response, apiRequest.getApiMode());
    }

    T resource = null;
    try {
      resource = (T) ApiResource.deserializeStripeObject(responseBody, typeToken, this);
    } catch (JsonSyntaxException e) {
      throw makeMalformedJsonError(responseBody, responseCode, requestId, e);
    }

    if (resource instanceof StripeCollectionInterface<?>) {
      ((StripeCollectionInterface<?>) resource).setRequestOptions(apiRequest.getOptions());
      ((StripeCollectionInterface<?>) resource).setRequestParams(apiRequest.getParams());
    }

    if (resource instanceof com.stripe.model.v2.StripeCollection<?>) {
      ((com.stripe.model.v2.StripeCollection<?>) resource)
          .setRequestOptions(apiRequest.getOptions());
    }

    resource.setLastResponse(response);

    return resource;
  }

  @Override
  public InputStream requestStream(ApiRequest apiRequest) throws StripeException {
    RequestOptions mergedOptions = RequestOptions.merge(this.options, apiRequest.getOptions());

    if (RequestOptions.unsafeGetStripeVersionOverride(mergedOptions) != null) {
      apiRequest = apiRequest.addUsage("unsafe_stripe_version_override");
    }

    StripeRequest request = toStripeRequest(apiRequest, mergedOptions);
    StripeResponseStream responseStream =
        sendWithTelemetry(
            request, apiRequest.getUsage(), r -> httpClient.requestStreamWithRetries(r));

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
      handleError(response, apiRequest.getApiMode());
    }

    return responseStream.body();
  }

  @Override
  public StripeResponse rawRequest(RawApiRequest apiRequest) throws StripeException {
    RequestOptions mergedOptions = RequestOptions.merge(this.options, apiRequest.getOptions());

    if (RequestOptions.unsafeGetStripeVersionOverride(mergedOptions) != null) {
      apiRequest = apiRequest.addUsage("unsafe_stripe_version_override");
    }

    StripeRequest request = toRawStripeRequest(apiRequest, mergedOptions);

    Map<String, String> additionalHeaders = apiRequest.getOptions().getAdditionalHeaders();

    if (additionalHeaders != null) {
      for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
        String key = entry.getKey();
        String value = entry.getValue();
        request = request.withAdditionalHeader(key, value);
      }
    }

    StripeResponse response =
        sendWithTelemetry(request, apiRequest.getUsage(), r -> httpClient.requestWithRetries(r));

    int responseCode = response.code();

    if (responseCode < 200 || responseCode >= 300) {
      handleError(response, apiRequest.getApiMode());
    }

    return response;
  }

  @Override
  @SuppressWarnings({"TypeParameterUnusedInFormals", "deprecation"})
  public <T extends StripeObjectInterface> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    return this.request(new ApiRequest(baseAddress, method, path, params, options), typeToken);
  }

  @Override
  @SuppressWarnings({"TypeParameterUnusedInFormals", "deprecation"})
  public InputStream requestStream(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    return this.requestStream(new ApiRequest(baseAddress, method, path, params, options));
  }

  private static HttpClient buildDefaultHttpClient() {
    return new HttpURLConnectionClient();
  }

  private static ApiException makeMalformedJsonError(
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

  private StripeError parseStripeError(
      String body, int code, String requestId, Class<? extends StripeError> klass)
      throws StripeException {
    StripeError ret;
    try {
      JsonObject jsonObject =
          ApiResource.GSON.fromJson(body, JsonObject.class).getAsJsonObject("error");
      ret = (StripeError) StripeObject.deserializeStripeObject(jsonObject, klass, this);
      if (ret != null) return ret;
    } catch (JsonSyntaxException e) {
      throw makeMalformedJsonError(body, code, requestId, e);
    }
    throw makeMalformedJsonError(body, code, requestId, null);
  }

  private void handleError(StripeResponse response, ApiMode apiMode) throws StripeException {
    JsonObject responseBody = ApiResource.GSON.fromJson(response.body(), JsonObject.class);

    /*
     OAuth errors are JSON objects where `error` is a string. In
     contrast, in API errors, `error` is a hash with sub-keys. We use
     this property to distinguish between OAuth and API errors.
    */
    if (responseBody.has("error") && responseBody.get("error").isJsonPrimitive()) {
      JsonPrimitive error = responseBody.getAsJsonPrimitive("error");
      if (error.isString()) {
        handleOAuthError(response);
      }
    } else if (apiMode == ApiMode.V2) {
      handleV2ApiError(response);
    } else {
      handleV1ApiError(response);
    }
  }

  private void handleV1ApiError(StripeResponse response) throws StripeException {
    StripeException exception = null;

    StripeError error =
        parseStripeError(response.body(), response.code(), response.requestId(), StripeError.class);

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

  private void handleV2ApiError(StripeResponse response) throws StripeException {
    JsonObject body =
        ApiResource.GSON.fromJson(response.body(), JsonObject.class).getAsJsonObject("error");

    JsonElement typeElement = body == null ? null : body.get("type");
    JsonElement codeElement = body == null ? null : body.get("code");
    String type = typeElement == null ? "<no_type>" : typeElement.getAsString();
    String code = codeElement == null ? "<no_code>" : codeElement.getAsString();

    StripeException exception =
        StripeException.parseV2Exception(type, body, response.code(), response.requestId(), this);
    if (exception != null) {
      throw exception;
    }

    StripeError error;
    try {
      error =
          parseStripeError(
              response.body(), response.code(), response.requestId(), StripeError.class);
    } catch (ApiException e) {
      String message = "Unrecognized error type '" + type + "'";
      JsonElement messageField = body == null ? null : body.get("message");
      if (messageField != null && messageField.isJsonPrimitive()) {
        message = messageField.getAsString();
      }

      throw new ApiException(message, response.requestId(), code, response.code(), null);
    }

    error.setLastResponse(response);
    exception =
        new ApiException(error.getMessage(), response.requestId(), code, response.code(), null);
    exception.setStripeError(error);
    throw exception;
  }

  private void handleOAuthError(StripeResponse response) throws StripeException {
    OAuthError error = null;
    StripeException exception = null;

    try {
      error = StripeObject.deserializeStripeObject(response.body(), OAuthError.class, this);
    } catch (JsonSyntaxException e) {
      throw makeMalformedJsonError(response.body(), response.code(), response.requestId(), e);
    }
    if (error == null) {
      throw makeMalformedJsonError(response.body(), response.code(), response.requestId(), null);
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
    if ((options == null || options.getAuthenticator() == null)
        && this.options.getAuthenticator() == null) {
      throw new ApiKeyMissingException(
          "API key is not set. You can set the API key globally using Stripe.ApiKey, or by passing RequestOptions");
    }
  }

  private String fullUrl(BaseApiRequest apiRequest) {
    BaseAddress baseAddress = apiRequest.getBaseAddress();
    RequestOptions options = apiRequest.getOptions();
    String relativeUrl = apiRequest.getPath();
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
      case METER_EVENTS:
        baseUrl = this.options.getMeterEventsBase();
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
