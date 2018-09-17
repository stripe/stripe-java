package com.stripe.model.reporting;

import com.stripe.exception.StripeException;
import com.stripe.model.FileUpload;
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
public class ReportRun extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String error;
  Boolean livemode;
  Parameters parameters;
  String reportType;
  FileUpload result;
  String status;
  Long succeededAt;

  // <editor-fold desc="create">
  /**
   * Create a report run.
   */
  public static ReportRun create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a report run.
   */
  public static ReportRun create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(ReportRun.class), params,
      ReportRun.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all report runs.
   */
  public static ReportRunCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all report runs.
   */
  public static ReportRunCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(ReportRun.class), params,
      ReportRunCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a report run.
   */
  public static ReportRun retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a report run.
   */
  public static ReportRun retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a report run.
   */
  public static ReportRun retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(ReportRun.class, id), params,
      ReportRun.class, options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class Parameters extends StripeObject {
    String connectedAccount;
    String currency;
    Long intervalEnd;
    Long intervalStart;
    String payout;
    String reportingCategory;
  }
}
