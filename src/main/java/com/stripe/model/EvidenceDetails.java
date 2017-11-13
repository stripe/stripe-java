package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class EvidenceDetails extends StripeObject {
	protected Long dueBy;
	protected Integer submissionCount;
}
