package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class SourceReceiverFlow extends StripeObject {
	String refundAttributesStatus;
	String refundAttributesMethod;
	Long amountReceived;
	Long amountReturned;
	Long amountCharged;
	String address;
}
