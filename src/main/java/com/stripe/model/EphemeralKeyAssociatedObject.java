package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EphemeralKeyAssociatedObject extends StripeObject implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String type;
}
