// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.PaymentProfile;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.PaymentProfileRetrieveParams;
import com.stripe.param.v2.provisioning.PaymentProfileUpdateLimitParams;

public final class PaymentProfileService extends ApiService {
  public PaymentProfileService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the payment profile for the current project. */
  public PaymentProfile retrieve(PaymentProfileRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieves the payment profile for the current project. */
  public PaymentProfile retrieve(RequestOptions options) throws StripeException {
    return retrieve((PaymentProfileRetrieveParams) null, options);
  }
  /** Retrieves the payment profile for the current project. */
  public PaymentProfile retrieve() throws StripeException {
    return retrieve((PaymentProfileRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the payment profile for the current project. */
  public PaymentProfile retrieve(PaymentProfileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/provisioning/payment_profile";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentProfile.class);
  }
  /** Updates the usage limit on the payment profile for a provider. */
  public PaymentProfile updateLimit(PaymentProfileUpdateLimitParams params) throws StripeException {
    return updateLimit(params, (RequestOptions) null);
  }
  /** Updates the usage limit on the payment profile for a provider. */
  public PaymentProfile updateLimit(PaymentProfileUpdateLimitParams params, RequestOptions options)
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
