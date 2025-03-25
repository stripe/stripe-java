// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class V2Services extends ApiService {
  public V2Services(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.BillingService billing() {
    return new com.stripe.service.v2.BillingService(this.getResponseGetter());
  }

  public com.stripe.service.v2.CoreService core() {
    return new com.stripe.service.v2.CoreService(this.getResponseGetter());
  }

  public com.stripe.service.v2.MoneyManagementService moneyManagement() {
    return new com.stripe.service.v2.MoneyManagementService(this.getResponseGetter());
  }
}
