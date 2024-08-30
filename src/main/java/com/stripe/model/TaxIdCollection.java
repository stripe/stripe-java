// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxIdCollectionCreateParams;
import com.stripe.param.TaxIdCollectionListParams;
import com.stripe.param.TaxIdCollectionRetrieveParams;
import java.util.Map;

public class TaxIdCollection extends StripeCollection<TaxId> {
  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(TaxIdCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(TaxIdCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(TaxIdCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(TaxIdCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, TaxIdCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, TaxId.class);
  }
}
