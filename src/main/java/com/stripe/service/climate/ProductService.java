// File generated from our OpenAPI spec
package com.stripe.service.climate;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.climate.Product;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.climate.ProductListParams;
import com.stripe.param.climate.ProductRetrieveParams;

public final class ProductService extends ApiService {
  public ProductService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all available Climate product objects. */
  public StripeCollection<Product> list(ProductListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all available Climate product objects. */
  public StripeCollection<Product> list(RequestOptions options) throws StripeException {
    return list((ProductListParams) null, options);
  }
  /** Lists all available Climate product objects. */
  public StripeCollection<Product> list() throws StripeException {
    return list((ProductListParams) null, (RequestOptions) null);
  }
  /** Lists all available Climate product objects. */
  public StripeCollection<Product> list(ProductListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/products";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Product>>() {}.getType());
  }
  /** Retrieves the details of a Climate product with the given ID. */
  public Product retrieve(String product, ProductRetrieveParams params) throws StripeException {
    return retrieve(product, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Climate product with the given ID. */
  public Product retrieve(String product, RequestOptions options) throws StripeException {
    return retrieve(product, (ProductRetrieveParams) null, options);
  }
  /** Retrieves the details of a Climate product with the given ID. */
  public Product retrieve(String product) throws StripeException {
    return retrieve(product, (ProductRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Climate product with the given ID. */
  public Product retrieve(String product, ProductRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/products/%s", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Product.class);
  }
}
