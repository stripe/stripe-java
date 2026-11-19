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
public class PaymentIntentCaptureParams extends ApiRequestParams {
  /** Provides industry-specific information about the amount. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /**
   * The amount to capture from the PaymentIntent, which must be less than or equal to the original
   * amount. Defaults to the full {@code amount_capturable} if it's not provided.
   */
  @SerializedName("amount_to_capture")
  Long amountToCapture;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. The amount of the application fee
   * collected will be capped at the total amount captured. For more information, see the
   * PaymentIntents <a href="https://docs.stripe.com/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

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
   * Defaults to {@code true}. When capturing a PaymentIntent, setting {@code final_capture} to
   * {@code false} notifies Stripe to not release the remaining uncaptured funds to make sure that
   * they're captured in future requests. You can only use this setting when <a
   * href="https://docs.stripe.com/payments/multicapture">multicapture</a> is available for
   * PaymentIntents.
   */
  @SerializedName("final_capture")
  Boolean finalCapture;

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
  Object metadata;

  /** Provides industry-specific information about the charge. */
  @SerializedName("payment_details")
  Object paymentDetails;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card
   * charge. This value overrides the account's default statement descriptor. For information about
   * requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   *
   * <p>Setting this value for a card charge returns an error. For card charges, set the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
   * instead.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * The parameters that you can use to automatically create a transfer after the payment is
   * captured. Learn more about the <a
   * href="https://docs.stripe.com/payments/connected-accounts">use case for connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private PaymentIntentCaptureParams(
      AmountDetails amountDetails,
      Long amountToCapture,
      Long applicationFeeAmount,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean finalCapture,
      Hooks hooks,
      Object metadata,
      Object paymentDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData) {
    this.amountDetails = amountDetails;
    this.amountToCapture = amountToCapture;
    this.applicationFeeAmount = applicationFeeAmount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.finalCapture = finalCapture;
    this.hooks = hooks;
    this.metadata = metadata;
    this.paymentDetails = paymentDetails;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AmountDetails amountDetails;

    private Long amountToCapture;

    private Long applicationFeeAmount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean finalCapture;

    private Hooks hooks;

    private Object metadata;

    private Object paymentDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentCaptureParams build() {
      return new PaymentIntentCaptureParams(
          this.amountDetails,
          this.amountToCapture,
          this.applicationFeeAmount,
          this.expand,
          this.extraParams,
          this.finalCapture,
          this.hooks,
          this.metadata,
          this.paymentDetails,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData);
    }

    /** Provides industry-specific information about the amount. */
    public Builder setAmountDetails(PaymentIntentCaptureParams.AmountDetails amountDetails) {
      this.amountDetails = amountDetails;
      return this;
    }

    /**
     * The amount to capture from the PaymentIntent, which must be less than or equal to the
     * original amount. Defaults to the full {@code amount_capturable} if it's not provided.
     */
    public Builder setAmountToCapture(Long amountToCapture) {
      this.amountToCapture = amountToCapture;
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

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCaptureParams#expand} for the field documentation.
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
     * PaymentIntentCaptureParams#expand} for the field documentation.
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
     * PaymentIntentCaptureParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentCaptureParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Defaults to {@code true}. When capturing a PaymentIntent, setting {@code final_capture} to
     * {@code false} notifies Stripe to not release the remaining uncaptured funds to make sure that
     * they're captured in future requests. You can only use this setting when <a
     * href="https://docs.stripe.com/payments/multicapture">multicapture</a> is available for
     * PaymentIntents.
     */
    public Builder setFinalCapture(Boolean finalCapture) {
      this.finalCapture = finalCapture;
      return this;
    }

    /** Automations to be run during the PaymentIntent lifecycle. */
    public Builder setHooks(PaymentIntentCaptureParams.Hooks hooks) {
      this.hooks = hooks;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCaptureParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentCaptureParams#metadata} for the field documentation.
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

    /** Provides industry-specific information about the charge. */
    public Builder setPaymentDetails(PaymentIntentCaptureParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /** Provides industry-specific information about the charge. */
    public Builder setPaymentDetails(EmptyParam paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card
     * charge. This value overrides the account's default statement descriptor. For information
     * about requirements, including the 22-character limit, see <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
     * Descriptor docs</a>.
     *
     * <p>Setting this value for a card charge returns an error. For card charges, set the <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
     * instead.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Provides information about a card charge. Concatenated to the account's <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
     * descriptor prefix</a> to form the complete statement descriptor that appears on the
     * customer's statement.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * The parameters that you can use to automatically create a transfer after the payment is
     * captured. Learn more about the <a
     * href="https://docs.stripe.com/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    public Builder setTransferData(PaymentIntentCaptureParams.TransferData transferData) {
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
     * Set to {@code false} to return arithmetic validation errors in the response without failing
     * the request. Use this when you want the operation to proceed regardless of arithmetic errors
     * in the line item data.
     *
     * <p>Omit or set to {@code true} to immediately return a 400 error when arithmetic validation
     * fails. Use this for strict validation that prevents processing with line item data that has
     * arithmetic inconsistencies.
     *
     * <p>For card payments, Stripe doesn't send line item data to card networks if there's an
     * arithmetic validation error.
     */
    @SerializedName("enforce_arithmetic_validation")
    Boolean enforceArithmeticValidation;

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
        Boolean enforceArithmeticValidation,
        Map<String, Object> extraParams,
        Object lineItems,
        Object shipping,
        Object tax) {
      this.discountAmount = discountAmount;
      this.enforceArithmeticValidation = enforceArithmeticValidation;
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

      private Boolean enforceArithmeticValidation;

      private Map<String, Object> extraParams;

      private Object lineItems;

      private Object shipping;

      private Object tax;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCaptureParams.AmountDetails build() {
        return new PaymentIntentCaptureParams.AmountDetails(
            this.discountAmount,
            this.enforceArithmeticValidation,
            this.extraParams,
            this.lineItems,
            this.shipping,
            this.tax);
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
       * Set to {@code false} to return arithmetic validation errors in the response without failing
       * the request. Use this when you want the operation to proceed regardless of arithmetic
       * errors in the line item data.
       *
       * <p>Omit or set to {@code true} to immediately return a 400 error when arithmetic validation
       * fails. Use this for strict validation that prevents processing with line item data that has
       * arithmetic inconsistencies.
       *
       * <p>For card payments, Stripe doesn't send line item data to card networks if there's an
       * arithmetic validation error.
       */
      public Builder setEnforceArithmeticValidation(Boolean enforceArithmeticValidation) {
        this.enforceArithmeticValidation = enforceArithmeticValidation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.AmountDetails#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.AmountDetails#extraParams} for the field
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
       * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.AmountDetails#lineItems} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addLineItem(PaymentIntentCaptureParams.AmountDetails.LineItem element) {
        if (this.lineItems == null || this.lineItems instanceof EmptyParam) {
          this.lineItems = new ArrayList<PaymentIntentCaptureParams.AmountDetails.LineItem>();
        }
        ((List<PaymentIntentCaptureParams.AmountDetails.LineItem>) this.lineItems).add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.AmountDetails#lineItems} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllLineItem(
          List<PaymentIntentCaptureParams.AmountDetails.LineItem> elements) {
        if (this.lineItems == null || this.lineItems instanceof EmptyParam) {
          this.lineItems = new ArrayList<PaymentIntentCaptureParams.AmountDetails.LineItem>();
        }
        ((List<PaymentIntentCaptureParams.AmountDetails.LineItem>) this.lineItems).addAll(elements);
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
          List<PaymentIntentCaptureParams.AmountDetails.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(PaymentIntentCaptureParams.AmountDetails.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(EmptyParam shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the tax portion of the amount. */
      public Builder setTax(PaymentIntentCaptureParams.AmountDetails.Tax tax) {
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
       * the card networks. For PayPal, this field is truncated to 127 characters.
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
        public PaymentIntentCaptureParams.AmountDetails.LineItem build() {
          return new PaymentIntentCaptureParams.AmountDetails.LineItem(
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
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.LineItem#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.LineItem#extraParams} for the
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
            PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
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
         * the card networks. For PayPal, this field is truncated to 127 characters.
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
        public Builder setTax(PaymentIntentCaptureParams.AmountDetails.LineItem.Tax tax) {
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
         * This sub-hash contains line item details that are specific to the {@code card} payment
         * method.
         */
        @SerializedName("card")
        Card card;

        /**
         * This sub-hash contains line item details that are specific to the {@code card_present}
         * payment method.
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
         * This sub-hash contains line item details that are specific to the {@code klarna} payment
         * method.
         */
        @SerializedName("klarna")
        Klarna klarna;

        /**
         * This sub-hash contains line item details that are specific to the {@code paypal} payment
         * method.
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
          public PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions build() {
            return new PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions(
                this.card, this.cardPresent, this.extraParams, this.klarna, this.paypal);
          }

          /**
           * This sub-hash contains line item details that are specific to the {@code card} payment
           * method.
           */
          public Builder setCard(
              PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Card card) {
            this.card = card;
            return this;
          }

          /**
           * This sub-hash contains line item details that are specific to the {@code card_present}
           * payment method.
           */
          public Builder setCardPresent(
              PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.CardPresent
                  cardPresent) {
            this.cardPresent = cardPresent;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions#extraParams} for
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
           * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions#extraParams} for
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
           * This sub-hash contains line item details that are specific to the {@code klarna}
           * payment method.
           */
          public Builder setKlarna(
              PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna
                  klarna) {
            this.klarna = klarna;
            return this;
          }

          /**
           * This sub-hash contains line item details that are specific to the {@code paypal}
           * payment method.
           */
          public Builder setPaypal(
              PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal
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
           * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, and so on.
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
            public PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Card
                build() {
              return new PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
                  .Card(this.commodityCode, this.extraParams);
            }

            /**
             * Identifier that categorizes the items being purchased using a standardized commodity
             * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, and so on.
             */
            public Builder setCommodityCode(String commodityCode) {
              this.commodityCode = commodityCode;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Card#extraParams}
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Card#extraParams}
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
           * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, and so on.
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
            public PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
                    .CardPresent
                build() {
              return new PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
                  .CardPresent(this.commodityCode, this.extraParams);
            }

            /**
             * Identifier that categorizes the items being purchased using a standardized commodity
             * scheme such as (but not limited to) UNSPSC, NAICS, NAPCS, and so on.
             */
            public Builder setCommodityCode(String commodityCode) {
              this.commodityCode = commodityCode;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.CardPresent#extraParams}
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.CardPresent#extraParams}
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
            public PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna
                build() {
              return new PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
                  .Klarna(
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna#extraParams}
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Klarna#extraParams}
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
            public PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal
                build() {
              return new PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions
                  .Paypal(this.category, this.description, this.extraParams, this.soldBy);
            }

            /** Type of the line item. */
            public Builder setCategory(
                PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal
                        .Category
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal#extraParams}
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
             * PaymentIntentCaptureParams.AmountDetails.LineItem.PaymentMethodOptions.Paypal#extraParams}
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
          public PaymentIntentCaptureParams.AmountDetails.LineItem.Tax build() {
            return new PaymentIntentCaptureParams.AmountDetails.LineItem.Tax(
                this.extraParams, this.totalTaxAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.AmountDetails.LineItem.Tax#extraParams} for
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
           * map. See {@link PaymentIntentCaptureParams.AmountDetails.LineItem.Tax#extraParams} for
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
       * most 10 alphanumeric characters long, hyphens and spaces are allowed.
       */
      @SerializedName("from_postal_code")
      Object fromPostalCode;

      /**
       * If a physical good is being shipped, the postal code of where it is being shipped to. At
       * most 10 alphanumeric characters long, hyphens and spaces are allowed.
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
        public PaymentIntentCaptureParams.AmountDetails.Shipping build() {
          return new PaymentIntentCaptureParams.AmountDetails.Shipping(
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
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.Shipping#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.Shipping#extraParams} for the
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
         * At most 10 alphanumeric characters long, hyphens and spaces are allowed.
         */
        public Builder setFromPostalCode(String fromPostalCode) {
          this.fromPostalCode = fromPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped from.
         * At most 10 alphanumeric characters long, hyphens and spaces are allowed.
         */
        public Builder setFromPostalCode(EmptyParam fromPostalCode) {
          this.fromPostalCode = fromPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped to. At
         * most 10 alphanumeric characters long, hyphens and spaces are allowed.
         */
        public Builder setToPostalCode(String toPostalCode) {
          this.toPostalCode = toPostalCode;
          return this;
        }

        /**
         * If a physical good is being shipped, the postal code of where it is being shipped to. At
         * most 10 alphanumeric characters long, hyphens and spaces are allowed.
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
        public PaymentIntentCaptureParams.AmountDetails.Tax build() {
          return new PaymentIntentCaptureParams.AmountDetails.Tax(
              this.extraParams, this.totalTaxAmount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.Tax#extraParams} for the field
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
         * map. See {@link PaymentIntentCaptureParams.AmountDetails.Tax#extraParams} for the field
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
      public PaymentIntentCaptureParams.Hooks build() {
        return new PaymentIntentCaptureParams.Hooks(this.extraParams, this.inputs);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.Hooks#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.Hooks#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Arguments passed in automations. */
      public Builder setInputs(PaymentIntentCaptureParams.Hooks.Inputs inputs) {
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
        public PaymentIntentCaptureParams.Hooks.Inputs build() {
          return new PaymentIntentCaptureParams.Hooks.Inputs(this.extraParams, this.tax);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.Hooks.Inputs#extraParams} for the field
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
         * map. See {@link PaymentIntentCaptureParams.Hooks.Inputs#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Tax arguments for automations. */
        public Builder setTax(PaymentIntentCaptureParams.Hooks.Inputs.Tax tax) {
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
          public PaymentIntentCaptureParams.Hooks.Inputs.Tax build() {
            return new PaymentIntentCaptureParams.Hooks.Inputs.Tax(
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
           * map. See {@link PaymentIntentCaptureParams.Hooks.Inputs.Tax#extraParams} for the field
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
           * map. See {@link PaymentIntentCaptureParams.Hooks.Inputs.Tax#extraParams} for the field
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
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDetails {
    /** Car rental data for this PaymentIntent. */
    @SerializedName("car_rental_data")
    Object carRentalData;

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

    /** Lodging data for this PaymentIntent. */
    @SerializedName("lodging_data")
    Object lodgingData;

    /**
     * A unique value assigned by the business to identify the transaction. Required for L2 and L3
     * rates.
     *
     * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces, before
     * being sent to card networks. For Klarna, this field is truncated to 255 characters and is
     * visible to customers when they view the order in the Klarna app.
     */
    @SerializedName("order_reference")
    Object orderReference;

    private PaymentDetails(
        Object carRentalData,
        Object customerReference,
        Map<String, Object> extraParams,
        Object lodgingData,
        Object orderReference) {
      this.carRentalData = carRentalData;
      this.customerReference = customerReference;
      this.extraParams = extraParams;
      this.lodgingData = lodgingData;
      this.orderReference = orderReference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object carRentalData;

      private Object customerReference;

      private Map<String, Object> extraParams;

      private Object lodgingData;

      private Object orderReference;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCaptureParams.PaymentDetails build() {
        return new PaymentIntentCaptureParams.PaymentDetails(
            this.carRentalData,
            this.customerReference,
            this.extraParams,
            this.lodgingData,
            this.orderReference);
      }

      /**
       * Add an element to `carRentalData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.PaymentDetails#carRentalData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCarRentalData(
          PaymentIntentCaptureParams.PaymentDetails.CarRentalData element) {
        if (this.carRentalData == null || this.carRentalData instanceof EmptyParam) {
          this.carRentalData =
              new ArrayList<PaymentIntentCaptureParams.PaymentDetails.CarRentalData>();
        }
        ((List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData>) this.carRentalData)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `carRentalData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.PaymentDetails#carRentalData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllCarRentalData(
          List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData> elements) {
        if (this.carRentalData == null || this.carRentalData instanceof EmptyParam) {
          this.carRentalData =
              new ArrayList<PaymentIntentCaptureParams.PaymentDetails.CarRentalData>();
        }
        ((List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData>) this.carRentalData)
            .addAll(elements);
        return this;
      }

      /** Car rental data for this PaymentIntent. */
      public Builder setCarRentalData(EmptyParam carRentalData) {
        this.carRentalData = carRentalData;
        return this;
      }

      /** Car rental data for this PaymentIntent. */
      public Builder setCarRentalData(
          List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData> carRentalData) {
        this.carRentalData = carRentalData;
        return this;
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
       * PaymentIntentCaptureParams.PaymentDetails#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.PaymentDetails#extraParams} for the field
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
       * Add an element to `lodgingData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.PaymentDetails#lodgingData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addLodgingData(PaymentIntentCaptureParams.PaymentDetails.LodgingData element) {
        if (this.lodgingData == null || this.lodgingData instanceof EmptyParam) {
          this.lodgingData = new ArrayList<PaymentIntentCaptureParams.PaymentDetails.LodgingData>();
        }
        ((List<PaymentIntentCaptureParams.PaymentDetails.LodgingData>) this.lodgingData)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `lodgingData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentIntentCaptureParams.PaymentDetails#lodgingData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllLodgingData(
          List<PaymentIntentCaptureParams.PaymentDetails.LodgingData> elements) {
        if (this.lodgingData == null || this.lodgingData instanceof EmptyParam) {
          this.lodgingData = new ArrayList<PaymentIntentCaptureParams.PaymentDetails.LodgingData>();
        }
        ((List<PaymentIntentCaptureParams.PaymentDetails.LodgingData>) this.lodgingData)
            .addAll(elements);
        return this;
      }

      /** Lodging data for this PaymentIntent. */
      public Builder setLodgingData(EmptyParam lodgingData) {
        this.lodgingData = lodgingData;
        return this;
      }

      /** Lodging data for this PaymentIntent. */
      public Builder setLodgingData(
          List<PaymentIntentCaptureParams.PaymentDetails.LodgingData> lodgingData) {
        this.lodgingData = lodgingData;
        return this;
      }

      /**
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates.
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
       * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks. For Klarna, this field is truncated to 255 characters
       * and is visible to customers when they view the order in the Klarna app.
       */
      public Builder setOrderReference(EmptyParam orderReference) {
        this.orderReference = orderReference;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CarRentalData {
      /** Affiliate (such as travel agency) details for the rental. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Booking confirmation number for the car rental. */
      @SerializedName("booking_number")
      String bookingNumber;

      /** Name of the car rental company. */
      @SerializedName("carrier_name")
      String carrierName;

      /** Customer service phone number for the car rental company. */
      @SerializedName("customer_service_phone_number")
      String customerServicePhoneNumber;

      /** Number of days the car is being rented. */
      @SerializedName("days_rented")
      Long daysRented;

      /** Distance details for the rental. */
      @SerializedName("distance")
      Distance distance;

      /** List of drivers for the rental. */
      @SerializedName("drivers")
      List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver> drivers;

      /** <strong>Required.</strong> Drop-off location details. */
      @SerializedName("drop_off")
      DropOff dropOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Insurance details for the rental. */
      @SerializedName("insurances")
      List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance> insurances;

      /** Indicates if the customer was a no-show. */
      @SerializedName("no_show_indicator")
      Boolean noShowIndicator;

      /** <strong>Required.</strong> Pickup location details. */
      @SerializedName("pickup")
      Pickup pickup;

      /** Name of the person renting the vehicle. */
      @SerializedName("renter_name")
      String renterName;

      /** <strong>Required.</strong> Total cost breakdown for the rental. */
      @SerializedName("total")
      Total total;

      /** Vehicle details for the rental. */
      @SerializedName("vehicle")
      Vehicle vehicle;

      private CarRentalData(
          Affiliate affiliate,
          String bookingNumber,
          String carrierName,
          String customerServicePhoneNumber,
          Long daysRented,
          Distance distance,
          List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver> drivers,
          DropOff dropOff,
          Map<String, Object> extraParams,
          List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance> insurances,
          Boolean noShowIndicator,
          Pickup pickup,
          String renterName,
          Total total,
          Vehicle vehicle) {
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.carrierName = carrierName;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.daysRented = daysRented;
        this.distance = distance;
        this.drivers = drivers;
        this.dropOff = dropOff;
        this.extraParams = extraParams;
        this.insurances = insurances;
        this.noShowIndicator = noShowIndicator;
        this.pickup = pickup;
        this.renterName = renterName;
        this.total = total;
        this.vehicle = vehicle;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private String bookingNumber;

        private String carrierName;

        private String customerServicePhoneNumber;

        private Long daysRented;

        private Distance distance;

        private List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver> drivers;

        private DropOff dropOff;

        private Map<String, Object> extraParams;

        private List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance> insurances;

        private Boolean noShowIndicator;

        private Pickup pickup;

        private String renterName;

        private Total total;

        private Vehicle vehicle;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.CarRentalData build() {
          return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData(
              this.affiliate,
              this.bookingNumber,
              this.carrierName,
              this.customerServicePhoneNumber,
              this.daysRented,
              this.distance,
              this.drivers,
              this.dropOff,
              this.extraParams,
              this.insurances,
              this.noShowIndicator,
              this.pickup,
              this.renterName,
              this.total,
              this.vehicle);
        }

        /** Affiliate (such as travel agency) details for the rental. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Booking confirmation number for the car rental. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Name of the car rental company. */
        public Builder setCarrierName(String carrierName) {
          this.carrierName = carrierName;
          return this;
        }

        /** Customer service phone number for the car rental company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** Number of days the car is being rented. */
        public Builder setDaysRented(Long daysRented) {
          this.daysRented = daysRented;
          return this;
        }

        /** Distance details for the rental. */
        public Builder setDistance(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance distance) {
          this.distance = distance;
          return this;
        }

        /**
         * Add an element to `drivers` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRentalData#drivers} for the field
         * documentation.
         */
        public Builder addDriver(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver element) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.add(element);
          return this;
        }

        /**
         * Add all elements to `drivers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRentalData#drivers} for the field
         * documentation.
         */
        public Builder addAllDriver(
            List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver> elements) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.addAll(elements);
          return this;
        }

        /** <strong>Required.</strong> Drop-off location details. */
        public Builder setDropOff(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff dropOff) {
          this.dropOff = dropOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRentalData#extraParams} for
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRentalData#extraParams} for
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
         * Add an element to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRentalData#insurances} for the field
         * documentation.
         */
        public Builder addInsurance(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance element) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.add(element);
          return this;
        }

        /**
         * Add all elements to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRentalData#insurances} for the field
         * documentation.
         */
        public Builder addAllInsurance(
            List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance> elements) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.addAll(elements);
          return this;
        }

        /** Indicates if the customer was a no-show. */
        public Builder setNoShowIndicator(Boolean noShowIndicator) {
          this.noShowIndicator = noShowIndicator;
          return this;
        }

        /** <strong>Required.</strong> Pickup location details. */
        public Builder setPickup(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup pickup) {
          this.pickup = pickup;
          return this;
        }

        /** Name of the person renting the vehicle. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** <strong>Required.</strong> Total cost breakdown for the rental. */
        public Builder setTotal(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total total) {
          this.total = total;
          return this;
        }

        /** Vehicle details for the rental. */
        public Builder setVehicle(
            PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle vehicle) {
          this.vehicle = vehicle;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Affiliate {
        /** Affiliate partner code. */
        @SerializedName("code")
        String code;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of affiliate partner. */
        @SerializedName("name")
        String name;

        private Affiliate(String code, Map<String, Object> extraParams, String name) {
          this.code = code;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String code;

          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Affiliate(
                this.code, this.extraParams, this.name);
          }

          /** Affiliate partner code. */
          public Builder setCode(String code) {
            this.code = code;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Affiliate#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Affiliate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of affiliate partner. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Distance {
        /** <strong>Required.</strong> Distance traveled. */
        @SerializedName("amount")
        Long amount;

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
         * <strong>Required.</strong> Unit of measurement for the distance traveled. One of {@code
         * miles} or {@code kilometers}.
         */
        @SerializedName("unit")
        Unit unit;

        private Distance(Long amount, Map<String, Object> extraParams, Unit unit) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.unit = unit;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private Unit unit;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance(
                this.amount, this.extraParams, this.unit);
          }

          /** <strong>Required.</strong> Distance traveled. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance#extraParams} for the
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
           * <strong>Required.</strong> Unit of measurement for the distance traveled. One of {@code
           * miles} or {@code kilometers}.
           */
          public Builder setUnit(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Distance.Unit unit) {
            this.unit = unit;
            return this;
          }
        }

        public enum Unit implements ApiRequestParams.EnumParam {
          @SerializedName("kilometers")
          KILOMETERS("kilometers"),

          @SerializedName("miles")
          MILES("miles");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Unit(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Driver {
        /** Driver's date of birth. */
        @SerializedName("date_of_birth")
        DateOfBirth dateOfBirth;

        /** Driver's identification number. */
        @SerializedName("driver_identification_number")
        String driverIdentificationNumber;

        /** Driver's tax number. */
        @SerializedName("driver_tax_number")
        String driverTaxNumber;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Driver's full name. */
        @SerializedName("name")
        String name;

        private Driver(
            DateOfBirth dateOfBirth,
            String driverIdentificationNumber,
            String driverTaxNumber,
            Map<String, Object> extraParams,
            String name) {
          this.dateOfBirth = dateOfBirth;
          this.driverIdentificationNumber = driverIdentificationNumber;
          this.driverTaxNumber = driverTaxNumber;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DateOfBirth dateOfBirth;

          private String driverIdentificationNumber;

          private String driverTaxNumber;

          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver(
                this.dateOfBirth,
                this.driverIdentificationNumber,
                this.driverTaxNumber,
                this.extraParams,
                this.name);
          }

          /** Driver's date of birth. */
          public Builder setDateOfBirth(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver.DateOfBirth
                  dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
          }

          /** Driver's identification number. */
          public Builder setDriverIdentificationNumber(String driverIdentificationNumber) {
            this.driverIdentificationNumber = driverIdentificationNumber;
            return this;
          }

          /** Driver's tax number. */
          public Builder setDriverTaxNumber(String driverTaxNumber) {
            this.driverTaxNumber = driverTaxNumber;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Driver's full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DateOfBirth {
          /** <strong>Required.</strong> Day of birth (1-31). */
          @SerializedName("day")
          Long day;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Month of birth (1-12). */
          @SerializedName("month")
          Long month;

          /** <strong>Required.</strong> Year of birth (must be greater than 1900). */
          @SerializedName("year")
          Long year;

          private DateOfBirth(Long day, Map<String, Object> extraParams, Long month, Long year) {
            this.day = day;
            this.extraParams = extraParams;
            this.month = month;
            this.year = year;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long day;

            private Map<String, Object> extraParams;

            private Long month;

            private Long year;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver.DateOfBirth
                build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver.DateOfBirth(
                  this.day, this.extraParams, this.month, this.year);
            }

            /** <strong>Required.</strong> Day of birth (1-31). */
            public Builder setDay(Long day) {
              this.day = day;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver.DateOfBirth#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Driver.DateOfBirth#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Month of birth (1-12). */
            public Builder setMonth(Long month) {
              this.month = month;
              return this;
            }

            /** <strong>Required.</strong> Year of birth (must be greater than 1900). */
            public Builder setYear(Long year) {
              this.year = year;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DropOff {
        /** <strong>Required.</strong> Address of the rental location. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Location name. */
        @SerializedName("location_name")
        String locationName;

        /** <strong>Required.</strong> Timestamp for the location. */
        @SerializedName("time")
        Long time;

        private DropOff(
            Address address, Map<String, Object> extraParams, String locationName, Long time) {
          this.address = address;
          this.extraParams = extraParams;
          this.locationName = locationName;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Map<String, Object> extraParams;

          private String locationName;

          private Long time;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff(
                this.address, this.extraParams, this.locationName, this.time);
          }

          /** <strong>Required.</strong> Address of the rental location. */
          public Builder setAddress(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Location name. */
          public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
          }

          /** <strong>Required.</strong> Timestamp for the location. */
          public Builder setTime(Long time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** <strong>Required.</strong> ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          @SerializedName("state")
          String state;

          private Address(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff.Address build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff.Address#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.DropOff.Address#extraParams}
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /**
             * State, county, province, or region (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
             */
            public Builder setState(String state) {
              this.state = state;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Insurance {
        /** <strong>Required.</strong> Amount of the insurance coverage in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the insurance amount. */
        @SerializedName("currency")
        String currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of the insurance company. */
        @SerializedName("insurance_company_name")
        String insuranceCompanyName;

        /** <strong>Required.</strong> Type of insurance coverage. */
        @SerializedName("insurance_type")
        InsuranceType insuranceType;

        private Insurance(
            Long amount,
            String currency,
            Map<String, Object> extraParams,
            String insuranceCompanyName,
            InsuranceType insuranceType) {
          this.amount = amount;
          this.currency = currency;
          this.extraParams = extraParams;
          this.insuranceCompanyName = insuranceCompanyName;
          this.insuranceType = insuranceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Map<String, Object> extraParams;

          private String insuranceCompanyName;

          private InsuranceType insuranceType;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance(
                this.amount,
                this.currency,
                this.extraParams,
                this.insuranceCompanyName,
                this.insuranceType);
          }

          /** <strong>Required.</strong> Amount of the insurance coverage in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(String insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** <strong>Required.</strong> Type of insurance coverage. */
          public Builder setInsuranceType(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Insurance.InsuranceType
                  insuranceType) {
            this.insuranceType = insuranceType;
            return this;
          }
        }

        public enum InsuranceType implements ApiRequestParams.EnumParam {
          @SerializedName("liability_supplement")
          LIABILITY_SUPPLEMENT("liability_supplement"),

          @SerializedName("loss_damage_waiver")
          LOSS_DAMAGE_WAIVER("loss_damage_waiver"),

          @SerializedName("other")
          OTHER("other"),

          @SerializedName("partial_damage_waiver")
          PARTIAL_DAMAGE_WAIVER("partial_damage_waiver"),

          @SerializedName("personal_accident")
          PERSONAL_ACCIDENT("personal_accident"),

          @SerializedName("personal_effects")
          PERSONAL_EFFECTS("personal_effects");

          @Getter(onMethod_ = {@Override})
          private final String value;

          InsuranceType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Pickup {
        /** <strong>Required.</strong> Address of the rental location. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Location name. */
        @SerializedName("location_name")
        String locationName;

        /** <strong>Required.</strong> Timestamp for the location. */
        @SerializedName("time")
        Long time;

        private Pickup(
            Address address, Map<String, Object> extraParams, String locationName, Long time) {
          this.address = address;
          this.extraParams = extraParams;
          this.locationName = locationName;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Map<String, Object> extraParams;

          private String locationName;

          private Long time;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup(
                this.address, this.extraParams, this.locationName, this.time);
          }

          /** <strong>Required.</strong> Address of the rental location. */
          public Builder setAddress(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Location name. */
          public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
          }

          /** <strong>Required.</strong> Timestamp for the location. */
          public Builder setTime(Long time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** <strong>Required.</strong> ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          @SerializedName("state")
          String state;

          private Address(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup.Address build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup.Address#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Pickup.Address#extraParams}
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /**
             * State, county, province, or region (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
             */
            public Builder setState(String state) {
              this.state = state;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Total {
        /** <strong>Required.</strong> Total amount in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the amount. */
        @SerializedName("currency")
        String currency;

        /** Discount details for the rental. */
        @SerializedName("discounts")
        Discounts discounts;

        /** Additional charges for the rental. */
        @SerializedName("extra_charges")
        List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge>
            extraCharges;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Rate per unit for the rental. */
        @SerializedName("rate_per_unit")
        Long ratePerUnit;

        /** Unit of measurement for the rate. */
        @SerializedName("rate_unit")
        RateUnit rateUnit;

        /** Tax breakdown for the rental. */
        @SerializedName("tax")
        Tax tax;

        private Total(
            Long amount,
            String currency,
            Discounts discounts,
            List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge>
                extraCharges,
            Map<String, Object> extraParams,
            Long ratePerUnit,
            RateUnit rateUnit,
            Tax tax) {
          this.amount = amount;
          this.currency = currency;
          this.discounts = discounts;
          this.extraCharges = extraCharges;
          this.extraParams = extraParams;
          this.ratePerUnit = ratePerUnit;
          this.rateUnit = rateUnit;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Discounts discounts;

          private List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge>
              extraCharges;

          private Map<String, Object> extraParams;

          private Long ratePerUnit;

          private RateUnit rateUnit;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total(
                this.amount,
                this.currency,
                this.discounts,
                this.extraCharges,
                this.extraParams,
                this.ratePerUnit,
                this.rateUnit,
                this.tax);
          }

          /** <strong>Required.</strong> Total amount in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Discount details for the rental. */
          public Builder setDiscounts(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Discounts discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total#extraCharges} for the
           * field documentation.
           */
          public Builder addExtraCharge(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge element) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.add(element);
            return this;
          }

          /**
           * Add all elements to `extraCharges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total#extraCharges}
           * for the field documentation.
           */
          public Builder addAllExtraCharge(
              List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge>
                  elements) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Rate per unit for the rental. */
          public Builder setRatePerUnit(Long ratePerUnit) {
            this.ratePerUnit = ratePerUnit;
            return this;
          }

          /** Unit of measurement for the rate. */
          public Builder setRateUnit(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.RateUnit rateUnit) {
            this.rateUnit = rateUnit;
            return this;
          }

          /** Tax breakdown for the rental. */
          public Builder setTax(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discounts {
          /** Corporate client discount code. */
          @SerializedName("corporate_client_code")
          String corporateClientCode;

          /** Coupon code applied to the rental. */
          @SerializedName("coupon")
          String coupon;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Maximum number of free miles or kilometers included. */
          @SerializedName("maximum_free_miles_or_kilometers")
          Long maximumFreeMilesOrKilometers;

          private Discounts(
              String corporateClientCode,
              String coupon,
              Map<String, Object> extraParams,
              Long maximumFreeMilesOrKilometers) {
            this.corporateClientCode = corporateClientCode;
            this.coupon = coupon;
            this.extraParams = extraParams;
            this.maximumFreeMilesOrKilometers = maximumFreeMilesOrKilometers;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String corporateClientCode;

            private String coupon;

            private Map<String, Object> extraParams;

            private Long maximumFreeMilesOrKilometers;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Discounts build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Discounts(
                  this.corporateClientCode,
                  this.coupon,
                  this.extraParams,
                  this.maximumFreeMilesOrKilometers);
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(String corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Coupon code applied to the rental. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Discounts#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Discounts#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Maximum number of free miles or kilometers included. */
            public Builder setMaximumFreeMilesOrKilometers(Long maximumFreeMilesOrKilometers) {
              this.maximumFreeMilesOrKilometers = maximumFreeMilesOrKilometers;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ExtraCharge {
          /** <strong>Required.</strong> Amount of the extra charge in cents. */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Type of extra charge. */
          @SerializedName("type")
          Type type;

          private ExtraCharge(Long amount, Map<String, Object> extraParams, Type type) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge
                build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge(
                  this.amount, this.extraParams, this.type);
            }

            /** <strong>Required.</strong> Amount of the extra charge in cents. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Type of extra charge. */
            public Builder setType(
                PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.ExtraCharge.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("extra_mileage")
            EXTRA_MILEAGE("extra_mileage"),

            @SerializedName("gas")
            GAS("gas"),

            @SerializedName("gps")
            GPS("gps"),

            @SerializedName("late_charge")
            LATE_CHARGE("late_charge"),

            @SerializedName("one_way_drop_off")
            ONE_WAY_DROP_OFF("one_way_drop_off"),

            @SerializedName("other")
            OTHER("other"),

            @SerializedName("parking")
            PARKING("parking"),

            @SerializedName("phone")
            PHONE("phone"),

            @SerializedName("regular_mileage")
            REGULAR_MILEAGE("regular_mileage"),

            @SerializedName("towing")
            TOWING("towing");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Indicates if the transaction is tax exempt. */
          @SerializedName("tax_exempt_indicator")
          Boolean taxExemptIndicator;

          /** Array of tax details. */
          @SerializedName("tax_items")
          List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem> taxItems;

          private Tax(
              Map<String, Object> extraParams,
              Boolean taxExemptIndicator,
              List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem>
                  taxItems) {
            this.extraParams = extraParams;
            this.taxExemptIndicator = taxExemptIndicator;
            this.taxItems = taxItems;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean taxExemptIndicator;

            private List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem>
                taxItems;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax(
                  this.extraParams, this.taxExemptIndicator, this.taxItems);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Indicates if the transaction is tax exempt. */
            public Builder setTaxExemptIndicator(Boolean taxExemptIndicator) {
              this.taxExemptIndicator = taxExemptIndicator;
              return this;
            }

            /**
             * Add an element to `taxItems` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax#taxItems} for the
             * field documentation.
             */
            public Builder addTaxItem(
                PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem element) {
              if (this.taxItems == null) {
                this.taxItems = new ArrayList<>();
              }
              this.taxItems.add(element);
              return this;
            }

            /**
             * Add all elements to `taxItems` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax#taxItems} for the
             * field documentation.
             */
            public Builder addAllTaxItem(
                List<PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem>
                    elements) {
              if (this.taxItems == null) {
                this.taxItems = new ArrayList<>();
              }
              this.taxItems.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class TaxItem {
            /** Tax amount. */
            @SerializedName("amount")
            Long amount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Tax rate applied. */
            @SerializedName("rate")
            Long rate;

            /** Type of tax applied. */
            @SerializedName("type")
            String type;

            private TaxItem(Long amount, Map<String, Object> extraParams, Long rate, String type) {
              this.amount = amount;
              this.extraParams = extraParams;
              this.rate = rate;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private Map<String, Object> extraParams;

              private Long rate;

              private String type;

              /** Finalize and obtain parameter instance from this builder. */
              public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem
                  build() {
                return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax
                    .TaxItem(this.amount, this.extraParams, this.rate, this.type);
              }

              /** Tax amount. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Total.Tax.TaxItem#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Tax rate applied. */
              public Builder setRate(Long rate) {
                this.rate = rate;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(String type) {
                this.type = type;
                return this;
              }
            }
          }
        }

        public enum RateUnit implements ApiRequestParams.EnumParam {
          @SerializedName("days")
          DAYS("days"),

          @SerializedName("kilometers")
          KILOMETERS("kilometers"),

          @SerializedName("miles")
          MILES("miles"),

          @SerializedName("months")
          MONTHS("months"),

          @SerializedName("weeks")
          WEEKS("weeks");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RateUnit(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Vehicle {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Make of the rental vehicle. */
        @SerializedName("make")
        String make;

        /** Model of the rental vehicle. */
        @SerializedName("model")
        String model;

        /** Odometer reading at the time of rental. */
        @SerializedName("odometer")
        Long odometer;

        /** Type of the rental vehicle. */
        @SerializedName("type")
        Type type;

        /** Class of the rental vehicle. */
        @SerializedName("vehicle_class")
        VehicleClass vehicleClass;

        /** Vehicle identification number (VIN). */
        @SerializedName("vehicle_identification_number")
        String vehicleIdentificationNumber;

        private Vehicle(
            Map<String, Object> extraParams,
            String make,
            String model,
            Long odometer,
            Type type,
            VehicleClass vehicleClass,
            String vehicleIdentificationNumber) {
          this.extraParams = extraParams;
          this.make = make;
          this.model = model;
          this.odometer = odometer;
          this.type = type;
          this.vehicleClass = vehicleClass;
          this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String make;

          private String model;

          private Long odometer;

          private Type type;

          private VehicleClass vehicleClass;

          private String vehicleIdentificationNumber;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle(
                this.extraParams,
                this.make,
                this.model,
                this.odometer,
                this.type,
                this.vehicleClass,
                this.vehicleIdentificationNumber);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Make of the rental vehicle. */
          public Builder setMake(String make) {
            this.make = make;
            return this;
          }

          /** Model of the rental vehicle. */
          public Builder setModel(String model) {
            this.model = model;
            return this;
          }

          /** Odometer reading at the time of rental. */
          public Builder setOdometer(Long odometer) {
            this.odometer = odometer;
            return this;
          }

          /** Type of the rental vehicle. */
          public Builder setType(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle.Type type) {
            this.type = type;
            return this;
          }

          /** Class of the rental vehicle. */
          public Builder setVehicleClass(
              PaymentIntentCaptureParams.PaymentDetails.CarRentalData.Vehicle.VehicleClass
                  vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
          }

          /** Vehicle identification number (VIN). */
          public Builder setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
            this.vehicleIdentificationNumber = vehicleIdentificationNumber;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("cargo_van")
          CARGO_VAN("cargo_van"),

          @SerializedName("compact")
          COMPACT("compact"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("exotic")
          EXOTIC("exotic"),

          @SerializedName("exotic_suv")
          EXOTIC_SUV("exotic_suv"),

          @SerializedName("fifteen_passenger_van")
          FIFTEEN_PASSENGER_VAN("fifteen_passenger_van"),

          @SerializedName("four_wheel_drive")
          FOUR_WHEEL_DRIVE("four_wheel_drive"),

          @SerializedName("full_size")
          FULL_SIZE("full_size"),

          @SerializedName("intermediate")
          INTERMEDIATE("intermediate"),

          @SerializedName("large_suv")
          LARGE_SUV("large_suv"),

          @SerializedName("large_truck")
          LARGE_TRUCK("large_truck"),

          @SerializedName("luxury")
          LUXURY("luxury"),

          @SerializedName("medium_suv")
          MEDIUM_SUV("medium_suv"),

          @SerializedName("midsize")
          MIDSIZE("midsize"),

          @SerializedName("mini")
          MINI("mini"),

          @SerializedName("minivan")
          MINIVAN("minivan"),

          @SerializedName("miscellaneous")
          MISCELLANEOUS("miscellaneous"),

          @SerializedName("moped")
          MOPED("moped"),

          @SerializedName("moving_van")
          MOVING_VAN("moving_van"),

          @SerializedName("premium")
          PREMIUM("premium"),

          @SerializedName("regular")
          REGULAR("regular"),

          @SerializedName("small_medium_truck")
          SMALL_MEDIUM_TRUCK("small_medium_truck"),

          @SerializedName("small_suv")
          SMALL_SUV("small_suv"),

          @SerializedName("special")
          SPECIAL("special"),

          @SerializedName("standard")
          STANDARD("standard"),

          @SerializedName("stretch")
          STRETCH("stretch"),

          @SerializedName("subcompact")
          SUBCOMPACT("subcompact"),

          @SerializedName("taxi")
          TAXI("taxi"),

          @SerializedName("twelve_foot_truck")
          TWELVE_FOOT_TRUCK("twelve_foot_truck"),

          @SerializedName("twelve_passenger_van")
          TWELVE_PASSENGER_VAN("twelve_passenger_van"),

          @SerializedName("twenty_foot_truck")
          TWENTY_FOOT_TRUCK("twenty_foot_truck"),

          @SerializedName("twenty_four_foot_truck")
          TWENTY_FOUR_FOOT_TRUCK("twenty_four_foot_truck"),

          @SerializedName("twenty_six_foot_truck")
          TWENTY_SIX_FOOT_TRUCK("twenty_six_foot_truck"),

          @SerializedName("unique")
          UNIQUE("unique");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }

        public enum VehicleClass implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("first_class")
          FIRST_CLASS("first_class"),

          @SerializedName("premium_economy")
          PREMIUM_ECONOMY("premium_economy");

          @Getter(onMethod_ = {@Override})
          private final String value;

          VehicleClass(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LodgingData {
      /** Accommodation details for the lodging. */
      @SerializedName("accommodation")
      Accommodation accommodation;

      /** Affiliate details if applicable. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Booking confirmation number for the lodging. */
      @SerializedName("booking_number")
      String bookingNumber;

      /** <strong>Required.</strong> Check-in date. */
      @SerializedName("checkin_at")
      Long checkinAt;

      /** <strong>Required.</strong> Check-out date. */
      @SerializedName("checkout_at")
      Long checkoutAt;

      /** Customer service phone number for the lodging company. */
      @SerializedName("customer_service_phone_number")
      String customerServicePhoneNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Whether the lodging is compliant with any hotel fire safety regulations. */
      @SerializedName("fire_safety_act_compliance_indicator")
      Boolean fireSafetyActComplianceIndicator;

      /** List of guests for the lodging. */
      @SerializedName("guests")
      List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest> guests;

      /** Host details for the lodging. */
      @SerializedName("host")
      Host host;

      /** List of insurances for the lodging. */
      @SerializedName("insurances")
      List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance> insurances;

      /** Whether the renter is a no-show. */
      @SerializedName("no_show_indicator")
      Boolean noShowIndicator;

      /** Renter ID number for the lodging. */
      @SerializedName("renter_id_number")
      String renterIdNumber;

      /** Renter name for the lodging. */
      @SerializedName("renter_name")
      String renterName;

      /** <strong>Required.</strong> Total details for the lodging. */
      @SerializedName("total")
      Total total;

      private LodgingData(
          Accommodation accommodation,
          Affiliate affiliate,
          String bookingNumber,
          Long checkinAt,
          Long checkoutAt,
          String customerServicePhoneNumber,
          Map<String, Object> extraParams,
          Boolean fireSafetyActComplianceIndicator,
          List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest> guests,
          Host host,
          List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance> insurances,
          Boolean noShowIndicator,
          String renterIdNumber,
          String renterName,
          Total total) {
        this.accommodation = accommodation;
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.checkinAt = checkinAt;
        this.checkoutAt = checkoutAt;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.extraParams = extraParams;
        this.fireSafetyActComplianceIndicator = fireSafetyActComplianceIndicator;
        this.guests = guests;
        this.host = host;
        this.insurances = insurances;
        this.noShowIndicator = noShowIndicator;
        this.renterIdNumber = renterIdNumber;
        this.renterName = renterName;
        this.total = total;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Accommodation accommodation;

        private Affiliate affiliate;

        private String bookingNumber;

        private Long checkinAt;

        private Long checkoutAt;

        private String customerServicePhoneNumber;

        private Map<String, Object> extraParams;

        private Boolean fireSafetyActComplianceIndicator;

        private List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest> guests;

        private Host host;

        private List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance> insurances;

        private Boolean noShowIndicator;

        private String renterIdNumber;

        private String renterName;

        private Total total;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.LodgingData build() {
          return new PaymentIntentCaptureParams.PaymentDetails.LodgingData(
              this.accommodation,
              this.affiliate,
              this.bookingNumber,
              this.checkinAt,
              this.checkoutAt,
              this.customerServicePhoneNumber,
              this.extraParams,
              this.fireSafetyActComplianceIndicator,
              this.guests,
              this.host,
              this.insurances,
              this.noShowIndicator,
              this.renterIdNumber,
              this.renterName,
              this.total);
        }

        /** Accommodation details for the lodging. */
        public Builder setAccommodation(
            PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation accommodation) {
          this.accommodation = accommodation;
          return this;
        }

        /** Affiliate details if applicable. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.LodgingData.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Booking confirmation number for the lodging. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** <strong>Required.</strong> Check-in date. */
        public Builder setCheckinAt(Long checkinAt) {
          this.checkinAt = checkinAt;
          return this;
        }

        /** <strong>Required.</strong> Check-out date. */
        public Builder setCheckoutAt(Long checkoutAt) {
          this.checkoutAt = checkoutAt;
          return this;
        }

        /** Customer service phone number for the lodging company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.LodgingData#extraParams} for
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.LodgingData#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Whether the lodging is compliant with any hotel fire safety regulations. */
        public Builder setFireSafetyActComplianceIndicator(
            Boolean fireSafetyActComplianceIndicator) {
          this.fireSafetyActComplianceIndicator = fireSafetyActComplianceIndicator;
          return this;
        }

        /**
         * Add an element to `guests` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.LodgingData#guests} for the field
         * documentation.
         */
        public Builder addGuest(
            PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest element) {
          if (this.guests == null) {
            this.guests = new ArrayList<>();
          }
          this.guests.add(element);
          return this;
        }

        /**
         * Add all elements to `guests` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.LodgingData#guests} for the field
         * documentation.
         */
        public Builder addAllGuest(
            List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest> elements) {
          if (this.guests == null) {
            this.guests = new ArrayList<>();
          }
          this.guests.addAll(elements);
          return this;
        }

        /** Host details for the lodging. */
        public Builder setHost(PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host host) {
          this.host = host;
          return this;
        }

        /**
         * Add an element to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.LodgingData#insurances} for the field
         * documentation.
         */
        public Builder addInsurance(
            PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance element) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.add(element);
          return this;
        }

        /**
         * Add all elements to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.LodgingData#insurances} for the field
         * documentation.
         */
        public Builder addAllInsurance(
            List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance> elements) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.addAll(elements);
          return this;
        }

        /** Whether the renter is a no-show. */
        public Builder setNoShowIndicator(Boolean noShowIndicator) {
          this.noShowIndicator = noShowIndicator;
          return this;
        }

        /** Renter ID number for the lodging. */
        public Builder setRenterIdNumber(String renterIdNumber) {
          this.renterIdNumber = renterIdNumber;
          return this;
        }

        /** Renter name for the lodging. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** <strong>Required.</strong> Total details for the lodging. */
        public Builder setTotal(PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total total) {
          this.total = total;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Accommodation {
        /** Type of accommodation. */
        @SerializedName("accommodation_type")
        AccommodationType accommodationType;

        /** Bed type. */
        @SerializedName("bed_type")
        String bedType;

        /** Daily accommodation rate in cents. */
        @SerializedName("daily_rate_amount")
        Long dailyRateAmount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Number of nights. */
        @SerializedName("nights")
        Long nights;

        /** Number of rooms, cabanas, apartments, and so on. */
        @SerializedName("number_of_rooms")
        Long numberOfRooms;

        /** Rate type. */
        @SerializedName("rate_type")
        String rateType;

        /** Whether smoking is allowed. */
        @SerializedName("smoking_indicator")
        Boolean smokingIndicator;

        private Accommodation(
            AccommodationType accommodationType,
            String bedType,
            Long dailyRateAmount,
            Map<String, Object> extraParams,
            Long nights,
            Long numberOfRooms,
            String rateType,
            Boolean smokingIndicator) {
          this.accommodationType = accommodationType;
          this.bedType = bedType;
          this.dailyRateAmount = dailyRateAmount;
          this.extraParams = extraParams;
          this.nights = nights;
          this.numberOfRooms = numberOfRooms;
          this.rateType = rateType;
          this.smokingIndicator = smokingIndicator;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AccommodationType accommodationType;

          private String bedType;

          private Long dailyRateAmount;

          private Map<String, Object> extraParams;

          private Long nights;

          private Long numberOfRooms;

          private String rateType;

          private Boolean smokingIndicator;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation(
                this.accommodationType,
                this.bedType,
                this.dailyRateAmount,
                this.extraParams,
                this.nights,
                this.numberOfRooms,
                this.rateType,
                this.smokingIndicator);
          }

          /** Type of accommodation. */
          public Builder setAccommodationType(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation.AccommodationType
                  accommodationType) {
            this.accommodationType = accommodationType;
            return this;
          }

          /** Bed type. */
          public Builder setBedType(String bedType) {
            this.bedType = bedType;
            return this;
          }

          /** Daily accommodation rate in cents. */
          public Builder setDailyRateAmount(Long dailyRateAmount) {
            this.dailyRateAmount = dailyRateAmount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation#extraParams} for
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
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Accommodation#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Number of nights. */
          public Builder setNights(Long nights) {
            this.nights = nights;
            return this;
          }

          /** Number of rooms, cabanas, apartments, and so on. */
          public Builder setNumberOfRooms(Long numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
          }

          /** Rate type. */
          public Builder setRateType(String rateType) {
            this.rateType = rateType;
            return this;
          }

          /** Whether smoking is allowed. */
          public Builder setSmokingIndicator(Boolean smokingIndicator) {
            this.smokingIndicator = smokingIndicator;
            return this;
          }
        }

        public enum AccommodationType implements ApiRequestParams.EnumParam {
          @SerializedName("apartment")
          APARTMENT("apartment"),

          @SerializedName("cabana")
          CABANA("cabana"),

          @SerializedName("house")
          HOUSE("house"),

          @SerializedName("penthouse")
          PENTHOUSE("penthouse"),

          @SerializedName("room")
          ROOM("room"),

          @SerializedName("standard")
          STANDARD("standard"),

          @SerializedName("suite")
          SUITE("suite"),

          @SerializedName("villa")
          VILLA("villa");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AccommodationType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Affiliate {
        /** Affiliate partner code. */
        @SerializedName("code")
        String code;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Affiliate partner name. */
        @SerializedName("name")
        String name;

        private Affiliate(String code, Map<String, Object> extraParams, String name) {
          this.code = code;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String code;

          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Affiliate(
                this.code, this.extraParams, this.name);
          }

          /** Affiliate partner code. */
          public Builder setCode(String code) {
            this.code = code;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Affiliate#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Affiliate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Affiliate partner name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Guest {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Guest's full name. */
        @SerializedName("name")
        String name;

        private Guest(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest#extraParams} for the field
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
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Guest#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Guest's full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Host {
        /** Address of the host. */
        @SerializedName("address")
        Address address;

        /** Host's country of domicile. */
        @SerializedName("country_of_domicile")
        String countryOfDomicile;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Reference number for the host. */
        @SerializedName("host_reference")
        String hostReference;

        /** Type of host. */
        @SerializedName("host_type")
        HostType hostType;

        /** Name of the lodging property or host. */
        @SerializedName("name")
        String name;

        /** Total number of reservations for the host. */
        @SerializedName("number_of_reservations")
        Long numberOfReservations;

        /** Property phone number. */
        @SerializedName("property_phone_number")
        String propertyPhoneNumber;

        /** Host's registration date. */
        @SerializedName("registered_at")
        Long registeredAt;

        private Host(
            Address address,
            String countryOfDomicile,
            Map<String, Object> extraParams,
            String hostReference,
            HostType hostType,
            String name,
            Long numberOfReservations,
            String propertyPhoneNumber,
            Long registeredAt) {
          this.address = address;
          this.countryOfDomicile = countryOfDomicile;
          this.extraParams = extraParams;
          this.hostReference = hostReference;
          this.hostType = hostType;
          this.name = name;
          this.numberOfReservations = numberOfReservations;
          this.propertyPhoneNumber = propertyPhoneNumber;
          this.registeredAt = registeredAt;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private String countryOfDomicile;

          private Map<String, Object> extraParams;

          private String hostReference;

          private HostType hostType;

          private String name;

          private Long numberOfReservations;

          private String propertyPhoneNumber;

          private Long registeredAt;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host(
                this.address,
                this.countryOfDomicile,
                this.extraParams,
                this.hostReference,
                this.hostType,
                this.name,
                this.numberOfReservations,
                this.propertyPhoneNumber,
                this.registeredAt);
          }

          /** Address of the host. */
          public Builder setAddress(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.Address address) {
            this.address = address;
            return this;
          }

          /** Host's country of domicile. */
          public Builder setCountryOfDomicile(String countryOfDomicile) {
            this.countryOfDomicile = countryOfDomicile;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Reference number for the host. */
          public Builder setHostReference(String hostReference) {
            this.hostReference = hostReference;
            return this;
          }

          /** Type of host. */
          public Builder setHostType(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.HostType hostType) {
            this.hostType = hostType;
            return this;
          }

          /** Name of the lodging property or host. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Total number of reservations for the host. */
          public Builder setNumberOfReservations(Long numberOfReservations) {
            this.numberOfReservations = numberOfReservations;
            return this;
          }

          /** Property phone number. */
          public Builder setPropertyPhoneNumber(String propertyPhoneNumber) {
            this.propertyPhoneNumber = propertyPhoneNumber;
            return this;
          }

          /** Host's registration date. */
          public Builder setRegisteredAt(Long registeredAt) {
            this.registeredAt = registeredAt;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** <strong>Required.</strong> ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          @SerializedName("state")
          String state;

          private Address(
              String city,
              String country,
              Map<String, Object> extraParams,
              String line1,
              String line2,
              String postalCode,
              String state) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String city;

            private String country;

            private Map<String, Object> extraParams;

            private String line1;

            private String line2;

            private String postalCode;

            private String state;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.Address build() {
              return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.Address#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Host.Address#extraParams} for
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /**
             * State, county, province, or region (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
             */
            public Builder setState(String state) {
              this.state = state;
              return this;
            }
          }
        }

        public enum HostType implements ApiRequestParams.EnumParam {
          @SerializedName("hostel")
          HOSTEL("hostel"),

          @SerializedName("hotel")
          HOTEL("hotel"),

          @SerializedName("owner")
          OWNER("owner"),

          @SerializedName("rental_agency")
          RENTAL_AGENCY("rental_agency");

          @Getter(onMethod_ = {@Override})
          private final String value;

          HostType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Insurance {
        /** <strong>Required.</strong> Price of the insurance coverage in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the insurance amount. */
        @SerializedName("currency")
        String currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of the insurance company. */
        @SerializedName("insurance_company_name")
        String insuranceCompanyName;

        /** <strong>Required.</strong> Type of insurance coverage. */
        @SerializedName("insurance_type")
        InsuranceType insuranceType;

        private Insurance(
            Long amount,
            String currency,
            Map<String, Object> extraParams,
            String insuranceCompanyName,
            InsuranceType insuranceType) {
          this.amount = amount;
          this.currency = currency;
          this.extraParams = extraParams;
          this.insuranceCompanyName = insuranceCompanyName;
          this.insuranceType = insuranceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Map<String, Object> extraParams;

          private String insuranceCompanyName;

          private InsuranceType insuranceType;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance(
                this.amount,
                this.currency,
                this.extraParams,
                this.insuranceCompanyName,
                this.insuranceType);
          }

          /** <strong>Required.</strong> Price of the insurance coverage in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(String insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** <strong>Required.</strong> Type of insurance coverage. */
          public Builder setInsuranceType(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Insurance.InsuranceType
                  insuranceType) {
            this.insuranceType = insuranceType;
            return this;
          }
        }

        public enum InsuranceType implements ApiRequestParams.EnumParam {
          @SerializedName("bankruptcy")
          BANKRUPTCY("bankruptcy"),

          @SerializedName("cancelation")
          CANCELATION("cancelation"),

          @SerializedName("emergency")
          EMERGENCY("emergency"),

          @SerializedName("medical")
          MEDICAL("medical");

          @Getter(onMethod_ = {@Override})
          private final String value;

          InsuranceType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Total {
        /** <strong>Required.</strong> Total price of the lodging reservation in cents. */
        @SerializedName("amount")
        Long amount;

        /** Cash advances in cents. */
        @SerializedName("cash_advances")
        Long cashAdvances;

        /** Currency of the total amount. */
        @SerializedName("currency")
        String currency;

        /** Discount details for the lodging. */
        @SerializedName("discounts")
        Discounts discounts;

        /** Additional charges for the lodging. */
        @SerializedName("extra_charges")
        List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge> extraCharges;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Prepaid amount in cents. */
        @SerializedName("prepaid_amount")
        Long prepaidAmount;

        /** Tax breakdown for the lodging reservation. */
        @SerializedName("tax")
        Tax tax;

        private Total(
            Long amount,
            Long cashAdvances,
            String currency,
            Discounts discounts,
            List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge>
                extraCharges,
            Map<String, Object> extraParams,
            Long prepaidAmount,
            Tax tax) {
          this.amount = amount;
          this.cashAdvances = cashAdvances;
          this.currency = currency;
          this.discounts = discounts;
          this.extraCharges = extraCharges;
          this.extraParams = extraParams;
          this.prepaidAmount = prepaidAmount;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Long cashAdvances;

          private String currency;

          private Discounts discounts;

          private List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge>
              extraCharges;

          private Map<String, Object> extraParams;

          private Long prepaidAmount;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total build() {
            return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total(
                this.amount,
                this.cashAdvances,
                this.currency,
                this.discounts,
                this.extraCharges,
                this.extraParams,
                this.prepaidAmount,
                this.tax);
          }

          /** <strong>Required.</strong> Total price of the lodging reservation in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Cash advances in cents. */
          public Builder setCashAdvances(Long cashAdvances) {
            this.cashAdvances = cashAdvances;
            return this;
          }

          /** Currency of the total amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Discount details for the lodging. */
          public Builder setDiscounts(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Discounts discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total#extraCharges} for the field
           * documentation.
           */
          public Builder addExtraCharge(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge element) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.add(element);
            return this;
          }

          /**
           * Add all elements to `extraCharges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total#extraCharges}
           * for the field documentation.
           */
          public Builder addAllExtraCharge(
              List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge>
                  elements) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total#extraParams} for the field
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
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Prepaid amount in cents. */
          public Builder setPrepaidAmount(Long prepaidAmount) {
            this.prepaidAmount = prepaidAmount;
            return this;
          }

          /** Tax breakdown for the lodging reservation. */
          public Builder setTax(
              PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discounts {
          /** Corporate client discount code. */
          @SerializedName("corporate_client_code")
          String corporateClientCode;

          /** Coupon code. */
          @SerializedName("coupon")
          String coupon;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Discounts(
              String corporateClientCode, String coupon, Map<String, Object> extraParams) {
            this.corporateClientCode = corporateClientCode;
            this.coupon = coupon;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String corporateClientCode;

            private String coupon;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Discounts build() {
              return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Discounts(
                  this.corporateClientCode, this.coupon, this.extraParams);
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(String corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Coupon code. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Discounts#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Discounts#extraParams}
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
        public static class ExtraCharge {
          /** Amount of the extra charge in cents. */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Type of extra charge. */
          @SerializedName("type")
          Type type;

          private ExtraCharge(Long amount, Map<String, Object> extraParams, Type type) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge build() {
              return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge(
                  this.amount, this.extraParams, this.type);
            }

            /** Amount of the extra charge in cents. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Type of extra charge. */
            public Builder setType(
                PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.ExtraCharge.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("gift_shop")
            GIFT_SHOP("gift_shop"),

            @SerializedName("laundry")
            LAUNDRY("laundry"),

            @SerializedName("mini_bar")
            MINI_BAR("mini_bar"),

            @SerializedName("other")
            OTHER("other"),

            @SerializedName("phone")
            PHONE("phone"),

            @SerializedName("restaurant")
            RESTAURANT("restaurant");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Indicates whether the transaction is tax exempt. */
          @SerializedName("tax_exempt_indicator")
          Boolean taxExemptIndicator;

          /** Tax details. */
          @SerializedName("tax_items")
          List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem> taxItems;

          private Tax(
              Map<String, Object> extraParams,
              Boolean taxExemptIndicator,
              List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem>
                  taxItems) {
            this.extraParams = extraParams;
            this.taxExemptIndicator = taxExemptIndicator;
            this.taxItems = taxItems;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean taxExemptIndicator;

            private List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem>
                taxItems;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax build() {
              return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax(
                  this.extraParams, this.taxExemptIndicator, this.taxItems);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Indicates whether the transaction is tax exempt. */
            public Builder setTaxExemptIndicator(Boolean taxExemptIndicator) {
              this.taxExemptIndicator = taxExemptIndicator;
              return this;
            }

            /**
             * Add an element to `taxItems` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax#taxItems} for the
             * field documentation.
             */
            public Builder addTaxItem(
                PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem element) {
              if (this.taxItems == null) {
                this.taxItems = new ArrayList<>();
              }
              this.taxItems.add(element);
              return this;
            }

            /**
             * Add all elements to `taxItems` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax#taxItems} for the
             * field documentation.
             */
            public Builder addAllTaxItem(
                List<PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem>
                    elements) {
              if (this.taxItems == null) {
                this.taxItems = new ArrayList<>();
              }
              this.taxItems.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class TaxItem {
            /** Tax amount in cents. */
            @SerializedName("amount")
            Long amount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Tax rate. */
            @SerializedName("rate")
            Long rate;

            /** Type of tax applied. */
            @SerializedName("type")
            String type;

            private TaxItem(Long amount, Map<String, Object> extraParams, Long rate, String type) {
              this.amount = amount;
              this.extraParams = extraParams;
              this.rate = rate;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private Map<String, Object> extraParams;

              private Long rate;

              private String type;

              /** Finalize and obtain parameter instance from this builder. */
              public PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem
                  build() {
                return new PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem(
                    this.amount, this.extraParams, this.rate, this.type);
              }

              /** Tax amount in cents. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCaptureParams.PaymentDetails.LodgingData.Total.Tax.TaxItem#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Tax rate. */
              public Builder setRate(Long rate) {
                this.rate = rate;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(String type) {
                this.type = type;
                return this;
              }
            }
          }
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
      public PaymentIntentCaptureParams.TransferData build() {
        return new PaymentIntentCaptureParams.TransferData(this.amount, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.TransferData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.TransferData#extraParams} for the field
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
}
