// File generated from our OpenAPI spec
package com.stripe.service.climate;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.climate.Supplier;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.climate.SupplierListParams;
import com.stripe.param.climate.SupplierRetrieveParams;

public final class SupplierService extends ApiService {
  public SupplierService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a Climate supplier object. */
  public Supplier retrieve(String supplier, SupplierRetrieveParams params) throws StripeException {
    return retrieve(supplier, params, (RequestOptions) null);
  }
  /** Retrieves a Climate supplier object. */
  public Supplier retrieve(String supplier, RequestOptions options) throws StripeException {
    return retrieve(supplier, (SupplierRetrieveParams) null, options);
  }
  /** Retrieves a Climate supplier object. */
  public Supplier retrieve(String supplier) throws StripeException {
    return retrieve(supplier, (SupplierRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Climate supplier object. */
  public Supplier retrieve(String supplier, SupplierRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/suppliers/%s", ApiResource.urlEncodeId(supplier));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Supplier.class);
  }
  /** Lists all available Climate supplier objects. */
  public StripeCollection<Supplier> list(SupplierListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all available Climate supplier objects. */
  public StripeCollection<Supplier> list(RequestOptions options) throws StripeException {
    return list((SupplierListParams) null, options);
  }
  /** Lists all available Climate supplier objects. */
  public StripeCollection<Supplier> list() throws StripeException {
    return list((SupplierListParams) null, (RequestOptions) null);
  }
  /** Lists all available Climate supplier objects. */
  public StripeCollection<Supplier> list(SupplierListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/suppliers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Supplier>>() {}.getType());
  }
}
