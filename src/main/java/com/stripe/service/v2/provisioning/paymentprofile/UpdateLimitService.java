// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning.paymentprofile;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.PaymentProfile;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.paymentprofile.UpdateLimitUpdateParams;

public final class UpdateLimitService extends ApiService {
  public UpdateLimitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Updates the usage limit on the payment profile for a provider. */
  public PaymentProfile update(UpdateLimitUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }
  /** Updates the usage limit on the payment profile for a provider. */
  public PaymentProfile update(UpdateLimitUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/provisioning/payment_profile/update_limit";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentProfile.class);
  }
}
