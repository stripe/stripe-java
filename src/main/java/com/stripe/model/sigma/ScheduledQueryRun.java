package com.stripe.model.sigma;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.FileUpload;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ScheduledQueryRun extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  Long dataLoadTime;
  String error;
  FileUpload file;
  Boolean livemode;
  Long resultAvailableUntil;
  String sql;
  String status;
  String title;

  // <editor-fold desc="list">
  /**
   * List all issuing authorizations.
   */
  public static ScheduledQueryRunCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all issuing authorizations.
   */
  public static ScheduledQueryRunCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(ScheduledQueryRun.class), params,
      ScheduledQueryRunCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing authorization.
   */
  public static ScheduledQueryRun retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing authorization.
   */
  public static ScheduledQueryRun retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(ScheduledQueryRun.class, id), null,
      ScheduledQueryRun.class, options);
  }
  // </editor-fold>
}
