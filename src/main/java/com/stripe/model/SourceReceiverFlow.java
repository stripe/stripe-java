package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class SourceReceiverFlow extends StripeObject {
  String refundAttributesStatus;
  String refundAttributesMethod;
  Long amountReceived;
  Long amountReturned;
  Long amountCharged;
  String address;
}
