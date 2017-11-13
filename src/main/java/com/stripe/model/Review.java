package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review extends StripeObject implements HasId {
	String id;
	String object;
	String charge;
	Long created;
	Boolean livemode;
	Boolean open;
	String reason;
}
