package com.stripe.model;


public class Card extends StripeObject {
	Integer expMonth;
	Integer expYear;
	String last4;
	String country;
	String type;
	String name;
	String addressLine1;
	String addressLine2;
	String addressZip;
	String addressState;
	String addressCountry;
	Boolean addressZipCheck;
	Boolean addressLine1Check;
	Boolean cvcCheck;
	String fingerprint;
	
	public Integer getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(Integer expMonth) {
		this.expMonth = expMonth;
	}
	public Integer getExpYear() {
		return expYear;
	}
	public void setExpYear(Integer expYear) {
		this.expYear = expYear;
	}
	public String getLast4() {
		return last4;
	}
	public void setLast4(String last4) {
		this.last4 = last4;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressZip() {
		return addressZip;
	}
	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public Boolean getAddressZipCheck() {
		return addressZipCheck;
	}
	public void setAddressZipCheck(Boolean addressZipCheck) {
		this.addressZipCheck = addressZipCheck;
	}
	public Boolean getAddressLine1Check() {
		return addressLine1Check;
	}
	public void setAddressLine1Check(Boolean addressLine1Check) {
		this.addressLine1Check = addressLine1Check;
	}
	public Boolean getCvcCheck() {
		return cvcCheck;
	}
	public void setCvcCheck(Boolean cvcCheck) {
		this.cvcCheck = cvcCheck;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
}