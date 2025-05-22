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
import com.stripe.param.v2.payments.OffSessionPaymentCreateParams;
import com.stripe.param.v2.payments.OffSessionPaymentListParams;

public final class OffSessionPaymentService extends ApiService {
  public OffSessionPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Cancel OSP. */
  public OffSessionPayment cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel OSP. */
  public OffSessionPayment cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/payments/off_session_payments/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, OffSessionPayment.class);
  }
  /** Create OSP. */
  public OffSessionPayment create(OffSessionPaymentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create OSP. */
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
  /** List OSPs matching filter. */
  public StripeCollection<OffSessionPayment> list(OffSessionPaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List OSPs matching filter. */
  public StripeCollection<OffSessionPayment> list(RequestOptions options) throws StripeException {
    return list((OffSessionPaymentListParams) null, options);
  }
  /** List OSPs matching filter. */
  public StripeCollection<OffSessionPayment> list() throws StripeException {
    return list((OffSessionPaymentListParams) null, (RequestOptions) null);
  }
  /** List OSPs matching filter. */
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
  /** Retrieve OSP by ID. */
  public OffSessionPayment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve OSP by ID. */
  public OffSessionPayment retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/payments/off_session_payments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OffSessionPayment.class);
  }
}
