// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class MoneyManagementService extends ApiService {
  public MoneyManagementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.moneymanagement.OutboundSetupIntentService outboundSetupIntents() {
    return new com.stripe.service.v2.moneymanagement.OutboundSetupIntentService(
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
}
