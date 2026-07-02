// File generated from our OpenAPI spec
package com.stripe.service.crypto;

import com.stripe.exception.StripeException;
import com.stripe.model.crypto.Customer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.CustomerRetrieveParams;

public final class CustomerService extends ApiService {
  public CustomerService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the details of a Crypto Customer. */
  public Customer retrieve(String id, CustomerRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Crypto Customer. */
  public Customer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CustomerRetrieveParams) null, options);
  }
  /** Retrieves the details of a Crypto Customer. */
  public Customer retrieve(String id) throws StripeException {
    return retrieve(id, (CustomerRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Crypto Customer. */
  public Customer retrieve(String id, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/crypto/customers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Customer.class);
  }

  public com.stripe.service.crypto.CustomerConsumerWalletService consumerWallets() {
    return new com.stripe.service.crypto.CustomerConsumerWalletService(this.getResponseGetter());
  }

  public com.stripe.service.crypto.CustomerPaymentTokenService paymentTokens() {
    return new com.stripe.service.crypto.CustomerPaymentTokenService(this.getResponseGetter());
  }
}
