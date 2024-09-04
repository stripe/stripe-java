// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
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
import com.stripe.param.financialconnections.AccountDisconnectParams;
import com.stripe.param.financialconnections.AccountListOwnersParams;
import com.stripe.param.financialconnections.AccountListParams;
import com.stripe.param.financialconnections.AccountRefreshParams;
import com.stripe.param.financialconnections.AccountRetrieveParams;
import com.stripe.param.financialconnections.AccountSubscribeParams;
import com.stripe.param.financialconnections.AccountUnsubscribeParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Financial Connections Account represents an account that exists outside of Stripe, to which you
 * have been granted some degree of access.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends ApiResource implements HasId {
  /** The account holder that this account belongs to. */
  @SerializedName("account_holder")
  AccountHolder accountHolder;

  /** The most recent information about the account's balance. */
  @SerializedName("balance")
  Balance balance;

  /** The state of the most recent attempt to refresh the account balance. */
  @SerializedName("balance_refresh")
  BalanceRefresh balanceRefresh;

  /**
   * The type of the account. Account category is further divided in {@code subcategory}.
   *
   * <p>One of {@code cash}, {@code credit}, {@code investment}, or {@code other}.
   */
  @SerializedName("category")
  String category;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * A human-readable name that has been assigned to this account, either by the account holder or
   * by the institution.
   */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The state of the most recent attempt to refresh the account's inferred balance history. */
  @SerializedName("inferred_balances_refresh")
  InferredBalancesRefresh inferredBalancesRefresh;

  /** The name of the institution that holds this account. */
  @SerializedName("institution_name")
  String institutionName;

  /** The last 4 digits of the account number. If present, this will be 4 numeric characters. */
  @SerializedName("last4")
  String last4;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.account}.
   */
  @SerializedName("object")
  String object;

  /** The most recent information about the account's owners. */
  @SerializedName("ownership")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<AccountOwnership> ownership;

  /** The state of the most recent attempt to refresh the account owners. */
  @SerializedName("ownership_refresh")
  OwnershipRefresh ownershipRefresh;

  /** The list of permissions granted by this account. */
  @SerializedName("permissions")
  List<String> permissions;

  /**
   * The status of the link to the account.
   *
   * <p>One of {@code active}, {@code disconnected}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /**
   * If {@code category} is {@code cash}, one of:
   *
   * <p>- {@code checking} - {@code savings} - {@code other}
   *
   * <p>If {@code category} is {@code credit}, one of:
   *
   * <p>- {@code mortgage} - {@code line_of_credit} - {@code credit_card} - {@code other}
   *
   * <p>If {@code category} is {@code investment} or {@code other}, this will be {@code other}.
   */
  @SerializedName("subcategory")
  String subcategory;

  /** The list of data refresh subscriptions requested on this account. */
  @SerializedName("subscriptions")
  List<String> subscriptions;

  /**
   * The <a
   * href="https://stripe.com/docs/api/payment_methods/object#payment_method_object-type">PaymentMethod
   * type</a>(s) that can be created from this account.
   */
  @SerializedName("supported_payment_method_types")
  List<String> supportedPaymentMethodTypes;

  /** The state of the most recent attempt to refresh the account transactions. */
  @SerializedName("transaction_refresh")
  TransactionRefresh transactionRefresh;

  /** Get ID of expandable {@code ownership} object. */
  public String getOwnership() {
    return (this.ownership != null) ? this.ownership.getId() : null;
  }

  public void setOwnership(String id) {
    this.ownership = ApiResource.setExpandableFieldId(id, this.ownership);
  }

  /** Get expanded {@code ownership}. */
  public AccountOwnership getOwnershipObject() {
    return (this.ownership != null) ? this.ownership.getExpanded() : null;
  }

  public void setOwnershipObject(AccountOwnership expandableObject) {
    this.ownership =
        new ExpandableField<AccountOwnership>(expandableObject.getId(), expandableObject);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect() throws StripeException {
    return disconnect((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect(RequestOptions options)
      throws StripeException {
    return disconnect((Map<String, Object>) null, options);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect(Map<String, Object> params)
      throws StripeException {
    return disconnect(params, (RequestOptions) null);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/disconnect",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect(AccountDisconnectParams params)
      throws StripeException {
    return disconnect(params, (RequestOptions) null);
  }

  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public com.stripe.model.financialconnections.Account disconnect(
      AccountDisconnectParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/disconnect",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /** Returns a list of Financial Connections {@code Account} objects. */
  public static AccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Account} objects. */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/accounts";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountCollection.class);
  }

  /** Returns a list of Financial Connections {@code Account} objects. */
  public static AccountCollection list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Account} objects. */
  public static AccountCollection list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/accounts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountCollection.class);
  }

  /** Lists all owners for a given {@code Account}. */
  public AccountOwnerCollection listOwners(Map<String, Object> params) throws StripeException {
    return listOwners(params, (RequestOptions) null);
  }

  /** Lists all owners for a given {@code Account}. */
  public AccountOwnerCollection listOwners(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/owners", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, AccountOwnerCollection.class);
  }

  /** Lists all owners for a given {@code Account}. */
  public AccountOwnerCollection listOwners(AccountListOwnersParams params) throws StripeException {
    return listOwners(params, (RequestOptions) null);
  }

  /** Lists all owners for a given {@code Account}. */
  public AccountOwnerCollection listOwners(AccountListOwnersParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/owners", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, AccountOwnerCollection.class);
  }

  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public com.stripe.model.financialconnections.Account refresh(Map<String, Object> params)
      throws StripeException {
    return refresh(params, (RequestOptions) null);
  }

  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public com.stripe.model.financialconnections.Account refresh(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/refresh", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public com.stripe.model.financialconnections.Account refresh(AccountRefreshParams params)
      throws StripeException {
    return refresh(params, (RequestOptions) null);
  }

  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public com.stripe.model.financialconnections.Account refresh(
      AccountRefreshParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/refresh", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /** Retrieves the details of an Financial Connections {@code Account}. */
  public static com.stripe.model.financialconnections.Account retrieve(String account)
      throws StripeException {
    return retrieve(account, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an Financial Connections {@code Account}. */
  public static com.stripe.model.financialconnections.Account retrieve(
      String account, RequestOptions options) throws StripeException {
    return retrieve(account, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an Financial Connections {@code Account}. */
  public static com.stripe.model.financialconnections.Account retrieve(
      String account, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/financial_connections/accounts/%s", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /** Retrieves the details of an Financial Connections {@code Account}. */
  public static com.stripe.model.financialconnections.Account retrieve(
      String account, AccountRetrieveParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/financial_connections/accounts/%s", ApiResource.urlEncodeId(account));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account subscribe(Map<String, Object> params)
      throws StripeException {
    return subscribe(params, (RequestOptions) null);
  }

  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account subscribe(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/subscribe",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account subscribe(AccountSubscribeParams params)
      throws StripeException {
    return subscribe(params, (RequestOptions) null);
  }

  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account subscribe(
      AccountSubscribeParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/subscribe",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account unsubscribe(Map<String, Object> params)
      throws StripeException {
    return unsubscribe(params, (RequestOptions) null);
  }

  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account unsubscribe(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/unsubscribe",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
  }

  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account unsubscribe(AccountUnsubscribeParams params)
      throws StripeException {
    return unsubscribe(params, (RequestOptions) null);
  }

  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public com.stripe.model.financialconnections.Account unsubscribe(
      AccountUnsubscribeParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/unsubscribe",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter()
        .request(request, com.stripe.model.financialconnections.Account.class);
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
    ExpandableField<com.stripe.model.Account> account;

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
    public com.stripe.model.Account getAccountObject() {
      return (this.account != null) ? this.account.getExpanded() : null;
    }

    public void setAccountObject(com.stripe.model.Account expandableObject) {
      this.account =
          new ExpandableField<com.stripe.model.Account>(expandableObject.getId(), expandableObject);
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
  public static class Balance extends StripeObject {
    /**
     * The time that the external institution calculated this balance. Measured in seconds since the
     * Unix epoch.
     */
    @SerializedName("as_of")
    Long asOf;

    @SerializedName("cash")
    Cash cash;

    @SerializedName("credit")
    Credit credit;

    /**
     * The balances owed to (or by) the account holder, before subtracting any outbound pending
     * transactions or adding any inbound pending transactions.
     *
     * <p>Each key is a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO
     * currency code</a>, in lowercase.
     *
     * <p>Each value is a integer amount. A positive amount indicates money owed to the account
     * holder. A negative amount indicates money owed by the account holder.
     */
    @SerializedName("current")
    Map<String, Long> current;

    /**
     * The {@code type} of the balance. An additional hash is included on the balance with a name
     * matching this value.
     *
     * <p>One of {@code cash}, or {@code credit}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cash extends StripeObject {
      /**
       * The funds available to the account holder. Typically this is the current balance after
       * subtracting any outbound pending transactions and adding any inbound pending transactions.
       *
       * <p>Each key is a three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase.
       *
       * <p>Each value is a integer amount. A positive amount indicates money owed to the account
       * holder. A negative amount indicates money owed by the account holder.
       */
      @SerializedName("available")
      Map<String, Long> available;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Credit extends StripeObject {
      /**
       * The credit that has been used by the account holder.
       *
       * <p>Each key is a three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase.
       *
       * <p>Each value is a integer amount. A positive amount indicates money owed to the account
       * holder. A negative amount indicates money owed by the account holder.
       */
      @SerializedName("used")
      Map<String, Long> used;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceRefresh extends StripeObject {
    /**
     * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix
     * epoch.
     */
    @SerializedName("last_attempted_at")
    Long lastAttemptedAt;

    /**
     * Time at which the next balance refresh can be initiated. This value will be {@code null} when
     * {@code status} is {@code pending}. Measured in seconds since the Unix epoch.
     */
    @SerializedName("next_refresh_available_at")
    Long nextRefreshAvailableAt;

    /**
     * The status of the last refresh attempt.
     *
     * <p>One of {@code failed}, {@code pending}, or {@code succeeded}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InferredBalancesRefresh extends StripeObject {
    /**
     * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix
     * epoch.
     */
    @SerializedName("last_attempted_at")
    Long lastAttemptedAt;

    /**
     * Time at which the next inferred balance refresh can be initiated. This value will be {@code
     * null} when {@code status} is {@code pending}. Measured in seconds since the Unix epoch.
     */
    @SerializedName("next_refresh_available_at")
    Long nextRefreshAvailableAt;

    /**
     * The status of the last refresh attempt.
     *
     * <p>One of {@code failed}, {@code pending}, or {@code succeeded}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OwnershipRefresh extends StripeObject {
    /**
     * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix
     * epoch.
     */
    @SerializedName("last_attempted_at")
    Long lastAttemptedAt;

    /**
     * Time at which the next ownership refresh can be initiated. This value will be {@code null}
     * when {@code status} is {@code pending}. Measured in seconds since the Unix epoch.
     */
    @SerializedName("next_refresh_available_at")
    Long nextRefreshAvailableAt;

    /**
     * The status of the last refresh attempt.
     *
     * <p>One of {@code failed}, {@code pending}, or {@code succeeded}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionRefresh extends StripeObject implements HasId {
    /** Unique identifier for the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix
     * epoch.
     */
    @SerializedName("last_attempted_at")
    Long lastAttemptedAt;

    /**
     * Time at which the next transaction refresh can be initiated. This value will be {@code null}
     * when {@code status} is {@code pending}. Measured in seconds since the Unix epoch.
     */
    @SerializedName("next_refresh_available_at")
    Long nextRefreshAvailableAt;

    /**
     * The status of the last refresh attempt.
     *
     * <p>One of {@code failed}, {@code pending}, or {@code succeeded}.
     */
    @SerializedName("status")
    String status;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(accountHolder, responseGetter);
    trySetResponseGetter(balance, responseGetter);
    trySetResponseGetter(balanceRefresh, responseGetter);
    trySetResponseGetter(inferredBalancesRefresh, responseGetter);
    trySetResponseGetter(ownership, responseGetter);
    trySetResponseGetter(ownershipRefresh, responseGetter);
    trySetResponseGetter(transactionRefresh, responseGetter);
  }
}
