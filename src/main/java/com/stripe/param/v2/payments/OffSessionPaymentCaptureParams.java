// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPaymentCaptureParams extends ApiRequestParams {
  /** Provides industry-specific information about the amount. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** The amount to capture. */
  @SerializedName("amount_to_capture")
  Long amountToCapture;

  /** The amount of the application fee for this capture. */
  @SerializedName("application_fee_amount")
  Amount applicationFeeAmount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Set of <a href="https://docs.stripe.com/api/metadata">key-value
   * pairs</a> that you can attach to an object. This can be useful for storing additional
   * information about the object in a structured format. Learn more about <a
   * href="https://docs.stripe.com/payments/payment-intents#storing-information-in-metadata">storing
   * information in metadata</a>.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Provides industry-specific information about the payment. */
  @SerializedName("payment_details")
  PaymentDetails paymentDetails;

  /**
   * Text that appears on the customer’s statement as the statement descriptor for a non-card
   * charge. This value overrides the account’s default statement descriptor. For information about
   * requirements, including the 22-character limit, see the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">Statement Descriptor
   * docs</a>.
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
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private OffSessionPaymentCaptureParams(
      AmountDetails amountDetails,
      Long amountToCapture,
      Amount applicationFeeAmount,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      PaymentDetails paymentDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData) {
    this.amountDetails = amountDetails;
    this.amountToCapture = amountToCapture;
    this.applicationFeeAmount = applicationFeeAmount;
    this.extraParams = extraParams;
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

    private Amount applicationFeeAmount;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private PaymentDetails paymentDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCaptureParams build() {
      return new OffSessionPaymentCaptureParams(
          this.amountDetails,
          this.amountToCapture,
          this.applicationFeeAmount,
          this.extraParams,
          this.metadata,
          this.paymentDetails,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData);
    }

    /** Provides industry-specific information about the amount. */
    public Builder setAmountDetails(OffSessionPaymentCaptureParams.AmountDetails amountDetails) {
      this.amountDetails = amountDetails;
      return this;
    }

    /** The amount to capture. */
    public Builder setAmountToCapture(Long amountToCapture) {
      this.amountToCapture = amountToCapture;
      return this;
    }

    /** The amount of the application fee for this capture. */
    public Builder setApplicationFeeAmount(Amount applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OffSessionPaymentCaptureParams#extraParams} for the field documentation.
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
     * See {@link OffSessionPaymentCaptureParams#extraParams} for the field documentation.
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
     * OffSessionPaymentCaptureParams#metadata} for the field documentation.
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
     * See {@link OffSessionPaymentCaptureParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Provides industry-specific information about the payment. */
    public Builder setPaymentDetails(OffSessionPaymentCaptureParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /**
     * Text that appears on the customer’s statement as the statement descriptor for a non-card
     * charge. This value overrides the account’s default statement descriptor. For information
     * about requirements, including the 22-character limit, see the <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">Statement Descriptor
     * docs</a>.
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
     * The data that automatically creates a Transfer after the payment finalizes. Learn more about
     * the use case for <a href="https://docs.stripe.com/payments/connected-accounts">connected
     * accounts</a>.
     */
    public Builder setTransferData(OffSessionPaymentCaptureParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails {
    /** The amount the total transaction was discounted for. */
    @SerializedName("discount_amount")
    Long discountAmount;

    /**
     * Set to {@code false} to return arithmetic validation errors in the response without failing
     * the request. Use this when you want the operation to proceed regardless of arithmetic errors
     * in the line item data. Omit or set to {@code true} to immediately return a 400 error when
     * arithmetic validation fails. Use this for strict validation that prevents processing with
     * line item data that has arithmetic inconsistencies. For card payments, Stripe doesn't send
     * line item data to card networks if there's an arithmetic validation error.
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
     * A list of line items, each containing information about a product in the OffSessionPayment.
     * There is a maximum of 10 line items.
     */
    @SerializedName("line_items")
    List<OffSessionPaymentCaptureParams.AmountDetails.LineItem> lineItems;

    /** Contains information about the shipping portion of the amount. */
    @SerializedName("shipping")
    Shipping shipping;

    /** Contains information about the tax portion of the amount. */
    @SerializedName("tax")
    Tax tax;

    private AmountDetails(
        Long discountAmount,
        Boolean enforceArithmeticValidation,
        Map<String, Object> extraParams,
        List<OffSessionPaymentCaptureParams.AmountDetails.LineItem> lineItems,
        Shipping shipping,
        Tax tax) {
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
      private Long discountAmount;

      private Boolean enforceArithmeticValidation;

      private Map<String, Object> extraParams;

      private List<OffSessionPaymentCaptureParams.AmountDetails.LineItem> lineItems;

      private Shipping shipping;

      private Tax tax;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCaptureParams.AmountDetails build() {
        return new OffSessionPaymentCaptureParams.AmountDetails(
            this.discountAmount,
            this.enforceArithmeticValidation,
            this.extraParams,
            this.lineItems,
            this.shipping,
            this.tax);
      }

      /** The amount the total transaction was discounted for. */
      public Builder setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
        return this;
      }

      /**
       * Set to {@code false} to return arithmetic validation errors in the response without failing
       * the request. Use this when you want the operation to proceed regardless of arithmetic
       * errors in the line item data. Omit or set to {@code true} to immediately return a 400 error
       * when arithmetic validation fails. Use this for strict validation that prevents processing
       * with line item data that has arithmetic inconsistencies. For card payments, Stripe doesn't
       * send line item data to card networks if there's an arithmetic validation error.
       */
      public Builder setEnforceArithmeticValidation(Boolean enforceArithmeticValidation) {
        this.enforceArithmeticValidation = enforceArithmeticValidation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCaptureParams.AmountDetails#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCaptureParams.AmountDetails#extraParams} for the field
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
       * OffSessionPaymentCaptureParams.AmountDetails#lineItems} for the field documentation.
       */
      public Builder addLineItem(OffSessionPaymentCaptureParams.AmountDetails.LineItem element) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * OffSessionPaymentCaptureParams.AmountDetails#lineItems} for the field documentation.
       */
      public Builder addAllLineItem(
          List<OffSessionPaymentCaptureParams.AmountDetails.LineItem> elements) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(elements);
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(OffSessionPaymentCaptureParams.AmountDetails.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the tax portion of the amount. */
      public Builder setTax(OffSessionPaymentCaptureParams.AmountDetails.Tax tax) {
        this.tax = tax;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem {
      /** The amount an item was discounted for. Positive integer. */
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

      /** Unique identifier of the product. At most 12 characters long. */
      @SerializedName("product_code")
      String productCode;

      /** <strong>Required.</strong> Name of the product. At most 100 characters long. */
      @SerializedName("product_name")
      String productName;

      /** <strong>Required.</strong> Number of items of the product. Positive integer. */
      @SerializedName("quantity")
      Long quantity;

      /** Contains information about the tax on the item. */
      @SerializedName("tax")
      Tax tax;

      /** <strong>Required.</strong> Cost of the product. Positive integer. */
      @SerializedName("unit_cost")
      Long unitCost;

      /**
       * A unit of measure for the line item, such as gallons, feet, meters, etc. The maximum length
       * is 12 characters.
       */
      @SerializedName("unit_of_measure")
      String unitOfMeasure;

      private LineItem(
          Long discountAmount,
          Map<String, Object> extraParams,
          String productCode,
          String productName,
          Long quantity,
          Tax tax,
          Long unitCost,
          String unitOfMeasure) {
        this.discountAmount = discountAmount;
        this.extraParams = extraParams;
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

        private String productCode;

        private String productName;

        private Long quantity;

        private Tax tax;

        private Long unitCost;

        private String unitOfMeasure;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCaptureParams.AmountDetails.LineItem build() {
          return new OffSessionPaymentCaptureParams.AmountDetails.LineItem(
              this.discountAmount,
              this.extraParams,
              this.productCode,
              this.productName,
              this.quantity,
              this.tax,
              this.unitCost,
              this.unitOfMeasure);
        }

        /** The amount an item was discounted for. Positive integer. */
        public Builder setDiscountAmount(Long discountAmount) {
          this.discountAmount = discountAmount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.LineItem#extraParams} for
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
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.LineItem#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Unique identifier of the product. At most 12 characters long. */
        public Builder setProductCode(String productCode) {
          this.productCode = productCode;
          return this;
        }

        /** <strong>Required.</strong> Name of the product. At most 100 characters long. */
        public Builder setProductName(String productName) {
          this.productName = productName;
          return this;
        }

        /** <strong>Required.</strong> Number of items of the product. Positive integer. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /** Contains information about the tax on the item. */
        public Builder setTax(OffSessionPaymentCaptureParams.AmountDetails.LineItem.Tax tax) {
          this.tax = tax;
          return this;
        }

        /** <strong>Required.</strong> Cost of the product. Positive integer. */
        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
          return this;
        }

        /**
         * A unit of measure for the line item, such as gallons, feet, meters, etc. The maximum
         * length is 12 characters.
         */
        public Builder setUnitOfMeasure(String unitOfMeasure) {
          this.unitOfMeasure = unitOfMeasure;
          return this;
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

        /** <strong>Required.</strong> Total portion of the amount that is for tax. */
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
          public OffSessionPaymentCaptureParams.AmountDetails.LineItem.Tax build() {
            return new OffSessionPaymentCaptureParams.AmountDetails.LineItem.Tax(
                this.extraParams, this.totalTaxAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.LineItem.Tax#extraParams}
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
           * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.LineItem.Tax#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Total portion of the amount that is for tax. */
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
      /** Portion of the amount that is for shipping. */
      @SerializedName("amount")
      Long amount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The postal code that represents the shipping source. */
      @SerializedName("from_postal_code")
      String fromPostalCode;

      /** The postal code that represents the shipping destination. */
      @SerializedName("to_postal_code")
      String toPostalCode;

      private Shipping(
          Long amount,
          Map<String, Object> extraParams,
          String fromPostalCode,
          String toPostalCode) {
        this.amount = amount;
        this.extraParams = extraParams;
        this.fromPostalCode = fromPostalCode;
        this.toPostalCode = toPostalCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private Map<String, Object> extraParams;

        private String fromPostalCode;

        private String toPostalCode;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCaptureParams.AmountDetails.Shipping build() {
          return new OffSessionPaymentCaptureParams.AmountDetails.Shipping(
              this.amount, this.extraParams, this.fromPostalCode, this.toPostalCode);
        }

        /** Portion of the amount that is for shipping. */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.Shipping#extraParams} for
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
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.Shipping#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The postal code that represents the shipping source. */
        public Builder setFromPostalCode(String fromPostalCode) {
          this.fromPostalCode = fromPostalCode;
          return this;
        }

        /** The postal code that represents the shipping destination. */
        public Builder setToPostalCode(String toPostalCode) {
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

      /** <strong>Required.</strong> Total portion of the amount that is for tax. */
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
        public OffSessionPaymentCaptureParams.AmountDetails.Tax build() {
          return new OffSessionPaymentCaptureParams.AmountDetails.Tax(
              this.extraParams, this.totalTaxAmount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.Tax#extraParams} for the
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
         * map. See {@link OffSessionPaymentCaptureParams.AmountDetails.Tax#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Total portion of the amount that is for tax. */
        public Builder setTotalTaxAmount(Long totalTaxAmount) {
          this.totalTaxAmount = totalTaxAmount;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDetails {
    /**
     * A unique value to identify the customer. This field is applicable only for card payments. For
     * card payments, this field is truncated to 25 alphanumeric characters, excluding spaces,
     * before being sent to card networks.
     */
    @SerializedName("customer_reference")
    String customerReference;

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
     * rates. For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
     * before being sent to card networks.
     */
    @SerializedName("order_reference")
    String orderReference;

    private PaymentDetails(
        String customerReference, Map<String, Object> extraParams, String orderReference) {
      this.customerReference = customerReference;
      this.extraParams = extraParams;
      this.orderReference = orderReference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customerReference;

      private Map<String, Object> extraParams;

      private String orderReference;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCaptureParams.PaymentDetails build() {
        return new OffSessionPaymentCaptureParams.PaymentDetails(
            this.customerReference, this.extraParams, this.orderReference);
      }

      /**
       * A unique value to identify the customer. This field is applicable only for card payments.
       * For card payments, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks.
       */
      public Builder setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCaptureParams.PaymentDetails#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCaptureParams.PaymentDetails#extraParams} for the field
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
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates. For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks.
       */
      public Builder setOrderReference(String orderReference) {
        this.orderReference = orderReference;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData {
    /**
     * The amount transferred to the destination account. This transfer will occur automatically
     * after the payment succeeds. If no amount is specified, by default the entire payment amount
     * is transferred to the destination account. The amount must be less than or equal to the <a
     * href="https://docs.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
     * and must be a positive integer representing how much to transfer in the smallest currency
     * unit (e.g., 100 cents to charge $1.00).
     */
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
      public OffSessionPaymentCaptureParams.TransferData build() {
        return new OffSessionPaymentCaptureParams.TransferData(this.amount, this.extraParams);
      }

      /**
       * The amount transferred to the destination account. This transfer will occur automatically
       * after the payment succeeds. If no amount is specified, by default the entire payment amount
       * is transferred to the destination account. The amount must be less than or equal to the <a
       * href="https://docs.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
       * and must be a positive integer representing how much to transfer in the smallest currency
       * unit (e.g., 100 cents to charge $1.00).
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCaptureParams.TransferData#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCaptureParams.TransferData#extraParams} for the field
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
