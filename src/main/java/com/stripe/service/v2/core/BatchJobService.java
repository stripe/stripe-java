// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.BatchJob;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerUpdateParams;
import com.stripe.param.SubscriptionScheduleCreateParams;
import com.stripe.param.SubscriptionUpdateParams;
import com.stripe.param.v2.core.BatchJobCreateParams;

public final class BatchJobService extends ApiService {
  public BatchJobService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new batch job. */
  public BatchJob create(BatchJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new batch job. */
  public BatchJob create(BatchJobCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/batch_jobs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BatchJob.class);
  }
  /** Serializes a Customer update request into a batch job JSONL line. */
  public String serializeV1CustomerUpdate(String customer, CustomerUpdateParams params)
      throws StripeException {
    return serializeV1CustomerUpdate(customer, params, (RequestOptions) null);
  }
  /** Serializes a Customer update request into a batch job JSONL line. */
  public String serializeV1CustomerUpdate(
      String customer, CustomerUpdateParams params, RequestOptions options) throws StripeException {
    String itemId = java.util.UUID.randomUUID().toString();
    String stripeVersion =
        (options != null && options.getStripeVersionOverride() != null)
            ? options.getStripeVersionOverride()
            : Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> item = new java.util.LinkedHashMap<>();
    item.put("id", itemId);
    item.put("path_params", java.util.Map.of("customer", customer));
    item.put("params", (params != null) ? params.toMap() : null);
    item.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      item.put("context", stripeContext);
    }
    return ApiRequestParams.GSON.toJson(item);
  }
  /** Serializes a Subscription update request into a batch job JSONL line. */
  public String serializeV1SubscriptionUpdate(
      String subscriptionExposedId, SubscriptionUpdateParams params) throws StripeException {
    return serializeV1SubscriptionUpdate(subscriptionExposedId, params, (RequestOptions) null);
  }
  /** Serializes a Subscription update request into a batch job JSONL line. */
  public String serializeV1SubscriptionUpdate(
      String subscriptionExposedId, SubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String itemId = java.util.UUID.randomUUID().toString();
    String stripeVersion =
        (options != null && options.getStripeVersionOverride() != null)
            ? options.getStripeVersionOverride()
            : Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> item = new java.util.LinkedHashMap<>();
    item.put("id", itemId);
    item.put("path_params", java.util.Map.of("subscription_exposed_id", subscriptionExposedId));
    item.put("params", (params != null) ? params.toMap() : null);
    item.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      item.put("context", stripeContext);
    }
    return ApiRequestParams.GSON.toJson(item);
  }
  /** Serializes a SubscriptionSchedule create request into a batch job JSONL line. */
  public String serializeV1SubscriptionScheduleCreate(SubscriptionScheduleCreateParams params)
      throws StripeException {
    return serializeV1SubscriptionScheduleCreate(params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionSchedule create request into a batch job JSONL line. */
  public String serializeV1SubscriptionScheduleCreate(
      SubscriptionScheduleCreateParams params, RequestOptions options) throws StripeException {
    String itemId = java.util.UUID.randomUUID().toString();
    String stripeVersion =
        (options != null && options.getStripeVersionOverride() != null)
            ? options.getStripeVersionOverride()
            : Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> item = new java.util.LinkedHashMap<>();
    item.put("id", itemId);
    item.put("path_params", null);
    item.put("params", (params != null) ? params.toMap() : null);
    item.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      item.put("context", stripeContext);
    }
    return ApiRequestParams.GSON.toJson(item);
  }
}
