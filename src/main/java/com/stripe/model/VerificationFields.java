package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public final class VerificationFields extends StripeObject {
  protected VerificationFieldsDetails individual;
  protected VerificationFieldsDetails company;
}
