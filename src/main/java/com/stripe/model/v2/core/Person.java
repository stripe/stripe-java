// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Person extends StripeObject implements HasId {
  /** The account ID which the individual belongs to. */
  @SerializedName("account")
  String account;

  /** Additional addresses associated with the person. */
  @SerializedName("additional_addresses")
  List<Person.AdditionalAddress> additionalAddresses;

  /** Additional names (e.g. aliases) associated with the person. */
  @SerializedName("additional_names")
  List<Person.AdditionalName> additionalNames;

  /** Attestations of accepted terms of service agreements. */
  @SerializedName("additional_terms_of_service")
  AdditionalTermsOfService additionalTermsOfService;

  /** The person's residential address. */
  @SerializedName("address")
  Address address;

  /**
   * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** The person's date of birth. */
  @SerializedName("date_of_birth")
  DateOfBirth dateOfBirth;

  /** Documents that may be submitted to satisfy various informational requests. */
  @SerializedName("documents")
  Documents documents;

  /** The person's email address. */
  @SerializedName("email")
  String email;

  /** The person's first name. */
  @SerializedName("given_name")
  String givenName;

  /** Unique identifier for the Person. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The identification numbers (e.g., SSN) associated with the person. */
  @SerializedName("id_numbers")
  List<Person.IdNumber> idNumbers;

  /**
   * The person's gender (International regulations require either &quot;male&quot; or
   * &quot;female&quot;).
   *
   * <p>One of {@code female}, or {@code male}.
   */
  @SerializedName("legal_gender")
  String legalGender;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The countries where the person is a national. Two-letter country code (<a
   * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
   */
  @SerializedName("nationalities")
  List<String> nationalities;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.account_person}.
   */
  @SerializedName("object")
  String object;

  /** The person's phone number. */
  @SerializedName("phone")
  String phone;

  /**
   * The person's political exposure.
   *
   * <p>One of {@code existing}, or {@code none}.
   */
  @SerializedName("political_exposure")
  String politicalExposure;

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

  /**
   * Time at which the object was last updated. Represented as a RFC 3339 date &amp; time UTC value
   * in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("updated")
  Instant updated;

  /**
   * For more details about AdditionalAddress, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalAddress extends StripeObject {
    /** City, district, suburb, town, or village. */
    @SerializedName("city")
    String city;

    /**
     * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     *
     * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code am},
     * {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw}, {@code
     * ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code bg},
     * {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo}, {@code
     * bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code bz},
     * {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci}, {@code
     * ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code cv},
     * {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code
     * dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er},
     * {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code
     * fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh},
     * {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code
     * gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
     * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im}, {@code
     * in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code jm},
     * {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km}, {@code
     * kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code lb},
     * {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu}, {@code
     * lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code mg},
     * {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp}, {@code
     * mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code mx},
     * {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code
     * ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om},
     * {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code
     * pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa},
     * {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code
     * sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
     * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss}, {@code
     * st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code tf},
     * {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn}, {@code
     * to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code ug},
     * {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve}, {@code
     * vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code ye},
     * {@code yt}, {@code za}, {@code zm}, or {@code zw}.
     */
    @SerializedName("country")
    String country;

    /** Address line 1 (e.g., street, PO Box, or company name). */
    @SerializedName("line1")
    String line1;

    /** Address line 2 (e.g., apartment, suite, unit, or building). */
    @SerializedName("line2")
    String line2;

    /** ZIP or postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /**
     * Purpose of additional address.
     *
     * <p>Equal to {@code registered}.
     */
    @SerializedName("purpose")
    String purpose;

    /** State, county, province, or region. */
    @SerializedName("state")
    String state;

    /** Town or cho-me. */
    @SerializedName("town")
    String town;
  }

  /**
   * For more details about AdditionalName, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalName extends StripeObject {
    /** The individual's full name. */
    @SerializedName("full_name")
    String fullName;

    /** The individual's first or given name. */
    @SerializedName("given_name")
    String givenName;

    /**
     * The purpose or type of the additional name.
     *
     * <p>One of {@code alias}, or {@code maiden}.
     */
    @SerializedName("purpose")
    String purpose;

    /** The individual's last or family name. */
    @SerializedName("surname")
    String surname;
  }

  /**
   * For more details about AdditionalTermsOfService, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalTermsOfService extends StripeObject {
    /** Stripe terms of service agreement. */
    @SerializedName("account")
    Account account;

    /**
     * For more details about Account, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Account extends StripeObject {
      /**
       * The time when the Account's representative accepted the terms of service. Represented as a
       * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
       * 2022-09-18T13:22:18.123Z.
       */
      @SerializedName("date")
      Instant date;

      /** The IP address from which the Account's representative accepted the terms of service. */
      @SerializedName("ip")
      String ip;

      /**
       * The user agent of the browser from which the Account's representative accepted the terms of
       * service.
       */
      @SerializedName("user_agent")
      String userAgent;
    }
  }

  /**
   * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Address extends StripeObject {
    /** City, district, suburb, town, or village. */
    @SerializedName("city")
    String city;

    /**
     * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     *
     * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code am},
     * {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw}, {@code
     * ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code bg},
     * {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo}, {@code
     * bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code bz},
     * {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci}, {@code
     * ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code cv},
     * {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code
     * dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er},
     * {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code
     * fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh},
     * {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code
     * gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
     * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im}, {@code
     * in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code jm},
     * {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km}, {@code
     * kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code lb},
     * {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu}, {@code
     * lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code mg},
     * {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp}, {@code
     * mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code mx},
     * {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code
     * ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om},
     * {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code
     * pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa},
     * {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code
     * sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
     * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss}, {@code
     * st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code tf},
     * {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn}, {@code
     * to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code ug},
     * {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve}, {@code
     * vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code ye},
     * {@code yt}, {@code za}, {@code zm}, or {@code zw}.
     */
    @SerializedName("country")
    String country;

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
  }

  /**
   * For more details about DateOfBirth, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    /** The day of birth, between 1 and 31. */
    @SerializedName("day")
    Integer day;

    /** The month of birth, between 1 and 12. */
    @SerializedName("month")
    Integer month;

    /** The four-digit year of birth. */
    @SerializedName("year")
    Integer year;
  }

  /**
   * For more details about Documents, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Documents extends StripeObject {
    /**
     * One or more documents that demonstrate proof that this person is authorized to represent the
     * company.
     */
    @SerializedName("company_authorization")
    CompanyAuthorization companyAuthorization;

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

    /**
     * For more details about CompanyAuthorization, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CompanyAuthorization extends StripeObject {
      /**
       * One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * The format of the document. Currently supports {@code files} only.
       *
       * <p>Equal to {@code files}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Passport, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Passport extends StripeObject {
      /**
       * One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * The format of the document. Currently supports {@code files} only.
       *
       * <p>Equal to {@code files}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about PrimaryVerification, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PrimaryVerification extends StripeObject {
      /**
       * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * for the front and back of the verification document.
       */
      @SerializedName("front_back")
      FrontBack frontBack;

      /**
       * The format of the verification document. Currently supports {@code front_back} only.
       *
       * <p>Equal to {@code front_back}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about FrontBack, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FrontBack extends StripeObject {
        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the back of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("back")
        String back;

        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;
      }
    }

    /**
     * For more details about SecondaryVerification, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SecondaryVerification extends StripeObject {
      /**
       * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * for the front and back of the verification document.
       */
      @SerializedName("front_back")
      FrontBack frontBack;

      /**
       * The format of the verification document. Currently supports {@code front_back} only.
       *
       * <p>Equal to {@code front_back}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about FrontBack, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FrontBack extends StripeObject {
        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the back of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("back")
        String back;

        /**
         * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> token
         * representing the front of the verification document. The purpose of the uploaded file
         * should be 'identity_document'. The uploaded file needs to be a color image (smaller than
         * 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in size.
         */
        @SerializedName("front")
        String front;
      }
    }

    /**
     * For more details about Visa, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Visa extends StripeObject {
      /**
       * One or more document IDs returned by a <a
       * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
       * purpose value of {@code account_requirement}.
       */
      @SerializedName("files")
      List<String> files;

      /**
       * The format of the document. Currently supports {@code files} only.
       *
       * <p>Equal to {@code files}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about IdNumber, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IdNumber extends StripeObject {
    /**
     * The ID number type of an individual.
     *
     * <p>One of {@code ae_eid}, {@code br_cpf}, {@code de_stn}, {@code hk_id}, {@code mx_rfc},
     * {@code my_nric}, {@code nl_bsn}, {@code sg_fin}, {@code sg_nric}, {@code th_lc}, {@code
     * th_pin}, {@code us_itin}, {@code us_itin_last_4}, {@code us_ssn}, or {@code us_ssn_last_4}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about Relationship, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    /** Whether the individual is an authorizer of the Account’s legal entity. */
    @SerializedName("authorizer")
    Boolean authorizer;

    /**
     * Whether the individual is a director of the Account’s legal entity. Directors are typically
     * members of the governing board of the company, or responsible for ensuring the company meets
     * its regulatory obligations.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * Whether the individual has significant responsibility to control, manage, or direct the
     * organization.
     */
    @SerializedName("executive")
    Boolean executive;

    /** Whether the individual is the legal guardian of the Account’s representative. */
    @SerializedName("legal_guardian")
    Boolean legalGuardian;

    /** Whether the individual is an owner of the Account’s legal entity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percent owned by the individual of the Account’s legal entity. */
    @SerializedName("percent_ownership")
    String percentOwnership;

    /**
     * Whether the individual is authorized as the primary representative of the Account. This is
     * the person nominated by the business to provide information about themselves, and general
     * information about the account. There can only be one representative at any given time. At the
     * time the account is created, this person should be set to the person responsible for opening
     * the account.
     */
    @SerializedName("representative")
    Boolean representative;

    /** The individual's title (e.g., CEO, Support Engineer). */
    @SerializedName("title")
    String title;
  }

  /**
   * For more details about ScriptAddresses, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ScriptAddresses extends StripeObject {
    /** Kana Address. */
    @SerializedName("kana")
    Kana kana;

    /** Kanji Address. */
    @SerializedName("kanji")
    Kanji kanji;

    /**
     * For more details about Kana, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kana extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       *
       * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code
       * am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw},
       * {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code
       * bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo},
       * {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code
       * bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci},
       * {@code ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code
       * cv}, {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk},
       * {@code dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code
       * er}, {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo},
       * {@code fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code
       * gh}, {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr},
       * {@code gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code
       * hn}, {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
       * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code
       * jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km},
       * {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code
       * lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu},
       * {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code
       * mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp},
       * {@code mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code
       * mx}, {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng},
       * {@code ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code
       * om}, {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl},
       * {@code pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code
       * qa}, {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa},
       * {@code sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code
       * sj}, {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
       * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code
       * tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn},
       * {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code
       * ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve},
       * {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code
       * ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
       */
      @SerializedName("country")
      String country;

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
    }

    /**
     * For more details about Kanji, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kanji extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       *
       * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code
       * am}, {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw},
       * {@code ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code
       * bg}, {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo},
       * {@code bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code
       * bz}, {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci},
       * {@code ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code
       * cv}, {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk},
       * {@code dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code
       * er}, {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo},
       * {@code fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code
       * gh}, {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr},
       * {@code gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code
       * hn}, {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im},
       * {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code
       * jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km},
       * {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code
       * lb}, {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu},
       * {@code lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code
       * mg}, {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp},
       * {@code mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code
       * mx}, {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng},
       * {@code ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code
       * om}, {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl},
       * {@code pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code
       * qa}, {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa},
       * {@code sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code
       * sj}, {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss},
       * {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code
       * tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn},
       * {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code
       * ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve},
       * {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code
       * ye}, {@code yt}, {@code za}, {@code zm}, or {@code zw}.
       */
      @SerializedName("country")
      String country;

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
    }
  }

  /**
   * For more details about ScriptNames, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ScriptNames extends StripeObject {
    /** Persons name in kana script. */
    @SerializedName("kana")
    Kana kana;

    /** Persons name in kanji script. */
    @SerializedName("kanji")
    Kanji kanji;

    /**
     * For more details about Kana, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kana extends StripeObject {
      /** The person's first or given name. */
      @SerializedName("given_name")
      String givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      String surname;
    }

    /**
     * For more details about Kanji, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kanji extends StripeObject {
      /** The person's first or given name. */
      @SerializedName("given_name")
      String givenName;

      /** The person's last or family name. */
      @SerializedName("surname")
      String surname;
    }
  }
}
