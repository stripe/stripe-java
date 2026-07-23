// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.crypto.DepositAddress;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.DepositAddressCreateParams;
import com.stripe.param.crypto.DepositAddressListParams;
import com.stripe.param.crypto.DepositAddressRetrieveParams;

public final class DepositAddressService extends ApiService {
  public DepositAddressService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public StripeCollection<DepositAddress> list(DepositAddressListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public StripeCollection<DepositAddress> list(RequestOptions options) throws StripeException {
    return list((DepositAddressListParams) null, options);
  }
  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public StripeCollection<DepositAddress> list() throws StripeException {
    return list((DepositAddressListParams) null, (RequestOptions) null);
  }
  /**
   * Lists crypto deposit addresses for the authenticated merchant. Supports cursor-based pagination
   * and optional filtering by customer, network, or on-chain address.
   */
  public StripeCollection<DepositAddress> list(
      DepositAddressListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<DepositAddress>>() {}.getType());
  }
  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public DepositAddress create(DepositAddressCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new crypto deposit address for the authenticated merchant on the specified network.
   * The returned address can be used across multiple PaymentIntents.
   */
  public DepositAddress create(DepositAddressCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/deposit_addresses";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DepositAddress.class);
  }
  /** Retrieves the details of an existing crypto deposit address by ID. */
  public DepositAddress retrieve(String id, DepositAddressRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing crypto deposit address by ID. */
  public DepositAddress retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (DepositAddressRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing crypto deposit address by ID. */
  public DepositAddress retrieve(String id) throws StripeException {
    return retrieve(id, (DepositAddressRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing crypto deposit address by ID. */
  public DepositAddress retrieve(
      String id, DepositAddressRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/deposit_addresses/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DepositAddress.class);
  }
}
