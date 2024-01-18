// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.PhysicalBundle;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.PhysicalBundleListParams;
import com.stripe.param.issuing.PhysicalBundleRetrieveParams;

public final class PhysicalBundleService extends ApiService {
  public PhysicalBundleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of physical bundle objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PhysicalBundle> list(PhysicalBundleListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of physical bundle objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PhysicalBundle> list(RequestOptions options) throws StripeException {
    return list((PhysicalBundleListParams) null, options);
  }
  /**
   * Returns a list of physical bundle objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PhysicalBundle> list() throws StripeException {
    return list((PhysicalBundleListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of physical bundle objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public StripeCollection<PhysicalBundle> list(
      PhysicalBundleListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/physical_bundles";
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
        .request(request, new TypeToken<StripeCollection<PhysicalBundle>>() {}.getType());
  }
  /** Retrieves a physical bundle object. */
  public PhysicalBundle retrieve(String physicalBundle, PhysicalBundleRetrieveParams params)
      throws StripeException {
    return retrieve(physicalBundle, params, (RequestOptions) null);
  }
  /** Retrieves a physical bundle object. */
  public PhysicalBundle retrieve(String physicalBundle, RequestOptions options)
      throws StripeException {
    return retrieve(physicalBundle, (PhysicalBundleRetrieveParams) null, options);
  }
  /** Retrieves a physical bundle object. */
  public PhysicalBundle retrieve(String physicalBundle) throws StripeException {
    return retrieve(physicalBundle, (PhysicalBundleRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a physical bundle object. */
  public PhysicalBundle retrieve(
      String physicalBundle, PhysicalBundleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/physical_bundles/%s", ApiResource.urlEncodeId(physicalBundle));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PhysicalBundle.class);
  }
}
