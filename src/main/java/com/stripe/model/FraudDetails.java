package com.stripe.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FraudDetails extends StripeObject {
	public static final String USER_REPORT = "user_report";
	protected String userReport;
	protected String stripeReport;
}
