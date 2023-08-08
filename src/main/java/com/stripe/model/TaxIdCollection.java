// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxIdCollectionCreateParams;
import com.stripe.param.TaxIdCollectionListParams;
import com.stripe.param.TaxIdCollectionRetrieveParams;
import java.util.Map;

public class TaxIdCollection extends StripeCollection<TaxId> {
  /** Creates a new {@code TaxID} object for a customer. */
  public TaxId create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code TaxID} object for a customer. */
  public TaxId create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            params,
            TaxId.class,
            options,
            ApiMode.V1);
  }

  /** Creates a new {@code TaxID} object for a customer. */
  public TaxId create(TaxIdCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code TaxID} object for a customer. */
  public TaxId create(TaxIdCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = this.getUrl();
    ApiResource.checkNullTypedParams(url, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            TaxId.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            params,
            TaxIdCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(TaxIdCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(TaxIdCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = this.getUrl();
    ApiResource.checkNullTypedParams(url, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            TaxIdCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the {@code TaxID} object with the given identifier. */
  public TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the {@code TaxID} object with the given identifier. */
  public TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the {@code TaxID} object with the given identifier. */
  public TaxId retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            params,
            TaxId.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the {@code TaxID} object with the given identifier. */
  public TaxId retrieve(String id, TaxIdCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(url, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            TaxId.class,
            options,
            ApiMode.V1);
  }
}
