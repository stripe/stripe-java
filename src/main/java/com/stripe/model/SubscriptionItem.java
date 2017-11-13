package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.List;

@Setter
@Getter
public class SubscriptionItem extends APIResource implements HasId {
	String id;
	String object;
	Long created;
	Plan plan;
	Integer quantity;

	public static SubscriptionItem create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static SubscriptionItem create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(SubscriptionItem.class), params, SubscriptionItem.class, options);
	}

	public static SubscriptionItemCollection list(Map<String, Object> params)
			throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, null);
	}

	public static SubscriptionItemCollection list(Map<String, Object> params,
												  RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(SubscriptionItem.class), params, SubscriptionItemCollection.class, options);
	}

	public static SubscriptionItem retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public static SubscriptionItem retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(SubscriptionItem.class, id), null, SubscriptionItem.class, options);
	}

	public SubscriptionItem update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public SubscriptionItem update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(SubscriptionItem.class, id), params, SubscriptionItem.class, options);
	}

	public DeletedSubscriptionItem delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(null);
	}

	public DeletedSubscriptionItem delete(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, instanceURL(SubscriptionItem.class, id), null, DeletedSubscriptionItem.class, options);
	}
}
