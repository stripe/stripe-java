// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.radar.ValueListItemCreateParams;
import com.stripe.param.radar.ValueListItemListParams;
import com.stripe.param.radar.ValueListItemRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
   * Returns a list of <code>ValueListItem</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>ValueListItem</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_list_items");
    return ApiResource.requestCollection(url, params, ValueListItemCollection.class, options);
  }

  /**
   * Returns a list of <code>ValueListItem</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(ValueListItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>ValueListItem</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static ValueListItemCollection list(ValueListItemListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_list_items");
    return ApiResource.requestCollection(url, params, ValueListItemCollection.class, options);
  }

  /** Retrieves a <code>ValueListItem</code> object. */
  public static ValueListItem retrieve(String item) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>ValueListItem</code> object. */
  public static ValueListItem retrieve(String item, RequestOptions options) throws StripeException {
    return retrieve(item, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>ValueListItem</code> object. */
  public static ValueListItem retrieve(
      String item, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ValueListItem.class, options);
  }

  /** Retrieves a <code>ValueListItem</code> object. */
  public static ValueListItem retrieve(
      String item, ValueListItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(item)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ValueListItem.class, options);
  }

  /**
   * Creates a new <code>ValueListItem</code> object, which is added to the specified parent value
   * list.
   */
  public static ValueListItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>ValueListItem</code> object, which is added to the specified parent value
   * list.
   */
  public static ValueListItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_list_items");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ValueListItem.class, options);
  }

  /**
   * Creates a new <code>ValueListItem</code> object, which is added to the specified parent value
   * list.
   */
  public static ValueListItem create(ValueListItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>ValueListItem</code> object, which is added to the specified parent value
   * list.
   */
  public static ValueListItem create(ValueListItemCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_list_items");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ValueListItem.class, options);
  }

  /** Deletes a <code>ValueListItem</code> object, removing it from its parent value list. */
  public ValueListItem delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a <code>ValueListItem</code> object, removing it from its parent value list. */
  public ValueListItem delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a <code>ValueListItem</code> object, removing it from its parent value list. */
  public ValueListItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a <code>ValueListItem</code> object, removing it from its parent value list. */
  public ValueListItem delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/radar/value_list_items/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, ValueListItem.class, options);
  }
}
