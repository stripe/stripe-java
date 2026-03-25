// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.Intent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.IntentCommitParams;
import com.stripe.param.v2.billing.IntentCreateParams;
import com.stripe.param.v2.billing.IntentListParams;

public final class IntentService extends ApiService {
  public IntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Billing Intents. */
  public StripeCollection<Intent> list(IntentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List Billing Intents. */
  public StripeCollection<Intent> list(RequestOptions options) throws StripeException {
    return list((IntentListParams) null, options);
  }
  /** List Billing Intents. */
  public StripeCollection<Intent> list() throws StripeException {
    return list((IntentListParams) null, (RequestOptions) null);
  }
  /** List Billing Intents. */
  public StripeCollection<Intent> list(IntentListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Intent>>() {}.getType());
  }
  /** Create a Billing Intent. */
  public Intent create(IntentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Billing Intent. */
  public Intent create(IntentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Intent.class);
  }
  /** Retrieve a Billing Intent. */
  public Intent retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a Billing Intent. */
  public Intent retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Intent.class);
  }
  /** Cancel a Billing Intent. */
  public Intent cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel a Billing Intent. */
  public Intent cancel(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Intent.class);
  }
  /** Commit a Billing Intent. */
  public Intent commit(String id, IntentCommitParams params) throws StripeException {
    return commit(id, params, (RequestOptions) null);
  }
  /** Commit a Billing Intent. */
  public Intent commit(String id, RequestOptions options) throws StripeException {
    return commit(id, (IntentCommitParams) null, options);
  }
  /** Commit a Billing Intent. */
  public Intent commit(String id) throws StripeException {
    return commit(id, (IntentCommitParams) null, (RequestOptions) null);
  }
  /** Commit a Billing Intent. */
  public Intent commit(String id, IntentCommitParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/intents/%s/commit", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Intent.class);
  }
  /** Release a Billing Intent. */
  public Intent releaseReservation(String id) throws StripeException {
    return releaseReservation(id, (RequestOptions) null);
  }
  /** Release a Billing Intent. */
  public Intent releaseReservation(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/intents/%s/release_reservation", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Intent.class);
  }
  /** Reserve a Billing Intent. */
  public Intent reserve(String id) throws StripeException {
    return reserve(id, (RequestOptions) null);
  }
  /** Reserve a Billing Intent. */
  public Intent reserve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/intents/%s/reserve", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Intent.class);
  }

  public com.stripe.service.v2.billing.intents.ActionService actions() {
    return new com.stripe.service.v2.billing.intents.ActionService(this.getResponseGetter());
  }
}
