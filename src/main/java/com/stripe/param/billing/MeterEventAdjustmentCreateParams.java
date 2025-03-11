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
public class MeterEventAdjustmentCreateParams extends ApiRequestParams {
  /** Specifies which event to cancel. */
  @SerializedName("cancel")
  Cancel cancel;

  /**
   * <strong>Required.</strong> The name of the meter event. Corresponds with the {@code event_name}
   * field on a meter.
   */
  @SerializedName("event_name")
  String eventName;

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
   * <strong>Required.</strong> Specifies whether to cancel a single event or a range of events for
   * a time period. Time period cancellation is not supported yet.
   */
  @SerializedName("type")
  Type type;

  private MeterEventAdjustmentCreateParams(
      Cancel cancel,
      String eventName,
      List<String> expand,
      Map<String, Object> extraParams,
      Type type) {
    this.cancel = cancel;
    this.eventName = eventName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Cancel cancel;

    private String eventName;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterEventAdjustmentCreateParams build() {
      return new MeterEventAdjustmentCreateParams(
          this.cancel, this.eventName, this.expand, this.extraParams, this.type);
    }

    /** Specifies which event to cancel. */
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
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * MeterEventAdjustmentCreateParams#expand} for the field documentation.
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
     * MeterEventAdjustmentCreateParams#expand} for the field documentation.
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
     * Unique identifier for the event. You can only cancel events within 24 hours of Stripe
     * receiving them.
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
       * Unique identifier for the event. You can only cancel events within 24 hours of Stripe
       * receiving them.
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
