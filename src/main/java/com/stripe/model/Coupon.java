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

@Getter @Setter
public class Coupon extends APIResource implements MetadataStore<Coupon>, HasId {
	String id;
	String object;
	Long amountOff;
	Long created;
	String currency;
	String duration;
	Integer durationInMonths;
	Boolean livemode;
	Long maxRedemptions;
	Map<String, String> metadata;
	Integer percentOff;
	Long redeemBy;
	Integer timesRedeemed;
	Boolean valid;

	public static Coupon create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Coupon retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public Coupon update(Map<String, Object> params) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	@Deprecated
	public Coupon update(Map<String, Object> params, String apiKey) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Coupon update(Map<String, Object> params, RequestOptions options) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Coupon.class, this.id), params, Coupon.class, options);
	}

	@Deprecated
	public static Coupon create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static Coupon create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Coupon.class), params, Coupon.class, options);
	}

	@Deprecated
	public static Coupon retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static Coupon retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Coupon.class, id), null, Coupon.class, options);
	}

	public static CouponCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static CouponCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(Coupon.class), params, CouponCollection.class, options);
	}

	@Deprecated
	public static CouponCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static CouponCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static CouponCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, options);
	}

	public DeletedCoupon delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete((RequestOptions) null);
	}

	@Deprecated
	public DeletedCoupon delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}

	public DeletedCoupon delete(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, instanceURL(Coupon.class, this.id), null, DeletedCoupon.class, options);
	}
}
