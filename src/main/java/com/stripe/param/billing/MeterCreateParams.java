// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MeterCreateParams extends ApiRequestParams {
  /** Fields that specify how to map a meter event to a customer. */
  @SerializedName("customer_mapping")
  CustomerMapping customerMapping;

  /** <strong>Required.</strong> The default settings to aggregate a meter's events with. */
  @SerializedName("default_aggregation")
  DefaultAggregation defaultAggregation;

  /** <strong>Required.</strong> The meter’s name. Not visible to the customer. */
  @SerializedName("display_name")
  String displayName;

  /**
   * <strong>Required.</strong> The name of the meter event to record usage for. Corresponds with
   * the {@code event_name} field on meter events.
   */
  @SerializedName("event_name")
  String eventName;

  /** The time window which meter events have been pre-aggregated for, if any. */
  @SerializedName("event_time_window")
  EventTimeWindow eventTimeWindow;

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

  /** Fields that specify how to calculate a meter event's value. */
  @SerializedName("value_settings")
  ValueSettings valueSettings;

  private MeterCreateParams(
      CustomerMapping customerMapping,
      DefaultAggregation defaultAggregation,
      String displayName,
      String eventName,
      EventTimeWindow eventTimeWindow,
      List<String> expand,
      Map<String, Object> extraParams,
      ValueSettings valueSettings) {
    this.customerMapping = customerMapping;
    this.defaultAggregation = defaultAggregation;
    this.displayName = displayName;
    this.eventName = eventName;
    this.eventTimeWindow = eventTimeWindow;
    this.expand = expand;
    this.extraParams = extraParams;
    this.valueSettings = valueSettings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CustomerMapping customerMapping;

    private DefaultAggregation defaultAggregation;

    private String displayName;

    private String eventName;

    private EventTimeWindow eventTimeWindow;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private ValueSettings valueSettings;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterCreateParams build() {
      return new MeterCreateParams(
          this.customerMapping,
          this.defaultAggregation,
          this.displayName,
          this.eventName,
          this.eventTimeWindow,
          this.expand,
          this.extraParams,
          this.valueSettings);
    }

    /** Fields that specify how to map a meter event to a customer. */
    public Builder setCustomerMapping(MeterCreateParams.CustomerMapping customerMapping) {
      this.customerMapping = customerMapping;
      return this;
    }

    /** <strong>Required.</strong> The default settings to aggregate a meter's events with. */
    public Builder setDefaultAggregation(MeterCreateParams.DefaultAggregation defaultAggregation) {
      this.defaultAggregation = defaultAggregation;
      return this;
    }

    /** <strong>Required.</strong> The meter’s name. Not visible to the customer. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * <strong>Required.</strong> The name of the meter event to record usage for. Corresponds with
     * the {@code event_name} field on meter events.
     */
    public Builder setEventName(String eventName) {
      this.eventName = eventName;
      return this;
    }

    /** The time window which meter events have been pre-aggregated for, if any. */
    public Builder setEventTimeWindow(MeterCreateParams.EventTimeWindow eventTimeWindow) {
      this.eventTimeWindow = eventTimeWindow;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MeterCreateParams#expand} for the field documentation.
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
     * MeterCreateParams#expand} for the field documentation.
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
     * MeterCreateParams#extraParams} for the field documentation.
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
     * See {@link MeterCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Fields that specify how to calculate a meter event's value. */
    public Builder setValueSettings(MeterCreateParams.ValueSettings valueSettings) {
      this.valueSettings = valueSettings;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerMapping {
    /**
     * <strong>Required.</strong> The key in the meter event payload to use for mapping the event to
     * a customer.
     */
    @SerializedName("event_payload_key")
    String eventPayloadKey;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The method for mapping a meter event to a customer. Must be {@code
     * by_id}.
     */
    @SerializedName("type")
    Type type;

    private CustomerMapping(String eventPayloadKey, Map<String, Object> extraParams, Type type) {
      this.eventPayloadKey = eventPayloadKey;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String eventPayloadKey;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public MeterCreateParams.CustomerMapping build() {
        return new MeterCreateParams.CustomerMapping(
            this.eventPayloadKey, this.extraParams, this.type);
      }

      /**
       * <strong>Required.</strong> The key in the meter event payload to use for mapping the event
       * to a customer.
       */
      public Builder setEventPayloadKey(String eventPayloadKey) {
        this.eventPayloadKey = eventPayloadKey;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeterCreateParams.CustomerMapping#extraParams} for the field documentation.
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
       * See {@link MeterCreateParams.CustomerMapping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The method for mapping a meter event to a customer. Must be
       * {@code by_id}.
       */
      public Builder setType(MeterCreateParams.CustomerMapping.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("by_id")
      BY_ID("by_id");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultAggregation {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Specifies how events are aggregated. Allowed values are {@code
     * count} to count the number of events, {@code sum} to sum each event's value and {@code last}
     * to take the last event's value in the window.
     */
    @SerializedName("formula")
    Formula formula;

    private DefaultAggregation(Map<String, Object> extraParams, Formula formula) {
      this.extraParams = extraParams;
      this.formula = formula;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Formula formula;

      /** Finalize and obtain parameter instance from this builder. */
      public MeterCreateParams.DefaultAggregation build() {
        return new MeterCreateParams.DefaultAggregation(this.extraParams, this.formula);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeterCreateParams.DefaultAggregation#extraParams} for the field documentation.
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
       * See {@link MeterCreateParams.DefaultAggregation#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Specifies how events are aggregated. Allowed values are {@code
       * count} to count the number of events, {@code sum} to sum each event's value and {@code
       * last} to take the last event's value in the window.
       */
      public Builder setFormula(MeterCreateParams.DefaultAggregation.Formula formula) {
        this.formula = formula;
        return this;
      }
    }

    public enum Formula implements ApiRequestParams.EnumParam {
      @SerializedName("count")
      COUNT("count"),

      @SerializedName("last")
      LAST("last"),

      @SerializedName("sum")
      SUM("sum");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Formula(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ValueSettings {
    /**
     * <strong>Required.</strong> The key in the usage event payload to use as the value for this
     * meter. For example, if the event payload contains usage on a {@code bytes_used} field, then
     * set the event_payload_key to &quot;bytes_used&quot;.
     */
    @SerializedName("event_payload_key")
    String eventPayloadKey;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ValueSettings(String eventPayloadKey, Map<String, Object> extraParams) {
      this.eventPayloadKey = eventPayloadKey;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String eventPayloadKey;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public MeterCreateParams.ValueSettings build() {
        return new MeterCreateParams.ValueSettings(this.eventPayloadKey, this.extraParams);
      }

      /**
       * <strong>Required.</strong> The key in the usage event payload to use as the value for this
       * meter. For example, if the event payload contains usage on a {@code bytes_used} field, then
       * set the event_payload_key to &quot;bytes_used&quot;.
       */
      public Builder setEventPayloadKey(String eventPayloadKey) {
        this.eventPayloadKey = eventPayloadKey;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeterCreateParams.ValueSettings#extraParams} for the field documentation.
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
       * See {@link MeterCreateParams.ValueSettings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum EventTimeWindow implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("hour")
    HOUR("hour");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EventTimeWindow(String value) {
      this.value = value;
    }
  }
}
