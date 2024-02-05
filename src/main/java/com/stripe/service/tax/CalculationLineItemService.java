// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.CalculationLineItem;
import com.stripe.net.ApiMode;
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

  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> list(
      String calculation, CalculationLineItemListParams params) throws StripeException {
    return list(calculation, params, (RequestOptions) null);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> list(String calculation, RequestOptions options)
      throws StripeException {
    return list(calculation, (CalculationLineItemListParams) null, options);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> list(String calculation) throws StripeException {
    return list(calculation, (CalculationLineItemListParams) null, (RequestOptions) null);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> list(
      String calculation, CalculationLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(calculation));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(
        request, new TypeToken<StripeCollection<CalculationLineItem>>() {}.getType());
  }
}
