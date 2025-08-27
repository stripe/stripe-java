// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.LicenseFeeSubscription;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class LicenseFeeSubscriptionService extends ApiService {
  public LicenseFeeSubscriptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a License Fee Subscription object. */
  public LicenseFeeSubscription retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a License Fee Subscription object. */
  public LicenseFeeSubscription retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/license_fee_subscriptions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, LicenseFeeSubscription.class);
  }
}
