package com.stripe.model.radar;

import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
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
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String createdBy;
  Boolean deleted;
  Boolean livemode;
  String value;
  String valueList;

  // <editor-fold desc="create">
  /**
   * Create a value list item.
   */
  public static ValueListItem create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a value list item.
   */
  public static ValueListItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(ValueListItem.class), params,
      ValueListItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a value list item.
   */
  public ValueListItem delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a value list item.
   */
  public ValueListItem delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(ValueListItem.class, this.id), null,
        ValueListItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all value list items.
   */
  public static ValueListItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all value list items.
   */
  public static ValueListItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(ValueListItem.class), params,
      ValueListItemCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a value list item.
   */
  public static ValueListItem retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a value list item.
   */
  public static ValueListItem retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a value list item.
   */
  public static ValueListItem retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(ValueListItem.class, id), params,
      ValueListItem.class, options);
  }
  // </editor-fold>
}
