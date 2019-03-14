package com.stripe.model.reporting;

import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReportType extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long dataAvailableEnd;
  Long dataAvailableStart;
  List<String> defaultColumns;
  String name;
  Long updated;
  Long version;

  // <editor-fold desc="list">
  /**
   * List all report types.
   */
  public static ReportTypeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all report types.
   */
  public static ReportTypeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(ReportType.class), params,
      ReportTypeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a report type.
   */
  public static ReportType retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a report type.
   */
  public static ReportType retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a report type.
   */
  public static ReportType retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(ReportType.class, id), params,
      ReportType.class, options);
  }
  // </editor-fold>
}
