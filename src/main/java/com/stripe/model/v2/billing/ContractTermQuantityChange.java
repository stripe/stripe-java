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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ContractTermQuantityChange extends StripeObject implements HasId {
  /** The ID of the parent contract. */
  @SerializedName("contract")
  String contract;

  /** When this quantity change was created. */
  @SerializedName("created")
  Instant created;

  /** When the quantity change takes effect. */
  @SerializedName("effective_at")
  Instant effectiveAt;

  /** The ID of the quantity change. */
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
   * <p>Equal to {@code v2.billing.contract_term_quantity_change}.
   */
  @SerializedName("object")
  String object;

  /** The quantity at the effective time. */
  @SerializedName("quantity")
  BigDecimal quantity;

  /** The ID of the recurring-price term. */
  @SerializedName("term")
  String term;
}
