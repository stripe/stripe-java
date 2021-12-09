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
import lombok.Getter;

@Getter
public class ProductUpdateParams extends ApiRequestParams {
  /** Whether the product is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g., {@code
   * ["color", "size"]}). If a value for {@code attributes} is specified, the list specified will
   * replace the existing attributes list on this product. Any attributes not present after the
   * update will be deleted from the SKUs for this product.
   */
  @SerializedName("attributes")
  Object attributes;

  /**
   * A short one-line description of the product, meant to be displayable to the customer. May only
   * be set if {@code type=good}.
   */
  @SerializedName("caption")
  Object caption;

  /**
   * An array of Connect application names or identifiers that should not be able to order the SKUs
   * for this product. May only be set if {@code type=good}.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * The product's name, meant to be displayable to the customer. Whenever this product is sold via
   * a subscription, name will show up on associated invoice line item descriptions.
   */
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
   * letter. May only be set if {@code type=service}.
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /** A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. */
  @SerializedName("tax_code")
  Object taxCode;

  /**
   * A label that represents units of this product in Stripe and on customers’ receipts and
   * invoices. When set, this will be included in associated invoice line item descriptions. May
   * only be set if {@code type=service}.
   */
  @SerializedName("unit_label")
  Object unitLabel;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  Object url;

  private ProductUpdateParams(
      Boolean active,
      Object attributes,
      Object caption,
      List<String> deactivateOn,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      Object images,
      Object metadata,
      Object name,
      Object packageDimensions,
      Boolean shippable,
      Object statementDescriptor,
      Object taxCode,
      Object unitLabel,
      Object url) {
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
    this.taxCode = taxCode;
    this.unitLabel = unitLabel;
    this.url = url;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object attributes;

    private Object caption;

    private List<String> deactivateOn;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object images;

    private Object metadata;

    private Object name;

    private Object packageDimensions;

    private Boolean shippable;

    private Object statementDescriptor;

    private Object taxCode;

    private Object unitLabel;

    private Object url;

    /** Finalize and obtain parameter instance from this builder. */
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
          this.taxCode,
          this.unitLabel,
          this.url);
    }

    /** Whether the product is available for purchase. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#attributes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAttribute(String element) {
      if (this.attributes == null || this.attributes instanceof EmptyParam) {
        this.attributes = new ArrayList<String>();
      }
      ((List<String>) this.attributes).add(element);
      return this;
    }

    /**
     * Add all elements to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#attributes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllAttribute(List<String> elements) {
      if (this.attributes == null || this.attributes instanceof EmptyParam) {
        this.attributes = new ArrayList<String>();
      }
      ((List<String>) this.attributes).addAll(elements);
      return this;
    }

    /**
     * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g., {@code
     * ["color", "size"]}). If a value for {@code attributes} is specified, the list specified will
     * replace the existing attributes list on this product. Any attributes not present after the
     * update will be deleted from the SKUs for this product.
     */
    public Builder setAttributes(EmptyParam attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g., {@code
     * ["color", "size"]}). If a value for {@code attributes} is specified, the list specified will
     * replace the existing attributes list on this product. Any attributes not present after the
     * update will be deleted from the SKUs for this product.
     */
    public Builder setAttributes(List<String> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * A short one-line description of the product, meant to be displayable to the customer. May
     * only be set if {@code type=good}.
     */
    public Builder setCaption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     * A short one-line description of the product, meant to be displayable to the customer. May
     * only be set if {@code type=good}.
     */
    public Builder setCaption(EmptyParam caption) {
      this.caption = caption;
      return this;
    }

    /**
     * Add an element to `deactivateOn` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#deactivateOn} for the field documentation.
     */
    public Builder addDeactivateOn(String element) {
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
    public Builder addAllDeactivateOn(List<String> elements) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.addAll(elements);
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * The product's name, meant to be displayable to the customer. Whenever this product is sold
     * via a subscription, name will show up on associated invoice line item descriptions.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The product's name, meant to be displayable to the customer. Whenever this product is sold
     * via a subscription, name will show up on associated invoice line item descriptions.
     */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /** The dimensions of this product for shipping purposes. */
    public Builder setPackageDimensions(PackageDimensions packageDimensions) {
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
     * contain at least one letter. May only be set if {@code type=service}.
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
     * contain at least one letter. May only be set if {@code type=service}.
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /** A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. */
    public Builder setTaxCode(EmptyParam taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * A label that represents units of this product in Stripe and on customers’ receipts and
     * invoices. When set, this will be included in associated invoice line item descriptions. May
     * only be set if {@code type=service}.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /**
     * A label that represents units of this product in Stripe and on customers’ receipts and
     * invoices. When set, this will be included in associated invoice line item descriptions. May
     * only be set if {@code type=service}.
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
      public PackageDimensions build() {
        return new PackageDimensions(
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

      /** Height, in inches. Maximum precision is 2 decimal places. */
      public Builder setHeight(BigDecimal height) {
        this.height = height;
        return this;
      }

      /** Length, in inches. Maximum precision is 2 decimal places. */
      public Builder setLength(BigDecimal length) {
        this.length = length;
        return this;
      }

      /** Weight, in ounces. Maximum precision is 2 decimal places. */
      public Builder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
      }

      /** Width, in inches. Maximum precision is 2 decimal places. */
      public Builder setWidth(BigDecimal width) {
        this.width = width;
        return this;
      }
    }
  }
}
