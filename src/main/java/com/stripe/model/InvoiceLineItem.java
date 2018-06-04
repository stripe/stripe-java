package com.stripe.model;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceLineItem extends StripeObject implements HasId {
  String id;
  String object;
  Long amount;
  String currency;
  String description;
  Boolean discountable;
  Boolean livemode;
  Map<String, String> metadata;
  InvoiceLineItemPeriod period;
  Plan plan;
  Boolean proration;
  Integer quantity;
  String subscription;
  String type;
}
