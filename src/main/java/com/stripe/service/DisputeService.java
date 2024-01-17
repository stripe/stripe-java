// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Dispute;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.DisputeCloseParams;
import com.stripe.param.DisputeListParams;
import com.stripe.param.DisputeRetrieveParams;
import com.stripe.param.DisputeUpdateParams;

public final class DisputeService extends ApiService {
  public DisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your disputes. */
  public StripeCollection<Dispute> list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your disputes. */
  public StripeCollection<Dispute> list(RequestOptions options) throws StripeException {
    return list((DisputeListParams) null, options);
  }
  /** Returns a list of your disputes. */
  public StripeCollection<Dispute> list() throws StripeException {
    return list((DisputeListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your disputes. */
  public StripeCollection<Dispute> list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Dispute>>() {}.getType());
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String dispute, DisputeRetrieveParams params) throws StripeException {
    return retrieve(dispute, params, (RequestOptions) null);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (DisputeRetrieveParams) null, options);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (DisputeRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String dispute, DisputeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Dispute.class);
  }
  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(String dispute, DisputeUpdateParams params) throws StripeException {
    return update(dispute, params, (RequestOptions) null);
  }
  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(String dispute, RequestOptions options) throws StripeException {
    return update(dispute, (DisputeUpdateParams) null, options);
  }
  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(String dispute) throws StripeException {
    return update(dispute, (DisputeUpdateParams) null, (RequestOptions) null);
  }
  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(String dispute, DisputeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Dispute.class);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String dispute, DisputeCloseParams params) throws StripeException {
    return close(dispute, params, (RequestOptions) null);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String dispute, RequestOptions options) throws StripeException {
    return close(dispute, (DisputeCloseParams) null, options);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String dispute) throws StripeException {
    return close(dispute, (DisputeCloseParams) null, (RequestOptions) null);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String dispute, DisputeCloseParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s/close", ApiResource.urlEncodeId(dispute));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Dispute.class);
  }
}
