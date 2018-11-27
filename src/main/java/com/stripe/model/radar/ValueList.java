package com.stripe.model.radar;

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
public class ValueList extends ApiResource implements MetadataStore<ValueList>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String alias;
  Long created;
  String createdBy;
  Boolean deleted;
  String itemType;
  ValueListItemCollection listItems;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String name;
  Long updated;
  String updateBy;

  // <editor-fold desc="create">
  /**
   * Create a value list.
   */
  public static ValueList create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a value list.
   */
  public static ValueList create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(ValueList.class), params,
      ValueList.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a value list.
   */
  public ValueList delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a value list.
   */
  public ValueList delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(ValueList.class, this.id), null,
        ValueList.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all value lists.
   */
  public static ValueListCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all value lists.
   */
  public static ValueListCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(ValueList.class), params,
      ValueListCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a value list.
   */
  public static ValueList retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a value list.
   */
  public static ValueList retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a value list.
   */
  public static ValueList retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(ValueList.class, id), params,
      ValueList.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a value list.
   */
  @Override
  public ValueList update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a value list.
   */
  @Override
  public ValueList update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(ValueList.class, this.id), params,
        ValueList.class, options);
  }
  // </editor-fold>
}
