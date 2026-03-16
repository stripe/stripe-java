// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentAttemptRecord;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentAttemptRecordListParams;
import com.stripe.param.PaymentAttemptRecordReportAuthenticatedParams;
import com.stripe.param.PaymentAttemptRecordReportCanceledParams;
import com.stripe.param.PaymentAttemptRecordReportFailedParams;
import com.stripe.param.PaymentAttemptRecordReportGuaranteedParams;
import com.stripe.param.PaymentAttemptRecordReportInformationalParams;
import com.stripe.param.PaymentAttemptRecordReportRefundParams;
import com.stripe.param.PaymentAttemptRecordRetrieveParams;

public final class PaymentAttemptRecordService extends ApiService {
  public PaymentAttemptRecordService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public StripeCollection<PaymentAttemptRecord> list(PaymentAttemptRecordListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public StripeCollection<PaymentAttemptRecord> list(
      PaymentAttemptRecordListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_attempt_records";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<PaymentAttemptRecord>>() {}.getType());
  }
  /** Retrieves a Payment Attempt Record with the given ID. */
  public PaymentAttemptRecord retrieve(String id, PaymentAttemptRecordRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a Payment Attempt Record with the given ID. */
  public PaymentAttemptRecord retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentAttemptRecordRetrieveParams) null, options);
  }
  /** Retrieves a Payment Attempt Record with the given ID. */
  public PaymentAttemptRecord retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentAttemptRecordRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Payment Attempt Record with the given ID. */
  public PaymentAttemptRecord retrieve(
      String id, PaymentAttemptRecordRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_attempt_records/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(
      String paymentAttemptRecord, PaymentAttemptRecordReportAuthenticatedParams params)
      throws StripeException {
    return reportAuthenticated(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(
      String paymentAttemptRecord, RequestOptions options) throws StripeException {
    return reportAuthenticated(
        paymentAttemptRecord, (PaymentAttemptRecordReportAuthenticatedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(String paymentAttemptRecord)
      throws StripeException {
    return reportAuthenticated(
        paymentAttemptRecord,
        (PaymentAttemptRecordReportAuthenticatedParams) null,
        (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportAuthenticatedParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_authenticated",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(
      String paymentAttemptRecord, PaymentAttemptRecordReportCanceledParams params)
      throws StripeException {
    return reportCanceled(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(String paymentAttemptRecord, RequestOptions options)
      throws StripeException {
    return reportCanceled(
        paymentAttemptRecord, (PaymentAttemptRecordReportCanceledParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(String paymentAttemptRecord) throws StripeException {
    return reportCanceled(
        paymentAttemptRecord,
        (PaymentAttemptRecordReportCanceledParams) null,
        (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportCanceledParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_canceled",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(
      String paymentAttemptRecord, PaymentAttemptRecordReportFailedParams params)
      throws StripeException {
    return reportFailed(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(String paymentAttemptRecord, RequestOptions options)
      throws StripeException {
    return reportFailed(
        paymentAttemptRecord, (PaymentAttemptRecordReportFailedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(String paymentAttemptRecord) throws StripeException {
    return reportFailed(
        paymentAttemptRecord, (PaymentAttemptRecordReportFailedParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportFailedParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_failed",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(
      String paymentAttemptRecord, PaymentAttemptRecordReportGuaranteedParams params)
      throws StripeException {
    return reportGuaranteed(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(String paymentAttemptRecord, RequestOptions options)
      throws StripeException {
    return reportGuaranteed(
        paymentAttemptRecord, (PaymentAttemptRecordReportGuaranteedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(String paymentAttemptRecord) throws StripeException {
    return reportGuaranteed(
        paymentAttemptRecord,
        (PaymentAttemptRecordReportGuaranteedParams) null,
        (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportGuaranteedParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_guaranteed",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(
      String paymentAttemptRecord, PaymentAttemptRecordReportInformationalParams params)
      throws StripeException {
    return reportInformational(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(
      String paymentAttemptRecord, RequestOptions options) throws StripeException {
    return reportInformational(
        paymentAttemptRecord, (PaymentAttemptRecordReportInformationalParams) null, options);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(String paymentAttemptRecord)
      throws StripeException {
    return reportInformational(
        paymentAttemptRecord,
        (PaymentAttemptRecordReportInformationalParams) null,
        (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportInformationalParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_informational",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record was refunded. */
  public PaymentAttemptRecord reportRefund(
      String paymentAttemptRecord, PaymentAttemptRecordReportRefundParams params)
      throws StripeException {
    return reportRefund(paymentAttemptRecord, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was refunded. */
  public PaymentAttemptRecord reportRefund(
      String paymentAttemptRecord,
      PaymentAttemptRecordReportRefundParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_refund",
            ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
}
