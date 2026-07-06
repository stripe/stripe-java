// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A quantity change object for a pricing line, returned by ListContractPricingLineQuantityChanges.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ContractPricingLineQuantityChange extends StripeObject implements HasId {
  /** The timestamp when this quantity change object was created. */
  @SerializedName("created")
  Instant created;

  /** The timestamp when this quantity change takes effect. */
  @SerializedName("effective_at")
  Instant effectiveAt;

  /** The id of the quantity change object. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.contract_pricing_line_quantity_change}.
   */
  @SerializedName("object")
  String object;

  /** The pricing configuration for the associated pricing line. */
  @SerializedName("pricing")
  Pricing pricing;

  /** The id of the pricing line associated with this quantity change. */
  @SerializedName("pricing_line")
  String pricingLine;

  /** The quantity at the effective time. */
  @SerializedName("quantity")
  BigDecimal quantity;

  /** The pricing configuration for the associated pricing line. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pricing extends StripeObject {
    /** The ID of the V1 price. Present when {@code type} is {@code price}. */
    @SerializedName("price")
    String price;

    /**
     * The type of pricing.
     *
     * <p>Equal to {@code price}.
     */
    @SerializedName("type")
    String type;
  }
}
