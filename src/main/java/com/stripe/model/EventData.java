package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class EventData extends StripeObject {
	StripeObject object;
	Map<String, Object> previousAttributes;
}
