package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;

import java.util.Map;
import com.stripe.net.RequestOptions;

public interface PaymentSource {
	public String getId();
	public void setId(String id);
	public String getObject();
	public void setObject(String object);
	public String getStatus();
	public void setStatus(String status);
	public String getCustomer();
	public void setCustomer(String customer);

	public PaymentSource update(Map<String, Object> params) throws
			AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException;
	public PaymentSource update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException;
	public DeletedStripeObject delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException,
			CardException, APIException;
	public DeletedStripeObject delete(RequestOptions options) throws
			AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException;
}
