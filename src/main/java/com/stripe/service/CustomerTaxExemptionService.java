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
  public CustomerTaxExemption delete(String customerId, String id) throws StripeException {
    return delete(customerId, id, (RequestOptions) null);
  }
  /** Delete a location specific tax exemption for a customer. */
  public CustomerTaxExemption delete(String customerId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customerId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, CustomerTaxExemption.class);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(
      String customerId, String id, CustomerTaxExemptionRetrieveParams params)
      throws StripeException {
    return retrieve(customerId, id, params, (RequestOptions) null);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(String customerId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customerId, id, (CustomerTaxExemptionRetrieveParams) null, options);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(String customerId, String id) throws StripeException {
    return retrieve(
        customerId, id, (CustomerTaxExemptionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a location specific tax exemption for a customer. */
  public CustomerTaxExemption retrieve(
      String customerId,
      String id,
      CustomerTaxExemptionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_exemptions/%s",
            ApiResource.urlEncodeId(customerId), ApiResource.urlEncodeId(id));
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
      String id, CustomerTaxExemptionListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CustomerTaxExemptionListParams) null, options);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(String id) throws StripeException {
    return list(id, (CustomerTaxExemptionListParams) null, (RequestOptions) null);
  }
  /** List all location specific tax exemptions for a customer. */
  public StripeCollection<CustomerTaxExemption> list(
      String id, CustomerTaxExemptionListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(id));
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
  public CustomerTaxExemption create(String id, CustomerTaxExemptionCreateParams params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }
  /** Create a location specific tax exemption for a customer. */
  public CustomerTaxExemption create(
      String id, CustomerTaxExemptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/tax_exemptions", ApiResource.urlEncodeId(id));
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
