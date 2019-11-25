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
   * The integer amount in **%s** of the charge to be applied to the upcoming invoice. If you want
   * to apply a credit to the customer's account, pass a negative amount.
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
   * A set of key-value pairs that you can attach to an invoice item object. It can be useful for
   * storing additional information about the invoice item in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The period associated with this invoice item. */
  @SerializedName("period")
  Period period;

  /** Non-negative integer. The quantity of units for the invoice item. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice
   * do not apply to this invoice item. Pass an empty string to remove previously-defined tax rates.
   */
  @SerializedName("tax_rates")
  Object taxRates;

  /**
   * The integer unit amount in **%s** of the charge to be applied to the upcoming invoice. This
   * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
   * credit to the customer's account, pass a negative unit_amount.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Same as `unit_amount`, but accepts a decimal value with at most 12 decimal places. Only one of
   * `unit_amount` and `unit_amount_decimal` can be set.
   */
  @SerializedName("unit_amount_decimal")
  Object unitAmountDecimal;

  private InvoiceItemUpdateParams(
      Long amount,
      Object description,
      Boolean discountable,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Period period,
      Long quantity,
      Object taxRates,
      Long unitAmount,
      Object unitAmountDecimal) {
    this.amount = amount;
    this.description = description;
    this.discountable = discountable;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.period = period;
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

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Period period;

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
          this.expand,
          this.extraParams,
          this.metadata,
          this.period,
          this.quantity,
          this.taxRates,
          this.unitAmount,
          this.unitAmountDecimal);
    }

    /**
     * The integer amount in **%s** of the charge to be applied to the upcoming invoice. If you want
     * to apply a credit to the customer's account, pass a negative amount.
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
     * See {@link InvoiceItemUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
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
     * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the
     * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
     * tax rates.
     */
    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the
     * invoice do not apply to this invoice item. Pass an empty string to remove previously-defined
     * tax rates.
     */
    public Builder setTaxRates(List<String> taxRates) {
      this.taxRates = taxRates;
      return this;
    }

    /**
     * The integer unit amount in **%s** of the charge to be applied to the upcoming invoice. This
     * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
     * credit to the customer's account, pass a negative unit_amount.
     */
    public Builder setUnitAmount(Long unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    /**
     * Same as `unit_amount`, but accepts a decimal value with at most 12 decimal places. Only one
     * of `unit_amount` and `unit_amount_decimal` can be set.
     */
    public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
      this.unitAmountDecimal = unitAmountDecimal;
      return this;
    }

    /**
     * Same as `unit_amount`, but accepts a decimal value with at most 12 decimal places. Only one
     * of `unit_amount` and `unit_amount_decimal` can be set.
     */
    public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
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
}
