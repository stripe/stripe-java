// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FrMealVouchersOnboardingCreateParams;
import com.stripe.param.FrMealVouchersOnboardingListParams;
import com.stripe.param.FrMealVouchersOnboardingRetrieveParams;
import com.stripe.param.FrMealVouchersOnboardingUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The French Meal Vouchers Onboarding resource encapsulates the onboarding status and other related
 * information for a single restaurant (SIRET number) in the context of the French Meal Vouchers
 * program.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FrMealVouchersOnboarding extends ApiResource
    implements HasId, MetadataStore<FrMealVouchersOnboarding> {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Name of the restaurant. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code fr_meal_vouchers_onboarding}.
   */
  @SerializedName("object")
  String object;

  /** Postal code of the restaurant. */
  @SerializedName("postal_code")
  String postalCode;

  /** This represents the onboarding state of the restaurant on different providers. */
  @SerializedName("providers")
  Providers providers;

  /** SIRET number associated with the restaurant. */
  @SerializedName("siret")
  String siret;

  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public static FrMealVouchersOnboarding create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public static FrMealVouchersOnboarding create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public static FrMealVouchersOnboarding create(FrMealVouchersOnboardingCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a French Meal Vouchers Onboarding object that represents a restaurant’s onboarding
   * status and starts the onboarding process.
   */
  public static FrMealVouchersOnboarding create(
      FrMealVouchersOnboardingCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /** Lists French Meal Vouchers Onboarding objects. */
  public static FrMealVouchersOnboardingCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists French Meal Vouchers Onboarding objects. */
  public static FrMealVouchersOnboardingCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboardingCollection.class);
  }

  /** Lists French Meal Vouchers Onboarding objects. */
  public static FrMealVouchersOnboardingCollection list(FrMealVouchersOnboardingListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists French Meal Vouchers Onboarding objects. */
  public static FrMealVouchersOnboardingCollection list(
      FrMealVouchersOnboardingListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/fr_meal_vouchers_onboardings";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboardingCollection.class);
  }

  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public static FrMealVouchersOnboarding retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public static FrMealVouchersOnboarding retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public static FrMealVouchersOnboarding retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /** Retrieves the details of a French Meal Vouchers Onboarding object. */
  public static FrMealVouchersOnboarding retrieve(
      String id, FrMealVouchersOnboardingRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  @Override
  public FrMealVouchersOnboarding update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  @Override
  public FrMealVouchersOnboarding update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding update(FrMealVouchersOnboardingUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the details of a restaurant’s French Meal Vouchers Onboarding object. */
  public FrMealVouchersOnboarding update(
      FrMealVouchersOnboardingUpdateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/fr_meal_vouchers_onboardings/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, FrMealVouchersOnboarding.class);
  }

  /** This represents the onboarding state of the restaurant on different providers. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Providers extends StripeObject {
    /** This represents the onboarding state of the restaurant on Conecs. */
    @SerializedName("conecs")
    Conecs conecs;

    /** This represents the onboarding state of the restaurant on Conecs. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Conecs extends StripeObject {
      /** This represents information which issuers are available to this restaurant via Conecs. */
      @SerializedName("issuers")
      Issuers issuers;

      /**
       * This represents information about outstanding requirements for this restaurant to onboard
       * to Conecs.
       */
      @SerializedName("requirements")
      Requirements requirements;

      /**
       * Status of the restaurant's onboarding to Conecs
       *
       * <p>One of {@code action_required}, {@code active}, {@code disentitled}, or {@code pending}.
       */
      @SerializedName("status")
      String status;

      /** This represents information which issuers are available to this restaurant via Conecs. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuers extends StripeObject {
        /**
         * Issuers are available to this restaurant via Conecs, will be blank if the onboarding to
         * Conecs is not complete or unsuccessful.
         */
        @SerializedName("available")
        List<String> available;
      }

      /**
       * This represents information about outstanding requirements for this restaurant to onboard
       * to Conecs.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Requirements extends StripeObject {
        /**
         * Information any errors that are preventing the onboarding to Conecs from being completed.
         */
        @SerializedName("errors")
        List<FrMealVouchersOnboarding.Providers.Conecs.Requirements.Errors> errors;

        /** Fields that need to be provided to complete the onboarding to Conecs. */
        @SerializedName("past_due")
        List<String> pastDue;

        /**
         * For more details about Errors, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Errors extends StripeObject {
          /**
           * The code for the type of error.
           *
           * <p>One of {@code postal_code_invalid}, or {@code siret_invalid}.
           */
          @SerializedName("code")
          String code;

          /** An informative message that provides additional details about the error. */
          @SerializedName("message")
          String message;

          /**
           * The specific onboarding requirement field (in the requirements hash) that needs to be
           * resolved.
           *
           * <p>One of {@code postal_code}, or {@code siret}.
           */
          @SerializedName("requirement")
          String requirement;
        }
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(providers, responseGetter);
  }
}
