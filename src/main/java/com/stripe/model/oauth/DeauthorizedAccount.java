package com.stripe.model.oauth;

import com.stripe.model.StripeObject;

public class DeauthorizedAccount extends StripeObject {
	String stripeUserId;

	public String getStripeUserId() {
		return stripeUserId;
	}

	public void setStripeUserId(String stripeUserId) {
		this.stripeUserId = stripeUserId;
	}
}
