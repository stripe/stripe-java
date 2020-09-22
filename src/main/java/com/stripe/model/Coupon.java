// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CouponCreateParams;
import com.stripe.param.CouponListParams;
import com.stripe.param.CouponRetrieveParams;
import com.stripe.param.CouponUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Coupon extends ApiResource implements HasId, MetadataStore<Coupon> {
  /**
   * Amount (in the {@code currency} specified) that will be taken off the subtotal of any invoices
   * for this customer.
   */
  @SerializedName("amount_off")
  Long amountOff;

  @SerializedName("applies_to")
  AppliesTo appliesTo;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * If {@code amount_off} has been set, the three-letter <a
   * href="https://stripe.com/docs/currencies">ISO code for the currency</a> of the amount to take
   * off.
   */
  @SerializedName("currency")
  String currency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * One of {@code forever}, {@code once}, and {@code repeating}. Describes how long a customer who
   * applies this coupon will get the discount.
   */
  @SerializedName("duration")
  String duration;

  /**
   * If {@code duration} is {@code repeating}, the number of months the coupon applies. Null if
   * coupon {@code duration} is {@code forever} or {@code once}.
   */
  @SerializedName("duration_in_months")
  Long durationInMonths;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Maximum number of times this coupon can be redeemed, in total, across all customers, before it
   * is no longer valid.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Name of the coupon displayed to customers on for instance invoices or receipts. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code coupon}.
   */
  @SerializedName("object")
  String object;

  /**
   * Percent that will be taken off the subtotal of any invoices for this customer for the duration
   * of the coupon. For example, a coupon with percent_off of 50 will make a %s100 invoice %s50
   * instead.
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /** Date after which the coupon can no longer be redeemed. */
  @SerializedName("redeem_by")
  Long redeemBy;

  /** Number of times this coupon has been applied to a customer. */
  @SerializedName("times_redeemed")
  Long timesRedeemed;

  /**
   * Taking account of the above properties, whether this coupon can still be applied to a customer.
   */
  @SerializedName("valid")
  Boolean valid;

  /** Returns a list of your coupons. */
  public static CouponCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.requestCollection(url, params, CouponCollection.class, options);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(CouponListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(CouponListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.requestCollection(url, params, CouponCollection.class, options);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any
   * invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0
   * if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of
   * 200 is applied to it.
   */
  public static Coupon create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any
   * invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0
   * if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of
   * 200 is applied to it.
   */
  public static Coupon create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any
   * invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0
   * if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of
   * 200 is applied to it.
   */
  public static Coupon create(CouponCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>
   * currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any
   * invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0
   * if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a
   * subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of
   * 200 is applied to it.
   */
  public static Coupon create(CouponCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /** Retrieves the coupon with the given ID. */
  public static Coupon retrieve(String coupon) throws StripeException {
    return retrieve(coupon, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the coupon with the given ID. */
  public static Coupon retrieve(String coupon, RequestOptions options) throws StripeException {
    return retrieve(coupon, (Map<String, Object>) null, options);
  }

  /** Retrieves the coupon with the given ID. */
  public static Coupon retrieve(String coupon, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Coupon.class, options);
  }

  /** Retrieves the coupon with the given ID. */
  public static Coupon retrieve(String coupon, CouponRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Coupon.class, options);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  @Override
  public Coupon update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  @Override
  public Coupon update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(CouponUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(CouponUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Coupon.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliesTo extends StripeObject {
    /** A list of product IDs this coupon applies to. */
    @SerializedName("products")
    List<String> products;
  }
}
