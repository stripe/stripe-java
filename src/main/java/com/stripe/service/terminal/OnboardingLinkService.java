// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.OnboardingLink;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.OnboardingLinkCreateParams;

public final class OnboardingLinkService extends ApiService {
  public OnboardingLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public OnboardingLink create(OnboardingLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public OnboardingLink create(OnboardingLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/onboarding_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OnboardingLink.class);
  }
}
