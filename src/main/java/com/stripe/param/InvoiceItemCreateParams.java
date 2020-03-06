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
public class InvoiceItemCreateParams extends ApiRequestParams {
  /**
   * The integer amount in <strong>%s</strong> of the charge to be applied to the upcoming invoice.
   * Passing in a negative {@code amount} will reduce the {@code amount_due} on the invoice.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer who will be billed when this invoice item is billed. */
  @SerializedName("customer")
  String customer;

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
   * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item
   * will be added to the next upcoming scheduled invoice. This is useful when adding invoice items
   * in response to an invoice.created webhook. You can only add invoice items to draft invoices.
   */
  @SerializedName("invoice")
  String invoice;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to {@code
   * metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The period associated with this invoice item. */
  @SerializedName("period")
  Period period;

  /** Non-negative integer. The quantity of units for the invoice item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be
   * be added to the next upcoming scheduled invoice. When set, scheduled invoices for subscriptions
   * other than the specified subscription will ignore the invoice item. Use this when you want to
   * express that an invoice item has been accrued within the context of a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item.
   */
  @SerializedName("tax_rates")
  List<String> taxRates;

  /**
   * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
   * invoice. This {@code unit_amount} will be multiplied by the quantity to get the full amount.
   * Passing in a negative {@code unit_amount} will reduce the {@code amount_due} on the invoice.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
   * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  private InvoiceItemCreateParams(
      Long amount,
      String currency,
      String customer,
      String description,
      Boolean discountable,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      Object metadata,
      Period period,
      Long quantity,
      String subscription,
      List<String> taxRates,
      Long unitAmount,
      BigDecimal unitAmountDecimal) {
    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.discountable = discountable;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.metadata = metadata;
    this.period = period;
    this.quantity = quantity;
    this.subscription = subscription;
    this.taxRates = taxRates;
    this.unitAmount = unitAmount;
    this.unitAmountDecimal = unitAmountDecimal;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String customer;

    private String description;

    private Boolean discountable;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private Object metadata;

    private Period period;

    private Long quantity;

    private String subscription;

    private List<String> taxRates;

    private Long unitAmount;

    private BigDecimal unitAmountDecimal;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceItemCreateParams build() {
      return new InvoiceItemCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.description,
          this.discountable,
          this.expand,
          this.extraParams,
          this.invoice,
          this.metadata,
          this.period,
          this.quantity,
          this.subscription,
          this.taxRates,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in <strong>%s</strong> of the charge to be applied to the upcoming
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

    /** The ID of the customer who will be billed when this invoice item is billed. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
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
     * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item
     * will be added to the next upcoming scheduled invoice. This is useful when adding invoice
     * items in response to an invoice.created webhook. You can only add invoice items to draft
     * invoices.
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
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
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

    /** Non-negative integer. The quantity of units for the invoice item. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of a subscription to add this invoice item to. When left blank, the invoice item will
     * be be added to the next upcoming scheduled invoice. When set, scheduled invoices for
     * subscriptions other than the specified subscription will ignore the invoice item. Use this
     * when you want to express that an invoice item has been accrued within the context of a
     * particular subscription.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
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
     * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
     * invoice. This {@code unit_amount} will be multiplied by the quantity to get the full amount.
     * Passing in a negative {@code unit_amount} will reduce the {@code amount_due} on the invoice.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places. Only
     * one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
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

      /** The start of the period. */
      public Builder setStart(Long start) {
        this.start = start;
        return this;
      }
    }
  }
}
