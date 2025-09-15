// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountCapabilitiesParams;
import com.stripe.param.AccountCreateParams;
import com.stripe.param.AccountListParams;
import com.stripe.param.AccountPersonsParams;
import com.stripe.param.AccountRejectParams;
import com.stripe.param.AccountRetrieveParams;
import com.stripe.param.AccountUpdateParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This is an object representing a Stripe account. You can retrieve it to see properties on the
 * account like its current requirements or if the account is enabled to make live charges or
 * receive payouts.
 *
 * <p>For accounts where <a
 * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
 * is {@code application}, which includes Custom accounts, the properties below are always returned.
 *
 * <p>For accounts where <a
 * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
 * is {@code stripe}, which includes Standard and Express accounts, some properties are only
 * returned until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or
 * <a href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect
 * Onboarding. Learn about the <a href="https://stripe.com/connect/accounts">differences between
 * accounts</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Account extends ApiResource implements MetadataStore<Account>, PaymentSource {
  /** Business information about the account. */
  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /**
   * The business type.
   *
   * <p>One of {@code company}, {@code government_entity}, {@code individual}, or {@code
   * non_profit}.
   */
  @SerializedName("business_type")
  String businessType;

  @SerializedName("capabilities")
  Capabilities capabilities;

  /** Whether the account can process charges. */
  @SerializedName("charges_enabled")
  Boolean chargesEnabled;

  @SerializedName("company")
  Company company;

  @SerializedName("controller")
  Controller controller;

  /** The account's country. */
  @SerializedName("country")
  String country;

  /** Time at which the account was connected. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that <a href="https://stripe.com/docs/payouts">Stripe supports in the account's
   * country</a>.
   */
  @SerializedName("default_currency")
  String defaultCurrency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Whether account details have been submitted. Accounts with Stripe Dashboard access, which
   * includes Standard accounts, cannot receive payouts before this is true. Accounts where this is
   * false should be directed to <a href="https://stripe.com/connect/onboarding">an onboarding
   * flow</a> to finish submitting account details.
   */
  @SerializedName("details_submitted")
  Boolean detailsSubmitted;

  /**
   * An email address associated with the account. It's not used for authentication and Stripe
   * doesn't market to this field without explicit approval from the platform.
   */
  @SerializedName("email")
  String email;

  /**
   * External accounts (bank accounts and debit cards) currently attached to this account. External
   * accounts are only returned for requests where {@code controller[is_controller]} is true.
   */
  @SerializedName("external_accounts")
  ExternalAccountCollection externalAccounts;

  @SerializedName("future_requirements")
  FutureRequirements futureRequirements;

  /** The groups associated with the account. */
  @SerializedName("groups")
  Groups groups;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * This is an object representing a person associated with a Stripe account.
   *
   * <p>A platform can only access a subset of data in a person for an account where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, after creating an Account Link
   * or Account Session to start Connect onboarding.
   *
   * <p>See the <a href="https://stripe.com/connect/standard-accounts">Standard onboarding</a> or <a
   * href="https://stripe.com/connect/express-accounts">Express onboarding</a> documentation for
   * information about prefilling information and account onboarding steps. Learn more about <a
   * href="https://stripe.com/connect/handling-api-verification#person-information">handling
   * identity verification with the API</a>.
   */
  @SerializedName("individual")
  Person individual;

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
   * <p>Equal to {@code account}.
   */
  @SerializedName("object")
  String object;

  /** Whether the funds in this account can be paid out. */
  @SerializedName("payouts_enabled")
  Boolean payoutsEnabled;

  @SerializedName("requirements")
  Requirements requirements;

  @SerializedName("risk_controls")
  RiskControls riskControls;

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  Settings settings;

  @SerializedName("tos_acceptance")
  TosAcceptance tosAcceptance;

  /**
   * The Stripe account type. Can be {@code standard}, {@code express}, {@code custom}, or {@code
   * none}.
   */
  @SerializedName("type")
  String type;

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities() throws StripeException {
    return capabilities((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(Map<String, Object> params) throws StripeException {
    return capabilities(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, CapabilityCollection.class);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(AccountCapabilitiesParams params)
      throws StripeException {
    return capabilities(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(AccountCapabilitiesParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CapabilityCollection.class);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public static Account create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/accounts";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public static Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public static Account create(AccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/accounts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts that have access to the standard dashboard and Stripe is responsible for
   * negative account balances cannot be deleted, which includes Standard accounts. All other
   * Live-mode accounts, can be deleted when all <a
   * href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts that have access to the standard dashboard and Stripe is responsible for
   * negative account balances cannot be deleted, which includes Standard accounts. All other
   * Live-mode accounts, can be deleted when all <a
   * href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts that have access to the standard dashboard and Stripe is responsible for
   * negative account balances cannot be deleted, which includes Standard accounts. All other
   * Live-mode accounts, can be deleted when all <a
   * href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts that have access to the standard dashboard and Stripe is responsible for
   * negative account balances cannot be deleted, which includes Standard accounts. All other
   * Live-mode accounts, can be deleted when all <a
   * href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Account.class);
  }

  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public static AccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/accounts";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountCollection.class);
  }

  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public static AccountCollection list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public static AccountCollection list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/accounts";
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

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons() throws StripeException {
    return persons((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(Map<String, Object> params) throws StripeException {
    return persons(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, PersonCollection.class);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(AccountPersonsParams params) throws StripeException {
    return persons(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection persons(AccountPersonsParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PersonCollection.class);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(Map<String, Object> params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Account.class);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(AccountRejectParams params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(AccountRejectParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Account.class);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(String account) throws StripeException {
    return retrieve(account, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(String account, RequestOptions options) throws StripeException {
    return retrieve(account, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(String account, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(
      String account, AccountRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Account.class);
  }

  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  @Override
  public Account update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  @Override
  public Account update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Account.class);
  }

  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(AccountUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(AccountUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Account.class);
  }

  /**
   * For more details about BusinessProfile, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessProfile extends StripeObject {
    /** The applicant's gross annual revenue for its preceding fiscal year. */
    @SerializedName("annual_revenue")
    AnnualRevenue annualRevenue;

    /**
     * An estimated upper bound of employees, contractors, vendors, etc. currently working for the
     * business.
     */
    @SerializedName("estimated_worker_count")
    Long estimatedWorkerCount;

    /**
     * <a href="https://stripe.com/connect/setting-mcc">The merchant category code for the
     * account</a>. MCCs are used to classify businesses based on the goods or services they
     * provide.
     */
    @SerializedName("mcc")
    String mcc;

    /** Whether the business is a minority-owned, women-owned, and/or LGBTQI+ -owned business. */
    @SerializedName("minority_owned_business_designation")
    List<String> minorityOwnedBusinessDesignation;

    @SerializedName("monthly_estimated_revenue")
    MonthlyEstimatedRevenue monthlyEstimatedRevenue;

    /** The customer-facing business name. */
    @SerializedName("name")
    String name;

    /**
     * Internal-only description of the product sold or service provided by the business. It's used
     * by Stripe for risk and underwriting purposes.
     */
    @SerializedName("product_description")
    String productDescription;

    /** A publicly available mailing address for sending support issues to. */
    @SerializedName("support_address")
    Address supportAddress;

    /** A publicly available email address for sending support issues to. */
    @SerializedName("support_email")
    String supportEmail;

    /** A publicly available phone number to call with support issues. */
    @SerializedName("support_phone")
    String supportPhone;

    /** A publicly available website for handling support issues. */
    @SerializedName("support_url")
    String supportUrl;

    /** The business's publicly available website. */
    @SerializedName("url")
    String url;

    /**
     * For more details about AnnualRevenue, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AnnualRevenue extends StripeObject {
      /**
       * A non-negative integer representing the amount in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for the
       * 31st of December, 2023.
       */
      @SerializedName("fiscal_year_end")
      String fiscalYearEnd;
    }

    /**
     * For more details about MonthlyEstimatedRevenue, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MonthlyEstimatedRevenue extends StripeObject {
      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;
    }
  }

  /**
   * For more details about Capabilities, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Capabilities extends StripeObject {
    /**
     * The status of the Canadian pre-authorized debits payments capability of the account, or
     * whether the account can directly process Canadian pre-authorized debits charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("acss_debit_payments")
    String acssDebitPayments;

    /**
     * The status of the Affirm capability of the account, or whether the account can directly
     * process Affirm charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("affirm_payments")
    String affirmPayments;

    /**
     * The status of the Afterpay Clearpay capability of the account, or whether the account can
     * directly process Afterpay Clearpay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("afterpay_clearpay_payments")
    String afterpayClearpayPayments;

    /**
     * The status of the Alma capability of the account, or whether the account can directly process
     * Alma payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("alma_payments")
    String almaPayments;

    /**
     * The status of the AmazonPay capability of the account, or whether the account can directly
     * process AmazonPay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("amazon_pay_payments")
    String amazonPayPayments;

    /**
     * The status of the BECS Direct Debit (AU) payments capability of the account, or whether the
     * account can directly process BECS Direct Debit (AU) charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("au_becs_debit_payments")
    String auBecsDebitPayments;

    /**
     * The status of the automatic_indirect_tax capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("automatic_indirect_tax")
    String automaticIndirectTax;

    /**
     * The status of the Bacs Direct Debits payments capability of the account, or whether the
     * account can directly process Bacs Direct Debits charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("bacs_debit_payments")
    String bacsDebitPayments;

    /**
     * The status of the Bancontact payments capability of the account, or whether the account can
     * directly process Bancontact charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("bancontact_payments")
    String bancontactPayments;

    /**
     * The status of the customer_balance payments capability of the account, or whether the account
     * can directly process customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("bank_transfer_payments")
    String bankTransferPayments;

    /**
     * The status of the Billie capability of the account, or whether the account can directly
     * process Billie payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("billie_payments")
    String billiePayments;

    /**
     * The status of the blik payments capability of the account, or whether the account can
     * directly process blik charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("blik_payments")
    String blikPayments;

    /**
     * The status of the boleto payments capability of the account, or whether the account can
     * directly process boleto charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("boleto_payments")
    String boletoPayments;

    /**
     * The status of the card issuing capability of the account, or whether you can use Issuing to
     * distribute funds on cards
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("card_issuing")
    String cardIssuing;

    /**
     * The status of the card payments capability of the account, or whether the account can
     * directly process credit and debit card charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("card_payments")
    String cardPayments;

    /**
     * The status of the Cartes Bancaires payments capability of the account, or whether the account
     * can directly process Cartes Bancaires card charges in EUR currency.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("cartes_bancaires_payments")
    String cartesBancairesPayments;

    /**
     * The status of the Cash App Pay capability of the account, or whether the account can directly
     * process Cash App Pay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("cashapp_payments")
    String cashappPayments;

    /**
     * The status of the Crypto capability of the account, or whether the account can directly
     * process Crypto payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("crypto_payments")
    String cryptoPayments;

    /**
     * The status of the EPS payments capability of the account, or whether the account can directly
     * process EPS charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("eps_payments")
    String epsPayments;

    /**
     * The status of the FPX payments capability of the account, or whether the account can directly
     * process FPX charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("fpx_payments")
    String fpxPayments;

    /**
     * The status of the GB customer_balance payments (GBP currency) capability of the account, or
     * whether the account can directly process GB customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("gb_bank_transfer_payments")
    String gbBankTransferPayments;

    /**
     * The status of the giropay payments capability of the account, or whether the account can
     * directly process giropay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("giropay_payments")
    String giropayPayments;

    /**
     * The status of the Gopay capability of the account, or whether the account can directly
     * process Gopay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("gopay_payments")
    String gopayPayments;

    /**
     * The status of the GrabPay payments capability of the account, or whether the account can
     * directly process GrabPay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("grabpay_payments")
    String grabpayPayments;

    /**
     * The status of the Indonesia Bank Transfer payments capability of the account, or whether the
     * account can directly process Indonesia Bank Transfer charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("id_bank_transfer_payments")
    String idBankTransferPayments;

    /**
     * The status of Bank BCA onboarding of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("id_bank_transfer_payments_bca")
    String idBankTransferPaymentsBca;

    /**
     * The status of the iDEAL payments capability of the account, or whether the account can
     * directly process iDEAL charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("ideal_payments")
    String idealPayments;

    /**
     * The status of the india_international_payments capability of the account, or whether the
     * account can process international charges (non INR) in India.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("india_international_payments")
    String indiaInternationalPayments;

    /**
     * The status of the JCB payments capability of the account, or whether the account (Japan only)
     * can directly process JCB credit card charges in JPY currency.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("jcb_payments")
    String jcbPayments;

    /**
     * The status of the Japanese customer_balance payments (JPY currency) capability of the
     * account, or whether the account can directly process Japanese customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("jp_bank_transfer_payments")
    String jpBankTransferPayments;

    /**
     * The status of the KakaoPay capability of the account, or whether the account can directly
     * process KakaoPay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("kakao_pay_payments")
    String kakaoPayPayments;

    /**
     * The status of the Klarna payments capability of the account, or whether the account can
     * directly process Klarna charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("klarna_payments")
    String klarnaPayments;

    /**
     * The status of the konbini payments capability of the account, or whether the account can
     * directly process konbini charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("konbini_payments")
    String konbiniPayments;

    /**
     * The status of the KrCard capability of the account, or whether the account can directly
     * process KrCard payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("kr_card_payments")
    String krCardPayments;

    /**
     * The status of the legacy payments capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("legacy_payments")
    String legacyPayments;

    /**
     * The status of the link_payments capability of the account, or whether the account can
     * directly process Link charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("link_payments")
    String linkPayments;

    /**
     * The status of the MB WAY payments capability of the account, or whether the account can
     * directly process MB WAY charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("mb_way_payments")
    String mbWayPayments;

    /**
     * The status of the MobilePay capability of the account, or whether the account can directly
     * process MobilePay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("mobilepay_payments")
    String mobilepayPayments;

    /**
     * The status of the Multibanco payments capability of the account, or whether the account can
     * directly process Multibanco charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("multibanco_payments")
    String multibancoPayments;

    /**
     * The status of the Mexican customer_balance payments (MXN currency) capability of the account,
     * or whether the account can directly process Mexican customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("mx_bank_transfer_payments")
    String mxBankTransferPayments;

    /**
     * The status of the NaverPay capability of the account, or whether the account can directly
     * process NaverPay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("naver_pay_payments")
    String naverPayPayments;

    /**
     * The status of the New Zealand BECS Direct Debit payments capability of the account, or
     * whether the account can directly process New Zealand BECS Direct Debit charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("nz_bank_account_becs_debit_payments")
    String nzBankAccountBecsDebitPayments;

    /**
     * The status of the OXXO payments capability of the account, or whether the account can
     * directly process OXXO charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("oxxo_payments")
    String oxxoPayments;

    /**
     * The status of the P24 payments capability of the account, or whether the account can directly
     * process P24 charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("p24_payments")
    String p24Payments;

    /**
     * The status of the pay_by_bank payments capability of the account, or whether the account can
     * directly process pay_by_bank charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("pay_by_bank_payments")
    String payByBankPayments;

    /**
     * The status of the Payco capability of the account, or whether the account can directly
     * process Payco payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("payco_payments")
    String paycoPayments;

    /**
     * The status of the paynow payments capability of the account, or whether the account can
     * directly process paynow charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("paynow_payments")
    String paynowPayments;

    /**
     * The status of the PayPal payments capability of the account, or whether the account can
     * directly process PayPal charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("paypal_payments")
    String paypalPayments;

    /**
     * The status of the Paypay capability of the account, or whether the account can directly
     * process Paypay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("paypay_payments")
    String paypayPayments;

    /**
     * The status of the PayTo capability of the account, or whether the account can directly
     * process PayTo charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("payto_payments")
    String paytoPayments;

    /**
     * The status of the pix payments capability of the account, or whether the account can directly
     * process pix charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("pix_payments")
    String pixPayments;

    /**
     * The status of the promptpay payments capability of the account, or whether the account can
     * directly process promptpay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("promptpay_payments")
    String promptpayPayments;

    /**
     * The status of the Qris capability of the account, or whether the account can directly process
     * Qris payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("qris_payments")
    String qrisPayments;

    /**
     * The status of the Rechnung capability of the account, or whether the account can directly
     * process Rechnung payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("rechnung_payments")
    String rechnungPayments;

    /**
     * The status of the RevolutPay capability of the account, or whether the account can directly
     * process RevolutPay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("revolut_pay_payments")
    String revolutPayPayments;

    /**
     * The status of the SamsungPay capability of the account, or whether the account can directly
     * process SamsungPay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("samsung_pay_payments")
    String samsungPayPayments;

    /**
     * The status of the Satispay capability of the account, or whether the account can directly
     * process Satispay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("satispay_payments")
    String satispayPayments;

    /**
     * The status of the SEPA customer_balance payments (EUR currency) capability of the account, or
     * whether the account can directly process SEPA customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("sepa_bank_transfer_payments")
    String sepaBankTransferPayments;

    /**
     * The status of the SEPA Direct Debits payments capability of the account, or whether the
     * account can directly process SEPA Direct Debits charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("sepa_debit_payments")
    String sepaDebitPayments;

    /**
     * The status of the ShopeePay capability of the account, or whether the account can directly
     * process ShopeePay payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("shopeepay_payments")
    String shopeepayPayments;

    /**
     * The status of the Sofort payments capability of the account, or whether the account can
     * directly process Sofort charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("sofort_payments")
    String sofortPayments;

    /**
     * The status of the stripe_balance payments capability of the account, or whether the account
     * can directly process stripe_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("stripe_balance_payments")
    String stripeBalancePayments;

    /**
     * The status of the Swish capability of the account, or whether the account can directly
     * process Swish payments.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("swish_payments")
    String swishPayments;

    /**
     * The status of the tax reporting 1099-K (US) capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("tax_reporting_us_1099_k")
    String taxReportingUs1099K;

    /**
     * The status of the tax reporting 1099-MISC (US) capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("tax_reporting_us_1099_misc")
    String taxReportingUs1099Misc;

    /**
     * The status of the transfers capability of the account, or whether your platform can transfer
     * funds to the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("transfers")
    String transfers;

    /**
     * The status of the banking capability, or whether the account can have bank accounts.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("treasury")
    String treasury;

    /**
     * The status of the treasury_evolve capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("treasury_evolve")
    String treasuryEvolve;

    /**
     * The status of the treasury_fifth_third capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("treasury_fifth_third")
    String treasuryFifthThird;

    /**
     * The status of the treasury_goldman_sachs capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("treasury_goldman_sachs")
    String treasuryGoldmanSachs;

    /**
     * The status of the TWINT capability of the account, or whether the account can directly
     * process TWINT charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("twint_payments")
    String twintPayments;

    /**
     * The status of the US bank account ACH payments capability of the account, or whether the
     * account can directly process US bank account charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("us_bank_account_ach_payments")
    String usBankAccountAchPayments;

    /**
     * The status of the US customer_balance payments (USD currency) capability of the account, or
     * whether the account can directly process US customer_balance charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("us_bank_transfer_payments")
    String usBankTransferPayments;

    /**
     * The status of the Zip capability of the account, or whether the account can directly process
     * Zip charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("zip_payments")
    String zipPayments;
  }

  /**
   * For more details about Company, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Company extends StripeObject {
    @SerializedName("address")
    Address address;

    /** The Kana variation of the company's primary address (Japan only). */
    @SerializedName("address_kana")
    AddressKana addressKana;

    /** The Kanji variation of the company's primary address (Japan only). */
    @SerializedName("address_kanji")
    AddressKanji addressKanji;

    /**
     * Whether the company's directors have been provided. This Boolean will be {@code true} if
     * you've manually indicated that all directors are provided via <a
     * href="https://stripe.com/docs/api/accounts/update#update_account-company-directors_provided">the
     * {@code directors_provided} parameter</a>.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * This hash is used to attest that the director information provided to Stripe is both current
     * and correct.
     */
    @SerializedName("directorship_declaration")
    DirectorshipDeclaration directorshipDeclaration;

    /**
     * Whether the company's executives have been provided. This Boolean will be {@code true} if
     * you've manually indicated that all executives are provided via <a
     * href="https://stripe.com/docs/api/accounts/update#update_account-company-executives_provided">the
     * {@code executives_provided} parameter</a>, or if Stripe determined that sufficient executives
     * were provided.
     */
    @SerializedName("executives_provided")
    Boolean executivesProvided;

    /**
     * The export license ID number of the company, also referred as Import Export Code (India
     * only).
     */
    @SerializedName("export_license_id")
    String exportLicenseId;

    /** The purpose code to use for export transactions (India only). */
    @SerializedName("export_purpose_code")
    String exportPurposeCode;

    /**
     * The company's legal name. Also available for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code stripe}.
     */
    @SerializedName("name")
    String name;

    /**
     * The Kana variation of the company's legal name (Japan only). Also available for accounts
     * where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code stripe}.
     */
    @SerializedName("name_kana")
    String nameKana;

    /**
     * The Kanji variation of the company's legal name (Japan only). Also available for accounts
     * where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code stripe}.
     */
    @SerializedName("name_kanji")
    String nameKanji;

    /**
     * Whether the company's owners have been provided. This Boolean will be {@code true} if you've
     * manually indicated that all owners are provided via <a
     * href="https://stripe.com/docs/api/accounts/update#update_account-company-owners_provided">the
     * {@code owners_provided} parameter</a>, or if Stripe determined that sufficient owners were
     * provided. Stripe determines ownership requirements using both the number of owners provided
     * and their total percent ownership (calculated by adding the {@code percent_ownership} of each
     * owner together).
     */
    @SerializedName("owners_provided")
    Boolean ownersProvided;

    /**
     * This hash is used to attest that the beneficial owner information provided to Stripe is both
     * current and correct.
     */
    @SerializedName("ownership_declaration")
    OwnershipDeclaration ownershipDeclaration;

    /**
     * This value is used to determine if a business is exempt from providing ultimate beneficial
     * owners. See <a
     * href="https://support.stripe.com/questions/exemption-from-providing-ownership-details">this
     * support article</a> and <a
     * href="https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api">changelog</a>
     * for more details.
     *
     * <p>One of {@code qualified_entity_exceeds_ownership_threshold}, or {@code
     * qualifies_as_financial_institution}.
     */
    @SerializedName("ownership_exemption_reason")
    String ownershipExemptionReason;

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    String phone;

    @SerializedName("registration_date")
    RegistrationDate registrationDate;

    /**
     * The category identifying the legal structure of the company or legal entity. Also available
     * for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code stripe}. See <a
     * href="https://stripe.com/docs/connect/identity-verification#business-structure">Business
     * structure</a> for more details.
     *
     * <p>One of {@code free_zone_establishment}, {@code free_zone_llc}, {@code
     * government_instrumentality}, {@code governmental_unit}, {@code incorporated_non_profit},
     * {@code incorporated_partnership}, {@code limited_liability_partnership}, {@code llc}, {@code
     * multi_member_llc}, {@code private_company}, {@code private_corporation}, {@code
     * private_partnership}, {@code public_company}, {@code public_corporation}, {@code
     * public_partnership}, {@code registered_charity}, {@code single_member_llc}, {@code
     * sole_establishment}, {@code sole_proprietorship}, {@code
     * tax_exempt_government_instrumentality}, {@code unincorporated_association}, {@code
     * unincorporated_non_profit}, or {@code unincorporated_partnership}.
     */
    @SerializedName("structure")
    String structure;

    /** Whether the company's business ID number was provided. */
    @SerializedName("tax_id_provided")
    Boolean taxIdProvided;

    /**
     * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies only).
     */
    @SerializedName("tax_id_registrar")
    String taxIdRegistrar;

    /** Whether the company's business VAT number was provided. */
    @SerializedName("vat_id_provided")
    Boolean vatIdProvided;

    /** Information on the verification state of the company. */
    @SerializedName("verification")
    Verification verification;

    /**
     * For more details about AddressKana, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKana extends StripeObject {
      /** City/Ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Block/Building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town/cho-me. */
      @SerializedName("town")
      String town;
    }

    /**
     * For more details about AddressKanji, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKanji extends StripeObject {
      /** City/Ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Block/Building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town/cho-me. */
      @SerializedName("town")
      String town;
    }

    /**
     * For more details about DirectorshipDeclaration, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DirectorshipDeclaration extends StripeObject {
      /** The Unix timestamp marking when the directorship declaration attestation was made. */
      @SerializedName("date")
      Long date;

      /** The IP address from which the directorship declaration attestation was made. */
      @SerializedName("ip")
      String ip;

      /**
       * The user-agent string from the browser where the directorship declaration attestation was
       * made.
       */
      @SerializedName("user_agent")
      String userAgent;
    }

    /**
     * For more details about OwnershipDeclaration, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OwnershipDeclaration extends StripeObject {
      /** The Unix timestamp marking when the beneficial owner attestation was made. */
      @SerializedName("date")
      Long date;

      /** The IP address from which the beneficial owner attestation was made. */
      @SerializedName("ip")
      String ip;

      /** The user-agent string from the browser where the beneficial owner attestation was made. */
      @SerializedName("user_agent")
      String userAgent;
    }

    /**
     * For more details about RegistrationDate, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RegistrationDate extends StripeObject {
      /** The day of registration, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** The month of registration, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year of registration. */
      @SerializedName("year")
      Long year;
    }

    /**
     * For more details about Verification, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Verification extends StripeObject {
      @SerializedName("document")
      Document document;

      /**
       * For more details about Document, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Document extends StripeObject {
        /**
         * The back of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}. Note that {@code additional_verification} files
         * are <a href="https://stripe.com/file-upload#uploading-a-file">not downloadable</a>.
         */
        @SerializedName("back")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> back;

        /** A user-displayable string describing the verification state of this document. */
        @SerializedName("details")
        String details;

        /**
         * One of {@code document_corrupt}, {@code document_expired}, {@code document_failed_copy},
         * {@code document_failed_greyscale}, {@code document_failed_other}, {@code
         * document_failed_test_mode}, {@code document_fraudulent}, {@code document_incomplete},
         * {@code document_invalid}, {@code document_manipulated}, {@code document_not_readable},
         * {@code document_not_uploaded}, {@code document_type_not_supported}, or {@code
         * document_too_large}. A machine-readable code specifying the verification state for this
         * document.
         */
        @SerializedName("details_code")
        String detailsCode;

        /**
         * The front of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}. Note that {@code additional_verification} files
         * are <a href="https://stripe.com/file-upload#uploading-a-file">not downloadable</a>.
         */
        @SerializedName("front")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> front;

        /** Get ID of expandable {@code back} object. */
        public String getBack() {
          return (this.back != null) ? this.back.getId() : null;
        }

        public void setBack(String id) {
          this.back = ApiResource.setExpandableFieldId(id, this.back);
        }

        /** Get expanded {@code back}. */
        public File getBackObject() {
          return (this.back != null) ? this.back.getExpanded() : null;
        }

        public void setBackObject(File expandableObject) {
          this.back = new ExpandableField<File>(expandableObject.getId(), expandableObject);
        }

        /** Get ID of expandable {@code front} object. */
        public String getFront() {
          return (this.front != null) ? this.front.getId() : null;
        }

        public void setFront(String id) {
          this.front = ApiResource.setExpandableFieldId(id, this.front);
        }

        /** Get expanded {@code front}. */
        public File getFrontObject() {
          return (this.front != null) ? this.front.getExpanded() : null;
        }

        public void setFrontObject(File expandableObject) {
          this.front = new ExpandableField<File>(expandableObject.getId(), expandableObject);
        }
      }
    }
  }

  /**
   * For more details about Controller, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Controller extends StripeObject {
    @SerializedName("application")
    Application application;

    @SerializedName("dashboard")
    Dashboard dashboard;

    @SerializedName("fees")
    Fees fees;

    /**
     * {@code true} if the Connect application retrieving the resource controls the account and can
     * therefore exercise <a
     * href="https://stripe.com/docs/connect/platform-controls-for-standard-accounts">platform
     * controls</a>. Otherwise, this field is null.
     */
    @SerializedName("is_controller")
    Boolean isController;

    @SerializedName("losses")
    Losses losses;

    /**
     * A value indicating responsibility for collecting requirements on this account. Only returned
     * when the Connect application retrieving the resource controls the account.
     *
     * <p>One of {@code application}, or {@code stripe}.
     */
    @SerializedName("requirement_collection")
    String requirementCollection;

    @SerializedName("stripe_dashboard")
    StripeDashboard stripeDashboard;

    /**
     * The controller type. Can be {@code application}, if a Connect application controls the
     * account, or {@code account}, if the account controls itself.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Application, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Application extends StripeObject {
      /**
       * {@code true} if the Connect application is responsible for negative balances and should
       * manage credit and fraud risk on the account.
       */
      @SerializedName("loss_liable")
      Boolean lossLiable;

      /** {@code true} if the Connect application is responsible for onboarding the account. */
      @SerializedName("onboarding_owner")
      Boolean onboardingOwner;

      /**
       * {@code true} if the Connect application is responsible for paying Stripe fees on
       * pricing-control eligible products.
       */
      @SerializedName("pricing_controls")
      Boolean pricingControls;
    }

    /**
     * For more details about Dashboard, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dashboard extends StripeObject {
      /**
       * Whether this account has access to the full Stripe dashboard ({@code full}), to the Express
       * dashboard ({@code express}), or to no dashboard ({@code none}).
       *
       * <p>One of {@code express}, {@code full}, or {@code none}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Fees, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fees extends StripeObject {
      /**
       * A value indicating the responsible payer of a bundle of Stripe fees for pricing-control
       * eligible products on this account. Learn more about <a
       * href="https://docs.stripe.com/connect/direct-charges-fee-payer-behavior">fee behavior on
       * connected accounts</a>.
       *
       * <p>One of {@code account}, {@code application}, {@code application_custom}, {@code
       * application_express}, or {@code application_unified_accounts_beta}.
       */
      @SerializedName("payer")
      String payer;
    }

    /**
     * For more details about Losses, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Losses extends StripeObject {
      /**
       * A value indicating who is liable when this account can't pay back negative balances from
       * payments.
       *
       * <p>One of {@code application}, or {@code stripe}.
       */
      @SerializedName("payments")
      String payments;
    }

    /**
     * For more details about StripeDashboard, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeDashboard extends StripeObject {
      /**
       * A value indicating the Stripe dashboard this account has access to independent of the
       * Connect application.
       *
       * <p>One of {@code express}, {@code full}, or {@code none}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about FutureRequirements, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureRequirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Account.FutureRequirements.Alternative> alternatives;

    /**
     * Date on which {@code future_requirements} becomes the main {@code requirements} hash and
     * {@code future_requirements} becomes empty. After the transition, {@code currently_due}
     * requirements may immediately become {@code past_due}, but the account may also be given a
     * grace period depending on its enablement state prior to transitioning.
     */
    @SerializedName("current_deadline")
    Long currentDeadline;

    /**
     * Fields that need to be collected to keep the account enabled. If not collected by {@code
     * future_requirements[current_deadline]}, these fields will transition to the main {@code
     * requirements} hash.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * This is typed as an enum for consistency with {@code requirements.disabled_reason}.
     *
     * <p>One of {@code action_required.requested_capabilities}, {@code listed}, {@code other},
     * {@code platform_paused}, {@code rejected.fraud}, {@code rejected.incomplete_verification},
     * {@code rejected.listed}, {@code rejected.other}, {@code rejected.platform_fraud}, {@code
     * rejected.platform_other}, {@code rejected.platform_terms_of_service}, {@code
     * rejected.terms_of_service}, {@code requirements.past_due}, {@code
     * requirements.pending_verification}, or {@code under_review}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Account.FutureRequirements.Errors> errors;

    /**
     * Fields you must collect when all thresholds are reached. As they become required, they appear
     * in {@code currently_due} as well.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by {@code requirements.current_deadline}. These fields need to
     * be collected to enable the capability on the account. New fields will never appear here;
     * {@code future_requirements.past_due} will always be a subset of {@code
     * requirements.past_due}.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that might become required depending on the results of verification or review. It's an
     * empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due} or {@code currently_due}. Fields might appear in {@code
     * eventually_due} or {@code currently_due} and in {@code pending_verification} if verification
     * fails but another verification is still pending.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    /**
     * For more details about Alternative, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }

    /**
     * For more details about Errors, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code external_request}, {@code information_missing}, {@code
       * invalid_address_city_state_postal_code}, {@code invalid_address_highway_contract_box},
       * {@code invalid_address_private_mailbox}, {@code invalid_business_profile_name}, {@code
       * invalid_business_profile_name_denylisted}, {@code invalid_company_name_denylisted}, {@code
       * invalid_dob_age_over_maximum}, {@code invalid_dob_age_under_18}, {@code
       * invalid_dob_age_under_minimum}, {@code invalid_product_description_length}, {@code
       * invalid_product_description_url_match}, {@code invalid_representative_country}, {@code
       * invalid_signator}, {@code invalid_statement_descriptor_business_mismatch}, {@code
       * invalid_statement_descriptor_denylisted}, {@code invalid_statement_descriptor_length},
       * {@code invalid_statement_descriptor_prefix_denylisted}, {@code
       * invalid_statement_descriptor_prefix_mismatch}, {@code invalid_street_address}, {@code
       * invalid_tax_id}, {@code invalid_tax_id_format}, {@code invalid_tos_acceptance}, {@code
       * invalid_url_denylisted}, {@code invalid_url_format}, {@code invalid_url_length}, {@code
       * invalid_url_web_presence_detected}, {@code
       * invalid_url_website_business_information_mismatch}, {@code invalid_url_website_empty},
       * {@code invalid_url_website_inaccessible}, {@code
       * invalid_url_website_inaccessible_geoblocked}, {@code
       * invalid_url_website_inaccessible_password_protected}, {@code
       * invalid_url_website_incomplete}, {@code
       * invalid_url_website_incomplete_cancellation_policy}, {@code
       * invalid_url_website_incomplete_customer_service_details}, {@code
       * invalid_url_website_incomplete_legal_restrictions}, {@code
       * invalid_url_website_incomplete_refund_policy}, {@code
       * invalid_url_website_incomplete_return_policy}, {@code
       * invalid_url_website_incomplete_terms_and_conditions}, {@code
       * invalid_url_website_incomplete_under_construction}, {@code invalid_url_website_other},
       * {@code invalid_value_other}, {@code unsupported_business_type}, {@code
       * verification_directors_mismatch}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code
       * verification_document_directors_mismatch}, {@code verification_document_dob_mismatch},
       * {@code verification_document_duplicate_type}, {@code verification_document_expired}, {@code
       * verification_document_failed_copy}, {@code verification_document_failed_greyscale}, {@code
       * verification_document_failed_other}, {@code verification_document_failed_test_mode}, {@code
       * verification_document_fraudulent}, {@code verification_document_id_number_mismatch}, {@code
       * verification_document_id_number_missing}, {@code verification_document_incomplete}, {@code
       * verification_document_invalid}, {@code verification_document_issue_or_expiry_date_missing},
       * {@code verification_document_manipulated}, {@code verification_document_missing_back},
       * {@code verification_document_missing_front}, {@code verification_document_name_mismatch},
       * {@code verification_document_name_missing}, {@code
       * verification_document_nationality_mismatch}, {@code verification_document_not_readable},
       * {@code verification_document_not_signed}, {@code verification_document_not_uploaded},
       * {@code verification_document_photo_mismatch}, {@code verification_document_too_large},
       * {@code verification_document_type_not_supported}, {@code
       * verification_extraneous_directors}, {@code verification_failed_address_match}, {@code
       * verification_failed_authorizer_authority}, {@code verification_failed_business_iec_number},
       * {@code verification_failed_document_match}, {@code verification_failed_id_number_match},
       * {@code verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_representative_authority}, {@code
       * verification_failed_residential_address}, {@code verification_failed_tax_id_match}, {@code
       * verification_failed_tax_id_not_issued}, {@code
       * verification_legal_entity_structure_mismatch}, {@code verification_missing_directors},
       * {@code verification_missing_executives}, {@code verification_missing_owners}, {@code
       * verification_rejected_ownership_exemption_reason}, {@code
       * verification_requires_additional_memorandum_of_associations}, {@code
       * verification_requires_additional_proof_of_registration}, or {@code
       * verification_supportability}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  /**
   * For more details about Groups, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Groups extends StripeObject {
    /**
     * The group the account is in to determine their payments pricing, and null if the account is
     * on customized pricing. <a href="https://stripe.com/docs/connect/platform-pricing-tools">See
     * the Platform pricing tool documentation</a> for details.
     */
    @SerializedName("payments_pricing")
    String paymentsPricing;
  }

  /**
   * For more details about Requirements, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Account.Requirements.Alternative> alternatives;

    /**
     * Date by which the fields in {@code currently_due} must be collected to keep the account
     * enabled. These fields may disable the account sooner if the next threshold is reached before
     * they are collected.
     */
    @SerializedName("current_deadline")
    Long currentDeadline;

    /**
     * Fields that need to be collected to keep the account enabled. If not collected by {@code
     * current_deadline}, these fields appear in {@code past_due} as well, and the account is
     * disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * If the account is disabled, this enum describes why. <a
     * href="https://stripe.com/docs/connect/handling-api-verification">Learn more about handling
     * verification issues</a>.
     *
     * <p>One of {@code action_required.requested_capabilities}, {@code listed}, {@code other},
     * {@code platform_paused}, {@code rejected.fraud}, {@code rejected.incomplete_verification},
     * {@code rejected.listed}, {@code rejected.other}, {@code rejected.platform_fraud}, {@code
     * rejected.platform_other}, {@code rejected.platform_terms_of_service}, {@code
     * rejected.terms_of_service}, {@code requirements.past_due}, {@code
     * requirements.pending_verification}, or {@code under_review}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Account.Requirements.Errors> errors;

    /**
     * Fields you must collect when all thresholds are reached. As they become required, they appear
     * in {@code currently_due} as well, and {@code current_deadline} becomes set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by {@code current_deadline}. These fields need to be collected
     * to enable the account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that might become required depending on the results of verification or review. It's an
     * empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}. Fields
     * might appear in {@code eventually_due}, {@code currently_due}, or {@code past_due} and in
     * {@code pending_verification} if verification fails but another verification is still pending.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    /**
     * For more details about Alternative, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }

    /**
     * For more details about Errors, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code external_request}, {@code information_missing}, {@code
       * invalid_address_city_state_postal_code}, {@code invalid_address_highway_contract_box},
       * {@code invalid_address_private_mailbox}, {@code invalid_business_profile_name}, {@code
       * invalid_business_profile_name_denylisted}, {@code invalid_company_name_denylisted}, {@code
       * invalid_dob_age_over_maximum}, {@code invalid_dob_age_under_18}, {@code
       * invalid_dob_age_under_minimum}, {@code invalid_product_description_length}, {@code
       * invalid_product_description_url_match}, {@code invalid_representative_country}, {@code
       * invalid_signator}, {@code invalid_statement_descriptor_business_mismatch}, {@code
       * invalid_statement_descriptor_denylisted}, {@code invalid_statement_descriptor_length},
       * {@code invalid_statement_descriptor_prefix_denylisted}, {@code
       * invalid_statement_descriptor_prefix_mismatch}, {@code invalid_street_address}, {@code
       * invalid_tax_id}, {@code invalid_tax_id_format}, {@code invalid_tos_acceptance}, {@code
       * invalid_url_denylisted}, {@code invalid_url_format}, {@code invalid_url_length}, {@code
       * invalid_url_web_presence_detected}, {@code
       * invalid_url_website_business_information_mismatch}, {@code invalid_url_website_empty},
       * {@code invalid_url_website_inaccessible}, {@code
       * invalid_url_website_inaccessible_geoblocked}, {@code
       * invalid_url_website_inaccessible_password_protected}, {@code
       * invalid_url_website_incomplete}, {@code
       * invalid_url_website_incomplete_cancellation_policy}, {@code
       * invalid_url_website_incomplete_customer_service_details}, {@code
       * invalid_url_website_incomplete_legal_restrictions}, {@code
       * invalid_url_website_incomplete_refund_policy}, {@code
       * invalid_url_website_incomplete_return_policy}, {@code
       * invalid_url_website_incomplete_terms_and_conditions}, {@code
       * invalid_url_website_incomplete_under_construction}, {@code invalid_url_website_other},
       * {@code invalid_value_other}, {@code unsupported_business_type}, {@code
       * verification_directors_mismatch}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code
       * verification_document_directors_mismatch}, {@code verification_document_dob_mismatch},
       * {@code verification_document_duplicate_type}, {@code verification_document_expired}, {@code
       * verification_document_failed_copy}, {@code verification_document_failed_greyscale}, {@code
       * verification_document_failed_other}, {@code verification_document_failed_test_mode}, {@code
       * verification_document_fraudulent}, {@code verification_document_id_number_mismatch}, {@code
       * verification_document_id_number_missing}, {@code verification_document_incomplete}, {@code
       * verification_document_invalid}, {@code verification_document_issue_or_expiry_date_missing},
       * {@code verification_document_manipulated}, {@code verification_document_missing_back},
       * {@code verification_document_missing_front}, {@code verification_document_name_mismatch},
       * {@code verification_document_name_missing}, {@code
       * verification_document_nationality_mismatch}, {@code verification_document_not_readable},
       * {@code verification_document_not_signed}, {@code verification_document_not_uploaded},
       * {@code verification_document_photo_mismatch}, {@code verification_document_too_large},
       * {@code verification_document_type_not_supported}, {@code
       * verification_extraneous_directors}, {@code verification_failed_address_match}, {@code
       * verification_failed_authorizer_authority}, {@code verification_failed_business_iec_number},
       * {@code verification_failed_document_match}, {@code verification_failed_id_number_match},
       * {@code verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_representative_authority}, {@code
       * verification_failed_residential_address}, {@code verification_failed_tax_id_match}, {@code
       * verification_failed_tax_id_not_issued}, {@code
       * verification_legal_entity_structure_mismatch}, {@code verification_missing_directors},
       * {@code verification_missing_executives}, {@code verification_missing_owners}, {@code
       * verification_rejected_ownership_exemption_reason}, {@code
       * verification_requires_additional_memorandum_of_associations}, {@code
       * verification_requires_additional_proof_of_registration}, or {@code
       * verification_supportability}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  /**
   * For more details about RiskControls, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskControls extends StripeObject {
    @SerializedName("charges")
    Charges charges;

    @SerializedName("payouts")
    Payouts payouts;

    /**
     * Represents the rejected reason of the account. Empty if account is not rejected, or rejected
     * by Stripe. Please see <a href="https://stripe.com/docs/connect/">this page for more
     * details</a>
     *
     * <p>One of {@code credit}, {@code fraud}, {@code fraud_no_intent_to_fulfill}, {@code
     * fraud_other}, {@code fraud_payment_method_casher}, {@code fraud_payment_method_tester},
     * {@code other}, or {@code terms_of_service}.
     */
    @SerializedName("rejected_reason")
    String rejectedReason;

    /**
     * For more details about Charges, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Charges extends StripeObject {
      /** Whether a pause of the risk control has been requested. */
      @SerializedName("pause_requested")
      Boolean pauseRequested;
    }

    /**
     * For more details about Payouts, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts extends StripeObject {
      /** Whether a pause of the risk control has been requested. */
      @SerializedName("pause_requested")
      Boolean pauseRequested;
    }
  }

  /**
   * For more details about Settings, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

    @SerializedName("bank_bca_onboarding")
    BankBcaOnboarding bankBcaOnboarding;

    @SerializedName("branding")
    Branding branding;

    @SerializedName("capital")
    Capital capital;

    @SerializedName("card_issuing")
    CardIssuing cardIssuing;

    @SerializedName("card_payments")
    CardPayments cardPayments;

    @SerializedName("dashboard")
    Dashboard dashboard;

    @SerializedName("invoices")
    Invoices invoices;

    @SerializedName("payments")
    Payments payments;

    @SerializedName("payouts")
    Payouts payouts;

    @SerializedName("sepa_debit_payments")
    SepaDebitPayments sepaDebitPayments;

    @SerializedName("tax_forms")
    TaxForms taxForms;

    @SerializedName("treasury")
    Treasury treasury;

    /**
     * For more details about BacsDebitPayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebitPayments extends StripeObject {
      /**
       * The Bacs Direct Debit display name for this account. For payments made with Bacs Direct
       * Debit, this name appears on the mandate as the statement descriptor. Mobile banking apps
       * display it as the name of the business. To use custom branding, set the Bacs Direct Debit
       * Display Name during or right after creation. Custom branding incurs an additional monthly
       * fee for the platform. The fee appears 5 business days after requesting Bacs. If you don't
       * set the display name before requesting Bacs capability, it's automatically set as
       * &quot;Stripe&quot; and the account is onboarded to Stripe branding, which is free.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * The Bacs Direct Debit Service user number for this account. For payments made with Bacs
       * Direct Debit, this number is a unique identifier of the account with our banking partners.
       */
      @SerializedName("service_user_number")
      String serviceUserNumber;
    }

    /**
     * For more details about BankBcaOnboarding, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankBcaOnboarding extends StripeObject {
      /** Bank BCA business account holder name. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** Bank BCA business account number. */
      @SerializedName("business_account_number")
      String businessAccountNumber;
    }

    /**
     * For more details about Branding, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Branding extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) An icon for
       * the account. Must be square and at least 128px x 128px.
       */
      @SerializedName("icon")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> icon;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for
       * the account that will be used in Checkout instead of the icon and without the account's
       * name next to it if provided. Must be at least 128px x 128px.
       */
      @SerializedName("logo")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> logo;

      /** A CSS hex color value representing the primary branding color for this account. */
      @SerializedName("primary_color")
      String primaryColor;

      /** A CSS hex color value representing the secondary branding color for this account. */
      @SerializedName("secondary_color")
      String secondaryColor;

      /** Get ID of expandable {@code icon} object. */
      public String getIcon() {
        return (this.icon != null) ? this.icon.getId() : null;
      }

      public void setIcon(String id) {
        this.icon = ApiResource.setExpandableFieldId(id, this.icon);
      }

      /** Get expanded {@code icon}. */
      public File getIconObject() {
        return (this.icon != null) ? this.icon.getExpanded() : null;
      }

      public void setIconObject(File expandableObject) {
        this.icon = new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code logo} object. */
      public String getLogo() {
        return (this.logo != null) ? this.logo.getId() : null;
      }

      public void setLogo(String id) {
        this.logo = ApiResource.setExpandableFieldId(id, this.logo);
      }

      /** Get expanded {@code logo}. */
      public File getLogoObject() {
        return (this.logo != null) ? this.logo.getExpanded() : null;
      }

      public void setLogoObject(File expandableObject) {
        this.logo = new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Capital, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Capital extends StripeObject {
      /** Per-currency mapping of user-selected destination accounts used to pay out loans. */
      @SerializedName("payout_destination")
      Map<String, String> payoutDestination;

      /** Per-currency mapping of all destination accounts eligible to receive loan payouts. */
      @SerializedName("payout_destination_selector")
      Map<String, List<String>> payoutDestinationSelector;
    }

    /**
     * For more details about CardIssuing, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuing extends StripeObject {
      @SerializedName("tos_acceptance")
      TosAcceptance tosAcceptance;

      /**
       * For more details about TosAcceptance, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TosAcceptance extends StripeObject {
        /**
         * The Unix timestamp marking when the account representative accepted the service
         * agreement.
         */
        @SerializedName("date")
        Long date;

        /** The IP address from which the account representative accepted the service agreement. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        String userAgent;
      }
    }

    /**
     * For more details about CardPayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPayments extends StripeObject {
      @SerializedName("decline_on")
      DeclineOn declineOn;

      /**
       * The default text that appears on credit card statements when a charge is made. This field
       * prefixes any dynamic {@code statement_descriptor} specified on the charge. {@code
       * statement_descriptor_prefix} is useful for maximizing descriptor space for the dynamic
       * portion.
       */
      @SerializedName("statement_descriptor_prefix")
      String statementDescriptorPrefix;

      /**
       * The Kana variation of the default text that appears on credit card statements when a charge
       * is made (Japan only). This field prefixes any dynamic {@code
       * statement_descriptor_suffix_kana} specified on the charge. {@code
       * statement_descriptor_prefix_kana} is useful for maximizing descriptor space for the dynamic
       * portion.
       */
      @SerializedName("statement_descriptor_prefix_kana")
      String statementDescriptorPrefixKana;

      /**
       * The Kanji variation of the default text that appears on credit card statements when a
       * charge is made (Japan only). This field prefixes any dynamic {@code
       * statement_descriptor_suffix_kanji} specified on the charge. {@code
       * statement_descriptor_prefix_kanji} is useful for maximizing descriptor space for the
       * dynamic portion.
       */
      @SerializedName("statement_descriptor_prefix_kanji")
      String statementDescriptorPrefixKanji;

      /**
       * For more details about DeclineOn, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DeclineOn extends StripeObject {
        /**
         * Whether Stripe automatically declines charges with an incorrect ZIP or postal code. This
         * setting only applies when a ZIP or postal code is provided and they fail bank
         * verification.
         */
        @SerializedName("avs_failure")
        Boolean avsFailure;

        /**
         * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
         * applies when a CVC is provided and it fails bank verification.
         */
        @SerializedName("cvc_failure")
        Boolean cvcFailure;
      }
    }

    /**
     * For more details about Dashboard, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dashboard extends StripeObject {
      /**
       * The display name for this account. This is used on the Stripe Dashboard to differentiate
       * between accounts.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * The timezone used in the Stripe Dashboard for this account. A list of possible time zone
       * values is maintained at the <a href="http://www.iana.org/time-zones">IANA Time Zone
       * Database</a>.
       */
      @SerializedName("timezone")
      String timezone;
    }

    /**
     * For more details about Invoices, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Invoices extends StripeObject {
      /**
       * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs
       * get added when an invoice is finalized.
       */
      @SerializedName("default_account_tax_ids")
      List<ExpandableField<TaxId>> defaultAccountTaxIds;

      /**
       * Whether payment methods should be saved when a payment is completed for a one-time invoices
       * on a hosted invoice page.
       *
       * <p>One of {@code always}, {@code never}, or {@code offer}.
       */
      @SerializedName("hosted_payment_method_save")
      String hostedPaymentMethodSave;

      /** Get IDs of expandable {@code defaultAccountTaxIds} object list. */
      public List<String> getDefaultAccountTaxIds() {
        return (this.defaultAccountTaxIds != null)
            ? this.defaultAccountTaxIds.stream().map(x -> x.getId()).collect(Collectors.toList())
            : null;
      }

      public void setDefaultAccountTaxIds(List<String> ids) {
        if (ids == null) {
          this.defaultAccountTaxIds = null;
          return;
        }
        if (this.defaultAccountTaxIds != null
            && this.defaultAccountTaxIds.stream()
                .map(x -> x.getId())
                .collect(Collectors.toList())
                .equals(ids)) {
          // noop if the ids are equal to what are already present
          return;
        }
        this.defaultAccountTaxIds =
            (ids != null)
                ? ids.stream()
                    .map(id -> new ExpandableField<TaxId>(id, null))
                    .collect(Collectors.toList())
                : null;
      }

      /** Get expanded {@code defaultAccountTaxIds}. */
      public List<TaxId> getDefaultAccountTaxIdObjects() {
        return (this.defaultAccountTaxIds != null)
            ? this.defaultAccountTaxIds.stream()
                .map(x -> x.getExpanded())
                .collect(Collectors.toList())
            : null;
      }

      public void setDefaultAccountTaxIdObjects(List<TaxId> objs) {
        this.defaultAccountTaxIds =
            objs != null
                ? objs.stream()
                    .map(x -> new ExpandableField<TaxId>(x.getId(), x))
                    .collect(Collectors.toList())
                : null;
      }
    }

    /**
     * For more details about Payments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments extends StripeObject {
      /**
       * The default text that appears on credit card statements when a charge is made. This field
       * prefixes any dynamic {@code statement_descriptor} specified on the charge.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      /**
       * The Kana variation of {@code statement_descriptor} used for charges in Japan. Japanese
       * statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_kana")
      String statementDescriptorKana;

      /**
       * The Kanji variation of {@code statement_descriptor} used for charges in Japan. Japanese
       * statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_kanji")
      String statementDescriptorKanji;

      /**
       * The Kana variation of {@code statement_descriptor_prefix} used for card charges in Japan.
       * Japanese statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_prefix_kana")
      String statementDescriptorPrefixKana;

      /**
       * The Kanji variation of {@code statement_descriptor_prefix} used for card charges in Japan.
       * Japanese statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_prefix_kanji")
      String statementDescriptorPrefixKanji;
    }

    /**
     * For more details about Payouts, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts extends StripeObject {
      /**
       * A Boolean indicating if Stripe should try to reclaim negative balances from an attached
       * bank account. See <a href="https://stripe.com/connect/account-balances">Understanding
       * Connect account balances</a> for details. The default value is {@code false} when <a
       * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
       * is {@code application}, which includes Custom accounts, otherwise {@code true}.
       */
      @SerializedName("debit_negative_balances")
      Boolean debitNegativeBalances;

      @SerializedName("schedule")
      Schedule schedule;

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      /**
       * For more details about Schedule, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Schedule extends StripeObject {
        /** The number of days charges for the account will be held before being paid out. */
        @SerializedName("delay_days")
        Long delayDays;

        /**
         * How frequently funds will be paid out. One of {@code manual} (payouts only created via
         * API call), {@code daily}, {@code weekly}, or {@code monthly}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The day of the month funds will be paid out. Only shown if {@code interval} is monthly.
         * Payouts scheduled between the 29th and 31st of the month are sent on the last day of
         * shorter months.
         */
        @SerializedName("monthly_anchor")
        Long monthlyAnchor;

        /**
         * The days of the month funds will be paid out. Only shown if {@code interval} is monthly.
         * Payouts scheduled between the 29th and 31st of the month are sent on the last day of
         * shorter months.
         */
        @SerializedName("monthly_payout_days")
        List<Long> monthlyPayoutDays;

        /**
         * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only
         * shown if {@code interval} is weekly.
         */
        @SerializedName("weekly_anchor")
        String weeklyAnchor;

        /**
         * The days of the week when available funds are paid out, specified as an array, for
         * example, [{@code monday}, {@code tuesday}]. Only shown if {@code interval} is weekly.
         */
        @SerializedName("weekly_payout_days")
        List<String> weeklyPayoutDays;
      }
    }

    /**
     * For more details about SepaDebitPayments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebitPayments extends StripeObject {
      /** SEPA creditor identifier that identifies the company making the payment. */
      @SerializedName("creditor_id")
      String creditorId;
    }

    /**
     * For more details about TaxForms, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxForms extends StripeObject {
      /** Whether the account opted out of receiving their tax forms by postal delivery. */
      @SerializedName("consented_to_paperless_delivery")
      Boolean consentedToPaperlessDelivery;
    }

    /**
     * For more details about Treasury, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Treasury extends StripeObject {
      @SerializedName("tos_acceptance")
      TosAcceptance tosAcceptance;

      /**
       * For more details about TosAcceptance, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TosAcceptance extends StripeObject {
        /**
         * The Unix timestamp marking when the account representative accepted the service
         * agreement.
         */
        @SerializedName("date")
        Long date;

        /** The IP address from which the account representative accepted the service agreement. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        String userAgent;
      }
    }
  }

  /**
   * For more details about TosAcceptance, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TosAcceptance extends StripeObject {
    /**
     * The Unix timestamp marking when the account representative accepted their service agreement.
     */
    @SerializedName("date")
    Long date;

    /** The IP address from which the account representative accepted their service agreement. */
    @SerializedName("ip")
    String ip;

    /** The user's service agreement type. */
    @SerializedName("service_agreement")
    String serviceAgreement;

    /**
     * The user agent of the browser from which the account representative accepted their service
     * agreement.
     */
    @SerializedName("user_agent")
    String userAgent;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(businessProfile, responseGetter);
    trySetResponseGetter(capabilities, responseGetter);
    trySetResponseGetter(company, responseGetter);
    trySetResponseGetter(controller, responseGetter);
    trySetResponseGetter(externalAccounts, responseGetter);
    trySetResponseGetter(futureRequirements, responseGetter);
    trySetResponseGetter(groups, responseGetter);
    trySetResponseGetter(individual, responseGetter);
    trySetResponseGetter(requirements, responseGetter);
    trySetResponseGetter(riskControls, responseGetter);
    trySetResponseGetter(settings, responseGetter);
    trySetResponseGetter(tosAcceptance, responseGetter);
  }
}
