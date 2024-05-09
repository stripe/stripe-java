// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CreditNoteLineItemCollectionListParams;
import java.util.Map;

public class CreditNoteLineItemCollection extends StripeCollection<CreditNoteLineItem> {
  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public CreditNoteLineItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public CreditNoteLineItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CreditNoteLineItemCollection.class);
  }

  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public CreditNoteLineItemCollection list(CreditNoteLineItemCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated)
   * list of line items.
   */
  public CreditNoteLineItemCollection list(
      CreditNoteLineItemCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CreditNoteLineItemCollection.class);
  }
}
