// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Dispute;
import com.stripe.model.StripeCollection;
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
            options);
    return this.request(request, new TypeToken<StripeCollection<Dispute>>() {}.getType());
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String id, DisputeRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (DisputeRetrieveParams) null, options);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String id) throws StripeException {
    return retrieve(id, (DisputeRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the dispute with the given ID. */
  public Dispute retrieve(String id, DisputeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(id));
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
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(String id, DisputeUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
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
  public Dispute update(String id, RequestOptions options) throws StripeException {
    return update(id, (DisputeUpdateParams) null, options);
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
  public Dispute update(String id) throws StripeException {
    return update(id, (DisputeUpdateParams) null, (RequestOptions) null);
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
  public Dispute update(String id, DisputeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(id));
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
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute (accepting it), acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String id, DisputeCloseParams params) throws StripeException {
    return close(id, params, (RequestOptions) null);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute (accepting it), acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String id, RequestOptions options) throws StripeException {
    return close(id, (DisputeCloseParams) null, options);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute (accepting it), acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String id) throws StripeException {
    return close(id, (DisputeCloseParams) null, (RequestOptions) null);
  }
  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute (accepting it), acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(String id, DisputeCloseParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s/close", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
  /** Serializes a Dispute close request into a batch job JSONL line. */
  public String serializeBatchClose(String id, DisputeCloseParams params) throws StripeException {
    return serializeBatchClose(id, params, (RequestOptions) null);
  }
  /** Serializes a Dispute close request into a batch job JSONL line. */
  public String serializeBatchClose(String id, DisputeCloseParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("id", id);
    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("path_params", pathParams);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
}
