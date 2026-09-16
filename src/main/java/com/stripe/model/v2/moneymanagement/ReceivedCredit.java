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

  /** The amount and currency of the ReceivedCredit that was received. */
  @SerializedName("amount_received")
  Amount amountReceived;

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
   * This object stores details about the originating issuing card spend that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code card_spend}.
   */
  @SerializedName("card_spend")
  CardSpend cardSpend;

  /**
   * Time at which the ReceivedCredit was created. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * This object stores details about the originating crypto transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code crypto_wallet_transfer}.
   */
  @SerializedName("crypto_wallet_transfer")
  CryptoWalletTransfer cryptoWalletTransfer;

  /** Freeform string set by originator of the ReceivedCredit. */
  @SerializedName("description")
  String description;

  /** The amount and currency of the original/external credit request. */
  @SerializedName("external_amount")
  Amount externalAmount;

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
   * This object stores details about the stripe balance pay refund that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code stripe_balance_payment}.
   */
  @SerializedName("stripe_balance_payment")
  StripeBalancePayment stripeBalancePayment;

  /**
   * This object stores details about the Stripe network transfer that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code stripe_network_transfer}.
   */
  @SerializedName("stripe_network_transfer")
  StripeNetworkTransfer stripeNetworkTransfer;

  /**
   * Open Enum. The type of flow that caused the ReceivedCredit.
   *
   * <p>One of {@code balance_transfer}, {@code bank_transfer}, {@code card_spend}, {@code
   * crypto_wallet_transfer}, {@code external_credit}, {@code stripe_balance_payment}, or {@code
   * stripe_network_transfer}.
   */
  @SerializedName("type")
  String type;

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
    @SerializedName("payout")
    String payout;

    /** The ID of the v1 transfer object that originated the ReceivedCredit. */
    @SerializedName("transfer")
    String transfer;

    /**
     * Open Enum. The type of Stripe Money Movement that originated the ReceivedCredit.
     *
     * <p>One of {@code outbound_payment}, {@code outbound_transfer}, {@code payout}, {@code
     * transfer}, or {@code payout_v1}.
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
    /** Deprecated. Use {@code originating_bank_account.cpa} instead. */
    @SerializedName("ca_bank_account")
    CaBankAccount caBankAccount;

    /** Deprecated. Use {@code originating_bank_account.iban} instead. */
    @SerializedName("eu_bank_account")
    EuBankAccount euBankAccount;

    /** Financial Address on which funds for ReceivedCredit were received. */
    @SerializedName("financial_address")
    String financialAddress;

    /** Deprecated. Use {@code originating_bank_account.sort_code} instead. */
    @SerializedName("gb_bank_account")
    GbBankAccount gbBankAccount;

    /** Deprecated. Use {@code originating_bank_account.clabe} instead. */
    @SerializedName("mx_bank_account")
    MxBankAccount mxBankAccount;

    /** Hash containing the originating bank account details and type for this bank transfer. */
    @SerializedName("originating_bank_account")
    OriginatingBankAccount originatingBankAccount;

    /** Deprecated. Use {@code originating_bank_account.iban} instead. */
    @SerializedName("sepa_bank_account")
    SepaBankAccount sepaBankAccount;

    /** Freeform string set by originator of the external ReceivedCredit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /** Deprecated. Use {@code originating_bank_account.aba} instead. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /** Deprecated. Use {@code originating_bank_account.cpa} instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CaBankAccount extends StripeObject {
      /** The account holder name of the bank account the transfer was received from. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The bank name the transfer was received from. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * The last 4 digits of the account number that originated the transfer. Depending on the
       * bank, this may instead be the last 4 digits of the return account number.
       */
      @SerializedName("last4")
      String last4;

      /**
       * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
       *
       * <p>Equal to {@code acss}.
       */
      @SerializedName("network")
      String network;
    }

    /** Deprecated. Use {@code originating_bank_account.iban} instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EuBankAccount extends StripeObject {
      /** The account holder name of the bank account the transfer was received from. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The bank name the transfer was received from. */
      @SerializedName("bank_name")
      String bankName;

      /** The bic of the account that originated the transfer. */
      @SerializedName("bic")
      String bic;

      /** The last 4 digits of the account number that originated the transfer. */
      @SerializedName("last4")
      String last4;

      /**
       * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
       *
       * <p>Equal to {@code sepa}.
       */
      @SerializedName("network")
      String network;
    }

    /** Deprecated. Use {@code originating_bank_account.sort_code} instead. */
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
       * <p>One of {@code chaps}, or {@code fps}.
       */
      @SerializedName("network")
      String network;

      /** The sort code of the account that originated the transfer. */
      @SerializedName("sort_code")
      String sortCode;
    }

    /** Deprecated. Use {@code originating_bank_account.clabe} instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MxBankAccount extends StripeObject {
      /** The account holder name of the bank account the transfer was received from. */
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
       * <p>Equal to {@code spei}.
       */
      @SerializedName("network")
      String network;
    }

    /** Hash containing the originating bank account details and type for this bank transfer. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OriginatingBankAccount extends StripeObject {
      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * aba}.
       */
      @SerializedName("aba")
      Aba aba;

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * clabe}.
       */
      @SerializedName("clabe")
      Clabe clabe;

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * cpa}.
       */
      @SerializedName("cpa")
      Cpa cpa;

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * iban}.
       */
      @SerializedName("iban")
      Iban iban;

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * sort_code}.
       */
      @SerializedName("sort_code")
      SortCode sortCode;

      /**
       * Open Enum. The type of bank transfer that originated this ReceivedCredit.
       *
       * <p>One of {@code aba}, {@code clabe}, {@code cpa}, {@code iban}, or {@code sort_code}.
       */
      @SerializedName("type")
      String type;

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * aba}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Aba extends StripeObject {
        /** The name of the account holder that sent the payment. */
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
         * <p>One of {@code ach}, {@code rtp}, or {@code us_domestic_wire}.
         */
        @SerializedName("network")
        String network;

        /** The routing number of the account that originated the transfer. */
        @SerializedName("routing_number")
        String routingNumber;
      }

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * clabe}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Clabe extends StripeObject {
        /** The name of the account holder that sent the payment. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The bank name the transfer was received from. */
        @SerializedName("bank_name")
        String bankName;

        /** The BIC/SWIFT code of the account that originated the transfer. */
        @SerializedName("bic")
        String bic;

        /** The last 4 digits of the account number that originated the transfer. */
        @SerializedName("last4")
        String last4;

        /**
         * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
         *
         * <p>Equal to {@code spei}.
         */
        @SerializedName("network")
        String network;
      }

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * cpa}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Cpa extends StripeObject {
        /** The name of the account holder that sent the payment. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The bank name the transfer was received from. */
        @SerializedName("bank_name")
        String bankName;

        /** The BIC/SWIFT code of the account that originated the transfer. */
        @SerializedName("bic")
        String bic;

        /** The last 4 digits of the account number that originated the transfer. */
        @SerializedName("last4")
        String last4;

        /**
         * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
         *
         * <p>Equal to {@code acss}.
         */
        @SerializedName("network")
        String network;
      }

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * iban}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Iban extends StripeObject {
        /** The account holder name of the bank account the transfer was received from. */
        @SerializedName("account_holder_name")
        String accountHolderName;

        /** The bank name the transfer was received from. */
        @SerializedName("bank_name")
        String bankName;

        /** The BIC/SWIFT code of the account that originated the transfer. */
        @SerializedName("bic")
        String bic;

        /** The origination country of the bank transfer. */
        @SerializedName("country")
        String country;

        /** The IBAN that originated the transfer. */
        @SerializedName("iban")
        String iban;

        /**
         * Open Enum. The money transmission network used to send funds for this ReceivedCredit.
         *
         * <p>Equal to {@code sepa_credit_transfer}.
         */
        @SerializedName("network")
        String network;
      }

      /**
       * Hash containing the transaction bank details. Present if {@code type} field value is {@code
       * sort_code}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SortCode extends StripeObject {
        /** The account holder name of the bank account the transfer was received from. */
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
         * <p>One of {@code chaps}, or {@code fps}.
         */
        @SerializedName("network")
        String network;

        /** The sort code of the account that originated the transfer. */
        @SerializedName("sort_code")
        String sortCode;
      }
    }

    /** Deprecated. Use {@code originating_bank_account.iban} instead. */
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

    /** Deprecated. Use {@code originating_bank_account.aba} instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /** The name of the account holder that sent the payment. */
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
       * <p>One of {@code ach}, {@code rtp}, or {@code us_domestic_wire}.
       */
      @SerializedName("network")
      String network;

      /** The routing number of the account that originated the transfer. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  /**
   * This object stores details about the originating issuing card spend that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code card_spend}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardSpend extends StripeObject {
    /** The reference to the issuing card object. */
    @SerializedName("card_v1_id")
    String cardV1Id;

    /** Hash containing information about the Dispute that triggered this credit. */
    @SerializedName("dispute")
    Dispute dispute;

    /** Hash containing information about the Refund that triggered this credit. */
    @SerializedName("refund")
    Refund refund;

    /** Hash containing information about the Dispute that triggered this credit. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dispute extends StripeObject {
      /** The reference to the v1 issuing dispute ID. */
      @SerializedName("issuing_dispute_v1")
      String issuingDisputeV1;
    }

    /** Hash containing information about the Refund that triggered this credit. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Refund extends StripeObject {
      /** The reference to the v1 issuing transaction ID. */
      @SerializedName("issuing_transaction_v1")
      String issuingTransactionV1;
    }
  }

  /**
   * This object stores details about the originating crypto transaction that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code crypto_wallet_transfer}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoWalletTransfer extends StripeObject {
    /** Hash containing the transaction crypto wallet details. */
    @SerializedName("crypto_wallet")
    CryptoWallet cryptoWallet;

    /** Financial Address on which funds for ReceivedCredit were received. */
    @SerializedName("financial_address")
    String financialAddress;

    /** Freeform string set by originator of the external ReceivedCredit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * Open Enum. The type of crypto wallet transfer that originated this ReceivedCredit.
     *
     * <p>Equal to {@code crypto_wallet}.
     */
    @SerializedName("type")
    String type;

    /** Hash containing the transaction crypto wallet details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoWallet extends StripeObject {
      /** The address of the wallet the crypto was received from. */
      @SerializedName("address")
      String address;

      /** A memo also for identifying the recipient for memo-based blockchains (e.g., Stellar),. */
      @SerializedName("memo")
      String memo;

      /**
       * The network the crypto was received from.
       *
       * <p>One of {@code arbitrum}, {@code avalanche_c_chain}, {@code base}, {@code ethereum},
       * {@code optimism}, {@code polygon}, {@code solana}, {@code stellar}, or {@code tempo}.
       */
      @SerializedName("network")
      String network;
    }
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

  /**
   * This object stores details about the stripe balance pay refund that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code stripe_balance_payment}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StripeBalancePayment extends StripeObject {
    /** ID of the debit agreement associated with this payment. */
    @SerializedName("debit_agreement")
    String debitAgreement;

    /** Statement descriptor for the Stripe Balance Payment. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * This object stores details about the Stripe network transfer that resulted in the
   * ReceivedCredit. Present if {@code type} field value is {@code stripe_network_transfer}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StripeNetworkTransfer extends StripeObject {
    /** Information about the sender of the network transfer. */
    @SerializedName("from")
    From from;

    /** Information about the sender of the network transfer. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class From extends StripeObject {
      /** The network ID of the sender. */
      @SerializedName("network_business_profile")
      String networkBusinessProfile;

      /**
       * Open Enum. The type of the sender.
       *
       * <p>Equal to {@code network_business_profile}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
