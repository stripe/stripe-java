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
public class PersonCreateParams extends ApiRequestParams {
  /** Details on the legal guardian's acceptance of the required Stripe agreements. */
  @SerializedName("additional_tos_acceptances")
  AdditionalTosAcceptances additionalTosAcceptances;

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
   * The person's ID number, as appropriate for their country. For example, a social security number
   * in the U.S., social insurance number in Canada, etc. Instead of the number itself, you can also
   * provide a <a href="https://stripe.com/docs/js/tokens/create_token?type=pii">PII token provided
   * by Stripe.js</a>.
   */
  @SerializedName("id_number")
  String idNumber;

  /**
   * The person's secondary ID number, as appropriate for their country, will be used for enhanced
   * verification checks. In Thailand, this would be the laser code found on the back of an ID card.
   * Instead of the number itself, you can also provide a <a
   * href="https://stripe.com/docs/js/tokens/create_token?type=pii">PII token provided by
   * Stripe.js</a>.
   */
  @SerializedName("id_number_secondary")
  String idNumberSecondary;

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
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
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

  /**
   * A <a href="https://stripe.com/docs/connect/account-tokens">person token</a>, used to securely
   * provide details to the person.
   */
  @SerializedName("person_token")
  String personToken;

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

  /** The person's registered address. */
  @SerializedName("registered_address")
  RegisteredAddress registeredAddress;

  /** The relationship that this person has with the account's legal entity. */
  @SerializedName("relationship")
  Relationship relationship;

  /** The last four digits of the person's Social Security number (U.S. only). */
  @SerializedName("ssn_last_4")
  String ssnLast4;

  /** The person's verification status. */
  @SerializedName("verification")
  Verification verification;

  private PersonCreateParams(
      AdditionalTosAcceptances additionalTosAcceptances,
      Address address,
      AddressKana addressKana,
      AddressKanji addressKanji,
      Object dob,
      Documents documents,
      String email,
      List<String> expand,
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
      String nationality,
      String personToken,
      String phone,
      String politicalExposure,
      RegisteredAddress registeredAddress,
      Relationship relationship,
      String ssnLast4,
      Verification verification) {
    this.additionalTosAcceptances = additionalTosAcceptances;
    this.address = address;
    this.addressKana = addressKana;
    this.addressKanji = addressKanji;
    this.dob = dob;
    this.documents = documents;
    this.email = email;
    this.expand = expand;
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
    this.nationality = nationality;
    this.personToken = personToken;
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
    private AdditionalTosAcceptances additionalTosAcceptances;

    private Address address;

    private AddressKana addressKana;

    private AddressKanji addressKanji;

    private Object dob;

    private Documents documents;

    private String email;

    private List<String> expand;

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

    private String nationality;

    private String personToken;

    private String phone;

    private String politicalExposure;

    private RegisteredAddress registeredAddress;

    private Relationship relationship;

    private String ssnLast4;

    private Verification verification;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonCreateParams build() {
      return new PersonCreateParams(
          this.additionalTosAcceptances,
          this.address,
          this.addressKana,
          this.addressKanji,
          this.dob,
          this.documents,
          this.email,
          this.expand,
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
          this.nationality,
          this.personToken,
          this.phone,
          this.politicalExposure,
          this.registeredAddress,
          this.relationship,
          this.ssnLast4,
          this.verification);
    }

    /** Details on the legal guardian's acceptance of the required Stripe agreements. */
    public Builder setAdditionalTosAcceptances(
        PersonCreateParams.AdditionalTosAcceptances additionalTosAcceptances) {
      this.additionalTosAcceptances = additionalTosAcceptances;
      return this;
    }

    /** The person's address. */
    public Builder setAddress(PersonCreateParams.Address address) {
      this.address = address;
      return this;
    }

    /** The Kana variation of the person's address (Japan only). */
    public Builder setAddressKana(PersonCreateParams.AddressKana addressKana) {
      this.addressKana = addressKana;
      return this;
    }

    /** The Kanji variation of the person's address (Japan only). */
    public Builder setAddressKanji(PersonCreateParams.AddressKanji addressKanji) {
      this.addressKanji = addressKanji;
      return this;
    }

    /** The person's date of birth. */
    public Builder setDob(PersonCreateParams.Dob dob) {
      this.dob = dob;
      return this;
    }

    /** The person's date of birth. */
    public Builder setDob(EmptyParam dob) {
      this.dob = dob;
      return this;
    }

    /** Documents that may be submitted to satisfy various informational requests. */
    public Builder setDocuments(PersonCreateParams.Documents documents) {
      this.documents = documents;
      return this;
    }

    /** The person's email address. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#expand} for the field documentation.
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
     * PersonCreateParams#expand} for the field documentation.
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
     * PersonCreateParams#fullNameAliases} for the field documentation.
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
     * Add all elements to `fullNameAliases` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PersonCreateParams#fullNameAliases} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllFullNameAlias(List<String> elements) {
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
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself, you
     * can also provide a <a href="https://stripe.com/docs/js/tokens/create_token?type=pii">PII
     * token provided by Stripe.js</a>.
     */
    public Builder setIdNumber(String idNumber) {
      this.idNumber = idNumber;
      return this;
    }

    /**
     * The person's secondary ID number, as appropriate for their country, will be used for enhanced
     * verification checks. In Thailand, this would be the laser code found on the back of an ID
     * card. Instead of the number itself, you can also provide a <a
     * href="https://stripe.com/docs/js/tokens/create_token?type=pii">PII token provided by
     * Stripe.js</a>.
     */
    public Builder setIdNumberSecondary(String idNumberSecondary) {
      this.idNumberSecondary = idNumberSecondary;
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonCreateParams#metadata} for the field documentation.
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
     * See {@link PersonCreateParams#metadata} for the field documentation.
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
     * The country where the person is a national. Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>), or
     * &quot;XX&quot; if unavailable.
     */
    public Builder setNationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    /**
     * A <a href="https://stripe.com/docs/connect/account-tokens">person token</a>, used to securely
     * provide details to the person.
     */
    public Builder setPersonToken(String personToken) {
      this.personToken = personToken;
      return this;
    }

    /** The person's phone number. */
    public Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Indicates if the person or any of their representatives, family members, or other closely
     * related persons, declares that they hold or have held an important public job or function, in
     * any jurisdiction.
     */
    public Builder setPoliticalExposure(String politicalExposure) {
      this.politicalExposure = politicalExposure;
      return this;
    }

    /** The person's registered address. */
    public Builder setRegisteredAddress(PersonCreateParams.RegisteredAddress registeredAddress) {
      this.registeredAddress = registeredAddress;
      return this;
    }

    /** The relationship that this person has with the account's legal entity. */
    public Builder setRelationship(PersonCreateParams.Relationship relationship) {
      this.relationship = relationship;
      return this;
    }

    /** The last four digits of the person's Social Security number (U.S. only). */
    public Builder setSsnLast4(String ssnLast4) {
      this.ssnLast4 = ssnLast4;
      return this;
    }

    /** The person's verification status. */
    public Builder setVerification(PersonCreateParams.Verification verification) {
      this.verification = verification;
      return this;
    }
  }

  @Getter
  public static class AdditionalTosAcceptances {
    /** Details on the legal guardian's acceptance of the main Stripe service agreement. */
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

    private AdditionalTosAcceptances(Account account, Map<String, Object> extraParams) {
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
      public PersonCreateParams.AdditionalTosAcceptances build() {
        return new PersonCreateParams.AdditionalTosAcceptances(this.account, this.extraParams);
      }

      /** Details on the legal guardian's acceptance of the main Stripe service agreement. */
      public Builder setAccount(PersonCreateParams.AdditionalTosAcceptances.Account account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AdditionalTosAcceptances#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AdditionalTosAcceptances#extraParams} for the field
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
    public static class Account {
      /**
       * The Unix timestamp marking when the account representative accepted the service agreement.
       */
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

      /** The IP address from which the account representative accepted the service agreement. */
      @SerializedName("ip")
      String ip;

      /**
       * The user agent of the browser from which the account representative accepted the service
       * agreement.
       */
      @SerializedName("user_agent")
      Object userAgent;

      private Account(Long date, Map<String, Object> extraParams, String ip, Object userAgent) {
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
        public PersonCreateParams.AdditionalTosAcceptances.Account build() {
          return new PersonCreateParams.AdditionalTosAcceptances.Account(
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
         * map. See {@link PersonCreateParams.AdditionalTosAcceptances.Account#extraParams} for the
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
         * map. See {@link PersonCreateParams.AdditionalTosAcceptances.Account#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The IP address from which the account representative accepted the service agreement. */
        public Builder setIp(String ip) {
          this.ip = ip;
          return this;
        }

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }

        /**
         * The user agent of the browser from which the account representative accepted the service
         * agreement.
         */
        public Builder setUserAgent(EmptyParam userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
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
      public PersonCreateParams.Address build() {
        return new PersonCreateParams.Address(
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public PersonCreateParams.AddressKana build() {
        return new PersonCreateParams.AddressKana(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AddressKana#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AddressKana#extraParams} for the field documentation.
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public PersonCreateParams.AddressKanji build() {
        return new PersonCreateParams.AddressKanji(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.AddressKanji#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.AddressKanji#extraParams} for the field documentation.
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public PersonCreateParams.Dob build() {
        return new PersonCreateParams.Dob(this.day, this.extraParams, this.month, this.year);
      }

      /** <strong>Required.</strong> The day of birth, between 1 and 31. */
      public Builder setDay(Long day) {
        this.day = day;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.Dob#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.Dob#extraParams} for the field documentation.
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

    /** One or more documents showing the person's passport page with photo and personal data. */
    @SerializedName("passport")
    Passport passport;

    /**
     * One or more documents showing the person's visa required for living in the country where they
     * are residing.
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
      public PersonCreateParams.Documents build() {
        return new PersonCreateParams.Documents(
            this.companyAuthorization, this.extraParams, this.passport, this.visa);
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

      /** One or more documents showing the person's passport page with photo and personal data. */
      public Builder setPassport(PersonCreateParams.Documents.Passport passport) {
        this.passport = passport;
        return this;
      }

      /**
       * One or more documents showing the person's visa required for living in the country where
       * they are residing.
       */
      public Builder setVisa(PersonCreateParams.Documents.Visa visa) {
        this.visa = visa;
        return this;
      }
    }

    @Getter
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
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
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
        public PersonCreateParams.Documents.CompanyAuthorization build() {
          return new PersonCreateParams.Documents.CompanyAuthorization(
              this.extraParams, this.files);
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
      }
    }

    @Getter
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
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
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
        public PersonCreateParams.Documents.Passport build() {
          return new PersonCreateParams.Documents.Passport(this.extraParams, this.files);
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
      }
    }

    @Getter
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
       * One or more document ids returned by a <a
       * href="https://stripe.com/docs/api#create_file">file upload</a> with a {@code purpose} value
       * of {@code account_requirement}.
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
        public PersonCreateParams.Documents.Visa build() {
          return new PersonCreateParams.Documents.Visa(this.extraParams, this.files);
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
      public PersonCreateParams.RegisteredAddress build() {
        return new PersonCreateParams.RegisteredAddress(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.RegisteredAddress#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.RegisteredAddress#extraParams} for the field documentation.
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
  public static class Relationship {
    /**
     * Whether the person is a director of the account's legal entity. Directors are typically
     * members of the governing board of the company, or responsible for ensuring the company meets
     * its regulatory obligations.
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Whether the person is the legal guardian of the account's representative. */
    @SerializedName("legal_guardian")
    Boolean legalGuardian;

    /** Whether the person is an owner of the account’s legal entity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percent owned by the person of the account's legal entity. */
    @SerializedName("percent_ownership")
    Object percentOwnership;

    /**
     * Whether the person is authorized as the primary representative of the account. This is the
     * person nominated by the business to provide information about themselves, and general
     * information about the account. There can only be one representative at any given time. At the
     * time the account is created, this person should be set to the person responsible for opening
     * the account.
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
        Boolean legalGuardian,
        Boolean owner,
        Object percentOwnership,
        Boolean representative,
        String title) {
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
      private Boolean director;

      private Boolean executive;

      private Map<String, Object> extraParams;

      private Boolean legalGuardian;

      private Boolean owner;

      private Object percentOwnership;

      private Boolean representative;

      private String title;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonCreateParams.Relationship build() {
        return new PersonCreateParams.Relationship(
            this.director,
            this.executive,
            this.extraParams,
            this.legalGuardian,
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

      /** Whether the person is the legal guardian of the account's representative. */
      public Builder setLegalGuardian(Boolean legalGuardian) {
        this.legalGuardian = legalGuardian;
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
       * Whether the person is authorized as the primary representative of the account. This is the
       * person nominated by the business to provide information about themselves, and general
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Verification(
        AdditionalDocument additionalDocument, Document document, Map<String, Object> extraParams) {
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
      public PersonCreateParams.Verification build() {
        return new PersonCreateParams.Verification(
            this.additionalDocument, this.document, this.extraParams);
      }

      /**
       * A document showing address, either a passport, local ID card, or utility bill from a
       * well-known utility company.
       */
      public Builder setAdditionalDocument(
          PersonCreateParams.Verification.AdditionalDocument additionalDocument) {
        this.additionalDocument = additionalDocument;
        return this;
      }

      /** An identifying document, either a passport or local ID card. */
      public Builder setDocument(PersonCreateParams.Verification.Document document) {
        this.document = document;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCreateParams.Verification#extraParams} for the field documentation.
       */
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
       * See {@link PersonCreateParams.Verification#extraParams} for the field documentation.
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public PersonCreateParams.Verification.AdditionalDocument build() {
          return new PersonCreateParams.Verification.AdditionalDocument(
              this.back, this.extraParams, this.front);
        }

        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        public Builder setBack(String back) {
          this.back = back;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Verification.AdditionalDocument#extraParams} for the
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
         * map. See {@link PersonCreateParams.Verification.AdditionalDocument#extraParams} for the
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
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public PersonCreateParams.Verification.Document build() {
          return new PersonCreateParams.Verification.Document(
              this.back, this.extraParams, this.front);
        }

        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        public Builder setBack(String back) {
          this.back = back;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCreateParams.Verification.Document#extraParams} for the field
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
         * map. See {@link PersonCreateParams.Verification.Document#extraParams} for the field
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
         * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}. The uploaded file
         * needs to be a color image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format,
         * and less than 10 MB in size.
         */
        public Builder setFront(String front) {
          this.front = front;
          return this;
        }
      }
    }
  }
}
