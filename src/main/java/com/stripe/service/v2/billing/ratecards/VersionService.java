// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.ratecards;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.RateCardVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ratecards.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * List the versions of a Rate Card object. Results are sorted in reverse chronological order
   * (most recent first).
   */
  public StripeCollection<RateCardVersion> list(String rateCardId, VersionListParams params)
      throws StripeException {
    return list(rateCardId, params, (RequestOptions) null);
  }
  /**
   * List the versions of a Rate Card object. Results are sorted in reverse chronological order
   * (most recent first).
   */
  public StripeCollection<RateCardVersion> list(String rateCardId, RequestOptions options)
      throws StripeException {
    return list(rateCardId, (VersionListParams) null, options);
  }
  /**
   * List the versions of a Rate Card object. Results are sorted in reverse chronological order
   * (most recent first).
   */
  public StripeCollection<RateCardVersion> list(String rateCardId) throws StripeException {
    return list(rateCardId, (VersionListParams) null, (RequestOptions) null);
  }
  /**
   * List the versions of a Rate Card object. Results are sorted in reverse chronological order
   * (most recent first).
   */
  public StripeCollection<RateCardVersion> list(
      String rateCardId, VersionListParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/rate_cards/%s/versions", ApiResource.urlEncodeId(rateCardId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RateCardVersion>>() {}.getType());
  }
  /** Retrieve a specific version of a Rate Card object. */
  public RateCardVersion retrieve(String rateCardId, String id) throws StripeException {
    return retrieve(rateCardId, id, (RequestOptions) null);
  }
  /** Retrieve a specific version of a Rate Card object. */
  public RateCardVersion retrieve(String rateCardId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/versions/%s",
            ApiResource.urlEncodeId(rateCardId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RateCardVersion.class);
  }
}
