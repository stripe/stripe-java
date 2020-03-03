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
public class SubscriptionItemUpdateParams extends ApiRequestParams {
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
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to {@code
   * metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Indicates if a customer is on or off-session while an invoice payment is attempted. */
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
   * <p>Use {@code pending_if_incomplete} to update the subscription using <a
   * href="https://stripe.com/docs/billing/subscriptions/pending-updates">pending updates</a>. When
   * you use {@code pending_if_incomplete} you can only pass the parameters <a
   * href="https://stripe.com/docs/billing/pending-updates-reference#supported-attributes">supported
   * by pending updates</a>.
   *
   * <p>Use {@code error_if_incomplete} if you want Stripe to return an HTTP 402 status code if a
   * subscription's first invoice cannot be paid. For example, if a payment method requires 3DS
   * authentication due to SCA regulation and further user action is needed, this parameter does not
   * create a subscription and returns an error instead. This was the default behavior for API
   * versions prior to 2019-03-14. See the <a
   * href="https://stripe.com/docs/upgrades#2019-03-14">changelog</a> to learn more.
   */
  @SerializedName("payment_behavior")
  PaymentBehavior paymentBehavior;

  /** The identifier of the new plan for this subscription item. */
  @SerializedName("plan")
  Object plan;

  /**
   * This field has been renamed to {@code proration_behavior}. {@code prorate=true} can be replaced
   * with {@code proration_behavior=create_prorations} and {@code prorate=false} can be replaced
   * with {@code proration_behavior=none}.
   */
  @SerializedName("prorate")
  Boolean prorate;

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
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Boolean offSession,
      PaymentBehavior paymentBehavior,
      Object plan,
      Boolean prorate,
      ProrationBehavior prorationBehavior,
      Long prorationDate,
      Long quantity,
      Object taxRates) {
    this.billingThresholds = billingThresholds;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.offSession = offSession;
    this.paymentBehavior = paymentBehavior;
    this.plan = plan;
    this.prorate = prorate;
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

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Boolean offSession;

    private PaymentBehavior paymentBehavior;

    private Object plan;

    private Boolean prorate;

    private ProrationBehavior prorationBehavior;

    private Long prorationDate;

    private Long quantity;

    private Object taxRates;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionItemUpdateParams build() {
      return new SubscriptionItemUpdateParams(
          this.billingThresholds,
          this.expand,
          this.extraParams,
          this.metadata,
          this.offSession,
          this.paymentBehavior,
          this.plan,
          this.prorate,
          this.prorationBehavior,
          this.prorationDate,
          this.quantity,
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
     * See {@link SubscriptionItemUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Indicates if a customer is on or off-session while an invoice payment is attempted. */
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
     * <p>Use {@code pending_if_incomplete} to update the subscription using <a
     * href="https://stripe.com/docs/billing/subscriptions/pending-updates">pending updates</a>.
     * When you use {@code pending_if_incomplete} you can only pass the parameters <a
     * href="https://stripe.com/docs/billing/pending-updates-reference#supported-attributes">supported
     * by pending updates</a>.
     *
     * <p>Use {@code error_if_incomplete} if you want Stripe to return an HTTP 402 status code if a
     * subscription's first invoice cannot be paid. For example, if a payment method requires 3DS
     * authentication due to SCA regulation and further user action is needed, this parameter does
     * not create a subscription and returns an error instead. This was the default behavior for API
     * versions prior to 2019-03-14. See the <a
     * href="https://stripe.com/docs/upgrades#2019-03-14">changelog</a> to learn more.
     */
    public Builder setPaymentBehavior(PaymentBehavior paymentBehavior) {
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
     * This field has been renamed to {@code proration_behavior}. {@code prorate=true} can be
     * replaced with {@code proration_behavior=create_prorations} and {@code prorate=false} can be
     * replaced with {@code proration_behavior=none}.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
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
