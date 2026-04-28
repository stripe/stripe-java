// File generated from our OpenAPI spec
package com.stripe.model.v2.data.analytics;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The result of a metric query. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MetricQueryResult extends StripeObject implements HasId {
  /** The timestamp at which this metric query result was created. */
  @SerializedName("created")
  Instant created;

  /** An array of timeseries data rows. */
  @SerializedName("data")
  List<MetricQueryResult.Data> data;

  /** The unique identifier of this metric query result. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this query was run in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** Pagination future-proofing: URL to fetch the next page; always null for now. */
  @SerializedName("next_page_url")
  String nextPageUrl;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.data.analytics.metric_query_result}.
   */
  @SerializedName("object")
  String object;

  /** Pagination future-proofing: URL to fetch the previous page; always null for now. */
  @SerializedName("previous_page_url")
  String previousPageUrl;

  /** A timestamp representing the freshness of the data this metric is aggregated from. */
  @SerializedName("refreshed_at")
  Instant refreshedAt;

  /**
   * For more details about Data, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Data extends StripeObject implements HasId {
    /** A hash of dimension type to dimension instance, if group_by was specified. */
    @SerializedName("dimensions")
    Map<String, String> dimensions;

    /** A unique identifier for this row. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Array of metric values returned from this query. */
    @SerializedName("results")
    List<MetricQueryResult.Data.Result> results;

    /** Timestamp denoting the start of this time bucket. */
    @SerializedName("timestamp")
    Instant timestamp;

    /**
     * For more details about Result, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Result extends StripeObject {
      /** If this is a monetary metric, the currency it is returned in. Otherwise null. */
      @SerializedName("currency")
      String currency;

      /** The Gen6 ID of this metric. */
      @SerializedName("metric")
      String metric;

      /** The common name of this metric. */
      @SerializedName("name")
      String name;

      /** The numeric value of this metric. */
      @SerializedName("value")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long value;
    }
  }
}
