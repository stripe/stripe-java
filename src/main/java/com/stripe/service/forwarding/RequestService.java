// File generated from our OpenAPI spec
package com.stripe.service.forwarding;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.forwarding.Request;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.forwarding.RequestCreateParams;
import com.stripe.param.forwarding.RequestListParams;
import com.stripe.param.forwarding.RequestRetrieveParams;

public final class RequestService extends ApiService {
  public RequestService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all ForwardingRequest objects. */
  public StripeCollection<Request> list(RequestListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all ForwardingRequest objects. */
  public StripeCollection<Request> list(RequestOptions options) throws StripeException {
    return list((RequestListParams) null, options);
  }
  /** Lists all ForwardingRequest objects. */
  public StripeCollection<Request> list() throws StripeException {
    return list((RequestListParams) null, (RequestOptions) null);
  }
  /** Lists all ForwardingRequest objects. */
  public StripeCollection<Request> list(RequestListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Request>>() {}.getType());
  }
  /** Creates a ForwardingRequest object. */
  public Request create(RequestCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a ForwardingRequest object. */
  public Request create(RequestCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Request.class);
  }
  /** Retrieves a ForwardingRequest object. */
  public Request retrieve(String id, RequestRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a ForwardingRequest object. */
  public Request retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (RequestRetrieveParams) null, options);
  }
  /** Retrieves a ForwardingRequest object. */
  public Request retrieve(String id) throws StripeException {
    return retrieve(id, (RequestRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a ForwardingRequest object. */
  public Request retrieve(String id, RequestRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/forwarding/requests/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Request.class);
  }
}
