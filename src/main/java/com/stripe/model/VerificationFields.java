package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class VerificationFields extends StripeObject {
	protected VerificationFieldsDetails individual;
	protected VerificationFieldsDetails company;
}
