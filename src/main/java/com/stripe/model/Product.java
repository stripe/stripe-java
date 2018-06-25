package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Product extends ApiResource implements HasId, MetadataStore<Product> {
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
  SkuCollection skus;
  String statementDescriptor;
  String type;
  Long updated;
  String url;

  // <editor-fold desc="create">
  /**
   * Create a product.
   */
  public static Product create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a product.
   */
  public static Product create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Product.class), params, Product.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a product.
   */
  public DeletedProduct delete() throws StripeException {
    return delete(null);
  }

  /**
   * Delete a product.
   */
  public DeletedProduct delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Product.class, this.id), null,
        DeletedProduct.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all products.
   */
  public static ProductCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all products.
   */
  public static ProductCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Product.class), params, ProductCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a product.
   */
  public static Product retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a product.
   */
  public static Product retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Product.class, id), null, Product.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a product.
   */
  @Override
  public Product update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a product.
   */
  @Override
  public Product update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Product.class, this.id), params,
        Product.class, options);
  }
  // </editor-fold>
}
