// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IntentAction extends StripeObject implements HasId {
  /** Details for an apply action. */
  @SerializedName("apply")
  Apply apply;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Details for a deactivate action. */
  @SerializedName("deactivate")
  Deactivate deactivate;

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

  /** Details for a modify action. */
  @SerializedName("modify")
  Modify modify;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.intent_action}.
   */
  @SerializedName("object")
  String object;

  /** Details for a remove action. */
  @SerializedName("remove")
  Remove remove;

  /** Details for a subscribe action. */
  @SerializedName("subscribe")
  Subscribe subscribe;

  /**
   * Type of the Billing Intent Action.
   *
   * <p>One of {@code apply}, {@code deactivate}, {@code modify}, {@code remove}, or {@code
   * subscribe}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about Apply, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Apply extends StripeObject {
    /** Details for applying a discount rule to future invoices. */
    @SerializedName("invoice_discount_rule")
    InvoiceDiscountRule invoiceDiscountRule;

    /**
     * Type of the apply action details.
     *
     * <p>Equal to {@code invoice_discount_rule}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about InvoiceDiscountRule, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceDiscountRule extends StripeObject {
      /**
       * The entity that the discount rule applies to, for example, the Billing Cadence.
       *
       * <p>Equal to {@code cadence}.
       */
      @SerializedName("applies_to")
      String appliesTo;

      /**
       * The ID of the created discount rule. This is only present once the Billing Intent is
       * committed and the discount rule is created.
       */
      @SerializedName("invoice_discount_rule")
      String invoiceDiscountRule;

      /** Configuration for percentage off discount. */
      @SerializedName("percent_off")
      PercentOff percentOff;

      /**
       * Type of the discount rule.
       *
       * <p>Equal to {@code percent_off}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about PercentOff, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PercentOff extends StripeObject {
        /** The maximum number of times this discount can be applied for this Billing Cadence. */
        @SerializedName("maximum_applications")
        MaximumApplications maximumApplications;

        /**
         * Percent that will be taken off of the amount. For example, percent_off of 50.0 will make
         * $100 amount $50 instead.
         */
        @SerializedName("percent_off")
        String percentOff;

        /**
         * For more details about MaximumApplications, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MaximumApplications extends StripeObject {
          /**
           * The type of maximum applications configuration.
           *
           * <p>Equal to {@code indefinite}.
           */
          @SerializedName("type")
          String type;
        }
      }
    }
  }

  /**
   * For more details about Deactivate, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Deactivate extends StripeObject {
    /** Configuration for the billing details. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * When the deactivate action will take effect. If not specified, the default behavior is
     * on_reserve.
     */
    @SerializedName("effective_at")
    EffectiveAt effectiveAt;

    /** Details for deactivating a Pricing Plan Subscription. */
    @SerializedName("pricing_plan_subscription_details")
    PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

    /**
     * Type of the action details.
     *
     * <p>One of {@code pricing_plan_subscription_details}, or {@code v1_subscription_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about BillingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /**
       * This controls the proration adjustment for the partial servicing period.
       *
       * <p>One of {@code no_adjustment}, or {@code prorated_adjustment}.
       */
      @SerializedName("proration_behavior")
      String prorationBehavior;
    }

    /**
     * For more details about EffectiveAt, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EffectiveAt extends StripeObject {
      /**
       * The timestamp at which the deactivate action will take effect. Only present if type is
       * timestamp.
       */
      @SerializedName("timestamp")
      Instant timestamp;

      /**
       * When the deactivate action will take effect.
       *
       * <p>One of {@code current_billing_period_start}, {@code on_reserve}, or {@code timestamp}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about PricingPlanSubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PricingPlanSubscriptionDetails extends StripeObject {
      /** ID of the Pricing Plan Subscription to deactivate. */
      @SerializedName("pricing_plan_subscription")
      String pricingPlanSubscription;
    }
  }

  /**
   * For more details about Modify, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Modify extends StripeObject {
    /** Configuration for the billing details. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * When the modify action will take effect. If not specified, the default behavior is
     * on_reserve.
     */
    @SerializedName("effective_at")
    EffectiveAt effectiveAt;

    /** Details for modifying a Pricing Plan Subscription. */
    @SerializedName("pricing_plan_subscription_details")
    PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

    /**
     * Type of the action details.
     *
     * <p>One of {@code pricing_plan_subscription_details}, or {@code v1_subscription_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about BillingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /**
       * This controls the proration adjustment for the partial servicing period.
       *
       * <p>One of {@code no_adjustment}, or {@code prorated_adjustment}.
       */
      @SerializedName("proration_behavior")
      String prorationBehavior;
    }

    /**
     * For more details about EffectiveAt, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EffectiveAt extends StripeObject {
      /**
       * The timestamp at which the modify action will take effect. Only present if type is
       * timestamp.
       */
      @SerializedName("timestamp")
      Instant timestamp;

      /**
       * When the modify action will take effect.
       *
       * <p>One of {@code current_billing_period_start}, {@code on_reserve}, or {@code timestamp}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about PricingPlanSubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PricingPlanSubscriptionDetails extends StripeObject {
      /** New configurations for the components of the Pricing Plan. */
      @SerializedName("component_configurations")
      List<IntentAction.Modify.PricingPlanSubscriptionDetails.ComponentConfiguration>
          componentConfigurations;

      /** ID of the new Pricing Plan. */
      @SerializedName("new_pricing_plan")
      String newPricingPlan;

      /** Version of the Pricing Plan to use. */
      @SerializedName("new_pricing_plan_version")
      String newPricingPlanVersion;

      /** ID of the Pricing Plan Subscription to modify. */
      @SerializedName("pricing_plan_subscription")
      String pricingPlanSubscription;

      /**
       * For more details about ComponentConfiguration, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ComponentConfiguration extends StripeObject {
        /** Lookup key for the pricing plan component. */
        @SerializedName("lookup_key")
        String lookupKey;

        /** ID of the pricing plan component. */
        @SerializedName("pricing_plan_component")
        String pricingPlanComponent;

        /** Quantity of the component to be used. */
        @SerializedName("quantity")
        Integer quantity;
      }
    }
  }

  /**
   * For more details about Remove, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Remove extends StripeObject {
    /** The ID of the discount rule to remove for future invoices. */
    @SerializedName("invoice_discount_rule")
    String invoiceDiscountRule;

    /**
     * Type of the remove action.
     *
     * <p>Equal to {@code invoice_discount_rule}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about Subscribe, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Subscribe extends StripeObject {
    /**
     * Configuration for the billing details. If not specified, see the default behavior for
     * individual attributes.
     */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * When the subscribe action will take effect. If not specified, the default behavior is
     * on_reserve.
     */
    @SerializedName("effective_at")
    EffectiveAt effectiveAt;

    /** Details for subscribing to a Pricing Plan. */
    @SerializedName("pricing_plan_subscription_details")
    PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

    /**
     * Type of the action details.
     *
     * <p>One of {@code pricing_plan_subscription_details}, or {@code v1_subscription_details}.
     */
    @SerializedName("type")
    String type;

    /** Details for subscribing to a V1 subscription. */
    @SerializedName("v1_subscription_details")
    V1SubscriptionDetails v1SubscriptionDetails;

    /**
     * For more details about BillingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /**
       * This controls the proration adjustment for the partial servicing period.
       *
       * <p>One of {@code no_adjustment}, or {@code prorated_adjustment}.
       */
      @SerializedName("proration_behavior")
      String prorationBehavior;
    }

    /**
     * For more details about EffectiveAt, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EffectiveAt extends StripeObject {
      /**
       * The timestamp at which the subscribe action will take effect. Only present if type is
       * timestamp.
       */
      @SerializedName("timestamp")
      Instant timestamp;

      /**
       * When the subscribe action will take effect.
       *
       * <p>One of {@code current_billing_period_start}, {@code on_reserve}, or {@code timestamp}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about PricingPlanSubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PricingPlanSubscriptionDetails extends StripeObject {
      /** Configurations for the components of the Pricing Plan. */
      @SerializedName("component_configurations")
      List<IntentAction.Subscribe.PricingPlanSubscriptionDetails.ComponentConfiguration>
          componentConfigurations;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** ID of the Pricing Plan to subscribe to. */
      @SerializedName("pricing_plan")
      String pricingPlan;

      /**
       * ID of the created Pricing Plan Subscription. This is only present once the Billing Intent
       * is committed and the Pricing Plan Subscription is created.
       */
      @SerializedName("pricing_plan_subscription")
      String pricingPlanSubscription;

      /** Version of the Pricing Plan to use. */
      @SerializedName("pricing_plan_version")
      String pricingPlanVersion;

      /**
       * For more details about ComponentConfiguration, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ComponentConfiguration extends StripeObject {
        /** Lookup key for the pricing plan component. */
        @SerializedName("lookup_key")
        String lookupKey;

        /** ID of the pricing plan component. */
        @SerializedName("pricing_plan_component")
        String pricingPlanComponent;

        /** Quantity of the component to be used. */
        @SerializedName("quantity")
        Integer quantity;
      }
    }

    /**
     * For more details about V1SubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class V1SubscriptionDetails extends StripeObject {
      /**
       * The subscription’s description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      @SerializedName("description")
      String description;

      /** A list of up to 20 subscription items, each with an attached price. */
      @SerializedName("items")
      List<IntentAction.Subscribe.V1SubscriptionDetails.Item> items;

      /**
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * For more details about Item, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Item extends StripeObject {
        /**
         * Set of key-value pairs that you can attach to an object. This can be useful for storing
         * additional information about the object in a structured format.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /** Quantity for this item. If not provided, will default to 1. */
        @SerializedName("quantity")
        Integer quantity;
      }
    }
  }
}
