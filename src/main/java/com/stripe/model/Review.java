package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Review extends StripeObject implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String charge;
  Long created;
  Boolean livemode;
  Boolean open;
  String reason;
}
