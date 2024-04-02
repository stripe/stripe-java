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
   * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming
   * invoice. If you want to apply a credit to the customer's account, pass a negative amount.
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
   * The coupons, promotion codes &amp; existing discounts which apply to the invoice item or
   * invoice line item. Item discounts are applied before invoice discounts. Pass an empty string to
   * remove previously-defined discounts.
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
   * The ids of the margins to apply to the invoice item. When set, the {@code default_margins} on
   * the invoice do not apply to this invoice item.
   */
  @SerializedName("margins")
  Object margins;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * The period associated with this invoice item. When set to different values, the period will be
   * rendered on the invoice. If you have <a
   * href="https://stripe.com/docs/revenue-recognition">Stripe Revenue Recognition</a> enabled, the
   * period will be used to recognize and defer revenue. See the <a
   * href="https://stripe.com/docs/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
   * Recognition documentation</a> for details.
   */
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
   * Only required if a <a
   * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
   * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
   * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
   * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
   * exclusive}, it cannot be changed.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
  @SerializedName("tax_code")
  Object taxCode;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
   * tax rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  /**
   * The integer unit amount in cents (or local equivalent) of the charge to be applied to the
   * upcoming invoice. This unit_amount will be multiplied by the quantity to get the full amount.
   * If you want to apply a credit to the customer's account, pass a negative unit_amount.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with at
   * most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be
   * set.
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
      Object margins,
      Object metadata,
      Period period,
      Object price,
      PriceData priceData,
      Long quantity,
      TaxBehavior taxBehavior,
      Object taxCode,
      Object taxRates,
      Long unitAmount,
      Object unitAmountDecimal) {
    this.amount = amount;
    this.description = description;
    this.discountable = discountable;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.margins = margins;
    this.metadata = metadata;
    this.period = period;
    this.price = price;
    this.priceData = priceData;
    this.quantity = quantity;
    this.taxBehavior = taxBehavior;
    this.taxCode = taxCode;
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

    private Object margins;

    private Object metadata;

    private Period period;

    private Object price;

    private PriceData priceData;

    private Long quantity;

    private TaxBehavior taxBehavior;

    private Object taxCode;

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
          this.margins,
          this.metadata,
          this.period,
          this.price,
          this.priceData,
          this.quantity,
          this.taxBehavior,
          this.taxCode,
          this.taxRates,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming
     * invoice. If you want to apply a credit to the customer's account, pass a negative amount.
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
    public Builder addDiscount(InvoiceItemUpdateParams.Discount element) {
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
    public Builder addAllDiscount(List<InvoiceItemUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceItemUpdateParams.Discount>();
      }
      ((List<InvoiceItemUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons, promotion codes &amp; existing discounts which apply to the invoice item or
     * invoice line item. Item discounts are applied before invoice discounts. Pass an empty string
     * to remove previously-defined discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons, promotion codes &amp; existing discounts which apply to the invoice item or
     * invoice line item. Item discounts are applied before invoice discounts. Pass an empty string
     * to remove previously-defined discounts.
     */
    public Builder setDiscounts(List<InvoiceItemUpdateParams.Discount> discounts) {
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
     * Add an element to `margins` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#margins} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addMargin(String element) {
      if (this.margins == null || this.margins instanceof EmptyParam) {
        this.margins = new ArrayList<String>();
      }
      ((List<String>) this.margins).add(element);
      return this;
    }

    /**
     * Add all elements to `margins` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemUpdateParams#margins} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllMargin(List<String> elements) {
      if (this.margins == null || this.margins instanceof EmptyParam) {
        this.margins = new ArrayList<String>();
      }
      ((List<String>) this.margins).addAll(elements);
      return this;
    }

    /**
     * The ids of the margins to apply to the invoice item. When set, the {@code default_margins} on
     * the invoice do not apply to this invoice item.
     */
    public Builder setMargins(EmptyParam margins) {
      this.margins = margins;
      return this;
    }

    /**
     * The ids of the margins to apply to the invoice item. When set, the {@code default_margins} on
     * the invoice do not apply to this invoice item.
     */
    public Builder setMargins(List<String> margins) {
      this.margins = margins;
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

    /**
     * The period associated with this invoice item. When set to different values, the period will
     * be rendered on the invoice. If you have <a
     * href="https://stripe.com/docs/revenue-recognition">Stripe Revenue Recognition</a> enabled,
     * the period will be used to recognize and defer revenue. See the <a
     * href="https://stripe.com/docs/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
     * Recognition documentation</a> for details.
     */
    public Builder setPeriod(InvoiceItemUpdateParams.Period period) {
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
    public Builder setPriceData(InvoiceItemUpdateParams.PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /** Non-negative integer. The quantity of units for the invoice item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    public Builder setTaxBehavior(InvoiceItemUpdateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(EmptyParam taxCode) {
      this.taxCode = taxCode;
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
     * The integer unit amount in cents (or local equivalent) of the charge to be applied to the
     * upcoming invoice. This unit_amount will be multiplied by the quantity to get the full amount.
     * If you want to apply a credit to the customer's account, pass a negative unit_amount.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
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

    /** Details to determine how long the discount should be applied for. */
    @SerializedName("discount_end")
    DiscountEnd discountEnd;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    Object promotionCode;

    private Discount(
        Object coupon,
        Object discount,
        DiscountEnd discountEnd,
        Map<String, Object> extraParams,
        Object promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.discountEnd = discountEnd;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private DiscountEnd discountEnd;

      private Map<String, Object> extraParams;

      private Object promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceItemUpdateParams.Discount build() {
        return new InvoiceItemUpdateParams.Discount(
            this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
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

      /** Details to determine how long the discount should be applied for. */
      public Builder setDiscountEnd(InvoiceItemUpdateParams.Discount.DiscountEnd discountEnd) {
        this.discountEnd = discountEnd;
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

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(EmptyParam promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }

    @Getter
    public static class DiscountEnd {
      /** Time span for the redeemed discount. */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A precise Unix timestamp for the discount to end. Must be in the future. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> The type of calculation made to determine when the discount
       * ends.
       */
      @SerializedName("type")
      Type type;

      private DiscountEnd(
          Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceItemUpdateParams.Discount.DiscountEnd build() {
          return new InvoiceItemUpdateParams.Discount.DiscountEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the redeemed discount. */
        public Builder setDuration(InvoiceItemUpdateParams.Discount.DiscountEnd.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceItemUpdateParams.Discount.DiscountEnd#extraParams} for the field
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
         * map. See {@link InvoiceItemUpdateParams.Discount.DiscountEnd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        public Builder setType(InvoiceItemUpdateParams.Discount.DiscountEnd.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Duration {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
         * Stripe multiplies this by the interval type to get the overall duration.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceItemUpdateParams.Discount.DiscountEnd.Duration build() {
            return new InvoiceItemUpdateParams.Discount.DiscountEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceItemUpdateParams.Discount.DiscountEnd.Duration#extraParams} for
           * the field documentation.
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
           * map. See {@link InvoiceItemUpdateParams.Discount.DiscountEnd.Duration#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              InvoiceItemUpdateParams.Discount.DiscountEnd.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Period {
    /**
     * <strong>Required.</strong> The end of the period, which must be greater than or equal to the
     * start. This value is inclusive.
     */
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

    /** <strong>Required.</strong> The start of the period. This value is inclusive. */
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
      public InvoiceItemUpdateParams.Period build() {
        return new InvoiceItemUpdateParams.Period(this.end, this.extraParams, this.start);
      }

      /**
       * <strong>Required.</strong> The end of the period, which must be greater than or equal to
       * the start. This value is inclusive.
       */
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

      /** <strong>Required.</strong> The start of the period. This value is inclusive. */
      public Builder setStart(Long start) {
        this.start = start;
        return this;
      }
    }
  }

  @Getter
  public static class PriceData {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

    /** <strong>Required.</strong> The ID of the product that this price will belong to. */
    @SerializedName("product")
    Object product;

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /**
     * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
     * much to charge.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
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
      public InvoiceItemUpdateParams.PriceData build() {
        return new InvoiceItemUpdateParams.PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.taxBehavior,
            this.unitAmount,
            this.unitAmountDecimal);
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
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      public Builder setProduct(EmptyParam product) {
        this.product = product;
        return this;
      }

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(InvoiceItemUpdateParams.PriceData.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
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
