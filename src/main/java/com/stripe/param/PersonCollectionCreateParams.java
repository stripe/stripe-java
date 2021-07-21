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
public class PersonCollectionCreateParams extends ApiRequestParams {
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

  /**
   * The person's gender (International regulations require either &quot;male&quot; or
   * &quot;female&quot;).
   */
  @SerializedName("gender")
  String gender;

  /**
   * The person's ID number, as appropriate for their country. For example, a social security number
   * in the U.S., social insurance number in Canada, etc. Instead of the number itself, you can also
   * provide a <a href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token
   * provided by Stripe.js</a>.
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

  /** The relationship that this person has with the account's legal entity. */
  @SerializedName("relationship")
  Relationship relationship;

  /** The last four digits of the person's Social Security number (U.S. only). */
  @SerializedName("ssn_last_4")
  String ssnLast4;

  /** The person's verification status. */
  @SerializedName("verification")
  Verification verification;

  private PersonCollectionCreateParams(
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
      String gender,
      String idNumber,
      String lastName,
      String lastNameKana,
      String lastNameKanji,
      String maidenName,
      Object metadata,
      String nationality,
      String personToken,
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
    this.nationality = nationality;
    this.personToken = personToken;
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

    private Object metadata;

    private String nationality;

    private String personToken;

    private String phone;

    private String politicalExposure;

    private Relationship relationship;

    private String ssnLast4;

    private Verification verification;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonCollectionCreateParams build() {
      return new PersonCollectionCreateParams(
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
          this.gender,
          this.idNumber,
          this.lastName,
          this.lastNameKana,
          this.lastNameKanji,
          this.maidenName,
          this.metadata,
          this.nationality,
          this.personToken,
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
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonCollectionCreateParams#expand} for the field documentation.
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
     * PersonCollectionCreateParams#expand} for the field documentation.
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
     * PersonCollectionCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link PersonCollectionCreateParams#extraParams} for the field documentation.
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
     * can also provide a <a
     * href="https://stripe.com/docs/js/tokens_sources/create_token?type=pii">PII token provided by
     * Stripe.js</a>.
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonCollectionCreateParams#metadata} for the field documentation.
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
     * See {@link PersonCollectionCreateParams#metadata} for the field documentation.
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Address#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.Address#extraParams} for the field documentation.
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.AddressKana#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.AddressKana#extraParams} for the field
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.AddressKanji#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.AddressKanji#extraParams} for the field
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Dob#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.Dob#extraParams} for the field documentation.
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
      public Documents build() {
        return new Documents(this.companyAuthorization, this.extraParams, this.passport, this.visa);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Documents#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.Documents#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** One or more documents showing the person's passport page with photo and personal data. */
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
        public CompanyAuthorization build() {
          return new CompanyAuthorization(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCollectionCreateParams.Documents.CompanyAuthorization#extraParams}
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
         * map. See {@link PersonCollectionCreateParams.Documents.CompanyAuthorization#extraParams}
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
         * PersonCollectionCreateParams.Documents.CompanyAuthorization#files} for the field
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
         * PersonCollectionCreateParams.Documents.CompanyAuthorization#files} for the field
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
        public Passport build() {
          return new Passport(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCollectionCreateParams.Documents.Passport#extraParams} for the
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
         * map. See {@link PersonCollectionCreateParams.Documents.Passport#extraParams} for the
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
         * PersonCollectionCreateParams.Documents.Passport#files} for the field documentation.
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
         * PersonCollectionCreateParams.Documents.Passport#files} for the field documentation.
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
        public Visa build() {
          return new Visa(this.extraParams, this.files);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PersonCollectionCreateParams.Documents.Visa#extraParams} for the field
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
         * map. See {@link PersonCollectionCreateParams.Documents.Visa#extraParams} for the field
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
         * PersonCollectionCreateParams.Documents.Visa#files} for the field documentation.
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
         * PersonCollectionCreateParams.Documents.Visa#files} for the field documentation.
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
     * Whether the person is a director of the account's legal entity. Currently only required for
     * accounts in the EU. Directors are typically members of the governing board of the company, or
     * responsible for ensuring the company meets its regulatory obligations.
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
       * Whether the person is a director of the account's legal entity. Currently only required for
       * accounts in the EU. Directors are typically members of the governing board of the company,
       * or responsible for ensuring the company meets its regulatory obligations.
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
       * PersonCollectionCreateParams.Relationship#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.Relationship#extraParams} for the field
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonCollectionCreateParams.Verification#extraParams} for the field documentation.
       */
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
       * See {@link PersonCollectionCreateParams.Verification#extraParams} for the field
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
        public AdditionalDocument build() {
          return new AdditionalDocument(this.back, this.extraParams, this.front);
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
         * map. See {@link PersonCollectionCreateParams.Verification.AdditionalDocument#extraParams}
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
         * map. See {@link PersonCollectionCreateParams.Verification.AdditionalDocument#extraParams}
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
        public Document build() {
          return new Document(this.back, this.extraParams, this.front);
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
         * map. See {@link PersonCollectionCreateParams.Verification.Document#extraParams} for the
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
         * map. See {@link PersonCollectionCreateParams.Verification.Document#extraParams} for the
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
  }
}
