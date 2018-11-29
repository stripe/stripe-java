package com.stripe.model;

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
  List<LegalEntityAdditionalOwner> additionalOwners;

  LegalEntityAddress address;

  /** The Kana variation of the primary address of the legal entity (Japan only). */
  LegalEntityJapanAddress addressKana;

  /** The Kanji variation of the primary address of the legal entity (Japan only). */
  LegalEntityJapanAddress addressKanji;

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

  LegalEntityDob dob;

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

  LegalEntityAddress personalAddress;

  /**
   * The Kana variation of the address of the individual responsible for the account (Japan only).
   */
  LegalEntityJapanAddress personalAddressKana;

  /**
   * The Kanji variation of the address of the individual responsible for the account (Japan only).
   */
  LegalEntityJapanAddress personalAddressKanji;

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

  LegalEntityVerification verification;
}
