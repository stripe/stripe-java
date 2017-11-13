package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Application extends StripeObject implements HasId {
	String id;
	String name;
}