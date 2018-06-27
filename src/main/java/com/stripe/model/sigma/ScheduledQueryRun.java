package com.stripe.model.sigma;

import com.stripe.exception.StripeException;
import com.stripe.model.FileUpload;
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
public class ScheduledQueryRun extends ApiResource implements HasId {
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
      throws StripeException {
    return list(params, null);
  }

  /**
   * List all issuing authorizations.
   */
  public static ScheduledQueryRunCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(ScheduledQueryRun.class), params,
      ScheduledQueryRunCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing authorization.
   */
  public static ScheduledQueryRun retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing authorization.
   */
  public static ScheduledQueryRun retrieve(String id, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(ScheduledQueryRun.class, id), null,
      ScheduledQueryRun.class, options);
  }
  // </editor-fold>
}
