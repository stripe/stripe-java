package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class SourceCodeVerificationFlow extends StripeObject {
  Long attemptsRemaining;
  String status;
}
