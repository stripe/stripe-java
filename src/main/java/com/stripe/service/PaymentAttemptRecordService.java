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
}
