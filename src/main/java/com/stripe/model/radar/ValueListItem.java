package com.stripe.model.radar;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ValueListItem extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** The name or email address of the user who added this item to the value list. */
  String createdBy;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The value of the item. */
  String value;

  /** The identifier of the value list this item belongs to. */
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
    return requestCollection(url, params, ValueListItemCollection.class, options);
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
            "%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_list_items/%s", item));
    return request(ApiResource.RequestMethod.GET, url, params, ValueListItem.class, options);
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
    return request(ApiResource.RequestMethod.POST, url, params, ValueListItem.class, options);
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
            Stripe.getApiBase(), String.format("/v1/radar/value_list_items/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, ValueListItem.class, options);
  }
}
