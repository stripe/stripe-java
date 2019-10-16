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
public class TokenCreateParams extends ApiRequestParams {
  /** The bank account this token will represent. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  @SerializedName("card")
  Object card;

  /**
   * The customer (owned by the application's account) for which to create a token. For use only
   * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
   * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
   * header](https://stripe.com/docs/connect/authentication). For more details, see [Cloning Saved
   * Payment Methods](https://stripe.com/docs/connect/cloning-saved-payment-methods).
   */
  @SerializedName("customer")
  String customer;

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
      BankAccount bankAccount,
      Object card,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Person person,
      Pii pii) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.person = person;
    this.pii = pii;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankAccount bankAccount;

    private Object card;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Person person;

    private Pii pii;

    /** Finalize and obtain parameter instance from this builder. */
    public TokenCreateParams build() {
      return new TokenCreateParams(
          this.bankAccount,
          this.card,
          this.customer,
          this.expand,
          this.extraParams,
          this.person,
          this.pii);
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
     * The customer (owned by the application's account) for which to create a token. For use only
     * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
     * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
     * header](https://stripe.com/docs/connect/authentication). For more details, see [Cloning Saved
     * Payment Methods](https://stripe.com/docs/connect/cloning-saved-payment-methods).
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
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
  public static class BankAccount {
    /**
     * The name of the person or business that owns the bank account.This field is required when
     * attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /**
     * The type of entity that holds the account. It can be `company` or `individual`. This field is
     * required when attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The account number for the bank account, in string form. Must be a checking account. */
    @SerializedName("account_number")
    String accountNumber;

    /** The country in which the bank account is located. */
    @SerializedName("country")
    String country;

    /**
     * The currency the bank account is in. This must be a country/currency pairing that [Stripe
     * supports.](docs/payouts)
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
     * wire routing number. If you are providing an IBAN for`account_number`, this field is not
     * required.
     */
    @SerializedName("routing_number")
    String routingNumber;

    private BankAccount(
        String accountHolderName,
        AccountHolderType accountHolderType,
        String accountNumber,
        String country,
        String currency,
        Map<String, Object> extraParams,
        String routingNumber) {
      this.accountHolderName = accountHolderName;
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
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
            this.country,
            this.currency,
            this.extraParams,
            this.routingNumber);
      }

      /**
       * The name of the person or business that owns the bank account.This field is required when
       * attaching the bank account to a `Customer` object.
       */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /**
       * The type of entity that holds the account. It can be `company` or `individual`. This field
       * is required when attaching the bank account to a `Customer` object.
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

      /** The country in which the bank account is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * The currency the bank account is in. This must be a country/currency pairing that [Stripe
       * supports.](docs/payouts)
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
       * the wire routing number. If you are providing an IBAN for`account_number`, this field is
       * not required.
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

    /** The person's gender (International regulations require either "male" or "female"). */
    @SerializedName("gender")
    String gender;

    /**
     * The person's ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself, you
     * can also provide a [PII token provided by
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
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to
     * `metadata`.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The person's phone number. */
    @SerializedName("phone")
    String phone;

    /** The relationship that this person has with the account's legal entity. */
    @SerializedName("relationship")
    Relationship relationship;

    /** The last 4 digits of the person's social security number. */
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
        Relationship relationship,
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
      this.gender = gender;
      this.idNumber = idNumber;
      this.lastName = lastName;
      this.lastNameKana = lastNameKana;
      this.lastNameKanji = lastNameKanji;
      this.maidenName = maidenName;
      this.metadata = metadata;
      this.phone = phone;
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

      /** The person's gender (International regulations require either "male" or "female"). */
      public Builder setGender(String gender) {
        this.gender = gender;
        return this;
      }

      /**
       * The person's ID number, as appropriate for their country. For example, a social security
       * number in the U.S., social insurance number in Canada, etc. Instead of the number itself,
       * you can also provide a [PII token provided by
       * Stripe.js](https://stripe.com/docs/stripe.js#collecting-pii-data).
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
       * See {@link TokenCreateParams.Person#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** The person's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** The relationship that this person has with the account's legal entity. */
      public Builder setRelationship(Relationship relationship) {
        this.relationship = relationship;
        return this;
      }

      /** The last 4 digits of the person's social security number. */
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
         * Two-letter country code ([ISO 3166-1
         * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
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
    public static class Relationship {
      /**
       * Whether the person is a director of the account's legal entity. Currently only required for
       * accounts in the EU. Directors are typically members of the governing board of the company,
       * or responsible for ensuring the company meets its regulatory obligations.
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
         * Whether the person is a director of the account's legal entity. Currently only required
         * for accounts in the EU. Directors are typically members of the governing board of the
         * company, or responsible for ensuring the company meets its regulatory obligations.
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
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
         * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px by
         * 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The back of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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
           * The front of an ID returned by a [file upload](#create_file) with a `purpose` value of
           * `identity_document`. The uploaded file needs to be a color image (smaller than 8,000px
           * by 8,000px), in JPG or PNG format, and less than 10 MB in size.
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

    /** The `id_number` for the PII, in string form. */
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

      /** The `id_number` for the PII, in string form. */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }
    }
  }
}
