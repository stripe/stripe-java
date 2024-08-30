// File generated from our OpenAPI spec
package com.stripe.service.entitlements;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.entitlements.Feature;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.entitlements.FeatureCreateParams;
import com.stripe.param.entitlements.FeatureListParams;
import com.stripe.param.entitlements.FeatureRetrieveParams;
import com.stripe.param.entitlements.FeatureUpdateParams;

public final class FeatureService extends ApiService {
  public FeatureService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of features. */
  public StripeCollection<Feature> list(FeatureListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of features. */
  public StripeCollection<Feature> list(RequestOptions options) throws StripeException {
    return list((FeatureListParams) null, options);
  }
  /** Retrieve a list of features. */
  public StripeCollection<Feature> list() throws StripeException {
    return list((FeatureListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of features. */
  public StripeCollection<Feature> list(FeatureListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/features";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Feature>>() {}.getType());
  }
  /** Creates a feature. */
  public Feature create(FeatureCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a feature. */
  public Feature create(FeatureCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/entitlements/features";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Feature.class);
  }
  /** Retrieves a feature. */
  public Feature retrieve(String id, FeatureRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a feature. */
  public Feature retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FeatureRetrieveParams) null, options);
  }
  /** Retrieves a feature. */
  public Feature retrieve(String id) throws StripeException {
    return retrieve(id, (FeatureRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a feature. */
  public Feature retrieve(String id, FeatureRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/entitlements/features/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Feature.class);
  }
  /** Update a feature’s metadata or permanently deactivate it. */
  public Feature update(String id, FeatureUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a feature’s metadata or permanently deactivate it. */
  public Feature update(String id, RequestOptions options) throws StripeException {
    return update(id, (FeatureUpdateParams) null, options);
  }
  /** Update a feature’s metadata or permanently deactivate it. */
  public Feature update(String id) throws StripeException {
    return update(id, (FeatureUpdateParams) null, (RequestOptions) null);
  }
  /** Update a feature’s metadata or permanently deactivate it. */
  public Feature update(String id, FeatureUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/entitlements/features/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Feature.class);
  }
}
