// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.terminal.Location;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.LocationCreateParams;
import com.stripe.param.terminal.LocationListParams;
import com.stripe.param.terminal.LocationRetrieveParams;
import com.stripe.param.terminal.LocationUpdateParams;

public final class LocationService extends ApiService {
  public LocationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a {@code Location} object. */
  public Location delete(String location) throws StripeException {
    return delete(location, (RequestOptions) null);
  }
  /** Deletes a {@code Location} object. */
  public Location delete(String location, RequestOptions options) throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Location.class);
  }
  /** Retrieves a {@code Location} object. */
  public Location retrieve(String location, LocationRetrieveParams params) throws StripeException {
    return retrieve(location, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Location} object. */
  public Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (LocationRetrieveParams) null, options);
  }
  /** Retrieves a {@code Location} object. */
  public Location retrieve(String location) throws StripeException {
    return retrieve(location, (LocationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Location} object. */
  public Location retrieve(String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Location.class);
  }
  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String location, LocationUpdateParams params) throws StripeException {
    return update(location, params, (RequestOptions) null);
  }
  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String location, RequestOptions options) throws StripeException {
    return update(location, (LocationUpdateParams) null, options);
  }
  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String location) throws StripeException {
    return update(location, (LocationUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a {@code Location} object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String location, LocationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Location.class);
  }
  /** Returns a list of {@code Location} objects. */
  public StripeCollection<Location> list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of {@code Location} objects. */
  public StripeCollection<Location> list(RequestOptions options) throws StripeException {
    return list((LocationListParams) null, options);
  }
  /** Returns a list of {@code Location} objects. */
  public StripeCollection<Location> list() throws StripeException {
    return list((LocationListParams) null, (RequestOptions) null);
  }
  /** Returns a list of {@code Location} objects. */
  public StripeCollection<Location> list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Location>>() {}.getType());
  }
  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new {@code Location} object. For further details, including which address fields are
   * required in each country, see the <a
   * href="https://stripe.com/docs/terminal/fleet/locations">Manage locations</a> guide.
   */
  public Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Location.class);
  }
}
