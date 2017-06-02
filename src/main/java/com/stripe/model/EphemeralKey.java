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

public class EphemeralKey extends APIResource implements HasId {
	String id;
	String object;
	Long created;
	Long expires;
	Boolean livemode;
	String secret;
	List<AssociatedObject> associatedObjects;

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public Long getCreated() {
		return created;
	}

	public Long getExpires() {
		return expires;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public String getSecret() {
		return secret;
	}

	public List<AssociatedObject> getAssociatedObjects() {
		return associatedObjects;
	}

	public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(EphemeralKey.class), params, EphemeralKey.class, options);
	}

    // TODO: DeletedEphemeralKey?
	public EphemeralKey delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(EphemeralKey.class, this.id), null, EphemeralKey.class, options);
	}

	public static class AssociatedObject extends StripeObject {
		String type;
		String id;

		public String getType() {
			return type;
		}

		public String getId() {
			return id;
		}
	}
}
