// File generated from our OpenAPI spec
package com.stripe.param.v2.core.accounts;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PersonTokenCreateParams extends ApiRequestParams {
  /** Additional addresses associated with the person. */
  @SerializedName("additional_addresses")
  List<PersonTokenCreateParams.AdditionalAddress> additionalAddresses;

  /** Additional names (e.g. aliases) associated with the person. */
  @SerializedName("additional_names")
  List<PersonTokenCreateParams.AdditionalName> additionalNames;

  /** Attestations of accepted terms of service agreements. */
  @SerializedName("additional_terms_of_service")
  AdditionalTermsOfService additionalTermsOfService;

  /** The person's residential address. */
  @SerializedName("address")
  Address address;

  /** The person's date of birth. */
  @SerializedName("date_of_birth")
  DateOfBirth dateOfBirth;

  /** Documents that may be submitted to satisfy various informational requests. */
  @SerializedName("documents")
  Documents documents;

  /** Email. */
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
  @SerializedName("given_name")
  String givenName;

  /** The identification numbers (e.g., SSN) associated with the person. */
  @SerializedName("id_numbers")
  List<PersonTokenCreateParams.IdNumber> idNumbers;

  /**
   * The person's gender (International regulations require either &quot;male&quot; or
   * &quot;female&quot;).
   */
  @SerializedName("legal_gender")
  LegalGender legalGender;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** The nationalities (countries) this person is associated with. */
  @SerializedName("nationalities")
  List<String> nationalities;

  /** The phone number for this person. */
  @SerializedName("phone")
  String phone;

  /** The person's political exposure. */
  @SerializedName("political_exposure")
  PoliticalExposure politicalExposure;

  /** The relationship that this person has with the Account's business or legal entity. */
  @SerializedName("relationship")
  Relationship relationship;

  /** The script addresses (e.g., non-Latin characters) associated with the person. */
  @SerializedName("script_addresses")
  ScriptAddresses scriptAddresses;

  /** The script names (e.g. non-Latin characters) associated with the person. */
  @SerializedName("script_names")
  ScriptNames scriptNames;

  /** The person's last name. */
  @SerializedName("surname")
  String surname;

  private PersonTokenCreateParams(
      List<PersonTokenCreateParams.AdditionalAddress> additionalAddresses,
      List<PersonTokenCreateParams.AdditionalName> additionalNames,
      AdditionalTermsOfService additionalTermsOfService,
      Address address,
      DateOfBirth dateOfBirth,
      Documents documents,
      String email,
      Map<String, Object> extraParams,
      String givenName,
      List<PersonTokenCreateParams.IdNumber> idNumbers,
      LegalGender legalGender,
      Map<String, Object> metadata,
      List<String> nationalities,
      String phone,
      PoliticalExposure politicalExposure,
      Relationship relationship,
      ScriptAddresses scriptAddresses,
      ScriptNames scriptNames,
      String surname) {
    this.additionalAddresses = additionalAddresses;
    this.additionalNames = additionalNames;
    this.additionalTermsOfService = additionalTermsOfService;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.documents = documents;
    this.email = email;
    this.extraParams = extraParams;
    this.givenName = givenName;
    this.idNumbers = idNumbers;
    this.legalGender = legalGender;
    this.metadata = metadata;
    this.nationalities = nationalities;
    this.phone = phone;
    this.politicalExposure = politicalExposure;
    this.relationship = relationship;
    this.scriptAddresses = scriptAddresses;
    this.scriptNames = scriptNames;
    this.surname = surname;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<PersonTokenCreateParams.AdditionalAddress> additionalAddresses;

    private List<PersonTokenCreateParams.AdditionalName> additionalNames;

    private AdditionalTermsOfService additionalTermsOfService;

    private Address address;

    private DateOfBirth dateOfBirth;

    private Documents documents;

    private String email;

    private Map<String, Object> extraParams;

    private String givenName;

    private List<PersonTokenCreateParams.IdNumber> idNumbers;

    private LegalGender legalGender;

    private Map<String, Object> metadata;

    private List<String> nationalities;

    private String phone;

    private PoliticalExposure politicalExposure;

    private Relationship relationship;

    private ScriptAddresses scriptAddresses;

    private ScriptNames scriptNames;

    private String surname;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonTokenCreateParams build() {
      return new PersonTokenCreateParams(
          this.additionalAddresses,
          this.additionalNames,
          this.additionalTermsOfService,
          this.address,
          this.dateOfBirth,
          this.documents,
          this.email,
          this.extraParams,
          this.givenName,
          this.idNumbers,
          this.legalGender,
          this.metadata,
          this.nationalities,
          this.phone,
          this.politicalExposure,
          this.relationship,
          this.scriptAddresses,
          this.scriptNames,
          this.surname);
    }

    /**
     * Add an element to `additionalAddresses` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PersonTokenCreateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAdditionalAddress(PersonTokenCreateParams.AdditionalAddress element) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalAddresses` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PersonTokenCreateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAllAdditionalAddress(
        List<PersonTokenCreateParams.AdditionalAddress> elements) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.addAll(elements);
      return this;
    }

    /**
     * Add an element to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#additionalNames} for the field documentation.
     */
    public Builder addAdditionalName(PersonTokenCreateParams.AdditionalName element) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#additionalNames} for the field documentation.
     */
    public Builder addAllAdditionalName(List<PersonTokenCreateParams.AdditionalName> elements) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.addAll(elements);
      return this;
    }

    /** Attestations of accepted terms of service agreements. */
    public Builder setAdditionalTermsOfService(
        PersonTokenCreateParams.AdditionalTermsOfService additionalTermsOfService) {
      this.additionalTermsOfService = additionalTermsOfService;
      return this;
    }

    /** The person's residential address. */
    public Builder setAddress(PersonTokenCreateParams.Address address) {
      this.address = address;
      return this;
    }

    /** The person's date of birth. */
    public Builder setDateOfBirth(PersonTokenCreateParams.DateOfBirth dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(PersonTokenCreateParams.Documents documents) {
      this.documents = documents;
      return this;
    }

    /** Email. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonTokenCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link PersonTokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The person's first name. */
    public Builder setGivenName(String givenName) {
      this.givenName = givenName;
      return this;
    }

    /**
     * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#idNumbers} for the field documentation.
     */
    public Builder addIdNumber(PersonTokenCreateParams.IdNumber element) {
      if (this.idNumbers == null) {
        this.idNumbers = new ArrayList<>();
      }
      this.idNumbers.add(element);
      return this;
    }

    /**
     * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#idNumbers} for the field documentation.
     */
    public Builder addAllIdNumber(List<PersonTokenCreateParams.IdNumber> elements) {
      if (this.idNumbers == null) {
        this.idNumbers = new ArrayList<>();
      }
      this.idNumbers.addAll(elements);
      return this;
    }

    /**
     * The person's gender (International regulations require either &quot;male&quot; or
     * &quot;female&quot;).
     */
    public Builder setLegalGender(PersonTokenCreateParams.LegalGender legalGender) {
      this.legalGender = legalGender;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonTokenCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonTokenCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * PersonTokenCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `nationalities` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#nationalities} for the field documentation.
     */
    public Builder addNationality(String element) {
      if (this.nationalities == null) {
        this.nationalities = new ArrayList<>();
      }
      this.nationalities.add(element);
      return this;
    }

    /**
     * Add all elements to `nationalities` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonTokenCreateParams#nationalities} for the field documentation.
     */
    public Builder addAllNationality(List<String> elements) {
      if (this.nationalities == null) {
        this.nationalities = new ArrayList<>();
      }
      this.nationalities.addAll(elements);
      return this;
    }

    /** The phone number for this person. */
    public Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /** The person's political exposure. */
    public Builder setPoliticalExposure(
        PersonTokenCreateParams.PoliticalExposure politicalExposure) {
      this.politicalExposure = politicalExposure;
      return this;
    }

    /** The relationship that this person has with the Account's business or legal entity. */
    public Builder setRelationship(PersonTokenCreateParams.Relationship relationship) {
      this.relationship = relationship;
      return this;
    }

    /** The script addresses (e.g., non-Latin characters) associated with the person. */
    public Builder setScriptAddresses(PersonTokenCreateParams.ScriptAddresses scriptAddresses) {
      this.scriptAddresses = scriptAddresses;
      return this;
    }

    /** The script names (e.g. non-Latin characters) associated with the person. */
    public Builder setScriptNames(PersonTokenCreateParams.ScriptNames scriptNames) {
      this.scriptNames = scriptNames;
      return this;
    }

    /** The person's last name. */
    public Builder setSurname(String surname) {
      this.surname = surname;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalAddress {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

    /** <strong>Required.</strong> Purpose of additional address. */
    @SerializedName("purpose")
    Purpose purpose;

    /** State, county, province, or region. */
    @SerializedName("state")
    String state;

    /** Town or district. */
    @SerializedName("town")
    String town;

    private AdditionalAddress(
        String city,
        String country,
        Map<String, Object> extraParams,
        String line1,
        String line2,
        String postalCode,
        Purpose purpose,
        String state,
        String town) {
      this.city = city;
      this.country = country;
      this.extraParams = extraParams;
      this.line1 = line1;
      this.line2 = line2;
      this.postalCode = postalCode;
      this.purpose = purpose;
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

      private Purpose purpose;

      private String state;

      private String town;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.AdditionalAddress build() {
        return new PersonTokenCreateParams.AdditionalAddress(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.purpose,
            this.state,
            this.town);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.AdditionalAddress#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.AdditionalAddress#extraParams} for the field
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

      /** <strong>Required.</strong> Purpose of additional address. */
      public Builder setPurpose(PersonTokenCreateParams.AdditionalAddress.Purpose purpose) {
        this.purpose = purpose;
        return this;
      }

      /** State, county, province, or region. */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      /** Town or district. */
      public Builder setTown(String town) {
        this.town = town;
        return this;
      }
    }

    public enum Purpose implements ApiRequestParams.EnumParam {
      @SerializedName("registered")
      REGISTERED("registered");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Purpose(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalName {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The person's full name. */
    @SerializedName("full_name")
    String fullName;

    /** The person's first or given name. */
    @SerializedName("given_name")
    String givenName;

    /** <strong>Required.</strong> The purpose or type of the additional name. */
    @SerializedName("purpose")
    Purpose purpose;

    /** The person's last or family name. */
    @SerializedName("surname")
    String surname;

    private AdditionalName(
        Map<String, Object> extraParams,
        String fullName,
        String givenName,
        Purpose purpose,
        String surname) {
      this.extraParams = extraParams;
      this.fullName = fullName;
      this.givenName = givenName;
      this.purpose = purpose;
      this.surname = surname;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String fullName;

      private String givenName;

      private Purpose purpose;

      private String surname;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.AdditionalName build() {
        return new PersonTokenCreateParams.AdditionalName(
            this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.AdditionalName#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.AdditionalName#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The person's full name. */
      public Builder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
      }

      /** The person's first or given name. */
      public Builder setGivenName(String givenName) {
        this.givenName = givenName;
        return this;
      }

      /** <strong>Required.</strong> The purpose or type of the additional name. */
      public Builder setPurpose(PersonTokenCreateParams.AdditionalName.Purpose purpose) {
        this.purpose = purpose;
        return this;
      }

      /** The person's last or family name. */
      public Builder setSurname(String surname) {
        this.surname = surname;
        return this;
      }
    }

    public enum Purpose implements ApiRequestParams.EnumParam {
      @SerializedName("alias")
      ALIAS("alias"),

      @SerializedName("maiden")
      MAIDEN("maiden");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Purpose(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalTermsOfService {
    /**
     * Details on the Person's acceptance of the [Stripe Services Agreement]; IP, date, and User
     * Agent are expanded by Stripe.
     */
    @SerializedName("account")
    Account account;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AdditionalTermsOfService(Account account, Map<String, Object> extraParams) {
      this.account = account;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Account account;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.AdditionalTermsOfService build() {
        return new PersonTokenCreateParams.AdditionalTermsOfService(this.account, this.extraParams);
      }

      /**
       * Details on the Person's acceptance of the [Stripe Services Agreement]; IP, date, and User
       * Agent are expanded by Stripe.
       */
      public Builder setAccount(PersonTokenCreateParams.AdditionalTermsOfService.Account account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.AdditionalTermsOfService#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.AdditionalTermsOfService#extraParams} for the field
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
    public static class Account {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The boolean value indicating if the terms of service have been accepted. */
      @SerializedName("shown_and_accepted")
      Boolean shownAndAccepted;

      private Account(Map<String, Object> extraParams, Boolean shownAndAccepted) {
        this.extraParams = extraParams;
        this.shownAndAccepted = shownAndAccepted;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean shownAndAccepted;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.AdditionalTermsOfService.Account build() {
          return new PersonTokenCreateParams.AdditionalTermsOfService.Account(
              this.extraParams, this.shownAndAccepted);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.AdditionalTermsOfService.Account#extraParams} for
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
         * map. See {@link PersonTokenCreateParams.AdditionalTermsOfService.Account#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The boolean value indicating if the terms of service have been accepted. */
        public Builder setShownAndAccepted(Boolean shownAndAccepted) {
          this.shownAndAccepted = shownAndAccepted;
          return this;
        }
      }
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

    /** Town or district. */
    @SerializedName("town")
    String town;

    private Address(
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
      public PersonTokenCreateParams.Address build() {
        return new PersonTokenCreateParams.Address(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.state,
            this.town);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.Address#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.Address#extraParams} for the field documentation.
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

      /** Town or district. */
      public Builder setTown(String town) {
        this.town = town;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth {
    /** <strong>Required.</strong> The day of the birth. */
    @SerializedName("day")
    Long day;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The month of birth. */
    @SerializedName("month")
    Long month;

    /** <strong>Required.</strong> The year of birth. */
    @SerializedName("year")
    Long year;

    private DateOfBirth(Long day, Map<String, Object> extraParams, Long month, Long year) {
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
      public PersonTokenCreateParams.DateOfBirth build() {
        return new PersonTokenCreateParams.DateOfBirth(
            this.day, this.extraParams, this.month, this.year);
      }

      /** <strong>Required.</strong> The day of the birth. */
      public Builder setDay(Long day) {
        this.day = day;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.DateOfBirth#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.DateOfBirth#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The month of birth. */
      public Builder setMonth(Long month) {
        this.month = month;
        return this;
      }

      /** <strong>Required.</strong> The year of birth. */
      public Builder setYear(Long year) {
        this.year = year;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Documents {
    /**
     * One or more documents that demonstrate proof that this person is authorized to represent the
     * company.
     */
    @SerializedName("company_authorization")
    CompanyAuthorization companyAuthorization;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** One or more documents showing the person’s passport page with photo and personal data. */
    @SerializedName("passport")
    Passport passport;

    /** An identifying document showing the person's name, either a passport or local ID card. */
    @SerializedName("primary_verification")
    PrimaryVerification primaryVerification;

    /**
     * A document showing address, either a passport, local ID card, or utility bill from a
     * well-known utility company.
     */
    @SerializedName("secondary_verification")
    SecondaryVerification secondaryVerification;

    /**
     * One or more documents showing the person’s visa required for living in the country where they
     * are residing.
     */
    @SerializedName("visa")
    Visa visa;

    private Documents(
        CompanyAuthorization companyAuthorization,
        Map<String, Object> extraParams,
        Passport passport,
        PrimaryVerification primaryVerification,
        SecondaryVerification secondaryVerification,
        Visa visa) {
      this.companyAuthorization = companyAuthorization;
      this.extraParams = extraParams;
      this.passport = passport;
      this.primaryVerification = primaryVerification;
      this.secondaryVerification = secondaryVerification;
      this.visa = visa;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CompanyAuthorization companyAuthorization;

      private Map<String, Object> extraParams;

      private Passport passport;

      private PrimaryVerification primaryVerification;

      private SecondaryVerification secondaryVerification;

      private Visa visa;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.Documents build() {
        return new PersonTokenCreateParams.Documents(
            this.companyAuthorization,
            this.extraParams,
            this.passport,
            this.primaryVerification,
            this.secondaryVerification,
            this.visa);
      }

      /**
       * One or more documents that demonstrate proof that this person is authorized to represent
       * the company.
       */
      public Builder setCompanyAuthorization(
          PersonTokenCreateParams.Documents.CompanyAuthorization companyAuthorization) {
        this.companyAuthorization = companyAuthorization;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.Documents#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** One or more documents showing the person’s passport page with photo and personal data. */
      public Builder setPassport(PersonTokenCreateParams.Documents.Passport passport) {
        this.passport = passport;
        return this;
      }

      /** An identifying document showing the person's name, either a passport or local ID card. */
      public Builder setPrimaryVerification(
          PersonTokenCreateParams.Documents.PrimaryVerification primaryVerification) {
        this.primaryVerification = primaryVerification;
        return this;
      }

      /**
       * A document showing address, either a passport, local ID card, or utility bill from a
       * well-known utility company.
       */
      public Builder setSecondaryVerification(
          PersonTokenCreateParams.Documents.SecondaryVerification secondaryVerification) {
        this.secondaryVerification = secondaryVerification;
        return this;
      }

      /**
       * One or more documents showing the person’s visa required for living in the country where
       * they are residing.
       */
      public Builder setVisa(PersonTokenCreateParams.Documents.Visa visa) {
        this.visa = visa;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyAuthorization {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * <strong>Required.</strong> The format of the document. Currently supports {@code files}
       * only.
       */
      @SerializedName("type")
      Type type;

      private CompanyAuthorization(Map<String, Object> extraParams, List<String> files, Type type) {
        this.extraParams = extraParams;
        this.files = files;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.Documents.CompanyAuthorization build() {
          return new PersonTokenCreateParams.Documents.CompanyAuthorization(
              this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.Documents.CompanyAuthorization#extraParams} for
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
         * map. See {@link PersonTokenCreateParams.Documents.CompanyAuthorization#extraParams} for
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
         * PersonTokenCreateParams.Documents.CompanyAuthorization#files} for the field
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
         * PersonTokenCreateParams.Documents.CompanyAuthorization#files} for the field
         * documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the document. Currently supports {@code files}
         * only.
         */
        public Builder setType(PersonTokenCreateParams.Documents.CompanyAuthorization.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("files")
        FILES("files");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Passport {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * <strong>Required.</strong> The format of the document. Currently supports {@code files}
       * only.
       */
      @SerializedName("type")
      Type type;

      private Passport(Map<String, Object> extraParams, List<String> files, Type type) {
        this.extraParams = extraParams;
        this.files = files;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.Documents.Passport build() {
          return new PersonTokenCreateParams.Documents.Passport(
              this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.Documents.Passport#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.Documents.Passport#extraParams} for the field
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
         * PersonTokenCreateParams.Documents.Passport#files} for the field documentation.
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
         * PersonTokenCreateParams.Documents.Passport#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the document. Currently supports {@code files}
         * only.
         */
        public Builder setType(PersonTokenCreateParams.Documents.Passport.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("files")
        FILES("files");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PrimaryVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * referring to each side of the document.
       */
      @SerializedName("front_back")
      FrontBack frontBack;

      /**
       * <strong>Required.</strong> The format of the verification document. Currently supports
       * {@code front_back} only.
       */
      @SerializedName("type")
      Type type;

      private PrimaryVerification(Map<String, Object> extraParams, FrontBack frontBack, Type type) {
        this.extraParams = extraParams;
        this.frontBack = frontBack;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FrontBack frontBack;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.Documents.PrimaryVerification build() {
          return new PersonTokenCreateParams.Documents.PrimaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.Documents.PrimaryVerification#extraParams} for
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
         * map. See {@link PersonTokenCreateParams.Documents.PrimaryVerification#extraParams} for
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
         * <strong>Required.</strong> The <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
         * referring to each side of the document.
         */
        public Builder setFrontBack(
            PersonTokenCreateParams.Documents.PrimaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonTokenCreateParams.Documents.PrimaryVerification.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class FrontBack {
        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the back of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
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
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;

        private FrontBack(String back, Map<String, Object> extraParams, String front) {
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
          public PersonTokenCreateParams.Documents.PrimaryVerification.FrontBack build() {
            return new PersonTokenCreateParams.Documents.PrimaryVerification.FrontBack(
                this.back, this.extraParams, this.front);
          }

          /**
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the back of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
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
           * map. See {@link
           * PersonTokenCreateParams.Documents.PrimaryVerification.FrontBack#extraParams} for the
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
           * PersonTokenCreateParams.Documents.PrimaryVerification.FrontBack#extraParams} for the
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
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the front of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("front_back")
        FRONT_BACK("front_back");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SecondaryVerification {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * referring to each side of the document.
       */
      @SerializedName("front_back")
      FrontBack frontBack;

      /**
       * <strong>Required.</strong> The format of the verification document. Currently supports
       * {@code front_back} only.
       */
      @SerializedName("type")
      Type type;

      private SecondaryVerification(
          Map<String, Object> extraParams, FrontBack frontBack, Type type) {
        this.extraParams = extraParams;
        this.frontBack = frontBack;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FrontBack frontBack;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.Documents.SecondaryVerification build() {
          return new PersonTokenCreateParams.Documents.SecondaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.Documents.SecondaryVerification#extraParams} for
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
         * map. See {@link PersonTokenCreateParams.Documents.SecondaryVerification#extraParams} for
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
         * <strong>Required.</strong> The <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
         * referring to each side of the document.
         */
        public Builder setFrontBack(
            PersonTokenCreateParams.Documents.SecondaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonTokenCreateParams.Documents.SecondaryVerification.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class FrontBack {
        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the back of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
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
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;

        private FrontBack(String back, Map<String, Object> extraParams, String front) {
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
          public PersonTokenCreateParams.Documents.SecondaryVerification.FrontBack build() {
            return new PersonTokenCreateParams.Documents.SecondaryVerification.FrontBack(
                this.back, this.extraParams, this.front);
          }

          /**
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the back of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
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
           * map. See {@link
           * PersonTokenCreateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the
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
           * PersonTokenCreateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the
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
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the front of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("front_back")
        FRONT_BACK("front_back");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Visa {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * <strong>Required.</strong> The format of the document. Currently supports {@code files}
       * only.
       */
      @SerializedName("type")
      Type type;

      private Visa(Map<String, Object> extraParams, List<String> files, Type type) {
        this.extraParams = extraParams;
        this.files = files;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> files;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.Documents.Visa build() {
          return new PersonTokenCreateParams.Documents.Visa(
              this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.Documents.Visa#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.Documents.Visa#extraParams} for the field
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
         * PersonTokenCreateParams.Documents.Visa#files} for the field documentation.
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
         * PersonTokenCreateParams.Documents.Visa#files} for the field documentation.
         */
        public Builder addAllFile(List<String> elements) {
          if (this.files == null) {
            this.files = new ArrayList<>();
          }
          this.files.addAll(elements);
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the document. Currently supports {@code files}
         * only.
         */
        public Builder setType(PersonTokenCreateParams.Documents.Visa.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("files")
        FILES("files");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class IdNumber {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID number type of an individual. */
    @SerializedName("type")
    Type type;

    /** <strong>Required.</strong> The value of the ID number. */
    @SerializedName("value")
    String value;

    private IdNumber(Map<String, Object> extraParams, Type type, String value) {
      this.extraParams = extraParams;
      this.type = type;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Type type;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.IdNumber build() {
        return new PersonTokenCreateParams.IdNumber(this.extraParams, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.IdNumber#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.IdNumber#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID number type of an individual. */
      public Builder setType(PersonTokenCreateParams.IdNumber.Type type) {
        this.type = type;
        return this;
      }

      /** <strong>Required.</strong> The value of the ID number. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("ae_eid")
      AE_EID("ae_eid"),

      @SerializedName("ao_nif")
      AO_NIF("ao_nif"),

      @SerializedName("ar_cuil")
      AR_CUIL("ar_cuil"),

      @SerializedName("ar_dni")
      AR_DNI("ar_dni"),

      @SerializedName("at_stn")
      AT_STN("at_stn"),

      @SerializedName("az_tin")
      AZ_TIN("az_tin"),

      @SerializedName("bd_brc")
      BD_BRC("bd_brc"),

      @SerializedName("bd_etin")
      BD_ETIN("bd_etin"),

      @SerializedName("bd_nid")
      BD_NID("bd_nid"),

      @SerializedName("be_nrn")
      BE_NRN("be_nrn"),

      @SerializedName("bg_ucn")
      BG_UCN("bg_ucn"),

      @SerializedName("bn_nric")
      BN_NRIC("bn_nric"),

      @SerializedName("br_cpf")
      BR_CPF("br_cpf"),

      @SerializedName("ca_sin")
      CA_SIN("ca_sin"),

      @SerializedName("ch_oasi")
      CH_OASI("ch_oasi"),

      @SerializedName("cl_rut")
      CL_RUT("cl_rut"),

      @SerializedName("cn_pp")
      CN_PP("cn_pp"),

      @SerializedName("co_nuip")
      CO_NUIP("co_nuip"),

      @SerializedName("cr_ci")
      CR_CI("cr_ci"),

      @SerializedName("cr_cpf")
      CR_CPF("cr_cpf"),

      @SerializedName("cr_dimex")
      CR_DIMEX("cr_dimex"),

      @SerializedName("cr_nite")
      CR_NITE("cr_nite"),

      @SerializedName("cy_tic")
      CY_TIC("cy_tic"),

      @SerializedName("cz_rc")
      CZ_RC("cz_rc"),

      @SerializedName("de_stn")
      DE_STN("de_stn"),

      @SerializedName("dk_cpr")
      DK_CPR("dk_cpr"),

      @SerializedName("do_cie")
      DO_CIE("do_cie"),

      @SerializedName("do_rcn")
      DO_RCN("do_rcn"),

      @SerializedName("ec_ci")
      EC_CI("ec_ci"),

      @SerializedName("ee_ik")
      EE_IK("ee_ik"),

      @SerializedName("es_nif")
      ES_NIF("es_nif"),

      @SerializedName("fi_hetu")
      FI_HETU("fi_hetu"),

      @SerializedName("fr_nir")
      FR_NIR("fr_nir"),

      @SerializedName("gb_nino")
      GB_NINO("gb_nino"),

      @SerializedName("gr_afm")
      GR_AFM("gr_afm"),

      @SerializedName("gt_nit")
      GT_NIT("gt_nit"),

      @SerializedName("hk_id")
      HK_ID("hk_id"),

      @SerializedName("hr_oib")
      HR_OIB("hr_oib"),

      @SerializedName("hu_ad")
      HU_AD("hu_ad"),

      @SerializedName("id_nik")
      ID_NIK("id_nik"),

      @SerializedName("ie_ppsn")
      IE_PPSN("ie_ppsn"),

      @SerializedName("is_kt")
      IS_KT("is_kt"),

      @SerializedName("it_cf")
      IT_CF("it_cf"),

      @SerializedName("jp_inc")
      JP_INC("jp_inc"),

      @SerializedName("ke_pin")
      KE_PIN("ke_pin"),

      @SerializedName("kz_iin")
      KZ_IIN("kz_iin"),

      @SerializedName("li_peid")
      LI_PEID("li_peid"),

      @SerializedName("lt_ak")
      LT_AK("lt_ak"),

      @SerializedName("lu_nif")
      LU_NIF("lu_nif"),

      @SerializedName("lv_pk")
      LV_PK("lv_pk"),

      @SerializedName("mx_rfc")
      MX_RFC("mx_rfc"),

      @SerializedName("my_nric")
      MY_NRIC("my_nric"),

      @SerializedName("mz_nuit")
      MZ_NUIT("mz_nuit"),

      @SerializedName("ng_nin")
      NG_NIN("ng_nin"),

      @SerializedName("nl_bsn")
      NL_BSN("nl_bsn"),

      @SerializedName("no_nin")
      NO_NIN("no_nin"),

      @SerializedName("nz_ird")
      NZ_IRD("nz_ird"),

      @SerializedName("pe_dni")
      PE_DNI("pe_dni"),

      @SerializedName("pk_cnic")
      PK_CNIC("pk_cnic"),

      @SerializedName("pk_snic")
      PK_SNIC("pk_snic"),

      @SerializedName("pl_pesel")
      PL_PESEL("pl_pesel"),

      @SerializedName("pt_nif")
      PT_NIF("pt_nif"),

      @SerializedName("ro_cnp")
      RO_CNP("ro_cnp"),

      @SerializedName("sa_tin")
      SA_TIN("sa_tin"),

      @SerializedName("se_pin")
      SE_PIN("se_pin"),

      @SerializedName("sg_fin")
      SG_FIN("sg_fin"),

      @SerializedName("sg_nric")
      SG_NRIC("sg_nric"),

      @SerializedName("sk_dic")
      SK_DIC("sk_dic"),

      @SerializedName("th_lc")
      TH_LC("th_lc"),

      @SerializedName("th_pin")
      TH_PIN("th_pin"),

      @SerializedName("tr_tin")
      TR_TIN("tr_tin"),

      @SerializedName("us_itin")
      US_ITIN("us_itin"),

      @SerializedName("us_itin_last_4")
      US_ITIN_LAST_4("us_itin_last_4"),

      @SerializedName("us_ssn")
      US_SSN("us_ssn"),

      @SerializedName("us_ssn_last_4")
      US_SSN_LAST_4("us_ssn_last_4"),

      @SerializedName("uy_dni")
      UY_DNI("uy_dni"),

      @SerializedName("za_id")
      ZA_ID("za_id");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship {
    /** Whether the individual is an authorizer of the Account's identity. */
    @SerializedName("authorizer")
    Boolean authorizer;

    /** Indicates whether the person is a director of the associated legal entity. */
    @SerializedName("director")
    Boolean director;

    /** Indicates whether the person is an executive of the associated legal entity. */
    @SerializedName("executive")
    Boolean executive;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Indicates whether the person is a legal guardian of the associated legal entity. */
    @SerializedName("legal_guardian")
    Boolean legalGuardian;

    /** Indicates whether the person is an owner of the associated legal entity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percentage of ownership the person has in the associated legal entity. */
    @SerializedName("percent_ownership")
    String percentOwnership;

    /** Indicates whether the person is a representative of the associated legal entity. */
    @SerializedName("representative")
    Boolean representative;

    /** The title or position the person holds in the associated legal entity. */
    @SerializedName("title")
    String title;

    private Relationship(
        Boolean authorizer,
        Boolean director,
        Boolean executive,
        Map<String, Object> extraParams,
        Boolean legalGuardian,
        Boolean owner,
        String percentOwnership,
        Boolean representative,
        String title) {
      this.authorizer = authorizer;
      this.director = director;
      this.executive = executive;
      this.extraParams = extraParams;
      this.legalGuardian = legalGuardian;
      this.owner = owner;
      this.percentOwnership = percentOwnership;
      this.representative = representative;
      this.title = title;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean authorizer;

      private Boolean director;

      private Boolean executive;

      private Map<String, Object> extraParams;

      private Boolean legalGuardian;

      private Boolean owner;

      private String percentOwnership;

      private Boolean representative;

      private String title;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.Relationship build() {
        return new PersonTokenCreateParams.Relationship(
            this.authorizer,
            this.director,
            this.executive,
            this.extraParams,
            this.legalGuardian,
            this.owner,
            this.percentOwnership,
            this.representative,
            this.title);
      }

      /** Whether the individual is an authorizer of the Account's identity. */
      public Builder setAuthorizer(Boolean authorizer) {
        this.authorizer = authorizer;
        return this;
      }

      /** Indicates whether the person is a director of the associated legal entity. */
      public Builder setDirector(Boolean director) {
        this.director = director;
        return this;
      }

      /** Indicates whether the person is an executive of the associated legal entity. */
      public Builder setExecutive(Boolean executive) {
        this.executive = executive;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.Relationship#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.Relationship#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Indicates whether the person is a legal guardian of the associated legal entity. */
      public Builder setLegalGuardian(Boolean legalGuardian) {
        this.legalGuardian = legalGuardian;
        return this;
      }

      /** Indicates whether the person is an owner of the associated legal entity. */
      public Builder setOwner(Boolean owner) {
        this.owner = owner;
        return this;
      }

      /** The percentage of ownership the person has in the associated legal entity. */
      public Builder setPercentOwnership(String percentOwnership) {
        this.percentOwnership = percentOwnership;
        return this;
      }

      /** Indicates whether the person is a representative of the associated legal entity. */
      public Builder setRepresentative(Boolean representative) {
        this.representative = representative;
        return this;
      }

      /** The title or position the person holds in the associated legal entity. */
      public Builder setTitle(String title) {
        this.title = title;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ScriptAddresses {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Kana Address. */
    @SerializedName("kana")
    Kana kana;

    /** Kanji Address. */
    @SerializedName("kanji")
    Kanji kanji;

    private ScriptAddresses(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
      this.extraParams = extraParams;
      this.kana = kana;
      this.kanji = kanji;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Kana kana;

      private Kanji kanji;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.ScriptAddresses build() {
        return new PersonTokenCreateParams.ScriptAddresses(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.ScriptAddresses#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.ScriptAddresses#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Kana Address. */
      public Builder setKana(PersonTokenCreateParams.ScriptAddresses.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Kanji Address. */
      public Builder setKanji(PersonTokenCreateParams.ScriptAddresses.Kanji kanji) {
        this.kanji = kanji;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Kana {
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

      /** Town or district. */
      @SerializedName("town")
      String town;

      private Kana(
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
        public PersonTokenCreateParams.ScriptAddresses.Kana build() {
          return new PersonTokenCreateParams.ScriptAddresses.Kana(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
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
         * map. See {@link PersonTokenCreateParams.ScriptAddresses.Kana#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.ScriptAddresses.Kana#extraParams} for the field
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

        /** Town or district. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Kanji {
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

      /** Town or district. */
      @SerializedName("town")
      String town;

      private Kanji(
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
        public PersonTokenCreateParams.ScriptAddresses.Kanji build() {
          return new PersonTokenCreateParams.ScriptAddresses.Kanji(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state,
              this.town);
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
         * map. See {@link PersonTokenCreateParams.ScriptAddresses.Kanji#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.ScriptAddresses.Kanji#extraParams} for the field
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

        /** Town or district. */
        public Builder setTown(String town) {
          this.town = town;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ScriptNames {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Persons name in kana script. */
    @SerializedName("kana")
    Kana kana;

    /** Persons name in kanji script. */
    @SerializedName("kanji")
    Kanji kanji;

    private ScriptNames(Map<String, Object> extraParams, Kana kana, Kanji kanji) {
      this.extraParams = extraParams;
      this.kana = kana;
      this.kanji = kanji;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Kana kana;

      private Kanji kanji;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonTokenCreateParams.ScriptNames build() {
        return new PersonTokenCreateParams.ScriptNames(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonTokenCreateParams.ScriptNames#extraParams} for the field documentation.
       */
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
       * See {@link PersonTokenCreateParams.ScriptNames#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Persons name in kana script. */
      public Builder setKana(PersonTokenCreateParams.ScriptNames.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Persons name in kanji script. */
      public Builder setKanji(PersonTokenCreateParams.ScriptNames.Kanji kanji) {
        this.kanji = kanji;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Kana {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The person's first or given name. */
      @SerializedName("given_name")
      String givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      String surname;

      private Kana(Map<String, Object> extraParams, String givenName, String surname) {
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String givenName;

        private String surname;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.ScriptNames.Kana build() {
          return new PersonTokenCreateParams.ScriptNames.Kana(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.ScriptNames.Kana#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.ScriptNames.Kana#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The person's first or given name. */
        public Builder setGivenName(String givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Kanji {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The person's first or given name. */
      @SerializedName("given_name")
      String givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      String surname;

      private Kanji(Map<String, Object> extraParams, String givenName, String surname) {
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String givenName;

        private String surname;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonTokenCreateParams.ScriptNames.Kanji build() {
          return new PersonTokenCreateParams.ScriptNames.Kanji(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonTokenCreateParams.ScriptNames.Kanji#extraParams} for the field
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
         * map. See {@link PersonTokenCreateParams.ScriptNames.Kanji#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The person's first or given name. */
        public Builder setGivenName(String givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }
      }
    }
  }

  public enum LegalGender implements ApiRequestParams.EnumParam {
    @SerializedName("female")
    FEMALE("female"),

    @SerializedName("male")
    MALE("male");

    @Getter(onMethod_ = {@Override})
    private final String value;

    LegalGender(String value) {
      this.value = value;
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
