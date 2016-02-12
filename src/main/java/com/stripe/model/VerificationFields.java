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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		VerificationFields verificationFields = (VerificationFields) o;

		if (individual != null ? !individual.equals(verificationFields.individual) : verificationFields.individual != null) {
			return false;
		}
		if (company != null ? !company.equals(verificationFields.company) : verificationFields.company != null) {
			return false;
		}

		return true;
	}
}
