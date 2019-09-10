package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Address extends StripeObject {
  /** City/District/Suburb/Town/Village. */
  @SerializedName("city")
  String city;

  /** 2-letter country code. */
  @SerializedName("country")
  String country;

  /** Address line 1 (Street address/PO Box/Company name). */
  @SerializedName("line1")
  String line1;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  @SerializedName("line2")
  String line2;

  /** ZIP or postal code. */
  @SerializedName("postal_code")
  String postalCode;

  /** State/County/Province/Region. */
  @SerializedName("state")
  String state;
}
