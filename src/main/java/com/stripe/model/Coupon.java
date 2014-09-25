package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;

import java.util.Map;

public class Coupon extends APIResource implements MetadataStore<Coupon> {
	Integer percentOff;
	Integer amountOff;
	String currency;
	String duration;
	String id;
	Boolean livemode;
	Integer durationInMonths;
	Long maxRedemptions;
	Long redeemBy;
	Integer timesRedeemed;
	Boolean valid;
	Map<String, String> metadata;

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public static Coupon create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Coupon retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public Coupon update(Map<String, Object> params) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public Coupon update(Map<String, Object> params, String apiKey) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Coupon.class, this.id),
				params, Coupon.class, apiKey);
	}

	public static CouponCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, null);
	}

	public DeletedCoupon delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(null);
	}

	public static Coupon create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Coupon.class), params,
				Coupon.class, apiKey);
	}

	public static Coupon retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Coupon.class, id), null,
				Coupon.class, apiKey);
	}

	public static CouponCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, classURL(Coupon.class), params,
				CouponCollection.class, apiKey);
	}

	public DeletedCoupon delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE,
				instanceURL(Coupon.class, this.id), null, DeletedCoupon.class,
				apiKey);
	}

	public Integer getPercentOff() {
		return percentOff;
	}

	public void setPercentOff(Integer percentOff) {
		this.percentOff = percentOff;
	}

	public Integer getAmountOff() {
		return amountOff;
	}

	public void setAmountOff(Integer amountOff) {
		this.amountOff = amountOff;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Integer getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Integer durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public Long getMaxRedemptions() {
		return maxRedemptions;
	}

	public void setMaxRedemptions(Long maxRedemptions) {
		this.maxRedemptions = maxRedemptions;
	}

	public Long getRedeemBy() {
		return redeemBy;
	}

	public void setRedeemBy(Long redeemBy) {
		this.redeemBy = redeemBy;
	}

	public Integer getTimesRedeemed() {
		return timesRedeemed;
	}

	public void setTimesRedeemed(Integer timesRedeemed) {
		this.timesRedeemed = timesRedeemed;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
}
