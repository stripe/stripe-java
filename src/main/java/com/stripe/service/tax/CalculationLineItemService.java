// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.CalculationLineItem;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CalculationLineItemListParams;

public final class CalculationLineItemService extends ApiService {
  public CalculationLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public StripeCollection<CalculationLineItem> list(String id, CalculationLineItemListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public StripeCollection<CalculationLineItem> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CalculationLineItemListParams) null, options);
  }
  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public StripeCollection<CalculationLineItem> list(String id) throws StripeException {
    return list(id, (CalculationLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t
   * expired.
   */
  public StripeCollection<CalculationLineItem> list(
      String id, CalculationLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CalculationLineItem>>() {}.getType());
  }
}
