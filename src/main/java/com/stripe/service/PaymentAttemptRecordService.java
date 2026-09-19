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
import com.stripe.param.PaymentAttemptRecordReportAuthorizedParams;
import com.stripe.param.PaymentAttemptRecordReportCanceledParams;
import com.stripe.param.PaymentAttemptRecordReportEarlyFraudWarningParams;
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
      String id, PaymentAttemptRecordReportAuthenticatedParams params) throws StripeException {
    return reportAuthenticated(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(String id, RequestOptions options)
      throws StripeException {
    return reportAuthenticated(id, (PaymentAttemptRecordReportAuthenticatedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(String id) throws StripeException {
    return reportAuthenticated(
        id, (PaymentAttemptRecordReportAuthenticatedParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authenticated. */
  public PaymentAttemptRecord reportAuthenticated(
      String id, PaymentAttemptRecordReportAuthenticatedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_authenticated", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record was authorized. */
  public PaymentAttemptRecord reportAuthorized(
      String id, PaymentAttemptRecordReportAuthorizedParams params) throws StripeException {
    return reportAuthorized(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authorized. */
  public PaymentAttemptRecord reportAuthorized(String id, RequestOptions options)
      throws StripeException {
    return reportAuthorized(id, (PaymentAttemptRecordReportAuthorizedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was authorized. */
  public PaymentAttemptRecord reportAuthorized(String id) throws StripeException {
    return reportAuthorized(
        id, (PaymentAttemptRecordReportAuthorizedParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was authorized. */
  public PaymentAttemptRecord reportAuthorized(
      String id, PaymentAttemptRecordReportAuthorizedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_authorized", ApiResource.urlEncodeId(id));
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
      String id, PaymentAttemptRecordReportCanceledParams params) throws StripeException {
    return reportCanceled(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(String id, RequestOptions options)
      throws StripeException {
    return reportCanceled(id, (PaymentAttemptRecordReportCanceledParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(String id) throws StripeException {
    return reportCanceled(
        id, (PaymentAttemptRecordReportCanceledParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was canceled. */
  public PaymentAttemptRecord reportCanceled(
      String id, PaymentAttemptRecordReportCanceledParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_canceled", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttemptRecord.class);
  }
  /** Report that the specified Payment Attempt Record received an early fraud warning. */
  public PaymentAttemptRecord reportEarlyFraudWarning(
      String id, PaymentAttemptRecordReportEarlyFraudWarningParams params) throws StripeException {
    return reportEarlyFraudWarning(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record received an early fraud warning. */
  public PaymentAttemptRecord reportEarlyFraudWarning(
      String id, PaymentAttemptRecordReportEarlyFraudWarningParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_early_fraud_warning",
            ApiResource.urlEncodeId(id));
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
  public PaymentAttemptRecord reportFailed(String id, PaymentAttemptRecordReportFailedParams params)
      throws StripeException {
    return reportFailed(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(String id, RequestOptions options)
      throws StripeException {
    return reportFailed(id, (PaymentAttemptRecordReportFailedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(String id) throws StripeException {
    return reportFailed(id, (PaymentAttemptRecordReportFailedParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record failed. */
  public PaymentAttemptRecord reportFailed(
      String id, PaymentAttemptRecordReportFailedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_attempt_records/%s/report_failed", ApiResource.urlEncodeId(id));
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
      String id, PaymentAttemptRecordReportGuaranteedParams params) throws StripeException {
    return reportGuaranteed(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(String id, RequestOptions options)
      throws StripeException {
    return reportGuaranteed(id, (PaymentAttemptRecordReportGuaranteedParams) null, options);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(String id) throws StripeException {
    return reportGuaranteed(
        id, (PaymentAttemptRecordReportGuaranteedParams) null, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was guaranteed. */
  public PaymentAttemptRecord reportGuaranteed(
      String id, PaymentAttemptRecordReportGuaranteedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_guaranteed", ApiResource.urlEncodeId(id));
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
      String id, PaymentAttemptRecordReportInformationalParams params) throws StripeException {
    return reportInformational(id, params, (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(String id, RequestOptions options)
      throws StripeException {
    return reportInformational(id, (PaymentAttemptRecordReportInformationalParams) null, options);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(String id) throws StripeException {
    return reportInformational(
        id, (PaymentAttemptRecordReportInformationalParams) null, (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Attempt Record. */
  public PaymentAttemptRecord reportInformational(
      String id, PaymentAttemptRecordReportInformationalParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_attempt_records/%s/report_informational", ApiResource.urlEncodeId(id));
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
  public PaymentAttemptRecord reportRefund(String id, PaymentAttemptRecordReportRefundParams params)
      throws StripeException {
    return reportRefund(id, params, (RequestOptions) null);
  }
  /** Report that the specified Payment Attempt Record was refunded. */
  public PaymentAttemptRecord reportRefund(
      String id, PaymentAttemptRecordReportRefundParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_attempt_records/%s/report_refund", ApiResource.urlEncodeId(id));
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
