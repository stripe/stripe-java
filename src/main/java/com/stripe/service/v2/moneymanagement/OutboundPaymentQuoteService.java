// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.OutboundPaymentQuote;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.OutboundPaymentQuoteCreateParams;

public final class OutboundPaymentQuoteService extends ApiService {
  public OutboundPaymentQuoteService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates an OutboundPaymentQuote usable in an OutboundPayment. */
  public OutboundPaymentQuote create(OutboundPaymentQuoteCreateParams params)
      throws StripeException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundPaymentQuote usable in an OutboundPayment. */
  public OutboundPaymentQuote create(
      OutboundPaymentQuoteCreateParams params, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    String path = "/v2/money_management/outbound_payment_quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundPaymentQuote.class);
  }
  /**
   * Retrieves the details of an existing OutboundPaymentQuote by passing the unique
   * OutboundPaymentQuote ID.
   */
  public OutboundPaymentQuote retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundPaymentQuote by passing the unique
   * OutboundPaymentQuote ID.
   */
  public OutboundPaymentQuote retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/outbound_payment_quotes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OutboundPaymentQuote.class);
  }
}
