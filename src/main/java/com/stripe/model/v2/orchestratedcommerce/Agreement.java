// File generated from our OpenAPI spec
package com.stripe.model.v2.orchestratedcommerce;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Orchestrated Commerce Agreement represents a mutual agreement between a seller and an
 * orchestrator/agent on the Stripe network.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Agreement extends StripeObject implements HasId {
  /** The time at which the agreement was created. */
  @SerializedName("created")
  Instant created;

  /** The unique identifier for the agreement. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The party that initiated the agreement.
   *
   * <p>One of {@code orchestrator}, or {@code seller}.
   */
  @SerializedName("initiated_by")
  String initiatedBy;

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
   * <p>Equal to {@code v2.orchestrated_commerce.agreement}.
   */
  @SerializedName("object")
  String object;

  /** Details about the orchestrator. */
  @SerializedName("orchestrator_details")
  OrchestratorDetails orchestratorDetails;

  /** Details about the seller. */
  @SerializedName("seller_details")
  SellerDetails sellerDetails;

  /**
   * The current status of the agreement.
   *
   * <p>One of {@code confirmed}, {@code initiated}, {@code partially_confirmed}, or {@code
   * terminated}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps of key status transitions for the agreement. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The party that terminated the agreement, if applicable.
   *
   * <p>One of {@code orchestrator}, or {@code seller}.
   */
  @SerializedName("terminated_by")
  String terminatedBy;

  /** Details about the orchestrator. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OrchestratorDetails extends StripeObject {
    /**
     * The name of the orchestrator. This can be the name of the agent or the name of the business.
     */
    @SerializedName("name")
    String name;

    /** The Network ID of the orchestrator. */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;
  }

  /** Details about the seller. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SellerDetails extends StripeObject {
    /** The Network ID of the seller. */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;
  }

  /** Timestamps of key status transitions for the agreement. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time at which the orchestrator confirmed the agreement. */
    @SerializedName("orchestrator_confirmed_at")
    Instant orchestratorConfirmedAt;

    /** The time at which the seller confirmed the agreement. */
    @SerializedName("seller_confirmed_at")
    Instant sellerConfirmedAt;

    /** The time at which the agreement was terminated. */
    @SerializedName("terminated_at")
    Instant terminatedAt;
  }
}
