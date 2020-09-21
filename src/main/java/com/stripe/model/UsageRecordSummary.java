// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsageRecordSummary extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The invoice in which this usage period has been billed for. */
  @SerializedName("invoice")
  String invoice;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code usage_record_summary}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("period")
  Period period;

  /** The ID of the subscription item this summary is describing. */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /** The total usage within this usage period. */
  @SerializedName("total_usage")
  Long totalUsage;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    /**
     * The end date of this usage period. All usage up to and including this point in time is
     * included.
     */
    @SerializedName("end")
    Long end;

    /** The start date of this usage period. All usage after this point in time is included. */
    @SerializedName("start")
    Long start;
  }
}
