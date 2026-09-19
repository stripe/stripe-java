// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.SubscriptionSchedule;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionScheduleAmendParams;
import com.stripe.param.SubscriptionScheduleCancelParams;
import com.stripe.param.SubscriptionScheduleCreateParams;
import com.stripe.param.SubscriptionScheduleListParams;
import com.stripe.param.SubscriptionScheduleReleaseParams;
import com.stripe.param.SubscriptionScheduleRetrieveParams;
import com.stripe.param.SubscriptionScheduleUpdateParams;

public final class SubscriptionScheduleService extends ApiService {
  public SubscriptionScheduleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the list of your subscription schedules. */
  public StripeCollection<SubscriptionSchedule> list(SubscriptionScheduleListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves the list of your subscription schedules. */
  public StripeCollection<SubscriptionSchedule> list(RequestOptions options)
      throws StripeException {
    return list((SubscriptionScheduleListParams) null, options);
  }
  /** Retrieves the list of your subscription schedules. */
  public StripeCollection<SubscriptionSchedule> list() throws StripeException {
    return list((SubscriptionScheduleListParams) null, (RequestOptions) null);
  }
  /** Retrieves the list of your subscription schedules. */
  public StripeCollection<SubscriptionSchedule> list(
      SubscriptionScheduleListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_schedules";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<SubscriptionSchedule>>() {}.getType());
  }
  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public SubscriptionSchedule create(SubscriptionScheduleCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public SubscriptionSchedule create(RequestOptions options) throws StripeException {
    return create((SubscriptionScheduleCreateParams) null, options);
  }
  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public SubscriptionSchedule create() throws StripeException {
    return create((SubscriptionScheduleCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public SubscriptionSchedule create(
      SubscriptionScheduleCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_schedules";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public SubscriptionSchedule retrieve(String id, SubscriptionScheduleRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public SubscriptionSchedule retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (SubscriptionScheduleRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public SubscriptionSchedule retrieve(String id) throws StripeException {
    return retrieve(id, (SubscriptionScheduleRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public SubscriptionSchedule retrieve(
      String id, SubscriptionScheduleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(String id, SubscriptionScheduleUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(String id, RequestOptions options) throws StripeException {
    return update(id, (SubscriptionScheduleUpdateParams) null, options);
  }
  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(String id) throws StripeException {
    return update(id, (SubscriptionScheduleUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(
      String id, SubscriptionScheduleUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /** Amends an existing subscription schedule. */
  public SubscriptionSchedule amend(String id, SubscriptionScheduleAmendParams params)
      throws StripeException {
    return amend(id, params, (RequestOptions) null);
  }
  /** Amends an existing subscription schedule. */
  public SubscriptionSchedule amend(String id, RequestOptions options) throws StripeException {
    return amend(id, (SubscriptionScheduleAmendParams) null, options);
  }
  /** Amends an existing subscription schedule. */
  public SubscriptionSchedule amend(String id) throws StripeException {
    return amend(id, (SubscriptionScheduleAmendParams) null, (RequestOptions) null);
  }
  /** Amends an existing subscription schedule. */
  public SubscriptionSchedule amend(
      String id, SubscriptionScheduleAmendParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_schedules/%s/amend", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(String id, SubscriptionScheduleCancelParams params)
      throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (SubscriptionScheduleCancelParams) null, options);
  }
  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(String id) throws StripeException {
    return cancel(id, (SubscriptionScheduleCancelParams) null, (RequestOptions) null);
  }
  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(
      String id, SubscriptionScheduleCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscription_schedules/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(String id, SubscriptionScheduleReleaseParams params)
      throws StripeException {
    return release(id, params, (RequestOptions) null);
  }
  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(String id, RequestOptions options) throws StripeException {
    return release(id, (SubscriptionScheduleReleaseParams) null, options);
  }
  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(String id) throws StripeException {
    return release(id, (SubscriptionScheduleReleaseParams) null, (RequestOptions) null);
  }
  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(
      String id, SubscriptionScheduleReleaseParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscription_schedules/%s/release", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionSchedule.class);
  }
  /** Serializes a SubscriptionSchedule create request into a batch job JSONL line. */
  public String serializeBatchCreate(SubscriptionScheduleCreateParams params)
      throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionSchedule create request into a batch job JSONL line. */
  public String serializeBatchCreate(
      SubscriptionScheduleCreateParams params, RequestOptions options) throws StripeException {
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
  /** Serializes a SubscriptionSchedule update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String id, SubscriptionScheduleUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(id, params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionSchedule update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String id, SubscriptionScheduleUpdateParams params, RequestOptions options)
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
  /** Serializes a SubscriptionSchedule cancel request into a batch job JSONL line. */
  public String serializeBatchCancel(String id, SubscriptionScheduleCancelParams params)
      throws StripeException {
    return serializeBatchCancel(id, params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionSchedule cancel request into a batch job JSONL line. */
  public String serializeBatchCancel(
      String id, SubscriptionScheduleCancelParams params, RequestOptions options)
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
  /** Serializes a SubscriptionSchedule release request into a batch job JSONL line. */
  public String serializeBatchRelease(String id, SubscriptionScheduleReleaseParams params)
      throws StripeException {
    return serializeBatchRelease(id, params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionSchedule release request into a batch job JSONL line. */
  public String serializeBatchRelease(
      String id, SubscriptionScheduleReleaseParams params, RequestOptions options)
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
