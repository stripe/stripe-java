package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransferTransaction extends StripeObject implements HasId {
  String id;
  String object;
  Long amount;
  Long net;
  String type;
  Long created;
  String description;
  Long fee;
}
