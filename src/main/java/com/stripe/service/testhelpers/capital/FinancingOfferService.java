// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.capital;

import com.stripe.exception.StripeException;
import com.stripe.model.capital.FinancingOffer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingOfferCreateParams;
import com.stripe.param.capital.FinancingOfferRefillParams;

public final class FinancingOfferService extends ApiService {
  public FinancingOfferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a test financing offer for a connected account. */
  public FinancingOffer create(FinancingOfferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a test financing offer for a connected account. */
  public FinancingOffer create(FinancingOfferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/capital/financing_offers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancingOffer.class);
  }
  /** Refills a test financing offer for a connected account. */
  public FinancingOffer refill(String financingOffer, FinancingOfferRefillParams params)
      throws StripeException {
    return refill(financingOffer, params, (RequestOptions) null);
  }
  /** Refills a test financing offer for a connected account. */
  public FinancingOffer refill(
      String financingOffer, FinancingOfferRefillParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/capital/financing_offers/%s/refill",
            ApiResource.urlEncodeId(financingOffer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancingOffer.class);
  }
}
