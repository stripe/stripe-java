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
import com.stripe.param.PromotionCodeCreateParams;
import com.stripe.param.PromotionCodeListParams;
import com.stripe.param.PromotionCodeRetrieveParams;
import com.stripe.param.PromotionCodeUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Promotion Code represents a customer-redeemable code for an underlying promotion. You can
 * create multiple codes for a single promotion.
 *
 * <p>If you enable promotion codes in your <a
 * href="https://stripe.com/docs/customer-management/configure-portal">customer portal
 * configuration</a>, then customers can redeem a code themselves when updating a subscription in
 * the portal. Customers can also view the currently active promotion codes and coupons on each of
 * their subscriptions in the portal.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PromotionCode extends ApiResource implements HasId, MetadataStore<PromotionCode> {
  /**
   * Whether the promotion code is currently active. A promotion code is only active if the coupon
   * is also valid.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active
   * promotion codes for each customer. Valid characters are lower case letters (a-z), upper case
   * letters (A-Z), and digits (0-9).
   */
  @SerializedName("code")
  String code;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The customer that this promotion code can be used by. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Date at which the promotion code can no longer be redeemed. */
  @SerializedName("expires_at")
  Long expiresAt;

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

  /** Maximum number of times this promotion code can be redeemed. */
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

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code promotion_code}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("promotion")
  Promotion promotion;

  @SerializedName("restrictions")
  Restrictions restrictions;

  /** Number of times this promotion code has been used. */
  @SerializedName("times_redeemed")
  Long timesRedeemed;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /**
   * A promotion code points to an underlying promotion. You can optionally restrict the code to a
   * specific customer, redemption limit, and expiration date.
   */
  public static PromotionCode create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A promotion code points to an underlying promotion. You can optionally restrict the code to a
   * specific customer, redemption limit, and expiration date.
   */
  public static PromotionCode create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/promotion_codes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PromotionCode.class);
  }

  /**
   * A promotion code points to an underlying promotion. You can optionally restrict the code to a
   * specific customer, redemption limit, and expiration date.
   */
  public static PromotionCode create(PromotionCodeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A promotion code points to an underlying promotion. You can optionally restrict the code to a
   * specific customer, redemption limit, and expiration date.
   */
  public static PromotionCode create(PromotionCodeCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/promotion_codes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PromotionCode.class);
  }

  /** Returns a list of your promotion codes. */
  public static PromotionCodeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your promotion codes. */
  public static PromotionCodeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/promotion_codes";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PromotionCodeCollection.class);
  }

  /** Returns a list of your promotion codes. */
  public static PromotionCodeCollection list(PromotionCodeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your promotion codes. */
  public static PromotionCodeCollection list(PromotionCodeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/promotion_codes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PromotionCodeCollection.class);
  }

  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public static PromotionCode retrieve(String promotionCode) throws StripeException {
    return retrieve(promotionCode, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public static PromotionCode retrieve(String promotionCode, RequestOptions options)
      throws StripeException {
    return retrieve(promotionCode, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public static PromotionCode retrieve(
      String promotionCode, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PromotionCode.class);
  }

  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public static PromotionCode retrieve(
      String promotionCode, PromotionCodeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PromotionCode.class);
  }

  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  @Override
  public PromotionCode update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  @Override
  public PromotionCode update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PromotionCode.class);
  }

  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(PromotionCodeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(PromotionCodeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PromotionCode.class);
  }

  /**
   * For more details about Promotion, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Promotion extends StripeObject {
    /** If promotion {@code type} is {@code coupon}, the coupon for this promotion. */
    @SerializedName("coupon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Coupon> coupon;

    /**
     * The type of promotion.
     *
     * <p>Equal to {@code coupon}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code coupon} object. */
    public String getCoupon() {
      return (this.coupon != null) ? this.coupon.getId() : null;
    }

    public void setCoupon(String id) {
      this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
    }

    /** Get expanded {@code coupon}. */
    public Coupon getCouponObject() {
      return (this.coupon != null) ? this.coupon.getExpanded() : null;
    }

    public void setCouponObject(Coupon expandableObject) {
      this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Restrictions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Restrictions extends StripeObject {
    /**
     * Promotion code restrictions defined in each available currency option. Each key must be a
     * three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>
     * and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency_options")
    Map<String, PromotionCode.Restrictions.CurrencyOption> currencyOptions;

    /**
     * A Boolean indicating if the Promotion Code should only be redeemed for Customers without any
     * successful payments or invoices.
     */
    @SerializedName("first_time_transaction")
    Boolean firstTimeTransaction;

    /**
     * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be
     * $100 or more to work).
     */
    @SerializedName("minimum_amount")
    Long minimumAmount;

    /** Three-letter <a href="https://stripe.com/docs/currencies">ISO code</a> for minimum_amount */
    @SerializedName("minimum_amount_currency")
    String minimumAmountCurrency;

    /**
     * For more details about CurrencyOption, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CurrencyOption extends StripeObject {
      /**
       * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must
       * be $100 or more to work).
       */
      @SerializedName("minimum_amount")
      Long minimumAmount;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(promotion, responseGetter);
    trySetResponseGetter(restrictions, responseGetter);
  }
}
