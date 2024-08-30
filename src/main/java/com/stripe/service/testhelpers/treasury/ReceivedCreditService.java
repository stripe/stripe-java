// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.ReceivedCredit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.ReceivedCreditCreateParams;

public final class ReceivedCreditService extends ApiService {
  public ReceivedCreditService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
   * mode, you can’t directly create ReceivedCredits initiated by third parties.
   */
  public ReceivedCredit create(ReceivedCreditCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
   * mode, you can’t directly create ReceivedCredits initiated by third parties.
   */
  public ReceivedCredit create(ReceivedCreditCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/treasury/received_credits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ReceivedCredit.class);
  }
}
