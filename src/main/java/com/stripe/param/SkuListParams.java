package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SkuListParams extends ApiRequestParams {
  /**
   * Only return SKUs that are active or inactive (e.g., pass `false` to list all inactive
   * products).
   */
  @SerializedName("active")
  Boolean active;

  /**
   * Only return SKUs that have the specified key-value pairs in this partially constructed
   * dictionary. Can be specified only if `product` is also supplied. For instance, if the
   * associated product has attributes `["color", "size"]`, passing in `attributes[color]=red`
   * returns all the SKUs for this product that have `color` set to `red`.
   */
  @SerializedName("attributes")
  Map<String, String> attributes;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

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

  /** Only return SKUs with the given IDs. */
  @SerializedName("ids")
  List<String> ids;

  /**
   * Only return SKUs that are either in stock or out of stock (e.g., pass `false` to list all SKUs
   * that are out of stock). If no value is provided, all SKUs are returned.
   */
  @SerializedName("in_stock")
  Boolean inStock;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** The ID of the product whose SKUs will be retrieved. Must be a product with type `good`. */
  @SerializedName("product")
  String product;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private SkuListParams(
      Boolean active,
      Map<String, String> attributes,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      List<String> ids,
      Boolean inStock,
      Long limit,
      String product,
      String startingAfter) {
    this.active = active;
    this.attributes = attributes;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.ids = ids;
    this.inStock = inStock;
    this.limit = limit;
    this.product = product;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Map<String, String> attributes;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<String> ids;

    private Boolean inStock;

    private Long limit;

    private String product;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public SkuListParams build() {
      return new SkuListParams(
          this.active,
          this.attributes,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.ids,
          this.inStock,
          this.limit,
          this.product,
          this.startingAfter);
    }

    /**
     * Only return SKUs that are active or inactive (e.g., pass `false` to list all inactive
     * products).
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add a key/value pair to `attributes` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SkuListParams#attributes} for the field documentation.
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
     * See {@link SkuListParams#attributes} for the field documentation.
     */
    public Builder putAllAttribute(Map<String, String> map) {
      if (this.attributes == null) {
        this.attributes = new HashMap<>();
      }
      this.attributes.putAll(map);
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SkuListParams#expand} for the field documentation.
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
     * SkuListParams#expand} for the field documentation.
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
     * SkuListParams#extraParams} for the field documentation.
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
     * See {@link SkuListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `ids` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link SkuListParams#ids}
     * for the field documentation.
     */
    public Builder addId(String element) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.add(element);
      return this;
    }

    /**
     * Add all elements to `ids` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link SkuListParams#ids}
     * for the field documentation.
     */
    public Builder addAllId(List<String> elements) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.addAll(elements);
      return this;
    }

    /**
     * Only return SKUs that are either in stock or out of stock (e.g., pass `false` to list all
     * SKUs that are out of stock). If no value is provided, all SKUs are returned.
     */
    public Builder setInStock(Boolean inStock) {
      this.inStock = inStock;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** The ID of the product whose SKUs will be retrieved. Must be a product with type `good`. */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }
}
