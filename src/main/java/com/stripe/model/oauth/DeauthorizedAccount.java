package com.stripe.model.oauth;

import com.stripe.model.StripeObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeauthorizedAccount extends StripeObject {
	String stripeUserId;
}
