// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyCanceledException;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.InsufficientFundsException;
import com.stripe.exception.NotCancelableException;
import com.stripe.exception.QuotaExceededException;
import com.stripe.exception.RecipientNotNotifiableException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.OutboundPayment;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.OutboundPaymentCreateParams;
import com.stripe.param.v2.moneymanagement.OutboundPaymentListParams;

public final class OutboundPaymentService extends ApiService {
  public OutboundPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Cancels an OutboundPayment. Only processing OutboundPayments can be canceled. */
  public OutboundPayment cancel(String id)
      throws StripeException, AlreadyCanceledException, NotCancelableException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels an OutboundPayment. Only processing OutboundPayments can be canceled. */
  public OutboundPayment cancel(String id, RequestOptions options)
      throws StripeException, AlreadyCanceledException, NotCancelableException {
    String path =
        String.format(
            "/v2/money_management/outbound_payments/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, OutboundPayment.class);
  }
  /** Creates an OutboundPayment. */
  public OutboundPayment create(OutboundPaymentCreateParams params)
      throws StripeException, InsufficientFundsException, QuotaExceededException,
          RecipientNotNotifiableException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundPayment. */
  public OutboundPayment create(OutboundPaymentCreateParams params, RequestOptions options)
      throws StripeException, InsufficientFundsException, QuotaExceededException,
          RecipientNotNotifiableException, FeatureNotEnabledException {
    String path = "/v2/money_management/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundPayment.class);
  }
  /** Returns a list of OutboundPayments that match the provided filters. */
  public StripeCollection<OutboundPayment> list(OutboundPaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of OutboundPayments that match the provided filters. */
  public StripeCollection<OutboundPayment> list(RequestOptions options) throws StripeException {
    return list((OutboundPaymentListParams) null, options);
  }
  /** Returns a list of OutboundPayments that match the provided filters. */
  public StripeCollection<OutboundPayment> list() throws StripeException {
    return list((OutboundPaymentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of OutboundPayments that match the provided filters. */
  public StripeCollection<OutboundPayment> list(
      OutboundPaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OutboundPayment>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment create or list response.
   */
  public OutboundPayment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment create or list response.
   */
  public OutboundPayment retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/outbound_payments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OutboundPayment.class);
  }

  public com.stripe.service.v2.moneymanagement.outboundpayments.QuoteService quotes() {
    return new com.stripe.service.v2.moneymanagement.outboundpayments.QuoteService(
        this.getResponseGetter());
  }
}
