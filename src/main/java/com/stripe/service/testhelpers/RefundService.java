// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.Refund;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.RefundExpireParams;

public final class RefundService extends ApiService {
  public RefundService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Expire a refund with a status of {@code requires_action}. */
  public Refund expire(String refund, RefundExpireParams params) throws StripeException {
    return expire(refund, params, (RequestOptions) null);
  }
  /** Expire a refund with a status of {@code requires_action}. */
  public Refund expire(String refund, RequestOptions options) throws StripeException {
    return expire(refund, (RefundExpireParams) null, options);
  }
  /** Expire a refund with a status of {@code requires_action}. */
  public Refund expire(String refund) throws StripeException {
    return expire(refund, (RefundExpireParams) null, (RequestOptions) null);
  }
  /** Expire a refund with a status of {@code requires_action}. */
  public Refund expire(String refund, RefundExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/test_helpers/refunds/%s/expire", ApiResource.urlEncodeId(refund));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Refund.class,
            options,
            ApiMode.V1);
  }
}
