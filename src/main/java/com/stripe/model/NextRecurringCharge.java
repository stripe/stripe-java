package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NextRecurringCharge extends StripeObject {
	Long amount;
	String date;

}
