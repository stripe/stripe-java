// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class DisputeCreateParams extends ApiRequestParams {
  /**
   * Additional information explaining the dispute. Must contain non-whitespace text and be no
   * longer than 5000 characters.
   */
  @SerializedName("explanation")
  String explanation;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The FinancialAccount holder's reason for disputing the money
   * movement.
   */
  @SerializedName("reason")
  Reason reason;

  /** <strong>Required.</strong> The money movement being disputed. */
  @SerializedName("target")
  Target target;

  private DisputeCreateParams(
      String explanation,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Reason reason,
      Target target) {
    this.explanation = explanation;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.reason = reason;
    this.target = target;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String explanation;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Reason reason;

    private Target target;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeCreateParams build() {
      return new DisputeCreateParams(
          this.explanation, this.extraParams, this.metadata, this.reason, this.target);
    }

    /**
     * Additional information explaining the dispute. Must contain non-whitespace text and be no
     * longer than 5000 characters.
     */
    public Builder setExplanation(String explanation) {
      this.explanation = explanation;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeCreateParams#extraParams} for the field documentation.
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
     * See {@link DisputeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * DisputeCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The FinancialAccount holder's reason for disputing the money
     * movement.
     */
    public Builder setReason(DisputeCreateParams.Reason reason) {
      this.reason = reason;
      return this;
    }

    /** <strong>Required.</strong> The money movement being disputed. */
    public Builder setTarget(DisputeCreateParams.Target target) {
      this.target = target;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Target {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** If applicable, the ID of the ReceivedDebit being disputed. */
    @SerializedName("received_debit")
    String receivedDebit;

    /** <strong>Required.</strong> The type of money movement being disputed. */
    @SerializedName("type")
    Type type;

    private Target(Map<String, Object> extraParams, String receivedDebit, Type type) {
      this.extraParams = extraParams;
      this.receivedDebit = receivedDebit;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String receivedDebit;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public DisputeCreateParams.Target build() {
        return new DisputeCreateParams.Target(this.extraParams, this.receivedDebit, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeCreateParams.Target#extraParams} for the field documentation.
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
       * See {@link DisputeCreateParams.Target#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** If applicable, the ID of the ReceivedDebit being disputed. */
      public Builder setReceivedDebit(String receivedDebit) {
        this.receivedDebit = receivedDebit;
        return this;
      }

      /** <strong>Required.</strong> The type of money movement being disputed. */
      public Builder setType(DisputeCreateParams.Target.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("received_debit")
      RECEIVED_DEBIT("received_debit");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("authorization_revoked")
    AUTHORIZATION_REVOKED("authorization_revoked"),

    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("incorrect_amount")
    INCORRECT_AMOUNT("incorrect_amount"),

    @SerializedName("incorrect_date")
    INCORRECT_DATE("incorrect_date"),

    @SerializedName("other")
    OTHER("other"),

    @SerializedName("unauthorized")
    UNAUTHORIZED("unauthorized");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
