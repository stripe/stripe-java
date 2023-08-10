// File generated from our OpenAPI spec
package com.stripe.service.billingportal;

import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Session;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billingportal.SessionCreateParams;

public final class SessionService extends ApiService {
  public SessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a session of the customer portal. */
  public Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a session of the customer portal. */
  public Session create(SessionCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing_portal/sessions";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Session.class,
            options,
            ApiMode.V1);
  }
}
