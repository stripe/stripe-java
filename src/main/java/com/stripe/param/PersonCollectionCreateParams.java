package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionCreateParams extends ApiRequestParams {

  /** The person's address. */
  @SerializedName("address")
  PersonCollectionCreateParams.Address address;

  /** The Kana variation of the person's address (Japan only). */
  @SerializedName("address_kana")
  PersonCollectionCreateParams.AddressKana addressKana;

  /** The Kanji variation of the person's address (Japan only). */
  @SerializedName("address_kanji")
  PersonCollectionCreateParams.AddressKanji addressKanji;

  /** The person's date of birth. */
  @SerializedName("dob")
  PersonCollectionCreateParams.Dob dob;

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

  /** The person's gender (International regulations require either "male" or "female"). */
  @SerializedName("gender")
  String gender;

  /**
   * The person's ID number, as appropriate for their country. For example, a social security number
   * in the U.S., social insurance number in Canada, etc. Instead of the number itself, you can also
   * provide a [PII token provided by
   * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A [person token](https://stripe.com/docs/connect/account-tokens), used to securely provide
   * details to the person.
   */
  @SerializedName("person_token")
  String personToken;

  /** The person's phone number. */
  @SerializedName("phone")
  String phone;

  /** The relationship that this person has with the account's legal entity. */
  @SerializedName("relationship")
  PersonCollectionCreateParams.Relationship relationship;

  /** The last 4 digits of the person's social security number. */
  @SerializedName("ssn_last_4")
  String ssnLast4;

  /** The person's verification status. */
  @SerializedName("verification")
  PersonCollectionCreateParams.Verification verification;

  private PersonCollectionCreateParams(
      PersonCollectionCreateParams.Address address,
      PersonCollectionCreateParams.AddressKana addressKana,
      PersonCollectionCreateParams.AddressKanji addressKanji,
      PersonCollectionCreateParams.Dob dob,
      String email,
      List<String> expand,
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
      String personToken,
      String phone,
      PersonCollectionCreateParams.Relationship relationship,
      String ssnLast4,
      PersonCollectionCreateParams.Verification verification) {

    this.address = address;
    this.addressKana = addressKana;
    this.addressKanji = addressKanji;
    this.dob = dob;
    this.email = email;
    this.expand = expand;
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
    this.personToken = personToken;
    this.phone = phone;
    this.relationship = relationship;
    this.ssnLast4 = ssnLast4;
    this.verification = verification;
  }

  public static PersonCollectionCreateParams.Builder builder() {
    return new PersonCollectionCreateParams.Builder();
  }

  public static class Builder {
    private PersonCollectionCreateParams.Address address;
    private PersonCollectionCreateParams.AddressKana addressKana;
    private PersonCollectionCreateParams.AddressKanji addressKanji;
    private PersonCollectionCreateParams.Dob dob;
    private String email;
    private List<String> expand;
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
    private String personToken;
    private String phone;
    private PersonCollectionCreateParams.Relationship relationship;
    private String ssnLast4;
    private PersonCollectionCreateParams.Verification verification;

    public PersonCollectionCreateParams build() {
      return new PersonCollectionCreateParams(
          this.address,
          this.addressKana,
          this.addressKanji,
          this.dob,
          this.email,
          this.expand,
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
          this.personToken,
          this.phone,
          this.relationship,
          this.ssnLast4,
          this.verification);
    }

    /** The person's address. */
    public PersonCollectionCreateParams.Builder setAddress(
        PersonCollectionCreateParams.Address address) {

      this.address = address;
      return this;
    }

    /** The Kana variation of the person's address (Japan only). */
    public PersonCollectionCreateParams.Builder setAddressKana(
        PersonCollectionCreateParams.AddressKana addressKana) {

      this.addressKana = addressKana;
      return this;
    }

    /** The Kanji variation of the person's address (Japan only). */
    public PersonCollectionCreateParams.Builder setAddressKanji(
        PersonCollectionCreateParams.AddressKanji addressKanji) {

      this.addressKanji = addressKanji;
      return this;
    }

    /** The person's date of birth. */
    public PersonCollectionCreateParams.Builder setDob(PersonCollectionCreateParams.Dob dob) {

      this.dob = dob;
      return this;
    }

    /** The person's email address. */
    public PersonCollectionCreateParams.Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonCollectionCreateParams#expand} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonCollectionCreateParams#expand} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonCollectionCreateParams#extraParams} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PersonCollectionCreateParams#extraParams} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The person's first name. */
    public PersonCollectionCreateParams.Builder setFirstName(String firstName) {

      this.firstName = firstName;
      return this;
    }

    /** The Kana variation of the person's first name (Japan only). */
    public PersonCollectionCreateParams.Builder setFirstNameKana(String firstNameKana) {

      this.firstNameKana = firstNameKana;
      return this;
    }

    /** The Kanji variation of the person's first name (Japan only). */
    public PersonCollectionCreateParams.Builder setFirstNameKanji(String firstNameKanji) {

      this.firstNameKanji = firstNameKanji;
      return this;
    }

    /** The person's gender (International regulations require either "male" or "female"). */
    public PersonCollectionCreateParams.Builder setGender(String gender) {
      this.gender = gender;
      return this;
    }

    /**
     * The person's ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself, you
     * can also provide a [PII token provided by
     * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
     */
    public PersonCollectionCreateParams.Builder setIdNumber(String idNumber) {

      this.idNumber = idNumber;
      return this;
    }

    /** The person's last name. */
    public PersonCollectionCreateParams.Builder setLastName(String lastName) {

      this.lastName = lastName;
      return this;
    }

    /** The Kana variation of the person's last name (Japan only). */
    public PersonCollectionCreateParams.Builder setLastNameKana(String lastNameKana) {

      this.lastNameKana = lastNameKana;
      return this;
    }

    /** The Kanji variation of the person's last name (Japan only). */
    public PersonCollectionCreateParams.Builder setLastNameKanji(String lastNameKanji) {

      this.lastNameKanji = lastNameKanji;
      return this;
    }

    /** The person's maiden name. */
    public PersonCollectionCreateParams.Builder setMaidenName(String maidenName) {

      this.maidenName = maidenName;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonCollectionCreateParams#metadata} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PersonCollectionCreateParams#metadata} for the field documentation.
     */
    public PersonCollectionCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * A [person token](https://stripe.com/docs/connect/account-tokens), used to securely provide
     * details to the person.
     */
    public PersonCollectionCreateParams.Builder setPersonToken(String personToken) {

      this.personToken = personToken;
      return this;
    }

    /** The person's phone number. */
    public PersonCollectionCreateParams.Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /** The relationship that this person has with the account's legal entity. */
    public PersonCollectionCreateParams.Builder setRelationship(
        PersonCollectionCreateParams.Relationship relationship) {

      this.relationship = relationship;
      return this;
    }

    /** The last 4 digits of the person's social security number. */
    public PersonCollectionCreateParams.Builder setSsnLast4(String ssnLast4) {

      this.ssnLast4 = ssnLast4;
      return this;
    }

    /** The person's verification status. */
    public PersonCollectionCreateParams.Builder setVerification(
        PersonCollectionCreateParams.Verification verification) {

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

    public static PersonCollectionCreateParams.Address.Builder builder() {
      return new PersonCollectionCreateParams.Address.Builder();
    }

    public static class Builder {
      private String city;
      private String country;
      private Map<String, Object> extraParams;
      private String line1;
      private String line2;
      private String postalCode;
      private String state;

      public PersonCollectionCreateParams.Address build() {
        return new PersonCollectionCreateParams.Address(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.state);
      }

      /** City, district, suburb, town, or village. */
      public PersonCollectionCreateParams.Address.Builder setCity(String city) {

        this.city = city;
        return this;
      }

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
       */
      public PersonCollectionCreateParams.Address.Builder setCountry(String country) {

        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Address#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Address.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.Address#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Address.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Address line 1 (e.g., street, PO Box, or company name). */
      public PersonCollectionCreateParams.Address.Builder setLine1(String line1) {

        this.line1 = line1;
        return this;
      }

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      public PersonCollectionCreateParams.Address.Builder setLine2(String line2) {

        this.line2 = line2;
        return this;
      }

      /** ZIP or postal code. */
      public PersonCollectionCreateParams.Address.Builder setPostalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
      }

      /** State, county, province, or region. */
      public PersonCollectionCreateParams.Address.Builder setState(String state) {

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

    public static PersonCollectionCreateParams.AddressKana.Builder builder() {

      return new PersonCollectionCreateParams.AddressKana.Builder();
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

      public PersonCollectionCreateParams.AddressKana build() {
        return new PersonCollectionCreateParams.AddressKana(
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
      public PersonCollectionCreateParams.AddressKana.Builder setCity(String city) {

        this.city = city;
        return this;
      }

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
       */
      public PersonCollectionCreateParams.AddressKana.Builder setCountry(String country) {

        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.AddressKana#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.AddressKana.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.AddressKana#extraParams} for the field
       * documentation.
       */
      public PersonCollectionCreateParams.AddressKana.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Block or building number. */
      public PersonCollectionCreateParams.AddressKana.Builder setLine1(String line1) {

        this.line1 = line1;
        return this;
      }

      /** Building details. */
      public PersonCollectionCreateParams.AddressKana.Builder setLine2(String line2) {

        this.line2 = line2;
        return this;
      }

      /** Postal code. */
      public PersonCollectionCreateParams.AddressKana.Builder setPostalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
      }

      /** Prefecture. */
      public PersonCollectionCreateParams.AddressKana.Builder setState(String state) {

        this.state = state;
        return this;
      }

      /** Town or cho-me. */
      public PersonCollectionCreateParams.AddressKana.Builder setTown(String town) {

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

    public static PersonCollectionCreateParams.AddressKanji.Builder builder() {

      return new PersonCollectionCreateParams.AddressKanji.Builder();
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

      public PersonCollectionCreateParams.AddressKanji build() {
        return new PersonCollectionCreateParams.AddressKanji(
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
      public PersonCollectionCreateParams.AddressKanji.Builder setCity(String city) {

        this.city = city;
        return this;
      }

      /**
       * Two-letter country code ([ISO 3166-1
       * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
       */
      public PersonCollectionCreateParams.AddressKanji.Builder setCountry(String country) {

        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.AddressKanji#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.AddressKanji.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.AddressKanji#extraParams} for the field
       * documentation.
       */
      public PersonCollectionCreateParams.AddressKanji.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Block or building number. */
      public PersonCollectionCreateParams.AddressKanji.Builder setLine1(String line1) {

        this.line1 = line1;
        return this;
      }

      /** Building details. */
      public PersonCollectionCreateParams.AddressKanji.Builder setLine2(String line2) {

        this.line2 = line2;
        return this;
      }

      /** Postal code. */
      public PersonCollectionCreateParams.AddressKanji.Builder setPostalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
      }

      /** Prefecture. */
      public PersonCollectionCreateParams.AddressKanji.Builder setState(String state) {

        this.state = state;
        return this;
      }

      /** Town or cho-me. */
      public PersonCollectionCreateParams.AddressKanji.Builder setTown(String town) {

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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

    public static PersonCollectionCreateParams.Dob.Builder builder() {
      return new PersonCollectionCreateParams.Dob.Builder();
    }

    public static class Builder {
      private Long day;
      private Map<String, Object> extraParams;
      private Long month;
      private Long year;

      public PersonCollectionCreateParams.Dob build() {
        return new PersonCollectionCreateParams.Dob(
            this.day, this.extraParams, this.month, this.year);
      }

      /** The day of birth, between 1 and 31. */
      public PersonCollectionCreateParams.Dob.Builder setDay(Long day) {
        this.day = day;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Dob#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Dob.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.Dob#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Dob.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The month of birth, between 1 and 12. */
      public PersonCollectionCreateParams.Dob.Builder setMonth(Long month) {

        this.month = month;
        return this;
      }

      /** The four-digit year of birth. */
      public PersonCollectionCreateParams.Dob.Builder setYear(Long year) {
        this.year = year;
        return this;
      }
    }
  }

  public static class Relationship {

    /**
     * Whether the person opened the account. This person provides information about themselves, and
     * general information about the account.
     */
    @SerializedName("account_opener")
    Boolean accountOpener;

    /**
     * Whether the person is a director of the account's legal entity. Currently only required for
     * accounts in the EU. Directors are typically members of the governing board of the company, or
     * responsible for ensuring the company meets its regulatory obligations.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
        Boolean accountOpener,
        Boolean director,
        Map<String, Object> extraParams,
        Boolean owner,
        Object percentOwnership,
        String title) {

      this.accountOpener = accountOpener;
      this.director = director;
      this.extraParams = extraParams;
      this.owner = owner;
      this.percentOwnership = percentOwnership;
      this.title = title;
    }

    public static PersonCollectionCreateParams.Relationship.Builder builder() {

      return new PersonCollectionCreateParams.Relationship.Builder();
    }

    public static class Builder {
      private Boolean accountOpener;
      private Boolean director;
      private Map<String, Object> extraParams;
      private Boolean owner;
      private Object percentOwnership;
      private String title;

      public PersonCollectionCreateParams.Relationship build() {
        return new PersonCollectionCreateParams.Relationship(
            this.accountOpener,
            this.director,
            this.extraParams,
            this.owner,
            this.percentOwnership,
            this.title);
      }

      /**
       * Whether the person opened the account. This person provides information about themselves,
       * and general information about the account.
       */
      public PersonCollectionCreateParams.Relationship.Builder setAccountOpener(
          Boolean accountOpener) {

        this.accountOpener = accountOpener;
        return this;
      }

      /**
       * Whether the person is a director of the account's legal entity. Currently only required for
       * accounts in the EU. Directors are typically members of the governing board of the company,
       * or responsible for ensuring the company meets its regulatory obligations.
       */
      public PersonCollectionCreateParams.Relationship.Builder setDirector(Boolean director) {

        this.director = director;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Relationship#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Relationship.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.Relationship#extraParams} for the field
       * documentation.
       */
      public PersonCollectionCreateParams.Relationship.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Whether the person is an owner of the account’s legal entity. */
      public PersonCollectionCreateParams.Relationship.Builder setOwner(Boolean owner) {

        this.owner = owner;
        return this;
      }

      /** The percent owned by the person of the account's legal entity. */
      public PersonCollectionCreateParams.Relationship.Builder setPercentOwnership(
          BigDecimal percentOwnership) {

        this.percentOwnership = percentOwnership;
        return this;
      }

      /** The percent owned by the person of the account's legal entity. */
      public PersonCollectionCreateParams.Relationship.Builder setPercentOwnership(
          EmptyParam percentOwnership) {

        this.percentOwnership = percentOwnership;
        return this;
      }

      /** The person's title (e.g., CEO, Support Engineer). */
      public PersonCollectionCreateParams.Relationship.Builder setTitle(String title) {

        this.title = title;
        return this;
      }
    }
  }

  public static class Verification {

    /** An identifying document, either a passport or local ID card. */
    @SerializedName("document")
    PersonCollectionCreateParams.Verification.Document document;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Verification(
        PersonCollectionCreateParams.Verification.Document document,
        Map<String, Object> extraParams) {

      this.document = document;
      this.extraParams = extraParams;
    }

    public static PersonCollectionCreateParams.Verification.Builder builder() {

      return new PersonCollectionCreateParams.Verification.Builder();
    }

    public static class Builder {
      private PersonCollectionCreateParams.Verification.Document document;
      private Map<String, Object> extraParams;

      public PersonCollectionCreateParams.Verification build() {
        return new PersonCollectionCreateParams.Verification(this.document, this.extraParams);
      }

      /** An identifying document, either a passport or local ID card. */
      public PersonCollectionCreateParams.Verification.Builder setDocument(
          PersonCollectionCreateParams.Verification.Document document) {

        this.document = document;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Verification#extraParams} for the field documentation.
       */
      public PersonCollectionCreateParams.Verification.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PersonCollectionCreateParams.Verification#extraParams} for the field
       * documentation.
       */
      public PersonCollectionCreateParams.Verification.Builder putAllExtraParam(
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      public static PersonCollectionCreateParams.Verification.Document.Builder builder() {

        return new PersonCollectionCreateParams.Verification.Document.Builder();
      }

      public static class Builder {
        private String back;
        private Map<String, Object> extraParams;
        private String front;

        public PersonCollectionCreateParams.Verification.Document build() {

          return new PersonCollectionCreateParams.Verification.Document(
              this.back, this.extraParams, this.front);
        }

        /**
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`.
         */
        public PersonCollectionCreateParams.Verification.Document.Builder setBack(String back) {

          this.back = back;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCollectionCreateParams.Verification.Document#extraParams} for the
         * field documentation.
         */
        public PersonCollectionCreateParams.Verification.Document.Builder putExtraParam(
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
         * map. See {@link PersonCollectionCreateParams.Verification.Document#extraParams} for the
         * field documentation.
         */
        public PersonCollectionCreateParams.Verification.Document.Builder putAllExtraParam(
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
        public PersonCollectionCreateParams.Verification.Document.Builder setFront(String front) {

          this.front = front;
          return this;
        }
      }
    }
  }
}
