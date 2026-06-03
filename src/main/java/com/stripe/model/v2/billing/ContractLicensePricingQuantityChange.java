// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A license pricing quantity change object returned by ListContractLicenseQuantityChanges. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ContractLicensePricingQuantityChange extends StripeObject implements HasId {
  /** The timestamp when this quantity change object was created. */
  @SerializedName("created")
  Instant created;

  /** The timestamp when this quantity change takes effect. */
  @SerializedName("effective_at")
  Instant effectiveAt;

  /** The ID of the quantity change object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the license pricing. */
  @SerializedName("license_pricing_id")
  String licensePricingId;

  /**
   * The type of the license pricing.
   *
   * <p>One of {@code license_fee}, or {@code price}.
   */
  @SerializedName("license_pricing_type")
  String licensePricingType;

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
   * <p>Equal to {@code v2.billing.contract_license_pricing_quantity_change}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the pricing line associated with this quantity change. */
  @SerializedName("pricing_line")
  String pricingLine;

  /** The quantity at the effective time. */
  @SerializedName("quantity")
  Long quantity;
}
