// File generated from our OpenAPI spec
package com.stripe.param.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ConfigurationCreateParams extends ApiRequestParams {
  /** The business information shown to customers in the portal. */
  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your
   * website. This can be <a
   * href="https://stripe.com/docs/api/customer_portal/sessions/create#create_portal_session-return_url">overriden</a>
   * when creating the session.
   */
  @SerializedName("default_return_url")
  Object defaultReturnUrl;

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

  /** <strong>Required.</strong> Information about the features available in the portal. */
  @SerializedName("features")
  Features features;

  /**
   * The hosted login page for this configuration. Learn more about the portal login page in our <a
   * href="https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share">integration
   * docs</a>.
   */
  @SerializedName("login_page")
  LoginPage loginPage;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private ConfigurationCreateParams(
      BusinessProfile businessProfile,
      Object defaultReturnUrl,
      List<String> expand,
      Map<String, Object> extraParams,
      Features features,
      LoginPage loginPage,
      Map<String, String> metadata) {
    this.businessProfile = businessProfile;
    this.defaultReturnUrl = defaultReturnUrl;
    this.expand = expand;
    this.extraParams = extraParams;
    this.features = features;
    this.loginPage = loginPage;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BusinessProfile businessProfile;

    private Object defaultReturnUrl;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Features features;

    private LoginPage loginPage;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ConfigurationCreateParams build() {
      return new ConfigurationCreateParams(
          this.businessProfile,
          this.defaultReturnUrl,
          this.expand,
          this.extraParams,
          this.features,
          this.loginPage,
          this.metadata);
    }

    /** The business information shown to customers in the portal. */
    public Builder setBusinessProfile(ConfigurationCreateParams.BusinessProfile businessProfile) {
      this.businessProfile = businessProfile;
      return this;
    }

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to
     * your website. This can be <a
     * href="https://stripe.com/docs/api/customer_portal/sessions/create#create_portal_session-return_url">overriden</a>
     * when creating the session.
     */
    public Builder setDefaultReturnUrl(String defaultReturnUrl) {
      this.defaultReturnUrl = defaultReturnUrl;
      return this;
    }

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to
     * your website. This can be <a
     * href="https://stripe.com/docs/api/customer_portal/sessions/create#create_portal_session-return_url">overriden</a>
     * when creating the session.
     */
    public Builder setDefaultReturnUrl(EmptyParam defaultReturnUrl) {
      this.defaultReturnUrl = defaultReturnUrl;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ConfigurationCreateParams#expand} for the field documentation.
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
     * ConfigurationCreateParams#expand} for the field documentation.
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
     * ConfigurationCreateParams#extraParams} for the field documentation.
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
     * See {@link ConfigurationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Information about the features available in the portal. */
    public Builder setFeatures(ConfigurationCreateParams.Features features) {
      this.features = features;
      return this;
    }

    /**
     * The hosted login page for this configuration. Learn more about the portal login page in our
     * <a
     * href="https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share">integration
     * docs</a>.
     */
    public Builder setLoginPage(ConfigurationCreateParams.LoginPage loginPage) {
      this.loginPage = loginPage;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ConfigurationCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ConfigurationCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessProfile {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The messaging shown to customers in the portal. */
    @SerializedName("headline")
    Object headline;

    /** A link to the business’s publicly available privacy policy. */
    @SerializedName("privacy_policy_url")
    String privacyPolicyUrl;

    /** A link to the business’s publicly available terms of service. */
    @SerializedName("terms_of_service_url")
    String termsOfServiceUrl;

    private BusinessProfile(
        Map<String, Object> extraParams,
        Object headline,
        String privacyPolicyUrl,
        String termsOfServiceUrl) {
      this.extraParams = extraParams;
      this.headline = headline;
      this.privacyPolicyUrl = privacyPolicyUrl;
      this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object headline;

      private String privacyPolicyUrl;

      private String termsOfServiceUrl;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.BusinessProfile build() {
        return new ConfigurationCreateParams.BusinessProfile(
            this.extraParams, this.headline, this.privacyPolicyUrl, this.termsOfServiceUrl);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.BusinessProfile#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.BusinessProfile#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The messaging shown to customers in the portal. */
      public Builder setHeadline(String headline) {
        this.headline = headline;
        return this;
      }

      /** The messaging shown to customers in the portal. */
      public Builder setHeadline(EmptyParam headline) {
        this.headline = headline;
        return this;
      }

      /** A link to the business’s publicly available privacy policy. */
      public Builder setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
      }

      /** A link to the business’s publicly available terms of service. */
      public Builder setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Features {
    /** Information about updating the customer details in the portal. */
    @SerializedName("customer_update")
    CustomerUpdate customerUpdate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Information about showing the billing history in the portal. */
    @SerializedName("invoice_history")
    InvoiceHistory invoiceHistory;

    /** Information about updating payment methods in the portal. */
    @SerializedName("payment_method_update")
    PaymentMethodUpdate paymentMethodUpdate;

    /** Information about canceling subscriptions in the portal. */
    @SerializedName("subscription_cancel")
    SubscriptionCancel subscriptionCancel;

    /** Information about updating subscriptions in the portal. */
    @SerializedName("subscription_update")
    SubscriptionUpdate subscriptionUpdate;

    private Features(
        CustomerUpdate customerUpdate,
        Map<String, Object> extraParams,
        InvoiceHistory invoiceHistory,
        PaymentMethodUpdate paymentMethodUpdate,
        SubscriptionCancel subscriptionCancel,
        SubscriptionUpdate subscriptionUpdate) {
      this.customerUpdate = customerUpdate;
      this.extraParams = extraParams;
      this.invoiceHistory = invoiceHistory;
      this.paymentMethodUpdate = paymentMethodUpdate;
      this.subscriptionCancel = subscriptionCancel;
      this.subscriptionUpdate = subscriptionUpdate;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CustomerUpdate customerUpdate;

      private Map<String, Object> extraParams;

      private InvoiceHistory invoiceHistory;

      private PaymentMethodUpdate paymentMethodUpdate;

      private SubscriptionCancel subscriptionCancel;

      private SubscriptionUpdate subscriptionUpdate;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.Features build() {
        return new ConfigurationCreateParams.Features(
            this.customerUpdate,
            this.extraParams,
            this.invoiceHistory,
            this.paymentMethodUpdate,
            this.subscriptionCancel,
            this.subscriptionUpdate);
      }

      /** Information about updating the customer details in the portal. */
      public Builder setCustomerUpdate(
          ConfigurationCreateParams.Features.CustomerUpdate customerUpdate) {
        this.customerUpdate = customerUpdate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.Features#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.Features#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Information about showing the billing history in the portal. */
      public Builder setInvoiceHistory(
          ConfigurationCreateParams.Features.InvoiceHistory invoiceHistory) {
        this.invoiceHistory = invoiceHistory;
        return this;
      }

      /** Information about updating payment methods in the portal. */
      public Builder setPaymentMethodUpdate(
          ConfigurationCreateParams.Features.PaymentMethodUpdate paymentMethodUpdate) {
        this.paymentMethodUpdate = paymentMethodUpdate;
        return this;
      }

      /** Information about canceling subscriptions in the portal. */
      public Builder setSubscriptionCancel(
          ConfigurationCreateParams.Features.SubscriptionCancel subscriptionCancel) {
        this.subscriptionCancel = subscriptionCancel;
        return this;
      }

      /** Information about updating subscriptions in the portal. */
      public Builder setSubscriptionUpdate(
          ConfigurationCreateParams.Features.SubscriptionUpdate subscriptionUpdate) {
        this.subscriptionUpdate = subscriptionUpdate;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerUpdate {
      /**
       * The types of customer updates that are supported. When empty, customers are not updateable.
       */
      @SerializedName("allowed_updates")
      Object allowedUpdates;

      /** <strong>Required.</strong> Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CustomerUpdate(
          Object allowedUpdates, Boolean enabled, Map<String, Object> extraParams) {
        this.allowedUpdates = allowedUpdates;
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object allowedUpdates;

        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Features.CustomerUpdate build() {
          return new ConfigurationCreateParams.Features.CustomerUpdate(
              this.allowedUpdates, this.enabled, this.extraParams);
        }

        /**
         * Add an element to `allowedUpdates` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Features.CustomerUpdate#allowedUpdates} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllowedUpdate(
            ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate element) {
          if (this.allowedUpdates == null || this.allowedUpdates instanceof EmptyParam) {
            this.allowedUpdates =
                new ArrayList<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate>();
          }
          ((List<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate>)
                  this.allowedUpdates)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `allowedUpdates` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link ConfigurationCreateParams.Features.CustomerUpdate#allowedUpdates} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAllowedUpdate(
            List<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate> elements) {
          if (this.allowedUpdates == null || this.allowedUpdates instanceof EmptyParam) {
            this.allowedUpdates =
                new ArrayList<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate>();
          }
          ((List<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate>)
                  this.allowedUpdates)
              .addAll(elements);
          return this;
        }

        /**
         * The types of customer updates that are supported. When empty, customers are not
         * updateable.
         */
        public Builder setAllowedUpdates(EmptyParam allowedUpdates) {
          this.allowedUpdates = allowedUpdates;
          return this;
        }

        /**
         * The types of customer updates that are supported. When empty, customers are not
         * updateable.
         */
        public Builder setAllowedUpdates(
            List<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate> allowedUpdates) {
          this.allowedUpdates = allowedUpdates;
          return this;
        }

        /** <strong>Required.</strong> Whether the feature is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Features.CustomerUpdate#extraParams} for the
         * field documentation.
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
         * map. See {@link ConfigurationCreateParams.Features.CustomerUpdate#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum AllowedUpdate implements ApiRequestParams.EnumParam {
        @SerializedName("address")
        ADDRESS("address"),

        @SerializedName("email")
        EMAIL("email"),

        @SerializedName("name")
        NAME("name"),

        @SerializedName("phone")
        PHONE("phone"),

        @SerializedName("shipping")
        SHIPPING("shipping"),

        @SerializedName("tax_id")
        TAX_ID("tax_id");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AllowedUpdate(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceHistory {
      /** <strong>Required.</strong> Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoiceHistory(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Features.InvoiceHistory build() {
          return new ConfigurationCreateParams.Features.InvoiceHistory(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the feature is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Features.InvoiceHistory#extraParams} for the
         * field documentation.
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
         * map. See {@link ConfigurationCreateParams.Features.InvoiceHistory#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodUpdate {
      /** <strong>Required.</strong> Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PaymentMethodUpdate(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Features.PaymentMethodUpdate build() {
          return new ConfigurationCreateParams.Features.PaymentMethodUpdate(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the feature is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Features.PaymentMethodUpdate#extraParams} for
         * the field documentation.
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
         * map. See {@link ConfigurationCreateParams.Features.PaymentMethodUpdate#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionCancel {
      /**
       * Whether the cancellation reasons will be collected in the portal and which options are
       * exposed to the customer.
       */
      @SerializedName("cancellation_reason")
      CancellationReason cancellationReason;

      /** <strong>Required.</strong> Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Whether to cancel subscriptions immediately or at the end of the billing period. */
      @SerializedName("mode")
      Mode mode;

      /**
       * Whether to create prorations when canceling subscriptions. Possible values are {@code none}
       * and {@code create_prorations}, which is only compatible with {@code mode=immediately}.
       * Passing {@code always_invoice} will result in an error. No prorations are generated when
       * canceling a subscription at the end of its natural billing period.
       */
      @SerializedName("proration_behavior")
      ProrationBehavior prorationBehavior;

      private SubscriptionCancel(
          CancellationReason cancellationReason,
          Boolean enabled,
          Map<String, Object> extraParams,
          Mode mode,
          ProrationBehavior prorationBehavior) {
        this.cancellationReason = cancellationReason;
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.mode = mode;
        this.prorationBehavior = prorationBehavior;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CancellationReason cancellationReason;

        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Mode mode;

        private ProrationBehavior prorationBehavior;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Features.SubscriptionCancel build() {
          return new ConfigurationCreateParams.Features.SubscriptionCancel(
              this.cancellationReason,
              this.enabled,
              this.extraParams,
              this.mode,
              this.prorationBehavior);
        }

        /**
         * Whether the cancellation reasons will be collected in the portal and which options are
         * exposed to the customer.
         */
        public Builder setCancellationReason(
            ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason
                cancellationReason) {
          this.cancellationReason = cancellationReason;
          return this;
        }

        /** <strong>Required.</strong> Whether the feature is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Features.SubscriptionCancel#extraParams} for
         * the field documentation.
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
         * map. See {@link ConfigurationCreateParams.Features.SubscriptionCancel#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Whether to cancel subscriptions immediately or at the end of the billing period. */
        public Builder setMode(ConfigurationCreateParams.Features.SubscriptionCancel.Mode mode) {
          this.mode = mode;
          return this;
        }

        /**
         * Whether to create prorations when canceling subscriptions. Possible values are {@code
         * none} and {@code create_prorations}, which is only compatible with {@code
         * mode=immediately}. Passing {@code always_invoice} will result in an error. No prorations
         * are generated when canceling a subscription at the end of its natural billing period.
         */
        public Builder setProrationBehavior(
            ConfigurationCreateParams.Features.SubscriptionCancel.ProrationBehavior
                prorationBehavior) {
          this.prorationBehavior = prorationBehavior;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CancellationReason {
        /** <strong>Required.</strong> Whether the feature is enabled. */
        @SerializedName("enabled")
        Boolean enabled;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Which cancellation reasons will be given as options to the
         * customer.
         */
        @SerializedName("options")
        Object options;

        private CancellationReason(
            Boolean enabled, Map<String, Object> extraParams, Object options) {
          this.enabled = enabled;
          this.extraParams = extraParams;
          this.options = options;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean enabled;

          private Map<String, Object> extraParams;

          private Object options;

          /** Finalize and obtain parameter instance from this builder. */
          public ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason build() {
            return new ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason(
                this.enabled, this.extraParams, this.options);
          }

          /** <strong>Required.</strong> Whether the feature is enabled. */
          public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason#extraParams}
           * for the field documentation.
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
           * ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `options` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason#options} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addOption(
              ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason.Option
                  element) {
            if (this.options == null || this.options instanceof EmptyParam) {
              this.options =
                  new ArrayList<
                      ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason
                          .Option>();
            }
            ((List<ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason.Option>)
                    this.options)
                .add(element);
            return this;
          }

          /**
           * Add all elements to `options` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason#options} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllOption(
              List<ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason.Option>
                  elements) {
            if (this.options == null || this.options instanceof EmptyParam) {
              this.options =
                  new ArrayList<
                      ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason
                          .Option>();
            }
            ((List<ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason.Option>)
                    this.options)
                .addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> Which cancellation reasons will be given as options to the
           * customer.
           */
          public Builder setOptions(EmptyParam options) {
            this.options = options;
            return this;
          }

          /**
           * <strong>Required.</strong> Which cancellation reasons will be given as options to the
           * customer.
           */
          public Builder setOptions(
              List<ConfigurationCreateParams.Features.SubscriptionCancel.CancellationReason.Option>
                  options) {
            this.options = options;
            return this;
          }
        }

        public enum Option implements ApiRequestParams.EnumParam {
          @SerializedName("customer_service")
          CUSTOMER_SERVICE("customer_service"),

          @SerializedName("low_quality")
          LOW_QUALITY("low_quality"),

          @SerializedName("missing_features")
          MISSING_FEATURES("missing_features"),

          @SerializedName("other")
          OTHER("other"),

          @SerializedName("switched_service")
          SWITCHED_SERVICE("switched_service"),

          @SerializedName("too_complex")
          TOO_COMPLEX("too_complex"),

          @SerializedName("too_expensive")
          TOO_EXPENSIVE("too_expensive"),

          @SerializedName("unused")
          UNUSED("unused");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Option(String value) {
            this.value = value;
          }
        }
      }

      public enum Mode implements ApiRequestParams.EnumParam {
        @SerializedName("at_period_end")
        AT_PERIOD_END("at_period_end"),

        @SerializedName("immediately")
        IMMEDIATELY("immediately");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Mode(String value) {
          this.value = value;
        }
      }

      public enum ProrationBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("always_invoice")
        ALWAYS_INVOICE("always_invoice"),

        @SerializedName("create_prorations")
        CREATE_PRORATIONS("create_prorations"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProrationBehavior(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdate {
      /**
       * The types of subscription updates that are supported. When empty, subscriptions are not
       * updateable.
       */
      @SerializedName("default_allowed_updates")
      Object defaultAllowedUpdates;

      /** <strong>Required.</strong> Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The list of up to 10 products that support subscription updates. */
      @SerializedName("products")
      Object products;

      /**
       * Determines how to handle prorations resulting from subscription updates. Valid values are
       * {@code none}, {@code create_prorations}, and {@code always_invoice}.
       */
      @SerializedName("proration_behavior")
      ProrationBehavior prorationBehavior;

      /**
       * Setting to control when an update should be scheduled at the end of the period instead of
       * applying immediately.
       */
      @SerializedName("schedule_at_period_end")
      ScheduleAtPeriodEnd scheduleAtPeriodEnd;

      private SubscriptionUpdate(
          Object defaultAllowedUpdates,
          Boolean enabled,
          Map<String, Object> extraParams,
          Object products,
          ProrationBehavior prorationBehavior,
          ScheduleAtPeriodEnd scheduleAtPeriodEnd) {
        this.defaultAllowedUpdates = defaultAllowedUpdates;
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.products = products;
        this.prorationBehavior = prorationBehavior;
        this.scheduleAtPeriodEnd = scheduleAtPeriodEnd;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object defaultAllowedUpdates;

        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Object products;

        private ProrationBehavior prorationBehavior;

        private ScheduleAtPeriodEnd scheduleAtPeriodEnd;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Features.SubscriptionUpdate build() {
          return new ConfigurationCreateParams.Features.SubscriptionUpdate(
              this.defaultAllowedUpdates,
              this.enabled,
              this.extraParams,
              this.products,
              this.prorationBehavior,
              this.scheduleAtPeriodEnd);
        }

        /**
         * Add an element to `defaultAllowedUpdates` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link ConfigurationCreateParams.Features.SubscriptionUpdate#defaultAllowedUpdates}
         * for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDefaultAllowedUpdate(
            ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate element) {
          if (this.defaultAllowedUpdates == null
              || this.defaultAllowedUpdates instanceof EmptyParam) {
            this.defaultAllowedUpdates =
                new ArrayList<
                    ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>();
          }
          ((List<ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>)
                  this.defaultAllowedUpdates)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `defaultAllowedUpdates` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link ConfigurationCreateParams.Features.SubscriptionUpdate#defaultAllowedUpdates}
         * for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDefaultAllowedUpdate(
            List<ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>
                elements) {
          if (this.defaultAllowedUpdates == null
              || this.defaultAllowedUpdates instanceof EmptyParam) {
            this.defaultAllowedUpdates =
                new ArrayList<
                    ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>();
          }
          ((List<ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>)
                  this.defaultAllowedUpdates)
              .addAll(elements);
          return this;
        }

        /**
         * The types of subscription updates that are supported. When empty, subscriptions are not
         * updateable.
         */
        public Builder setDefaultAllowedUpdates(EmptyParam defaultAllowedUpdates) {
          this.defaultAllowedUpdates = defaultAllowedUpdates;
          return this;
        }

        /**
         * The types of subscription updates that are supported. When empty, subscriptions are not
         * updateable.
         */
        public Builder setDefaultAllowedUpdates(
            List<ConfigurationCreateParams.Features.SubscriptionUpdate.DefaultAllowedUpdate>
                defaultAllowedUpdates) {
          this.defaultAllowedUpdates = defaultAllowedUpdates;
          return this;
        }

        /** <strong>Required.</strong> Whether the feature is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Features.SubscriptionUpdate#extraParams} for
         * the field documentation.
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
         * map. See {@link ConfigurationCreateParams.Features.SubscriptionUpdate#extraParams} for
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
         * Add an element to `products` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Features.SubscriptionUpdate#products} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addProduct(
            ConfigurationCreateParams.Features.SubscriptionUpdate.Product element) {
          if (this.products == null || this.products instanceof EmptyParam) {
            this.products =
                new ArrayList<ConfigurationCreateParams.Features.SubscriptionUpdate.Product>();
          }
          ((List<ConfigurationCreateParams.Features.SubscriptionUpdate.Product>) this.products)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `products` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Features.SubscriptionUpdate#products} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllProduct(
            List<ConfigurationCreateParams.Features.SubscriptionUpdate.Product> elements) {
          if (this.products == null || this.products instanceof EmptyParam) {
            this.products =
                new ArrayList<ConfigurationCreateParams.Features.SubscriptionUpdate.Product>();
          }
          ((List<ConfigurationCreateParams.Features.SubscriptionUpdate.Product>) this.products)
              .addAll(elements);
          return this;
        }

        /** The list of up to 10 products that support subscription updates. */
        public Builder setProducts(EmptyParam products) {
          this.products = products;
          return this;
        }

        /** The list of up to 10 products that support subscription updates. */
        public Builder setProducts(
            List<ConfigurationCreateParams.Features.SubscriptionUpdate.Product> products) {
          this.products = products;
          return this;
        }

        /**
         * Determines how to handle prorations resulting from subscription updates. Valid values are
         * {@code none}, {@code create_prorations}, and {@code always_invoice}.
         */
        public Builder setProrationBehavior(
            ConfigurationCreateParams.Features.SubscriptionUpdate.ProrationBehavior
                prorationBehavior) {
          this.prorationBehavior = prorationBehavior;
          return this;
        }

        /**
         * Setting to control when an update should be scheduled at the end of the period instead of
         * applying immediately.
         */
        public Builder setScheduleAtPeriodEnd(
            ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                scheduleAtPeriodEnd) {
          this.scheduleAtPeriodEnd = scheduleAtPeriodEnd;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Product {
        /** Control whether the quantity of the product can be adjusted. */
        @SerializedName("adjustable_quantity")
        AdjustableQuantity adjustableQuantity;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The list of price IDs for the product that a subscription can
         * be updated to.
         */
        @SerializedName("prices")
        List<String> prices;

        /** <strong>Required.</strong> The product id. */
        @SerializedName("product")
        String product;

        private Product(
            AdjustableQuantity adjustableQuantity,
            Map<String, Object> extraParams,
            List<String> prices,
            String product) {
          this.adjustableQuantity = adjustableQuantity;
          this.extraParams = extraParams;
          this.prices = prices;
          this.product = product;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AdjustableQuantity adjustableQuantity;

          private Map<String, Object> extraParams;

          private List<String> prices;

          private String product;

          /** Finalize and obtain parameter instance from this builder. */
          public ConfigurationCreateParams.Features.SubscriptionUpdate.Product build() {
            return new ConfigurationCreateParams.Features.SubscriptionUpdate.Product(
                this.adjustableQuantity, this.extraParams, this.prices, this.product);
          }

          /** Control whether the quantity of the product can be adjusted. */
          public Builder setAdjustableQuantity(
              ConfigurationCreateParams.Features.SubscriptionUpdate.Product.AdjustableQuantity
                  adjustableQuantity) {
            this.adjustableQuantity = adjustableQuantity;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.Product#extraParams} for the
           * field documentation.
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
           * ConfigurationCreateParams.Features.SubscriptionUpdate.Product#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `prices` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.Product#prices} for the field
           * documentation.
           */
          public Builder addPrice(String element) {
            if (this.prices == null) {
              this.prices = new ArrayList<>();
            }
            this.prices.add(element);
            return this;
          }

          /**
           * Add all elements to `prices` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.Product#prices} for the field
           * documentation.
           */
          public Builder addAllPrice(List<String> elements) {
            if (this.prices == null) {
              this.prices = new ArrayList<>();
            }
            this.prices.addAll(elements);
            return this;
          }

          /** <strong>Required.</strong> The product id. */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AdjustableQuantity {
          /**
           * <strong>Required.</strong> Set to true if the quantity can be adjusted to any
           * non-negative integer.
           */
          @SerializedName("enabled")
          Boolean enabled;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The maximum quantity that can be set for the product. */
          @SerializedName("maximum")
          Long maximum;

          /** The minimum quantity that can be set for the product. */
          @SerializedName("minimum")
          Long minimum;

          private AdjustableQuantity(
              Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum) {
            this.enabled = enabled;
            this.extraParams = extraParams;
            this.maximum = maximum;
            this.minimum = minimum;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Boolean enabled;

            private Map<String, Object> extraParams;

            private Long maximum;

            private Long minimum;

            /** Finalize and obtain parameter instance from this builder. */
            public ConfigurationCreateParams.Features.SubscriptionUpdate.Product.AdjustableQuantity
                build() {
              return new ConfigurationCreateParams.Features.SubscriptionUpdate.Product
                  .AdjustableQuantity(this.enabled, this.extraParams, this.maximum, this.minimum);
            }

            /**
             * <strong>Required.</strong> Set to true if the quantity can be adjusted to any
             * non-negative integer.
             */
            public Builder setEnabled(Boolean enabled) {
              this.enabled = enabled;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ConfigurationCreateParams.Features.SubscriptionUpdate.Product.AdjustableQuantity#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ConfigurationCreateParams.Features.SubscriptionUpdate.Product.AdjustableQuantity#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The maximum quantity that can be set for the product. */
            public Builder setMaximum(Long maximum) {
              this.maximum = maximum;
              return this;
            }

            /** The minimum quantity that can be set for the product. */
            public Builder setMinimum(Long minimum) {
              this.minimum = minimum;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScheduleAtPeriodEnd {
        /**
         * List of conditions. When any condition is true, the update will be scheduled at the end
         * of the current period.
         */
        @SerializedName("conditions")
        List<ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd.Condition>
            conditions;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private ScheduleAtPeriodEnd(
            List<
                    ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                        .Condition>
                conditions,
            Map<String, Object> extraParams) {
          this.conditions = conditions;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<
                  ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                      .Condition>
              conditions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd build() {
            return new ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd(
                this.conditions, this.extraParams);
          }

          /**
           * Add an element to `conditions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd#conditions}
           * for the field documentation.
           */
          public Builder addCondition(
              ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd.Condition
                  element) {
            if (this.conditions == null) {
              this.conditions = new ArrayList<>();
            }
            this.conditions.add(element);
            return this;
          }

          /**
           * Add all elements to `conditions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd#conditions}
           * for the field documentation.
           */
          public Builder addAllCondition(
              List<
                      ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                          .Condition>
                  elements) {
            if (this.conditions == null) {
              this.conditions = new ArrayList<>();
            }
            this.conditions.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd#extraParams}
           * for the field documentation.
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
           * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd#extraParams}
           * for the field documentation.
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
        public static class Condition {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The type of condition. */
          @SerializedName("type")
          Type type;

          private Condition(Map<String, Object> extraParams, Type type) {
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                    .Condition
                build() {
              return new ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd
                  .Condition(this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd.Condition#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd.Condition#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The type of condition. */
            public Builder setType(
                ConfigurationCreateParams.Features.SubscriptionUpdate.ScheduleAtPeriodEnd.Condition
                        .Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("decreasing_item_amount")
            DECREASING_ITEM_AMOUNT("decreasing_item_amount"),

            @SerializedName("shortening_interval")
            SHORTENING_INTERVAL("shortening_interval");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum DefaultAllowedUpdate implements ApiRequestParams.EnumParam {
        @SerializedName("price")
        PRICE("price"),

        @SerializedName("promotion_code")
        PROMOTION_CODE("promotion_code"),

        @SerializedName("quantity")
        QUANTITY("quantity");

        @Getter(onMethod_ = {@Override})
        private final String value;

        DefaultAllowedUpdate(String value) {
          this.value = value;
        }
      }

      public enum ProrationBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("always_invoice")
        ALWAYS_INVOICE("always_invoice"),

        @SerializedName("create_prorations")
        CREATE_PRORATIONS("create_prorations"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProrationBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginPage {
    /**
     * <strong>Required.</strong> Set to {@code true} to generate a shareable URL <a
     * href="https://stripe.com/docs/api/customer_portal/configuration#portal_configuration_object-login_page-url">{@code
     * login_page.url}</a> that will take your customers to a hosted login page for the customer
     * portal.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LoginPage(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.LoginPage build() {
        return new ConfigurationCreateParams.LoginPage(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Set to {@code true} to generate a shareable URL <a
       * href="https://stripe.com/docs/api/customer_portal/configuration#portal_configuration_object-login_page-url">{@code
       * login_page.url}</a> that will take your customers to a hosted login page for the customer
       * portal.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.LoginPage#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.LoginPage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
