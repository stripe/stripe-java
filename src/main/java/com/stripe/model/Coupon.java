package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Coupon extends APIResource implements MetadataStore<Coupon>, HasId {
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

  // <editor-fold desc="all">
  /**
   * List all coupons.
   *
   * @deprecated Use the {@link #list(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CouponCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all coupons.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CouponCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }

  /**
   * List all coupons.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static CouponCollection all(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Coupon.class), params, Coupon.class, options);
  }

  /**
   * Create a coupon.
   *
   * @deprecated Use the {@link #create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Coupon create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a coupon.
   */
  public DeletedCoupon delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a coupon.
   */
  public DeletedCoupon delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, instanceURL(Coupon.class, this.id), null,
        DeletedCoupon.class, options);
  }

  /**
   * Delete a coupon.
   *
   * @deprecated Use the {@link #delete(RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public DeletedCoupon delete(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Coupon.class), params, CouponCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Coupon.class, id), null, Coupon.class, options);
  }

  /**
   * Retrieve a coupon.
   *
   * @deprecated Use the {@link #retrieve(String, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Coupon retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Coupon.class, this.id), params, Coupon.class,
        options);
  }

  /**
   * Update a coupon.
   *
   * @deprecated Use the {@link #update(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Coupon update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>
}
