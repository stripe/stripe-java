package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Card extends ExternalAccount implements MetadataStore<Card>, HasId {
	String status;
	Integer expMonth;
	Integer expYear;
	String last4;
	String dynamicLast4;
	String country;
	String type;
	String name;
	String recipient;
	String addressLine1;
	String addressLine2;
	String addressZip;
	String addressCity;
	String addressState;
	String addressCountry;
	String addressZipCheck;
	String addressLine1Check;
	String cvcCheck;
	String fingerprint;
	String brand;
	String funding;
	Map<String, String> metadata;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
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
	public String getLast4() {
		return last4;
	}
	public void setLast4(String last4) {
		this.last4 = last4;
	}
	public String getDynamicLast4() {
		return dynamicLast4;
	}
	public void setDynamicLast4(String dynamicLast4) {
		this.dynamicLast4 = dynamicLast4;
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
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
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
	public String getAddressZipCheck() {
		return addressZipCheck;
	}
	public void setAddressZipCheck(String addressZipCheck) {
		this.addressZipCheck = addressZipCheck;
	}
	public String getAddressLine1Check() {
		return addressLine1Check;
	}
	public void setAddressLine1Check(String addressLine1Check) {
		this.addressLine1Check = addressLine1Check;
	}
	public String getCvcCheck() {
		return cvcCheck;
	}
	public void setCvcCheck(String cvcCheck) {
		this.cvcCheck = cvcCheck;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFunding() {
		return funding;
	}
	public void setFunding(String funding) {
		this.funding = funding;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
