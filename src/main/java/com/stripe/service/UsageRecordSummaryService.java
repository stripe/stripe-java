// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.UsageRecordSummary;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.UsageRecordSummaryListParams;

public final class UsageRecordSummaryService extends ApiService {
  public UsageRecordSummaryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public StripeCollection<UsageRecordSummary> list(
      String subscriptionItem, UsageRecordSummaryListParams params) throws StripeException {
    return list(subscriptionItem, params, (RequestOptions) null);
  }
  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public StripeCollection<UsageRecordSummary> list(String subscriptionItem, RequestOptions options)
      throws StripeException {
    return list(subscriptionItem, (UsageRecordSummaryListParams) null, options);
  }
  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public StripeCollection<UsageRecordSummary> list(String subscriptionItem) throws StripeException {
    return list(subscriptionItem, (UsageRecordSummaryListParams) null, (RequestOptions) null);
  }
  /**
   * For the specified subscription item, returns a list of summary objects. Each object in the list
   * provides usage information that’s been summarized from multiple usage records and over a
   * subscription billing period (e.g., 15 usage records in the month of September).
   *
   * <p>The list is sorted in reverse-chronological order (newest first). The first list item
   * represents the most current usage period that hasn’t ended yet. Since new usage records can
   * still be added, the returned summary information for the subscription item’s ID should be seen
   * as unstable until the subscription billing period ends.
   */
  public StripeCollection<UsageRecordSummary> list(
      String subscriptionItem, UsageRecordSummaryListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_items/%s/usage_record_summaries",
            ApiResource.urlEncodeId(subscriptionItem));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<UsageRecordSummary>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
