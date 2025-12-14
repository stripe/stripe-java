// File generated from our OpenAPI spec
package com.stripe.model.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A ManualRule holds tax rates for a BillableItem. It can hold at most 5 distinct tax rates. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ManualRule extends StripeObject implements HasId {
  /** The time at which the ManualRule object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the ManualRule object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Location where the rule applies. */
  @SerializedName("location")
  Location location;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.tax.manual_rule}.
   */
  @SerializedName("object")
  String object;

  /** Products associated with the rule. */
  @SerializedName("products")
  List<ManualRule.Product> products;

  /** Tax rates to be applied. */
  @SerializedName("scheduled_tax_rates")
  List<ManualRule.ScheduledTaxRate> scheduledTaxRates;

  /**
   * The status of the ManualRule object.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** Location where the rule applies. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Location extends StripeObject {
    /** Country ISO-3166. */
    @SerializedName("country")
    String country;

    /** State ISO-3166. */
    @SerializedName("state")
    String state;
  }

  /**
   * For more details about Product, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Product extends StripeObject {
    /** The licensed item identifier. */
    @SerializedName("licensed_item")
    String licensedItem;

    /** The metered item identifier. */
    @SerializedName("metered_item")
    String meteredItem;

    /** The tax code for the product. */
    @SerializedName("tax_code")
    String taxCode;

    /**
     * The type of the product.
     *
     * <p>One of {@code licensed_item}, {@code metered_item}, or {@code tax_code}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about ScheduledTaxRate, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ScheduledTaxRate extends StripeObject {
    /** The tax rates to be applied. */
    @SerializedName("rates")
    List<ManualRule.ScheduledTaxRate.Rate> rates;

    /** The start time for the tax rate. */
    @SerializedName("starts_at")
    Instant startsAt;

    /**
     * For more details about Rate, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rate extends StripeObject {
      /** Country of the tax rate. */
      @SerializedName("country")
      String country;

      /** Description of the tax rate. */
      @SerializedName("description")
      String description;

      /** Display name of the tax rate as it will be shown on the invoice. */
      @SerializedName("display_name")
      String displayName;

      /** Jurisdiction of the tax rate should apply as it will be shown on the invoice. */
      @SerializedName("jurisdiction")
      String jurisdiction;

      /** Percentage of the tax rate. Must be positive and maximum of 4 decimal points. */
      @SerializedName("percentage")
      String percentage;

      /** State of the tax rate. */
      @SerializedName("state")
      String state;
    }
  }
}
