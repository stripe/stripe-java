// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEventV2 extends StripeObject {
  /** The creation time of this meter event. */
  @SerializedName("created")
  Instant created;

  /** The name of the meter event. Corresponds with the {@code event_name} field on a meter. */
  @SerializedName("event_name")
  String eventName;

  /**
   * A unique identifier for the event. If not provided, one will be generated. We recommend using a
   * globally unique identifier for this. We’ll enforce uniqueness within a rolling 24 hour period.
   */
  @SerializedName("identifier")
  String identifier;

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
   * <p>Equal to {@code billing.meter_event_v2}.
   */
  @SerializedName("object")
  String object;

  /**
   * The payload of the event. This must contain the fields corresponding to a meter’s {@code
   * customer_mapping.event_payload_key} (default is {@code stripe_customer_id}) and {@code
   * value_settings.event_payload_key} (default is {@code value}). Read more about the payload.
   */
  @SerializedName("payload")
  Map<String, String> payload;

  /**
   * The time of the event. Must be within the past 35 calendar days or up to 5 minutes in the
   * future. Defaults to current timestamp if not specified.
   */
  @SerializedName("timestamp")
  Instant timestamp;
}
