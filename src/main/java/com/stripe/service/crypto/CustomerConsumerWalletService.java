// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.crypto.CustomerConsumerWallet;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.CustomerConsumerWalletListParams;

public final class CustomerConsumerWalletService extends ApiService {
  public CustomerConsumerWalletService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists the Consumer Wallets for a Crypto Customer. */
  public StripeCollection<CustomerConsumerWallet> list(
      String id, CustomerConsumerWalletListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Lists the Consumer Wallets for a Crypto Customer. */
  public StripeCollection<CustomerConsumerWallet> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CustomerConsumerWalletListParams) null, options);
  }
  /** Lists the Consumer Wallets for a Crypto Customer. */
  public StripeCollection<CustomerConsumerWallet> list(String id) throws StripeException {
    return list(id, (CustomerConsumerWalletListParams) null, (RequestOptions) null);
  }
  /** Lists the Consumer Wallets for a Crypto Customer. */
  public StripeCollection<CustomerConsumerWallet> list(
      String id, CustomerConsumerWalletListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/crypto/customers/%s/crypto_consumer_wallets", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CustomerConsumerWallet>>() {}.getType());
  }
}
