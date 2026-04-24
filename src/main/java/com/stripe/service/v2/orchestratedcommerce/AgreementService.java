// File generated from our OpenAPI spec
package com.stripe.service.v2.orchestratedcommerce;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.orchestratedcommerce.Agreement;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.orchestratedcommerce.AgreementCreateParams;
import com.stripe.param.v2.orchestratedcommerce.AgreementListParams;

public final class AgreementService extends ApiService {
  public AgreementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Agreements for the profile associated with the authenticated merchant. */
  public StripeCollection<Agreement> list(AgreementListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List Agreements for the profile associated with the authenticated merchant. */
  public StripeCollection<Agreement> list(RequestOptions options) throws StripeException {
    return list((AgreementListParams) null, options);
  }
  /** List Agreements for the profile associated with the authenticated merchant. */
  public StripeCollection<Agreement> list() throws StripeException {
    return list((AgreementListParams) null, (RequestOptions) null);
  }
  /** List Agreements for the profile associated with the authenticated merchant. */
  public StripeCollection<Agreement> list(AgreementListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/orchestrated_commerce/agreements";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Agreement>>() {}.getType());
  }
  /** Create a new Agreement. */
  public Agreement create(AgreementCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new Agreement. */
  public Agreement create(AgreementCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/orchestrated_commerce/agreements";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Agreement.class);
  }
  /** Retrieve an Agreement by ID. */
  public Agreement retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an Agreement by ID. */
  public Agreement retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/orchestrated_commerce/agreements/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Agreement.class);
  }
  /** Confirm an Agreement. */
  public Agreement confirm(String id) throws StripeException {
    return confirm(id, (RequestOptions) null);
  }
  /** Confirm an Agreement. */
  public Agreement confirm(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/orchestrated_commerce/agreements/%s/confirm", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Agreement.class);
  }
  /** Terminate an Agreement. */
  public Agreement terminate(String id) throws StripeException {
    return terminate(id, (RequestOptions) null);
  }
  /** Terminate an Agreement. */
  public Agreement terminate(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/orchestrated_commerce/agreements/%s/terminate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Agreement.class);
  }
}
