// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SettlementAllocationIntentCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The amount and currency of the SettlementAllocationIntent. Allowed
   * Currencies are {@code gbp} | {@code eur}.
   */
  @SerializedName("amount")
  Amount amount;

  /** <strong>Required.</strong> Date when we expect to receive the funds. Must be in future . */
  @SerializedName("expected_settlement_date")
  Instant expectedSettlementDate;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Financial Account Id where the funds are expected for this
   * SettlementAllocationIntent.
   */
  @SerializedName("financial_account")
  String financialAccount;

  /** Metadata associated with the SettlementAllocationIntent. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> Reference for the SettlementAllocationIntent. This should be same as
   * the transaction reference used by payments processor to send funds to Stripe. Must have length
   * between 5 and 255 characters and it must be unique among existing SettlementAllocationIntents
   * that have a non-terminal status ({@code pending}, {@code submitted}, {@code matched}, {@code
   * errored}).
   */
  @SerializedName("reference")
  String reference;

  private SettlementAllocationIntentCreateParams(
      Amount amount,
      Instant expectedSettlementDate,
      Map<String, Object> extraParams,
      String financialAccount,
      Map<String, String> metadata,
      String reference) {
    this.amount = amount;
    this.expectedSettlementDate = expectedSettlementDate;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.metadata = metadata;
    this.reference = reference;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Instant expectedSettlementDate;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Map<String, String> metadata;

    private String reference;

    /** Finalize and obtain parameter instance from this builder. */
    public SettlementAllocationIntentCreateParams build() {
      return new SettlementAllocationIntentCreateParams(
          this.amount,
          this.expectedSettlementDate,
          this.extraParams,
          this.financialAccount,
          this.metadata,
          this.reference);
    }

    /**
     * <strong>Required.</strong> The amount and currency of the SettlementAllocationIntent. Allowed
     * Currencies are {@code gbp} | {@code eur}.
     */
    public Builder setAmount(SettlementAllocationIntentCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /** <strong>Required.</strong> Date when we expect to receive the funds. Must be in future . */
    public Builder setExpectedSettlementDate(Instant expectedSettlementDate) {
      this.expectedSettlementDate = expectedSettlementDate;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SettlementAllocationIntentCreateParams#extraParams} for the field documentation.
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
     * See {@link SettlementAllocationIntentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Financial Account Id where the funds are expected for this
     * SettlementAllocationIntent.
     */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SettlementAllocationIntentCreateParams#metadata} for the field documentation.
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
     * See {@link SettlementAllocationIntentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Reference for the SettlementAllocationIntent. This should be same
     * as the transaction reference used by payments processor to send funds to Stripe. Must have
     * length between 5 and 255 characters and it must be unique among existing
     * SettlementAllocationIntents that have a non-terminal status ({@code pending}, {@code
     * submitted}, {@code matched}, {@code errored}).
     */
    public Builder setReference(String reference) {
      this.reference = reference;
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
      public SettlementAllocationIntentCreateParams.Amount build() {
        return new SettlementAllocationIntentCreateParams.Amount(
            this.currency, this.extraParams, this.value);
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
       * SettlementAllocationIntentCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link SettlementAllocationIntentCreateParams.Amount#extraParams} for the field
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
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
    }
  }
}
