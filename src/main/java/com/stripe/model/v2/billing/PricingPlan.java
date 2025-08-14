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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PricingPlan extends StripeObject implements HasId {
  /** Whether the PricingPlan is active. */
  @SerializedName("active")
  Boolean active;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** The currency of the PricingPlan. */
  @SerializedName("currency")
  String currency;

  /** A description for pricing plan subscription. Maximum length of 500 characters. */
  @SerializedName("description")
  String description;

  /** Display name of the PricingPlan. */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the PricingPlan. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the latest version of the PricingPlan. */
  @SerializedName("latest_version")
  String latestVersion;

  /** The ID of the live version of the PricingPlan. */
  @SerializedName("live_version")
  String liveVersion;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /** Set of key-value pairs that you can attach to an object. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.pricing_plan}.
   */
  @SerializedName("object")
  String object;

  /**
   * The Stripe Tax tax behavior - whether the PricingPlan is inclusive or exclusive of tax.
   *
   * <p>One of {@code exclusive}, or {@code inclusive}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;
}
