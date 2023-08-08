// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TreasuryService extends ApiService {
  public TreasuryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.treasury.CreditReversalService creditReversals() {
    return new com.stripe.service.treasury.CreditReversalService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.DebitReversalService debitReversals() {
    return new com.stripe.service.treasury.DebitReversalService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.FinancialAccountService financialAccounts() {
    return new com.stripe.service.treasury.FinancialAccountService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.InboundTransferService inboundTransfers() {
    return new com.stripe.service.treasury.InboundTransferService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.OutboundPaymentService outboundPayments() {
    return new com.stripe.service.treasury.OutboundPaymentService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.OutboundTransferService outboundTransfers() {
    return new com.stripe.service.treasury.OutboundTransferService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.ReceivedCreditService receivedCredits() {
    return new com.stripe.service.treasury.ReceivedCreditService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.ReceivedDebitService receivedDebits() {
    return new com.stripe.service.treasury.ReceivedDebitService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.TransactionEntryService transactionEntries() {
    return new com.stripe.service.treasury.TransactionEntryService(this.getResponseGetter());
  }

  public com.stripe.service.treasury.TransactionService transactions() {
    return new com.stripe.service.treasury.TransactionService(this.getResponseGetter());
  }
}
