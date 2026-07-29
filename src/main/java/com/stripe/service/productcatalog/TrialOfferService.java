// File generated from our OpenAPI spec
package com.stripe.service.productcatalog;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.productcatalog.TrialOffer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.productcatalog.TrialOfferCreateParams;
import com.stripe.param.productcatalog.TrialOfferListParams;
import com.stripe.param.productcatalog.TrialOfferRetrieveParams;

public final class TrialOfferService extends ApiService {
  public TrialOfferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of trial offers. */
  public StripeCollection<TrialOffer> list(TrialOfferListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of trial offers. */
  public StripeCollection<TrialOffer> list(RequestOptions options) throws StripeException {
    return list((TrialOfferListParams) null, options);
  }
  /** Returns a list of trial offers. */
  public StripeCollection<TrialOffer> list() throws StripeException {
    return list((TrialOfferListParams) null, (RequestOptions) null);
  }
  /** Returns a list of trial offers. */
  public StripeCollection<TrialOffer> list(TrialOfferListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/product_catalog/trial_offers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TrialOffer>>() {}.getType());
  }
  /** Creates a trial offer. */
  public TrialOffer create(TrialOfferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a trial offer. */
  public TrialOffer create(TrialOfferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/product_catalog/trial_offers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TrialOffer.class);
  }
  /** Retrieves the trial offer with the given ID. */
  public TrialOffer retrieve(String id, TrialOfferRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the trial offer with the given ID. */
  public TrialOffer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TrialOfferRetrieveParams) null, options);
  }
  /** Retrieves the trial offer with the given ID. */
  public TrialOffer retrieve(String id) throws StripeException {
    return retrieve(id, (TrialOfferRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the trial offer with the given ID. */
  public TrialOffer retrieve(String id, TrialOfferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/product_catalog/trial_offers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TrialOffer.class);
  }
}
