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

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class EphemeralKey extends APIResource implements HasId {
	String id;
	String object;
	Long created;
	Long expires;
	Boolean livemode;
	String secret;
	List<EphemeralKeyAssociatedObject> associatedObjects;
	transient String rawJson;

	public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		if (options.getStripeVersion() == null) {
			throw new IllegalArgumentException("stripeVersion must be specified in RequestOptions");
		}

		return request(RequestMethod.POST, classURL(EphemeralKey.class), params, EphemeralKey.class, options);
	}

	public EphemeralKey delete()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(null);
	}

	public EphemeralKey delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(EphemeralKey.class, this.id), null, EphemeralKey.class, options);
	}
}
