// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.StripeResponseGetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ShippingDetails extends StripeObject implements StripeActiveObject {
  @SerializedName("address")
  Address address;

  /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
  @SerializedName("carrier")
  String carrier;

  /** Recipient name. */
  @SerializedName("name")
  String name;

  /** Recipient phone (including extension). */
  @SerializedName("phone")
  String phone;

  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  @SerializedName("tracking_number")
  String trackingNumber;

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    trySetResponseGetter(address, responseGetter);
  }
}
