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
public class PricingPlanSubscription extends StripeObject implements HasId {
  /** The ID of the Cadence this subscription is billed on. */
  @SerializedName("billing_cadence")
  String billingCadence;

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

  /** Unique identifier for the PricingPlanSubscription. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Set of key-value pairs that you can attach to an object. */
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

  /** The ID of the PricingPlan for this subscription. */
  @SerializedName("pricing_plan")
  String pricingPlan;

  /** The ID of the PricingPlanVersion for this subscription. */
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

  /** The ID of the TestClock of the associated Cadence, if any. */
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
