package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EphemeralKeyAssociatedObject extends StripeObject implements HasId {
	String type;
	String id;
}
