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

/** A DebitDispute represents a dispute raised against a received debit. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DebitDispute extends StripeObject implements HasId {
  /** The amount of the DebitDispute. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Details about the bank transfer dispute. Present if {@code type} field value is {@code
   * bank_transfer}.
   */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Time at which the DebitDispute was created. Represented as a RFC 3339 date &amp; time UTC value
   * in millisecond precision, for example: {@code 2026-03-23T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /** The Financial Account associated with the DebitDispute. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The ID of a DebitDispute. */
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
   * <p>Equal to {@code v2.money_management.debit_dispute}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the ReceivedDebit that was disputed. */
  @SerializedName("received_debit")
  String receivedDebit;

  /**
   * The status of the DebitDispute.
   *
   * <p>One of {@code failed}, {@code submitted}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Detailed information about the status of the DebitDispute. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The time at which the DebitDispute transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The type of the DebitDispute.
   *
   * <p>Equal to {@code bank_transfer}.
   */
  @SerializedName("type")
  String type;

  /**
   * Details about the bank transfer dispute. Present if {@code type} field value is {@code
   * bank_transfer}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /**
     * The bank network the dispute was originated on.
     *
     * <p>Equal to {@code ach}.
     */
    @SerializedName("network")
    String network;

    /**
     * The reason for the dispute.
     *
     * <p>One of {@code incorrect_amount_or_date}, or {@code unauthorized}.
     */
    @SerializedName("reason")
    String reason;

    /** The statement descriptor set by the originator of the debit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /** Detailed information about the status of the DebitDispute. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Information that elaborates on the {@code failed} status of a DebitDispute. It is only
     * present when the DebitDispute status is {@code failed}.
     */
    @SerializedName("failed")
    Failed failed;

    /**
     * Information that elaborates on the {@code failed} status of a DebitDispute. It is only
     * present when the DebitDispute status is {@code failed}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * The reason for the failure of the DebitDispute.
       *
       * <p>Equal to {@code unknown}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** The time at which the DebitDispute transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * The time when the DebitDispute was marked as {@code failed}. Represented as a RFC 3339 date
     * &amp; time UTC value in millisecond precision, for example: {@code 2026-04-23T13:22:18.123Z}.
     */
    @SerializedName("failed_at")
    Instant failedAt;

    /**
     * The time when the DebitDispute was marked as {@code succeeded}. Represented as a RFC 3339
     * date &amp; time UTC value in millisecond precision, for example: {@code
     * 2026-04-23T13:22:18.123Z}.
     */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }
}
