package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter(onMethod = @__({@Override}))
@Setter(onMethod = @__({@Override}))
@EqualsAndHashCode(callSuper = false)
public class DeletedSku extends StripeObject implements DeletedStripeObject {
  String id;
  Boolean deleted;
}
