package com.stripe.model.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Location extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Address address;
  Boolean deleted;
  String displayName;

  // <editor-fold desc="create">
  /**
   * Create a location.
   */
  public static Location create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a location.
   */
  public static Location create(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.POST, classUrl(Location.class), params,
            Location.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a location.
   */
  public Location delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a location.
   */
  public Location delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Location.class, this.id), null,
        Location.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all locations.
   */
  public static LocationCollection list(Map<String, Object> params)
          throws StripeException {
    return list(params, null);
  }

  /**
   * List all locations.
   */
  public static LocationCollection list(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return requestCollection(classUrl(Location.class), params,
            LocationCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a location.
   */
  public static Location retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a location.
   */
  public static Location retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a location.
   */
  public static Location retrieve(String id, Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Location.class, id), params, Location.class,
            options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a location.
   */
  public Location update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a location.
   */
  public Location update(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Location.class, this.id), params,
            Location.class, options);
  }
  // </editor-fold>
}
