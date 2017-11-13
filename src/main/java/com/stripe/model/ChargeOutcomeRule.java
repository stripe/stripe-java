package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ChargeOutcomeRule extends StripeObject implements HasId {
	protected String action;
	protected String id;
	protected String predicate;
}
