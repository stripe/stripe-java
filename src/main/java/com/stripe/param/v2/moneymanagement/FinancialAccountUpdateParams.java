// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
public class FinancialAccountUpdateParams extends ApiRequestParams {
  /**
   * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
   * in the Stripe Dashboard and embedded components.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Forwarding settings for a closed FinancialAccount. Post-close forwarding updates are not yet
   * implemented.
   */
  @SerializedName("forwarding_settings")
  ForwardingSettings forwardingSettings;

  /** Metadata associated with the FinancialAccount. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** Parameters for updating storage-specific fields on the FinancialAccount. */
  @SerializedName("storage")
  Storage storage;

  private FinancialAccountUpdateParams(
      Object displayName,
      Map<String, Object> extraParams,
      ForwardingSettings forwardingSettings,
      Map<String, Object> metadata,
      Storage storage) {
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.forwardingSettings = forwardingSettings;
    this.metadata = metadata;
    this.storage = storage;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object displayName;

    private Map<String, Object> extraParams;

    private ForwardingSettings forwardingSettings;

    private Map<String, Object> metadata;

    private Storage storage;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountUpdateParams build() {
      return new FinancialAccountUpdateParams(
          this.displayName, this.extraParams, this.forwardingSettings, this.metadata, this.storage);
    }

    /**
     * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
     * in the Stripe Dashboard and embedded components.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
     * in the Stripe Dashboard and embedded components.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Forwarding settings for a closed FinancialAccount. Post-close forwarding updates are not yet
     * implemented.
     */
    public Builder setForwardingSettings(
        FinancialAccountUpdateParams.ForwardingSettings forwardingSettings) {
      this.forwardingSettings = forwardingSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Parameters for updating storage-specific fields on the FinancialAccount. */
    public Builder setStorage(FinancialAccountUpdateParams.Storage storage) {
      this.storage = storage;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ForwardingSettings {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The address to send forwarded payments to. */
    @SerializedName("payment_method")
    Object paymentMethod;

    /** The address to send forwarded payouts to. */
    @SerializedName("payout_method")
    Object payoutMethod;

    /**
     * Whether to skip forwarding exportable self-custodied wallet balances. Defaults to false. This
     * does not skip non-exportable or fiat balances, inbound-pending checks, or negative-balance
     * requirements.
     */
    @SerializedName("skip_exportable_balances")
    Boolean skipExportableBalances;

    private ForwardingSettings(
        Map<String, Object> extraParams,
        Object paymentMethod,
        Object payoutMethod,
        Boolean skipExportableBalances) {
      this.extraParams = extraParams;
      this.paymentMethod = paymentMethod;
      this.payoutMethod = payoutMethod;
      this.skipExportableBalances = skipExportableBalances;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object paymentMethod;

      private Object payoutMethod;

      private Boolean skipExportableBalances;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountUpdateParams.ForwardingSettings build() {
        return new FinancialAccountUpdateParams.ForwardingSettings(
            this.extraParams, this.paymentMethod, this.payoutMethod, this.skipExportableBalances);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountUpdateParams.ForwardingSettings#extraParams} for the field documentation.
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
       * See {@link FinancialAccountUpdateParams.ForwardingSettings#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The address to send forwarded payments to. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /** The address to send forwarded payments to. */
      public Builder setPaymentMethod(EmptyParam paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /** The address to send forwarded payouts to. */
      public Builder setPayoutMethod(String payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }

      /** The address to send forwarded payouts to. */
      public Builder setPayoutMethod(EmptyParam payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }

      /**
       * Whether to skip forwarding exportable self-custodied wallet balances. Defaults to false.
       * This does not skip non-exportable or fiat balances, inbound-pending checks, or
       * negative-balance requirements.
       */
      public Builder setSkipExportableBalances(Boolean skipExportableBalances) {
        this.skipExportableBalances = skipExportableBalances;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Storage {
    /**
     * Crypto-specific storage configuration used when adding crypto to a fiat-only
     * FinancialAccount. {@code custody_model} is required for the initial crypto update and cannot
     * be changed afterward.
     */
    @SerializedName("crypto")
    Crypto crypto;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The currencies that this storage FinancialAccount can hold a balance in. Three-letter ISO
     * currency code, in lowercase. Adding currencies requires the corresponding holds_currencies
     * storer capabilities to be enabled. Removing currencies is not supported as of March 2026.
     */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;

    private Storage(Crypto crypto, Map<String, Object> extraParams, List<String> holdsCurrencies) {
      this.crypto = crypto;
      this.extraParams = extraParams;
      this.holdsCurrencies = holdsCurrencies;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Crypto crypto;

      private Map<String, Object> extraParams;

      private List<String> holdsCurrencies;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountUpdateParams.Storage build() {
        return new FinancialAccountUpdateParams.Storage(
            this.crypto, this.extraParams, this.holdsCurrencies);
      }

      /**
       * Crypto-specific storage configuration used when adding crypto to a fiat-only
       * FinancialAccount. {@code custody_model} is required for the initial crypto update and
       * cannot be changed afterward.
       */
      public Builder setCrypto(FinancialAccountUpdateParams.Storage.Crypto crypto) {
        this.crypto = crypto;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountUpdateParams.Storage#extraParams} for the field documentation.
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
       * See {@link FinancialAccountUpdateParams.Storage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `holdsCurrencies` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FinancialAccountUpdateParams.Storage#holdsCurrencies} for the field documentation.
       */
      public Builder addHoldsCurrency(String element) {
        if (this.holdsCurrencies == null) {
          this.holdsCurrencies = new ArrayList<>();
        }
        this.holdsCurrencies.add(element);
        return this;
      }

      /**
       * Add all elements to `holdsCurrencies` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link FinancialAccountUpdateParams.Storage#holdsCurrencies} for the field documentation.
       */
      public Builder addAllHoldsCurrency(List<String> elements) {
        if (this.holdsCurrencies == null) {
          this.holdsCurrencies = new ArrayList<>();
        }
        this.holdsCurrencies.addAll(elements);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Crypto {
      /**
       * <strong>Required.</strong> The blockchain network configured for each crypto currency. Keys
       * are lowercase currency codes and must identify crypto currencies also present in {@code
       * holds_currencies}.
       */
      @SerializedName("currency_networks")
      Map<String, FinancialAccountUpdateParams.Storage.Crypto.CurrencyNetwork> currencyNetworks;

      /**
       * <strong>Required.</strong> Describes who controls the private keys for the crypto storage.
       */
      @SerializedName("custody_model")
      CustodyModel custodyModel;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Crypto(
          Map<String, FinancialAccountUpdateParams.Storage.Crypto.CurrencyNetwork> currencyNetworks,
          CustodyModel custodyModel,
          Map<String, Object> extraParams) {
        this.currencyNetworks = currencyNetworks;
        this.custodyModel = custodyModel;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, FinancialAccountUpdateParams.Storage.Crypto.CurrencyNetwork>
            currencyNetworks;

        private CustodyModel custodyModel;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public FinancialAccountUpdateParams.Storage.Crypto build() {
          return new FinancialAccountUpdateParams.Storage.Crypto(
              this.currencyNetworks, this.custodyModel, this.extraParams);
        }

        /**
         * Add a key/value pair to `currencyNetworks` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountUpdateParams.Storage.Crypto#currencyNetworks} for the
         * field documentation.
         */
        public Builder putCurrencyNetwork(
            String key, FinancialAccountUpdateParams.Storage.Crypto.CurrencyNetwork value) {
          if (this.currencyNetworks == null) {
            this.currencyNetworks = new HashMap<>();
          }
          this.currencyNetworks.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `currencyNetworks` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountUpdateParams.Storage.Crypto#currencyNetworks} for the
         * field documentation.
         */
        public Builder putAllCurrencyNetwork(
            Map<String, FinancialAccountUpdateParams.Storage.Crypto.CurrencyNetwork> map) {
          if (this.currencyNetworks == null) {
            this.currencyNetworks = new HashMap<>();
          }
          this.currencyNetworks.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Describes who controls the private keys for the crypto
         * storage.
         */
        public Builder setCustodyModel(
            FinancialAccountUpdateParams.Storage.Crypto.CustodyModel custodyModel) {
          this.custodyModel = custodyModel;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountUpdateParams.Storage.Crypto#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FinancialAccountUpdateParams.Storage.Crypto#extraParams} for the field
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

      public enum CurrencyNetwork implements ApiRequestParams.EnumParam {
        @SerializedName("tempo")
        TEMPO("tempo");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CurrencyNetwork(String value) {
          this.value = value;
        }
      }

      public enum CustodyModel implements ApiRequestParams.EnumParam {
        @SerializedName("self")
        SELF("self"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CustodyModel(String value) {
          this.value = value;
        }
      }
    }
  }
}
