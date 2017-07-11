package com.stripe.model.oauth;

import com.stripe.model.StripeObject;

public class TokenResponse extends StripeObject {
	Boolean livemode;
	String scope;
	String stripeUserId;

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStripeUserId() {
		return stripeUserId;
	}

	public void setStripeUserId(String stripeUserId) {
		this.stripeUserId = stripeUserId;
	}
}
