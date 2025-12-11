// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentIncrementAuthorizationParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The updated total amount that you intend to collect from the
   * cardholder. This amount must be greater than the currently authorized amount.
   */
  @SerializedName("amount")
  Long amount;

  /** Provides industry-specific information about the amount. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. The amount of the application fee
   * collected will be capped at the total amount captured. For more information, see the
   * PaymentIntents <a href="https://docs.stripe.com/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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

  /** Automations to be run during the PaymentIntent lifecycle. */
  @SerializedName("hooks")
  Hooks hooks;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Provides industry-specific information about the charge. */
  @SerializedName("payment_details")
  PaymentDetails paymentDetails;

  /** Payment method-specific configuration for this PaymentIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card or
   * card charge. This value overrides the account's default statement descriptor. For information
   * about requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The parameters used to automatically create a transfer after the payment is captured. Learn
   * more about the <a href="https://docs.stripe.com/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private PaymentIntentIncrementAuthorizationParams(
      Long amount,
      AmountDetails amountDetails,
      Long applicationFeeAmount,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Hooks hooks,
      Map<String, String> metadata,
      PaymentDetails paymentDetails,
      PaymentMethodOptions paymentMethodOptions,
      String statementDescriptor,
      TransferData transferData) {
    this.amount = amount;
    this.amountDetails = amountDetails;
    this.applicationFeeAmount = applicationFeeAmount;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.hooks = hooks;
    this.metadata = metadata;
    this.paymentDetails = paymentDetails;
    this.paymentMethodOptions = paymentMethodOptions;
    this.statementDescriptor = statementDescriptor;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private AmountDetails amountDetails;

    private Long applicationFeeAmount;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Hooks hooks;

    private Map<String, String> metadata;

    private PaymentDetails paymentDetails;

    private PaymentMethodOptions paymentMethodOptions;

    private String statementDescriptor;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentIncrementAuthorizationParams build() {
      return new PaymentIntentIncrementAuthorizationParams(
          this.amount,
          this.amountDetails,
          this.applicationFeeAmount,
          this.description,
          this.expand,
          this.extraParams,
          this.hooks,
          this.metadata,
          this.paymentDetails,
          this.paymentMethodOptions,
          this.statementDescriptor,
          this.transferData);
    }

    /**
     * <strong>Required.</strong> The updated total amount that you intend to collect from the
     * cardholder. This amount must be greater than the currently authorized amount.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** Provides industry-specific information about the amount. */
    public Builder setAmountDetails(
        PaymentIntentIncrementAuthorizationParams.AmountDetails amountDetails) {
      this.amountDetails = amountDetails;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total amount captured. For more information,
     * see the PaymentIntents <a href="https://docs.stripe.com/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentIncrementAuthorizationParams#expand} for the field documentation.
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
     * PaymentIntentIncrementAuthorizationParams#expand} for the field documentation.
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
     * PaymentIntentIncrementAuthorizationParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentIncrementAuthorizationParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Automations to be run during the PaymentIntent lifecycle. */
    public Builder setHooks(PaymentIntentIncrementAuthorizationParams.Hooks hooks) {
      this.hooks = hooks;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentIncrementAuthorizationParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentIncrementAuthorizationParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Provides industry-specific information about the charge. */
    public Builder setPaymentDetails(
        PaymentIntentIncrementAuthorizationParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /** Payment method-specific configuration for this PaymentIntent. */
    public Builder setPaymentMethodOptions(
        PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card or
     * card charge. This value overrides the account's default statement descriptor. For information
     * about requirements, including the 22-character limit, see <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
     * Descriptor docs</a>.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The parameters used to automatically create a transfer after the payment is captured. Learn
     * more about the <a href="https://docs.stripe.com/payments/connected-accounts">use case for
     * connected accounts</a>.
     */
    public Builder setTransferData(
        PaymentIntentIncrementAuthorizationParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails {
    /**
     * The total discount applied on the transaction represented in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An integer
     * greater than 0.
     *
     * <p>This field is mutually exclusive with the {@code
     * amount_details[line_items][#][discount_amount]} field.
     */
    @SerializedName("discount_amount")
    Object discountAmount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A list of line items, each containing information about a product in the PaymentIntent. There
     * is a maximum of 200 line items.
     */
    @SerializedName("line_items")
    Object lineItems;

    /** Contains information about the shipping portion of the amount. */
    @SerializedName("shipping")
    Object shipping;

    /** Contains information about the tax portion of the amount. */
    @SerializedName("tax")
    Object tax;

    private AmountDetails(
        Object discountAmount,
        Map<String, Object> extraParams,
        Object lineItems,
        Object shipping,
        Object tax) {
      this.discountAmount = discountAmount;
      this.extraParams = extraParams;
      this.lineItems = lineItems;
      this.shipping = shipping;
      this.tax = tax;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object discountAmount;

      private Map<String, Object> extraParams;

      private Object lineItems;

      private Object shipping;

      private Object tax;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentIncrementAuthorizationParams.AmountDetails build() {
        return new PaymentIntentIncrementAuthorizationParams.AmountDetails(
            this.discountAmount, this.extraParams, this.lineItems, this.shipping, this.tax);
      }

      /**
       * The total discount applied on the transaction represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
       * integer greater than 0.
       *
       * <p>This field is mutually exclusive with the {@code
       * amount_details[line_items][#][discount_amount]} field.
       */
      public Builder setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
        return this;
      }

      /**
       * The total discount applied on the transaction represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
       * integer greater than 0.
       *
       * <p>This field is mutually exclusive with the {@code
       * amount_details[line_items][#][discount_amount]} field.
       */
      public Builder setDiscountAmount(EmptyParam discountAmount) {
        this.discountAmount = discountAmount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentIncrementAuthorizationParams.AmountDetails#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentIncrementAuthorizationParams.AmountDetails#extraParams} for the
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
       * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentIncrementAuthorizationParams.AmountDetails#lineItems} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addLineItem(
          PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem element) {
        if (this.lineItems == null || this.lineItems instanceof EmptyParam) {
          this.lineItems =
              new ArrayList<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem>();
        }
        ((List<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem>) this.lineItems)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentIncrementAuthorizationParams.AmountDetails#lineItems} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllLineItem(
          List<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem> elements) {
        if (this.lineItems == null || this.lineItems instanceof EmptyParam) {
          this.lineItems =
              new ArrayList<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem>();
        }
        ((List<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem>) this.lineItems)
            .addAll(elements);
        return this;
      }

      /**
       * A list of line items, each containing information about a product in the PaymentIntent.
       * There is a maximum of 200 line items.
       */
      public Builder setLineItems(EmptyParam lineItems) {
        this.lineItems = lineItems;
        return this;
      }

      /**
       * A list of line items, each containing information about a product in the PaymentIntent.
       * There is a maximum of 200 line items.
       */
      public Builder setLineItems(
          List<PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(
          PaymentIntentIncrementAuthorizationParams.AmountDetails.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(EmptyParam shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the tax portion of the amount. */
      public Builder setTax(PaymentIntentIncrementAuthorizationParams.AmountDetails.Tax tax) {
        this.tax = tax;
        return this;
      }

      /** Contains information about the tax portion of the amount. */
      public Builder setTax(EmptyParam tax) {
        this.tax = tax;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem {
      /**
       * The discount applied on this line item represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
       * integer greater than 0.
       *
       * <p>This field is mutually exclusive with the {@code amount_details[discount_amount]} field.
       */
      @SerializedName("discount_amount")
      Long discountAmount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Payment method-specific information for line items. */
      @SerializedName("payment_method_options")
      PaymentMethodOptions paymentMethodOptions;

      /**
       * The product code of the line item, such as an SKU. Required for L3 rates. At most 12
       * characters long.
       */
      @SerializedName("product_code")
      String productCode;

      /**
       * <strong>Required.</strong> The product name of the line item. Required for L3 rates. At
       * most 1024 characters long.
       *
       * <p>For Cards, this field is truncated to 26 alphanumeric characters before being sent to
       * the card networks. For Paypal, this field is truncated to 127 characters.
       */
      @SerializedName("product_name")
      String productName;

      /**
       * <strong>Required.</strong> The quantity of items. Required for L3 rates. An integer greater
       * than 0.
       */
      @SerializedName("quantity")
      Long quantity;

      /** Contains information about the tax on the item. */
      @SerializedName("tax")
      Tax tax;

      /**
       * <strong>Required.</strong> The unit cost of the line item represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. Required
       * for L3 rates. An integer greater than or equal to 0.
       */
      @SerializedName("unit_cost")
      Long unitCost;

      /** A unit of measure for the line item, such as gallons, feet, meters, etc. */
      @SerializedName("unit_of_measure")
      String unitOfMeasure;

      private LineItem(
          Long discountAmount,
          Map<String, Object> extraParams,
          PaymentMethodOptions paymentMethodOptions,
          String productCode,
          String productName,
          Long quantity,
          Tax tax,
          Long unitCost,
          String unitOfMeasure) {
        this.discountAmount = discountAmount;
        this.extraParams = extraParams;
        this.paymentMethodOptions = paymentMethodOptions;
        this.productCode = productCode;
        this.productName = productName;
        this.quantity = quantity;
        this.tax = tax;
        this.unitCost = unitCost;
        this.unitOfMeasure = unitOfMeasure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long discountAmount;

        private Map<String, Object> extraParams;

        private PaymentMethodOptions paymentMethodOptions;

        private String productCode;

        private String productName;

        private Long quantity;

        private Tax tax;

        private Long unitCost;

        private String unitOfMeasure;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem build() {
          return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem(
              this.discountAmount,
              this.extraParams,
              this.paymentMethodOptions,
              this.productCode,
              this.productName,
              this.quantity,
              this.tax,
              this.unitCost,
              this.unitOfMeasure);
        }

        /**
         * The discount applied on this line item represented in the <a
         * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
         * integer greater than 0.
         *
         * <p>This field is mutually exclusive with the {@code amount_details[discount_amount]}
         * field.
         */
        public Builder setDiscountAmount(Long discountAmount) {
          this.discountAmount = discountAmount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem#extraParams} for the
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
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Payment method-specific information for line items. */
        public Builder setPaymentMethodOptions(
            PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions
                paymentMethodOptions) {
          this.paymentMethodOptions = paymentMethodOptions;
          return this;
        }

        /**
         * The product code of the line item, such as an SKU. Required for L3 rates. At most 12
         * characters long.
         */
        public Builder setProductCode(String productCode) {
          this.productCode = productCode;
          return this;
        }

        /**
         * <strong>Required.</strong> The product name of the line item. Required for L3 rates. At
         * most 1024 characters long.
         *
         * <p>For Cards, this field is truncated to 26 alphanumeric characters before being sent to
         * the card networks. For Paypal, this field is truncated to 127 characters.
         */
        public Builder setProductName(String productName) {
          this.productName = productName;
          return this;
        }

        /**
         * <strong>Required.</strong> The quantity of items. Required for L3 rates. An integer
         * greater than 0.
         */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /** Contains information about the tax on the item. */
        public Builder setTax(
            PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.Tax tax) {
          this.tax = tax;
          return this;
        }

        /**
         * <strong>Required.</strong> The unit cost of the line item represented in the <a
         * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         * Required for L3 rates. An integer greater than or equal to 0.
         */
        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
          return this;
        }

        /** A unit of measure for the line item, such as gallons, feet, meters, etc. */
        public Builder setUnitOfMeasure(String unitOfMeasure) {
          this.unitOfMeasure = unitOfMeasure;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentMethodOptions {
        /**
         * This sub-hash contains line item details that are specific to {@code card} payment
         * method.&quot;.
         */
        @SerializedName("card")
        Card card;

        /**
         * This sub-hash contains line item details that are specific to {@code card_present}
         * payment method.&quot;.
         */
        @SerializedName("card_present")
        CardPresent cardPresent;

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
         * This sub-hash contains line item details that are specific to {@code klarna} payment
         * method.&quot;.
         */
        @SerializedName("klarna")
        Klarna klarna;

        /**
         * This sub-hash contains line item details that are specific to {@code paypal} payment
         * method.&quot;.
         */
        @SerializedName("paypal")
        Paypal paypal;

        private PaymentMethodOptions(
            Card card,
            CardPresent cardPresent,
            Map<String, Object> extraParams,
            Klarna klarna,
            Paypal paypal) {
          this.card = card;
          this.cardPresent = cardPresent;
          this.extraParams = extraParams;
          this.klarna = klarna;
          this.paypal = paypal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Card card;

          private CardPresent cardPresent;

          private Map<String, Object> extraParams;

          private Klarna klarna;

          private Paypal paypal;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                  .PaymentMethodOptions
              build() {
            return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                .PaymentMethodOptions(
                this.card, this.cardPresent, this.extraParams, this.klarna, this.paypal);
          }

          /**
           * This sub-hash contains line item details that are specific to {@code card} payment
           * method.&quot;.
           */
          public Builder setCard(
              PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions
                      .Card
                  card) {
            this.card = card;
            return this;
          }

          /**
           * This sub-hash contains line item details that are specific to {@code card_present}
           * payment method.&quot;.
           */
          public Builder setCardPresent(
              PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions
                      .CardPresent
                  cardPresent) {
            this.cardPresent = cardPresent;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions#extraParams}
           * for the field documentation.
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
           * map. See {@link
           * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * This sub-hash contains line item details that are specific to {@code klarna} payment
           * method.&quot;.
           */
          public Builder setKlarna(
              PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions
                      .Klarna
                  klarna) {
            this.klarna = klarna;
            return this;
          }

          /**
           * This sub-hash contains line item details that are specific to {@code paypal} payment
           * method.&quot;.
           */
          public Builder setPaypal(
              PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions
                      .Paypal
                  paypal) {
            this.paypal = paypal;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Card {
          /**
           * Identifier that categorizes the items being purchased using a standardized commodity
           * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, etc.
           */
          @SerializedName("commodity_code")
          String commodityCode;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Card(String commodityCode, Map<String, Object> extraParams) {
            this.commodityCode = commodityCode;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String commodityCode;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                    .PaymentMethodOptions.Card
                build() {
              return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                  .PaymentMethodOptions.Card(this.commodityCode, this.extraParams);
            }

            /**
             * Identifier that categorizes the items being purchased using a standardized commodity
             * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, etc.
             */
            public Builder setCommodityCode(String commodityCode) {
              this.commodityCode = commodityCode;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Card#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Card#extraParams}
             * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class CardPresent {
          /**
           * Identifier that categorizes the items being purchased using a standardized commodity
           * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, etc.
           */
          @SerializedName("commodity_code")
          String commodityCode;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private CardPresent(String commodityCode, Map<String, Object> extraParams) {
            this.commodityCode = commodityCode;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String commodityCode;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                    .PaymentMethodOptions.CardPresent
                build() {
              return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                  .PaymentMethodOptions.CardPresent(this.commodityCode, this.extraParams);
            }

            /**
             * Identifier that categorizes the items being purchased using a standardized commodity
             * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, etc.
             */
            public Builder setCommodityCode(String commodityCode) {
              this.commodityCode = commodityCode;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.CardPresent#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.CardPresent#extraParams}
             * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class Klarna {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** URL to an image for the product. Max length, 4096 characters. */
          @SerializedName("image_url")
          String imageUrl;

          /** URL to the product page. Max length, 4096 characters. */
          @SerializedName("product_url")
          String productUrl;

          /**
           * Unique reference for this line item to correlate it with your system’s internal
           * records. The field is displayed in the Klarna Consumer App if passed.
           */
          @SerializedName("reference")
          String reference;

          /** Reference for the subscription this line item is for. */
          @SerializedName("subscription_reference")
          String subscriptionReference;

          private Klarna(
              Map<String, Object> extraParams,
              String imageUrl,
              String productUrl,
              String reference,
              String subscriptionReference) {
            this.extraParams = extraParams;
            this.imageUrl = imageUrl;
            this.productUrl = productUrl;
            this.reference = reference;
            this.subscriptionReference = subscriptionReference;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String imageUrl;

            private String productUrl;

            private String reference;

            private String subscriptionReference;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                    .PaymentMethodOptions.Klarna
                build() {
              return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                  .PaymentMethodOptions.Klarna(
                  this.extraParams,
                  this.imageUrl,
                  this.productUrl,
                  this.reference,
                  this.subscriptionReference);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** URL to an image for the product. Max length, 4096 characters. */
            public Builder setImageUrl(String imageUrl) {
              this.imageUrl = imageUrl;
              return this;
            }

            /** URL to the product page. Max length, 4096 characters. */
            public Builder setProductUrl(String productUrl) {
              this.productUrl = productUrl;
              return this;
            }

            /**
             * Unique reference for this line item to correlate it with your system’s internal
             * records. The field is displayed in the Klarna Consumer App if passed.
             */
            public Builder setReference(String reference) {
              this.reference = reference;
              return this;
            }

            /** Reference for the subscription this line item is for. */
            public Builder setSubscriptionReference(String subscriptionReference) {
              this.subscriptionReference = subscriptionReference;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Paypal {
          /** Type of the line item. */
          @SerializedName("category")
          Category category;

          /** Description of the line item. */
          @SerializedName("description")
          String description;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The Stripe account ID of the connected account that sells the item. */
          @SerializedName("sold_by")
          String soldBy;

          private Paypal(
              Category category,
              String description,
              Map<String, Object> extraParams,
              String soldBy) {
            this.category = category;
            this.description = description;
            this.extraParams = extraParams;
            this.soldBy = soldBy;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Category category;

            private String description;

            private Map<String, Object> extraParams;

            private String soldBy;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                    .PaymentMethodOptions.Paypal
                build() {
              return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                  .PaymentMethodOptions.Paypal(
                  this.category, this.description, this.extraParams, this.soldBy);
            }

            /** Type of the line item. */
            public Builder setCategory(
                PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem
                        .PaymentMethodOptions.Paypal.Category
                    category) {
              this.category = category;
              return this;
            }

            /** Description of the line item. */
            public Builder setDescription(String description) {
              this.description = description;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The Stripe account ID of the connected account that sells the item. */
            public Builder setSoldBy(String soldBy) {
              this.soldBy = soldBy;
              return this;
            }
          }

          public enum Category implements ApiRequestParams.EnumParam {
            @SerializedName("digital_goods")
            DIGITAL_GOODS("digital_goods"),

            @SerializedName("donation")
            DONATION("donation"),

            @SerializedName("physical_goods")
            PHYSICAL_GOODS("physical_goods");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Category(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax {
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
         * <strong>Required.</strong> The total amount of tax on a single line item represented in
         * the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         * Required for L3 rates. An integer greater than or equal to 0.
         *
         * <p>This field is mutually exclusive with the {@code
         * amount_details[tax][total_tax_amount]} field.
         */
        @SerializedName("total_tax_amount")
        Long totalTaxAmount;

        private Tax(Map<String, Object> extraParams, Long totalTaxAmount) {
          this.extraParams = extraParams;
          this.totalTaxAmount = totalTaxAmount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long totalTaxAmount;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.Tax build() {
            return new PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.Tax(
                this.extraParams, this.totalTaxAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.Tax#extraParams} for
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
           * map. See {@link
           * PaymentIntentIncrementAuthorizationParams.AmountDetails.LineItem.Tax#extraParams} for
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
           * <strong>Required.</strong> The total amount of tax on a single line item represented in
           * the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
           * unit</a>. Required for L3 rates. An integer greater than or equal to 0.
           *
           * <p>This field is mutually exclusive with the {@code
           * amount_details[tax][total_tax_amount]} field.
           */
          public Builder setTotalTaxAmount(Long totalTaxAmount) {
            this.totalTaxAmount = totalTaxAmount;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Shipping {
      /**
       * If a physical good is being shipped, the cost of shipping represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
       * integer greater than or equal to 0.
       */
      @SerializedName("amount")
      Object amount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * If a physical good is being shipped, the postal code of where it is being shipped from. At
       * most 10 alphanumeric characters long, hyphens are allowed.
       */
      @SerializedName("from_postal_code")
      Object fromPostalCode;

      /**
       * If a physical good is being shipped, the postal code of where it is being shipped to. At
       * most 10 alphanumeric characters long, hyphens are allowed.
       */
      @SerializedName("to_postal_code")
      Object toPostalCode;

      private Shipping(
          Object amount,
          Map<String, Object> extraParams,
          Object fromPostalCode,
          Object toPostalCode) {
        this.amount = amount;
        this.extraParams = extraParams;
        this.fromPostalCode = fromPostalCode;
        this.toPostalCode = toPostalCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object amount;

        private Map<String, Object> extraParams;

        private Object fromPostalCode;

        private Object toPostalCode;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentIncrementAuthorizationParams.AmountDetails.Shipping build() {
          return new PaymentIntentIncrementAuthorizationParams.AmountDetails.Shipping(
              this.amount, this.extraParams, this.fromPostalCode, this.toPostalCode);
        }

        /**
         * If a physical good is being shipped, the cost of shipping represented in the <a
         * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
         * integer greater than or equal to 0.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * If a physical good is being shipped, the cost of shipping represented in the <a
         * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. An
         * integer greater than or equal to 0.
         */
        public Builder setAmount(EmptyParam amount) {
          this.amount = amount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.AmountDetails.Shipping#extraParams} for the
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
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.AmountDetails.Shipping#extraParams} for the
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
         * If a physical good is being shipped, the postal code of where it is being shipped from.
         * At most 10 alphanumeric characters long, hyphens are allowed.
         */
        public Builder setFromPostalCode(String fromPostalCode) {
          this.fromPostalCode = fromPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped from.
         * At most 10 alphanumeric characters long, hyphens are allowed.
         */
        public Builder setFromPostalCode(EmptyParam fromPostalCode) {
          this.fromPostalCode = fromPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped to. At
         * most 10 alphanumeric characters long, hyphens are allowed.
         */
        public Builder setToPostalCode(String toPostalCode) {
          this.toPostalCode = toPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped to. At
         * most 10 alphanumeric characters long, hyphens are allowed.
         */
        public Builder setToPostalCode(EmptyParam toPostalCode) {
          this.toPostalCode = toPostalCode;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The total amount of tax on the transaction represented in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>. Required
       * for L2 rates. An integer greater than or equal to 0.
       *
       * <p>This field is mutually exclusive with the {@code
       * amount_details[line_items][#][tax][total_tax_amount]} field.
       */
      @SerializedName("total_tax_amount")
      Long totalTaxAmount;

      private Tax(Map<String, Object> extraParams, Long totalTaxAmount) {
        this.extraParams = extraParams;
        this.totalTaxAmount = totalTaxAmount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long totalTaxAmount;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentIncrementAuthorizationParams.AmountDetails.Tax build() {
          return new PaymentIntentIncrementAuthorizationParams.AmountDetails.Tax(
              this.extraParams, this.totalTaxAmount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentIncrementAuthorizationParams.AmountDetails.Tax#extraParams}
         * for the field documentation.
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
         * map. See {@link PaymentIntentIncrementAuthorizationParams.AmountDetails.Tax#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The total amount of tax on the transaction represented in the
         * <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         * Required for L2 rates. An integer greater than or equal to 0.
         *
         * <p>This field is mutually exclusive with the {@code
         * amount_details[line_items][#][tax][total_tax_amount]} field.
         */
        public Builder setTotalTaxAmount(Long totalTaxAmount) {
          this.totalTaxAmount = totalTaxAmount;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Hooks {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Arguments passed in automations. */
    @SerializedName("inputs")
    Inputs inputs;

    private Hooks(Map<String, Object> extraParams, Inputs inputs) {
      this.extraParams = extraParams;
      this.inputs = inputs;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Inputs inputs;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentIncrementAuthorizationParams.Hooks build() {
        return new PaymentIntentIncrementAuthorizationParams.Hooks(this.extraParams, this.inputs);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentIncrementAuthorizationParams.Hooks#extraParams} for the field documentation.
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
       * See {@link PaymentIntentIncrementAuthorizationParams.Hooks#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Arguments passed in automations. */
      public Builder setInputs(PaymentIntentIncrementAuthorizationParams.Hooks.Inputs inputs) {
        this.inputs = inputs;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Inputs {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Tax arguments for automations. */
      @SerializedName("tax")
      Tax tax;

      private Inputs(Map<String, Object> extraParams, Tax tax) {
        this.extraParams = extraParams;
        this.tax = tax;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Tax tax;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentIncrementAuthorizationParams.Hooks.Inputs build() {
          return new PaymentIntentIncrementAuthorizationParams.Hooks.Inputs(
              this.extraParams, this.tax);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentIncrementAuthorizationParams.Hooks.Inputs#extraParams} for
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
         * map. See {@link PaymentIntentIncrementAuthorizationParams.Hooks.Inputs#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Tax arguments for automations. */
        public Builder setTax(PaymentIntentIncrementAuthorizationParams.Hooks.Inputs.Tax tax) {
          this.tax = tax;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax {
        /**
         * <strong>Required.</strong> The <a
         * href="https://docs.stripe.com/api/tax/calculations">TaxCalculation</a> id
         */
        @SerializedName("calculation")
        Object calculation;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Tax(Object calculation, Map<String, Object> extraParams) {
          this.calculation = calculation;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object calculation;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentIncrementAuthorizationParams.Hooks.Inputs.Tax build() {
            return new PaymentIntentIncrementAuthorizationParams.Hooks.Inputs.Tax(
                this.calculation, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/tax/calculations">TaxCalculation</a> id
           */
          public Builder setCalculation(String calculation) {
            this.calculation = calculation;
            return this;
          }

          /**
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/tax/calculations">TaxCalculation</a> id
           */
          public Builder setCalculation(EmptyParam calculation) {
            this.calculation = calculation;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentIncrementAuthorizationParams.Hooks.Inputs.Tax#extraParams}
           * for the field documentation.
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
           * map. See {@link PaymentIntentIncrementAuthorizationParams.Hooks.Inputs.Tax#extraParams}
           * for the field documentation.
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
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDetails {
    /**
     * A unique value to identify the customer. This field is available only for card payments.
     *
     * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being sent
     * to card networks.
     */
    @SerializedName("customer_reference")
    Object customerReference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A unique value assigned by the business to identify the transaction. Required for L2 and L3
     * rates.
     *
     * <p>Required when the Payment Method Types array contains {@code card}, including when <a
     * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
     * is set to {@code true}.
     *
     * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces, before
     * being sent to card networks. For Klarna, this field is truncated to 255 characters and is
     * visible to customers when they view the order in the Klarna app.
     */
    @SerializedName("order_reference")
    Object orderReference;

    private PaymentDetails(
        Object customerReference, Map<String, Object> extraParams, Object orderReference) {
      this.customerReference = customerReference;
      this.extraParams = extraParams;
      this.orderReference = orderReference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object customerReference;

      private Map<String, Object> extraParams;

      private Object orderReference;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentIncrementAuthorizationParams.PaymentDetails build() {
        return new PaymentIntentIncrementAuthorizationParams.PaymentDetails(
            this.customerReference, this.extraParams, this.orderReference);
      }

      /**
       * A unique value to identify the customer. This field is available only for card payments.
       *
       * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being
       * sent to card networks.
       */
      public Builder setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /**
       * A unique value to identify the customer. This field is available only for card payments.
       *
       * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being
       * sent to card networks.
       */
      public Builder setCustomerReference(EmptyParam customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentIncrementAuthorizationParams.PaymentDetails#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentIncrementAuthorizationParams.PaymentDetails#extraParams} for the
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
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates.
       *
       * <p>Required when the Payment Method Types array contains {@code card}, including when <a
       * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
       * is set to {@code true}.
       *
       * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks. For Klarna, this field is truncated to 255 characters
       * and is visible to customers when they view the order in the Klarna app.
       */
      public Builder setOrderReference(String orderReference) {
        this.orderReference = orderReference;
        return this;
      }

      /**
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates.
       *
       * <p>Required when the Payment Method Types array contains {@code card}, including when <a
       * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
       * is set to {@code true}.
       *
       * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks. For Klarna, this field is truncated to 255 characters
       * and is visible to customers when they view the order in the Klarna app.
       */
      public Builder setOrderReference(EmptyParam orderReference) {
        this.orderReference = orderReference;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions {
    /** Configuration for any card payments attempted on this PaymentIntent. */
    @SerializedName("card")
    Card card;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PaymentMethodOptions(Card card, Map<String, Object> extraParams) {
      this.card = card;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions build() {
        return new PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions(
            this.card, this.extraParams);
      }

      /** Configuration for any card payments attempted on this PaymentIntent. */
      public Builder setCard(
          PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Request partial authorization on this PaymentIntent. */
      @SerializedName("request_partial_authorization")
      RequestPartialAuthorization requestPartialAuthorization;

      private Card(
          Map<String, Object> extraParams,
          RequestPartialAuthorization requestPartialAuthorization) {
        this.extraParams = extraParams;
        this.requestPartialAuthorization = requestPartialAuthorization;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private RequestPartialAuthorization requestPartialAuthorization;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card build() {
          return new PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card(
              this.extraParams, this.requestPartialAuthorization);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link
         * PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Request partial authorization on this PaymentIntent. */
        public Builder setRequestPartialAuthorization(
            PaymentIntentIncrementAuthorizationParams.PaymentMethodOptions.Card
                    .RequestPartialAuthorization
                requestPartialAuthorization) {
          this.requestPartialAuthorization = requestPartialAuthorization;
          return this;
        }
      }

      public enum RequestPartialAuthorization implements ApiRequestParams.EnumParam {
        @SerializedName("if_available")
        IF_AVAILABLE("if_available"),

        @SerializedName("never")
        NEVER("never");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestPartialAuthorization(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData {
    /** The amount that will be transferred automatically when a charge succeeds. */
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

    private TransferData(Long amount, Map<String, Object> extraParams) {
      this.amount = amount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentIncrementAuthorizationParams.TransferData build() {
        return new PaymentIntentIncrementAuthorizationParams.TransferData(
            this.amount, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentIncrementAuthorizationParams.TransferData#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentIncrementAuthorizationParams.TransferData#extraParams} for the
       * field documentation.
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
}
