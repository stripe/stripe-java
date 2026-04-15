// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Stripe Workflow is a sequence of actions, like Stripe API calls, that are taken in response to
 * an initiating trigger. A trigger can be a Stripe API event, or a manual invocation.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Workflow extends StripeObject implements HasId {
  /** When the Workflow was created. */
  @SerializedName("created")
  Instant created;

  /** Workflow description. */
  @SerializedName("description")
  String description;

  /** The unique ID of the Workflow. */
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
   * <p>Equal to {@code v2.core.workflow}.
   */
  @SerializedName("object")
  String object;

  /**
   * Whether this Workflow is active, inactive, or in some other state. Only active Workflows may be
   * invoked.
   *
   * <p>One of {@code active}, {@code archived}, {@code draft}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** Under what conditions will this Workflow launch. */
  @SerializedName("triggers")
  List<Workflow.Trigger> triggers;

  /**
   * For more details about Trigger, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Trigger extends StripeObject {
    /** The Workflow can be launched when Stripe emits a certain event. */
    @SerializedName("event_trigger")
    EventTrigger eventTrigger;

    /**
     * The Workflow can be launched through a direct call, using either the Dashboard or the Stripe
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

    /** The Workflow can be launched when Stripe emits a certain event. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EventTrigger extends StripeObject {
      /** The Stripe event type that will trigger this Workflow. */
      @SerializedName("type")
      String type;
    }

    /**
     * The Workflow can be launched through a direct call, using either the Dashboard or the Stripe
     * API.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Manual extends StripeObject {
      /** An unprocessed version of the trigger's input parameter schema. */
      @SerializedName("raw_schema")
      String rawSchema;
    }
  }
}
