// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.SetupAttempt;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SetupAttemptListParams;

public final class SetupAttemptService extends ApiService {
  public SetupAttemptService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public StripeCollection<SetupAttempt> list(SetupAttemptListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public StripeCollection<SetupAttempt> list(SetupAttemptListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_attempts";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<SetupAttempt>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
