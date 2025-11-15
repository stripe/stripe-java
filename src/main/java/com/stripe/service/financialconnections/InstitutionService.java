// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Institution;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.InstitutionListParams;
import com.stripe.param.financialconnections.InstitutionRetrieveParams;

public final class InstitutionService extends ApiService {
  public InstitutionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Financial Connections {@code Institution} objects. */
  public StripeCollection<Institution> list(InstitutionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Financial Connections {@code Institution} objects. */
  public StripeCollection<Institution> list(RequestOptions options) throws StripeException {
    return list((InstitutionListParams) null, options);
  }
  /** Returns a list of Financial Connections {@code Institution} objects. */
  public StripeCollection<Institution> list() throws StripeException {
    return list((InstitutionListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Financial Connections {@code Institution} objects. */
  public StripeCollection<Institution> list(InstitutionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/institutions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Institution>>() {}.getType());
  }
  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public Institution retrieve(String institution, InstitutionRetrieveParams params)
      throws StripeException {
    return retrieve(institution, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public Institution retrieve(String institution, RequestOptions options) throws StripeException {
    return retrieve(institution, (InstitutionRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public Institution retrieve(String institution) throws StripeException {
    return retrieve(institution, (InstitutionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public Institution retrieve(
      String institution, InstitutionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/institutions/%s", ApiResource.urlEncodeId(institution));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Institution.class);
  }
}
