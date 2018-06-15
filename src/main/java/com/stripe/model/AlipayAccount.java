package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
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
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(null);
  }

  @Override
  public DeletedAlipayAccount delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedAlipayAccount.class,
        options);
  }

  @Override
  public AlipayAccount update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  @Override
  public AlipayAccount update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, AlipayAccount.class, options);
  }
}
