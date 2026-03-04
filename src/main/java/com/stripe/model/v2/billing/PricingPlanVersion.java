// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Pricing Plan Version represents a specific configuration of a Pricing Plan at a point in time.
 * Versions are created automatically when you update a Pricing Plan, allowing you to track changes
 * and manage which version is active for new subscriptions. Each version has a start date and
 * optionally an end date if it has been superseded.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanVersion extends StripeObject implements HasId {
  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** The timestamp when this version became inactive. Null if it's the latest version. */
  @SerializedName("end_date")
  Instant endDate;

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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.pricing_plan_version}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the PricingPlan this version belongs to. */
  @SerializedName("pricing_plan")
  String pricingPlan;

  /** The timestamp when this version became active. */
  @SerializedName("start_date")
  Instant startDate;
}
