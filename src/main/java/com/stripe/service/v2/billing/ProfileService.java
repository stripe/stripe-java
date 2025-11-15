// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.Profile;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ProfileCreateParams;
import com.stripe.param.v2.billing.ProfileListParams;
import com.stripe.param.v2.billing.ProfileUpdateParams;

public final class ProfileService extends ApiService {
  public ProfileService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Billing Profiles. */
  public StripeCollection<Profile> list(ProfileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List Billing Profiles. */
  public StripeCollection<Profile> list(ProfileListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/profiles";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Profile>>() {}.getType());
  }
  /** Create a BillingProfile object. */
  public Profile create(ProfileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a BillingProfile object. */
  public Profile create(ProfileCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/profiles";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Profile.class);
  }
  /** Retrieve a BillingProfile object. */
  public Profile retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a BillingProfile object. */
  public Profile retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/profiles/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Profile.class);
  }
  /** Update a BillingProfile object. */
  public Profile update(String id, ProfileUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a BillingProfile object. */
  public Profile update(String id, RequestOptions options) throws StripeException {
    return update(id, (ProfileUpdateParams) null, options);
  }
  /** Update a BillingProfile object. */
  public Profile update(String id) throws StripeException {
    return update(id, (ProfileUpdateParams) null, (RequestOptions) null);
  }
  /** Update a BillingProfile object. */
  public Profile update(String id, ProfileUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/profiles/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Profile.class);
  }
}
