// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.SubscriptionItem;
import com.stripe.net.ApiMode;
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

  /** Returns a list of your subscription items for a given subscription. */
  public StripeCollection<SubscriptionItem> list(SubscriptionItemListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your subscription items for a given subscription. */
  public StripeCollection<SubscriptionItem> list(
      SubscriptionItemListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_items";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<SubscriptionItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public SubscriptionItem create(SubscriptionItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Adds a new item to an existing subscription. No existing items will be changed or replaced. */
  public SubscriptionItem create(SubscriptionItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_items";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionItem.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionItem.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionItem.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionItem.class,
            options,
            ApiMode.V1);
  }

  public com.stripe.service.UsageRecordSummaryService usageRecordSummaries() {
    return new com.stripe.service.UsageRecordSummaryService(this.getResponseGetter());
  }

  public com.stripe.service.UsageRecordService usageRecords() {
    return new com.stripe.service.UsageRecordService(this.getResponseGetter());
  }
}
