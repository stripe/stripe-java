// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntentAmountDetailsLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentIntentAmountDetailsLineItemListParams;

public final class PaymentIntentAmountDetailsLineItemService extends ApiService {
  public PaymentIntentAmountDetailsLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all LineItems of a given PaymentIntent. */
  public StripeCollection<PaymentIntentAmountDetailsLineItem> list(
      String intent, PaymentIntentAmountDetailsLineItemListParams params) throws StripeException {
    return list(intent, params, (RequestOptions) null);
  }
  /** Lists all LineItems of a given PaymentIntent. */
  public StripeCollection<PaymentIntentAmountDetailsLineItem> list(
      String intent, RequestOptions options) throws StripeException {
    return list(intent, (PaymentIntentAmountDetailsLineItemListParams) null, options);
  }
  /** Lists all LineItems of a given PaymentIntent. */
  public StripeCollection<PaymentIntentAmountDetailsLineItem> list(String intent)
      throws StripeException {
    return list(intent, (PaymentIntentAmountDetailsLineItemListParams) null, (RequestOptions) null);
  }
  /** Lists all LineItems of a given PaymentIntent. */
  public StripeCollection<PaymentIntentAmountDetailsLineItem> list(
      String intent, PaymentIntentAmountDetailsLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/amount_details_line_items", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request,
        new TypeToken<StripeCollection<PaymentIntentAmountDetailsLineItem>>() {}.getType());
  }
}
