// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.AlertNotification;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.AlertNotificationListParams;

public final class AlertNotificationService extends ApiService {
  public AlertNotificationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public StripeCollection<AlertNotification> list(String id, AlertNotificationListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public StripeCollection<AlertNotification> list(
      String id, AlertNotificationListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/notifications", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<AlertNotification>>() {}.getType());
  }
}
