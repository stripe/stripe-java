package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Coupon extends ApiResource implements MetadataStore<Coupon>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amountOff;
  Long created;
  String currency;
  String duration;
  Integer durationInMonths;
  Boolean livemode;
  Long maxRedemptions;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String name;
  Integer percentOff;
  Long redeemBy;
  Integer timesRedeemed;
  Boolean valid;

  // <editor-fold desc="create">
  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, classUrl(Coupon.class), params, Coupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a coupon.
   */
  public DeletedCoupon delete() throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a coupon.
   */
  public DeletedCoupon delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return request(RequestMethod.DELETE, instanceUrl(Coupon.class, this.id), null,
        DeletedCoupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return requestCollection(classUrl(Coupon.class), params, CouponCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Coupon.class, id), null, Coupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return request(RequestMethod.POST, instanceUrl(Coupon.class, this.id), params, Coupon.class,
        options);
  }
  // </editor-fold>
}
