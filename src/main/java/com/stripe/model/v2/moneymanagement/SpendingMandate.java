// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A SpendingMandate authorizes a counterparty to pull money from a Financial Account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SpendingMandate extends StripeObject implements HasId {
  /** Bank transfer details. Present if {@code type} is {@code bank_transfer}. */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * The time at which the SpendingMandate was created. Represented as a RFC 3339 date &amp; time
   * UTC value in millisecond precision.
   */
  @SerializedName("created")
  Instant created;

  /** The currency in ISO 4217 format that debits will be collected in. */
  @SerializedName("currency")
  String currency;

  /** Financial account ID associated with this mandate. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The unique identifier for the SpendingMandate. */
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
   * <p>Equal to {@code v2.money_management.spending_mandate}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the SpendingMandate.
   *
   * <p>One of {@code active}, {@code canceled}, {@code expired}, or {@code pending_cancellation}.
   */
  @SerializedName("status")
  String status;

  /** Detailed information about the status of the SpendingMandate. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Timestamps describing when the mandate changed status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The type of the SpendingMandate.
   *
   * <p>Equal to {@code bank_transfer}.
   */
  @SerializedName("type")
  String type;

  /** Bank transfer details. Present if {@code type} is {@code bank_transfer}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /** The name of the account holder that initiated the debit. */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /** The financial address associated with this mandate. */
    @SerializedName("financial_address")
    String financialAddress;

    /**
     * The bank transfer network for this mandate.
     *
     * <p>Equal to {@code bacs}.
     */
    @SerializedName("network")
    String network;

    /**
     * The bank transfer reference provided by the bank. Only present when {@code network} is {@code
     * bacs}.
     */
    @SerializedName("reference")
    String reference;
  }

  /** Detailed information about the status of the SpendingMandate. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** If the mandate is canceled, this field provides more details on the cancellation reason. */
    @SerializedName("canceled")
    Canceled canceled;

    /** If the mandate is canceled, this field provides more details on the cancellation reason. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /**
       * The {@code canceled} status reason.
       *
       * <p>One of {@code canceled_by_beneficiary}, {@code canceled_by_stripe}, or {@code
       * user_action}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Timestamps describing when the mandate changed status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when the SpendingMandate changed status to {@code active}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision.
     */
    @SerializedName("activated_at")
    Instant activatedAt;

    /**
     * Timestamp describing when the SpendingMandate changed status to {@code canceled}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * Timestamp describing when the SpendingMandate was created. Represented as a RFC 3339 date
     * &amp; time UTC value in millisecond precision.
     */
    @SerializedName("created_at")
    Instant createdAt;

    /**
     * Timestamp describing when the SpendingMandate changed status to {@code expired}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision.
     */
    @SerializedName("expired_at")
    Instant expiredAt;

    /**
     * Timestamp describing when the SpendingMandate changed status to {@code pending_cancellation}.
     * Represented as a RFC 3339 date &amp; time UTC value in millisecond precision.
     */
    @SerializedName("pending_cancellation_at")
    Instant pendingCancellationAt;
  }
}
