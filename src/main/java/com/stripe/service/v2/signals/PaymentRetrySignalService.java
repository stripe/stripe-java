// File generated from our OpenAPI spec
package com.stripe.service.v2.signals;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.signals.PaymentRetrySignal;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class PaymentRetrySignalService extends ApiService {
  public PaymentRetrySignalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a payment retry signal by ID. */
  public PaymentRetrySignal retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a payment retry signal by ID. */
  public PaymentRetrySignal retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/signals/payment_retry_signals/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PaymentRetrySignal.class);
  }
}
