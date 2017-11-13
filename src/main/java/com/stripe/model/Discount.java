package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Discount extends StripeObject {
	String id;
	String object;
	Coupon coupon;
	String customer;
	Long end;
	Long start;
	String subscription;
}
