// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.OutboundPayment;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundPaymentCancelParams;
import com.stripe.param.treasury.OutboundPaymentCreateParams;
import com.stripe.param.treasury.OutboundPaymentListParams;
import com.stripe.param.treasury.OutboundPaymentRetrieveParams;

public final class OutboundPaymentService extends ApiService {
  public OutboundPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public StripeCollection<OutboundPayment> list(OutboundPaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public StripeCollection<OutboundPayment> list(
      OutboundPaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<OutboundPayment>>() {}.getType());
  }
  /** Creates an OutboundPayment. */
  public OutboundPayment create(OutboundPaymentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundPayment. */
  public OutboundPayment create(OutboundPaymentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, OutboundPayment.class);
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public OutboundPayment retrieve(String id, OutboundPaymentRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public OutboundPayment retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (OutboundPaymentRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public OutboundPayment retrieve(String id) throws StripeException {
    return retrieve(id, (OutboundPaymentRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public OutboundPayment retrieve(
      String id, OutboundPaymentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/outbound_payments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, OutboundPayment.class);
  }
  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(String id, OutboundPaymentCancelParams params)
      throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (OutboundPaymentCancelParams) null, options);
  }
  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(String id) throws StripeException {
    return cancel(id, (OutboundPaymentCancelParams) null, (RequestOptions) null);
  }
  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(
      String id, OutboundPaymentCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/outbound_payments/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, OutboundPayment.class);
  }
}
