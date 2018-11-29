package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountTosAcceptance extends StripeObject {
  /**
   * The Unix timestamp marking when the Stripe Services Agreement was accepted by the account
   * representative.
   */
  Long date;

  /**
   * The IP address from which the Stripe Services Agreement was accepted by the account
   * representative.
   */
  String ip;

  /**
   * The user agent of the browser from which the Stripe Services Agreement was accepted by the
   * account representative.
   */
  String userAgent;
}
