// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentRecord;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentRecordReportPaymentAttemptCanceledParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptFailedParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptGuaranteedParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptInformationalParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptParams;
import com.stripe.param.PaymentRecordReportPaymentParams;
import com.stripe.param.PaymentRecordRetrieveParams;

public final class PaymentRecordService extends ApiService {
  public PaymentRecordService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a Payment Record with the given ID. */
  public PaymentRecord retrieve(String id, PaymentRecordRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a Payment Record with the given ID. */
  public PaymentRecord retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentRecordRetrieveParams) null, options);
  }
  /** Retrieves a Payment Record with the given ID. */
  public PaymentRecord retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentRecordRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Payment Record with the given ID. */
  public PaymentRecord retrieve(
      String id, PaymentRecordRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_records/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(
      String id, PaymentRecordReportPaymentAttemptParams params) throws StripeException {
    return reportPaymentAttempt(id, params, (RequestOptions) null);
  }
  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(
      String id, PaymentRecordReportPaymentAttemptParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_records/%s/report_payment_attempt", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(
      String id, PaymentRecordReportPaymentAttemptCanceledParams params) throws StripeException {
    return reportPaymentAttemptCanceled(id, params, (RequestOptions) null);
  }
  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(
      String id, PaymentRecordReportPaymentAttemptCanceledParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_canceled", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(
      String id, PaymentRecordReportPaymentAttemptFailedParams params) throws StripeException {
    return reportPaymentAttemptFailed(id, params, (RequestOptions) null);
  }
  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(
      String id, PaymentRecordReportPaymentAttemptFailedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_failed", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(
      String id, PaymentRecordReportPaymentAttemptGuaranteedParams params) throws StripeException {
    return reportPaymentAttemptGuaranteed(id, params, (RequestOptions) null);
  }
  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(
      String id, PaymentRecordReportPaymentAttemptGuaranteedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_guaranteed",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(
      String id, PaymentRecordReportPaymentAttemptInformationalParams params)
      throws StripeException {
    return reportPaymentAttemptInformational(id, params, (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(String id, RequestOptions options)
      throws StripeException {
    return reportPaymentAttemptInformational(
        id, (PaymentRecordReportPaymentAttemptInformationalParams) null, options);
  }
  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(String id) throws StripeException {
    return reportPaymentAttemptInformational(
        id, (PaymentRecordReportPaymentAttemptInformationalParams) null, (RequestOptions) null);
  }
  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(
      String id,
      PaymentRecordReportPaymentAttemptInformationalParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_informational",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public PaymentRecord reportPayment(PaymentRecordReportPaymentParams params)
      throws StripeException {
    return reportPayment(params, (RequestOptions) null);
  }
  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public PaymentRecord reportPayment(
      PaymentRecordReportPaymentParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_records/report_payment";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentRecord.class);
  }
}
