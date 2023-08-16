// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CapitalService extends ApiService {
  public CapitalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.capital.FinancingOfferService financingOffers() {
    return new com.stripe.service.capital.FinancingOfferService(this.getResponseGetter());
  }

  public com.stripe.service.capital.FinancingSummaryService financingSummary() {
    return new com.stripe.service.capital.FinancingSummaryService(this.getResponseGetter());
  }

  public com.stripe.service.capital.FinancingTransactionService financingTransactions() {
    return new com.stripe.service.capital.FinancingTransactionService(this.getResponseGetter());
  }
}
