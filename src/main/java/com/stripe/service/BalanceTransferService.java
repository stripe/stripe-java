// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransfer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceTransferCreateParams;

public final class BalanceTransferService extends ApiService {
  public BalanceTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public BalanceTransfer create(BalanceTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a balance transfer. For Issuing use cases, funds will be debited immediately from the
   * source balance and credited to the destination balance immediately (if your account is based in
   * the US) or next-business-day (if your account is based in the EU). For Segregated Separate
   * Charges and Transfers use cases, funds will be debited immediately from the source balance and
   * credited immediately to the destination balance.
   */
  public BalanceTransfer create(BalanceTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BalanceTransfer.class);
  }
}
