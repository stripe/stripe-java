// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.Contract;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ContractActivateParams;
import com.stripe.param.v2.billing.ContractCancelParams;
import com.stripe.param.v2.billing.ContractCreateParams;
import com.stripe.param.v2.billing.ContractListParams;
import com.stripe.param.v2.billing.ContractRetrieveParams;
import com.stripe.param.v2.billing.ContractUpdateParams;

public final class ContractService extends ApiService {
  public ContractService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Contract objects with pagination. */
  public StripeCollection<Contract> list(ContractListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List Contract objects with pagination. */
  public StripeCollection<Contract> list(RequestOptions options) throws StripeException {
    return list((ContractListParams) null, options);
  }
  /** List Contract objects with pagination. */
  public StripeCollection<Contract> list() throws StripeException {
    return list((ContractListParams) null, (RequestOptions) null);
  }
  /** List Contract objects with pagination. */
  public StripeCollection<Contract> list(ContractListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/contracts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Contract>>() {}.getType());
  }
  /** Create a Contract object. */
  public Contract create(ContractCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Contract object. */
  public Contract create(ContractCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/contracts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Contract.class);
  }
  /** Retrieve a Contract object by ID. */
  public Contract retrieve(String id, ContractRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a Contract object by ID. */
  public Contract retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ContractRetrieveParams) null, options);
  }
  /** Retrieve a Contract object by ID. */
  public Contract retrieve(String id) throws StripeException {
    return retrieve(id, (ContractRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a Contract object by ID. */
  public Contract retrieve(String id, ContractRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/contracts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Contract.class);
  }
  /** Update a Contract object by ID. */
  public Contract update(String id, ContractUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a Contract object by ID. */
  public Contract update(String id, RequestOptions options) throws StripeException {
    return update(id, (ContractUpdateParams) null, options);
  }
  /** Update a Contract object by ID. */
  public Contract update(String id) throws StripeException {
    return update(id, (ContractUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Contract object by ID. */
  public Contract update(String id, ContractUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/contracts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Contract.class);
  }
  /** Activate a Draft Contract object by ID. */
  public Contract activate(String id, ContractActivateParams params) throws StripeException {
    return activate(id, params, (RequestOptions) null);
  }
  /** Activate a Draft Contract object by ID. */
  public Contract activate(String id, RequestOptions options) throws StripeException {
    return activate(id, (ContractActivateParams) null, options);
  }
  /** Activate a Draft Contract object by ID. */
  public Contract activate(String id) throws StripeException {
    return activate(id, (ContractActivateParams) null, (RequestOptions) null);
  }
  /** Activate a Draft Contract object by ID. */
  public Contract activate(String id, ContractActivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/contracts/%s/activate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Contract.class);
  }
  /** Cancel a Contract object by ID. */
  public Contract cancel(String id, ContractCancelParams params) throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancel a Contract object by ID. */
  public Contract cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (ContractCancelParams) null, options);
  }
  /** Cancel a Contract object by ID. */
  public Contract cancel(String id) throws StripeException {
    return cancel(id, (ContractCancelParams) null, (RequestOptions) null);
  }
  /** Cancel a Contract object by ID. */
  public Contract cancel(String id, ContractCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/contracts/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Contract.class);
  }

  public com.stripe.service.v2.billing.contracts.LicensePricingService licensePricing() {
    return new com.stripe.service.v2.billing.contracts.LicensePricingService(
        this.getResponseGetter());
  }
}
