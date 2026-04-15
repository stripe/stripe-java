// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.Workflow;
import com.stripe.model.v2.core.WorkflowRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.WorkflowInvokeParams;
import com.stripe.param.v2.core.WorkflowListParams;

public final class WorkflowService extends ApiService {
  public WorkflowService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Workflows. */
  public StripeCollection<Workflow> list(WorkflowListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Workflows. */
  public StripeCollection<Workflow> list(WorkflowListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/workflows";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Workflow>>() {}.getType());
  }
  /** Retrieves the details of a Workflow by ID. */
  public Workflow retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of a Workflow by ID. */
  public Workflow retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/workflows/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Workflow.class);
  }
  /** Invokes an on-demand Workflow with parameters, to launch a new Workflow Run. */
  public WorkflowRun invoke(String id, WorkflowInvokeParams params) throws StripeException {
    return invoke(id, params, (RequestOptions) null);
  }
  /** Invokes an on-demand Workflow with parameters, to launch a new Workflow Run. */
  public WorkflowRun invoke(String id, WorkflowInvokeParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/workflows/%s/invoke", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, WorkflowRun.class);
  }
}
