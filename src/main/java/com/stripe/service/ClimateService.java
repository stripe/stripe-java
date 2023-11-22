// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ClimateService extends ApiService {
  public ClimateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.climate.OrderService orders() {
    return new com.stripe.service.climate.OrderService(this.getResponseGetter());
  }

  public com.stripe.service.climate.ProductService products() {
    return new com.stripe.service.climate.ProductService(this.getResponseGetter());
  }

  public com.stripe.service.climate.SupplierService suppliers() {
    return new com.stripe.service.climate.SupplierService(this.getResponseGetter());
  }
}
