// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.OneTimeItem;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.OneTimeItemCreateParams;
import com.stripe.param.v2.billing.OneTimeItemListParams;
import com.stripe.param.v2.billing.OneTimeItemUpdateParams;

public final class OneTimeItemService extends ApiService {
  public OneTimeItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all One-Time Item objects in reverse chronological order of creation. */
  public StripeCollection<OneTimeItem> list(OneTimeItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all One-Time Item objects in reverse chronological order of creation. */
  public StripeCollection<OneTimeItem> list(RequestOptions options) throws StripeException {
    return list((OneTimeItemListParams) null, options);
  }
  /** List all One-Time Item objects in reverse chronological order of creation. */
  public StripeCollection<OneTimeItem> list() throws StripeException {
    return list((OneTimeItemListParams) null, (RequestOptions) null);
  }
  /** List all One-Time Item objects in reverse chronological order of creation. */
  public StripeCollection<OneTimeItem> list(OneTimeItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/one_time_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OneTimeItem>>() {}.getType());
  }
  /** Create a One-Time Item object. */
  public OneTimeItem create(OneTimeItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a One-Time Item object. */
  public OneTimeItem create(OneTimeItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/one_time_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OneTimeItem.class);
  }
  /** Retrieve a One-Time Item object. */
  public OneTimeItem retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a One-Time Item object. */
  public OneTimeItem retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/one_time_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OneTimeItem.class);
  }
  /** Update a One-Time Item object. */
  public OneTimeItem update(String id, OneTimeItemUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a One-Time Item object. */
  public OneTimeItem update(String id, RequestOptions options) throws StripeException {
    return update(id, (OneTimeItemUpdateParams) null, options);
  }
  /** Update a One-Time Item object. */
  public OneTimeItem update(String id) throws StripeException {
    return update(id, (OneTimeItemUpdateParams) null, (RequestOptions) null);
  }
  /** Update a One-Time Item object. */
  public OneTimeItem update(String id, OneTimeItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/one_time_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OneTimeItem.class);
  }
}
