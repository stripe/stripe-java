// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterUsageRow extends StripeObject implements HasId {
  /** Timestamp indicating the end of the bucket. Measured in seconds since the Unix epoch. */
  @SerializedName("bucket_end_time")
  Long bucketEndTime;

  /** Timestamp indicating the start of the bucket. Measured in seconds since the Unix epoch. */
  @SerializedName("bucket_start_time")
  Long bucketStartTime;

  /** The aggregated meter usage value for the specified bucket. */
  @SerializedName("bucket_value")
  BigDecimal bucketValue;

  /** A set of key-value pairs representing the dimensions of the meter usage. */
  @SerializedName("dimensions")
  Map<String, String> dimensions;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The unique identifier for the meter. Null if no meters were provided and usage was aggregated
   * across all meters.
   */
  @SerializedName("meter_id")
  String meterId;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_usage_row}.
   */
  @SerializedName("object")
  String object;
}
