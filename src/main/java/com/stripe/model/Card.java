package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Card extends ExternalAccount {
	String addressCity;
	String addressCountry;
	String addressLine1;
	String addressLine1Check;
	String addressLine2;
	String addressState;
	String addressZip;
	String addressZipCheck;
	String brand;
	String country;
	String currency;
	String cvcCheck;
	Boolean defaultForCurrency;
	String dynamicLast4;
	Integer expMonth;
	Integer expYear;
	String fingerprint;
	String funding;
	String last4;
	String name;
	String recipient;
	String status;
	String tokenizationMethod;

	// Please note that these field are for internal use only and are not typically returned
	// as part of standard API requests.
	String description;
	String iin;
	String issuer;

	@Deprecated
	String type;

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine1Check() {
		return addressLine1Check;
	}

	public void setAddressLine1Check(String addressLine1Check) {
		this.addressLine1Check = addressLine1Check;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public String getAddressZipCheck() {
		return addressZipCheck;
	}

	public void setAddressZipCheck(String addressZipCheck) {
		this.addressZipCheck = addressZipCheck;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCvcCheck() {
		return cvcCheck;
	}

	public void setCvcCheck(String cvcCheck) {
		this.cvcCheck = cvcCheck;
	}

	public Boolean getDefaultForCurrency() {
		return defaultForCurrency;
	}

	public void setDefaultForCurrency(Boolean defaultForCurrency) {
		this.defaultForCurrency = defaultForCurrency;
	}

	public String getDynamicLast4() {
		return dynamicLast4;
	}

	public void setDynamicLast4(String dynamicLast4) {
		this.dynamicLast4 = dynamicLast4;
	}

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

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTokenizationMethod() {
		return tokenizationMethod;
	}

	public void setTokenizationMethod(String tokenizationMethod) {
		this.tokenizationMethod = tokenizationMethod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIin() {
		return iin;
	}

	public void setIin(String iin) {
		this.iin = iin;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * @deprecated
	 * Use `brand` field (https://stripe.com/docs/upgrades#2014-06-13)
	 */
	@Deprecated
	public String getType() {
		return type;
	}

	/**
	 * @deprecated
	 * Use `brand` field (https://stripe.com/docs/upgrades#2014-06-13)
	 */
	@Deprecated
	public void setType(String type) {
		this.type = type;
	}

	public Card update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	@Deprecated
	public Card update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Card update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, Card.class, options);
	}

	public DeletedCard delete()
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return delete((RequestOptions) null);
	}

	@Deprecated
	public DeletedCard delete(String apiKey)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}

	public DeletedCard delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedCard.class, options);
	}

	@Override
	public String getInstanceURL() {
		String result = super.getInstanceURL();
		if (result != null) {
			return result;
		} else if (this.getRecipient() != null) {
			return String.format("%s/%s/cards/%s", classURL(Recipient.class), this.getRecipient(), this.getId());
		} else {
			return null;
		}
	}
}
