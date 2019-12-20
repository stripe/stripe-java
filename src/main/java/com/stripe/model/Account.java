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
  /** Optional information related to the business. */
  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /** The business type. Can be `individual` or `company`. */
  @SerializedName("business_type")
  String businessType;

  @SerializedName("capabilities")
  Capabilities capabilities;

  /** Whether the account can create live charges. */
  @SerializedName("charges_enabled")
  Boolean chargesEnabled;

  @SerializedName("company")
  Company company;

  /** The account's country. */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that [Stripe supports in the account's country](https://stripe.com/docs/payouts).
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

  /** The primary user's email address. */
  @SerializedName("email")
  String email;

  /** External accounts (bank accounts and debit cards) currently attached to this account. */
  @SerializedName("external_accounts")
  ExternalAccountCollection externalAccounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("individual")
  Person individual;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `account`.
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

  /** The Stripe account type. Can be `standard`, `express`, or `custom`. */
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
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
   */
  @Override
  public Account update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
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
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
   */
  public Account update(AccountUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a connected <a href="/docs/connect/accounts">Express or Custom account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged. Most
   * parameters can be changed only for Custom accounts. (These are marked <strong>Custom
   * Only</strong> below.) Parameters marked <strong>Custom and Express</strong> are supported by
   * both account types.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="/docs/connect/updating-accounts">Connect</a> documentation to learn more about updating
   * accounts.
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
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.requestCollection(url, params, AccountCollection.class, options);
  }

  /**
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>.
   * If you’re not a platform, the list is empty.
   */
  public static AccountCollection list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.requestCollection(url, params, AccountCollection.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can create Stripe accounts for your users. To do
   * this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>For Standard accounts, parameters other than <code>country</code>, <code>email</code>, and
   * <code>type</code> are used to prefill the account application that we ask the account holder to
   * complete.
   */
  public static Account create(AccountCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/accounts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Account.class, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can delete Custom or Express accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Accounts created using
   * live-mode keys can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can delete Custom or Express accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Accounts created using
   * live-mode keys can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can delete Custom or Express accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Accounts created using
   * live-mode keys can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
   */
  public Account delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you can delete Custom or Express accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Accounts created using
   * live-mode keys can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account/data">data tab in your account settings</a> instead.
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
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(Map<String, Object> params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
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
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(AccountRejectParams params) throws StripeException {
    return reject(params, (RequestOptions) null);
  }

  /**
   * With <a href="/docs/connect">Connect</a>, you may flag accounts as suspicious.
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
     * The merchant category code for the account. MCCs are used to classify businesses based on the
     * goods or services they provide.
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
     * The status of the card issuing capability of the account, or whether you can use Issuing to
     * distribute funds on cards
     *
     * <p>One of `active`, `inactive`, or `pending`.
     */
    @SerializedName("card_issuing")
    String cardIssuing;

    /**
     * The status of the card payments capability of the account, or whether the account can
     * directly process credit and debit card charges.
     *
     * <p>One of `active`, `inactive`, or `pending`.
     */
    @SerializedName("card_payments")
    String cardPayments;

    /**
     * The status of the legacy payments capability of the account.
     *
     * <p>One of `active`, `inactive`, or `pending`.
     */
    @SerializedName("legacy_payments")
    String legacyPayments;

    /**
     * The status of the transfers capability of the account, or whether your platform can transfer
     * funds to the account.
     *
     * <p>One of `active`, `inactive`, or `pending`.
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
     * Whether the company's directors have been provided. This Boolean will be `true` if you've
     * manually indicated that all directors are provided via [the `directors_provided`
     * parameter](https://stripe.com/docs/api/accounts/update#update_account-company-directors_provided).
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * Whether the company's executives have been provided. This Boolean will be `true` if you've
     * manually indicated that all executives are provided via [the `executives_provided`
     * parameter](https://stripe.com/docs/api/accounts/update#update_account-company-executives_provided),
     * or if Stripe determined that sufficient executives were provided.
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
     * Whether the company's owners have been provided. This Boolean will be `true` if you've
     * manually indicated that all owners are provided via [the `owners_provided`
     * parameter](https://stripe.com/docs/api/accounts/update#update_account-company-owners_provided),
     * or if Stripe determined that sufficient owners were provided. Stripe determines ownership
     * requirements using both the number of owners provided and their total percent ownership
     * (calculated by adding the `percent_ownership` of each owner together).
     */
    @SerializedName("owners_provided")
    Boolean ownersProvided;

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    String phone;

    /** Whether the company's business ID number was provided. */
    @SerializedName("tax_id_provided")
    Boolean taxIdProvided;

    /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
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
    public static class Verification extends StripeObject {
      @SerializedName("document")
      VerificationDocument document;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class VerificationDocument extends StripeObject {
        /**
         * The back of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `additional_verification`.
         */
        @SerializedName("back")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> back;

        /** A user-displayable string describing the verification state of this document. */
        @SerializedName("details")
        String details;

        /**
         * One of `document_corrupt`, `document_expired`, `document_failed_copy`,
         * `document_failed_greyscale`, `document_failed_other`, `document_failed_test_mode`,
         * `document_fraudulent`, `document_incomplete`, `document_invalid`, `document_manipulated`,
         * `document_not_readable`, `document_not_uploaded`, `document_type_not_supported`, or
         * `document_too_large`. A machine-readable code specifying the verification state for this
         * document.
         */
        @SerializedName("details_code")
        String detailsCode;

        /**
         * The front of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `additional_verification`.
         */
        @SerializedName("front")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<File> front;

        /** Get id of expandable `back` object. */
        public String getBack() {
          return (this.back != null) ? this.back.getId() : null;
        }

        public void setBack(String id) {
          this.back = ApiResource.setExpandableFieldId(id, this.back);
        }

        /** Get expanded `back`. */
        public File getBackObject() {
          return (this.back != null) ? this.back.getExpanded() : null;
        }

        public void setBackObject(File expandableObject) {
          this.back = new ExpandableField<File>(expandableObject.getId(), expandableObject);
        }

        /** Get id of expandable `front` object. */
        public String getFront() {
          return (this.front != null) ? this.front.getId() : null;
        }

        public void setFront(String id) {
          this.front = ApiResource.setExpandableFieldId(id, this.front);
        }

        /** Get expanded `front`. */
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
  public static class PayoutSchedule extends StripeObject {
    /** The number of days charges for the account will be held before being paid out. */
    @SerializedName("delay_days")
    Long delayDays;

    /**
     * How frequently funds will be paid out. One of `manual` (payouts only created via API call),
     * `daily`, `weekly`, or `monthly`.
     */
    @SerializedName("interval")
    String interval;

    /**
     * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts
     * scheduled between the 29th and 31st of the month are sent on the last day of shorter months.
     */
    @SerializedName("monthly_anchor")
    Long monthlyAnchor;

    /**
     * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown
     * if `interval` is weekly.
     */
    @SerializedName("weekly_anchor")
    String weeklyAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * The date the fields in `currently_due` must be collected by to keep payouts enabled for the
     * account. These fields might block payouts sooner if the next threshold is reached before
     * these fields are collected.
     */
    @SerializedName("current_deadline")
    Long currentDeadline;

    /**
     * The fields that need to be collected to keep the account enabled. If not collected by the
     * `current_deadline`, these fields appear in `past_due` as well, and the account is disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * If the account is disabled, this string describes why the account can’t create charges or
     * receive payouts. Can be `requirements.past_due`, `requirements.pending_verification`,
     * `rejected.fraud`, `rejected.terms_of_service`, `rejected.listed`, `rejected.other`, `listed`,
     * `under_review`, or `other`.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * The fields that need to be collected assuming all volume thresholds are reached. As they
     * become required, these fields appear in `currently_due` as well, and the `current_deadline`
     * is set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * The fields that weren't collected by the `current_deadline`. These fields need to be
     * collected to re-enable the account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. An empty
     * array unless an asynchronous verification is pending. If verification fails, the fields in
     * this array become required and move to `currently_due` or `past_due`.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    @SerializedName("branding")
    SettingsBranding branding;

    @SerializedName("card_payments")
    SettingsCardPayments cardPayments;

    @SerializedName("dashboard")
    SettingsDashboard dashboard;

    @SerializedName("payments")
    SettingsPayments payments;

    @SerializedName("payouts")
    SettingsPayouts payouts;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsBranding extends StripeObject {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the account.
     * Must be square and at least 128px x 128px.
     */
    @SerializedName("icon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> icon;

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account
     * that will be used in Checkout instead of the icon and without the account's name next to it
     * if provided. Must be at least 128px x 128px.
     */
    @SerializedName("logo")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> logo;

    /** A CSS hex color value representing the primary branding color for this account. */
    @SerializedName("primary_color")
    String primaryColor;

    /** Get id of expandable `icon` object. */
    public String getIcon() {
      return (this.icon != null) ? this.icon.getId() : null;
    }

    public void setIcon(String id) {
      this.icon = ApiResource.setExpandableFieldId(id, this.icon);
    }

    /** Get expanded `icon`. */
    public File getIconObject() {
      return (this.icon != null) ? this.icon.getExpanded() : null;
    }

    public void setIconObject(File expandableObject) {
      this.icon = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get id of expandable `logo` object. */
    public String getLogo() {
      return (this.logo != null) ? this.logo.getId() : null;
    }

    public void setLogo(String id) {
      this.logo = ApiResource.setExpandableFieldId(id, this.logo);
    }

    /** Get expanded `logo`. */
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
     * prefixes any dynamic `statement_descriptor` specified on the charge.
     * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
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
     * values is maintained at the [IANA Time Zone Database](http://www.iana.org/time-zones).
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
     * prefixes any dynamic `statement_descriptor` specified on the charge.
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
     * account. See our [Understanding Connect Account
     * Balances](https://stripe.com/docs/connect/account-balances) documentation for details.
     * Default value is `true` for Express accounts and `false` for Custom accounts.
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
     * The Unix timestamp marking when the Stripe Services Agreement was accepted by the account
     * representative.
     */
    @SerializedName("date")
    Long date;

    /**
     * The IP address from which the Stripe Services Agreement was accepted by the account
     * representative.
     */
    @SerializedName("ip")
    String ip;

    /**
     * The user agent of the browser from which the Stripe Services Agreement was accepted by the
     * account representative.
     */
    @SerializedName("user_agent")
    String userAgent;
  }
}
