// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
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

  /** The business type. */
  @SerializedName("business_type")
  BusinessType businessType;

  /**
   * Each key of the dictionary represents a capability, and each capability maps to its settings
   * (e.g. whether it has been requested or not). Each capability will be inactive until you have
   * provided its specific requirements and Stripe has verified them. An account may have some of
   * its requested capabilities be active and some be inactive.
   */
  @SerializedName("capabilities")
  Capabilities capabilities;

  /**
   * Information about the company or business. This field is available for any {@code
   * business_type}.
   */
  @SerializedName("company")
  Company company;

  /** The configuration of the account when {@code type} is not provided. */
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
   * a currency that <a href="https://stripe.com/docs/payouts">Stripe supports in the account's
   * country</a>.
   */
  @SerializedName("default_currency")
  String defaultCurrency;

  /** Documents that may be submitted to satisfy various informational requests. */
  @SerializedName("documents")
  Documents documents;

  /**
   * The email address of the account holder. This is only to make the account easier to identify to
   * you. Stripe only emails Custom accounts with your consent.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A card or bank account to attach to the account for receiving <a
   * href="https://stripe.com/docs/connect/bank-debit-card-payouts">payouts</a> (you won’t be able
   * to use it for top-ups). You can provide either a token, like the ones returned by <a
   * href="https://stripe.com/docs/js">Stripe.js</a>, or a dictionary, as documented in the {@code
   * external_account} parameter for <a
   * href="https://stripe.com/docs/api#account_create_bank_account">bank account</a> creation. <br>
   * <br>
   * By default, providing an external account sets it as the new default external account for its
   * currency, and deletes the old default if one exists. To add additional external accounts
   * without replacing the existing default for the currency, use the <a
   * href="https://stripe.com/docs/api#account_create_bank_account">bank account</a> or <a
   * href="https://stripe.com/docs/api#account_create_card">card creation</a> APIs.
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
   * Information about the person represented by the account. This field is null unless {@code
   * business_type} is set to {@code individual}.
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

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  Settings settings;

  /**
   * Details on the account's acceptance of the <a
   * href="https://stripe.com/docs/connect/updating-accounts#tos-acceptance">Stripe Services
   * Agreement</a>.
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
      Individual individual,
      Object metadata,
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
    this.individual = individual;
    this.metadata = metadata;
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

    private Individual individual;

    private Object metadata;

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
          this.individual,
          this.metadata,
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

    /** The business type. */
    public Builder setBusinessType(AccountCreateParams.BusinessType businessType) {
      this.businessType = businessType;
      return this;
    }

    /**
     * Each key of the dictionary represents a capability, and each capability maps to its settings
     * (e.g. whether it has been requested or not). Each capability will be inactive until you have
     * provided its specific requirements and Stripe has verified them. An account may have some of
     * its requested capabilities be active and some be inactive.
     */
    public Builder setCapabilities(AccountCreateParams.Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * Information about the company or business. This field is available for any {@code
     * business_type}.
     */
    public Builder setCompany(AccountCreateParams.Company company) {
      this.company = company;
      return this;
    }

    /** The configuration of the account when {@code type} is not provided. */
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
     * be a currency that <a href="https://stripe.com/docs/payouts">Stripe supports in the account's
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
     * to you. Stripe only emails Custom accounts with your consent.
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
     * href="https://stripe.com/docs/connect/bank-debit-card-payouts">payouts</a> (you won’t be able
     * to use it for top-ups). You can provide either a token, like the ones returned by <a
     * href="https://stripe.com/docs/js">Stripe.js</a>, or a dictionary, as documented in the {@code
     * external_account} parameter for <a
     * href="https://stripe.com/docs/api#account_create_bank_account">bank account</a> creation.
     * <br>
     * <br>
     * By default, providing an external account sets it as the new default external account for its
     * currency, and deletes the old default if one exists. To add additional external accounts
     * without replacing the existing default for the currency, use the <a
     * href="https://stripe.com/docs/api#account_create_bank_account">bank account</a> or <a
     * href="https://stripe.com/docs/api#account_create_card">card creation</a> APIs.
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
     * Information about the person represented by the account. This field is null unless {@code
     * business_type} is set to {@code individual}.
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

    /** Options for customizing how the account functions within Stripe. */
    public Builder setSettings(AccountCreateParams.Settings settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Details on the account's acceptance of the <a
     * href="https://stripe.com/docs/connect/updating-accounts#tos-acceptance">Stripe Services
     * Agreement</a>.
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
  public static class BusinessProfile {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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
        Map<String, Object> extraParams,
        String mcc,
        String name,
        String productDescription,
        SupportAddress supportAddress,
        String supportEmail,
        String supportPhone,
        Object supportUrl,
        String url) {
      this.extraParams = extraParams;
      this.mcc = mcc;
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
      private Map<String, Object> extraParams;

      private String mcc;

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
            this.extraParams,
            this.mcc,
            this.name,
            this.productDescription,
            this.supportAddress,
            this.supportEmail,
            this.supportPhone,
            this.supportUrl,
            this.url);
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
       * <a href="https://stripe.com/docs/connect/setting-mcc">The merchant category code for the
       * account</a>. MCCs are used to classify businesses based on the goods or services they
       * provide.
       */
      public Builder setMcc(String mcc) {
        this.mcc = mcc;
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

    /** The promptpay_payments capability. */
    @SerializedName("promptpay_payments")
    PromptpayPayments promptpayPayments;

    /** The sepa_debit_payments capability. */
    @SerializedName("sepa_debit_payments")
    SepaDebitPayments sepaDebitPayments;

    /** The sofort_payments capability. */
    @SerializedName("sofort_payments")
    SofortPayments sofortPayments;

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

    /** The us_bank_account_ach_payments capability. */
    @SerializedName("us_bank_account_ach_payments")
    UsBankAccountAchPayments usBankAccountAchPayments;

    /** The zip_payments capability. */
    @SerializedName("zip_payments")
    ZipPayments zipPayments;

    private Capabilities(
        AcssDebitPayments acssDebitPayments,
        AffirmPayments affirmPayments,
        AfterpayClearpayPayments afterpayClearpayPayments,
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
        GiropayPayments giropayPayments,
        GrabpayPayments grabpayPayments,
        IdealPayments idealPayments,
        IndiaInternationalPayments indiaInternationalPayments,
        JcbPayments jcbPayments,
        KlarnaPayments klarnaPayments,
        KonbiniPayments konbiniPayments,
        LegacyPayments legacyPayments,
        LinkPayments linkPayments,
        OxxoPayments oxxoPayments,
        P24Payments p24Payments,
        PaynowPayments paynowPayments,
        PaypalPayments paypalPayments,
        PromptpayPayments promptpayPayments,
        SepaDebitPayments sepaDebitPayments,
        SofortPayments sofortPayments,
        TaxReportingUs1099K taxReportingUs1099K,
        TaxReportingUs1099Misc taxReportingUs1099Misc,
        Transfers transfers,
        Treasury treasury,
        UsBankAccountAchPayments usBankAccountAchPayments,
        ZipPayments zipPayments) {
      this.acssDebitPayments = acssDebitPayments;
      this.affirmPayments = affirmPayments;
      this.afterpayClearpayPayments = afterpayClearpayPayments;
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
      this.giropayPayments = giropayPayments;
      this.grabpayPayments = grabpayPayments;
      this.idealPayments = idealPayments;
      this.indiaInternationalPayments = indiaInternationalPayments;
      this.jcbPayments = jcbPayments;
      this.klarnaPayments = klarnaPayments;
      this.konbiniPayments = konbiniPayments;
      this.legacyPayments = legacyPayments;
      this.linkPayments = linkPayments;
      this.oxxoPayments = oxxoPayments;
      this.p24Payments = p24Payments;
      this.paynowPayments = paynowPayments;
      this.paypalPayments = paypalPayments;
      this.promptpayPayments = promptpayPayments;
      this.sepaDebitPayments = sepaDebitPayments;
      this.sofortPayments = sofortPayments;
      this.taxReportingUs1099K = taxReportingUs1099K;
      this.taxReportingUs1099Misc = taxReportingUs1099Misc;
      this.transfers = transfers;
      this.treasury = treasury;
      this.usBankAccountAchPayments = usBankAccountAchPayments;
      this.zipPayments = zipPayments;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebitPayments acssDebitPayments;

      private AffirmPayments affirmPayments;

      private AfterpayClearpayPayments afterpayClearpayPayments;

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

      private GiropayPayments giropayPayments;

      private GrabpayPayments grabpayPayments;

      private IdealPayments idealPayments;

      private IndiaInternationalPayments indiaInternationalPayments;

      private JcbPayments jcbPayments;

      private KlarnaPayments klarnaPayments;

      private KonbiniPayments konbiniPayments;

      private LegacyPayments legacyPayments;

      private LinkPayments linkPayments;

      private OxxoPayments oxxoPayments;

      private P24Payments p24Payments;

      private PaynowPayments paynowPayments;

      private PaypalPayments paypalPayments;

      private PromptpayPayments promptpayPayments;

      private SepaDebitPayments sepaDebitPayments;

      private SofortPayments sofortPayments;

      private TaxReportingUs1099K taxReportingUs1099K;

      private TaxReportingUs1099Misc taxReportingUs1099Misc;

      private Transfers transfers;

      private Treasury treasury;

      private UsBankAccountAchPayments usBankAccountAchPayments;

      private ZipPayments zipPayments;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Capabilities build() {
        return new AccountCreateParams.Capabilities(
            this.acssDebitPayments,
            this.affirmPayments,
            this.afterpayClearpayPayments,
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
            this.giropayPayments,
            this.grabpayPayments,
            this.idealPayments,
            this.indiaInternationalPayments,
            this.jcbPayments,
            this.klarnaPayments,
            this.konbiniPayments,
            this.legacyPayments,
            this.linkPayments,
            this.oxxoPayments,
            this.p24Payments,
            this.paynowPayments,
            this.paypalPayments,
            this.promptpayPayments,
            this.sepaDebitPayments,
            this.sofortPayments,
            this.taxReportingUs1099K,
            this.taxReportingUs1099Misc,
            this.transfers,
            this.treasury,
            this.usBankAccountAchPayments,
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

      /** The au_becs_debit_payments capability. */
      public Builder setAuBecsDebitPayments(
          AccountCreateParams.Capabilities.AuBecsDebitPayments auBecsDebitPayments) {
        this.auBecsDebitPayments = auBecsDebitPayments;
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

      /** The giropay_payments capability. */
      public Builder setGiropayPayments(
          AccountCreateParams.Capabilities.GiropayPayments giropayPayments) {
        this.giropayPayments = giropayPayments;
        return this;
      }

      /** The grabpay_payments capability. */
      public Builder setGrabpayPayments(
          AccountCreateParams.Capabilities.GrabpayPayments grabpayPayments) {
        this.grabpayPayments = grabpayPayments;
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

      /** The promptpay_payments capability. */
      public Builder setPromptpayPayments(
          AccountCreateParams.Capabilities.PromptpayPayments promptpayPayments) {
        this.promptpayPayments = promptpayPayments;
        return this;
      }

      /** The sepa_debit_payments capability. */
      public Builder setSepaDebitPayments(
          AccountCreateParams.Capabilities.SepaDebitPayments sepaDebitPayments) {
        this.sepaDebitPayments = sepaDebitPayments;
        return this;
      }

      /** The sofort_payments capability. */
      public Builder setSofortPayments(
          AccountCreateParams.Capabilities.SofortPayments sofortPayments) {
        this.sofortPayments = sofortPayments;
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

      /** The us_bank_account_ach_payments capability. */
      public Builder setUsBankAccountAchPayments(
          AccountCreateParams.Capabilities.UsBankAccountAchPayments usBankAccountAchPayments) {
        this.usBankAccountAchPayments = usBankAccountAchPayments;
        return this;
      }

      /** The zip_payments capability. */
      public Builder setZipPayments(AccountCreateParams.Capabilities.ZipPayments zipPayments) {
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
     * creating all the company's directors with <a href="https://stripe.com/docs/api/persons">the
     * Persons API</a> for accounts with a {@code relationship.director} requirement. This value is
     * not automatically set to {@code true} after creating directors, so it needs to be updated to
     * indicate all directors have been provided.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * Whether the company's executives have been provided. Set this Boolean to {@code true} after
     * creating all the company's executives with <a href="https://stripe.com/docs/api/persons">the
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
     * creating all the company's owners with <a href="https://stripe.com/docs/api/persons">the
     * Persons API</a> for accounts with a {@code relationship.owner} requirement.
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
    String phone;

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
     * href="https://stripe.com/docs/connect/identity-verification#business-structure">Business
     * structure</a> for more details.
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
        Boolean executivesProvided,
        String exportLicenseId,
        String exportPurposeCode,
        Map<String, Object> extraParams,
        String name,
        String nameKana,
        String nameKanji,
        Boolean ownersProvided,
        OwnershipDeclaration ownershipDeclaration,
        String phone,
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

      private String exportLicenseId;

      private String exportPurposeCode;

      private Map<String, Object> extraParams;

      private String name;

      private String nameKana;

      private String nameKanji;

      private Boolean ownersProvided;

      private OwnershipDeclaration ownershipDeclaration;

      private String phone;

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
       * creating all the company's directors with <a href="https://stripe.com/docs/api/persons">the
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
       * creating all the company's executives with <a
       * href="https://stripe.com/docs/api/persons">the Persons API</a> for accounts with a {@code
       * relationship.executive} requirement.
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
       * creating all the company's owners with <a href="https://stripe.com/docs/api/persons">the
       * Persons API</a> for accounts with a {@code relationship.owner} requirement.
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

      /** The company's phone number (used for verification). */
      public Builder setPhone(String phone) {
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
       * The category identifying the legal structure of the company or legal entity. See <a
       * href="https://stripe.com/docs/connect/identity-verification#business-structure">Business
       * structure</a> for more details.
       */
      public Builder setStructure(AccountCreateParams.Company.Structure structure) {
        this.structure = structure;
        return this;
      }

      /**
       * The category identifying the legal structure of the company or legal entity. See <a
       * href="https://stripe.com/docs/connect/identity-verification#business-structure">Business
       * structure</a> for more details.
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
      UNINCORPORATED_NON_PROFIT("unincorporated_non_profit");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Structure(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Controller {
    /** The documentation for the application hash. */
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

    private Controller(
        Application application, Dashboard dashboard, Map<String, Object> extraParams) {
      this.application = application;
      this.dashboard = dashboard;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Application application;

      private Dashboard dashboard;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Controller build() {
        return new AccountCreateParams.Controller(
            this.application, this.dashboard, this.extraParams);
      }

      /** The documentation for the application hash. */
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
    }

    @Getter
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
       * Whether this account should have access to the full Stripe dashboard ({@code full}) or no
       * dashboard ({@code none}).
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
         * Whether this account should have access to the full Stripe dashboard ({@code full}) or no
         * dashboard ({@code none}).
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
  }

  @Getter
  public static class Documents {
    /**
     * One or more documents that support the <a
     * href="https://support.stripe.com/questions/bank-account-ownership-verification">Bank account
     * ownership verification</a> requirement. Must be a document associated with the account’s
     * primary active bank account that displays the last 4 digits of the account number, either a
     * statement or a voided check.
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
      public AccountCreateParams.Documents build() {
        return new AccountCreateParams.Documents(
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
       * number, either a statement or a voided check.
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

      /**
       * One or more documents showing the company’s proof of registration with the national
       * business registry.
       */
      public Builder setProofOfRegistration(
          AccountCreateParams.Documents.ProofOfRegistration proofOfRegistration) {
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
  }

  @Getter
  public static class Individual {
    /** The individual's primary address. */
    @SerializedName("address")
    Address address;

    /** The Kana variation of the the individual's primary address (Japan only). */
    @SerializedName("address_kana")
    AddressKana addressKana;

    /** The Kanji variation of the the individual's primary address (Japan only). */
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

    /** The Kana variation of the the individual's first name (Japan only). */
    @SerializedName("first_name_kana")
    String firstNameKana;

    /** The Kanji variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kanji")
    String firstNameKanji;

    /** A list of alternate names or aliases that the individual is known by. */
    @SerializedName("full_name_aliases")
    Object fullNameAliases;

    /**
     * The individual's gender (International regulations require either &quot;male&quot; or
     * &quot;female&quot;).
     */
    @SerializedName("gender")
    String gender;

    /**
     * The government-issued ID number of the individual, as appropriate for the representative’s
     * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number in
     * Canada). Instead of the number itself, you can also provide a <a
     * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created with
     * Stripe.js</a>.
     */
    @SerializedName("id_number")
    String idNumber;

    /**
     * The government-issued secondary ID number of the individual, as appropriate for the
     * representative's country, will be used for enhanced verification checks. In Thailand, this
     * would be the laser code found on the back of an ID card. Instead of the number itself, you
     * can also provide a <a
     * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created with
     * Stripe.js</a>.
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
            this.ssnLast4,
            this.verification);
      }

      /** The individual's primary address. */
      public Builder setAddress(AccountCreateParams.Individual.Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the the individual's primary address (Japan only). */
      public Builder setAddressKana(AccountCreateParams.Individual.AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the the individual's primary address (Japan only). */
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

      /** The Kana variation of the the individual's first name (Japan only). */
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
      public Builder addFullNameAliase(String element) {
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
      public Builder addAllFullNameAliase(List<String> elements) {
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
       * The government-issued ID number of the individual, as appropriate for the representative’s
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a <a
       * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created
       * with Stripe.js</a>.
       */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }

      /**
       * The government-issued secondary ID number of the individual, as appropriate for the
       * representative's country, will be used for enhanced verification checks. In Thailand, this
       * would be the laser code found on the back of an ID card. Instead of the number itself, you
       * can also provide a <a
       * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created
       * with Stripe.js</a>.
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
  public static class Settings {
    /**
     * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
     * other products.
     */
    @SerializedName("branding")
    Branding branding;

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

    /** Settings that apply across payment methods for charging on the account. */
    @SerializedName("payments")
    Payments payments;

    /** Settings specific to the account's payouts. */
    @SerializedName("payouts")
    Payouts payouts;

    /** Settings specific to the account's Treasury FinancialAccounts. */
    @SerializedName("treasury")
    Treasury treasury;

    private Settings(
        Branding branding,
        CardIssuing cardIssuing,
        CardPayments cardPayments,
        Map<String, Object> extraParams,
        Payments payments,
        Payouts payouts,
        Treasury treasury) {
      this.branding = branding;
      this.cardIssuing = cardIssuing;
      this.cardPayments = cardPayments;
      this.extraParams = extraParams;
      this.payments = payments;
      this.payouts = payouts;
      this.treasury = treasury;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Branding branding;

      private CardIssuing cardIssuing;

      private CardPayments cardPayments;

      private Map<String, Object> extraParams;

      private Payments payments;

      private Payouts payouts;

      private Treasury treasury;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountCreateParams.Settings build() {
        return new AccountCreateParams.Settings(
            this.branding,
            this.cardIssuing,
            this.cardPayments,
            this.extraParams,
            this.payments,
            this.payouts,
            this.treasury);
      }

      /**
       * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      public Builder setBranding(AccountCreateParams.Settings.Branding branding) {
        this.branding = branding;
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

      /** Settings specific to the account's Treasury FinancialAccounts. */
      public Builder setTreasury(AccountCreateParams.Settings.Treasury treasury) {
        this.treasury = treasury;
        return this;
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
       * href="https://stripe.com/docs/issuing/connect/tos_acceptance">Stripe Issuing Terms and
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
         * href="https://stripe.com/docs/issuing/connect/tos_acceptance">Stripe Issuing Terms and
         * Disclosures</a>.
         */
        public Builder setTosAcceptance(
            AccountCreateParams.Settings.CardIssuing.TosAcceptance tosAcceptance) {
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
        String ip;

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        @SerializedName("user_agent")
        String userAgent;

        private TosAcceptance(
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
       * The Kanji variation of the default text that appears on credit card statements when a
       * charge is made (Japan only).
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
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic {@code statement_descriptor} specified on the charge.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * The Kana variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
         */
        public Builder setStatementDescriptorKana(String statementDescriptorKana) {
          this.statementDescriptorKana = statementDescriptorKana;
          return this;
        }

        /**
         * The Kanji variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
         */
        public Builder setStatementDescriptorKanji(String statementDescriptorKanji) {
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
       * href="https://stripe.com/docs/connect/account-balances">Understanding Connect Account
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
       * href="https://stripe.com/docs/connect/bank-transfers#payout-information">Setting Bank and
       * Debit Card Payouts</a> documentation.
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
         * href="https://stripe.com/docs/connect/account-balances">Understanding Connect Account
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
         * href="https://stripe.com/docs/connect/bank-transfers#payout-information">Setting Bank and
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
      public static class Schedule {
        /**
         * The number of days charge funds are held before being paid out. May also be set to {@code
         * minimum}, representing the lowest available value for the account country. Default is
         * {@code minimum}. The {@code delay_days} parameter does not apply when the {@code
         * interval} is {@code manual}. <a
         * href="https://stripe.com/docs/connect/manage-payout-schedule">Learn more about
         * controlling payout delay days</a>.
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
          public AccountCreateParams.Settings.Payouts.Schedule build() {
            return new AccountCreateParams.Settings.Payouts.Schedule(
                this.delayDays,
                this.extraParams,
                this.interval,
                this.monthlyAnchor,
                this.weeklyAnchor);
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * {@code minimum}, representing the lowest available value for the account country.
           * Default is {@code minimum}. The {@code delay_days} parameter does not apply when the
           * {@code interval} is {@code manual}. <a
           * href="https://stripe.com/docs/connect/manage-payout-schedule">Learn more about
           * controlling payout delay days</a>.
           */
          public Builder setDelayDays(
              AccountCreateParams.Settings.Payouts.Schedule.DelayDays delayDays) {
            this.delayDays = delayDays;
            return this;
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * {@code minimum}, representing the lowest available value for the account country.
           * Default is {@code minimum}. The {@code delay_days} parameter does not apply when the
           * {@code interval} is {@code manual}. <a
           * href="https://stripe.com/docs/connect/manage-payout-schedule">Learn more about
           * controlling payout delay days</a>.
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
           * The day of the week when available funds are paid out, specified as {@code monday},
           * {@code tuesday}, etc. (required and applicable only if {@code interval} is {@code
           * weekly}.)
           */
          public Builder setWeeklyAnchor(
              AccountCreateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor) {
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
        String userAgent;

        private TosAcceptance(
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
