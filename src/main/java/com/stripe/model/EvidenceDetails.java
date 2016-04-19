package com.stripe.model;

public final class EvidenceDetails extends StripeObject {
	protected Long dueBy;
	protected Integer submissionCount;

	public Long getDueBy() {
		return dueBy;
	}

	public void setDueBy(Long dueBy) {
		this.dueBy = dueBy;
	}

	public Integer getSubmissionCount() {
		return submissionCount;
	}

	public void setSubmissionCount(Integer submissionCount) {
		this.submissionCount = submissionCount;
	}
}
