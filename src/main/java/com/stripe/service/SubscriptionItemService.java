// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
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
  public SubscriptionItem delete(String item, SubscriptionItemDeleteParams params)
      throws StripeException {
    return delete(item, params, (RequestOptions) null);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(String item, RequestOptions options) throws StripeException {
    return delete(item, (SubscriptionItemDeleteParams) null, options);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(String item) throws StripeException {
    return delete(item, (SubscriptionItemDeleteParams) null, (RequestOptions) null);
  }
  /**
   * Deletes an item from the subscription. Removing a subscription item from a subscription will
   * not cancel the subscription.
   */
  public SubscriptionItem delete(
      String item, SubscriptionItemDeleteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(item));
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
  public SubscriptionItem retrieve(String item, SubscriptionItemRetrieveParams params)
      throws StripeException {
    return retrieve(item, params, (RequestOptions) null);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(String item, RequestOptions options) throws StripeException {
    return retrieve(item, (SubscriptionItemRetrieveParams) null, options);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(String item) throws StripeException {
    return retrieve(item, (SubscriptionItemRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the subscription item with the given ID. */
  public SubscriptionItem retrieve(
      String item, SubscriptionItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(item));
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
  public SubscriptionItem update(String item, SubscriptionItemUpdateParams params)
      throws StripeException {
    return update(item, params, (RequestOptions) null);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(String item, RequestOptions options) throws StripeException {
    return update(item, (SubscriptionItemUpdateParams) null, options);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(String item) throws StripeException {
    return update(item, (SubscriptionItemUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the plan or quantity of an item on a current subscription. */
  public SubscriptionItem update(
      String item, SubscriptionItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_items/%s", ApiResource.urlEncodeId(item));
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

  public com.stripe.service.SubscriptionItemUsageRecordSummaryService usageRecordSummaries() {
    return new com.stripe.service.SubscriptionItemUsageRecordSummaryService(
        this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionItemUsageRecordService usageRecords() {
    return new com.stripe.service.SubscriptionItemUsageRecordService(this.getResponseGetter());
  }
}
