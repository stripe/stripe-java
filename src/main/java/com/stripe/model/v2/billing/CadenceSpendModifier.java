// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Spend Modifier changes how spend is computed when billing for specific cadence. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CadenceSpendModifier extends StripeObject implements HasId {
  /** The ID of the Billing Cadence this spend modifier is associated with. */
  @SerializedName("billing_cadence")
  String billingCadence;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

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

  /** Max invoice spend details. Present if type is {@code max_billing_period_spend}. */
  @SerializedName("max_billing_period_spend")
  MaxBillingPeriodSpend maxBillingPeriodSpend;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.cadence_spend_modifier}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of the spend modifier.
   *
   * <p>Equal to {@code max_billing_period_spend}.
   */
  @SerializedName("type")
  String type;

  /** Max invoice spend details. Present if type is {@code max_billing_period_spend}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MaxBillingPeriodSpend extends StripeObject {
    /** The billing alert associated with the maximum spend threshold. */
    @SerializedName("alert")
    String alert;

    /** The maximum amount of invoice spend. */
    @SerializedName("amount")
    Amount amount;

    /** The configuration for the overage rate for the custom pricing unit. */
    @SerializedName("custom_pricing_unit_overage_rate")
    CustomPricingUnitOverageRate customPricingUnitOverageRate;

    /** The timestamp from which this spend modifier is effective. */
    @SerializedName("effective_from")
    Instant effectiveFrom;

    /**
     * The timestamp until which this spend modifier is effective. If not set, the modifier is
     * effective indefinitely.
     */
    @SerializedName("effective_until")
    Instant effectiveUntil;

    /** The maximum amount of invoice spend. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /** The custom pricing unit amount. Present if type is {@code custom_pricing_unit}. */
      @SerializedName("custom_pricing_unit")
      CustomPricingUnit customPricingUnit;

      /**
       * The type of the spend modifier amount.
       *
       * <p>Equal to {@code custom_pricing_unit}.
       */
      @SerializedName("type")
      String type;

      /** The custom pricing unit amount. Present if type is {@code custom_pricing_unit}. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit extends StripeObject {
        /** The decimal value of custom pricing units, represented as a string. */
        @SerializedName("value")
        String value;
      }
    }

    /** The configuration for the overage rate for the custom pricing unit. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomPricingUnitOverageRate extends StripeObject implements HasId {
      /** ID of the custom pricing unit overage rate. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;
    }
  }
}
