// File generated from our OpenAPI spec
package com.stripe.service.v2.commerce.productcatalog;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.commerce.ProductCatalogImport;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.commerce.productcatalog.ImportCreateParams;
import com.stripe.param.v2.commerce.productcatalog.ImportListParams;

public final class ImportService extends ApiService {
  public ImportService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of ProductCatalogImport objects. */
  public StripeCollection<ProductCatalogImport> list(ImportListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of ProductCatalogImport objects. */
  public StripeCollection<ProductCatalogImport> list(RequestOptions options)
      throws StripeException {
    return list((ImportListParams) null, options);
  }
  /** Returns a list of ProductCatalogImport objects. */
  public StripeCollection<ProductCatalogImport> list() throws StripeException {
    return list((ImportListParams) null, (RequestOptions) null);
  }
  /** Returns a list of ProductCatalogImport objects. */
  public StripeCollection<ProductCatalogImport> list(
      ImportListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/commerce/product_catalog/imports";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ProductCatalogImport>>() {}.getType());
  }
  /** Creates a ProductCatalogImport. */
  public ProductCatalogImport create(ImportCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a ProductCatalogImport. */
  public ProductCatalogImport create(ImportCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/commerce/product_catalog/imports";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ProductCatalogImport.class);
  }
  /** Retrieves a ProductCatalogImport by ID. */
  public ProductCatalogImport retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a ProductCatalogImport by ID. */
  public ProductCatalogImport retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/commerce/product_catalog/imports/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ProductCatalogImport.class);
  }
}
