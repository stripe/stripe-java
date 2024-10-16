// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Customers with certain payments enabled have a cash balance, representing funds that were paid by
 * the customer to a merchant, but have not yet been allocated to a payment. Cash Balance
 * Transactions represent when funds are moved into or out of this balance. This includes funding by
 * the customer, allocation to payments, and refunds to the customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerCashBalanceTransaction extends StripeObject
    implements BalanceTransactionSource {
  @SerializedName("adjusted_for_overdraft")
  AdjustedForOverdraft adjustedForOverdraft;

  @SerializedName("applied_to_payment")
  AppliedToPayment appliedToPayment;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The customer whose available cash balance changed as a result of this transaction. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * The total available cash balance for the specified currency after this transaction was applied.
   * Represented in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
   * unit</a>.
   */
  @SerializedName("ending_balance")
  Long endingBalance;

  @SerializedName("funded")
  Funded funded;

  /** Unique identifier for the object. */
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
   * The amount by which the cash balance changed, represented in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>. A positive
   * value represents funds being added to the cash balance, a negative value represents funds being
   * removed from the cash balance.
   */
  @SerializedName("net_amount")
  Long netAmount;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer_cash_balance_transaction}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("refunded_from_payment")
  RefundedFromPayment refundedFromPayment;

  @SerializedName("transferred_to_balance")
  TransferredToBalance transferredToBalance;

  /**
   * The type of the cash balance transaction. New types may be added in future. See <a
   * href="https://stripe.com/docs/payments/customer-balance#types">Customer Balance</a> to learn
   * more about these types.
   *
   * <p>One of {@code adjusted_for_overdraft}, {@code applied_to_payment}, {@code funded}, {@code
   * funding_reversed}, {@code refunded_from_payment}, {@code return_canceled}, {@code
   * return_initiated}, {@code transferred_to_balance}, or {@code unapplied_from_payment}.
   */
  @SerializedName("type")
  String type;

  @SerializedName("unapplied_from_payment")
  UnappliedFromPayment unappliedFromPayment;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdjustedForOverdraft extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/balance_transactions/object">Balance Transaction</a>
     * that corresponds to funds taken out of your Stripe balance.
     */
    @SerializedName("balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<BalanceTransaction> balanceTransaction;

    /**
     * The <a href="https://stripe.com/docs/api/cash_balance_transactions/object">Cash Balance
     * Transaction</a> that brought the customer balance negative, triggering the clawback of funds.
     */
    @SerializedName("linked_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<CustomerCashBalanceTransaction> linkedTransaction;

    /** Get ID of expandable {@code balanceTransaction} object. */
    public String getBalanceTransaction() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
    }

    public void setBalanceTransaction(String id) {
      this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
    }

    /** Get expanded {@code balanceTransaction}. */
    public BalanceTransaction getBalanceTransactionObject() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
    }

    public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
      this.balanceTransaction =
          new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code linkedTransaction} object. */
    public String getLinkedTransaction() {
      return (this.linkedTransaction != null) ? this.linkedTransaction.getId() : null;
    }

    public void setLinkedTransaction(String id) {
      this.linkedTransaction = ApiResource.setExpandableFieldId(id, this.linkedTransaction);
    }

    /** Get expanded {@code linkedTransaction}. */
    public CustomerCashBalanceTransaction getLinkedTransactionObject() {
      return (this.linkedTransaction != null) ? this.linkedTransaction.getExpanded() : null;
    }

    public void setLinkedTransactionObject(CustomerCashBalanceTransaction expandableObject) {
      this.linkedTransaction =
          new ExpandableField<CustomerCashBalanceTransaction>(
              expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliedToPayment extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/payment_intents/object">Payment Intent</a> that
     * funds were applied to.
     */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /** Get ID of expandable {@code paymentIntent} object. */
    public String getPaymentIntent() {
      return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }

    public void setPaymentIntent(String id) {
      this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }

    /** Get expanded {@code paymentIntent}. */
    public PaymentIntent getPaymentIntentObject() {
      return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }

    public void setPaymentIntentObject(PaymentIntent expandableObject) {
      this.paymentIntent =
          new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Funded extends StripeObject {
    @SerializedName("bank_transfer")
    BankTransfer bankTransfer;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankTransfer extends StripeObject {
      @SerializedName("eu_bank_transfer")
      EuBankTransfer euBankTransfer;

      @SerializedName("gb_bank_transfer")
      GbBankTransfer gbBankTransfer;

      @SerializedName("jp_bank_transfer")
      JpBankTransfer jpBankTransfer;

      /** The user-supplied reference field on the bank transfer. */
      @SerializedName("reference")
      String reference;

      /**
       * The funding method type used to fund the customer balance. Permitted values include: {@code
       * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code
       * mx_bank_transfer}, or {@code us_bank_transfer}.
       *
       * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer},
       * {@code mx_bank_transfer}, or {@code us_bank_transfer}.
       */
      @SerializedName("type")
      String type;

      @SerializedName("us_bank_transfer")
      UsBankTransfer usBankTransfer;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EuBankTransfer extends StripeObject {
        /** The BIC of the bank of the sender of the funding. */
        @SerializedName("bic")
        String bic;

        /** The last 4 digits of the IBAN of the sender of the funding. */
        @SerializedName("iban_last4")
        String ibanLast4;

        /** The full name of the sender, as supplied by the sending bank. */
        @SerializedName("sender_name")
        String senderName;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class GbBankTransfer extends StripeObject {
        /** The last 4 digits of the account number of the sender of the funding. */
        @SerializedName("account_number_last4")
        String accountNumberLast4;

        /** The full name of the sender, as supplied by the sending bank. */
        @SerializedName("sender_name")
        String senderName;

        /** The sort code of the bank of the sender of the funding. */
        @SerializedName("sort_code")
        String sortCode;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class JpBankTransfer extends StripeObject {
        /** The name of the bank of the sender of the funding. */
        @SerializedName("sender_bank")
        String senderBank;

        /** The name of the bank branch of the sender of the funding. */
        @SerializedName("sender_branch")
        String senderBranch;

        /** The full name of the sender, as supplied by the sending bank. */
        @SerializedName("sender_name")
        String senderName;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class UsBankTransfer extends StripeObject {
        /**
         * The banking network used for this funding.
         *
         * <p>One of {@code ach}, {@code domestic_wire_us}, or {@code swift}.
         */
        @SerializedName("network")
        String network;

        /** The full name of the sender, as supplied by the sending bank. */
        @SerializedName("sender_name")
        String senderName;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RefundedFromPayment extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/refunds/object">Refund</a> that moved these funds
     * into the customer's cash balance.
     */
    @SerializedName("refund")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Refund> refund;

    /** Get ID of expandable {@code refund} object. */
    public String getRefund() {
      return (this.refund != null) ? this.refund.getId() : null;
    }

    public void setRefund(String id) {
      this.refund = ApiResource.setExpandableFieldId(id, this.refund);
    }

    /** Get expanded {@code refund}. */
    public Refund getRefundObject() {
      return (this.refund != null) ? this.refund.getExpanded() : null;
    }

    public void setRefundObject(Refund expandableObject) {
      this.refund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferredToBalance extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/balance_transactions/object">Balance Transaction</a>
     * that corresponds to funds transferred to your Stripe balance.
     */
    @SerializedName("balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<BalanceTransaction> balanceTransaction;

    /** Get ID of expandable {@code balanceTransaction} object. */
    public String getBalanceTransaction() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
    }

    public void setBalanceTransaction(String id) {
      this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
    }

    /** Get expanded {@code balanceTransaction}. */
    public BalanceTransaction getBalanceTransactionObject() {
      return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
    }

    public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
      this.balanceTransaction =
          new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UnappliedFromPayment extends StripeObject {
    /**
     * The <a href="https://stripe.com/docs/api/payment_intents/object">Payment Intent</a> that
     * funds were unapplied from.
     */
    @SerializedName("payment_intent")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentIntent> paymentIntent;

    /** Get ID of expandable {@code paymentIntent} object. */
    public String getPaymentIntent() {
      return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }

    public void setPaymentIntent(String id) {
      this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }

    /** Get expanded {@code paymentIntent}. */
    public PaymentIntent getPaymentIntentObject() {
      return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }

    public void setPaymentIntentObject(PaymentIntent expandableObject) {
      this.paymentIntent =
          new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
    }
  }
}
