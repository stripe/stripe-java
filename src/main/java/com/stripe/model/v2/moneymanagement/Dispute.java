// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Dispute tracks a claim challenging a money movement on behalf of a FinancialAccount holder. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends StripeObject implements HasId {
  /** The amount and currency of the disputed money movement. */
  @SerializedName("amount")
  Amount amount;

  /** The time at which the dispute was created. */
  @SerializedName("created")
  Instant created;

  /** Additional explanation for the dispute, if supplied. */
  @SerializedName("explanation")
  String explanation;

  /** The FinancialAccount associated with the disputed money movement. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the Dispute. */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.dispute}.
   */
  @SerializedName("object")
  String object;

  /**
   * The FinancialAccount holder's reason for disputing the money movement.
   *
   * <p>One of {@code authorization_revoked}, {@code duplicate}, {@code incorrect_amount}, {@code
   * incorrect_date}, {@code other}, or {@code unauthorized}.
   */
  @SerializedName("reason")
  String reason;

  /**
   * The current status of the dispute.
   *
   * <p>One of {@code lost}, {@code under_review}, or {@code won}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps describing when the dispute changed status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The money movement being disputed. */
  @SerializedName("target")
  Target target;

  /** Timestamps describing when the dispute changed status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time at which the Dispute became lost. Only present if status == lost. */
    @SerializedName("lost_at")
    Instant lostAt;

    /** The time at which the Dispute became won. Only present if status == won. */
    @SerializedName("won_at")
    Instant wonAt;
  }

  /** The money movement being disputed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Target extends StripeObject {
    /** If applicable, the ID of the ReceivedDebit being disputed. */
    @SerializedName("received_debit")
    String receivedDebit;

    /**
     * The type of money movement being disputed.
     *
     * <p>Equal to {@code received_debit}.
     */
    @SerializedName("type")
    String type;
  }
}
