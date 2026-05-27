// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Refund;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.RefundCancelParams;
import com.stripe.param.RefundCreateParams;
import com.stripe.param.RefundListParams;
import com.stripe.param.RefundRetrieveParams;
import com.stripe.param.RefundUpdateParams;

public final class RefundService extends ApiService {
  public RefundService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of all refunds you created. We return the refunds in sorted order, with the most
   * recent refunds appearing first. The 10 most recent refunds are always available by default on
   * the Charge object.
   */
  public StripeCollection<Refund> list(RefundListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of all refunds you created. We return the refunds in sorted order, with the most
   * recent refunds appearing first. The 10 most recent refunds are always available by default on
   * the Charge object.
   */
  public StripeCollection<Refund> list(RequestOptions options) throws StripeException {
    return list((RefundListParams) null, options);
  }
  /**
   * Returns a list of all refunds you created. We return the refunds in sorted order, with the most
   * recent refunds appearing first. The 10 most recent refunds are always available by default on
   * the Charge object.
   */
  public StripeCollection<Refund> list() throws StripeException {
    return list((RefundListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of all refunds you created. We return the refunds in sorted order, with the most
   * recent refunds appearing first. The 10 most recent refunds are always available by default on
   * the Charge object.
   */
  public StripeCollection<Refund> list(RefundListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/refunds";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Refund>>() {}.getType());
  }
  /**
   * When you create a new refund, you must specify a Charge or a PaymentIntent object on which to
   * create it.
   *
   * <p>Creating a new refund will refund a charge that has previously been created but not yet
   * refunded. Funds will be refunded to the credit or debit card that was originally charged.
   *
   * <p>You can optionally refund only part of a charge. You can do so multiple times, until the
   * entire charge has been refunded.
   *
   * <p>Once entirely refunded, a charge can’t be refunded again. This method will raise an error
   * when called on an already-refunded charge, or when trying to refund more money than is left on
   * a charge.
   */
  public Refund create(RefundCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * When you create a new refund, you must specify a Charge or a PaymentIntent object on which to
   * create it.
   *
   * <p>Creating a new refund will refund a charge that has previously been created but not yet
   * refunded. Funds will be refunded to the credit or debit card that was originally charged.
   *
   * <p>You can optionally refund only part of a charge. You can do so multiple times, until the
   * entire charge has been refunded.
   *
   * <p>Once entirely refunded, a charge can’t be refunded again. This method will raise an error
   * when called on an already-refunded charge, or when trying to refund more money than is left on
   * a charge.
   */
  public Refund create(RequestOptions options) throws StripeException {
    return create((RefundCreateParams) null, options);
  }
  /**
   * When you create a new refund, you must specify a Charge or a PaymentIntent object on which to
   * create it.
   *
   * <p>Creating a new refund will refund a charge that has previously been created but not yet
   * refunded. Funds will be refunded to the credit or debit card that was originally charged.
   *
   * <p>You can optionally refund only part of a charge. You can do so multiple times, until the
   * entire charge has been refunded.
   *
   * <p>Once entirely refunded, a charge can’t be refunded again. This method will raise an error
   * when called on an already-refunded charge, or when trying to refund more money than is left on
   * a charge.
   */
  public Refund create() throws StripeException {
    return create((RefundCreateParams) null, (RequestOptions) null);
  }
  /**
   * When you create a new refund, you must specify a Charge or a PaymentIntent object on which to
   * create it.
   *
   * <p>Creating a new refund will refund a charge that has previously been created but not yet
   * refunded. Funds will be refunded to the credit or debit card that was originally charged.
   *
   * <p>You can optionally refund only part of a charge. You can do so multiple times, until the
   * entire charge has been refunded.
   *
   * <p>Once entirely refunded, a charge can’t be refunded again. This method will raise an error
   * when called on an already-refunded charge, or when trying to refund more money than is left on
   * a charge.
   */
  public Refund create(RefundCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/refunds";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Refund.class);
  }
  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String refund, RefundRetrieveParams params) throws StripeException {
    return retrieve(refund, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String refund, RequestOptions options) throws StripeException {
    return retrieve(refund, (RefundRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String refund) throws StripeException {
    return retrieve(refund, (RefundRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String refund, RefundRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Refund.class);
  }
  /**
   * Updates the refund that you specify by setting the values of the passed parameters. Any
   * parameters that you don’t provide remain unchanged.
   *
   * <p>This request only accepts {@code metadata} as an argument.
   */
  public Refund update(String refund, RefundUpdateParams params) throws StripeException {
    return update(refund, params, (RequestOptions) null);
  }
  /**
   * Updates the refund that you specify by setting the values of the passed parameters. Any
   * parameters that you don’t provide remain unchanged.
   *
   * <p>This request only accepts {@code metadata} as an argument.
   */
  public Refund update(String refund, RequestOptions options) throws StripeException {
    return update(refund, (RefundUpdateParams) null, options);
  }
  /**
   * Updates the refund that you specify by setting the values of the passed parameters. Any
   * parameters that you don’t provide remain unchanged.
   *
   * <p>This request only accepts {@code metadata} as an argument.
   */
  public Refund update(String refund) throws StripeException {
    return update(refund, (RefundUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the refund that you specify by setting the values of the passed parameters. Any
   * parameters that you don’t provide remain unchanged.
   *
   * <p>This request only accepts {@code metadata} as an argument.
   */
  public Refund update(String refund, RefundUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Refund.class);
  }
  /**
   * Cancels a refund with a status of {@code requires_action}.
   *
   * <p>You can’t cancel refunds in other states. Only refunds for payment methods that require
   * customer action can enter the {@code requires_action} state.
   */
  public Refund cancel(String refund, RefundCancelParams params) throws StripeException {
    return cancel(refund, params, (RequestOptions) null);
  }
  /**
   * Cancels a refund with a status of {@code requires_action}.
   *
   * <p>You can’t cancel refunds in other states. Only refunds for payment methods that require
   * customer action can enter the {@code requires_action} state.
   */
  public Refund cancel(String refund, RequestOptions options) throws StripeException {
    return cancel(refund, (RefundCancelParams) null, options);
  }
  /**
   * Cancels a refund with a status of {@code requires_action}.
   *
   * <p>You can’t cancel refunds in other states. Only refunds for payment methods that require
   * customer action can enter the {@code requires_action} state.
   */
  public Refund cancel(String refund) throws StripeException {
    return cancel(refund, (RefundCancelParams) null, (RequestOptions) null);
  }
  /**
   * Cancels a refund with a status of {@code requires_action}.
   *
   * <p>You can’t cancel refunds in other states. Only refunds for payment methods that require
   * customer action can enter the {@code requires_action} state.
   */
  public Refund cancel(String refund, RefundCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/refunds/%s/cancel", ApiResource.urlEncodeId(refund));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Refund.class);
  }
  /** Serializes a Refund create request into a batch job JSONL line. */
  public String serializeBatchCreate(RefundCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a Refund create request into a batch job JSONL line. */
  public String serializeBatchCreate(RefundCreateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
  /** Serializes a Refund cancel request into a batch job JSONL line. */
  public String serializeBatchCancel(String refund, RefundCancelParams params)
      throws StripeException {
    return serializeBatchCancel(refund, params, (RequestOptions) null);
  }
  /** Serializes a Refund cancel request into a batch job JSONL line. */
  public String serializeBatchCancel(
      String refund, RefundCancelParams params, RequestOptions options) throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("refund", refund);
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
