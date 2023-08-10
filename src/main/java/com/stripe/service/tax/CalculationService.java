// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Calculation;
import com.stripe.model.tax.CalculationLineItem;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CalculationCreateParams;
import com.stripe.param.tax.CalculationListLineItemsParams;

public final class CalculationService extends ApiService {
  public CalculationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public Calculation create(CalculationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Calculates tax based on input and returns a Tax {@code Calculation} object. */
  public Calculation create(CalculationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/calculations";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Calculation.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> listLineItems(
      String calculation, CalculationListLineItemsParams params) throws StripeException {
    return listLineItems(calculation, params, (RequestOptions) null);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> listLineItems(
      String calculation, RequestOptions options) throws StripeException {
    return listLineItems(calculation, (CalculationListLineItemsParams) null, options);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> listLineItems(String calculation)
      throws StripeException {
    return listLineItems(calculation, (CalculationListLineItemsParams) null, (RequestOptions) null);
  }
  /** Retrieves the line items of a persisted tax calculation as a collection. */
  public StripeCollection<CalculationLineItem> listLineItems(
      String calculation, CalculationListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/tax/calculations/%s/line_items", ApiResource.urlEncodeId(calculation));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CalculationLineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
