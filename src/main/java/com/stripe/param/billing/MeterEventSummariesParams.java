// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class MeterEventSummariesParams extends ApiRequestParams {
  /** <strong>Required.</strong> The customer for which to fetch event summaries. */
  @SerializedName("customer")
  String customer;

  /**
   * <strong>Required.</strong> The timestamp from when to stop aggregating meter events
   * (exclusive). Must be aligned with minute boundaries.
   */
  @SerializedName("end_time")
  Long endTime;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * <strong>Required.</strong> The timestamp from when to start aggregating meter events
   * (inclusive). Must be aligned with minute boundaries.
   */
  @SerializedName("start_time")
  Long startTime;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Specifies what granularity to use when generating event summaries. If not specified, a single
   * event summary would be returned for the specified time range. For hourly granularity, start and
   * end times must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily
   * granularity, start and end times must align with UTC day boundaries (00:00 UTC).
   */
  @SerializedName("value_grouping_window")
  ValueGroupingWindow valueGroupingWindow;

  private MeterEventSummariesParams(
      String customer,
      Long endTime,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      Long startTime,
      String startingAfter,
      ValueGroupingWindow valueGroupingWindow) {
    this.customer = customer;
    this.endTime = endTime;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startTime = startTime;
    this.startingAfter = startingAfter;
    this.valueGroupingWindow = valueGroupingWindow;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private Long endTime;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private Long startTime;

    private String startingAfter;

    private ValueGroupingWindow valueGroupingWindow;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterEventSummariesParams build() {
      return new MeterEventSummariesParams(
          this.customer,
          this.endTime,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startTime,
          this.startingAfter,
          this.valueGroupingWindow);
    }

    /** <strong>Required.</strong> The customer for which to fetch event summaries. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * <strong>Required.</strong> The timestamp from when to stop aggregating meter events
     * (exclusive). Must be aligned with minute boundaries.
     */
    public Builder setEndTime(Long endTime) {
      this.endTime = endTime;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MeterEventSummariesParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MeterEventSummariesParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeterEventSummariesParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link MeterEventSummariesParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * <strong>Required.</strong> The timestamp from when to start aggregating meter events
     * (inclusive). Must be aligned with minute boundaries.
     */
    public Builder setStartTime(Long startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Specifies what granularity to use when generating event summaries. If not specified, a single
     * event summary would be returned for the specified time range. For hourly granularity, start
     * and end times must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily
     * granularity, start and end times must align with UTC day boundaries (00:00 UTC).
     */
    public Builder setValueGroupingWindow(
        MeterEventSummariesParams.ValueGroupingWindow valueGroupingWindow) {
      this.valueGroupingWindow = valueGroupingWindow;
      return this;
    }
  }

  public enum ValueGroupingWindow implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("hour")
    HOUR("hour");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ValueGroupingWindow(String value) {
      this.value = value;
    }
  }
}
