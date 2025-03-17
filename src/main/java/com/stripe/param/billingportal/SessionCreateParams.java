// File generated from our OpenAPI spec
package com.stripe.param.billingportal;

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
public class SessionCreateParams extends ApiRequestParams {
  /**
   * The ID of an existing <a
   * href="https://stripe.com/docs/api/customer_portal/configuration">configuration</a> to use for
   * this session, describing its functionality and features. If not specified, the session uses the
   * default configuration.
   */
  @SerializedName("configuration")
  String configuration;

  /** <strong>Required.</strong> The ID of an existing customer. */
  @SerializedName("customer")
  String customer;

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

  /**
   * Information about a specific flow for the customer to go through. See the <a
   * href="https://stripe.com/docs/customer-management/portal-deep-links">docs</a> to learn more
   * about using customer portal deep links and flows.
   */
  @SerializedName("flow_data")
  FlowData flowData;

  /**
   * The IETF language tag of the locale customer portal is displayed in. If blank or auto, the
   * customer’s {@code preferred_locales} or browser’s locale is used.
   */
  @SerializedName("locale")
  Locale locale;

  /**
   * The {@code on_behalf_of} account to use for this session. When specified, only subscriptions
   * and invoices with this {@code on_behalf_of} account appear in the portal. For more information,
   * see the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers#settlement-merchant">docs</a>.
   * Use the <a
   * href="https://stripe.com/docs/api/accounts/object#account_object-settings-branding">Accounts
   * API</a> to modify the {@code on_behalf_of} account's branding settings, which the portal
   * displays.
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your
   * website.
   */
  @SerializedName("return_url")
  String returnUrl;

  private SessionCreateParams(
      String configuration,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      FlowData flowData,
      Locale locale,
      String onBehalfOf,
      String returnUrl) {
    this.configuration = configuration;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.flowData = flowData;
    this.locale = locale;
    this.onBehalfOf = onBehalfOf;
    this.returnUrl = returnUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String configuration;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FlowData flowData;

    private Locale locale;

    private String onBehalfOf;

    private String returnUrl;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionCreateParams build() {
      return new SessionCreateParams(
          this.configuration,
          this.customer,
          this.expand,
          this.extraParams,
          this.flowData,
          this.locale,
          this.onBehalfOf,
          this.returnUrl);
    }

    /**
     * The ID of an existing <a
     * href="https://stripe.com/docs/api/customer_portal/configuration">configuration</a> to use for
     * this session, describing its functionality and features. If not specified, the session uses
     * the default configuration.
     */
    public Builder setConfiguration(String configuration) {
      this.configuration = configuration;
      return this;
    }

    /** <strong>Required.</strong> The ID of an existing customer. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#extraParams} for the field documentation.
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
     * See {@link SessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Information about a specific flow for the customer to go through. See the <a
     * href="https://stripe.com/docs/customer-management/portal-deep-links">docs</a> to learn more
     * about using customer portal deep links and flows.
     */
    public Builder setFlowData(SessionCreateParams.FlowData flowData) {
      this.flowData = flowData;
      return this;
    }

    /**
     * The IETF language tag of the locale customer portal is displayed in. If blank or auto, the
     * customer’s {@code preferred_locales} or browser’s locale is used.
     */
    public Builder setLocale(SessionCreateParams.Locale locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The {@code on_behalf_of} account to use for this session. When specified, only subscriptions
     * and invoices with this {@code on_behalf_of} account appear in the portal. For more
     * information, see the <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers#settlement-merchant">docs</a>.
     * Use the <a
     * href="https://stripe.com/docs/api/accounts/object#account_object-settings-branding">Accounts
     * API</a> to modify the {@code on_behalf_of} account's branding settings, which the portal
     * displays.
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to
     * your website.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FlowData {
    /** Behavior after the flow is completed. */
    @SerializedName("after_completion")
    AfterCompletion afterCompletion;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration when {@code flow_data.type=subscription_cancel}. */
    @SerializedName("subscription_cancel")
    SubscriptionCancel subscriptionCancel;

    /** Configuration when {@code flow_data.type=subscription_update}. */
    @SerializedName("subscription_update")
    SubscriptionUpdate subscriptionUpdate;

    /** Configuration when {@code flow_data.type=subscription_update_confirm}. */
    @SerializedName("subscription_update_confirm")
    SubscriptionUpdateConfirm subscriptionUpdateConfirm;

    /** <strong>Required.</strong> Type of flow that the customer will go through. */
    @SerializedName("type")
    Type type;

    private FlowData(
        AfterCompletion afterCompletion,
        Map<String, Object> extraParams,
        SubscriptionCancel subscriptionCancel,
        SubscriptionUpdate subscriptionUpdate,
        SubscriptionUpdateConfirm subscriptionUpdateConfirm,
        Type type) {
      this.afterCompletion = afterCompletion;
      this.extraParams = extraParams;
      this.subscriptionCancel = subscriptionCancel;
      this.subscriptionUpdate = subscriptionUpdate;
      this.subscriptionUpdateConfirm = subscriptionUpdateConfirm;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AfterCompletion afterCompletion;

      private Map<String, Object> extraParams;

      private SubscriptionCancel subscriptionCancel;

      private SubscriptionUpdate subscriptionUpdate;

      private SubscriptionUpdateConfirm subscriptionUpdateConfirm;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionCreateParams.FlowData build() {
        return new SessionCreateParams.FlowData(
            this.afterCompletion,
            this.extraParams,
            this.subscriptionCancel,
            this.subscriptionUpdate,
            this.subscriptionUpdateConfirm,
            this.type);
      }

      /** Behavior after the flow is completed. */
      public Builder setAfterCompletion(
          SessionCreateParams.FlowData.AfterCompletion afterCompletion) {
        this.afterCompletion = afterCompletion;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionCreateParams.FlowData#extraParams} for the field documentation.
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
       * See {@link SessionCreateParams.FlowData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configuration when {@code flow_data.type=subscription_cancel}. */
      public Builder setSubscriptionCancel(
          SessionCreateParams.FlowData.SubscriptionCancel subscriptionCancel) {
        this.subscriptionCancel = subscriptionCancel;
        return this;
      }

      /** Configuration when {@code flow_data.type=subscription_update}. */
      public Builder setSubscriptionUpdate(
          SessionCreateParams.FlowData.SubscriptionUpdate subscriptionUpdate) {
        this.subscriptionUpdate = subscriptionUpdate;
        return this;
      }

      /** Configuration when {@code flow_data.type=subscription_update_confirm}. */
      public Builder setSubscriptionUpdateConfirm(
          SessionCreateParams.FlowData.SubscriptionUpdateConfirm subscriptionUpdateConfirm) {
        this.subscriptionUpdateConfirm = subscriptionUpdateConfirm;
        return this;
      }

      /** <strong>Required.</strong> Type of flow that the customer will go through. */
      public Builder setType(SessionCreateParams.FlowData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterCompletion {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Configuration when {@code after_completion.type=hosted_confirmation}. */
      @SerializedName("hosted_confirmation")
      HostedConfirmation hostedConfirmation;

      /** Configuration when {@code after_completion.type=redirect}. */
      @SerializedName("redirect")
      Redirect redirect;

      /** <strong>Required.</strong> The specified behavior after the flow is completed. */
      @SerializedName("type")
      Type type;

      private AfterCompletion(
          Map<String, Object> extraParams,
          HostedConfirmation hostedConfirmation,
          Redirect redirect,
          Type type) {
        this.extraParams = extraParams;
        this.hostedConfirmation = hostedConfirmation;
        this.redirect = redirect;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private HostedConfirmation hostedConfirmation;

        private Redirect redirect;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.FlowData.AfterCompletion build() {
          return new SessionCreateParams.FlowData.AfterCompletion(
              this.extraParams, this.hostedConfirmation, this.redirect, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.FlowData.AfterCompletion#extraParams} for the field
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
         * map. See {@link SessionCreateParams.FlowData.AfterCompletion#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Configuration when {@code after_completion.type=hosted_confirmation}. */
        public Builder setHostedConfirmation(
            SessionCreateParams.FlowData.AfterCompletion.HostedConfirmation hostedConfirmation) {
          this.hostedConfirmation = hostedConfirmation;
          return this;
        }

        /** Configuration when {@code after_completion.type=redirect}. */
        public Builder setRedirect(SessionCreateParams.FlowData.AfterCompletion.Redirect redirect) {
          this.redirect = redirect;
          return this;
        }

        /** <strong>Required.</strong> The specified behavior after the flow is completed. */
        public Builder setType(SessionCreateParams.FlowData.AfterCompletion.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class HostedConfirmation {
        /** A custom message to display to the customer after the flow is completed. */
        @SerializedName("custom_message")
        String customMessage;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private HostedConfirmation(String customMessage, Map<String, Object> extraParams) {
          this.customMessage = customMessage;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String customMessage;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.FlowData.AfterCompletion.HostedConfirmation build() {
            return new SessionCreateParams.FlowData.AfterCompletion.HostedConfirmation(
                this.customMessage, this.extraParams);
          }

          /** A custom message to display to the customer after the flow is completed. */
          public Builder setCustomMessage(String customMessage) {
            this.customMessage = customMessage;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.FlowData.AfterCompletion.HostedConfirmation#extraParams} for the
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
           * SessionCreateParams.FlowData.AfterCompletion.HostedConfirmation#extraParams} for the
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
      public static class Redirect {
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
         * <strong>Required.</strong> The URL the customer will be redirected to after the flow is
         * completed.
         */
        @SerializedName("return_url")
        String returnUrl;

        private Redirect(Map<String, Object> extraParams, String returnUrl) {
          this.extraParams = extraParams;
          this.returnUrl = returnUrl;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String returnUrl;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.FlowData.AfterCompletion.Redirect build() {
            return new SessionCreateParams.FlowData.AfterCompletion.Redirect(
                this.extraParams, this.returnUrl);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.FlowData.AfterCompletion.Redirect#extraParams} for
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
           * map. See {@link SessionCreateParams.FlowData.AfterCompletion.Redirect#extraParams} for
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
           * <strong>Required.</strong> The URL the customer will be redirected to after the flow is
           * completed.
           */
          public Builder setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("hosted_confirmation")
        HOSTED_CONFIRMATION("hosted_confirmation"),

        @SerializedName("portal_homepage")
        PORTAL_HOMEPAGE("portal_homepage"),

        @SerializedName("redirect")
        REDIRECT("redirect");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionCancel {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Specify a retention strategy to be used in the cancellation flow. */
      @SerializedName("retention")
      Retention retention;

      /** <strong>Required.</strong> The ID of the subscription to be canceled. */
      @SerializedName("subscription")
      String subscription;

      private SubscriptionCancel(
          Map<String, Object> extraParams, Retention retention, String subscription) {
        this.extraParams = extraParams;
        this.retention = retention;
        this.subscription = subscription;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Retention retention;

        private String subscription;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.FlowData.SubscriptionCancel build() {
          return new SessionCreateParams.FlowData.SubscriptionCancel(
              this.extraParams, this.retention, this.subscription);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.FlowData.SubscriptionCancel#extraParams} for the
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
         * map. See {@link SessionCreateParams.FlowData.SubscriptionCancel#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Specify a retention strategy to be used in the cancellation flow. */
        public Builder setRetention(
            SessionCreateParams.FlowData.SubscriptionCancel.Retention retention) {
          this.retention = retention;
          return this;
        }

        /** <strong>Required.</strong> The ID of the subscription to be canceled. */
        public Builder setSubscription(String subscription) {
          this.subscription = subscription;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Retention {
        /** <strong>Required.</strong> Configuration when {@code retention.type=coupon_offer}. */
        @SerializedName("coupon_offer")
        CouponOffer couponOffer;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of retention strategy to use with the customer. */
        @SerializedName("type")
        Type type;

        private Retention(CouponOffer couponOffer, Map<String, Object> extraParams, Type type) {
          this.couponOffer = couponOffer;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private CouponOffer couponOffer;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.FlowData.SubscriptionCancel.Retention build() {
            return new SessionCreateParams.FlowData.SubscriptionCancel.Retention(
                this.couponOffer, this.extraParams, this.type);
          }

          /** <strong>Required.</strong> Configuration when {@code retention.type=coupon_offer}. */
          public Builder setCouponOffer(
              SessionCreateParams.FlowData.SubscriptionCancel.Retention.CouponOffer couponOffer) {
            this.couponOffer = couponOffer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SessionCreateParams.FlowData.SubscriptionCancel.Retention#extraParams}
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
           * map. See {@link SessionCreateParams.FlowData.SubscriptionCancel.Retention#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of retention strategy to use with the customer. */
          public Builder setType(
              SessionCreateParams.FlowData.SubscriptionCancel.Retention.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CouponOffer {
          /** <strong>Required.</strong> The ID of the coupon to be offered. */
          @SerializedName("coupon")
          String coupon;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private CouponOffer(String coupon, Map<String, Object> extraParams) {
            this.coupon = coupon;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public SessionCreateParams.FlowData.SubscriptionCancel.Retention.CouponOffer build() {
              return new SessionCreateParams.FlowData.SubscriptionCancel.Retention.CouponOffer(
                  this.coupon, this.extraParams);
            }

            /** <strong>Required.</strong> The ID of the coupon to be offered. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SessionCreateParams.FlowData.SubscriptionCancel.Retention.CouponOffer#extraParams}
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
             * SessionCreateParams.FlowData.SubscriptionCancel.Retention.CouponOffer#extraParams}
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
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("coupon_offer")
          COUPON_OFFER("coupon_offer");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdate {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the subscription to be updated. */
      @SerializedName("subscription")
      String subscription;

      private SubscriptionUpdate(Map<String, Object> extraParams, String subscription) {
        this.extraParams = extraParams;
        this.subscription = subscription;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String subscription;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.FlowData.SubscriptionUpdate build() {
          return new SessionCreateParams.FlowData.SubscriptionUpdate(
              this.extraParams, this.subscription);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.FlowData.SubscriptionUpdate#extraParams} for the
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
         * map. See {@link SessionCreateParams.FlowData.SubscriptionUpdate#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the subscription to be updated. */
        public Builder setSubscription(String subscription) {
          this.subscription = subscription;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdateConfirm {
      /**
       * The coupon or promotion code to apply to this subscription update. Currently, only up to
       * one may be specified.
       */
      @SerializedName("discounts")
      List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount> discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The <a
       * href="https://stripe.com/docs/api/subscription_items">subscription item</a> to be updated
       * through this flow. Currently, only up to one may be specified and subscriptions with
       * multiple items are not updatable.
       */
      @SerializedName("items")
      List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item> items;

      /** <strong>Required.</strong> The ID of the subscription to be updated. */
      @SerializedName("subscription")
      String subscription;

      private SubscriptionUpdateConfirm(
          List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount> discounts,
          Map<String, Object> extraParams,
          List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item> items,
          String subscription) {
        this.discounts = discounts;
        this.extraParams = extraParams;
        this.items = items;
        this.subscription = subscription;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount> discounts;

        private Map<String, Object> extraParams;

        private List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item> items;

        private String subscription;

        /** Finalize and obtain parameter instance from this builder. */
        public SessionCreateParams.FlowData.SubscriptionUpdateConfirm build() {
          return new SessionCreateParams.FlowData.SubscriptionUpdateConfirm(
              this.discounts, this.extraParams, this.items, this.subscription);
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.FlowData.SubscriptionUpdateConfirm#discounts} for the field
         * documentation.
         */
        public Builder addDiscount(
            SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount element) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.FlowData.SubscriptionUpdateConfirm#discounts} for the field
         * documentation.
         */
        public Builder addAllDiscount(
            List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount> elements) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SessionCreateParams.FlowData.SubscriptionUpdateConfirm#extraParams} for
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
         * map. See {@link SessionCreateParams.FlowData.SubscriptionUpdateConfirm#extraParams} for
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
         * Add an element to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.FlowData.SubscriptionUpdateConfirm#items} for the field
         * documentation.
         */
        public Builder addItem(
            SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item element) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.add(element);
          return this;
        }

        /**
         * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SessionCreateParams.FlowData.SubscriptionUpdateConfirm#items} for the field
         * documentation.
         */
        public Builder addAllItem(
            List<SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item> elements) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.addAll(elements);
          return this;
        }

        /** <strong>Required.</strong> The ID of the subscription to be updated. */
        public Builder setSubscription(String subscription) {
          this.subscription = subscription;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount {
        /** The ID of the coupon to apply to this subscription update. */
        @SerializedName("coupon")
        String coupon;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of a promotion code to apply to this subscription update. */
        @SerializedName("promotion_code")
        String promotionCode;

        private Discount(String coupon, Map<String, Object> extraParams, String promotionCode) {
          this.coupon = coupon;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private Map<String, Object> extraParams;

          private String promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount build() {
            return new SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount(
                this.coupon, this.extraParams, this.promotionCode);
          }

          /** The ID of the coupon to apply to this subscription update. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount#extraParams} for the
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
           * SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of a promotion code to apply to this subscription update. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Item {
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
         * <strong>Required.</strong> The ID of the <a
         * href="https://stripe.com/docs/api/subscriptions/object#subscription_object-items-data-id">subscription
         * item</a> to be updated.
         */
        @SerializedName("id")
        String id;

        /**
         * The price the customer should subscribe to through this flow. The price must also be
         * included in the configuration's <a
         * href="https://stripe.com/docs/api/customer_portal/configuration#portal_configuration_object-features-subscription_update-products">{@code
         * features.subscription_update.products}</a>.
         */
        @SerializedName("price")
        String price;

        /**
         * <a href="https://stripe.com/docs/subscriptions/quantities">Quantity</a> for this item
         * that the customer should subscribe to through this flow.
         */
        @SerializedName("quantity")
        Long quantity;

        private Item(Map<String, Object> extraParams, String id, String price, Long quantity) {
          this.extraParams = extraParams;
          this.id = id;
          this.price = price;
          this.quantity = quantity;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String id;

          private String price;

          private Long quantity;

          /** Finalize and obtain parameter instance from this builder. */
          public SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item build() {
            return new SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item(
                this.extraParams, this.id, this.price, this.quantity);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item#extraParams} for the field
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
           * SessionCreateParams.FlowData.SubscriptionUpdateConfirm.Item#extraParams} for the field
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
           * <strong>Required.</strong> The ID of the <a
           * href="https://stripe.com/docs/api/subscriptions/object#subscription_object-items-data-id">subscription
           * item</a> to be updated.
           */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /**
           * The price the customer should subscribe to through this flow. The price must also be
           * included in the configuration's <a
           * href="https://stripe.com/docs/api/customer_portal/configuration#portal_configuration_object-features-subscription_update-products">{@code
           * features.subscription_update.products}</a>.
           */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * <a href="https://stripe.com/docs/subscriptions/quantities">Quantity</a> for this item
           * that the customer should subscribe to through this flow.
           */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("payment_method_update")
      PAYMENT_METHOD_UPDATE("payment_method_update"),

      @SerializedName("subscription_cancel")
      SUBSCRIPTION_CANCEL("subscription_cancel"),

      @SerializedName("subscription_update")
      SUBSCRIPTION_UPDATE("subscription_update"),

      @SerializedName("subscription_update_confirm")
      SUBSCRIPTION_UPDATE_CONFIRM("subscription_update_confirm");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Locale implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("bg")
    BG("bg"),

    @SerializedName("cs")
    CS("cs"),

    @SerializedName("da")
    DA("da"),

    @SerializedName("de")
    DE("de"),

    @SerializedName("el")
    EL("el"),

    @SerializedName("en")
    EN("en"),

    @SerializedName("en-AU")
    EN_AU("en-AU"),

    @SerializedName("en-CA")
    EN_CA("en-CA"),

    @SerializedName("en-GB")
    EN_GB("en-GB"),

    @SerializedName("en-IE")
    EN_IE("en-IE"),

    @SerializedName("en-IN")
    EN_IN("en-IN"),

    @SerializedName("en-NZ")
    EN_NZ("en-NZ"),

    @SerializedName("en-SG")
    EN_SG("en-SG"),

    @SerializedName("es")
    ES("es"),

    @SerializedName("es-419")
    ES_419("es-419"),

    @SerializedName("et")
    ET("et"),

    @SerializedName("fi")
    FI("fi"),

    @SerializedName("fil")
    FIL("fil"),

    @SerializedName("fr")
    FR("fr"),

    @SerializedName("fr-CA")
    FR_CA("fr-CA"),

    @SerializedName("hr")
    HR("hr"),

    @SerializedName("hu")
    HU("hu"),

    @SerializedName("id")
    ID("id"),

    @SerializedName("it")
    IT("it"),

    @SerializedName("ja")
    JA("ja"),

    @SerializedName("ko")
    KO("ko"),

    @SerializedName("lt")
    LT("lt"),

    @SerializedName("lv")
    LV("lv"),

    @SerializedName("ms")
    MS("ms"),

    @SerializedName("mt")
    MT("mt"),

    @SerializedName("nb")
    NB("nb"),

    @SerializedName("nl")
    NL("nl"),

    @SerializedName("pl")
    PL("pl"),

    @SerializedName("pt")
    PT("pt"),

    @SerializedName("pt-BR")
    PT_BR("pt-BR"),

    @SerializedName("ro")
    RO("ro"),

    @SerializedName("ru")
    RU("ru"),

    @SerializedName("sk")
    SK("sk"),

    @SerializedName("sl")
    SL("sl"),

    @SerializedName("sv")
    SV("sv"),

    @SerializedName("th")
    TH("th"),

    @SerializedName("tr")
    TR("tr"),

    @SerializedName("vi")
    VI("vi"),

    @SerializedName("zh")
    ZH("zh"),

    @SerializedName("zh-HK")
    ZH_HK("zh-HK"),

    @SerializedName("zh-TW")
    ZH_TW("zh-TW");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Locale(String value) {
      this.value = value;
    }
  }
}
