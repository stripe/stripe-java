// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SkuUpdateParams extends ApiRequestParams {
  /** Whether this SKU is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A dictionary of attributes and values for the attributes defined by the product. When
   * specified, {@code attributes} will partially update the existing attributes dictionary on the
   * product, with the postcondition that a value must be present for each attribute key on the
   * product.
   */
  @SerializedName("attributes")
  Map<String, String> attributes;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  Object currency;

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

  /** The URL of an image for this SKU, meant to be displayable to the customer. */
  @SerializedName("image")
  Object image;

  /** Description of the SKU's inventory. */
  @SerializedName("inventory")
  Inventory inventory;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The dimensions of this SKU for shipping purposes. */
  @SerializedName("package_dimensions")
  Object packageDimensions;

  /**
   * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents to
   * charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
   */
  @SerializedName("price")
  Long price;

  /**
   * The ID of the product that this SKU should belong to. The product must exist, have the same set
   * of attribute names as the SKU's current product, and be of type {@code good}.
   */
  @SerializedName("product")
  Object product;

  private SkuUpdateParams(
      Boolean active,
      Map<String, String> attributes,
      Object currency,
      List<String> expand,
      Map<String, Object> extraParams,
      Object image,
      Inventory inventory,
      Object metadata,
      Object packageDimensions,
      Long price,
      Object product) {
    this.active = active;
    this.attributes = attributes;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.image = image;
    this.inventory = inventory;
    this.metadata = metadata;
    this.packageDimensions = packageDimensions;
    this.price = price;
    this.product = product;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Map<String, String> attributes;

    private Object currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object image;

    private Inventory inventory;

    private Object metadata;

    private Object packageDimensions;

    private Long price;

    private Object product;

    /** Finalize and obtain parameter instance from this builder. */
    public SkuUpdateParams build() {
      return new SkuUpdateParams(
          this.active,
          this.attributes,
          this.currency,
          this.expand,
          this.extraParams,
          this.image,
          this.inventory,
          this.metadata,
          this.packageDimensions,
          this.price,
          this.product);
    }

    /** Whether this SKU is available for purchase. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add a key/value pair to `attributes` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SkuUpdateParams#attributes} for the field documentation.
     */
    public Builder putAttribute(String key, String value) {
      if (this.attributes == null) {
        this.attributes = new HashMap<>();
      }
      this.attributes.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `attributes` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SkuUpdateParams#attributes} for the field documentation.
     */
    public Builder putAllAttribute(Map<String, String> map) {
      if (this.attributes == null) {
        this.attributes = new HashMap<>();
      }
      this.attributes.putAll(map);
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(EmptyParam currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SkuUpdateParams#expand} for the field documentation.
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
     * SkuUpdateParams#expand} for the field documentation.
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
     * SkuUpdateParams#extraParams} for the field documentation.
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
     * See {@link SkuUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The URL of an image for this SKU, meant to be displayable to the customer. */
    public Builder setImage(String image) {
      this.image = image;
      return this;
    }

    /** The URL of an image for this SKU, meant to be displayable to the customer. */
    public Builder setImage(EmptyParam image) {
      this.image = image;
      return this;
    }

    /** Description of the SKU's inventory. */
    public Builder setInventory(Inventory inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SkuUpdateParams#metadata} for the field documentation.
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
     * See {@link SkuUpdateParams#metadata} for the field documentation.
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

    /** The dimensions of this SKU for shipping purposes. */
    public Builder setPackageDimensions(PackageDimensions packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /** The dimensions of this SKU for shipping purposes. */
    public Builder setPackageDimensions(EmptyParam packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /**
     * The cost of the item as a positive integer in the smallest currency unit (that is, 100 cents
     * to charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
     */
    public Builder setPrice(Long price) {
      this.price = price;
      return this;
    }

    /**
     * The ID of the product that this SKU should belong to. The product must exist, have the same
     * set of attribute names as the SKU's current product, and be of type {@code good}.
     */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /**
     * The ID of the product that this SKU should belong to. The product must exist, have the same
     * set of attribute names as the SKU's current product, and be of type {@code good}.
     */
    public Builder setProduct(EmptyParam product) {
      this.product = product;
      return this;
    }
  }

  @Getter
  public static class Inventory {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The count of inventory available. Required if {@code type} is {@code finite}. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * Inventory type. Possible values are {@code finite}, {@code bucket} (not quantified), and
     * {@code infinite}.
     */
    @SerializedName("type")
    Type type;

    /**
     * An indicator of the inventory available. Possible values are {@code in_stock}, {@code
     * limited}, and {@code out_of_stock}. Will be present if and only if {@code type} is {@code
     * bucket}.
     */
    @SerializedName("value")
    EnumParam value;

    private Inventory(Map<String, Object> extraParams, Long quantity, Type type, EnumParam value) {
      this.extraParams = extraParams;
      this.quantity = quantity;
      this.type = type;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long quantity;

      private Type type;

      private EnumParam value;

      /** Finalize and obtain parameter instance from this builder. */
      public Inventory build() {
        return new Inventory(this.extraParams, this.quantity, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SkuUpdateParams.Inventory#extraParams} for the field documentation.
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
       * See {@link SkuUpdateParams.Inventory#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The count of inventory available. Required if {@code type} is {@code finite}. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Inventory type. Possible values are {@code finite}, {@code bucket} (not quantified), and
       * {@code infinite}.
       */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }

      /**
       * An indicator of the inventory available. Possible values are {@code in_stock}, {@code
       * limited}, and {@code out_of_stock}. Will be present if and only if {@code type} is {@code
       * bucket}.
       */
      public Builder setValue(Value value) {
        this.value = value;
        return this;
      }

      /**
       * An indicator of the inventory available. Possible values are {@code in_stock}, {@code
       * limited}, and {@code out_of_stock}. Will be present if and only if {@code type} is {@code
       * bucket}.
       */
      public Builder setValue(EmptyParam value) {
        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("bucket")
      BUCKET("bucket"),

      @SerializedName("finite")
      FINITE("finite"),

      @SerializedName("infinite")
      INFINITE("infinite");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }

    public enum Value implements ApiRequestParams.EnumParam {
      @SerializedName("in_stock")
      IN_STOCK("in_stock"),

      @SerializedName("limited")
      LIMITED("limited"),

      @SerializedName("out_of_stock")
      OUT_OF_STOCK("out_of_stock");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Value(String value) {
        this.value = value;
      }
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
       * SkuUpdateParams.PackageDimensions#extraParams} for the field documentation.
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
       * See {@link SkuUpdateParams.PackageDimensions#extraParams} for the field documentation.
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
