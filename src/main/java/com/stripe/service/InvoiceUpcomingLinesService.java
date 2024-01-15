// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceUpcomingLinesListParams;

public final class InvoiceUpcomingLinesService extends ApiService {
  public InvoiceUpcomingLinesService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving an upcoming invoice, you’ll get a <strong>lines</strong> property containing
   * the total count of line items and the first handful of those items. There is also a URL where
   * you can retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(InvoiceUpcomingLinesListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * When retrieving an upcoming invoice, you’ll get a <strong>lines</strong> property containing
   * the total count of line items and the first handful of those items. There is also a URL where
   * you can retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(RequestOptions options) throws StripeException {
    return list((InvoiceUpcomingLinesListParams) null, options);
  }
  /**
   * When retrieving an upcoming invoice, you’ll get a <strong>lines</strong> property containing
   * the total count of line items and the first handful of those items. There is also a URL where
   * you can retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list() throws StripeException {
    return list((InvoiceUpcomingLinesListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving an upcoming invoice, you’ll get a <strong>lines</strong> property containing
   * the total count of line items and the first handful of those items. There is also a URL where
   * you can retrieve the full (paginated) list of line items.
   */
  public StripeCollection<InvoiceLineItem> list(
      InvoiceUpcomingLinesListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/invoices/upcoming/lines";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<InvoiceLineItem>>() {}.getType());
  }
}
