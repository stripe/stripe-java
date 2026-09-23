// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.Project;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.ProjectCreateParams;

public final class ProjectService extends ApiService {
  public ProjectService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new project. */
  public Project create(ProjectCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new project. */
  public Project create(ProjectCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/projects";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Project.class);
  }
}
