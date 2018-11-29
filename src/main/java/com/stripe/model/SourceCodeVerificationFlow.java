package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceCodeVerificationFlow extends StripeObject {
  /**
   * The number of attempts remaining to authenticate the source object with a verification code.
   */
  Long attemptsRemaining;

  /**
   * The status of the code verification, either `pending` (awaiting verification,
   * `attempts_remaining` should be greater than 0), `succeeded` (successful verification) or
   * `failed` (failed verification, cannot be verified anymore as `attempts_remaining` should be 0).
   */
  String status;
}
