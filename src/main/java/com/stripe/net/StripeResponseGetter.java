package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;

public interface StripeResponseGetter {
  /** @deprecated Use {@link #request(ApiRequest, Type)} instead. */
  @SuppressWarnings("TypeParameterUnusedInFormals")
  @Deprecated
  <T extends StripeObject> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException;

  @SuppressWarnings("TypeParameterUnusedInFormals")
  default <T extends StripeObject> T request(ApiRequest request, Type typeToken)
      throws StripeException {
    return request(
        request.getBaseAddress(),
        request.getMethod(),
        request.getPath(),
        request.getParams(),
        typeToken,
        request.getOptions(),
        request.getApiMode());
  };

  /** @deprecated Use {@link #requestStream(ApiRequest)} instead. */
  @SuppressWarnings("TypeParameterUnusedInFormals")
  @Deprecated
  InputStream requestStream(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException;

  default InputStream requestStream(ApiRequest request) throws StripeException {
    return requestStream(
        request.getBaseAddress(),
        request.getMethod(),
        request.getPath(),
        request.getParams(),
        request.getOptions(),
        request.getApiMode());
  };

  default StripeResponse rawRequest(RawApiRequest request) throws StripeException {
    throw new UnsupportedOperationException(
        "rawRequest is unimplemented for this StripeResponseGetter");
  };

  /**
   * Returns a new StripeResponseGetter with the same underlying configuration (e.g. HTTP client,
   * API key) as this instance, but scoped to the given {@code stripe_context}, with any {@code
   * stripe_account} cleared.
   *
   * @param context the {@code stripe_context} to scope to, or {@code null} to clear it
   * @return a new, context-scoped StripeResponseGetter
   * @throws IllegalStateException if this StripeResponseGetter implementation doesn't support
   *     context scoping
   */
  default StripeResponseGetter withStripeContext(String context) {
    throw new IllegalStateException(
        "Cannot create a response getter with a custom context for this StripeResponseGetter implementation");
  }

  /**
   * This method should e.g. throws an ApiKeyMissingError if a proper API Key cannot be determined
   * by the ResponseGetter or from the RequestOptions passed in.
   */
  default void validateRequestOptions(RequestOptions options) {}
}
