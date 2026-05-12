// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Dispute;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams;

public final class DisputeService extends ApiService {
  public DisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Test helper: populates {@code network_lifecycle.pre_arbitration_submission} on a test-mode Visa
   * Issuing Dispute using placeholder file tokens. Only supported for Visa disputes.
   */
  public Dispute simulateNetworkLifecyclePreArbitrationSubmission(
      String dispute, DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams params)
      throws StripeException {
    return simulateNetworkLifecyclePreArbitrationSubmission(dispute, params, (RequestOptions) null);
  }
  /**
   * Test helper: populates {@code network_lifecycle.pre_arbitration_submission} on a test-mode Visa
   * Issuing Dispute using placeholder file tokens. Only supported for Visa disputes.
   */
  public Dispute simulateNetworkLifecyclePreArbitrationSubmission(
      String dispute,
      DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/disputes/%s/simulate_network_lifecycle_pre_arbitration_submission",
            ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
}
