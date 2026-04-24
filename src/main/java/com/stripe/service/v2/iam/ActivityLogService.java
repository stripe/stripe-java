// File generated from our OpenAPI spec
package com.stripe.service.v2.iam;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.iam.ActivityLog;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.iam.ActivityLogListParams;

public final class ActivityLogService extends ApiService {
  public ActivityLogService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List activity logs of an account. */
  public StripeCollection<ActivityLog> list(ActivityLogListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List activity logs of an account. */
  public StripeCollection<ActivityLog> list(RequestOptions options) throws StripeException {
    return list((ActivityLogListParams) null, options);
  }
  /** List activity logs of an account. */
  public StripeCollection<ActivityLog> list() throws StripeException {
    return list((ActivityLogListParams) null, (RequestOptions) null);
  }
  /** List activity logs of an account. */
  public StripeCollection<ActivityLog> list(ActivityLogListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/iam/activity_logs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ActivityLog>>() {}.getType());
  }
}
