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
public class AccountUpdateParams extends ApiRequestParams {
  /**
   * An [account token](https://stripe.com/docs/api#create_account_token), used to securely provide
   * details to the account.
   */
  @SerializedName("account_token")
  Object accountToken;

  /** Non-essential business information about the account. */
  @SerializedName("business_profile")
  BusinessProfile businessProfile;

  /** The business type. Can be `individual` or `company`. */
  @SerializedName("business_type")
  Object businessType;

  /**
   * Information about the company or business. This field is null unless `business_type` is set to
   * `company`.
   */
  @SerializedName("company")
  Company company;

  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be
   * a currency that [Stripe supports in the account's country](https://stripe.com/docs/payouts).
   */
  @SerializedName("default_currency")
  Object defaultCurrency;

  /**
   * Email address of the account representative. For Standard accounts, this is used to ask them to
   * claim their Stripe account. For Custom accounts, this only makes the account easier to identify
   * to platforms; Stripe does not email the account representative.
   */
  @SerializedName("email")
  Object email;

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
   * Information about the person represented by the account. This field is null unless
   * `business_type` is set to `individual`.
   */
  @SerializedName("individual")
  Individual individual;

  /**
   * A set of key-value pairs that you can attach to an `Account` object. This can be useful for
   * storing additional information about the account in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The set of capabilities you want to unlock for this account. Each capability will be inactive
   * until you have provided its specific requirements and Stripe has verified them. An account may
   * have some of its requested capabilities be active and some be inactive.
   */
  @SerializedName("requested_capabilities")
  List<RequestedCapability> requestedCapabilities;

  /** Options for customizing how the account functions within Stripe. */
  @SerializedName("settings")
  Settings settings;

  /**
   * Details on the account's acceptance of the [Stripe Services
   * Agreement](https://stripe.com/docs/connect/updating-accounts#tos-acceptance).
   */
  @SerializedName("tos_acceptance")
  TosAcceptance tosAcceptance;

  private AccountUpdateParams(
      Object accountToken,
      BusinessProfile businessProfile,
      Object businessType,
      Company company,
      Object defaultCurrency,
      Object email,
      List<String> expand,
      Object externalAccount,
      Map<String, Object> extraParams,
      Individual individual,
      Map<String, String> metadata,
      List<RequestedCapability> requestedCapabilities,
      Settings settings,
      TosAcceptance tosAcceptance) {
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

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountToken;

    private BusinessProfile businessProfile;

    private Object businessType;

    private Company company;

    private Object defaultCurrency;

    private Object email;

    private List<String> expand;

    private Object externalAccount;

    private Map<String, Object> extraParams;

    private Individual individual;

    private Map<String, String> metadata;

    private List<RequestedCapability> requestedCapabilities;

    private Settings settings;

    private TosAcceptance tosAcceptance;

    /** Finalize and obtain parameter instance from this builder. */
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
    public Builder setAccountToken(String accountToken) {
      this.accountToken = accountToken;
      return this;
    }

    /**
     * An [account token](https://stripe.com/docs/api#create_account_token), used to securely
     * provide details to the account.
     */
    public Builder setAccountToken(EmptyParam accountToken) {
      this.accountToken = accountToken;
      return this;
    }

    /** Non-essential business information about the account. */
    public Builder setBusinessProfile(BusinessProfile businessProfile) {
      this.businessProfile = businessProfile;
      return this;
    }

    /** The business type. Can be `individual` or `company`. */
    public Builder setBusinessType(String businessType) {
      this.businessType = businessType;
      return this;
    }

    /** The business type. Can be `individual` or `company`. */
    public Builder setBusinessType(EmptyParam businessType) {
      this.businessType = businessType;
      return this;
    }

    /**
     * Information about the company or business. This field is null unless `business_type` is set
     * to `company`.
     */
    public Builder setCompany(Company company) {
      this.company = company;
      return this;
    }

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must
     * be a currency that [Stripe supports in the account's
     * country](https://stripe.com/docs/payouts).
     */
    public Builder setDefaultCurrency(String defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must
     * be a currency that [Stripe supports in the account's
     * country](https://stripe.com/docs/payouts).
     */
    public Builder setDefaultCurrency(EmptyParam defaultCurrency) {
      this.defaultCurrency = defaultCurrency;
      return this;
    }

    /**
     * Email address of the account representative. For Standard accounts, this is used to ask them
     * to claim their Stripe account. For Custom accounts, this only makes the account easier to
     * identify to platforms; Stripe does not email the account representative.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Email address of the account representative. For Standard accounts, this is used to ask them
     * to claim their Stripe account. For Custom accounts, this only makes the account easier to
     * identify to platforms; Stripe does not email the account representative.
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
    public Builder setExternalAccount(String externalAccount) {
      this.externalAccount = externalAccount;
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
     * Information about the person represented by the account. This field is null unless
     * `business_type` is set to `individual`.
     */
    public Builder setIndividual(Individual individual) {
      this.individual = individual;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
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
    public Builder putAllMetadata(Map<String, String> map) {
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
    public Builder addRequestedCapability(RequestedCapability element) {
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
    public Builder addAllRequestedCapability(List<RequestedCapability> elements) {
      if (this.requestedCapabilities == null) {
        this.requestedCapabilities = new ArrayList<>();
      }
      this.requestedCapabilities.addAll(elements);
      return this;
    }

    /** Options for customizing how the account functions within Stripe. */
    public Builder setSettings(Settings settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Details on the account's acceptance of the [Stripe Services
     * Agreement](https://stripe.com/docs/connect/updating-accounts#tos-acceptance).
     */
    public Builder setTosAcceptance(TosAcceptance tosAcceptance) {
      this.tosAcceptance = tosAcceptance;
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
     * The merchant category code for the account. MCCs are used to classify businesses based on the
     * goods or services they provide.
     */
    @SerializedName("mcc")
    Object mcc;

    /** The customer-facing business name. */
    @SerializedName("name")
    Object name;

    /**
     * Internal-only description of the product sold by, or service provided by, the business. Used
     * by Stripe for risk and underwriting purposes.
     */
    @SerializedName("product_description")
    Object productDescription;

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
        Map<String, Object> extraParams,
        Object mcc,
        Object name,
        Object productDescription,
        Object supportEmail,
        Object supportPhone,
        Object supportUrl,
        Object url) {
      this.extraParams = extraParams;
      this.mcc = mcc;
      this.name = name;
      this.productDescription = productDescription;
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

      private Object mcc;

      private Object name;

      private Object productDescription;

      private Object supportEmail;

      private Object supportPhone;

      private Object supportUrl;

      private Object url;

      /** Finalize and obtain parameter instance from this builder. */
      public BusinessProfile build() {
        return new BusinessProfile(
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
       * The merchant category code for the account. MCCs are used to classify businesses based on
       * the goods or services they provide.
       */
      public Builder setMcc(String mcc) {
        this.mcc = mcc;
        return this;
      }

      /**
       * The merchant category code for the account. MCCs are used to classify businesses based on
       * the goods or services they provide.
       */
      public Builder setMcc(EmptyParam mcc) {
        this.mcc = mcc;
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
     * Whether the company's directors have been provided. Set this Boolean to `true` after creating
     * all the company's directors with [the Persons API](https://stripe.com/docs/api/persons) for
     * accounts with a `relationship.director` requirement. This value is not automatically set to
     * `true` after creating directors, so it needs to be updated to indicate all directors have
     * been provided.
     */
    @SerializedName("directors_provided")
    Boolean directorsProvided;

    /**
     * Whether the company's executives have been provided. Set this Boolean to `true` after
     * creating all the company's executives with [the Persons
     * API](https://stripe.com/docs/api/persons) for accounts with a `relationship.executive`
     * requirement.
     */
    @SerializedName("executives_provided")
    Boolean executivesProvided;

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
     * Whether the company's owners have been provided. Set this Boolean to `true` after creating
     * all the company's owners with [the Persons API](https://stripe.com/docs/api/persons) for
     * accounts with a `relationship.owner` requirement.
     */
    @SerializedName("owners_provided")
    Boolean ownersProvided;

    /** The company's phone number (used for verification). */
    @SerializedName("phone")
    Object phone;

    /**
     * The business ID number of the company, as appropriate for the company’s country. (Examples
     * are an Employer ID Number in the U.S., a Business Number in Canada, or a Company Number in
     * the UK.)
     */
    @SerializedName("tax_id")
    Object taxId;

    /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
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
        Map<String, Object> extraParams,
        Object name,
        Object nameKana,
        Object nameKanji,
        Boolean ownersProvided,
        Object phone,
        Object taxId,
        Object taxIdRegistrar,
        Object vatId,
        Verification verification) {
      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.directorsProvided = directorsProvided;
      this.executivesProvided = executivesProvided;
      this.extraParams = extraParams;
      this.name = name;
      this.nameKana = nameKana;
      this.nameKanji = nameKanji;
      this.ownersProvided = ownersProvided;
      this.phone = phone;
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

      private Map<String, Object> extraParams;

      private Object name;

      private Object nameKana;

      private Object nameKanji;

      private Boolean ownersProvided;

      private Object phone;

      private Object taxId;

      private Object taxIdRegistrar;

      private Object vatId;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public Company build() {
        return new Company(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.directorsProvided,
            this.executivesProvided,
            this.extraParams,
            this.name,
            this.nameKana,
            this.nameKanji,
            this.ownersProvided,
            this.phone,
            this.taxId,
            this.taxIdRegistrar,
            this.vatId,
            this.verification);
      }

      /** The company's primary address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the company's primary address (Japan only). */
      public Builder setAddressKana(AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the company's primary address (Japan only). */
      public Builder setAddressKanji(AddressKanji addressKanji) {
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
      public Builder setDirectorsProvided(Boolean directorsProvided) {
        this.directorsProvided = directorsProvided;
        return this;
      }

      /**
       * Whether the company's executives have been provided. Set this Boolean to `true` after
       * creating all the company's executives with [the Persons
       * API](https://stripe.com/docs/api/persons) for accounts with a `relationship.executive`
       * requirement.
       */
      public Builder setExecutivesProvided(Boolean executivesProvided) {
        this.executivesProvided = executivesProvided;
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
       * Whether the company's owners have been provided. Set this Boolean to `true` after creating
       * all the company's owners with [the Persons API](https://stripe.com/docs/api/persons) for
       * accounts with a `relationship.owner` requirement.
       */
      public Builder setOwnersProvided(Boolean ownersProvided) {
        this.ownersProvided = ownersProvided;
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

      /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
      public Builder setTaxIdRegistrar(String taxIdRegistrar) {
        this.taxIdRegistrar = taxIdRegistrar;
        return this;
      }

      /** The jurisdiction in which the `tax_id` is registered (Germany-based companies only). */
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
      public Builder setVerification(Verification verification) {
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public Address build() {
          return new Address(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public AddressKana build() {
          return new AddressKana(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public AddressKanji build() {
          return new AddressKanji(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public Verification build() {
          return new Verification(this.document, this.extraParams);
        }

        /** A document verifying the business. */
        public Builder setDocument(Document document) {
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
         * The back of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `additional_verification`. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * The front of a document returned by a [file upload](#create_file) with a `purpose` value
         * of `additional_verification`. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
          public Document build() {
            return new Document(this.back, this.extraParams, this.front);
          }

          /**
           * The back of a document returned by a [file upload](#create_file) with a `purpose` value
           * of `additional_verification`. The uploaded file needs to be a color image (smaller than
           * 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * The back of a document returned by a [file upload](#create_file) with a `purpose` value
           * of `additional_verification`. The uploaded file needs to be a color image (smaller than
           * 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The front of a document returned by a [file upload](#create_file) with a `purpose`
           * value of `additional_verification`. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }

          /**
           * The front of a document returned by a [file upload](#create_file) with a `purpose`
           * value of `additional_verification`. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setFront(EmptyParam front) {
            this.front = front;
            return this;
          }
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

    /** The Kana variation of the the individual's first name (Japan only). */
    @SerializedName("first_name_kana")
    Object firstNameKana;

    /** The Kanji variation of the individual's first name (Japan only). */
    @SerializedName("first_name_kanji")
    Object firstNameKanji;

    /** The individual's gender (International regulations require either "male" or "female"). */
    @SerializedName("gender")
    Object gender;

    /**
     * The government-issued ID number of the individual, as appropriate for the representative’s
     * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number in
     * Canada). Instead of the number itself, you can also provide a [PII token created with
     * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
     */
    @SerializedName("id_number")
    Object idNumber;

    /** The individual's last name. */
    @SerializedName("last_name")
    Object lastName;

    /** The Kana varation of the individual's last name (Japan only). */
    @SerializedName("last_name_kana")
    Object lastNameKana;

    /** The Kanji varation of the individual's last name (Japan only). */
    @SerializedName("last_name_kanji")
    Object lastNameKanji;

    /** The individual's maiden name. */
    @SerializedName("maiden_name")
    Object maidenName;

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
    Object phone;

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
        Object gender,
        Object idNumber,
        Object lastName,
        Object lastNameKana,
        Object lastNameKanji,
        Object maidenName,
        Map<String, String> metadata,
        Object phone,
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

      private Object gender;

      private Object idNumber;

      private Object lastName;

      private Object lastNameKana;

      private Object lastNameKanji;

      private Object maidenName;

      private Map<String, String> metadata;

      private Object phone;

      private Object ssnLast4;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public Individual build() {
        return new Individual(
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
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the the individual's primary address (Japan only). */
      public Builder setAddressKana(AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the the individual's primary address (Japan only). */
      public Builder setAddressKanji(AddressKanji addressKanji) {
        this.addressKanji = addressKanji;
        return this;
      }

      /** The individual's date of birth. */
      public Builder setDob(Dob dob) {
        this.dob = dob;
        return this;
      }

      /** The individual's date of birth. */
      public Builder setDob(EmptyParam dob) {
        this.dob = dob;
        return this;
      }

      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

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

      /** The Kana variation of the the individual's first name (Japan only). */
      public Builder setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kana variation of the the individual's first name (Japan only). */
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

      /** The individual's gender (International regulations require either "male" or "female"). */
      public Builder setGender(String gender) {
        this.gender = gender;
        return this;
      }

      /** The individual's gender (International regulations require either "male" or "female"). */
      public Builder setGender(EmptyParam gender) {
        this.gender = gender;
        return this;
      }

      /**
       * The government-issued ID number of the individual, as appropriate for the representative’s
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a [PII token created with
       * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
       */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }

      /**
       * The government-issued ID number of the individual, as appropriate for the representative’s
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a [PII token created with
       * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
       */
      public Builder setIdNumber(EmptyParam idNumber) {
        this.idNumber = idNumber;
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

      /** The Kana varation of the individual's last name (Japan only). */
      public Builder setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kana varation of the individual's last name (Japan only). */
      public Builder setLastNameKana(EmptyParam lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kanji varation of the individual's last name (Japan only). */
      public Builder setLastNameKanji(String lastNameKanji) {
        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The Kanji varation of the individual's last name (Japan only). */
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
      public Builder putMetadata(String key, String value) {
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
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
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
      public Builder setVerification(Verification verification) {
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public Address build() {
          return new Address(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public AddressKana build() {
          return new AddressKana(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
        public AddressKanji build() {
          return new AddressKanji(
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long day;

        private Map<String, Object> extraParams;

        private Long month;

        private Long year;

        /** Finalize and obtain parameter instance from this builder. */
        public Dob build() {
          return new Dob(this.day, this.extraParams, this.month, this.year);
        }

        /** The day of birth, between 1 and 31. */
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

        /** The month of birth, between 1 and 12. */
        public Builder setMonth(Long month) {
          this.month = month;
          return this;
        }

        /** The four-digit year of birth. */
        public Builder setYear(Long year) {
          this.year = year;
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
        public Verification build() {
          return new Verification(this.additionalDocument, this.document, this.extraParams);
        }

        /**
         * A document showing address, either a passport, local ID card, or utility bill from a
         * well-known utility company.
         */
        public Builder setAdditionalDocument(AdditionalDocument additionalDocument) {
          this.additionalDocument = additionalDocument;
          return this;
        }

        /** An identifying document, either a passport or local ID card. */
        public Builder setDocument(Document document) {
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
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
          public AdditionalDocument build() {
            return new AdditionalDocument(this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }

          /**
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
          public Document build() {
            return new Document(this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }

          /**
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
           */
          public Builder setFront(EmptyParam front) {
            this.front = front;
            return this;
          }
        }
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

    private Settings(
        Branding branding,
        CardPayments cardPayments,
        Map<String, Object> extraParams,
        Payments payments,
        Payouts payouts) {
      this.branding = branding;
      this.cardPayments = cardPayments;
      this.extraParams = extraParams;
      this.payments = payments;
      this.payouts = payouts;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Branding branding;

      private CardPayments cardPayments;

      private Map<String, Object> extraParams;

      private Payments payments;

      private Payouts payouts;

      /** Finalize and obtain parameter instance from this builder. */
      public Settings build() {
        return new Settings(
            this.branding, this.cardPayments, this.extraParams, this.payments, this.payouts);
      }

      /**
       * Settings used to apply the account's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      public Builder setBranding(Branding branding) {
        this.branding = branding;
        return this;
      }

      /** Settings specific to card charging on the account. */
      public Builder setCardPayments(CardPayments cardPayments) {
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

      /** Settings that apply across payment methods for charging on the account. */
      public Builder setPayments(Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Settings specific to the account's payouts. */
      public Builder setPayouts(Payouts payouts) {
        this.payouts = payouts;
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
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the
       * account. Must be square and at least 128px x 128px.
       */
      @SerializedName("icon")
      Object icon;

      /**
       * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account
       * that will be used in Checkout instead of the icon and without the account's name next to it
       * if provided. Must be at least 128px x 128px.
       */
      @SerializedName("logo")
      Object logo;

      /** A CSS hex color value representing the primary branding color for this account. */
      @SerializedName("primary_color")
      Object primaryColor;

      private Branding(
          Map<String, Object> extraParams, Object icon, Object logo, Object primaryColor) {
        this.extraParams = extraParams;
        this.icon = icon;
        this.logo = logo;
        this.primaryColor = primaryColor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object icon;

        private Object logo;

        private Object primaryColor;

        /** Finalize and obtain parameter instance from this builder. */
        public Branding build() {
          return new Branding(this.extraParams, this.icon, this.logo, this.primaryColor);
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
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the
         * account. Must be square and at least 128px x 128px.
         */
        public Builder setIcon(String icon) {
          this.icon = icon;
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the
         * account. Must be square and at least 128px x 128px.
         */
        public Builder setIcon(EmptyParam icon) {
          this.icon = icon;
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the
         * account that will be used in Checkout instead of the icon and without the account's name
         * next to it if provided. Must be at least 128px x 128px.
         */
        public Builder setLogo(String logo) {
          this.logo = logo;
          return this;
        }

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the
         * account that will be used in Checkout instead of the icon and without the account's name
         * next to it if provided. Must be at least 128px x 128px.
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
       * prefixes any dynamic `statement_descriptor` specified on the charge.
       * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
       * portion.
       */
      @SerializedName("statement_descriptor_prefix")
      Object statementDescriptorPrefix;

      private CardPayments(
          DeclineOn declineOn, Map<String, Object> extraParams, Object statementDescriptorPrefix) {
        this.declineOn = declineOn;
        this.extraParams = extraParams;
        this.statementDescriptorPrefix = statementDescriptorPrefix;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeclineOn declineOn;

        private Map<String, Object> extraParams;

        private Object statementDescriptorPrefix;

        /** Finalize and obtain parameter instance from this builder. */
        public CardPayments build() {
          return new CardPayments(this.declineOn, this.extraParams, this.statementDescriptorPrefix);
        }

        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        public Builder setDeclineOn(DeclineOn declineOn) {
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
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
         * portion.
         */
        public Builder setStatementDescriptorPrefix(String statementDescriptorPrefix) {
          this.statementDescriptorPrefix = statementDescriptorPrefix;
          return this;
        }

        /**
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         * `statement_descriptor_prefix` is useful for maximizing descriptor space for the dynamic
         * portion.
         */
        public Builder setStatementDescriptorPrefix(EmptyParam statementDescriptorPrefix) {
          this.statementDescriptorPrefix = statementDescriptorPrefix;
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
          public DeclineOn build() {
            return new DeclineOn(this.avsFailure, this.cvcFailure, this.extraParams);
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
      Object statementDescriptor;

      /**
       * The Kana variation of the default text that appears on credit card statements when a charge
       * is made (Japan only).
       */
      @SerializedName("statement_descriptor_kana")
      Object statementDescriptorKana;

      /**
       * The Kanji variation of the default text that appears on credit card statements when a
       * charge is made (Japan only).
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
        public Payments build() {
          return new Payments(
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
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * The default text that appears on credit card statements when a charge is made. This field
         * prefixes any dynamic `statement_descriptor` specified on the charge.
         */
        public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
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
         * The Kana variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
         */
        public Builder setStatementDescriptorKana(EmptyParam statementDescriptorKana) {
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

        /**
         * The Kanji variation of the default text that appears on credit card statements when a
         * charge is made (Japan only).
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
        public Payouts build() {
          return new Payouts(
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
         * external account. For details, see our [Setting Bank and Debit Card
         * Payouts](https://stripe.com/docs/connect/bank-transfers#payout-information)
         * documentation.
         */
        public Builder setSchedule(Schedule schedule) {
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
        Interval interval;

        /**
         * The day of the month when available funds are paid out, specified as a number between
         * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead
         * sent on the last day of a shorter month. Required and applicable only if `interval` is
         * `monthly`.
         */
        @SerializedName("monthly_anchor")
        Long monthlyAnchor;

        /**
         * The day of the week when available funds are paid out, specified as `monday`, `tuesday`,
         * etc. (required and applicable only if `interval` is `weekly`.)
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
          public Schedule build() {
            return new Schedule(
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
          public Builder setDelayDays(DelayDays delayDays) {
            this.delayDays = delayDays;
            return this;
          }

          /**
           * The number of days charge funds are held before being paid out. May also be set to
           * `minimum`, representing the lowest available value for the account country. Default is
           * `minimum`. The `delay_days` parameter does not apply when the `interval` is `manual`.
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
           * How frequently available funds are paid out. One of: `daily`, `manual`, `weekly`, or
           * `monthly`. Default is `daily`.
           */
          public Builder setInterval(Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The day of the month when available funds are paid out, specified as a number between
           * 1--31. Payouts nominally scheduled between the 29th and 31st of the month are instead
           * sent on the last day of a shorter month. Required and applicable only if `interval` is
           * `monthly`.
           */
          public Builder setMonthlyAnchor(Long monthlyAnchor) {
            this.monthlyAnchor = monthlyAnchor;
            return this;
          }

          /**
           * The day of the week when available funds are paid out, specified as `monday`,
           * `tuesday`, etc. (required and applicable only if `interval` is `weekly`.)
           */
          public Builder setWeeklyAnchor(WeeklyAnchor weeklyAnchor) {
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
  }

  @Getter
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
    Object ip;

    /**
     * The user agent of the browser from which the account representative accepted the Stripe
     * Services Agreement.
     */
    @SerializedName("user_agent")
    Object userAgent;

    private TosAcceptance(Long date, Map<String, Object> extraParams, Object ip, Object userAgent) {
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
      public TosAcceptance build() {
        return new TosAcceptance(this.date, this.extraParams, this.ip, this.userAgent);
      }

      /**
       * The Unix timestamp marking when the account representative accepted the Stripe Services
       * Agreement.
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

      /**
       * The IP address from which the account representative accepted the Stripe Services
       * Agreement.
       */
      public Builder setIp(String ip) {
        this.ip = ip;
        return this;
      }

      /**
       * The IP address from which the account representative accepted the Stripe Services
       * Agreement.
       */
      public Builder setIp(EmptyParam ip) {
        this.ip = ip;
        return this;
      }

      /**
       * The user agent of the browser from which the account representative accepted the Stripe
       * Services Agreement.
       */
      public Builder setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
      }

      /**
       * The user agent of the browser from which the account representative accepted the Stripe
       * Services Agreement.
       */
      public Builder setUserAgent(EmptyParam userAgent) {
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

    @SerializedName("transfers")
    TRANSFERS("transfers");

    @Getter(onMethod_ = {@Override})
    private final String value;

    RequestedCapability(String value) {
      this.value = value;
    }
  }
}
