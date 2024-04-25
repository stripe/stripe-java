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
public class InvoiceLineItemUpdateParams extends ApiRequestParams {
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
   * Controls whether discounts apply to this line item. Defaults to false for prorations or
   * negative line items, and true for all other line items. Cannot be set to true for prorations.
   */
  @SerializedName("discountable")
  Boolean discountable;

  /**
   * The coupons, promotion codes &amp; existing discounts which apply to the line item. Item
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
   * be unset by posting an empty value to {@code metadata}. For {@code type=recurring} line items,
   * the incoming metadata specified on the request is directly used to set this value, in contrast
   * to {@code type=invoiceitem} line items, where any existing metadata on the invoice line is
   * merged with the incoming data.
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

  /** Non-negative integer. The quantity of units for the line item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * A list of up to 10 tax amounts for this line item. This can be useful if you calculate taxes on
   * your own or use a third-party to calculate them. You cannot set tax amounts if any line item
   * has <a
   * href="https://stripe.com/docs/api/invoices/line_item#invoice_line_item_object-tax_rates">tax_rates</a>
   * or if the invoice has <a
   * href="https://stripe.com/docs/api/invoices/object#invoice_object-default_tax_rates">default_tax_rates</a>
   * or uses <a href="https://stripe.com/docs/tax/invoicing">automatic tax</a>. Pass an empty string
   * to remove previously defined tax amounts.
   */
  @SerializedName("tax_amounts")
  Object taxAmounts;

  /**
   * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this line item. Pass an empty string to remove previously-defined tax
   * rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  private InvoiceLineItemUpdateParams(
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
      Object taxAmounts,
      Object taxRates) {
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
    this.taxAmounts = taxAmounts;
    this.taxRates = taxRates;
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

    private Object taxAmounts;

    private Object taxRates;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceLineItemUpdateParams build() {
      return new InvoiceLineItemUpdateParams(
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
          this.taxAmounts,
          this.taxRates);
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
     * Controls whether discounts apply to this line item. Defaults to false for prorations or
     * negative line items, and true for all other line items. Cannot be set to true for prorations.
     */
    public Builder setDiscountable(Boolean discountable) {
      this.discountable = discountable;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(InvoiceLineItemUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceLineItemUpdateParams.Discount>();
      }
      ((List<InvoiceLineItemUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<InvoiceLineItemUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceLineItemUpdateParams.Discount>();
      }
      ((List<InvoiceLineItemUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons, promotion codes &amp; existing discounts which apply to the line item. Item
     * discounts are applied before invoice discounts. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons, promotion codes &amp; existing discounts which apply to the line item. Item
     * discounts are applied before invoice discounts. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(List<InvoiceLineItemUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#expand} for the field documentation.
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
     * InvoiceLineItemUpdateParams#expand} for the field documentation.
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
     * InvoiceLineItemUpdateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceLineItemUpdateParams#extraParams} for the field documentation.
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
     * InvoiceLineItemUpdateParams#metadata} for the field documentation.
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
     * See {@link InvoiceLineItemUpdateParams#metadata} for the field documentation.
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
     * can be unset by posting an empty value to {@code metadata}. For {@code type=recurring} line
     * items, the incoming metadata specified on the request is directly used to set this value, in
     * contrast to {@code type=invoiceitem} line items, where any existing metadata on the invoice
     * line is merged with the incoming data.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}. For {@code type=recurring} line
     * items, the incoming metadata specified on the request is directly used to set this value, in
     * contrast to {@code type=invoiceitem} line items, where any existing metadata on the invoice
     * line is merged with the incoming data.
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
    public Builder setPeriod(InvoiceLineItemUpdateParams.Period period) {
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
    public Builder setPriceData(InvoiceLineItemUpdateParams.PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /** Non-negative integer. The quantity of units for the line item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Add an element to `taxAmounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#taxAmounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addTaxAmount(InvoiceLineItemUpdateParams.TaxAmount element) {
      if (this.taxAmounts == null || this.taxAmounts instanceof EmptyParam) {
        this.taxAmounts = new ArrayList<InvoiceLineItemUpdateParams.TaxAmount>();
      }
      ((List<InvoiceLineItemUpdateParams.TaxAmount>) this.taxAmounts).add(element);
      return this;
    }

    /**
     * Add all elements to `taxAmounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#taxAmounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllTaxAmount(List<InvoiceLineItemUpdateParams.TaxAmount> elements) {
      if (this.taxAmounts == null || this.taxAmounts instanceof EmptyParam) {
        this.taxAmounts = new ArrayList<InvoiceLineItemUpdateParams.TaxAmount>();
      }
      ((List<InvoiceLineItemUpdateParams.TaxAmount>) this.taxAmounts).addAll(elements);
      return this;
    }

    /**
     * A list of up to 10 tax amounts for this line item. This can be useful if you calculate taxes
     * on your own or use a third-party to calculate them. You cannot set tax amounts if any line
     * item has <a
     * href="https://stripe.com/docs/api/invoices/line_item#invoice_line_item_object-tax_rates">tax_rates</a>
     * or if the invoice has <a
     * href="https://stripe.com/docs/api/invoices/object#invoice_object-default_tax_rates">default_tax_rates</a>
     * or uses <a href="https://stripe.com/docs/tax/invoicing">automatic tax</a>. Pass an empty
     * string to remove previously defined tax amounts.
     */
    public Builder setTaxAmounts(EmptyParam taxAmounts) {
      this.taxAmounts = taxAmounts;
      return this;
    }

    /**
     * A list of up to 10 tax amounts for this line item. This can be useful if you calculate taxes
     * on your own or use a third-party to calculate them. You cannot set tax amounts if any line
     * item has <a
     * href="https://stripe.com/docs/api/invoices/line_item#invoice_line_item_object-tax_rates">tax_rates</a>
     * or if the invoice has <a
     * href="https://stripe.com/docs/api/invoices/object#invoice_object-default_tax_rates">default_tax_rates</a>
     * or uses <a href="https://stripe.com/docs/tax/invoicing">automatic tax</a>. Pass an empty
     * string to remove previously defined tax amounts.
     */
    public Builder setTaxAmounts(List<InvoiceLineItemUpdateParams.TaxAmount> taxAmounts) {
      this.taxAmounts = taxAmounts;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceLineItemUpdateParams#taxRates} for the field documentation.
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
     * InvoiceLineItemUpdateParams#taxRates} for the field documentation.
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
     * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
     * invoice do not apply to this line item. Pass an empty string to remove previously-defined tax
     * rates.
     */
    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
     * invoice do not apply to this line item. Pass an empty string to remove previously-defined tax
     * rates.
     */
    public Builder setTaxRates(List<String> taxRates) {
      this.taxRates = taxRates;
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

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    Object promotionCode;

    private Discount(
        Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private Map<String, Object> extraParams;

      private Object promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceLineItemUpdateParams.Discount build() {
        return new InvoiceLineItemUpdateParams.Discount(
            this.coupon, this.discount, this.extraParams, this.promotionCode);
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
       * InvoiceLineItemUpdateParams.Discount#extraParams} for the field documentation.
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
       * See {@link InvoiceLineItemUpdateParams.Discount#extraParams} for the field documentation.
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
      public InvoiceLineItemUpdateParams.Period build() {
        return new InvoiceLineItemUpdateParams.Period(this.end, this.extraParams, this.start);
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
       * InvoiceLineItemUpdateParams.Period#extraParams} for the field documentation.
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
       * See {@link InvoiceLineItemUpdateParams.Period#extraParams} for the field documentation.
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

    /**
     * The ID of the product that this price will belong to. One of {@code product} or {@code
     * product_data} is required.
     */
    @SerializedName("product")
    Object product;

    /**
     * Data used to generate a new product object inline. One of {@code product} or {@code
     * product_data} is required.
     */
    @SerializedName("product_data")
    ProductData productData;

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
     * A non-negative integer in cents (or local equivalent) representing how much to charge. One of
     * {@code unit_amount} or {@code unit_amount_decimal} is required.
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
        ProductData productData,
        TaxBehavior taxBehavior,
        Long unitAmount,
        Object unitAmountDecimal) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.product = product;
      this.productData = productData;
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

      private ProductData productData;

      private TaxBehavior taxBehavior;

      private Long unitAmount;

      private Object unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceLineItemUpdateParams.PriceData build() {
        return new InvoiceLineItemUpdateParams.PriceData(
            this.currency,
            this.extraParams,
            this.product,
            this.productData,
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
       * InvoiceLineItemUpdateParams.PriceData#extraParams} for the field documentation.
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
       * See {@link InvoiceLineItemUpdateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The ID of the product that this price will belong to. One of {@code product} or {@code
       * product_data} is required.
       */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /**
       * The ID of the product that this price will belong to. One of {@code product} or {@code
       * product_data} is required.
       */
      public Builder setProduct(EmptyParam product) {
        this.product = product;
        return this;
      }

      /**
       * Data used to generate a new product object inline. One of {@code product} or {@code
       * product_data} is required.
       */
      public Builder setProductData(InvoiceLineItemUpdateParams.PriceData.ProductData productData) {
        this.productData = productData;
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
      public Builder setTaxBehavior(InvoiceLineItemUpdateParams.PriceData.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /**
       * A non-negative integer in cents (or local equivalent) representing how much to charge. One
       * of {@code unit_amount} or {@code unit_amount_decimal} is required.
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

    @Getter
    public static class ProductData {
      /**
       * The product's description, meant to be displayable to the customer. Use this field to
       * optionally store a long form explanation of the product being sold for your own rendering
       * purposes.
       */
      @SerializedName("description")
      Object description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
       */
      @SerializedName("images")
      List<String> images;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** <strong>Required.</strong> The product's name, meant to be displayable to the customer. */
      @SerializedName("name")
      Object name;

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      @SerializedName("tax_code")
      Object taxCode;

      private ProductData(
          Object description,
          Map<String, Object> extraParams,
          List<String> images,
          Map<String, String> metadata,
          Object name,
          Object taxCode) {
        this.description = description;
        this.extraParams = extraParams;
        this.images = images;
        this.metadata = metadata;
        this.name = name;
        this.taxCode = taxCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object description;

        private Map<String, Object> extraParams;

        private List<String> images;

        private Map<String, String> metadata;

        private Object name;

        private Object taxCode;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceLineItemUpdateParams.PriceData.ProductData build() {
          return new InvoiceLineItemUpdateParams.PriceData.ProductData(
              this.description,
              this.extraParams,
              this.images,
              this.metadata,
              this.name,
              this.taxCode);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceLineItemUpdateParams.PriceData.ProductData#extraParams} for the
         * field documentation.
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
         * map. See {@link InvoiceLineItemUpdateParams.PriceData.ProductData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `images` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceLineItemUpdateParams.PriceData.ProductData#images} for the field documentation.
         */
        public Builder addImage(String element) {
          if (this.images == null) {
            this.images = new ArrayList<>();
          }
          this.images.add(element);
          return this;
        }

        /**
         * Add all elements to `images` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceLineItemUpdateParams.PriceData.ProductData#images} for the field documentation.
         */
        public Builder addAllImage(List<String> elements) {
          if (this.images == null) {
            this.images = new ArrayList<>();
          }
          this.images.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * InvoiceLineItemUpdateParams.PriceData.ProductData#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceLineItemUpdateParams.PriceData.ProductData#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        public Builder setName(EmptyParam name) {
          this.name = name;
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

  @Getter
  public static class TaxAmount {
    /** <strong>Required.</strong> The amount, in cents (or local equivalent), of the tax. */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Data to find or create a TaxRate object.
     *
     * <p>Stripe automatically creates or reuses a TaxRate object for each tax amount. If the {@code
     * tax_rate_data} exactly matches a previous value, Stripe will reuse the TaxRate object.
     * TaxRate objects created automatically by Stripe are immediately archived, do not appear in
     * the line item’s {@code tax_rates}, and cannot be directly added to invoices, payments, or
     * line items.
     */
    @SerializedName("tax_rate_data")
    TaxRateData taxRateData;

    /**
     * <strong>Required.</strong> The amount on which tax is calculated, in cents (or local
     * equivalent).
     */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    private TaxAmount(
        Long amount, Map<String, Object> extraParams, TaxRateData taxRateData, Long taxableAmount) {
      this.amount = amount;
      this.extraParams = extraParams;
      this.taxRateData = taxRateData;
      this.taxableAmount = taxableAmount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      private TaxRateData taxRateData;

      private Long taxableAmount;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceLineItemUpdateParams.TaxAmount build() {
        return new InvoiceLineItemUpdateParams.TaxAmount(
            this.amount, this.extraParams, this.taxRateData, this.taxableAmount);
      }

      /** <strong>Required.</strong> The amount, in cents (or local equivalent), of the tax. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceLineItemUpdateParams.TaxAmount#extraParams} for the field documentation.
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
       * See {@link InvoiceLineItemUpdateParams.TaxAmount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Data to find or create a TaxRate object.
       *
       * <p>Stripe automatically creates or reuses a TaxRate object for each tax amount. If the
       * {@code tax_rate_data} exactly matches a previous value, Stripe will reuse the TaxRate
       * object. TaxRate objects created automatically by Stripe are immediately archived, do not
       * appear in the line item’s {@code tax_rates}, and cannot be directly added to invoices,
       * payments, or line items.
       */
      public Builder setTaxRateData(InvoiceLineItemUpdateParams.TaxAmount.TaxRateData taxRateData) {
        this.taxRateData = taxRateData;
        return this;
      }

      /**
       * <strong>Required.</strong> The amount on which tax is calculated, in cents (or local
       * equivalent).
       */
      public Builder setTaxableAmount(Long taxableAmount) {
        this.taxableAmount = taxableAmount;
        return this;
      }
    }

    @Getter
    public static class TaxRateData {
      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * An arbitrary string attached to the tax rate for your internal use only. It will not be
       * visible to your customers.
       */
      @SerializedName("description")
      Object description;

      /**
       * <strong>Required.</strong> The display name of the tax rate, which will be shown to users.
       */
      @SerializedName("display_name")
      Object displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> This specifies if the tax rate is inclusive or exclusive. */
      @SerializedName("inclusive")
      Boolean inclusive;

      /**
       * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes.
       * It also appears on your customer’s invoice.
       */
      @SerializedName("jurisdiction")
      Object jurisdiction;

      /**
       * <strong>Required.</strong> The statutory tax rate percent. This field accepts decimal
       * values between 0 and 100 inclusive with at most 4 decimal places. To accommodate
       * fixed-amount taxes, set the percentage to zero. Stripe will not display zero percentages on
       * the invoice unless the {@code amount} of the tax is also zero.
       */
      @SerializedName("percentage")
      BigDecimal percentage;

      /**
       * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
       * without country prefix. For example, &quot;NY&quot; for New York, United States.
       */
      @SerializedName("state")
      Object state;

      /** The high-level tax type, such as {@code vat} or {@code sales_tax}. */
      @SerializedName("tax_type")
      TaxType taxType;

      private TaxRateData(
          Object country,
          Object description,
          Object displayName,
          Map<String, Object> extraParams,
          Boolean inclusive,
          Object jurisdiction,
          BigDecimal percentage,
          Object state,
          TaxType taxType) {
        this.country = country;
        this.description = description;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.inclusive = inclusive;
        this.jurisdiction = jurisdiction;
        this.percentage = percentage;
        this.state = state;
        this.taxType = taxType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object country;

        private Object description;

        private Object displayName;

        private Map<String, Object> extraParams;

        private Boolean inclusive;

        private Object jurisdiction;

        private BigDecimal percentage;

        private Object state;

        private TaxType taxType;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceLineItemUpdateParams.TaxAmount.TaxRateData build() {
          return new InvoiceLineItemUpdateParams.TaxAmount.TaxRateData(
              this.country,
              this.description,
              this.displayName,
              this.extraParams,
              this.inclusive,
              this.jurisdiction,
              this.percentage,
              this.state,
              this.taxType);
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * An arbitrary string attached to the tax rate for your internal use only. It will not be
         * visible to your customers.
         */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * An arbitrary string attached to the tax rate for your internal use only. It will not be
         * visible to your customers.
         */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * <strong>Required.</strong> The display name of the tax rate, which will be shown to
         * users.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * <strong>Required.</strong> The display name of the tax rate, which will be shown to
         * users.
         */
        public Builder setDisplayName(EmptyParam displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceLineItemUpdateParams.TaxAmount.TaxRateData#extraParams} for the
         * field documentation.
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
         * map. See {@link InvoiceLineItemUpdateParams.TaxAmount.TaxRateData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> This specifies if the tax rate is inclusive or exclusive. */
        public Builder setInclusive(Boolean inclusive) {
          this.inclusive = inclusive;
          return this;
        }

        /**
         * The jurisdiction for the tax rate. You can use this label field for tax reporting
         * purposes. It also appears on your customer’s invoice.
         */
        public Builder setJurisdiction(String jurisdiction) {
          this.jurisdiction = jurisdiction;
          return this;
        }

        /**
         * The jurisdiction for the tax rate. You can use this label field for tax reporting
         * purposes. It also appears on your customer’s invoice.
         */
        public Builder setJurisdiction(EmptyParam jurisdiction) {
          this.jurisdiction = jurisdiction;
          return this;
        }

        /**
         * <strong>Required.</strong> The statutory tax rate percent. This field accepts decimal
         * values between 0 and 100 inclusive with at most 4 decimal places. To accommodate
         * fixed-amount taxes, set the percentage to zero. Stripe will not display zero percentages
         * on the invoice unless the {@code amount} of the tax is also zero.
         */
        public Builder setPercentage(BigDecimal percentage) {
          this.percentage = percentage;
          return this;
        }

        /**
         * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
         * without country prefix. For example, &quot;NY&quot; for New York, United States.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
         * without country prefix. For example, &quot;NY&quot; for New York, United States.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }

        /** The high-level tax type, such as {@code vat} or {@code sales_tax}. */
        public Builder setTaxType(
            InvoiceLineItemUpdateParams.TaxAmount.TaxRateData.TaxType taxType) {
          this.taxType = taxType;
          return this;
        }
      }

      public enum TaxType implements ApiRequestParams.EnumParam {
        @SerializedName("amusement_tax")
        AMUSEMENT_TAX("amusement_tax"),

        @SerializedName("communications_tax")
        COMMUNICATIONS_TAX("communications_tax"),

        @SerializedName("gst")
        GST("gst"),

        @SerializedName("hst")
        HST("hst"),

        @SerializedName("igst")
        IGST("igst"),

        @SerializedName("jct")
        JCT("jct"),

        @SerializedName("lease_tax")
        LEASE_TAX("lease_tax"),

        @SerializedName("pst")
        PST("pst"),

        @SerializedName("qst")
        QST("qst"),

        @SerializedName("rst")
        RST("rst"),

        @SerializedName("sales_tax")
        SALES_TAX("sales_tax"),

        @SerializedName("vat")
        VAT("vat");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxType(String value) {
          this.value = value;
        }
      }
    }
  }
}
