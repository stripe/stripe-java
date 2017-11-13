package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class SourceRedirectFlow extends StripeObject {
	String failureReason;
	String returnUrl;
	String status;
	String url;
}
