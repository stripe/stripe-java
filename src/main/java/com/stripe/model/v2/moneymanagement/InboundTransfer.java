// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InboundTransfer extends StripeObject implements HasId {
  /** The amount in specified currency that will land in the FinancialAccount balance. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Creation time of the InboundTransfer. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** A freeform text field provided by user, containing metadata. */
  @SerializedName("description")
  String description;

  /** A nested object containing information about the origin of the InboundTransfer. */
  @SerializedName("from")
  From from;

  /** Unique identifier for the InboundTransfer. */
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
   * <p>Equal to {@code v2.money_management.inbound_transfer}.
   */
  @SerializedName("object")
  String object;

  /**
   * A hosted transaction receipt URL that is provided when money movement is considered regulated
   * under Stripe’s money transmission licenses.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /** A nested object containing information about the destination of the InboundTransfer. */
  @SerializedName("to")
  To to;

  /** A list of history objects, representing changes in the state of the InboundTransfer. */
  @SerializedName("transfer_history")
  List<InboundTransfer.TransferHistory> transferHistory;

  /**
   * For more details about From, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The amount in specified currency that was debited from the Payment Method. */
    @SerializedName("debited")
    Amount debited;

    /** The Payment Method object used to create the InboundTransfer. */
    @SerializedName("payment_method")
    PaymentMethod paymentMethod;

    /**
     * For more details about PaymentMethod, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethod extends StripeObject {
      /**
       * The type of object this destination represents. For a us bank account, we expect
       * us_bank_account.
       */
      @SerializedName("type")
      String type;

      /** The destination US bank account identifier. eg &quot;usba_***&quot;. */
      @SerializedName("us_bank_account")
      String usBankAccount;
    }
  }

  /**
   * For more details about To, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The amount by which the FinancialAccount balance is credited. */
    @SerializedName("credited")
    Amount credited;

    /** The FinancialAccount that funds will land in. */
    @SerializedName("financial_account")
    String financialAccount;
  }

  /**
   * For more details about TransferHistory, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferHistory extends StripeObject implements HasId {
    /** The history entry for a failed InboundTransfer. */
    @SerializedName("bank_debit_failed")
    BankDebitFailed bankDebitFailed;

    /** The history entry for a processing InboundTransfer. */
    @SerializedName("bank_debit_processing")
    BankDebitProcessing bankDebitProcessing;

    /** The history entry for a queued InboundTransfer. */
    @SerializedName("bank_debit_queued")
    BankDebitQueued bankDebitQueued;

    /** The history entry for a returned InboundTransfer. */
    @SerializedName("bank_debit_returned")
    BankDebitReturned bankDebitReturned;

    /** The history entry for a succeeded InboundTransfer. */
    @SerializedName("bank_debit_succeeded")
    BankDebitSucceeded bankDebitSucceeded;

    /** Creation time of the HistoryEntry in RFC 3339 format and UTC. */
    @SerializedName("created")
    Instant created;

    /** Effective at time of the HistoryEntry in RFC 3339 format and UTC. */
    @SerializedName("effective_at")
    Instant effectiveAt;

    /** A unique ID for the HistoryEntry. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * Open Enum. The Level of the HistoryEntry.
     *
     * <p>One of {@code canonical}, or {@code debug}.
     */
    @SerializedName("level")
    String level;

    /**
     * Open Enum. The type of the HistoryEntry.
     *
     * <p>One of {@code bank_debit_failed}, {@code bank_debit_processing}, {@code
     * bank_debit_queued}, {@code bank_debit_returned}, or {@code bank_debit_succeeded}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about BankDebitFailed, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankDebitFailed extends StripeObject {
      /**
       * Open Enum. The return reason for the failed InboundTransfer.
       *
       * <p>One of {@code bank_account_closed}, {@code bank_account_not_found}, {@code
       * bank_debit_could_not_be_processed}, {@code bank_debit_not_authorized}, or {@code
       * insufficient_funds}.
       */
      @SerializedName("failure_reason")
      String failureReason;
    }

    /**
     * For more details about BankDebitProcessing, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankDebitProcessing extends StripeObject {}

    /**
     * For more details about BankDebitQueued, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankDebitQueued extends StripeObject {}

    /**
     * For more details about BankDebitReturned, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankDebitReturned extends StripeObject {
      /**
       * Open Enum. The return reason for the returned InboundTransfer.
       *
       * <p>One of {@code bank_account_closed}, {@code bank_account_not_found}, {@code
       * bank_debit_could_not_be_processed}, {@code bank_debit_not_authorized}, or {@code
       * insufficient_funds}.
       */
      @SerializedName("return_reason")
      String returnReason;
    }

    /**
     * For more details about BankDebitSucceeded, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankDebitSucceeded extends StripeObject {}
  }
}
