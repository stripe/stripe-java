// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ProductCreateParams;
import com.stripe.param.ProductListParams;
import com.stripe.param.ProductRetrieveParams;
import com.stripe.param.ProductUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Product extends ApiResource implements HasId, MetadataStore<Product> {
  /** Whether the product is currently available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A list of up to 5 attributes that each SKU can provide values for (e.g., {@code ["color",
   * "size"]}).
   */
  @SerializedName("attributes")
  List<String> attributes;

  /**
   * A short one-line description of the product, meant to be displayable to the customer. Only
   * applicable to products of {@code type=good}.
   */
  @SerializedName("caption")
  String caption;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * An array of connect application identifiers that cannot purchase this product. Only applicable
   * to products of {@code type=good}.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * The product's description, meant to be displayable to the customer. Use this field to
   * optionally store a long form explanation of the product being sold for your own rendering
   * purposes.
   */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** A list of up to 8 URLs of images for this product, meant to be displayable to the customer. */
  @SerializedName("images")
  List<String> images;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The product's name, meant to be displayable to the customer. Whenever this product is sold via
   * a subscription, name will show up on associated invoice line item descriptions.
   */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code product}.
   */
  @SerializedName("object")
  String object;

  /** The dimensions of this product for shipping purposes. */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /** Whether this product is shipped (i.e., physical goods). */
  @SerializedName("shippable")
  Boolean shippable;

  /**
   * Extra information about a product which will appear on your customer's credit card statement.
   * In the case that multiple products are billed at once, the first statement descriptor will be
   * used.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /** A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. */
  @SerializedName("tax_code")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TaxCode> taxCode;

  /**
   * The type of the product. The product is either of type {@code good}, which is eligible for use
   * with Orders and SKUs, or {@code service}, which is eligible for use with Subscriptions and
   * Plans.
   *
   * <p>One of {@code good}, or {@code service}.
   */
  @SerializedName("type")
  String type;

  /**
   * A label that represents units of this product in Stripe and on customers’ receipts and
   * invoices. When set, this will be included in associated invoice line item descriptions.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  String url;

  /** Get ID of expandable {@code taxCode} object. */
  public String getTaxCode() {
    return (this.taxCode != null) ? this.taxCode.getId() : null;
  }

  public void setTaxCode(String id) {
    this.taxCode = ApiResource.setExpandableFieldId(id, this.taxCode);
  }

  /** Get expanded {@code taxCode}. */
  public TaxCode getTaxCodeObject() {
    return (this.taxCode != null) ? this.taxCode.getExpanded() : null;
  }

  public void setTaxCodeObject(TaxCode expandableObject) {
    this.taxCode = new ExpandableField<TaxCode>(expandableObject.getId(), expandableObject);
  }

  /** Creates a new product object. */
  public static Product create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new product object. */
  public static Product create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /** Creates a new product object. */
  public static Product create(ProductCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new product object. */
  public static Product create(ProductCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Product.class, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, ProductRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Product.class, options);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Product update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Product update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(ProductUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Product update(ProductUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return ApiResource.requestCollection(url, params, ProductCollection.class, options);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(ProductListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(ProductListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return ApiResource.requestCollection(url, params, ProductCollection.class, options);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with <code>type=good</code> is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with <code>type=good</code> is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with <code>type=good</code> is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with <code>type=good</code> is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Product.class, options);
  }
}
