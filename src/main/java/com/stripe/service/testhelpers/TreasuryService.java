// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TreasuryService extends ApiService {
  public TreasuryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.treasury.InboundTransferService inboundTransfers() {
    return new com.stripe.service.testhelpers.treasury.InboundTransferService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.treasury.OutboundPaymentService outboundPayments() {
    return new com.stripe.service.testhelpers.treasury.OutboundPaymentService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.treasury.OutboundTransferService outboundTransfers() {
    return new com.stripe.service.testhelpers.treasury.OutboundTransferService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.treasury.ReceivedCreditService receivedCredits() {
    return new com.stripe.service.testhelpers.treasury.ReceivedCreditService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.treasury.ReceivedDebitService receivedDebits() {
    return new com.stripe.service.testhelpers.treasury.ReceivedDebitService(
        this.getResponseGetter());
  }
}
