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
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class InvoiceItemCreateParams extends ApiRequestParams {
  /**
   * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming
   * invoice. Passing in a negative {@code amount} will reduce the {@code amount_due} on the
   * invoice.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer to bill for this invoice item. */
  @SerializedName("customer")
  String customer;

  /** The ID of the account representing the customer to bill for this invoice item. */
  @SerializedName("customer_account")
  String customerAccount;

  /**
   * An arbitrary string which you can attach to the invoice item. The description is displayed in
   * the invoice for easy tracking.
   */
  @SerializedName("description")
  String description;

  /**
   * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
   * negative invoice items, and true for all other invoice items.
   */
  @SerializedName("discountable")
  Boolean discountable;

  /**
   * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line
   * item.
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
   * The ID of an existing invoice to add this invoice item to. For subscription invoices, when left
   * blank, the invoice item will be added to the next upcoming scheduled invoice. For standalone
   * invoices, the invoice item won't be automatically added unless you pass {@code
   * pending_invoice_item_behavior: 'include'} when creating the invoice. This is useful when adding
   * invoice items in response to an invoice.created webhook. You can only add invoice items to
   * draft invoices and there is a maximum of 250 items per invoice.
   */
  @SerializedName("invoice")
  String invoice;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * The period associated with this invoice item. When set to different values, the period will be
   * rendered on the invoice. If you have <a
   * href="https://docs.stripe.com/revenue-recognition">Stripe Revenue Recognition</a> enabled, the
   * period will be used to recognize and defer revenue. See the <a
   * href="https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
   * Recognition documentation</a> for details.
   */
  @SerializedName("period")
  Period period;

  /**
   * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
   * inline.
   */
  @SerializedName("price_data")
  PriceData priceData;

  /** The pricing information for the invoice item. */
  @SerializedName("pricing")
  Pricing pricing;

  /** Non-negative integer. The quantity of units for the invoice item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The ID of a subscription to add this invoice item to. When left blank, the invoice item is
   * added to the next upcoming scheduled invoice. When set, scheduled invoices for subscriptions
   * other than the specified subscription will ignore the invoice item. Use this when you want to
   * express that an invoice item has been accrued within the context of a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * Only required if a <a
   * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
   * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
   * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
   * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
   * exclusive}, it cannot be changed.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
  @SerializedName("tax_code")
  Object taxCode;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item.
   */
  @SerializedName("tax_rates")
  List<String> taxRates;

  /**
   * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the
   * upcoming invoice. This {@code unit_amount_decimal} will be multiplied by the quantity to get
   * the full amount. Passing in a negative {@code unit_amount_decimal} will reduce the {@code
   * amount_due} on the invoice. Accepts at most 12 decimal places.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  private InvoiceItemCreateParams(
      Long amount,
      String currency,
      String customer,
      String customerAccount,
      String description,
      Boolean discountable,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      Object metadata,
      Period period,
      PriceData priceData,
      Pricing pricing,
      Long quantity,
      String subscription,
      TaxBehavior taxBehavior,
      Object taxCode,
      List<String> taxRates,
      BigDecimal unitAmountDecimal) {
    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.customerAccount = customerAccount;
    this.description = description;
    this.discountable = discountable;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.metadata = metadata;
    this.period = period;
    this.priceData = priceData;
    this.pricing = pricing;
    this.quantity = quantity;
    this.subscription = subscription;
    this.taxBehavior = taxBehavior;
    this.taxCode = taxCode;
    this.taxRates = taxRates;
    this.unitAmountDecimal = unitAmountDecimal;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String customer;

    private String customerAccount;

    private String description;

    private Boolean discountable;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private Object metadata;

    private Period period;

    private PriceData priceData;

    private Pricing pricing;

    private Long quantity;

    private String subscription;

    private TaxBehavior taxBehavior;

    private Object taxCode;

    private List<String> taxRates;

    private BigDecimal unitAmountDecimal;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceItemCreateParams build() {
      return new InvoiceItemCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.customerAccount,
          this.description,
          this.discountable,
          this.discounts,
          this.expand,
          this.extraParams,
          this.invoice,
          this.metadata,
          this.period,
          this.priceData,
          this.pricing,
          this.quantity,
          this.subscription,
          this.taxBehavior,
          this.taxCode,
          this.taxRates,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming
     * invoice. Passing in a negative {@code amount} will reduce the {@code amount_due} on the
     * invoice.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
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

    /** The ID of the customer to bill for this invoice item. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The ID of the account representing the customer to bill for this invoice item. */
    public Builder setCustomerAccount(String customerAccount) {
      this.customerAccount = customerAccount;
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
     * Controls whether discounts apply to this invoice item. Defaults to false for prorations or
     * negative invoice items, and true for all other invoice items.
     */
    public Builder setDiscountable(Boolean discountable) {
      this.discountable = discountable;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(InvoiceItemCreateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceItemCreateParams.Discount>();
      }
      ((List<InvoiceItemCreateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<InvoiceItemCreateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceItemCreateParams.Discount>();
      }
      ((List<InvoiceItemCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line
     * item.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line
     * item.
     */
    public Builder setDiscounts(List<InvoiceItemCreateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#expand} for the field documentation.
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
     * InvoiceItemCreateParams#expand} for the field documentation.
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
     * InvoiceItemCreateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceItemCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The ID of an existing invoice to add this invoice item to. For subscription invoices, when
     * left blank, the invoice item will be added to the next upcoming scheduled invoice. For
     * standalone invoices, the invoice item won't be automatically added unless you pass {@code
     * pending_invoice_item_behavior: 'include'} when creating the invoice. This is useful when
     * adding invoice items in response to an invoice.created webhook. You can only add invoice
     * items to draft invoices and there is a maximum of 250 items per invoice.
     */
    public Builder setInvoice(String invoice) {
      this.invoice = invoice;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceItemCreateParams#metadata} for the field documentation.
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
     * See {@link InvoiceItemCreateParams#metadata} for the field documentation.
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
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
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
     * href="https://docs.stripe.com/revenue-recognition">Stripe Revenue Recognition</a> enabled,
     * the period will be used to recognize and defer revenue. See the <a
     * href="https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
     * Recognition documentation</a> for details.
     */
    public Builder setPeriod(InvoiceItemCreateParams.Period period) {
      this.period = period;
      return this;
    }

    /**
     * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
     * inline.
     */
    public Builder setPriceData(InvoiceItemCreateParams.PriceData priceData) {
      this.priceData = priceData;
      return this;
    }

    /** The pricing information for the invoice item. */
    public Builder setPricing(InvoiceItemCreateParams.Pricing pricing) {
      this.pricing = pricing;
      return this;
    }

    /** Non-negative integer. The quantity of units for the invoice item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of a subscription to add this invoice item to. When left blank, the invoice item is
     * added to the next upcoming scheduled invoice. When set, scheduled invoices for subscriptions
     * other than the specified subscription will ignore the invoice item. Use this when you want to
     * express that an invoice item has been accrued within the context of a particular
     * subscription.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * Only required if a <a
     * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    public Builder setTaxBehavior(InvoiceItemCreateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
    public Builder setTaxCode(EmptyParam taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#taxRates} for the field documentation.
     */
    public Builder addTaxRate(String element) {
      if (this.taxRates == null) {
        this.taxRates = new ArrayList<>();
      }
      this.taxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceItemCreateParams#taxRates} for the field documentation.
     */
    public Builder addAllTaxRate(List<String> elements) {
      if (this.taxRates == null) {
        this.taxRates = new ArrayList<>();
      }
      this.taxRates.addAll(elements);
      return this;
    }

    /**
     * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the
     * upcoming invoice. This {@code unit_amount_decimal} will be multiplied by the quantity to get
     * the full amount. Passing in a negative {@code unit_amount_decimal} will reduce the {@code
     * amount_due} on the invoice. Accepts at most 12 decimal places.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

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
    String promotionCode;

    private Discount(
        String coupon, String discount, Map<String, Object> extraParams, String promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private String discount;

      private Map<String, Object> extraParams;

      private String promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceItemCreateParams.Discount build() {
        return new InvoiceItemCreateParams.Discount(
            this.coupon, this.discount, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemCreateParams.Discount#extraParams} for the field documentation.
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
       * See {@link InvoiceItemCreateParams.Discount#extraParams} for the field documentation.
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
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
      public InvoiceItemCreateParams.Period build() {
        return new InvoiceItemCreateParams.Period(this.end, this.extraParams, this.start);
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
       * InvoiceItemCreateParams.Period#extraParams} for the field documentation.
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
       * See {@link InvoiceItemCreateParams.Period#extraParams} for the field documentation.
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
  @EqualsAndHashCode(callSuper = false)
  public static class PriceData {
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

    /**
     * <strong>Required.</strong> The ID of the <a
     * href="https://docs.stripe.com/api/products">Product</a> that this <a
     * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
     */
    @SerializedName("product")
    String product;

    /**
     * Only required if a <a
     * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
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
    BigDecimal unitAmountDecimal;

    private PriceData(
        String currency,
        Map<String, Object> extraParams,
        String product,
        TaxBehavior taxBehavior,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
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
      private String currency;

      private Map<String, Object> extraParams;

      private String product;

      private TaxBehavior taxBehavior;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceItemCreateParams.PriceData build() {
        return new InvoiceItemCreateParams.PriceData(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemCreateParams.PriceData#extraParams} for the field documentation.
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
       * See {@link InvoiceItemCreateParams.PriceData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The ID of the <a
       * href="https://docs.stripe.com/api/products">Product</a> that this <a
       * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
       */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /**
       * Only required if a <a
       * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(InvoiceItemCreateParams.PriceData.TaxBehavior taxBehavior) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Pricing {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the price object. */
    @SerializedName("price")
    String price;

    private Pricing(Map<String, Object> extraParams, String price) {
      this.extraParams = extraParams;
      this.price = price;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String price;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceItemCreateParams.Pricing build() {
        return new InvoiceItemCreateParams.Pricing(this.extraParams, this.price);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceItemCreateParams.Pricing#extraParams} for the field documentation.
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
       * See {@link InvoiceItemCreateParams.Pricing#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the price object. */
      public Builder setPrice(String price) {
        this.price = price;
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
