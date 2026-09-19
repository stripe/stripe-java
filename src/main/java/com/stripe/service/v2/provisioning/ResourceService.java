// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.Resource;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.ResourceCreateParams;
import com.stripe.param.v2.provisioning.ResourceLinkParams;
import com.stripe.param.v2.provisioning.ResourceSubmitInformationParams;
import com.stripe.param.v2.provisioning.ResourceUpdateParams;

public final class ResourceService extends ApiService {
  public ResourceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new provider resource. */
  public Resource create(ResourceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new provider resource. */
  public Resource create(ResourceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/provisioning/resources";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Resource.class);
  }
  /** Links an existing provider resource to a project or account. */
  public Resource link(ResourceLinkParams params) throws StripeException {
    return link(params, (RequestOptions) null);
  }
  /** Links an existing provider resource to a project or account. */
  public Resource link(ResourceLinkParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/resources/link";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Resource.class);
  }
  /** Retrieves a provider resource. */
  public Resource retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a provider resource. */
  public Resource retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/provisioning/resources/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Resource.class);
  }
  /** Updates a resource's configuration or service. */
  public Resource update(String id, ResourceUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a resource's configuration or service. */
  public Resource update(String id, RequestOptions options) throws StripeException {
    return update(id, (ResourceUpdateParams) null, options);
  }
  /** Updates a resource's configuration or service. */
  public Resource update(String id) throws StripeException {
    return update(id, (ResourceUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a resource's configuration or service. */
  public Resource update(String id, ResourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/provisioning/resources/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Resource.class);
  }
  /** Removes a resource. */
  public Resource remove(String id) throws StripeException {
    return remove(id, (RequestOptions) null);
  }
  /** Removes a resource. */
  public Resource remove(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/provisioning/resources/%s/remove", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Resource.class);
  }
  /** Rotates a resource's credentials. */
  public Resource rotateCredentials(String id) throws StripeException {
    return rotateCredentials(id, (RequestOptions) null);
  }
  /** Rotates a resource's credentials. */
  public Resource rotateCredentials(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/provisioning/resources/%s/rotate_credentials", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Resource.class);
  }
  /** Submits additional information requested by the provider for a resource. */
  public Resource submitInformation(String id, ResourceSubmitInformationParams params)
      throws StripeException {
    return submitInformation(id, params, (RequestOptions) null);
  }
  /** Submits additional information requested by the provider for a resource. */
  public Resource submitInformation(
      String id, ResourceSubmitInformationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/provisioning/resources/%s/submit_information", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Resource.class);
  }
  /** Unlinks a resource without removing it from the provider. */
  public Resource unlink(String id) throws StripeException {
    return unlink(id, (RequestOptions) null);
  }
  /** Unlinks a resource without removing it from the provider. */
  public Resource unlink(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/provisioning/resources/%s/unlink", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Resource.class);
  }
}
