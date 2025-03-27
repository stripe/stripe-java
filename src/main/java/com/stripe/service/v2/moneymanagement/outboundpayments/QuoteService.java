// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.outboundpayments;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.OutboundPaymentQuote;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.outboundpayments.QuoteCreateParams;

public final class QuoteService extends ApiService {
  public QuoteService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates an OutboundPaymentQuote usable in an OutboundPayment. */
  public OutboundPaymentQuote create(QuoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundPaymentQuote usable in an OutboundPayment. */
  public OutboundPaymentQuote create(QuoteCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/outbound_payments/quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundPaymentQuote.class);
  }
}
