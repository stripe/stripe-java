// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandboxRenewOnboardingLinkParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Details about the onboarding link. If omitted, existing details are reused. Omitted URL fields
   * retain their existing values.
   */
  @SerializedName("onboarding_link_details")
  OnboardingLinkDetails onboardingLinkDetails;

  private ClaimableSandboxRenewOnboardingLinkParams(
      Map<String, Object> extraParams, OnboardingLinkDetails onboardingLinkDetails) {
    this.extraParams = extraParams;
    this.onboardingLinkDetails = onboardingLinkDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private OnboardingLinkDetails onboardingLinkDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public ClaimableSandboxRenewOnboardingLinkParams build() {
      return new ClaimableSandboxRenewOnboardingLinkParams(
          this.extraParams, this.onboardingLinkDetails);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ClaimableSandboxRenewOnboardingLinkParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ClaimableSandboxRenewOnboardingLinkParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Details about the onboarding link. If omitted, existing details are reused. Omitted URL
     * fields retain their existing values.
     */
    public Builder setOnboardingLinkDetails(
        ClaimableSandboxRenewOnboardingLinkParams.OnboardingLinkDetails onboardingLinkDetails) {
      this.onboardingLinkDetails = onboardingLinkDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class OnboardingLinkDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The URL the user will be redirected to if the onboarding link is expired or invalid. If
     * omitted, the existing refresh URL is retained. The URL should generate a new onboarding link
     * and redirect the user to it.
     */
    @SerializedName("refresh_url")
    String refreshUrl;

    /**
     * The URL offered to the user as a way back to your app after they claim the sandbox. If
     * omitted, the existing return URL is retained. Set to null to clear it.
     */
    @SerializedName("return_url")
    String returnUrl;

    private OnboardingLinkDetails(
        Map<String, Object> extraParams, String refreshUrl, String returnUrl) {
      this.extraParams = extraParams;
      this.refreshUrl = refreshUrl;
      this.returnUrl = returnUrl;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String refreshUrl;

      private String returnUrl;

      /** Finalize and obtain parameter instance from this builder. */
      public ClaimableSandboxRenewOnboardingLinkParams.OnboardingLinkDetails build() {
        return new ClaimableSandboxRenewOnboardingLinkParams.OnboardingLinkDetails(
            this.extraParams, this.refreshUrl, this.returnUrl);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ClaimableSandboxRenewOnboardingLinkParams.OnboardingLinkDetails#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ClaimableSandboxRenewOnboardingLinkParams.OnboardingLinkDetails#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The URL the user will be redirected to if the onboarding link is expired or invalid. If
       * omitted, the existing refresh URL is retained. The URL should generate a new onboarding
       * link and redirect the user to it.
       */
      public Builder setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
        return this;
      }

      /**
       * The URL offered to the user as a way back to your app after they claim the sandbox. If
       * omitted, the existing return URL is retained. Set to null to clear it.
       */
      public Builder setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
      }
    }
  }
}
