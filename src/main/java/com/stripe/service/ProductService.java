// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Product;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ProductCreateParams;
import com.stripe.param.ProductListParams;
import com.stripe.param.ProductRetrieveParams;
import com.stripe.param.ProductSearchParams;
import com.stripe.param.ProductUpdateParams;

public final class ProductService extends ApiService {
  public ProductService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Product.class);
  }
  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public Product retrieve(String id, ProductRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public Product retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ProductRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public Product retrieve(String id) throws StripeException {
    return retrieve(id, (ProductRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public Product retrieve(String id, ProductRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Product.class);
  }
  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(String id, ProductUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(String id, RequestOptions options) throws StripeException {
    return update(id, (ProductUpdateParams) null, options);
  }
  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(String id) throws StripeException {
    return update(id, (ProductUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(String id, ProductUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Product.class);
  }
  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public StripeCollection<Product> list(ProductListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public StripeCollection<Product> list(RequestOptions options) throws StripeException {
    return list((ProductListParams) null, options);
  }
  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public StripeCollection<Product> list() throws StripeException {
    return list((ProductListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public StripeCollection<Product> list(ProductListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/products";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Product>>() {}.getType());
  }
  /** Creates a new product object. */
  public Product create(ProductCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new product object. */
  public Product create(ProductCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/products";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Product.class);
  }
  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Product> search(ProductSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Product> search(ProductSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/products/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeSearchResult<Product>>() {}.getType());
  }
}
