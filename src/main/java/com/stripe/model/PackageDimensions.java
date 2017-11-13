package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PackageDimensions extends StripeObject {
	Double height;
	Double length;
	Double weight;
	Double width;
}
