package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inventory {
	String type;
	Integer quantity;
	String value;
}
