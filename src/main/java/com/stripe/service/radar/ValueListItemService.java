// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.radar.ValueListItem;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.ValueListItemCreateParams;
import com.stripe.param.radar.ValueListItemListParams;
import com.stripe.param.radar.ValueListItemRetrieveParams;

public final class ValueListItemService extends ApiService {
  public ValueListItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete(String item) throws StripeException {
    return delete(item, (RequestOptions) null);
  }
  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete(String item, RequestOptions options) throws StripeException {
    String path = String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, ValueListItem.class);
  }
  /** Retrieves a {@code ValueListItem} object. */
  public ValueListItem retrieve(String item, ValueListItemRetrieveParams params)
      throws StripeException {
    return retrieve(item, params, (RequestOptions) null);
  }
  /** Retrieves a {@code ValueListItem} object. */
  public ValueListItem retrieve(String item, RequestOptions options) throws StripeException {
    return retrieve(item, (ValueListItemRetrieveParams) null, options);
  }
  /** Retrieves a {@code ValueListItem} object. */
  public ValueListItem retrieve(String item) throws StripeException {
    return retrieve(item, (ValueListItemRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code ValueListItem} object. */
  public ValueListItem retrieve(
      String item, ValueListItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, ValueListItem.class);
  }
  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueListItem> list(ValueListItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueListItem> list(
      ValueListItemListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<ValueListItem>>() {}.getType());
  }
  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public ValueListItem create(ValueListItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public ValueListItem create(ValueListItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, ValueListItem.class);
  }
}
