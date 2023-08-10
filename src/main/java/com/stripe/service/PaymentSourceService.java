// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentSource;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentSourceCreateParams;
import com.stripe.param.PaymentSourceDeleteParams;
import com.stripe.param.PaymentSourceListParams;
import com.stripe.param.PaymentSourceRetrieveParams;
import com.stripe.param.PaymentSourceUpdateParams;

public final class PaymentSourceService extends ApiService {
  public PaymentSourceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(String customer, PaymentSourceListParams params)
      throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (PaymentSourceListParams) null, options);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(String customer) throws StripeException {
    return list(customer, (PaymentSourceListParams) null, (RequestOptions) null);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(
      String customer, PaymentSourceListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/sources", ApiResource.urlEncodeId(customer));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<PaymentSource>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource create(String customer, PaymentSourceCreateParams params)
      throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource create(
      String customer, PaymentSourceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/sources", ApiResource.urlEncodeId(customer));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentSource.class,
            options,
            ApiMode.V1);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String customer, String id, PaymentSourceRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String customer, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customer, id, (PaymentSourceRetrieveParams) null, options);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String customer, String id) throws StripeException {
    return retrieve(customer, id, (PaymentSourceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(
      String customer, String id, PaymentSourceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentSource.class,
            options,
            ApiMode.V1);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id, PaymentSourceUpdateParams params)
      throws StripeException {
    return update(customer, id, params, (RequestOptions) null);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id, RequestOptions options)
      throws StripeException {
    return update(customer, id, (PaymentSourceUpdateParams) null, options);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id) throws StripeException {
    return update(customer, id, (PaymentSourceUpdateParams) null, (RequestOptions) null);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(
      String customer, String id, PaymentSourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentSource.class,
            options,
            ApiMode.V1);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id, PaymentSourceDeleteParams params)
      throws StripeException {
    return delete(customer, id, params, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id, RequestOptions options)
      throws StripeException {
    return delete(customer, id, (PaymentSourceDeleteParams) null, options);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id) throws StripeException {
    return delete(customer, id, (PaymentSourceDeleteParams) null, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(
      String customer, String id, PaymentSourceDeleteParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentSource.class,
            options,
            ApiMode.V1);
  }
}
