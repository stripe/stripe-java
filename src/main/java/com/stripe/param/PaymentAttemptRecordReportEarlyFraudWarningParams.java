// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentAttemptRecordReportEarlyFraudWarningParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The type of fraud reported in the early fraud warning. */
  @SerializedName("fraud_type")
  FraudType fraudType;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** <strong>Required.</strong> The time at which the early fraud warning was received. */
  @SerializedName("occurred_at")
  Long occurredAt;

  private PaymentAttemptRecordReportEarlyFraudWarningParams(
      List<String> expand,
      Map<String, Object> extraParams,
      FraudType fraudType,
      Object metadata,
      Long occurredAt) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.fraudType = fraudType;
    this.metadata = metadata;
    this.occurredAt = occurredAt;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private FraudType fraudType;

    private Object metadata;

    private Long occurredAt;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentAttemptRecordReportEarlyFraudWarningParams build() {
      return new PaymentAttemptRecordReportEarlyFraudWarningParams(
          this.expand, this.extraParams, this.fraudType, this.metadata, this.occurredAt);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentAttemptRecordReportEarlyFraudWarningParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportEarlyFraudWarningParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportEarlyFraudWarningParams#extraParams} for the field documentation.
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
     * See {@link PaymentAttemptRecordReportEarlyFraudWarningParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The type of fraud reported in the early fraud warning. */
    public Builder setFraudType(
        PaymentAttemptRecordReportEarlyFraudWarningParams.FraudType fraudType) {
      this.fraudType = fraudType;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentAttemptRecordReportEarlyFraudWarningParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentAttemptRecordReportEarlyFraudWarningParams#metadata} for the field
     * documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** <strong>Required.</strong> The time at which the early fraud warning was received. */
    public Builder setOccurredAt(Long occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }
  }

  public enum FraudType implements ApiRequestParams.EnumParam {
    @SerializedName("made_with_lost_card")
    MADE_WITH_LOST_CARD("made_with_lost_card"),

    @SerializedName("made_with_stolen_card")
    MADE_WITH_STOLEN_CARD("made_with_stolen_card"),

    @SerializedName("other")
    OTHER("other"),

    @SerializedName("unauthorized_use_of_card")
    UNAUTHORIZED_USE_OF_CARD("unauthorized_use_of_card");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FraudType(String value) {
      this.value = value;
    }
  }
}
