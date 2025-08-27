// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class BillingService extends ApiService {
  public BillingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.billing.BillSettingService billSettings() {
    return new com.stripe.service.v2.billing.BillSettingService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.CadenceService cadences() {
    return new com.stripe.service.v2.billing.CadenceService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.CollectionSettingService collectionSettings() {
    return new com.stripe.service.v2.billing.CollectionSettingService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.CustomPricingUnitService customPricingUnits() {
    return new com.stripe.service.v2.billing.CustomPricingUnitService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.IntentService intents() {
    return new com.stripe.service.v2.billing.IntentService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.LicenseFeeSubscriptionService licenseFeeSubscriptions() {
    return new com.stripe.service.v2.billing.LicenseFeeSubscriptionService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.LicenseFeeService licenseFees() {
    return new com.stripe.service.v2.billing.LicenseFeeService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.LicensedItemService licensedItems() {
    return new com.stripe.service.v2.billing.LicensedItemService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventAdjustmentService meterEventAdjustments() {
    return new com.stripe.service.v2.billing.MeterEventAdjustmentService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventSessionService meterEventSession() {
    return new com.stripe.service.v2.billing.MeterEventSessionService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventStreamService meterEventStream() {
    return new com.stripe.service.v2.billing.MeterEventStreamService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventService meterEvents() {
    return new com.stripe.service.v2.billing.MeterEventService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeteredItemService meteredItems() {
    return new com.stripe.service.v2.billing.MeteredItemService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.PricingPlanSubscriptionService pricingPlanSubscriptions() {
    return new com.stripe.service.v2.billing.PricingPlanSubscriptionService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.PricingPlanService pricingPlans() {
    return new com.stripe.service.v2.billing.PricingPlanService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.ProfileService profiles() {
    return new com.stripe.service.v2.billing.ProfileService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.RateCardSubscriptionService rateCardSubscriptions() {
    return new com.stripe.service.v2.billing.RateCardSubscriptionService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.RateCardService rateCards() {
    return new com.stripe.service.v2.billing.RateCardService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.ServiceActionService serviceActions() {
    return new com.stripe.service.v2.billing.ServiceActionService(this.getResponseGetter());
  }
}
