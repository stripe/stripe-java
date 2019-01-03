package com.stripe.model.radar;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ValueList extends ApiResource implements HasId, MetadataStore<ValueList> {
  /** The name of the value list for use in rules. */
  String alias;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** The name or email address of the user who created this value list. */
  String createdBy;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
   * `ip_address`, `country`, `string`, or `case_sensitive_string`.
   */
  String itemType;

  /** List of items contained within this value list. */
  ValueListItemCollection listItems;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** The name of the value list. */
  String name;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return requestCollection(url, params, ValueListCollection.class, options);
  }

  /** Retrieves a <code>ValueList</code> object. */
  public static ValueList retrieve(String valueList) throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>ValueList</code> object. */
  public static ValueList retrieve(String valueList, RequestOptions options)
      throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>ValueList</code> object. */
  public static ValueList retrieve(
      String valueList, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", valueList));
    return request(ApiResource.RequestMethod.GET, url, params, ValueList.class, options);
  }

  /** Creates a new <code>ValueList</code> object, which can then be referenced in rules. */
  public static ValueList create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>ValueList</code> object, which can then be referenced in rules. */
  public static ValueList create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  public ValueList update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  public ValueList update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, ValueList.class, options);
  }
}
