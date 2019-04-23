// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  String description;

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

  @SerializedName("tax_rates")
  Object taxRates;

  /**
   * The integer unit amount in **%s** of the charge to be applied to the upcoming invoice. This
   * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
   * credit to the customer's account, pass a negative unit_amount.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  private InvoiceItemUpdateParams(
      Long amount,
      String description,
      Boolean discountable,
      List<String> expand,
      Map<String, String> metadata,
      Period period,
      Long quantity,
      Object taxRates,
      Long unitAmount) {
    this.amount = amount;
    this.description = description;
    this.discountable = discountable;
    this.expand = expand;
    this.metadata = metadata;
    this.period = period;
    this.quantity = quantity;
    this.taxRates = taxRates;
    this.unitAmount = unitAmount;
  }

  public static Builder builder() {
    return new com.stripe.param.InvoiceItemUpdateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private String description;

    private Boolean discountable;

    private List<String> expand;

    private Map<String, String> metadata;

    private Period period;

    private Long quantity;

    private Object taxRates;

    private Long unitAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceItemUpdateParams build() {
      return new InvoiceItemUpdateParams(
          this.amount,
          this.description,
          this.discountable,
          this.expand,
          this.metadata,
          this.period,
          this.quantity,
          this.taxRates,
          this.unitAmount);
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

    public Builder setTaxRates(EmptyParam taxRates) {
      this.taxRates = taxRates;
      return this;
    }

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
  }

  public static class Period {
    /** The end of the period, which must be greater than or equal to the start. */
    @SerializedName("end")
    Long end;

    /** The start of the period. */
    @SerializedName("start")
    Long start;

    private Period(Long end, Long start) {
      this.end = end;
      this.start = start;
    }

    public static Builder builder() {
      return new com.stripe.param.InvoiceItemUpdateParams.Period.Builder();
    }

    public static class Builder {
      private Long end;

      private Long start;

      /** Finalize and obtain parameter instance from this builder. */
      public Period build() {
        return new Period(this.end, this.start);
      }

      /** The end of the period, which must be greater than or equal to the start. */
      public Builder setEnd(Long end) {
        this.end = end;
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
