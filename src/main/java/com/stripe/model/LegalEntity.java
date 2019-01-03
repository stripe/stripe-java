package com.stripe.model;

import com.stripe.net.ApiResource;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntity extends StripeObject {
  /**
   * An array of any owners with at least 25% ownership of the company, excluding the individual
   * responsible for the account.
   */
  List<Owner> additionalOwners;

  Address address;

  /** The Kana variation of the primary address of the legal entity (Japan only). */
  JapanAddress addressKana;

  /** The Kanji variation of the primary address of the legal entity (Japan only). */
  JapanAddress addressKanji;

  /** The company's legal name. */
  String businessName;

  /** The Kana variation of the company's legal name (Japan only). */
  String businessNameKana;

  /** The Kanji variation of the company's legal name (Japan only). */
  String businessNameKanji;

  /** Whether the business ID number of the legal entity was provided. */
  Boolean businessTaxIdProvided;

  /** Whether the business VAT number of the legal entity was provided. */
  Boolean businessVatIdProvided;

  DateOfBirth dob;

  /** The first name of the individual responsible for the account. */
  String firstName;

  /**
   * The Kana variation of the first name of the individual responsible for the account (Japan
   * only).
   */
  String firstNameKana;

  /**
   * The Kanji variation of the first name of the individual responsible for the account (Japan
   * only).
   */
  String firstNameKanji;

  /**
   * The gender of the individual responsible for the account (International regulations require
   * either "male" or "female").
   */
  String gender;

  /** The last name of the individual responsible for the account. */
  String lastName;

  /**
   * The Kana varation of the last name of the individual responsible for the account (Japan only).
   */
  String lastNameKana;

  /**
   * The Kanji varation of the last name of the individual responsible for the account (Japan only).
   */
  String lastNameKanji;

  /** The maiden name of the individual responsible for the account. */
  String maidenName;

  Address personalAddress;

  /**
   * The Kana variation of the address of the individual responsible for the account (Japan only).
   */
  JapanAddress personalAddressKana;

  /**
   * The Kanji variation of the address of the individual responsible for the account (Japan only).
   */
  JapanAddress personalAddressKanji;

  /** Whether the personal ID number of the individual responsible for the account was provided. */
  Boolean personalIdNumberProvided;

  /** The company's phone number, used for verification. */
  String phoneNumber;

  /**
   * Whether the last 4 ssn digits of the individual responsible for the account have been provided.
   */
  Boolean ssnLast4Provided;

  /**
   * The jurisdiction in which the `business_tax_id` is registered (Germany-based companies only).
   */
  String taxIdRegistrar;

  /** Either "individual" or "company", for what kind of legal entity the account owner is for. */
  String type;

  Verification verification;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Owner extends StripeObject {
    Address address;

    DateOfBirth dob;

    /** The email address of this additional owner. */
    String email;

    /** The first name of this additional owner. */
    String firstName;

    /** The last name of this additional owner. */
    String lastName;

    /** The maiden name of this additional owner. */
    String maidenName;

    /** Whether the personal ID number of this additional owner was provided. */
    Boolean personalIdNumberProvided;

    /** The phone number of this additional owner. */
    String phone;

    /** Whether the last 4 digits of this additional owner's SSN have been provided. */
    Boolean ssnLast4Provided;

    Verification verification;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    /** The day of birth, between 1 and 31. */
    Long day;

    /** The month of birth, between 1 and 12. */
    Long month;

    /** The four-digit year of birth. */
    Long year;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class JapanAddress extends StripeObject {
    /** City/Ward. */
    String city;

    /**
     * Two-letter country code ([ISO 3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    String country;

    /** Block/Building number. */
    String line1;

    /** Building details. */
    String line2;

    /** Zip/Postal Code. */
    String postalCode;

    /** Prefecture. */
    String state;

    /** Town/cho-me. */
    String town;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    /**
     * A user-displayable string describing the verification state for this legal entity. For
     * example, if a document is uploaded and the picture is too fuzzy, this may say "Identity
     * document is too unclear to read".
     */
    String details;

    /**
     * A machine-readable code specifying the verification state for this legal entity. One of
     * `scan_corrupt`, `scan_not_readable`, `scan_failed_greyscale`, `scan_not_uploaded`,
     * `scan_id_type_not_supported`, `scan_id_country_not_supported`, `scan_failed_other`, or
     * `scan_failed_test_mode`.
     */
    String detailsCode;

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A photo (jpg or png) of
     * the front of an identifying document, either a passport or local ID card.
     */
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> document;

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A photo (jpg or png) of
     * the back of an identifying document, either a passport or local ID card.
     */
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> documentBack;

    /**
     * The state of verification for this legal entity. Possible values are `unverified`, `pending`,
     * or `verified`.
     */
    String status;

    /** Get id of expandable `document` object. */
    public String getDocument() {
      return (this.document != null) ? this.document.getId() : null;
    }

    public void setDocument(String id) {
      this.document = ApiResource.setExpandableFieldId(id, this.document);
    }

    /** Get expanded `document`. */
    public File getDocumentObject() {
      return (this.document != null) ? this.document.getExpanded() : null;
    }

    public void setDocumentObject(File expandableObject) {
      this.document = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get id of expandable `documentBack` object. */
    public String getDocumentBack() {
      return (this.documentBack != null) ? this.documentBack.getId() : null;
    }

    public void setDocumentBack(String id) {
      this.documentBack = ApiResource.setExpandableFieldId(id, this.documentBack);
    }

    /** Get expanded `documentBack`. */
    public File getDocumentBackObject() {
      return (this.documentBack != null) ? this.documentBack.getExpanded() : null;
    }

    public void setDocumentBackObject(File expandableObject) {
      this.documentBack = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }
}
