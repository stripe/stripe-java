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
public class InvoiceItemUpdateParams extends ApiRequestParams {
  /**
   * The integer amount in %s of the charge to be applied to the upcoming invoice. If you want to
   * apply a credit to the customer's account, pass a negative amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * An arbitrary string which you can attach to the invoice item. The description is displayed in
   * the invoice for easy tracking.
   */
  @SerializedName("description")
  Object description;

  /**
   * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
   * negative invoice items, and true for all other invoice items. Cannot be set to true for
   * prorations.
   */
  @SerializedName("discountable")
  Boolean discountable;

  /**
   * The coupons &amp; existing discounts which apply to the invoice item or invoice line item. Item
   * discounts are applied before invoice discounts. Pass an empty string to remove
   * previously-defined discounts.
   */
  @SerializedName("discounts")
  Object discounts;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The period associated with this invoice item. */
  @SerializedName("period")
  Period period;

  /** The ID of the price object. */
  @SerializedName("price")
  Object price;

  /**
   * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
   * inline.
   */
  @SerializedName("price_data")
  PriceData priceData;

  /** Non-negative integer. The quantity of units for the invoice item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
   * tax rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  /**
   * The integer unit amount in %s of the charge to be applied to the upcoming invoice. This
   * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
   * credit to the customer's account, pass a negative unit_amount.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal places.
   * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
   */
  @SerializedName("unit_amount_decimal")
  Object unitAmountDecimal;

  private InvoiceItemUpdateParams(
      Long amount,
      Object description,
      Boolean discountable,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Period period,
      Object price,
      PriceData priceData,
      Long quantity,
      Object taxRates,
      Long unitAmount,
      Object unitAmountDecimal) {
    this.amount = amount;
    this.description = description;
    this.discountable = discountable;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.period = period;
    this.price = price;
    this.priceData = priceData;
    this.quantity = quantity;
    this.taxRates = taxRates;
    this.unitAmount = unitAmount;
    this.unitAmountDecimal = unitAmountDecimal;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Object description;

    private Boolean discountable;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Period period;

    private Object price;

    private PriceData priceData;

    private Long quantity;

    private Object taxRates;

    private Long unitAmount;

    private Object unitAmountDecimal;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceItemUpdateParams build() {
      return new InvoiceItemUpdateParams(
          this.amount,
          this.description,
          this.discountable,
          this.discounts,
          this.expand,
          this.extraParams,
          this.metadata,
          this.period,
          this.price,
          this.priceData,
          this.quantity,
          this.taxRates,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in %s of the charge to be applied to the upcoming invoice. If you want to
     * apply a credit to the customer's account, pass a negative amount.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in
     * the invoice for easy tracking.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in
     * the invoice for easy tracking.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
     * negative invoice items, and true for all other invoice items. Cannot be set to true for
     * prorations.
     */
    public Builder setDiscountable(Boolean discountable) {
      this.discountable = discountable;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceItemUpdateParams.Discount>();
      }
      ((List<InvoiceItemUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceItemUpdateParams.Discount>();
      }
      ((List<InvoiceItemUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons &amp; existing discounts which apply to the invoice item or invoice line item.
     * Item discounts are applied before invoice discounts. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons &amp; existing discounts which apply to the invoice item or invoice line item.
     * Item discounts are applied before invoice discounts. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(List<Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#expand} for the field documentation.
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
     * InvoiceItemUpdateParams#expand} for the field documentation.
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
     * InvoiceItemUpdateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceItemUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceItemUpdateParams#metadata} for the field documentation.
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
     * See {@link InvoiceItemUpdateParams#metadata} for the field documentation.
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

    /** The period associated with this invoice item. */
    public Builder setPeriod(Period period) {
      this.period = period;
      return this;
    }

    /** The ID of the price object. */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /** The ID of the price object. */
    public Builder setPrice(EmptyParam price) {
      this.price = price;
      return this;
    }

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline.
     */
    public Builder setPriceData(PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /** Non-negative integer. The quantity of units for the invoice item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#taxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addTaxRate(String element) {
      if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
        this.taxRates = new ArrayList<String>();
      }
      ((List<String>) this.taxRates).add(element);
      return this;
    }

    /**
     * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#taxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllTaxRate(List<String> elements) {
      if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
        this.taxRates = new ArrayList<String>();
      }
      ((List<String>) this.taxRates).addAll(elements);
      return this;
    }

    /**
     * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
     * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
     * tax rates.
     */
    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
     * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
     * tax rates.
     */
    public Builder setTaxRates(List<String> taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * The integer unit amount in %s of the charge to be applied to the upcoming invoice. This
     * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
     * credit to the customer's account, pass a negative unit_amount.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
     * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
     * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }
  }

  @Getter
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    Object coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    Object discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Discount build() {
        return new Discount(this.coupon, this.discount, this.extraParams);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(EmptyParam coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(EmptyParam discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemUpdateParams.Discount#extraParams} for the field documentation.
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
       * See {@link InvoiceItemUpdateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Period {
    /** The end of the period, which must be greater than or equal to the start. */
    @SerializedName("end")
    Long end;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The start of the period. */
    @SerializedName("start")
    Long start;

    private Period(Long end, Map<String, Object> extraParams, Long start) {
      this.end = end;
      this.extraParams = extraParams;
      this.start = start;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long end;

      private Map<String, Object> extraParams;

      private Long start;

      /** Finalize and obtain parameter instance from this builder. */
      public Period build() {
        return new Period(this.end, this.extraParams, this.start);
      }

      /** The end of the period, which must be greater than or equal to the start. */
      public Builder setEnd(Long end) {
        this.end = end;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemUpdateParams.Period#extraParams} for the field documentation.
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
       * See {@link InvoiceItemUpdateParams.Period#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The start of the period. */
      public Builder setStart(Long start) {
        this.start = start;
        return this;
      }
    }
  }

  @Getter
  public static class PriceData {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    Object currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the product that this price will belong to. */
    @SerializedName("product")
    Object product;

    /**
     * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
     * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code
     * inclusive} or {@code exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
     * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    @SerializedName("unit_amount_decimal")
    Object unitAmountDecimal;

    private PriceData(
        Object currency,
        Map<String, Object> extraParams,
        Object product,
        TaxBehavior taxBehavior,
        Long unitAmount,
        Object unitAmountDecimal) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.product = product;
      this.taxBehavior = taxBehavior;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object currency;

      private Map<String, Object> extraParams;

      private Object product;

      private TaxBehavior taxBehavior;

      private Long unitAmount;

      private Object unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public PriceData build() {
        return new PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.taxBehavior,
            this.unitAmount,
            this.unitAmountDecimal);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemUpdateParams.PriceData#extraParams} for the field documentation.
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
       * See {@link InvoiceItemUpdateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the product that this price will belong to. */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /** The ID of the product that this price will belong to. */
      public Builder setProduct(EmptyParam product) {
        this.product = product;
        return this;
      }

      /**
       * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
       * {@code inclusive} or {@code exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
       * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
       * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive"),

      @SerializedName("unspecified")
      UNSPECIFIED("unspecified");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }
}
