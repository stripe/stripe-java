// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.intents;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.IntentAction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.intents.ActionListParams;

public final class ActionService extends ApiService {
  public ActionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Billing Intent Actions. */
  public StripeCollection<IntentAction> list(String intentId, ActionListParams params)
      throws StripeException {
    return list(intentId, params, (RequestOptions) null);
  }
  /** List Billing Intent Actions. */
  public StripeCollection<IntentAction> list(String intentId, RequestOptions options)
      throws StripeException {
    return list(intentId, (ActionListParams) null, options);
  }
  /** List Billing Intent Actions. */
  public StripeCollection<IntentAction> list(String intentId) throws StripeException {
    return list(intentId, (ActionListParams) null, (RequestOptions) null);
  }
  /** List Billing Intent Actions. */
  public StripeCollection<IntentAction> list(
      String intentId, ActionListParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/billing/intents/%s/actions", ApiResource.urlEncodeId(intentId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<IntentAction>>() {}.getType());
  }
  /** Retrieve a Billing Intent Action. */
  public IntentAction retrieve(String intentId, String id) throws StripeException {
    return retrieve(intentId, id, (RequestOptions) null);
  }
  /** Retrieve a Billing Intent Action. */
  public IntentAction retrieve(String intentId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/intents/%s/actions/%s",
            ApiResource.urlEncodeId(intentId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, IntentAction.class);
  }
}
