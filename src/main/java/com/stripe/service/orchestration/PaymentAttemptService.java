// File generated from our OpenAPI spec
package com.stripe.service.orchestration;

import com.stripe.exception.StripeException;
import com.stripe.model.orchestration.PaymentAttempt;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.orchestration.PaymentAttemptRetrieveParams;

public final class PaymentAttemptService extends ApiService {
  public PaymentAttemptService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public PaymentAttempt retrieve(String id, PaymentAttemptRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public PaymentAttempt retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentAttemptRetrieveParams) null, options);
  }
  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public PaymentAttempt retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentAttemptRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public PaymentAttempt retrieve(
      String id, PaymentAttemptRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/orchestration/payment_attempts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentAttempt.class);
  }
}
