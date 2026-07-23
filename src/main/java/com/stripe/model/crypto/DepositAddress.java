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
import com.stripe.param.crypto.DepositAddressCreateParams;
import com.stripe.param.crypto.DepositAddressListParams;
import com.stripe.param.crypto.DepositAddressRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A crypto deposit address is a blockchain address that can be used by a merchant for deposit mode
 * crypto payments.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DepositAddress extends ApiResource implements HasId {
  @SerializedName("address")
  String address;

  @SerializedName("created")
  Long created;

  @SerializedName("customer")
  String customer;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.deposit_address}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("supported_tokens")
  List<DepositAddress.SupportedToken> supportedTokens;

  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public static DepositAddress create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public static DepositAddress create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, DepositAddress.class);
  }

  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public static DepositAddress create(DepositAddressCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public static DepositAddress create(DepositAddressCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DepositAddress.class);
  }

  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public static DepositAddressCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public static DepositAddressCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DepositAddressCollection.class);
  }

  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public static DepositAddressCollection list(DepositAddressListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public static DepositAddressCollection list(
      DepositAddressListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DepositAddressCollection.class);
  }

  /** Retrieves the details of an existing crypto deposit address by ID. */
  public static DepositAddress retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing crypto deposit address by ID. */
  public static DepositAddress retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing crypto deposit address by ID. */
  public static DepositAddress retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/crypto/deposit_addresses/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DepositAddress.class);
  }

  /** Retrieves the details of an existing crypto deposit address by ID. */
  public static DepositAddress retrieve(
      String id, DepositAddressRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/deposit_addresses/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DepositAddress.class);
  }

  /**
   * For more details about SupportedToken, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SupportedToken extends StripeObject {
    /** The on-chain contract address for the supported token currency on this specific network. */
    @SerializedName("token_contract_address")
    String tokenContractAddress;

    /**
     * The supported token currency. Supported token currencies include: {@code usdc}.
     *
     * <p>Equal to {@code usdc}.
     */
    @SerializedName("token_currency")
    String tokenCurrency;
  }
}
