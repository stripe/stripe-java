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
import lombok.Getter;

@Getter
public class SubscriptionItemCreateParams extends ApiRequestParams {
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. When updating, pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

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
  Map<String, String> metadata;

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

  /** The identifier of the plan to add to the subscription. */
  @SerializedName("plan")
  String plan;

  /** The ID of the price object. */
  @SerializedName("price")
  String price;

  /**
   * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
   * inline.
   */
  @SerializedName("price_data")
  PriceData priceData;

  /**
   * Determines how to handle <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
   * billing cycle changes (e.g., when switching plans, resetting {@code billing_cycle_anchor=now},
   * or starting a trial), or if an item's {@code quantity} changes. Valid values are {@code
   * create_prorations}, {@code none}, or {@code always_invoice}.
   *
   * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
   * applicable. These proration items will only be invoiced immediately under <a
   * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
   * conditions</a>. In order to always invoice immediately for prorations, pass {@code
   * always_invoice}.
   *
   * <p>Prorations can be disabled by passing {@code none}.
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

  /** The identifier of the subscription to modify. */
  @SerializedName("subscription")
  String subscription;

  /**
   * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
   * will override the <a
   * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
   * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
   * previously-defined tax rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  private SubscriptionItemCreateParams(
      Object billingThresholds,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      PaymentBehavior paymentBehavior,
      String plan,
      String price,
      PriceData priceData,
      ProrationBehavior prorationBehavior,
      Long prorationDate,
      Long quantity,
      String subscription,
      Object taxRates) {
    this.billingThresholds = billingThresholds;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentBehavior = paymentBehavior;
    this.plan = plan;
    this.price = price;
    this.priceData = priceData;
    this.prorationBehavior = prorationBehavior;
    this.prorationDate = prorationDate;
    this.quantity = quantity;
    this.subscription = subscription;
    this.taxRates = taxRates;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object billingThresholds;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private PaymentBehavior paymentBehavior;

    private String plan;

    private String price;

    private PriceData priceData;

    private ProrationBehavior prorationBehavior;

    private Long prorationDate;

    private Long quantity;

    private String subscription;

    private Object taxRates;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionItemCreateParams build() {
      return new SubscriptionItemCreateParams(
          this.billingThresholds,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentBehavior,
          this.plan,
          this.price,
          this.priceData,
          this.prorationBehavior,
          this.prorationDate,
          this.quantity,
          this.subscription,
          this.taxRates);
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. When updating, pass an empty string to remove previously-defined thresholds.
     */
    public Builder setBillingThresholds(BillingThresholds billingThresholds) {
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
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemCreateParams#expand} for the field documentation.
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
     * SubscriptionItemCreateParams#expand} for the field documentation.
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
     * SubscriptionItemCreateParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionItemCreateParams#extraParams} for the field documentation.
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
     * SubscriptionItemCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionItemCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
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
    public Builder setPaymentBehavior(PaymentBehavior paymentBehavior) {
      this.paymentBehavior = paymentBehavior;
      return this;
    }

    /** The identifier of the plan to add to the subscription. */
    public Builder setPlan(String plan) {
      this.plan = plan;
      return this;
    }

    /** The ID of the price object. */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline.
     */
    public Builder setPriceData(PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * Valid values are {@code create_prorations}, {@code none}, or {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
     * conditions</a>. In order to always invoice immediately for prorations, pass {@code
     * always_invoice}.
     *
     * <p>Prorations can be disabled by passing {@code none}.
     */
    public Builder setProrationBehavior(ProrationBehavior prorationBehavior) {
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

    /** The identifier of the subscription to modify. */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionItemCreateParams#taxRates} for the field documentation.
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
     * SubscriptionItemCreateParams#taxRates} for the field documentation.
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
  public static class BillingThresholds {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Usage threshold that triggers the subscription to advance to a new billing period. */
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
      public BillingThresholds build() {
        return new BillingThresholds(this.extraParams, this.usageGte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionItemCreateParams.BillingThresholds#extraParams} for the field documentation.
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
       * See {@link SubscriptionItemCreateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Usage threshold that triggers the subscription to advance to a new billing period. */
      public Builder setUsageGte(Long usageGte) {
        this.usageGte = usageGte;
        return this;
      }
    }
  }

  @Getter
  public static class PriceData {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the product that this price will belong to. */
    @SerializedName("product")
    String product;

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    @SerializedName("recurring")
    Recurring recurring;

    /**
     * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
     * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code
     * inclusive} or {@code exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
     * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    private PriceData(
        String currency,
        Map<String, Object> extraParams,
        String product,
        Recurring recurring,
        TaxBehavior taxBehavior,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
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
      private String currency;

      private Map<String, Object> extraParams;

      private String product;

      private Recurring recurring;

      private TaxBehavior taxBehavior;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceData build() {
        return new PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.recurring,
            this.taxBehavior,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionItemCreateParams.PriceData#extraParams} for the field documentation.
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
       * See {@link SubscriptionItemCreateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the product that this price will belong to. */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
      public Builder setRecurring(Recurring recurring) {
        this.recurring = recurring;
        return this;
      }

      /**
       * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
       * {@code inclusive} or {@code exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
       * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
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
       * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
       * year}.
       */
      @SerializedName("interval")
      Interval interval;

      /**
       * The number of intervals between subscription billings. For example, {@code interval=month}
       * and {@code interval_count=3} bills every 3 months. Maximum of one year interval allowed (1
       * year, 12 months, or 52 weeks).
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
        public Recurring build() {
          return new Recurring(this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionItemCreateParams.PriceData.Recurring#extraParams} for the
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
         * map. See {@link SubscriptionItemCreateParams.PriceData.Recurring#extraParams} for the
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
         * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
         * year}.
         */
        public Builder setInterval(Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
         * interval allowed (1 year, 12 months, or 52 weeks).
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
