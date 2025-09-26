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
public class OffSessionPaymentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The “presentment amount” to be collected from the customer. */
  @SerializedName("amount")
  Amount amount;

  /** Provides industry-specific information about the amount. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** <strong>Required.</strong> The frequency of the underlying payment. */
  @SerializedName("cadence")
  Cadence cadence;

  /** Details about the capture configuration for the OffSessionPayment. */
  @SerializedName("capture")
  Capture capture;

  /** Whether the OffSessionPayment should be captured automatically or manually. */
  @SerializedName("capture_method")
  CaptureMethod captureMethod;

  /** <strong>Required.</strong> ID of the Customer to which this OffSessionPayment belongs. */
  @SerializedName("customer")
  String customer;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Set of <a href="https://docs.corp.stripe.com/api/metadata">key-value
   * pairs</a> that you can attach to an object. This can be useful for storing additional
   * information about the object in a structured format. Learn more about <a
   * href="https://docs.corp.stripe.com/payments/payment-intents#storing-information-in-metadata">storing
   * information in metadata</a>.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The account (if any) for which the funds of the OffSessionPayment are intended. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** <strong>Required.</strong> ID of the payment method used in this OffSessionPayment. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment method options for the off-session payment. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** Details about the payments orchestration configuration. */
  @SerializedName("payments_orchestration")
  PaymentsOrchestration paymentsOrchestration;

  /** Details about the OffSessionPayment retries. */
  @SerializedName("retry_details")
  RetryDetails retryDetails;

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
   * Provides information about a card charge. Concatenated to the account’s <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer’s
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /** Test clock that can be used to advance the retry attempts in a sandbox. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private OffSessionPaymentCreateParams(
      Amount amount,
      AmountDetails amountDetails,
      Cadence cadence,
      Capture capture,
      CaptureMethod captureMethod,
      String customer,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      PaymentsOrchestration paymentsOrchestration,
      RetryDetails retryDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      String testClock,
      TransferData transferData) {
    this.amount = amount;
    this.amountDetails = amountDetails;
    this.cadence = cadence;
    this.capture = capture;
    this.captureMethod = captureMethod;
    this.customer = customer;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentsOrchestration = paymentsOrchestration;
    this.retryDetails = retryDetails;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.testClock = testClock;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private AmountDetails amountDetails;

    private Cadence cadence;

    private Capture capture;

    private CaptureMethod captureMethod;

    private String customer;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private PaymentsOrchestration paymentsOrchestration;

    private RetryDetails retryDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private String testClock;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCreateParams build() {
      return new OffSessionPaymentCreateParams(
          this.amount,
          this.amountDetails,
          this.cadence,
          this.capture,
          this.captureMethod,
          this.customer,
          this.extraParams,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.paymentsOrchestration,
          this.retryDetails,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.testClock,
          this.transferData);
    }

    /** <strong>Required.</strong> The “presentment amount” to be collected from the customer. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Provides industry-specific information about the amount. */
    public Builder setAmountDetails(OffSessionPaymentCreateParams.AmountDetails amountDetails) {
      this.amountDetails = amountDetails;
      return this;
    }

    /** <strong>Required.</strong> The frequency of the underlying payment. */
    public Builder setCadence(OffSessionPaymentCreateParams.Cadence cadence) {
      this.cadence = cadence;
      return this;
    }

    /** Details about the capture configuration for the OffSessionPayment. */
    public Builder setCapture(OffSessionPaymentCreateParams.Capture capture) {
      this.capture = capture;
      return this;
    }

    /** Whether the OffSessionPayment should be captured automatically or manually. */
    public Builder setCaptureMethod(OffSessionPaymentCreateParams.CaptureMethod captureMethod) {
      this.captureMethod = captureMethod;
      return this;
    }

    /** <strong>Required.</strong> ID of the Customer to which this OffSessionPayment belongs. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OffSessionPaymentCreateParams#extraParams} for the field documentation.
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
     * See {@link OffSessionPaymentCreateParams#extraParams} for the field documentation.
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
     * OffSessionPaymentCreateParams#metadata} for the field documentation.
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
     * See {@link OffSessionPaymentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The account (if any) for which the funds of the OffSessionPayment are intended. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /** <strong>Required.</strong> ID of the payment method used in this OffSessionPayment. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Payment method options for the off-session payment. */
    public Builder setPaymentMethodOptions(
        OffSessionPaymentCreateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /** Details about the payments orchestration configuration. */
    public Builder setPaymentsOrchestration(
        OffSessionPaymentCreateParams.PaymentsOrchestration paymentsOrchestration) {
      this.paymentsOrchestration = paymentsOrchestration;
      return this;
    }

    /** Details about the OffSessionPayment retries. */
    public Builder setRetryDetails(OffSessionPaymentCreateParams.RetryDetails retryDetails) {
      this.retryDetails = retryDetails;
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
     * Provides information about a card charge. Concatenated to the account’s <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
     * descriptor prefix</a> to form the complete statement descriptor that appears on the
     * customer’s statement.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /** Test clock that can be used to advance the retry attempts in a sandbox. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }

    /**
     * The data that automatically creates a Transfer after the payment finalizes. Learn more about
     * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
     * accounts</a>.
     */
    public Builder setTransferData(OffSessionPaymentCreateParams.TransferData transferData) {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> A list of line items, each containing information about a product
     * in the PaymentIntent. There is a maximum of 100 line items.
     */
    @SerializedName("line_items")
    List<OffSessionPaymentCreateParams.AmountDetails.LineItem> lineItems;

    /** Contains information about the shipping portion of the amount. */
    @SerializedName("shipping")
    Shipping shipping;

    /** Contains information about the tax portion of the amount. */
    @SerializedName("tax")
    Tax tax;

    private AmountDetails(
        Long discountAmount,
        Map<String, Object> extraParams,
        List<OffSessionPaymentCreateParams.AmountDetails.LineItem> lineItems,
        Shipping shipping,
        Tax tax) {
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
      private Long discountAmount;

      private Map<String, Object> extraParams;

      private List<OffSessionPaymentCreateParams.AmountDetails.LineItem> lineItems;

      private Shipping shipping;

      private Tax tax;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.AmountDetails build() {
        return new OffSessionPaymentCreateParams.AmountDetails(
            this.discountAmount, this.extraParams, this.lineItems, this.shipping, this.tax);
      }

      /** The amount the total transaction was discounted for. */
      public Builder setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.AmountDetails#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.AmountDetails#extraParams} for the field
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
       * OffSessionPaymentCreateParams.AmountDetails#lineItems} for the field documentation.
       */
      public Builder addLineItem(OffSessionPaymentCreateParams.AmountDetails.LineItem element) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * OffSessionPaymentCreateParams.AmountDetails#lineItems} for the field documentation.
       */
      public Builder addAllLineItem(
          List<OffSessionPaymentCreateParams.AmountDetails.LineItem> elements) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(elements);
        return this;
      }

      /** Contains information about the shipping portion of the amount. */
      public Builder setShipping(OffSessionPaymentCreateParams.AmountDetails.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Contains information about the tax portion of the amount. */
      public Builder setTax(OffSessionPaymentCreateParams.AmountDetails.Tax tax) {
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

      /** <strong>Required.</strong> Cost of the product. Non-negative integer. */
      @SerializedName("unit_cost")
      Long unitCost;

      private LineItem(
          Long discountAmount,
          Map<String, Object> extraParams,
          String productCode,
          String productName,
          Long quantity,
          Tax tax,
          Long unitCost) {
        this.discountAmount = discountAmount;
        this.extraParams = extraParams;
        this.productCode = productCode;
        this.productName = productName;
        this.quantity = quantity;
        this.tax = tax;
        this.unitCost = unitCost;
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

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.AmountDetails.LineItem build() {
          return new OffSessionPaymentCreateParams.AmountDetails.LineItem(
              this.discountAmount,
              this.extraParams,
              this.productCode,
              this.productName,
              this.quantity,
              this.tax,
              this.unitCost);
        }

        /** The amount an item was discounted for. Positive integer. */
        public Builder setDiscountAmount(Long discountAmount) {
          this.discountAmount = discountAmount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.LineItem#extraParams} for the
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
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.LineItem#extraParams} for the
         * field documentation.
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
        public Builder setTax(OffSessionPaymentCreateParams.AmountDetails.LineItem.Tax tax) {
          this.tax = tax;
          return this;
        }

        /** <strong>Required.</strong> Cost of the product. Non-negative integer. */
        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
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

        /** Total portion of the amount that is for tax. */
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
          public OffSessionPaymentCreateParams.AmountDetails.LineItem.Tax build() {
            return new OffSessionPaymentCreateParams.AmountDetails.LineItem.Tax(
                this.extraParams, this.totalTaxAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OffSessionPaymentCreateParams.AmountDetails.LineItem.Tax#extraParams}
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
           * map. See {@link OffSessionPaymentCreateParams.AmountDetails.LineItem.Tax#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Total portion of the amount that is for tax. */
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
        public OffSessionPaymentCreateParams.AmountDetails.Shipping build() {
          return new OffSessionPaymentCreateParams.AmountDetails.Shipping(
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
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.Shipping#extraParams} for the
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
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.Shipping#extraParams} for the
         * field documentation.
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

      /** Total portion of the amount that is for tax. */
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
        public OffSessionPaymentCreateParams.AmountDetails.Tax build() {
          return new OffSessionPaymentCreateParams.AmountDetails.Tax(
              this.extraParams, this.totalTaxAmount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.Tax#extraParams} for the
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
         * map. See {@link OffSessionPaymentCreateParams.AmountDetails.Tax#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Total portion of the amount that is for tax. */
        public Builder setTotalTaxAmount(Long totalTaxAmount) {
          this.totalTaxAmount = totalTaxAmount;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Capture {
    /** <strong>Required.</strong> The method to use to capture the payment. */
    @SerializedName("capture_method")
    CaptureMethod captureMethod;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Capture(CaptureMethod captureMethod, Map<String, Object> extraParams) {
      this.captureMethod = captureMethod;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CaptureMethod captureMethod;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.Capture build() {
        return new OffSessionPaymentCreateParams.Capture(this.captureMethod, this.extraParams);
      }

      /** <strong>Required.</strong> The method to use to capture the payment. */
      public Builder setCaptureMethod(
          OffSessionPaymentCreateParams.Capture.CaptureMethod captureMethod) {
        this.captureMethod = captureMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.Capture#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.Capture#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum CaptureMethod implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("manual")
      MANUAL("manual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CaptureMethod(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions {
    /** Payment method options for the card payment type. */
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
      public OffSessionPaymentCreateParams.PaymentMethodOptions build() {
        return new OffSessionPaymentCreateParams.PaymentMethodOptions(this.card, this.extraParams);
      }

      /** Payment method options for the card payment type. */
      public Builder setCard(OffSessionPaymentCreateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.PaymentMethodOptions#extraParams} for the field
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
       * See {@link OffSessionPaymentCreateParams.PaymentMethodOptions#extraParams} for the field
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

      /**
       * <strong>Required.</strong> If you are making a Credential On File transaction with a
       * previously saved card, you should pass the Network Transaction ID from a prior initial
       * authorization on Stripe (from a successful SetupIntent or a PaymentIntent with {@code
       * setup_future_usage} set), or one that you have obtained from another payment processor.
       * This is a token from the network which uniquely identifies the transaction. Visa calls this
       * the Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. Note that you should pass in a Network Transaction ID if you have
       * one, regardless of whether this is a Customer-Initiated Transaction (CIT) or a
       * Merchant-Initiated Transaction (MIT).
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      private Card(Map<String, Object> extraParams, String networkTransactionId) {
        this.extraParams = extraParams;
        this.networkTransactionId = networkTransactionId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String networkTransactionId;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.PaymentMethodOptions.Card build() {
          return new OffSessionPaymentCreateParams.PaymentMethodOptions.Card(
              this.extraParams, this.networkTransactionId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCreateParams.PaymentMethodOptions.Card#extraParams} for
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
         * map. See {@link OffSessionPaymentCreateParams.PaymentMethodOptions.Card#extraParams} for
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
         * <strong>Required.</strong> If you are making a Credential On File transaction with a
         * previously saved card, you should pass the Network Transaction ID from a prior initial
         * authorization on Stripe (from a successful SetupIntent or a PaymentIntent with {@code
         * setup_future_usage} set), or one that you have obtained from another payment processor.
         * This is a token from the network which uniquely identifies the transaction. Visa calls
         * this the Transaction ID, Mastercard calls this the Trace ID, and American Express calls
         * this the Acquirer Reference Data. Note that you should pass in a Network Transaction ID
         * if you have one, regardless of whether this is a Customer-Initiated Transaction (CIT) or
         * a Merchant-Initiated Transaction (MIT).
         */
        public Builder setNetworkTransactionId(String networkTransactionId) {
          this.networkTransactionId = networkTransactionId;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentsOrchestration {
    /**
     * <strong>Required.</strong> True when you want to enable payments orchestration for this
     * off-session payment. False otherwise.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PaymentsOrchestration(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.PaymentsOrchestration build() {
        return new OffSessionPaymentCreateParams.PaymentsOrchestration(
            this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> True when you want to enable payments orchestration for this
       * off-session payment. False otherwise.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.PaymentsOrchestration#extraParams} for the field
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
       * See {@link OffSessionPaymentCreateParams.PaymentsOrchestration#extraParams} for the field
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RetryDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The pre-configured retry policy to use for the payment. */
    @SerializedName("retry_policy")
    String retryPolicy;

    /**
     * <strong>Required.</strong> Indicates the strategy for how you want Stripe to retry the
     * payment.
     */
    @SerializedName("retry_strategy")
    RetryStrategy retryStrategy;

    private RetryDetails(
        Map<String, Object> extraParams, String retryPolicy, RetryStrategy retryStrategy) {
      this.extraParams = extraParams;
      this.retryPolicy = retryPolicy;
      this.retryStrategy = retryStrategy;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String retryPolicy;

      private RetryStrategy retryStrategy;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.RetryDetails build() {
        return new OffSessionPaymentCreateParams.RetryDetails(
            this.extraParams, this.retryPolicy, this.retryStrategy);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.RetryDetails#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.RetryDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The pre-configured retry policy to use for the payment. */
      public Builder setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
      }

      /**
       * <strong>Required.</strong> Indicates the strategy for how you want Stripe to retry the
       * payment.
       */
      public Builder setRetryStrategy(
          OffSessionPaymentCreateParams.RetryDetails.RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
      }
    }

    public enum RetryStrategy implements ApiRequestParams.EnumParam {
      @SerializedName("heuristic")
      HEURISTIC("heuristic"),

      @SerializedName("none")
      NONE("none"),

      @SerializedName("scheduled")
      SCHEDULED("scheduled"),

      @SerializedName("smart")
      SMART("smart");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RetryStrategy(String value) {
        this.value = value;
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
     * href="https://docs.corp.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
     * and must be a positive integer representing how much to transfer in the smallest currency
     * unit (e.g., 100 cents to charge $1.00).
     */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> The account (if any) that the payment is attributed to for tax
     * reporting, and where funds from the payment are transferred to after payment success.
     */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.TransferData build() {
        return new OffSessionPaymentCreateParams.TransferData(
            this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount transferred to the destination account. This transfer will occur automatically
       * after the payment succeeds. If no amount is specified, by default the entire payment amount
       * is transferred to the destination account. The amount must be less than or equal to the <a
       * href="https://docs.corp.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
       * and must be a positive integer representing how much to transfer in the smallest currency
       * unit (e.g., 100 cents to charge $1.00).
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * <strong>Required.</strong> The account (if any) that the payment is attributed to for tax
       * reporting, and where funds from the payment are transferred to after payment success.
       */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.TransferData#extraParams} for the field
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

  public enum Cadence implements ApiRequestParams.EnumParam {
    @SerializedName("recurring")
    RECURRING("recurring"),

    @SerializedName("unscheduled")
    UNSCHEDULED("unscheduled");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Cadence(String value) {
      this.value = value;
    }
  }

  public enum CaptureMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),

    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CaptureMethod(String value) {
      this.value = value;
    }
  }
}
