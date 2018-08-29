package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class LegalEntity extends StripeObject {
  List<Owner> additionalOwners;
  Address address;
  JapanAddress addressKana;
  JapanAddress addressKanji;
  String businessName;
  String businessNameKana;
  String businessNameKanji;
  Boolean businessTaxIdProvided;
  Boolean businessVatIdProvided;
  DateOfBirth dob;
  String firstName;
  String firstNameKana;
  String firstNameKanji;
  String gender;
  String lastName;
  String lastNameKana;
  String lastNameKanji;
  String maidenName;
  Address personalAddress;
  JapanAddress personalAddressKana;
  JapanAddress personalAddressKanji;
  Boolean personalIdNumberProvided;
  String phoneNumber;
  @SerializedName("ssn_last_4_provided") Boolean ssnLast4Provided;
  String taxIdRegistrar;
  String type;
  Verification verification;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DateOfBirth extends StripeObject {
    Long day;
    Long month;
    Long year;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class JapanAddress extends StripeObject {
    String city;
    String country;
    String line1;
    String line2;
    String postalCode;
    String state;
    String town;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Owner extends StripeObject {
    Address address;
    DateOfBirth dob;
    String firstName;
    String lastName;
    String maidenName;
    Boolean personalIdNumberProvided;
    Verification verification;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    String details;
    String detailsCode;
    String document;
    String documentBack;
    String status;
  }
}
