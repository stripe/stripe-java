// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import com.stripe.model.issuing.Authorization;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FlowDetails extends StripeObject {
  /**
   * You can reverse some <a href="https://stripe.com/docs/api#received_credits">ReceivedCredits</a> depending on their network and source flow. Reversing a ReceivedCredit leads to the creation of a new object known as a CreditReversal.
   */
  @SerializedName("credit_reversal")
  CreditReversal creditReversal;

  /**
   * You can reverse some <a href="https://stripe.com/docs/api#received_debits">ReceivedDebits</a> depending on their network and source flow. Reversing a ReceivedDebit leads to the creation of a new object known as a DebitReversal.
   */
  @SerializedName("debit_reversal")
  DebitReversal debitReversal;

  /**
   * Use <a href="https://stripe.com/docs/treasury/moving-money/financial-accounts/into/inbound-transfers">InboundTransfers</a> to add funds to your <a href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a> via a PaymentMethod that is owned by you. The funds will be transferred via an ACH debit.
   */
  @SerializedName("inbound_transfer")
  InboundTransfer inboundTransfer;

  /**
   * When an <a href="https://stripe.com/docs/issuing">issued card</a> is used to make a purchase, an Issuing {@code Authorization} object is created. <a href="https://stripe.com/docs/issuing/purchases/authorizations">Authorizations</a> must be approved for the purchase to be completed successfully.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/issuing/purchases/authorizations">Issued Card Authorizations</a>.
   */
  @SerializedName("issuing_authorization")
  Authorization issuingAuthorization;

  /**
   * Use OutboundPayments to send funds to another party's external bank account or <a href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a>. To send money to an account belonging to the same user, use an <a href="https://stripe.com/docs/api#outbound_transfers">OutboundTransfer</a>.
   *
   * <p>Simulate OutboundPayment state changes with the {@code /v1/test_helpers/treasury/outbound_payments} endpoints. These methods can only be called on test mode objects.
   */
  @SerializedName("outbound_payment")
  OutboundPayment outboundPayment;

  /**
   * Use OutboundTransfers to transfer funds from a <a href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a> to a PaymentMethod belonging to the same entity. To send funds to a different party, use <a href="https://stripe.com/docs/api#outbound_payments">OutboundPayments</a> instead. You can send funds over ACH rails or through a domestic wire transfer to a user's own external bank account.
   *
   * <p>Simulate OutboundTransfer state changes with the {@code /v1/test_helpers/treasury/outbound_transfers} endpoints. These methods can only be called on test mode objects.
   */
  @SerializedName("outbound_transfer")
  OutboundTransfer outboundTransfer;

  /**
   * ReceivedCredits represent funds sent to a <a href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a> (for example, via ACH or wire). These money movements are not initiated from the FinancialAccount.
   */
  @SerializedName("received_credit")
  ReceivedCredit receivedCredit;

  /**
   * ReceivedDebits represent funds pulled from a <a href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a>. These are not initiated from the FinancialAccount.
   */
  @SerializedName("received_debit")
  ReceivedDebit receivedDebit;

  /**
   * Type of the flow that created the Transaction. Set to the same value as {@code flow_type}.
   *
   * <p>One of {@code credit_reversal}, {@code debit_reversal}, {@code inbound_transfer}, {@code issuing_authorization}, {@code other}, {@code outbound_payment}, {@code outbound_transfer}, {@code received_credit}, or {@code received_debit}.
   */
  @SerializedName("type")
  String type;
}