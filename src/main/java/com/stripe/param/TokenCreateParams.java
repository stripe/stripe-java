// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TokenCreateParams extends ApiRequestParams {
  /** Information for the account this token will represent. */
  @SerializedName("account")
  Account account;

  /** The bank account this token will represent. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  @SerializedName("card")
  Object card;

  /**
   * The customer (owned by the application's account) for which to create a token. This can be used
   * only with an <a href="https://stripe.com/docs/connect/standard-accounts">OAuth access token</a>
   * or <a href="https://stripe.com/docs/connect/authentication">Stripe-Account header</a>. For more
   * details, see <a href="https://stripe.com/docs/connect/cloning-saved-payment-methods">Cloning
   * Saved Payment Methods</a>.
   */
  @SerializedName("customer")
  String customer;

  /** The updated CVC value this token will represent. */
  @SerializedName("cvc_update")
  CvcUpdate cvcUpdate;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Information for the person this token will represent. */
  @SerializedName("person")
  Person person;

  /** The PII this token will represent. */
  @SerializedName("pii")
  Pii pii;

  private TokenCreateParams(
      Account account,
      BankAccount bankAccount,
      Object card,
      String customer,
      CvcUpdate cvcUpdate,
      List<String> expand,
      Map<String, Object> extraParams,
      Person person,
      Pii pii) {
    this.account = account;
    this.bankAccount = bankAccount;
    this.card = card;
    this.customer = customer;
    this.cvcUpdate = cvcUpdate;
    this.expand = expand;
    this.extraParams = extraParams;
    this.person = person;
    this.pii = pii;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Account account;

    private BankAccount bankAccount;

    private Object card;

    private String customer;

    private CvcUpdate cvcUpdate;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Person person;

    private Pii pii;

    /** Finalize and obtain parameter instance from this builder. */
    public TokenCreateParams build() {
      return new TokenCreateParams(
          this.account,
          this.bankAccount,
          this.card,
          this.customer,
          this.cvcUpdate,
          this.expand,
          this.extraParams,
          this.person,
          this.pii);
    }

    /** Information for the account this token will represent. */
    public Builder setAccount(Account account) {
      this.account = account;
      return this;
    }

    /** The bank account this token will represent. */
    public Builder setBankAccount(BankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    public Builder setCard(Card card) {
      this.card = card;
      return this;
    }

    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * The customer (owned by the application's account) for which to create a token. This can be
     * used only with an <a href="https://stripe.com/docs/connect/standard-accounts">OAuth access
     * token</a> or <a href="https://stripe.com/docs/connect/authentication">Stripe-Account
     * header</a>. For more details, see <a
     * href="https://stripe.com/docs/connect/cloning-saved-payment-methods">Cloning Saved Payment
     * Methods</a>.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The updated CVC value this token will represent. */
    public Builder setCvcUpdate(CvcUpdate cvcUpdate) {
      this.cvcUpdate = cvcUpdate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TokenCreateParams#expand} for the field documentation.
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
     * TokenCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * TokenCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link TokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information for the person this token will represent. */
    public Builder setPerson(Person person) {
      this.person = person;
      return this;
    }

    /** The PII this token will represent. */
    public Builder setPii(Pii pii) {
      this.pii = pii;
      return this;
    }
  }

  @Getter
  public static class Account {
    /** The business type. */
    @SerializedName("business_type")
    BusinessType businessType;

    /** Information about the company or business. */
    @SerializedName("company")
    Company company;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Information about the person represented by the account. */
    @SerializedName("individual")
    Individual individual;

    /**
     * Whether the user described by the data in the token has been shown <a
     * href="https://stripe.com/docs/connect/account-tokens#stripe-connected-account-agreement">the
     * Stripe Connected Account Agreement</a>. When creating an account token to create a new
     * Connect account, this value must be {@code true}.
     */
    @SerializedName("tos_shown_and_accepted")
    Boolean tosShownAndAccepted;

    private Account(
        BusinessType businessType,
        Company company,
        Map<String, Object> extraParams,
        Individual individual,
        Boolean tosShownAndAccepted) {
      this.businessType = businessType;
      this.company = company;
      this.extraParams = extraParams;
      this.individual = individual;
      this.tosShownAndAccepted = tosShownAndAccepted;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BusinessType businessType;

      private Company company;

      private Map<String, Object> extraParams;

      private Individual individual;

      private Boolean tosShownAndAccepted;

      /** Finalize and obtain parameter instance from this builder. */
      public Account build() {
        return new Account(
            this.businessType,
            this.company,
            this.extraParams,
            this.individual,
            this.tosShownAndAccepted);
      }

      /** The business type. */
      public Builder setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
        return this;
      }

      /** Information about the company or business. */
      public Builder setCompany(Company company) {
        this.company = company;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Account#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.Account#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Information about the person represented by the account. */
      public Builder setIndividual(Individual individual) {
        this.individual = individual;
        return this;
      }

      /**
       * Whether the user described by the data in the token has been shown <a
       * href="https://stripe.com/docs/connect/account-tokens#stripe-connected-account-agreement">the
       * Stripe Connected Account Agreement</a>. When creating an account token to create a new
       * Connect account, this value must be {@code true}.
       */
      public Builder setTosShownAndAccepted(Boolean tosShownAndAccepted) {
        this.tosShownAndAccepted = tosShownAndAccepted;
        return this;
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
       * Persons API</a> for accounts with a {@code relationship.director} requirement. This value
       * is not automatically set to {@code true} after creating directors, so it needs to be
       * updated to indicate all directors have been provided.
       */
      @SerializedName("directors_provided")
      Boolean directorsProvided;

      /**
       * Whether the company's executives have been provided. Set this Boolean to {@code true} after
       * creating all the company's executives with <a
       * href="https://stripe.com/docs/api/persons">the Persons API</a> for accounts with a {@code
       * relationship.executive} requirement.
       */
      @SerializedName("executives_provided")
      Boolean executivesProvided;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
       * This hash is used to attest that the beneficial owner information provided to Stripe is
       * both current and correct.
       */
      @SerializedName("ownership_declaration")
      OwnershipDeclaration ownershipDeclaration;

      /**
       * Whether the user described by the data in the token has been shown the Ownership
       * Declaration and indicated that it is correct.
       */
      @SerializedName("ownership_declaration_shown_and_signed")
      Boolean ownershipDeclarationShownAndSigned;

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
      EnumParam structure;

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
          Map<String, Object> extraParams,
          String name,
          String nameKana,
          String nameKanji,
          Boolean ownersProvided,
          OwnershipDeclaration ownershipDeclaration,
          Boolean ownershipDeclarationShownAndSigned,
          String phone,
          String registrationNumber,
          EnumParam structure,
          String taxId,
          String taxIdRegistrar,
          String vatId,
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
        this.ownershipDeclaration = ownershipDeclaration;
        this.ownershipDeclarationShownAndSigned = ownershipDeclarationShownAndSigned;
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

        private Map<String, Object> extraParams;

        private String name;

        private String nameKana;

        private String nameKanji;

        private Boolean ownersProvided;

        private OwnershipDeclaration ownershipDeclaration;

        private Boolean ownershipDeclarationShownAndSigned;

        private String phone;

        private String registrationNumber;

        private EnumParam structure;

        private String taxId;

        private String taxIdRegistrar;

        private String vatId;

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
              this.ownershipDeclaration,
              this.ownershipDeclarationShownAndSigned,
              this.phone,
              this.registrationNumber,
              this.structure,
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
         * Whether the company's directors have been provided. Set this Boolean to {@code true}
         * after creating all the company's directors with <a
         * href="https://stripe.com/docs/api/persons">the Persons API</a> for accounts with a {@code
         * relationship.director} requirement. This value is not automatically set to {@code true}
         * after creating directors, so it needs to be updated to indicate all directors have been
         * provided.
         */
        public Builder setDirectorsProvided(Boolean directorsProvided) {
          this.directorsProvided = directorsProvided;
          return this;
        }

        /**
         * Whether the company's executives have been provided. Set this Boolean to {@code true}
         * after creating all the company's executives with <a
         * href="https://stripe.com/docs/api/persons">the Persons API</a> for accounts with a {@code
         * relationship.executive} requirement.
         */
        public Builder setExecutivesProvided(Boolean executivesProvided) {
          this.executivesProvided = executivesProvided;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TokenCreateParams.Account.Company#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Account.Company#extraParams} for the field
         * documentation.
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
        public Builder setOwnershipDeclaration(OwnershipDeclaration ownershipDeclaration) {
          this.ownershipDeclaration = ownershipDeclaration;
          return this;
        }

        /**
         * Whether the user described by the data in the token has been shown the Ownership
         * Declaration and indicated that it is correct.
         */
        public Builder setOwnershipDeclarationShownAndSigned(
            Boolean ownershipDeclarationShownAndSigned) {
          this.ownershipDeclarationShownAndSigned = ownershipDeclarationShownAndSigned;
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
         * companies and LLP IN for partnerships in India, and the Company Registration Number in
         * Hong Kong).
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
        public Builder setStructure(Structure structure) {
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
         * The business ID number of the company, as appropriate for the company’s country.
         * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
         * Company Number in the UK.)
         */
        public Builder setTaxId(String taxId) {
          this.taxId = taxId;
          return this;
        }

        /**
         * The jurisdiction in which the {@code tax_id} is registered (Germany-based companies
         * only).
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
        public Builder setVerification(Verification verification) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Company.Address#extraParams} for the field
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
           * map. See {@link TokenCreateParams.Account.Company.Address#extraParams} for the field
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Company.AddressKana#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Company.AddressKana#extraParams} for the
           * field documentation.
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Company.AddressKanji#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Company.AddressKanji#extraParams} for the
           * field documentation.
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public OwnershipDeclaration build() {
            return new OwnershipDeclaration(this.date, this.extraParams, this.ip, this.userAgent);
          }

          /** The Unix timestamp marking when the beneficial owner attestation was made. */
          public Builder setDate(Long date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link TokenCreateParams.Account.Company.OwnershipDeclaration#extraParams} for
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
           * map. See {@link TokenCreateParams.Account.Company.OwnershipDeclaration#extraParams} for
           * the field documentation.
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Company.Verification#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Company.Verification#extraParams} for the
           * field documentation.
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public Document build() {
              return new Document(this.back, this.extraParams, this.front);
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Company.Verification.Document#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Company.Verification.Document#extraParams} for the field
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
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
       * country. (Examples are a Social Security Number in the U.S., or a Social Insurance Number
       * in Canada). Instead of the number itself, you can also provide a <a
       * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created
       * with Stripe.js</a>.
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
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Object metadata;

      /** The individual's phone number. */
      @SerializedName("phone")
      String phone;

      /**
       * Indicates if the person or any of their representatives, family members, or other closely
       * related persons, declares that they hold or have held an important public job or function,
       * in any jurisdiction.
       */
      @SerializedName("political_exposure")
      PoliticalExposure politicalExposure;

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
          String lastName,
          String lastNameKana,
          String lastNameKanji,
          String maidenName,
          Object metadata,
          String phone,
          PoliticalExposure politicalExposure,
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
        this.lastName = lastName;
        this.lastNameKana = lastNameKana;
        this.lastNameKanji = lastNameKanji;
        this.maidenName = maidenName;
        this.metadata = metadata;
        this.phone = phone;
        this.politicalExposure = politicalExposure;
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

        private String lastName;

        private String lastNameKana;

        private String lastNameKanji;

        private String maidenName;

        private Object metadata;

        private String phone;

        private PoliticalExposure politicalExposure;

        private String ssnLast4;

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
              this.fullNameAliases,
              this.gender,
              this.idNumber,
              this.lastName,
              this.lastNameKana,
              this.lastNameKanji,
              this.maidenName,
              this.metadata,
              this.phone,
              this.politicalExposure,
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

        /** The individual's email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TokenCreateParams.Account.Individual#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Account.Individual#extraParams} for the field
         * documentation.
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
         * Add an element to `fullNameAliases` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link TokenCreateParams.Account.Individual#fullNameAliases} for the field
         * documentation.
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
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link TokenCreateParams.Account.Individual#fullNameAliases} for the field
         * documentation.
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
         * The government-issued ID number of the individual, as appropriate for the
         * representative’s country. (Examples are a Social Security Number in the U.S., or a Social
         * Insurance Number in Canada). Instead of the number itself, you can also provide a <a
         * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token created
         * with Stripe.js</a>.
         */
        public Builder setIdNumber(String idNumber) {
          this.idNumber = idNumber;
          return this;
        }

        /** The individual's last name. */
        public Builder setLastName(String lastName) {
          this.lastName = lastName;
          return this;
        }

        /** The Kana varation of the individual's last name (Japan only). */
        public Builder setLastNameKana(String lastNameKana) {
          this.lastNameKana = lastNameKana;
          return this;
        }

        /** The Kanji varation of the individual's last name (Japan only). */
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
         * TokenCreateParams.Account.Individual#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TokenCreateParams.Account.Individual#metadata} for the field
         * documentation.
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
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(EmptyParam metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
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
         * related persons, declares that they hold or have held an important public job or
         * function, in any jurisdiction.
         */
        public Builder setPoliticalExposure(PoliticalExposure politicalExposure) {
          this.politicalExposure = politicalExposure;
          return this;
        }

        /** The last four digits of the individual's Social Security Number (U.S. only). */
        public Builder setSsnLast4(String ssnLast4) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Individual.Address#extraParams} for the field
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
           * map. See {@link TokenCreateParams.Account.Individual.Address#extraParams} for the field
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Individual.AddressKana#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Individual.AddressKana#extraParams} for the
           * field documentation.
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Individual.AddressKanji#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Individual.AddressKanji#extraParams} for the
           * field documentation.
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
        /** The day of birth, between 1 and 31. */
        @SerializedName("day")
        Long day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Individual.Dob#extraParams} for the field
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
           * map. See {@link TokenCreateParams.Account.Individual.Dob#extraParams} for the field
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
           * map. See {@link TokenCreateParams.Account.Individual.Verification#extraParams} for the
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
           * map. See {@link TokenCreateParams.Account.Individual.Verification#extraParams} for the
           * field documentation.
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
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          @SerializedName("back")
          String back;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
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
            public AdditionalDocument build() {
              return new AdditionalDocument(this.back, this.extraParams, this.front);
            }

            /**
             * The back of an ID returned by a <a
             * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
             * value of {@code identity_document}. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            public Builder setBack(String back) {
              this.back = back;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Individual.Verification.AdditionalDocument#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Individual.Verification.AdditionalDocument#extraParams} for
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
             * The front of an ID returned by a <a
             * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
             * value of {@code identity_document}. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
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
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
           */
          @SerializedName("back")
          String back;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
           * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF
           * format, and less than 10 MB in size.
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
            public Document build() {
              return new Document(this.back, this.extraParams, this.front);
            }

            /**
             * The back of an ID returned by a <a
             * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
             * value of {@code identity_document}. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            public Builder setBack(String back) {
              this.back = back;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Individual.Verification.Document#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * TokenCreateParams.Account.Individual.Verification.Document#extraParams} for the field
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
             * The front of an ID returned by a <a
             * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
             * value of {@code identity_document}. The uploaded file needs to be a color image
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

  @Getter
  public static class BankAccount {
    /**
     * The name of the person or business that owns the bank account.This field is required when
     * attaching the bank account to a {@code Customer} object.
     */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /**
     * The type of entity that holds the account. It can be {@code company} or {@code individual}.
     * This field is required when attaching the bank account to a {@code Customer} object.
     */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The account number for the bank account, in string form. Must be a checking account. */
    @SerializedName("account_number")
    String accountNumber;

    /**
     * The bank account type. This can only be {@code checking} or {@code savings} in most
     * countries. In Japan, this can only be {@code futsu} or {@code toza}.
     */
    @SerializedName("account_type")
    AccountType accountType;

    /** The country in which the bank account is located. */
    @SerializedName("country")
    String country;

    /**
     * The currency the bank account is in. This must be a country/currency pairing that <a
     * href="https://stripe.com/docs/payouts">Stripe supports.</a>
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The routing number, sort code, or other country-appropriateinstitution number for the bank
     * account. For US bank accounts, this is required and should bethe ACH routing number, not the
     * wire routing number. If you are providing an IBAN for{@code account_number}, this field is
     * not required.
     */
    @SerializedName("routing_number")
    String routingNumber;

    private BankAccount(
        String accountHolderName,
        AccountHolderType accountHolderType,
        String accountNumber,
        AccountType accountType,
        String country,
        String currency,
        Map<String, Object> extraParams,
        String routingNumber) {
      this.accountHolderName = accountHolderName;
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
      this.accountType = accountType;
      this.country = country;
      this.currency = currency;
      this.extraParams = extraParams;
      this.routingNumber = routingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountHolderName;

      private AccountHolderType accountHolderType;

      private String accountNumber;

      private AccountType accountType;

      private String country;

      private String currency;

      private Map<String, Object> extraParams;

      private String routingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public BankAccount build() {
        return new BankAccount(
            this.accountHolderName,
            this.accountHolderType,
            this.accountNumber,
            this.accountType,
            this.country,
            this.currency,
            this.extraParams,
            this.routingNumber);
      }

      /**
       * The name of the person or business that owns the bank account.This field is required when
       * attaching the bank account to a {@code Customer} object.
       */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /**
       * The type of entity that holds the account. It can be {@code company} or {@code individual}.
       * This field is required when attaching the bank account to a {@code Customer} object.
       */
      public Builder setAccountHolderType(AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** The account number for the bank account, in string form. Must be a checking account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /**
       * The bank account type. This can only be {@code checking} or {@code savings} in most
       * countries. In Japan, this can only be {@code futsu} or {@code toza}.
       */
      public Builder setAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
      }

      /** The country in which the bank account is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * The currency the bank account is in. This must be a country/currency pairing that <a
       * href="https://stripe.com/docs/payouts">Stripe supports.</a>
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.BankAccount#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.BankAccount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The routing number, sort code, or other country-appropriateinstitution number for the bank
       * account. For US bank accounts, this is required and should bethe ACH routing number, not
       * the wire routing number. If you are providing an IBAN for{@code account_number}, this field
       * is not required.
       */
      public Builder setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }

    public enum AccountType implements ApiRequestParams.EnumParam {
      @SerializedName("checking")
      CHECKING("checking"),

      @SerializedName("futsu")
      FUTSU("futsu"),

      @SerializedName("savings")
      SAVINGS("savings"),

      @SerializedName("toza")
      TOZA("toza");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Card {
    @SerializedName("address_city")
    String addressCity;

    @SerializedName("address_country")
    String addressCountry;

    @SerializedName("address_line1")
    String addressLine1;

    @SerializedName("address_line2")
    String addressLine2;

    @SerializedName("address_state")
    String addressState;

    @SerializedName("address_zip")
    String addressZip;

    @SerializedName("currency")
    String currency;

    @SerializedName("cvc")
    String cvc;

    @SerializedName("exp_month")
    String expMonth;

    @SerializedName("exp_year")
    String expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("name")
    String name;

    @SerializedName("number")
    String number;

    private Card(
        String addressCity,
        String addressCountry,
        String addressLine1,
        String addressLine2,
        String addressState,
        String addressZip,
        String currency,
        String cvc,
        String expMonth,
        String expYear,
        Map<String, Object> extraParams,
        String name,
        String number) {
      this.addressCity = addressCity;
      this.addressCountry = addressCountry;
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressState = addressState;
      this.addressZip = addressZip;
      this.currency = currency;
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.name = name;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String addressCity;

      private String addressCountry;

      private String addressLine1;

      private String addressLine2;

      private String addressState;

      private String addressZip;

      private String currency;

      private String cvc;

      private String expMonth;

      private String expYear;

      private Map<String, Object> extraParams;

      private String name;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public Card build() {
        return new Card(
            this.addressCity,
            this.addressCountry,
            this.addressLine1,
            this.addressLine2,
            this.addressState,
            this.addressZip,
            this.currency,
            this.cvc,
            this.expMonth,
            this.expYear,
            this.extraParams,
            this.name,
            this.number);
      }

      public Builder setAddressCity(String addressCity) {
        this.addressCity = addressCity;
        return this;
      }

      public Builder setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
        return this;
      }

      public Builder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
      }

      public Builder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
      }

      public Builder setAddressState(String addressState) {
        this.addressState = addressState;
        return this;
      }

      public Builder setAddressZip(String addressZip) {
        this.addressZip = addressZip;
        return this;
      }

      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      public Builder setExpMonth(String expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      public Builder setExpYear(String expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Card#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  @Getter
  public static class CvcUpdate {
    /** The CVC value, in string form. */
    @SerializedName("cvc")
    String cvc;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CvcUpdate(String cvc, Map<String, Object> extraParams) {
      this.cvc = cvc;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String cvc;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CvcUpdate build() {
        return new CvcUpdate(this.cvc, this.extraParams);
      }

      /** The CVC value, in string form. */
      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.CvcUpdate#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.CvcUpdate#extraParams} for the field documentation.
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
  public static class Person {
    /** The person's address. */
    @SerializedName("address")
    Address address;

    /** The Kana variation of the person's address (Japan only). */
    @SerializedName("address_kana")
    AddressKana addressKana;

    /** The Kanji variation of the person's address (Japan only). */
    @SerializedName("address_kanji")
    AddressKanji addressKanji;

    /** The person's date of birth. */
    @SerializedName("dob")
    Object dob;

    /** Documents that may be submitted to satisfy various informational requests. */
    @SerializedName("documents")
    Documents documents;

    /** The person's email address. */
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

    /** The person's first name. */
    @SerializedName("first_name")
    String firstName;

    /** The Kana variation of the person's first name (Japan only). */
    @SerializedName("first_name_kana")
    String firstNameKana;

    /** The Kanji variation of the person's first name (Japan only). */
    @SerializedName("first_name_kanji")
    String firstNameKanji;

    /** A list of alternate names or aliases that the person is known by. */
    @SerializedName("full_name_aliases")
    Object fullNameAliases;

    /**
     * The person's gender (International regulations require either &quot;male&quot; or
     * &quot;female&quot;).
     */
    @SerializedName("gender")
    String gender;

    /**
     * The person's ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself, you
     * can also provide a <a
     * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token provided by
     * Stripe.js</a>.
     */
    @SerializedName("id_number")
    String idNumber;

    /** The person's last name. */
    @SerializedName("last_name")
    String lastName;

    /** The Kana variation of the person's last name (Japan only). */
    @SerializedName("last_name_kana")
    String lastNameKana;

    /** The Kanji variation of the person's last name (Japan only). */
    @SerializedName("last_name_kanji")
    String lastNameKanji;

    /** The person's maiden name. */
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

    /**
     * The country where the person is a national. Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>), or
     * &quot;XX&quot; if unavailable.
     */
    @SerializedName("nationality")
    String nationality;

    /** The person's phone number. */
    @SerializedName("phone")
    String phone;

    /**
     * Indicates if the person or any of their representatives, family members, or other closely
     * related persons, declares that they hold or have held an important public job or function, in
     * any jurisdiction.
     */
    @SerializedName("political_exposure")
    String politicalExposure;

    /** The relationship that this person has with the account's legal entity. */
    @SerializedName("relationship")
    Relationship relationship;

    /** The last four digits of the person's Social Security number (U.S. only). */
    @SerializedName("ssn_last_4")
    String ssnLast4;

    /** The person's verification status. */
    @SerializedName("verification")
    Verification verification;

    private Person(
        Address address,
        AddressKana addressKana,
        AddressKanji addressKanji,
        Object dob,
        Documents documents,
        String email,
        Map<String, Object> extraParams,
        String firstName,
        String firstNameKana,
        String firstNameKanji,
        Object fullNameAliases,
        String gender,
        String idNumber,
        String lastName,
        String lastNameKana,
        String lastNameKanji,
        String maidenName,
        Object metadata,
        String nationality,
        String phone,
        String politicalExposure,
        Relationship relationship,
        String ssnLast4,
        Verification verification) {
      this.address = address;
      this.addressKana = addressKana;
      this.addressKanji = addressKanji;
      this.dob = dob;
      this.documents = documents;
      this.email = email;
      this.extraParams = extraParams;
      this.firstName = firstName;
      this.firstNameKana = firstNameKana;
      this.firstNameKanji = firstNameKanji;
      this.fullNameAliases = fullNameAliases;
      this.gender = gender;
      this.idNumber = idNumber;
      this.lastName = lastName;
      this.lastNameKana = lastNameKana;
      this.lastNameKanji = lastNameKanji;
      this.maidenName = maidenName;
      this.metadata = metadata;
      this.nationality = nationality;
      this.phone = phone;
      this.politicalExposure = politicalExposure;
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

      private Documents documents;

      private String email;

      private Map<String, Object> extraParams;

      private String firstName;

      private String firstNameKana;

      private String firstNameKanji;

      private Object fullNameAliases;

      private String gender;

      private String idNumber;

      private String lastName;

      private String lastNameKana;

      private String lastNameKanji;

      private String maidenName;

      private Object metadata;

      private String nationality;

      private String phone;

      private String politicalExposure;

      private Relationship relationship;

      private String ssnLast4;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public Person build() {
        return new Person(
            this.address,
            this.addressKana,
            this.addressKanji,
            this.dob,
            this.documents,
            this.email,
            this.extraParams,
            this.firstName,
            this.firstNameKana,
            this.firstNameKanji,
            this.fullNameAliases,
            this.gender,
            this.idNumber,
            this.lastName,
            this.lastNameKana,
            this.lastNameKanji,
            this.maidenName,
            this.metadata,
            this.nationality,
            this.phone,
            this.politicalExposure,
            this.relationship,
            this.ssnLast4,
            this.verification);
      }

      /** The person's address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The Kana variation of the person's address (Japan only). */
      public Builder setAddressKana(AddressKana addressKana) {
        this.addressKana = addressKana;
        return this;
      }

      /** The Kanji variation of the person's address (Japan only). */
      public Builder setAddressKanji(AddressKanji addressKanji) {
        this.addressKanji = addressKanji;
        return this;
      }

      /** The person's date of birth. */
      public Builder setDob(Dob dob) {
        this.dob = dob;
        return this;
      }

      /** The person's date of birth. */
      public Builder setDob(EmptyParam dob) {
        this.dob = dob;
        return this;
      }

      /** Documents that may be submitted to satisfy various informational requests. */
      public Builder setDocuments(Documents documents) {
        this.documents = documents;
        return this;
      }

      /** The person's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Person#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.Person#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The person's first name. */
      public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
      }

      /** The Kana variation of the person's first name (Japan only). */
      public Builder setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
        return this;
      }

      /** The Kanji variation of the person's first name (Japan only). */
      public Builder setFirstNameKanji(String firstNameKanji) {
        this.firstNameKanji = firstNameKanji;
        return this;
      }

      /**
       * Add an element to `fullNameAliases` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * TokenCreateParams.Person#fullNameAliases} for the field documentation.
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
       * {@link TokenCreateParams.Person#fullNameAliases} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllFullNameAliase(List<String> elements) {
        if (this.fullNameAliases == null || this.fullNameAliases instanceof EmptyParam) {
          this.fullNameAliases = new ArrayList<String>();
        }
        ((List<String>) this.fullNameAliases).addAll(elements);
        return this;
      }

      /** A list of alternate names or aliases that the person is known by. */
      public Builder setFullNameAliases(EmptyParam fullNameAliases) {
        this.fullNameAliases = fullNameAliases;
        return this;
      }

      /** A list of alternate names or aliases that the person is known by. */
      public Builder setFullNameAliases(List<String> fullNameAliases) {
        this.fullNameAliases = fullNameAliases;
        return this;
      }

      /**
       * The person's gender (International regulations require either &quot;male&quot; or
       * &quot;female&quot;).
       */
      public Builder setGender(String gender) {
        this.gender = gender;
        return this;
      }

      /**
       * The person's ID number, as appropriate for their country. For example, a social security
       * number in the U.S., social insurance number in Canada, etc. Instead of the number itself,
       * you can also provide a <a
       * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token provided
       * by Stripe.js</a>.
       */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }

      /** The person's last name. */
      public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
      }

      /** The Kana variation of the person's last name (Japan only). */
      public Builder setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
        return this;
      }

      /** The Kanji variation of the person's last name (Japan only). */
      public Builder setLastNameKanji(String lastNameKanji) {
        this.lastNameKanji = lastNameKanji;
        return this;
      }

      /** The person's maiden name. */
      public Builder setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Person#metadata} for the field documentation.
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
       * See {@link TokenCreateParams.Person#metadata} for the field documentation.
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

      /**
       * The country where the person is a national. Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>), or
       * &quot;XX&quot; if unavailable.
       */
      public Builder setNationality(String nationality) {
        this.nationality = nationality;
        return this;
      }

      /** The person's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * Indicates if the person or any of their representatives, family members, or other closely
       * related persons, declares that they hold or have held an important public job or function,
       * in any jurisdiction.
       */
      public Builder setPoliticalExposure(String politicalExposure) {
        this.politicalExposure = politicalExposure;
        return this;
      }

      /** The relationship that this person has with the account's legal entity. */
      public Builder setRelationship(Relationship relationship) {
        this.relationship = relationship;
        return this;
      }

      /** The last four digits of the person's Social Security number (U.S. only). */
      public Builder setSsnLast4(String ssnLast4) {
        this.ssnLast4 = ssnLast4;
        return this;
      }

      /** The person's verification status. */
      public Builder setVerification(Verification verification) {
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
         * map. See {@link TokenCreateParams.Person.Address#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.Address#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.AddressKana#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.AddressKana#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.AddressKanji#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.AddressKanji#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.Dob#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TokenCreateParams.Person.Dob#extraParams} for the field documentation.
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
    public static class Documents {
      /**
       * One or more documents that demonstrate proof that this person is authorized to represent
       * the company.
       */
      @SerializedName("company_authorization")
      CompanyAuthorization companyAuthorization;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** One or more documents showing the person's passport page with photo and personal data. */
      @SerializedName("passport")
      Passport passport;

      /**
       * One or more documents showing the person's visa required for living in the country where
       * they are residing.
       */
      @SerializedName("visa")
      Visa visa;

      private Documents(
          CompanyAuthorization companyAuthorization,
          Map<String, Object> extraParams,
          Passport passport,
          Visa visa) {
        this.companyAuthorization = companyAuthorization;
        this.extraParams = extraParams;
        this.passport = passport;
        this.visa = visa;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CompanyAuthorization companyAuthorization;

        private Map<String, Object> extraParams;

        private Passport passport;

        private Visa visa;

        /** Finalize and obtain parameter instance from this builder. */
        public Documents build() {
          return new Documents(
              this.companyAuthorization, this.extraParams, this.passport, this.visa);
        }

        /**
         * One or more documents that demonstrate proof that this person is authorized to represent
         * the company.
         */
        public Builder setCompanyAuthorization(CompanyAuthorization companyAuthorization) {
          this.companyAuthorization = companyAuthorization;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TokenCreateParams.Person.Documents#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.Documents#extraParams} for the field
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
         * One or more documents showing the person's passport page with photo and personal data.
         */
        public Builder setPassport(Passport passport) {
          this.passport = passport;
          return this;
        }

        /**
         * One or more documents showing the person's visa required for living in the country where
         * they are residing.
         */
        public Builder setVisa(Visa visa) {
          this.visa = visa;
          return this;
        }
      }

      @Getter
      public static class CompanyAuthorization {
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
         * One or more document ids returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code account_requirement}.
         */
        @SerializedName("files")
        List<String> files;

        private CompanyAuthorization(Map<String, Object> extraParams, List<String> files) {
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
          public CompanyAuthorization build() {
            return new CompanyAuthorization(this.extraParams, this.files);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link TokenCreateParams.Person.Documents.CompanyAuthorization#extraParams}
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
           * map. See {@link TokenCreateParams.Person.Documents.CompanyAuthorization#extraParams}
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
           * TokenCreateParams.Person.Documents.CompanyAuthorization#files} for the field
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
           * Add all elements to `files` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * TokenCreateParams.Person.Documents.CompanyAuthorization#files} for the field
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
      public static class Passport {
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
         * One or more document ids returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code account_requirement}.
         */
        @SerializedName("files")
        List<String> files;

        private Passport(Map<String, Object> extraParams, List<String> files) {
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
          public Passport build() {
            return new Passport(this.extraParams, this.files);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link TokenCreateParams.Person.Documents.Passport#extraParams} for the field
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
           * map. See {@link TokenCreateParams.Person.Documents.Passport#extraParams} for the field
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
           * TokenCreateParams.Person.Documents.Passport#files} for the field documentation.
           */
          public Builder addFile(String element) {
            if (this.files == null) {
              this.files = new ArrayList<>();
            }
            this.files.add(element);
            return this;
          }

          /**
           * Add all elements to `files` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * TokenCreateParams.Person.Documents.Passport#files} for the field documentation.
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
      public static class Visa {
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
         * One or more document ids returned by a <a
         * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose}
         * value of {@code account_requirement}.
         */
        @SerializedName("files")
        List<String> files;

        private Visa(Map<String, Object> extraParams, List<String> files) {
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
          public Visa build() {
            return new Visa(this.extraParams, this.files);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link TokenCreateParams.Person.Documents.Visa#extraParams} for the field
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
           * map. See {@link TokenCreateParams.Person.Documents.Visa#extraParams} for the field
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
           * TokenCreateParams.Person.Documents.Visa#files} for the field documentation.
           */
          public Builder addFile(String element) {
            if (this.files == null) {
              this.files = new ArrayList<>();
            }
            this.files.add(element);
            return this;
          }

          /**
           * Add all elements to `files` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * TokenCreateParams.Person.Documents.Visa#files} for the field documentation.
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

      /**
       * Whether the person is authorized as the primary representative of the account. This is the
       * person nominated by the business to provide information about themselves, and general
       * information about the account. There can only be one representative at any given time. At
       * the time the account is created, this person should be set to the person responsible for
       * opening the account.
       */
      @SerializedName("representative")
      Boolean representative;

      /** The person's title (e.g., CEO, Support Engineer). */
      @SerializedName("title")
      String title;

      private Relationship(
          Boolean director,
          Boolean executive,
          Map<String, Object> extraParams,
          Boolean owner,
          Object percentOwnership,
          Boolean representative,
          String title) {
        this.director = director;
        this.executive = executive;
        this.extraParams = extraParams;
        this.owner = owner;
        this.percentOwnership = percentOwnership;
        this.representative = representative;
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

        private Boolean representative;

        private String title;

        /** Finalize and obtain parameter instance from this builder. */
        public Relationship build() {
          return new Relationship(
              this.director,
              this.executive,
              this.extraParams,
              this.owner,
              this.percentOwnership,
              this.representative,
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
         * map. See {@link TokenCreateParams.Person.Relationship#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.Relationship#extraParams} for the field
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

        /**
         * Whether the person is authorized as the primary representative of the account. This is
         * the person nominated by the business to provide information about themselves, and general
         * information about the account. There can only be one representative at any given time. At
         * the time the account is created, this person should be set to the person responsible for
         * opening the account.
         */
        public Builder setRepresentative(Boolean representative) {
          this.representative = representative;
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
         * map. See {@link TokenCreateParams.Person.Verification#extraParams} for the field
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
         * map. See {@link TokenCreateParams.Person.Verification#extraParams} for the field
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
          public AdditionalDocument build() {
            return new AdditionalDocument(this.back, this.extraParams, this.front);
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
           * map. See {@link TokenCreateParams.Person.Verification.AdditionalDocument#extraParams}
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
           * map. See {@link TokenCreateParams.Person.Verification.AdditionalDocument#extraParams}
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
          public Document build() {
            return new Document(this.back, this.extraParams, this.front);
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
           * map. See {@link TokenCreateParams.Person.Verification.Document#extraParams} for the
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
           * map. See {@link TokenCreateParams.Person.Verification.Document#extraParams} for the
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
    }
  }

  @Getter
  public static class Pii {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The {@code id_number} for the PII, in string form. */
    @SerializedName("id_number")
    String idNumber;

    private Pii(Map<String, Object> extraParams, String idNumber) {
      this.extraParams = extraParams;
      this.idNumber = idNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String idNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Pii build() {
        return new Pii(this.extraParams, this.idNumber);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TokenCreateParams.Pii#extraParams} for the field documentation.
       */
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
       * See {@link TokenCreateParams.Pii#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The {@code id_number} for the PII, in string form. */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }
    }
  }
}
