// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.ExternalAccountCollectionCreateParams;
import com.stripe.param.ExternalAccountCollectionListParams;
import com.stripe.param.ExternalAccountCollectionRetrieveParams;
import java.util.Map;

public class ExternalAccountCollection extends StripeCollection<ExternalAccount> {
  /** Create an external account for a given account. */
  public ExternalAccount create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(ExternalAccountCollectionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(
      ExternalAccountCollectionCreateParams params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            ExternalAccountCollection.class,
            options,
            ApiMode.V1);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(ExternalAccountCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(
      ExternalAccountCollectionListParams params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccountCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String id, ExternalAccountCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }
}
