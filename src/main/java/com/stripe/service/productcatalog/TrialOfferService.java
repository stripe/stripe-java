// File generated from our OpenAPI spec
package com.stripe.service.productcatalog;

import com.stripe.exception.StripeException;
import com.stripe.model.productcatalog.TrialOffer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.productcatalog.TrialOfferCreateParams;

public final class TrialOfferService extends ApiService {
  public TrialOfferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
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
}
