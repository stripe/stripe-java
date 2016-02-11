package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class VerificationFieldsDetails extends StripeObject {
	protected List<String> additional;
	protected List<String> minimum;

	public List<String> getAdditional() {
		return additional;
	}

	public VerificationFieldsDetails setAdditional(List<String> additional) {
		this.additional = additional;
		return this;
	}

	public List<String> getMinimum() {
		return minimum;
	}

	public VerificationFieldsDetails setMinimum(List<String> minimum) {
		this.additional = minimum;
		return this;
	}
}
