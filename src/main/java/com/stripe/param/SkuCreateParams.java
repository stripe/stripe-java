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
public class SkuCreateParams extends ApiRequestParams {
  /** Whether the SKU is available for purchase. Default to `true`. */
  @SerializedName("active")
  Boolean active;

  /**
   * A dictionary of attributes and values for the attributes defined by the product. If, for
   * example, a product's attributes are `["size", "gender"]`, a valid SKU has the following
   * dictionary of attributes: `{"size": "Medium", "gender": "Unisex"}`.
   */
  @SerializedName("attributes")
  Map<String, String> attributes;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

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

  /**
   * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly
   * generated.
   */
  @SerializedName("id")
  String id;

  /** The URL of an image for this SKU, meant to be displayable to the customer. */
  @SerializedName("image")
  String image;

  /** Description of the SKU's inventory. */
  @SerializedName("inventory")
  Inventory inventory;

  /**
   * A set of key-value pairs that you can attach to a SKU object. It can be useful for storing
   * additional information about the SKU in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The dimensions of this SKU for shipping purposes. */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /**
   * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents
   * to charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
   */
  @SerializedName("price")
  Long price;

  /** The ID of the product this SKU is associated with. Must be a product with type `good`. */
  @SerializedName("product")
  String product;

  private SkuCreateParams(
      Boolean active,
      Map<String, String> attributes,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      String id,
      String image,
      Inventory inventory,
      Map<String, String> metadata,
      PackageDimensions packageDimensions,
      Long price,
      String product) {
    this.active = active;
    this.attributes = attributes;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.id = id;
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

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String id;

    private String image;

    private Inventory inventory;

    private Map<String, String> metadata;

    private PackageDimensions packageDimensions;

    private Long price;

    private String product;

    /** Finalize and obtain parameter instance from this builder. */
    public SkuCreateParams build() {
      return new SkuCreateParams(
          this.active,
          this.attributes,
          this.currency,
          this.expand,
          this.extraParams,
          this.id,
          this.image,
          this.inventory,
          this.metadata,
          this.packageDimensions,
          this.price,
          this.product);
    }

    /** Whether the SKU is available for purchase. Default to `true`. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add a key/value pair to `attributes` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SkuCreateParams#attributes} for the field documentation.
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
     * See {@link SkuCreateParams#attributes} for the field documentation.
     */
    public Builder putAllAttribute(Map<String, String> map) {
      if (this.attributes == null) {
        this.attributes = new HashMap<>();
      }
      this.attributes.putAll(map);
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SkuCreateParams#expand} for the field documentation.
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
     * SkuCreateParams#expand} for the field documentation.
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
     * SkuCreateParams#extraParams} for the field documentation.
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
     * See {@link SkuCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly
     * generated.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** The URL of an image for this SKU, meant to be displayable to the customer. */
    public Builder setImage(String image) {
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
     * SkuCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SkuCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The dimensions of this SKU for shipping purposes. */
    public Builder setPackageDimensions(PackageDimensions packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /**
     * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100
     * cents to charge $1.00, or 100 to charge ¥100, Japanese Yen being a zero-decimal currency).
     */
    public Builder setPrice(Long price) {
      this.price = price;
      return this;
    }

    /** The ID of the product this SKU is associated with. Must be a product with type `good`. */
    public Builder setProduct(String product) {
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

    /** The count of inventory available. Required if `type` is `finite`. */
    @SerializedName("quantity")
    Long quantity;

    /** Inventory type. Possible values are `finite`, `bucket` (not quantified), and `infinite`. */
    @SerializedName("type")
    Type type;

    /**
     * An indicator of the inventory available. Possible values are `in_stock`, `limited`, and
     * `out_of_stock`. Will be present if and only if `type` is `bucket`.
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
       * SkuCreateParams.Inventory#extraParams} for the field documentation.
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
       * See {@link SkuCreateParams.Inventory#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The count of inventory available. Required if `type` is `finite`. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Inventory type. Possible values are `finite`, `bucket` (not quantified), and `infinite`.
       */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }

      /**
       * An indicator of the inventory available. Possible values are `in_stock`, `limited`, and
       * `out_of_stock`. Will be present if and only if `type` is `bucket`.
       */
      public Builder setValue(Value value) {
        this.value = value;
        return this;
      }

      /**
       * An indicator of the inventory available. Possible values are `in_stock`, `limited`, and
       * `out_of_stock`. Will be present if and only if `type` is `bucket`.
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
       * SkuCreateParams.PackageDimensions#extraParams} for the field documentation.
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
       * See {@link SkuCreateParams.PackageDimensions#extraParams} for the field documentation.
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
