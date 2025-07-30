// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class BillingService extends ApiService {
  public BillingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.billing.AlertService alerts() {
    return new com.stripe.service.billing.AlertService(this.getResponseGetter());
  }

  public com.stripe.service.billing.CreditBalanceSummaryService creditBalanceSummary() {
    return new com.stripe.service.billing.CreditBalanceSummaryService(this.getResponseGetter());
  }

  public com.stripe.service.billing.CreditBalanceTransactionService creditBalanceTransactions() {
    return new com.stripe.service.billing.CreditBalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.billing.CreditGrantService creditGrants() {
    return new com.stripe.service.billing.CreditGrantService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterEventAdjustmentService meterEventAdjustments() {
    return new com.stripe.service.billing.MeterEventAdjustmentService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterEventService meterEvents() {
    return new com.stripe.service.billing.MeterEventService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterUsageService meterUsage() {
    return new com.stripe.service.billing.MeterUsageService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterService meters() {
    return new com.stripe.service.billing.MeterService(this.getResponseGetter());
  }
}
