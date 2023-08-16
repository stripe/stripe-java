// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BankAccountVerifyParams;

public final class BankAccountService extends ApiService {
  public BankAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id, BankAccountVerifyParams params)
      throws StripeException {
    return verify(customer, id, params, (RequestOptions) null);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id, RequestOptions options)
      throws StripeException {
    return verify(customer, id, (BankAccountVerifyParams) null, options);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id) throws StripeException {
    return verify(customer, id, (BankAccountVerifyParams) null, (RequestOptions) null);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(
      String customer, String id, BankAccountVerifyParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s/verify",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            BankAccount.class,
            options,
            ApiMode.V1);
  }
}
