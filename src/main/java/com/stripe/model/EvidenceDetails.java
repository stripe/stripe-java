package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class EvidenceDetails extends StripeObject {
  protected Long dueBy;
  protected Long submissionCount;
}
