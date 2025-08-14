// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.ServiceAction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.ActionServiceCreateParams;

public final class ServiceActionService extends ApiService {
  public ServiceActionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a ServiceAction object. */
  public ServiceAction create(ActionServiceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a ServiceAction object. */
  public ServiceAction create(ActionServiceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/service_actions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ServiceAction.class);
  }
  /** Retrieve a ServiceAction object. */
  public ServiceAction retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a ServiceAction object. */
  public ServiceAction retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/service_actions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ServiceAction.class);
  }
}
