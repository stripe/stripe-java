// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.MeteredItem;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.MeteredItemCreateParams;
import com.stripe.param.v2.billing.MeteredItemListParams;
import com.stripe.param.v2.billing.MeteredItemUpdateParams;

public final class MeteredItemService extends ApiService {
  public MeteredItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Metered Item objects in reverse chronological order of creation. */
  public StripeCollection<MeteredItem> list(MeteredItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Metered Item objects in reverse chronological order of creation. */
  public StripeCollection<MeteredItem> list(RequestOptions options) throws StripeException {
    return list((MeteredItemListParams) null, options);
  }
  /** List all Metered Item objects in reverse chronological order of creation. */
  public StripeCollection<MeteredItem> list() throws StripeException {
    return list((MeteredItemListParams) null, (RequestOptions) null);
  }
  /** List all Metered Item objects in reverse chronological order of creation. */
  public StripeCollection<MeteredItem> list(MeteredItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/metered_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<MeteredItem>>() {}.getType());
  }
  /** Create a Metered Item object. */
  public MeteredItem create(MeteredItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Metered Item object. */
  public MeteredItem create(MeteredItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/metered_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeteredItem.class);
  }
  /** Retrieve a Metered Item object. */
  public MeteredItem retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Metered Item object. */
  public MeteredItem retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/metered_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, MeteredItem.class);
  }
  /** Update a Metered Item object. At least one of the fields is required. */
  public MeteredItem update(String id, MeteredItemUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a Metered Item object. At least one of the fields is required. */
  public MeteredItem update(String id, RequestOptions options) throws StripeException {
    return update(id, (MeteredItemUpdateParams) null, options);
  }
  /** Update a Metered Item object. At least one of the fields is required. */
  public MeteredItem update(String id) throws StripeException {
    return update(id, (MeteredItemUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Metered Item object. At least one of the fields is required. */
  public MeteredItem update(String id, MeteredItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/metered_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, MeteredItem.class);
  }
}
