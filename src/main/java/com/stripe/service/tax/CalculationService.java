// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.tax.Calculation;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.CalculationCreateParams;
import com.stripe.param.tax.CalculationRetrieveParams;

public final class CalculationService extends ApiService {
  public CalculationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public Calculation retrieve(String calculation, CalculationRetrieveParams params)
      throws StripeException {
    return retrieve(calculation, params, (RequestOptions) null);
  }
  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public Calculation retrieve(String calculation, RequestOptions options) throws StripeException {
    return retrieve(calculation, (CalculationRetrieveParams) null, options);
  }
  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public Calculation retrieve(String calculation) throws StripeException {
    return retrieve(calculation, (CalculationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Tax {@code Calculation} object, if the calculation hasn’t expired. */
  public Calculation retrieve(
      String calculation, CalculationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/calculations/%s", ApiResource.urlEncodeId(calculation));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Calculation.class);
  }
  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public Calculation create(CalculationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Calculates tax based on the input and returns a Tax {@code Calculation} object. */
  public Calculation create(CalculationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/calculations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Calculation.class);
  }

  public com.stripe.service.tax.CalculationLineItemService lineItems() {
    return new com.stripe.service.tax.CalculationLineItemService(this.getResponseGetter());
  }
}
