// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerTaxExemption;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerTaxExemptionCreateParams;
import com.stripe.param.CustomerTaxExemptionListParams;
import com.stripe.param.CustomerTaxExemptionRetrieveParams;

public final class CustomerTaxExemptionService extends ApiService {
  public CustomerTaxExemptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(String customer, String id) throws StripeException {
    return delete(customer, id, (RequestOptions) null);
  }
  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(String customer, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, CustomerTaxExemption.class);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(
      String customer, String id, CustomerTaxExemptionRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(String customer, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customer, id, (CustomerTaxExemptionRetrieveParams) null, options);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(String customer, String id) throws StripeException {
    return retrieve(customer, id, (CustomerTaxExemptionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(
      String customer, String id, CustomerTaxExemptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomerTaxExemption.class);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(
      String customer, CustomerTaxExemptionListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerTaxExemptionListParams) null, options);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(String customer) throws StripeException {
    return list(customer, (CustomerTaxExemptionListParams) null, (RequestOptions) null);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(
      String customer, CustomerTaxExemptionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CustomerTaxExemption>>() {}.getType());
  }
  /** Create a location specific tax exemption for a customer. */
  public CustomerTaxExemption create(String customer, CustomerTaxExemptionCreateParams params)
      throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /** Create a location specific tax exemption for a customer. */
  public CustomerTaxExemption create(
      String customer, CustomerTaxExemptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomerTaxExemption.class);
  }
}
