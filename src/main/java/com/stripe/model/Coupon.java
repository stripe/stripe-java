package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Coupon extends APIResource {
	Integer percentOff;
	String duration;
	String id;
	Boolean livemode;
	Integer durationInMonths;
	Integer maxRedemptions;
	Integer redeemBy;
	
	public static Coupon create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(Coupon.class), params, Coupon.class);
	}

	public static Coupon retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Coupon.class, id), null, Coupon.class);
	}
	
	public static CouponCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Coupon.class), params, CouponCollection.class);
	}
	
	public DeletedCoupon delete() throws StripeException { 
		return request(RequestMethod.DELETE, instanceURL(Coupon.class, this.id), null, DeletedCoupon.class);
	}

	public Integer getPercentOff() {
		return percentOff;
	}

	public void setPercentOff(Integer percentOff) {
		this.percentOff = percentOff;
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

	public Integer getMaxRedemptions() {
		return maxRedemptions;
	}

	public void setMaxRedemptions(Integer maxRedemptions) {
		this.maxRedemptions = maxRedemptions;
	}

	public Integer getRedeemBy() {
		return redeemBy;
	}

	public void setRedeemBy(Integer redeemBy) {
		this.redeemBy = redeemBy;
	}

	
}