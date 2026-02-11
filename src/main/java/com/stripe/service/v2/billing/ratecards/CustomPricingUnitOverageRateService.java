// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.ratecards;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.DeletedObject;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.RateCardCustomPricingUnitOverageRate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ratecards.CustomPricingUnitOverageRateCreateParams;
import com.stripe.param.v2.billing.ratecards.CustomPricingUnitOverageRateListParams;

public final class CustomPricingUnitOverageRateService extends ApiService {
  public CustomPricingUnitOverageRateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Rate Card Custom Pricing Unit Overage Rates on a Rate Card. */
  public StripeCollection<RateCardCustomPricingUnitOverageRate> list(
      String rateCardId, CustomPricingUnitOverageRateListParams params) throws StripeException {
    return list(rateCardId, params, (RequestOptions) null);
  }
  /** List all Rate Card Custom Pricing Unit Overage Rates on a Rate Card. */
  public StripeCollection<RateCardCustomPricingUnitOverageRate> list(
      String rateCardId, RequestOptions options) throws StripeException {
    return list(rateCardId, (CustomPricingUnitOverageRateListParams) null, options);
  }
  /** List all Rate Card Custom Pricing Unit Overage Rates on a Rate Card. */
  public StripeCollection<RateCardCustomPricingUnitOverageRate> list(String rateCardId)
      throws StripeException {
    return list(rateCardId, (CustomPricingUnitOverageRateListParams) null, (RequestOptions) null);
  }
  /** List all Rate Card Custom Pricing Unit Overage Rates on a Rate Card. */
  public StripeCollection<RateCardCustomPricingUnitOverageRate> list(
      String rateCardId, CustomPricingUnitOverageRateListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/custom_pricing_unit_overage_rates",
            ApiResource.urlEncodeId(rateCardId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request,
        new TypeToken<StripeCollection<RateCardCustomPricingUnitOverageRate>>() {}.getType());
  }
  /** Create a Rate Card Custom Pricing Unit Overage Rate on a Rate Card. */
  public RateCardCustomPricingUnitOverageRate create(
      String rateCardId, CustomPricingUnitOverageRateCreateParams params) throws StripeException {
    return create(rateCardId, params, (RequestOptions) null);
  }
  /** Create a Rate Card Custom Pricing Unit Overage Rate on a Rate Card. */
  public RateCardCustomPricingUnitOverageRate create(
      String rateCardId, CustomPricingUnitOverageRateCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/custom_pricing_unit_overage_rates",
            ApiResource.urlEncodeId(rateCardId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCardCustomPricingUnitOverageRate.class);
  }
  /** Delete a Rate Card Custom Pricing Unit Overage Rate from a Rate Card. */
  public DeletedObject delete(String rateCardId, String id) throws StripeException {
    return delete(rateCardId, id, (RequestOptions) null);
  }
  /** Delete a Rate Card Custom Pricing Unit Overage Rate from a Rate Card. */
  public DeletedObject delete(String rateCardId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/custom_pricing_unit_overage_rates/%s",
            ApiResource.urlEncodeId(rateCardId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, DeletedObject.class);
  }
  /** Retrieve a Rate Card Custom Pricing Unit Overage Rate from a Rate Card. */
  public RateCardCustomPricingUnitOverageRate retrieve(String rateCardId, String id)
      throws StripeException {
    return retrieve(rateCardId, id, (RequestOptions) null);
  }
  /** Retrieve a Rate Card Custom Pricing Unit Overage Rate from a Rate Card. */
  public RateCardCustomPricingUnitOverageRate retrieve(
      String rateCardId, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/billing/rate_cards/%s/custom_pricing_unit_overage_rates/%s",
            ApiResource.urlEncodeId(rateCardId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RateCardCustomPricingUnitOverageRate.class);
  }
}
