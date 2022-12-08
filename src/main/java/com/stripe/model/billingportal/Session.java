// File generated from our OpenAPI spec
package com.stripe.model.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.billingportal.SessionCreateParams;
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

  /** Information about a specific flow for the customer to go through. */
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
   * see the <a href="https://stripe.com/docs/connect/charges-transfers#on-behalf-of">docs</a>. Use
   * the <a
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/billing_portal/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
  }

  /** Creates a session of the customer portal. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a session of the customer portal. */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/billing_portal/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
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

    /**
     * Type of flow that the customer will go through.
     *
     * <p>One of {@code payment_method_update}, or {@code subscription_cancel}.
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
      /** The ID of the subscription to be canceled. */
      @SerializedName("subscription")
      String subscription;
    }
  }
}
