// File generated from our OpenAPI spec
package com.stripe.service.v2.core.health;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.health.Alert;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.health.AlertListParams;

public final class AlertService extends ApiService {
  public AlertService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of health alerts. */
  public StripeCollection<Alert> list(AlertListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of health alerts. */
  public StripeCollection<Alert> list(RequestOptions options) throws StripeException {
    return list((AlertListParams) null, options);
  }
  /** Retrieves a list of health alerts. */
  public StripeCollection<Alert> list() throws StripeException {
    return list((AlertListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of health alerts. */
  public StripeCollection<Alert> list(AlertListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/health/alerts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Alert>>() {}.getType());
  }
  /** Retrieves a health alert by ID. */
  public Alert retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a health alert by ID. */
  public Alert retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/health/alerts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Alert.class);
  }

  public com.stripe.service.v2.core.health.alerts.HistoryService history() {
    return new com.stripe.service.v2.core.health.alerts.HistoryService(this.getResponseGetter());
  }
}
