// File generated from our OpenAPI spec
package com.stripe.param.v2.core.accounts;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PersonUpdateParams extends ApiRequestParams {
  /** Additional addresses associated with the person. */
  @SerializedName("additional_addresses")
  List<PersonUpdateParams.AdditionalAddress> additionalAddresses;

  /** Additional names (e.g. aliases) associated with the person. */
  @SerializedName("additional_names")
  List<PersonUpdateParams.AdditionalName> additionalNames;

  /** Attestations of accepted terms of service agreements. */
  @SerializedName("additional_terms_of_service")
  AdditionalTermsOfService additionalTermsOfService;

  /** The primary address associated with the person. */
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
  Object email;

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
  Object givenName;

  /** The identification numbers (e.g., SSN) associated with the person. */
  @SerializedName("id_numbers")
  List<PersonUpdateParams.IdNumber> idNumbers;

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
  Object phone;

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
  Object surname;

  private PersonUpdateParams(
      List<PersonUpdateParams.AdditionalAddress> additionalAddresses,
      List<PersonUpdateParams.AdditionalName> additionalNames,
      AdditionalTermsOfService additionalTermsOfService,
      Address address,
      DateOfBirth dateOfBirth,
      Documents documents,
      Object email,
      Map<String, Object> extraParams,
      Object givenName,
      List<PersonUpdateParams.IdNumber> idNumbers,
      LegalGender legalGender,
      Map<String, Object> metadata,
      List<String> nationalities,
      Object phone,
      PoliticalExposure politicalExposure,
      Relationship relationship,
      ScriptAddresses scriptAddresses,
      ScriptNames scriptNames,
      Object surname) {
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
    private List<PersonUpdateParams.AdditionalAddress> additionalAddresses;

    private List<PersonUpdateParams.AdditionalName> additionalNames;

    private AdditionalTermsOfService additionalTermsOfService;

    private Address address;

    private DateOfBirth dateOfBirth;

    private Documents documents;

    private Object email;

    private Map<String, Object> extraParams;

    private Object givenName;

    private List<PersonUpdateParams.IdNumber> idNumbers;

    private LegalGender legalGender;

    private Map<String, Object> metadata;

    private List<String> nationalities;

    private Object phone;

    private PoliticalExposure politicalExposure;

    private Relationship relationship;

    private ScriptAddresses scriptAddresses;

    private ScriptNames scriptNames;

    private Object surname;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonUpdateParams build() {
      return new PersonUpdateParams(
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
     * {@link PersonUpdateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAdditionalAddress(PersonUpdateParams.AdditionalAddress element) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalAddresses` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PersonUpdateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAllAdditionalAddress(List<PersonUpdateParams.AdditionalAddress> elements) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.addAll(elements);
      return this;
    }

    /**
     * Add an element to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonUpdateParams#additionalNames} for the field documentation.
     */
    public Builder addAdditionalName(PersonUpdateParams.AdditionalName element) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonUpdateParams#additionalNames} for the field documentation.
     */
    public Builder addAllAdditionalName(List<PersonUpdateParams.AdditionalName> elements) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.addAll(elements);
      return this;
    }

    /** Attestations of accepted terms of service agreements. */
    public Builder setAdditionalTermsOfService(
        PersonUpdateParams.AdditionalTermsOfService additionalTermsOfService) {
      this.additionalTermsOfService = additionalTermsOfService;
      return this;
    }

    /** The primary address associated with the person. */
    public Builder setAddress(PersonUpdateParams.Address address) {
      this.address = address;
      return this;
    }

    /** The person's date of birth. */
    public Builder setDateOfBirth(PersonUpdateParams.DateOfBirth dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(PersonUpdateParams.Documents documents) {
      this.documents = documents;
      return this;
    }

    /** Email. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /** Email. */
    public Builder setEmail(EmptyParam email) {
      this.email = email;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link PersonUpdateParams#extraParams} for the field documentation.
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

    /** The person's first name. */
    public Builder setGivenName(EmptyParam givenName) {
      this.givenName = givenName;
      return this;
    }

    /**
     * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonUpdateParams#idNumbers} for the field documentation.
     */
    public Builder addIdNumber(PersonUpdateParams.IdNumber element) {
      if (this.idNumbers == null) {
        this.idNumbers = new ArrayList<>();
      }
      this.idNumbers.add(element);
      return this;
    }

    /**
     * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonUpdateParams#idNumbers} for the field documentation.
     */
    public Builder addAllIdNumber(List<PersonUpdateParams.IdNumber> elements) {
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
    public Builder setLegalGender(PersonUpdateParams.LegalGender legalGender) {
      this.legalGender = legalGender;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonUpdateParams#metadata} for the field documentation.
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
     * PersonUpdateParams#metadata} for the field documentation.
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
     * PersonUpdateParams#metadata} for the field documentation.
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
     * PersonUpdateParams#nationalities} for the field documentation.
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
     * PersonUpdateParams#nationalities} for the field documentation.
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

    /** The phone number for this person. */
    public Builder setPhone(EmptyParam phone) {
      this.phone = phone;
      return this;
    }

    /** The person's political exposure. */
    public Builder setPoliticalExposure(PersonUpdateParams.PoliticalExposure politicalExposure) {
      this.politicalExposure = politicalExposure;
      return this;
    }

    /** The relationship that this person has with the Account's business or legal entity. */
    public Builder setRelationship(PersonUpdateParams.Relationship relationship) {
      this.relationship = relationship;
      return this;
    }

    /** The script addresses (e.g., non-Latin characters) associated with the person. */
    public Builder setScriptAddresses(PersonUpdateParams.ScriptAddresses scriptAddresses) {
      this.scriptAddresses = scriptAddresses;
      return this;
    }

    /** The script names (e.g. non-Latin characters) associated with the person. */
    public Builder setScriptNames(PersonUpdateParams.ScriptNames scriptNames) {
      this.scriptNames = scriptNames;
      return this;
    }

    /** The person's last name. */
    public Builder setSurname(String surname) {
      this.surname = surname;
      return this;
    }

    /** The person's last name. */
    public Builder setSurname(EmptyParam surname) {
      this.surname = surname;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalAddress {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

    /** <strong>Required.</strong> Purpose of additional address. */
    @SerializedName("purpose")
    Purpose purpose;

    /** State, county, province, or region. */
    @SerializedName("state")
    Object state;

    /** Town or cho-me. */
    @SerializedName("town")
    Object town;

    private AdditionalAddress(
        Object city,
        Object country,
        Map<String, Object> extraParams,
        Object line1,
        Object line2,
        Object postalCode,
        Purpose purpose,
        Object state,
        Object town) {
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
      private Object city;

      private Object country;

      private Map<String, Object> extraParams;

      private Object line1;

      private Object line2;

      private Object postalCode;

      private Purpose purpose;

      private Object state;

      private Object town;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonUpdateParams.AdditionalAddress build() {
        return new PersonUpdateParams.AdditionalAddress(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.AdditionalAddress#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.AdditionalAddress#extraParams} for the field documentation.
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

      /** <strong>Required.</strong> Purpose of additional address. */
      public Builder setPurpose(PersonUpdateParams.AdditionalAddress.Purpose purpose) {
        this.purpose = purpose;
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
    Object fullName;

    /** The person's first or given name. */
    @SerializedName("given_name")
    Object givenName;

    /** <strong>Required.</strong> The purpose or type of the additional name. */
    @SerializedName("purpose")
    Purpose purpose;

    /** The person's last or family name. */
    @SerializedName("surname")
    Object surname;

    private AdditionalName(
        Map<String, Object> extraParams,
        Object fullName,
        Object givenName,
        Purpose purpose,
        Object surname) {
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

      private Object fullName;

      private Object givenName;

      private Purpose purpose;

      private Object surname;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonUpdateParams.AdditionalName build() {
        return new PersonUpdateParams.AdditionalName(
            this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.AdditionalName#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.AdditionalName#extraParams} for the field documentation.
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

      /** The person's full name. */
      public Builder setFullName(EmptyParam fullName) {
        this.fullName = fullName;
        return this;
      }

      /** The person's first or given name. */
      public Builder setGivenName(String givenName) {
        this.givenName = givenName;
        return this;
      }

      /** The person's first or given name. */
      public Builder setGivenName(EmptyParam givenName) {
        this.givenName = givenName;
        return this;
      }

      /** <strong>Required.</strong> The purpose or type of the additional name. */
      public Builder setPurpose(PersonUpdateParams.AdditionalName.Purpose purpose) {
        this.purpose = purpose;
        return this;
      }

      /** The person's last or family name. */
      public Builder setSurname(String surname) {
        this.surname = surname;
        return this;
      }

      /** The person's last or family name. */
      public Builder setSurname(EmptyParam surname) {
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
    /** Stripe terms of service agreement. */
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
      public PersonUpdateParams.AdditionalTermsOfService build() {
        return new PersonUpdateParams.AdditionalTermsOfService(this.account, this.extraParams);
      }

      /** Stripe terms of service agreement. */
      public Builder setAccount(PersonUpdateParams.AdditionalTermsOfService.Account account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.AdditionalTermsOfService#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.AdditionalTermsOfService#extraParams} for the field
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
       * The time when the Account's representative accepted the terms of service. Represented as a
       * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
       * 2022-09-18T13:22:18.123Z.
       */
      @SerializedName("date")
      Instant date;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The IP address from which the Account's representative accepted the terms of service. */
      @SerializedName("ip")
      Object ip;

      /**
       * The user agent of the browser from which the Account's representative accepted the terms of
       * service.
       */
      @SerializedName("user_agent")
      Object userAgent;

      private Account(Instant date, Map<String, Object> extraParams, Object ip, Object userAgent) {
        this.date = date;
        this.extraParams = extraParams;
        this.ip = ip;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Instant date;

        private Map<String, Object> extraParams;

        private Object ip;

        private Object userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonUpdateParams.AdditionalTermsOfService.Account build() {
          return new PersonUpdateParams.AdditionalTermsOfService.Account(
              this.date, this.extraParams, this.ip, this.userAgent);
        }

        /**
         * The time when the Account's representative accepted the terms of service. Represented as
         * a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
         * 2022-09-18T13:22:18.123Z.
         */
        public Builder setDate(Instant date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.AdditionalTermsOfService.Account#extraParams} for the
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
         * map. See {@link PersonUpdateParams.AdditionalTermsOfService.Account#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The IP address from which the Account's representative accepted the terms of service. */
        public Builder setIp(String ip) {
          this.ip = ip;
          return this;
        }

        /** The IP address from which the Account's representative accepted the terms of service. */
        public Builder setIp(EmptyParam ip) {
          this.ip = ip;
          return this;
        }

        /**
         * The user agent of the browser from which the Account's representative accepted the terms
         * of service.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }

        /**
         * The user agent of the browser from which the Account's representative accepted the terms
         * of service.
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

    /** Town or cho-me. */
    @SerializedName("town")
    Object town;

    private Address(
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
      public PersonUpdateParams.Address build() {
        return new PersonUpdateParams.Address(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.Address#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.Address#extraParams} for the field documentation.
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
      public PersonUpdateParams.DateOfBirth build() {
        return new PersonUpdateParams.DateOfBirth(
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
       * PersonUpdateParams.DateOfBirth#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.DateOfBirth#extraParams} for the field documentation.
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
      public PersonUpdateParams.Documents build() {
        return new PersonUpdateParams.Documents(
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
          PersonUpdateParams.Documents.CompanyAuthorization companyAuthorization) {
        this.companyAuthorization = companyAuthorization;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.Documents#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** One or more documents showing the person’s passport page with photo and personal data. */
      public Builder setPassport(PersonUpdateParams.Documents.Passport passport) {
        this.passport = passport;
        return this;
      }

      /** An identifying document showing the person's name, either a passport or local ID card. */
      public Builder setPrimaryVerification(
          PersonUpdateParams.Documents.PrimaryVerification primaryVerification) {
        this.primaryVerification = primaryVerification;
        return this;
      }

      /**
       * A document showing address, either a passport, local ID card, or utility bill from a
       * well-known utility company.
       */
      public Builder setSecondaryVerification(
          PersonUpdateParams.Documents.SecondaryVerification secondaryVerification) {
        this.secondaryVerification = secondaryVerification;
        return this;
      }

      /**
       * One or more documents showing the person’s visa required for living in the country where
       * they are residing.
       */
      public Builder setVisa(PersonUpdateParams.Documents.Visa visa) {
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
        public PersonUpdateParams.Documents.CompanyAuthorization build() {
          return new PersonUpdateParams.Documents.CompanyAuthorization(
              this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.Documents.CompanyAuthorization#extraParams} for the
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
         * map. See {@link PersonUpdateParams.Documents.CompanyAuthorization#extraParams} for the
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
         * PersonUpdateParams.Documents.CompanyAuthorization#files} for the field documentation.
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
         * PersonUpdateParams.Documents.CompanyAuthorization#files} for the field documentation.
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
        public Builder setType(PersonUpdateParams.Documents.CompanyAuthorization.Type type) {
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
        public PersonUpdateParams.Documents.Passport build() {
          return new PersonUpdateParams.Documents.Passport(this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.Documents.Passport#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.Documents.Passport#extraParams} for the field
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
         * PersonUpdateParams.Documents.Passport#files} for the field documentation.
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
         * PersonUpdateParams.Documents.Passport#files} for the field documentation.
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
        public Builder setType(PersonUpdateParams.Documents.Passport.Type type) {
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
        public PersonUpdateParams.Documents.PrimaryVerification build() {
          return new PersonUpdateParams.Documents.PrimaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.Documents.PrimaryVerification#extraParams} for the
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
         * map. See {@link PersonUpdateParams.Documents.PrimaryVerification#extraParams} for the
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
         * <strong>Required.</strong> The <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
         * referring to each side of the document.
         */
        public Builder setFrontBack(
            PersonUpdateParams.Documents.PrimaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonUpdateParams.Documents.PrimaryVerification.Type type) {
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
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        Object front;

        private FrontBack(Object back, Map<String, Object> extraParams, Object front) {
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
          public PersonUpdateParams.Documents.PrimaryVerification.FrontBack build() {
            return new PersonUpdateParams.Documents.PrimaryVerification.FrontBack(
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
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the back of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
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
           * map. See {@link PersonUpdateParams.Documents.PrimaryVerification.FrontBack#extraParams}
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
           * map. See {@link PersonUpdateParams.Documents.PrimaryVerification.FrontBack#extraParams}
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

          /**
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the front of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(EmptyParam front) {
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
        public PersonUpdateParams.Documents.SecondaryVerification build() {
          return new PersonUpdateParams.Documents.SecondaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.Documents.SecondaryVerification#extraParams} for the
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
         * map. See {@link PersonUpdateParams.Documents.SecondaryVerification#extraParams} for the
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
         * <strong>Required.</strong> The <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
         * referring to each side of the document.
         */
        public Builder setFrontBack(
            PersonUpdateParams.Documents.SecondaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonUpdateParams.Documents.SecondaryVerification.Type type) {
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
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        Object front;

        private FrontBack(Object back, Map<String, Object> extraParams, Object front) {
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
          public PersonUpdateParams.Documents.SecondaryVerification.FrontBack build() {
            return new PersonUpdateParams.Documents.SecondaryVerification.FrontBack(
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
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the back of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
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
           * map. See {@link
           * PersonUpdateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the field
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
           * PersonUpdateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the field
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

          /**
           * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
           * token representing the front of the verification document. The purpose of the uploaded
           * file should be 'identity_document'. The uploaded file needs to be a color image
           * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
           * size.
           */
          public Builder setFront(EmptyParam front) {
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
        public PersonUpdateParams.Documents.Visa build() {
          return new PersonUpdateParams.Documents.Visa(this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.Documents.Visa#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.Documents.Visa#extraParams} for the field
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
         * PersonUpdateParams.Documents.Visa#files} for the field documentation.
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
         * PersonUpdateParams.Documents.Visa#files} for the field documentation.
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
        public Builder setType(PersonUpdateParams.Documents.Visa.Type type) {
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
    Object value;

    private IdNumber(Map<String, Object> extraParams, Type type, Object value) {
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

      private Object value;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonUpdateParams.IdNumber build() {
        return new PersonUpdateParams.IdNumber(this.extraParams, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.IdNumber#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.IdNumber#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID number type of an individual. */
      public Builder setType(PersonUpdateParams.IdNumber.Type type) {
        this.type = type;
        return this;
      }

      /** <strong>Required.</strong> The value of the ID number. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }

      /** <strong>Required.</strong> The value of the ID number. */
      public Builder setValue(EmptyParam value) {
        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("ae_eid")
      AE_EID("ae_eid"),

      @SerializedName("ao_nif")
      AO_NIF("ao_nif"),

      @SerializedName("az_tin")
      AZ_TIN("az_tin"),

      @SerializedName("bd_brc")
      BD_BRC("bd_brc"),

      @SerializedName("bd_etin")
      BD_ETIN("bd_etin"),

      @SerializedName("bd_nid")
      BD_NID("bd_nid"),

      @SerializedName("br_cpf")
      BR_CPF("br_cpf"),

      @SerializedName("cr_cpf")
      CR_CPF("cr_cpf"),

      @SerializedName("cr_dimex")
      CR_DIMEX("cr_dimex"),

      @SerializedName("cr_nite")
      CR_NITE("cr_nite"),

      @SerializedName("de_stn")
      DE_STN("de_stn"),

      @SerializedName("do_rcn")
      DO_RCN("do_rcn"),

      @SerializedName("gt_nit")
      GT_NIT("gt_nit"),

      @SerializedName("hk_id")
      HK_ID("hk_id"),

      @SerializedName("kz_iin")
      KZ_IIN("kz_iin"),

      @SerializedName("mx_rfc")
      MX_RFC("mx_rfc"),

      @SerializedName("my_nric")
      MY_NRIC("my_nric"),

      @SerializedName("mz_nuit")
      MZ_NUIT("mz_nuit"),

      @SerializedName("nl_bsn")
      NL_BSN("nl_bsn"),

      @SerializedName("pe_dni")
      PE_DNI("pe_dni"),

      @SerializedName("pk_cnic")
      PK_CNIC("pk_cnic"),

      @SerializedName("pk_snic")
      PK_SNIC("pk_snic"),

      @SerializedName("sa_tin")
      SA_TIN("sa_tin"),

      @SerializedName("sg_fin")
      SG_FIN("sg_fin"),

      @SerializedName("sg_nric")
      SG_NRIC("sg_nric"),

      @SerializedName("th_lc")
      TH_LC("th_lc"),

      @SerializedName("th_pin")
      TH_PIN("th_pin"),

      @SerializedName("us_itin")
      US_ITIN("us_itin"),

      @SerializedName("us_itin_last_4")
      US_ITIN_LAST_4("us_itin_last_4"),

      @SerializedName("us_ssn")
      US_SSN("us_ssn"),

      @SerializedName("us_ssn_last_4")
      US_SSN_LAST_4("us_ssn_last_4");

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
    /** Whether the individual is an authorizer of the Account’s legal entity. */
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
    Object percentOwnership;

    /** Indicates whether the person is a representative of the associated legal entity. */
    @SerializedName("representative")
    Boolean representative;

    /** The title or position the person holds in the associated legal entity. */
    @SerializedName("title")
    Object title;

    private Relationship(
        Boolean authorizer,
        Boolean director,
        Boolean executive,
        Map<String, Object> extraParams,
        Boolean legalGuardian,
        Boolean owner,
        Object percentOwnership,
        Boolean representative,
        Object title) {
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

      private Object percentOwnership;

      private Boolean representative;

      private Object title;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonUpdateParams.Relationship build() {
        return new PersonUpdateParams.Relationship(
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

      /** Whether the individual is an authorizer of the Account’s legal entity. */
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
       * PersonUpdateParams.Relationship#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.Relationship#extraParams} for the field documentation.
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

      /** The percentage of ownership the person has in the associated legal entity. */
      public Builder setPercentOwnership(EmptyParam percentOwnership) {
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

      /** The title or position the person holds in the associated legal entity. */
      public Builder setTitle(EmptyParam title) {
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
      public PersonUpdateParams.ScriptAddresses build() {
        return new PersonUpdateParams.ScriptAddresses(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.ScriptAddresses#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.ScriptAddresses#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Kana Address. */
      public Builder setKana(PersonUpdateParams.ScriptAddresses.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Kanji Address. */
      public Builder setKanji(PersonUpdateParams.ScriptAddresses.Kanji kanji) {
        this.kanji = kanji;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Kana {
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

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private Kana(
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
        public PersonUpdateParams.ScriptAddresses.Kana build() {
          return new PersonUpdateParams.ScriptAddresses.Kana(
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
         * map. See {@link PersonUpdateParams.ScriptAddresses.Kana#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.ScriptAddresses.Kana#extraParams} for the field
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
    @EqualsAndHashCode(callSuper = false)
    public static class Kanji {
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

      /** Town or cho-me. */
      @SerializedName("town")
      Object town;

      private Kanji(
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
        public PersonUpdateParams.ScriptAddresses.Kanji build() {
          return new PersonUpdateParams.ScriptAddresses.Kanji(
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
         * map. See {@link PersonUpdateParams.ScriptAddresses.Kanji#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.ScriptAddresses.Kanji#extraParams} for the field
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
      public PersonUpdateParams.ScriptNames build() {
        return new PersonUpdateParams.ScriptNames(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonUpdateParams.ScriptNames#extraParams} for the field documentation.
       */
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
       * See {@link PersonUpdateParams.ScriptNames#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Persons name in kana script. */
      public Builder setKana(PersonUpdateParams.ScriptNames.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Persons name in kanji script. */
      public Builder setKanji(PersonUpdateParams.ScriptNames.Kanji kanji) {
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
      Object givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      Object surname;

      private Kana(Map<String, Object> extraParams, Object givenName, Object surname) {
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object givenName;

        private Object surname;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonUpdateParams.ScriptNames.Kana build() {
          return new PersonUpdateParams.ScriptNames.Kana(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.ScriptNames.Kana#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.ScriptNames.Kana#extraParams} for the field
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

        /** The person's first or given name. */
        public Builder setGivenName(EmptyParam givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(EmptyParam surname) {
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
      Object givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      Object surname;

      private Kanji(Map<String, Object> extraParams, Object givenName, Object surname) {
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object givenName;

        private Object surname;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonUpdateParams.ScriptNames.Kanji build() {
          return new PersonUpdateParams.ScriptNames.Kanji(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonUpdateParams.ScriptNames.Kanji#extraParams} for the field
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
         * map. See {@link PersonUpdateParams.ScriptNames.Kanji#extraParams} for the field
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

        /** The person's first or given name. */
        public Builder setGivenName(EmptyParam givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }

        /** The person's last or family name. */
        public Builder setSurname(EmptyParam surname) {
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
