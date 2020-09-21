// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Address extends StripeObject {
  /** City, district, suburb, town, or village. */
  @SerializedName("city")
  String city;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
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
}
