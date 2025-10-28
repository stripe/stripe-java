// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ReaderSetReaderDisplayParams extends ApiRequestParams {
  /** Cart details to display on the reader screen, including line items, amounts, and currency. */
  @SerializedName("cart")
  Cart cart;

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
   * <strong>Required.</strong> Type of information to display. Only {@code cart} is currently
   * supported.
   */
  @SerializedName("type")
  Type type;

  private ReaderSetReaderDisplayParams(
      Cart cart, List<String> expand, Map<String, Object> extraParams, Type type) {
    this.cart = cart;
    this.expand = expand;
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Cart cart;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderSetReaderDisplayParams build() {
      return new ReaderSetReaderDisplayParams(this.cart, this.expand, this.extraParams, this.type);
    }

    /**
     * Cart details to display on the reader screen, including line items, amounts, and currency.
     */
    public Builder setCart(ReaderSetReaderDisplayParams.Cart cart) {
      this.cart = cart;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderSetReaderDisplayParams#expand} for the field documentation.
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
     * ReaderSetReaderDisplayParams#expand} for the field documentation.
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
     * ReaderSetReaderDisplayParams#extraParams} for the field documentation.
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
     * See {@link ReaderSetReaderDisplayParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Type of information to display. Only {@code cart} is currently
     * supported.
     */
    public Builder setType(ReaderSetReaderDisplayParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Cart {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Array of line items to display. */
    @SerializedName("line_items")
    List<ReaderSetReaderDisplayParams.Cart.LineItem> lineItems;

    /**
     * The amount of tax in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a>.
     */
    @SerializedName("tax")
    Long tax;

    /**
     * <strong>Required.</strong> Total balance of cart due in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    @SerializedName("total")
    Long total;

    private Cart(
        String currency,
        Map<String, Object> extraParams,
        List<ReaderSetReaderDisplayParams.Cart.LineItem> lineItems,
        Long tax,
        Long total) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.lineItems = lineItems;
      this.tax = tax;
      this.total = total;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private List<ReaderSetReaderDisplayParams.Cart.LineItem> lineItems;

      private Long tax;

      private Long total;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderSetReaderDisplayParams.Cart build() {
        return new ReaderSetReaderDisplayParams.Cart(
            this.currency, this.extraParams, this.lineItems, this.tax, this.total);
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderSetReaderDisplayParams.Cart#extraParams} for the field documentation.
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
       * See {@link ReaderSetReaderDisplayParams.Cart#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReaderSetReaderDisplayParams.Cart#lineItems} for the field documentation.
       */
      public Builder addLineItem(ReaderSetReaderDisplayParams.Cart.LineItem element) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ReaderSetReaderDisplayParams.Cart#lineItems} for the field documentation.
       */
      public Builder addAllLineItem(List<ReaderSetReaderDisplayParams.Cart.LineItem> elements) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(elements);
        return this;
      }

      /**
       * The amount of tax in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
       * currency unit</a>.
       */
      public Builder setTax(Long tax) {
        this.tax = tax;
        return this;
      }

      /**
       * <strong>Required.</strong> Total balance of cart due in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
      public Builder setTotal(Long total) {
        this.total = total;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem {
      /**
       * <strong>Required.</strong> The price of the item in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /** <strong>Required.</strong> The description or name of the item. */
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The quantity of the line item being purchased. */
      @SerializedName("quantity")
      Long quantity;

      private LineItem(
          Long amount, String description, Map<String, Object> extraParams, Long quantity) {
        this.amount = amount;
        this.description = description;
        this.extraParams = extraParams;
        this.quantity = quantity;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String description;

        private Map<String, Object> extraParams;

        private Long quantity;

        /** Finalize and obtain parameter instance from this builder. */
        public ReaderSetReaderDisplayParams.Cart.LineItem build() {
          return new ReaderSetReaderDisplayParams.Cart.LineItem(
              this.amount, this.description, this.extraParams, this.quantity);
        }

        /**
         * <strong>Required.</strong> The price of the item in the <a
         * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /** <strong>Required.</strong> The description or name of the item. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderSetReaderDisplayParams.Cart.LineItem#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderSetReaderDisplayParams.Cart.LineItem#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The quantity of the line item being purchased. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("cart")
    CART("cart");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
