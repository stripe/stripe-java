package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class AlipayAccount extends ExternalAccount {
  Long created;
  String fingerprint;
  Boolean livemode;
  Long paymentAmount;
  String paymentCurrency;
  Boolean reusable;
  Boolean used;
  String username;
  String status;

  @Override
  public DeletedAlipayAccount delete() throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return delete(null);
  }

  @Override
  public DeletedAlipayAccount delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return request(RequestMethod.DELETE, this.getInstanceUrl(), null, DeletedAlipayAccount.class,
        options);
  }

  @Override
  public AlipayAccount update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return update(params, null);
  }

  @Override
  public AlipayAccount update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, this.getInstanceUrl(), params, AlipayAccount.class, options);
  }
}
