// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.CreditUnderwritingRecord;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CreditUnderwritingRecordCorrectParams;
import com.stripe.param.issuing.CreditUnderwritingRecordCreateFromApplicationParams;
import com.stripe.param.issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams;
import com.stripe.param.issuing.CreditUnderwritingRecordListParams;
import com.stripe.param.issuing.CreditUnderwritingRecordReportDecisionParams;
import com.stripe.param.issuing.CreditUnderwritingRecordRetrieveParams;

public final class CreditUnderwritingRecordService extends ApiService {
  public CreditUnderwritingRecordService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public CreditUnderwritingRecord retrieve(
      String creditUnderwritingRecord, CreditUnderwritingRecordRetrieveParams params)
      throws StripeException {
    return retrieve(creditUnderwritingRecord, params, (RequestOptions) null);
  }
  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public CreditUnderwritingRecord retrieve(String creditUnderwritingRecord, RequestOptions options)
      throws StripeException {
    return retrieve(
        creditUnderwritingRecord, (CreditUnderwritingRecordRetrieveParams) null, options);
  }
  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public CreditUnderwritingRecord retrieve(String creditUnderwritingRecord) throws StripeException {
    return retrieve(
        creditUnderwritingRecord,
        (CreditUnderwritingRecordRetrieveParams) null,
        (RequestOptions) null);
  }
  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public CreditUnderwritingRecord retrieve(
      String creditUnderwritingRecord,
      CreditUnderwritingRecordRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s",
            ApiResource.urlEncodeId(creditUnderwritingRecord));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }
  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<CreditUnderwritingRecord> list(CreditUnderwritingRecordListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<CreditUnderwritingRecord> list(RequestOptions options)
      throws StripeException {
    return list((CreditUnderwritingRecordListParams) null, options);
  }
  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<CreditUnderwritingRecord> list() throws StripeException {
    return list((CreditUnderwritingRecordListParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<CreditUnderwritingRecord> list(
      CreditUnderwritingRecordListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CreditUnderwritingRecord>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public CreditUnderwritingRecord createFromApplication(
      CreditUnderwritingRecordCreateFromApplicationParams params) throws StripeException {
    return createFromApplication(params, (RequestOptions) null);
  }
  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public CreditUnderwritingRecord createFromApplication(
      CreditUnderwritingRecordCreateFromApplicationParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_application";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }
  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public CreditUnderwritingRecord createFromProactiveReview(
      CreditUnderwritingRecordCreateFromProactiveReviewParams params) throws StripeException {
    return createFromProactiveReview(params, (RequestOptions) null);
  }
  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public CreditUnderwritingRecord createFromProactiveReview(
      CreditUnderwritingRecordCreateFromProactiveReviewParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_proactive_review";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }
  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(
      String creditUnderwritingRecord, CreditUnderwritingRecordReportDecisionParams params)
      throws StripeException {
    return reportDecision(creditUnderwritingRecord, params, (RequestOptions) null);
  }
  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(
      String creditUnderwritingRecord,
      CreditUnderwritingRecordReportDecisionParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/report_decision",
            ApiResource.urlEncodeId(creditUnderwritingRecord));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }
  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(
      String creditUnderwritingRecord, CreditUnderwritingRecordCorrectParams params)
      throws StripeException {
    return correct(creditUnderwritingRecord, params, (RequestOptions) null);
  }
  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(String creditUnderwritingRecord, RequestOptions options)
      throws StripeException {
    return correct(creditUnderwritingRecord, (CreditUnderwritingRecordCorrectParams) null, options);
  }
  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(String creditUnderwritingRecord) throws StripeException {
    return correct(
        creditUnderwritingRecord,
        (CreditUnderwritingRecordCorrectParams) null,
        (RequestOptions) null);
  }
  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(
      String creditUnderwritingRecord,
      CreditUnderwritingRecordCorrectParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/correct",
            ApiResource.urlEncodeId(creditUnderwritingRecord));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }
}
