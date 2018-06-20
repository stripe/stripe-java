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
public class Event extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String account;
  String apiVersion;
  Long created;
  EventData data;
  Boolean livemode;
  Integer pendingWebhooks;
  EventRequest request;
  String type;

  /**
   * Legacy; use `account` instead (https://stripe.com/docs/upgrades#2017-05-25)
   */
  @Deprecated
  String userId;

  // <editor-fold desc="list">
  /**
   * List all events.
   */
  public static EventCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all events.
   */
  public static EventCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Event.class), params, EventCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an event.
   */
  public static Event retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an event.
   */
  public static Event retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Event.class, id), null, Event.class, options);
  }
  // </editor-fold>
}
