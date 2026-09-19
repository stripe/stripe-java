// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.radar.ValueList;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.ValueListCreateParams;
import com.stripe.param.radar.ValueListListParams;
import com.stripe.param.radar.ValueListRetrieveParams;
import com.stripe.param.radar.ValueListUpdateParams;

public final class ValueListService extends ApiService {
  public ValueListService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, ValueList.class);
  }
  /** Retrieves a {@code ValueList} object. */
  public ValueList retrieve(String id, ValueListRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a {@code ValueList} object. */
  public ValueList retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ValueListRetrieveParams) null, options);
  }
  /** Retrieves a {@code ValueList} object. */
  public ValueList retrieve(String id) throws StripeException {
    return retrieve(id, (ValueListRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code ValueList} object. */
  public ValueList retrieve(String id, ValueListRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ValueList.class);
  }
  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(String id, ValueListUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(String id, RequestOptions options) throws StripeException {
    return update(id, (ValueListUpdateParams) null, options);
  }
  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(String id) throws StripeException {
    return update(id, (ValueListUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(String id, ValueListUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ValueList.class);
  }
  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueList> list(ValueListListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueList> list(RequestOptions options) throws StripeException {
    return list((ValueListListParams) null, options);
  }
  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueList> list() throws StripeException {
    return list((ValueListListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<ValueList> list(ValueListListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ValueList>>() {}.getType());
  }
  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public ValueList create(ValueListCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public ValueList create(ValueListCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ValueList.class);
  }
}
