// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class RiskService extends ApiService {
  public RiskService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.risk.InquiryService inquiries() {
    return new com.stripe.service.v2.risk.InquiryService(this.getResponseGetter());
  }
}
