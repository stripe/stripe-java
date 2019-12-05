package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SkuCreateParams;
import com.stripe.param.SkuListParams;
import com.stripe.param.SkuRetrieveParams;
import com.stripe.param.SkuUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Sku extends ApiResource implements HasId, MetadataStore<Sku> {
  /** Whether the SKU is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A dictionary of attributes and values for the attributes defined by the product. If, for
   * example, a product's attributes are `["size", "gender"]`, a valid SKU has the following
   * dictionary of attributes: `{"size": "Medium", "gender": "Unisex"}`.
   */
  @SerializedName("attributes")
  Map<String, String> attributes;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The URL of an image for this SKU, meant to be displayable to the customer. */
  @SerializedName("image")
  String image;

  @SerializedName("inventory")
  Inventory inventory;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `sku`.
   */
  @SerializedName("object")
  String object;

  /** The dimensions of this SKU for shipping purposes. */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /**
   * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to
   * charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
   */
  @SerializedName("price")
  Long price;

  /** The ID of the product this SKU is associated with. The product must be currently active. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  @SerializedName("updated")
  Long updated;

  /** Get id of expandable `product` object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded `product`. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/skus/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Sku.class, options);
  }

  /**
   * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU
   * creation request or from the product, and Stripe will return the corresponding SKU information.
   */
  public static Sku retrieve(String id, SkuRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/skus/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Sku.class, options);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/skus");
    return ApiResource.requestCollection(url, params, SkuCollection.class, options);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(SkuListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most
   * recently created SKUs appearing first.
   */
  public static SkuCollection list(SkuListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/skus");
    return ApiResource.requestCollection(url, params, SkuCollection.class, options);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  @Override
  public Sku update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  @Override
  public Sku update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  public Sku update(SkuUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific SKU by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a SKU’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing SKU and create a new one with the new attribute values.
   */
  public Sku update(SkuUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/skus");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(SkuCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new SKU associated with a product. */
  public static Sku create(SkuCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/skus");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Sku.class, options);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Delete a SKU. Deleting a SKU is only possible until it has been used in an order. */
  public Sku delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/skus/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.DELETE, url, params, Sku.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Inventory extends StripeObject {
    /** The count of inventory available. Will be present if and only if `type` is `finite`. */
    @SerializedName("quantity")
    Long quantity;

    /** Inventory type. Possible values are `finite`, `bucket` (not quantified), and `infinite`. */
    @SerializedName("type")
    String type;

    /**
     * An indicator of the inventory available. Possible values are `in_stock`, `limited`, and
     * `out_of_stock`. Will be present if and only if `type` is `bucket`.
     */
    @SerializedName("value")
    String value;
  }
}
