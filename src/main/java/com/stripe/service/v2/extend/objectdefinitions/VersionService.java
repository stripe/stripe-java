// File generated from our OpenAPI spec
package com.stripe.service.v2.extend.objectdefinitions;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.extend.ObjectDefinitionVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.extend.objectdefinitions.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists a page of object definition versions in descending semantic version order. */
  public StripeCollection<ObjectDefinitionVersion> list(
      String objectDefinitionId, VersionListParams params) throws StripeException {
    return list(objectDefinitionId, params, (RequestOptions) null);
  }
  /** Lists a page of object definition versions in descending semantic version order. */
  public StripeCollection<ObjectDefinitionVersion> list(
      String objectDefinitionId, RequestOptions options) throws StripeException {
    return list(objectDefinitionId, (VersionListParams) null, options);
  }
  /** Lists a page of object definition versions in descending semantic version order. */
  public StripeCollection<ObjectDefinitionVersion> list(String objectDefinitionId)
      throws StripeException {
    return list(objectDefinitionId, (VersionListParams) null, (RequestOptions) null);
  }
  /** Lists a page of object definition versions in descending semantic version order. */
  public StripeCollection<ObjectDefinitionVersion> list(
      String objectDefinitionId, VersionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/extend/object_definitions/%s/versions",
            ApiResource.urlEncodeId(objectDefinitionId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ObjectDefinitionVersion>>() {}.getType());
  }
  /** Retrieves an object definition version. */
  public ObjectDefinitionVersion retrieve(String objectDefinitionId, String id)
      throws StripeException {
    return retrieve(objectDefinitionId, id, (RequestOptions) null);
  }
  /** Retrieves an object definition version. */
  public ObjectDefinitionVersion retrieve(
      String objectDefinitionId, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/extend/object_definitions/%s/versions/%s",
            ApiResource.urlEncodeId(objectDefinitionId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ObjectDefinitionVersion.class);
  }
}
