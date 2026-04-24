// File generated from our OpenAPI spec
package com.stripe.service.v2.extend;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.extend.WorkflowRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.extend.WorkflowRunListParams;

public final class WorkflowRunService extends ApiService {
  public WorkflowRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Workflow Runs. */
  public StripeCollection<WorkflowRun> list(WorkflowRunListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all Workflow Runs. */
  public StripeCollection<WorkflowRun> list(RequestOptions options) throws StripeException {
    return list((WorkflowRunListParams) null, options);
  }
  /** List all Workflow Runs. */
  public StripeCollection<WorkflowRun> list() throws StripeException {
    return list((WorkflowRunListParams) null, (RequestOptions) null);
  }
  /** List all Workflow Runs. */
  public StripeCollection<WorkflowRun> list(WorkflowRunListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/extend/workflow_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<WorkflowRun>>() {}.getType());
  }
  /** Retrieves the details of a Workflow Run by ID. */
  public WorkflowRun retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of a Workflow Run by ID. */
  public WorkflowRun retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/extend/workflow_runs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, WorkflowRun.class);
  }
}
