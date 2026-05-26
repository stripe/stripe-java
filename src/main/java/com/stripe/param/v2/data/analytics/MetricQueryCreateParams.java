// File generated from our OpenAPI spec
package com.stripe.param.v2.data.analytics;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MetricQueryCreateParams extends ApiRequestParams {
  /** Which currency to return monetary metric results in. */
  @SerializedName("currency")
  String currency;

  /**
   * <strong>Required.</strong> Timestamp denoting the end of the time range to request data for.
   */
  @SerializedName("ends_at")
  Instant endsAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Which dimension values to filter on; keys are dimension names, values are arrays of dimension
   * values to filter on.
   */
  @SerializedName("filters")
  Map<String, Object> filters;

  /** <strong>Required.</strong> The time granularity to aggregate results by. */
  @SerializedName("granularity")
  Granularity granularity;

  /** Which dimension keys to group by; if not specified no grouping is performed. */
  @SerializedName("group_by")
  List<String> groupBy;

  /** The maximum number of rows in the response. */
  @SerializedName("limit")
  Long limit;

  /**
   * <strong>Required.</strong> A list of the metrics to be returned; all metrics must share the
   * same metric namespace.
   */
  @SerializedName("metrics")
  List<MetricQueryCreateParams.Metric> metrics;

  /** Pagination future-proofing: page token for navigating to next/previous batch of rows. */
  @SerializedName("page")
  String page;

  /**
   * <strong>Required.</strong> Timestamp denoting the beginning of the time range to request data
   * for.
   */
  @SerializedName("starts_at")
  Instant startsAt;

  /** The timezone results should be in; defaults to the merchant's timezone. */
  @SerializedName("timezone")
  String timezone;

  private MetricQueryCreateParams(
      String currency,
      Instant endsAt,
      Map<String, Object> extraParams,
      Map<String, Object> filters,
      Granularity granularity,
      List<String> groupBy,
      Long limit,
      List<MetricQueryCreateParams.Metric> metrics,
      String page,
      Instant startsAt,
      String timezone) {
    this.currency = currency;
    this.endsAt = endsAt;
    this.extraParams = extraParams;
    this.filters = filters;
    this.granularity = granularity;
    this.groupBy = groupBy;
    this.limit = limit;
    this.metrics = metrics;
    this.page = page;
    this.startsAt = startsAt;
    this.timezone = timezone;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private Instant endsAt;

    private Map<String, Object> extraParams;

    private Map<String, Object> filters;

    private Granularity granularity;

    private List<String> groupBy;

    private Long limit;

    private List<MetricQueryCreateParams.Metric> metrics;

    private String page;

    private Instant startsAt;

    private String timezone;

    /** Finalize and obtain parameter instance from this builder. */
    public MetricQueryCreateParams build() {
      return new MetricQueryCreateParams(
          this.currency,
          this.endsAt,
          this.extraParams,
          this.filters,
          this.granularity,
          this.groupBy,
          this.limit,
          this.metrics,
          this.page,
          this.startsAt,
          this.timezone);
    }

    /** Which currency to return monetary metric results in. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <strong>Required.</strong> Timestamp denoting the end of the time range to request data for.
     */
    public Builder setEndsAt(Instant endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MetricQueryCreateParams#extraParams} for the field documentation.
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
     * See {@link MetricQueryCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `filters` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * MetricQueryCreateParams#filters} for the field documentation.
     */
    public Builder putFilter(String key, Object value) {
      if (this.filters == null) {
        this.filters = new HashMap<>();
      }
      this.filters.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `filters` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MetricQueryCreateParams#filters} for the field documentation.
     */
    public Builder putAllFilter(Map<String, Object> map) {
      if (this.filters == null) {
        this.filters = new HashMap<>();
      }
      this.filters.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The time granularity to aggregate results by. */
    public Builder setGranularity(MetricQueryCreateParams.Granularity granularity) {
      this.granularity = granularity;
      return this;
    }

    /**
     * Add an element to `groupBy` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MetricQueryCreateParams#groupBy} for the field documentation.
     */
    public Builder addGroupBy(String element) {
      if (this.groupBy == null) {
        this.groupBy = new ArrayList<>();
      }
      this.groupBy.add(element);
      return this;
    }

    /**
     * Add all elements to `groupBy` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * MetricQueryCreateParams#groupBy} for the field documentation.
     */
    public Builder addAllGroupBy(List<String> elements) {
      if (this.groupBy == null) {
        this.groupBy = new ArrayList<>();
      }
      this.groupBy.addAll(elements);
      return this;
    }

    /** The maximum number of rows in the response. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `metrics` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MetricQueryCreateParams#metrics} for the field documentation.
     */
    public Builder addMetric(MetricQueryCreateParams.Metric element) {
      if (this.metrics == null) {
        this.metrics = new ArrayList<>();
      }
      this.metrics.add(element);
      return this;
    }

    /**
     * Add all elements to `metrics` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * MetricQueryCreateParams#metrics} for the field documentation.
     */
    public Builder addAllMetric(List<MetricQueryCreateParams.Metric> elements) {
      if (this.metrics == null) {
        this.metrics = new ArrayList<>();
      }
      this.metrics.addAll(elements);
      return this;
    }

    /** Pagination future-proofing: page token for navigating to next/previous batch of rows. */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }

    /**
     * <strong>Required.</strong> Timestamp denoting the beginning of the time range to request data
     * for.
     */
    public Builder setStartsAt(Instant startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /** The timezone results should be in; defaults to the merchant's timezone. */
    public Builder setTimezone(String timezone) {
      this.timezone = timezone;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Metric {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID for this metric, e.g. metric_61Sud3n5oAGVCWiSr5. */
    @SerializedName("id")
    String id;

    /** The common name for this metric, e.g. revenue.mrr. */
    @SerializedName("name")
    String name;

    private Metric(Map<String, Object> extraParams, String id, String name) {
      this.extraParams = extraParams;
      this.id = id;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public MetricQueryCreateParams.Metric build() {
        return new MetricQueryCreateParams.Metric(this.extraParams, this.id, this.name);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MetricQueryCreateParams.Metric#extraParams} for the field documentation.
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
       * See {@link MetricQueryCreateParams.Metric#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID for this metric, e.g. metric_61Sud3n5oAGVCWiSr5. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The common name for this metric, e.g. revenue.mrr. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }
  }

  public enum Granularity implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("month")
    MONTH("month"),

    @SerializedName("week")
    WEEK("week"),

    @SerializedName("year")
    YEAR("year");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Granularity(String value) {
      this.value = value;
    }
  }
}
