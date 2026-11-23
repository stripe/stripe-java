// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A DisputeAdjustment records a money movement associated with a Dispute. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DisputeAdjustment extends StripeObject implements HasId {
  /** The amount and currency of the DisputeAdjustment. */
  @SerializedName("amount")
  Amount amount;

  /** The time at which the DisputeAdjustment was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the FinancialAccount associated with the DisputeAdjustment. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the DisputeAdjustment. */
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
   * <p>Equal to {@code v2.money_management.dispute_adjustment}.
   */
  @SerializedName("object")
  String object;

  /** The Dispute associated with this DisputeAdjustment. */
  @SerializedName("related_dispute")
  RelatedDispute relatedDispute;

  /** The Dispute associated with this DisputeAdjustment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RelatedDispute extends StripeObject {
    /**
     * The ID of the Dispute associated with this DisputeAdjustment. Present when {@code type} is
     * {@code dispute}.
     */
    @SerializedName("dispute")
    String dispute;

    /**
     * The type of Dispute associated with this DisputeAdjustment.
     *
     * <p>Equal to {@code dispute}.
     */
    @SerializedName("type")
    String type;
  }
}
