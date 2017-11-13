package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
public class LegalEntity extends StripeObject {
	@Getter
	List<Owner> additionalOwners;
	@Getter
	Address address;
	@Getter
	String businessName;
	@Getter @Setter
	Boolean businessTaxIdProvided;
	@Getter
	DateOfBirth dob;
	@Getter
	String firstName;
	@Getter
	String lastName;
	@Getter
	Address personalAddress;
	@Getter
	Boolean personalIdNumberProvided;
	@Getter @Setter
	@SerializedName("ssn_last_4_provided")/*Annotation required for GSON serialization for field with number*/
			Boolean ssnLast4Provided;
	@Getter
	String type;
	@Getter
	Verification verification;

	@Getter
	@EqualsAndHashCode(callSuper = false)
	public static class DateOfBirth extends StripeObject {
		Integer day;
		Integer month;
		Integer year;
	}

	@Getter
	@EqualsAndHashCode(callSuper = false)
	public static class Verification extends StripeObject {
		String details;
		String detailsCode;
		String document;
		String status;
	}

	@Getter
	@EqualsAndHashCode(callSuper = false)
	public static class Owner extends StripeObject {
		Address address;
		DateOfBirth dob;
		String firstName;
		String lastName;
		Verification verification;
	}
}
