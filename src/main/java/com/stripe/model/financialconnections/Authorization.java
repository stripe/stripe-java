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
import com.stripe.param.financialconnections.AuthorizationRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Authorization represents the set of credentials used to connect a group of Financial
 * Connections Accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends ApiResource implements HasId {
  /** The account holder that this authorization belongs to. */
  @SerializedName("account_holder")
  AccountHolder accountHolder;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The ID of the Financial Connections Institution this account belongs to. Note that this
   * relationship may sometimes change in rare circumstances (e.g. institution mergers).
   */
  @SerializedName("institution")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Institution> institution;

  /** The name of the institution that this authorization belongs to. */
  @SerializedName("institution_name")
  String institutionName;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.authorization}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the connection to the Authorization.
   *
   * <p>One of {@code active}, {@code disconnected}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Get ID of expandable {@code institution} object. */
  public String getInstitution() {
    return (this.institution != null) ? this.institution.getId() : null;
  }

  public void setInstitution(String id) {
    this.institution = ApiResource.setExpandableFieldId(id, this.institution);
  }

  /** Get expanded {@code institution}. */
  public Institution getInstitutionObject() {
    return (this.institution != null) ? this.institution.getExpanded() : null;
  }

  public void setInstitutionObject(Institution expandableObject) {
    this.institution = new ExpandableField<Institution>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public static Authorization retrieve(String authorization) throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public static Authorization retrieve(String authorization, RequestOptions options)
      throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public static Authorization retrieve(
      String authorization, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/authorizations/%s", ApiResource.urlEncodeId(authorization));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Authorization.class);
  }

  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public static Authorization retrieve(
      String authorization, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/authorizations/%s", ApiResource.urlEncodeId(authorization));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Authorization.class);
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

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("inactive")
    Inactive inactive;

    /**
     * For more details about Inactive, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Inactive extends StripeObject {
      /**
       * The action (if any) to relink the inactive Authorization.
       *
       * <p>One of {@code none}, or {@code relink_required}.
       */
      @SerializedName("action")
      String action;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(accountHolder, responseGetter);
    trySetResponseGetter(institution, responseGetter);
    trySetResponseGetter(statusDetails, responseGetter);
  }
}
