// File generated from our OpenAPI spec
package com.stripe.param.crypto;

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
public class OnrampSessionCreateParams extends ApiRequestParams {
  /**
   * The IP address of the customer the platform intends to onramp.
   *
   * <p>If the user's IP is in a region we can't support, we return an {@code HTTP 400} with an
   * appropriate error code.
   *
   * <p>We support IPv4 and IPv6 addresses. Geographic supportability is checked again later in the
   * onramp flow, which provides a way to hide the onramp option from ineligible users for a better
   * user experience.
   */
  @SerializedName("customer_ip_address")
  String customerIpAddress;

  /**
   * The default amount of crypto to exchange into.
   *
   * <p>* When left null, a default value is computed if {@code source_amount}, {@code
   * destination_currency}, and {@code destination_network} are set. * When set, both {@code
   * destination_currency} and {@code destination_network} must also be set. All cryptocurrencies
   * are supported to their full precisions (for example, 18 decimal places for {@code eth}). We
   * validate and generate an error if the amount exceeds the supported precision based on the
   * exchange currency. Setting {@code source_amount} is mutually exclusive with setting {@code
   * destination_amount} (only one or the other is supported). Users can update the amount in the
   * onramp UI.
   */
  @SerializedName("destination_amount")
  String destinationAmount;

  /**
   * The list of destination cryptocurrencies a user can choose from.
   *
   * <p>* When left null, all supported cryptocurrencies are shown in the onramp UI subject to
   * {@code destination_networks} if set. * When set, it must be a non-empty array where all values
   * in the array are valid cryptocurrencies. You can use it to lock users to a specific
   * cryptocurrency by passing a single value array. Users <strong>cannot</strong> override this
   * parameter.
   */
  @SerializedName("destination_currencies")
  List<OnrampSessionCreateParams.DestinationCurrency> destinationCurrencies;

  /**
   * The default destination cryptocurrency.
   *
   * <p>* When left null, the first value of {@code destination_currencies} is selected. * When set,
   * if {@code destination_currencies} is also set, the value of {@code destination_currency} must
   * be present in that array. To lock a {@code destination_currency}, specify that value as the
   * single value for {@code destination_currencies}. Users can select a different cryptocurrency in
   * the onramp UI subject to {@code destination_currencies} if set.
   */
  @SerializedName("destination_currency")
  DestinationCurrency destinationCurrency;

  /**
   * The default destination crypto network.
   *
   * <p>* When left null, the first value of {@code destination_networks} is selected. * When set,
   * if {@code destination_networks} is also set, the value of {@code destination_network} must be
   * present in that array. To lock a {@code destination_network}, specify that value as the single
   * value for {@code destination_networks}. Users can select a different network in the onramp UI
   * subject to {@code destination_networks} if set.
   */
  @SerializedName("destination_network")
  DestinationNetwork destinationNetwork;

  /**
   * The list of destination crypto networks user can choose from.
   *
   * <p>* When left null, all supported crypto networks are shown in the onramp UI. * When set, it
   * must be a non-empty array where values in the array are each a valid crypto network. It can be
   * used to lock users to a specific network by passing a single value array. Users
   * <strong>cannot</strong> override this parameter.
   */
  @SerializedName("destination_networks")
  List<OnrampSessionCreateParams.DestinationNetwork> destinationNetworks;

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

  /**
   * Pre-populate some of the required KYC information for the user if you've already collected it
   * within your application.
   *
   * <p>Related guide: <a
   * href="https://docs.stripe.com/crypto/using-the-api#how-to-pre-populate-customer-information">Using
   * the API</a>
   */
  @SerializedName("kyc_details")
  KycDetails kycDetails;

  /**
   * Whether or not to lock the suggested wallet address. If destination tags are provided, this
   * will also lock the destination tags.
   */
  @SerializedName("lock_wallet_address")
  Boolean lockWalletAddress;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Speed at which the cryptocurrency is delivered to the wallet One of: {@code instant} (default):
   * crypto is delivered when payment is confirmed {@code standard}: crypto is delivered when
   * payment settles.
   */
  @SerializedName("settlement_speed")
  SettlementSpeed settlementSpeed;

  /**
   * The default amount of fiat (in decimal) to exchange into crypto.
   *
   * <p>* When left null, a default value is computed if {@code destination_amount} is set. * When
   * set, setting {@code source_amount} is mutually exclusive with setting {@code
   * destination_amount} (only one or the other is supported). We don't support fractional pennies.
   * If fractional minor units of a currency are passed in, it generates an error. Users can update
   * the value in the onramp UI.
   */
  @SerializedName("source_amount")
  String sourceAmount;

  /**
   * The default source fiat currency for the onramp session.
   *
   * <p>* When left null, a default currency is selected based on user locale. * When set, it must
   * be one of the fiat currencies supported by onramp. Users can still select a different currency
   * in the onramp UI.
   */
  @SerializedName("source_currency")
  SourceCurrency sourceCurrency;

  /**
   * The end customer's crypto wallet address (for each network) to use for this transaction.
   *
   * <p>* When left null, the user enters their wallet in the onramp UI. * When set, the platform
   * must set either {@code destination_networks} or {@code destination_network} and we perform
   * address validation. Users can still select a different wallet in the onramp UI.
   */
  @SerializedName("wallet_addresses")
  WalletAddresses walletAddresses;

  private OnrampSessionCreateParams(
      String customerIpAddress,
      String destinationAmount,
      List<OnrampSessionCreateParams.DestinationCurrency> destinationCurrencies,
      DestinationCurrency destinationCurrency,
      DestinationNetwork destinationNetwork,
      List<OnrampSessionCreateParams.DestinationNetwork> destinationNetworks,
      List<String> expand,
      Map<String, Object> extraParams,
      KycDetails kycDetails,
      Boolean lockWalletAddress,
      Map<String, String> metadata,
      SettlementSpeed settlementSpeed,
      String sourceAmount,
      SourceCurrency sourceCurrency,
      WalletAddresses walletAddresses) {
    this.customerIpAddress = customerIpAddress;
    this.destinationAmount = destinationAmount;
    this.destinationCurrencies = destinationCurrencies;
    this.destinationCurrency = destinationCurrency;
    this.destinationNetwork = destinationNetwork;
    this.destinationNetworks = destinationNetworks;
    this.expand = expand;
    this.extraParams = extraParams;
    this.kycDetails = kycDetails;
    this.lockWalletAddress = lockWalletAddress;
    this.metadata = metadata;
    this.settlementSpeed = settlementSpeed;
    this.sourceAmount = sourceAmount;
    this.sourceCurrency = sourceCurrency;
    this.walletAddresses = walletAddresses;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customerIpAddress;

    private String destinationAmount;

    private List<OnrampSessionCreateParams.DestinationCurrency> destinationCurrencies;

    private DestinationCurrency destinationCurrency;

    private DestinationNetwork destinationNetwork;

    private List<OnrampSessionCreateParams.DestinationNetwork> destinationNetworks;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private KycDetails kycDetails;

    private Boolean lockWalletAddress;

    private Map<String, String> metadata;

    private SettlementSpeed settlementSpeed;

    private String sourceAmount;

    private SourceCurrency sourceCurrency;

    private WalletAddresses walletAddresses;

    /** Finalize and obtain parameter instance from this builder. */
    public OnrampSessionCreateParams build() {
      return new OnrampSessionCreateParams(
          this.customerIpAddress,
          this.destinationAmount,
          this.destinationCurrencies,
          this.destinationCurrency,
          this.destinationNetwork,
          this.destinationNetworks,
          this.expand,
          this.extraParams,
          this.kycDetails,
          this.lockWalletAddress,
          this.metadata,
          this.settlementSpeed,
          this.sourceAmount,
          this.sourceCurrency,
          this.walletAddresses);
    }

    /**
     * The IP address of the customer the platform intends to onramp.
     *
     * <p>If the user's IP is in a region we can't support, we return an {@code HTTP 400} with an
     * appropriate error code.
     *
     * <p>We support IPv4 and IPv6 addresses. Geographic supportability is checked again later in
     * the onramp flow, which provides a way to hide the onramp option from ineligible users for a
     * better user experience.
     */
    public Builder setCustomerIpAddress(String customerIpAddress) {
      this.customerIpAddress = customerIpAddress;
      return this;
    }

    /**
     * The default amount of crypto to exchange into.
     *
     * <p>* When left null, a default value is computed if {@code source_amount}, {@code
     * destination_currency}, and {@code destination_network} are set. * When set, both {@code
     * destination_currency} and {@code destination_network} must also be set. All cryptocurrencies
     * are supported to their full precisions (for example, 18 decimal places for {@code eth}). We
     * validate and generate an error if the amount exceeds the supported precision based on the
     * exchange currency. Setting {@code source_amount} is mutually exclusive with setting {@code
     * destination_amount} (only one or the other is supported). Users can update the amount in the
     * onramp UI.
     */
    public Builder setDestinationAmount(String destinationAmount) {
      this.destinationAmount = destinationAmount;
      return this;
    }

    /**
     * Add an element to `destinationCurrencies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link OnrampSessionCreateParams#destinationCurrencies} for the field documentation.
     */
    public Builder addDestinationCurrency(OnrampSessionCreateParams.DestinationCurrency element) {
      if (this.destinationCurrencies == null) {
        this.destinationCurrencies = new ArrayList<>();
      }
      this.destinationCurrencies.add(element);
      return this;
    }

    /**
     * Add all elements to `destinationCurrencies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link OnrampSessionCreateParams#destinationCurrencies} for the field documentation.
     */
    public Builder addAllDestinationCurrency(
        List<OnrampSessionCreateParams.DestinationCurrency> elements) {
      if (this.destinationCurrencies == null) {
        this.destinationCurrencies = new ArrayList<>();
      }
      this.destinationCurrencies.addAll(elements);
      return this;
    }

    /**
     * The default destination cryptocurrency.
     *
     * <p>* When left null, the first value of {@code destination_currencies} is selected. * When
     * set, if {@code destination_currencies} is also set, the value of {@code destination_currency}
     * must be present in that array. To lock a {@code destination_currency}, specify that value as
     * the single value for {@code destination_currencies}. Users can select a different
     * cryptocurrency in the onramp UI subject to {@code destination_currencies} if set.
     */
    public Builder setDestinationCurrency(
        OnrampSessionCreateParams.DestinationCurrency destinationCurrency) {
      this.destinationCurrency = destinationCurrency;
      return this;
    }

    /**
     * The default destination crypto network.
     *
     * <p>* When left null, the first value of {@code destination_networks} is selected. * When set,
     * if {@code destination_networks} is also set, the value of {@code destination_network} must be
     * present in that array. To lock a {@code destination_network}, specify that value as the
     * single value for {@code destination_networks}. Users can select a different network in the
     * onramp UI subject to {@code destination_networks} if set.
     */
    public Builder setDestinationNetwork(
        OnrampSessionCreateParams.DestinationNetwork destinationNetwork) {
      this.destinationNetwork = destinationNetwork;
      return this;
    }

    /**
     * Add an element to `destinationNetworks` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link OnrampSessionCreateParams#destinationNetworks} for the field documentation.
     */
    public Builder addDestinationNetwork(OnrampSessionCreateParams.DestinationNetwork element) {
      if (this.destinationNetworks == null) {
        this.destinationNetworks = new ArrayList<>();
      }
      this.destinationNetworks.add(element);
      return this;
    }

    /**
     * Add all elements to `destinationNetworks` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link OnrampSessionCreateParams#destinationNetworks} for the field documentation.
     */
    public Builder addAllDestinationNetwork(
        List<OnrampSessionCreateParams.DestinationNetwork> elements) {
      if (this.destinationNetworks == null) {
        this.destinationNetworks = new ArrayList<>();
      }
      this.destinationNetworks.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OnrampSessionCreateParams#expand} for the field documentation.
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
     * OnrampSessionCreateParams#expand} for the field documentation.
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
     * OnrampSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link OnrampSessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Pre-populate some of the required KYC information for the user if you've already collected it
     * within your application.
     *
     * <p>Related guide: <a
     * href="https://docs.stripe.com/crypto/using-the-api#how-to-pre-populate-customer-information">Using
     * the API</a>
     */
    public Builder setKycDetails(OnrampSessionCreateParams.KycDetails kycDetails) {
      this.kycDetails = kycDetails;
      return this;
    }

    /**
     * Whether or not to lock the suggested wallet address. If destination tags are provided, this
     * will also lock the destination tags.
     */
    public Builder setLockWalletAddress(Boolean lockWalletAddress) {
      this.lockWalletAddress = lockWalletAddress;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OnrampSessionCreateParams#metadata} for the field documentation.
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
     * See {@link OnrampSessionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Speed at which the cryptocurrency is delivered to the wallet One of: {@code instant}
     * (default): crypto is delivered when payment is confirmed {@code standard}: crypto is
     * delivered when payment settles.
     */
    public Builder setSettlementSpeed(OnrampSessionCreateParams.SettlementSpeed settlementSpeed) {
      this.settlementSpeed = settlementSpeed;
      return this;
    }

    /**
     * The default amount of fiat (in decimal) to exchange into crypto.
     *
     * <p>* When left null, a default value is computed if {@code destination_amount} is set. * When
     * set, setting {@code source_amount} is mutually exclusive with setting {@code
     * destination_amount} (only one or the other is supported). We don't support fractional
     * pennies. If fractional minor units of a currency are passed in, it generates an error. Users
     * can update the value in the onramp UI.
     */
    public Builder setSourceAmount(String sourceAmount) {
      this.sourceAmount = sourceAmount;
      return this;
    }

    /**
     * The default source fiat currency for the onramp session.
     *
     * <p>* When left null, a default currency is selected based on user locale. * When set, it must
     * be one of the fiat currencies supported by onramp. Users can still select a different
     * currency in the onramp UI.
     */
    public Builder setSourceCurrency(OnrampSessionCreateParams.SourceCurrency sourceCurrency) {
      this.sourceCurrency = sourceCurrency;
      return this;
    }

    /**
     * The end customer's crypto wallet address (for each network) to use for this transaction.
     *
     * <p>* When left null, the user enters their wallet in the onramp UI. * When set, the platform
     * must set either {@code destination_networks} or {@code destination_network} and we perform
     * address validation. Users can still select a different wallet in the onramp UI.
     */
    public Builder setWalletAddresses(OnrampSessionCreateParams.WalletAddresses walletAddresses) {
      this.walletAddresses = walletAddresses;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class KycDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private KycDetails(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OnrampSessionCreateParams.KycDetails build() {
        return new OnrampSessionCreateParams.KycDetails(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OnrampSessionCreateParams.KycDetails#extraParams} for the field documentation.
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
       * See {@link OnrampSessionCreateParams.KycDetails#extraParams} for the field documentation.
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class WalletAddresses {
    /**
     * The end customer's crypto wallet destination tag (for each network) to use for this
     * transaction. This only applies for tag-based assets such as XLM.
     *
     * <p>* When left null, the user enters their wallet in the onramp UI.
     */
    @SerializedName("destination_tags")
    DestinationTags destinationTags;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private WalletAddresses(DestinationTags destinationTags, Map<String, Object> extraParams) {
      this.destinationTags = destinationTags;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DestinationTags destinationTags;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OnrampSessionCreateParams.WalletAddresses build() {
        return new OnrampSessionCreateParams.WalletAddresses(
            this.destinationTags, this.extraParams);
      }

      /**
       * The end customer's crypto wallet destination tag (for each network) to use for this
       * transaction. This only applies for tag-based assets such as XLM.
       *
       * <p>* When left null, the user enters their wallet in the onramp UI.
       */
      public Builder setDestinationTags(
          OnrampSessionCreateParams.WalletAddresses.DestinationTags destinationTags) {
        this.destinationTags = destinationTags;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OnrampSessionCreateParams.WalletAddresses#extraParams} for the field documentation.
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
       * See {@link OnrampSessionCreateParams.WalletAddresses#extraParams} for the field
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
    public static class DestinationTags {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("stellar")
      String stellar;

      private DestinationTags(Map<String, Object> extraParams, String stellar) {
        this.extraParams = extraParams;
        this.stellar = stellar;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String stellar;

        /** Finalize and obtain parameter instance from this builder. */
        public OnrampSessionCreateParams.WalletAddresses.DestinationTags build() {
          return new OnrampSessionCreateParams.WalletAddresses.DestinationTags(
              this.extraParams, this.stellar);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OnrampSessionCreateParams.WalletAddresses.DestinationTags#extraParams}
         * for the field documentation.
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
         * map. See {@link OnrampSessionCreateParams.WalletAddresses.DestinationTags#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setStellar(String stellar) {
          this.stellar = stellar;
          return this;
        }
      }
    }
  }

  public enum DestinationCurrency implements ApiRequestParams.EnumParam {
    @SerializedName("avax")
    AVAX("avax"),

    @SerializedName("btc")
    BTC("btc"),

    @SerializedName("eth")
    ETH("eth"),

    @SerializedName("matic")
    MATIC("matic"),

    @SerializedName("sol")
    SOL("sol"),

    @SerializedName("usdc")
    USDC("usdc"),

    @SerializedName("usdt")
    USDT("usdt"),

    @SerializedName("wld")
    WLD("wld"),

    @SerializedName("xlm")
    XLM("xlm");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DestinationCurrency(String value) {
      this.value = value;
    }
  }

  public enum DestinationNetwork implements ApiRequestParams.EnumParam {
    @SerializedName("avalanche")
    AVALANCHE("avalanche"),

    @SerializedName("base")
    BASE("base"),

    @SerializedName("bitcoin")
    BITCOIN("bitcoin"),

    @SerializedName("celo")
    CELO("celo"),

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

    @SerializedName("sui")
    SUI("sui"),

    @SerializedName("tempo")
    TEMPO("tempo"),

    @SerializedName("worldchain")
    WORLDCHAIN("worldchain");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DestinationNetwork(String value) {
      this.value = value;
    }
  }

  public enum SettlementSpeed implements ApiRequestParams.EnumParam {
    @SerializedName("instant")
    INSTANT("instant"),

    @SerializedName("standard")
    STANDARD("standard");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SettlementSpeed(String value) {
      this.value = value;
    }
  }

  public enum SourceCurrency implements ApiRequestParams.EnumParam {
    @SerializedName("eur")
    EUR("eur"),

    @SerializedName("gbp")
    GBP("gbp"),

    @SerializedName("usd")
    USD("usd");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SourceCurrency(String value) {
      this.value = value;
    }
  }
}
