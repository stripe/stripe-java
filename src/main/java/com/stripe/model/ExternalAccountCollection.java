// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccountCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccountCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String id, ExternalAccountCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }
}
