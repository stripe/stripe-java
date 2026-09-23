// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.Eligibility;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class EligibilityService extends ApiService {
  public EligibilityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Checks whether a project is eligible to provision resources with a provider, including any
   * outstanding KYC requirements that must be satisfied first.
   */
  public Eligibility retrieve() throws StripeException {
    return retrieve((RequestOptions) null);
  }
  /**
   * Checks whether a project is eligible to provision resources with a provider, including any
   * outstanding KYC requirements that must be satisfied first.
   */
  public Eligibility retrieve(RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/eligibility";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Eligibility.class);
  }
}
