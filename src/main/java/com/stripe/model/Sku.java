package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Sku extends ApiResource implements HasId, MetadataStore<Sku> {
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
  Long price;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Product> product;
  Long updated;

  // <editor-fold desc="product">
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String productId) {
    this.product = setExpandableFieldId(productId, this.product);

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
  public static Sku create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a SKU.
   */
  public static Sku create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Sku.class), params, Sku.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a SKU.
   */
  public DeletedSku delete() throws StripeException {
    return delete(null);
  }

  /**
   * Delete a SKU.
   */
  public DeletedSku delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Sku.class, this.id), null, DeletedSku.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all SKUs.
   */
  public static SkuCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all SKUs.
   */
  public static SkuCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Sku.class), params, SkuCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a SKU.
   */
  public static Sku retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a SKU.
   */
  public static Sku retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Sku.class, id), null, Sku.class, options);
  }

  /**
   * Retrieve a SKU.
   */
  public static Sku retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Sku.class, id), params, Sku.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a SKU.
   */
  @Override
  public Sku update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a SKU.
   */
  @Override
  public Sku update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Sku.class, this.id), params, Sku.class, options);
  }
  // </editor-fold>
}
