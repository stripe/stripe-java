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
public class CreditNoteListPreviewLineItemsParams extends ApiRequestParams {
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit
   * note.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The integer amount in cents (or local equivalent) representing the amount to credit the
   * customer's balance, which will be automatically applied to their next invoice.
   */
  @SerializedName("credit_amount")
  Long creditAmount;

  /**
   * The date when this credit note is in effect. Same as {@code created} unless overwritten. When
   * defined, this value replaces the system-generated 'Date of issue' printed on the credit note
   * PDF.
   */
  @SerializedName("effective_at")
  Long effectiveAt;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
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

  /** <strong>Required.</strong> ID of the invoice. */
  @SerializedName("invoice")
  String invoice;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Line items that make up the credit note. */
  @SerializedName("lines")
  List<CreditNoteListPreviewLineItemsParams.Line> lines;

  /** The credit note's memo appears on the credit note PDF. */
  @SerializedName("memo")
  String memo;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The integer amount in cents (or local equivalent) representing the amount that is credited
   * outside of Stripe.
   */
  @SerializedName("out_of_band_amount")
  Long outOfBandAmount;

  /**
   * Reason for issuing this credit note, one of {@code duplicate}, {@code fraudulent}, {@code
   * order_change}, or {@code product_unsatisfactory}.
   */
  @SerializedName("reason")
  Reason reason;

  /** ID of an existing refund to link this credit note to. */
  @SerializedName("refund")
  String refund;

  /**
   * The integer amount in cents (or local equivalent) representing the amount to refund. If set, a
   * refund will be created for the charge associated with the invoice.
   */
  @SerializedName("refund_amount")
  Long refundAmount;

  /**
   * When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included
   * in the credit note.
   */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private CreditNoteListPreviewLineItemsParams(
      Long amount,
      Long creditAmount,
      Long effectiveAt,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      Long limit,
      List<CreditNoteListPreviewLineItemsParams.Line> lines,
      String memo,
      Map<String, String> metadata,
      Long outOfBandAmount,
      Reason reason,
      String refund,
      Long refundAmount,
      ShippingCost shippingCost,
      String startingAfter) {
    this.amount = amount;
    this.creditAmount = creditAmount;
    this.effectiveAt = effectiveAt;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.limit = limit;
    this.lines = lines;
    this.memo = memo;
    this.metadata = metadata;
    this.outOfBandAmount = outOfBandAmount;
    this.reason = reason;
    this.refund = refund;
    this.refundAmount = refundAmount;
    this.shippingCost = shippingCost;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long creditAmount;

    private Long effectiveAt;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private Long limit;

    private List<CreditNoteListPreviewLineItemsParams.Line> lines;

    private String memo;

    private Map<String, String> metadata;

    private Long outOfBandAmount;

    private Reason reason;

    private String refund;

    private Long refundAmount;

    private ShippingCost shippingCost;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditNoteListPreviewLineItemsParams build() {
      return new CreditNoteListPreviewLineItemsParams(
          this.amount,
          this.creditAmount,
          this.effectiveAt,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.invoice,
          this.limit,
          this.lines,
          this.memo,
          this.metadata,
          this.outOfBandAmount,
          this.reason,
          this.refund,
          this.refundAmount,
          this.shippingCost,
          this.startingAfter);
    }

    /**
     * The integer amount in cents (or local equivalent) representing the total amount of the credit
     * note.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The integer amount in cents (or local equivalent) representing the amount to credit the
     * customer's balance, which will be automatically applied to their next invoice.
     */
    public Builder setCreditAmount(Long creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    /**
     * The date when this credit note is in effect. Same as {@code created} unless overwritten. When
     * defined, this value replaces the system-generated 'Date of issue' printed on the credit note
     * PDF.
     */
    public Builder setEffectiveAt(Long effectiveAt) {
      this.effectiveAt = effectiveAt;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditNoteListPreviewLineItemsParams#expand} for the field documentation.
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
     * CreditNoteListPreviewLineItemsParams#expand} for the field documentation.
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
     * CreditNoteListPreviewLineItemsParams#extraParams} for the field documentation.
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
     * See {@link CreditNoteListPreviewLineItemsParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> ID of the invoice. */
    public Builder setInvoice(String invoice) {
      this.invoice = invoice;
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

    /**
     * Add an element to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditNoteListPreviewLineItemsParams#lines} for the field documentation.
     */
    public Builder addLine(CreditNoteListPreviewLineItemsParams.Line element) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.add(element);
      return this;
    }

    /**
     * Add all elements to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditNoteListPreviewLineItemsParams#lines} for the field documentation.
     */
    public Builder addAllLine(List<CreditNoteListPreviewLineItemsParams.Line> elements) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.addAll(elements);
      return this;
    }

    /** The credit note's memo appears on the credit note PDF. */
    public Builder setMemo(String memo) {
      this.memo = memo;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditNoteListPreviewLineItemsParams#metadata} for the field documentation.
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
     * See {@link CreditNoteListPreviewLineItemsParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The integer amount in cents (or local equivalent) representing the amount that is credited
     * outside of Stripe.
     */
    public Builder setOutOfBandAmount(Long outOfBandAmount) {
      this.outOfBandAmount = outOfBandAmount;
      return this;
    }

    /**
     * Reason for issuing this credit note, one of {@code duplicate}, {@code fraudulent}, {@code
     * order_change}, or {@code product_unsatisfactory}.
     */
    public Builder setReason(CreditNoteListPreviewLineItemsParams.Reason reason) {
      this.reason = reason;
      return this;
    }

    /** ID of an existing refund to link this credit note to. */
    public Builder setRefund(String refund) {
      this.refund = refund;
      return this;
    }

    /**
     * The integer amount in cents (or local equivalent) representing the amount to refund. If set,
     * a refund will be created for the charge associated with the invoice.
     */
    public Builder setRefundAmount(Long refundAmount) {
      this.refundAmount = refundAmount;
      return this;
    }

    /**
     * When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included
     * in the credit note.
     */
    public Builder setShippingCost(CreditNoteListPreviewLineItemsParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }

  @Getter
  public static class Line {
    /**
     * The line item amount to credit. Only valid when {@code type} is {@code invoice_line_item}.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * The description of the credit note line item. Only valid when the {@code type} is {@code
     * custom_line_item}.
     */
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

    /**
     * The invoice line item to credit. Only valid when the {@code type} is {@code
     * invoice_line_item}.
     */
    @SerializedName("invoice_line_item")
    String invoiceLineItem;

    /** The line item quantity to credit. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * The tax rates which apply to the credit note line item. Only valid when the {@code type} is
     * {@code custom_line_item}.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    /**
     * <strong>Required.</strong> Type of the credit note line item, one of {@code
     * invoice_line_item} or {@code custom_line_item}
     */
    @SerializedName("type")
    Type type;

    /**
     * The integer unit amount in cents (or local equivalent) of the credit note line item. This
     * {@code unit_amount} will be multiplied by the quantity to get the full amount to credit for
     * this line item. Only valid when {@code type} is {@code custom_line_item}.
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

    private Line(
        Long amount,
        String description,
        Map<String, Object> extraParams,
        String invoiceLineItem,
        Long quantity,
        Object taxRates,
        Type type,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
      this.amount = amount;
      this.description = description;
      this.extraParams = extraParams;
      this.invoiceLineItem = invoiceLineItem;
      this.quantity = quantity;
      this.taxRates = taxRates;
      this.type = type;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String description;

      private Map<String, Object> extraParams;

      private String invoiceLineItem;

      private Long quantity;

      private Object taxRates;

      private Type type;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditNoteListPreviewLineItemsParams.Line build() {
        return new CreditNoteListPreviewLineItemsParams.Line(
            this.amount,
            this.description,
            this.extraParams,
            this.invoiceLineItem,
            this.quantity,
            this.taxRates,
            this.type,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /**
       * The line item amount to credit. Only valid when {@code type} is {@code invoice_line_item}.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * The description of the credit note line item. Only valid when the {@code type} is {@code
       * custom_line_item}.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditNoteListPreviewLineItemsParams.Line#extraParams} for the field documentation.
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
       * See {@link CreditNoteListPreviewLineItemsParams.Line#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The invoice line item to credit. Only valid when the {@code type} is {@code
       * invoice_line_item}.
       */
      public Builder setInvoiceLineItem(String invoiceLineItem) {
        this.invoiceLineItem = invoiceLineItem;
        return this;
      }

      /** The line item quantity to credit. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * CreditNoteListPreviewLineItemsParams.Line#taxRates} for the field documentation.
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
       * CreditNoteListPreviewLineItemsParams.Line#taxRates} for the field documentation.
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
       * The tax rates which apply to the credit note line item. Only valid when the {@code type} is
       * {@code custom_line_item}.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The tax rates which apply to the credit note line item. Only valid when the {@code type} is
       * {@code custom_line_item}.
       */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * <strong>Required.</strong> Type of the credit note line item, one of {@code
       * invoice_line_item} or {@code custom_line_item}
       */
      public Builder setType(CreditNoteListPreviewLineItemsParams.Line.Type type) {
        this.type = type;
        return this;
      }

      /**
       * The integer unit amount in cents (or local equivalent) of the credit note line item. This
       * {@code unit_amount} will be multiplied by the quantity to get the full amount to credit for
       * this line item. Only valid when {@code type} is {@code custom_line_item}.
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

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("custom_line_item")
      CUSTOM_LINE_ITEM("custom_line_item"),

      @SerializedName("invoice_line_item")
      INVOICE_LINE_ITEM("invoice_line_item");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class ShippingCost {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the shipping rate to use for this order. */
    @SerializedName("shipping_rate")
    String shippingRate;

    private ShippingCost(Map<String, Object> extraParams, String shippingRate) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String shippingRate;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditNoteListPreviewLineItemsParams.ShippingCost build() {
        return new CreditNoteListPreviewLineItemsParams.ShippingCost(
            this.extraParams, this.shippingRate);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditNoteListPreviewLineItemsParams.ShippingCost#extraParams} for the field documentation.
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
       * See {@link CreditNoteListPreviewLineItemsParams.ShippingCost#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the shipping rate to use for this order. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("order_change")
    ORDER_CHANGE("order_change"),

    @SerializedName("product_unsatisfactory")
    PRODUCT_UNSATISFACTORY("product_unsatisfactory");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
