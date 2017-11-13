package com.stripe.model.oauth;

import com.stripe.model.StripeObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResponse extends StripeObject {
	Boolean livemode;
	String scope;
	String stripeUserId;
}
