// File generated from our OpenAPI spec
package com.stripe.model.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billingportal.SessionCreateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Billing customer portal is a Stripe-hosted UI for subscription and billing management.
 *
 * <p>A portal configuration describes the functionality and features that you want to provide to
 * your customers through the portal.
 *
 * <p>A portal session describes the instantiation of the customer portal for a particular customer.
 * By visiting the session's URL, the customer can manage their subscriptions and billing details.
 * For security reasons, sessions are short-lived and will expire if the customer does not visit the
 * URL. Create sessions on-demand when customers intend to manage their subscriptions and billing
 * details.
 *
 * <p>Learn more in the <a
 * href="https://stripe.com/docs/billing/subscriptions/integrating-customer-portal">integration
 * guide</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {
  /** The configuration used by this session, describing the features available. */
  @SerializedName("configuration")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Configuration> configuration;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The ID of the customer for this session. */
  @SerializedName("customer")
  String customer;

  /**
   * Information about a specific flow for the customer to go through. See the <a
   * href="https://stripe.com/docs/customer-management/portal-deep-links">docs</a> to learn more
   * about using customer portal deep links and flows.
   */
  @SerializedName("flow")
  Flow flow;

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
   * The IETF language tag of the locale Customer Portal is displayed in. If blank or auto, the
   * customer’s {@code preferred_locales} or browser’s locale is used.
   *
   * <p>One of {@code auto}, {@code bg}, {@code cs}, {@code da}, {@code de}, {@code el}, {@code en},
   * {@code en-AU}, {@code en-CA}, {@code en-GB}, {@code en-IE}, {@code en-IN}, {@code en-NZ},
   * {@code en-SG}, {@code es}, {@code es-419}, {@code et}, {@code fi}, {@code fil}, {@code fr},
   * {@code fr-CA}, {@code hr}, {@code hu}, {@code id}, {@code it}, {@code ja}, {@code ko}, {@code
   * lt}, {@code lv}, {@code ms}, {@code mt}, {@code nb}, {@code nl}, {@code pl}, {@code pt}, {@code
   * pt-BR}, {@code ro}, {@code ru}, {@code sk}, {@code sl}, {@code sv}, {@code th}, {@code tr},
   * {@code vi}, {@code zh}, {@code zh-HK}, or {@code zh-TW}.
   */
  @SerializedName("locale")
  String locale;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing_portal.session}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account for which the session was created on behalf of. When specified, only subscriptions
   * and invoices with this {@code on_behalf_of} account appear in the portal. For more information,
   * see the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers#on-behalf-of">docs</a>.
   * Use the <a
   * href="https://stripe.com/docs/api/accounts/object#account_object-settings-branding">Accounts
   * API</a> to modify the {@code on_behalf_of} account's branding settings, which the portal
   * displays.
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * The URL to redirect customers to when they click on the portal's link to return to your
   * website.
   */
  @SerializedName("return_url")
  String returnUrl;

  /** The short-lived URL of the session that gives customers access to the customer portal. */
  @SerializedName("url")
  String url;

  /** Get ID of expandable {@code configuration} object. */
  public String getConfiguration() {
    return (this.configuration != null) ? this.configuration.getId() : null;
  }

  public void setConfiguration(String id) {
    this.configuration = ApiResource.setExpandableFieldId(id, this.configuration);
  }

  /** Get expanded {@code configuration}. */
  public Configuration getConfigurationObject() {
    return (this.configuration != null) ? this.configuration.getExpanded() : null;
  }

  public void setConfigurationObject(Configuration expandableObject) {
    this.configuration =
        new ExpandableField<Configuration>(expandableObject.getId(), expandableObject);
  }

  /** Creates a session of the customer portal. */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a session of the customer portal. */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/sessions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Session.class,
            options,
            ApiMode.V1);
  }

  /** Creates a session of the customer portal. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a session of the customer portal. */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/sessions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Session.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Flow extends StripeObject {
    @SerializedName("after_completion")
    AfterCompletion afterCompletion;

    /** Configuration when {@code flow.type=subscription_cancel}. */
    @SerializedName("subscription_cancel")
    SubscriptionCancel subscriptionCancel;

    /** Configuration when {@code flow.type=subscription_update}. */
    @SerializedName("subscription_update")
    SubscriptionUpdate subscriptionUpdate;

    /** Configuration when {@code flow.type=subscription_update_confirm}. */
    @SerializedName("subscription_update_confirm")
    SubscriptionUpdateConfirm subscriptionUpdateConfirm;

    /**
     * Type of flow that the customer will go through.
     *
     * <p>One of {@code payment_method_update}, {@code subscription_cancel}, {@code
     * subscription_update}, or {@code subscription_update_confirm}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterCompletion extends StripeObject {
      /** Configuration when {@code after_completion.type=hosted_confirmation}. */
      @SerializedName("hosted_confirmation")
      HostedConfirmation hostedConfirmation;

      /** Configuration when {@code after_completion.type=redirect}. */
      @SerializedName("redirect")
      Redirect redirect;

      /**
       * The specified type of behavior after the flow is completed.
       *
       * <p>One of {@code hosted_confirmation}, {@code portal_homepage}, or {@code redirect}.
       */
      @SerializedName("type")
      String type;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class HostedConfirmation extends StripeObject {
        /** A custom message to display to the customer after the flow is completed. */
        @SerializedName("custom_message")
        String customMessage;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Redirect extends StripeObject {
        /** The URL the customer will be redirected to after the flow is completed. */
        @SerializedName("return_url")
        String returnUrl;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionCancel extends StripeObject {
      /** Specify a retention strategy to be used in the cancellation flow. */
      @SerializedName("retention")
      Retention retention;

      /** The ID of the subscription to be canceled. */
      @SerializedName("subscription")
      String subscription;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Retention extends StripeObject {
        /** Configuration when {@code retention.type=coupon_offer}. */
        @SerializedName("coupon_offer")
        CouponOffer couponOffer;

        /**
         * Type of retention strategy that will be used.
         *
         * <p>Equal to {@code coupon_offer}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CouponOffer extends StripeObject {
          /** The ID of the coupon to be offered. */
          @SerializedName("coupon")
          String coupon;
        }
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdate extends StripeObject {
      /** The ID of the subscription to be updated. */
      @SerializedName("subscription")
      String subscription;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdateConfirm extends StripeObject {
      /**
       * The coupon or promotion code to apply to this subscription update. Currently, only up to
       * one may be specified.
       */
      @SerializedName("discounts")
      List<Session.Flow.SubscriptionUpdateConfirm.Discount> discounts;

      /**
       * The <a href="https://stripe.com/docs/api/subscription_items">subscription item</a> to be
       * updated through this flow. Currently, only up to one may be specified and subscriptions
       * with multiple items are not updatable.
       */
      @SerializedName("items")
      List<Session.Flow.SubscriptionUpdateConfirm.Item> items;

      /** The ID of the subscription to be updated. */
      @SerializedName("subscription")
      String subscription;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** The ID of the coupon to apply to this subscription update. */
        @SerializedName("coupon")
        String coupon;

        /** The ID of a promotion code to apply to this subscription update. */
        @SerializedName("promotion_code")
        String promotionCode;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Item extends StripeObject implements HasId {
        /**
         * The ID of the <a
         * href="https://stripe.com/docs/api/subscriptions/object#subscription_object-items-data-id">subscription
         * item</a> to be updated.
         */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * The price the customer should subscribe to through this flow. The price must also be
         * included in the configuration's <a
         * href="docs/api/customer_portal/configuration#portal_configuration_object-features-subscription_update-products">{@code
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
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(configuration, responseGetter);
    trySetResponseGetter(flow, responseGetter);
  }
}
