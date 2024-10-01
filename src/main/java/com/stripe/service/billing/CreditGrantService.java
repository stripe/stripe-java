// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.CreditGrant;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditGrantCreateParams;
import com.stripe.param.billing.CreditGrantExpireParams;
import com.stripe.param.billing.CreditGrantListParams;
import com.stripe.param.billing.CreditGrantRetrieveParams;
import com.stripe.param.billing.CreditGrantUpdateParams;
import com.stripe.param.billing.CreditGrantVoidGrantParams;

public final class CreditGrantService extends ApiService {
  public CreditGrantService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of credit grants. */
  public StripeCollection<CreditGrant> list(CreditGrantListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of credit grants. */
  public StripeCollection<CreditGrant> list(RequestOptions options) throws StripeException {
    return list((CreditGrantListParams) null, options);
  }
  /** Retrieve a list of credit grants. */
  public StripeCollection<CreditGrant> list() throws StripeException {
    return list((CreditGrantListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of credit grants. */
  public StripeCollection<CreditGrant> list(CreditGrantListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<CreditGrant>>() {}.getType());
  }
  /** Creates a credit grant. */
  public CreditGrant create(CreditGrantCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a credit grant. */
  public CreditGrant create(CreditGrantCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/credit_grants";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditGrant.class);
  }
  /** Retrieves a credit grant. */
  public CreditGrant retrieve(String id, CreditGrantRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a credit grant. */
  public CreditGrant retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CreditGrantRetrieveParams) null, options);
  }
  /** Retrieves a credit grant. */
  public CreditGrant retrieve(String id) throws StripeException {
    return retrieve(id, (CreditGrantRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a credit grant. */
  public CreditGrant retrieve(String id, CreditGrantRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditGrant.class);
  }
  /** Updates a credit grant. */
  public CreditGrant update(String id, CreditGrantUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a credit grant. */
  public CreditGrant update(String id, RequestOptions options) throws StripeException {
    return update(id, (CreditGrantUpdateParams) null, options);
  }
  /** Updates a credit grant. */
  public CreditGrant update(String id) throws StripeException {
    return update(id, (CreditGrantUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a credit grant. */
  public CreditGrant update(String id, CreditGrantUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditGrant.class);
  }
  /** Expires a credit grant. */
  public CreditGrant expire(String id, CreditGrantExpireParams params) throws StripeException {
    return expire(id, params, (RequestOptions) null);
  }
  /** Expires a credit grant. */
  public CreditGrant expire(String id, RequestOptions options) throws StripeException {
    return expire(id, (CreditGrantExpireParams) null, options);
  }
  /** Expires a credit grant. */
  public CreditGrant expire(String id) throws StripeException {
    return expire(id, (CreditGrantExpireParams) null, (RequestOptions) null);
  }
  /** Expires a credit grant. */
  public CreditGrant expire(String id, CreditGrantExpireParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s/expire", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditGrant.class);
  }
  /** Voids a credit grant. */
  public CreditGrant voidGrant(String id, CreditGrantVoidGrantParams params)
      throws StripeException {
    return voidGrant(id, params, (RequestOptions) null);
  }
  /** Voids a credit grant. */
  public CreditGrant voidGrant(String id, RequestOptions options) throws StripeException {
    return voidGrant(id, (CreditGrantVoidGrantParams) null, options);
  }
  /** Voids a credit grant. */
  public CreditGrant voidGrant(String id) throws StripeException {
    return voidGrant(id, (CreditGrantVoidGrantParams) null, (RequestOptions) null);
  }
  /** Voids a credit grant. */
  public CreditGrant voidGrant(String id, CreditGrantVoidGrantParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/credit_grants/%s/void", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditGrant.class);
  }
}
