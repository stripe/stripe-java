// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ProductCreateParams;
import com.stripe.param.ProductListParams;
import com.stripe.param.ProductRetrieveParams;
import com.stripe.param.ProductSearchParams;
import com.stripe.param.ProductUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Products describe the specific goods or services you offer to your customers. For example, you
 * might offer a Standard and Premium version of your goods or service; each version would be a
 * separate Product. They can be used in conjunction with <a
 * href="https://stripe.com/docs/api#prices">Prices</a> to configure pricing in Payment Links,
 * Checkout, and Subscriptions.
 *
 * <p>Related guides: <a
 * href="https://stripe.com/docs/billing/subscriptions/set-up-subscription">Set up a
 * subscription</a>, <a href="https://stripe.com/docs/payment-links">share a Payment Link</a>, <a
 * href="https://stripe.com/docs/payments/accept-a-payment#create-product-prices-upfront">accept
 * payments with Checkout</a>, and more about <a
 * href="https://stripe.com/docs/products-prices/overview">Products and Prices</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Product extends ApiResource implements HasId, MetadataStore<Product> {
  /** Whether the product is currently available for purchase. */
  @SerializedName("active")
  Boolean active;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The ID of the <a href="https://stripe.com/docs/api/prices">Price</a> object that is the default
   * price for this product.
   */
  @SerializedName("default_price")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Price> defaultPrice;

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

  /**
   * A list of up to 15 marketing features for this product. These are displayed in <a
   * href="https://stripe.com/docs/payments/checkout/pricing-table">pricing tables</a>.
   */
  @SerializedName("features")
  List<Product.Feature> features;

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

  /** The product's name, meant to be displayable to the customer. */
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

  /** Provisioning configuration for this product. */
  @SerializedName("provisioning")
  Provisioning provisioning;

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

  /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
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
   * A label that represents units of this product. When set, this will be included in customers'
   * receipts, invoices, Checkout, and the customer portal.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  String url;

  /** Get ID of expandable {@code defaultPrice} object. */
  public String getDefaultPrice() {
    return (this.defaultPrice != null) ? this.defaultPrice.getId() : null;
  }

  public void setDefaultPrice(String id) {
    this.defaultPrice = ApiResource.setExpandableFieldId(id, this.defaultPrice);
  }

  /** Get expanded {@code defaultPrice}. */
  public Price getDefaultPriceObject() {
    return (this.defaultPrice != null) ? this.defaultPrice.getExpanded() : null;
  }

  public void setDefaultPriceObject(Price expandableObject) {
    this.defaultPrice = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
  }

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
    String path = "/v1/products";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  /** Creates a new product object. */
  public static Product create(ProductCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new product object. */
  public static Product create(ProductCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/products";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product is only possible if it has no prices associated with it.
   * Additionally, deleting a product with {@code type=good} is only possible if it has no SKUs
   * associated with it.
   */
  public Product delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Product.class);
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
    String path = "/v1/products";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ProductCollection.class);
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
    String path = "/v1/products";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ProductCollection.class);
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
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, ProductRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Product.class);
  }

  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ProductSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ProductSearchResult search(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/products/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ProductSearchResult.class);
  }

  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ProductSearchResult search(ProductSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for products you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ProductSearchResult search(ProductSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/products/search";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ProductSearchResult.class);
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
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Product.class);
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
    String path = String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Product.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Feature extends StripeObject {
    @SerializedName("feature")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<com.stripe.model.entitlements.Feature> feature;

    /** The marketing feature name. Up to 80 characters long. */
    @SerializedName("name")
    String name;

    /** Get ID of expandable {@code feature} object. */
    public String getFeature() {
      return (this.feature != null) ? this.feature.getId() : null;
    }

    public void setFeature(String id) {
      this.feature = ApiResource.setExpandableFieldId(id, this.feature);
    }

    /** Get expanded {@code feature}. */
    public com.stripe.model.entitlements.Feature getFeatureObject() {
      return (this.feature != null) ? this.feature.getExpanded() : null;
    }

    public void setFeatureObject(com.stripe.model.entitlements.Feature expandableObject) {
      this.feature =
          new ExpandableField<com.stripe.model.entitlements.Feature>(
              expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PackageDimensions extends StripeObject {
    /** Height, in inches. */
    @SerializedName("height")
    BigDecimal height;

    /** Length, in inches. */
    @SerializedName("length")
    BigDecimal length;

    /** Weight, in ounces. */
    @SerializedName("weight")
    BigDecimal weight;

    /** Width, in inches. */
    @SerializedName("width")
    BigDecimal width;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Provisioning extends StripeObject {
    @SerializedName("gift_card")
    GiftCard giftCard;

    /**
     * The type of provisioning, only {@code gift_card} currently supported.
     *
     * <p>Equal to {@code gift_card}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GiftCard extends StripeObject {
      @SerializedName("fixed_amount")
      FixedAmount fixedAmount;

      /**
       * The specific type of gift_card provisioning, only {@code fixed_amount} currently supported.
       *
       * <p>Equal to {@code fixed_amount}.
       */
      @SerializedName("type")
      String type;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FixedAmount extends StripeObject {
        /** The initial amount with which the provisioned gift card will be created. */
        @SerializedName("amount")
        Long amount;

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(defaultPrice, responseGetter);
    trySetResponseGetter(packageDimensions, responseGetter);
    trySetResponseGetter(provisioning, responseGetter);
    trySetResponseGetter(taxCode, responseGetter);
  }
}
