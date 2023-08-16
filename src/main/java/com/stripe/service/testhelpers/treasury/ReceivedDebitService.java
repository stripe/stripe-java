// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.ReceivedDebit;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.ReceivedDebitCreateParams;

public final class ReceivedDebitService extends ApiService {
  public ReceivedDebitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
   * mode, you can’t directly create ReceivedDebits initiated by third parties.
   */
  public ReceivedDebit create(ReceivedDebitCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
   * mode, you can’t directly create ReceivedDebits initiated by third parties.
   */
  public ReceivedDebit create(ReceivedDebitCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/treasury/received_debits";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            ReceivedDebit.class,
            options,
            ApiMode.V1);
  }
}
