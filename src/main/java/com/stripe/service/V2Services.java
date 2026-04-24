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

  public com.stripe.service.v2.CommerceService commerce() {
    return new com.stripe.service.v2.CommerceService(this.getResponseGetter());
  }

  public com.stripe.service.v2.CoreService core() {
    return new com.stripe.service.v2.CoreService(this.getResponseGetter());
  }

  public com.stripe.service.v2.DatumService data() {
    return new com.stripe.service.v2.DatumService(this.getResponseGetter());
  }

  public com.stripe.service.v2.ExtendService extend() {
    return new com.stripe.service.v2.ExtendService(this.getResponseGetter());
  }

  public com.stripe.service.v2.IamService iam() {
    return new com.stripe.service.v2.IamService(this.getResponseGetter());
  }

  public com.stripe.service.v2.MoneyManagementService moneyManagement() {
    return new com.stripe.service.v2.MoneyManagementService(this.getResponseGetter());
  }

  public com.stripe.service.v2.NetworkService network() {
    return new com.stripe.service.v2.NetworkService(this.getResponseGetter());
  }

  public com.stripe.service.v2.OrchestratedCommerceService orchestratedCommerce() {
    return new com.stripe.service.v2.OrchestratedCommerceService(this.getResponseGetter());
  }

  public com.stripe.service.v2.PaymentService payments() {
    return new com.stripe.service.v2.PaymentService(this.getResponseGetter());
  }

  public com.stripe.service.v2.ReportingService reporting() {
    return new com.stripe.service.v2.ReportingService(this.getResponseGetter());
  }

  public com.stripe.service.v2.TaxService tax() {
    return new com.stripe.service.v2.TaxService(this.getResponseGetter());
  }

  public com.stripe.service.v2.TestHelperService testHelpers() {
    return new com.stripe.service.v2.TestHelperService(this.getResponseGetter());
  }
}
