package com.stripe.model;

import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentSourceAction extends StripeObject {
  PaymentIntentSourceActionValueAuthorizeWithUrl authorizeWithUrl;

  /** Type of the next source action to perform, one of `authorize_with_url` or `use_stripe_sdk`. */
  String type;

  /**
   * When confirming a PaymentIntent with Stripe.js, Stripe.js depends on the contents of this
   * dictionary to invoke authentication flows. The shape of the contents is subject to change and
   * is only intended to be used by Stripe.js.
   */
  Map<String, Object> useStripeSdk;
}
