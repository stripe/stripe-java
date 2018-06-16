package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionItem extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  Plan plan;
  Integer quantity;

  // <editor-fold desc="create">
  /**
   * Create a subscription item.
   */
  public static SubscriptionItem create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a subscription item.
   */
  public static SubscriptionItem create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(SubscriptionItem.class), params,
        SubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(null, null);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(null, options);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(params, null);
  }

  /**
   * Delete a subscription item.
   */
  public DeletedSubscriptionItem delete(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(SubscriptionItem.class, id), params,
        DeletedSubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all subscription items.
   */
  public static SubscriptionItemCollection list(Map<String, Object> params)
      throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, null);
  }

  /**
   * List all subscription items.
   */
  public static SubscriptionItemCollection list(Map<String, Object> params,
                          RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(SubscriptionItem.class), params,
        SubscriptionItemCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a subscription item.
   */
  public static SubscriptionItem retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a subscription item.
   */
  public static SubscriptionItem retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(SubscriptionItem.class, id), null,
        SubscriptionItem.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a subscription item.
   */
  public SubscriptionItem update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a subscription item.
   */
  public SubscriptionItem update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(SubscriptionItem.class, id), params,
        SubscriptionItem.class, options);
  }
  // </editor-fold>
}
