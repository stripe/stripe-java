// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.tax.Location;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.LocationCreateParams;
import com.stripe.param.tax.LocationListParams;
import com.stripe.param.tax.LocationRetrieveParams;

public final class LocationService extends ApiService {
  public LocationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieve a list of all tax locations. Tax locations can represent the venues for services,
   * tickets, or other product types.
   *
   * <p>The response includes detailed information for each tax location, such as its address, name,
   * description, and current operational status.
   *
   * <p>You can paginate through the list by using the {@code limit} parameter to control the number
   * of results returned in each request.
   */
  public StripeCollection<Location> list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Retrieve a list of all tax locations. Tax locations can represent the venues for services,
   * tickets, or other product types.
   *
   * <p>The response includes detailed information for each tax location, such as its address, name,
   * description, and current operational status.
   *
   * <p>You can paginate through the list by using the {@code limit} parameter to control the number
   * of results returned in each request.
   */
  public StripeCollection<Location> list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Location>>() {}.getType());
  }
  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Location.class);
  }
  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public Location retrieve(String location, LocationRetrieveParams params) throws StripeException {
    return retrieve(location, params, (RequestOptions) null);
  }
  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (LocationRetrieveParams) null, options);
  }
  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public Location retrieve(String location) throws StripeException {
    return retrieve(location, (LocationRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public Location retrieve(String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Location.class);
  }
}
