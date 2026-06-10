// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionLineItem extends StripeObject implements HasId {
  /**
   * The line item amount in the <a href="https://docs.stripe.com/currencies#minor-units">smallest
   * currency unit</a>. If {@code tax_behavior=inclusive}, then this amount includes taxes.
   * Otherwise, taxes were calculated on top of this amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of tax calculated for this line item, in the <a
   * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
   */
  @SerializedName("amount_tax")
  Long amountTax;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.transaction_line_item}.
   */
  @SerializedName("object")
  String object;

  /**
   * The address of the location where this line item's event or service takes place. Depending on
   * the <a href="https://stripe.com/tax/tax-codes">tax code</a>, providing a performance location
   * is required, optional, or not supported. Use this to provide the address inline without
   * pre-creating a <a href="https://stripe.com/api/tax/location">TaxLocation</a> object. Can't be
   * used with {@code performance_location}.
   */
  @SerializedName("performance_location_details")
  PerformanceLocationDetails performanceLocationDetails;

  /** The ID of an existing <a href="https://docs.stripe.com/api/products/object">Product</a>. */
  @SerializedName("product")
  String product;

  /**
   * The number of units of the item being purchased. For reversals, this is the quantity reversed.
   */
  @SerializedName("quantity")
  Long quantity;

  /** A custom identifier for this line item in the transaction. */
  @SerializedName("reference")
  String reference;

  /** If {@code type=reversal}, contains information about what was reversed. */
  @SerializedName("reversal")
  Reversal reversal;

  /**
   * Specifies whether the {@code amount} includes taxes. If {@code tax_behavior=inclusive}, then
   * the amount includes taxes.
   *
   * <p>One of {@code exclusive}, or {@code inclusive}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /**
   * The <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID used for this
   * resource.
   */
  @SerializedName("tax_code")
  String taxCode;

  /**
   * If {@code reversal}, this line item reverses an earlier transaction.
   *
   * <p>One of {@code reversal}, or {@code transaction}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about PerformanceLocationDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PerformanceLocationDetails extends StripeObject {
    @SerializedName("address")
    Address address;

    /**
     * For more details about Address, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
       */
      @SerializedName("state")
      String state;
    }
  }

  /**
   * For more details about Reversal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reversal extends StripeObject {
    /** The {@code id} of the line item to reverse in the original transaction. */
    @SerializedName("original_line_item")
    String originalLineItem;
  }
}
