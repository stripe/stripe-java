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
public class RateCardSubscription extends StripeObject implements HasId {
  /** The ID of the billing Cadence. */
  @SerializedName("billing_cadence")
  String billingCadence;

  /**
   * The payment status of a RateCardSubscription.
   *
   * <p>One of {@code awaiting_customer_action}, {@code current}, {@code past_due}, {@code paused},
   * or {@code unpaid}.
   */
  @SerializedName("collection_status")
  String collectionStatus;

  /** The collection status transitions of the RateCardSubscription. */
  @SerializedName("collection_status_transitions")
  CollectionStatusTransitions collectionStatusTransitions;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the RateCardSubscription. */
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

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.rate_card_subscription}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the RateCard. */
  @SerializedName("rate_card")
  String rateCard;

  /** The ID of the RateCardVersion. */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  /**
   * The servicing status of a RateCardSubscription.
   *
   * <p>One of {@code active}, {@code canceled}, {@code paused}, or {@code pending}.
   */
  @SerializedName("servicing_status")
  String servicingStatus;

  /** The servicing status transitions of the RateCardSubscription. */
  @SerializedName("servicing_status_transitions")
  ServicingStatusTransitions servicingStatusTransitions;

  /** The ID of the Test Clock, if any. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * For more details about CollectionStatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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
   * For more details about ServicingStatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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
  }
}
