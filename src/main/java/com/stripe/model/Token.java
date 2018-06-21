package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Token extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  BankAccount bankAccount;
  Card card;
  String clientIp;
  Long created;
  String currency;
  String email;
  Boolean livemode;
  String type;
  Boolean used;

  // <editor-fold desc="create">
  /**
   * Create a token.
   */
  public static Token create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a token.
   */
  public static Token create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, classUrl(Token.class), params, Token.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a token.
   */
  public static Token retrieve(String id) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a token.
   */
  public static Token retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Token.class, id), null, Token.class, options);
  }
  // </editor-fold>
}
