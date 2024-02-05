// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLinkLineItemListParams;

public final class PaymentLinkLineItemService extends ApiService {
  public PaymentLinkLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String paymentLink, PaymentLinkLineItemListParams params)
      throws StripeException {
    return list(paymentLink, params, (RequestOptions) null);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String paymentLink, RequestOptions options)
      throws StripeException {
    return list(paymentLink, (PaymentLinkLineItemListParams) null, options);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String paymentLink) throws StripeException {
    return list(paymentLink, (PaymentLinkLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String paymentLink, PaymentLinkLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(paymentLink));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<LineItem>>() {}.getType());
  }
}
