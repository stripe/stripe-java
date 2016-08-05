package com.stripe.model;

public final class SourceOwner extends StripeObject {
	protected Address address;
	protected Address verifiedAddress;
	protected String name;
	protected String verifiedName;
	protected String phone;
	protected String verifiedPhone;
	protected String email;
	protected String verifiedEmail;

	public Address getAddress(){
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getVerifiedAddress(){
		return address;
	}

	public void setVerifiedAddress(Address address) {
		this.verifiedAddress = address;
	}

	public String getVerifiedName() {
		return name;
	}

	public void setVerifiedName(String name) {
		this.verifiedName = name;
	}

	public String getVerifiedPhone() {
		return phone;
	}

	public void setVerifiedPhone(String phone) {
		this.verifiedPhone = phone;
	}

	public String getVerifiedEmail() {
		return email;
	}

	public void setVerifiedEmail(String email) {
		this.verifiedEmail = email;
	}
}
