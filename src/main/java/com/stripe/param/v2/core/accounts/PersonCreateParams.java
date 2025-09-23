// File generated from our OpenAPI spec
package com.stripe.param.v2.core.accounts;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PersonCreateParams extends ApiRequestParams {
  /** Additional addresses associated with the person. */
  @SerializedName("additional_addresses")
  List<PersonCreateParams.AdditionalAddress> additionalAddresses;

  /** Additional names (e.g. aliases) associated with the person. */
  @SerializedName("additional_names")
  List<PersonCreateParams.AdditionalName> additionalNames;

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
  List<PersonCreateParams.IdNumber> idNumbers;

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
  Map<String, String> metadata;

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

  private PersonCreateParams(
      List<PersonCreateParams.AdditionalAddress> additionalAddresses,
      List<PersonCreateParams.AdditionalName> additionalNames,
      AdditionalTermsOfService additionalTermsOfService,
      Address address,
      DateOfBirth dateOfBirth,
      Documents documents,
      String email,
      Map<String, Object> extraParams,
      String givenName,
      List<PersonCreateParams.IdNumber> idNumbers,
      LegalGender legalGender,
      Map<String, String> metadata,
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
    private List<PersonCreateParams.AdditionalAddress> additionalAddresses;

    private List<PersonCreateParams.AdditionalName> additionalNames;

    private AdditionalTermsOfService additionalTermsOfService;

    private Address address;

    private DateOfBirth dateOfBirth;

    private Documents documents;

    private String email;

    private Map<String, Object> extraParams;

    private String givenName;

    private List<PersonCreateParams.IdNumber> idNumbers;

    private LegalGender legalGender;

    private Map<String, String> metadata;

    private List<String> nationalities;

    private String phone;

    private PoliticalExposure politicalExposure;

    private Relationship relationship;

    private ScriptAddresses scriptAddresses;

    private ScriptNames scriptNames;

    private String surname;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonCreateParams build() {
      return new PersonCreateParams(
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
     * {@link PersonCreateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAdditionalAddress(PersonCreateParams.AdditionalAddress element) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalAddresses` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PersonCreateParams#additionalAddresses} for the field documentation.
     */
    public Builder addAllAdditionalAddress(List<PersonCreateParams.AdditionalAddress> elements) {
      if (this.additionalAddresses == null) {
        this.additionalAddresses = new ArrayList<>();
      }
      this.additionalAddresses.addAll(elements);
      return this;
    }

    /**
     * Add an element to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#additionalNames} for the field documentation.
     */
    public Builder addAdditionalName(PersonCreateParams.AdditionalName element) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.add(element);
      return this;
    }

    /**
     * Add all elements to `additionalNames` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#additionalNames} for the field documentation.
     */
    public Builder addAllAdditionalName(List<PersonCreateParams.AdditionalName> elements) {
      if (this.additionalNames == null) {
        this.additionalNames = new ArrayList<>();
      }
      this.additionalNames.addAll(elements);
      return this;
    }

    /** Attestations of accepted terms of service agreements. */
    public Builder setAdditionalTermsOfService(
        PersonCreateParams.AdditionalTermsOfService additionalTermsOfService) {
      this.additionalTermsOfService = additionalTermsOfService;
      return this;
    }

    /** The person's residential address. */
    public Builder setAddress(PersonCreateParams.Address address) {
      this.address = address;
      return this;
    }

    /** The person's date of birth. */
    public Builder setDateOfBirth(PersonCreateParams.DateOfBirth dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(PersonCreateParams.Documents documents) {
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
     * PersonCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link PersonCreateParams#extraParams} for the field documentation.
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
     * PersonCreateParams#idNumbers} for the field documentation.
     */
    public Builder addIdNumber(PersonCreateParams.IdNumber element) {
      if (this.idNumbers == null) {
        this.idNumbers = new ArrayList<>();
      }
      this.idNumbers.add(element);
      return this;
    }

    /**
     * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#idNumbers} for the field documentation.
     */
    public Builder addAllIdNumber(List<PersonCreateParams.IdNumber> elements) {
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
    public Builder setLegalGender(PersonCreateParams.LegalGender legalGender) {
      this.legalGender = legalGender;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonCreateParams#metadata} for the field documentation.
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
     * See {@link PersonCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `nationalities` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#nationalities} for the field documentation.
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
     * PersonCreateParams#nationalities} for the field documentation.
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
    public Builder setPoliticalExposure(PersonCreateParams.PoliticalExposure politicalExposure) {
      this.politicalExposure = politicalExposure;
      return this;
    }

    /** The relationship that this person has with the Account's business or legal entity. */
    public Builder setRelationship(PersonCreateParams.Relationship relationship) {
      this.relationship = relationship;
      return this;
    }

    /** The script addresses (e.g., non-Latin characters) associated with the person. */
    public Builder setScriptAddresses(PersonCreateParams.ScriptAddresses scriptAddresses) {
      this.scriptAddresses = scriptAddresses;
      return this;
    }

    /** The script names (e.g. non-Latin characters) associated with the person. */
    public Builder setScriptNames(PersonCreateParams.ScriptNames scriptNames) {
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
     * <strong>Required.</strong> Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

    /** Town or cho-me. */
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
      public PersonCreateParams.AdditionalAddress build() {
        return new PersonCreateParams.AdditionalAddress(
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
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AdditionalAddress#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AdditionalAddress#extraParams} for the field documentation.
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
      public Builder setPurpose(PersonCreateParams.AdditionalAddress.Purpose purpose) {
        this.purpose = purpose;
        return this;
      }

      /** State, county, province, or region. */
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
      public PersonCreateParams.AdditionalName build() {
        return new PersonCreateParams.AdditionalName(
            this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AdditionalName#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AdditionalName#extraParams} for the field documentation.
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
      public Builder setPurpose(PersonCreateParams.AdditionalName.Purpose purpose) {
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
      public PersonCreateParams.AdditionalTermsOfService build() {
        return new PersonCreateParams.AdditionalTermsOfService(this.account, this.extraParams);
      }

      /** Stripe terms of service agreement. */
      public Builder setAccount(PersonCreateParams.AdditionalTermsOfService.Account account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AdditionalTermsOfService#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AdditionalTermsOfService#extraParams} for the field
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
       * <strong>Required.</strong> The time when the Account's representative accepted the terms of
       * service. Represented as a RFC 3339 date &amp; time UTC value in millisecond precision, for
       * example: 2022-09-18T13:22:18.123Z.
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

      /**
       * <strong>Required.</strong> The IP address from which the Account's representative accepted
       * the terms of service.
       */
      @SerializedName("ip")
      String ip;

      /**
       * The user agent of the browser from which the Account's representative accepted the terms of
       * service.
       */
      @SerializedName("user_agent")
      String userAgent;

      private Account(Instant date, Map<String, Object> extraParams, String ip, String userAgent) {
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

        private String ip;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public PersonCreateParams.AdditionalTermsOfService.Account build() {
          return new PersonCreateParams.AdditionalTermsOfService.Account(
              this.date, this.extraParams, this.ip, this.userAgent);
        }

        /**
         * <strong>Required.</strong> The time when the Account's representative accepted the terms
         * of service. Represented as a RFC 3339 date &amp; time UTC value in millisecond precision,
         * for example: 2022-09-18T13:22:18.123Z.
         */
        public Builder setDate(Instant date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.AdditionalTermsOfService.Account#extraParams} for the
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
         * map. See {@link PersonCreateParams.AdditionalTermsOfService.Account#extraParams} for the
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
         * <strong>Required.</strong> The IP address from which the Account's representative
         * accepted the terms of service.
         */
        public Builder setIp(String ip) {
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
     * <strong>Required.</strong> Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

    /** Town or cho-me. */
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
      public PersonCreateParams.Address build() {
        return new PersonCreateParams.Address(
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
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.Address#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.Address#extraParams} for the field documentation.
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

      /** Town or cho-me. */
      public Builder setTown(String town) {
        this.town = town;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth {
    /** <strong>Required.</strong> The day of birth. */
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
      public PersonCreateParams.DateOfBirth build() {
        return new PersonCreateParams.DateOfBirth(
            this.day, this.extraParams, this.month, this.year);
      }

      /** <strong>Required.</strong> The day of birth. */
      public Builder setDay(Long day) {
        this.day = day;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.DateOfBirth#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.DateOfBirth#extraParams} for the field documentation.
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
      public PersonCreateParams.Documents build() {
        return new PersonCreateParams.Documents(
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
          PersonCreateParams.Documents.CompanyAuthorization companyAuthorization) {
        this.companyAuthorization = companyAuthorization;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.Documents#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** One or more documents showing the person’s passport page with photo and personal data. */
      public Builder setPassport(PersonCreateParams.Documents.Passport passport) {
        this.passport = passport;
        return this;
      }

      /** An identifying document showing the person's name, either a passport or local ID card. */
      public Builder setPrimaryVerification(
          PersonCreateParams.Documents.PrimaryVerification primaryVerification) {
        this.primaryVerification = primaryVerification;
        return this;
      }

      /**
       * A document showing address, either a passport, local ID card, or utility bill from a
       * well-known utility company.
       */
      public Builder setSecondaryVerification(
          PersonCreateParams.Documents.SecondaryVerification secondaryVerification) {
        this.secondaryVerification = secondaryVerification;
        return this;
      }

      /**
       * One or more documents showing the person’s visa required for living in the country where
       * they are residing.
       */
      public Builder setVisa(PersonCreateParams.Documents.Visa visa) {
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
        public PersonCreateParams.Documents.CompanyAuthorization build() {
          return new PersonCreateParams.Documents.CompanyAuthorization(
              this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Documents.CompanyAuthorization#extraParams} for the
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
         * map. See {@link PersonCreateParams.Documents.CompanyAuthorization#extraParams} for the
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
         * PersonCreateParams.Documents.CompanyAuthorization#files} for the field documentation.
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
         * PersonCreateParams.Documents.CompanyAuthorization#files} for the field documentation.
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
        public Builder setType(PersonCreateParams.Documents.CompanyAuthorization.Type type) {
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
        public PersonCreateParams.Documents.Passport build() {
          return new PersonCreateParams.Documents.Passport(this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Documents.Passport#extraParams} for the field
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
         * map. See {@link PersonCreateParams.Documents.Passport#extraParams} for the field
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
         * PersonCreateParams.Documents.Passport#files} for the field documentation.
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
         * PersonCreateParams.Documents.Passport#files} for the field documentation.
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
        public Builder setType(PersonCreateParams.Documents.Passport.Type type) {
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
        public PersonCreateParams.Documents.PrimaryVerification build() {
          return new PersonCreateParams.Documents.PrimaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Documents.PrimaryVerification#extraParams} for the
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
         * map. See {@link PersonCreateParams.Documents.PrimaryVerification#extraParams} for the
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
            PersonCreateParams.Documents.PrimaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonCreateParams.Documents.PrimaryVerification.Type type) {
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
         * <strong>Required.</strong> A <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
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
          public PersonCreateParams.Documents.PrimaryVerification.FrontBack build() {
            return new PersonCreateParams.Documents.PrimaryVerification.FrontBack(
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
           * map. See {@link PersonCreateParams.Documents.PrimaryVerification.FrontBack#extraParams}
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
           * map. See {@link PersonCreateParams.Documents.PrimaryVerification.FrontBack#extraParams}
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
           * <strong>Required.</strong> A <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
           * representing the front of the verification document. The purpose of the uploaded file
           * should be 'identity_document'. The uploaded file needs to be a color image (smaller
           * than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
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
        public PersonCreateParams.Documents.SecondaryVerification build() {
          return new PersonCreateParams.Documents.SecondaryVerification(
              this.extraParams, this.frontBack, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Documents.SecondaryVerification#extraParams} for the
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
         * map. See {@link PersonCreateParams.Documents.SecondaryVerification#extraParams} for the
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
            PersonCreateParams.Documents.SecondaryVerification.FrontBack frontBack) {
          this.frontBack = frontBack;
          return this;
        }

        /**
         * <strong>Required.</strong> The format of the verification document. Currently supports
         * {@code front_back} only.
         */
        public Builder setType(PersonCreateParams.Documents.SecondaryVerification.Type type) {
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
         * <strong>Required.</strong> A <a
         * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
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
          public PersonCreateParams.Documents.SecondaryVerification.FrontBack build() {
            return new PersonCreateParams.Documents.SecondaryVerification.FrontBack(
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
           * PersonCreateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the field
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
           * PersonCreateParams.Documents.SecondaryVerification.FrontBack#extraParams} for the field
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
           * <strong>Required.</strong> A <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
           * representing the front of the verification document. The purpose of the uploaded file
           * should be 'identity_document'. The uploaded file needs to be a color image (smaller
           * than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
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
        public PersonCreateParams.Documents.Visa build() {
          return new PersonCreateParams.Documents.Visa(this.extraParams, this.files, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Documents.Visa#extraParams} for the field
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
         * map. See {@link PersonCreateParams.Documents.Visa#extraParams} for the field
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
         * PersonCreateParams.Documents.Visa#files} for the field documentation.
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
         * PersonCreateParams.Documents.Visa#files} for the field documentation.
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
        public Builder setType(PersonCreateParams.Documents.Visa.Type type) {
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
      public PersonCreateParams.IdNumber build() {
        return new PersonCreateParams.IdNumber(this.extraParams, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.IdNumber#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.IdNumber#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID number type of an individual. */
      public Builder setType(PersonCreateParams.IdNumber.Type type) {
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
    BigDecimal percentOwnership;

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
        BigDecimal percentOwnership,
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

      private BigDecimal percentOwnership;

      private Boolean representative;

      private String title;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonCreateParams.Relationship build() {
        return new PersonCreateParams.Relationship(
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
       * PersonCreateParams.Relationship#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.Relationship#extraParams} for the field documentation.
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
      public Builder setPercentOwnership(BigDecimal percentOwnership) {
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
      public PersonCreateParams.ScriptAddresses build() {
        return new PersonCreateParams.ScriptAddresses(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.ScriptAddresses#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.ScriptAddresses#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Kana Address. */
      public Builder setKana(PersonCreateParams.ScriptAddresses.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Kanji Address. */
      public Builder setKanji(PersonCreateParams.ScriptAddresses.Kanji kanji) {
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
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

      /** Town or cho-me. */
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
        public PersonCreateParams.ScriptAddresses.Kana build() {
          return new PersonCreateParams.ScriptAddresses.Kana(
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
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.ScriptAddresses.Kana#extraParams} for the field
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
         * map. See {@link PersonCreateParams.ScriptAddresses.Kana#extraParams} for the field
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

        /** Town or cho-me. */
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
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

      /** Town or cho-me. */
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
        public PersonCreateParams.ScriptAddresses.Kanji build() {
          return new PersonCreateParams.ScriptAddresses.Kanji(
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
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.ScriptAddresses.Kanji#extraParams} for the field
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
         * map. See {@link PersonCreateParams.ScriptAddresses.Kanji#extraParams} for the field
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

        /** Town or cho-me. */
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
      public PersonCreateParams.ScriptNames build() {
        return new PersonCreateParams.ScriptNames(this.extraParams, this.kana, this.kanji);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.ScriptNames#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.ScriptNames#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Persons name in kana script. */
      public Builder setKana(PersonCreateParams.ScriptNames.Kana kana) {
        this.kana = kana;
        return this;
      }

      /** Persons name in kanji script. */
      public Builder setKanji(PersonCreateParams.ScriptNames.Kanji kanji) {
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
        public PersonCreateParams.ScriptNames.Kana build() {
          return new PersonCreateParams.ScriptNames.Kana(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.ScriptNames.Kana#extraParams} for the field
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
         * map. See {@link PersonCreateParams.ScriptNames.Kana#extraParams} for the field
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
        public PersonCreateParams.ScriptNames.Kanji build() {
          return new PersonCreateParams.ScriptNames.Kanji(
              this.extraParams, this.givenName, this.surname);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.ScriptNames.Kanji#extraParams} for the field
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
         * map. See {@link PersonCreateParams.ScriptNames.Kanji#extraParams} for the field
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
