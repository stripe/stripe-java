// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ProductUpdateParams extends ApiRequestParams {
  /** Whether the product is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a> object that is the default
   * price for this product.
   */
  @SerializedName("default_price")
  Object defaultPrice;

  /**
   * The product's description, meant to be displayable to the customer. Use this field to
   * optionally store a long form explanation of the product being sold for your own rendering
   * purposes.
   */
  @SerializedName("description")
  Object description;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** A list of up to 8 URLs of images for this product, meant to be displayable to the customer. */
  @SerializedName("images")
  Object images;

  /**
   * A list of up to 15 marketing features for this product. These are displayed in <a
   * href="https://docs.stripe.com/payments/checkout/pricing-table">pricing tables</a>.
   */
  @SerializedName("marketing_features")
  Object marketingFeatures;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The product's name, meant to be displayable to the customer. */
  @SerializedName("name")
  Object name;

  /** The dimensions of this product for shipping purposes. */
  @SerializedName("package_dimensions")
  Object packageDimensions;

  /** Whether this product is shipped (i.e., physical goods). */
  @SerializedName("shippable")
  Boolean shippable;

  /**
   * An arbitrary string to be displayed on your customer's credit card or bank statement. While
   * most banks display this information consistently, some may display it incorrectly or not at
   * all.
   *
   * <p>This may be up to 22 characters. The statement description may not include {@code <}, {@code
   * >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's statement in
   * capital letters. Non-ASCII characters are automatically stripped. It must contain at least one
   * letter. May only be set if {@code type=service}. Only used for subscription payments.
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
  @SerializedName("tax_code")
  Object taxCode;

  /**
   * Tax details for this product, including the <a href="https://stripe.com/tax/tax-codes">tax
   * code</a> and an optional performance location.
   */
  @SerializedName("tax_details")
  Object taxDetails;

  /**
   * A label that represents units of this product. When set, this will be included in customers'
   * receipts, invoices, Checkout, and the customer portal. May only be set if {@code type=service}.
   */
  @SerializedName("unit_label")
  Object unitLabel;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  Object url;

  private ProductUpdateParams(
      Boolean active,
      Object defaultPrice,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      Object images,
      Object marketingFeatures,
      Object metadata,
      Object name,
      Object packageDimensions,
      Boolean shippable,
      Object statementDescriptor,
      Object taxCode,
      Object taxDetails,
      Object unitLabel,
      Object url) {
    this.active = active;
    this.defaultPrice = defaultPrice;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.images = images;
    this.marketingFeatures = marketingFeatures;
    this.metadata = metadata;
    this.name = name;
    this.packageDimensions = packageDimensions;
    this.shippable = shippable;
    this.statementDescriptor = statementDescriptor;
    this.taxCode = taxCode;
    this.taxDetails = taxDetails;
    this.unitLabel = unitLabel;
    this.url = url;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object defaultPrice;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object images;

    private Object marketingFeatures;

    private Object metadata;

    private Object name;

    private Object packageDimensions;

    private Boolean shippable;

    private Object statementDescriptor;

    private Object taxCode;

    private Object taxDetails;

    private Object unitLabel;

    private Object url;

    /** Finalize and obtain parameter instance from this builder. */
    public ProductUpdateParams build() {
      return new ProductUpdateParams(
          this.active,
          this.defaultPrice,
          this.description,
          this.expand,
          this.extraParams,
          this.images,
          this.marketingFeatures,
          this.metadata,
          this.name,
          this.packageDimensions,
          this.shippable,
          this.statementDescriptor,
          this.taxCode,
          this.taxDetails,
          this.unitLabel,
          this.url);
    }

    /** Whether the product is available for purchase. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a> object that is the
     * default price for this product.
     */
    public Builder setDefaultPrice(String defaultPrice) {
      this.defaultPrice = defaultPrice;
      return this;
    }

    /**
     * The ID of the <a href="https://docs.stripe.com/api/prices">Price</a> object that is the
     * default price for this product.
     */
    public Builder setDefaultPrice(EmptyParam defaultPrice) {
      this.defaultPrice = defaultPrice;
      return this;
    }

    /**
     * The product's description, meant to be displayable to the customer. Use this field to
     * optionally store a long form explanation of the product being sold for your own rendering
     * purposes.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The product's description, meant to be displayable to the customer. Use this field to
     * optionally store a long form explanation of the product being sold for your own rendering
     * purposes.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductUpdateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#images} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addImage(String element) {
      if (this.images == null || this.images instanceof EmptyParam) {
        this.images = new ArrayList<String>();
      }
      ((List<String>) this.images).add(element);
      return this;
    }

    /**
     * Add all elements to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#images} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllImage(List<String> elements) {
      if (this.images == null || this.images instanceof EmptyParam) {
        this.images = new ArrayList<String>();
      }
      ((List<String>) this.images).addAll(elements);
      return this;
    }

    /**
     * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
     */
    public Builder setImages(EmptyParam images) {
      this.images = images;
      return this;
    }

    /**
     * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
     */
    public Builder setImages(List<String> images) {
      this.images = images;
      return this;
    }

    /**
     * Add an element to `marketingFeatures` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#marketingFeatures} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addMarketingFeature(ProductUpdateParams.MarketingFeature element) {
      if (this.marketingFeatures == null || this.marketingFeatures instanceof EmptyParam) {
        this.marketingFeatures = new ArrayList<ProductUpdateParams.MarketingFeature>();
      }
      ((List<ProductUpdateParams.MarketingFeature>) this.marketingFeatures).add(element);
      return this;
    }

    /**
     * Add all elements to `marketingFeatures` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ProductUpdateParams#marketingFeatures} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllMarketingFeature(List<ProductUpdateParams.MarketingFeature> elements) {
      if (this.marketingFeatures == null || this.marketingFeatures instanceof EmptyParam) {
        this.marketingFeatures = new ArrayList<ProductUpdateParams.MarketingFeature>();
      }
      ((List<ProductUpdateParams.MarketingFeature>) this.marketingFeatures).addAll(elements);
      return this;
    }

    /**
     * A list of up to 15 marketing features for this product. These are displayed in <a
     * href="https://docs.stripe.com/payments/checkout/pricing-table">pricing tables</a>.
     */
    public Builder setMarketingFeatures(EmptyParam marketingFeatures) {
      this.marketingFeatures = marketingFeatures;
      return this;
    }

    /**
     * A list of up to 15 marketing features for this product. These are displayed in <a
     * href="https://docs.stripe.com/payments/checkout/pricing-table">pricing tables</a>.
     */
    public Builder setMarketingFeatures(
        List<ProductUpdateParams.MarketingFeature> marketingFeatures) {
      this.marketingFeatures = marketingFeatures;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The product's name, meant to be displayable to the customer. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** The product's name, meant to be displayable to the customer. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /** The dimensions of this product for shipping purposes. */
    public Builder setPackageDimensions(ProductUpdateParams.PackageDimensions packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /** The dimensions of this product for shipping purposes. */
    public Builder setPackageDimensions(EmptyParam packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /** Whether this product is shipped (i.e., physical goods). */
    public Builder setShippable(Boolean shippable) {
      this.shippable = shippable;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card or bank statement. While
     * most banks display this information consistently, some may display it incorrectly or not at
     * all.
     *
     * <p>This may be up to 22 characters. The statement description may not include {@code <},
     * {@code >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's
     * statement in capital letters. Non-ASCII characters are automatically stripped. It must
     * contain at least one letter. May only be set if {@code type=service}. Only used for
     * subscription payments.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card or bank statement. While
     * most banks display this information consistently, some may display it incorrectly or not at
     * all.
     *
     * <p>This may be up to 22 characters. The statement description may not include {@code <},
     * {@code >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's
     * statement in capital letters. Non-ASCII characters are automatically stripped. It must
     * contain at least one letter. May only be set if {@code type=service}. Only used for
     * subscription payments.
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(EmptyParam taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * Tax details for this product, including the <a href="https://stripe.com/tax/tax-codes">tax
     * code</a> and an optional performance location.
     */
    public Builder setTaxDetails(ProductUpdateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }

    /**
     * Tax details for this product, including the <a href="https://stripe.com/tax/tax-codes">tax
     * code</a> and an optional performance location.
     */
    public Builder setTaxDetails(EmptyParam taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }

    /**
     * A label that represents units of this product. When set, this will be included in customers'
     * receipts, invoices, Checkout, and the customer portal. May only be set if {@code
     * type=service}.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /**
     * A label that represents units of this product. When set, this will be included in customers'
     * receipts, invoices, Checkout, and the customer portal. May only be set if {@code
     * type=service}.
     */
    public Builder setUnitLabel(EmptyParam unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /** A URL of a publicly-accessible webpage for this product. */
    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }

    /** A URL of a publicly-accessible webpage for this product. */
    public Builder setUrl(EmptyParam url) {
      this.url = url;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MarketingFeature {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The marketing feature name. Up to 80 characters long. */
    @SerializedName("name")
    Object name;

    private MarketingFeature(Map<String, Object> extraParams, Object name) {
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object name;

      /** Finalize and obtain parameter instance from this builder. */
      public ProductUpdateParams.MarketingFeature build() {
        return new ProductUpdateParams.MarketingFeature(this.extraParams, this.name);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ProductUpdateParams.MarketingFeature#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ProductUpdateParams.MarketingFeature#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The marketing feature name. Up to 80 characters long. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> The marketing feature name. Up to 80 characters long. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PackageDimensions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Height, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("height")
    BigDecimal height;

    /** <strong>Required.</strong> Length, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("length")
    BigDecimal length;

    /** <strong>Required.</strong> Weight, in ounces. Maximum precision is 2 decimal places. */
    @SerializedName("weight")
    BigDecimal weight;

    /** <strong>Required.</strong> Width, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("width")
    BigDecimal width;

    private PackageDimensions(
        Map<String, Object> extraParams,
        BigDecimal height,
        BigDecimal length,
        BigDecimal weight,
        BigDecimal width) {
      this.extraParams = extraParams;
      this.height = height;
      this.length = length;
      this.weight = weight;
      this.width = width;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private BigDecimal height;

      private BigDecimal length;

      private BigDecimal weight;

      private BigDecimal width;

      /** Finalize and obtain parameter instance from this builder. */
      public ProductUpdateParams.PackageDimensions build() {
        return new ProductUpdateParams.PackageDimensions(
            this.extraParams, this.height, this.length, this.weight, this.width);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ProductUpdateParams.PackageDimensions#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ProductUpdateParams.PackageDimensions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Height, in inches. Maximum precision is 2 decimal places. */
      public Builder setHeight(BigDecimal height) {
        this.height = height;
        return this;
      }

      /** <strong>Required.</strong> Length, in inches. Maximum precision is 2 decimal places. */
      public Builder setLength(BigDecimal length) {
        this.length = length;
        return this;
      }

      /** <strong>Required.</strong> Weight, in ounces. Maximum precision is 2 decimal places. */
      public Builder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
      }

      /** <strong>Required.</strong> Width, in inches. Maximum precision is 2 decimal places. */
      public Builder setWidth(BigDecimal width) {
        this.width = width;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
     * code</a> ID.
     */
    @SerializedName("tax_code")
    Object taxCode;

    private TaxDetails(Map<String, Object> extraParams, Object taxCode) {
      this.extraParams = extraParams;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public ProductUpdateParams.TaxDetails build() {
        return new ProductUpdateParams.TaxDetails(this.extraParams, this.taxCode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ProductUpdateParams.TaxDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ProductUpdateParams.TaxDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
       * code</a> ID.
       */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /**
       * <strong>Required.</strong> A <a href="https://docs.stripe.com/tax/tax-categories">tax
       * code</a> ID.
       */
      public Builder setTaxCode(EmptyParam taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }
  }
}
