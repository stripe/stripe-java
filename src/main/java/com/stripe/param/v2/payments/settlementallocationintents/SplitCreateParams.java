// File generated from our OpenAPI spec
package com.stripe.param.v2.payments.settlementallocationintents;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SplitCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The target account for settling the SettlementAllocationIntentSplit.
   */
  @SerializedName("account")
  String account;

  /** <strong>Required.</strong> The amount and currency of the SettlementAllocationIntentSplit. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Metadata associated with the SettlementAllocationIntentSplit. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> The type of the fund transfer. */
  @SerializedName("type")
  Type type;

  private SplitCreateParams(
      String account,
      Amount amount,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Type type) {
    this.account = account;
    this.amount = amount;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Amount amount;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public SplitCreateParams build() {
      return new SplitCreateParams(
          this.account, this.amount, this.extraParams, this.metadata, this.type);
    }

    /**
     * <strong>Required.</strong> The target account for settling the
     * SettlementAllocationIntentSplit.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * <strong>Required.</strong> The amount and currency of the SettlementAllocationIntentSplit.
     */
    public Builder setAmount(SplitCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SplitCreateParams#extraParams} for the field documentation.
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
     * See {@link SplitCreateParams#extraParams} for the field documentation.
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
     * SplitCreateParams#metadata} for the field documentation.
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
     * See {@link SplitCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The type of the fund transfer. */
    public Builder setType(SplitCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;

    private Amount(String currency, Map<String, Object> extraParams, Long value) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private Long value;

      /** Finalize and obtain parameter instance from this builder. */
      public SplitCreateParams.Amount build() {
        return new SplitCreateParams.Amount(this.currency, this.extraParams, this.value);
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SplitCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link SplitCreateParams.Amount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("credit")
    CREDIT("credit"),

    @SerializedName("debit")
    DEBIT("debit");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
