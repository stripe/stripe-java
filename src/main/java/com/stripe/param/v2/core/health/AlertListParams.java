// File generated from our OpenAPI spec
package com.stripe.param.v2.core.health;

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
public class AlertListParams extends ApiRequestParams {
  /** Filter for alerts created at the specified timestamp. */
  @SerializedName("created")
  Instant created;

  /** Filter for alerts created after the specified timestamp. */
  @SerializedName("created_gt")
  Instant createdGt;

  /** Filter for alerts created on or after the specified timestamp. */
  @SerializedName("created_gte")
  Instant createdGte;

  /** Filter for alerts created before the specified timestamp. */
  @SerializedName("created_lt")
  Instant createdLt;

  /** Filter for alerts created on or before the specified timestamp. */
  @SerializedName("created_lte")
  Instant createdLte;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page limit. */
  @SerializedName("limit")
  Long limit;

  /** Filter by alert severity. */
  @SerializedName("severity")
  Severity severity;

  /** Filter by alert status. */
  @SerializedName("status")
  Status status;

  /** Filter by alert types. */
  @SerializedName("types")
  List<AlertListParams.Type> types;

  private AlertListParams(
      Instant created,
      Instant createdGt,
      Instant createdGte,
      Instant createdLt,
      Instant createdLte,
      Map<String, Object> extraParams,
      Long limit,
      Severity severity,
      Status status,
      List<AlertListParams.Type> types) {
    this.created = created;
    this.createdGt = createdGt;
    this.createdGte = createdGte;
    this.createdLt = createdLt;
    this.createdLte = createdLte;
    this.extraParams = extraParams;
    this.limit = limit;
    this.severity = severity;
    this.status = status;
    this.types = types;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Instant created;

    private Instant createdGt;

    private Instant createdGte;

    private Instant createdLt;

    private Instant createdLte;

    private Map<String, Object> extraParams;

    private Long limit;

    private Severity severity;

    private Status status;

    private List<AlertListParams.Type> types;

    /** Finalize and obtain parameter instance from this builder. */
    public AlertListParams build() {
      return new AlertListParams(
          this.created,
          this.createdGt,
          this.createdGte,
          this.createdLt,
          this.createdLte,
          this.extraParams,
          this.limit,
          this.severity,
          this.status,
          this.types);
    }

    /** Filter for alerts created at the specified timestamp. */
    public Builder setCreated(Instant created) {
      this.created = created;
      return this;
    }

    /** Filter for alerts created after the specified timestamp. */
    public Builder setCreatedGt(Instant createdGt) {
      this.createdGt = createdGt;
      return this;
    }

    /** Filter for alerts created on or after the specified timestamp. */
    public Builder setCreatedGte(Instant createdGte) {
      this.createdGte = createdGte;
      return this;
    }

    /** Filter for alerts created before the specified timestamp. */
    public Builder setCreatedLt(Instant createdLt) {
      this.createdLt = createdLt;
      return this;
    }

    /** Filter for alerts created on or before the specified timestamp. */
    public Builder setCreatedLte(Instant createdLte) {
      this.createdLte = createdLte;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AlertListParams#extraParams} for the field documentation.
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
     * See {@link AlertListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Filter by alert severity. */
    public Builder setSeverity(AlertListParams.Severity severity) {
      this.severity = severity;
      return this;
    }

    /** Filter by alert status. */
    public Builder setStatus(AlertListParams.Status status) {
      this.status = status;
      return this;
    }

    /**
     * Add an element to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertListParams#types} for the field documentation.
     */
    public Builder addType(AlertListParams.Type element) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.add(element);
      return this;
    }

    /**
     * Add all elements to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertListParams#types} for the field documentation.
     */
    public Builder addAllType(List<AlertListParams.Type> elements) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.addAll(elements);
      return this;
    }
  }

  public enum Severity implements ApiRequestParams.EnumParam {
    @SerializedName("critical")
    CRITICAL("critical"),

    @SerializedName("non_critical")
    NON_CRITICAL("non_critical");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Severity(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("open")
    OPEN("open"),

    @SerializedName("resolved")
    RESOLVED("resolved");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("api_error")
    API_ERROR("api_error"),

    @SerializedName("api_latency")
    API_LATENCY("api_latency"),

    @SerializedName("authorization_rate_drop")
    AUTHORIZATION_RATE_DROP("authorization_rate_drop"),

    @SerializedName("elements_error")
    ELEMENTS_ERROR("elements_error"),

    @SerializedName("event_generation_failure")
    EVENT_GENERATION_FAILURE("event_generation_failure"),

    @SerializedName("fraud_rate")
    FRAUD_RATE("fraud_rate"),

    @SerializedName("invoice_count_dropped")
    INVOICE_COUNT_DROPPED("invoice_count_dropped"),

    @SerializedName("issuing_authorization_request_errors")
    ISSUING_AUTHORIZATION_REQUEST_ERRORS("issuing_authorization_request_errors"),

    @SerializedName("issuing_authorization_request_timeout")
    ISSUING_AUTHORIZATION_REQUEST_TIMEOUT("issuing_authorization_request_timeout"),

    @SerializedName("meter_event_summaries_delayed")
    METER_EVENT_SUMMARIES_DELAYED("meter_event_summaries_delayed"),

    @SerializedName("metronome_notification_latency")
    METRONOME_NOTIFICATION_LATENCY("metronome_notification_latency"),

    @SerializedName("payment_method_error")
    PAYMENT_METHOD_ERROR("payment_method_error"),

    @SerializedName("sepa_debit_delayed")
    SEPA_DEBIT_DELAYED("sepa_debit_delayed"),

    @SerializedName("traffic_volume_drop")
    TRAFFIC_VOLUME_DROP("traffic_volume_drop"),

    @SerializedName("webhook_latency")
    WEBHOOK_LATENCY("webhook_latency");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
