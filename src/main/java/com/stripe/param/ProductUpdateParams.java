package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductUpdateParams extends ApiRequestParams {

  /** Whether the product is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g.,
   * `["color", "size"]`). If a value for `attributes` is specified, the list specified will replace
   * the existing attributes list on this product. Any attributes not present after the update will
   * be deleted from the SKUs for this product.
   */
  @SerializedName("attributes")
  Object attributes;

  /** A short one-line description of the product, meant to be displayable to the customer. */
  @SerializedName("caption")
  String caption;

  /**
   * An array of Connect application names or identifiers that should not be able to order the SKUs
   * for this product.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;

  /** The product's description, meant to be displayable to the customer. */
  @SerializedName("description")
  String description;

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
   * A set of key-value pairs that you can attach to a product object. It can be useful for storing
   * additional information about the product in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The product's name, meant to be displayable to the customer. Applicable to both `service` and
   * `good` types.
   */
  @SerializedName("name")
  String name;

  /**
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own `package_dimensions`.
   */
  @SerializedName("package_dimensions")
  Object packageDimensions;

  /** Whether this product is shipped (i.e., physical goods). Defaults to `true`. */
  @SerializedName("shippable")
  Boolean shippable;

  /**
   * An arbitrary string to be displayed on your customer's credit card statement. This may be up to
   * 22 characters. The statement description may not include "' characters, and will appear on your
   * customer's statement in capital letters. Non-ASCII characters are automatically stripped. While
   * most banks display this information consistently, some may display it incorrectly or not at
   * all. It must contain at least one letter. May only be set if type=`service`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * A label that represents units of this product, such as seat(s), in Stripe and on customers’
   * receipts and invoices. Only available on products of type=`service`.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  String url;

  private ProductUpdateParams(
      Boolean active,
      Object attributes,
      String caption,
      List<String> deactivateOn,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Object images,
      Map<String, String> metadata,
      String name,
      Object packageDimensions,
      Boolean shippable,
      String statementDescriptor,
      String unitLabel,
      String url) {

    this.active = active;
    this.attributes = attributes;
    this.caption = caption;
    this.deactivateOn = deactivateOn;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.images = images;
    this.metadata = metadata;
    this.name = name;
    this.packageDimensions = packageDimensions;
    this.shippable = shippable;
    this.statementDescriptor = statementDescriptor;
    this.unitLabel = unitLabel;
    this.url = url;
  }

  public static ProductUpdateParams.Builder builder() {
    return new ProductUpdateParams.Builder();
  }

  public static class Builder {
    private Boolean active;
    private Object attributes;
    private String caption;
    private List<String> deactivateOn;
    private String description;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Object images;
    private Map<String, String> metadata;
    private String name;
    private Object packageDimensions;
    private Boolean shippable;
    private String statementDescriptor;
    private String unitLabel;
    private String url;

    public ProductUpdateParams build() {
      return new ProductUpdateParams(
          this.active,
          this.attributes,
          this.caption,
          this.deactivateOn,
          this.description,
          this.expand,
          this.extraParams,
          this.images,
          this.metadata,
          this.name,
          this.packageDimensions,
          this.shippable,
          this.statementDescriptor,
          this.unitLabel,
          this.url);
    }

    /** Whether the product is available for purchase. */
    public ProductUpdateParams.Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g.,
     * `["color", "size"]`). If a value for `attributes` is specified, the list specified will
     * replace the existing attributes list on this product. Any attributes not present after the
     * update will be deleted from the SKUs for this product.
     */
    public ProductUpdateParams.Builder setAttributes(List<String> attributes) {

      this.attributes = attributes;
      return this;
    }

    /**
     * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g.,
     * `["color", "size"]`). If a value for `attributes` is specified, the list specified will
     * replace the existing attributes list on this product. Any attributes not present after the
     * update will be deleted from the SKUs for this product.
     */
    public ProductUpdateParams.Builder setAttributes(EmptyParam attributes) {

      this.attributes = attributes;
      return this;
    }

    /** A short one-line description of the product, meant to be displayable to the customer. */
    public ProductUpdateParams.Builder setCaption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     * Add an element to `deactivateOn` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#deactivateOn} for the field documentation.
     */
    public ProductUpdateParams.Builder addDeactivateOn(String element) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.add(element);
      return this;
    }

    /**
     * Add all elements to `deactivateOn` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#deactivateOn} for the field documentation.
     */
    public ProductUpdateParams.Builder addAllDeactivateOn(List<String> list) {

      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.addAll(list);
      return this;
    }

    /** The product's description, meant to be displayable to the customer. */
    public ProductUpdateParams.Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#expand} for the field documentation.
     */
    public ProductUpdateParams.Builder addExpand(String element) {
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
    public ProductUpdateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductUpdateParams#extraParams} for the field documentation.
     */
    public ProductUpdateParams.Builder putExtraParam(String key, Object value) {

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
    public ProductUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
     */
    public ProductUpdateParams.Builder setImages(List<String> images) {
      this.images = images;
      return this;
    }

    /**
     * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
     */
    public ProductUpdateParams.Builder setImages(EmptyParam images) {
      this.images = images;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductUpdateParams#metadata} for the field documentation.
     */
    public ProductUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductUpdateParams#metadata} for the field documentation.
     */
    public ProductUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The product's name, meant to be displayable to the customer. Applicable to both `service` and
     * `good` types.
     */
    public ProductUpdateParams.Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The dimensions of this product for shipping purposes. A SKU associated with this product can
     * override this value by having its own `package_dimensions`.
     */
    public ProductUpdateParams.Builder setPackageDimensions(
        ProductUpdateParams.PackageDimensions packageDimensions) {

      this.packageDimensions = packageDimensions;
      return this;
    }

    /**
     * The dimensions of this product for shipping purposes. A SKU associated with this product can
     * override this value by having its own `package_dimensions`.
     */
    public ProductUpdateParams.Builder setPackageDimensions(EmptyParam packageDimensions) {

      this.packageDimensions = packageDimensions;
      return this;
    }

    /** Whether this product is shipped (i.e., physical goods). Defaults to `true`. */
    public ProductUpdateParams.Builder setShippable(Boolean shippable) {
      this.shippable = shippable;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card statement. This may be up
     * to 22 characters. The statement description may not include "' characters, and will appear on
     * your customer's statement in capital letters. Non-ASCII characters are automatically
     * stripped. While most banks display this information consistently, some may display it
     * incorrectly or not at all. It must contain at least one letter. May only be set if
     * type=`service`.
     */
    public ProductUpdateParams.Builder setStatementDescriptor(String statementDescriptor) {

      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * A label that represents units of this product, such as seat(s), in Stripe and on customers’
     * receipts and invoices. Only available on products of type=`service`.
     */
    public ProductUpdateParams.Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /** A URL of a publicly-accessible webpage for this product. */
    public ProductUpdateParams.Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  public static class PackageDimensions {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Height, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("height")
    BigDecimal height;

    /** Length, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("length")
    BigDecimal length;

    /** Weight, in ounces. Maximum precision is 2 decimal places. */
    @SerializedName("weight")
    BigDecimal weight;

    /** Width, in inches. Maximum precision is 2 decimal places. */
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

    public static ProductUpdateParams.PackageDimensions.Builder builder() {
      return new ProductUpdateParams.PackageDimensions.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private BigDecimal height;
      private BigDecimal length;
      private BigDecimal weight;
      private BigDecimal width;

      public ProductUpdateParams.PackageDimensions build() {
        return new ProductUpdateParams.PackageDimensions(
            this.extraParams, this.height, this.length, this.weight, this.width);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ProductUpdateParams.PackageDimensions#extraParams} for the field documentation.
       */
      public ProductUpdateParams.PackageDimensions.Builder putExtraParam(String key, Object value) {

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
      public ProductUpdateParams.PackageDimensions.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Height, in inches. Maximum precision is 2 decimal places. */
      public ProductUpdateParams.PackageDimensions.Builder setHeight(BigDecimal height) {

        this.height = height;
        return this;
      }

      /** Length, in inches. Maximum precision is 2 decimal places. */
      public ProductUpdateParams.PackageDimensions.Builder setLength(BigDecimal length) {

        this.length = length;
        return this;
      }

      /** Weight, in ounces. Maximum precision is 2 decimal places. */
      public ProductUpdateParams.PackageDimensions.Builder setWeight(BigDecimal weight) {

        this.weight = weight;
        return this;
      }

      /** Width, in inches. Maximum precision is 2 decimal places. */
      public ProductUpdateParams.PackageDimensions.Builder setWidth(BigDecimal width) {

        this.width = width;
        return this;
      }
    }
  }
}
