// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

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
public class Event extends StripeObject implements HasId {
  /** Authentication context needed to fetch the event or related object. */
  @SerializedName("context")
  String context;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the event. */
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
   * <p>Equal to {@code v2.core.event}.
   */
  @SerializedName("object")
  String object;

  /** Reason for the event. */
  @SerializedName("reason")
  Reason reason;

  /** The type of the event. */
  @SerializedName("type")
  String type;

  /**
   * For more details about Reason, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reason extends StripeObject {
    /** Information on the API request that instigated the event. */
    @SerializedName("request")
    Request request;

    /**
     * Event reason type.
     *
     * <p>Equal to {@code request}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Request, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Request extends StripeObject implements HasId {
      /** ID of the API request that caused the event. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The idempotency key transmitted during the request. */
      @SerializedName("idempotency_key")
      String idempotencyKey;
    }
  }
}
