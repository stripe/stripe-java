package com.stripe.model;

public final class EvidenceDetails extends StripeObject {
	protected Integer submissionCount;
	protected Long dueBy;

	public Integer getSubmissionCount() {
		return submissionCount;
	}

	public void setSubmissionCount(Integer submissionCount) {
		this.submissionCount = submissionCount;
	}

	public Long getDueBy() {
		return dueBy;
	}

	public void setDueBy(Long dueBy) {
		this.dueBy = dueBy;
	}
}
