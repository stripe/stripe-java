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
public class MeterEventCreateParams extends ApiRequestParams {
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
   * A unique identifier for the event. If not provided, one will be generated. We recommend using a
   * globally unique identifier for this. We'll enforce uniqueness within a rolling 24 hour period.
   */
  @SerializedName("identifier")
  String identifier;

  /**
   * <strong>Required.</strong> The payload of the event. This must contain a field with the event's
   * numerical value and a field to map the event to a customer.
   */
  @SerializedName("payload")
  Map<String, String> payload;

  /**
   * The time of the event. Measured in seconds since the Unix epoch. Defaults to current timestamp
   * if not specified.
   */
  @SerializedName("timestamp")
  Long timestamp;

  private MeterEventCreateParams(
      String eventName,
      List<String> expand,
      Map<String, Object> extraParams,
      String identifier,
      Map<String, String> payload,
      Long timestamp) {
    this.eventName = eventName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.identifier = identifier;
    this.payload = payload;
    this.timestamp = timestamp;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String eventName;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String identifier;

    private Map<String, String> payload;

    private Long timestamp;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterEventCreateParams build() {
      return new MeterEventCreateParams(
          this.eventName,
          this.expand,
          this.extraParams,
          this.identifier,
          this.payload,
          this.timestamp);
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
     * MeterEventCreateParams#expand} for the field documentation.
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
     * MeterEventCreateParams#expand} for the field documentation.
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
     * MeterEventCreateParams#extraParams} for the field documentation.
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
     * See {@link MeterEventCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A unique identifier for the event. If not provided, one will be generated. We recommend using
     * a globally unique identifier for this. We'll enforce uniqueness within a rolling 24 hour
     * period.
     */
    public Builder setIdentifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    /**
     * Add a key/value pair to `payload` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeterEventCreateParams#payload} for the field documentation.
     */
    public Builder putPayload(String key, String value) {
      if (this.payload == null) {
        this.payload = new HashMap<>();
      }
      this.payload.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `payload` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeterEventCreateParams#payload} for the field documentation.
     */
    public Builder putAllPayload(Map<String, String> map) {
      if (this.payload == null) {
        this.payload = new HashMap<>();
      }
      this.payload.putAll(map);
      return this;
    }

    /**
     * The time of the event. Measured in seconds since the Unix epoch. Defaults to current
     * timestamp if not specified.
     */
    public Builder setTimestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }
}
