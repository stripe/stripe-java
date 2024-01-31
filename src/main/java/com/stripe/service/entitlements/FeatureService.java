// File generated from our OpenAPI spec
package com.stripe.service.entitlements;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.entitlements.Feature;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.entitlements.FeatureCreateParams;
import com.stripe.param.entitlements.FeatureListParams;

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
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Feature>>() {}.getType());
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
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Feature.class);
  }
}
