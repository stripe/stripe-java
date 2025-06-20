// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountCreateParams extends ApiRequestParams {
  /**
   * An <a href="https://stripe.com/docs/api#create_account_token">account token</a>, used to
   * securely provide details to the account.
   */
  @SerializedName("account_token")
  String accountToken;

  /** Business information about the account. */
  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /**
   * The business type. Once you create an <a href="https://stripe.com/api/account_links">Account
   * Link</a> or <a href="https://stripe.com/api/account_sessions">Account Session</a>, this
   * property can only be updated for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  @SerializedName("business_type")
  BusinessType businessType;

  /**
   * Each key of the dictionary represents a capability, and each capability maps to its settings
   * (for example, whether it has been requested or not). Each capability is inactive until you have
   * provided its specific requirements and Stripe has verified them. An account might have some of
   * its requested capabilities be active and some be inactive.
   *
   * <p>Required when <a
   * href="https://stripe.com/api/accounts/create#create_account-controller-dashboard-type">account.controller.stripe_dashboard.type</a>
   * is {@code none}, which includes Custom accounts.
   */
  @SerializedName("capabilities")
  Capabilities capabilities;

  /**
   * Information about the company or business. This field is available for any {@code
   * business_type}. Once you create an <a href="https://stripe.com/api/account_links">Account
   * Link</a> or <a href="https://stripe.com/api/account_sessions">Account Session</a>, this
   * property can only be updated for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  @SerializedName("company")
  Company company;

  /** A hash of configuration describing the account controller's attributes. */
  @SerializedName("controller")
  Controller controller;

  /**
   * The country in which the account holder resides, or in which the business is legally
   * established. This should be an ISO 3166-1 alpha-2 country code. For example, if you are in the
   * United States and the business for which you're creating an account is legally represented in
   * Canada, you would use {@code CA} as the country for the account being created. Available
   * countries include <a href="https://stripe.com/global">Stripe's global markets</a> as well as
   * countries where <a href="https://stripe.com/docs/connect/cross-border-payouts">cross-border
   * payouts</a> are supported.
   */
  @SerializedName("country")
  String country;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that <a href="https://docs.stripe.com/payouts">Stripe supports in the account's
   * country</a>.
   */
  @SerializedName("default_currency")
  String defaultCurrency;

  /** Documents that may be submitted to satisfy various informational requests. */
  @SerializedName("documents")
  Documents documents;

  /**
   * The email address of the account holder. This is only to make the account easier to identify to
   * you. If <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, Stripe doesn't email the account
   * without your consent.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A card or bank account to attach to the account for receiving <a
   * href="https://stripe.com/connect/bank-debit-card-payouts">payouts</a> (you won’t be able to use
   * it for top-ups). You can provide either a token, like the ones returned by <a
   * href="https://stripe.com/js">Stripe.js</a>, or a dictionary, as documented in the {@code
   * external_account} parameter for <a
   * href="https://stripe.com/api#account_create_bank_account">bank account</a> creation. <br>
   * <br>
   * By default, providing an external account sets it as the new default external account for its
   * currency, and deletes the old default if one exists. To add additional external accounts
   * without replacing the existing default for the currency, use the <a
   * href="https://stripe.com/api#account_create_bank_account">bank account</a> or <a
   * href="https://stripe.com/api#account_create_card">card creation</a> APIs. After you create an
   * <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a>, this property can only be
   * updated for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  @SerializedName("external_account")
  String externalAccount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A hash of account group type to tokens. These are account groups this account should be added
   * to.
   */
  @SerializedName("groups")
  Groups groups;

  /**
   * Information about the person represented by the account. This field is null unless {@code
   * business_type} is set to {@code individual}. Once you create an <a
   * href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a>, this property can only be
   * updated for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  @SerializedName("individual")
  Individual individual;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * A hash to configure risk controls on the account. Please see <a
   * href="https://stripe.com/connect/pausing-payments-or-payouts-on-connected-accounts">this page
   * for more details</a>.
   */
  @SerializedName("risk_controls")
  RiskControls riskControls;

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  Settings settings;

  /**
   * Details on the account's acceptance of the <a
   * href="https://stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
   * Agreement</a>. This property can only be updated for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts. This property defaults to a {@code
   * full} service agreement when empty.
   */
  @SerializedName("tos_acceptance")
  TosAcceptance tosAcceptance;

  /**
   * The type of Stripe account to create. May be one of {@code custom}, {@code express} or {@code
   * standard}.
   */
  @SerializedName("type")
  Type type;

  private AccountCreateParams(
      String accountToken,
      BusinessProfile businessProfile,
      BusinessType businessType,
      Capabilities capabilities,
      Company company,
      Controller controller,
      String country,
      String defaultCurrency,
      Documents documents,
      String email,
      List<String> expand,
      String externalAccount,
      Map<String, Object> extraParams,
      Groups groups,
      Individual individual,
      Object metadata,
      RiskControls riskControls,
      Settings settings,
      TosAcceptance tosAcceptance,
      Type type) {
    this.accountToken = accountToken;
    this.businessProfile = businessProfile;
    this.businessType = businessType;
    this.capabilities = capabilities;
    this.company = company;
    this.controller = controller;
    this.country = country;
    this.defaultCurrency = defaultCurrency;
    this.documents = documents;
    this.email = email;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.extraParams = extraParams;
    this.groups = groups;
    this.individual = individual;
    this.metadata = metadata;
    this.riskControls = riskControls;
    this.settings = settings;
    this.tosAcceptance = tosAcceptance;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String accountToken;

    private BusinessProfile businessProfile;

    private BusinessType businessType;

    private Capabilities capabilities;

    private Company company;

    private Controller controller;

    private String country;

    private String defaultCurrency;

    private Documents documents;

    private String email;

    private List<String> expand;

    private String externalAccount;

    private Map<String, Object> extraParams;

    private Groups groups;

    private Individual individual;

    private Object metadata;

    private RiskControls riskControls;

    private Settings settings;

    private TosAcceptance tosAcceptance;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountCreateParams build() {
      return new AccountCreateParams(
          this.accountToken,
          this.businessProfile,
          this.businessType,
          this.capabilities,
          this.company,
          this.controller,
          this.country,
          this.defaultCurrency,
          this.documents,
          this.email,
          this.expand,
          this.externalAccount,
          this.extraParams,
          this.groups,
          this.individual,
          this.metadata,
          this.riskControls,
          this.settings,
          this.tosAcceptance,
          this.type);
    }

    /**
     * An <a href="https://stripe.com/docs/api#create_account_token">account token</a>, used to
     * securely provide details to the account.
     */
    public Builder setAccountToken(String accountToken) {
      this.accountToken = accountToken;
      return this;
    }

    /** Business information about the account. */
    public Builder setBusinessProfile(AccountCreateParams.BusinessProfile businessProfile) {
      this.businessProfile = businessProfile;
      return this;
    }

    /**
     * The business type. Once you create an <a href="https://stripe.com/api/account_links">Account
     * Link</a> or <a href="https://stripe.com/api/account_sessions">Account Session</a>, this
     * property can only be updated for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts.
     */
    public Builder setBusinessType(AccountCreateParams.BusinessType businessType) {
      this.businessType = businessType;
      return this;
    }

    /**
     * Each key of the dictionary represents a capability, and each capability maps to its settings
     * (for example, whether it has been requested or not). Each capability is inactive until you
     * have provided its specific requirements and Stripe has verified them. An account might have
     * some of its requested capabilities be active and some be inactive.
     *
     * <p>Required when <a
     * href="https://stripe.com/api/accounts/create#create_account-controller-dashboard-type">account.controller.stripe_dashboard.type</a>
     * is {@code none}, which includes Custom accounts.
     */
    public Builder setCapabilities(AccountCreateParams.Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * Information about the company or business. This field is available for any {@code
     * business_type}. Once you create an <a href="https://stripe.com/api/account_links">Account
     * Link</a> or <a href="https://stripe.com/api/account_sessions">Account Session</a>, this
     * property can only be updated for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts.
     */
    public Builder setCompany(AccountCreateParams.Company company) {
      this.company = company;
      return this;
    }

    /** A hash of configuration describing the account controller's attributes. */
    public Builder setController(AccountCreateParams.Controller controller) {
      this.controller = controller;
      return this;
    }

    /**
     * The country in which the account holder resides, or in which the business is legally
     * established. This should be an ISO 3166-1 alpha-2 country code. For example, if you are in
     * the United States and the business for which you're creating an account is legally
     * represented in Canada, you would use {@code CA} as the country for the account being created.
     * Available countries include <a href="https://stripe.com/global">Stripe's global markets</a>
     * as well as countries where <a
     * href="https://stripe.com/docs/connect/cross-border-payouts">cross-border payouts</a> are
     * supported.
     */
    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must
     * be a currency that <a href="https://docs.stripe.com/payouts">Stripe supports in the account's
     * country</a>.
     */
    public Builder setDefaultCurrency(String defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(AccountCreateParams.Documents documents) {
      this.documents = documents;
      return this;
    }

    /**
     * The email address of the account holder. This is only to make the account easier to identify
     * to you. If <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts, Stripe doesn't email the account
     * without your consent.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * A card or bank account to attach to the account for receiving <a
     * href="https://stripe.com/connect/bank-debit-card-payouts">payouts</a> (you won’t be able to
     * use it for top-ups). You can provide either a token, like the ones returned by <a
     * href="https://stripe.com/js">Stripe.js</a>, or a dictionary, as documented in the {@code
     * external_account} parameter for <a
     * href="https://stripe.com/api#account_create_bank_account">bank account</a> creation. <br>
     * <br>
     * By default, providing an external account sets it as the new default external account for its
     * currency, and deletes the old default if one exists. To add additional external accounts
     * without replacing the existing default for the currency, use the <a
     * href="https://stripe.com/api#account_create_bank_account">bank account</a> or <a
     * href="https://stripe.com/api#account_create_card">card creation</a> APIs. After you create an
     * <a href="https://stripe.com/api/account_links">Account Link</a> or <a
     * href="https://stripe.com/api/account_sessions">Account Session</a>, this property can only be
     * updated for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts.
     */
    public Builder setExternalAccount(String externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A hash of account group type to tokens. These are account groups this account should be added
     * to.
     */
    public Builder setGroups(AccountCreateParams.Groups groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Information about the person represented by the account. This field is null unless {@code
     * business_type} is set to {@code individual}. Once you create an <a
     * href="https://stripe.com/api/account_links">Account Link</a> or <a
     * href="https://stripe.com/api/account_sessions">Account Session</a>, this property can only be
     * updated for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts.
     */
    public Builder setIndividual(AccountCreateParams.Individual individual) {
      this.individual = individual;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AccountCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * A hash to configure risk controls on the account. Please see <a
     * href="https://stripe.com/connect/pausing-payments-or-payouts-on-connected-accounts">this page
     * for more details</a>.
     */
    public Builder setRiskControls(AccountCreateParams.RiskControls riskControls) {
      this.riskControls = riskControls;
      return this;
    }

    /** Options for customizing how the account functions within Stripe. */
    public Builder setSettings(AccountCreateParams.Settings settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Details on the account's acceptance of the <a
     * href="https://stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
     * Agreement</a>. This property can only be updated for accounts where <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts. This property defaults to a {@code
     * full} service agreement when empty.
     */
    public Builder setTosAcceptance(AccountCreateParams.TosAcceptance tosAcceptance) {
      this.tosAcceptance = tosAcceptance;
      return this;
    }

    /**
     * The type of Stripe account to create. May be one of {@code custom}, {@code express} or {@code
     * standard}.
     */
    public Builder setType(AccountCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BusinessProfile {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <a href="https://stripe.com/connect/setting-mcc">The merchant category code for the
     * account</a>. MCCs are used to classify businesses based on the goods or services they
     * provide.
     */
    @SerializedName("mcc")
    String mcc;

    /** Whether the business is a minority-owned, women-owned, and/or LGBTQI+-owned business. */
    @SerializedName("minority_owned_business_designation")
    List<AccountCreateParams.BusinessProfile.MinorityOwnedBusinessDesignation>
        minorityOwnedBusinessDesignation;

    /**
     * An estimate of the monthly revenue of the business. Only accepted for accounts in Brazil and
     * India.
     */
    @SerializedName("monthly_estimated_revenue")
    MonthlyEstimatedRevenue monthlyEstimatedRevenue;

    /** The customer-facing business name. */
    @SerializedName("name")
    String name;

    /**
     * Internal-only description of the product sold by, or service provided by, the business. Used
     * by Stripe for risk and underwriting purposes.
     */
    @SerializedName("product_description")
    String productDescription;

    /** A publicly available mailing address for sending support issues to. */
    @SerializedName("support_address")
    SupportAddress supportAddress;

    /** A publicly available email address for sending support issues to. */
    @SerializedName("support_email")
    String supportEmail;

    /** A publicly available phone number to call with support issues. */
    @SerializedName("support_phone")
    String supportPhone;

    /** A publicly available website for handling support issues. */
    @SerializedName("support_url")
    Object supportUrl;

    /** The business's publicly available website. */
    @SerializedName("url")
    String url;

    private BusinessProfile(
        AnnualRevenue annualRevenue,
        Long estimatedWorkerCount,
        Map<String, Object> extraParams,
        String mcc,
        List<AccountCreateParams.BusinessProfile.MinorityOwnedBusinessDesignation>
            minorityOwnedBusinessDesignation,
        MonthlyEstimatedRevenue monthlyEstimatedRevenue,
        String name,
        String productDescription,
        SupportAddress supportAddress,
        String supportEmail,
        String supportPhone,
        Object supportUrl,
        String url) {
      this.annualRevenue = annualRevenue;
      this.estimatedWorkerCount = estimatedWorkerCount;
      this.extraParams = extraParams;
      this.mcc = mcc;
      this.minorityOwnedBusinessDesignation = minorityOwnedBusinessDesignation;
      this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
      this.name = name;
      this.productDescription = productDescription;
      this.supportAddress = supportAddress;
      this.supportEmail = supportEmail;
      this.supportPhone = supportPhone;
      this.supportUrl = supportUrl;
      this.url = url;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AnnualRevenue annualRevenue;

      private Long estimatedWorkerCount;

      private Map<String, Object> extraParams;

      private String mcc;

      private List<AccountCreateParams.BusinessProfile.MinorityOwnedBusinessDesignation>
          minorityOwnedBusinessDesignation;

      private MonthlyEstimatedRevenue monthlyEstimatedRevenue;

      private String name;

      private String productDescription;

      private SupportAddress supportAddress;

      private String supportEmail;

      private String supportPhone;

      private Object supportUrl;

      private String url;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.BusinessProfile build() {
        return new AccountCreateParams.BusinessProfile(
            this.annualRevenue,
            this.estimatedWorkerCount,
            this.extraParams,
            this.mcc,
            this.minorityOwnedBusinessDesignation,
            this.monthlyEstimatedRevenue,
            this.name,
            this.productDescription,
            this.supportAddress,
            this.supportEmail,
            this.supportPhone,
            this.supportUrl,
            this.url);
      }

      /** The applicant's gross annual revenue for its preceding fiscal year. */
      public Builder setAnnualRevenue(
          AccountCreateParams.BusinessProfile.AnnualRevenue annualRevenue) {
        this.annualRevenue = annualRevenue;
        return this;
      }

      /**
       * An estimated upper bound of employees, contractors, vendors, etc. currently working for the
       * business.
       */
      public Builder setEstimatedWorkerCount(Long estimatedWorkerCount) {
        this.estimatedWorkerCount = estimatedWorkerCount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.BusinessProfile#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.BusinessProfile#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <a href="https://stripe.com/connect/setting-mcc">The merchant category code for the
       * account</a>. MCCs are used to classify businesses based on the goods or services they
       * provide.
       */
      public Builder setMcc(String mcc) {
        this.mcc = mcc;
        return this;
      }

      /**
       * Add an element to `minorityOwnedBusinessDesignation` list. A list is initialized for the
       * first `add/addAll` call, and subsequent calls adds additional elements to the original
       * list. See {@link AccountCreateParams.BusinessProfile#minorityOwnedBusinessDesignation} for
       * the field documentation.
       */
      public Builder addMinorityOwnedBusinessDesignation(
          AccountCreateParams.BusinessProfile.MinorityOwnedBusinessDesignation element) {
        if (this.minorityOwnedBusinessDesignation == null) {
          this.minorityOwnedBusinessDesignation = new ArrayList<>();
        }
        this.minorityOwnedBusinessDesignation.add(element);
        return this;
      }

      /**
       * Add all elements to `minorityOwnedBusinessDesignation` list. A list is initialized for the
       * first `add/addAll` call, and subsequent calls adds additional elements to the original
       * list. See {@link AccountCreateParams.BusinessProfile#minorityOwnedBusinessDesignation} for
       * the field documentation.
       */
      public Builder addAllMinorityOwnedBusinessDesignation(
          List<AccountCreateParams.BusinessProfile.MinorityOwnedBusinessDesignation> elements) {
        if (this.minorityOwnedBusinessDesignation == null) {
          this.minorityOwnedBusinessDesignation = new ArrayList<>();
        }
        this.minorityOwnedBusinessDesignation.addAll(elements);
        return this;
      }

      /**
       * An estimate of the monthly revenue of the business. Only accepted for accounts in Brazil
       * and India.
       */
      public Builder setMonthlyEstimatedRevenue(
          AccountCreateParams.BusinessProfile.MonthlyEstimatedRevenue monthlyEstimatedRevenue) {
        this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
        return this;
      }

      /** The customer-facing business name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * Internal-only description of the product sold by, or service provided by, the business.
       * Used by Stripe for risk and underwriting purposes.
       */
      public Builder setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      /** A publicly available mailing address for sending support issues to. */
      public Builder setSupportAddress(
          AccountCreateParams.BusinessProfile.SupportAddress supportAddress) {
        this.supportAddress = supportAddress;
        return this;
      }

      /** A publicly available email address for sending support issues to. */
      public Builder setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
      }

      /** A publicly available phone number to call with support issues. */
      public Builder setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
        return this;
      }

      /** A publicly available website for handling support issues. */
      public Builder setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
      }

      /** A publicly available website for handling support issues. */
      public Builder setSupportUrl(EmptyParam supportUrl) {
        this.supportUrl = supportUrl;
        return this;
      }

      /** The business's publicly available website. */
      public Builder setUrl(String url) {
        this.url = url;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AnnualRevenue {
      /**
       * <strong>Required.</strong> A non-negative integer representing the amount in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The close-out date of the preceding fiscal year in ISO 8601
       * format. E.g. 2023-12-31 for the 31st of December, 2023.
       */
      @SerializedName("fiscal_year_end")
      String fiscalYearEnd;

      private AnnualRevenue(
          Long amount, String currency, Map<String, Object> extraParams, String fiscalYearEnd) {
        this.amount = amount;
        this.currency = currency;
        this.extraParams = extraParams;
        this.fiscalYearEnd = fiscalYearEnd;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String currency;

        private Map<String, Object> extraParams;

        private String fiscalYearEnd;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.BusinessProfile.AnnualRevenue build() {
          return new AccountCreateParams.BusinessProfile.AnnualRevenue(
              this.amount, this.currency, this.extraParams, this.fiscalYearEnd);
        }

        /**
         * <strong>Required.</strong> A non-negative integer representing the amount in the <a
         * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.AnnualRevenue#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.AnnualRevenue#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The close-out date of the preceding fiscal year in ISO 8601
         * format. E.g. 2023-12-31 for the 31st of December, 2023.
         */
        public Builder setFiscalYearEnd(String fiscalYearEnd) {
          this.fiscalYearEnd = fiscalYearEnd;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MonthlyEstimatedRevenue {
      /**
       * <strong>Required.</strong> A non-negative integer representing how much to charge in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private MonthlyEstimatedRevenue(
          Long amount, String currency, Map<String, Object> extraParams) {
        this.amount = amount;
        this.currency = currency;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String currency;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.BusinessProfile.MonthlyEstimatedRevenue build() {
          return new AccountCreateParams.BusinessProfile.MonthlyEstimatedRevenue(
              this.amount, this.currency, this.extraParams);
        }

        /**
         * <strong>Required.</strong> A non-negative integer representing how much to charge in the
         * <a href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.MonthlyEstimatedRevenue#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.MonthlyEstimatedRevenue#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SupportAddress {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private SupportAddress(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.BusinessProfile.SupportAddress build() {
          return new AccountCreateParams.BusinessProfile.SupportAddress(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.SupportAddress#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.BusinessProfile.SupportAddress#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    public enum MinorityOwnedBusinessDesignation implements ApiRequestParams.EnumParam {
      @SerializedName("lgbtqi_owned_business")
      LGBTQI_OWNED_BUSINESS("lgbtqi_owned_business"),

      @SerializedName("minority_owned_business")
      MINORITY_OWNED_BUSINESS("minority_owned_business"),

      @SerializedName("none_of_these_apply")
      NONE_OF_THESE_APPLY("none_of_these_apply"),

      @SerializedName("prefer_not_to_answer")
      PREFER_NOT_TO_ANSWER("prefer_not_to_answer"),

      @SerializedName("women_owned_business")
      WOMEN_OWNED_BUSINESS("women_owned_business");

      @Getter(onMethod_ = {@Override})
      private final String value;

      MinorityOwnedBusinessDesignation(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Capabilities {
    /** The acss_debit_payments capability. */
    @SerializedName("acss_debit_payments")
    AcssDebitPayments acssDebitPayments;

    /** The affirm_payments capability. */
    @SerializedName("affirm_payments")
    AffirmPayments affirmPayments;

    /** The afterpay_clearpay_payments capability. */
    @SerializedName("afterpay_clearpay_payments")
    AfterpayClearpayPayments afterpayClearpayPayments;

    /** The alma_payments capability. */
    @SerializedName("alma_payments")
    AlmaPayments almaPayments;

    /** The amazon_pay_payments capability. */
    @SerializedName("amazon_pay_payments")
    AmazonPayPayments amazonPayPayments;

    /** The au_becs_debit_payments capability. */
    @SerializedName("au_becs_debit_payments")
    AuBecsDebitPayments auBecsDebitPayments;

    /** The automatic_indirect_tax capability. */
    @SerializedName("automatic_indirect_tax")
    AutomaticIndirectTax automaticIndirectTax;

    /** The bacs_debit_payments capability. */
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

    /** The bancontact_payments capability. */
    @SerializedName("bancontact_payments")
    BancontactPayments bancontactPayments;

    /** The bank_transfer_payments capability. */
    @SerializedName("bank_transfer_payments")
    BankTransferPayments bankTransferPayments;

    /** The billie_payments capability. */
    @SerializedName("billie_payments")
    BilliePayments billiePayments;

    /** The blik_payments capability. */
    @SerializedName("blik_payments")
    BlikPayments blikPayments;

    /** The boleto_payments capability. */
    @SerializedName("boleto_payments")
    BoletoPayments boletoPayments;

    /** The card_issuing capability. */
    @SerializedName("card_issuing")
    CardIssuing cardIssuing;

    /** The card_payments capability. */
    @SerializedName("card_payments")
    CardPayments cardPayments;

    /** The cartes_bancaires_payments capability. */
    @SerializedName("cartes_bancaires_payments")
    CartesBancairesPayments cartesBancairesPayments;

    /** The cashapp_payments capability. */
    @SerializedName("cashapp_payments")
    CashappPayments cashappPayments;

    /** The crypto_payments capability. */
    @SerializedName("crypto_payments")
    CryptoPayments cryptoPayments;

    /** The eps_payments capability. */
    @SerializedName("eps_payments")
    EpsPayments epsPayments;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The fpx_payments capability. */
    @SerializedName("fpx_payments")
    FpxPayments fpxPayments;

    /** The gb_bank_transfer_payments capability. */
    @SerializedName("gb_bank_transfer_payments")
    GbBankTransferPayments gbBankTransferPayments;

    /** The giropay_payments capability. */
    @SerializedName("giropay_payments")
    GiropayPayments giropayPayments;

    /** The gopay_payments capability. */
    @SerializedName("gopay_payments")
    GopayPayments gopayPayments;

    /** The grabpay_payments capability. */
    @SerializedName("grabpay_payments")
    GrabpayPayments grabpayPayments;

    /** The id_bank_transfer_payments capability. */
    @SerializedName("id_bank_transfer_payments")
    IdBankTransferPayments idBankTransferPayments;

    /** The id_bank_transfer_payments_bca capability. */
    @SerializedName("id_bank_transfer_payments_bca")
    IdBankTransferPaymentsBca idBankTransferPaymentsBca;

    /** The ideal_payments capability. */
    @SerializedName("ideal_payments")
    IdealPayments idealPayments;

    /** The india_international_payments capability. */
    @SerializedName("india_international_payments")
    IndiaInternationalPayments indiaInternationalPayments;

    /** The jcb_payments capability. */
    @SerializedName("jcb_payments")
    JcbPayments jcbPayments;

    /** The jp_bank_transfer_payments capability. */
    @SerializedName("jp_bank_transfer_payments")
    JpBankTransferPayments jpBankTransferPayments;

    /** The kakao_pay_payments capability. */
    @SerializedName("kakao_pay_payments")
    KakaoPayPayments kakaoPayPayments;

    /** The klarna_payments capability. */
    @SerializedName("klarna_payments")
    KlarnaPayments klarnaPayments;

    /** The konbini_payments capability. */
    @SerializedName("konbini_payments")
    KonbiniPayments konbiniPayments;

    /** The kr_card_payments capability. */
    @SerializedName("kr_card_payments")
    KrCardPayments krCardPayments;

    /** The legacy_payments capability. */
    @SerializedName("legacy_payments")
    LegacyPayments legacyPayments;

    /** The link_payments capability. */
    @SerializedName("link_payments")
    LinkPayments linkPayments;

    /** The mb_way_payments capability. */
    @SerializedName("mb_way_payments")
    MbWayPayments mbWayPayments;

    /** The mobilepay_payments capability. */
    @SerializedName("mobilepay_payments")
    MobilepayPayments mobilepayPayments;

    /** The multibanco_payments capability. */
    @SerializedName("multibanco_payments")
    MultibancoPayments multibancoPayments;

    /** The mx_bank_transfer_payments capability. */
    @SerializedName("mx_bank_transfer_payments")
    MxBankTransferPayments mxBankTransferPayments;

    /** The naver_pay_payments capability. */
    @SerializedName("naver_pay_payments")
    NaverPayPayments naverPayPayments;

    /** The nz_bank_account_becs_debit_payments capability. */
    @SerializedName("nz_bank_account_becs_debit_payments")
    NzBankAccountBecsDebitPayments nzBankAccountBecsDebitPayments;

    /** The oxxo_payments capability. */
    @SerializedName("oxxo_payments")
    OxxoPayments oxxoPayments;

    /** The p24_payments capability. */
    @SerializedName("p24_payments")
    P24Payments p24Payments;

    /** The pay_by_bank_payments capability. */
    @SerializedName("pay_by_bank_payments")
    PayByBankPayments payByBankPayments;

    /** The payco_payments capability. */
    @SerializedName("payco_payments")
    PaycoPayments paycoPayments;

    /** The paynow_payments capability. */
    @SerializedName("paynow_payments")
    PaynowPayments paynowPayments;

    /** The paypal_payments capability. */
    @SerializedName("paypal_payments")
    PaypalPayments paypalPayments;

    /** The payto_payments capability. */
    @SerializedName("payto_payments")
    PaytoPayments paytoPayments;

    /** The pix_payments capability. */
    @SerializedName("pix_payments")
    PixPayments pixPayments;

    /** The promptpay_payments capability. */
    @SerializedName("promptpay_payments")
    PromptpayPayments promptpayPayments;

    /** The qris_payments capability. */
    @SerializedName("qris_payments")
    QrisPayments qrisPayments;

    /** The rechnung_payments capability. */
    @SerializedName("rechnung_payments")
    RechnungPayments rechnungPayments;

    /** The revolut_pay_payments capability. */
    @SerializedName("revolut_pay_payments")
    RevolutPayPayments revolutPayPayments;

    /** The samsung_pay_payments capability. */
    @SerializedName("samsung_pay_payments")
    SamsungPayPayments samsungPayPayments;

    /** The satispay_payments capability. */
    @SerializedName("satispay_payments")
    SatispayPayments satispayPayments;

    /** The sepa_bank_transfer_payments capability. */
    @SerializedName("sepa_bank_transfer_payments")
    SepaBankTransferPayments sepaBankTransferPayments;

    /** The sepa_debit_payments capability. */
    @SerializedName("sepa_debit_payments")
    SepaDebitPayments sepaDebitPayments;

    /** The shopeepay_payments capability. */
    @SerializedName("shopeepay_payments")
    ShopeepayPayments shopeepayPayments;

    /** The sofort_payments capability. */
    @SerializedName("sofort_payments")
    SofortPayments sofortPayments;

    /** The stripe_balance_payments capability. */
    @SerializedName("stripe_balance_payments")
    StripeBalancePayments stripeBalancePayments;

    /** The swish_payments capability. */
    @SerializedName("swish_payments")
    SwishPayments swishPayments;

    /** The tax_reporting_us_1099_k capability. */
    @SerializedName("tax_reporting_us_1099_k")
    TaxReportingUs1099K taxReportingUs1099K;

    /** The tax_reporting_us_1099_misc capability. */
    @SerializedName("tax_reporting_us_1099_misc")
    TaxReportingUs1099Misc taxReportingUs1099Misc;

    /** The transfers capability. */
    @SerializedName("transfers")
    Transfers transfers;

    /** The treasury capability. */
    @SerializedName("treasury")
    Treasury treasury;

    /** The treasury_evolve capability. */
    @SerializedName("treasury_evolve")
    TreasuryEvolve treasuryEvolve;

    /** The treasury_fifth_third capability. */
    @SerializedName("treasury_fifth_third")
    TreasuryFifthThird treasuryFifthThird;

    /** The treasury_goldman_sachs capability. */
    @SerializedName("treasury_goldman_sachs")
    TreasuryGoldmanSachs treasuryGoldmanSachs;

    /** The twint_payments capability. */
    @SerializedName("twint_payments")
    TwintPayments twintPayments;

    /** The us_bank_account_ach_payments capability. */
    @SerializedName("us_bank_account_ach_payments")
    UsBankAccountAchPayments usBankAccountAchPayments;

    /** The us_bank_transfer_payments capability. */
    @SerializedName("us_bank_transfer_payments")
    UsBankTransferPayments usBankTransferPayments;

    /** The zip_payments capability. */
    @SerializedName("zip_payments")
    ZipPayments zipPayments;

    private Capabilities(
        AcssDebitPayments acssDebitPayments,
        AffirmPayments affirmPayments,
        AfterpayClearpayPayments afterpayClearpayPayments,
        AlmaPayments almaPayments,
        AmazonPayPayments amazonPayPayments,
        AuBecsDebitPayments auBecsDebitPayments,
        AutomaticIndirectTax automaticIndirectTax,
        BacsDebitPayments bacsDebitPayments,
        BancontactPayments bancontactPayments,
        BankTransferPayments bankTransferPayments,
        BilliePayments billiePayments,
        BlikPayments blikPayments,
        BoletoPayments boletoPayments,
        CardIssuing cardIssuing,
        CardPayments cardPayments,
        CartesBancairesPayments cartesBancairesPayments,
        CashappPayments cashappPayments,
        CryptoPayments cryptoPayments,
        EpsPayments epsPayments,
        Map<String, Object> extraParams,
        FpxPayments fpxPayments,
        GbBankTransferPayments gbBankTransferPayments,
        GiropayPayments giropayPayments,
        GopayPayments gopayPayments,
        GrabpayPayments grabpayPayments,
        IdBankTransferPayments idBankTransferPayments,
        IdBankTransferPaymentsBca idBankTransferPaymentsBca,
        IdealPayments idealPayments,
        IndiaInternationalPayments indiaInternationalPayments,
        JcbPayments jcbPayments,
        JpBankTransferPayments jpBankTransferPayments,
        KakaoPayPayments kakaoPayPayments,
        KlarnaPayments klarnaPayments,
        KonbiniPayments konbiniPayments,
        KrCardPayments krCardPayments,
        LegacyPayments legacyPayments,
        LinkPayments linkPayments,
        MbWayPayments mbWayPayments,
        MobilepayPayments mobilepayPayments,
        MultibancoPayments multibancoPayments,
        MxBankTransferPayments mxBankTransferPayments,
        NaverPayPayments naverPayPayments,
        NzBankAccountBecsDebitPayments nzBankAccountBecsDebitPayments,
        OxxoPayments oxxoPayments,
        P24Payments p24Payments,
        PayByBankPayments payByBankPayments,
        PaycoPayments paycoPayments,
        PaynowPayments paynowPayments,
        PaypalPayments paypalPayments,
        PaytoPayments paytoPayments,
        PixPayments pixPayments,
        PromptpayPayments promptpayPayments,
        QrisPayments qrisPayments,
        RechnungPayments rechnungPayments,
        RevolutPayPayments revolutPayPayments,
        SamsungPayPayments samsungPayPayments,
        SatispayPayments satispayPayments,
        SepaBankTransferPayments sepaBankTransferPayments,
        SepaDebitPayments sepaDebitPayments,
        ShopeepayPayments shopeepayPayments,
        SofortPayments sofortPayments,
        StripeBalancePayments stripeBalancePayments,
        SwishPayments swishPayments,
        TaxReportingUs1099K taxReportingUs1099K,
        TaxReportingUs1099Misc taxReportingUs1099Misc,
        Transfers transfers,
        Treasury treasury,
        TreasuryEvolve treasuryEvolve,
        TreasuryFifthThird treasuryFifthThird,
        TreasuryGoldmanSachs treasuryGoldmanSachs,
        TwintPayments twintPayments,
        UsBankAccountAchPayments usBankAccountAchPayments,
        UsBankTransferPayments usBankTransferPayments,
        ZipPayments zipPayments) {
      this.acssDebitPayments = acssDebitPayments;
      this.affirmPayments = affirmPayments;
      this.afterpayClearpayPayments = afterpayClearpayPayments;
      this.almaPayments = almaPayments;
      this.amazonPayPayments = amazonPayPayments;
      this.auBecsDebitPayments = auBecsDebitPayments;
      this.automaticIndirectTax = automaticIndirectTax;
      this.bacsDebitPayments = bacsDebitPayments;
      this.bancontactPayments = bancontactPayments;
      this.bankTransferPayments = bankTransferPayments;
      this.billiePayments = billiePayments;
      this.blikPayments = blikPayments;
      this.boletoPayments = boletoPayments;
      this.cardIssuing = cardIssuing;
      this.cardPayments = cardPayments;
      this.cartesBancairesPayments = cartesBancairesPayments;
      this.cashappPayments = cashappPayments;
      this.cryptoPayments = cryptoPayments;
      this.epsPayments = epsPayments;
      this.extraParams = extraParams;
      this.fpxPayments = fpxPayments;
      this.gbBankTransferPayments = gbBankTransferPayments;
      this.giropayPayments = giropayPayments;
      this.gopayPayments = gopayPayments;
      this.grabpayPayments = grabpayPayments;
      this.idBankTransferPayments = idBankTransferPayments;
      this.idBankTransferPaymentsBca = idBankTransferPaymentsBca;
      this.idealPayments = idealPayments;
      this.indiaInternationalPayments = indiaInternationalPayments;
      this.jcbPayments = jcbPayments;
      this.jpBankTransferPayments = jpBankTransferPayments;
      this.kakaoPayPayments = kakaoPayPayments;
      this.klarnaPayments = klarnaPayments;
      this.konbiniPayments = konbiniPayments;
      this.krCardPayments = krCardPayments;
      this.legacyPayments = legacyPayments;
      this.linkPayments = linkPayments;
      this.mbWayPayments = mbWayPayments;
      this.mobilepayPayments = mobilepayPayments;
      this.multibancoPayments = multibancoPayments;
      this.mxBankTransferPayments = mxBankTransferPayments;
      this.naverPayPayments = naverPayPayments;
      this.nzBankAccountBecsDebitPayments = nzBankAccountBecsDebitPayments;
      this.oxxoPayments = oxxoPayments;
      this.p24Payments = p24Payments;
      this.payByBankPayments = payByBankPayments;
      this.paycoPayments = paycoPayments;
      this.paynowPayments = paynowPayments;
      this.paypalPayments = paypalPayments;
      this.paytoPayments = paytoPayments;
      this.pixPayments = pixPayments;
      this.promptpayPayments = promptpayPayments;
      this.qrisPayments = qrisPayments;
      this.rechnungPayments = rechnungPayments;
      this.revolutPayPayments = revolutPayPayments;
      this.samsungPayPayments = samsungPayPayments;
      this.satispayPayments = satispayPayments;
      this.sepaBankTransferPayments = sepaBankTransferPayments;
      this.sepaDebitPayments = sepaDebitPayments;
      this.shopeepayPayments = shopeepayPayments;
      this.sofortPayments = sofortPayments;
      this.stripeBalancePayments = stripeBalancePayments;
      this.swishPayments = swishPayments;
      this.taxReportingUs1099K = taxReportingUs1099K;
      this.taxReportingUs1099Misc = taxReportingUs1099Misc;
      this.transfers = transfers;
      this.treasury = treasury;
      this.treasuryEvolve = treasuryEvolve;
      this.treasuryFifthThird = treasuryFifthThird;
      this.treasuryGoldmanSachs = treasuryGoldmanSachs;
      this.twintPayments = twintPayments;
      this.usBankAccountAchPayments = usBankAccountAchPayments;
      this.usBankTransferPayments = usBankTransferPayments;
      this.zipPayments = zipPayments;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebitPayments acssDebitPayments;

      private AffirmPayments affirmPayments;

      private AfterpayClearpayPayments afterpayClearpayPayments;

      private AlmaPayments almaPayments;

      private AmazonPayPayments amazonPayPayments;

      private AuBecsDebitPayments auBecsDebitPayments;

      private AutomaticIndirectTax automaticIndirectTax;

      private BacsDebitPayments bacsDebitPayments;

      private BancontactPayments bancontactPayments;

      private BankTransferPayments bankTransferPayments;

      private BilliePayments billiePayments;

      private BlikPayments blikPayments;

      private BoletoPayments boletoPayments;

      private CardIssuing cardIssuing;

      private CardPayments cardPayments;

      private CartesBancairesPayments cartesBancairesPayments;

      private CashappPayments cashappPayments;

      private CryptoPayments cryptoPayments;

      private EpsPayments epsPayments;

      private Map<String, Object> extraParams;

      private FpxPayments fpxPayments;

      private GbBankTransferPayments gbBankTransferPayments;

      private GiropayPayments giropayPayments;

      private GopayPayments gopayPayments;

      private GrabpayPayments grabpayPayments;

      private IdBankTransferPayments idBankTransferPayments;

      private IdBankTransferPaymentsBca idBankTransferPaymentsBca;

      private IdealPayments idealPayments;

      private IndiaInternationalPayments indiaInternationalPayments;

      private JcbPayments jcbPayments;

      private JpBankTransferPayments jpBankTransferPayments;

      private KakaoPayPayments kakaoPayPayments;

      private KlarnaPayments klarnaPayments;

      private KonbiniPayments konbiniPayments;

      private KrCardPayments krCardPayments;

      private LegacyPayments legacyPayments;

      private LinkPayments linkPayments;

      private MbWayPayments mbWayPayments;

      private MobilepayPayments mobilepayPayments;

      private MultibancoPayments multibancoPayments;

      private MxBankTransferPayments mxBankTransferPayments;

      private NaverPayPayments naverPayPayments;

      private NzBankAccountBecsDebitPayments nzBankAccountBecsDebitPayments;

      private OxxoPayments oxxoPayments;

      private P24Payments p24Payments;

      private PayByBankPayments payByBankPayments;

      private PaycoPayments paycoPayments;

      private PaynowPayments paynowPayments;

      private PaypalPayments paypalPayments;

      private PaytoPayments paytoPayments;

      private PixPayments pixPayments;

      private PromptpayPayments promptpayPayments;

      private QrisPayments qrisPayments;

      private RechnungPayments rechnungPayments;

      private RevolutPayPayments revolutPayPayments;

      private SamsungPayPayments samsungPayPayments;

      private SatispayPayments satispayPayments;

      private SepaBankTransferPayments sepaBankTransferPayments;

      private SepaDebitPayments sepaDebitPayments;

      private ShopeepayPayments shopeepayPayments;

      private SofortPayments sofortPayments;

      private StripeBalancePayments stripeBalancePayments;

      private SwishPayments swishPayments;

      private TaxReportingUs1099K taxReportingUs1099K;

      private TaxReportingUs1099Misc taxReportingUs1099Misc;

      private Transfers transfers;

      private Treasury treasury;

      private TreasuryEvolve treasuryEvolve;

      private TreasuryFifthThird treasuryFifthThird;

      private TreasuryGoldmanSachs treasuryGoldmanSachs;

      private TwintPayments twintPayments;

      private UsBankAccountAchPayments usBankAccountAchPayments;

      private UsBankTransferPayments usBankTransferPayments;

      private ZipPayments zipPayments;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Capabilities build() {
        return new AccountCreateParams.Capabilities(
            this.acssDebitPayments,
            this.affirmPayments,
            this.afterpayClearpayPayments,
            this.almaPayments,
            this.amazonPayPayments,
            this.auBecsDebitPayments,
            this.automaticIndirectTax,
            this.bacsDebitPayments,
            this.bancontactPayments,
            this.bankTransferPayments,
            this.billiePayments,
            this.blikPayments,
            this.boletoPayments,
            this.cardIssuing,
            this.cardPayments,
            this.cartesBancairesPayments,
            this.cashappPayments,
            this.cryptoPayments,
            this.epsPayments,
            this.extraParams,
            this.fpxPayments,
            this.gbBankTransferPayments,
            this.giropayPayments,
            this.gopayPayments,
            this.grabpayPayments,
            this.idBankTransferPayments,
            this.idBankTransferPaymentsBca,
            this.idealPayments,
            this.indiaInternationalPayments,
            this.jcbPayments,
            this.jpBankTransferPayments,
            this.kakaoPayPayments,
            this.klarnaPayments,
            this.konbiniPayments,
            this.krCardPayments,
            this.legacyPayments,
            this.linkPayments,
            this.mbWayPayments,
            this.mobilepayPayments,
            this.multibancoPayments,
            this.mxBankTransferPayments,
            this.naverPayPayments,
            this.nzBankAccountBecsDebitPayments,
            this.oxxoPayments,
            this.p24Payments,
            this.payByBankPayments,
            this.paycoPayments,
            this.paynowPayments,
            this.paypalPayments,
            this.paytoPayments,
            this.pixPayments,
            this.promptpayPayments,
            this.qrisPayments,
            this.rechnungPayments,
            this.revolutPayPayments,
            this.samsungPayPayments,
            this.satispayPayments,
            this.sepaBankTransferPayments,
            this.sepaDebitPayments,
            this.shopeepayPayments,
            this.sofortPayments,
            this.stripeBalancePayments,
            this.swishPayments,
            this.taxReportingUs1099K,
            this.taxReportingUs1099Misc,
            this.transfers,
            this.treasury,
            this.treasuryEvolve,
            this.treasuryFifthThird,
            this.treasuryGoldmanSachs,
            this.twintPayments,
            this.usBankAccountAchPayments,
            this.usBankTransferPayments,
            this.zipPayments);
      }

      /** The acss_debit_payments capability. */
      public Builder setAcssDebitPayments(
          AccountCreateParams.Capabilities.AcssDebitPayments acssDebitPayments) {
        this.acssDebitPayments = acssDebitPayments;
        return this;
      }

      /** The affirm_payments capability. */
      public Builder setAffirmPayments(
          AccountCreateParams.Capabilities.AffirmPayments affirmPayments) {
        this.affirmPayments = affirmPayments;
        return this;
      }

      /** The afterpay_clearpay_payments capability. */
      public Builder setAfterpayClearpayPayments(
          AccountCreateParams.Capabilities.AfterpayClearpayPayments afterpayClearpayPayments) {
        this.afterpayClearpayPayments = afterpayClearpayPayments;
        return this;
      }

      /** The alma_payments capability. */
      public Builder setAlmaPayments(AccountCreateParams.Capabilities.AlmaPayments almaPayments) {
        this.almaPayments = almaPayments;
        return this;
      }

      /** The amazon_pay_payments capability. */
      public Builder setAmazonPayPayments(
          AccountCreateParams.Capabilities.AmazonPayPayments amazonPayPayments) {
        this.amazonPayPayments = amazonPayPayments;
        return this;
      }

      /** The au_becs_debit_payments capability. */
      public Builder setAuBecsDebitPayments(
          AccountCreateParams.Capabilities.AuBecsDebitPayments auBecsDebitPayments) {
        this.auBecsDebitPayments = auBecsDebitPayments;
        return this;
      }

      /** The automatic_indirect_tax capability. */
      public Builder setAutomaticIndirectTax(
          AccountCreateParams.Capabilities.AutomaticIndirectTax automaticIndirectTax) {
        this.automaticIndirectTax = automaticIndirectTax;
        return this;
      }

      /** The bacs_debit_payments capability. */
      public Builder setBacsDebitPayments(
          AccountCreateParams.Capabilities.BacsDebitPayments bacsDebitPayments) {
        this.bacsDebitPayments = bacsDebitPayments;
        return this;
      }

      /** The bancontact_payments capability. */
      public Builder setBancontactPayments(
          AccountCreateParams.Capabilities.BancontactPayments bancontactPayments) {
        this.bancontactPayments = bancontactPayments;
        return this;
      }

      /** The bank_transfer_payments capability. */
      public Builder setBankTransferPayments(
          AccountCreateParams.Capabilities.BankTransferPayments bankTransferPayments) {
        this.bankTransferPayments = bankTransferPayments;
        return this;
      }

      /** The billie_payments capability. */
      public Builder setBilliePayments(
          AccountCreateParams.Capabilities.BilliePayments billiePayments) {
        this.billiePayments = billiePayments;
        return this;
      }

      /** The blik_payments capability. */
      public Builder setBlikPayments(AccountCreateParams.Capabilities.BlikPayments blikPayments) {
        this.blikPayments = blikPayments;
        return this;
      }

      /** The boleto_payments capability. */
      public Builder setBoletoPayments(
          AccountCreateParams.Capabilities.BoletoPayments boletoPayments) {
        this.boletoPayments = boletoPayments;
        return this;
      }

      /** The card_issuing capability. */
      public Builder setCardIssuing(AccountCreateParams.Capabilities.CardIssuing cardIssuing) {
        this.cardIssuing = cardIssuing;
        return this;
      }

      /** The card_payments capability. */
      public Builder setCardPayments(AccountCreateParams.Capabilities.CardPayments cardPayments) {
        this.cardPayments = cardPayments;
        return this;
      }

      /** The cartes_bancaires_payments capability. */
      public Builder setCartesBancairesPayments(
          AccountCreateParams.Capabilities.CartesBancairesPayments cartesBancairesPayments) {
        this.cartesBancairesPayments = cartesBancairesPayments;
        return this;
      }

      /** The cashapp_payments capability. */
      public Builder setCashappPayments(
          AccountCreateParams.Capabilities.CashappPayments cashappPayments) {
        this.cashappPayments = cashappPayments;
        return this;
      }

      /** The crypto_payments capability. */
      public Builder setCryptoPayments(
          AccountCreateParams.Capabilities.CryptoPayments cryptoPayments) {
        this.cryptoPayments = cryptoPayments;
        return this;
      }

      /** The eps_payments capability. */
      public Builder setEpsPayments(AccountCreateParams.Capabilities.EpsPayments epsPayments) {
        this.epsPayments = epsPayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Capabilities#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Capabilities#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The fpx_payments capability. */
      public Builder setFpxPayments(AccountCreateParams.Capabilities.FpxPayments fpxPayments) {
        this.fpxPayments = fpxPayments;
        return this;
      }

      /** The gb_bank_transfer_payments capability. */
      public Builder setGbBankTransferPayments(
          AccountCreateParams.Capabilities.GbBankTransferPayments gbBankTransferPayments) {
        this.gbBankTransferPayments = gbBankTransferPayments;
        return this;
      }

      /** The giropay_payments capability. */
      public Builder setGiropayPayments(
          AccountCreateParams.Capabilities.GiropayPayments giropayPayments) {
        this.giropayPayments = giropayPayments;
        return this;
      }

      /** The gopay_payments capability. */
      public Builder setGopayPayments(
          AccountCreateParams.Capabilities.GopayPayments gopayPayments) {
        this.gopayPayments = gopayPayments;
        return this;
      }

      /** The grabpay_payments capability. */
      public Builder setGrabpayPayments(
          AccountCreateParams.Capabilities.GrabpayPayments grabpayPayments) {
        this.grabpayPayments = grabpayPayments;
        return this;
      }

      /** The id_bank_transfer_payments capability. */
      public Builder setIdBankTransferPayments(
          AccountCreateParams.Capabilities.IdBankTransferPayments idBankTransferPayments) {
        this.idBankTransferPayments = idBankTransferPayments;
        return this;
      }

      /** The id_bank_transfer_payments_bca capability. */
      public Builder setIdBankTransferPaymentsBca(
          AccountCreateParams.Capabilities.IdBankTransferPaymentsBca idBankTransferPaymentsBca) {
        this.idBankTransferPaymentsBca = idBankTransferPaymentsBca;
        return this;
      }

      /** The ideal_payments capability. */
      public Builder setIdealPayments(
          AccountCreateParams.Capabilities.IdealPayments idealPayments) {
        this.idealPayments = idealPayments;
        return this;
      }

      /** The india_international_payments capability. */
      public Builder setIndiaInternationalPayments(
          AccountCreateParams.Capabilities.IndiaInternationalPayments indiaInternationalPayments) {
        this.indiaInternationalPayments = indiaInternationalPayments;
        return this;
      }

      /** The jcb_payments capability. */
      public Builder setJcbPayments(AccountCreateParams.Capabilities.JcbPayments jcbPayments) {
        this.jcbPayments = jcbPayments;
        return this;
      }

      /** The jp_bank_transfer_payments capability. */
      public Builder setJpBankTransferPayments(
          AccountCreateParams.Capabilities.JpBankTransferPayments jpBankTransferPayments) {
        this.jpBankTransferPayments = jpBankTransferPayments;
        return this;
      }

      /** The kakao_pay_payments capability. */
      public Builder setKakaoPayPayments(
          AccountCreateParams.Capabilities.KakaoPayPayments kakaoPayPayments) {
        this.kakaoPayPayments = kakaoPayPayments;
        return this;
      }

      /** The klarna_payments capability. */
      public Builder setKlarnaPayments(
          AccountCreateParams.Capabilities.KlarnaPayments klarnaPayments) {
        this.klarnaPayments = klarnaPayments;
        return this;
      }

      /** The konbini_payments capability. */
      public Builder setKonbiniPayments(
          AccountCreateParams.Capabilities.KonbiniPayments konbiniPayments) {
        this.konbiniPayments = konbiniPayments;
        return this;
      }

      /** The kr_card_payments capability. */
      public Builder setKrCardPayments(
          AccountCreateParams.Capabilities.KrCardPayments krCardPayments) {
        this.krCardPayments = krCardPayments;
        return this;
      }

      /** The legacy_payments capability. */
      public Builder setLegacyPayments(
          AccountCreateParams.Capabilities.LegacyPayments legacyPayments) {
        this.legacyPayments = legacyPayments;
        return this;
      }

      /** The link_payments capability. */
      public Builder setLinkPayments(AccountCreateParams.Capabilities.LinkPayments linkPayments) {
        this.linkPayments = linkPayments;
        return this;
      }

      /** The mb_way_payments capability. */
      public Builder setMbWayPayments(
          AccountCreateParams.Capabilities.MbWayPayments mbWayPayments) {
        this.mbWayPayments = mbWayPayments;
        return this;
      }

      /** The mobilepay_payments capability. */
      public Builder setMobilepayPayments(
          AccountCreateParams.Capabilities.MobilepayPayments mobilepayPayments) {
        this.mobilepayPayments = mobilepayPayments;
        return this;
      }

      /** The multibanco_payments capability. */
      public Builder setMultibancoPayments(
          AccountCreateParams.Capabilities.MultibancoPayments multibancoPayments) {
        this.multibancoPayments = multibancoPayments;
        return this;
      }

      /** The mx_bank_transfer_payments capability. */
      public Builder setMxBankTransferPayments(
          AccountCreateParams.Capabilities.MxBankTransferPayments mxBankTransferPayments) {
        this.mxBankTransferPayments = mxBankTransferPayments;
        return this;
      }

      /** The naver_pay_payments capability. */
      public Builder setNaverPayPayments(
          AccountCreateParams.Capabilities.NaverPayPayments naverPayPayments) {
        this.naverPayPayments = naverPayPayments;
        return this;
      }

      /** The nz_bank_account_becs_debit_payments capability. */
      public Builder setNzBankAccountBecsDebitPayments(
          AccountCreateParams.Capabilities.NzBankAccountBecsDebitPayments
              nzBankAccountBecsDebitPayments) {
        this.nzBankAccountBecsDebitPayments = nzBankAccountBecsDebitPayments;
        return this;
      }

      /** The oxxo_payments capability. */
      public Builder setOxxoPayments(AccountCreateParams.Capabilities.OxxoPayments oxxoPayments) {
        this.oxxoPayments = oxxoPayments;
        return this;
      }

      /** The p24_payments capability. */
      public Builder setP24Payments(AccountCreateParams.Capabilities.P24Payments p24Payments) {
        this.p24Payments = p24Payments;
        return this;
      }

      /** The pay_by_bank_payments capability. */
      public Builder setPayByBankPayments(
          AccountCreateParams.Capabilities.PayByBankPayments payByBankPayments) {
        this.payByBankPayments = payByBankPayments;
        return this;
      }

      /** The payco_payments capability. */
      public Builder setPaycoPayments(
          AccountCreateParams.Capabilities.PaycoPayments paycoPayments) {
        this.paycoPayments = paycoPayments;
        return this;
      }

      /** The paynow_payments capability. */
      public Builder setPaynowPayments(
          AccountCreateParams.Capabilities.PaynowPayments paynowPayments) {
        this.paynowPayments = paynowPayments;
        return this;
      }

      /** The paypal_payments capability. */
      public Builder setPaypalPayments(
          AccountCreateParams.Capabilities.PaypalPayments paypalPayments) {
        this.paypalPayments = paypalPayments;
        return this;
      }

      /** The payto_payments capability. */
      public Builder setPaytoPayments(
          AccountCreateParams.Capabilities.PaytoPayments paytoPayments) {
        this.paytoPayments = paytoPayments;
        return this;
      }

      /** The pix_payments capability. */
      public Builder setPixPayments(AccountCreateParams.Capabilities.PixPayments pixPayments) {
        this.pixPayments = pixPayments;
        return this;
      }

      /** The promptpay_payments capability. */
      public Builder setPromptpayPayments(
          AccountCreateParams.Capabilities.PromptpayPayments promptpayPayments) {
        this.promptpayPayments = promptpayPayments;
        return this;
      }

      /** The qris_payments capability. */
      public Builder setQrisPayments(AccountCreateParams.Capabilities.QrisPayments qrisPayments) {
        this.qrisPayments = qrisPayments;
        return this;
      }

      /** The rechnung_payments capability. */
      public Builder setRechnungPayments(
          AccountCreateParams.Capabilities.RechnungPayments rechnungPayments) {
        this.rechnungPayments = rechnungPayments;
        return this;
      }

      /** The revolut_pay_payments capability. */
      public Builder setRevolutPayPayments(
          AccountCreateParams.Capabilities.RevolutPayPayments revolutPayPayments) {
        this.revolutPayPayments = revolutPayPayments;
        return this;
      }

      /** The samsung_pay_payments capability. */
      public Builder setSamsungPayPayments(
          AccountCreateParams.Capabilities.SamsungPayPayments samsungPayPayments) {
        this.samsungPayPayments = samsungPayPayments;
        return this;
      }

      /** The satispay_payments capability. */
      public Builder setSatispayPayments(
          AccountCreateParams.Capabilities.SatispayPayments satispayPayments) {
        this.satispayPayments = satispayPayments;
        return this;
      }

      /** The sepa_bank_transfer_payments capability. */
      public Builder setSepaBankTransferPayments(
          AccountCreateParams.Capabilities.SepaBankTransferPayments sepaBankTransferPayments) {
        this.sepaBankTransferPayments = sepaBankTransferPayments;
        return this;
      }

      /** The sepa_debit_payments capability. */
      public Builder setSepaDebitPayments(
          AccountCreateParams.Capabilities.SepaDebitPayments sepaDebitPayments) {
        this.sepaDebitPayments = sepaDebitPayments;
        return this;
      }

      /** The shopeepay_payments capability. */
      public Builder setShopeepayPayments(
          AccountCreateParams.Capabilities.ShopeepayPayments shopeepayPayments) {
        this.shopeepayPayments = shopeepayPayments;
        return this;
      }

      /** The sofort_payments capability. */
      public Builder setSofortPayments(
          AccountCreateParams.Capabilities.SofortPayments sofortPayments) {
        this.sofortPayments = sofortPayments;
        return this;
      }

      /** The stripe_balance_payments capability. */
      public Builder setStripeBalancePayments(
          AccountCreateParams.Capabilities.StripeBalancePayments stripeBalancePayments) {
        this.stripeBalancePayments = stripeBalancePayments;
        return this;
      }

      /** The swish_payments capability. */
      public Builder setSwishPayments(
          AccountCreateParams.Capabilities.SwishPayments swishPayments) {
        this.swishPayments = swishPayments;
        return this;
      }

      /** The tax_reporting_us_1099_k capability. */
      public Builder setTaxReportingUs1099K(
          AccountCreateParams.Capabilities.TaxReportingUs1099K taxReportingUs1099K) {
        this.taxReportingUs1099K = taxReportingUs1099K;
        return this;
      }

      /** The tax_reporting_us_1099_misc capability. */
      public Builder setTaxReportingUs1099Misc(
          AccountCreateParams.Capabilities.TaxReportingUs1099Misc taxReportingUs1099Misc) {
        this.taxReportingUs1099Misc = taxReportingUs1099Misc;
        return this;
      }

      /** The transfers capability. */
      public Builder setTransfers(AccountCreateParams.Capabilities.Transfers transfers) {
        this.transfers = transfers;
        return this;
      }

      /** The treasury capability. */
      public Builder setTreasury(AccountCreateParams.Capabilities.Treasury treasury) {
        this.treasury = treasury;
        return this;
      }

      /** The treasury_evolve capability. */
      public Builder setTreasuryEvolve(
          AccountCreateParams.Capabilities.TreasuryEvolve treasuryEvolve) {
        this.treasuryEvolve = treasuryEvolve;
        return this;
      }

      /** The treasury_fifth_third capability. */
      public Builder setTreasuryFifthThird(
          AccountCreateParams.Capabilities.TreasuryFifthThird treasuryFifthThird) {
        this.treasuryFifthThird = treasuryFifthThird;
        return this;
      }

      /** The treasury_goldman_sachs capability. */
      public Builder setTreasuryGoldmanSachs(
          AccountCreateParams.Capabilities.TreasuryGoldmanSachs treasuryGoldmanSachs) {
        this.treasuryGoldmanSachs = treasuryGoldmanSachs;
        return this;
      }

      /** The twint_payments capability. */
      public Builder setTwintPayments(
          AccountCreateParams.Capabilities.TwintPayments twintPayments) {
        this.twintPayments = twintPayments;
        return this;
      }

      /** The us_bank_account_ach_payments capability. */
      public Builder setUsBankAccountAchPayments(
          AccountCreateParams.Capabilities.UsBankAccountAchPayments usBankAccountAchPayments) {
        this.usBankAccountAchPayments = usBankAccountAchPayments;
        return this;
      }

      /** The us_bank_transfer_payments capability. */
      public Builder setUsBankTransferPayments(
          AccountCreateParams.Capabilities.UsBankTransferPayments usBankTransferPayments) {
        this.usBankTransferPayments = usBankTransferPayments;
        return this;
      }

      /** The zip_payments capability. */
      public Builder setZipPayments(AccountCreateParams.Capabilities.ZipPayments zipPayments) {
        this.zipPayments = zipPayments;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebitPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AcssDebitPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AcssDebitPayments build() {
          return new AccountCreateParams.Capabilities.AcssDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AcssDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AcssDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AffirmPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AffirmPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AffirmPayments build() {
          return new AccountCreateParams.Capabilities.AffirmPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AffirmPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AffirmPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AfterpayClearpayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AfterpayClearpayPayments build() {
          return new AccountCreateParams.Capabilities.AfterpayClearpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AfterpayClearpayPayments#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AfterpayClearpayPayments#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AlmaPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AlmaPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AlmaPayments build() {
          return new AccountCreateParams.Capabilities.AlmaPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AlmaPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AlmaPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AmazonPayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AmazonPayPayments build() {
          return new AccountCreateParams.Capabilities.AmazonPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AmazonPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AmazonPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebitPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AuBecsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AuBecsDebitPayments build() {
          return new AccountCreateParams.Capabilities.AuBecsDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AuBecsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AuBecsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AutomaticIndirectTax {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private AutomaticIndirectTax(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.AutomaticIndirectTax build() {
          return new AccountCreateParams.Capabilities.AutomaticIndirectTax(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AutomaticIndirectTax#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.AutomaticIndirectTax#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebitPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BacsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BacsDebitPayments build() {
          return new AccountCreateParams.Capabilities.BacsDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BacsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BacsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BancontactPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BancontactPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BancontactPayments build() {
          return new AccountCreateParams.Capabilities.BancontactPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BancontactPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BancontactPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BankTransferPayments build() {
          return new AccountCreateParams.Capabilities.BankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BilliePayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BilliePayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BilliePayments build() {
          return new AccountCreateParams.Capabilities.BilliePayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BilliePayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BilliePayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BlikPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BlikPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BlikPayments build() {
          return new AccountCreateParams.Capabilities.BlikPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BlikPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BlikPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BoletoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private BoletoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.BoletoPayments build() {
          return new AccountCreateParams.Capabilities.BoletoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BoletoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.BoletoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuing {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private CardIssuing(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.CardIssuing build() {
          return new AccountCreateParams.Capabilities.CardIssuing(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CardIssuing#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CardIssuing#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private CardPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.CardPayments build() {
          return new AccountCreateParams.Capabilities.CardPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CardPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CardPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CartesBancairesPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private CartesBancairesPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.CartesBancairesPayments build() {
          return new AccountCreateParams.Capabilities.CartesBancairesPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CartesBancairesPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CartesBancairesPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CashappPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private CashappPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.CashappPayments build() {
          return new AccountCreateParams.Capabilities.CashappPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CashappPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CashappPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private CryptoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.CryptoPayments build() {
          return new AccountCreateParams.Capabilities.CryptoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CryptoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.CryptoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EpsPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private EpsPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.EpsPayments build() {
          return new AccountCreateParams.Capabilities.EpsPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.EpsPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.EpsPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FpxPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private FpxPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.FpxPayments build() {
          return new AccountCreateParams.Capabilities.FpxPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.FpxPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.FpxPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GbBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private GbBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.GbBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.GbBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GbBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GbBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GiropayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private GiropayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.GiropayPayments build() {
          return new AccountCreateParams.Capabilities.GiropayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GiropayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GiropayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GopayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private GopayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.GopayPayments build() {
          return new AccountCreateParams.Capabilities.GopayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GopayPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GopayPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GrabpayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private GrabpayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.GrabpayPayments build() {
          return new AccountCreateParams.Capabilities.GrabpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GrabpayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.GrabpayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IdBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private IdBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.IdBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.IdBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IdBankTransferPaymentsBca {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private IdBankTransferPaymentsBca(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.IdBankTransferPaymentsBca build() {
          return new AccountCreateParams.Capabilities.IdBankTransferPaymentsBca(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdBankTransferPaymentsBca#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdBankTransferPaymentsBca#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IdealPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private IdealPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.IdealPayments build() {
          return new AccountCreateParams.Capabilities.IdealPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdealPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IdealPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IndiaInternationalPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private IndiaInternationalPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.IndiaInternationalPayments build() {
          return new AccountCreateParams.Capabilities.IndiaInternationalPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IndiaInternationalPayments#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.IndiaInternationalPayments#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class JcbPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private JcbPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.JcbPayments build() {
          return new AccountCreateParams.Capabilities.JcbPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.JcbPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.JcbPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class JpBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private JpBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.JpBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.JpBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.JpBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.JpBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private KakaoPayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.KakaoPayPayments build() {
          return new AccountCreateParams.Capabilities.KakaoPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KakaoPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KakaoPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class KlarnaPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private KlarnaPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.KlarnaPayments build() {
          return new AccountCreateParams.Capabilities.KlarnaPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KlarnaPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KlarnaPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class KonbiniPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private KonbiniPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.KonbiniPayments build() {
          return new AccountCreateParams.Capabilities.KonbiniPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KonbiniPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KonbiniPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class KrCardPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private KrCardPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.KrCardPayments build() {
          return new AccountCreateParams.Capabilities.KrCardPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KrCardPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.KrCardPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LegacyPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private LegacyPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.LegacyPayments build() {
          return new AccountCreateParams.Capabilities.LegacyPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.LegacyPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.LegacyPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LinkPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private LinkPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.LinkPayments build() {
          return new AccountCreateParams.Capabilities.LinkPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.LinkPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.LinkPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MbWayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private MbWayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.MbWayPayments build() {
          return new AccountCreateParams.Capabilities.MbWayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MbWayPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MbWayPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MobilepayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private MobilepayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.MobilepayPayments build() {
          return new AccountCreateParams.Capabilities.MobilepayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MobilepayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MobilepayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MultibancoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private MultibancoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.MultibancoPayments build() {
          return new AccountCreateParams.Capabilities.MultibancoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MultibancoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MultibancoPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MxBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private MxBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.MxBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.MxBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MxBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.MxBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private NaverPayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.NaverPayPayments build() {
          return new AccountCreateParams.Capabilities.NaverPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.NaverPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.NaverPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NzBankAccountBecsDebitPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private NzBankAccountBecsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.NzBankAccountBecsDebitPayments build() {
          return new AccountCreateParams.Capabilities.NzBankAccountBecsDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Capabilities.NzBankAccountBecsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Capabilities.NzBankAccountBecsDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OxxoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private OxxoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.OxxoPayments build() {
          return new AccountCreateParams.Capabilities.OxxoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.OxxoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.OxxoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class P24Payments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private P24Payments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.P24Payments build() {
          return new AccountCreateParams.Capabilities.P24Payments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.P24Payments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.P24Payments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayByBankPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PayByBankPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PayByBankPayments build() {
          return new AccountCreateParams.Capabilities.PayByBankPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PayByBankPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PayByBankPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaycoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PaycoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PaycoPayments build() {
          return new AccountCreateParams.Capabilities.PaycoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaycoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaycoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaynowPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PaynowPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PaynowPayments build() {
          return new AccountCreateParams.Capabilities.PaynowPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaynowPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaynowPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaypalPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PaypalPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PaypalPayments build() {
          return new AccountCreateParams.Capabilities.PaypalPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaypalPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaypalPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaytoPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PaytoPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PaytoPayments build() {
          return new AccountCreateParams.Capabilities.PaytoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaytoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PaytoPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PixPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PixPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PixPayments build() {
          return new AccountCreateParams.Capabilities.PixPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PixPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PixPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PromptpayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private PromptpayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.PromptpayPayments build() {
          return new AccountCreateParams.Capabilities.PromptpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PromptpayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.PromptpayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class QrisPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private QrisPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.QrisPayments build() {
          return new AccountCreateParams.Capabilities.QrisPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.QrisPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.QrisPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RechnungPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private RechnungPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.RechnungPayments build() {
          return new AccountCreateParams.Capabilities.RechnungPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.RechnungPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.RechnungPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private RevolutPayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.RevolutPayPayments build() {
          return new AccountCreateParams.Capabilities.RevolutPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.RevolutPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.RevolutPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SamsungPayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SamsungPayPayments build() {
          return new AccountCreateParams.Capabilities.SamsungPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SamsungPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SamsungPayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SatispayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SatispayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SatispayPayments build() {
          return new AccountCreateParams.Capabilities.SatispayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SatispayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SatispayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SepaBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SepaBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.SepaBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SepaBankTransferPayments#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SepaBankTransferPayments#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebitPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SepaDebitPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SepaDebitPayments build() {
          return new AccountCreateParams.Capabilities.SepaDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SepaDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SepaDebitPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ShopeepayPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private ShopeepayPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.ShopeepayPayments build() {
          return new AccountCreateParams.Capabilities.ShopeepayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.ShopeepayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.ShopeepayPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SofortPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SofortPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SofortPayments build() {
          return new AccountCreateParams.Capabilities.SofortPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SofortPayments#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SofortPayments#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeBalancePayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private StripeBalancePayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.StripeBalancePayments build() {
          return new AccountCreateParams.Capabilities.StripeBalancePayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.StripeBalancePayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.StripeBalancePayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SwishPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private SwishPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.SwishPayments build() {
          return new AccountCreateParams.Capabilities.SwishPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SwishPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.SwishPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxReportingUs1099K {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TaxReportingUs1099K(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TaxReportingUs1099K build() {
          return new AccountCreateParams.Capabilities.TaxReportingUs1099K(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TaxReportingUs1099K#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TaxReportingUs1099K#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxReportingUs1099Misc {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TaxReportingUs1099Misc(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TaxReportingUs1099Misc build() {
          return new AccountCreateParams.Capabilities.TaxReportingUs1099Misc(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TaxReportingUs1099Misc#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TaxReportingUs1099Misc#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Transfers {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private Transfers(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.Transfers build() {
          return new AccountCreateParams.Capabilities.Transfers(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.Transfers#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.Transfers#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Treasury {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private Treasury(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.Treasury build() {
          return new AccountCreateParams.Capabilities.Treasury(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.Treasury#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.Treasury#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TreasuryEvolve {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TreasuryEvolve(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TreasuryEvolve build() {
          return new AccountCreateParams.Capabilities.TreasuryEvolve(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryEvolve#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryEvolve#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TreasuryFifthThird {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TreasuryFifthThird(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TreasuryFifthThird build() {
          return new AccountCreateParams.Capabilities.TreasuryFifthThird(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryFifthThird#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryFifthThird#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TreasuryGoldmanSachs {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TreasuryGoldmanSachs(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TreasuryGoldmanSachs build() {
          return new AccountCreateParams.Capabilities.TreasuryGoldmanSachs(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryGoldmanSachs#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TreasuryGoldmanSachs#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TwintPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private TwintPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.TwintPayments build() {
          return new AccountCreateParams.Capabilities.TwintPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TwintPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.TwintPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccountAchPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private UsBankAccountAchPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.UsBankAccountAchPayments build() {
          return new AccountCreateParams.Capabilities.UsBankAccountAchPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.UsBankAccountAchPayments#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.UsBankAccountAchPayments#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankTransferPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private UsBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.UsBankTransferPayments build() {
          return new AccountCreateParams.Capabilities.UsBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.UsBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.UsBankTransferPayments#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ZipPayments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Passing true requests the capability for the account, if it is not already requested. A
       * requested capability may not immediately become active. Any requirements to activate the
       * capability are returned in the {@code requirements} arrays.
       */
      @SerializedName("requested")
      Boolean requested;

      private ZipPayments(Map<String, Object> extraParams, Boolean requested) {
        this.extraParams = extraParams;
        this.requested = requested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Capabilities.ZipPayments build() {
          return new AccountCreateParams.Capabilities.ZipPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.ZipPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Capabilities.ZipPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A
         * requested capability may not immediately become active. Any requirements to activate the
         * capability are returned in the {@code requirements} arrays.
         */
        public Builder setRequested(Boolean requested) {
          this.requested = requested;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Company {
    /** The company's primary address. */
    @SerializedName("address")
    Address address;

    /** The Kana variation of the company's primary address (Japan only). */
    @SerializedName("address_kana")
    AddressKana addressKana;

    /** The Kanji variation of the company's primary address (Japan only). */
    @SerializedName("address_kanji")
    AddressKanji addressKanji;

    /**
     * Whether the company's directors have been provided. Set this Boolean to {@code true} after
     * creating all the company's directors with <a href="https://stripe.com/api/persons">the
     * Persons API</a> for accounts with a {@code relationship.director} requirement. This value is
     * not automatically set to {@code true} after creating directors, so it needs to be updated to
     * indicate all directors have been provided.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * This hash is used to attest that the directors information provided to Stripe is both current
     * and correct.
     */
    @SerializedName("directorship_declaration")
    DirectorshipDeclaration directorshipDeclaration;

    /**
     * Whether the company's executives have been provided. Set this Boolean to {@code true} after
     * creating all the company's executives with <a href="https://stripe.com/api/persons">the
     * Persons API</a> for accounts with a {@code relationship.executive} requirement.
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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
     * Whether the company's owners have been provided. Set this Boolean to {@code true} after
     * creating all the company's owners with <a href="https://stripe.com/api/persons">the Persons
     * API</a> for accounts with a {@code relationship.owner} requirement.
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
     */
    @SerializedName("ownership_exemption_reason")
    ApiRequestParams.EnumParam ownershipExemptionReason;

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    String phone;

    /** When the business was incorporated or registered. */
    @SerializedName("registration_date")
    Object registrationDate;

    /**
     * The identification number given to a company when it is registered or incorporated, if
     * distinct from the identification number used for filing taxes. (Examples are the CIN for
     * companies and LLP IN for partnerships in India, and the Company Registration Number in Hong
     * Kong).
     */
    @SerializedName("registration_number")
    String registrationNumber;

    /**
     * The category identifying the legal structure of the company or legal entity. See <a
     * href="https://stripe.com/connect/identity-verification#business-structure">Business
     * structure</a> for more details. Pass an empty string to unset this value.
     */
    @SerializedName("structure")
    ApiRequestParams.EnumParam structure;

    /**
     * The business ID number of the company, as appropriate for the company’s country. (Examples
     * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
     * the UK.)
     */
    @SerializedName("tax_id")
    String taxId;

    /**
     * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies only).
     */
    @SerializedName("tax_id_registrar")
    String taxIdRegistrar;

    /** The VAT number of the company. */
    @SerializedName("vat_id")
    String vatId;

    /** Information on the verification state of the company. */
    @SerializedName("verification")
    Verification verification;

    private Company(
        Address address,
        AddressKana addressKana,
        AddressKanji addressKanji,
        Boolean directorsProvided,
        DirectorshipDeclaration directorshipDeclaration,
        Boolean executivesProvided,
        String exportLicenseId,
        String exportPurposeCode,
        Map<String, Object> extraParams,
        String name,
        String nameKana,
        String nameKanji,
        Boolean ownersProvided,
        OwnershipDeclaration ownershipDeclaration,
        ApiRequestParams.EnumParam ownershipExemptionReason,
        String phone,
        Object registrationDate,
        String registrationNumber,
        ApiRequestParams.EnumParam structure,
        String taxId,
        String taxIdRegistrar,
        String vatId,
        Verification verification) {
      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.directorsProvided = directorsProvided;
      this.directorshipDeclaration = directorshipDeclaration;
      this.executivesProvided = executivesProvided;
      this.exportLicenseId = exportLicenseId;
      this.exportPurposeCode = exportPurposeCode;
      this.extraParams = extraParams;
      this.name = name;
      this.nameKana = nameKana;
      this.nameKanji = nameKanji;
      this.ownersProvided = ownersProvided;
      this.ownershipDeclaration = ownershipDeclaration;
      this.ownershipExemptionReason = ownershipExemptionReason;
      this.phone = phone;
      this.registrationDate = registrationDate;
      this.registrationNumber = registrationNumber;
      this.structure = structure;
      this.taxId = taxId;
      this.taxIdRegistrar = taxIdRegistrar;
      this.vatId = vatId;
      this.verification = verification;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private AddressKana addressKana;

      private AddressKanji addressKanji;

      private Boolean directorsProvided;

      private DirectorshipDeclaration directorshipDeclaration;

      private Boolean executivesProvided;

      private String exportLicenseId;

      private String exportPurposeCode;

      private Map<String, Object> extraParams;

      private String name;

      private String nameKana;

      private String nameKanji;

      private Boolean ownersProvided;

      private OwnershipDeclaration ownershipDeclaration;

      private ApiRequestParams.EnumParam ownershipExemptionReason;

      private String phone;

      private Object registrationDate;

      private String registrationNumber;

      private ApiRequestParams.EnumParam structure;

      private String taxId;

      private String taxIdRegistrar;

      private String vatId;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Company build() {
        return new AccountCreateParams.Company(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.directorsProvided,
            this.directorshipDeclaration,
            this.executivesProvided,
            this.exportLicenseId,
            this.exportPurposeCode,
            this.extraParams,
            this.name,
            this.nameKana,
            this.nameKanji,
            this.ownersProvided,
            this.ownershipDeclaration,
            this.ownershipExemptionReason,
            this.phone,
            this.registrationDate,
            this.registrationNumber,
            this.structure,
            this.taxId,
            this.taxIdRegistrar,
            this.vatId,
            this.verification);
      }

      /** The company's primary address. */
      public Builder setAddress(AccountCreateParams.Company.Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the company's primary address (Japan only). */
      public Builder setAddressKana(AccountCreateParams.Company.AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the company's primary address (Japan only). */
      public Builder setAddressKanji(AccountCreateParams.Company.AddressKanji addressKanji) {
        this.addressKanji = addressKanji;
        return this;
      }

      /**
       * Whether the company's directors have been provided. Set this Boolean to {@code true} after
       * creating all the company's directors with <a href="https://stripe.com/api/persons">the
       * Persons API</a> for accounts with a {@code relationship.director} requirement. This value
       * is not automatically set to {@code true} after creating directors, so it needs to be
       * updated to indicate all directors have been provided.
       */
      public Builder setDirectorsProvided(Boolean directorsProvided) {
        this.directorsProvided = directorsProvided;
        return this;
      }

      /**
       * This hash is used to attest that the directors information provided to Stripe is both
       * current and correct.
       */
      public Builder setDirectorshipDeclaration(
          AccountCreateParams.Company.DirectorshipDeclaration directorshipDeclaration) {
        this.directorshipDeclaration = directorshipDeclaration;
        return this;
      }

      /**
       * Whether the company's executives have been provided. Set this Boolean to {@code true} after
       * creating all the company's executives with <a href="https://stripe.com/api/persons">the
       * Persons API</a> for accounts with a {@code relationship.executive} requirement.
       */
      public Builder setExecutivesProvided(Boolean executivesProvided) {
        this.executivesProvided = executivesProvided;
        return this;
      }

      /**
       * The export license ID number of the company, also referred as Import Export Code (India
       * only).
       */
      public Builder setExportLicenseId(String exportLicenseId) {
        this.exportLicenseId = exportLicenseId;
        return this;
      }

      /** The purpose code to use for export transactions (India only). */
      public Builder setExportPurposeCode(String exportPurposeCode) {
        this.exportPurposeCode = exportPurposeCode;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Company#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Company#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The company's legal name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The Kana variation of the company's legal name (Japan only). */
      public Builder setNameKana(String nameKana) {
        this.nameKana = nameKana;
        return this;
      }

      /** The Kanji variation of the company's legal name (Japan only). */
      public Builder setNameKanji(String nameKanji) {
        this.nameKanji = nameKanji;
        return this;
      }

      /**
       * Whether the company's owners have been provided. Set this Boolean to {@code true} after
       * creating all the company's owners with <a href="https://stripe.com/api/persons">the Persons
       * API</a> for accounts with a {@code relationship.owner} requirement.
       */
      public Builder setOwnersProvided(Boolean ownersProvided) {
        this.ownersProvided = ownersProvided;
        return this;
      }

      /**
       * This hash is used to attest that the beneficial owner information provided to Stripe is
       * both current and correct.
       */
      public Builder setOwnershipDeclaration(
          AccountCreateParams.Company.OwnershipDeclaration ownershipDeclaration) {
        this.ownershipDeclaration = ownershipDeclaration;
        return this;
      }

      /**
       * This value is used to determine if a business is exempt from providing ultimate beneficial
       * owners. See <a
       * href="https://support.stripe.com/questions/exemption-from-providing-ownership-details">this
       * support article</a> and <a
       * href="https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api">changelog</a>
       * for more details.
       */
      public Builder setOwnershipExemptionReason(
          AccountCreateParams.Company.OwnershipExemptionReason ownershipExemptionReason) {
        this.ownershipExemptionReason = ownershipExemptionReason;
        return this;
      }

      /**
       * This value is used to determine if a business is exempt from providing ultimate beneficial
       * owners. See <a
       * href="https://support.stripe.com/questions/exemption-from-providing-ownership-details">this
       * support article</a> and <a
       * href="https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api">changelog</a>
       * for more details.
       */
      public Builder setOwnershipExemptionReason(EmptyParam ownershipExemptionReason) {
        this.ownershipExemptionReason = ownershipExemptionReason;
        return this;
      }

      /** The company's phone number (used for verification). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** When the business was incorporated or registered. */
      public Builder setRegistrationDate(
          AccountCreateParams.Company.RegistrationDate registrationDate) {
        this.registrationDate = registrationDate;
        return this;
      }

      /** When the business was incorporated or registered. */
      public Builder setRegistrationDate(EmptyParam registrationDate) {
        this.registrationDate = registrationDate;
        return this;
      }

      /**
       * The identification number given to a company when it is registered or incorporated, if
       * distinct from the identification number used for filing taxes. (Examples are the CIN for
       * companies and LLP IN for partnerships in India, and the Company Registration Number in Hong
       * Kong).
       */
      public Builder setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
      }

      /**
       * The category identifying the legal structure of the company or legal entity. See <a
       * href="https://stripe.com/connect/identity-verification#business-structure">Business
       * structure</a> for more details. Pass an empty string to unset this value.
       */
      public Builder setStructure(AccountCreateParams.Company.Structure structure) {
        this.structure = structure;
        return this;
      }

      /**
       * The category identifying the legal structure of the company or legal entity. See <a
       * href="https://stripe.com/connect/identity-verification#business-structure">Business
       * structure</a> for more details. Pass an empty string to unset this value.
       */
      public Builder setStructure(EmptyParam structure) {
        this.structure = structure;
        return this;
      }

      /**
       * The business ID number of the company, as appropriate for the company’s country. (Examples
       * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
       * the UK.)
       */
      public Builder setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
      }

      /**
       * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies only).
       */
      public Builder setTaxIdRegistrar(String taxIdRegistrar) {
        this.taxIdRegistrar = taxIdRegistrar;
        return this;
      }

      /** The VAT number of the company. */
      public Builder setVatId(String vatId) {
        this.vatId = vatId;
        return this;
      }

      /** Information on the verification state of the company. */
      public Builder setVerification(AccountCreateParams.Company.Verification verification) {
        this.verification = verification;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.Address build() {
          return new AccountCreateParams.Company.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.Address#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKana {
      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Block or building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** Postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town or cho-me. */
      @SerializedName("town")
      String town;

      private AddressKana(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state,
          String town) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
        this.town = town;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        private String town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.AddressKana build() {
          return new AccountCreateParams.Company.AddressKana(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
        }

        /** City or ward. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.AddressKana#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.AddressKana#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKanji {
      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Block or building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** Postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town or cho-me. */
      @SerializedName("town")
      String town;

      private AddressKanji(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state,
          String town) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
        this.town = town;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        private String town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.AddressKanji build() {
          return new AccountCreateParams.Company.AddressKanji(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
        }

        /** City or ward. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.AddressKanji#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.AddressKanji#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class DirectorshipDeclaration {
      /** The Unix timestamp marking when the directorship declaration attestation was made. */
      @SerializedName("date")
      Long date;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The IP address from which the directorship declaration attestation was made. */
      @SerializedName("ip")
      String ip;

      /**
       * The user agent of the browser from which the directorship declaration attestation was made.
       */
      @SerializedName("user_agent")
      String userAgent;

      private DirectorshipDeclaration(
          Long date, Map<String, Object> extraParams, String ip, String userAgent) {
        this.date = date;
        this.extraParams = extraParams;
        this.ip = ip;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long date;

        private Map<String, Object> extraParams;

        private String ip;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.DirectorshipDeclaration build() {
          return new AccountCreateParams.Company.DirectorshipDeclaration(
              this.date, this.extraParams, this.ip, this.userAgent);
        }

        /** The Unix timestamp marking when the directorship declaration attestation was made. */
        public Builder setDate(Long date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.DirectorshipDeclaration#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.DirectorshipDeclaration#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The IP address from which the directorship declaration attestation was made. */
        public Builder setIp(String ip) {
          this.ip = ip;
          return this;
        }

        /**
         * The user agent of the browser from which the directorship declaration attestation was
         * made.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OwnershipDeclaration {
      /** The Unix timestamp marking when the beneficial owner attestation was made. */
      @SerializedName("date")
      Long date;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The IP address from which the beneficial owner attestation was made. */
      @SerializedName("ip")
      String ip;

      /** The user agent of the browser from which the beneficial owner attestation was made. */
      @SerializedName("user_agent")
      String userAgent;

      private OwnershipDeclaration(
          Long date, Map<String, Object> extraParams, String ip, String userAgent) {
        this.date = date;
        this.extraParams = extraParams;
        this.ip = ip;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long date;

        private Map<String, Object> extraParams;

        private String ip;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.OwnershipDeclaration build() {
          return new AccountCreateParams.Company.OwnershipDeclaration(
              this.date, this.extraParams, this.ip, this.userAgent);
        }

        /** The Unix timestamp marking when the beneficial owner attestation was made. */
        public Builder setDate(Long date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.OwnershipDeclaration#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.OwnershipDeclaration#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The IP address from which the beneficial owner attestation was made. */
        public Builder setIp(String ip) {
          this.ip = ip;
          return this;
        }

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RegistrationDate {
      /** <strong>Required.</strong> The day of registration, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The month of registration, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** <strong>Required.</strong> The four-digit year of registration. */
      @SerializedName("year")
      Long year;

      private RegistrationDate(Long day, Map<String, Object> extraParams, Long month, Long year) {
        this.day = day;
        this.extraParams = extraParams;
        this.month = month;
        this.year = year;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long day;

        private Map<String, Object> extraParams;

        private Long month;

        private Long year;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.RegistrationDate build() {
          return new AccountCreateParams.Company.RegistrationDate(
              this.day, this.extraParams, this.month, this.year);
        }

        /** <strong>Required.</strong> The day of registration, between 1 and 31. */
        public Builder setDay(Long day) {
          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.RegistrationDate#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.RegistrationDate#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The month of registration, between 1 and 12. */
        public Builder setMonth(Long month) {
          this.month = month;
          return this;
        }

        /** <strong>Required.</strong> The four-digit year of registration. */
        public Builder setYear(Long year) {
          this.year = year;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Verification {
      /** A document verifying the business. */
      @SerializedName("document")
      Document document;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Verification(Document document, Map<String, Object> extraParams) {
        this.document = document;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Document document;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Company.Verification build() {
          return new AccountCreateParams.Company.Verification(this.document, this.extraParams);
        }

        /** A document verifying the business. */
        public Builder setDocument(AccountCreateParams.Company.Verification.Document document) {
          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.Verification#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Company.Verification#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Document {
        /**
         * The back of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
         * size.
         */
        @SerializedName("back")
        String back;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The front of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
         * size.
         */
        @SerializedName("front")
        String front;

        private Document(String back, Map<String, Object> extraParams, String front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String back;

          private Map<String, Object> extraParams;

          private String front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Company.Verification.Document build() {
            return new AccountCreateParams.Company.Verification.Document(
                this.back, this.extraParams, this.front);
          }

          /**
           * The back of a document returned by a <a
           * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
           * value of {@code additional_verification}. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Company.Verification.Document#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Company.Verification.Document#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The front of a document returned by a <a
           * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
           * value of {@code additional_verification}. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }
        }
      }
    }

    public enum OwnershipExemptionReason implements ApiRequestParams.EnumParam {
      @SerializedName("qualified_entity_exceeds_ownership_threshold")
      QUALIFIED_ENTITY_EXCEEDS_OWNERSHIP_THRESHOLD("qualified_entity_exceeds_ownership_threshold"),

      @SerializedName("qualifies_as_financial_institution")
      QUALIFIES_AS_FINANCIAL_INSTITUTION("qualifies_as_financial_institution");

      @Getter(onMethod_ = {@Override})
      private final String value;

      OwnershipExemptionReason(String value) {
        this.value = value;
      }
    }

    public enum Structure implements ApiRequestParams.EnumParam {
      @SerializedName("free_zone_establishment")
      FREE_ZONE_ESTABLISHMENT("free_zone_establishment"),

      @SerializedName("free_zone_llc")
      FREE_ZONE_LLC("free_zone_llc"),

      @SerializedName("government_instrumentality")
      GOVERNMENT_INSTRUMENTALITY("government_instrumentality"),

      @SerializedName("governmental_unit")
      GOVERNMENTAL_UNIT("governmental_unit"),

      @SerializedName("incorporated_non_profit")
      INCORPORATED_NON_PROFIT("incorporated_non_profit"),

      @SerializedName("incorporated_partnership")
      INCORPORATED_PARTNERSHIP("incorporated_partnership"),

      @SerializedName("limited_liability_partnership")
      LIMITED_LIABILITY_PARTNERSHIP("limited_liability_partnership"),

      @SerializedName("llc")
      LLC("llc"),

      @SerializedName("multi_member_llc")
      MULTI_MEMBER_LLC("multi_member_llc"),

      @SerializedName("private_company")
      PRIVATE_COMPANY("private_company"),

      @SerializedName("private_corporation")
      PRIVATE_CORPORATION("private_corporation"),

      @SerializedName("private_partnership")
      PRIVATE_PARTNERSHIP("private_partnership"),

      @SerializedName("public_company")
      PUBLIC_COMPANY("public_company"),

      @SerializedName("public_corporation")
      PUBLIC_CORPORATION("public_corporation"),

      @SerializedName("public_partnership")
      PUBLIC_PARTNERSHIP("public_partnership"),

      @SerializedName("registered_charity")
      REGISTERED_CHARITY("registered_charity"),

      @SerializedName("single_member_llc")
      SINGLE_MEMBER_LLC("single_member_llc"),

      @SerializedName("sole_establishment")
      SOLE_ESTABLISHMENT("sole_establishment"),

      @SerializedName("sole_proprietorship")
      SOLE_PROPRIETORSHIP("sole_proprietorship"),

      @SerializedName("tax_exempt_government_instrumentality")
      TAX_EXEMPT_GOVERNMENT_INSTRUMENTALITY("tax_exempt_government_instrumentality"),

      @SerializedName("unincorporated_association")
      UNINCORPORATED_ASSOCIATION("unincorporated_association"),

      @SerializedName("unincorporated_non_profit")
      UNINCORPORATED_NON_PROFIT("unincorporated_non_profit"),

      @SerializedName("unincorporated_partnership")
      UNINCORPORATED_PARTNERSHIP("unincorporated_partnership");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Structure(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Controller {
    /** A hash of configuration describing the Connect application that controls the account. */
    @SerializedName("application")
    Application application;

    /** Properties of the account's dashboard. */
    @SerializedName("dashboard")
    Dashboard dashboard;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A hash of configuration for who pays Stripe fees for product usage on this account. */
    @SerializedName("fees")
    Fees fees;

    /**
     * A hash of configuration for products that have negative balance liability, and whether Stripe
     * or a Connect application is responsible for them.
     */
    @SerializedName("losses")
    Losses losses;

    /**
     * A value indicating responsibility for collecting updated information when requirements on the
     * account are due or change. Defaults to {@code stripe}.
     */
    @SerializedName("requirement_collection")
    RequirementCollection requirementCollection;

    /** A hash of configuration for Stripe-hosted dashboards. */
    @SerializedName("stripe_dashboard")
    StripeDashboard stripeDashboard;

    private Controller(
        Application application,
        Dashboard dashboard,
        Map<String, Object> extraParams,
        Fees fees,
        Losses losses,
        RequirementCollection requirementCollection,
        StripeDashboard stripeDashboard) {
      this.application = application;
      this.dashboard = dashboard;
      this.extraParams = extraParams;
      this.fees = fees;
      this.losses = losses;
      this.requirementCollection = requirementCollection;
      this.stripeDashboard = stripeDashboard;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Application application;

      private Dashboard dashboard;

      private Map<String, Object> extraParams;

      private Fees fees;

      private Losses losses;

      private RequirementCollection requirementCollection;

      private StripeDashboard stripeDashboard;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Controller build() {
        return new AccountCreateParams.Controller(
            this.application,
            this.dashboard,
            this.extraParams,
            this.fees,
            this.losses,
            this.requirementCollection,
            this.stripeDashboard);
      }

      /** A hash of configuration describing the Connect application that controls the account. */
      public Builder setApplication(AccountCreateParams.Controller.Application application) {
        this.application = application;
        return this;
      }

      /** Properties of the account's dashboard. */
      public Builder setDashboard(AccountCreateParams.Controller.Dashboard dashboard) {
        this.dashboard = dashboard;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Controller#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Controller#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A hash of configuration for who pays Stripe fees for product usage on this account. */
      public Builder setFees(AccountCreateParams.Controller.Fees fees) {
        this.fees = fees;
        return this;
      }

      /**
       * A hash of configuration for products that have negative balance liability, and whether
       * Stripe or a Connect application is responsible for them.
       */
      public Builder setLosses(AccountCreateParams.Controller.Losses losses) {
        this.losses = losses;
        return this;
      }

      /**
       * A value indicating responsibility for collecting updated information when requirements on
       * the account are due or change. Defaults to {@code stripe}.
       */
      public Builder setRequirementCollection(
          AccountCreateParams.Controller.RequirementCollection requirementCollection) {
        this.requirementCollection = requirementCollection;
        return this;
      }

      /** A hash of configuration for Stripe-hosted dashboards. */
      public Builder setStripeDashboard(
          AccountCreateParams.Controller.StripeDashboard stripeDashboard) {
        this.stripeDashboard = stripeDashboard;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Application {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Whether the controller is liable for losses on this account. For
       * details, see <a href="https://stripe.com/docs/connect/account-balances">Understanding
       * Connect Account Balances</a>.
       */
      @SerializedName("loss_liable")
      Boolean lossLiable;

      /** Whether the controller owns onboarding for this account. */
      @SerializedName("onboarding_owner")
      Boolean onboardingOwner;

      /** Whether the controller has pricing controls for this account. */
      @SerializedName("pricing_controls")
      Boolean pricingControls;

      private Application(
          Map<String, Object> extraParams,
          Boolean lossLiable,
          Boolean onboardingOwner,
          Boolean pricingControls) {
        this.extraParams = extraParams;
        this.lossLiable = lossLiable;
        this.onboardingOwner = onboardingOwner;
        this.pricingControls = pricingControls;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean lossLiable;

        private Boolean onboardingOwner;

        private Boolean pricingControls;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Controller.Application build() {
          return new AccountCreateParams.Controller.Application(
              this.extraParams, this.lossLiable, this.onboardingOwner, this.pricingControls);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Application#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Application#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Whether the controller is liable for losses on this account.
         * For details, see <a href="https://stripe.com/docs/connect/account-balances">Understanding
         * Connect Account Balances</a>.
         */
        public Builder setLossLiable(Boolean lossLiable) {
          this.lossLiable = lossLiable;
          return this;
        }

        /** Whether the controller owns onboarding for this account. */
        public Builder setOnboardingOwner(Boolean onboardingOwner) {
          this.onboardingOwner = onboardingOwner;
          return this;
        }

        /** Whether the controller has pricing controls for this account. */
        public Builder setPricingControls(Boolean pricingControls) {
          this.pricingControls = pricingControls;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Dashboard {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Whether this account should have access to the full Stripe Dashboard ({@code full}), to the
       * Express Dashboard ({@code express}), or to no Stripe-hosted dashboard ({@code none}).
       * Defaults to {@code full}.
       */
      @SerializedName("type")
      Type type;

      private Dashboard(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Controller.Dashboard build() {
          return new AccountCreateParams.Controller.Dashboard(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Dashboard#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Dashboard#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Whether this account should have access to the full Stripe Dashboard ({@code full}), to
         * the Express Dashboard ({@code express}), or to no Stripe-hosted dashboard ({@code none}).
         * Defaults to {@code full}.
         */
        public Builder setType(AccountCreateParams.Controller.Dashboard.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("express")
        EXPRESS("express"),

        @SerializedName("full")
        FULL("full"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Fees {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A value indicating the responsible payer of Stripe fees on this account. Defaults to {@code
       * account}. Learn more about <a
       * href="https://docs.stripe.com/connect/direct-charges-fee-payer-behavior">fee behavior on
       * connected accounts</a>.
       */
      @SerializedName("payer")
      Payer payer;

      private Fees(Map<String, Object> extraParams, Payer payer) {
        this.extraParams = extraParams;
        this.payer = payer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Payer payer;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Controller.Fees build() {
          return new AccountCreateParams.Controller.Fees(this.extraParams, this.payer);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Fees#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Fees#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * A value indicating the responsible payer of Stripe fees on this account. Defaults to
         * {@code account}. Learn more about <a
         * href="https://docs.stripe.com/connect/direct-charges-fee-payer-behavior">fee behavior on
         * connected accounts</a>.
         */
        public Builder setPayer(AccountCreateParams.Controller.Fees.Payer payer) {
          this.payer = payer;
          return this;
        }
      }

      public enum Payer implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("application")
        APPLICATION("application");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Payer(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Losses {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A value indicating who is liable when this account can't pay back negative balances
       * resulting from payments. Defaults to {@code stripe}.
       */
      @SerializedName("payments")
      Payments payments;

      private Losses(Map<String, Object> extraParams, Payments payments) {
        this.extraParams = extraParams;
        this.payments = payments;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Payments payments;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Controller.Losses build() {
          return new AccountCreateParams.Controller.Losses(this.extraParams, this.payments);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Losses#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.Losses#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * A value indicating who is liable when this account can't pay back negative balances
         * resulting from payments. Defaults to {@code stripe}.
         */
        public Builder setPayments(AccountCreateParams.Controller.Losses.Payments payments) {
          this.payments = payments;
          return this;
        }
      }

      public enum Payments implements ApiRequestParams.EnumParam {
        @SerializedName("application")
        APPLICATION("application"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Payments(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeDashboard {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Whether this account should have access to the full Stripe Dashboard ({@code full}), to the
       * Express Dashboard ({@code express}), or to no Stripe-hosted dashboard ({@code none}).
       * Defaults to {@code full}.
       */
      @SerializedName("type")
      Type type;

      private StripeDashboard(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Controller.StripeDashboard build() {
          return new AccountCreateParams.Controller.StripeDashboard(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.StripeDashboard#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Controller.StripeDashboard#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Whether this account should have access to the full Stripe Dashboard ({@code full}), to
         * the Express Dashboard ({@code express}), or to no Stripe-hosted dashboard ({@code none}).
         * Defaults to {@code full}.
         */
        public Builder setType(AccountCreateParams.Controller.StripeDashboard.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("express")
        EXPRESS("express"),

        @SerializedName("full")
        FULL("full"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum RequirementCollection implements ApiRequestParams.EnumParam {
      @SerializedName("application")
      APPLICATION("application"),

      @SerializedName("stripe")
      STRIPE("stripe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RequirementCollection(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Documents {
    /**
     * One or more documents that support the <a
     * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank account
     * ownership verification</a> requirement. Must be a document associated with the account’s
     * primary active bank account that displays the last 4 digits of the account number, either a
     * statement or a check.
     */
    @SerializedName("bank_account_ownership_verification")
    BankAccountOwnershipVerification bankAccountOwnershipVerification;

    /** One or more documents that demonstrate proof of a company's license to operate. */
    @SerializedName("company_license")
    CompanyLicense companyLicense;

    /** One or more documents showing the company's Memorandum of Association. */
    @SerializedName("company_memorandum_of_association")
    CompanyMemorandumOfAssociation companyMemorandumOfAssociation;

    /**
     * (Certain countries only) One or more documents showing the ministerial decree legalizing the
     * company's establishment.
     */
    @SerializedName("company_ministerial_decree")
    CompanyMinisterialDecree companyMinisterialDecree;

    /**
     * One or more documents that demonstrate proof of a company's registration with the appropriate
     * local authorities.
     */
    @SerializedName("company_registration_verification")
    CompanyRegistrationVerification companyRegistrationVerification;

    /** One or more documents that demonstrate proof of a company's tax ID. */
    @SerializedName("company_tax_id_verification")
    CompanyTaxIdVerification companyTaxIdVerification;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** One or more documents that demonstrate proof of address. */
    @SerializedName("proof_of_address")
    ProofOfAddress proofOfAddress;

    /**
     * One or more documents showing the company’s proof of registration with the national business
     * registry.
     */
    @SerializedName("proof_of_registration")
    ProofOfRegistration proofOfRegistration;

    /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
    @SerializedName("proof_of_ultimate_beneficial_ownership")
    ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

    private Documents(
        BankAccountOwnershipVerification bankAccountOwnershipVerification,
        CompanyLicense companyLicense,
        CompanyMemorandumOfAssociation companyMemorandumOfAssociation,
        CompanyMinisterialDecree companyMinisterialDecree,
        CompanyRegistrationVerification companyRegistrationVerification,
        CompanyTaxIdVerification companyTaxIdVerification,
        Map<String, Object> extraParams,
        ProofOfAddress proofOfAddress,
        ProofOfRegistration proofOfRegistration,
        ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership) {
      this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
      this.companyLicense = companyLicense;
      this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
      this.companyMinisterialDecree = companyMinisterialDecree;
      this.companyRegistrationVerification = companyRegistrationVerification;
      this.companyTaxIdVerification = companyTaxIdVerification;
      this.extraParams = extraParams;
      this.proofOfAddress = proofOfAddress;
      this.proofOfRegistration = proofOfRegistration;
      this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccountOwnershipVerification bankAccountOwnershipVerification;

      private CompanyLicense companyLicense;

      private CompanyMemorandumOfAssociation companyMemorandumOfAssociation;

      private CompanyMinisterialDecree companyMinisterialDecree;

      private CompanyRegistrationVerification companyRegistrationVerification;

      private CompanyTaxIdVerification companyTaxIdVerification;

      private Map<String, Object> extraParams;

      private ProofOfAddress proofOfAddress;

      private ProofOfRegistration proofOfRegistration;

      private ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Documents build() {
        return new AccountCreateParams.Documents(
            this.bankAccountOwnershipVerification,
            this.companyLicense,
            this.companyMemorandumOfAssociation,
            this.companyMinisterialDecree,
            this.companyRegistrationVerification,
            this.companyTaxIdVerification,
            this.extraParams,
            this.proofOfAddress,
            this.proofOfRegistration,
            this.proofOfUltimateBeneficialOwnership);
      }

      /**
       * One or more documents that support the <a
       * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank
       * account ownership verification</a> requirement. Must be a document associated with the
       * account’s primary active bank account that displays the last 4 digits of the account
       * number, either a statement or a check.
       */
      public Builder setBankAccountOwnershipVerification(
          AccountCreateParams.Documents.BankAccountOwnershipVerification
              bankAccountOwnershipVerification) {
        this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
        return this;
      }

      /** One or more documents that demonstrate proof of a company's license to operate. */
      public Builder setCompanyLicense(
          AccountCreateParams.Documents.CompanyLicense companyLicense) {
        this.companyLicense = companyLicense;
        return this;
      }

      /** One or more documents showing the company's Memorandum of Association. */
      public Builder setCompanyMemorandumOfAssociation(
          AccountCreateParams.Documents.CompanyMemorandumOfAssociation
              companyMemorandumOfAssociation) {
        this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
        return this;
      }

      /**
       * (Certain countries only) One or more documents showing the ministerial decree legalizing
       * the company's establishment.
       */
      public Builder setCompanyMinisterialDecree(
          AccountCreateParams.Documents.CompanyMinisterialDecree companyMinisterialDecree) {
        this.companyMinisterialDecree = companyMinisterialDecree;
        return this;
      }

      /**
       * One or more documents that demonstrate proof of a company's registration with the
       * appropriate local authorities.
       */
      public Builder setCompanyRegistrationVerification(
          AccountCreateParams.Documents.CompanyRegistrationVerification
              companyRegistrationVerification) {
        this.companyRegistrationVerification = companyRegistrationVerification;
        return this;
      }

      /** One or more documents that demonstrate proof of a company's tax ID. */
      public Builder setCompanyTaxIdVerification(
          AccountCreateParams.Documents.CompanyTaxIdVerification companyTaxIdVerification) {
        this.companyTaxIdVerification = companyTaxIdVerification;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** One or more documents that demonstrate proof of address. */
      public Builder setProofOfAddress(
          AccountCreateParams.Documents.ProofOfAddress proofOfAddress) {
        this.proofOfAddress = proofOfAddress;
        return this;
      }

      /**
       * One or more documents showing the company’s proof of registration with the national
       * business registry.
       */
      public Builder setProofOfRegistration(
          AccountCreateParams.Documents.ProofOfRegistration proofOfRegistration) {
        this.proofOfRegistration = proofOfRegistration;
        return this;
      }

      /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
      public Builder setProofOfUltimateBeneficialOwnership(
          AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership
              proofOfUltimateBeneficialOwnership) {
        this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BankAccountOwnershipVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private BankAccountOwnershipVerification(
          Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.BankAccountOwnershipVerification build() {
          return new AccountCreateParams.Documents.BankAccountOwnershipVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.BankAccountOwnershipVerification#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.BankAccountOwnershipVerification#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.BankAccountOwnershipVerification#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.BankAccountOwnershipVerification#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyLicense {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private CompanyLicense(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.CompanyLicense build() {
          return new AccountCreateParams.Documents.CompanyLicense(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyLicense#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyLicense#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyLicense#files} for the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyLicense#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyMemorandumOfAssociation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private CompanyMemorandumOfAssociation(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.CompanyMemorandumOfAssociation build() {
          return new AccountCreateParams.Documents.CompanyMemorandumOfAssociation(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyMemorandumOfAssociation#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyMemorandumOfAssociation#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyMemorandumOfAssociation#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyMemorandumOfAssociation#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyMinisterialDecree {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private CompanyMinisterialDecree(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.CompanyMinisterialDecree build() {
          return new AccountCreateParams.Documents.CompanyMinisterialDecree(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyMinisterialDecree#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyMinisterialDecree#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyMinisterialDecree#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyMinisterialDecree#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyRegistrationVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private CompanyRegistrationVerification(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.CompanyRegistrationVerification build() {
          return new AccountCreateParams.Documents.CompanyRegistrationVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.CompanyRegistrationVerification#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.CompanyRegistrationVerification#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyRegistrationVerification#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyRegistrationVerification#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyTaxIdVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private CompanyTaxIdVerification(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.CompanyTaxIdVerification build() {
          return new AccountCreateParams.Documents.CompanyTaxIdVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyTaxIdVerification#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.CompanyTaxIdVerification#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyTaxIdVerification#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.CompanyTaxIdVerification#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ProofOfAddress {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private ProofOfAddress(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.ProofOfAddress build() {
          return new AccountCreateParams.Documents.ProofOfAddress(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.ProofOfAddress#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.ProofOfAddress#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfAddress#files} for the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfAddress#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ProofOfRegistration {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private ProofOfRegistration(Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.ProofOfRegistration build() {
          return new AccountCreateParams.Documents.ProofOfRegistration(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.ProofOfRegistration#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Documents.ProofOfRegistration#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfRegistration#files} for the field documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfRegistration#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ProofOfUltimateBeneficialOwnership {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      private ProofOfUltimateBeneficialOwnership(
          Map<String, Object> extraParams, List<String> files) {
        this.extraParams = extraParams;
        this.files = files;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership build() {
          return new AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership#files} for the field
         * documentation.
         */
        public Builder addFile(String element) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.add(element);
          return this;
        }

        /**
         * Add all elements to `files` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AccountCreateParams.Documents.ProofOfUltimateBeneficialOwnership#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Groups {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The group the account is in to determine their payments pricing, and null if the account is
     * on customized pricing. <a href="https://stripe.com/docs/connect/platform-pricing-tools">See
     * the Platform pricing tool documentation</a> for details.
     */
    @SerializedName("payments_pricing")
    Object paymentsPricing;

    private Groups(Map<String, Object> extraParams, Object paymentsPricing) {
      this.extraParams = extraParams;
      this.paymentsPricing = paymentsPricing;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object paymentsPricing;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Groups build() {
        return new AccountCreateParams.Groups(this.extraParams, this.paymentsPricing);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Groups#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Groups#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The group the account is in to determine their payments pricing, and null if the account is
       * on customized pricing. <a href="https://stripe.com/docs/connect/platform-pricing-tools">See
       * the Platform pricing tool documentation</a> for details.
       */
      public Builder setPaymentsPricing(String paymentsPricing) {
        this.paymentsPricing = paymentsPricing;
        return this;
      }

      /**
       * The group the account is in to determine their payments pricing, and null if the account is
       * on customized pricing. <a href="https://stripe.com/docs/connect/platform-pricing-tools">See
       * the Platform pricing tool documentation</a> for details.
       */
      public Builder setPaymentsPricing(EmptyParam paymentsPricing) {
        this.paymentsPricing = paymentsPricing;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Individual {
    /** The individual's primary address. */
    @SerializedName("address")
    Address address;

    /** The Kana variation of the individual's primary address (Japan only). */
    @SerializedName("address_kana")
    AddressKana addressKana;

    /** The Kanji variation of the individual's primary address (Japan only). */
    @SerializedName("address_kanji")
    AddressKanji addressKanji;

    /** The individual's date of birth. */
    @SerializedName("dob")
    Object dob;

    /** The individual's email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The individual's first name. */
    @SerializedName("first_name")
    String firstName;

    /** The Kana variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kana")
    String firstNameKana;

    /** The Kanji variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kanji")
    String firstNameKanji;

    /** A list of alternate names or aliases that the individual is known by. */
    @SerializedName("full_name_aliases")
    Object fullNameAliases;

    /** The individual's gender. */
    @SerializedName("gender")
    String gender;

    /**
     * The government-issued ID number of the individual, as appropriate for the representative's
     * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number in
     * Canada). Instead of the number itself, you can also provide a <a
     * href="https://stripe.com/js/tokens/create_token?type=pii">PII token created with
     * Stripe.js</a>.
     */
    @SerializedName("id_number")
    String idNumber;

    /**
     * The government-issued secondary ID number of the individual, as appropriate for the
     * representative's country, will be used for enhanced verification checks. In Thailand, this
     * would be the laser code found on the back of an ID card. Instead of the number itself, you
     * can also provide a <a href="https://stripe.com/js/tokens/create_token?type=pii">PII token
     * created with Stripe.js</a>.
     */
    @SerializedName("id_number_secondary")
    String idNumberSecondary;

    /** The individual's last name. */
    @SerializedName("last_name")
    String lastName;

    /** The Kana variation of the individual's last name (Japan only). */
    @SerializedName("last_name_kana")
    String lastNameKana;

    /** The Kanji variation of the individual's last name (Japan only). */
    @SerializedName("last_name_kanji")
    String lastNameKanji;

    /** The individual's maiden name. */
    @SerializedName("maiden_name")
    String maidenName;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /** The individual's phone number. */
    @SerializedName("phone")
    String phone;

    /**
     * Indicates if the person or any of their representatives, family members, or other closely
     * related persons, declares that they hold or have held an important public job or function, in
     * any jurisdiction.
     */
    @SerializedName("political_exposure")
    PoliticalExposure politicalExposure;

    /** The individual's registered address. */
    @SerializedName("registered_address")
    RegisteredAddress registeredAddress;

    /** Describes the person’s relationship to the account. */
    @SerializedName("relationship")
    Relationship relationship;

    /** The last four digits of the individual's Social Security Number (U.S. only). */
    @SerializedName("ssn_last_4")
    String ssnLast4;

    /** The individual's verification document information. */
    @SerializedName("verification")
    Verification verification;

    private Individual(
        Address address,
        AddressKana addressKana,
        AddressKanji addressKanji,
        Object dob,
        String email,
        Map<String, Object> extraParams,
        String firstName,
        String firstNameKana,
        String firstNameKanji,
        Object fullNameAliases,
        String gender,
        String idNumber,
        String idNumberSecondary,
        String lastName,
        String lastNameKana,
        String lastNameKanji,
        String maidenName,
        Object metadata,
        String phone,
        PoliticalExposure politicalExposure,
        RegisteredAddress registeredAddress,
        Relationship relationship,
        String ssnLast4,
        Verification verification) {
      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.dob = dob;
      this.email = email;
      this.extraParams = extraParams;
      this.firstName = firstName;
      this.firstNameKana = firstNameKana;
      this.firstNameKanji = firstNameKanji;
      this.fullNameAliases = fullNameAliases;
      this.gender = gender;
      this.idNumber = idNumber;
      this.idNumberSecondary = idNumberSecondary;
      this.lastName = lastName;
      this.lastNameKana = lastNameKana;
      this.lastNameKanji = lastNameKanji;
      this.maidenName = maidenName;
      this.metadata = metadata;
      this.phone = phone;
      this.politicalExposure = politicalExposure;
      this.registeredAddress = registeredAddress;
      this.relationship = relationship;
      this.ssnLast4 = ssnLast4;
      this.verification = verification;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private AddressKana addressKana;

      private AddressKanji addressKanji;

      private Object dob;

      private String email;

      private Map<String, Object> extraParams;

      private String firstName;

      private String firstNameKana;

      private String firstNameKanji;

      private Object fullNameAliases;

      private String gender;

      private String idNumber;

      private String idNumberSecondary;

      private String lastName;

      private String lastNameKana;

      private String lastNameKanji;

      private String maidenName;

      private Object metadata;

      private String phone;

      private PoliticalExposure politicalExposure;

      private RegisteredAddress registeredAddress;

      private Relationship relationship;

      private String ssnLast4;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Individual build() {
        return new AccountCreateParams.Individual(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.dob,
            this.email,
            this.extraParams,
            this.firstName,
            this.firstNameKana,
            this.firstNameKanji,
            this.fullNameAliases,
            this.gender,
            this.idNumber,
            this.idNumberSecondary,
            this.lastName,
            this.lastNameKana,
            this.lastNameKanji,
            this.maidenName,
            this.metadata,
            this.phone,
            this.politicalExposure,
            this.registeredAddress,
            this.relationship,
            this.ssnLast4,
            this.verification);
      }

      /** The individual's primary address. */
      public Builder setAddress(AccountCreateParams.Individual.Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the individual's primary address (Japan only). */
      public Builder setAddressKana(AccountCreateParams.Individual.AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the individual's primary address (Japan only). */
      public Builder setAddressKanji(AccountCreateParams.Individual.AddressKanji addressKanji) {
        this.addressKanji = addressKanji;
        return this;
      }

      /** The individual's date of birth. */
      public Builder setDob(AccountCreateParams.Individual.Dob dob) {
        this.dob = dob;
        return this;
      }

      /** The individual's date of birth. */
      public Builder setDob(EmptyParam dob) {
        this.dob = dob;
        return this;
      }

      /** The individual's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Individual#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Individual#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The individual's first name. */
      public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
      }

      /** The Kana variation of the individual's first name (Japan only). */
      public Builder setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kanji variation of the individual's first name (Japan only). */
      public Builder setFirstNameKanji(String firstNameKanji) {
        this.firstNameKanji = firstNameKanji;
        return this;
      }

      /**
       * Add an element to `fullNameAliases` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * AccountCreateParams.Individual#fullNameAliases} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addFullNameAlias(String element) {
        if (this.fullNameAliases == null || this.fullNameAliases instanceof EmptyParam) {
          this.fullNameAliases = new ArrayList<String>();
        }
        ((List<String>) this.fullNameAliases).add(element);
        return this;
      }

      /**
       * Add all elements to `fullNameAliases` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link AccountCreateParams.Individual#fullNameAliases} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllFullNameAlias(List<String> elements) {
        if (this.fullNameAliases == null || this.fullNameAliases instanceof EmptyParam) {
          this.fullNameAliases = new ArrayList<String>();
        }
        ((List<String>) this.fullNameAliases).addAll(elements);
        return this;
      }

      /** A list of alternate names or aliases that the individual is known by. */
      public Builder setFullNameAliases(EmptyParam fullNameAliases) {
        this.fullNameAliases = fullNameAliases;
        return this;
      }

      /** A list of alternate names or aliases that the individual is known by. */
      public Builder setFullNameAliases(List<String> fullNameAliases) {
        this.fullNameAliases = fullNameAliases;
        return this;
      }

      /** The individual's gender. */
      public Builder setGender(String gender) {
        this.gender = gender;
        return this;
      }

      /**
       * The government-issued ID number of the individual, as appropriate for the representative's
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a <a
       * href="https://stripe.com/js/tokens/create_token?type=pii">PII token created with
       * Stripe.js</a>.
       */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }

      /**
       * The government-issued secondary ID number of the individual, as appropriate for the
       * representative's country, will be used for enhanced verification checks. In Thailand, this
       * would be the laser code found on the back of an ID card. Instead of the number itself, you
       * can also provide a <a href="https://stripe.com/js/tokens/create_token?type=pii">PII token
       * created with Stripe.js</a>.
       */
      public Builder setIdNumberSecondary(String idNumberSecondary) {
        this.idNumberSecondary = idNumberSecondary;
        return this;
      }

      /** The individual's last name. */
      public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
      }

      /** The Kana variation of the individual's last name (Japan only). */
      public Builder setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kanji variation of the individual's last name (Japan only). */
      public Builder setLastNameKanji(String lastNameKanji) {
        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The individual's maiden name. */
      public Builder setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Individual#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Individual#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).putAll(map);
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /** The individual's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * Indicates if the person or any of their representatives, family members, or other closely
       * related persons, declares that they hold or have held an important public job or function,
       * in any jurisdiction.
       */
      public Builder setPoliticalExposure(
          AccountCreateParams.Individual.PoliticalExposure politicalExposure) {
        this.politicalExposure = politicalExposure;
        return this;
      }

      /** The individual's registered address. */
      public Builder setRegisteredAddress(
          AccountCreateParams.Individual.RegisteredAddress registeredAddress) {
        this.registeredAddress = registeredAddress;
        return this;
      }

      /** Describes the person’s relationship to the account. */
      public Builder setRelationship(AccountCreateParams.Individual.Relationship relationship) {
        this.relationship = relationship;
        return this;
      }

      /** The last four digits of the individual's Social Security Number (U.S. only). */
      public Builder setSsnLast4(String ssnLast4) {
        this.ssnLast4 = ssnLast4;
        return this;
      }

      /** The individual's verification document information. */
      public Builder setVerification(AccountCreateParams.Individual.Verification verification) {
        this.verification = verification;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.Address build() {
          return new AccountCreateParams.Individual.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Address#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKana {
      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Block or building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** Postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town or cho-me. */
      @SerializedName("town")
      String town;

      private AddressKana(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state,
          String town) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
        this.town = town;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        private String town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.AddressKana build() {
          return new AccountCreateParams.Individual.AddressKana(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
        }

        /** City or ward. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.AddressKana#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.AddressKana#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressKanji {
      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Block or building number. */
      @SerializedName("line1")
      String line1;

      /** Building details. */
      @SerializedName("line2")
      String line2;

      /** Postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** Prefecture. */
      @SerializedName("state")
      String state;

      /** Town or cho-me. */
      @SerializedName("town")
      String town;

      private AddressKanji(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state,
          String town) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
        this.town = town;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        private String town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.AddressKanji build() {
          return new AccountCreateParams.Individual.AddressKanji(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
        }

        /** City or ward. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.AddressKanji#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.AddressKanji#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Dob {
      /** <strong>Required.</strong> The day of birth, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The month of birth, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** <strong>Required.</strong> The four-digit year of birth. */
      @SerializedName("year")
      Long year;

      private Dob(Long day, Map<String, Object> extraParams, Long month, Long year) {
        this.day = day;
        this.extraParams = extraParams;
        this.month = month;
        this.year = year;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long day;

        private Map<String, Object> extraParams;

        private Long month;

        private Long year;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.Dob build() {
          return new AccountCreateParams.Individual.Dob(
              this.day, this.extraParams, this.month, this.year);
        }

        /** <strong>Required.</strong> The day of birth, between 1 and 31. */
        public Builder setDay(Long day) {
          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Dob#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Dob#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The month of birth, between 1 and 12. */
        public Builder setMonth(Long month) {
          this.month = month;
          return this;
        }

        /** <strong>Required.</strong> The four-digit year of birth. */
        public Builder setYear(Long year) {
          this.year = year;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RegisteredAddress {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private RegisteredAddress(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.RegisteredAddress build() {
          return new AccountCreateParams.Individual.RegisteredAddress(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.RegisteredAddress#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.RegisteredAddress#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Relationship {
      /**
       * Whether the person is a director of the account's legal entity. Directors are typically
       * members of the governing board of the company, or responsible for ensuring the company
       * meets its regulatory obligations.
       */
      @SerializedName("director")
      Boolean director;

      /**
       * Whether the person has significant responsibility to control, manage, or direct the
       * organization.
       */
      @SerializedName("executive")
      Boolean executive;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Whether the person is an owner of the account’s legal entity. */
      @SerializedName("owner")
      Boolean owner;

      /** The percent owned by the person of the account's legal entity. */
      @SerializedName("percent_ownership")
      Object percentOwnership;

      /** The person's title (e.g., CEO, Support Engineer). */
      @SerializedName("title")
      String title;

      private Relationship(
          Boolean director,
          Boolean executive,
          Map<String, Object> extraParams,
          Boolean owner,
          Object percentOwnership,
          String title) {
        this.director = director;
        this.executive = executive;
        this.extraParams = extraParams;
        this.owner = owner;
        this.percentOwnership = percentOwnership;
        this.title = title;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean director;

        private Boolean executive;

        private Map<String, Object> extraParams;

        private Boolean owner;

        private Object percentOwnership;

        private String title;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.Relationship build() {
          return new AccountCreateParams.Individual.Relationship(
              this.director,
              this.executive,
              this.extraParams,
              this.owner,
              this.percentOwnership,
              this.title);
        }

        /**
         * Whether the person is a director of the account's legal entity. Directors are typically
         * members of the governing board of the company, or responsible for ensuring the company
         * meets its regulatory obligations.
         */
        public Builder setDirector(Boolean director) {
          this.director = director;
          return this;
        }

        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         */
        public Builder setExecutive(Boolean executive) {
          this.executive = executive;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Relationship#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Relationship#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Whether the person is an owner of the account’s legal entity. */
        public Builder setOwner(Boolean owner) {
          this.owner = owner;
          return this;
        }

        /** The percent owned by the person of the account's legal entity. */
        public Builder setPercentOwnership(BigDecimal percentOwnership) {
          this.percentOwnership = percentOwnership;
          return this;
        }

        /** The percent owned by the person of the account's legal entity. */
        public Builder setPercentOwnership(EmptyParam percentOwnership) {
          this.percentOwnership = percentOwnership;
          return this;
        }

        /** The person's title (e.g., CEO, Support Engineer). */
        public Builder setTitle(String title) {
          this.title = title;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Verification {
      /**
       * A document showing address, either a passport, local ID card, or utility bill from a
       * well-known utility company.
       */
      @SerializedName("additional_document")
      AdditionalDocument additionalDocument;

      /** An identifying document, either a passport or local ID card. */
      @SerializedName("document")
      Document document;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Verification(
          AdditionalDocument additionalDocument,
          Document document,
          Map<String, Object> extraParams) {
        this.additionalDocument = additionalDocument;
        this.document = document;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AdditionalDocument additionalDocument;

        private Document document;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Individual.Verification build() {
          return new AccountCreateParams.Individual.Verification(
              this.additionalDocument, this.document, this.extraParams);
        }

        /**
         * A document showing address, either a passport, local ID card, or utility bill from a
         * well-known utility company.
         */
        public Builder setAdditionalDocument(
            AccountCreateParams.Individual.Verification.AdditionalDocument additionalDocument) {
          this.additionalDocument = additionalDocument;
          return this;
        }

        /** An identifying document, either a passport or local ID card. */
        public Builder setDocument(AccountCreateParams.Individual.Verification.Document document) {
          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Verification#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Individual.Verification#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalDocument {
        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("back")
        String back;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;

        private AdditionalDocument(String back, Map<String, Object> extraParams, String front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String back;

          private Map<String, Object> extraParams;

          private String front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Individual.Verification.AdditionalDocument build() {
            return new AccountCreateParams.Individual.Verification.AdditionalDocument(
                this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Individual.Verification.AdditionalDocument#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountCreateParams.Individual.Verification.AdditionalDocument#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Document {
        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("back")
        String back;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;

        private Document(String back, Map<String, Object> extraParams, String front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String back;

          private Map<String, Object> extraParams;

          private String front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Individual.Verification.Document build() {
            return new AccountCreateParams.Individual.Verification.Document(
                this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Individual.Verification.Document#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Individual.Verification.Document#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }
        }
      }
    }

    public enum PoliticalExposure implements ApiRequestParams.EnumParam {
      @SerializedName("existing")
      EXISTING("existing"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PoliticalExposure(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskControls {
    /**
     * Represents the risk control status of charges. Please see <a
     * href="https://stripe.com/docs/connect/pausing-payments-or-payouts-on-connected-accounts">this
     * page for more details</a>.
     */
    @SerializedName("charges")
    Charges charges;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Represents the risk control status of payouts. Please see <a
     * href="https://stripe.com/docs/connect/pausing-payments-or-payouts-on-connected-accounts">this
     * page for more details</a>.
     */
    @SerializedName("payouts")
    Payouts payouts;

    private RiskControls(Charges charges, Map<String, Object> extraParams, Payouts payouts) {
      this.charges = charges;
      this.extraParams = extraParams;
      this.payouts = payouts;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Charges charges;

      private Map<String, Object> extraParams;

      private Payouts payouts;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.RiskControls build() {
        return new AccountCreateParams.RiskControls(this.charges, this.extraParams, this.payouts);
      }

      /**
       * Represents the risk control status of charges. Please see <a
       * href="https://stripe.com/docs/connect/pausing-payments-or-payouts-on-connected-accounts">this
       * page for more details</a>.
       */
      public Builder setCharges(AccountCreateParams.RiskControls.Charges charges) {
        this.charges = charges;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.RiskControls#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.RiskControls#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Represents the risk control status of payouts. Please see <a
       * href="https://stripe.com/docs/connect/pausing-payments-or-payouts-on-connected-accounts">this
       * page for more details</a>.
       */
      public Builder setPayouts(AccountCreateParams.RiskControls.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Charges {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * To request to pause a risk control, pass {@code true}. To request to unpause a risk
       * control, pass {@code false}. There can be a delay before the risk control is paused or
       * unpaused.
       */
      @SerializedName("pause_requested")
      Boolean pauseRequested;

      private Charges(Map<String, Object> extraParams, Boolean pauseRequested) {
        this.extraParams = extraParams;
        this.pauseRequested = pauseRequested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean pauseRequested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.RiskControls.Charges build() {
          return new AccountCreateParams.RiskControls.Charges(
              this.extraParams, this.pauseRequested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.RiskControls.Charges#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.RiskControls.Charges#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * To request to pause a risk control, pass {@code true}. To request to unpause a risk
         * control, pass {@code false}. There can be a delay before the risk control is paused or
         * unpaused.
         */
        public Builder setPauseRequested(Boolean pauseRequested) {
          this.pauseRequested = pauseRequested;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * To request to pause a risk control, pass {@code true}. To request to unpause a risk
       * control, pass {@code false}. There can be a delay before the risk control is paused or
       * unpaused.
       */
      @SerializedName("pause_requested")
      Boolean pauseRequested;

      private Payouts(Map<String, Object> extraParams, Boolean pauseRequested) {
        this.extraParams = extraParams;
        this.pauseRequested = pauseRequested;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean pauseRequested;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.RiskControls.Payouts build() {
          return new AccountCreateParams.RiskControls.Payouts(
              this.extraParams, this.pauseRequested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.RiskControls.Payouts#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.RiskControls.Payouts#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * To request to pause a risk control, pass {@code true}. To request to unpause a risk
         * control, pass {@code false}. There can be a delay before the risk control is paused or
         * unpaused.
         */
        public Builder setPauseRequested(Boolean pauseRequested) {
          this.pauseRequested = pauseRequested;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings {
    /** Settings specific to Bacs Direct Debit. */
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

    /** Settings specific to bank BCA onboarding for Indonesia bank transfers payments method. */
    @SerializedName("bank_bca_onboarding")
    BankBcaOnboarding bankBcaOnboarding;

    /**
     * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
     * other products.
     */
    @SerializedName("branding")
    Branding branding;

    /** Settings specific to the account's use of the Capital product. */
    @SerializedName("capital")
    Capital capital;

    /** Settings specific to the account's use of the Card Issuing product. */
    @SerializedName("card_issuing")
    CardIssuing cardIssuing;

    /** Settings specific to card charging on the account. */
    @SerializedName("card_payments")
    CardPayments cardPayments;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Settings specific to the account’s use of Invoices. */
    @SerializedName("invoices")
    Invoices invoices;

    /** Settings that apply across payment methods for charging on the account. */
    @SerializedName("payments")
    Payments payments;

    /** Settings specific to the account's payouts. */
    @SerializedName("payouts")
    Payouts payouts;

    /** Settings specific to the account's tax forms. */
    @SerializedName("tax_forms")
    TaxForms taxForms;

    /** Settings specific to the account's Treasury FinancialAccounts. */
    @SerializedName("treasury")
    Treasury treasury;

    private Settings(
        BacsDebitPayments bacsDebitPayments,
        BankBcaOnboarding bankBcaOnboarding,
        Branding branding,
        Capital capital,
        CardIssuing cardIssuing,
        CardPayments cardPayments,
        Map<String, Object> extraParams,
        Invoices invoices,
        Payments payments,
        Payouts payouts,
        TaxForms taxForms,
        Treasury treasury) {
      this.bacsDebitPayments = bacsDebitPayments;
      this.bankBcaOnboarding = bankBcaOnboarding;
      this.branding = branding;
      this.capital = capital;
      this.cardIssuing = cardIssuing;
      this.cardPayments = cardPayments;
      this.extraParams = extraParams;
      this.invoices = invoices;
      this.payments = payments;
      this.payouts = payouts;
      this.taxForms = taxForms;
      this.treasury = treasury;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BacsDebitPayments bacsDebitPayments;

      private BankBcaOnboarding bankBcaOnboarding;

      private Branding branding;

      private Capital capital;

      private CardIssuing cardIssuing;

      private CardPayments cardPayments;

      private Map<String, Object> extraParams;

      private Invoices invoices;

      private Payments payments;

      private Payouts payouts;

      private TaxForms taxForms;

      private Treasury treasury;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Settings build() {
        return new AccountCreateParams.Settings(
            this.bacsDebitPayments,
            this.bankBcaOnboarding,
            this.branding,
            this.capital,
            this.cardIssuing,
            this.cardPayments,
            this.extraParams,
            this.invoices,
            this.payments,
            this.payouts,
            this.taxForms,
            this.treasury);
      }

      /** Settings specific to Bacs Direct Debit. */
      public Builder setBacsDebitPayments(
          AccountCreateParams.Settings.BacsDebitPayments bacsDebitPayments) {
        this.bacsDebitPayments = bacsDebitPayments;
        return this;
      }

      /** Settings specific to bank BCA onboarding for Indonesia bank transfers payments method. */
      public Builder setBankBcaOnboarding(
          AccountCreateParams.Settings.BankBcaOnboarding bankBcaOnboarding) {
        this.bankBcaOnboarding = bankBcaOnboarding;
        return this;
      }

      /**
       * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      public Builder setBranding(AccountCreateParams.Settings.Branding branding) {
        this.branding = branding;
        return this;
      }

      /** Settings specific to the account's use of the Capital product. */
      public Builder setCapital(AccountCreateParams.Settings.Capital capital) {
        this.capital = capital;
        return this;
      }

      /** Settings specific to the account's use of the Card Issuing product. */
      public Builder setCardIssuing(AccountCreateParams.Settings.CardIssuing cardIssuing) {
        this.cardIssuing = cardIssuing;
        return this;
      }

      /** Settings specific to card charging on the account. */
      public Builder setCardPayments(AccountCreateParams.Settings.CardPayments cardPayments) {
        this.cardPayments = cardPayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.Settings#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.Settings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings specific to the account’s use of Invoices. */
      public Builder setInvoices(AccountCreateParams.Settings.Invoices invoices) {
        this.invoices = invoices;
        return this;
      }

      /** Settings that apply across payment methods for charging on the account. */
      public Builder setPayments(AccountCreateParams.Settings.Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Settings specific to the account's payouts. */
      public Builder setPayouts(AccountCreateParams.Settings.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /** Settings specific to the account's tax forms. */
      public Builder setTaxForms(AccountCreateParams.Settings.TaxForms taxForms) {
        this.taxForms = taxForms;
        return this;
      }

      /** Settings specific to the account's Treasury FinancialAccounts. */
      public Builder setTreasury(AccountCreateParams.Settings.Treasury treasury) {
        this.treasury = treasury;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebitPayments {
      /**
       * The Bacs Direct Debit Display Name for this account. For payments made with Bacs Direct
       * Debit, this name appears on the mandate as the statement descriptor. Mobile banking apps
       * display it as the name of the business. To use custom branding, set the Bacs Direct Debit
       * Display Name during or right after creation. Custom branding incurs an additional monthly
       * fee for the platform. If you don't set the display name before requesting Bacs capability,
       * it's automatically set as &quot;Stripe&quot; and the account is onboarded to Stripe
       * branding, which is free.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BacsDebitPayments(String displayName, Map<String, Object> extraParams) {
        this.displayName = displayName;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String displayName;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.BacsDebitPayments build() {
          return new AccountCreateParams.Settings.BacsDebitPayments(
              this.displayName, this.extraParams);
        }

        /**
         * The Bacs Direct Debit Display Name for this account. For payments made with Bacs Direct
         * Debit, this name appears on the mandate as the statement descriptor. Mobile banking apps
         * display it as the name of the business. To use custom branding, set the Bacs Direct Debit
         * Display Name during or right after creation. Custom branding incurs an additional monthly
         * fee for the platform. If you don't set the display name before requesting Bacs
         * capability, it's automatically set as &quot;Stripe&quot; and the account is onboarded to
         * Stripe branding, which is free.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.BacsDebitPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.BacsDebitPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BankBcaOnboarding {
      /** Bank BCA business account holder name. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** Bank BCA business account number. */
      @SerializedName("business_account_number")
      String businessAccountNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BankBcaOnboarding(
          String accountHolderName, String businessAccountNumber, Map<String, Object> extraParams) {
        this.accountHolderName = accountHolderName;
        this.businessAccountNumber = businessAccountNumber;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountHolderName;

        private String businessAccountNumber;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.BankBcaOnboarding build() {
          return new AccountCreateParams.Settings.BankBcaOnboarding(
              this.accountHolderName, this.businessAccountNumber, this.extraParams);
        }

        /** Bank BCA business account holder name. */
        public Builder setAccountHolderName(String accountHolderName) {
          this.accountHolderName = accountHolderName;
          return this;
        }

        /** Bank BCA business account number. */
        public Builder setBusinessAccountNumber(String businessAccountNumber) {
          this.businessAccountNumber = businessAccountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.BankBcaOnboarding#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.BankBcaOnboarding#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Branding {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) An icon for
       * the account. Must be square and at least 128px x 128px.
       */
      @SerializedName("icon")
      String icon;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for
       * the account that will be used in Checkout instead of the icon and without the account's
       * name next to it if provided. Must be at least 128px x 128px.
       */
      @SerializedName("logo")
      String logo;

      /** A CSS hex color value representing the primary branding color for this account. */
      @SerializedName("primary_color")
      String primaryColor;

      /** A CSS hex color value representing the secondary branding color for this account. */
      @SerializedName("secondary_color")
      String secondaryColor;

      private Branding(
          Map<String, Object> extraParams,
          String icon,
          String logo,
          String primaryColor,
          String secondaryColor) {
        this.extraParams = extraParams;
        this.icon = icon;
        this.logo = logo;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String icon;

        private String logo;

        private String primaryColor;

        private String secondaryColor;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Branding build() {
          return new AccountCreateParams.Settings.Branding(
              this.extraParams, this.icon, this.logo, this.primaryColor, this.secondaryColor);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Branding#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Branding#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) An icon
         * for the account. Must be square and at least 128px x 128px.
         */
        public Builder setIcon(String icon) {
          this.icon = icon;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for
         * the account that will be used in Checkout instead of the icon and without the account's
         * name next to it if provided. Must be at least 128px x 128px.
         */
        public Builder setLogo(String logo) {
          this.logo = logo;
          return this;
        }

        /** A CSS hex color value representing the primary branding color for this account. */
        public Builder setPrimaryColor(String primaryColor) {
          this.primaryColor = primaryColor;
          return this;
        }

        /** A CSS hex color value representing the secondary branding color for this account. */
        public Builder setSecondaryColor(String secondaryColor) {
          this.secondaryColor = secondaryColor;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Capital {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Per-currency mapping of user-selected destination accounts used to pay out loans. */
      @SerializedName("payout_destination")
      Map<String, String> payoutDestination;

      /**
       * Per-currency mapping of all destination accounts eligible to receive Capital financing
       * payouts.
       */
      @SerializedName("payout_destination_selector")
      Map<String, List<String>> payoutDestinationSelector;

      private Capital(
          Map<String, Object> extraParams,
          Map<String, String> payoutDestination,
          Map<String, List<String>> payoutDestinationSelector) {
        this.extraParams = extraParams;
        this.payoutDestination = payoutDestination;
        this.payoutDestinationSelector = payoutDestinationSelector;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Map<String, String> payoutDestination;

        private Map<String, List<String>> payoutDestinationSelector;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Capital build() {
          return new AccountCreateParams.Settings.Capital(
              this.extraParams, this.payoutDestination, this.payoutDestinationSelector);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Capital#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Capital#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add a key/value pair to `payoutDestination` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Capital#payoutDestination} for the field
         * documentation.
         */
        public Builder putPayoutDestination(String key, String value) {
          if (this.payoutDestination == null) {
            this.payoutDestination = new HashMap<>();
          }
          this.payoutDestination.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `payoutDestination` map. A map is initialized for the
         * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
         * original map. See {@link AccountCreateParams.Settings.Capital#payoutDestination} for the
         * field documentation.
         */
        public Builder putAllPayoutDestination(Map<String, String> map) {
          if (this.payoutDestination == null) {
            this.payoutDestination = new HashMap<>();
          }
          this.payoutDestination.putAll(map);
          return this;
        }

        /**
         * Add a key/value pair to `payoutDestinationSelector` map. A map is initialized for the
         * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
         * original map. See {@link AccountCreateParams.Settings.Capital#payoutDestinationSelector}
         * for the field documentation.
         */
        public Builder putPayoutDestinationSelector(String key, List<String> value) {
          if (this.payoutDestinationSelector == null) {
            this.payoutDestinationSelector = new HashMap<>();
          }
          this.payoutDestinationSelector.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `payoutDestinationSelector` map. A map is initialized for
         * the first `put/putAll` call, and subsequent calls add additional key/value pairs to the
         * original map. See {@link AccountCreateParams.Settings.Capital#payoutDestinationSelector}
         * for the field documentation.
         */
        public Builder putAllPayoutDestinationSelector(Map<String, List<String>> map) {
          if (this.payoutDestinationSelector == null) {
            this.payoutDestinationSelector = new HashMap<>();
          }
          this.payoutDestinationSelector.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuing {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Details on the account's acceptance of the <a
       * href="https://stripe.com/issuing/connect/tos_acceptance">Stripe Issuing Terms and
       * Disclosures</a>.
       */
      @SerializedName("tos_acceptance")
      TosAcceptance tosAcceptance;

      private CardIssuing(Map<String, Object> extraParams, TosAcceptance tosAcceptance) {
        this.extraParams = extraParams;
        this.tosAcceptance = tosAcceptance;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private TosAcceptance tosAcceptance;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.CardIssuing build() {
          return new AccountCreateParams.Settings.CardIssuing(this.extraParams, this.tosAcceptance);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.CardIssuing#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.CardIssuing#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Details on the account's acceptance of the <a
         * href="https://stripe.com/issuing/connect/tos_acceptance">Stripe Issuing Terms and
         * Disclosures</a>.
         */
        public Builder setTosAcceptance(
            AccountCreateParams.Settings.CardIssuing.TosAcceptance tosAcceptance) {
          this.tosAcceptance = tosAcceptance;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class TosAcceptance {
        /**
         * The Unix timestamp marking when the account representative accepted the service
         * agreement.
         */
        @SerializedName("date")
        Long date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the account representative accepted the service agreement. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        Object userAgent;

        private TosAcceptance(
            Long date, Map<String, Object> extraParams, String ip, Object userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long date;

          private Map<String, Object> extraParams;

          private String ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Settings.CardIssuing.TosAcceptance build() {
            return new AccountCreateParams.Settings.CardIssuing.TosAcceptance(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The Unix timestamp marking when the account representative accepted the service
           * agreement.
           */
          public Builder setDate(Long date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.CardIssuing.TosAcceptance#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.CardIssuing.TosAcceptance#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The IP address from which the account representative accepted the service agreement.
           */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /**
           * The user agent of the browser from which the account representative accepted the
           * service agreement.
           */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }

          /**
           * The user agent of the browser from which the account representative accepted the
           * service agreement.
           */
          public Builder setUserAgent(EmptyParam userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPayments {
      /**
       * Automatically declines certain charge types regardless of whether the card issuer accepted
       * or declined the charge.
       */
      @SerializedName("decline_on")
      DeclineOn declineOn;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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
      Object statementDescriptorPrefixKana;

      /**
       * The Kanji variation of the default text that appears on credit card statements when a
       * charge is made (Japan only). This field prefixes any dynamic {@code
       * statement_descriptor_suffix_kanji} specified on the charge. {@code
       * statement_descriptor_prefix_kanji} is useful for maximizing descriptor space for the
       * dynamic portion.
       */
      @SerializedName("statement_descriptor_prefix_kanji")
      Object statementDescriptorPrefixKanji;

      private CardPayments(
          DeclineOn declineOn,
          Map<String, Object> extraParams,
          String statementDescriptorPrefix,
          Object statementDescriptorPrefixKana,
          Object statementDescriptorPrefixKanji) {
        this.declineOn = declineOn;
        this.extraParams = extraParams;
        this.statementDescriptorPrefix = statementDescriptorPrefix;
        this.statementDescriptorPrefixKana = statementDescriptorPrefixKana;
        this.statementDescriptorPrefixKanji = statementDescriptorPrefixKanji;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeclineOn declineOn;

        private Map<String, Object> extraParams;

        private String statementDescriptorPrefix;

        private Object statementDescriptorPrefixKana;

        private Object statementDescriptorPrefixKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.CardPayments build() {
          return new AccountCreateParams.Settings.CardPayments(
              this.declineOn,
              this.extraParams,
              this.statementDescriptorPrefix,
              this.statementDescriptorPrefixKana,
              this.statementDescriptorPrefixKanji);
        }

        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        public Builder setDeclineOn(AccountCreateParams.Settings.CardPayments.DeclineOn declineOn) {
          this.declineOn = declineOn;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.CardPayments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.CardPayments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic {@code statement_descriptor} specified on the charge. {@code
         * statement_descriptor_prefix} is useful for maximizing descriptor space for the dynamic
         * portion.
         */
        public Builder setStatementDescriptorPrefix(String statementDescriptorPrefix) {
          this.statementDescriptorPrefix = statementDescriptorPrefix;
          return this;
        }

        /**
         * The Kana variation of the default text that appears on credit card statements when a
         * charge is made (Japan only). This field prefixes any dynamic {@code
         * statement_descriptor_suffix_kana} specified on the charge. {@code
         * statement_descriptor_prefix_kana} is useful for maximizing descriptor space for the
         * dynamic portion.
         */
        public Builder setStatementDescriptorPrefixKana(String statementDescriptorPrefixKana) {
          this.statementDescriptorPrefixKana = statementDescriptorPrefixKana;
          return this;
        }

        /**
         * The Kana variation of the default text that appears on credit card statements when a
         * charge is made (Japan only). This field prefixes any dynamic {@code
         * statement_descriptor_suffix_kana} specified on the charge. {@code
         * statement_descriptor_prefix_kana} is useful for maximizing descriptor space for the
         * dynamic portion.
         */
        public Builder setStatementDescriptorPrefixKana(EmptyParam statementDescriptorPrefixKana) {
          this.statementDescriptorPrefixKana = statementDescriptorPrefixKana;
          return this;
        }

        /**
         * The Kanji variation of the default text that appears on credit card statements when a
         * charge is made (Japan only). This field prefixes any dynamic {@code
         * statement_descriptor_suffix_kanji} specified on the charge. {@code
         * statement_descriptor_prefix_kanji} is useful for maximizing descriptor space for the
         * dynamic portion.
         */
        public Builder setStatementDescriptorPrefixKanji(String statementDescriptorPrefixKanji) {
          this.statementDescriptorPrefixKanji = statementDescriptorPrefixKanji;
          return this;
        }

        /**
         * The Kanji variation of the default text that appears on credit card statements when a
         * charge is made (Japan only). This field prefixes any dynamic {@code
         * statement_descriptor_suffix_kanji} specified on the charge. {@code
         * statement_descriptor_prefix_kanji} is useful for maximizing descriptor space for the
         * dynamic portion.
         */
        public Builder setStatementDescriptorPrefixKanji(
            EmptyParam statementDescriptorPrefixKanji) {
          this.statementDescriptorPrefixKanji = statementDescriptorPrefixKanji;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DeclineOn {
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

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private DeclineOn(Boolean avsFailure, Boolean cvcFailure, Map<String, Object> extraParams) {
          this.avsFailure = avsFailure;
          this.cvcFailure = cvcFailure;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean avsFailure;

          private Boolean cvcFailure;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Settings.CardPayments.DeclineOn build() {
            return new AccountCreateParams.Settings.CardPayments.DeclineOn(
                this.avsFailure, this.cvcFailure, this.extraParams);
          }

          /**
           * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
           * This setting only applies when a ZIP or postal code is provided and they fail bank
           * verification.
           */
          public Builder setAvsFailure(Boolean avsFailure) {
            this.avsFailure = avsFailure;
            return this;
          }

          /**
           * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
           * applies when a CVC is provided and it fails bank verification.
           */
          public Builder setCvcFailure(Boolean cvcFailure) {
            this.cvcFailure = cvcFailure;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.CardPayments.DeclineOn#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.CardPayments.DeclineOn#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Invoices {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Whether payment methods should be saved when a payment is completed for a one-time invoices
       * on a hosted invoice page.
       */
      @SerializedName("hosted_payment_method_save")
      HostedPaymentMethodSave hostedPaymentMethodSave;

      private Invoices(
          Map<String, Object> extraParams, HostedPaymentMethodSave hostedPaymentMethodSave) {
        this.extraParams = extraParams;
        this.hostedPaymentMethodSave = hostedPaymentMethodSave;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private HostedPaymentMethodSave hostedPaymentMethodSave;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Invoices build() {
          return new AccountCreateParams.Settings.Invoices(
              this.extraParams, this.hostedPaymentMethodSave);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Invoices#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Invoices#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Whether payment methods should be saved when a payment is completed for a one-time
         * invoices on a hosted invoice page.
         */
        public Builder setHostedPaymentMethodSave(
            AccountCreateParams.Settings.Invoices.HostedPaymentMethodSave hostedPaymentMethodSave) {
          this.hostedPaymentMethodSave = hostedPaymentMethodSave;
          return this;
        }
      }

      public enum HostedPaymentMethodSave implements ApiRequestParams.EnumParam {
        @SerializedName("always")
        ALWAYS("always"),

        @SerializedName("never")
        NEVER("never"),

        @SerializedName("offer")
        OFFER("offer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        HostedPaymentMethodSave(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The default text that appears on statements for non-card charges outside of Japan. For card
       * charges, if you don't set a {@code statement_descriptor_prefix}, this text is also used as
       * the statement descriptor prefix. In that case, if concatenating the statement descriptor
       * suffix causes the combined statement descriptor to exceed 22 characters, we truncate the
       * {@code statement_descriptor} text to limit the full descriptor to 22 characters. For more
       * information about statement descriptors and their requirements, see the <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors">account settings
       * documentation</a>.
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

      private Payments(
          Map<String, Object> extraParams,
          String statementDescriptor,
          String statementDescriptorKana,
          String statementDescriptorKanji) {
        this.extraParams = extraParams;
        this.statementDescriptor = statementDescriptor;
        this.statementDescriptorKana = statementDescriptorKana;
        this.statementDescriptorKanji = statementDescriptorKanji;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String statementDescriptor;

        private String statementDescriptorKana;

        private String statementDescriptorKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Payments build() {
          return new AccountCreateParams.Settings.Payments(
              this.extraParams,
              this.statementDescriptor,
              this.statementDescriptorKana,
              this.statementDescriptorKanji);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Payments#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Payments#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The default text that appears on statements for non-card charges outside of Japan. For
         * card charges, if you don't set a {@code statement_descriptor_prefix}, this text is also
         * used as the statement descriptor prefix. In that case, if concatenating the statement
         * descriptor suffix causes the combined statement descriptor to exceed 22 characters, we
         * truncate the {@code statement_descriptor} text to limit the full descriptor to 22
         * characters. For more information about statement descriptors and their requirements, see
         * the <a href="https://docs.stripe.com/get-started/account/statement-descriptors">account
         * settings documentation</a>.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * The Kana variation of {@code statement_descriptor} used for charges in Japan. Japanese
         * statement descriptors have <a
         * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
         * requirements</a>.
         */
        public Builder setStatementDescriptorKana(String statementDescriptorKana) {
          this.statementDescriptorKana = statementDescriptorKana;
          return this;
        }

        /**
         * The Kanji variation of {@code statement_descriptor} used for charges in Japan. Japanese
         * statement descriptors have <a
         * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
         * requirements</a>.
         */
        public Builder setStatementDescriptorKanji(String statementDescriptorKanji) {
          this.statementDescriptorKanji = statementDescriptorKanji;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts {
      /**
       * A Boolean indicating whether Stripe should try to reclaim negative balances from an
       * attached bank account. For details, see <a
       * href="https://stripe.com/connect/account-balances">Understanding Connect Account
       * Balances</a>.
       */
      @SerializedName("debit_negative_balances")
      Boolean debitNegativeBalances;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Details on when funds from charges are available, and when they are paid out to an external
       * account. For details, see our <a
       * href="https://stripe.com/connect/bank-transfers#payout-information">Setting Bank and Debit
       * Card Payouts</a> documentation.
       */
      @SerializedName("schedule")
      Schedule schedule;

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      private Payouts(
          Boolean debitNegativeBalances,
          Map<String, Object> extraParams,
          Schedule schedule,
          String statementDescriptor) {
        this.debitNegativeBalances = debitNegativeBalances;
        this.extraParams = extraParams;
        this.schedule = schedule;
        this.statementDescriptor = statementDescriptor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean debitNegativeBalances;

        private Map<String, Object> extraParams;

        private Schedule schedule;

        private String statementDescriptor;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Payouts build() {
          return new AccountCreateParams.Settings.Payouts(
              this.debitNegativeBalances,
              this.extraParams,
              this.schedule,
              this.statementDescriptor);
        }

        /**
         * A Boolean indicating whether Stripe should try to reclaim negative balances from an
         * attached bank account. For details, see <a
         * href="https://stripe.com/connect/account-balances">Understanding Connect Account
         * Balances</a>.
         */
        public Builder setDebitNegativeBalances(Boolean debitNegativeBalances) {
          this.debitNegativeBalances = debitNegativeBalances;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Payouts#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Payouts#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Details on when funds from charges are available, and when they are paid out to an
         * external account. For details, see our <a
         * href="https://stripe.com/connect/bank-transfers#payout-information">Setting Bank and
         * Debit Card Payouts</a> documentation.
         */
        public Builder setSchedule(AccountCreateParams.Settings.Payouts.Schedule schedule) {
          this.schedule = schedule;
          return this;
        }

        /**
         * The text that appears on the bank account statement for payouts. If not set, this
         * defaults to the platform's bank descriptor as set in the Dashboard.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Schedule {
        /**
         * The number of days charge funds are held before being paid out. May also be set to {@code
         * minimum}, representing the lowest available value for the account country. Default is
         * {@code minimum}. The {@code delay_days} parameter remains at the last configured value if
         * {@code interval} is {@code manual}. <a
         * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling
         * payout delay days</a>.
         */
        @SerializedName("delay_days")
        Object delayDays;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * How frequently available funds are paid out. One of: {@code daily}, {@code manual},
         * {@code weekly}, or {@code monthly}. Default is {@code daily}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The day of the month when available funds are paid out, specified as a number between
         * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead
         * sent on the last day of a shorter month. Required and applicable only if {@code interval}
         * is {@code monthly}.
         */
        @SerializedName("monthly_anchor")
        Long monthlyAnchor;

        /**
         * The days of the month when available funds are paid out, specified as an array of numbers
         * between 1--31. Payouts nominally scheduled between the 29th and 31st of the month are
         * instead sent on the last day of a shorter month. Required and applicable only if {@code
         * interval} is {@code monthly} and {@code monthly_anchor} is not set.
         */
        @SerializedName("monthly_payout_days")
        List<Long> monthlyPayoutDays;

        /**
         * The day of the week when available funds are paid out, specified as {@code monday},
         * {@code tuesday}, etc. (required and applicable only if {@code interval} is {@code
         * weekly}.)
         */
        @SerializedName("weekly_anchor")
        WeeklyAnchor weeklyAnchor;

        /**
         * The days of the week when available funds are paid out, specified as an array, e.g.,
         * [{@code monday}, {@code tuesday}]. (required and applicable only if {@code interval} is
         * {@code weekly} and {@code weekly_anchor} is not set.)
         */
        @SerializedName("weekly_payout_days")
        List<AccountCreateParams.Settings.Payouts.Schedule.WeeklyPayoutDay> weeklyPayoutDays;

        private Schedule(
            Object delayDays,
            Map<String, Object> extraParams,
            Interval interval,
            Long monthlyAnchor,
            List<Long> monthlyPayoutDays,
            WeeklyAnchor weeklyAnchor,
            List<AccountCreateParams.Settings.Payouts.Schedule.WeeklyPayoutDay> weeklyPayoutDays) {
          this.delayDays = delayDays;
          this.extraParams = extraParams;
          this.interval = interval;
          this.monthlyAnchor = monthlyAnchor;
          this.monthlyPayoutDays = monthlyPayoutDays;
          this.weeklyAnchor = weeklyAnchor;
          this.weeklyPayoutDays = weeklyPayoutDays;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object delayDays;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long monthlyAnchor;

          private List<Long> monthlyPayoutDays;

          private WeeklyAnchor weeklyAnchor;

          private List<AccountCreateParams.Settings.Payouts.Schedule.WeeklyPayoutDay>
              weeklyPayoutDays;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Settings.Payouts.Schedule build() {
            return new AccountCreateParams.Settings.Payouts.Schedule(
                this.delayDays,
                this.extraParams,
                this.interval,
                this.monthlyAnchor,
                this.monthlyPayoutDays,
                this.weeklyAnchor,
                this.weeklyPayoutDays);
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * {@code minimum}, representing the lowest available value for the account country.
           * Default is {@code minimum}. The {@code delay_days} parameter remains at the last
           * configured value if {@code interval} is {@code manual}. <a
           * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling
           * payout delay days</a>.
           */
          public Builder setDelayDays(
              AccountCreateParams.Settings.Payouts.Schedule.DelayDays delayDays) {
            this.delayDays = delayDays;
            return this;
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * {@code minimum}, representing the lowest available value for the account country.
           * Default is {@code minimum}. The {@code delay_days} parameter remains at the last
           * configured value if {@code interval} is {@code manual}. <a
           * href="https://stripe.com/connect/manage-payout-schedule">Learn more about controlling
           * payout delay days</a>.
           */
          public Builder setDelayDays(Long delayDays) {
            this.delayDays = delayDays;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.Payouts.Schedule#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.Payouts.Schedule#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * How frequently available funds are paid out. One of: {@code daily}, {@code manual},
           * {@code weekly}, or {@code monthly}. Default is {@code daily}.
           */
          public Builder setInterval(
              AccountCreateParams.Settings.Payouts.Schedule.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The day of the month when available funds are paid out, specified as a number between
           * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead
           * sent on the last day of a shorter month. Required and applicable only if {@code
           * interval} is {@code monthly}.
           */
          public Builder setMonthlyAnchor(Long monthlyAnchor) {
            this.monthlyAnchor = monthlyAnchor;
            return this;
          }

          /**
           * Add an element to `monthlyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountCreateParams.Settings.Payouts.Schedule#monthlyPayoutDays} for the
           * field documentation.
           */
          public Builder addMonthlyPayoutDay(Long element) {
            if (this.monthlyPayoutDays == null) {
              this.monthlyPayoutDays = new ArrayList<>();
            }
            this.monthlyPayoutDays.add(element);
            return this;
          }

          /**
           * Add all elements to `monthlyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountCreateParams.Settings.Payouts.Schedule#monthlyPayoutDays} for the
           * field documentation.
           */
          public Builder addAllMonthlyPayoutDay(List<Long> elements) {
            if (this.monthlyPayoutDays == null) {
              this.monthlyPayoutDays = new ArrayList<>();
            }
            this.monthlyPayoutDays.addAll(elements);
            return this;
          }

          /**
           * The day of the week when available funds are paid out, specified as {@code monday},
           * {@code tuesday}, etc. (required and applicable only if {@code interval} is {@code
           * weekly}.)
           */
          public Builder setWeeklyAnchor(
              AccountCreateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor) {
            this.weeklyAnchor = weeklyAnchor;
            return this;
          }

          /**
           * Add an element to `weeklyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountCreateParams.Settings.Payouts.Schedule#weeklyPayoutDays} for the
           * field documentation.
           */
          public Builder addWeeklyPayoutDay(
              AccountCreateParams.Settings.Payouts.Schedule.WeeklyPayoutDay element) {
            if (this.weeklyPayoutDays == null) {
              this.weeklyPayoutDays = new ArrayList<>();
            }
            this.weeklyPayoutDays.add(element);
            return this;
          }

          /**
           * Add all elements to `weeklyPayoutDays` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountCreateParams.Settings.Payouts.Schedule#weeklyPayoutDays} for the
           * field documentation.
           */
          public Builder addAllWeeklyPayoutDay(
              List<AccountCreateParams.Settings.Payouts.Schedule.WeeklyPayoutDay> elements) {
            if (this.weeklyPayoutDays == null) {
              this.weeklyPayoutDays = new ArrayList<>();
            }
            this.weeklyPayoutDays.addAll(elements);
            return this;
          }
        }

        public enum DelayDays implements ApiRequestParams.EnumParam {
          @SerializedName("minimum")
          MINIMUM("minimum");

          @Getter(onMethod_ = {@Override})
          private final String value;

          DelayDays(String value) {
            this.value = value;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("daily")
          DAILY("daily"),

          @SerializedName("manual")
          MANUAL("manual"),

          @SerializedName("monthly")
          MONTHLY("monthly"),

          @SerializedName("weekly")
          WEEKLY("weekly");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }

        public enum WeeklyAnchor implements ApiRequestParams.EnumParam {
          @SerializedName("friday")
          FRIDAY("friday"),

          @SerializedName("monday")
          MONDAY("monday"),

          @SerializedName("saturday")
          SATURDAY("saturday"),

          @SerializedName("sunday")
          SUNDAY("sunday"),

          @SerializedName("thursday")
          THURSDAY("thursday"),

          @SerializedName("tuesday")
          TUESDAY("tuesday"),

          @SerializedName("wednesday")
          WEDNESDAY("wednesday");

          @Getter(onMethod_ = {@Override})
          private final String value;

          WeeklyAnchor(String value) {
            this.value = value;
          }
        }

        public enum WeeklyPayoutDay implements ApiRequestParams.EnumParam {
          @SerializedName("friday")
          FRIDAY("friday"),

          @SerializedName("monday")
          MONDAY("monday"),

          @SerializedName("saturday")
          SATURDAY("saturday"),

          @SerializedName("sunday")
          SUNDAY("sunday"),

          @SerializedName("thursday")
          THURSDAY("thursday"),

          @SerializedName("tuesday")
          TUESDAY("tuesday"),

          @SerializedName("wednesday")
          WEDNESDAY("wednesday");

          @Getter(onMethod_ = {@Override})
          private final String value;

          WeeklyPayoutDay(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxForms {
      /** Whether the account opted out of receiving their tax forms by postal delivery. */
      @SerializedName("consented_to_paperless_delivery")
      Boolean consentedToPaperlessDelivery;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TaxForms(Boolean consentedToPaperlessDelivery, Map<String, Object> extraParams) {
        this.consentedToPaperlessDelivery = consentedToPaperlessDelivery;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean consentedToPaperlessDelivery;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.TaxForms build() {
          return new AccountCreateParams.Settings.TaxForms(
              this.consentedToPaperlessDelivery, this.extraParams);
        }

        /** Whether the account opted out of receiving their tax forms by postal delivery. */
        public Builder setConsentedToPaperlessDelivery(Boolean consentedToPaperlessDelivery) {
          this.consentedToPaperlessDelivery = consentedToPaperlessDelivery;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.TaxForms#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.TaxForms#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Treasury {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details on the account's acceptance of the Stripe Treasury Services Agreement. */
      @SerializedName("tos_acceptance")
      TosAcceptance tosAcceptance;

      private Treasury(Map<String, Object> extraParams, TosAcceptance tosAcceptance) {
        this.extraParams = extraParams;
        this.tosAcceptance = tosAcceptance;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private TosAcceptance tosAcceptance;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountCreateParams.Settings.Treasury build() {
          return new AccountCreateParams.Settings.Treasury(this.extraParams, this.tosAcceptance);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Treasury#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountCreateParams.Settings.Treasury#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details on the account's acceptance of the Stripe Treasury Services Agreement. */
        public Builder setTosAcceptance(
            AccountCreateParams.Settings.Treasury.TosAcceptance tosAcceptance) {
          this.tosAcceptance = tosAcceptance;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class TosAcceptance {
        /**
         * The Unix timestamp marking when the account representative accepted the service
         * agreement.
         */
        @SerializedName("date")
        Long date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the account representative accepted the service agreement. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        Object userAgent;

        private TosAcceptance(
            Long date, Map<String, Object> extraParams, String ip, Object userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long date;

          private Map<String, Object> extraParams;

          private String ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountCreateParams.Settings.Treasury.TosAcceptance build() {
            return new AccountCreateParams.Settings.Treasury.TosAcceptance(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The Unix timestamp marking when the account representative accepted the service
           * agreement.
           */
          public Builder setDate(Long date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.Treasury.TosAcceptance#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountCreateParams.Settings.Treasury.TosAcceptance#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The IP address from which the account representative accepted the service agreement.
           */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /**
           * The user agent of the browser from which the account representative accepted the
           * service agreement.
           */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }

          /**
           * The user agent of the browser from which the account representative accepted the
           * service agreement.
           */
          public Builder setUserAgent(EmptyParam userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TosAcceptance {
    /**
     * The Unix timestamp marking when the account representative accepted their service agreement.
     */
    @SerializedName("date")
    Long date;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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

    private TosAcceptance(
        Long date,
        Map<String, Object> extraParams,
        String ip,
        String serviceAgreement,
        String userAgent) {
      this.date = date;
      this.extraParams = extraParams;
      this.ip = ip;
      this.serviceAgreement = serviceAgreement;
      this.userAgent = userAgent;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long date;

      private Map<String, Object> extraParams;

      private String ip;

      private String serviceAgreement;

      private String userAgent;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.TosAcceptance build() {
        return new AccountCreateParams.TosAcceptance(
            this.date, this.extraParams, this.ip, this.serviceAgreement, this.userAgent);
      }

      /**
       * The Unix timestamp marking when the account representative accepted their service
       * agreement.
       */
      public Builder setDate(Long date) {
        this.date = date;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountCreateParams.TosAcceptance#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountCreateParams.TosAcceptance#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The IP address from which the account representative accepted their service agreement. */
      public Builder setIp(String ip) {
        this.ip = ip;
        return this;
      }

      /** The user's service agreement type. */
      public Builder setServiceAgreement(String serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
        return this;
      }

      /**
       * The user agent of the browser from which the account representative accepted their service
       * agreement.
       */
      public Builder setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
      }
    }
  }

  public enum BusinessType implements ApiRequestParams.EnumParam {
    @SerializedName("company")
    COMPANY("company"),

    @SerializedName("government_entity")
    GOVERNMENT_ENTITY("government_entity"),

    @SerializedName("individual")
    INDIVIDUAL("individual"),

    @SerializedName("non_profit")
    NON_PROFIT("non_profit");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BusinessType(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("custom")
    CUSTOM("custom"),

    @SerializedName("express")
    EXPRESS("express"),

    @SerializedName("standard")
    STANDARD("standard");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
