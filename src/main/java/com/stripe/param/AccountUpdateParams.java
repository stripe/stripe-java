package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class AccountUpdateParams extends ApiRequestParams {

  /**
   * An [account token](https://stripe.com/docs/api#create_account_token), used to securely provide
   * details to the account.
   */
  @SerializedName("account_token")
  String accountToken;

  /** Non-essential business information about the account. */
  @SerializedName("business_profile")
  AccountUpdateParams.BusinessProfile businessProfile;

  /** The business type. Can be `individual` or `company`. */
  @SerializedName("business_type")
  String businessType;

  /**
   * Information about the company or business. This field is null unless `business_type` is set to
   * `company`.
   */
  @SerializedName("company")
  AccountUpdateParams.Company company;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that [Stripe supports in the account's country](https://stripe.com/docs/payouts).
   */
  @SerializedName("default_currency")
  String defaultCurrency;

  /**
   * Email address of the account representative. For Standard accounts, this is used to ask them to
   * claim their Stripe account. For Custom accounts, this only makes the account easier to identify
   * to platforms; Stripe does not email the account representative.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A card or bank account to attach to the account. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe.js), or a dictionary, as documented in
   * the `external_account` parameter for [bank
   * account](https://stripe.com/docs/api#account_create_bank_account) creation. <br>
   * <br>
   * By default, providing an external account sets it as the new default external account for its
   * currency, and deletes the old default if one exists. To add additional external accounts
   * without replacing the existing default for the currency, use the bank account or card creation
   * API.
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
   * Information about the person represented by the account. This field is null unless
   * `business_type` is set to `individual`.
   */
  @SerializedName("individual")
  AccountUpdateParams.Individual individual;

  /**
   * A set of key-value pairs that you can attach to an `Account` object. This can be useful for
   * storing additional information about the account in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The set of capabilities you want to unlock for this account (US only). Each capability will be
   * inactive until you have provided its specific requirements and Stripe has verified them. An
   * account may have some of its requested capabilities be active and some be inactive.
   */
  @SerializedName("requested_capabilities")
  List<AccountUpdateParams.RequestedCapability> requestedCapabilities;

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  AccountUpdateParams.Settings settings;

  /**
   * Details on the account's acceptance of the [Stripe Services
   * Agreement](https://stripe.com/docs/connect/updating-accounts#tos-acceptance).
   */
  @SerializedName("tos_acceptance")
  AccountUpdateParams.TosAcceptance tosAcceptance;

  private AccountUpdateParams(
      String accountToken,
      AccountUpdateParams.BusinessProfile businessProfile,
      String businessType,
      AccountUpdateParams.Company company,
      String defaultCurrency,
      String email,
      List<String> expand,
      String externalAccount,
      Map<String, Object> extraParams,
      AccountUpdateParams.Individual individual,
      Map<String, String> metadata,
      List<AccountUpdateParams.RequestedCapability> requestedCapabilities,
      AccountUpdateParams.Settings settings,
      AccountUpdateParams.TosAcceptance tosAcceptance) {

    this.accountToken = accountToken;
    this.businessProfile = businessProfile;
    this.businessType = businessType;
    this.company = company;
    this.defaultCurrency = defaultCurrency;
    this.email = email;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.extraParams = extraParams;
    this.individual = individual;
    this.metadata = metadata;
    this.requestedCapabilities = requestedCapabilities;
    this.settings = settings;
    this.tosAcceptance = tosAcceptance;
  }

  public static AccountUpdateParams.Builder builder() {
    return new AccountUpdateParams.Builder();
  }

  public static class Builder {
    private String accountToken;
    private AccountUpdateParams.BusinessProfile businessProfile;
    private String businessType;
    private AccountUpdateParams.Company company;
    private String defaultCurrency;
    private String email;
    private List<String> expand;
    private String externalAccount;
    private Map<String, Object> extraParams;
    private AccountUpdateParams.Individual individual;
    private Map<String, String> metadata;
    private List<AccountUpdateParams.RequestedCapability> requestedCapabilities;
    private AccountUpdateParams.Settings settings;
    private AccountUpdateParams.TosAcceptance tosAcceptance;

    public AccountUpdateParams build() {
      return new AccountUpdateParams(
          this.accountToken,
          this.businessProfile,
          this.businessType,
          this.company,
          this.defaultCurrency,
          this.email,
          this.expand,
          this.externalAccount,
          this.extraParams,
          this.individual,
          this.metadata,
          this.requestedCapabilities,
          this.settings,
          this.tosAcceptance);
    }

    /**
     * An [account token](https://stripe.com/docs/api#create_account_token), used to securely
     * provide details to the account.
     */
    public AccountUpdateParams.Builder setAccountToken(String accountToken) {

      this.accountToken = accountToken;
      return this;
    }

    /** Non-essential business information about the account. */
    public AccountUpdateParams.Builder setBusinessProfile(
        AccountUpdateParams.BusinessProfile businessProfile) {

      this.businessProfile = businessProfile;
      return this;
    }

    /** The business type. Can be `individual` or `company`. */
    public AccountUpdateParams.Builder setBusinessType(String businessType) {

      this.businessType = businessType;
      return this;
    }

    /**
     * Information about the company or business. This field is null unless `business_type` is set
     * to `company`.
     */
    public AccountUpdateParams.Builder setCompany(AccountUpdateParams.Company company) {

      this.company = company;
      return this;
    }

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must
     * be a currency that [Stripe supports in the account's
     * country](https://stripe.com/docs/payouts).
     */
    public AccountUpdateParams.Builder setDefaultCurrency(String defaultCurrency) {

      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /**
     * Email address of the account representative. For Standard accounts, this is used to ask them
     * to claim their Stripe account. For Custom accounts, this only makes the account easier to
     * identify to platforms; Stripe does not email the account representative.
     */
    public AccountUpdateParams.Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#expand} for the field documentation.
     */
    public AccountUpdateParams.Builder addExpand(String element) {
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
    public AccountUpdateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * A card or bank account to attach to the account. You can provide either a token, like the
     * ones returned by [Stripe.js](https://stripe.com/docs/stripe.js), or a dictionary, as
     * documented in the `external_account` parameter for [bank
     * account](https://stripe.com/docs/api#account_create_bank_account) creation. <br>
     * <br>
     * By default, providing an external account sets it as the new default external account for its
     * currency, and deletes the old default if one exists. To add additional external accounts
     * without replacing the existing default for the currency, use the bank account or card
     * creation API.
     */
    public AccountUpdateParams.Builder setExternalAccount(String externalAccount) {

      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#extraParams} for the field documentation.
     */
    public AccountUpdateParams.Builder putExtraParam(String key, Object value) {

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
    public AccountUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Information about the person represented by the account. This field is null unless
     * `business_type` is set to `individual`.
     */
    public AccountUpdateParams.Builder setIndividual(AccountUpdateParams.Individual individual) {

      this.individual = individual;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public AccountUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AccountUpdateParams#metadata} for the field documentation.
     */
    public AccountUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `requestedCapabilities` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountUpdateParams#requestedCapabilities} for the field documentation.
     */
    public AccountUpdateParams.Builder addRequestedCapability(
        AccountUpdateParams.RequestedCapability element) {

      if (this.requestedCapabilities == null) {
        this.requestedCapabilities = new ArrayList<>();
      }
      this.requestedCapabilities.add(element);
      return this;
    }

    /**
     * Add all elements to `requestedCapabilities` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountUpdateParams#requestedCapabilities} for the field documentation.
     */
    public AccountUpdateParams.Builder addAllRequestedCapability(
        List<AccountUpdateParams.RequestedCapability> list) {

      if (this.requestedCapabilities == null) {
        this.requestedCapabilities = new ArrayList<>();
      }
      this.requestedCapabilities.addAll(list);
      return this;
    }

    /** Options for customizing how the account functions within Stripe. */
    public AccountUpdateParams.Builder setSettings(AccountUpdateParams.Settings settings) {

      this.settings = settings;
      return this;
    }

    /**
     * Details on the account's acceptance of the [Stripe Services
     * Agreement](https://stripe.com/docs/connect/updating-accounts#tos-acceptance).
     */
    public AccountUpdateParams.Builder setTosAcceptance(
        AccountUpdateParams.TosAcceptance tosAcceptance) {

      this.tosAcceptance = tosAcceptance;
      return this;
    }
  }

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
     * The merchant category code for the account. MCCs are used to classify businesses based on the
     * goods or services they provide.
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

    private BusinessProfile(
        Map<String, Object> extraParams,
        String mcc,
        String name,
        String productDescription,
        String supportEmail,
        String supportPhone,
        String supportUrl,
        String url) {

      this.extraParams = extraParams;
      this.mcc = mcc;
      this.name = name;
      this.productDescription = productDescription;
      this.supportEmail = supportEmail;
      this.supportPhone = supportPhone;
      this.supportUrl = supportUrl;
      this.url = url;
    }

    public static AccountUpdateParams.BusinessProfile.Builder builder() {
      return new AccountUpdateParams.BusinessProfile.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private String mcc;
      private String name;
      private String productDescription;
      private String supportEmail;
      private String supportPhone;
      private String supportUrl;
      private String url;

      public AccountUpdateParams.BusinessProfile build() {
        return new AccountUpdateParams.BusinessProfile(
            this.extraParams,
            this.mcc,
            this.name,
            this.productDescription,
            this.supportEmail,
            this.supportPhone,
            this.supportUrl,
            this.url);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.BusinessProfile#extraParams} for the field documentation.
       */
      public AccountUpdateParams.BusinessProfile.Builder putExtraParam(String key, Object value) {

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
      public AccountUpdateParams.BusinessProfile.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The merchant category code for the account. MCCs are used to classify businesses based on
       * the goods or services they provide.
       */
      public AccountUpdateParams.BusinessProfile.Builder setMcc(String mcc) {

        this.mcc = mcc;
        return this;
      }

      /** The customer-facing business name. */
      public AccountUpdateParams.BusinessProfile.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /**
       * Internal-only description of the product sold by, or service provided by, the business.
       * Used by Stripe for risk and underwriting purposes.
       */
      public AccountUpdateParams.BusinessProfile.Builder setProductDescription(
          String productDescription) {

        this.productDescription = productDescription;
        return this;
      }

      /** A publicly available email address for sending support issues to. */
      public AccountUpdateParams.BusinessProfile.Builder setSupportEmail(String supportEmail) {

        this.supportEmail = supportEmail;
        return this;
      }

      /** A publicly available phone number to call with support issues. */
      public AccountUpdateParams.BusinessProfile.Builder setSupportPhone(String supportPhone) {

        this.supportPhone = supportPhone;
        return this;
      }

      /** A publicly available website for handling support issues. */
      public AccountUpdateParams.BusinessProfile.Builder setSupportUrl(String supportUrl) {

        this.supportUrl = supportUrl;
        return this;
      }

      /** The business's publicly available website. */
      public AccountUpdateParams.BusinessProfile.Builder setUrl(String url) {

        this.url = url;
        return this;
      }
    }
  }

  public static class Company {

    /** The company's primary address. */
    @SerializedName("address")
    AccountUpdateParams.Company.Address address;

    /** The Kana variation of the company's primary address (Japan only). */
    @SerializedName("address_kana")
    AccountUpdateParams.Company.AddressKana addressKana;

    /** The Kanji variation of the company's primary address (Japan only). */
    @SerializedName("address_kanji")
    AccountUpdateParams.Company.AddressKanji addressKanji;

    /**
     * Whether the company's directors have been provided. Set this Boolean to `true` after creating
     * all the company's directors with [the Persons API](https://stripe.com/docs/api/persons) for
     * accounts with a `relationship.director` requirement. This value is not automatically set to
     * `true` after creating directors, so it needs to be updated to indicate all directors have
     * been provided.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

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
     * Whether the company's owners have been provided. Set this Boolean to `true` after creating
     * all the company's owners with [the Persons API](https://stripe.com/docs/api/persons) for
     * accounts with a `relationship.owner` requirement.
     */
    @SerializedName("owners_provided")
    Boolean ownersProvided;

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    String phone;

    /**
     * The business ID number of the company, as appropriate for the company’s country. (Examples
     * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
     * the UK.)
     */
    @SerializedName("tax_id")
    String taxId;

    /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
    @SerializedName("tax_id_registrar")
    String taxIdRegistrar;

    /** The VAT number of the company. */
    @SerializedName("vat_id")
    String vatId;

    private Company(
        AccountUpdateParams.Company.Address address,
        AccountUpdateParams.Company.AddressKana addressKana,
        AccountUpdateParams.Company.AddressKanji addressKanji,
        Boolean directorsProvided,
        Map<String, Object> extraParams,
        String name,
        String nameKana,
        String nameKanji,
        Boolean ownersProvided,
        String phone,
        String taxId,
        String taxIdRegistrar,
        String vatId) {

      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.directorsProvided = directorsProvided;
      this.extraParams = extraParams;
      this.name = name;
      this.nameKana = nameKana;
      this.nameKanji = nameKanji;
      this.ownersProvided = ownersProvided;
      this.phone = phone;
      this.taxId = taxId;
      this.taxIdRegistrar = taxIdRegistrar;
      this.vatId = vatId;
    }

    public static AccountUpdateParams.Company.Builder builder() {
      return new AccountUpdateParams.Company.Builder();
    }

    public static class Builder {
      private AccountUpdateParams.Company.Address address;
      private AccountUpdateParams.Company.AddressKana addressKana;
      private AccountUpdateParams.Company.AddressKanji addressKanji;
      private Boolean directorsProvided;
      private Map<String, Object> extraParams;
      private String name;
      private String nameKana;
      private String nameKanji;
      private Boolean ownersProvided;
      private String phone;
      private String taxId;
      private String taxIdRegistrar;
      private String vatId;

      public AccountUpdateParams.Company build() {
        return new AccountUpdateParams.Company(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.directorsProvided,
            this.extraParams,
            this.name,
            this.nameKana,
            this.nameKanji,
            this.ownersProvided,
            this.phone,
            this.taxId,
            this.taxIdRegistrar,
            this.vatId);
      }

      /** The company's primary address. */
      public AccountUpdateParams.Company.Builder setAddress(
          AccountUpdateParams.Company.Address address) {

        this.address = address;
        return this;
      }

      /** The Kana variation of the company's primary address (Japan only). */
      public AccountUpdateParams.Company.Builder setAddressKana(
          AccountUpdateParams.Company.AddressKana addressKana) {

        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the company's primary address (Japan only). */
      public AccountUpdateParams.Company.Builder setAddressKanji(
          AccountUpdateParams.Company.AddressKanji addressKanji) {

        this.addressKanji = addressKanji;
        return this;
      }

      /**
       * Whether the company's directors have been provided. Set this Boolean to `true` after
       * creating all the company's directors with [the Persons
       * API](https://stripe.com/docs/api/persons) for accounts with a `relationship.director`
       * requirement. This value is not automatically set to `true` after creating directors, so it
       * needs to be updated to indicate all directors have been provided.
       */
      public AccountUpdateParams.Company.Builder setDirectorsProvided(Boolean directorsProvided) {

        this.directorsProvided = directorsProvided;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Company#extraParams} for the field documentation.
       */
      public AccountUpdateParams.Company.Builder putExtraParam(String key, Object value) {

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
      public AccountUpdateParams.Company.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The company's legal name. */
      public AccountUpdateParams.Company.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The Kana variation of the company's legal name (Japan only). */
      public AccountUpdateParams.Company.Builder setNameKana(String nameKana) {

        this.nameKana = nameKana;
        return this;
      }

      /** The Kanji variation of the company's legal name (Japan only). */
      public AccountUpdateParams.Company.Builder setNameKanji(String nameKanji) {

        this.nameKanji = nameKanji;
        return this;
      }

      /**
       * Whether the company's owners have been provided. Set this Boolean to `true` after creating
       * all the company's owners with [the Persons API](https://stripe.com/docs/api/persons) for
       * accounts with a `relationship.owner` requirement.
       */
      public AccountUpdateParams.Company.Builder setOwnersProvided(Boolean ownersProvided) {

        this.ownersProvided = ownersProvided;
        return this;
      }

      /** The company's phone number (used for verification). */
      public AccountUpdateParams.Company.Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The business ID number of the company, as appropriate for the company’s country. (Examples
       * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
       * the UK.)
       */
      public AccountUpdateParams.Company.Builder setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
      }

      /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
      public AccountUpdateParams.Company.Builder setTaxIdRegistrar(String taxIdRegistrar) {

        this.taxIdRegistrar = taxIdRegistrar;
        return this;
      }

      /** The VAT number of the company. */
      public AccountUpdateParams.Company.Builder setVatId(String vatId) {
        this.vatId = vatId;
        return this;
      }
    }

    public static class Address {

      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Company.Address.Builder builder() {

        return new AccountUpdateParams.Company.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

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
        public AccountUpdateParams.Company.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Company.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.Address#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Company.Address.Builder putExtraParam(String key, Object value) {

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
        public AccountUpdateParams.Company.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public AccountUpdateParams.Company.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public AccountUpdateParams.Company.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public AccountUpdateParams.Company.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public AccountUpdateParams.Company.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }

    public static class AddressKana {

      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Company.AddressKana.Builder builder() {

        return new AccountUpdateParams.Company.AddressKana.Builder();
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
        public AccountUpdateParams.Company.AddressKana.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Company.AddressKana.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.AddressKana#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Company.AddressKana.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Company.AddressKana.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public AccountUpdateParams.Company.AddressKana.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public AccountUpdateParams.Company.AddressKana.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public AccountUpdateParams.Company.AddressKana.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public AccountUpdateParams.Company.AddressKana.Builder setState(String state) {

          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public AccountUpdateParams.Company.AddressKana.Builder setTown(String town) {

          this.town = town;
          return this;
        }
      }
    }

    public static class AddressKanji {

      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Company.AddressKanji.Builder builder() {

        return new AccountUpdateParams.Company.AddressKanji.Builder();
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
        public AccountUpdateParams.Company.AddressKanji.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Company.AddressKanji.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Company.AddressKanji#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Company.AddressKanji.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Company.AddressKanji.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public AccountUpdateParams.Company.AddressKanji.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public AccountUpdateParams.Company.AddressKanji.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public AccountUpdateParams.Company.AddressKanji.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public AccountUpdateParams.Company.AddressKanji.Builder setState(String state) {

          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public AccountUpdateParams.Company.AddressKanji.Builder setTown(String town) {

          this.town = town;
          return this;
        }
      }
    }
  }

  public static class Individual {

    /** The individual's primary address. */
    @SerializedName("address")
    AccountUpdateParams.Individual.Address address;

    /** The Kana variation of the the individual's primary address (Japan only). */
    @SerializedName("address_kana")
    AccountUpdateParams.Individual.AddressKana addressKana;

    /** The Kanji variation of the the individual's primary address (Japan only). */
    @SerializedName("address_kanji")
    AccountUpdateParams.Individual.AddressKanji addressKanji;

    /** The individual's date of birth. */
    @SerializedName("dob")
    AccountUpdateParams.Individual.Dob dob;

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

    /** The individual's gender (International regulations require either "male" or "female"). */
    @SerializedName("gender")
    String gender;

    /**
     * The government-issued ID number of the individual, as appropriate for the representative’s
     * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number in
     * Canada). Instead of the number itself, you can also provide a [PII token created with
     * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
     */
    @SerializedName("id_number")
    String idNumber;

    /** The individual's last name. */
    @SerializedName("last_name")
    String lastName;

    /** The Kana varation of the individual's last name (Japan only). */
    @SerializedName("last_name_kana")
    String lastNameKana;

    /** The Kanji varation of the individual's last name (Japan only). */
    @SerializedName("last_name_kanji")
    String lastNameKanji;

    /** The individual's maiden name. */
    @SerializedName("maiden_name")
    String maidenName;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to
     * `metadata`.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The individual's phone number. */
    @SerializedName("phone")
    String phone;

    /** The last four digits of the individual's Social Security Number (U.S. only). */
    @SerializedName("ssn_last_4")
    String ssnLast4;

    /** The individual's verification document information. */
    @SerializedName("verification")
    AccountUpdateParams.Individual.Verification verification;

    private Individual(
        AccountUpdateParams.Individual.Address address,
        AccountUpdateParams.Individual.AddressKana addressKana,
        AccountUpdateParams.Individual.AddressKanji addressKanji,
        AccountUpdateParams.Individual.Dob dob,
        String email,
        Map<String, Object> extraParams,
        String firstName,
        String firstNameKana,
        String firstNameKanji,
        String gender,
        String idNumber,
        String lastName,
        String lastNameKana,
        String lastNameKanji,
        String maidenName,
        Map<String, String> metadata,
        String phone,
        String ssnLast4,
        AccountUpdateParams.Individual.Verification verification) {

      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.dob = dob;
      this.email = email;
      this.extraParams = extraParams;
      this.firstName = firstName;
      this.firstNameKana = firstNameKana;
      this.firstNameKanji = firstNameKanji;
      this.gender = gender;
      this.idNumber = idNumber;
      this.lastName = lastName;
      this.lastNameKana = lastNameKana;
      this.lastNameKanji = lastNameKanji;
      this.maidenName = maidenName;
      this.metadata = metadata;
      this.phone = phone;
      this.ssnLast4 = ssnLast4;
      this.verification = verification;
    }

    public static AccountUpdateParams.Individual.Builder builder() {
      return new AccountUpdateParams.Individual.Builder();
    }

    public static class Builder {
      private AccountUpdateParams.Individual.Address address;
      private AccountUpdateParams.Individual.AddressKana addressKana;
      private AccountUpdateParams.Individual.AddressKanji addressKanji;
      private AccountUpdateParams.Individual.Dob dob;
      private String email;
      private Map<String, Object> extraParams;
      private String firstName;
      private String firstNameKana;
      private String firstNameKanji;
      private String gender;
      private String idNumber;
      private String lastName;
      private String lastNameKana;
      private String lastNameKanji;
      private String maidenName;
      private Map<String, String> metadata;
      private String phone;
      private String ssnLast4;
      private AccountUpdateParams.Individual.Verification verification;

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
            this.gender,
            this.idNumber,
            this.lastName,
            this.lastNameKana,
            this.lastNameKanji,
            this.maidenName,
            this.metadata,
            this.phone,
            this.ssnLast4,
            this.verification);
      }

      /** The individual's primary address. */
      public AccountUpdateParams.Individual.Builder setAddress(
          AccountUpdateParams.Individual.Address address) {

        this.address = address;
        return this;
      }

      /** The Kana variation of the the individual's primary address (Japan only). */
      public AccountUpdateParams.Individual.Builder setAddressKana(
          AccountUpdateParams.Individual.AddressKana addressKana) {

        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the the individual's primary address (Japan only). */
      public AccountUpdateParams.Individual.Builder setAddressKanji(
          AccountUpdateParams.Individual.AddressKanji addressKanji) {

        this.addressKanji = addressKanji;
        return this;
      }

      /** The individual's date of birth. */
      public AccountUpdateParams.Individual.Builder setDob(AccountUpdateParams.Individual.Dob dob) {

        this.dob = dob;
        return this;
      }

      public AccountUpdateParams.Individual.Builder setEmail(String email) {

        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Individual#extraParams} for the field documentation.
       */
      public AccountUpdateParams.Individual.Builder putExtraParam(String key, Object value) {

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
      public AccountUpdateParams.Individual.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The individual's first name. */
      public AccountUpdateParams.Individual.Builder setFirstName(String firstName) {

        this.firstName = firstName;
        return this;
      }

      /** The Kana variation of the the individual's first name (Japan only). */
      public AccountUpdateParams.Individual.Builder setFirstNameKana(String firstNameKana) {

        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kanji variation of the individual's first name (Japan only). */
      public AccountUpdateParams.Individual.Builder setFirstNameKanji(String firstNameKanji) {

        this.firstNameKanji = firstNameKanji;
        return this;
      }

      /** The individual's gender (International regulations require either "male" or "female"). */
      public AccountUpdateParams.Individual.Builder setGender(String gender) {

        this.gender = gender;
        return this;
      }

      /**
       * The government-issued ID number of the individual, as appropriate for the representative’s
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a [PII token created with
       * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
       */
      public AccountUpdateParams.Individual.Builder setIdNumber(String idNumber) {

        this.idNumber = idNumber;
        return this;
      }

      /** The individual's last name. */
      public AccountUpdateParams.Individual.Builder setLastName(String lastName) {

        this.lastName = lastName;
        return this;
      }

      /** The Kana varation of the individual's last name (Japan only). */
      public AccountUpdateParams.Individual.Builder setLastNameKana(String lastNameKana) {

        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kanji varation of the individual's last name (Japan only). */
      public AccountUpdateParams.Individual.Builder setLastNameKanji(String lastNameKanji) {

        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The individual's maiden name. */
      public AccountUpdateParams.Individual.Builder setMaidenName(String maidenName) {

        this.maidenName = maidenName;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Individual#metadata} for the field documentation.
       */
      public AccountUpdateParams.Individual.Builder putMetadata(String key, String value) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AccountUpdateParams.Individual#metadata} for the field documentation.
       */
      public AccountUpdateParams.Individual.Builder putAllMetadata(Map<String, String> map) {

        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** The individual's phone number. */
      public AccountUpdateParams.Individual.Builder setPhone(String phone) {

        this.phone = phone;
        return this;
      }

      /** The last four digits of the individual's Social Security Number (U.S. only). */
      public AccountUpdateParams.Individual.Builder setSsnLast4(String ssnLast4) {

        this.ssnLast4 = ssnLast4;
        return this;
      }

      /** The individual's verification document information. */
      public AccountUpdateParams.Individual.Builder setVerification(
          AccountUpdateParams.Individual.Verification verification) {

        this.verification = verification;
        return this;
      }
    }

    public static class Address {

      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Individual.Address.Builder builder() {

        return new AccountUpdateParams.Individual.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

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
        public AccountUpdateParams.Individual.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Individual.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.Address#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Individual.Address.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Individual.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public AccountUpdateParams.Individual.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public AccountUpdateParams.Individual.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public AccountUpdateParams.Individual.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public AccountUpdateParams.Individual.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }

    public static class AddressKana {

      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Individual.AddressKana.Builder builder() {

        return new AccountUpdateParams.Individual.AddressKana.Builder();
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
        public AccountUpdateParams.Individual.AddressKana.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Individual.AddressKana.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.AddressKana#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Individual.AddressKana.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Individual.AddressKana.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public AccountUpdateParams.Individual.AddressKana.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public AccountUpdateParams.Individual.AddressKana.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public AccountUpdateParams.Individual.AddressKana.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public AccountUpdateParams.Individual.AddressKana.Builder setState(String state) {

          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public AccountUpdateParams.Individual.AddressKana.Builder setTown(String town) {

          this.town = town;
          return this;
        }
      }
    }

    public static class AddressKanji {

      /** City or ward. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static AccountUpdateParams.Individual.AddressKanji.Builder builder() {

        return new AccountUpdateParams.Individual.AddressKanji.Builder();
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
        public AccountUpdateParams.Individual.AddressKanji.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public AccountUpdateParams.Individual.AddressKanji.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.AddressKanji#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Individual.AddressKanji.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Individual.AddressKanji.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Block or building number. */
        public AccountUpdateParams.Individual.AddressKanji.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        /** Building details. */
        public AccountUpdateParams.Individual.AddressKanji.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        /** Postal code. */
        public AccountUpdateParams.Individual.AddressKanji.Builder setPostalCode(
            String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        /** Prefecture. */
        public AccountUpdateParams.Individual.AddressKanji.Builder setState(String state) {

          this.state = state;
          return this;
        }

        /** Town or cho-me. */
        public AccountUpdateParams.Individual.AddressKanji.Builder setTown(String town) {

          this.town = town;
          return this;
        }
      }
    }

    public static class Dob {

      /** The day of birth, between 1 and 31. */
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

      /** The month of birth, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year of birth. */
      @SerializedName("year")
      Long year;

      private Dob(Long day, Map<String, Object> extraParams, Long month, Long year) {

        this.day = day;
        this.extraParams = extraParams;
        this.month = month;
        this.year = year;
      }

      public static AccountUpdateParams.Individual.Dob.Builder builder() {
        return new AccountUpdateParams.Individual.Dob.Builder();
      }

      public static class Builder {
        private Long day;
        private Map<String, Object> extraParams;
        private Long month;
        private Long year;

        public AccountUpdateParams.Individual.Dob build() {
          return new AccountUpdateParams.Individual.Dob(
              this.day, this.extraParams, this.month, this.year);
        }

        /** The day of birth, between 1 and 31. */
        public AccountUpdateParams.Individual.Dob.Builder setDay(Long day) {

          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.Dob#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Individual.Dob.Builder putExtraParam(String key, Object value) {

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
        public AccountUpdateParams.Individual.Dob.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The month of birth, between 1 and 12. */
        public AccountUpdateParams.Individual.Dob.Builder setMonth(Long month) {

          this.month = month;
          return this;
        }

        /** The four-digit year of birth. */
        public AccountUpdateParams.Individual.Dob.Builder setYear(Long year) {

          this.year = year;
          return this;
        }
      }
    }

    public static class Verification {

      /** An identifying document, either a passport or local ID card. */
      @SerializedName("document")
      AccountUpdateParams.Individual.Verification.Document document;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Verification(
          AccountUpdateParams.Individual.Verification.Document document,
          Map<String, Object> extraParams) {

        this.document = document;
        this.extraParams = extraParams;
      }

      public static AccountUpdateParams.Individual.Verification.Builder builder() {

        return new AccountUpdateParams.Individual.Verification.Builder();
      }

      public static class Builder {
        private AccountUpdateParams.Individual.Verification.Document document;
        private Map<String, Object> extraParams;

        public AccountUpdateParams.Individual.Verification build() {
          return new AccountUpdateParams.Individual.Verification(this.document, this.extraParams);
        }

        /** An identifying document, either a passport or local ID card. */
        public AccountUpdateParams.Individual.Verification.Builder setDocument(
            AccountUpdateParams.Individual.Verification.Document document) {

          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Individual.Verification#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Individual.Verification.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Individual.Verification.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public static class Document {

        /**
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`.
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
         * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`.
         */
        @SerializedName("front")
        String front;

        private Document(String back, Map<String, Object> extraParams, String front) {

          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static AccountUpdateParams.Individual.Verification.Document.Builder builder() {

          return new AccountUpdateParams.Individual.Verification.Document.Builder();
        }

        public static class Builder {
          private String back;
          private Map<String, Object> extraParams;
          private String front;

          public AccountUpdateParams.Individual.Verification.Document build() {

            return new AccountUpdateParams.Individual.Verification.Document(
                this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`.
           */
          public AccountUpdateParams.Individual.Verification.Document.Builder setBack(String back) {

            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Individual.Verification.Document#extraParams} for
           * the field documentation.
           */
          public AccountUpdateParams.Individual.Verification.Document.Builder putExtraParam(
              String key, Object value) {

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
          public AccountUpdateParams.Individual.Verification.Document.Builder putAllExtraParam(
              Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`.
           */
          public AccountUpdateParams.Individual.Verification.Document.Builder setFront(
              String front) {

            this.front = front;
            return this;
          }
        }
      }
    }
  }

  public static class Settings {

    /**
     * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
     * other products.
     */
    @SerializedName("branding")
    AccountUpdateParams.Settings.Branding branding;

    /** Settings specific to card charging on the account. */
    @SerializedName("card_payments")
    AccountUpdateParams.Settings.CardPayments cardPayments;

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
    AccountUpdateParams.Settings.Payments payments;

    /** Settings specific to the account's payouts. */
    @SerializedName("payouts")
    AccountUpdateParams.Settings.Payouts payouts;

    private Settings(
        AccountUpdateParams.Settings.Branding branding,
        AccountUpdateParams.Settings.CardPayments cardPayments,
        Map<String, Object> extraParams,
        AccountUpdateParams.Settings.Payments payments,
        AccountUpdateParams.Settings.Payouts payouts) {

      this.branding = branding;
      this.cardPayments = cardPayments;
      this.extraParams = extraParams;
      this.payments = payments;
      this.payouts = payouts;
    }

    public static AccountUpdateParams.Settings.Builder builder() {
      return new AccountUpdateParams.Settings.Builder();
    }

    public static class Builder {
      private AccountUpdateParams.Settings.Branding branding;
      private AccountUpdateParams.Settings.CardPayments cardPayments;
      private Map<String, Object> extraParams;
      private AccountUpdateParams.Settings.Payments payments;
      private AccountUpdateParams.Settings.Payouts payouts;

      public AccountUpdateParams.Settings build() {
        return new AccountUpdateParams.Settings(
            this.branding, this.cardPayments, this.extraParams, this.payments, this.payouts);
      }

      /**
       * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      public AccountUpdateParams.Settings.Builder setBranding(
          AccountUpdateParams.Settings.Branding branding) {

        this.branding = branding;
        return this;
      }

      /** Settings specific to card charging on the account. */
      public AccountUpdateParams.Settings.Builder setCardPayments(
          AccountUpdateParams.Settings.CardPayments cardPayments) {

        this.cardPayments = cardPayments;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Settings#extraParams} for the field documentation.
       */
      public AccountUpdateParams.Settings.Builder putExtraParam(String key, Object value) {

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
      public AccountUpdateParams.Settings.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings that apply across payment methods for charging on the account. */
      public AccountUpdateParams.Settings.Builder setPayments(
          AccountUpdateParams.Settings.Payments payments) {

        this.payments = payments;
        return this;
      }

      /** Settings specific to the account's payouts. */
      public AccountUpdateParams.Settings.Builder setPayouts(
          AccountUpdateParams.Settings.Payouts payouts) {

        this.payouts = payouts;
        return this;
      }
    }

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
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the
       * account. Must be square and at least 128px x 128px.
       */
      @SerializedName("icon")
      String icon;

      /**
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account
       * that will be used in Checkout instead of the icon and without the account's name next to it
       * if provided. Must be at least 128px x 128px.
       */
      @SerializedName("logo")
      String logo;

      /** A CSS hex color value representing the primary branding color for this account. */
      @SerializedName("primary_color")
      String primaryColor;

      private Branding(
          Map<String, Object> extraParams, String icon, String logo, String primaryColor) {

        this.extraParams = extraParams;
        this.icon = icon;
        this.logo = logo;
        this.primaryColor = primaryColor;
      }

      public static AccountUpdateParams.Settings.Branding.Builder builder() {

        return new AccountUpdateParams.Settings.Branding.Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;
        private String icon;
        private String logo;
        private String primaryColor;

        public AccountUpdateParams.Settings.Branding build() {
          return new AccountUpdateParams.Settings.Branding(
              this.extraParams, this.icon, this.logo, this.primaryColor);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Branding#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Settings.Branding.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Settings.Branding.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the
         * account. Must be square and at least 128px x 128px.
         */
        public AccountUpdateParams.Settings.Branding.Builder setIcon(String icon) {

          this.icon = icon;
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the
         * account that will be used in Checkout instead of the icon and without the account's name
         * next to it if provided. Must be at least 128px x 128px.
         */
        public AccountUpdateParams.Settings.Branding.Builder setLogo(String logo) {

          this.logo = logo;
          return this;
        }

        /** A CSS hex color value representing the primary branding color for this account. */
        public AccountUpdateParams.Settings.Branding.Builder setPrimaryColor(String primaryColor) {

          this.primaryColor = primaryColor;
          return this;
        }
      }
    }

    public static class CardPayments {

      /**
       * Automatically declines certain charge types regardless of whether the card issuer accepted
       * or declined the charge.
       */
      @SerializedName("decline_on")
      AccountUpdateParams.Settings.CardPayments.DeclineOn declineOn;

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
       * prefixes any dynamic `statement_descriptor` specified on the charge.
       * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
       * portion.
       */
      @SerializedName("statement_descriptor_prefix")
      String statementDescriptorPrefix;

      private CardPayments(
          AccountUpdateParams.Settings.CardPayments.DeclineOn declineOn,
          Map<String, Object> extraParams,
          String statementDescriptorPrefix) {

        this.declineOn = declineOn;
        this.extraParams = extraParams;
        this.statementDescriptorPrefix = statementDescriptorPrefix;
      }

      public static AccountUpdateParams.Settings.CardPayments.Builder builder() {

        return new AccountUpdateParams.Settings.CardPayments.Builder();
      }

      public static class Builder {
        private AccountUpdateParams.Settings.CardPayments.DeclineOn declineOn;
        private Map<String, Object> extraParams;
        private String statementDescriptorPrefix;

        public AccountUpdateParams.Settings.CardPayments build() {
          return new AccountUpdateParams.Settings.CardPayments(
              this.declineOn, this.extraParams, this.statementDescriptorPrefix);
        }

        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        public AccountUpdateParams.Settings.CardPayments.Builder setDeclineOn(
            AccountUpdateParams.Settings.CardPayments.DeclineOn declineOn) {

          this.declineOn = declineOn;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.CardPayments#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Settings.CardPayments.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Settings.CardPayments.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
         * portion.
         */
        public AccountUpdateParams.Settings.CardPayments.Builder setStatementDescriptorPrefix(
            String statementDescriptorPrefix) {

          this.statementDescriptorPrefix = statementDescriptorPrefix;
          return this;
        }
      }

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

        public static AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder builder() {

          return new AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder();
        }

        public static class Builder {
          private Boolean avsFailure;
          private Boolean cvcFailure;
          private Map<String, Object> extraParams;

          public AccountUpdateParams.Settings.CardPayments.DeclineOn build() {

            return new AccountUpdateParams.Settings.CardPayments.DeclineOn(
                this.avsFailure, this.cvcFailure, this.extraParams);
          }

          /**
           * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
           * This setting only applies when a ZIP or postal code is provided and they fail bank
           * verification.
           */
          public AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder setAvsFailure(
              Boolean avsFailure) {

            this.avsFailure = avsFailure;
            return this;
          }

          /**
           * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
           * applies when a CVC is provided and it fails bank verification.
           */
          public AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder setCvcFailure(
              Boolean cvcFailure) {

            this.cvcFailure = cvcFailure;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Settings.CardPayments.DeclineOn#extraParams} for
           * the field documentation.
           */
          public AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder putExtraParam(
              String key, Object value) {

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
          public AccountUpdateParams.Settings.CardPayments.DeclineOn.Builder putAllExtraParam(
              Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }
      }
    }

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

      public static AccountUpdateParams.Settings.Payments.Builder builder() {

        return new AccountUpdateParams.Settings.Payments.Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;
        private String statementDescriptor;
        private String statementDescriptorKana;
        private String statementDescriptorKanji;

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
        public AccountUpdateParams.Settings.Payments.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Settings.Payments.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         */
        public AccountUpdateParams.Settings.Payments.Builder setStatementDescriptor(
            String statementDescriptor) {

          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * The Kana variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
         */
        public AccountUpdateParams.Settings.Payments.Builder setStatementDescriptorKana(
            String statementDescriptorKana) {

          this.statementDescriptorKana = statementDescriptorKana;
          return this;
        }

        /**
         * The Kanji variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
         */
        public AccountUpdateParams.Settings.Payments.Builder setStatementDescriptorKanji(
            String statementDescriptorKanji) {

          this.statementDescriptorKanji = statementDescriptorKanji;
          return this;
        }
      }
    }

    public static class Payouts {

      /**
       * A Boolean indicating whether Stripe should try to reclaim negative balances from an
       * attached bank account. For details, see [Understanding Connect Account
       * Balances](https://stripe.com/docs/connect/account-balances).
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
       * account. For details, see our [Setting Bank and Debit Card
       * Payouts](https://stripe.com/docs/connect/bank-transfers#payout-information) documentation.
       */
      @SerializedName("schedule")
      AccountUpdateParams.Settings.Payouts.Schedule schedule;

      /**
       * The text that appears on the bank account statement for payouts. If not set, this defaults
       * to the platform's bank descriptor as set in the Dashboard.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      private Payouts(
          Boolean debitNegativeBalances,
          Map<String, Object> extraParams,
          AccountUpdateParams.Settings.Payouts.Schedule schedule,
          String statementDescriptor) {

        this.debitNegativeBalances = debitNegativeBalances;
        this.extraParams = extraParams;
        this.schedule = schedule;
        this.statementDescriptor = statementDescriptor;
      }

      public static AccountUpdateParams.Settings.Payouts.Builder builder() {

        return new AccountUpdateParams.Settings.Payouts.Builder();
      }

      public static class Builder {
        private Boolean debitNegativeBalances;
        private Map<String, Object> extraParams;
        private AccountUpdateParams.Settings.Payouts.Schedule schedule;
        private String statementDescriptor;

        public AccountUpdateParams.Settings.Payouts build() {
          return new AccountUpdateParams.Settings.Payouts(
              this.debitNegativeBalances,
              this.extraParams,
              this.schedule,
              this.statementDescriptor);
        }

        /**
         * A Boolean indicating whether Stripe should try to reclaim negative balances from an
         * attached bank account. For details, see [Understanding Connect Account
         * Balances](https://stripe.com/docs/connect/account-balances).
         */
        public AccountUpdateParams.Settings.Payouts.Builder setDebitNegativeBalances(
            Boolean debitNegativeBalances) {

          this.debitNegativeBalances = debitNegativeBalances;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Settings.Payouts#extraParams} for the field
         * documentation.
         */
        public AccountUpdateParams.Settings.Payouts.Builder putExtraParam(
            String key, Object value) {

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
        public AccountUpdateParams.Settings.Payouts.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Details on when funds from charges are available, and when they are paid out to an
         * external account. For details, see our [Setting Bank and Debit Card
         * Payouts](https://stripe.com/docs/connect/bank-transfers#payout-information)
         * documentation.
         */
        public AccountUpdateParams.Settings.Payouts.Builder setSchedule(
            AccountUpdateParams.Settings.Payouts.Schedule schedule) {

          this.schedule = schedule;
          return this;
        }

        /**
         * The text that appears on the bank account statement for payouts. If not set, this
         * defaults to the platform's bank descriptor as set in the Dashboard.
         */
        public AccountUpdateParams.Settings.Payouts.Builder setStatementDescriptor(
            String statementDescriptor) {

          this.statementDescriptor = statementDescriptor;
          return this;
        }
      }

      public static class Schedule {

        /**
         * The number of days charge funds are held before being paid out. May also be set to
         * `minimum`, representing the lowest available value for the account country. Default is
         * `minimum`. The `delay_days` parameter does not apply when the `interval` is `manual`.
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
         * How frequently available funds are paid out. One of: `daily`, `manual`, `weekly`, or
         * `monthly`. Default is `daily`.
         */
        @SerializedName("interval")
        AccountUpdateParams.Settings.Payouts.Schedule.Interval interval;

        /**
         * The day of the month when available funds are paid out. Required and applicable only if
         * `interval` is `monthly`.
         */
        @SerializedName("monthly_anchor")
        Long monthlyAnchor;

        /**
         * The day of the week when available funds are paid out, specified as `monday`, `tuesday`,
         * etc. (required and applicable only if `interval` is `weekly`.)
         */
        @SerializedName("weekly_anchor")
        AccountUpdateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor;

        private Schedule(
            Object delayDays,
            Map<String, Object> extraParams,
            AccountUpdateParams.Settings.Payouts.Schedule.Interval interval,
            Long monthlyAnchor,
            AccountUpdateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor) {

          this.delayDays = delayDays;
          this.extraParams = extraParams;
          this.interval = interval;
          this.monthlyAnchor = monthlyAnchor;
          this.weeklyAnchor = weeklyAnchor;
        }

        public static AccountUpdateParams.Settings.Payouts.Schedule.Builder builder() {

          return new AccountUpdateParams.Settings.Payouts.Schedule.Builder();
        }

        public static class Builder {
          private Object delayDays;
          private Map<String, Object> extraParams;
          private AccountUpdateParams.Settings.Payouts.Schedule.Interval interval;
          private Long monthlyAnchor;
          private AccountUpdateParams.Settings.Payouts.Schedule.WeeklyAnchor weeklyAnchor;

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
           * `minimum`, representing the lowest available value for the account country. Default is
           * `minimum`. The `delay_days` parameter does not apply when the `interval` is `manual`.
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder setDelayDays(
              AccountUpdateParams.Settings.Payouts.Schedule.DelayDays delayDays) {

            this.delayDays = delayDays;
            return this;
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * `minimum`, representing the lowest available value for the account country. Default is
           * `minimum`. The `delay_days` parameter does not apply when the `interval` is `manual`.
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder setDelayDays(
              Long delayDays) {

            this.delayDays = delayDays;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Settings.Payouts.Schedule#extraParams} for the
           * field documentation.
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder putExtraParam(
              String key, Object value) {

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
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder putAllExtraParam(
              Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * How frequently available funds are paid out. One of: `daily`, `manual`, `weekly`, or
           * `monthly`. Default is `daily`.
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder setInterval(
              AccountUpdateParams.Settings.Payouts.Schedule.Interval interval) {

            this.interval = interval;
            return this;
          }

          /**
           * The day of the month when available funds are paid out. Required and applicable only if
           * `interval` is `monthly`.
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder setMonthlyAnchor(
              Long monthlyAnchor) {

            this.monthlyAnchor = monthlyAnchor;
            return this;
          }

          /**
           * The day of the week when available funds are paid out, specified as `monday`,
           * `tuesday`, etc. (required and applicable only if `interval` is `weekly`.)
           */
          public AccountUpdateParams.Settings.Payouts.Schedule.Builder setWeeklyAnchor(
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

          private DelayDays(String value) {
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

          private Interval(String value) {
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

          private WeeklyAnchor(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  public static class TosAcceptance {

    /**
     * The Unix timestamp marking when the account representative accepted the Stripe Services
     * Agreement.
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

    /**
     * The IP address from which the account representative accepted the Stripe Services Agreement.
     */
    @SerializedName("ip")
    String ip;

    /**
     * The user agent of the browser from which the account representative accepted the Stripe
     * Services Agreement.
     */
    @SerializedName("user_agent")
    String userAgent;

    private TosAcceptance(Long date, Map<String, Object> extraParams, String ip, String userAgent) {

      this.date = date;
      this.extraParams = extraParams;
      this.ip = ip;
      this.userAgent = userAgent;
    }

    public static AccountUpdateParams.TosAcceptance.Builder builder() {
      return new AccountUpdateParams.TosAcceptance.Builder();
    }

    public static class Builder {
      private Long date;
      private Map<String, Object> extraParams;
      private String ip;
      private String userAgent;

      public AccountUpdateParams.TosAcceptance build() {
        return new AccountUpdateParams.TosAcceptance(
            this.date, this.extraParams, this.ip, this.userAgent);
      }

      /**
       * The Unix timestamp marking when the account representative accepted the Stripe Services
       * Agreement.
       */
      public AccountUpdateParams.TosAcceptance.Builder setDate(Long date) {

        this.date = date;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.TosAcceptance#extraParams} for the field documentation.
       */
      public AccountUpdateParams.TosAcceptance.Builder putExtraParam(String key, Object value) {

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
      public AccountUpdateParams.TosAcceptance.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The IP address from which the account representative accepted the Stripe Services
       * Agreement.
       */
      public AccountUpdateParams.TosAcceptance.Builder setIp(String ip) {
        this.ip = ip;
        return this;
      }

      /**
       * The user agent of the browser from which the account representative accepted the Stripe
       * Services Agreement.
       */
      public AccountUpdateParams.TosAcceptance.Builder setUserAgent(String userAgent) {

        this.userAgent = userAgent;
        return this;
      }
    }
  }

  public enum RequestedCapability implements ApiRequestParams.EnumParam {
    @SerializedName("card_issuing")
    CARD_ISSUING("card_issuing"),
    @SerializedName("card_payments")
    CARD_PAYMENTS("card_payments"),
    @SerializedName("legacy_payments")
    LEGACY_PAYMENTS("legacy_payments"),
    @SerializedName("platform_payments")
    PLATFORM_PAYMENTS("platform_payments");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private RequestedCapability(String value) {
      this.value = value;
    }
  }
}
