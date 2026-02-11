// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A rate card custom pricing unit overage rate defines the conversion rate from a custom pricing
 * unit to fiat currency when credits are exhausted. This enables automatic overage charges at a
 * configurable per-unit rate.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RateCardCustomPricingUnitOverageRate extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the custom pricing unit this overage rate applies to. */
  @SerializedName("custom_pricing_unit")
  String customPricingUnit;

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
   * <p>Equal to {@code v2.billing.rate_card_custom_pricing_unit_overage_rate}.
   */
  @SerializedName("object")
  String object;

  /**
   * A one-time item represents a product that can be charged as a one-time line item, used for
   * overage charges when custom pricing unit credits are exhausted.
   */
  @SerializedName("one_time_item")
  OneTimeItem oneTimeItem;

  /** The ID of the Rate Card this overage rate belongs to. */
  @SerializedName("rate_card")
  String rateCard;

  /** The ID of the Rate Card Version this overage rate was created on. */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  /**
   * The per-unit amount to charge for overages, represented as a decimal string in minor currency
   * units with at most 12 decimal places.
   */
  @SerializedName("unit_amount")
  String unitAmount;
}
