// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.LocationCreateParams;
import com.stripe.param.tax.LocationListParams;
import com.stripe.param.tax.LocationRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Tax locations represent venues for services, tickets, or other product types. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Location extends ApiResource implements HasId {
  @SerializedName("address")
  Address address;

  /**
   * A descriptive text providing additional context about the tax location. This can include
   * information about the venue, types of events held, services available, or any relevant details
   * for better identification (e.g., &quot;A spacious auditorium suitable for large concerts and
   * events.&quot;).
   */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.location}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of tax location to be defined. Currently the only option is {@code performance}.
   *
   * <p>Equal to {@code performance}.
   */
  @SerializedName("type")
  String type;

  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public static Location create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public static Location create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public static Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a tax location to use in calculating taxes for a service, ticket, or other type of
   * product. The resulting object contains the id, address, name, description, and current
   * operational status of the tax location.
   */
  public static Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Location.class);
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
  public static LocationCollection list(Map<String, Object> params) throws StripeException {
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
  public static LocationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, LocationCollection.class);
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
  public static LocationCollection list(LocationListParams params) throws StripeException {
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
  public static LocationCollection list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/locations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, LocationCollection.class);
  }

  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public static Location retrieve(String location) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public static Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, options);
  }

  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public static Location retrieve(
      String location, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/locations/%s", ApiResource.urlEncodeId(location));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  /**
   * Fetch the details of a specific tax location using its unique identifier. Use a tax location to
   * calculate taxes based on the location of the end product, such as a performance, instead of the
   * customer address. For more details, check the <a
   * href="https://docs.stripe.com/tax/tax-for-tickets/integration-guide">integration guide</a>.
   */
  public static Location retrieve(
      String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/locations/%s", ApiResource.urlEncodeId(location));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Location.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(address, responseGetter);
  }
}
