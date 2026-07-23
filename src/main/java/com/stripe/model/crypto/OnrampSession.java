// File generated from our OpenAPI spec
package com.stripe.model.crypto;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.OnrampSessionCheckoutParams;
import com.stripe.param.crypto.OnrampSessionCreateParams;
import com.stripe.param.crypto.OnrampSessionListParams;
import com.stripe.param.crypto.OnrampSessionQuoteParams;
import com.stripe.param.crypto.OnrampSessionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Crypto Onramp Session represents your customer's session as they purchase cryptocurrency
 * through Stripe. Once payment is successful, Stripe will fulfill the delivery of cryptocurrency to
 * your user's wallet and contain a reference to the crypto transaction ID.
 *
 * <p>You can create an onramp session on your server and embed the widget on your frontend.
 * Alternatively, you can redirect your users to the standalone hosted onramp.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/crypto/integrate-the-onramp">Integrate the
 * onramp</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OnrampSession extends ApiResource implements HasId {
  /**
   * A client secret that can be used to drive a single session using our embedded widget.
   *
   * <p>Related guide: <a href="https://docs.stripe.com/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if any user kyc details were provided during the creation of the
   * onramp session. Otherwise, has the value {@code false}.
   */
  @SerializedName("kyc_details_provided")
  Boolean kycDetailsProvided;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.onramp_session}.
   */
  @SerializedName("object")
  String object;

  /**
   * Redirect your users to the URL for a prebuilt frontend integration of the crypto onramp on the
   * standalone hosted onramp.
   *
   * <p>Related guide: <a
   * href="https://docs.stripe.com/crypto/standalone-hosted-onramp#mint-a-session-with-a-redirect-url">Mint
   * a session with a redirect url</a>
   */
  @SerializedName("redirect_url")
  String redirectUrl;

  /**
   * The status of the Onramp Session. One of = {@code {initialized, rejected, requires_payment,
   * fulfillment_processing, fulfillment_complete}}
   */
  @SerializedName("status")
  String status;

  @SerializedName("transaction_details")
  TransactionDetails transactionDetails;

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout() throws StripeException {
    return checkout((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(RequestOptions options) throws StripeException {
    return checkout((Map<String, Object>) null, options);
  }

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(Map<String, Object> params) throws StripeException {
    return checkout(params, (RequestOptions) null);
  }

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/crypto/onramp_sessions/%s/checkout", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, OnrampSession.class);
  }

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(OnrampSessionCheckoutParams params) throws StripeException {
    return checkout(params, (RequestOptions) null);
  }

  /**
   * Completes a headless CryptoOnrampSession.
   *
   * <p>This method will attempt to confirm the payment and execute the quote to deliver the crypto
   * to the customer.
   */
  public OnrampSession checkout(OnrampSessionCheckoutParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/crypto/onramp_sessions/%s/checkout", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, OnrampSession.class);
  }

  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public static OnrampSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public static OnrampSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, OnrampSession.class);
  }

  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public static OnrampSession create(OnrampSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a CryptoOnrampSession object.
   *
   * <p>After the CryptoOnrampSession is created, display the onramp session modal using the {@code
   * client_secret}.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/crypto/integrate-the-onramp">Set up an
   * onramp integration</a>.
   */
  public static OnrampSession create(OnrampSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OnrampSession.class);
  }

  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public static OnrampSessionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public static OnrampSessionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OnrampSessionCollection.class);
  }

  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public static OnrampSessionCollection list(OnrampSessionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of onramp sessions that match the filter criteria. The onramp sessions are
   * returned in sorted order, with the most recent onramp sessions appearing first.
   */
  public static OnrampSessionCollection list(OnrampSessionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OnrampSessionCollection.class);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote() throws StripeException {
    return quote((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(RequestOptions options) throws StripeException {
    return quote((Map<String, Object>) null, options);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(Map<String, Object> params) throws StripeException {
    return quote(params, (RequestOptions) null);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/crypto/onramp_sessions/%s/quote", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, OnrampSession.class);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(OnrampSessionQuoteParams params) throws StripeException {
    return quote(params, (RequestOptions) null);
  }

  /** Refreshes an executable quote for a CryptoOnrampSession. */
  public OnrampSession quote(OnrampSessionQuoteParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/crypto/onramp_sessions/%s/quote", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, OnrampSession.class);
  }

  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public static OnrampSession retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public static OnrampSession retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public static OnrampSession retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/crypto/onramp_sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OnrampSession.class);
  }

  /** Retrieves the details of a CryptoOnrampSession that was previously created. */
  public static OnrampSession retrieve(
      String id, OnrampSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/onramp_sessions/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OnrampSession.class);
  }

  /**
   * For more details about TransactionDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionDetails extends StripeObject {
    /** The amount of crypto the customer will get deposited into their wallet. */
    @SerializedName("destination_amount")
    String destinationAmount;

    /**
     * If a platform wants to lock the currencies an session will support, they can add supported
     * currencies to this array. If left null, the experience will allow selection of all supported
     * destination currencies.
     */
    @SerializedName("destination_currencies")
    List<String> destinationCurrencies;

    /**
     * The selected {@code destination_currency} to convert the {@code source} to. This should be a
     * crypto currency code. If {@code destination_currencies} is set, it must be a value in that
     * array.
     *
     * <p>One of {@code avax}, {@code btc}, {@code eth}, {@code matic}, {@code sol}, {@code usdc},
     * {@code wld}, or {@code xlm}.
     */
    @SerializedName("destination_currency")
    String destinationCurrency;

    /**
     * The specific crypto network the {@code destination_currency} is settled on. If {@code
     * destination_networks} is set, it must be a value in that array.
     *
     * <p>One of {@code avalanche}, {@code base}, {@code bitcoin}, {@code ethereum}, {@code
     * optimism}, {@code polygon}, {@code solana}, {@code stellar}, {@code sui}, or {@code
     * worldchain}.
     */
    @SerializedName("destination_network")
    String destinationNetwork;

    /**
     * If a platform wants to lock the supported networks, they can do so through this array. If
     * left null, the experience will allow selection of all supported networks.
     */
    @SerializedName("destination_networks")
    List<String> destinationNetworks;

    /** Details about the fees associated with this transaction. */
    @SerializedName("fees")
    Fees fees;

    /** Whether or not to lock the suggested wallet address. */
    @SerializedName("lock_wallet_address")
    Boolean lockWalletAddress;

    /**
     * Speed at which the cryptocurrency is delivered to the wallet One of: {@code instant}
     * (default): crypto is delivered when payment is confirmed {@code standard}: crypto is
     * delivered when payment settles.
     */
    @SerializedName("settlement_speed")
    String settlementSpeed;

    /** The amount of fiat we intend to onramp - excluding fees. */
    @SerializedName("source_amount")
    String sourceAmount;

    /**
     * A fiat currency code
     *
     * <p>One of {@code eur}, {@code gbp}, or {@code usd}.
     */
    @SerializedName("source_currency")
    String sourceCurrency;

    /**
     * The on-chain transaction hash (also referred to as transaction ID or tx_hash) of the
     * transaction that was sent to the customer's wallet. The format varies by chain (e.g. {@code
     * 0xc257...1a95} on Ethereum, {@code 5UB1...v3xZ} on Solana, or {@code a1b2...bf00} on
     * Bitcoin). This will only be set if the session reaches {@code status=fulfillment_complete}
     * and we've transferred the crypto successfully to the external wallet.
     */
    @SerializedName("transaction_id")
    String transactionId;

    /** The consumer's wallet address (where crypto will be sent to). */
    @SerializedName("wallet_address")
    String walletAddress;

    /** The end customer's crypto wallet address (for each network) to use for this transaction. */
    @SerializedName("wallet_addresses")
    WalletAddresses walletAddresses;

    /**
     * For more details about Fees, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fees extends StripeObject {
      /**
       * The cost associated with moving crypto from Stripe to the end consumer's wallet. e.g: for
       * ETH, this is called 'gas fee', for BTC this is a 'miner's fee'.
       */
      @SerializedName("network_fee_amount")
      String networkFeeAmount;

      /** Fee for processing the transaction. */
      @SerializedName("transaction_fee_amount")
      String transactionFeeAmount;
    }

    /**
     * For more details about WalletAddresses, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class WalletAddresses extends StripeObject {
      /** An avalanche address. */
      @SerializedName("avalanche")
      String avalanche;

      /** A base address. */
      @SerializedName("base_network")
      String baseNetwork;

      /** A bitcoin address. */
      @SerializedName("bitcoin")
      String bitcoin;

      /**
       * The end customer's crypto wallet destination tag (for each network) to use for this
       * transaction.
       */
      @SerializedName("destination_tags")
      DestinationTags destinationTags;

      /** An ethereum address. */
      @SerializedName("ethereum")
      String ethereum;

      /** An optimism address. */
      @SerializedName("optimism")
      String optimism;

      /** A polygon address. */
      @SerializedName("polygon")
      String polygon;

      /** A solana address. */
      @SerializedName("solana")
      String solana;

      /** A stellar address. */
      @SerializedName("stellar")
      String stellar;

      /** A Sui address. */
      @SerializedName("sui")
      String sui;

      /** A worldchain address. */
      @SerializedName("worldchain")
      String worldchain;

      /**
       * For more details about DestinationTags, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DestinationTags extends StripeObject {
        /** A stellar destination tag. */
        @SerializedName("stellar")
        String stellar;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(transactionDetails, responseGetter);
  }
}
