package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingDisputeEvidence extends StripeObject {
  /**
   * Evidence to support a fraudulent dispute. This will only be present if your dispute's `reason`
   * is `fraudulent`.
   */
  IssuingDisputeFraudulentEvidence fraudulent;

  /**
   * Evidence to support an uncategorized dispute. This will only be present if your dispute's
   * `reason` is `other`.
   */
  IssuingDisputeOtherEvidence other;
}
