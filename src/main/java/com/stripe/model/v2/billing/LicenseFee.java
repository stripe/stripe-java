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
public class LicenseFee extends StripeObject implements HasId {
  /**
   * Whether this LicenseFee is active. Inactive LicenseFees cannot be used in new activations or be
   * modified.
   */
  @SerializedName("active")
  Boolean active;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The currency of this LicenseFee. */
  @SerializedName("currency")
  String currency;

  /**
   * A customer-facing name for the LicenseFee. This name is used in Stripe-hosted products like the
   * Customer Portal and Checkout. It does not show up on Invoices. Maximum length of 250
   * characters.
   */
  @SerializedName("display_name")
  String displayName;

  /** The ID of the LicenseFee. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the LicenseFee's most recently created version. */
  @SerializedName("latest_version")
  String latestVersion;

  /** The LicensedItem that this license fee binds to. */
  @SerializedName("licensed_item")
  LicensedItem licensedItem;

  /**
   * The ID of the version that will be used by all Subscriptions when no specific version is
   * specified.
   */
  @SerializedName("live_version")
  String liveVersion;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * An internal key you can use to search for a particular LicenseFee. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.license_fee}.
   */
  @SerializedName("object")
  String object;

  /**
   * The interval for assessing service.
   *
   * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
   */
  @SerializedName("service_interval")
  String serviceInterval;

  /**
   * The length of the interval for assessing service. For example, set this to 3 and {@code
   * service_interval} to {@code "month"} in order to specify quarterly service.
   */
  @SerializedName("service_interval_count")
  Integer serviceIntervalCount;

  /**
   * The Stripe Tax tax behavior - whether the license fee is inclusive or exclusive of tax.
   *
   * <p>One of {@code exclusive}, or {@code inclusive}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

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
  List<LicenseFee.Tier> tiers;

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
