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

public class LegalEntity extends StripeObject {
	String type;
	Address address;
	String businessName;
	DateOfBirth dob;
	String firstName;
	String lastName;
	Address personalAddress;
	Verification verification;
	List<Owner> additionalOwners;

	public String getType() {
		return type;
	}
	public Address getAddress() {
		return address;
	}
	public String getBusinessName() {
		return businessName;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getPersonalAddress() {
		return personalAddress;
	}
	public Verification getVerification() {
		return verification;
	}
	public List<Owner> getAdditionalOwners() {
		return additionalOwners;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		LegalEntity le = (LegalEntity) o;
		return equals(type, le.type) &&
			equals(address, le.address) &&
			equals(businessName, le.businessName) &&
			equals(dob, le.dob) &&
			equals(firstName, le.firstName) &&
			equals(lastName, le.lastName) &&
			equals(personalAddress, le.personalAddress) &&
			equals(verification, le.verification) &&
			equals(additionalOwners, le.additionalOwners);
	}

	public static class DateOfBirth extends StripeObject {
		Integer day;
		Integer month;
		Integer year;

		public Integer getDay() {
			return day;
		}
		public Integer getMonth() {
			return month;
		}
		public Integer getYear() {
			return year;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			DateOfBirth dob = (DateOfBirth) o;
			return equals(day, dob.day) &&
				equals(month, dob.month) &&
				equals(year, dob.year);
		}
	}

	public static class Verification extends StripeObject {
		String status;
		String document;
		String details;

		public String getStatus() {
			return status;
		}
		public String getDocument() {
			return document;
		}
		public String getDetails() {
			return details;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			Verification verification = (Verification) o;
			return equals(status, verification.status) &&
				equals(document, verification.document) &&
				equals(details, verification.details);
		}
	}

	public static class Owner extends StripeObject {
		Address address;
		DateOfBirth dob;
		String firstName;
		String lastName;
		Verification verification;

		public Address getAddress() {
			return address;
		}
		public DateOfBirth getDob() {
			return dob;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public Verification getVerification() {
			return verification;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			Owner owner = (Owner) o;
			return equals(address, owner.address) &&
				equals(dob, owner.dob) &&
				equals(firstName, owner.firstName) &&
				equals(lastName, owner.lastName) &&
				equals(verification, owner.verification);
		}
	}
}
