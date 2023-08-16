package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;

public interface StripeResponseGetter {
  @SuppressWarnings("TypeParameterUnusedInFormals")
  <T extends StripeObjectInterface> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException;

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

  /**
   * This method should e.g. throws an ApiKeyMissingError if a proper API Key cannot be determined
   * by the ResponseGetter or from the RequestOptions passed in.
   */
  default void validateRequestOptions(RequestOptions options) {}
}
