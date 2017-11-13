package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventRequest extends StripeObject {
	String id;
	String idempotencyKey;
}
