// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.PaymentMethodRequest;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.PaymentMethodRequestCreateParams;

public final class PaymentMethodRequestService extends ApiService {
  public PaymentMethodRequestService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a request for a customer to authorize a new payment method. */
  public PaymentMethodRequest create(PaymentMethodRequestCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a request for a customer to authorize a new payment method. */
  public PaymentMethodRequest create(RequestOptions options) throws StripeException {
    return create((PaymentMethodRequestCreateParams) null, options);
  }
  /** Creates a request for a customer to authorize a new payment method. */
  public PaymentMethodRequest create() throws StripeException {
    return create((PaymentMethodRequestCreateParams) null, (RequestOptions) null);
  }
  /** Creates a request for a customer to authorize a new payment method. */
  public PaymentMethodRequest create(
      PaymentMethodRequestCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/payment_method_requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentMethodRequest.class);
  }
}
