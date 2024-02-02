// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerEntitlement;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerEntitlementListParams;

public final class CustomerEntitlementService extends ApiService {
  public CustomerEntitlementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of entitlements for a customer. */
  public StripeCollection<CustomerEntitlement> list(
      String customer, CustomerEntitlementListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** Retrieve a list of entitlements for a customer. */
  public StripeCollection<CustomerEntitlement> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerEntitlementListParams) null, options);
  }
  /** Retrieve a list of entitlements for a customer. */
  public StripeCollection<CustomerEntitlement> list(String customer) throws StripeException {
    return list(customer, (CustomerEntitlementListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of entitlements for a customer. */
  public StripeCollection<CustomerEntitlement> list(
      String customer, CustomerEntitlementListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/entitlements", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<CustomerEntitlement>>() {}.getType());
  }
}
