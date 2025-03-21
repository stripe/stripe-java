// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MeterEventAdjustmentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Specifies which event to cancel. */
  @SerializedName("cancel")
  Cancel cancel;

  /**
   * <strong>Required.</strong> The name of the meter event. Corresponds with the {@code event_name}
   * field on a meter.
   */
  @SerializedName("event_name")
  String eventName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Specifies whether to cancel a single event or a range of events for
   * a time period. Time period cancellation is not supported yet.
   */
  @SerializedName("type")
  Type type;

  private MeterEventAdjustmentCreateParams(
      Cancel cancel, String eventName, Map<String, Object> extraParams, Type type) {
    this.cancel = cancel;
    this.eventName = eventName;
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Cancel cancel;

    private String eventName;

    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterEventAdjustmentCreateParams build() {
      return new MeterEventAdjustmentCreateParams(
          this.cancel, this.eventName, this.extraParams, this.type);
    }

    /** <strong>Required.</strong> Specifies which event to cancel. */
    public Builder setCancel(MeterEventAdjustmentCreateParams.Cancel cancel) {
      this.cancel = cancel;
      return this;
    }

    /**
     * <strong>Required.</strong> The name of the meter event. Corresponds with the {@code
     * event_name} field on a meter.
     */
    public Builder setEventName(String eventName) {
      this.eventName = eventName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeterEventAdjustmentCreateParams#extraParams} for the field documentation.
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
     * See {@link MeterEventAdjustmentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Specifies whether to cancel a single event or a range of events
     * for a time period. Time period cancellation is not supported yet.
     */
    public Builder setType(MeterEventAdjustmentCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Cancel {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Unique identifier for the event. You can only cancel events within
     * 24 hours of Stripe receiving them.
     */
    @SerializedName("identifier")
    String identifier;

    private Cancel(Map<String, Object> extraParams, String identifier) {
      this.extraParams = extraParams;
      this.identifier = identifier;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String identifier;

      /** Finalize and obtain parameter instance from this builder. */
      public MeterEventAdjustmentCreateParams.Cancel build() {
        return new MeterEventAdjustmentCreateParams.Cancel(this.extraParams, this.identifier);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeterEventAdjustmentCreateParams.Cancel#extraParams} for the field documentation.
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
       * See {@link MeterEventAdjustmentCreateParams.Cancel#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Unique identifier for the event. You can only cancel events
       * within 24 hours of Stripe receiving them.
       */
      public Builder setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("cancel")
    CANCEL("cancel");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
