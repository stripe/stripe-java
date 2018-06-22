package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionItem extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  Plan plan;
  Integer quantity;

  // <editor-fold desc="create">
  /**
   * Create a subscription item.
   */
  public static SubscriptionItem create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a subscription item.
   */
  public static SubscriptionItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(SubscriptionItem.class), params,
        SubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete() throws StripeException {
    return delete(null, null);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(RequestOptions options) throws StripeException {
    return delete(null, options);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, null);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(SubscriptionItem.class, id), params,
        DeletedSubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all subscription items.
   */
  public static SubscriptionItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all subscription items.
   */
  public static SubscriptionItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(SubscriptionItem.class), params,
        SubscriptionItemCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a subscription item.
   */
  public static SubscriptionItem retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a subscription item.
   */
  public static SubscriptionItem retrieve(String id, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(SubscriptionItem.class, id), null,
        SubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a subscription item.
   */
  public SubscriptionItem update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a subscription item.
   */
  public SubscriptionItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(SubscriptionItem.class, id), params,
        SubscriptionItem.class, options);
  }
  // </editor-fold>
}
