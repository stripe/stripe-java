package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;

public interface StripeResponseGetter {
  /** @deprecated Use {@link #request(ApiRequest, Type)} instead. */
  @SuppressWarnings("TypeParameterUnusedInFormals")
  @Deprecated
  <T extends StripeObjectInterface> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException;

  @SuppressWarnings("TypeParameterUnusedInFormals")
  default <T extends StripeObjectInterface> T request(ApiRequest request, Type typeToken)
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

  /** @deprecated Use {@link #request(ApiRequest, Type)} instead. */
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

  default StripeResponse rawRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      String content,
      RawRequestOptions options)
      throws StripeException {
    throw new UnsupportedOperationException(
        "rawRequest is unimplemented for this StripeResponseGetter");
  }

  default InputStream requestStream(ApiRequest request) throws StripeException {
    return requestStream(
        request.getBaseAddress(),
        request.getMethod(),
        request.getPath(),
        request.getParams(),
        request.getOptions(),
        request.getApiMode());
  };

  /**
   * This method should e.g. throws an ApiKeyMissingError if a proper API Key cannot be determined
   * by the ResponseGetter or from the RequestOptions passed in.
   */
  default void validateRequestOptions(RequestOptions options) {}
}
