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
import com.stripe.param.issuing.DisputeCloseParams;
import com.stripe.param.issuing.DisputeSimulateNetworkLifecycleDisputeResponseParams;
import com.stripe.param.issuing.DisputeSimulateNetworkLifecyclePreArbitrationResponseParams;
import com.stripe.param.issuing.DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams;

public final class DisputeService extends ApiService {
  public DisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Test helper: closes a test-mode Issuing dispute as won or lost. */
  public Dispute close(String dispute, DisputeCloseParams params) throws StripeException {
    return close(dispute, params, (RequestOptions) null);
  }
  /** Test helper: closes a test-mode Issuing dispute as won or lost. */
  public Dispute close(String dispute, DisputeCloseParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/disputes/%s/close", ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
  /**
   * Test helper: populates {@code network_lifecycle.dispute_response} on a test-mode Visa Issuing
   * Dispute using placeholder file tokens. Only supported for Visa disputes.
   */
  public Dispute simulateNetworkLifecycleDisputeResponse(
      String dispute, DisputeSimulateNetworkLifecycleDisputeResponseParams params)
      throws StripeException {
    return simulateNetworkLifecycleDisputeResponse(dispute, params, (RequestOptions) null);
  }
  /**
   * Test helper: populates {@code network_lifecycle.dispute_response} on a test-mode Visa Issuing
   * Dispute using placeholder file tokens. Only supported for Visa disputes.
   */
  public Dispute simulateNetworkLifecycleDisputeResponse(
      String dispute,
      DisputeSimulateNetworkLifecycleDisputeResponseParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/disputes/%s/simulate_network_lifecycle_dispute_response",
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
  /**
   * Test helper: populates {@code network_lifecycle.pre_arbitration_response} on a test-mode Visa
   * Issuing Dispute using placeholder file tokens. Only supported for Visa disputes in the
   * collaboration flow.
   */
  public Dispute simulateNetworkLifecyclePreArbitrationResponse(
      String dispute, DisputeSimulateNetworkLifecyclePreArbitrationResponseParams params)
      throws StripeException {
    return simulateNetworkLifecyclePreArbitrationResponse(dispute, params, (RequestOptions) null);
  }
  /**
   * Test helper: populates {@code network_lifecycle.pre_arbitration_response} on a test-mode Visa
   * Issuing Dispute using placeholder file tokens. Only supported for Visa disputes in the
   * collaboration flow.
   */
  public Dispute simulateNetworkLifecyclePreArbitrationResponse(
      String dispute,
      DisputeSimulateNetworkLifecyclePreArbitrationResponseParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/disputes/%s/simulate_network_lifecycle_pre_arbitration_response",
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
