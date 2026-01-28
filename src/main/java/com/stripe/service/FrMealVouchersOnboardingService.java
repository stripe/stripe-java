// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.FrMealVouchersOnboarding;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FrMealVouchersOnboardingCreateParams;
import com.stripe.param.FrMealVouchersOnboardingListParams;
import com.stripe.param.FrMealVouchersOnboardingRetrieveParams;
import com.stripe.param.FrMealVouchersOnboardingUpdateParams;

public final class FrMealVouchersOnboardingService extends ApiService {
  public FrMealVouchersOnboardingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists French Meal Vouchers Onboarding objects. */
  public StripeCollection<FrMealVouchersOnboarding> list(FrMealVouchersOnboardingListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists French Meal Vouchers Onboarding objects. */
  public StripeCollection<FrMealVouchersOnboarding> list(RequestOptions options)
      throws StripeException {
    return list((FrMealVouchersOnboardingListParams) null, options);
  }
  /** Lists French Meal Vouchers Onboarding objects. */
  public StripeCollection<FrMealVouchersOnboarding> list() throws StripeException {
    return list((FrMealVouchersOnboardingListParams) null, (RequestOptions) null);
  }
  /** Lists French Meal Vouchers Onboarding objects. */
  public StripeCollection<FrMealVouchersOnboarding> list(
      FrMealVouchersOnboardingListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<FrMealVouchersOnboarding>>() {}.getType());
  }
  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public FrMealVouchersOnboarding create(FrMealVouchersOnboardingCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public FrMealVouchersOnboarding create(
      FrMealVouchersOnboardingCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FrMealVouchersOnboarding.class);
  }
  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding retrieve(String id, FrMealVouchersOnboardingRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (FrMealVouchersOnboardingRetrieveParams) null, options);
  }
  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding retrieve(String id) throws StripeException {
    return retrieve(id, (FrMealVouchersOnboardingRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding retrieve(
      String id, FrMealVouchersOnboardingRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FrMealVouchersOnboarding.class);
  }
  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding update(String id, FrMealVouchersOnboardingUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding update(
      String id, FrMealVouchersOnboardingUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FrMealVouchersOnboarding.class);
  }
}
