// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class DataService extends ApiService {
  public DataService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.data.ReportingService reporting() {
    return new com.stripe.service.v2.data.ReportingService(this.getResponseGetter());
  }
}
