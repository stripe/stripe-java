package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceLineItemPeriod extends StripeObject {
	Long end;
	Long start;
}
