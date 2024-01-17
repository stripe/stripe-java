// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CreditNoteLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(
      String creditNote, CreditNoteLineItemListParams params) throws StripeException {
    return list(creditNote, params, (RequestOptions) null);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(String creditNote, RequestOptions options)
      throws StripeException {
    return list(creditNote, (CreditNoteLineItemListParams) null, options);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(String creditNote) throws StripeException {
    return list(creditNote, (CreditNoteLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public StripeCollection<CreditNoteLineItem> list(
      String creditNote, CreditNoteLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/credit_notes/%s/lines", ApiResource.urlEncodeId(creditNote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<CreditNoteLineItem>>() {}.getType());
  }
}
