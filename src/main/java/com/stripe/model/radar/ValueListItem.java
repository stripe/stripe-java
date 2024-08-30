// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.radar.ValueListItemCreateParams;
import com.stripe.param.radar.ValueListItemListParams;
import com.stripe.param.radar.ValueListItemRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Value list items allow you to add specific values to a given Radar value list, which can then be
 * used in rules.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/radar/lists#managing-list-items">Managing list
 * items</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ValueListItem extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The name or email address of the user who added this item to the value list. */
  @SerializedName("created_by")
  String createdBy;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.value_list_item}.
   */
  @SerializedName("object")
  String object;

  /** The value of the item. */
  @SerializedName("value")
  String value;

  /** The identifier of the value list this item belongs to. */
  @SerializedName("value_list")
  String valueList;

  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public static ValueListItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public static ValueListItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, ValueListItem.class);
  }

  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public static ValueListItem create(ValueListItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code ValueListItem} object, which is added to the specified parent value list.
   */
  public static ValueListItem create(ValueListItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ValueListItem.class);
  }

  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a {@code ValueListItem} object, removing it from its parent value list. */
  public ValueListItem delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, ValueListItem.class);
  }

  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ValueListItemCollection.class);
  }

  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(ValueListItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of {@code ValueListItem} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(ValueListItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_list_items";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ValueListItemCollection.class);
  }

  /** Retrieves a {@code ValueListItem} object. */
  public static ValueListItem retrieve(String item) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code ValueListItem} object. */
  public static ValueListItem retrieve(String item, RequestOptions options) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code ValueListItem} object. */
  public static ValueListItem retrieve(
      String item, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ValueListItem.class);
  }

  /** Retrieves a {@code ValueListItem} object. */
  public static ValueListItem retrieve(
      String item, ValueListItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ValueListItem.class);
  }
}
