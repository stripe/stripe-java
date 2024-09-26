// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A (partner) margin represents a specific discount distributed in partner reseller programs to
 * business partners who resell products and services and earn a discount (margin) for doing so.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Margin extends StripeObject implements HasId {
  /**
   * Whether the margin can be applied to invoices, invoice items, or invoice line items. Defaults
   * to {@code true}.
   */
  @SerializedName("active")
  Boolean active;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Name of the margin that's displayed on, for example, invoices. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code margin}.
   */
  @SerializedName("object")
  String object;

  /**
   * Percent that will be taken off the subtotal before tax (after all other discounts and
   * promotions) of any invoice to which the margin is applied.
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;
}
