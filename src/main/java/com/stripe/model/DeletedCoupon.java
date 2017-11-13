package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeletedCoupon extends StripeObject implements DeletedStripeObject {
	String id;
	Boolean deleted;
}
