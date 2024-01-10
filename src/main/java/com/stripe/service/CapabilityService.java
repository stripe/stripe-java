// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Capability;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CapabilityListParams;
import com.stripe.param.CapabilityRetrieveParams;
import com.stripe.param.CapabilityUpdateParams;

public final class CapabilityService extends ApiService {
  public CapabilityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String account, CapabilityListParams params)
      throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String account, RequestOptions options)
      throws StripeException {
    return list(account, (CapabilityListParams) null, options);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(String account) throws StripeException {
    return list(account, (CapabilityListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public StripeCollection<Capability> list(
      String account, CapabilityListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Capability>>() {}.getType());
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String account, String capability, CapabilityRetrieveParams params)
      throws StripeException {
    return retrieve(account, capability, params, (RequestOptions) null);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String account, String capability, RequestOptions options)
      throws StripeException {
    return retrieve(account, capability, (CapabilityRetrieveParams) null, options);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String account, String capability) throws StripeException {
    return retrieve(account, capability, (CapabilityRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(
      String account, String capability, CapabilityRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(capability));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String account, String capability, CapabilityUpdateParams params)
      throws StripeException {
    return update(account, capability, params, (RequestOptions) null);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String account, String capability, RequestOptions options)
      throws StripeException {
    return update(account, capability, (CapabilityUpdateParams) null, options);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(String account, String capability) throws StripeException {
    return update(account, capability, (CapabilityUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(
      String account, String capability, CapabilityUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(capability));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }
}
