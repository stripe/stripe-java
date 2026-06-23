package com.stripe.model.oauth;

import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DeauthorizedAccount extends StripeObject {
  String stripeUserId;
}
