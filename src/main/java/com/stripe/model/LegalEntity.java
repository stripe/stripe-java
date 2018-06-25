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
  String businessName;
  Boolean businessTaxIdProvided;
  DateOfBirth dob;
  String firstName;
  String lastName;
  Address personalAddress;
  Boolean personalIdNumberProvided;
  @SerializedName("ssn_last_4_provided") Boolean ssnLast4Provided;
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
  public static class Verification extends StripeObject {
    String details;
    String detailsCode;
    String document;
    String documentBack;
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Owner extends StripeObject {
    Address address;
    DateOfBirth dob;
    String firstName;
    String lastName;
    Verification verification;
  }
}
