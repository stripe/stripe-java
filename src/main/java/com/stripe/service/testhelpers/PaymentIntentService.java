// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentIntentSimulateCryptoDepositParams;

public final class PaymentIntentService extends ApiService {
  public PaymentIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Simulate an incoming crypto deposit for a testmode PaymentIntent with {@code
   * payment_method_options[crypto][mode]=deposit}. The {@code transaction_hash} parameter
   * determines whether the simulated deposit succeeds or fails. Learn more about <a
   * href="https://stripe.com/docs/payments/deposit-mode-stablecoin-payments#test-your-integration">testing
   * your integration</a>.
   */
  public PaymentIntent simulateCryptoDeposit(
      String intent, PaymentIntentSimulateCryptoDepositParams params) throws StripeException {
    return simulateCryptoDeposit(intent, params, (RequestOptions) null);
  }
  /**
   * Simulate an incoming crypto deposit for a testmode PaymentIntent with {@code
   * payment_method_options[crypto][mode]=deposit}. The {@code transaction_hash} parameter
   * determines whether the simulated deposit succeeds or fails. Learn more about <a
   * href="https://stripe.com/docs/payments/deposit-mode-stablecoin-payments#test-your-integration">testing
   * your integration</a>.
   */
  public PaymentIntent simulateCryptoDeposit(
      String intent, PaymentIntentSimulateCryptoDepositParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/payment_intents/%s/simulate_crypto_deposit",
            ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
}
