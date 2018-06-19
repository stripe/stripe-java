package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Product extends APIResource implements HasId, MetadataStore<Product> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean active;
  List<String> attributes;
  String caption;
  Long created;
  List<String> deactivateOn;
  String description;
  List<String> images;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String name;
  PackageDimensions packageDimensions;
  Boolean shippable;
  SKUCollection skus;
  String statementDescriptor;
  String type;
  Long updated;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) String url;

  // <editor-fold desc="url">
  public String getURL() {
    return url;
  }

  public void setURL(String url) {
    this.url = url;
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a product.
   */
  public static Product create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a product.
   */
  public static Product create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Product.class), params, Product.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a product.
   */
  public DeletedProduct delete()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null);
  }

  /**
   * Delete a product.
   */
  public DeletedProduct delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Product.class, this.id), null,
        DeletedProduct.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all products.
   */
  public static ProductCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all products.
   */
  public static ProductCollection list(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Product.class), params, ProductCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a product.
   */
  public static Product retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a product.
   */
  public static Product retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Product.class, id), null, Product.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a product.
   */
  @Override
  public Product update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a product.
   */
  @Override
  public Product update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Product.class, this.id), params,
        Product.class, options);
  }
  // </editor-fold>
}
