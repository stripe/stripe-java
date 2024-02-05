// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.CustomerEntitlementSummary;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerEntitlementSummaryRetrieveParams;

public final class CustomerEntitlementSummaryService extends ApiService {
  public CustomerEntitlementSummaryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve the entitlement summary for a customer. */
  public CustomerEntitlementSummary retrieve(
      String customer, CustomerEntitlementSummaryRetrieveParams params) throws StripeException {
    return retrieve(customer, params, (RequestOptions) null);
  }
  /** Retrieve the entitlement summary for a customer. */
  public CustomerEntitlementSummary retrieve(String customer, RequestOptions options)
      throws StripeException {
    return retrieve(customer, (CustomerEntitlementSummaryRetrieveParams) null, options);
  }
  /** Retrieve the entitlement summary for a customer. */
  public CustomerEntitlementSummary retrieve(String customer) throws StripeException {
    return retrieve(
        customer, (CustomerEntitlementSummaryRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve the entitlement summary for a customer. */
  public CustomerEntitlementSummary retrieve(
      String customer, CustomerEntitlementSummaryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/entitlement_summary", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CustomerEntitlementSummary.class);
  }
}
