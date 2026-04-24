// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class IamService extends ApiService {
  public IamService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.iam.ActivityLogService activityLogs() {
    return new com.stripe.service.v2.iam.ActivityLogService(this.getResponseGetter());
  }
}
