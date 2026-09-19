// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Capability;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountCapabilityListParams;
import com.stripe.param.AccountCapabilityRetrieveParams;
import com.stripe.param.AccountCapabilityUpdateParams;

public final class AccountCapabilityService extends ApiService {
  public AccountCapabilityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String id, AccountCapabilityListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (AccountCapabilityListParams) null, options);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String id) throws StripeException {
    return list(id, (AccountCapabilityListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(
      String id, AccountCapabilityListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Capability>>() {}.getType());
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String accountId, String id, AccountCapabilityRetrieveParams params)
      throws StripeException {
    return retrieve(accountId, id, params, (RequestOptions) null);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String accountId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(accountId, id, (AccountCapabilityRetrieveParams) null, options);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String accountId, String id) throws StripeException {
    return retrieve(accountId, id, (AccountCapabilityRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(
      String accountId, String id, AccountCapabilityRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Capability.class);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String accountId, String id, AccountCapabilityUpdateParams params)
      throws StripeException {
    return update(accountId, id, params, (RequestOptions) null);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String accountId, String id, RequestOptions options)
      throws StripeException {
    return update(accountId, id, (AccountCapabilityUpdateParams) null, options);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String accountId, String id) throws StripeException {
    return update(accountId, id, (AccountCapabilityUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(
      String accountId, String id, AccountCapabilityUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Capability.class);
  }
}
