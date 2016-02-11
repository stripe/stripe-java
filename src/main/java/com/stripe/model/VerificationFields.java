package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class VerificationFields extends StripeObject {
	protected VerificationFieldsDetails individual;
	protected VerificationFieldsDetails company;

	public VerificationFieldsDetails getIndividual() {
		return individual;
	}

	public VerificationFields setIndividual(VerificationFieldsDetails individual) {
		this.individual = individual;
		return this;
	}

	public VerificationFieldsDetails getCompany() {
		return company;
	}

	public VerificationFields setCompany(VerificationFieldsDetails company) {
		this.company = company;
		return this;
	}
}
