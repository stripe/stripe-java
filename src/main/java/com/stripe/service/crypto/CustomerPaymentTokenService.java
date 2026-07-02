// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.crypto.CustomerPaymentToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.CustomerPaymentTokenListParams;

public final class CustomerPaymentTokenService extends ApiService {
  public CustomerPaymentTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists the Payment Tokens for a Crypto Customer. */
  public StripeCollection<CustomerPaymentToken> list(
      String id, CustomerPaymentTokenListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Lists the Payment Tokens for a Crypto Customer. */
  public StripeCollection<CustomerPaymentToken> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CustomerPaymentTokenListParams) null, options);
  }
  /** Lists the Payment Tokens for a Crypto Customer. */
  public StripeCollection<CustomerPaymentToken> list(String id) throws StripeException {
    return list(id, (CustomerPaymentTokenListParams) null, (RequestOptions) null);
  }
  /** Lists the Payment Tokens for a Crypto Customer. */
  public StripeCollection<CustomerPaymentToken> list(
      String id, CustomerPaymentTokenListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/crypto/customers/%s/payment_tokens", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CustomerPaymentToken>>() {}.getType());
  }
}
