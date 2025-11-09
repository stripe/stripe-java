// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OnboardingLinkCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Specific fields needed to generate the desired link type. */
  @SerializedName("link_options")
  LinkOptions linkOptions;

  /** <strong>Required.</strong> The type of link being generated. */
  @SerializedName("link_type")
  LinkType linkType;

  /** Stripe account ID to generate the link for. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  private OnboardingLinkCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      LinkOptions linkOptions,
      LinkType linkType,
      String onBehalfOf) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.linkOptions = linkOptions;
    this.linkType = linkType;
    this.onBehalfOf = onBehalfOf;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private LinkOptions linkOptions;

    private LinkType linkType;

    private String onBehalfOf;

    /** Finalize and obtain parameter instance from this builder. */
    public OnboardingLinkCreateParams build() {
      return new OnboardingLinkCreateParams(
          this.expand, this.extraParams, this.linkOptions, this.linkType, this.onBehalfOf);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OnboardingLinkCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OnboardingLinkCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OnboardingLinkCreateParams#extraParams} for the field documentation.
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
     * See {@link OnboardingLinkCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Specific fields needed to generate the desired link type. */
    public Builder setLinkOptions(OnboardingLinkCreateParams.LinkOptions linkOptions) {
      this.linkOptions = linkOptions;
      return this;
    }

    /** <strong>Required.</strong> The type of link being generated. */
    public Builder setLinkType(OnboardingLinkCreateParams.LinkType linkType) {
      this.linkType = linkType;
      return this;
    }

    /** Stripe account ID to generate the link for. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkOptions {
    /** The options associated with the Apple Terms and Conditions link type. */
    @SerializedName("apple_terms_and_conditions")
    AppleTermsAndConditions appleTermsAndConditions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LinkOptions(
        AppleTermsAndConditions appleTermsAndConditions, Map<String, Object> extraParams) {
      this.appleTermsAndConditions = appleTermsAndConditions;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AppleTermsAndConditions appleTermsAndConditions;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OnboardingLinkCreateParams.LinkOptions build() {
        return new OnboardingLinkCreateParams.LinkOptions(
            this.appleTermsAndConditions, this.extraParams);
      }

      /** The options associated with the Apple Terms and Conditions link type. */
      public Builder setAppleTermsAndConditions(
          OnboardingLinkCreateParams.LinkOptions.AppleTermsAndConditions appleTermsAndConditions) {
        this.appleTermsAndConditions = appleTermsAndConditions;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OnboardingLinkCreateParams.LinkOptions#extraParams} for the field documentation.
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
       * See {@link OnboardingLinkCreateParams.LinkOptions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AppleTermsAndConditions {
      /** Whether the link should also support users relinking their Apple account. */
      @SerializedName("allow_relinking")
      Boolean allowRelinking;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The business name of the merchant accepting Apple's Terms and
       * Conditions.
       */
      @SerializedName("merchant_display_name")
      String merchantDisplayName;

      private AppleTermsAndConditions(
          Boolean allowRelinking, Map<String, Object> extraParams, String merchantDisplayName) {
        this.allowRelinking = allowRelinking;
        this.extraParams = extraParams;
        this.merchantDisplayName = merchantDisplayName;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean allowRelinking;

        private Map<String, Object> extraParams;

        private String merchantDisplayName;

        /** Finalize and obtain parameter instance from this builder. */
        public OnboardingLinkCreateParams.LinkOptions.AppleTermsAndConditions build() {
          return new OnboardingLinkCreateParams.LinkOptions.AppleTermsAndConditions(
              this.allowRelinking, this.extraParams, this.merchantDisplayName);
        }

        /** Whether the link should also support users relinking their Apple account. */
        public Builder setAllowRelinking(Boolean allowRelinking) {
          this.allowRelinking = allowRelinking;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OnboardingLinkCreateParams.LinkOptions.AppleTermsAndConditions#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OnboardingLinkCreateParams.LinkOptions.AppleTermsAndConditions#extraParams} for the field
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
         * <strong>Required.</strong> The business name of the merchant accepting Apple's Terms and
         * Conditions.
         */
        public Builder setMerchantDisplayName(String merchantDisplayName) {
          this.merchantDisplayName = merchantDisplayName;
          return this;
        }
      }
    }
  }

  public enum LinkType implements ApiRequestParams.EnumParam {
    @SerializedName("apple_terms_and_conditions")
    APPLE_TERMS_AND_CONDITIONS("apple_terms_and_conditions");

    @Getter(onMethod_ = {@Override})
    private final String value;

    LinkType(String value) {
      this.value = value;
    }
  }
}
