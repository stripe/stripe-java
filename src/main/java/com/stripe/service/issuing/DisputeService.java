// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Dispute;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.DisputeCreateParams;
import com.stripe.param.issuing.DisputeListParams;
import com.stripe.param.issuing.DisputeRetrieveParams;
import com.stripe.param.issuing.DisputeSubmitParams;
import com.stripe.param.issuing.DisputeUpdateParams;

public final class DisputeService extends ApiService {
  public DisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code Dispute} objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Dispute> list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Dispute} objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Dispute> list(RequestOptions options) throws StripeException {
    return list((DisputeListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code Dispute} objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Dispute> list() throws StripeException {
    return list((DisputeListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Dispute} objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Dispute> list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Dispute>>() {}.getType());
  }
  /**
   * Creates an Issuing {@code Dispute} object. Individual pieces of evidence within the {@code
   * evidence} object are optional at this point. Stripe only validates that required evidence is
   * present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public Dispute create(DisputeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an Issuing {@code Dispute} object. Individual pieces of evidence within the {@code
   * evidence} object are optional at this point. Stripe only validates that required evidence is
   * present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public Dispute create(RequestOptions options) throws StripeException {
    return create((DisputeCreateParams) null, options);
  }
  /**
   * Creates an Issuing {@code Dispute} object. Individual pieces of evidence within the {@code
   * evidence} object are optional at this point. Stripe only validates that required evidence is
   * present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public Dispute create() throws StripeException {
    return create((DisputeCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates an Issuing {@code Dispute} object. Individual pieces of evidence within the {@code
   * evidence} object are optional at this point. Stripe only validates that required evidence is
   * present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public Dispute create(DisputeCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
  /** Retrieves an Issuing {@code Dispute} object. */
  public Dispute retrieve(String dispute, DisputeRetrieveParams params) throws StripeException {
    return retrieve(dispute, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Dispute} object. */
  public Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (DisputeRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Dispute} object. */
  public Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (DisputeRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Dispute} object. */
  public Dispute retrieve(String dispute, DisputeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
  /**
   * Updates the specified Issuing {@code Dispute} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged. Properties on the {@code evidence}
   * object can be unset by passing in an empty string.
   */
  public Dispute update(String dispute, DisputeUpdateParams params) throws StripeException {
    return update(dispute, params, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Dispute} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged. Properties on the {@code evidence}
   * object can be unset by passing in an empty string.
   */
  public Dispute update(String dispute, RequestOptions options) throws StripeException {
    return update(dispute, (DisputeUpdateParams) null, options);
  }
  /**
   * Updates the specified Issuing {@code Dispute} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged. Properties on the {@code evidence}
   * object can be unset by passing in an empty string.
   */
  public Dispute update(String dispute) throws StripeException {
    return update(dispute, (DisputeUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Dispute} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged. Properties on the {@code evidence}
   * object can be unset by passing in an empty string.
   */
  public Dispute update(String dispute, DisputeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute));
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
   * Submits an Issuing {@code Dispute} to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(String dispute, DisputeSubmitParams params) throws StripeException {
    return submit(dispute, params, (RequestOptions) null);
  }
  /**
   * Submits an Issuing {@code Dispute} to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(String dispute, RequestOptions options) throws StripeException {
    return submit(dispute, (DisputeSubmitParams) null, options);
  }
  /**
   * Submits an Issuing {@code Dispute} to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(String dispute) throws StripeException {
    return submit(dispute, (DisputeSubmitParams) null, (RequestOptions) null);
  }
  /**
   * Submits an Issuing {@code Dispute} to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(String dispute, DisputeSubmitParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/disputes/%s/submit", ApiResource.urlEncodeId(dispute));
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
