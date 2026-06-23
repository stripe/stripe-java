package com.stripe.model.oauth;

import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TokenResponse extends StripeObject {
  Boolean livemode;
  String scope;
  String stripeUserId;
}
