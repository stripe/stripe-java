// File generated from our OpenAPI spec
package com.stripe.service.reserve;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.reserve.Release;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reserve.ReleaseListParams;
import com.stripe.param.reserve.ReleaseRetrieveParams;

public final class ReleaseService extends ApiService {
  public ReleaseService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public StripeCollection<Release> list(ReleaseListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public StripeCollection<Release> list(RequestOptions options) throws StripeException {
    return list((ReleaseListParams) null, options);
  }
  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public StripeCollection<Release> list() throws StripeException {
    return list((ReleaseListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public StripeCollection<Release> list(ReleaseListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reserve/releases";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Release>>() {}.getType());
  }
  /** Retrieve a ReserveRelease. */
  public Release retrieve(String id, ReleaseRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a ReserveRelease. */
  public Release retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReleaseRetrieveParams) null, options);
  }
  /** Retrieve a ReserveRelease. */
  public Release retrieve(String id) throws StripeException {
    return retrieve(id, (ReleaseRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a ReserveRelease. */
  public Release retrieve(String id, ReleaseRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/releases/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Release.class);
  }
}
