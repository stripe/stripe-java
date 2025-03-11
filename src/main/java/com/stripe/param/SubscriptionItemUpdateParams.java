// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionItemUpdateParams extends ApiRequestParams {
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. When updating, pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

  /** The coupons to redeem into discounts for the subscription item. */
  @SerializedName("discounts")
  Object discounts;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to
   * {@code false} (on-session).
   */
  @SerializedName("off_session")
  Boolean offSession;

  /**
   * Use {@code allow_incomplete} to transition the subscription to {@code status=past_due} if a
   * payment is required but cannot be paid. This allows you to manage scenarios where additional
   * user actions are needed to pay a subscription's invoice. For example, SCA regulation may
   * require 3DS authentication to complete payment. See the <a
   * href="https://stripe.com/docs/billing/migration/strong-customer-authentication">SCA Migration
   * Guide</a> for Billing to learn more. This is the default behavior.
   *
   * <p>Use {@code default_incomplete} to transition the subscription to {@code status=past_due}
   * when payment is required and await explicit confirmation of the invoice's payment intent. This
   * allows simpler management of scenarios where additional user actions are needed to pay a
   * subscription’s invoice. Such as failed payments, <a
   * href="https://stripe.com/docs/billing/migration/strong-customer-authentication">SCA
   * regulation</a>, or collecting a mandate for a bank debit payment method.
   *
   * <p>Use {@code pending_if_incomplete} to update the subscription using <a
   * href="https://stripe.com/docs/billing/subscriptions/pending-updates">pending updates</a>. When
   * you use {@code pending_if_incomplete} you can only pass the parameters <a
   * href="https://stripe.com/docs/billing/pending-updates-reference#supported-attributes">supported
   * by pending updates</a>.
   *
   * <p>Use {@code error_if_incomplete} if you want Stripe to return an HTTP 402 status code if a
   * subscription's invoice cannot be paid. For example, if a payment method requires 3DS
   * authentication due to SCA regulation and further user action is needed, this parameter does not
   * update the subscription and returns an error instead. This was the default behavior for API
   * versions prior to 2019-03-14. See the <a
   * href="https://stripe.com/docs/upgrades#2019-03-14">changelog</a> to learn more.
   */
  @SerializedName("payment_behavior")
  PaymentBehavior paymentBehavior;

  /** The identifier of the new plan for this subscription item. */
  @SerializedName("plan")
  Object plan;

  /**
   * The ID of the price object. One of {@code price} or {@code price_data} is required. When
   * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code quantity}
   * parameter is provided.
   */
  @SerializedName("price")
  Object price;

  /**
   * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
   * inline. One of {@code price} or {@code price_data} is required.
   */
  @SerializedName("price_data")
  PriceData priceData;

  /**
   * Determines how to handle <a
   * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the billing
   * cycle changes (e.g., when switching plans, resetting {@code billing_cycle_anchor=now}, or
   * starting a trial), or if an item's {@code quantity} changes. The default value is {@code
   * create_prorations}.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  /**
   * If set, the proration will be calculated as though the subscription was updated at the given
   * time. This can be used to apply the same proration that was previewed with the <a
   * href="https://stripe.com/docs/api#retrieve_customer_invoice">upcoming invoice</a> endpoint.
   */
  @SerializedName("proration_date")
  Long prorationDate;

  /** The quantity you'd like to apply to the subscription item you're creating. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
   * will override the <a
   * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
   * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
   * previously-defined tax rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  private SubscriptionItemUpdateParams(
      Object billingThresholds,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Boolean offSession,
      PaymentBehavior paymentBehavior,
      Object plan,
      Object price,
      PriceData priceData,
      ProrationBehavior prorationBehavior,
      Long prorationDate,
      Long quantity,
      Object taxRates) {
    this.billingThresholds = billingThresholds;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.offSession = offSession;
    this.paymentBehavior = paymentBehavior;
    this.plan = plan;
    this.price = price;
    this.priceData = priceData;
    this.prorationBehavior = prorationBehavior;
    this.prorationDate = prorationDate;
    this.quantity = quantity;
    this.taxRates = taxRates;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object billingThresholds;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Boolean offSession;

    private PaymentBehavior paymentBehavior;

    private Object plan;

    private Object price;

    private PriceData priceData;

    private ProrationBehavior prorationBehavior;

    private Long prorationDate;

    private Long quantity;

    private Object taxRates;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionItemUpdateParams build() {
      return new SubscriptionItemUpdateParams(
          this.billingThresholds,
          this.discounts,
          this.expand,
          this.extraParams,
          this.metadata,
          this.offSession,
          this.paymentBehavior,
          this.plan,
          this.price,
          this.priceData,
          this.prorationBehavior,
          this.prorationDate,
          this.quantity,
          this.taxRates);
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. When updating, pass an empty string to remove previously-defined thresholds.
     */
    public Builder setBillingThresholds(
        SubscriptionItemUpdateParams.BillingThresholds billingThresholds) {
      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. When updating, pass an empty string to remove previously-defined thresholds.
     */
    public Builder setBillingThresholds(EmptyParam billingThresholds) {
      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(SubscriptionItemUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<SubscriptionItemUpdateParams.Discount>();
      }
      ((List<SubscriptionItemUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<SubscriptionItemUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<SubscriptionItemUpdateParams.Discount>();
      }
      ((List<SubscriptionItemUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** The coupons to redeem into discounts for the subscription item. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** The coupons to redeem into discounts for the subscription item. */
    public Builder setDiscounts(List<SubscriptionItemUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionItemUpdateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionItemUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionItemUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionItemUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults
     * to {@code false} (on-session).
     */
    public Builder setOffSession(Boolean offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * Use {@code allow_incomplete} to transition the subscription to {@code status=past_due} if a
     * payment is required but cannot be paid. This allows you to manage scenarios where additional
     * user actions are needed to pay a subscription's invoice. For example, SCA regulation may
     * require 3DS authentication to complete payment. See the <a
     * href="https://stripe.com/docs/billing/migration/strong-customer-authentication">SCA Migration
     * Guide</a> for Billing to learn more. This is the default behavior.
     *
     * <p>Use {@code default_incomplete} to transition the subscription to {@code status=past_due}
     * when payment is required and await explicit confirmation of the invoice's payment intent.
     * This allows simpler management of scenarios where additional user actions are needed to pay a
     * subscription’s invoice. Such as failed payments, <a
     * href="https://stripe.com/docs/billing/migration/strong-customer-authentication">SCA
     * regulation</a>, or collecting a mandate for a bank debit payment method.
     *
     * <p>Use {@code pending_if_incomplete} to update the subscription using <a
     * href="https://stripe.com/docs/billing/subscriptions/pending-updates">pending updates</a>.
     * When you use {@code pending_if_incomplete} you can only pass the parameters <a
     * href="https://stripe.com/docs/billing/pending-updates-reference#supported-attributes">supported
     * by pending updates</a>.
     *
     * <p>Use {@code error_if_incomplete} if you want Stripe to return an HTTP 402 status code if a
     * subscription's invoice cannot be paid. For example, if a payment method requires 3DS
     * authentication due to SCA regulation and further user action is needed, this parameter does
     * not update the subscription and returns an error instead. This was the default behavior for
     * API versions prior to 2019-03-14. See the <a
     * href="https://stripe.com/docs/upgrades#2019-03-14">changelog</a> to learn more.
     */
    public Builder setPaymentBehavior(
        SubscriptionItemUpdateParams.PaymentBehavior paymentBehavior) {
      this.paymentBehavior = paymentBehavior;
      return this;
    }

    /** The identifier of the new plan for this subscription item. */
    public Builder setPlan(String plan) {
      this.plan = plan;
      return this;
    }

    /** The identifier of the new plan for this subscription item. */
    public Builder setPlan(EmptyParam plan) {
      this.plan = plan;
      return this;
    }

    /**
     * The ID of the price object. One of {@code price} or {@code price_data} is required. When
     * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code quantity}
     * parameter is provided.
     */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /**
     * The ID of the price object. One of {@code price} or {@code price_data} is required. When
     * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code quantity}
     * parameter is provided.
     */
    public Builder setPrice(EmptyParam price) {
      this.price = price;
      return this;
    }

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required.
     */
    public Builder setPriceData(SubscriptionItemUpdateParams.PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * The default value is {@code create_prorations}.
     */
    public Builder setProrationBehavior(
        SubscriptionItemUpdateParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given
     * time. This can be used to apply the same proration that was previewed with the <a
     * href="https://stripe.com/docs/api#retrieve_customer_invoice">upcoming invoice</a> endpoint.
     */
    public Builder setProrationDate(Long prorationDate) {
      this.prorationDate = prorationDate;
      return this;
    }

    /** The quantity you'd like to apply to the subscription item you're creating. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#taxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addTaxRate(String element) {
      if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
        this.taxRates = new ArrayList<String>();
      }
      ((List<String>) this.taxRates).add(element);
      return this;
    }

    /**
     * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemUpdateParams#taxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllTaxRate(List<String> elements) {
      if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
        this.taxRates = new ArrayList<String>();
      }
      ((List<String>) this.taxRates).addAll(elements);
      return this;
    }

    /**
     * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
     * will override the <a
     * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
     * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
     * previously-defined tax rates.
     */
    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
     * will override the <a
     * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
     * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
     * previously-defined tax rates.
     */
    public Builder setTaxRates(List<String> taxRates) {
      this.taxRates = taxRates;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingThresholds {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Number of units that meets the billing threshold to advance the
     * subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
     * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
     * threshold</a>)
     */
    @SerializedName("usage_gte")
    Long usageGte;

    private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {
      this.extraParams = extraParams;
      this.usageGte = usageGte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long usageGte;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionItemUpdateParams.BillingThresholds build() {
        return new SubscriptionItemUpdateParams.BillingThresholds(this.extraParams, this.usageGte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionItemUpdateParams.BillingThresholds#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionItemUpdateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Number of units that meets the billing threshold to advance the
       * subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
       * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
       * threshold</a>)
       */
      public Builder setUsageGte(Long usageGte) {
        this.usageGte = usageGte;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    Object coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    Object discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    Object promotionCode;

    private Discount(
        Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private Map<String, Object> extraParams;

      private Object promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionItemUpdateParams.Discount build() {
        return new SubscriptionItemUpdateParams.Discount(
            this.coupon, this.discount, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(EmptyParam coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(EmptyParam discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionItemUpdateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionItemUpdateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(EmptyParam promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PriceData {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    Object currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the product that this price will belong to. */
    @SerializedName("product")
    Object product;

    /**
     * <strong>Required.</strong> The recurring components of a price such as {@code interval} and
     * {@code interval_count}.
     */
    @SerializedName("recurring")
    Recurring recurring;

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /**
     * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
     * much to charge.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    @SerializedName("unit_amount_decimal")
    Object unitAmountDecimal;

    private PriceData(
        Object currency,
        Map<String, Object> extraParams,
        Object product,
        Recurring recurring,
        TaxBehavior taxBehavior,
        Long unitAmount,
        Object unitAmountDecimal) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.product = product;
      this.recurring = recurring;
      this.taxBehavior = taxBehavior;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object currency;

      private Map<String, Object> extraParams;

      private Object product;

      private Recurring recurring;

      private TaxBehavior taxBehavior;

      private Long unitAmount;

      private Object unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionItemUpdateParams.PriceData build() {
        return new SubscriptionItemUpdateParams.PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.recurring,
            this.taxBehavior,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(EmptyParam currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionItemUpdateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionItemUpdateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      public Builder setProduct(EmptyParam product) {
        this.product = product;
        return this;
      }

      /**
       * <strong>Required.</strong> The recurring components of a price such as {@code interval} and
       * {@code interval_count}.
       */
      public Builder setRecurring(SubscriptionItemUpdateParams.PriceData.Recurring recurring) {
        this.recurring = recurring;
        return this;
      }

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(
          SubscriptionItemUpdateParams.PriceData.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Recurring {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
       * {@code month} or {@code year}.
       */
      @SerializedName("interval")
      Interval interval;

      /**
       * The number of intervals between subscription billings. For example, {@code interval=month}
       * and {@code interval_count=3} bills every 3 months. Maximum of three years interval allowed
       * (3 years, 36 months, or 156 weeks).
       */
      @SerializedName("interval_count")
      Long intervalCount;

      private Recurring(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
        this.extraParams = extraParams;
        this.interval = interval;
        this.intervalCount = intervalCount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Interval interval;

        private Long intervalCount;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionItemUpdateParams.PriceData.Recurring build() {
          return new SubscriptionItemUpdateParams.PriceData.Recurring(
              this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionItemUpdateParams.PriceData.Recurring#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionItemUpdateParams.PriceData.Recurring#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        public Builder setInterval(
            SubscriptionItemUpdateParams.PriceData.Recurring.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three years
         * interval allowed (3 years, 36 months, or 156 weeks).
         */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week"),

        @SerializedName("year")
        YEAR("year");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive"),

      @SerializedName("unspecified")
      UNSPECIFIED("unspecified");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }

  public enum PaymentBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("allow_incomplete")
    ALLOW_INCOMPLETE("allow_incomplete"),

    @SerializedName("default_incomplete")
    DEFAULT_INCOMPLETE("default_incomplete"),

    @SerializedName("error_if_incomplete")
    ERROR_IF_INCOMPLETE("error_if_incomplete"),

    @SerializedName("pending_if_incomplete")
    PENDING_IF_INCOMPLETE("pending_if_incomplete");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentBehavior(String value) {
      this.value = value;
    }
  }

  public enum ProrationBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("always_invoice")
    ALWAYS_INVOICE("always_invoice"),

    @SerializedName("create_prorations")
    CREATE_PRORATIONS("create_prorations"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ProrationBehavior(String value) {
      this.value = value;
    }
  }
}
