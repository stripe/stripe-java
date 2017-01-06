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

public class CountrySpec extends APIResource implements HasId {
	String id;
	String object;
	String defaultCurrency;
	Map<String, List<String>> supportedBankAccountCurrencies;
	List<String> supportedPaymentCurrencies;
	List<String> supportedPaymentMethods;
	VerificationFields verificationFields;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public Map<String, List<String>> getSupportedBankAccountCurrencies() {
		return supportedBankAccountCurrencies;
	}

	public void setSupportedBankAccountCurrencies(Map<String, List<String>> supportedBankAccountCurrencies) {
		this.supportedBankAccountCurrencies = supportedBankAccountCurrencies;
	}

	public List<String> getSupportedPaymentCurrencies() {
		return supportedPaymentCurrencies;
	}

	public void setSupportedPaymentCurrencies(List<String> supportedPaymentCurrencies) {
		this.supportedPaymentCurrencies = supportedPaymentCurrencies;
	}

	public List<String> getSupportedPaymentMethods() {
		return supportedPaymentMethods;
	}

	public void setSupportedPaymentMethods(List<String> supportedPaymentMethods) {
		this.supportedPaymentMethods = supportedPaymentMethods;
	}

	public VerificationFields getVerificationFields() {
		return verificationFields;
	}

	public void setVerificationFields(VerificationFields verificationFields) {
		this.verificationFields = verificationFields;
	}

	public static CountrySpec retrieve(String country) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(country, (RequestOptions) null);
	}

	public static CountrySpec retrieve(String country, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(
			RequestMethod.GET,
			instanceURL(CountrySpec.class, country),
			null,
			CountrySpec.class,
			options);
	}

	public static CountrySpecCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	public static CountrySpecCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(CountrySpec.class), params, CountrySpecCollection.class, options);
	}
}
