// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Usage records allow you to report customer usage and metrics to Stripe for metered billing of
 * subscription prices.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/subscriptions/metered-billing">Metered
 * billing</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsageRecord extends StripeObject implements HasId {
  /** Unique identifier for the object. */
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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code usage_record}.
   */
  @SerializedName("object")
  String object;

  /** The usage quantity for the specified date. */
  @SerializedName("quantity")
  Long quantity;

  /** The ID of the subscription item this usage record contains data for. */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /** The timestamp when this usage occurred. */
  @SerializedName("timestamp")
  Long timestamp;
}
