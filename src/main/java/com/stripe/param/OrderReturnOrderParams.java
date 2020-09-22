// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OrderReturnOrderParams extends ApiRequestParams {
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

  /** List of items to return. */
  @SerializedName("items")
  Object items;

  private OrderReturnOrderParams(
      List<String> expand, Map<String, Object> extraParams, Object items) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.items = items;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object items;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderReturnOrderParams build() {
      return new OrderReturnOrderParams(this.expand, this.extraParams, this.items);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderReturnOrderParams#expand} for the field documentation.
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
     * OrderReturnOrderParams#expand} for the field documentation.
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
     * OrderReturnOrderParams#extraParams} for the field documentation.
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
     * See {@link OrderReturnOrderParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderReturnOrderParams#items} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addItem(Item element) {
      if (this.items == null || this.items instanceof EmptyParam) {
        this.items = new ArrayList<OrderReturnOrderParams.Item>();
      }
      ((List<OrderReturnOrderParams.Item>) this.items).add(element);
      return this;
    }

    /**
     * Add all elements to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderReturnOrderParams#items} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllItem(List<Item> elements) {
      if (this.items == null || this.items instanceof EmptyParam) {
        this.items = new ArrayList<OrderReturnOrderParams.Item>();
      }
      ((List<OrderReturnOrderParams.Item>) this.items).addAll(elements);
      return this;
    }

    /** List of items to return. */
    public Builder setItems(EmptyParam items) {
      this.items = items;
      return this;
    }

    /** List of items to return. */
    public Builder setItems(List<Item> items) {
      this.items = items;
      return this;
    }
  }

  @Getter
  public static class Item {
    /** The amount (price) for this order item to return. */
    @SerializedName("amount")
    Long amount;

    /** If returning a {@code tax} item, use description to disambiguate which one to return. */
    @SerializedName("description")
    String description;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the SKU, tax, or shipping item being returned. */
    @SerializedName("parent")
    String parent;

    /** When type is {@code sku}, this is the number of instances of the SKU to be returned. */
    @SerializedName("quantity")
    Long quantity;

    /** The type of this order item. Must be {@code sku}, {@code tax}, or {@code shipping}. */
    @SerializedName("type")
    Type type;

    private Item(
        Long amount,
        String description,
        Map<String, Object> extraParams,
        String parent,
        Long quantity,
        Type type) {
      this.amount = amount;
      this.description = description;
      this.extraParams = extraParams;
      this.parent = parent;
      this.quantity = quantity;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String description;

      private Map<String, Object> extraParams;

      private String parent;

      private Long quantity;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public Item build() {
        return new Item(
            this.amount, this.description, this.extraParams, this.parent, this.quantity, this.type);
      }

      /** The amount (price) for this order item to return. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** If returning a {@code tax} item, use description to disambiguate which one to return. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderReturnOrderParams.Item#extraParams} for the field documentation.
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
       * See {@link OrderReturnOrderParams.Item#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the SKU, tax, or shipping item being returned. */
      public Builder setParent(String parent) {
        this.parent = parent;
        return this;
      }

      /** When type is {@code sku}, this is the number of instances of the SKU to be returned. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /** The type of this order item. Must be {@code sku}, {@code tax}, or {@code shipping}. */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("discount")
      DISCOUNT("discount"),

      @SerializedName("shipping")
      SHIPPING("shipping"),

      @SerializedName("sku")
      SKU("sku"),

      @SerializedName("tax")
      TAX("tax");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
