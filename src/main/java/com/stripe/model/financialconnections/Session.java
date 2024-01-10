// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.SessionCreateParams;
import com.stripe.param.financialconnections.SessionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Financial Connections Session is the secure way to programmatically launch the client-side
 * Stripe.js modal that lets your users link their accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {
  /** The account holder for whom accounts are collected in this session. */
  @SerializedName("account_holder")
  AccountHolder accountHolder;

  /** The accounts that were collected as part of this Session. */
  @SerializedName("accounts")
  AccountCollection accounts;

  /** A value that will be passed to the client to launch the authentication flow. */
  @SerializedName("client_secret")
  String clientSecret;

  @SerializedName("filters")
  Filters filters;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("limits")
  Limits limits;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("manual_entry")
  ManualEntry manualEntry;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.session}.
   */
  @SerializedName("object")
  String object;

  /** Permissions requested for accounts collected during this session. */
  @SerializedName("permissions")
  List<String> permissions;

  /** Data features requested to be retrieved upon account creation. */
  @SerializedName("prefetch")
  List<String> prefetch;

  /**
   * For webview integrations only. Upon completing OAuth login in the native browser, the user will
   * be redirected to this URL to return to your app.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * The current state of the session.
   *
   * <p>One of {@code cancelled}, {@code failed}, {@code pending}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Retrieves the details of a Financial Connections {@code Session}. */
  public static Session retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Financial Connections {@code Session}. */
  public static Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Financial Connections {@code Session}. */
  public static Session retrieve(String session, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  /** Retrieves the details of a Financial Connections {@code Session}. */
  public static Session retrieve(
      String session, SessionRetrieveParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/financial_connections/sessions/%s", ApiResource.urlEncodeId(session));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Session.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountHolder extends StripeObject {
    /**
     * The ID of the Stripe account this account belongs to. Should only be present if {@code
     * account_holder.type} is {@code account}.
     */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /**
     * ID of the Stripe customer this account belongs to. Present if and only if {@code
     * account_holder.type} is {@code customer}.
     */
    @SerializedName("customer")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Customer> customer;

    /**
     * Type of account holder that this account belongs to.
     *
     * <p>One of {@code account}, or {@code customer}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code account} object. */
    public String getAccount() {
      return (this.account != null) ? this.account.getId() : null;
    }

    public void setAccount(String id) {
      this.account = ApiResource.setExpandableFieldId(id, this.account);
    }

    /** Get expanded {@code account}. */
    public Account getAccountObject() {
      return (this.account != null) ? this.account.getExpanded() : null;
    }

    public void setAccountObject(Account expandableObject) {
      this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code customer} object. */
    public String getCustomer() {
      return (this.customer != null) ? this.customer.getId() : null;
    }

    public void setCustomer(String id) {
      this.customer = ApiResource.setExpandableFieldId(id, this.customer);
    }

    /** Get expanded {@code customer}. */
    public Customer getCustomerObject() {
      return (this.customer != null) ? this.customer.getExpanded() : null;
    }

    public void setCustomerObject(Customer expandableObject) {
      this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Filters extends StripeObject {
    /** List of countries from which to filter accounts. */
    @SerializedName("countries")
    List<String> countries;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Limits extends StripeObject {
    /** The number of accounts that can be linked in this Session. */
    @SerializedName("accounts")
    Long accounts;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ManualEntry extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("cancelled")
    Cancelled cancelled;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cancelled extends StripeObject {
      /**
       * The reason for the Session being cancelled.
       *
       * <p>One of {@code custom_manual_entry}, or {@code other}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(accountHolder, responseGetter);
    trySetResponseGetter(accounts, responseGetter);
    trySetResponseGetter(filters, responseGetter);
    trySetResponseGetter(limits, responseGetter);
    trySetResponseGetter(manualEntry, responseGetter);
    trySetResponseGetter(statusDetails, responseGetter);
  }
}
