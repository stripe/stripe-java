// File generated from our OpenAPI spec
package com.stripe.model.crypto;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.crypto.CustomerConsumerWalletListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A consumer wallet represents a cryptocurrency wallet address associated with a Crypto Customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerConsumerWallet extends ApiResource implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The blockchain network for this wallet
   *
   * <p>One of {@code aptos}, {@code avalanche}, {@code base}, {@code bitcoin}, {@code ethereum},
   * {@code optimism}, {@code polygon}, {@code solana}, {@code stellar}, {@code sui}, {@code tempo},
   * or {@code worldchain}.
   */
  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.consumer_wallet}.
   */
  @SerializedName("object")
  String object;

  /** Whether ownership of this wallet has been verified. */
  @SerializedName("verified_ownership")
  Boolean verifiedOwnership;

  /** The wallet address. */
  @SerializedName("wallet_address")
  String walletAddress;

  /** Lists the Consumer Wallets for a Crypto Customer. */
  public static CustomerConsumerWalletCollection list(String id, Map<String, Object> params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists the Consumer Wallets for a Crypto Customer. */
  public static CustomerConsumerWalletCollection list(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/crypto/customers/%s/crypto_consumer_wallets", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerConsumerWalletCollection.class);
  }

  /** Lists the Consumer Wallets for a Crypto Customer. */
  public static CustomerConsumerWalletCollection list(
      String id, CustomerConsumerWalletListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists the Consumer Wallets for a Crypto Customer. */
  public static CustomerConsumerWalletCollection list(
      String id, CustomerConsumerWalletListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/crypto/customers/%s/crypto_consumer_wallets", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerConsumerWalletCollection.class);
  }
}
