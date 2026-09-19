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
  /** Properties for creating a bank account FinancialAddress. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  /** Properties for creating a crypto wallet FinancialAddress. */
  @SerializedName("crypto_wallet")
  CryptoWallet cryptoWallet;

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

  /** Open Enum. The currency the FinancialAddress settles into the FinancialAccount. */
  @SerializedName("settlement_currency")
  String settlementCurrency;

  /**
   * <strong>Required.</strong> The type of FinancialAddress to create. Must agree with which branch
   * of financial_address_type_properties is set.
   */
  @SerializedName("type")
  Type type;

  private FinancialAddressCreateParams(
      BankAccount bankAccount,
      CryptoWallet cryptoWallet,
      Map<String, Object> extraParams,
      String financialAccount,
      String settlementCurrency,
      Type type) {
    this.bankAccount = bankAccount;
    this.cryptoWallet = cryptoWallet;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.settlementCurrency = settlementCurrency;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankAccount bankAccount;

    private CryptoWallet cryptoWallet;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private String settlementCurrency;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressCreateParams build() {
      return new FinancialAddressCreateParams(
          this.bankAccount,
          this.cryptoWallet,
          this.extraParams,
          this.financialAccount,
          this.settlementCurrency,
          this.type);
    }

    /** Properties for creating a bank account FinancialAddress. */
    public Builder setBankAccount(FinancialAddressCreateParams.BankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /** Properties for creating a crypto wallet FinancialAddress. */
    public Builder setCryptoWallet(FinancialAddressCreateParams.CryptoWallet cryptoWallet) {
      this.cryptoWallet = cryptoWallet;
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

    /** Open Enum. The currency the FinancialAddress settles into the FinancialAccount. */
    public Builder setSettlementCurrency(String settlementCurrency) {
      this.settlementCurrency = settlementCurrency;
      return this;
    }

    /**
     * <strong>Required.</strong> The type of FinancialAddress to create. Must agree with which
     * branch of financial_address_type_properties is set.
     */
    public Builder setType(FinancialAddressCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BankAccount {
    /** The country for the bank account. Used to select the appropriate rails (e.g. for SEPA). */
    @SerializedName("country")
    String country;

    /** <strong>Required.</strong> The currency of the bank account to provision. */
    @SerializedName("currency")
    Currency currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private BankAccount(String country, Currency currency, Map<String, Object> extraParams) {
      this.country = country;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String country;

      private Currency currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAddressCreateParams.BankAccount build() {
        return new FinancialAddressCreateParams.BankAccount(
            this.country, this.currency, this.extraParams);
      }

      /** The country for the bank account. Used to select the appropriate rails (e.g. for SEPA). */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /** <strong>Required.</strong> The currency of the bank account to provision. */
      public Builder setCurrency(FinancialAddressCreateParams.BankAccount.Currency currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressCreateParams.BankAccount#extraParams} for the field documentation.
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
       * See {@link FinancialAddressCreateParams.BankAccount#extraParams} for the field
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

    public enum Currency implements ApiRequestParams.EnumParam {
      @SerializedName("cad")
      CAD("cad"),

      @SerializedName("eur")
      EUR("eur"),

      @SerializedName("gbp")
      GBP("gbp"),

      @SerializedName("mxn")
      MXN("mxn"),

      @SerializedName("usd")
      USD("usd");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Currency(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoWallet {
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

    private CryptoWallet(Map<String, Object> extraParams, Network network) {
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
      public FinancialAddressCreateParams.CryptoWallet build() {
        return new FinancialAddressCreateParams.CryptoWallet(this.extraParams, this.network);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressCreateParams.CryptoWallet#extraParams} for the field documentation.
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
       * See {@link FinancialAddressCreateParams.CryptoWallet#extraParams} for the field
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
      public Builder setNetwork(FinancialAddressCreateParams.CryptoWallet.Network network) {
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("crypto_wallet")
    CRYPTO_WALLET("crypto_wallet");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
