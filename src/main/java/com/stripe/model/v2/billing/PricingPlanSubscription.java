// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Pricing Plan Subscription represents a customer's active subscription to a Pricing Plan. It
 * tracks both the servicing status (whether the customer is receiving service) and collection
 * status (whether payments are current). Subscriptions are created through Billing Intents and bill
 * according to the associated Billing Cadence.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanSubscription extends StripeObject implements HasId {
  /** The ID of the Billing Cadence this subscription is billed on. */
  @SerializedName("billing_cadence")
  String billingCadence;

  /**
   * Details about why the subscription was canceled, if applicable. Includes system-generated
   * reason.
   */
  @SerializedName("cancellation_details")
  CancellationDetails cancellationDetails;

  /**
   * Current collection status of this subscription.
   *
   * <p>One of {@code awaiting_customer_action}, {@code current}, {@code past_due}, {@code paused},
   * or {@code unpaid}.
   */
  @SerializedName("collection_status")
  String collectionStatus;

  /** Timestamps for collection status transitions. */
  @SerializedName("collection_status_transitions")
  CollectionStatusTransitions collectionStatusTransitions;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Details about Discounts applied to this subscription. */
  @SerializedName("discount_details")
  List<PricingPlanSubscription.DiscountDetail> discountDetails;

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
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.pricing_plan_subscription}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the Pricing Plan for this subscription. */
  @SerializedName("pricing_plan")
  String pricingPlan;

  /**
   * Pricing plan component details for the subscription, populated when
   * pricing_plan_component_details is included.
   */
  @SerializedName("pricing_plan_component_details")
  List<PricingPlanSubscription.PricingPlanComponentDetail> pricingPlanComponentDetails;

  /** The ID of the Pricing Plan Version for this subscription. */
  @SerializedName("pricing_plan_version")
  String pricingPlanVersion;

  /**
   * Current servicing status of this subscription.
   *
   * <p>One of {@code active}, {@code canceled}, {@code paused}, or {@code pending}.
   */
  @SerializedName("servicing_status")
  String servicingStatus;

  /** Timestamps for servicing status transitions. */
  @SerializedName("servicing_status_transitions")
  ServicingStatusTransitions servicingStatusTransitions;

  /** The ID of the Test Clock of the associated Billing Cadence, if any. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * Details about why the subscription was canceled, if applicable. Includes system-generated
   * reason.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CancellationDetails extends StripeObject {
    /**
     * Additional comments about why the user canceled the subscription, if the subscription was
     * canceled explicitly by the user.
     */
    @SerializedName("comment")
    String comment;

    /**
     * The customer submitted reason for why they canceled, if the subscription was canceled
     * explicitly by the user.
     *
     * <p>One of {@code customer_service}, {@code low_quality}, {@code missing_features}, {@code
     * other}, {@code switched_service}, {@code too_complex}, {@code too_expensive}, or {@code
     * unused}.
     */
    @SerializedName("feedback")
    String feedback;

    /**
     * System-generated reason for cancellation.
     *
     * <p>Equal to {@code cancellation_requested}.
     */
    @SerializedName("reason")
    String reason;
  }

  /** Timestamps for collection status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectionStatusTransitions extends StripeObject {
    /** When the collection status transitioned to awaiting customer action. */
    @SerializedName("awaiting_customer_action_at")
    String awaitingCustomerActionAt;

    /** When the collection status transitioned to current. */
    @SerializedName("current_at")
    String currentAt;

    /** When the collection status transitioned to past due. */
    @SerializedName("past_due_at")
    String pastDueAt;

    /** When the collection status transitioned to paused. */
    @SerializedName("paused_at")
    String pausedAt;

    /** When the collection status transitioned to unpaid. */
    @SerializedName("unpaid_at")
    String unpaidAt;
  }

  /**
   * For more details about DiscountDetail, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DiscountDetail extends StripeObject {
    /** The ID of the Discount. */
    @SerializedName("discount")
    String discount;

    /** The time at which the Discount ends, if applicable. */
    @SerializedName("end")
    Instant end;

    /** The ID of the PromotionCode, if applicable. */
    @SerializedName("promotion_code")
    String promotionCode;

    /** The source of the Discount. */
    @SerializedName("source")
    Source source;

    /** The time at which the Discount starts. */
    @SerializedName("start")
    Instant start;

    /** The source of the Discount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Source extends StripeObject {
      /** The ID of the Coupon. */
      @SerializedName("coupon")
      String coupon;

      /**
       * Type of the Discount source.
       *
       * <p>Equal to {@code coupon}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about PricingPlanComponentDetail, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingPlanComponentDetail extends StripeObject {
    /** License fee details, present when type is license_fee_details. */
    @SerializedName("license_fee_details")
    LicenseFeeDetails licenseFeeDetails;

    /** The ID of the Pricing Plan Component. */
    @SerializedName("pricing_plan_component")
    String pricingPlanComponent;

    /** Rate card details, present when type is rate_card_details. */
    @SerializedName("rate_card_details")
    RateCardDetails rateCardDetails;

    /** Recurring credit grant details, present when type is recurring_credit_grant_details. */
    @SerializedName("recurring_credit_grant_details")
    RecurringCreditGrantDetails recurringCreditGrantDetails;

    /**
     * The type of component details included.
     *
     * <p>One of {@code license_fee_details}, {@code rate_card_details}, or {@code
     * recurring_credit_grant_details}.
     */
    @SerializedName("type")
    String type;

    /** License fee details, present when type is license_fee_details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LicenseFeeDetails extends StripeObject {
      /** Three-letter ISO currency code, in lowercase. */
      @SerializedName("currency")
      String currency;

      /** A customer-facing name for the license fee. */
      @SerializedName("display_name")
      String displayName;

      /** The ID of the License Fee. */
      @SerializedName("license_fee")
      String licenseFee;

      /** The ID of the License Fee Version. */
      @SerializedName("license_fee_version")
      String licenseFeeVersion;

      /** Quantity of the license fee on the subscription. */
      @SerializedName("quantity")
      Long quantity;

      /** The service cycle configuration. */
      @SerializedName("service_cycle")
      ServiceCycle serviceCycle;

      /**
       * Defines whether the tiering price should be graduated or volume-based.
       *
       * <p>One of {@code graduated}, or {@code volume}.
       */
      @SerializedName("tiering_mode")
      String tieringMode;

      /** Each element represents a pricing tier. */
      @SerializedName("tiers")
      List<PricingPlanSubscription.PricingPlanComponentDetail.LicenseFeeDetails.Tier> tiers;

      /**
       * Apply a transformation to the reported usage or set quantity before computing the amount
       * billed.
       */
      @SerializedName("transform_quantity")
      TransformQuantity transformQuantity;

      /**
       * The per-unit amount to be charged, represented as a decimal string in minor currency units
       * with at most 12 decimal places.
       */
      @SerializedName("unit_amount")
      String unitAmount;

      /**
       * The unit label from the licensed item, used for display purposes (e.g. &quot;seat&quot;,
       * &quot;environment&quot;).
       */
      @SerializedName("unit_label")
      String unitLabel;

      /** The service cycle configuration. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ServiceCycle extends StripeObject {
        /**
         * The interval for assessing service.
         *
         * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The length of the interval for assessing service. For example, set this to 3 and {@code
         * interval} to {@code "month"} in order to specify quarterly service.
         */
        @SerializedName("interval_count")
        Long intervalCount;
      }

      /**
       * For more details about Tier, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tier extends StripeObject {
        /**
         * Price for the entire tier, represented as a decimal string in minor currency units with
         * at most 12 decimal places.
         */
        @SerializedName("flat_amount")
        String flatAmount;

        /**
         * Per-unit price for units included in this tier, represented as a decimal string in minor
         * currency units with at most 12 decimal places.
         */
        @SerializedName("unit_amount")
        String unitAmount;

        /**
         * Up to and including this quantity will be contained in the tier. Only one of {@code
         * up_to_decimal} and {@code up_to_inf} may be set.
         */
        @SerializedName("up_to_decimal")
        BigDecimal upToDecimal;

        /**
         * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may
         * be set.
         */
        @SerializedName("up_to_inf")
        String upToInf;
      }

      /**
       * Apply a transformation to the reported usage or set quantity before computing the amount
       * billed.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TransformQuantity extends StripeObject {
        /** Divide usage by this number. */
        @SerializedName("divide_by")
        @JsonAdapter(StringInt64TypeAdapter.class)
        Long divideBy;

        /**
         * After division, round the result up or down.
         *
         * <p>One of {@code down}, or {@code up}.
         */
        @SerializedName("round")
        String round;
      }
    }

    /** Rate card details, present when type is rate_card_details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RateCardDetails extends StripeObject {
      /** Three-letter ISO currency code, in lowercase. */
      @SerializedName("currency")
      String currency;

      /** A customer-facing name for the rate card. */
      @SerializedName("display_name")
      String displayName;

      /** The ID of the Rate Card. */
      @SerializedName("rate_card")
      String rateCard;

      /** The ID of the Rate Card Version. */
      @SerializedName("rate_card_version")
      String rateCardVersion;

      /** The service cycle configuration. */
      @SerializedName("service_cycle")
      ServiceCycle serviceCycle;

      /**
       * Whether the rates are inclusive or exclusive of tax.
       *
       * <p>One of {@code exclusive}, or {@code inclusive}.
       */
      @SerializedName("tax_behavior")
      String taxBehavior;

      /** The service cycle configuration. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ServiceCycle extends StripeObject {
        /**
         * The interval for assessing service.
         *
         * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The length of the interval for assessing service. For example, set this to 3 and {@code
         * interval} to {@code "month"} in order to specify quarterly service.
         */
        @SerializedName("interval_count")
        Long intervalCount;
      }
    }

    /** Recurring credit grant details, present when type is recurring_credit_grant_details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RecurringCreditGrantDetails extends StripeObject {
      /** Credit grant details, present when type is CREDIT_GRANT. */
      @SerializedName("credit_grant_details")
      CreditGrantDetails creditGrantDetails;

      /** Credit grant per tenant details, present when type is CREDIT_GRANT_PER_TENANT. */
      @SerializedName("credit_grant_per_tenant_details")
      CreditGrantPerTenantDetails creditGrantPerTenantDetails;

      /** The ID of the Recurring Credit Grant. */
      @SerializedName("recurring_credit_grant")
      String recurringCreditGrant;

      /** The service cycle configuration. */
      @SerializedName("service_cycle")
      ServiceCycle serviceCycle;

      /**
       * The type of the recurring credit grant.
       *
       * <p>One of {@code credit_grant}, or {@code credit_grant_per_tenant}.
       */
      @SerializedName("type")
      String type;

      /** Credit grant details, present when type is CREDIT_GRANT. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CreditGrantDetails extends StripeObject {
        /** The amount of the credit grant. */
        @SerializedName("amount")
        com.stripe.model.v2.billing.PricingPlanSubscription.PricingPlanComponentDetail
                .RecurringCreditGrantDetails.CreditGrantDetails.Amount
            amount;

        /** Defines the scope where the credit grant is applicable. */
        @SerializedName("applicability_config")
        ApplicabilityConfig applicabilityConfig;

        /** The expiry configuration for the credit grant. */
        @SerializedName("expiry_config")
        ExpiryConfig expiryConfig;

        /** The amount of the credit grant. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Amount extends StripeObject {
          /**
           * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
           * custom_pricing_unit}.
           */
          @SerializedName("custom_pricing_unit")
          com.stripe.model.v2.billing.PricingPlanSubscription.PricingPlanComponentDetail
                  .RecurringCreditGrantDetails.CreditGrantDetails.Amount.CustomPricingUnit
              customPricingUnit;

          /**
           * The monetary amount of the credit grant. Required if {@code type} is {@code monetary}.
           */
          @SerializedName("monetary")
          com.stripe.v2.Amount monetary;

          /**
           * The type of the credit grant amount. We currently support {@code monetary} and {@code
           * custom_pricing_unit} billing credits.
           *
           * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
           */
          @SerializedName("type")
          String type;

          /**
           * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
           * custom_pricing_unit}.
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomPricingUnit extends StripeObject implements HasId {
            /** The Custom Pricing Unit object. */
            @SerializedName("custom_pricing_unit_details")
            com.stripe.model.v2.billing.CustomPricingUnit customPricingUnitDetails;

            /** The id of the custom pricing unit. */
            @Getter(onMethod_ = {@Override})
            @SerializedName("id")
            String id;

            /** The value of the credit grant, decimal value represented as a string. */
            @SerializedName("value")
            BigDecimal value;
          }
        }

        /** Defines the scope where the credit grant is applicable. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplicabilityConfig extends StripeObject {
          /** The applicability scope of the credit grant. */
          @SerializedName("scope")
          Scope scope;

          /** The applicability scope of the credit grant. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Scope extends StripeObject {
            /** The billable items to apply the credit grant to. */
            @SerializedName("billable_items")
            List<String> billableItems;

            /**
             * The price type that credit grants can apply to. We currently only support the {@code
             * metered} price type. This will apply to metered prices and rate cards. Cannot be used
             * in combination with {@code billable_items}.
             *
             * <p>Equal to {@code metered}.
             */
            @SerializedName("price_type")
            String priceType;
          }
        }

        /** The expiry configuration for the credit grant. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ExpiryConfig extends StripeObject {
          /**
           * The type of the expiry configuration. We currently support {@code
           * end_of_service_period}.
           *
           * <p>Equal to {@code end_of_service_period}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** Credit grant per tenant details, present when type is CREDIT_GRANT_PER_TENANT. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CreditGrantPerTenantDetails extends StripeObject {
        /** The amount of the credit grant. */
        @SerializedName("amount")
        com.stripe.model.v2.billing.PricingPlanSubscription.PricingPlanComponentDetail
                .RecurringCreditGrantDetails.CreditGrantPerTenantDetails.Amount
            amount;

        /** Defines the scope where the credit grant is applicable. */
        @SerializedName("applicability_config")
        ApplicabilityConfig applicabilityConfig;

        /** The expiry configuration for the credit grant. */
        @SerializedName("expiry_config")
        ExpiryConfig expiryConfig;

        /** The amount of the credit grant. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Amount extends StripeObject {
          /**
           * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
           * custom_pricing_unit}.
           */
          @SerializedName("custom_pricing_unit")
          com.stripe.model.v2.billing.PricingPlanSubscription.PricingPlanComponentDetail
                  .RecurringCreditGrantDetails.CreditGrantPerTenantDetails.Amount.CustomPricingUnit
              customPricingUnit;

          /**
           * The monetary amount of the credit grant. Required if {@code type} is {@code monetary}.
           */
          @SerializedName("monetary")
          com.stripe.v2.Amount monetary;

          /**
           * The type of the credit grant amount. We currently support {@code monetary} and {@code
           * custom_pricing_unit} billing credits.
           *
           * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
           */
          @SerializedName("type")
          String type;

          /**
           * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
           * custom_pricing_unit}.
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomPricingUnit extends StripeObject implements HasId {
            /** The Custom Pricing Unit object. */
            @SerializedName("custom_pricing_unit_details")
            com.stripe.model.v2.billing.CustomPricingUnit customPricingUnitDetails;

            /** The id of the custom pricing unit. */
            @Getter(onMethod_ = {@Override})
            @SerializedName("id")
            String id;

            /** The value of the credit grant, decimal value represented as a string. */
            @SerializedName("value")
            BigDecimal value;
          }
        }

        /** Defines the scope where the credit grant is applicable. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplicabilityConfig extends StripeObject {
          /** The applicability scope of the credit grant. */
          @SerializedName("scope")
          Scope scope;

          /** The applicability scope of the credit grant. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Scope extends StripeObject {
            /** The billable items to apply the credit grant to. */
            @SerializedName("billable_items")
            List<String> billableItems;

            /**
             * The price type that credit grants can apply to. We currently only support the {@code
             * metered} price type. This will apply to metered prices and rate cards. Cannot be used
             * in combination with {@code billable_items}.
             *
             * <p>Equal to {@code metered}.
             */
            @SerializedName("price_type")
            String priceType;
          }
        }

        /** The expiry configuration for the credit grant. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ExpiryConfig extends StripeObject {
          /**
           * The type of the expiry configuration. We currently support {@code
           * end_of_service_period}.
           *
           * <p>Equal to {@code end_of_service_period}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** The service cycle configuration. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ServiceCycle extends StripeObject {
        /**
         * The interval for assessing service.
         *
         * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The length of the interval for assessing service. For example, set this to 3 and {@code
         * interval} to {@code "month"} in order to specify quarterly service.
         */
        @SerializedName("interval_count")
        Long intervalCount;
      }
    }
  }

  /** Timestamps for servicing status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ServicingStatusTransitions extends StripeObject {
    /** When the servicing status transitioned to activated. */
    @SerializedName("activated_at")
    String activatedAt;

    /** When the servicing status transitioned to canceled. */
    @SerializedName("canceled_at")
    String canceledAt;

    /** When the servicing status transitioned to paused. */
    @SerializedName("paused_at")
    String pausedAt;

    /** When the servicing is scheduled to transition to activate. */
    @SerializedName("will_activate_at")
    String willActivateAt;

    /** When the servicing is scheduled to cancel. */
    @SerializedName("will_cancel_at")
    String willCancelAt;
  }
}
