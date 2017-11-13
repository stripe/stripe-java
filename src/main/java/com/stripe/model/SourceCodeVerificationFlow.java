package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class SourceCodeVerificationFlow extends StripeObject {
	Integer attemptsRemaining;
	String status;
}
