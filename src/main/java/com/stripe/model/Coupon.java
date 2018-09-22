package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.math.BigDecimal;
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
  Boolean deleted;
  String duration;
  Long durationInMonths;
  Boolean livemode;
  Long maxRedemptions;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String name;
  BigDecimal percentOff;
  Long redeemBy;
  Long timesRedeemed;
  Boolean valid;

  /**
   * The {@code percent_off_precise} attribute.
   *
   * @return the {@code percent_off_precise} attribute
   * @deprecated Prefer using the {@link #percentOff} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-07-27">API version 2018-07-27</a>
   */
  @Deprecated
  BigDecimal percentOffPrecise;

  // <editor-fold desc="create">
  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a coupon.
   */
  public static Coupon create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Coupon.class), params, Coupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a coupon.
   */
  public Coupon delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a coupon.
   */
  public Coupon delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Coupon.class, this.id), null,
        Coupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all coupons.
   */
  public static CouponCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Coupon.class), params, CouponCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a coupon.
   */
  public static Coupon retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Coupon.class, id), params, Coupon.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a coupon.
   */
  @Override
  public Coupon update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Coupon.class, this.id), params, Coupon.class,
        options);
  }
  // </editor-fold>
}
