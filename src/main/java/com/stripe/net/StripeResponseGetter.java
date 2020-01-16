package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import java.util.Map;

public interface StripeResponseGetter {
  <T extends StripeObjectInterface> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException;

  <T extends StripeObjectInterface> T oauthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException;
}
