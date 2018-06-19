package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SKU extends APIResource implements HasId, MetadataStore<SKU> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean active;
  Map<String, String> attributes;
  Long created;
  String currency;
  String image;
  Inventory inventory;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  PackageDimensions packageDimensions;
  Integer price;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Product> product;
  Long updated;

  // <editor-fold desc="product">
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String productID) {
    this.product = setExpandableFieldID(productID, this.product);

  }

  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product product) {
    this.product = new ExpandableField<Product>(product.getId(), product);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a SKU.
   */
  public static SKU create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a SKU.
   */
  public static SKU create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(SKU.class), params, SKU.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a SKU.
   */
  public DeletedSKU delete()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null);
  }

  /**
   * Delete a SKU.
   */
  public DeletedSKU delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(SKU.class, this.id), null, DeletedSKU.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all SKUs.
   */
  public static SKUCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all SKUs.
   */
  public static SKUCollection list(Map<String, Object> params,
                   RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(SKU.class), params, SKUCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a SKU.
   */
  public static SKU retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a SKU.
   */
  public static SKU retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(SKU.class, id), null, SKU.class, options);
  }

  /**
   * Retrieve a SKU.
   */
  public static SKU retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(SKU.class, id), params, SKU.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a SKU.
   */
  @Override
  public SKU update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a SKU.
   */
  @Override
  public SKU update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(SKU.class, this.id), params, SKU.class, options);
  }
  // </editor-fold>
}
