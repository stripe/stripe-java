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
public class LicenseFeeSubscription extends StripeObject implements HasId {
  /** The ID of the Billing Cadence. */
  @SerializedName("billing_cadence")
  String billingCadence;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the License Fee. */
  @SerializedName("license_fee")
  String licenseFee;

  /** The ID of the License Fee Version. */
  @SerializedName("license_fee_version")
  String licenseFeeVersion;

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
   * <p>Equal to {@code v2.billing.license_fee_subscription}.
   */
  @SerializedName("object")
  String object;

  /** Quantity of the License Fee subscribed to. */
  @SerializedName("quantity")
  Integer quantity;

  /** The ID of the Test Clock, if any. */
  @SerializedName("test_clock")
  String testClock;
}
