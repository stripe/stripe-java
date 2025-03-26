// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.FinancialAccountNotOpenException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.FinancialAddress;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.FinancialAddressCreateParams;
import com.stripe.param.v2.moneymanagement.FinancialAddressListParams;
import com.stripe.param.v2.moneymanagement.FinancialAddressRetrieveParams;

public final class FinancialAddressService extends ApiService {
  public FinancialAddressService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a new FinancialAddress for a FinancialAccount. */
  public FinancialAddress create(FinancialAddressCreateParams params)
      throws StripeException, FinancialAccountNotOpenException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new FinancialAddress for a FinancialAccount. */
  public FinancialAddress create(FinancialAddressCreateParams params, RequestOptions options)
      throws StripeException, FinancialAccountNotOpenException {
    String path = "/v2/money_management/financial_addresses";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAddress.class);
  }
  /** List all FinancialAddresses for a FinancialAccount. */
  public StripeCollection<FinancialAddress> list(FinancialAddressListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all FinancialAddresses for a FinancialAccount. */
  public StripeCollection<FinancialAddress> list(RequestOptions options) throws StripeException {
    return list((FinancialAddressListParams) null, options);
  }
  /** List all FinancialAddresses for a FinancialAccount. */
  public StripeCollection<FinancialAddress> list() throws StripeException {
    return list((FinancialAddressListParams) null, (RequestOptions) null);
  }
  /** List all FinancialAddresses for a FinancialAccount. */
  public StripeCollection<FinancialAddress> list(
      FinancialAddressListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/financial_addresses";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FinancialAddress>>() {}.getType());
  }
  /**
   * Retrieve a FinancialAddress. By default, the FinancialAddress will be returned in it's
   * unexpanded state, revealing only the last 4 digits of the account number.
   */
  public FinancialAddress retrieve(String id, FinancialAddressRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieve a FinancialAddress. By default, the FinancialAddress will be returned in it's
   * unexpanded state, revealing only the last 4 digits of the account number.
   */
  public FinancialAddress retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FinancialAddressRetrieveParams) null, options);
  }
  /**
   * Retrieve a FinancialAddress. By default, the FinancialAddress will be returned in it's
   * unexpanded state, revealing only the last 4 digits of the account number.
   */
  public FinancialAddress retrieve(String id) throws StripeException {
    return retrieve(id, (FinancialAddressRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieve a FinancialAddress. By default, the FinancialAddress will be returned in it's
   * unexpanded state, revealing only the last 4 digits of the account number.
   */
  public FinancialAddress retrieve(
      String id, FinancialAddressRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/money_management/financial_addresses/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAddress.class);
  }
}
