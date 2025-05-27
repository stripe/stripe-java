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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReceivedDebit extends StripeObject implements HasId {
  /** Amount and currency of the ReceivedDebit. */
  @SerializedName("amount")
  Amount amount;

  /**
   * This object stores details about the originating banking transaction that resulted in the
   * ReceivedDebit. Present if {@code type} field value is {@code bank_transfer}.
   */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * The time at which the ReceivedDebit was created. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /** Freeform string sent by the originator of the ReceivedDebit. */
  @SerializedName("description")
  String description;

  /** Financial Account on which funds for ReceivedDebit were debited. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the ReceivedDebit. */
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
   * <p>Equal to {@code v2.money_management.received_debit}.
   */
  @SerializedName("object")
  String object;

  /** A link to the Stripe-hosted receipt for this ReceivedDebit. */
  @SerializedName("receipt_url")
  String receiptUrl;

  /**
   * Open Enum. The status of the ReceivedDebit.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code pending}, {@code returned}, or {@code
   * succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Detailed information about the status of the ReceivedDebit. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The time at which the ReceivedDebit transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * Open Enum. The type of the ReceivedDebit.
   *
   * <p>One of {@code bank_transfer}, or {@code external_debit}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about BankTransfer, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /** The Financial Address that was debited. */
    @SerializedName("financial_address")
    String financialAddress;

    /**
     * Open Enum. The type of the payment method used to originate the debit.
     *
     * <p>Equal to {@code us_bank_account}.
     */
    @SerializedName("payment_method_type")
    String paymentMethodType;

    /** The statement descriptor set by the originator of the debit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /** The payment method used to originate the debit. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /** The name of the bank the debit originated from. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Open Enum. The bank network the debit was originated on.
       *
       * <p>Equal to {@code ach}.
       */
      @SerializedName("network")
      String network;

      /** The routing number of the bank that originated the debit. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Information that elaborates on the {@code failed} status of a ReceivedDebit. It is only
     * present when the ReceivedDebit status is {@code failed}.
     */
    @SerializedName("failed")
    Failed failed;

    /**
     * For more details about Failed, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * Open Enum. The reason for the failure of the ReceivedDebit.
       *
       * <p>One of {@code financial_address_inactive}, {@code insufficient_funds}, or {@code
       * stripe_rejected}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * The time when the ReceivedDebit was marked as {@code canceled}. Represented as a RFC 3339
     * date &amp; time UTC value in millisecond precision, for example: {@code
     * 2022-09-18T13:22:18.123Z}.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * The time when the ReceivedDebit was marked as {@code failed}. Represented as a RFC 3339 date
     * &amp; time UTC value in millisecond precision, for example: {@code 2022-09-18T13:22:18.123Z}.
     */
    @SerializedName("failed_at")
    Instant failedAt;

    /**
     * The time when the ReceivedDebit was marked as {@code succeeded}. Represented as a RFC 3339
     * date &amp; time UTC value in millisecond precision, for example: {@code
     * 2022-09-18T13:22:18.123Z}.
     */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }
}
