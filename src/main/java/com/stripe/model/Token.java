package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
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
  BankAccount bankAccount;

  Card card;

  /** IP address of the client that generated the token. */
  String clientIp;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** Type of the token: `account`, `bank_account`, `card`, or `pii`. */
  String type;

  /** Whether this token has already been used (tokens can be used only once). */
  Boolean used;

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, options);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tokens/%s", token));
    return request(ApiResource.RequestMethod.GET, url, params, Token.class, options);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used in
   * place of a bank account dictionary with any API method. These tokens can be used only once: by
   * attaching them to a <a href="#create_recipient">recipient</a> or <a href="#account">Custom
   * account</a>.
   */
  public static Token create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used in
   * place of a bank account dictionary with any API method. These tokens can be used only once: by
   * attaching them to a <a href="#create_recipient">recipient</a> or <a href="#account">Custom
   * account</a>.
   */
  public static Token create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tokens");
    return request(ApiResource.RequestMethod.POST, url, params, Token.class, options);
  }
}
