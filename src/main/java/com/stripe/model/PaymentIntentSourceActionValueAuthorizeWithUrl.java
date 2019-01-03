package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentSourceActionValueAuthorizeWithUrl extends StripeObject {
  /**
   * If the customer does not exit their browser while authenticating, they will be redirected to
   * this specified URL after completion.
   */
  String returnUrl;

  /** The URL you must redirect your customer to in order to authenticate the payment. */
  String url;
}
