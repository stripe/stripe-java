// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.RateCardSubscription;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.RateCardSubscriptionCreateParams;
import com.stripe.param.v2.billing.RateCardSubscriptionListParams;
import com.stripe.param.v2.billing.RateCardSubscriptionUpdateParams;

public final class RateCardSubscriptionService extends ApiService {
  public RateCardSubscriptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Rate Card Subscription objects. */
  public StripeCollection<RateCardSubscription> list(RateCardSubscriptionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Rate Card Subscription objects. */
  public StripeCollection<RateCardSubscription> list(RequestOptions options)
      throws StripeException {
    return list((RateCardSubscriptionListParams) null, options);
  }
  /** List all Rate Card Subscription objects. */
  public StripeCollection<RateCardSubscription> list() throws StripeException {
    return list((RateCardSubscriptionListParams) null, (RequestOptions) null);
  }
  /** List all Rate Card Subscription objects. */
  public StripeCollection<RateCardSubscription> list(
      RateCardSubscriptionListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/rate_card_subscriptions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<RateCardSubscription>>() {}.getType());
  }
  /** Create a Rate Card Subscription to bill a Rate Card on a specified Billing Cadence. */
  public RateCardSubscription create(RateCardSubscriptionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Rate Card Subscription to bill a Rate Card on a specified Billing Cadence. */
  public RateCardSubscription create(
      RateCardSubscriptionCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/rate_card_subscriptions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCardSubscription.class);
  }
  /** Retrieve a Rate Card Subscription by ID. */
  public RateCardSubscription retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Rate Card Subscription by ID. */
  public RateCardSubscription retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/rate_card_subscriptions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RateCardSubscription.class);
  }
  /** Update fields on an existing, active Rate Card Subscription. */
  public RateCardSubscription update(String id, RateCardSubscriptionUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update fields on an existing, active Rate Card Subscription. */
  public RateCardSubscription update(String id, RequestOptions options) throws StripeException {
    return update(id, (RateCardSubscriptionUpdateParams) null, options);
  }
  /** Update fields on an existing, active Rate Card Subscription. */
  public RateCardSubscription update(String id) throws StripeException {
    return update(id, (RateCardSubscriptionUpdateParams) null, (RequestOptions) null);
  }
  /** Update fields on an existing, active Rate Card Subscription. */
  public RateCardSubscription update(
      String id, RateCardSubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/billing/rate_card_subscriptions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RateCardSubscription.class);
  }
  /** Cancel an existing, active Rate Card Subscription. */
  public RateCardSubscription cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel an existing, active Rate Card Subscription. */
  public RateCardSubscription cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/rate_card_subscriptions/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RateCardSubscription.class);
  }
}
