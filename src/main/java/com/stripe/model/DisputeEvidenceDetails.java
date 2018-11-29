package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DisputeEvidenceDetails extends StripeObject {
  /**
   * Date by which evidence must be submitted in order to successfully challenge dispute. Will be
   * null if the customer's bank or credit card company doesn't allow a response for this particular
   * dispute.
   */
  Long dueBy;

  /** Whether evidence has been staged for this dispute. */
  Boolean hasEvidence;

  /**
   * Whether the last evidence submission was submitted past the due date. Defaults to `false` if no
   * evidence submissions have occurred. If `true`, then delivery of the latest evidence is *not*
   * guaranteed.
   */
  Boolean pastDue;

  /**
   * The number of times evidence has been submitted. Typically, you may only submit evidence once.
   */
  Long submissionCount;
}
