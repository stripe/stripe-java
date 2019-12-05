package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceLineItem extends StripeObject implements HasId {
  /** The amount, in %s. */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** If true, discounts will apply to this line item. Always false for prorations. */
  @SerializedName("discountable")
  Boolean discountable;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("invoice_item")
  String invoiceItem;

  /** Whether this is a test line item. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Note that for line items with
   * `type=subscription` this will reflect the metadata of the subscription that caused the line
   * item to be created.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `line_item`.
   */
  @SerializedName("object")
  String object;

  @SerializedName("period")
  InvoiceLineItemPeriod period;

  /** The plan of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("plan")
  Plan plan;

  /** Whether this is a proration. */
  @SerializedName("proration")
  Boolean proration;

  /** The quantity of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("quantity")
  Long quantity;

  /** The subscription that the invoice item pertains to, if any. */
  @SerializedName("subscription")
  String subscription;

  /**
   * The subscription item that generated this invoice item. Left empty if the line item is not an
   * explicit result of a subscription.
   */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /** The amount of tax calculated per tax rate for this line item. */
  @SerializedName("tax_amounts")
  List<Invoice.TaxAmount> taxAmounts;

  /** The tax rates which apply to the line item. */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;

  /**
   * A string identifying the type of the source of this line item, either an `invoiceitem` or a
   * `subscription`.
   *
   * <p>One of `invoiceitem`, or `subscription`.
   */
  @SerializedName("type")
  String type;

  /**
   * For prorations this indicates whether Stripe automatically grouped multiple related debit and
   * credit line items into a single combined line item.
   */
  @SerializedName("unified_proration")
  Boolean unifiedProration;
}
