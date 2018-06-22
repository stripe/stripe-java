package com.stripe.net;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.oauth.OAuthException;

import java.util.Map;

public interface StripeResponseGetter {
  <T> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException;

  <T> T oauthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, ApiException, OAuthException;
}
