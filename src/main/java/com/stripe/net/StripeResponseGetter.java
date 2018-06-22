package com.stripe.net;

import com.stripe.exception.StripeException;

import java.util.Map;

public interface StripeResponseGetter {
  <T> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException;

  <T> T oauthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException;
}
