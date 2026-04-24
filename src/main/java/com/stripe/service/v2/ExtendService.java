// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ExtendService extends ApiService {
  public ExtendService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.extend.WorkflowRunService workflowRuns() {
    return new com.stripe.service.v2.extend.WorkflowRunService(this.getResponseGetter());
  }

  public com.stripe.service.v2.extend.WorkflowService workflows() {
    return new com.stripe.service.v2.extend.WorkflowService(this.getResponseGetter());
  }
}
