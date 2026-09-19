// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ProvisioningService extends ApiService {
  public ProvisioningService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.provisioning.CatalogService catalog() {
    return new com.stripe.service.v2.provisioning.CatalogService(this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.EligibilityService eligibility() {
    return new com.stripe.service.v2.provisioning.EligibilityService(this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.PaymentMethodRequestService paymentMethodRequests() {
    return new com.stripe.service.v2.provisioning.PaymentMethodRequestService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.PaymentProfileService paymentProfile() {
    return new com.stripe.service.v2.provisioning.PaymentProfileService(this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.ProjectService projects() {
    return new com.stripe.service.v2.provisioning.ProjectService(this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.ProviderConnectionRequestService
      providerConnectionRequests() {
    return new com.stripe.service.v2.provisioning.ProviderConnectionRequestService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.ProviderConnectionService providerConnections() {
    return new com.stripe.service.v2.provisioning.ProviderConnectionService(
        this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.ResourceService resources() {
    return new com.stripe.service.v2.provisioning.ResourceService(this.getResponseGetter());
  }
}
