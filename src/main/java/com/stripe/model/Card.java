package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

public class Card extends ExternalAccount {
	@Getter @Setter
	String addressCity;
	@Getter @Setter
	String addressCountry;
	@Getter @Setter
	String addressLine1;
	@Getter @Setter
	String addressLine1Check;
	@Getter @Setter
	String addressLine2;
	@Getter @Setter
	String addressState;
	@Getter @Setter
	String addressZip;
	@Getter @Setter
	String addressZipCheck;
	@Getter @Setter
	List<String> availablePayoutMethods;
	@Getter @Setter
	String brand;
	@Getter @Setter
	String country;
	@Getter @Setter
	String currency;
	@Getter @Setter
	String cvcCheck;
	@Getter @Setter
	Boolean defaultForCurrency;
	@Getter @Setter
	String dynamicLast4;
	@Getter @Setter
	Integer expMonth;
	@Getter @Setter
	Integer expYear;
	@Getter @Setter
	String fingerprint;
	@Getter @Setter
	String funding;
	@Getter @Setter
	String last4;
	@Getter @Setter
	String name;
	@Getter @Setter
	String recipient;
	@Getter @Setter
	String status;
	@Getter @Setter
	ThreeDSecure threeDSecure;
	@Getter @Setter
	String tokenizationMethod;

	// Please note that these field are for internal use only and are not typically returned
	// as part of standard API requests.
	@Getter @Setter
	String description;
	@Getter @Setter
	String iin;
	@Getter @Setter
	String issuer;

	/**
	 * @deprecated Use `brand` field (https://stripe.com/docs/upgrades#2014-06-13)
	 */
	@Getter @Setter
	@Deprecated
	String type;

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
