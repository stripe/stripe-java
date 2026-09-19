// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.SubscriptionItem;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionItemCreateParams;
import com.stripe.param.SubscriptionItemDeleteParams;
import com.stripe.param.SubscriptionItemListParams;
import com.stripe.param.SubscriptionItemRetrieveParams;
import com.stripe.param.SubscriptionItemUpdateParams;

public final class SubscriptionItemService extends ApiService {
  public SubscriptionItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(String id, SubscriptionItemDeleteParams params)
      throws StripeException {
    return delete(id, params, (RequestOptions) null);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(String id, RequestOptions options) throws StripeException {
    return delete(id, (SubscriptionItemDeleteParams) null, options);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(String id) throws StripeException {
    return delete(id, (SubscriptionItemDeleteParams) null, (RequestOptions) null);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(
      String id, SubscriptionItemDeleteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionItem.class);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(String id, SubscriptionItemRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (SubscriptionItemRetrieveParams) null, options);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(String id) throws StripeException {
    return retrieve(id, (SubscriptionItemRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(
      String id, SubscriptionItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionItem.class);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(String id, SubscriptionItemUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(String id, RequestOptions options) throws StripeException {
    return update(id, (SubscriptionItemUpdateParams) null, options);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(String id) throws StripeException {
    return update(id, (SubscriptionItemUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(
      String id, SubscriptionItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionItem.class);
  }
  /** Returns a list of your subscription items for a given subscription. */
  public StripeCollection<SubscriptionItem> list(SubscriptionItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your subscription items for a given subscription. */
  public StripeCollection<SubscriptionItem> list(
      SubscriptionItemListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<SubscriptionItem>>() {}.getType());
  }
  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public SubscriptionItem create(SubscriptionItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public SubscriptionItem create(SubscriptionItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_items";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SubscriptionItem.class);
  }
  /** Serializes a SubscriptionItem delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String id, SubscriptionItemDeleteParams params)
      throws StripeException {
    return serializeBatchDelete(id, params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionItem delete request into a batch job JSONL line. */
  public String serializeBatchDelete(
      String id, SubscriptionItemDeleteParams params, RequestOptions options)
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
  /** Serializes a SubscriptionItem update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String id, SubscriptionItemUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(id, params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionItem update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String id, SubscriptionItemUpdateParams params, RequestOptions options)
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
  /** Serializes a SubscriptionItem create request into a batch job JSONL line. */
  public String serializeBatchCreate(SubscriptionItemCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a SubscriptionItem create request into a batch job JSONL line. */
  public String serializeBatchCreate(SubscriptionItemCreateParams params, RequestOptions options)
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
}
