// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class MoneyManagementService extends ApiService {
  public MoneyManagementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.moneymanagement.AdjustmentService adjustments() {
    return new com.stripe.service.v2.moneymanagement.AdjustmentService(this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.FinancialAccountService financialAccounts() {
    return new com.stripe.service.v2.moneymanagement.FinancialAccountService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.FinancialAddressService financialAddresses() {
    return new com.stripe.service.v2.moneymanagement.FinancialAddressService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.InboundTransferService inboundTransfers() {
    return new com.stripe.service.v2.moneymanagement.InboundTransferService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.OutboundPaymentService outboundPayments() {
    return new com.stripe.service.v2.moneymanagement.OutboundPaymentService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.OutboundSetupIntentService outboundSetupIntents() {
    return new com.stripe.service.v2.moneymanagement.OutboundSetupIntentService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.OutboundTransferService outboundTransfers() {
    return new com.stripe.service.v2.moneymanagement.OutboundTransferService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.PayoutMethodService payoutMethods() {
    return new com.stripe.service.v2.moneymanagement.PayoutMethodService(this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.PayoutMethodsBankAccountSpecService
      payoutMethodsBankAccountSpec() {
    return new com.stripe.service.v2.moneymanagement.PayoutMethodsBankAccountSpecService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.ReceivedCreditService receivedCredits() {
    return new com.stripe.service.v2.moneymanagement.ReceivedCreditService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.ReceivedDebitService receivedDebits() {
    return new com.stripe.service.v2.moneymanagement.ReceivedDebitService(this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.TransactionEntryService transactionEntries() {
    return new com.stripe.service.v2.moneymanagement.TransactionEntryService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.moneymanagement.TransactionService transactions() {
    return new com.stripe.service.v2.moneymanagement.TransactionService(this.getResponseGetter());
  }
}
