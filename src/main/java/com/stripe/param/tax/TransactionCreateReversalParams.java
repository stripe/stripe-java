// File generated from our OpenAPI spec
package com.stripe.param.tax;

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
public class TransactionCreateReversalParams extends ApiRequestParams {
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
   * A flat amount to reverse across the entire transaction, in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in negative.
   * This value represents the total amount to refund from the transaction, including taxes.
   */
  @SerializedName("flat_amount")
  Long flatAmount;

  /** The line item amounts to reverse. */
  @SerializedName("line_items")
  List<TransactionCreateReversalParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> If {@code partial}, the provided line item or shipping cost amounts
   * are reversed. If {@code full}, the original transaction is fully reversed.
   */
  @SerializedName("mode")
  Mode mode;

  /** <strong>Required.</strong> The ID of the Transaction to partially or fully reverse. */
  @SerializedName("original_transaction")
  String originalTransaction;

  /**
   * <strong>Required.</strong> A custom identifier for this reversal, such as {@code
   * myOrder_123-refund_1}, which must be unique across all transactions. The reference helps
   * identify this reversal transaction in exported <a
   * href="https://stripe.com/docs/tax/reports">tax reports</a>.
   */
  @SerializedName("reference")
  String reference;

  /** The shipping cost to reverse. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  private TransactionCreateReversalParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Long flatAmount,
      List<TransactionCreateReversalParams.LineItem> lineItems,
      Map<String, String> metadata,
      Mode mode,
      String originalTransaction,
      String reference,
      ShippingCost shippingCost) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.flatAmount = flatAmount;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.mode = mode;
    this.originalTransaction = originalTransaction;
    this.reference = reference;
    this.shippingCost = shippingCost;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long flatAmount;

    private List<TransactionCreateReversalParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private Mode mode;

    private String originalTransaction;

    private String reference;

    private ShippingCost shippingCost;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionCreateReversalParams build() {
      return new TransactionCreateReversalParams(
          this.expand,
          this.extraParams,
          this.flatAmount,
          this.lineItems,
          this.metadata,
          this.mode,
          this.originalTransaction,
          this.reference,
          this.shippingCost);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateReversalParams#expand} for the field documentation.
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
     * TransactionCreateReversalParams#expand} for the field documentation.
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
     * TransactionCreateReversalParams#extraParams} for the field documentation.
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
     * See {@link TransactionCreateReversalParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A flat amount to reverse across the entire transaction, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
     * negative. This value represents the total amount to refund from the transaction, including
     * taxes.
     */
    public Builder setFlatAmount(Long flatAmount) {
      this.flatAmount = flatAmount;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateReversalParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(TransactionCreateReversalParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * TransactionCreateReversalParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<TransactionCreateReversalParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * TransactionCreateReversalParams#metadata} for the field documentation.
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
     * See {@link TransactionCreateReversalParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> If {@code partial}, the provided line item or shipping cost
     * amounts are reversed. If {@code full}, the original transaction is fully reversed.
     */
    public Builder setMode(TransactionCreateReversalParams.Mode mode) {
      this.mode = mode;
      return this;
    }

    /** <strong>Required.</strong> The ID of the Transaction to partially or fully reverse. */
    public Builder setOriginalTransaction(String originalTransaction) {
      this.originalTransaction = originalTransaction;
      return this;
    }

    /**
     * <strong>Required.</strong> A custom identifier for this reversal, such as {@code
     * myOrder_123-refund_1}, which must be unique across all transactions. The reference helps
     * identify this reversal transaction in exported <a
     * href="https://stripe.com/docs/tax/reports">tax reports</a>.
     */
    public Builder setReference(String reference) {
      this.reference = reference;
      return this;
    }

    /** The shipping cost to reverse. */
    public Builder setShippingCost(TransactionCreateReversalParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItem {
    /**
     * <strong>Required.</strong> The amount to reverse, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
     * negative.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> The amount of tax to reverse, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
     * negative.
     */
    @SerializedName("amount_tax")
    Long amountTax;

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
     * structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * <strong>Required.</strong> The {@code id} of the line item to reverse in the original
     * transaction.
     */
    @SerializedName("original_line_item")
    String originalLineItem;

    /**
     * The quantity reversed. Appears in <a href="https://stripe.com/docs/tax/reports">tax
     * exports</a>, but does not affect the amount of tax reversed.
     */
    @SerializedName("quantity")
    Long quantity;

    /**
     * <strong>Required.</strong> A custom identifier for this line item in the reversal
     * transaction, such as 'L1-refund'.
     */
    @SerializedName("reference")
    String reference;

    private LineItem(
        Long amount,
        Long amountTax,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String originalLineItem,
        Long quantity,
        String reference) {
      this.amount = amount;
      this.amountTax = amountTax;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.originalLineItem = originalLineItem;
      this.quantity = quantity;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Long amountTax;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String originalLineItem;

      private Long quantity;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionCreateReversalParams.LineItem build() {
        return new TransactionCreateReversalParams.LineItem(
            this.amount,
            this.amountTax,
            this.extraParams,
            this.metadata,
            this.originalLineItem,
            this.quantity,
            this.reference);
      }

      /**
       * <strong>Required.</strong> The amount to reverse, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
       * negative.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * <strong>Required.</strong> The amount of tax to reverse, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
       * negative.
       */
      public Builder setAmountTax(Long amountTax) {
        this.amountTax = amountTax;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateReversalParams.LineItem#extraParams} for the field documentation.
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
       * See {@link TransactionCreateReversalParams.LineItem#extraParams} for the field
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
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateReversalParams.LineItem#metadata} for the field documentation.
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
       * See {@link TransactionCreateReversalParams.LineItem#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The {@code id} of the line item to reverse in the original
       * transaction.
       */
      public Builder setOriginalLineItem(String originalLineItem) {
        this.originalLineItem = originalLineItem;
        return this;
      }

      /**
       * The quantity reversed. Appears in <a href="https://stripe.com/docs/tax/reports">tax
       * exports</a>, but does not affect the amount of tax reversed.
       */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * <strong>Required.</strong> A custom identifier for this line item in the reversal
       * transaction, such as 'L1-refund'.
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost {
    /**
     * <strong>Required.</strong> The amount to reverse, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
     * negative.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> The amount of tax to reverse, in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
     * negative.
     */
    @SerializedName("amount_tax")
    Long amountTax;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShippingCost(Long amount, Long amountTax, Map<String, Object> extraParams) {
      this.amount = amount;
      this.amountTax = amountTax;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Long amountTax;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionCreateReversalParams.ShippingCost build() {
        return new TransactionCreateReversalParams.ShippingCost(
            this.amount, this.amountTax, this.extraParams);
      }

      /**
       * <strong>Required.</strong> The amount to reverse, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
       * negative.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * <strong>Required.</strong> The amount of tax to reverse, in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> in
       * negative.
       */
      public Builder setAmountTax(Long amountTax) {
        this.amountTax = amountTax;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionCreateReversalParams.ShippingCost#extraParams} for the field documentation.
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
       * See {@link TransactionCreateReversalParams.ShippingCost#extraParams} for the field
       * documentation.
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

  public enum Mode implements ApiRequestParams.EnumParam {
    @SerializedName("full")
    FULL("full"),

    @SerializedName("partial")
    PARTIAL("partial");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Mode(String value) {
      this.value = value;
    }
  }
}
