// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.data.Schema;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.SchemaListParams;

public final class SchemaService extends ApiService {
  public SchemaService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of schemas describing the tables available to query. */
  public StripeCollection<Schema> list(SchemaListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of schemas describing the tables available to query. */
  public StripeCollection<Schema> list(RequestOptions options) throws StripeException {
    return list((SchemaListParams) null, options);
  }
  /** Returns a list of schemas describing the tables available to query. */
  public StripeCollection<Schema> list() throws StripeException {
    return list((SchemaListParams) null, (RequestOptions) null);
  }
  /** Returns a list of schemas describing the tables available to query. */
  public StripeCollection<Schema> list(SchemaListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/schemas";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Schema>>() {}.getType());
  }
  /** Retrieves the schema for a particular table. */
  public Schema retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the schema for a particular table. */
  public Schema retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/data/schemas/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Schema.class);
  }
}
