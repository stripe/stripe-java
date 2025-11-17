// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.OnboardingLinkCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Returns redirect links used for onboarding onto Tap to Pay on iPhone. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OnboardingLink extends ApiResource {
  /** Link type options associated with the current onboarding link object. */
  @SerializedName("link_options")
  LinkOptions linkOptions;

  /**
   * The type of link being generated.
   *
   * <p>Equal to {@code apple_terms_and_conditions}.
   */
  @SerializedName("link_type")
  String linkType;

  @SerializedName("object")
  String object;

  /** Stripe account ID to generate the link for. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** The link passed back to the user for their onboarding. */
  @SerializedName("redirect_url")
  String redirectUrl;

  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public static OnboardingLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public static OnboardingLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/onboarding_links";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, OnboardingLink.class);
  }

  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public static OnboardingLink create(OnboardingLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new {@code OnboardingLink} object that contains a redirect_url used for onboarding
   * onto Tap to Pay on iPhone.
   */
  public static OnboardingLink create(OnboardingLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/onboarding_links";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OnboardingLink.class);
  }

  /** Link type options associated with the current onboarding link object. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkOptions extends StripeObject {
    /** The options associated with the Apple Terms and Conditions link type. */
    @SerializedName("apple_terms_and_conditions")
    AppleTermsAndConditions appleTermsAndConditions;

    /** Options associated with the Apple Terms and Conditions link type. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AppleTermsAndConditions extends StripeObject {
      /** Whether the link should also support users relinking their Apple account. */
      @SerializedName("allow_relinking")
      Boolean allowRelinking;

      /** The business name of the merchant accepting Apple's Terms and Conditions. */
      @SerializedName("merchant_display_name")
      String merchantDisplayName;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(linkOptions, responseGetter);
  }
}
