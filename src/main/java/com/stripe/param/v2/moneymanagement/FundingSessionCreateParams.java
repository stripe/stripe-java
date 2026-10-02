// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
public class FundingSessionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the Account that owns the FinancialAccount. Required. */
  @SerializedName("account")
  String account;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The ID of the FinancialAccount to fund. Required. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * <strong>Required.</strong> Per-type options used when creating the FinancialAddress. Required.
   */
  @SerializedName("financial_address_options")
  FinancialAddressOptions financialAddressOptions;

  /**
   * <strong>Required.</strong> Open Enum. The types of FinancialAddress that can be funded in this
   * session. At least one is required.
   */
  @SerializedName("financial_address_types")
  List<FundingSessionCreateParams.FinancialAddressType> financialAddressTypes;

  /**
   * <strong>Required.</strong> The URL the customer is redirected to after completing or abandoning
   * the funding session. Required.
   */
  @SerializedName("return_url")
  String returnUrl;

  private FundingSessionCreateParams(
      String account,
      Map<String, Object> extraParams,
      String financialAccount,
      FinancialAddressOptions financialAddressOptions,
      List<FundingSessionCreateParams.FinancialAddressType> financialAddressTypes,
      String returnUrl) {
    this.account = account;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.financialAddressOptions = financialAddressOptions;
    this.financialAddressTypes = financialAddressTypes;
    this.returnUrl = returnUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private FinancialAddressOptions financialAddressOptions;

    private List<FundingSessionCreateParams.FinancialAddressType> financialAddressTypes;

    private String returnUrl;

    /** Finalize and obtain parameter instance from this builder. */
    public FundingSessionCreateParams build() {
      return new FundingSessionCreateParams(
          this.account,
          this.extraParams,
          this.financialAccount,
          this.financialAddressOptions,
          this.financialAddressTypes,
          this.returnUrl);
    }

    /**
     * <strong>Required.</strong> The ID of the Account that owns the FinancialAccount. Required.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link FundingSessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The ID of the FinancialAccount to fund. Required. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * <strong>Required.</strong> Per-type options used when creating the FinancialAddress.
     * Required.
     */
    public Builder setFinancialAddressOptions(
        FundingSessionCreateParams.FinancialAddressOptions financialAddressOptions) {
      this.financialAddressOptions = financialAddressOptions;
      return this;
    }

    /**
     * Add an element to `financialAddressTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link FundingSessionCreateParams#financialAddressTypes} for the field documentation.
     */
    public Builder addFinancialAddressType(
        FundingSessionCreateParams.FinancialAddressType element) {
      if (this.financialAddressTypes == null) {
        this.financialAddressTypes = new ArrayList<>();
      }
      this.financialAddressTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `financialAddressTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link FundingSessionCreateParams#financialAddressTypes} for the field documentation.
     */
    public Builder addAllFinancialAddressType(
        List<FundingSessionCreateParams.FinancialAddressType> elements) {
      if (this.financialAddressTypes == null) {
        this.financialAddressTypes = new ArrayList<>();
      }
      this.financialAddressTypes.addAll(elements);
      return this;
    }

    /**
     * <strong>Required.</strong> The URL the customer is redirected to after completing or
     * abandoning the funding session. Required.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAddressOptions {
    /**
     * Options for a crypto wallet FinancialAddress. Required if {@code crypto_wallet} is requested.
     */
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

    private FinancialAddressOptions(CryptoWallet cryptoWallet, Map<String, Object> extraParams) {
      this.cryptoWallet = cryptoWallet;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CryptoWallet cryptoWallet;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingSessionCreateParams.FinancialAddressOptions build() {
        return new FundingSessionCreateParams.FinancialAddressOptions(
            this.cryptoWallet, this.extraParams);
      }

      /**
       * Options for a crypto wallet FinancialAddress. Required if {@code crypto_wallet} is
       * requested.
       */
      public Builder setCryptoWallet(
          FundingSessionCreateParams.FinancialAddressOptions.CryptoWallet cryptoWallet) {
        this.cryptoWallet = cryptoWallet;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingSessionCreateParams.FinancialAddressOptions#extraParams} for the field
       * documentation.
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
       * See {@link FundingSessionCreateParams.FinancialAddressOptions#extraParams} for the field
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoWallet {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Open Enum. The currency the crypto wallet FinancialAddress
       * settles into the FinancialAccount. Required.
       */
      @SerializedName("settlement_currency")
      String settlementCurrency;

      private CryptoWallet(Map<String, Object> extraParams, String settlementCurrency) {
        this.extraParams = extraParams;
        this.settlementCurrency = settlementCurrency;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String settlementCurrency;

        /** Finalize and obtain parameter instance from this builder. */
        public FundingSessionCreateParams.FinancialAddressOptions.CryptoWallet build() {
          return new FundingSessionCreateParams.FinancialAddressOptions.CryptoWallet(
              this.extraParams, this.settlementCurrency);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FundingSessionCreateParams.FinancialAddressOptions.CryptoWallet#extraParams} for the
         * field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * FundingSessionCreateParams.FinancialAddressOptions.CryptoWallet#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Open Enum. The currency the crypto wallet FinancialAddress
         * settles into the FinancialAccount. Required.
         */
        public Builder setSettlementCurrency(String settlementCurrency) {
          this.settlementCurrency = settlementCurrency;
          return this;
        }
      }
    }
  }

  public enum FinancialAddressType implements ApiRequestParams.EnumParam {
    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("crypto_wallet")
    CRYPTO_WALLET("crypto_wallet");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FinancialAddressType(String value) {
      this.value = value;
    }
  }
}
