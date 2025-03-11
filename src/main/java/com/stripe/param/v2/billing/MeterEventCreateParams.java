// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MeterEventCreateParams extends ApiRequestParams {
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
   * A unique identifier for the event. If not provided, one will be generated. We recommend using a
   * globally unique identifier for this. We’ll enforce uniqueness within a rolling 24 hour period.
   */
  @SerializedName("identifier")
  String identifier;

  /**
   * <strong>Required.</strong> The payload of the event. This must contain the fields corresponding
   * to a meter’s {@code customer_mapping.event_payload_key} (default is {@code stripe_customer_id})
   * and {@code value_settings.event_payload_key} (default is {@code value}). Read more about the <a
   * href="https://docs.stripe.com/billing/subscriptions/usage-based/recording-usage#payload-key-overrides">payload</a>.
   */
  @SerializedName("payload")
  Map<String, String> payload;

  /**
   * The time of the event. Must be within the past 35 calendar days or up to 5 minutes in the
   * future. Defaults to current timestamp if not specified.
   */
  @SerializedName("timestamp")
  Instant timestamp;

  private MeterEventCreateParams(
      String eventName,
      Map<String, Object> extraParams,
      String identifier,
      Map<String, String> payload,
      Instant timestamp) {
    this.eventName = eventName;
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

    private Map<String, Object> extraParams;

    private String identifier;

    private Map<String, String> payload;

    private Instant timestamp;

    /** Finalize and obtain parameter instance from this builder. */
    public MeterEventCreateParams build() {
      return new MeterEventCreateParams(
          this.eventName, this.extraParams, this.identifier, this.payload, this.timestamp);
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
     * a globally unique identifier for this. We’ll enforce uniqueness within a rolling 24 hour
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
     * The time of the event. Must be within the past 35 calendar days or up to 5 minutes in the
     * future. Defaults to current timestamp if not specified.
     */
    public Builder setTimestamp(Instant timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }
}
