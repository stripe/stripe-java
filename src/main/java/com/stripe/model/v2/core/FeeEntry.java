// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A FeeEntry is the atomic, append-only record of an assessed fee. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FeeEntry extends StripeObject implements HasId {
  /** The fee amount. */
  @SerializedName("amount")
  Amount amount;

  /** The entity that assessed this fee. */
  @SerializedName("charged_by")
  ChargedBy chargedBy;

  /** Timestamp of when this fee entry was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the FeeBatch that collected this fee, if any. */
  @SerializedName("fee_batch")
  String feeBatch;

  /** Unique identifier for the FeeEntry. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The usage event that caused this fee to be assessed. */
  @SerializedName("incurred_by")
  IncurredBy incurredBy;

  /**
   * Has the value {@code true} if the object exists in live mode, or {@code false} if in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.fee_entry}.
   */
  @SerializedName("object")
  String object;

  /**
   * The reason this fee entry was created.
   *
   * <p>One of {@code other}, {@code processing_fee}, {@code refund}, {@code refund_failure}, {@code
   * reprice}, or {@code tier_true_up}.
   */
  @SerializedName("reason")
  String reason;

  /** The tax portion of the fee, if applicable. */
  @SerializedName("tax")
  Tax tax;

  /**
   * The category of this fee.
   *
   * <p>One of {@code application_fee}, {@code passthrough_fee}, or {@code stripe_fee}.
   */
  @SerializedName("type")
  String type;

  /** The entity that assessed this fee. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ChargedBy extends StripeObject {
    /** Details for a fee charged by a Connect application. */
    @SerializedName("application")
    Application application;

    /** Details for a fee charged by the payment network. */
    @SerializedName("network")
    Network network;

    /** Details for a fee charged by Stripe. */
    @SerializedName("stripe")
    Stripe stripe;

    /**
     * The type of entity that charged this fee.
     *
     * <p>One of {@code application}, {@code network}, or {@code stripe}.
     */
    @SerializedName("type")
    String type;

    /** Details for a fee charged by a Connect application. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Application extends StripeObject {
      /** Human-readable product name, e.g. &quot;Card payments - Stripe fee&quot;. */
      @SerializedName("feature_name")
      String featureName;
    }

    /** Details for a fee charged by the payment network. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Network extends StripeObject {
      /** Human-readable product name, e.g. &quot;Card payments - Stripe fee&quot;. */
      @SerializedName("feature_name")
      String featureName;
    }

    /** Details for a fee charged by Stripe. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Stripe extends StripeObject {
      /** Human-readable product name, e.g. &quot;Card payments - Stripe fee&quot;. */
      @SerializedName("feature_name")
      String featureName;
    }
  }

  /** The usage event that caused this fee to be assessed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IncurredBy extends StripeObject implements HasId {
    /** The account that incurred the usage (may differ from the billing account). */
    @SerializedName("account")
    String account;

    /** Public API object id, e.g. ch_xxx. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Timestamp of when the usage event occurred. */
    @SerializedName("occurred_at")
    Instant occurredAt;

    /**
     * Public API object type: &quot;charge&quot;, &quot;payment&quot;, &quot;refund&quot;,
     * &quot;dispute&quot;, &quot;payout&quot;, etc.
     */
    @SerializedName("type")
    String type;
  }

  /** The tax portion of the fee, if applicable. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tax extends StripeObject {
    /** The tax amount calculated for this fee. */
    @SerializedName("amount")
    Amount amount;
  }
}
