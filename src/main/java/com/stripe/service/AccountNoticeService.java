// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.AccountNotice;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountNoticeListParams;
import com.stripe.param.AccountNoticeRetrieveParams;
import com.stripe.param.AccountNoticeUpdateParams;

public final class AccountNoticeService extends ApiService {
  public AccountNoticeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<AccountNotice> list(AccountNoticeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<AccountNotice> list(RequestOptions options) throws StripeException {
    return list((AccountNoticeListParams) null, options);
  }
  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<AccountNotice> list() throws StripeException {
    return list((AccountNoticeListParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public StripeCollection<AccountNotice> list(
      AccountNoticeListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/account_notices";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<AccountNotice>>() {}.getType());
  }
  /** Retrieves an {@code AccountNotice} object. */
  public AccountNotice retrieve(String accountNotice, AccountNoticeRetrieveParams params)
      throws StripeException {
    return retrieve(accountNotice, params, (RequestOptions) null);
  }
  /** Retrieves an {@code AccountNotice} object. */
  public AccountNotice retrieve(String accountNotice, RequestOptions options)
      throws StripeException {
    return retrieve(accountNotice, (AccountNoticeRetrieveParams) null, options);
  }
  /** Retrieves an {@code AccountNotice} object. */
  public AccountNotice retrieve(String accountNotice) throws StripeException {
    return retrieve(accountNotice, (AccountNoticeRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an {@code AccountNotice} object. */
  public AccountNotice retrieve(
      String accountNotice, AccountNoticeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(accountNotice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, AccountNotice.class);
  }
  /** Updates an {@code AccountNotice} object. */
  public AccountNotice update(String accountNotice, AccountNoticeUpdateParams params)
      throws StripeException {
    return update(accountNotice, params, (RequestOptions) null);
  }
  /** Updates an {@code AccountNotice} object. */
  public AccountNotice update(
      String accountNotice, AccountNoticeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(accountNotice));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, AccountNotice.class);
  }
}
