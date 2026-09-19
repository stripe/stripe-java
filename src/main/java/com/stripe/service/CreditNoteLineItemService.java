// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CreditNoteLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CreditNoteLineItemListParams;

public final class CreditNoteLineItemService extends ApiService {
  public CreditNoteLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(String id, CreditNoteLineItemListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CreditNoteLineItemListParams) null, options);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(String id) throws StripeException {
    return list(id, (CreditNoteLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(
      String id, CreditNoteLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s/lines", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CreditNoteLineItem>>() {}.getType());
  }
}
