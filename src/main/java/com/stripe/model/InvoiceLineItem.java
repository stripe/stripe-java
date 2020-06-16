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
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

  /**
   * The ID of the <a href="https://stripe.com/docs/api/invoiceitems">invoice item</a> associated
   * with this line item if any.
   */
  @SerializedName("invoice_item")
  String invoiceItem;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Note that for line items with {@code type=subscription} this will reflect
   * the metadata of the subscription that caused the line item to be created.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code line_item}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("period")
  InvoiceLineItemPeriod period;

  /** The plan of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("plan")
  Plan plan;

  /** The price of the line item. */
  @SerializedName("price")
  Price price;

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
   * A string identifying the type of the source of this line item, either an {@code invoiceitem} or
   * a {@code subscription}.
   *
   * <p>One of {@code invoiceitem}, or {@code subscription}.
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
