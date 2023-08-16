// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CreditNoteLineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CreditNotePreviewLinesListParams;

public final class CreditNotePreviewLinesService extends ApiService {
  public CreditNotePreviewLinesService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a credit note preview, you’ll get a <strong>lines</strong> property containing
   * the first handful of those items. This URL you can retrieve the full (paginated) list of line
   * items.
   */
  public StripeCollection<CreditNoteLineItem> list(CreditNotePreviewLinesListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * When retrieving a credit note preview, you’ll get a <strong>lines</strong> property containing
   * the first handful of those items. This URL you can retrieve the full (paginated) list of line
   * items.
   */
  public StripeCollection<CreditNoteLineItem> list(
      CreditNotePreviewLinesListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/credit_notes/preview/lines";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CreditNoteLineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
