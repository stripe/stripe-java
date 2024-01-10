// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.ValueListCreateParams;
import com.stripe.param.radar.ValueListListParams;
import com.stripe.param.radar.ValueListRetrieveParams;
import com.stripe.param.radar.ValueListUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Value lists allow you to group values together which can then be referenced in rules.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/radar/lists#managing-list-items">Default
 * Stripe lists</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ValueList extends ApiResource implements HasId, MetadataStore<ValueList> {
  /** The name of the value list for use in rules. */
  @SerializedName("alias")
  String alias;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The name or email address of the user who created this value list. */
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
   * The type of items in the value list. One of {@code card_fingerprint}, {@code
   * us_bank_account_fingerprint}, {@code sepa_debit_fingerprint}, {@code card_bin}, {@code email},
   * {@code ip_address}, {@code country}, {@code string}, {@code case_sensitive_string}, or {@code
   * customer_id}.
   */
  @SerializedName("item_type")
  String itemType;

  /** List of items contained within this value list. */
  @SerializedName("list_items")
  ValueListItemCollection listItems;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The name of the value list. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.value_list}.
   */
  @SerializedName("object")
  String object;

  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public static ValueList create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public static ValueList create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueList.class);
  }

  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public static ValueList create(ValueListCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code ValueList} object, which can then be referenced in rules. */
  public static ValueList create(ValueListCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueList.class);
  }

  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a {@code ValueList} object, also deleting any items contained within the value list. To
   * be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ValueList.class);
  }

  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueListCollection.class);
  }

  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(ValueListListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of {@code ValueList} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(ValueListListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/value_lists";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueListCollection.class);
  }

  /** Retrieves a {@code ValueList} object. */
  public static ValueList retrieve(String valueList) throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code ValueList} object. */
  public static ValueList retrieve(String valueList, RequestOptions options)
      throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code ValueList} object. */
  public static ValueList retrieve(
      String valueList, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(valueList));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueList.class);
  }

  /** Retrieves a {@code ValueList} object. */
  public static ValueList retrieve(
      String valueList, ValueListRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(valueList));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ValueList.class);
  }

  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  @Override
  public ValueList update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  @Override
  public ValueList update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ValueList.class);
  }

  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(ValueListUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code ValueList} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that {@code item_type} is immutable.
   */
  public ValueList update(ValueListUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ValueList.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(listItems, responseGetter);
  }
}
