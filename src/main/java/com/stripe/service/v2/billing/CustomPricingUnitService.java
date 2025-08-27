// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.CustomPricingUnit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.CustomPricingUnitCreateParams;
import com.stripe.param.v2.billing.CustomPricingUnitListParams;
import com.stripe.param.v2.billing.CustomPricingUnitUpdateParams;

public final class CustomPricingUnitService extends ApiService {
  public CustomPricingUnitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Custom Pricing Unit objects. */
  public StripeCollection<CustomPricingUnit> list(CustomPricingUnitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Custom Pricing Unit objects. */
  public StripeCollection<CustomPricingUnit> list(RequestOptions options) throws StripeException {
    return list((CustomPricingUnitListParams) null, options);
  }
  /** List all Custom Pricing Unit objects. */
  public StripeCollection<CustomPricingUnit> list() throws StripeException {
    return list((CustomPricingUnitListParams) null, (RequestOptions) null);
  }
  /** List all Custom Pricing Unit objects. */
  public StripeCollection<CustomPricingUnit> list(
      CustomPricingUnitListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/custom_pricing_units";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<CustomPricingUnit>>() {}.getType());
  }
  /** Create a Custom Pricing Unit object. */
  public CustomPricingUnit create(CustomPricingUnitCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Custom Pricing Unit object. */
  public CustomPricingUnit create(CustomPricingUnitCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/custom_pricing_units";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomPricingUnit.class);
  }
  /** Retrieve a Custom Pricing Unit object. */
  public CustomPricingUnit retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Custom Pricing Unit object. */
  public CustomPricingUnit retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/custom_pricing_units/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CustomPricingUnit.class);
  }
  /** Update a Custom Pricing Unit object. */
  public CustomPricingUnit update(String id, CustomPricingUnitUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a Custom Pricing Unit object. */
  public CustomPricingUnit update(String id, RequestOptions options) throws StripeException {
    return update(id, (CustomPricingUnitUpdateParams) null, options);
  }
  /** Update a Custom Pricing Unit object. */
  public CustomPricingUnit update(String id) throws StripeException {
    return update(id, (CustomPricingUnitUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Custom Pricing Unit object. */
  public CustomPricingUnit update(
      String id, CustomPricingUnitUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/custom_pricing_units/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomPricingUnit.class);
  }
}
