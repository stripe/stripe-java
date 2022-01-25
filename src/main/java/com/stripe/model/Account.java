// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.AccountCapabilitiesParams;
import com.stripe.param.AccountCreateParams;
import com.stripe.param.AccountListParams;
import com.stripe.param.AccountPersonsParams;
import com.stripe.param.AccountRejectParams;
import com.stripe.param.AccountRetrieveParams;
import com.stripe.param.AccountUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  /** Whether the account can create live charges. */
  @SerializedName("charges_enabled")
  Boolean chargesEnabled;

  @SerializedName("company")
  Company company;

  @SerializedName("controller")
  Controller controller;

  /** The account's country. */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
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
   * Whether account details have been submitted. Standard accounts cannot receive payouts before
   * this is true.
   */
  @SerializedName("details_submitted")
  Boolean detailsSubmitted;

  /**
   * An email address associated with the account. You can treat this as metadata: it is not used
   * for authentication or messaging account holders.
   */
  @SerializedName("email")
  String email;

  /** External accounts (bank accounts and debit cards) currently attached to this account. */
  @SerializedName("external_accounts")
  ExternalAccountCollection externalAccounts;

  @SerializedName("future_requirements")
  FutureRequirements futureRequirements;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * This is an object representing a person associated with a Stripe account.
   *
   * <p>A platform cannot access a Standard or Express account's persons after the account starts
   * onboarding, such as after generating an account link for the account. See the <a
   * href="https://stripe.com/docs/connect/standard-accounts">Standard onboarding</a> or <a
   * href="https://stripe.com/docs/connect/express-accounts">Express onboarding documentation</a>
   * for information about platform pre-filling and account onboarding steps.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/connect/identity-verification-api#person-information">Handling
   * Identity Verification with the API</a>.
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

  /** Whether Stripe can send payouts to this account. */
  @SerializedName("payouts_enabled")
  Boolean payoutsEnabled;

  @SerializedName("requirements")
  Requirements requirements;

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  Settings settings;

  @SerializedName("tos_acceptance")
  TosAcceptance tosAcceptance;

  /** The Stripe account type. Can be {@code standard}, {@code express}, or {@code custom}. */
  @SerializedName("type")
  String type;

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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/account");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/account");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
  }

  /** Retrieves the details of an account. */
  public static Account retrieve(
      String account, AccountRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Account.class, options);
  }

  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are not supported
   * for Standard accounts.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  @Override
  public Account update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are not supported
   * for Standard accounts.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  @Override
  public Account update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are not supported
   * for Standard accounts.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(AccountUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are not supported
   * for Standard accounts.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(AccountUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.requestCollection(url, params, AccountCollection.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.requestCollection(url, params, AccountCollection.class, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   */
  public static Account create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   */
  public static Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   */
  public static Account create(AccountCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Account.class, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(Map<String, Object> params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(AccountRejectParams params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(AccountRejectParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, PersonCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, PersonCollection.class, options);
  }

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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, CapabilityCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/accounts/%s/capabilities", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, CapabilityCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessProfile extends StripeObject {
    /**
     * <a href="https://stripe.com/docs/connect/setting-mcc">The merchant category code for the
     * account</a>. MCCs are used to classify businesses based on the goods or services they
     * provide.
     */
    @SerializedName("mcc")
    String mcc;

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
  }

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
     * The status of the Afterpay Clearpay capability of the account, or whether the account can
     * directly process Afterpay Clearpay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("afterpay_clearpay_payments")
    String afterpayClearpayPayments;

    /**
     * The status of the BECS Direct Debit (AU) payments capability of the account, or whether the
     * account can directly process BECS Direct Debit (AU) charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("au_becs_debit_payments")
    String auBecsDebitPayments;

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
     * The status of the giropay payments capability of the account, or whether the account can
     * directly process giropay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("giropay_payments")
    String giropayPayments;

    /**
     * The status of the GrabPay payments capability of the account, or whether the account can
     * directly process GrabPay charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("grabpay_payments")
    String grabpayPayments;

    /**
     * The status of the iDEAL payments capability of the account, or whether the account can
     * directly process iDEAL charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("ideal_payments")
    String idealPayments;

    /**
     * The status of the JCB payments capability of the account, or whether the account (Japan only)
     * can directly process JCB credit card charges in JPY currency.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("jcb_payments")
    String jcbPayments;

    /**
     * The status of the Klarna payments capability of the account, or whether the account can
     * directly process Klarna charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("klarna_payments")
    String klarnaPayments;

    /**
     * The status of the legacy payments capability of the account.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("legacy_payments")
    String legacyPayments;

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
     * The status of the SEPA Direct Debits payments capability of the account, or whether the
     * account can directly process SEPA Direct Debits charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("sepa_debit_payments")
    String sepaDebitPayments;

    /**
     * The status of the Sofort payments capability of the account, or whether the account can
     * directly process Sofort charges.
     *
     * <p>One of {@code active}, {@code inactive}, or {@code pending}.
     */
    @SerializedName("sofort_payments")
    String sofortPayments;

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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Company extends StripeObject {
    @SerializedName("address")
    Address address;

    /** The Kana variation of the company's primary address (Japan only). */
    @SerializedName("address_kana")
    Person.JapanAddress addressKana;

    /** The Kanji variation of the company's primary address (Japan only). */
    @SerializedName("address_kanji")
    Person.JapanAddress addressKanji;

    /**
     * Whether the company's directors have been provided. This Boolean will be {@code true} if
     * you've manually indicated that all directors are provided via <a
     * href="https://stripe.com/docs/api/accounts/update#update_account-company-directors_provided">the
     * {@code directors_provided} parameter</a>.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * Whether the company's executives have been provided. This Boolean will be {@code true} if
     * you've manually indicated that all executives are provided via <a
     * href="https://stripe.com/docs/api/accounts/update#update_account-company-executives_provided">the
     * {@code executives_provided} parameter</a>, or if Stripe determined that sufficient executives
     * were provided.
     */
    @SerializedName("executives_provided")
    Boolean executivesProvided;

    /** The company's legal name. */
    @SerializedName("name")
    String name;

    /** The Kana variation of the company's legal name (Japan only). */
    @SerializedName("name_kana")
    String nameKana;

    /** The Kanji variation of the company's legal name (Japan only). */
    @SerializedName("name_kanji")
    String nameKanji;

    /**
     * This hash is used to attest that the beneficial owner information provided to Stripe is both
     * current and correct.
     */
    @SerializedName("ownership_declaration")
    OwnershipDeclaration ownershipDeclaration;

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

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    String phone;

    /**
     * The category identifying the legal structure of the company or legal entity. See <a
     * href="https://stripe.com/docs/connect/identity-verification#business-structure">Business
     * structure</a> for more details.
     *
     * <p>One of {@code free_zone_establishment}, {@code free_zone_llc}, {@code
     * government_instrumentality}, {@code governmental_unit}, {@code incorporated_non_profit},
     * {@code limited_liability_partnership}, {@code llc}, {@code multi_member_llc}, {@code
     * private_company}, {@code private_corporation}, {@code private_partnership}, {@code
     * public_company}, {@code public_corporation}, {@code public_partnership}, {@code
     * single_member_llc}, {@code sole_establishment}, {@code sole_proprietorship}, {@code
     * tax_exempt_government_instrumentality}, {@code unincorporated_association}, or {@code
     * unincorporated_non_profit}.
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Verification extends StripeObject {
      @SerializedName("document")
      VerificationDocument document;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class VerificationDocument extends StripeObject {
        /**
         * The back of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}.
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
         * value of {@code additional_verification}.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Controller extends StripeObject {
    /**
     * {@code true} if the Connect application retrieving the resource controls the account and can
     * therefore exercise <a
     * href="https://stripe.com/docs/connect/platform-controls-for-standard-accounts">platform
     * controls</a>. Otherwise, this field is null.
     */
    @SerializedName("is_controller")
    Boolean isController;

    /**
     * The controller type. Can be {@code application}, if a Connect application controls the
     * account, or {@code account}, if the account controls itself.
     */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeclineChargeOn extends StripeObject {
    /**
     * Whether Stripe automatically declines charges with an incorrect ZIP or postal code. This
     * setting only applies when a ZIP or postal code is provided and they fail bank verification.
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
     * Date on which {@code future_requirements} merges with the main {@code requirements} hash and
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
     * This is typed as a string for consistency with {@code requirements.disabled_reason}, but it
     * safe to assume {@code future_requirements.disabled_reason} is empty because fields in {@code
     * future_requirements} will never disable the account.
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
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well.
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
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due} or {@code currently_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code invalid_street_address},
       * {@code invalid_value_other}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code verification_document_dob_mismatch},
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
       * verification_failed_address_match}, {@code verification_failed_business_iec_number}, {@code
       * verification_failed_document_match}, {@code verification_failed_id_number_match}, {@code
       * verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_tax_id_match}, {@code verification_failed_tax_id_not_issued}, {@code
       * verification_missing_executives}, {@code verification_missing_owners}, or {@code
       * verification_requires_additional_memorandum_of_associations}.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PayoutSchedule extends StripeObject {
    /** The number of days charges for the account will be held before being paid out. */
    @SerializedName("delay_days")
    Long delayDays;

    /**
     * How frequently funds will be paid out. One of {@code manual} (payouts only created via API
     * call), {@code daily}, {@code weekly}, or {@code monthly}.
     */
    @SerializedName("interval")
    String interval;

    /**
     * The day of the month funds will be paid out. Only shown if {@code interval} is monthly.
     * Payouts scheduled between the 29th and 31st of the month are sent on the last day of shorter
     * months.
     */
    @SerializedName("monthly_anchor")
    Long monthlyAnchor;

    /**
     * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown
     * if {@code interval} is weekly.
     */
    @SerializedName("weekly_anchor")
    String weeklyAnchor;
  }

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
     * If the account is disabled, this string describes why. Can be {@code requirements.past_due},
     * {@code requirements.pending_verification}, {@code listed}, {@code platform_paused}, {@code
     * rejected.fraud}, {@code rejected.listed}, {@code rejected.terms_of_service}, {@code
     * rejected.other}, {@code under_review}, or {@code other}.
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
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well, and {@code current_deadline} becomes
     * set.
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
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code invalid_street_address},
       * {@code invalid_value_other}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code verification_document_dob_mismatch},
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
       * verification_failed_address_match}, {@code verification_failed_business_iec_number}, {@code
       * verification_failed_document_match}, {@code verification_failed_id_number_match}, {@code
       * verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_tax_id_match}, {@code verification_failed_tax_id_not_issued}, {@code
       * verification_missing_executives}, {@code verification_missing_owners}, or {@code
       * verification_requires_additional_memorandum_of_associations}.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

    @SerializedName("branding")
    SettingsBranding branding;

    @SerializedName("card_issuing")
    SettingsCardIssuing cardIssuing;

    @SerializedName("card_payments")
    SettingsCardPayments cardPayments;

    @SerializedName("dashboard")
    SettingsDashboard dashboard;

    @SerializedName("payments")
    SettingsPayments payments;

    @SerializedName("payouts")
    SettingsPayouts payouts;

    @SerializedName("sepa_debit_payments")
    SepaDebitPayments sepaDebitPayments;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebitPayments extends StripeObject {
      /**
       * The Bacs Direct Debit Display Name for this account. For payments made with Bacs Direct
       * Debit, this will appear on the mandate, and as the statement descriptor.
       */
      @SerializedName("display_name")
      String displayName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebitPayments extends StripeObject {
      /** SEPA creditor identifier that identifies the company making the payment. */
      @SerializedName("creditor_id")
      String creditorId;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SettingsCardIssuing extends StripeObject {
      @SerializedName("tos_acceptance")
      TosAcceptance tosAcceptance;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsBranding extends StripeObject {
    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) An icon for
     * the account. Must be square and at least 128px x 128px.
     */
    @SerializedName("icon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> icon;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for the
     * account that will be used in Checkout instead of the icon and without the account's name next
     * to it if provided. Must be at least 128px x 128px.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsCardPayments extends StripeObject {
    @SerializedName("decline_on")
    DeclineChargeOn declineOn;

    /**
     * The default text that appears on credit card statements when a charge is made. This field
     * prefixes any dynamic {@code statement_descriptor} specified on the charge. {@code
     * statement_descriptor_prefix} is useful for maximizing descriptor space for the dynamic
     * portion.
     */
    @SerializedName("statement_descriptor_prefix")
    String statementDescriptorPrefix;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsDashboard extends StripeObject {
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsPayments extends StripeObject {
    /**
     * The default text that appears on credit card statements when a charge is made. This field
     * prefixes any dynamic {@code statement_descriptor} specified on the charge.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * The Kana variation of the default text that appears on credit card statements when a charge
     * is made (Japan only).
     */
    @SerializedName("statement_descriptor_kana")
    String statementDescriptorKana;

    /**
     * The Kanji variation of the default text that appears on credit card statements when a charge
     * is made (Japan only).
     */
    @SerializedName("statement_descriptor_kanji")
    String statementDescriptorKanji;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsPayouts extends StripeObject {
    /**
     * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank
     * account. See our <a href="https://stripe.com/docs/connect/account-balances">Understanding
     * Connect Account Balances</a> documentation for details. Default value is {@code false} for
     * Custom accounts, otherwise {@code true}.
     */
    @SerializedName("debit_negative_balances")
    Boolean debitNegativeBalances;

    @SerializedName("schedule")
    PayoutSchedule schedule;

    /**
     * The text that appears on the bank account statement for payouts. If not set, this defaults to
     * the platform's bank descriptor as set in the Dashboard.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

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
}
