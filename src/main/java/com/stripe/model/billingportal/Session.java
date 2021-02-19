// File generated from our OpenAPI spec
package com.stripe.model.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.billingportal.SessionCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
}
