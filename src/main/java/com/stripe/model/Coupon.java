// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
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

/**
 * A coupon contains information about a percent-off or amount-off discount you might want to apply
 * to a customer. Coupons may be applied to <a
 * href="https://stripe.com/docs/api#subscriptions">subscriptions</a>, <a
 * href="https://stripe.com/docs/api#invoices">invoices</a>, <a
 * href="https://stripe.com/docs/api/checkout/sessions">checkout sessions</a>, <a
 * href="https://stripe.com/docs/api#quotes">quotes</a>, and more. Coupons do not work with
 * conventional one-off <a href="https://stripe.com/docs/api#create_charge">charges</a> or <a
 * href="https://stripe.com/docs/api/payment_intents">payment intents</a>.
 */
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

  /**
   * Coupons defined in each available currency option. Each key must be a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  Map<String, Coupon.CurrencyOption> currencyOptions;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * One of {@code forever}, {@code once}, or {@code repeating}. Describes how long a customer who
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
   * of the coupon. For example, a coupon with percent_off of 50 will make a $ (or local
   * equivalent)100 invoice $ (or local equivalent)50 instead.
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

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public static Coupon create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public static Coupon create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/coupons";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Coupon.class);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public static Coupon create(CouponCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public static Coupon create(CouponCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/coupons";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Coupon.class);
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
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Coupon.class);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/coupons";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CouponCollection.class);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(CouponListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your coupons. */
  public static CouponCollection list(CouponListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/coupons";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CouponCollection.class);
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
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Coupon.class);
  }

  /** Retrieves the coupon with the given ID. */
  public static Coupon retrieve(String coupon, CouponRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Coupon.class);
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
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Coupon.class);
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
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Coupon.class);
  }

  /**
   * For more details about AppliesTo, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliesTo extends StripeObject {
    /** A list of product IDs this coupon applies to. */
    @SerializedName("products")
    List<String> products;
  }

  /**
   * For more details about CurrencyOption, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyOption extends StripeObject {
    /**
     * Amount (in the {@code currency} specified) that will be taken off the subtotal of any
     * invoices for this customer.
     */
    @SerializedName("amount_off")
    Long amountOff;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(appliesTo, responseGetter);
  }
}
