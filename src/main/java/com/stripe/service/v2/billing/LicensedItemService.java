// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.LicensedItem;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.LicensedItemCreateParams;
import com.stripe.param.v2.billing.LicensedItemListParams;
import com.stripe.param.v2.billing.LicensedItemUpdateParams;

public final class LicensedItemService extends ApiService {
  public LicensedItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all LicensedItem objects in reverse chronological order of creation. */
  public StripeCollection<LicensedItem> list(LicensedItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all LicensedItem objects in reverse chronological order of creation. */
  public StripeCollection<LicensedItem> list(RequestOptions options) throws StripeException {
    return list((LicensedItemListParams) null, options);
  }
  /** List all LicensedItem objects in reverse chronological order of creation. */
  public StripeCollection<LicensedItem> list() throws StripeException {
    return list((LicensedItemListParams) null, (RequestOptions) null);
  }
  /** List all LicensedItem objects in reverse chronological order of creation. */
  public StripeCollection<LicensedItem> list(LicensedItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/licensed_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<LicensedItem>>() {}.getType());
  }
  /** Create a LicensedItem object. */
  public LicensedItem create(LicensedItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a LicensedItem object. */
  public LicensedItem create(LicensedItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/licensed_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, LicensedItem.class);
  }
  /** Retrieve a LicensedItem object. */
  public LicensedItem retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a LicensedItem object. */
  public LicensedItem retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/licensed_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, LicensedItem.class);
  }
  /** Update a LicensedItem object. At least one of the fields is required. */
  public LicensedItem update(String id, LicensedItemUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a LicensedItem object. At least one of the fields is required. */
  public LicensedItem update(String id, RequestOptions options) throws StripeException {
    return update(id, (LicensedItemUpdateParams) null, options);
  }
  /** Update a LicensedItem object. At least one of the fields is required. */
  public LicensedItem update(String id) throws StripeException {
    return update(id, (LicensedItemUpdateParams) null, (RequestOptions) null);
  }
  /** Update a LicensedItem object. At least one of the fields is required. */
  public LicensedItem update(String id, LicensedItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/licensed_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, LicensedItem.class);
  }
}
