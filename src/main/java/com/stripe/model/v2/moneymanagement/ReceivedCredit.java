// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Use ReceivedCredits API to retrieve information on when, where, and how funds are sent into your
 * FinancialAccount.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReceivedCredit extends StripeObject implements HasId {
  /** The amount and currency of the ReceivedCredit. */
  @SerializedName("amount")
  Amount amount;

  /**
   * This object stores details about the originating Stripe transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code balance_transfer}.
   */
  @SerializedName("balance_transfer")
  BalanceTransfer balanceTransfer;

  /**
   * This object stores details about the originating banking transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code bank_transfer}.
   */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Time at which the ReceivedCredit was created. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Freeform string set by originator of the ReceivedCredit. */
  @SerializedName("description")
  String description;

  /** The amount and currency of the original/external credit request. */
  @SerializedName("external_amount")
  ExternalAmount externalAmount;

  /** Financial Account ID on which funds for ReceivedCredit were received. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the ReceivedCredit. */
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
   * <p>Equal to {@code v2.money_management.received_credit}.
   */
  @SerializedName("object")
  String object;

  /**
   * A hosted transaction receipt URL that is provided when money movement is considered regulated
   * under Stripe’s money transmission licenses.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /**
   * Open Enum. The status of the ReceivedCredit.
   *
   * <p>One of {@code failed}, {@code pending}, {@code returned}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * This hash contains detailed information that elaborates on the specific status of the
   * ReceivedCredit. e.g the reason behind a failure if the status is marked as {@code failed}.
   */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * Open Enum. The type of flow that caused the ReceivedCredit.
   *
   * <p>One of {@code balance_transfer}, {@code bank_transfer}, or {@code external_credit}.
   */
  @SerializedName("type")
  String type;

  /** The amount and currency of the ReceivedCredit. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;
  }

  /**
   * This object stores details about the originating Stripe transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code balance_transfer}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceTransfer extends StripeObject {
    /** The ID of the account that owns the source object originated the ReceivedCredit. */
    @SerializedName("from_account")
    String fromAccount;

    /** The ID of the outbound payment object that originated the ReceivedCredit. */
    @SerializedName("outbound_payment")
    String outboundPayment;

    /** The ID of the outbound transfer object that originated the ReceivedCredit. */
    @SerializedName("outbound_transfer")
    String outboundTransfer;

    /** The ID of the payout object that originated the ReceivedCredit. */
    @SerializedName("payout_v1")
    String payoutV1;

    /**
     * Open Enum. The type of Stripe Money Movement that originated the ReceivedCredit.
     *
     * <p>One of {@code outbound_payment}, {@code outbound_transfer}, or {@code payout_v1}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * This object stores details about the originating banking transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code bank_transfer}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer extends StripeObject {
    /** Financial Address on which funds for ReceivedCredit were received. */
    @SerializedName("financial_address")
    String financialAddress;

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code gb_bank_account}.
     */
    @SerializedName("gb_bank_account")
    GbBankAccount gbBankAccount;

    /**
     * Open Enum. Indicates the origin of source from which external funds originated from.
     *
     * <p>One of {@code gb_bank_account}, {@code sepa_bank_account}, or {@code us_bank_account}.
     */
    @SerializedName("origin_type")
    String originType;

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code sepa_bank_account}.
     */
    @SerializedName("sepa_bank_account")
    SepaBankAccount sepaBankAccount;

    /** Freeform string set by originator of the external ReceivedCredit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code us_bank_account}.
     */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code gb_bank_account}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GbBankAccount extends StripeObject {
      /** The bank name the transfer was received from. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The bank name the transfer was received from. */
      @SerializedName("bank_name")
      String bankName;

      /** The last 4 digits of the account number that originated the transfer. */
      @SerializedName("last4")
      String last4;

      /**
       * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
       *
       * <p>Equal to {@code fps}.
       */
      @SerializedName("network")
      String network;

      /** The sort code of the account that originated the transfer. */
      @SerializedName("sort_code")
      String sortCode;
    }

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code sepa_bank_account}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaBankAccount extends StripeObject {
      /** The account holder name of the bank account the transfer was received from. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The bank name the transfer was received from. */
      @SerializedName("bank_name")
      String bankName;

      /** The BIC of the SEPA account. */
      @SerializedName("bic")
      String bic;

      /** The origination country of the bank transfer. */
      @SerializedName("country")
      String country;

      /** The IBAN that originated the transfer. */
      @SerializedName("iban")
      String iban;

      /**
       * The money transmission network used to send funds for this ReceivedCredit.
       *
       * <p>Equal to {@code sepa_credit_transfer}.
       */
      @SerializedName("network")
      String network;
    }

    /**
     * Hash containing the transaction bank details. Present if {@code origin_type} field value is
     * {@code us_bank_account}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /** The bank name the transfer was received from. */
      @SerializedName("bank_name")
      String bankName;

      /** The last 4 digits of the account number that originated the transfer. */
      @SerializedName("last4")
      String last4;

      /**
       * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
       *
       * <p>One of {@code ach}, {@code rtp}, or {@code us_domestic_wire}.
       */
      @SerializedName("network")
      String network;

      /** The routing number of the account that originated the transfer. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  /** The amount and currency of the original/external credit request. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ExternalAmount extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;
  }

  /**
   * This hash contains detailed information that elaborates on the specific status of the
   * ReceivedCredit. e.g the reason behind a failure if the status is marked as {@code failed}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Hash that provides additional information regarding the reason behind a {@code failed}
     * ReceivedCredit status. It is only present when the ReceivedCredit status is {@code failed}.
     */
    @SerializedName("failed")
    Failed failed;

    /**
     * Hash that provides additional information regarding the reason behind a {@code returned}
     * ReceivedCredit status. It is only present when the ReceivedCredit status is {@code returned}.
     */
    @SerializedName("returned")
    Returned returned;

    /**
     * Hash that provides additional information regarding the reason behind a {@code failed}
     * ReceivedCredit status. It is only present when the ReceivedCredit status is {@code failed}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * Open Enum. The {@code failed} status reason.
       *
       * <p>One of {@code capability_inactive}, {@code currency_unsupported_on_financial_address},
       * {@code financial_address_inactive}, or {@code stripe_rejected}.
       */
      @SerializedName("reason")
      String reason;
    }

    /**
     * Hash that provides additional information regarding the reason behind a {@code returned}
     * ReceivedCredit status. It is only present when the ReceivedCredit status is {@code returned}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Returned extends StripeObject {
      /**
       * Open Enum. The {@code returned} status reason.
       *
       * <p>Equal to {@code originator_initiated_reversal}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when the ReceivedCredit was marked as {@code failed}. Represented as a
     * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("failed_at")
    Instant failedAt;

    /**
     * Timestamp describing when the ReceivedCredit changed status to {@code returned}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("returned_at")
    Instant returnedAt;

    /**
     * Timestamp describing when the ReceivedCredit was marked as {@code succeeded}. Represented as
     * a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }
}
