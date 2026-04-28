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
public class FinancialAddressCreateParams extends ApiRequestParams {
  /** Properties needed to create a FinancialAddress for an FA with USDC currency. */
  @SerializedName("crypto_properties")
  CryptoProperties cryptoProperties;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
   * associated with.
   */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * Optional SEPA Bank account options, used to configure the type of SEPA Bank account to create,
   * such as the originating country.
   */
  @SerializedName("sepa_bank_account")
  SepaBankAccount sepaBankAccount;

  /**
   * Open Enum. The currency the FinancialAddress settles into the FinancialAccount. Currently, only
   * the {@code usd}, {@code gbp} and {@code usdc} values are supported.
   */
  @SerializedName("settlement_currency")
  String settlementCurrency;

  /** <strong>Required.</strong> The type of FinancialAddress details to provision. */
  @SerializedName("type")
  Type type;

  private FinancialAddressCreateParams(
      CryptoProperties cryptoProperties,
      Map<String, Object> extraParams,
      String financialAccount,
      SepaBankAccount sepaBankAccount,
      String settlementCurrency,
      Type type) {
    this.cryptoProperties = cryptoProperties;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.sepaBankAccount = sepaBankAccount;
    this.settlementCurrency = settlementCurrency;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CryptoProperties cryptoProperties;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private SepaBankAccount sepaBankAccount;

    private String settlementCurrency;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressCreateParams build() {
      return new FinancialAddressCreateParams(
          this.cryptoProperties,
          this.extraParams,
          this.financialAccount,
          this.sepaBankAccount,
          this.settlementCurrency,
          this.type);
    }

    /** Properties needed to create a FinancialAddress for an FA with USDC currency. */
    public Builder setCryptoProperties(
        FinancialAddressCreateParams.CryptoProperties cryptoProperties) {
      this.cryptoProperties = cryptoProperties;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
     * associated with.
     */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * Optional SEPA Bank account options, used to configure the type of SEPA Bank account to
     * create, such as the originating country.
     */
    public Builder setSepaBankAccount(
        FinancialAddressCreateParams.SepaBankAccount sepaBankAccount) {
      this.sepaBankAccount = sepaBankAccount;
      return this;
    }

    /**
     * Open Enum. The currency the FinancialAddress settles into the FinancialAccount. Currently,
     * only the {@code usd}, {@code gbp} and {@code usdc} values are supported.
     */
    public Builder setSettlementCurrency(String settlementCurrency) {
      this.settlementCurrency = settlementCurrency;
      return this;
    }

    /** <strong>Required.</strong> The type of FinancialAddress details to provision. */
    public Builder setType(FinancialAddressCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoProperties {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The blockchain network of the crypto wallet. */
    @SerializedName("network")
    Network network;

    private CryptoProperties(Map<String, Object> extraParams, Network network) {
      this.extraParams = extraParams;
      this.network = network;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Network network;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAddressCreateParams.CryptoProperties build() {
        return new FinancialAddressCreateParams.CryptoProperties(this.extraParams, this.network);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressCreateParams.CryptoProperties#extraParams} for the field documentation.
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
       * See {@link FinancialAddressCreateParams.CryptoProperties#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The blockchain network of the crypto wallet. */
      public Builder setNetwork(FinancialAddressCreateParams.CryptoProperties.Network network) {
        this.network = network;
        return this;
      }
    }

    public enum Network implements ApiRequestParams.EnumParam {
      @SerializedName("arbitrum")
      ARBITRUM("arbitrum"),

      @SerializedName("avalanche_c_chain")
      AVALANCHE_C_CHAIN("avalanche_c_chain"),

      @SerializedName("base")
      BASE("base"),

      @SerializedName("ethereum")
      ETHEREUM("ethereum"),

      @SerializedName("optimism")
      OPTIMISM("optimism"),

      @SerializedName("polygon")
      POLYGON("polygon"),

      @SerializedName("solana")
      SOLANA("solana"),

      @SerializedName("stellar")
      STELLAR("stellar"),

      @SerializedName("tempo")
      TEMPO("tempo");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Network(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaBankAccount {
    /** <strong>Required.</strong> The originating country of the SEPA Bank account. */
    @SerializedName("country")
    String country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SepaBankAccount(String country, Map<String, Object> extraParams) {
      this.country = country;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String country;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAddressCreateParams.SepaBankAccount build() {
        return new FinancialAddressCreateParams.SepaBankAccount(this.country, this.extraParams);
      }

      /** <strong>Required.</strong> The originating country of the SEPA Bank account. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressCreateParams.SepaBankAccount#extraParams} for the field documentation.
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
       * See {@link FinancialAddressCreateParams.SepaBankAccount#extraParams} for the field
       * documentation.
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("ca_bank_account")
    CA_BANK_ACCOUNT("ca_bank_account"),

    @SerializedName("crypto_wallet")
    CRYPTO_WALLET("crypto_wallet"),

    @SerializedName("gb_bank_account")
    GB_BANK_ACCOUNT("gb_bank_account"),

    @SerializedName("mx_bank_account")
    MX_BANK_ACCOUNT("mx_bank_account"),

    @SerializedName("sepa_bank_account")
    SEPA_BANK_ACCOUNT("sepa_bank_account"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
