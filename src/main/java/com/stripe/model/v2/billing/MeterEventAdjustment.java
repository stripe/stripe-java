// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEventAdjustment extends StripeObject implements HasId {
  /** Specifies which event to cancel. */
  @SerializedName("cancel")
  Cancel cancel;

  /** The time the adjustment was created. */
  @SerializedName("created")
  Instant created;

  /** The name of the meter event. Corresponds with the {@code event_name} field on a meter. */
  @SerializedName("event_name")
  String eventName;

  /** The unique id of this meter event adjustment. */
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
   * <p>Equal to {@code billing.meter_event_adjustment}.
   */
  @SerializedName("object")
  String object;

  /**
   * Open Enum. The meter event adjustment’s status.
   *
   * <p>One of {@code complete}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Open Enum. Specifies whether to cancel a single event or a range of events for a time period.
   * Time period cancellation is not supported yet.
   *
   * <p>Equal to {@code cancel}.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cancel extends StripeObject {
    /**
     * Unique identifier for the event. You can only cancel events within 24 hours of Stripe
     * receiving them.
     */
    @SerializedName("identifier")
    String identifier;
  }
}
