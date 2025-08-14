// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.RateCard;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.RateCardCreateParams;
import com.stripe.param.v2.billing.RateCardListParams;
import com.stripe.param.v2.billing.RateCardUpdateParams;

public final class RateCardService extends ApiService {
  public RateCardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all RateCard objects. */
  public StripeCollection<RateCard> list(RateCardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all RateCard objects. */
  public StripeCollection<RateCard> list(RequestOptions options) throws StripeException {
    return list((RateCardListParams) null, options);
  }
  /** List all RateCard objects. */
  public StripeCollection<RateCard> list() throws StripeException {
    return list((RateCardListParams) null, (RequestOptions) null);
  }
  /** List all RateCard objects. */
  public StripeCollection<RateCard> list(RateCardListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/rate_cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RateCard>>() {}.getType());
  }
  /** Create a RateCard object. */
  public RateCard create(RateCardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a RateCard object. */
  public RateCard create(RateCardCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/rate_cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCard.class);
  }
  /** Retrieve the latest version of a RateCard object. */
  public RateCard retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve the latest version of a RateCard object. */
  public RateCard retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/rate_cards/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RateCard.class);
  }
  /** Update a RateCard object. */
  public RateCard update(String id, RateCardUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a RateCard object. */
  public RateCard update(String id, RequestOptions options) throws StripeException {
    return update(id, (RateCardUpdateParams) null, options);
  }
  /** Update a RateCard object. */
  public RateCard update(String id) throws StripeException {
    return update(id, (RateCardUpdateParams) null, (RequestOptions) null);
  }
  /** Update a RateCard object. */
  public RateCard update(String id, RateCardUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/rate_cards/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCard.class);
  }

  public com.stripe.service.v2.billing.ratecards.RateService rates() {
    return new com.stripe.service.v2.billing.ratecards.RateService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.ratecards.VersionService versions() {
    return new com.stripe.service.v2.billing.ratecards.VersionService(this.getResponseGetter());
  }
}
