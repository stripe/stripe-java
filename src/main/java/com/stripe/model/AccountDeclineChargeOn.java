package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountDeclineChargeOn extends StripeObject {
	Boolean avsFailure;
	Boolean cvcFailure;
}
