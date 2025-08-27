// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.ratecards;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.RateCardRate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ratecards.RateCreateParams;
import com.stripe.param.v2.billing.ratecards.RateListParams;

public final class RateService extends ApiService {
  public RateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * List all Rates associated with a Rate Card for a specific version (defaults to latest). Rates
   * remain active for all subsequent versions until a new rate is created for the same Metered
   * Item.
   */
  public StripeCollection<RateCardRate> list(String rateCardId, RateListParams params)
      throws StripeException {
    return list(rateCardId, params, (RequestOptions) null);
  }
  /**
   * List all Rates associated with a Rate Card for a specific version (defaults to latest). Rates
   * remain active for all subsequent versions until a new rate is created for the same Metered
   * Item.
   */
  public StripeCollection<RateCardRate> list(String rateCardId, RequestOptions options)
      throws StripeException {
    return list(rateCardId, (RateListParams) null, options);
  }
  /**
   * List all Rates associated with a Rate Card for a specific version (defaults to latest). Rates
   * remain active for all subsequent versions until a new rate is created for the same Metered
   * Item.
   */
  public StripeCollection<RateCardRate> list(String rateCardId) throws StripeException {
    return list(rateCardId, (RateListParams) null, (RequestOptions) null);
  }
  /**
   * List all Rates associated with a Rate Card for a specific version (defaults to latest). Rates
   * remain active for all subsequent versions until a new rate is created for the same Metered
   * Item.
   */
  public StripeCollection<RateCardRate> list(
      String rateCardId, RateListParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/rate_cards/%s/rates", ApiResource.urlEncodeId(rateCardId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RateCardRate>>() {}.getType());
  }
  /**
   * Set the Rate for a Metered Item on the latest version of a Rate Card object. This will create a
   * new Rate Card version if the Metered Item already has a rate on the Rate Card.
   */
  public RateCardRate create(String rateCardId, RateCreateParams params) throws StripeException {
    return create(rateCardId, params, (RequestOptions) null);
  }
  /**
   * Set the Rate for a Metered Item on the latest version of a Rate Card object. This will create a
   * new Rate Card version if the Metered Item already has a rate on the Rate Card.
   */
  public RateCardRate create(String rateCardId, RequestOptions options) throws StripeException {
    return create(rateCardId, (RateCreateParams) null, options);
  }
  /**
   * Set the Rate for a Metered Item on the latest version of a Rate Card object. This will create a
   * new Rate Card version if the Metered Item already has a rate on the Rate Card.
   */
  public RateCardRate create(String rateCardId) throws StripeException {
    return create(rateCardId, (RateCreateParams) null, (RequestOptions) null);
  }
  /**
   * Set the Rate for a Metered Item on the latest version of a Rate Card object. This will create a
   * new Rate Card version if the Metered Item already has a rate on the Rate Card.
   */
  public RateCardRate create(String rateCardId, RateCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/billing/rate_cards/%s/rates", ApiResource.urlEncodeId(rateCardId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCardRate.class);
  }
  /**
   * Remove an existing Rate from a Rate Card. This will create a new Rate Card Version without that
   * Rate.
   */
  public RateCardRate delete(String rateCardId, String id) throws StripeException {
    return delete(rateCardId, id, (RequestOptions) null);
  }
  /**
   * Remove an existing Rate from a Rate Card. This will create a new Rate Card Version without that
   * Rate.
   */
  public RateCardRate delete(String rateCardId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/rates/%s",
            ApiResource.urlEncodeId(rateCardId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, RateCardRate.class);
  }
  /** Retrieve a Rate object. */
  public RateCardRate retrieve(String rateCardId, String id) throws StripeException {
    return retrieve(rateCardId, id, (RequestOptions) null);
  }
  /** Retrieve a Rate object. */
  public RateCardRate retrieve(String rateCardId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/rates/%s",
            ApiResource.urlEncodeId(rateCardId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RateCardRate.class);
  }
}
