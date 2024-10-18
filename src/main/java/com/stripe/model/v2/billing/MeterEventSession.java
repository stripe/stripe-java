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
public class MeterEventSession extends StripeObject implements HasId {
  /**
   * The authentication token for this session. Use this token when calling the high-throughput
   * meter event API.
   */
  @SerializedName("authentication_token")
  String authenticationToken;

  /** The creation time of this session. */
  @SerializedName("created")
  Instant created;

  /** The time at which this session will expire. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** The unique id of this auth session. */
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
   * <p>Equal to {@code v2.billing.meter_event_session}.
   */
  @SerializedName("object")
  String object;
}
