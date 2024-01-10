// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ShippingRate;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ShippingRateCreateParams;
import com.stripe.param.ShippingRateListParams;
import com.stripe.param.ShippingRateRetrieveParams;
import com.stripe.param.ShippingRateUpdateParams;

public final class ShippingRateService extends ApiService {
  public ShippingRateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your shipping rates. */
  public StripeCollection<ShippingRate> list(ShippingRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your shipping rates. */
  public StripeCollection<ShippingRate> list(RequestOptions options) throws StripeException {
    return list((ShippingRateListParams) null, options);
  }
  /** Returns a list of your shipping rates. */
  public StripeCollection<ShippingRate> list() throws StripeException {
    return list((ShippingRateListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your shipping rates. */
  public StripeCollection<ShippingRate> list(ShippingRateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/shipping_rates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<ShippingRate>>() {}.getType());
  }
  /** Creates a new shipping rate object. */
  public ShippingRate create(ShippingRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new shipping rate object. */
  public ShippingRate create(ShippingRateCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/shipping_rates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ShippingRate.class);
  }
  /** Returns the shipping rate object with the given ID. */
  public ShippingRate retrieve(String shippingRateToken, ShippingRateRetrieveParams params)
      throws StripeException {
    return retrieve(shippingRateToken, params, (RequestOptions) null);
  }
  /** Returns the shipping rate object with the given ID. */
  public ShippingRate retrieve(String shippingRateToken, RequestOptions options)
      throws StripeException {
    return retrieve(shippingRateToken, (ShippingRateRetrieveParams) null, options);
  }
  /** Returns the shipping rate object with the given ID. */
  public ShippingRate retrieve(String shippingRateToken) throws StripeException {
    return retrieve(shippingRateToken, (ShippingRateRetrieveParams) null, (RequestOptions) null);
  }
  /** Returns the shipping rate object with the given ID. */
  public ShippingRate retrieve(
      String shippingRateToken, ShippingRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ShippingRate.class);
  }
  /** Updates an existing shipping rate object. */
  public ShippingRate update(String shippingRateToken, ShippingRateUpdateParams params)
      throws StripeException {
    return update(shippingRateToken, params, (RequestOptions) null);
  }
  /** Updates an existing shipping rate object. */
  public ShippingRate update(String shippingRateToken, RequestOptions options)
      throws StripeException {
    return update(shippingRateToken, (ShippingRateUpdateParams) null, options);
  }
  /** Updates an existing shipping rate object. */
  public ShippingRate update(String shippingRateToken) throws StripeException {
    return update(shippingRateToken, (ShippingRateUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing shipping rate object. */
  public ShippingRate update(
      String shippingRateToken, ShippingRateUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ShippingRate.class);
  }
}
