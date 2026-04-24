// File generated from our OpenAPI spec
package com.stripe.service.v2.network;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.network.BusinessProfile;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class BusinessProfileService extends ApiService {
  public BusinessProfileService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve the Stripe profile associated with the requesting merchant and livemode. */
  public BusinessProfile me() throws StripeException {
    return me((RequestOptions) null);
  }
  /** Retrieve the Stripe profile associated with the requesting merchant and livemode. */
  public BusinessProfile me(RequestOptions options) throws StripeException {
    String path = "/v2/network/business_profiles/me";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, BusinessProfile.class);
  }
  /** Retrieve a Stripe profile by its Network ID. */
  public BusinessProfile retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Stripe profile by its Network ID. */
  public BusinessProfile retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/network/business_profiles/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, BusinessProfile.class);
  }
}
