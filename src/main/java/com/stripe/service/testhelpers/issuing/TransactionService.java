// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Transaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.TransactionCreateForceCaptureParams;
import com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams;
import com.stripe.param.issuing.TransactionRefundParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Refund a test-mode Transaction. */
  public Transaction refund(String transaction, TransactionRefundParams params)
      throws StripeException {
    return refund(transaction, params, (RequestOptions) null);
  }
  /** Refund a test-mode Transaction. */
  public Transaction refund(String transaction, RequestOptions options) throws StripeException {
    return refund(transaction, (TransactionRefundParams) null, options);
  }
  /** Refund a test-mode Transaction. */
  public Transaction refund(String transaction) throws StripeException {
    return refund(transaction, (TransactionRefundParams) null, (RequestOptions) null);
  }
  /** Refund a test-mode Transaction. */
  public Transaction refund(
      String transaction, TransactionRefundParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/transactions/%s/refund",
            ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
  /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
  public Transaction createForceCapture(TransactionCreateForceCaptureParams params)
      throws StripeException {
    return createForceCapture(params, (RequestOptions) null);
  }
  /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
  public Transaction createForceCapture(
      TransactionCreateForceCaptureParams params, RequestOptions options) throws StripeException {
    String path = "/v1/test_helpers/issuing/transactions/create_force_capture";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
  /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
  public Transaction createUnlinkedRefund(TransactionCreateUnlinkedRefundParams params)
      throws StripeException {
    return createUnlinkedRefund(params, (RequestOptions) null);
  }
  /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
  public Transaction createUnlinkedRefund(
      TransactionCreateUnlinkedRefundParams params, RequestOptions options) throws StripeException {
    String path = "/v1/test_helpers/issuing/transactions/create_unlinked_refund";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
}
