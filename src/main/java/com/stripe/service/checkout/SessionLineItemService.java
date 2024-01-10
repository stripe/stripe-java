// File generated from our OpenAPI spec
package com.stripe.service.checkout;

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
import com.stripe.param.checkout.SessionLineItemListParams;

public final class SessionLineItemService extends ApiService {
  public SessionLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String session, SessionLineItemListParams params)
      throws StripeException {
    return list(session, params, (RequestOptions) null);
  }
  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String session, RequestOptions options)
      throws StripeException {
    return list(session, (SessionLineItemListParams) null, options);
  }
  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String session) throws StripeException {
    return list(session, (SessionLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String session, SessionLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<LineItem>>() {}.getType());
  }
}
