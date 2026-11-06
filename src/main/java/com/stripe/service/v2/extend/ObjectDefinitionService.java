// File generated from our OpenAPI spec
package com.stripe.service.v2.extend;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.extend.ObjectDefinition;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.extend.ObjectDefinitionListParams;

public final class ObjectDefinitionService extends ApiService {
  public ObjectDefinitionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists a page of object definitions. */
  public StripeCollection<ObjectDefinition> list(ObjectDefinitionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists a page of object definitions. */
  public StripeCollection<ObjectDefinition> list(RequestOptions options) throws StripeException {
    return list((ObjectDefinitionListParams) null, options);
  }
  /** Lists a page of object definitions. */
  public StripeCollection<ObjectDefinition> list() throws StripeException {
    return list((ObjectDefinitionListParams) null, (RequestOptions) null);
  }
  /** Lists a page of object definitions. */
  public StripeCollection<ObjectDefinition> list(
      ObjectDefinitionListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/extend/object_definitions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ObjectDefinition>>() {}.getType());
  }
  /** Retrieves an object definition. */
  public ObjectDefinition retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an object definition. */
  public ObjectDefinition retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/extend/object_definitions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ObjectDefinition.class);
  }

  public com.stripe.service.v2.extend.objectdefinitions.VersionService versions() {
    return new com.stripe.service.v2.extend.objectdefinitions.VersionService(
        this.getResponseGetter());
  }
}
