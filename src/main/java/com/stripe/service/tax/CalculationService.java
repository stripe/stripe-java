// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.tax.Calculation;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CalculationCreateParams;

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

  public com.stripe.service.tax.CalculationLineItemService lineItems() {
    return new com.stripe.service.tax.CalculationLineItemService(this.getResponseGetter());
  }
}
