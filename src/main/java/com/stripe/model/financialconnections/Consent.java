// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.ConsentCreateParams;
import com.stripe.param.financialconnections.ConsentRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Stripe-issued localized Financial Connections consent text. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Consent extends ApiResource implements HasId {
  @SerializedName("account_holder")
  AccountHolder accountHolder;

  /** The exact localized text that must be displayed before collecting affirmative consent. */
  @SerializedName("consent_text")
  String consentText;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The exclusive time after which this Consent can no longer be used as launch evidence. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The BCP 47 locale used to render {@code consent_text}. */
  @SerializedName("locale")
  String locale;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.consent}.
   */
  @SerializedName("object")
  String object;

  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public static Consent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public static Consent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/consents";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Consent.class);
  }

  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public static Consent create(ConsentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Financial Connections {@code Consent} object for an account holder. */
  public static Consent create(ConsentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/consents";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Consent.class);
  }

  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public static Consent retrieve(String consent) throws StripeException {
    return retrieve(consent, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public static Consent retrieve(String consent, RequestOptions options) throws StripeException {
    return retrieve(consent, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public static Consent retrieve(String consent, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/consents/%s", ApiResource.urlEncodeId(consent));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Consent.class);
  }

  /** Retrieves the details of a Financial Connections {@code Consent}. */
  public static Consent retrieve(
      String consent, ConsentRetrieveParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/financial_connections/consents/%s", ApiResource.urlEncodeId(consent));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Consent.class);
  }

  /**
   * For more details about AccountHolder, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountHolder extends StripeObject {
    /**
     * The ID of the Stripe account that this account belongs to. Only available when {@code
     * account_holder.type} is {@code account}.
     */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /**
     * The ID for an Account representing a customer that this account belongs to. Only available
     * when {@code account_holder.type} is {@code customer}.
     */
    @SerializedName("customer")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Customer> customer;

    @SerializedName("customer_account")
    String customerAccount;

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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(accountHolder, responseGetter);
  }
}
