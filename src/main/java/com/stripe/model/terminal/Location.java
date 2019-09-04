package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.LocationCreateParams;
import com.stripe.param.terminal.LocationDeleteParams;
import com.stripe.param.terminal.LocationListParams;
import com.stripe.param.terminal.LocationRetrieveParams;
import com.stripe.param.terminal.LocationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Location extends ApiResource implements HasId {
  @SerializedName("address")
  Address address;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** The display name of the location. */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /** Retrieves a <code>Location</code> object. */
  public static Location retrieve(String location) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>Location</code> object. */
  public static Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>Location</code> object. */
  public static Location retrieve(
      String location, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Location.class, options);
  }

  /** Retrieves a <code>Location</code> object. */
  public static Location retrieve(
      String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Location.class, options);
  }

  /** Creates a new <code>Location</code> object. */
  public static Location create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Location</code> object. */
  public static Location create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /** Creates a new <code>Location</code> object. */
  public static Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Location</code> object. */
  public static Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /** Returns a list of <code>Location</code> objects. */
  public static LocationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Location</code> objects. */
  public static LocationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return ApiResource.requestCollection(url, params, LocationCollection.class, options);
  }

  /** Returns a list of <code>Location</code> objects. */
  public static LocationCollection list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Location</code> objects. */
  public static LocationCollection list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return ApiResource.requestCollection(url, params, LocationCollection.class, options);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Location.class, options);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(LocationDeleteParams params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(LocationDeleteParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Location.class, options);
  }
}
