// File generated from our OpenAPI spec
package com.stripe.model.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Application;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billingportal.ConfigurationCreateParams;
import com.stripe.param.billingportal.ConfigurationListParams;
import com.stripe.param.billingportal.ConfigurationRetrieveParams;
import com.stripe.param.billingportal.ConfigurationUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A portal configuration describes the functionality and behavior of a portal session. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Configuration extends ApiResource implements HasId, MetadataStore<Configuration> {
  /** Whether the configuration is active and can be used to create portal sessions. */
  @SerializedName("active")
  Boolean active;

  /** ID of the Connect Application that created the configuration. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your
   * website. This can be <a
   * href="https://stripe.com/docs/api/customer_portal/sessions/create#create_portal_session-return_url">overriden</a>
   * when creating the session.
   */
  @SerializedName("default_return_url")
  String defaultReturnUrl;

  @SerializedName("features")
  Features features;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Whether the configuration is the default. If {@code true}, this configuration can be managed in
   * the Dashboard and portal sessions will use this configuration unless it is overriden when
   * creating the session.
   */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("login_page")
  LoginPage loginPage;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing_portal.configuration}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public static Configuration create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public static Configuration create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/configurations";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Configuration.class,
            options,
            ApiMode.V1);
  }

  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public static Configuration create(ConfigurationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public static Configuration create(ConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/configurations";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Configuration.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public static ConfigurationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public static ConfigurationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/configurations";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            ConfigurationCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public static ConfigurationCollection list(ConfigurationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public static ConfigurationCollection list(ConfigurationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/configurations";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ConfigurationCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public static Configuration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public static Configuration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, options);
  }

  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public static Configuration retrieve(
      String configuration, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(configuration));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Configuration.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public static Configuration retrieve(
      String configuration, ConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Configuration.class,
            options,
            ApiMode.V1);
  }

  /** Updates a configuration that describes the functionality of the customer portal. */
  @Override
  public Configuration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a configuration that describes the functionality of the customer portal. */
  @Override
  public Configuration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Configuration.class,
            options,
            ApiMode.V1);
  }

  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(ConfigurationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(ConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Configuration.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessProfile extends StripeObject {
    /** The messaging shown to customers in the portal. */
    @SerializedName("headline")
    String headline;

    /** A link to the business’s publicly available privacy policy. */
    @SerializedName("privacy_policy_url")
    String privacyPolicyUrl;

    /** A link to the business’s publicly available terms of service. */
    @SerializedName("terms_of_service_url")
    String termsOfServiceUrl;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Features extends StripeObject {
    @SerializedName("customer_update")
    CustomerUpdate customerUpdate;

    @SerializedName("invoice_history")
    InvoiceHistory invoiceHistory;

    @SerializedName("payment_method_update")
    PaymentMethodUpdate paymentMethodUpdate;

    @SerializedName("subscription_cancel")
    SubscriptionCancel subscriptionCancel;

    @SerializedName("subscription_pause")
    SubscriptionPause subscriptionPause;

    @SerializedName("subscription_update")
    SubscriptionUpdate subscriptionUpdate;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerUpdate extends StripeObject {
      /**
       * The types of customer updates that are supported. When empty, customers are not updateable.
       */
      @SerializedName("allowed_updates")
      List<String> allowedUpdates;

      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceHistory extends StripeObject {
      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodUpdate extends StripeObject {
      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionCancel extends StripeObject {
      @SerializedName("cancellation_reason")
      CancellationReason cancellationReason;

      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Whether to cancel subscriptions immediately or at the end of the billing period.
       *
       * <p>One of {@code at_period_end}, or {@code immediately}.
       */
      @SerializedName("mode")
      String mode;

      /**
       * Whether to create prorations when canceling subscriptions. Possible values are {@code none}
       * and {@code create_prorations}.
       *
       * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
       */
      @SerializedName("proration_behavior")
      String prorationBehavior;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CancellationReason extends StripeObject {
        /** Whether the feature is enabled. */
        @SerializedName("enabled")
        Boolean enabled;

        /** Which cancellation reasons will be given as options to the customer. */
        @SerializedName("options")
        List<String> options;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionPause extends StripeObject {
      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionUpdate extends StripeObject {
      /**
       * The types of subscription updates that are supported for items listed in the {@code
       * products} attribute. When empty, subscriptions are not updateable.
       */
      @SerializedName("default_allowed_updates")
      List<String> defaultAllowedUpdates;

      /** Whether the feature is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The list of products that support subscription updates. */
      @SerializedName("products")
      List<Configuration.Features.SubscriptionUpdate.Product> products;

      /**
       * Determines how to handle prorations resulting from subscription updates. Valid values are
       * {@code none}, {@code create_prorations}, and {@code always_invoice}.
       *
       * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
       */
      @SerializedName("proration_behavior")
      String prorationBehavior;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Product extends StripeObject {
        /** The list of price IDs which, when subscribed to, a subscription can be updated. */
        @SerializedName("prices")
        List<String> prices;

        /** The product ID. */
        @SerializedName("product")
        String product;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginPage extends StripeObject {
    /**
     * If {@code true}, a shareable {@code url} will be generated that will take your customers to a
     * hosted login page for the customer portal.
     *
     * <p>If {@code false}, the previously generated {@code url}, if any, will be deactivated.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * A shareable URL to the hosted portal login page. Your customers will be able to log in with
     * their <a href="https://stripe.com/docs/api/customers/object#customer_object-email">email</a>
     * and receive a link to their customer portal.
     */
    @SerializedName("url")
    String url;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(businessProfile, responseGetter);
    trySetResponseGetter(features, responseGetter);
    trySetResponseGetter(loginPage, responseGetter);
  }
}
