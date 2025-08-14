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
public class RateCardRate extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The custom pricing unit that this rate binds to. */
  @SerializedName("custom_pricing_unit_amount")
  CustomPricingUnitAmount customPricingUnitAmount;

  /** The ID of the RateCardRate. */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The MeteredItem that this rate binds to. */
  @SerializedName("metered_item")
  MeteredItem meteredItem;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.rate_card_rate}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the RateCard it belongs to. */
  @SerializedName("rate_card")
  String rateCard;

  /** The ID of the RateCard version it was created on. */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  /**
   * Defines whether the tiering price should be graduated or volume-based. In volume-based tiering,
   * the maximum quantity within a period determines the per-unit price. In graduated tiering, the
   * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is set.
   *
   * <p>One of {@code graduated}, or {@code volume}.
   */
  @SerializedName("tiering_mode")
  String tieringMode;

  /** Each element represents a pricing tier. Cannot be set if {@code unit_amount} is provided. */
  @SerializedName("tiers")
  List<RateCardRate.Tier> tiers;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount
   * billed.
   */
  @SerializedName("transform_quantity")
  TransformQuantity transformQuantity;

  /**
   * The per-unit amount to be charged, represented as a decimal string in minor currency units with
   * at most 12 decimal places. Cannot be set if {@code tiers} is provided.
   */
  @SerializedName("unit_amount")
  String unitAmount;

  /**
   * For more details about CustomPricingUnitAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomPricingUnitAmount extends StripeObject implements HasId {
    /** The id of the custom pricing unit. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** The unit value for the custom pricing unit, as a string. */
    @SerializedName("value")
    String value;
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
     * Price for the entire tier, represented as a decimal string in minor currency units with at
     * most 12 decimal places.
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
    String upToDecimal;

    /**
     * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may be
     * set.
     */
    @SerializedName("up_to_inf")
    String upToInf;
  }

  /**
   * For more details about TransformQuantity, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformQuantity extends StripeObject {
    /** Divide usage by this number. */
    @SerializedName("divide_by")
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
