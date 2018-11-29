package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingCardShipping extends StripeObject {
  Address address;

  /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
  String carrier;

  /** A unix timestamp representing a best estimate of when the card will be delivered. */
  Long eta;

  /** Recipient name. */
  String name;

  /** Recipient phone (including extension). */
  String phone;

  /**
   * The delivery status of the card. One of `pending`, `shipped`, `delivered`, `returned`,
   * `failure`, or `canceled`.
   */
  String status;

  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  String trackingNumber;

  /**
   * A link to the shipping carrier's site where you can view detailed information about a card
   * shipment.
   */
  String trackingUrl;
}
