package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingMethod extends StripeObject {
	String id;
	Long amount;
	String currency;
	String description;
}
