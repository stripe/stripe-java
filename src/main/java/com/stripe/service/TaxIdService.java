// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxIdCreateParams;
import com.stripe.param.TaxIdListParams;
import com.stripe.param.TaxIdRetrieveParams;

public final class TaxIdService extends ApiService {
  public TaxIdService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Deletes an existing account or customer {@code tax_id} object. */
  public TaxId delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax_ids/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, TaxId.class);
  }
  /** Retrieves an account or customer {@code tax_id} object. */
  public TaxId retrieve(String id, TaxIdRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an account or customer {@code tax_id} object. */
  public TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TaxIdRetrieveParams) null, options);
  }
  /** Retrieves an account or customer {@code tax_id} object. */
  public TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (TaxIdRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an account or customer {@code tax_id} object. */
  public TaxId retrieve(String id, TaxIdRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_ids/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, TaxId.class);
  }
  /** Returns a list of tax IDs. */
  public StripeCollection<TaxId> list(TaxIdListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of tax IDs. */
  public StripeCollection<TaxId> list(RequestOptions options) throws StripeException {
    return list((TaxIdListParams) null, options);
  }
  /** Returns a list of tax IDs. */
  public StripeCollection<TaxId> list() throws StripeException {
    return list((TaxIdListParams) null, (RequestOptions) null);
  }
  /** Returns a list of tax IDs. */
  public StripeCollection<TaxId> list(TaxIdListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_ids";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<TaxId>>() {}.getType());
  }
  /** Creates a new account or customer {@code tax_id} object. */
  public TaxId create(TaxIdCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new account or customer {@code tax_id} object. */
  public TaxId create(TaxIdCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/tax_ids";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, TaxId.class);
  }
}
