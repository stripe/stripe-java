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
import lombok.Getter;

@Getter
public class AccountUpdateParams extends ApiRequestParams {
  /**
   * An <a href="https://stripe.com/docs/api#create_account_token">account token</a>, used to
   * securely provide details to the account.
   */
  @SerializedName("account_token")
  Object accountToken;

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

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that <a href="https://docs.stripe.com/payouts">Stripe supports in the account's
   * country</a>.
   */
  @SerializedName("default_currency")
  Object defaultCurrency;

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
  Object email;

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
  Object externalAccount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

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

  private AccountUpdateParams(
      Object accountToken,
      BusinessProfile businessProfile,
      BusinessType businessType,
      Capabilities capabilities,
      Company company,
      Object defaultCurrency,
      Documents documents,
      Object email,
      List<String> expand,
      Object externalAccount,
      Map<String, Object> extraParams,
      Individual individual,
      Object metadata,
      RiskControls riskControls,
      Settings settings,
      TosAcceptance tosAcceptance) {
    this.accountToken = accountToken;
    this.businessProfile = businessProfile;
    this.businessType = businessType;
    this.capabilities = capabilities;
    this.company = company;
    this.defaultCurrency = defaultCurrency;
    this.documents = documents;
    this.email = email;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.extraParams = extraParams;
    this.individual = individual;
    this.metadata = metadata;
    this.riskControls = riskControls;
    this.settings = settings;
    this.tosAcceptance = tosAcceptance;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountToken;

    private BusinessProfile businessProfile;

    private BusinessType businessType;

    private Capabilities capabilities;

    private Company company;

    private Object defaultCurrency;

    private Documents documents;

    private Object email;

    private List<String> expand;

    private Object externalAccount;

    private Map<String, Object> extraParams;

    private Individual individual;

    private Object metadata;

    private RiskControls riskControls;

    private Settings settings;

    private TosAcceptance tosAcceptance;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountUpdateParams build() {
      return new AccountUpdateParams(
          this.accountToken,
          this.businessProfile,
          this.businessType,
          this.capabilities,
          this.company,
          this.defaultCurrency,
          this.documents,
          this.email,
          this.expand,
          this.externalAccount,
          this.extraParams,
          this.individual,
          this.metadata,
          this.riskControls,
          this.settings,
          this.tosAcceptance);
    }

    /**
     * An <a href="https://stripe.com/docs/api#create_account_token">account token</a>, used to
     * securely provide details to the account.
     */
    public Builder setAccountToken(String accountToken) {
      this.accountToken = accountToken;
      return this;
    }

    /**
     * An <a href="https://stripe.com/docs/api#create_account_token">account token</a>, used to
     * securely provide details to the account.
     */
    public Builder setAccountToken(EmptyParam accountToken) {
      this.accountToken = accountToken;
      return this;
    }

    /** Business information about the account. */
    public Builder setBusinessProfile(AccountUpdateParams.BusinessProfile businessProfile) {
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
    public Builder setBusinessType(AccountUpdateParams.BusinessType businessType) {
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
    public Builder setCapabilities(AccountUpdateParams.Capabilities capabilities) {
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
    public Builder setCompany(AccountUpdateParams.Company company) {
      this.company = company;
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

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must
     * be a currency that <a href="https://docs.stripe.com/payouts">Stripe supports in the account's
     * country</a>.
     */
    public Builder setDefaultCurrency(EmptyParam defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(AccountUpdateParams.Documents documents) {
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
     * The email address of the account holder. This is only to make the account easier to identify
     * to you. If <a
     * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
     * is {@code application}, which includes Custom accounts, Stripe doesn't email the account
     * without your consent.
     */
    public Builder setEmail(EmptyParam email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#expand} for the field documentation.
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
     * AccountUpdateParams#expand} for the field documentation.
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
    public Builder setExternalAccount(EmptyParam externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
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
    public Builder setIndividual(AccountUpdateParams.Individual individual) {
      this.individual = individual;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
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
     * See {@link AccountUpdateParams#metadata} for the field documentation.
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
    public Builder setRiskControls(AccountUpdateParams.RiskControls riskControls) {
      this.riskControls = riskControls;
      return this;
    }

    /** Options for customizing how the account functions within Stripe. */
    public Builder setSettings(AccountUpdateParams.Settings settings) {
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
    public Builder setTosAcceptance(AccountUpdateParams.TosAcceptance tosAcceptance) {
      this.tosAcceptance = tosAcceptance;
      return this;
    }
  }

  @Getter
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
    Object mcc;

    /**
     * An estimate of the monthly revenue of the business. Only accepted for accounts in Brazil and
     * India.
     */
    @SerializedName("monthly_estimated_revenue")
    MonthlyEstimatedRevenue monthlyEstimatedRevenue;

    /** The customer-facing business name. */
    @SerializedName("name")
    Object name;

    /**
     * Internal-only description of the product sold by, or service provided by, the business. Used
     * by Stripe for risk and underwriting purposes.
     */
    @SerializedName("product_description")
    Object productDescription;

    /** A publicly available mailing address for sending support issues to. */
    @SerializedName("support_address")
    SupportAddress supportAddress;

    /** A publicly available email address for sending support issues to. */
    @SerializedName("support_email")
    Object supportEmail;

    /** A publicly available phone number to call with support issues. */
    @SerializedName("support_phone")
    Object supportPhone;

    /** A publicly available website for handling support issues. */
    @SerializedName("support_url")
    Object supportUrl;

    /** The business's publicly available website. */
    @SerializedName("url")
    Object url;

    private BusinessProfile(
        AnnualRevenue annualRevenue,
        Long estimatedWorkerCount,
        Map<String, Object> extraParams,
        Object mcc,
        MonthlyEstimatedRevenue monthlyEstimatedRevenue,
        Object name,
        Object productDescription,
        SupportAddress supportAddress,
        Object supportEmail,
        Object supportPhone,
        Object supportUrl,
        Object url) {
      this.annualRevenue = annualRevenue;
      this.estimatedWorkerCount = estimatedWorkerCount;
      this.extraParams = extraParams;
      this.mcc = mcc;
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

      private Object mcc;

      private MonthlyEstimatedRevenue monthlyEstimatedRevenue;

      private Object name;

      private Object productDescription;

      private SupportAddress supportAddress;

      private Object supportEmail;

      private Object supportPhone;

      private Object supportUrl;

      private Object url;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.BusinessProfile build() {
        return new AccountUpdateParams.BusinessProfile(
            this.annualRevenue,
            this.estimatedWorkerCount,
            this.extraParams,
            this.mcc,
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
          AccountUpdateParams.BusinessProfile.AnnualRevenue annualRevenue) {
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
       * AccountUpdateParams.BusinessProfile#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.BusinessProfile#extraParams} for the field documentation.
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
       * <a href="https://stripe.com/connect/setting-mcc">The merchant category code for the
       * account</a>. MCCs are used to classify businesses based on the goods or services they
       * provide.
       */
      public Builder setMcc(EmptyParam mcc) {
        this.mcc = mcc;
        return this;
      }

      /**
       * An estimate of the monthly revenue of the business. Only accepted for accounts in Brazil
       * and India.
       */
      public Builder setMonthlyEstimatedRevenue(
          AccountUpdateParams.BusinessProfile.MonthlyEstimatedRevenue monthlyEstimatedRevenue) {
        this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
        return this;
      }

      /** The customer-facing business name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The customer-facing business name. */
      public Builder setName(EmptyParam name) {
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

      /**
       * Internal-only description of the product sold by, or service provided by, the business.
       * Used by Stripe for risk and underwriting purposes.
       */
      public Builder setProductDescription(EmptyParam productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      /** A publicly available mailing address for sending support issues to. */
      public Builder setSupportAddress(
          AccountUpdateParams.BusinessProfile.SupportAddress supportAddress) {
        this.supportAddress = supportAddress;
        return this;
      }

      /** A publicly available email address for sending support issues to. */
      public Builder setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
      }

      /** A publicly available email address for sending support issues to. */
      public Builder setSupportEmail(EmptyParam supportEmail) {
        this.supportEmail = supportEmail;
        return this;
      }

      /** A publicly available phone number to call with support issues. */
      public Builder setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
        return this;
      }

      /** A publicly available phone number to call with support issues. */
      public Builder setSupportPhone(EmptyParam supportPhone) {
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

      /** The business's publicly available website. */
      public Builder setUrl(EmptyParam url) {
        this.url = url;
        return this;
      }
    }

    @Getter
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
      Object currency;

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
      Object fiscalYearEnd;

      private AnnualRevenue(
          Long amount, Object currency, Map<String, Object> extraParams, Object fiscalYearEnd) {
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

        private Object currency;

        private Map<String, Object> extraParams;

        private Object fiscalYearEnd;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.BusinessProfile.AnnualRevenue build() {
          return new AccountUpdateParams.BusinessProfile.AnnualRevenue(
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
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.BusinessProfile.AnnualRevenue#extraParams} for the
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
         * map. See {@link AccountUpdateParams.BusinessProfile.AnnualRevenue#extraParams} for the
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

        /**
         * <strong>Required.</strong> The close-out date of the preceding fiscal year in ISO 8601
         * format. E.g. 2023-12-31 for the 31st of December, 2023.
         */
        public Builder setFiscalYearEnd(EmptyParam fiscalYearEnd) {
          this.fiscalYearEnd = fiscalYearEnd;
          return this;
        }
      }
    }

    @Getter
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
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private MonthlyEstimatedRevenue(
          Long amount, Object currency, Map<String, Object> extraParams) {
        this.amount = amount;
        this.currency = currency;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private Object currency;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.BusinessProfile.MonthlyEstimatedRevenue build() {
          return new AccountUpdateParams.BusinessProfile.MonthlyEstimatedRevenue(
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
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.BusinessProfile.MonthlyEstimatedRevenue#extraParams}
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
         * map. See {@link AccountUpdateParams.BusinessProfile.MonthlyEstimatedRevenue#extraParams}
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
    public static class SupportAddress {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private SupportAddress(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.BusinessProfile.SupportAddress build() {
          return new AccountUpdateParams.BusinessProfile.SupportAddress(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.BusinessProfile.SupportAddress#extraParams} for the
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
         * map. See {@link AccountUpdateParams.BusinessProfile.SupportAddress#extraParams} for the
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
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

    /** The amazon_pay_payments capability. */
    @SerializedName("amazon_pay_payments")
    AmazonPayPayments amazonPayPayments;

    /** The au_becs_debit_payments capability. */
    @SerializedName("au_becs_debit_payments")
    AuBecsDebitPayments auBecsDebitPayments;

    /** The bacs_debit_payments capability. */
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

    /** The bancontact_payments capability. */
    @SerializedName("bancontact_payments")
    BancontactPayments bancontactPayments;

    /** The bank_transfer_payments capability. */
    @SerializedName("bank_transfer_payments")
    BankTransferPayments bankTransferPayments;

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

    /** The grabpay_payments capability. */
    @SerializedName("grabpay_payments")
    GrabpayPayments grabpayPayments;

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

    /** The klarna_payments capability. */
    @SerializedName("klarna_payments")
    KlarnaPayments klarnaPayments;

    /** The konbini_payments capability. */
    @SerializedName("konbini_payments")
    KonbiniPayments konbiniPayments;

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

    /** The oxxo_payments capability. */
    @SerializedName("oxxo_payments")
    OxxoPayments oxxoPayments;

    /** The p24_payments capability. */
    @SerializedName("p24_payments")
    P24Payments p24Payments;

    /** The paynow_payments capability. */
    @SerializedName("paynow_payments")
    PaynowPayments paynowPayments;

    /** The paypal_payments capability. */
    @SerializedName("paypal_payments")
    PaypalPayments paypalPayments;

    /** The payto_payments capability. */
    @SerializedName("payto_payments")
    PaytoPayments paytoPayments;

    /** The promptpay_payments capability. */
    @SerializedName("promptpay_payments")
    PromptpayPayments promptpayPayments;

    /** The rechnung_payments capability. */
    @SerializedName("rechnung_payments")
    RechnungPayments rechnungPayments;

    /** The revolut_pay_payments capability. */
    @SerializedName("revolut_pay_payments")
    RevolutPayPayments revolutPayPayments;

    /** The sepa_bank_transfer_payments capability. */
    @SerializedName("sepa_bank_transfer_payments")
    SepaBankTransferPayments sepaBankTransferPayments;

    /** The sepa_debit_payments capability. */
    @SerializedName("sepa_debit_payments")
    SepaDebitPayments sepaDebitPayments;

    /** The sofort_payments capability. */
    @SerializedName("sofort_payments")
    SofortPayments sofortPayments;

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
        AmazonPayPayments amazonPayPayments,
        AuBecsDebitPayments auBecsDebitPayments,
        BacsDebitPayments bacsDebitPayments,
        BancontactPayments bancontactPayments,
        BankTransferPayments bankTransferPayments,
        BlikPayments blikPayments,
        BoletoPayments boletoPayments,
        CardIssuing cardIssuing,
        CardPayments cardPayments,
        CartesBancairesPayments cartesBancairesPayments,
        CashappPayments cashappPayments,
        EpsPayments epsPayments,
        Map<String, Object> extraParams,
        FpxPayments fpxPayments,
        GbBankTransferPayments gbBankTransferPayments,
        GiropayPayments giropayPayments,
        GrabpayPayments grabpayPayments,
        IdealPayments idealPayments,
        IndiaInternationalPayments indiaInternationalPayments,
        JcbPayments jcbPayments,
        JpBankTransferPayments jpBankTransferPayments,
        KlarnaPayments klarnaPayments,
        KonbiniPayments konbiniPayments,
        LegacyPayments legacyPayments,
        LinkPayments linkPayments,
        MbWayPayments mbWayPayments,
        MobilepayPayments mobilepayPayments,
        MultibancoPayments multibancoPayments,
        MxBankTransferPayments mxBankTransferPayments,
        OxxoPayments oxxoPayments,
        P24Payments p24Payments,
        PaynowPayments paynowPayments,
        PaypalPayments paypalPayments,
        PaytoPayments paytoPayments,
        PromptpayPayments promptpayPayments,
        RechnungPayments rechnungPayments,
        RevolutPayPayments revolutPayPayments,
        SepaBankTransferPayments sepaBankTransferPayments,
        SepaDebitPayments sepaDebitPayments,
        SofortPayments sofortPayments,
        SwishPayments swishPayments,
        TaxReportingUs1099K taxReportingUs1099K,
        TaxReportingUs1099Misc taxReportingUs1099Misc,
        Transfers transfers,
        Treasury treasury,
        TwintPayments twintPayments,
        UsBankAccountAchPayments usBankAccountAchPayments,
        UsBankTransferPayments usBankTransferPayments,
        ZipPayments zipPayments) {
      this.acssDebitPayments = acssDebitPayments;
      this.affirmPayments = affirmPayments;
      this.afterpayClearpayPayments = afterpayClearpayPayments;
      this.amazonPayPayments = amazonPayPayments;
      this.auBecsDebitPayments = auBecsDebitPayments;
      this.bacsDebitPayments = bacsDebitPayments;
      this.bancontactPayments = bancontactPayments;
      this.bankTransferPayments = bankTransferPayments;
      this.blikPayments = blikPayments;
      this.boletoPayments = boletoPayments;
      this.cardIssuing = cardIssuing;
      this.cardPayments = cardPayments;
      this.cartesBancairesPayments = cartesBancairesPayments;
      this.cashappPayments = cashappPayments;
      this.epsPayments = epsPayments;
      this.extraParams = extraParams;
      this.fpxPayments = fpxPayments;
      this.gbBankTransferPayments = gbBankTransferPayments;
      this.giropayPayments = giropayPayments;
      this.grabpayPayments = grabpayPayments;
      this.idealPayments = idealPayments;
      this.indiaInternationalPayments = indiaInternationalPayments;
      this.jcbPayments = jcbPayments;
      this.jpBankTransferPayments = jpBankTransferPayments;
      this.klarnaPayments = klarnaPayments;
      this.konbiniPayments = konbiniPayments;
      this.legacyPayments = legacyPayments;
      this.linkPayments = linkPayments;
      this.mbWayPayments = mbWayPayments;
      this.mobilepayPayments = mobilepayPayments;
      this.multibancoPayments = multibancoPayments;
      this.mxBankTransferPayments = mxBankTransferPayments;
      this.oxxoPayments = oxxoPayments;
      this.p24Payments = p24Payments;
      this.paynowPayments = paynowPayments;
      this.paypalPayments = paypalPayments;
      this.paytoPayments = paytoPayments;
      this.promptpayPayments = promptpayPayments;
      this.rechnungPayments = rechnungPayments;
      this.revolutPayPayments = revolutPayPayments;
      this.sepaBankTransferPayments = sepaBankTransferPayments;
      this.sepaDebitPayments = sepaDebitPayments;
      this.sofortPayments = sofortPayments;
      this.swishPayments = swishPayments;
      this.taxReportingUs1099K = taxReportingUs1099K;
      this.taxReportingUs1099Misc = taxReportingUs1099Misc;
      this.transfers = transfers;
      this.treasury = treasury;
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

      private AmazonPayPayments amazonPayPayments;

      private AuBecsDebitPayments auBecsDebitPayments;

      private BacsDebitPayments bacsDebitPayments;

      private BancontactPayments bancontactPayments;

      private BankTransferPayments bankTransferPayments;

      private BlikPayments blikPayments;

      private BoletoPayments boletoPayments;

      private CardIssuing cardIssuing;

      private CardPayments cardPayments;

      private CartesBancairesPayments cartesBancairesPayments;

      private CashappPayments cashappPayments;

      private EpsPayments epsPayments;

      private Map<String, Object> extraParams;

      private FpxPayments fpxPayments;

      private GbBankTransferPayments gbBankTransferPayments;

      private GiropayPayments giropayPayments;

      private GrabpayPayments grabpayPayments;

      private IdealPayments idealPayments;

      private IndiaInternationalPayments indiaInternationalPayments;

      private JcbPayments jcbPayments;

      private JpBankTransferPayments jpBankTransferPayments;

      private KlarnaPayments klarnaPayments;

      private KonbiniPayments konbiniPayments;

      private LegacyPayments legacyPayments;

      private LinkPayments linkPayments;

      private MbWayPayments mbWayPayments;

      private MobilepayPayments mobilepayPayments;

      private MultibancoPayments multibancoPayments;

      private MxBankTransferPayments mxBankTransferPayments;

      private OxxoPayments oxxoPayments;

      private P24Payments p24Payments;

      private PaynowPayments paynowPayments;

      private PaypalPayments paypalPayments;

      private PaytoPayments paytoPayments;

      private PromptpayPayments promptpayPayments;

      private RechnungPayments rechnungPayments;

      private RevolutPayPayments revolutPayPayments;

      private SepaBankTransferPayments sepaBankTransferPayments;

      private SepaDebitPayments sepaDebitPayments;

      private SofortPayments sofortPayments;

      private SwishPayments swishPayments;

      private TaxReportingUs1099K taxReportingUs1099K;

      private TaxReportingUs1099Misc taxReportingUs1099Misc;

      private Transfers transfers;

      private Treasury treasury;

      private TwintPayments twintPayments;

      private UsBankAccountAchPayments usBankAccountAchPayments;

      private UsBankTransferPayments usBankTransferPayments;

      private ZipPayments zipPayments;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Capabilities build() {
        return new AccountUpdateParams.Capabilities(
            this.acssDebitPayments,
            this.affirmPayments,
            this.afterpayClearpayPayments,
            this.amazonPayPayments,
            this.auBecsDebitPayments,
            this.bacsDebitPayments,
            this.bancontactPayments,
            this.bankTransferPayments,
            this.blikPayments,
            this.boletoPayments,
            this.cardIssuing,
            this.cardPayments,
            this.cartesBancairesPayments,
            this.cashappPayments,
            this.epsPayments,
            this.extraParams,
            this.fpxPayments,
            this.gbBankTransferPayments,
            this.giropayPayments,
            this.grabpayPayments,
            this.idealPayments,
            this.indiaInternationalPayments,
            this.jcbPayments,
            this.jpBankTransferPayments,
            this.klarnaPayments,
            this.konbiniPayments,
            this.legacyPayments,
            this.linkPayments,
            this.mbWayPayments,
            this.mobilepayPayments,
            this.multibancoPayments,
            this.mxBankTransferPayments,
            this.oxxoPayments,
            this.p24Payments,
            this.paynowPayments,
            this.paypalPayments,
            this.paytoPayments,
            this.promptpayPayments,
            this.rechnungPayments,
            this.revolutPayPayments,
            this.sepaBankTransferPayments,
            this.sepaDebitPayments,
            this.sofortPayments,
            this.swishPayments,
            this.taxReportingUs1099K,
            this.taxReportingUs1099Misc,
            this.transfers,
            this.treasury,
            this.twintPayments,
            this.usBankAccountAchPayments,
            this.usBankTransferPayments,
            this.zipPayments);
      }

      /** The acss_debit_payments capability. */
      public Builder setAcssDebitPayments(
          AccountUpdateParams.Capabilities.AcssDebitPayments acssDebitPayments) {
        this.acssDebitPayments = acssDebitPayments;
        return this;
      }

      /** The affirm_payments capability. */
      public Builder setAffirmPayments(
          AccountUpdateParams.Capabilities.AffirmPayments affirmPayments) {
        this.affirmPayments = affirmPayments;
        return this;
      }

      /** The afterpay_clearpay_payments capability. */
      public Builder setAfterpayClearpayPayments(
          AccountUpdateParams.Capabilities.AfterpayClearpayPayments afterpayClearpayPayments) {
        this.afterpayClearpayPayments = afterpayClearpayPayments;
        return this;
      }

      /** The amazon_pay_payments capability. */
      public Builder setAmazonPayPayments(
          AccountUpdateParams.Capabilities.AmazonPayPayments amazonPayPayments) {
        this.amazonPayPayments = amazonPayPayments;
        return this;
      }

      /** The au_becs_debit_payments capability. */
      public Builder setAuBecsDebitPayments(
          AccountUpdateParams.Capabilities.AuBecsDebitPayments auBecsDebitPayments) {
        this.auBecsDebitPayments = auBecsDebitPayments;
        return this;
      }

      /** The bacs_debit_payments capability. */
      public Builder setBacsDebitPayments(
          AccountUpdateParams.Capabilities.BacsDebitPayments bacsDebitPayments) {
        this.bacsDebitPayments = bacsDebitPayments;
        return this;
      }

      /** The bancontact_payments capability. */
      public Builder setBancontactPayments(
          AccountUpdateParams.Capabilities.BancontactPayments bancontactPayments) {
        this.bancontactPayments = bancontactPayments;
        return this;
      }

      /** The bank_transfer_payments capability. */
      public Builder setBankTransferPayments(
          AccountUpdateParams.Capabilities.BankTransferPayments bankTransferPayments) {
        this.bankTransferPayments = bankTransferPayments;
        return this;
      }

      /** The blik_payments capability. */
      public Builder setBlikPayments(AccountUpdateParams.Capabilities.BlikPayments blikPayments) {
        this.blikPayments = blikPayments;
        return this;
      }

      /** The boleto_payments capability. */
      public Builder setBoletoPayments(
          AccountUpdateParams.Capabilities.BoletoPayments boletoPayments) {
        this.boletoPayments = boletoPayments;
        return this;
      }

      /** The card_issuing capability. */
      public Builder setCardIssuing(AccountUpdateParams.Capabilities.CardIssuing cardIssuing) {
        this.cardIssuing = cardIssuing;
        return this;
      }

      /** The card_payments capability. */
      public Builder setCardPayments(AccountUpdateParams.Capabilities.CardPayments cardPayments) {
        this.cardPayments = cardPayments;
        return this;
      }

      /** The cartes_bancaires_payments capability. */
      public Builder setCartesBancairesPayments(
          AccountUpdateParams.Capabilities.CartesBancairesPayments cartesBancairesPayments) {
        this.cartesBancairesPayments = cartesBancairesPayments;
        return this;
      }

      /** The cashapp_payments capability. */
      public Builder setCashappPayments(
          AccountUpdateParams.Capabilities.CashappPayments cashappPayments) {
        this.cashappPayments = cashappPayments;
        return this;
      }

      /** The eps_payments capability. */
      public Builder setEpsPayments(AccountUpdateParams.Capabilities.EpsPayments epsPayments) {
        this.epsPayments = epsPayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Capabilities#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Capabilities#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The fpx_payments capability. */
      public Builder setFpxPayments(AccountUpdateParams.Capabilities.FpxPayments fpxPayments) {
        this.fpxPayments = fpxPayments;
        return this;
      }

      /** The gb_bank_transfer_payments capability. */
      public Builder setGbBankTransferPayments(
          AccountUpdateParams.Capabilities.GbBankTransferPayments gbBankTransferPayments) {
        this.gbBankTransferPayments = gbBankTransferPayments;
        return this;
      }

      /** The giropay_payments capability. */
      public Builder setGiropayPayments(
          AccountUpdateParams.Capabilities.GiropayPayments giropayPayments) {
        this.giropayPayments = giropayPayments;
        return this;
      }

      /** The grabpay_payments capability. */
      public Builder setGrabpayPayments(
          AccountUpdateParams.Capabilities.GrabpayPayments grabpayPayments) {
        this.grabpayPayments = grabpayPayments;
        return this;
      }

      /** The ideal_payments capability. */
      public Builder setIdealPayments(
          AccountUpdateParams.Capabilities.IdealPayments idealPayments) {
        this.idealPayments = idealPayments;
        return this;
      }

      /** The india_international_payments capability. */
      public Builder setIndiaInternationalPayments(
          AccountUpdateParams.Capabilities.IndiaInternationalPayments indiaInternationalPayments) {
        this.indiaInternationalPayments = indiaInternationalPayments;
        return this;
      }

      /** The jcb_payments capability. */
      public Builder setJcbPayments(AccountUpdateParams.Capabilities.JcbPayments jcbPayments) {
        this.jcbPayments = jcbPayments;
        return this;
      }

      /** The jp_bank_transfer_payments capability. */
      public Builder setJpBankTransferPayments(
          AccountUpdateParams.Capabilities.JpBankTransferPayments jpBankTransferPayments) {
        this.jpBankTransferPayments = jpBankTransferPayments;
        return this;
      }

      /** The klarna_payments capability. */
      public Builder setKlarnaPayments(
          AccountUpdateParams.Capabilities.KlarnaPayments klarnaPayments) {
        this.klarnaPayments = klarnaPayments;
        return this;
      }

      /** The konbini_payments capability. */
      public Builder setKonbiniPayments(
          AccountUpdateParams.Capabilities.KonbiniPayments konbiniPayments) {
        this.konbiniPayments = konbiniPayments;
        return this;
      }

      /** The legacy_payments capability. */
      public Builder setLegacyPayments(
          AccountUpdateParams.Capabilities.LegacyPayments legacyPayments) {
        this.legacyPayments = legacyPayments;
        return this;
      }

      /** The link_payments capability. */
      public Builder setLinkPayments(AccountUpdateParams.Capabilities.LinkPayments linkPayments) {
        this.linkPayments = linkPayments;
        return this;
      }

      /** The mb_way_payments capability. */
      public Builder setMbWayPayments(
          AccountUpdateParams.Capabilities.MbWayPayments mbWayPayments) {
        this.mbWayPayments = mbWayPayments;
        return this;
      }

      /** The mobilepay_payments capability. */
      public Builder setMobilepayPayments(
          AccountUpdateParams.Capabilities.MobilepayPayments mobilepayPayments) {
        this.mobilepayPayments = mobilepayPayments;
        return this;
      }

      /** The multibanco_payments capability. */
      public Builder setMultibancoPayments(
          AccountUpdateParams.Capabilities.MultibancoPayments multibancoPayments) {
        this.multibancoPayments = multibancoPayments;
        return this;
      }

      /** The mx_bank_transfer_payments capability. */
      public Builder setMxBankTransferPayments(
          AccountUpdateParams.Capabilities.MxBankTransferPayments mxBankTransferPayments) {
        this.mxBankTransferPayments = mxBankTransferPayments;
        return this;
      }

      /** The oxxo_payments capability. */
      public Builder setOxxoPayments(AccountUpdateParams.Capabilities.OxxoPayments oxxoPayments) {
        this.oxxoPayments = oxxoPayments;
        return this;
      }

      /** The p24_payments capability. */
      public Builder setP24Payments(AccountUpdateParams.Capabilities.P24Payments p24Payments) {
        this.p24Payments = p24Payments;
        return this;
      }

      /** The paynow_payments capability. */
      public Builder setPaynowPayments(
          AccountUpdateParams.Capabilities.PaynowPayments paynowPayments) {
        this.paynowPayments = paynowPayments;
        return this;
      }

      /** The paypal_payments capability. */
      public Builder setPaypalPayments(
          AccountUpdateParams.Capabilities.PaypalPayments paypalPayments) {
        this.paypalPayments = paypalPayments;
        return this;
      }

      /** The payto_payments capability. */
      public Builder setPaytoPayments(
          AccountUpdateParams.Capabilities.PaytoPayments paytoPayments) {
        this.paytoPayments = paytoPayments;
        return this;
      }

      /** The promptpay_payments capability. */
      public Builder setPromptpayPayments(
          AccountUpdateParams.Capabilities.PromptpayPayments promptpayPayments) {
        this.promptpayPayments = promptpayPayments;
        return this;
      }

      /** The rechnung_payments capability. */
      public Builder setRechnungPayments(
          AccountUpdateParams.Capabilities.RechnungPayments rechnungPayments) {
        this.rechnungPayments = rechnungPayments;
        return this;
      }

      /** The revolut_pay_payments capability. */
      public Builder setRevolutPayPayments(
          AccountUpdateParams.Capabilities.RevolutPayPayments revolutPayPayments) {
        this.revolutPayPayments = revolutPayPayments;
        return this;
      }

      /** The sepa_bank_transfer_payments capability. */
      public Builder setSepaBankTransferPayments(
          AccountUpdateParams.Capabilities.SepaBankTransferPayments sepaBankTransferPayments) {
        this.sepaBankTransferPayments = sepaBankTransferPayments;
        return this;
      }

      /** The sepa_debit_payments capability. */
      public Builder setSepaDebitPayments(
          AccountUpdateParams.Capabilities.SepaDebitPayments sepaDebitPayments) {
        this.sepaDebitPayments = sepaDebitPayments;
        return this;
      }

      /** The sofort_payments capability. */
      public Builder setSofortPayments(
          AccountUpdateParams.Capabilities.SofortPayments sofortPayments) {
        this.sofortPayments = sofortPayments;
        return this;
      }

      /** The swish_payments capability. */
      public Builder setSwishPayments(
          AccountUpdateParams.Capabilities.SwishPayments swishPayments) {
        this.swishPayments = swishPayments;
        return this;
      }

      /** The tax_reporting_us_1099_k capability. */
      public Builder setTaxReportingUs1099K(
          AccountUpdateParams.Capabilities.TaxReportingUs1099K taxReportingUs1099K) {
        this.taxReportingUs1099K = taxReportingUs1099K;
        return this;
      }

      /** The tax_reporting_us_1099_misc capability. */
      public Builder setTaxReportingUs1099Misc(
          AccountUpdateParams.Capabilities.TaxReportingUs1099Misc taxReportingUs1099Misc) {
        this.taxReportingUs1099Misc = taxReportingUs1099Misc;
        return this;
      }

      /** The transfers capability. */
      public Builder setTransfers(AccountUpdateParams.Capabilities.Transfers transfers) {
        this.transfers = transfers;
        return this;
      }

      /** The treasury capability. */
      public Builder setTreasury(AccountUpdateParams.Capabilities.Treasury treasury) {
        this.treasury = treasury;
        return this;
      }

      /** The twint_payments capability. */
      public Builder setTwintPayments(
          AccountUpdateParams.Capabilities.TwintPayments twintPayments) {
        this.twintPayments = twintPayments;
        return this;
      }

      /** The us_bank_account_ach_payments capability. */
      public Builder setUsBankAccountAchPayments(
          AccountUpdateParams.Capabilities.UsBankAccountAchPayments usBankAccountAchPayments) {
        this.usBankAccountAchPayments = usBankAccountAchPayments;
        return this;
      }

      /** The us_bank_transfer_payments capability. */
      public Builder setUsBankTransferPayments(
          AccountUpdateParams.Capabilities.UsBankTransferPayments usBankTransferPayments) {
        this.usBankTransferPayments = usBankTransferPayments;
        return this;
      }

      /** The zip_payments capability. */
      public Builder setZipPayments(AccountUpdateParams.Capabilities.ZipPayments zipPayments) {
        this.zipPayments = zipPayments;
        return this;
      }
    }

    @Getter
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
        public AccountUpdateParams.Capabilities.AcssDebitPayments build() {
          return new AccountUpdateParams.Capabilities.AcssDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.AcssDebitPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.AcssDebitPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.AffirmPayments build() {
          return new AccountUpdateParams.Capabilities.AffirmPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.AffirmPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.AffirmPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.AfterpayClearpayPayments build() {
          return new AccountUpdateParams.Capabilities.AfterpayClearpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.AfterpayClearpayPayments#extraParams}
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
         * map. See {@link AccountUpdateParams.Capabilities.AfterpayClearpayPayments#extraParams}
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
        public AccountUpdateParams.Capabilities.AmazonPayPayments build() {
          return new AccountUpdateParams.Capabilities.AmazonPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.AmazonPayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.AmazonPayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.AuBecsDebitPayments build() {
          return new AccountUpdateParams.Capabilities.AuBecsDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.AuBecsDebitPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.AuBecsDebitPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.BacsDebitPayments build() {
          return new AccountUpdateParams.Capabilities.BacsDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.BacsDebitPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.BacsDebitPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.BancontactPayments build() {
          return new AccountUpdateParams.Capabilities.BancontactPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.BancontactPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.BancontactPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.BankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.BankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.BankTransferPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.BankTransferPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.BlikPayments build() {
          return new AccountUpdateParams.Capabilities.BlikPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.BlikPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.BlikPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.BoletoPayments build() {
          return new AccountUpdateParams.Capabilities.BoletoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.BoletoPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.BoletoPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.CardIssuing build() {
          return new AccountUpdateParams.Capabilities.CardIssuing(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.CardIssuing#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.CardIssuing#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.CardPayments build() {
          return new AccountUpdateParams.Capabilities.CardPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.CardPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.CardPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.CartesBancairesPayments build() {
          return new AccountUpdateParams.Capabilities.CartesBancairesPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.CartesBancairesPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.CartesBancairesPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.CashappPayments build() {
          return new AccountUpdateParams.Capabilities.CashappPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.CashappPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.CashappPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.EpsPayments build() {
          return new AccountUpdateParams.Capabilities.EpsPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.EpsPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.EpsPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.FpxPayments build() {
          return new AccountUpdateParams.Capabilities.FpxPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.FpxPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.FpxPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.GbBankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.GbBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.GbBankTransferPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.GbBankTransferPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.GiropayPayments build() {
          return new AccountUpdateParams.Capabilities.GiropayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.GiropayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.GiropayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.GrabpayPayments build() {
          return new AccountUpdateParams.Capabilities.GrabpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.GrabpayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.GrabpayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.IdealPayments build() {
          return new AccountUpdateParams.Capabilities.IdealPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.IdealPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.IdealPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.IndiaInternationalPayments build() {
          return new AccountUpdateParams.Capabilities.IndiaInternationalPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.IndiaInternationalPayments#extraParams}
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
         * map. See {@link AccountUpdateParams.Capabilities.IndiaInternationalPayments#extraParams}
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
        public AccountUpdateParams.Capabilities.JcbPayments build() {
          return new AccountUpdateParams.Capabilities.JcbPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.JcbPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.JcbPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.JpBankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.JpBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.JpBankTransferPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.JpBankTransferPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.KlarnaPayments build() {
          return new AccountUpdateParams.Capabilities.KlarnaPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.KlarnaPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.KlarnaPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.KonbiniPayments build() {
          return new AccountUpdateParams.Capabilities.KonbiniPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.KonbiniPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.KonbiniPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.LegacyPayments build() {
          return new AccountUpdateParams.Capabilities.LegacyPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.LegacyPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.LegacyPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.LinkPayments build() {
          return new AccountUpdateParams.Capabilities.LinkPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.LinkPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.LinkPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.MbWayPayments build() {
          return new AccountUpdateParams.Capabilities.MbWayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.MbWayPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.MbWayPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.MobilepayPayments build() {
          return new AccountUpdateParams.Capabilities.MobilepayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.MobilepayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.MobilepayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.MultibancoPayments build() {
          return new AccountUpdateParams.Capabilities.MultibancoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.MultibancoPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.MultibancoPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.MxBankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.MxBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.MxBankTransferPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.MxBankTransferPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.OxxoPayments build() {
          return new AccountUpdateParams.Capabilities.OxxoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.OxxoPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.OxxoPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.P24Payments build() {
          return new AccountUpdateParams.Capabilities.P24Payments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.P24Payments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.P24Payments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.PaynowPayments build() {
          return new AccountUpdateParams.Capabilities.PaynowPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.PaynowPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.PaynowPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.PaypalPayments build() {
          return new AccountUpdateParams.Capabilities.PaypalPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.PaypalPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.PaypalPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.PaytoPayments build() {
          return new AccountUpdateParams.Capabilities.PaytoPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.PaytoPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.PaytoPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.PromptpayPayments build() {
          return new AccountUpdateParams.Capabilities.PromptpayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.PromptpayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.PromptpayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.RechnungPayments build() {
          return new AccountUpdateParams.Capabilities.RechnungPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.RechnungPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.RechnungPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.RevolutPayPayments build() {
          return new AccountUpdateParams.Capabilities.RevolutPayPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.RevolutPayPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.RevolutPayPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.SepaBankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.SepaBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.SepaBankTransferPayments#extraParams}
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
         * map. See {@link AccountUpdateParams.Capabilities.SepaBankTransferPayments#extraParams}
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
        public AccountUpdateParams.Capabilities.SepaDebitPayments build() {
          return new AccountUpdateParams.Capabilities.SepaDebitPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.SepaDebitPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.SepaDebitPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.SofortPayments build() {
          return new AccountUpdateParams.Capabilities.SofortPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.SofortPayments#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.SofortPayments#extraParams} for the
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
        public AccountUpdateParams.Capabilities.SwishPayments build() {
          return new AccountUpdateParams.Capabilities.SwishPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.SwishPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.SwishPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.TaxReportingUs1099K build() {
          return new AccountUpdateParams.Capabilities.TaxReportingUs1099K(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.TaxReportingUs1099K#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Capabilities.TaxReportingUs1099K#extraParams} for the
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
        public AccountUpdateParams.Capabilities.TaxReportingUs1099Misc build() {
          return new AccountUpdateParams.Capabilities.TaxReportingUs1099Misc(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.TaxReportingUs1099Misc#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.TaxReportingUs1099Misc#extraParams} for
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
        public AccountUpdateParams.Capabilities.Transfers build() {
          return new AccountUpdateParams.Capabilities.Transfers(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.Transfers#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.Transfers#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.Treasury build() {
          return new AccountUpdateParams.Capabilities.Treasury(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.Treasury#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.Treasury#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.TwintPayments build() {
          return new AccountUpdateParams.Capabilities.TwintPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.TwintPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.TwintPayments#extraParams} for the field
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
        public AccountUpdateParams.Capabilities.UsBankAccountAchPayments build() {
          return new AccountUpdateParams.Capabilities.UsBankAccountAchPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.UsBankAccountAchPayments#extraParams}
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
         * map. See {@link AccountUpdateParams.Capabilities.UsBankAccountAchPayments#extraParams}
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
        public AccountUpdateParams.Capabilities.UsBankTransferPayments build() {
          return new AccountUpdateParams.Capabilities.UsBankTransferPayments(
              this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.UsBankTransferPayments#extraParams} for
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
         * map. See {@link AccountUpdateParams.Capabilities.UsBankTransferPayments#extraParams} for
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
        public AccountUpdateParams.Capabilities.ZipPayments build() {
          return new AccountUpdateParams.Capabilities.ZipPayments(this.extraParams, this.requested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Capabilities.ZipPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Capabilities.ZipPayments#extraParams} for the field
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
    Object exportLicenseId;

    /** The purpose code to use for export transactions (India only). */
    @SerializedName("export_purpose_code")
    Object exportPurposeCode;

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
    Object name;

    /** The Kana variation of the company's legal name (Japan only). */
    @SerializedName("name_kana")
    Object nameKana;

    /** The Kanji variation of the company's legal name (Japan only). */
    @SerializedName("name_kanji")
    Object nameKanji;

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

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    Object phone;

    /**
     * The identification number given to a company when it is registered or incorporated, if
     * distinct from the identification number used for filing taxes. (Examples are the CIN for
     * companies and LLP IN for partnerships in India, and the Company Registration Number in Hong
     * Kong).
     */
    @SerializedName("registration_number")
    Object registrationNumber;

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
    Object taxId;

    /**
     * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies only).
     */
    @SerializedName("tax_id_registrar")
    Object taxIdRegistrar;

    /** The VAT number of the company. */
    @SerializedName("vat_id")
    Object vatId;

    /** Information on the verification state of the company. */
    @SerializedName("verification")
    Verification verification;

    private Company(
        Address address,
        AddressKana addressKana,
        AddressKanji addressKanji,
        Boolean directorsProvided,
        Boolean executivesProvided,
        Object exportLicenseId,
        Object exportPurposeCode,
        Map<String, Object> extraParams,
        Object name,
        Object nameKana,
        Object nameKanji,
        Boolean ownersProvided,
        OwnershipDeclaration ownershipDeclaration,
        Object phone,
        Object registrationNumber,
        ApiRequestParams.EnumParam structure,
        Object taxId,
        Object taxIdRegistrar,
        Object vatId,
        Verification verification) {
      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.directorsProvided = directorsProvided;
      this.executivesProvided = executivesProvided;
      this.exportLicenseId = exportLicenseId;
      this.exportPurposeCode = exportPurposeCode;
      this.extraParams = extraParams;
      this.name = name;
      this.nameKana = nameKana;
      this.nameKanji = nameKanji;
      this.ownersProvided = ownersProvided;
      this.ownershipDeclaration = ownershipDeclaration;
      this.phone = phone;
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

      private Boolean executivesProvided;

      private Object exportLicenseId;

      private Object exportPurposeCode;

      private Map<String, Object> extraParams;

      private Object name;

      private Object nameKana;

      private Object nameKanji;

      private Boolean ownersProvided;

      private OwnershipDeclaration ownershipDeclaration;

      private Object phone;

      private Object registrationNumber;

      private ApiRequestParams.EnumParam structure;

      private Object taxId;

      private Object taxIdRegistrar;

      private Object vatId;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Company build() {
        return new AccountUpdateParams.Company(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.directorsProvided,
            this.executivesProvided,
            this.exportLicenseId,
            this.exportPurposeCode,
            this.extraParams,
            this.name,
            this.nameKana,
            this.nameKanji,
            this.ownersProvided,
            this.ownershipDeclaration,
            this.phone,
            this.registrationNumber,
            this.structure,
            this.taxId,
            this.taxIdRegistrar,
            this.vatId,
            this.verification);
      }

      /** The company's primary address. */
      public Builder setAddress(AccountUpdateParams.Company.Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the company's primary address (Japan only). */
      public Builder setAddressKana(AccountUpdateParams.Company.AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the company's primary address (Japan only). */
      public Builder setAddressKanji(AccountUpdateParams.Company.AddressKanji addressKanji) {
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

      /**
       * The export license ID number of the company, also referred as Import Export Code (India
       * only).
       */
      public Builder setExportLicenseId(EmptyParam exportLicenseId) {
        this.exportLicenseId = exportLicenseId;
        return this;
      }

      /** The purpose code to use for export transactions (India only). */
      public Builder setExportPurposeCode(String exportPurposeCode) {
        this.exportPurposeCode = exportPurposeCode;
        return this;
      }

      /** The purpose code to use for export transactions (India only). */
      public Builder setExportPurposeCode(EmptyParam exportPurposeCode) {
        this.exportPurposeCode = exportPurposeCode;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Company#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Company#extraParams} for the field documentation.
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

      /** The company's legal name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** The Kana variation of the company's legal name (Japan only). */
      public Builder setNameKana(String nameKana) {
        this.nameKana = nameKana;
        return this;
      }

      /** The Kana variation of the company's legal name (Japan only). */
      public Builder setNameKana(EmptyParam nameKana) {
        this.nameKana = nameKana;
        return this;
      }

      /** The Kanji variation of the company's legal name (Japan only). */
      public Builder setNameKanji(String nameKanji) {
        this.nameKanji = nameKanji;
        return this;
      }

      /** The Kanji variation of the company's legal name (Japan only). */
      public Builder setNameKanji(EmptyParam nameKanji) {
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
          AccountUpdateParams.Company.OwnershipDeclaration ownershipDeclaration) {
        this.ownershipDeclaration = ownershipDeclaration;
        return this;
      }

      /** The company's phone number (used for verification). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** The company's phone number (used for verification). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
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
       * The identification number given to a company when it is registered or incorporated, if
       * distinct from the identification number used for filing taxes. (Examples are the CIN for
       * companies and LLP IN for partnerships in India, and the Company Registration Number in Hong
       * Kong).
       */
      public Builder setRegistrationNumber(EmptyParam registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
      }

      /**
       * The category identifying the legal structure of the company or legal entity. See <a
       * href="https://stripe.com/connect/identity-verification#business-structure">Business
       * structure</a> for more details. Pass an empty string to unset this value.
       */
      public Builder setStructure(AccountUpdateParams.Company.Structure structure) {
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
       * The business ID number of the company, as appropriate for the company’s country. (Examples
       * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
       * the UK.)
       */
      public Builder setTaxId(EmptyParam taxId) {
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

      /**
       * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies only).
       */
      public Builder setTaxIdRegistrar(EmptyParam taxIdRegistrar) {
        this.taxIdRegistrar = taxIdRegistrar;
        return this;
      }

      /** The VAT number of the company. */
      public Builder setVatId(String vatId) {
        this.vatId = vatId;
        return this;
      }

      /** The VAT number of the company. */
      public Builder setVatId(EmptyParam vatId) {
        this.vatId = vatId;
        return this;
      }

      /** Information on the verification state of the company. */
      public Builder setVerification(AccountUpdateParams.Company.Verification verification) {
        this.verification = verification;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Company.Address build() {
          return new AccountUpdateParams.Company.Address(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.Address#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Company.Address#extraParams} for the field
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    public static class AddressKana {
      /** City or ward. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Building details. */
      @SerializedName("line2")
      Object line2;

      /** Postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** Prefecture. */
      @SerializedName("state")
      Object state;

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private AddressKana(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state,
          Object town) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        private Object town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Company.AddressKana build() {
          return new AccountUpdateParams.Company.AddressKana(
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

        /** City or ward. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.AddressKana#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Company.AddressKana#extraParams} for the field
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

        /** Block or building number. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Building details. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Prefecture. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(EmptyParam town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    public static class AddressKanji {
      /** City or ward. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Building details. */
      @SerializedName("line2")
      Object line2;

      /** Postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** Prefecture. */
      @SerializedName("state")
      Object state;

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private AddressKanji(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state,
          Object town) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        private Object town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Company.AddressKanji build() {
          return new AccountUpdateParams.Company.AddressKanji(
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

        /** City or ward. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.AddressKanji#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Company.AddressKanji#extraParams} for the field
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

        /** Block or building number. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Building details. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Prefecture. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(EmptyParam town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
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
      Object ip;

      /** The user agent of the browser from which the beneficial owner attestation was made. */
      @SerializedName("user_agent")
      Object userAgent;

      private OwnershipDeclaration(
          Long date, Map<String, Object> extraParams, Object ip, Object userAgent) {
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

        private Object ip;

        private Object userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Company.OwnershipDeclaration build() {
          return new AccountUpdateParams.Company.OwnershipDeclaration(
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
         * map. See {@link AccountUpdateParams.Company.OwnershipDeclaration#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Company.OwnershipDeclaration#extraParams} for the
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

        /** The IP address from which the beneficial owner attestation was made. */
        public Builder setIp(EmptyParam ip) {
          this.ip = ip;
          return this;
        }

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        public Builder setUserAgent(EmptyParam userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }

    @Getter
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
        public AccountUpdateParams.Company.Verification build() {
          return new AccountUpdateParams.Company.Verification(this.document, this.extraParams);
        }

        /** A document verifying the business. */
        public Builder setDocument(AccountUpdateParams.Company.Verification.Document document) {
          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.Verification#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Company.Verification#extraParams} for the field
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
      public static class Document {
        /**
         * The back of a document returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code additional_verification}. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
         * size.
         */
        @SerializedName("back")
        Object back;

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
        Object front;

        private Document(Object back, Map<String, Object> extraParams, Object front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object back;

          private Map<String, Object> extraParams;

          private Object front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Company.Verification.Document build() {
            return new AccountUpdateParams.Company.Verification.Document(
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
           * The back of a document returned by a <a
           * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
           * value of {@code additional_verification}. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setBack(EmptyParam back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Company.Verification.Document#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Company.Verification.Document#extraParams} for the
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

          /**
           * The front of a document returned by a <a
           * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
           * value of {@code additional_verification}. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(EmptyParam front) {
            this.front = front;
            return this;
          }
        }
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

    /**
     * One or more documents showing the company’s proof of registration with the national business
     * registry.
     */
    @SerializedName("proof_of_registration")
    ProofOfRegistration proofOfRegistration;

    private Documents(
        BankAccountOwnershipVerification bankAccountOwnershipVerification,
        CompanyLicense companyLicense,
        CompanyMemorandumOfAssociation companyMemorandumOfAssociation,
        CompanyMinisterialDecree companyMinisterialDecree,
        CompanyRegistrationVerification companyRegistrationVerification,
        CompanyTaxIdVerification companyTaxIdVerification,
        Map<String, Object> extraParams,
        ProofOfRegistration proofOfRegistration) {
      this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
      this.companyLicense = companyLicense;
      this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
      this.companyMinisterialDecree = companyMinisterialDecree;
      this.companyRegistrationVerification = companyRegistrationVerification;
      this.companyTaxIdVerification = companyTaxIdVerification;
      this.extraParams = extraParams;
      this.proofOfRegistration = proofOfRegistration;
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

      private ProofOfRegistration proofOfRegistration;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Documents build() {
        return new AccountUpdateParams.Documents(
            this.bankAccountOwnershipVerification,
            this.companyLicense,
            this.companyMemorandumOfAssociation,
            this.companyMinisterialDecree,
            this.companyRegistrationVerification,
            this.companyTaxIdVerification,
            this.extraParams,
            this.proofOfRegistration);
      }

      /**
       * One or more documents that support the <a
       * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank
       * account ownership verification</a> requirement. Must be a document associated with the
       * account’s primary active bank account that displays the last 4 digits of the account
       * number, either a statement or a check.
       */
      public Builder setBankAccountOwnershipVerification(
          AccountUpdateParams.Documents.BankAccountOwnershipVerification
              bankAccountOwnershipVerification) {
        this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
        return this;
      }

      /** One or more documents that demonstrate proof of a company's license to operate. */
      public Builder setCompanyLicense(
          AccountUpdateParams.Documents.CompanyLicense companyLicense) {
        this.companyLicense = companyLicense;
        return this;
      }

      /** One or more documents showing the company's Memorandum of Association. */
      public Builder setCompanyMemorandumOfAssociation(
          AccountUpdateParams.Documents.CompanyMemorandumOfAssociation
              companyMemorandumOfAssociation) {
        this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
        return this;
      }

      /**
       * (Certain countries only) One or more documents showing the ministerial decree legalizing
       * the company's establishment.
       */
      public Builder setCompanyMinisterialDecree(
          AccountUpdateParams.Documents.CompanyMinisterialDecree companyMinisterialDecree) {
        this.companyMinisterialDecree = companyMinisterialDecree;
        return this;
      }

      /**
       * One or more documents that demonstrate proof of a company's registration with the
       * appropriate local authorities.
       */
      public Builder setCompanyRegistrationVerification(
          AccountUpdateParams.Documents.CompanyRegistrationVerification
              companyRegistrationVerification) {
        this.companyRegistrationVerification = companyRegistrationVerification;
        return this;
      }

      /** One or more documents that demonstrate proof of a company's tax ID. */
      public Builder setCompanyTaxIdVerification(
          AccountUpdateParams.Documents.CompanyTaxIdVerification companyTaxIdVerification) {
        this.companyTaxIdVerification = companyTaxIdVerification;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Documents#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * One or more documents showing the company’s proof of registration with the national
       * business registry.
       */
      public Builder setProofOfRegistration(
          AccountUpdateParams.Documents.ProofOfRegistration proofOfRegistration) {
        this.proofOfRegistration = proofOfRegistration;
        return this;
      }
    }

    @Getter
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
        public AccountUpdateParams.Documents.BankAccountOwnershipVerification build() {
          return new AccountUpdateParams.Documents.BankAccountOwnershipVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountUpdateParams.Documents.BankAccountOwnershipVerification#extraParams} for the field
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
         * AccountUpdateParams.Documents.BankAccountOwnershipVerification#extraParams} for the field
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
         * AccountUpdateParams.Documents.BankAccountOwnershipVerification#files} for the field
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
         * AccountUpdateParams.Documents.BankAccountOwnershipVerification#files} for the field
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
        public AccountUpdateParams.Documents.CompanyLicense build() {
          return new AccountUpdateParams.Documents.CompanyLicense(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Documents.CompanyLicense#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Documents.CompanyLicense#extraParams} for the field
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
         * AccountUpdateParams.Documents.CompanyLicense#files} for the field documentation.
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
         * AccountUpdateParams.Documents.CompanyLicense#files} for the field documentation.
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
        public AccountUpdateParams.Documents.CompanyMemorandumOfAssociation build() {
          return new AccountUpdateParams.Documents.CompanyMemorandumOfAssociation(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Documents.CompanyMemorandumOfAssociation#extraParams}
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
         * map. See {@link AccountUpdateParams.Documents.CompanyMemorandumOfAssociation#extraParams}
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
         * AccountUpdateParams.Documents.CompanyMemorandumOfAssociation#files} for the field
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
         * AccountUpdateParams.Documents.CompanyMemorandumOfAssociation#files} for the field
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
        public AccountUpdateParams.Documents.CompanyMinisterialDecree build() {
          return new AccountUpdateParams.Documents.CompanyMinisterialDecree(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Documents.CompanyMinisterialDecree#extraParams} for
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
         * map. See {@link AccountUpdateParams.Documents.CompanyMinisterialDecree#extraParams} for
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
         * AccountUpdateParams.Documents.CompanyMinisterialDecree#files} for the field
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
         * AccountUpdateParams.Documents.CompanyMinisterialDecree#files} for the field
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
        public AccountUpdateParams.Documents.CompanyRegistrationVerification build() {
          return new AccountUpdateParams.Documents.CompanyRegistrationVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountUpdateParams.Documents.CompanyRegistrationVerification#extraParams} for the field
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
         * AccountUpdateParams.Documents.CompanyRegistrationVerification#extraParams} for the field
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
         * AccountUpdateParams.Documents.CompanyRegistrationVerification#files} for the field
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
         * AccountUpdateParams.Documents.CompanyRegistrationVerification#files} for the field
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
        public AccountUpdateParams.Documents.CompanyTaxIdVerification build() {
          return new AccountUpdateParams.Documents.CompanyTaxIdVerification(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Documents.CompanyTaxIdVerification#extraParams} for
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
         * map. See {@link AccountUpdateParams.Documents.CompanyTaxIdVerification#extraParams} for
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
         * AccountUpdateParams.Documents.CompanyTaxIdVerification#files} for the field
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
         * AccountUpdateParams.Documents.CompanyTaxIdVerification#files} for the field
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
        public AccountUpdateParams.Documents.ProofOfRegistration build() {
          return new AccountUpdateParams.Documents.ProofOfRegistration(
              this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Documents.ProofOfRegistration#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Documents.ProofOfRegistration#extraParams} for the
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
         * AccountUpdateParams.Documents.ProofOfRegistration#files} for the field documentation.
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
         * AccountUpdateParams.Documents.ProofOfRegistration#files} for the field documentation.
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
    Object email;

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
    Object firstName;

    /** The Kana variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kana")
    Object firstNameKana;

    /** The Kanji variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kanji")
    Object firstNameKanji;

    /** A list of alternate names or aliases that the individual is known by. */
    @SerializedName("full_name_aliases")
    Object fullNameAliases;

    /**
     * The individual's gender (International regulations require either &quot;male&quot; or
     * &quot;female&quot;).
     */
    @SerializedName("gender")
    Object gender;

    /**
     * The government-issued ID number of the individual, as appropriate for the representative's
     * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number in
     * Canada). Instead of the number itself, you can also provide a <a
     * href="https://stripe.com/js/tokens/create_token?type=pii">PII token created with
     * Stripe.js</a>.
     */
    @SerializedName("id_number")
    Object idNumber;

    /**
     * The government-issued secondary ID number of the individual, as appropriate for the
     * representative's country, will be used for enhanced verification checks. In Thailand, this
     * would be the laser code found on the back of an ID card. Instead of the number itself, you
     * can also provide a <a href="https://stripe.com/js/tokens/create_token?type=pii">PII token
     * created with Stripe.js</a>.
     */
    @SerializedName("id_number_secondary")
    Object idNumberSecondary;

    /** The individual's last name. */
    @SerializedName("last_name")
    Object lastName;

    /** The Kana variation of the individual's last name (Japan only). */
    @SerializedName("last_name_kana")
    Object lastNameKana;

    /** The Kanji variation of the individual's last name (Japan only). */
    @SerializedName("last_name_kanji")
    Object lastNameKanji;

    /** The individual's maiden name. */
    @SerializedName("maiden_name")
    Object maidenName;

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
    Object phone;

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
    Object ssnLast4;

    /** The individual's verification document information. */
    @SerializedName("verification")
    Verification verification;

    private Individual(
        Address address,
        AddressKana addressKana,
        AddressKanji addressKanji,
        Object dob,
        Object email,
        Map<String, Object> extraParams,
        Object firstName,
        Object firstNameKana,
        Object firstNameKanji,
        Object fullNameAliases,
        Object gender,
        Object idNumber,
        Object idNumberSecondary,
        Object lastName,
        Object lastNameKana,
        Object lastNameKanji,
        Object maidenName,
        Object metadata,
        Object phone,
        PoliticalExposure politicalExposure,
        RegisteredAddress registeredAddress,
        Relationship relationship,
        Object ssnLast4,
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

      private Object email;

      private Map<String, Object> extraParams;

      private Object firstName;

      private Object firstNameKana;

      private Object firstNameKanji;

      private Object fullNameAliases;

      private Object gender;

      private Object idNumber;

      private Object idNumberSecondary;

      private Object lastName;

      private Object lastNameKana;

      private Object lastNameKanji;

      private Object maidenName;

      private Object metadata;

      private Object phone;

      private PoliticalExposure politicalExposure;

      private RegisteredAddress registeredAddress;

      private Relationship relationship;

      private Object ssnLast4;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Individual build() {
        return new AccountUpdateParams.Individual(
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
      public Builder setAddress(AccountUpdateParams.Individual.Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the individual's primary address (Japan only). */
      public Builder setAddressKana(AccountUpdateParams.Individual.AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the individual's primary address (Japan only). */
      public Builder setAddressKanji(AccountUpdateParams.Individual.AddressKanji addressKanji) {
        this.addressKanji = addressKanji;
        return this;
      }

      /** The individual's date of birth. */
      public Builder setDob(AccountUpdateParams.Individual.Dob dob) {
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

      /** The individual's email address. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Individual#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Individual#extraParams} for the field documentation.
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

      /** The individual's first name. */
      public Builder setFirstName(EmptyParam firstName) {
        this.firstName = firstName;
        return this;
      }

      /** The Kana variation of the individual's first name (Japan only). */
      public Builder setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kana variation of the individual's first name (Japan only). */
      public Builder setFirstNameKana(EmptyParam firstNameKana) {
        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kanji variation of the individual's first name (Japan only). */
      public Builder setFirstNameKanji(String firstNameKanji) {
        this.firstNameKanji = firstNameKanji;
        return this;
      }

      /** The Kanji variation of the individual's first name (Japan only). */
      public Builder setFirstNameKanji(EmptyParam firstNameKanji) {
        this.firstNameKanji = firstNameKanji;
        return this;
      }

      /**
       * Add an element to `fullNameAliases` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * AccountUpdateParams.Individual#fullNameAliases} for the field documentation.
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
       * {@link AccountUpdateParams.Individual#fullNameAliases} for the field documentation.
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

      /**
       * The individual's gender (International regulations require either &quot;male&quot; or
       * &quot;female&quot;).
       */
      public Builder setGender(String gender) {
        this.gender = gender;
        return this;
      }

      /**
       * The individual's gender (International regulations require either &quot;male&quot; or
       * &quot;female&quot;).
       */
      public Builder setGender(EmptyParam gender) {
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
       * The government-issued ID number of the individual, as appropriate for the representative's
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a <a
       * href="https://stripe.com/js/tokens/create_token?type=pii">PII token created with
       * Stripe.js</a>.
       */
      public Builder setIdNumber(EmptyParam idNumber) {
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

      /**
       * The government-issued secondary ID number of the individual, as appropriate for the
       * representative's country, will be used for enhanced verification checks. In Thailand, this
       * would be the laser code found on the back of an ID card. Instead of the number itself, you
       * can also provide a <a href="https://stripe.com/js/tokens/create_token?type=pii">PII token
       * created with Stripe.js</a>.
       */
      public Builder setIdNumberSecondary(EmptyParam idNumberSecondary) {
        this.idNumberSecondary = idNumberSecondary;
        return this;
      }

      /** The individual's last name. */
      public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
      }

      /** The individual's last name. */
      public Builder setLastName(EmptyParam lastName) {
        this.lastName = lastName;
        return this;
      }

      /** The Kana variation of the individual's last name (Japan only). */
      public Builder setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kana variation of the individual's last name (Japan only). */
      public Builder setLastNameKana(EmptyParam lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kanji variation of the individual's last name (Japan only). */
      public Builder setLastNameKanji(String lastNameKanji) {
        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The Kanji variation of the individual's last name (Japan only). */
      public Builder setLastNameKanji(EmptyParam lastNameKanji) {
        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The individual's maiden name. */
      public Builder setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
      }

      /** The individual's maiden name. */
      public Builder setMaidenName(EmptyParam maidenName) {
        this.maidenName = maidenName;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Individual#metadata} for the field documentation.
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
       * See {@link AccountUpdateParams.Individual#metadata} for the field documentation.
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

      /** The individual's phone number. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }

      /**
       * Indicates if the person or any of their representatives, family members, or other closely
       * related persons, declares that they hold or have held an important public job or function,
       * in any jurisdiction.
       */
      public Builder setPoliticalExposure(
          AccountUpdateParams.Individual.PoliticalExposure politicalExposure) {
        this.politicalExposure = politicalExposure;
        return this;
      }

      /** The individual's registered address. */
      public Builder setRegisteredAddress(
          AccountUpdateParams.Individual.RegisteredAddress registeredAddress) {
        this.registeredAddress = registeredAddress;
        return this;
      }

      /** Describes the person’s relationship to the account. */
      public Builder setRelationship(AccountUpdateParams.Individual.Relationship relationship) {
        this.relationship = relationship;
        return this;
      }

      /** The last four digits of the individual's Social Security Number (U.S. only). */
      public Builder setSsnLast4(String ssnLast4) {
        this.ssnLast4 = ssnLast4;
        return this;
      }

      /** The last four digits of the individual's Social Security Number (U.S. only). */
      public Builder setSsnLast4(EmptyParam ssnLast4) {
        this.ssnLast4 = ssnLast4;
        return this;
      }

      /** The individual's verification document information. */
      public Builder setVerification(AccountUpdateParams.Individual.Verification verification) {
        this.verification = verification;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Individual.Address build() {
          return new AccountUpdateParams.Individual.Address(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.Address#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.Address#extraParams} for the field
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    public static class AddressKana {
      /** City or ward. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Building details. */
      @SerializedName("line2")
      Object line2;

      /** Postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** Prefecture. */
      @SerializedName("state")
      Object state;

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private AddressKana(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state,
          Object town) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        private Object town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Individual.AddressKana build() {
          return new AccountUpdateParams.Individual.AddressKana(
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

        /** City or ward. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.AddressKana#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.AddressKana#extraParams} for the field
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

        /** Block or building number. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Building details. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Prefecture. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(EmptyParam town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    public static class AddressKanji {
      /** City or ward. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Building details. */
      @SerializedName("line2")
      Object line2;

      /** Postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** Prefecture. */
      @SerializedName("state")
      Object state;

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private AddressKanji(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state,
          Object town) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        private Object town;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Individual.AddressKanji build() {
          return new AccountUpdateParams.Individual.AddressKanji(
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

        /** City or ward. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.AddressKanji#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.AddressKanji#extraParams} for the field
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

        /** Block or building number. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Building details. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** Prefecture. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }

        /** Town or cho-me. */
        public Builder setTown(EmptyParam town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
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
        public AccountUpdateParams.Individual.Dob build() {
          return new AccountUpdateParams.Individual.Dob(
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
         * map. See {@link AccountUpdateParams.Individual.Dob#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.Dob#extraParams} for the field
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
    public static class RegisteredAddress {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private RegisteredAddress(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Individual.RegisteredAddress build() {
          return new AccountUpdateParams.Individual.RegisteredAddress(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.RegisteredAddress#extraParams} for the
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
         * map. See {@link AccountUpdateParams.Individual.RegisteredAddress#extraParams} for the
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
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
      Object title;

      private Relationship(
          Boolean director,
          Boolean executive,
          Map<String, Object> extraParams,
          Boolean owner,
          Object percentOwnership,
          Object title) {
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

        private Object title;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Individual.Relationship build() {
          return new AccountUpdateParams.Individual.Relationship(
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
         * map. See {@link AccountUpdateParams.Individual.Relationship#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.Relationship#extraParams} for the field
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

        /** The person's title (e.g., CEO, Support Engineer). */
        public Builder setTitle(EmptyParam title) {
          this.title = title;
          return this;
        }
      }
    }

    @Getter
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
        public AccountUpdateParams.Individual.Verification build() {
          return new AccountUpdateParams.Individual.Verification(
              this.additionalDocument, this.document, this.extraParams);
        }

        /**
         * A document showing address, either a passport, local ID card, or utility bill from a
         * well-known utility company.
         */
        public Builder setAdditionalDocument(
            AccountUpdateParams.Individual.Verification.AdditionalDocument additionalDocument) {
          this.additionalDocument = additionalDocument;
          return this;
        }

        /** An identifying document, either a passport or local ID card. */
        public Builder setDocument(AccountUpdateParams.Individual.Verification.Document document) {
          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.Verification#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Individual.Verification#extraParams} for the field
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
      public static class AdditionalDocument {
        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("back")
        Object back;

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
        Object front;

        private AdditionalDocument(Object back, Map<String, Object> extraParams, Object front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object back;

          private Map<String, Object> extraParams;

          private Object front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Individual.Verification.AdditionalDocument build() {
            return new AccountUpdateParams.Individual.Verification.AdditionalDocument(
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
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setBack(EmptyParam back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Individual.Verification.AdditionalDocument#extraParams} for the
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
           * AccountUpdateParams.Individual.Verification.AdditionalDocument#extraParams} for the
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

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setFront(EmptyParam front) {
            this.front = front;
            return this;
          }
        }
      }

      @Getter
      public static class Document {
        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        @SerializedName("back")
        Object back;

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
        Object front;

        private Document(Object back, Map<String, Object> extraParams, Object front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object back;

          private Map<String, Object> extraParams;

          private Object front;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Individual.Verification.Document build() {
            return new AccountUpdateParams.Individual.Verification.Document(
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
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setBack(EmptyParam back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Individual.Verification.Document#extraParams} for
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
           * map. See {@link AccountUpdateParams.Individual.Verification.Document#extraParams} for
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

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          public Builder setFront(EmptyParam front) {
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
      public AccountUpdateParams.RiskControls build() {
        return new AccountUpdateParams.RiskControls(this.charges, this.extraParams, this.payouts);
      }

      /**
       * Represents the risk control status of charges. Please see <a
       * href="https://stripe.com/docs/connect/pausing-payments-or-payouts-on-connected-accounts">this
       * page for more details</a>.
       */
      public Builder setCharges(AccountUpdateParams.RiskControls.Charges charges) {
        this.charges = charges;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.RiskControls#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.RiskControls#extraParams} for the field documentation.
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
      public Builder setPayouts(AccountUpdateParams.RiskControls.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }
    }

    @Getter
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
        public AccountUpdateParams.RiskControls.Charges build() {
          return new AccountUpdateParams.RiskControls.Charges(
              this.extraParams, this.pauseRequested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.RiskControls.Charges#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.RiskControls.Charges#extraParams} for the field
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
        public AccountUpdateParams.RiskControls.Payouts build() {
          return new AccountUpdateParams.RiskControls.Payouts(
              this.extraParams, this.pauseRequested);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.RiskControls.Payouts#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.RiskControls.Payouts#extraParams} for the field
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
  public static class Settings {
    /** Settings specific to Bacs Direct Debit payments. */
    @SerializedName("bacs_debit_payments")
    BacsDebitPayments bacsDebitPayments;

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

    /** Settings specific to the account's use of Invoices. */
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
      public AccountUpdateParams.Settings build() {
        return new AccountUpdateParams.Settings(
            this.bacsDebitPayments,
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

      /** Settings specific to Bacs Direct Debit payments. */
      public Builder setBacsDebitPayments(
          AccountUpdateParams.Settings.BacsDebitPayments bacsDebitPayments) {
        this.bacsDebitPayments = bacsDebitPayments;
        return this;
      }

      /**
       * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      public Builder setBranding(AccountUpdateParams.Settings.Branding branding) {
        this.branding = branding;
        return this;
      }

      /** Settings specific to the account's use of the Capital product. */
      public Builder setCapital(AccountUpdateParams.Settings.Capital capital) {
        this.capital = capital;
        return this;
      }

      /** Settings specific to the account's use of the Card Issuing product. */
      public Builder setCardIssuing(AccountUpdateParams.Settings.CardIssuing cardIssuing) {
        this.cardIssuing = cardIssuing;
        return this;
      }

      /** Settings specific to card charging on the account. */
      public Builder setCardPayments(AccountUpdateParams.Settings.CardPayments cardPayments) {
        this.cardPayments = cardPayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Settings#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Settings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings specific to the account's use of Invoices. */
      public Builder setInvoices(AccountUpdateParams.Settings.Invoices invoices) {
        this.invoices = invoices;
        return this;
      }

      /** Settings that apply across payment methods for charging on the account. */
      public Builder setPayments(AccountUpdateParams.Settings.Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Settings specific to the account's payouts. */
      public Builder setPayouts(AccountUpdateParams.Settings.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /** Settings specific to the account's tax forms. */
      public Builder setTaxForms(AccountUpdateParams.Settings.TaxForms taxForms) {
        this.taxForms = taxForms;
        return this;
      }

      /** Settings specific to the account's Treasury FinancialAccounts. */
      public Builder setTreasury(AccountUpdateParams.Settings.Treasury treasury) {
        this.treasury = treasury;
        return this;
      }
    }

    @Getter
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
      Object displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BacsDebitPayments(Object displayName, Map<String, Object> extraParams) {
        this.displayName = displayName;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object displayName;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.BacsDebitPayments build() {
          return new AccountUpdateParams.Settings.BacsDebitPayments(
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
         * The Bacs Direct Debit Display Name for this account. For payments made with Bacs Direct
         * Debit, this name appears on the mandate as the statement descriptor. Mobile banking apps
         * display it as the name of the business. To use custom branding, set the Bacs Direct Debit
         * Display Name during or right after creation. Custom branding incurs an additional monthly
         * fee for the platform. If you don't set the display name before requesting Bacs
         * capability, it's automatically set as &quot;Stripe&quot; and the account is onboarded to
         * Stripe branding, which is free.
         */
        public Builder setDisplayName(EmptyParam displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.BacsDebitPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.BacsDebitPayments#extraParams} for the field
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
      Object icon;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for
       * the account that will be used in Checkout instead of the icon and without the account's
       * name next to it if provided. Must be at least 128px x 128px.
       */
      @SerializedName("logo")
      Object logo;

      /** A CSS hex color value representing the primary branding color for this account. */
      @SerializedName("primary_color")
      Object primaryColor;

      /** A CSS hex color value representing the secondary branding color for this account. */
      @SerializedName("secondary_color")
      Object secondaryColor;

      private Branding(
          Map<String, Object> extraParams,
          Object icon,
          Object logo,
          Object primaryColor,
          Object secondaryColor) {
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

        private Object icon;

        private Object logo;

        private Object primaryColor;

        private Object secondaryColor;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.Branding build() {
          return new AccountUpdateParams.Settings.Branding(
              this.extraParams, this.icon, this.logo, this.primaryColor, this.secondaryColor);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Branding#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Branding#extraParams} for the field
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
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) An icon
         * for the account. Must be square and at least 128px x 128px.
         */
        public Builder setIcon(EmptyParam icon) {
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

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A logo for
         * the account that will be used in Checkout instead of the icon and without the account's
         * name next to it if provided. Must be at least 128px x 128px.
         */
        public Builder setLogo(EmptyParam logo) {
          this.logo = logo;
          return this;
        }

        /** A CSS hex color value representing the primary branding color for this account. */
        public Builder setPrimaryColor(String primaryColor) {
          this.primaryColor = primaryColor;
          return this;
        }

        /** A CSS hex color value representing the primary branding color for this account. */
        public Builder setPrimaryColor(EmptyParam primaryColor) {
          this.primaryColor = primaryColor;
          return this;
        }

        /** A CSS hex color value representing the secondary branding color for this account. */
        public Builder setSecondaryColor(String secondaryColor) {
          this.secondaryColor = secondaryColor;
          return this;
        }

        /** A CSS hex color value representing the secondary branding color for this account. */
        public Builder setSecondaryColor(EmptyParam secondaryColor) {
          this.secondaryColor = secondaryColor;
          return this;
        }
      }
    }

    @Getter
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
        public AccountUpdateParams.Settings.Capital build() {
          return new AccountUpdateParams.Settings.Capital(
              this.extraParams, this.payoutDestination, this.payoutDestinationSelector);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Capital#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Capital#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Capital#payoutDestination} for the field
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
         * original map. See {@link AccountUpdateParams.Settings.Capital#payoutDestination} for the
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
         * original map. See {@link AccountUpdateParams.Settings.Capital#payoutDestinationSelector}
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
         * original map. See {@link AccountUpdateParams.Settings.Capital#payoutDestinationSelector}
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
        public AccountUpdateParams.Settings.CardIssuing build() {
          return new AccountUpdateParams.Settings.CardIssuing(this.extraParams, this.tosAcceptance);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.CardIssuing#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.CardIssuing#extraParams} for the field
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
            AccountUpdateParams.Settings.CardIssuing.TosAcceptance tosAcceptance) {
          this.tosAcceptance = tosAcceptance;
          return this;
        }
      }

      @Getter
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
        Object ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        Object userAgent;

        private TosAcceptance(
            Long date, Map<String, Object> extraParams, Object ip, Object userAgent) {
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

          private Object ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Settings.CardIssuing.TosAcceptance build() {
            return new AccountUpdateParams.Settings.CardIssuing.TosAcceptance(
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
           * map. See {@link AccountUpdateParams.Settings.CardIssuing.TosAcceptance#extraParams} for
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
           * map. See {@link AccountUpdateParams.Settings.CardIssuing.TosAcceptance#extraParams} for
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
           * The IP address from which the account representative accepted the service agreement.
           */
          public Builder setIp(EmptyParam ip) {
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
      Object statementDescriptorPrefix;

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
          Object statementDescriptorPrefix,
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

        private Object statementDescriptorPrefix;

        private Object statementDescriptorPrefixKana;

        private Object statementDescriptorPrefixKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.CardPayments build() {
          return new AccountUpdateParams.Settings.CardPayments(
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
        public Builder setDeclineOn(AccountUpdateParams.Settings.CardPayments.DeclineOn declineOn) {
          this.declineOn = declineOn;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.CardPayments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.CardPayments#extraParams} for the field
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
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic {@code statement_descriptor} specified on the charge. {@code
         * statement_descriptor_prefix} is useful for maximizing descriptor space for the dynamic
         * portion.
         */
        public Builder setStatementDescriptorPrefix(EmptyParam statementDescriptorPrefix) {
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
          public AccountUpdateParams.Settings.CardPayments.DeclineOn build() {
            return new AccountUpdateParams.Settings.CardPayments.DeclineOn(
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
           * map. See {@link AccountUpdateParams.Settings.CardPayments.DeclineOn#extraParams} for
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
           * map. See {@link AccountUpdateParams.Settings.CardPayments.DeclineOn#extraParams} for
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
    public static class Invoices {
      /**
       * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs
       * get added when an invoice is finalized.
       */
      @SerializedName("default_account_tax_ids")
      Object defaultAccountTaxIds;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Invoices(Object defaultAccountTaxIds, Map<String, Object> extraParams) {
        this.defaultAccountTaxIds = defaultAccountTaxIds;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object defaultAccountTaxIds;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.Invoices build() {
          return new AccountUpdateParams.Settings.Invoices(
              this.defaultAccountTaxIds, this.extraParams);
        }

        /**
         * Add an element to `defaultAccountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Settings.Invoices#defaultAccountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDefaultAccountTaxId(String element) {
          if (this.defaultAccountTaxIds == null
              || this.defaultAccountTaxIds instanceof EmptyParam) {
            this.defaultAccountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.defaultAccountTaxIds).add(element);
          return this;
        }

        /**
         * Add all elements to `defaultAccountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Settings.Invoices#defaultAccountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDefaultAccountTaxId(List<String> elements) {
          if (this.defaultAccountTaxIds == null
              || this.defaultAccountTaxIds instanceof EmptyParam) {
            this.defaultAccountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.defaultAccountTaxIds).addAll(elements);
          return this;
        }

        /**
         * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs
         * get added when an invoice is finalized.
         */
        public Builder setDefaultAccountTaxIds(EmptyParam defaultAccountTaxIds) {
          this.defaultAccountTaxIds = defaultAccountTaxIds;
          return this;
        }

        /**
         * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs
         * get added when an invoice is finalized.
         */
        public Builder setDefaultAccountTaxIds(List<String> defaultAccountTaxIds) {
          this.defaultAccountTaxIds = defaultAccountTaxIds;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Invoices#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Invoices#extraParams} for the field
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
      Object statementDescriptor;

      /**
       * The Kana variation of {@code statement_descriptor} used for charges in Japan. Japanese
       * statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_kana")
      Object statementDescriptorKana;

      /**
       * The Kanji variation of {@code statement_descriptor} used for charges in Japan. Japanese
       * statement descriptors have <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
       * requirements</a>.
       */
      @SerializedName("statement_descriptor_kanji")
      Object statementDescriptorKanji;

      private Payments(
          Map<String, Object> extraParams,
          Object statementDescriptor,
          Object statementDescriptorKana,
          Object statementDescriptorKanji) {
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

        private Object statementDescriptor;

        private Object statementDescriptorKana;

        private Object statementDescriptorKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.Payments build() {
          return new AccountUpdateParams.Settings.Payments(
              this.extraParams,
              this.statementDescriptor,
              this.statementDescriptorKana,
              this.statementDescriptorKanji);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Payments#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Payments#extraParams} for the field
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
         * The default text that appears on statements for non-card charges outside of Japan. For
         * card charges, if you don't set a {@code statement_descriptor_prefix}, this text is also
         * used as the statement descriptor prefix. In that case, if concatenating the statement
         * descriptor suffix causes the combined statement descriptor to exceed 22 characters, we
         * truncate the {@code statement_descriptor} text to limit the full descriptor to 22
         * characters. For more information about statement descriptors and their requirements, see
         * the <a href="https://docs.stripe.com/get-started/account/statement-descriptors">account
         * settings documentation</a>.
         */
        public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
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
         * The Kana variation of {@code statement_descriptor} used for charges in Japan. Japanese
         * statement descriptors have <a
         * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
         * requirements</a>.
         */
        public Builder setStatementDescriptorKana(EmptyParam statementDescriptorKana) {
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

        /**
         * The Kanji variation of {@code statement_descriptor} used for charges in Japan. Japanese
         * statement descriptors have <a
         * href="https://docs.stripe.com/get-started/account/statement-descriptors#set-japanese-statement-descriptors">special
         * requirements</a>.
         */
        public Builder setStatementDescriptorKanji(EmptyParam statementDescriptorKanji) {
          this.statementDescriptorKanji = statementDescriptorKanji;
          return this;
        }
      }
    }

    @Getter
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
      Object statementDescriptor;

      private Payouts(
          Boolean debitNegativeBalances,
          Map<String, Object> extraParams,
          Schedule schedule,
          Object statementDescriptor) {
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

        private Object statementDescriptor;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Settings.Payouts build() {
          return new AccountUpdateParams.Settings.Payouts(
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
         * map. See {@link AccountUpdateParams.Settings.Payouts#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Payouts#extraParams} for the field
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
        public Builder setSchedule(AccountUpdateParams.Settings.Payouts.Schedule schedule) {
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

        /**
         * The text that appears on the bank account statement for payouts. If not set, this
         * defaults to the platform's bank descriptor as set in the Dashboard.
         */
        public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }
      }

      @Getter
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
         * The day of the week when available funds are paid out, specified as {@code monday},
         * {@code tuesday}, etc. (required and applicable only if {@code interval} is {@code
         * weekly}.)
         */
        @SerializedName("weekly_anchor")
        WeeklyAnchor weeklyAnchor;

        private Schedule(
            Object delayDays,
            Map<String, Object> extraParams,
            Interval interval,
            Long monthlyAnchor,
            WeeklyAnchor weeklyAnchor) {
          this.delayDays = delayDays;
          this.extraParams = extraParams;
          this.interval = interval;
          this.monthlyAnchor = monthlyAnchor;
          this.weeklyAnchor = weeklyAnchor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object delayDays;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long monthlyAnchor;

          private WeeklyAnchor weeklyAnchor;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Settings.Payouts.Schedule build() {
            return new AccountUpdateParams.Settings.Payouts.Schedule(
                this.delayDays,
                this.extraParams,
                this.interval,
                this.monthlyAnchor,
                this.weeklyAnchor);
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
              AccountUpdateParams.Settings.Payouts.Schedule.DelayDays delayDays) {
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
           * map. See {@link AccountUpdateParams.Settings.Payouts.Schedule#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Settings.Payouts.Schedule#extraParams} for the
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
              AccountUpdateParams.Settings.Payouts.Schedule.Interval interval) {
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
           * The day of the week when available funds are paid out, specified as {@code monday},
           * {@code tuesday}, etc. (required and applicable only if {@code interval} is {@code
           * weekly}.)
           */
          public Builder setWeeklyAnchor(
              AccountUpdateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor) {
            this.weeklyAnchor = weeklyAnchor;
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
      }
    }

    @Getter
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
        public AccountUpdateParams.Settings.TaxForms build() {
          return new AccountUpdateParams.Settings.TaxForms(
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
         * map. See {@link AccountUpdateParams.Settings.TaxForms#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.TaxForms#extraParams} for the field
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
        public AccountUpdateParams.Settings.Treasury build() {
          return new AccountUpdateParams.Settings.Treasury(this.extraParams, this.tosAcceptance);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Treasury#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Settings.Treasury#extraParams} for the field
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
            AccountUpdateParams.Settings.Treasury.TosAcceptance tosAcceptance) {
          this.tosAcceptance = tosAcceptance;
          return this;
        }
      }

      @Getter
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
        Object ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        Object userAgent;

        private TosAcceptance(
            Long date, Map<String, Object> extraParams, Object ip, Object userAgent) {
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

          private Object ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Settings.Treasury.TosAcceptance build() {
            return new AccountUpdateParams.Settings.Treasury.TosAcceptance(
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
           * map. See {@link AccountUpdateParams.Settings.Treasury.TosAcceptance#extraParams} for
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
           * map. See {@link AccountUpdateParams.Settings.Treasury.TosAcceptance#extraParams} for
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
           * The IP address from which the account representative accepted the service agreement.
           */
          public Builder setIp(EmptyParam ip) {
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
    Object ip;

    /** The user's service agreement type. */
    @SerializedName("service_agreement")
    Object serviceAgreement;

    /**
     * The user agent of the browser from which the account representative accepted their service
     * agreement.
     */
    @SerializedName("user_agent")
    Object userAgent;

    private TosAcceptance(
        Long date,
        Map<String, Object> extraParams,
        Object ip,
        Object serviceAgreement,
        Object userAgent) {
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

      private Object ip;

      private Object serviceAgreement;

      private Object userAgent;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.TosAcceptance build() {
        return new AccountUpdateParams.TosAcceptance(
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
       * AccountUpdateParams.TosAcceptance#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.TosAcceptance#extraParams} for the field documentation.
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

      /** The IP address from which the account representative accepted their service agreement. */
      public Builder setIp(EmptyParam ip) {
        this.ip = ip;
        return this;
      }

      /** The user's service agreement type. */
      public Builder setServiceAgreement(String serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
        return this;
      }

      /** The user's service agreement type. */
      public Builder setServiceAgreement(EmptyParam serviceAgreement) {
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

      /**
       * The user agent of the browser from which the account representative accepted their service
       * agreement.
       */
      public Builder setUserAgent(EmptyParam userAgent) {
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
}
