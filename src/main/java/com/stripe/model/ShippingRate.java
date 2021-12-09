// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ShippingRateCreateParams;
import com.stripe.param.ShippingRateListParams;
import com.stripe.param.ShippingRateRetrieveParams;
import com.stripe.param.ShippingRateUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ShippingRate extends ApiResource implements HasId, MetadataStore<ShippingRate> {
  /** Whether the shipping rate can be used for new purchases. Defaults to {@code true}. */
  @SerializedName("active")
  Boolean active;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The estimated range for how long shipping will take, meant to be displayable to the customer.
   * This will appear on CheckoutSessions.
   */
  @SerializedName("delivery_estimate")
  DeliveryEstimate deliveryEstimate;

  /**
   * The name of the shipping rate, meant to be displayable to the customer. This will appear on
   * CheckoutSessions.
   */
  @SerializedName("display_name")
  String displayName;

  @SerializedName("fixed_amount")
  FixedAmount fixedAmount;

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
   * <p>Equal to {@code shipping_rate}.
   */
  @SerializedName("object")
  String object;

  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
   * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /**
   * A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. The Shipping tax code is
   * {@code txcd_92010001}.
   */
  @SerializedName("tax_code")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TaxCode> taxCode;

  /**
   * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for now.
   *
   * <p>Equal to {@code fixed_amount}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code taxCode} object. */
  public String getTaxCode() {
    return (this.taxCode != null) ? this.taxCode.getId() : null;
  }

  public void setTaxCode(String id) {
    this.taxCode = ApiResource.setExpandableFieldId(id, this.taxCode);
  }

  /** Get expanded {@code taxCode}. */
  public TaxCode getTaxCodeObject() {
    return (this.taxCode != null) ? this.taxCode.getExpanded() : null;
  }

  public void setTaxCodeObject(TaxCode expandableObject) {
    this.taxCode = new ExpandableField<TaxCode>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of your shipping rates. */
  public static ShippingRateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your shipping rates. */
  public static ShippingRateCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.requestCollection(url, params, ShippingRateCollection.class, options);
  }

  /** Returns a list of your shipping rates. */
  public static ShippingRateCollection list(ShippingRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your shipping rates. */
  public static ShippingRateCollection list(ShippingRateListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.requestCollection(url, params, ShippingRateCollection.class, options);
  }

  /** Returns the shipping rate object with the given ID. */
  public static ShippingRate retrieve(String shippingRateToken) throws StripeException {
    return retrieve(shippingRateToken, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Returns the shipping rate object with the given ID. */
  public static ShippingRate retrieve(String shippingRateToken, RequestOptions options)
      throws StripeException {
    return retrieve(shippingRateToken, (Map<String, Object>) null, options);
  }

  /** Returns the shipping rate object with the given ID. */
  public static ShippingRate retrieve(
      String shippingRateToken, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ShippingRate.class, options);
  }

  /** Returns the shipping rate object with the given ID. */
  public static ShippingRate retrieve(
      String shippingRateToken, ShippingRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ShippingRate.class, options);
  }

  /** Creates a new shipping rate object. */
  public static ShippingRate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new shipping rate object. */
  public static ShippingRate create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ShippingRate.class, options);
  }

  /** Creates a new shipping rate object. */
  public static ShippingRate create(ShippingRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new shipping rate object. */
  public static ShippingRate create(ShippingRateCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ShippingRate.class, options);
  }

  /** Updates an existing shipping rate object. */
  @Override
  public ShippingRate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing shipping rate object. */
  @Override
  public ShippingRate update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ShippingRate.class, options);
  }

  /** Updates an existing shipping rate object. */
  public ShippingRate update(ShippingRateUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing shipping rate object. */
  public ShippingRate update(ShippingRateUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ShippingRate.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryEstimate extends StripeObject {
    /**
     * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
     */
    @SerializedName("maximum")
    Maximum maximum;

    /** The lower bound of the estimated range. If empty, represents no lower bound. */
    @SerializedName("minimum")
    Minimum minimum;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Maximum extends StripeObject {
      /**
       * A unit of time.
       *
       * <p>One of {@code business_day}, {@code day}, {@code hour}, {@code month}, or {@code week}.
       */
      @SerializedName("unit")
      String unit;

      /** Must be greater than 0. */
      @SerializedName("value")
      Long value;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Minimum extends StripeObject {
      /**
       * A unit of time.
       *
       * <p>One of {@code business_day}, {@code day}, {@code hour}, {@code month}, or {@code week}.
       */
      @SerializedName("unit")
      String unit;

      /** Must be greater than 0. */
      @SerializedName("value")
      Long value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FixedAmount extends StripeObject {
    /** A non-negative integer in cents representing how much to charge. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;
  }
}
