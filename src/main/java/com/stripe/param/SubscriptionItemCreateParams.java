package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Use `allow_incomplete` to create subscriptions with `status=incomplete` if the first invoice
   * cannot be paid. Creating subscriptions with this status allows you to manage scenarios where
   * additional user actions are needed to pay a subscription's invoice. For example, SCA regulation
   * may require 3DS authentication to complete payment. See the [SCA Migration
   * Guide](https://stripe.com/docs/billing/migration/strong-customer-authentication) for Billing to
   * learn more. This is the default behavior.
   *
   * <p>Use `error_if_incomplete` if you want Stripe to return an HTTP 402 status code if a
   * subscription's first invoice cannot be paid. For example, if a payment method requires 3DS
   * authentication due to SCA regulation and further user action is needed, this parameter does not
   * create a subscription and returns an error instead. This was the default behavior for API
   * versions prior to 2019-03-14. See the [changelog](https://stripe.com/docs/upgrades#2019-03-14)
   * to learn more.
   */
  @SerializedName("payment_behavior")
  PaymentBehavior paymentBehavior;

  /** The identifier of the plan to add to the subscription. */
  @SerializedName("plan")
  String plan;

  /**
   * Flag indicating whether to [prorate](https://stripe.com/docs/billing/subscriptions/prorations)
   * switching plans during a billing cycle.
   */
  @SerializedName("prorate")
  Boolean prorate;

  /**
   * If set, the proration will be calculated as though the subscription was updated at the given
   * time. This can be used to apply the same proration that was previewed with the [upcoming
   * invoice](#retrieve_customer_invoice) endpoint.
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
   * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will override
   * the
   * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
   * on the Subscription. When updating, pass an empty string to remove previously-defined tax
   * rates.
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
      Boolean prorate,
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
    this.prorate = prorate;
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

    private Boolean prorate;

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
          this.prorate,
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
     * Use `allow_incomplete` to create subscriptions with `status=incomplete` if the first invoice
     * cannot be paid. Creating subscriptions with this status allows you to manage scenarios where
     * additional user actions are needed to pay a subscription's invoice. For example, SCA
     * regulation may require 3DS authentication to complete payment. See the [SCA Migration
     * Guide](https://stripe.com/docs/billing/migration/strong-customer-authentication) for Billing
     * to learn more. This is the default behavior.
     *
     * <p>Use `error_if_incomplete` if you want Stripe to return an HTTP 402 status code if a
     * subscription's first invoice cannot be paid. For example, if a payment method requires 3DS
     * authentication due to SCA regulation and further user action is needed, this parameter does
     * not create a subscription and returns an error instead. This was the default behavior for API
     * versions prior to 2019-03-14. See the
     * [changelog](https://stripe.com/docs/upgrades#2019-03-14) to learn more.
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

    /**
     * Flag indicating whether to
     * [prorate](https://stripe.com/docs/billing/subscriptions/prorations) switching plans during a
     * billing cycle.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given
     * time. This can be used to apply the same proration that was previewed with the [upcoming
     * invoice](#retrieve_customer_invoice) endpoint.
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
     * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
     * override the
     * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
     * on the Subscription. When updating, pass an empty string to remove previously-defined tax
     * rates.
     */
    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
     * override the
     * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
     * on the Subscription. When updating, pass an empty string to remove previously-defined tax
     * rates.
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

  public enum PaymentBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("allow_incomplete")
    ALLOW_INCOMPLETE("allow_incomplete"),

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
}
