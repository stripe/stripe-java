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
public class CustomerCashBalanceTransaction extends StripeObject implements HasId {
  @SerializedName("applied_to_payment")
  CashBalance.AppliedToPaymentTransaction appliedToPayment;

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
  CashBalance.FundedTransaction funded;

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
  CashBalance.RefundedFromPaymentTransaction refundedFromPayment;

  /**
   * The type of the cash balance transaction. One of {@code applied_to_payment}, {@code
   * unapplied_from_payment}, {@code refunded_from_payment}, {@code funded}, {@code
   * return_initiated}, or {@code return_canceled}. New types may be added in future. See <a
   * href="https://stripe.com/docs/payments/customer-balance#types">Customer Balance</a> to learn
   * more about these types.
   */
  @SerializedName("type")
  String type;

  @SerializedName("unapplied_from_payment")
  CashBalance.UnappliedFromPaymentTransaction unappliedFromPayment;

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
}
