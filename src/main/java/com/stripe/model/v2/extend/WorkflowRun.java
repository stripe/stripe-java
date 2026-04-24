// File generated from our OpenAPI spec
package com.stripe.model.v2.extend;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An execution of a Workflow in response to a triggering event. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class WorkflowRun extends StripeObject implements HasId {
  /** When the Workflow Run was created. */
  @SerializedName("created")
  Instant created;

  /** The unique ID of the Workflow Run. */
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
   * <p>Equal to {@code v2.extend.workflow_run}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current Workflow Run execution status.
   *
   * <p>One of {@code failed}, {@code started}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Details about the Workflow Run's status transitions. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Summary information about the Workflow Run's status transitions. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** A record of the trigger that launched this Workflow Run. */
  @SerializedName("trigger")
  Trigger trigger;

  /** The Workflow this Run belongs to. */
  @SerializedName("workflow")
  String workflow;

  /** Details about the Workflow Run's status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details about the Workflow Run's transition into the FAILED state. */
    @SerializedName("failed")
    Failed failed;

    /** Details about the Workflow Run's transition in to the STARTED state. */
    @SerializedName("started")
    Started started;

    /** Details about the Workflow Run's transition into the SUCCEEDED state. */
    @SerializedName("succeeded")
    Succeeded succeeded;

    /** Details about the Workflow Run's transition into the FAILED state. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /** Optional details about the failure result. */
      @SerializedName("error_message")
      String errorMessage;
    }

    /** Details about the Workflow Run's transition in to the STARTED state. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Started extends StripeObject {}

    /** Details about the Workflow Run's transition into the SUCCEEDED state. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Succeeded extends StripeObject {}
  }

  /** Summary information about the Workflow Run's status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** When the Workflow Run failed. */
    @SerializedName("failed_at")
    Instant failedAt;

    /** When the Workflow Run was started. */
    @SerializedName("started_at")
    Instant startedAt;

    /** When the Workflow Run succeeded. */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }

  /** A record of the trigger that launched this Workflow Run. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Trigger extends StripeObject {
    /** The Workflow Run was launched when Stripe emitted a certain event. */
    @SerializedName("event_trigger")
    EventTrigger eventTrigger;

    /**
     * The Workflow Run was launched through a direct call, using either the Dashboard or the Stripe
     * API.
     */
    @SerializedName("manual")
    Manual manual;

    /**
     * Which type of trigger this is.
     *
     * <p>One of {@code event_trigger}, or {@code manual}.
     */
    @SerializedName("type")
    String type;

    /** The Workflow Run was launched when Stripe emitted a certain event. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EventTrigger extends StripeObject implements HasId {
      /** The account that generated the triggering event. */
      @SerializedName("context")
      String context;

      /** The Stripe event that triggered this Run. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The Stripe event type triggered this Run. */
      @SerializedName("type")
      String type;
    }

    /**
     * The Workflow Run was launched through a direct call, using either the Dashboard or the Stripe
     * API.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Manual extends StripeObject {
      /** The input parameters used when launching the Run. */
      @SerializedName("input_parameters")
      Map<String, Object> inputParameters;
    }
  }
}
