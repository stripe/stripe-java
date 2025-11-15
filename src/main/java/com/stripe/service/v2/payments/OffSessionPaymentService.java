// File generated from our OpenAPI spec
package com.stripe.service.v2.payments;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.payments.OffSessionPayment;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.payments.OffSessionPaymentCaptureParams;
import com.stripe.param.v2.payments.OffSessionPaymentCreateParams;
import com.stripe.param.v2.payments.OffSessionPaymentListParams;

public final class OffSessionPaymentService extends ApiService {
  public OffSessionPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of OffSessionPayments matching a filter. */
  public StripeCollection<OffSessionPayment> list(OffSessionPaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of OffSessionPayments matching a filter. */
  public StripeCollection<OffSessionPayment> list(RequestOptions options) throws StripeException {
    return list((OffSessionPaymentListParams) null, options);
  }
  /** Returns a list of OffSessionPayments matching a filter. */
  public StripeCollection<OffSessionPayment> list() throws StripeException {
    return list((OffSessionPaymentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of OffSessionPayments matching a filter. */
  public StripeCollection<OffSessionPayment> list(
      OffSessionPaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/payments/off_session_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OffSessionPayment>>() {}.getType());
  }
  /** Creates an OffSessionPayment object. */
  public OffSessionPayment create(OffSessionPaymentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OffSessionPayment object. */
  public OffSessionPayment create(OffSessionPaymentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/payments/off_session_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OffSessionPayment.class);
  }
  /** Retrieves the details of an OffSessionPayment that has previously been created. */
  public OffSessionPayment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an OffSessionPayment that has previously been created. */
  public OffSessionPayment retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/payments/off_session_payments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OffSessionPayment.class);
  }
  /** Cancel an OffSessionPayment that has previously been created. */
  public OffSessionPayment cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel an OffSessionPayment that has previously been created. */
  public OffSessionPayment cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/payments/off_session_payments/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, OffSessionPayment.class);
  }
  /** Captures an OffSessionPayment that has previously been created. */
  public OffSessionPayment capture(String id, OffSessionPaymentCaptureParams params)
      throws StripeException {
    return capture(id, params, (RequestOptions) null);
  }
  /** Captures an OffSessionPayment that has previously been created. */
  public OffSessionPayment capture(
      String id, OffSessionPaymentCaptureParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/payments/off_session_payments/%s/capture", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OffSessionPayment.class);
  }
}
