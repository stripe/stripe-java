package com.stripe.model;

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
public class AccountLink extends ApiResource {
  String object;
  Long created;
  Long expiresAt;
  String url;

  // <editor-fold desc="create">
  /**
   * Create an account link.
   */
  public static AccountLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create an account link.
   */
  public static AccountLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(AccountLink.class), params,
        AccountLink.class, options);
  }
  // </editor-fold>
}
