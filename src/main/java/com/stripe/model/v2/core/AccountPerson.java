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

/**
 * A Person represents an individual associated with an Account's identity (for example, an owner,
 * director, executive, or representative). Use Persons to provide and update identity information
 * for verification and compliance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountPerson extends StripeObject implements HasId {
  /** The account ID which the individual belongs to. */
  @SerializedName("account")
  String account;

  /** Additional addresses associated with the person. */
  @SerializedName("additional_addresses")
  List<AccountPerson.AdditionalAddress> additionalAddresses;

  /** Additional names (e.g. aliases) associated with the person. */
  @SerializedName("additional_names")
  List<AccountPerson.AdditionalName> additionalNames;

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
  List<AccountPerson.IdNumber> idNumbers;

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

    /** Town or district. */
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

  /** Attestations of accepted terms of service agreements. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdditionalTermsOfService extends StripeObject {
    /** Stripe terms of service agreement. */
    @SerializedName("account")
    Account account;

    /** Stripe terms of service agreement. */
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

  /** The person's residential address. */
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

    /** Town or district. */
    @SerializedName("town")
    String town;
  }

  /** The person's date of birth. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    /** The day of birth, between 1 and 31. */
    @SerializedName("day")
    Long day;

    /** The month of birth, between 1 and 12. */
    @SerializedName("month")
    Long month;

    /** The four-digit year of birth. */
    @SerializedName("year")
    Long year;
  }

  /** Documents that may be submitted to satisfy various informational requests. */
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
     * One or more documents that demonstrate proof that this person is authorized to represent the
     * company.
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

    /** One or more documents showing the person’s passport page with photo and personal data. */
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

    /** An identifying document showing the person's name, either a passport or local ID card. */
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
       * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * for the front and back of the verification document.
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
     * A document showing address, either a passport, local ID card, or utility bill from a
     * well-known utility company.
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
       * The <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
       * for the front and back of the verification document.
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
     * One or more documents showing the person’s visa required for living in the country where they
     * are residing.
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
     * <p>One of {@code ae_eid}, {@code ao_nif}, {@code ar_cuil}, {@code ar_dni}, {@code at_stn},
     * {@code az_tin}, {@code bd_brc}, {@code bd_etin}, {@code bd_nid}, {@code be_nrn}, {@code
     * bg_ucn}, {@code bn_nric}, {@code br_cpf}, {@code ca_sin}, {@code ch_oasi}, {@code cl_rut},
     * {@code cn_pp}, {@code co_nuip}, {@code cr_ci}, {@code cr_cpf}, {@code cr_dimex}, {@code
     * cr_nite}, {@code cy_tic}, {@code cz_rc}, {@code de_stn}, {@code dk_cpr}, {@code do_cie},
     * {@code do_rcn}, {@code ec_ci}, {@code ee_ik}, {@code es_nif}, {@code fi_hetu}, {@code
     * fr_nir}, {@code gb_nino}, {@code gr_afm}, {@code gt_nit}, {@code hk_id}, {@code hr_oib},
     * {@code hu_ad}, {@code id_nik}, {@code ie_ppsn}, {@code is_kt}, {@code it_cf}, {@code jp_inc},
     * {@code ke_pin}, {@code kz_iin}, {@code li_peid}, {@code lt_ak}, {@code lu_nif}, {@code
     * lv_pk}, {@code mx_rfc}, {@code my_nric}, {@code mz_nuit}, {@code ng_nin}, {@code nl_bsn},
     * {@code no_nin}, {@code nz_ird}, {@code pe_dni}, {@code pk_cnic}, {@code pk_snic}, {@code
     * pl_pesel}, {@code pt_nif}, {@code ro_cnp}, {@code sa_tin}, {@code se_pin}, {@code sg_fin},
     * {@code sg_nric}, {@code sk_dic}, {@code th_lc}, {@code th_pin}, {@code tr_tin}, {@code
     * us_itin}, {@code us_itin_last_4}, {@code us_ssn}, {@code us_ssn_last_4}, {@code uy_dni}, or
     * {@code za_id}.
     */
    @SerializedName("type")
    String type;
  }

  /** The relationship that this person has with the Account's business or legal entity. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    /** Whether the individual is an authorizer of the Account's identity. */
    @SerializedName("authorizer")
    Boolean authorizer;

    /**
     * Whether the individual is a director of the Account's identity. Directors are typically
     * members of the governing board of the company or are responsible for making sure that the
     * company meets its regulatory obligations.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * Whether the individual has significant responsibility to control, manage, or direct the
     * organization.
     */
    @SerializedName("executive")
    Boolean executive;

    /** Whether the individual is the legal guardian of the Account's representative. */
    @SerializedName("legal_guardian")
    Boolean legalGuardian;

    /** Whether the individual is an owner of the Account's identity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percentage of the Account's identity that the individual owns. */
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

  /** The script addresses (e.g., non-Latin characters) associated with the person. */
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

    /** Kana Address. */
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

      /** Town or district. */
      @SerializedName("town")
      String town;
    }

    /** Kanji Address. */
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

      /** Town or district. */
      @SerializedName("town")
      String town;
    }
  }

  /** The script names (e.g. non-Latin characters) associated with the person. */
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

    /** Persons name in kana script. */
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

    /** Persons name in kanji script. */
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
