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
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account.
   */
  @SerializedName("application_fee_amount")
  Amount applicationFeeAmount;

  /** Settings for automatic tax calculation. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Three-letter ISO currency code, in lowercase. */
  @SerializedName("currency")
  String currency;

  /**
   * ID of the Customer to which this OffSessionPayment belongs. Provide exactly one of customer or
   * customer_account.
   */
  @SerializedName("customer")
  String customer;

  /**
   * ID of the Account representing the customer to which this OffSessionPayment belongs. Provide
   * exactly one of customer or customer_account. Payment methods attached to other Accounts cannot
   * be used with this OffSessionPayment.
   */
  @SerializedName("customer_account")
  String customerAccount;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
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

  /** A list of items the customer will purchase. */
  @SerializedName("items")
  List<OffSessionPaymentCreateParams.Item> items;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Learn more about <a
   * href="https://docs.stripe.com/payments/payment-intents#storing-information-in-metadata">storing
   * information in metadata</a>.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The account (if any) for which the funds of the OffSessionPayment are intended. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** ID of the payment method used in this OffSessionPayment. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
   * appear in the payment_method property on the OffSessionPayment.
   */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment method options for the off-session payment. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** The amount to collect without itemization. */
  @SerializedName("raw_amount")
  RawAmount rawAmount;

  /** <strong>Required.</strong> Retry configuration for this OffSessionPayment. */
  @SerializedName("retries")
  Retries retries;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card
   * charge. This value overrides the account's default statement descriptor. For information about
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

  /** Provides a way to schedule deferred payments for cards and debits, in YYYY-MM-DD format. */
  @SerializedName("target_date")
  String targetDate;

  /** Test clock that can be used to advance the retry attempts in a sandbox. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private OffSessionPaymentCreateParams(
      Amount applicationFeeAmount,
      AutomaticTax automaticTax,
      String currency,
      String customer,
      String customerAccount,
      String description,
      Map<String, Object> extraParams,
      List<OffSessionPaymentCreateParams.Item> items,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      RawAmount rawAmount,
      Retries retries,
      String statementDescriptor,
      String statementDescriptorSuffix,
      String targetDate,
      String testClock,
      TransferData transferData) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.automaticTax = automaticTax;
    this.currency = currency;
    this.customer = customer;
    this.customerAccount = customerAccount;
    this.description = description;
    this.extraParams = extraParams;
    this.items = items;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.rawAmount = rawAmount;
    this.retries = retries;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.targetDate = targetDate;
    this.testClock = testClock;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount applicationFeeAmount;

    private AutomaticTax automaticTax;

    private String currency;

    private String customer;

    private String customerAccount;

    private String description;

    private Map<String, Object> extraParams;

    private List<OffSessionPaymentCreateParams.Item> items;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private RawAmount rawAmount;

    private Retries retries;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private String targetDate;

    private String testClock;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCreateParams build() {
      return new OffSessionPaymentCreateParams(
          this.applicationFeeAmount,
          this.automaticTax,
          this.currency,
          this.customer,
          this.customerAccount,
          this.description,
          this.extraParams,
          this.items,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.rawAmount,
          this.retries,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.targetDate,
          this.testClock,
          this.transferData);
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account.
     */
    public Builder setApplicationFeeAmount(Amount applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /** Settings for automatic tax calculation. */
    public Builder setAutomaticTax(OffSessionPaymentCreateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /** Three-letter ISO currency code, in lowercase. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * ID of the Customer to which this OffSessionPayment belongs. Provide exactly one of customer
     * or customer_account.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * ID of the Account representing the customer to which this OffSessionPayment belongs. Provide
     * exactly one of customer or customer_account. Payment methods attached to other Accounts
     * cannot be used with this OffSessionPayment.
     */
    public Builder setCustomerAccount(String customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
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
     * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OffSessionPaymentCreateParams#items} for the field documentation.
     */
    public Builder addItem(OffSessionPaymentCreateParams.Item element) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.add(element);
      return this;
    }

    /**
     * Add all elements to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OffSessionPaymentCreateParams#items} for the field documentation.
     */
    public Builder addAllItem(List<OffSessionPaymentCreateParams.Item> elements) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.addAll(elements);
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

    /** ID of the payment method used in this OffSessionPayment. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
     * appear in the payment_method property on the OffSessionPayment.
     */
    public Builder setPaymentMethodData(
        OffSessionPaymentCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment method options for the off-session payment. */
    public Builder setPaymentMethodOptions(
        OffSessionPaymentCreateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /** The amount to collect without itemization. */
    public Builder setRawAmount(OffSessionPaymentCreateParams.RawAmount rawAmount) {
      this.rawAmount = rawAmount;
      return this;
    }

    /** <strong>Required.</strong> Retry configuration for this OffSessionPayment. */
    public Builder setRetries(OffSessionPaymentCreateParams.Retries retries) {
      this.retries = retries;
      return this;
    }

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card
     * charge. This value overrides the account's default statement descriptor. For information
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

    /** Provides a way to schedule deferred payments for cards and debits, in YYYY-MM-DD format. */
    public Builder setTargetDate(String targetDate) {
      this.targetDate = targetDate;
      return this;
    }

    /** Test clock that can be used to advance the retry attempts in a sandbox. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }

    /**
     * The data that automatically creates a Transfer after the payment finalizes. Learn more about
     * the use case for <a href="https://docs.stripe.com/payments/connected-accounts">connected
     * accounts</a>.
     */
    public Builder setTransferData(OffSessionPaymentCreateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> Whether to automatically calculate taxes for this
     * OffSessionPayment.
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

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
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
      public OffSessionPaymentCreateParams.AutomaticTax build() {
        return new OffSessionPaymentCreateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Whether to automatically calculate taxes for this
       * OffSessionPayment.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.AutomaticTax#extraParams} for the field
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
  public static class Item {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Configuration for the one-time price item. */
    @SerializedName("one_time_price")
    OneTimePrice oneTimePrice;

    /**
     * <strong>Required.</strong> The type of item. Currently, only {@code one_time_price} is
     * supported.
     */
    @SerializedName("type")
    Type type;

    private Item(Map<String, Object> extraParams, OneTimePrice oneTimePrice, Type type) {
      this.extraParams = extraParams;
      this.oneTimePrice = oneTimePrice;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private OneTimePrice oneTimePrice;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.Item build() {
        return new OffSessionPaymentCreateParams.Item(
            this.extraParams, this.oneTimePrice, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.Item#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.Item#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Configuration for the one-time price item. */
      public Builder setOneTimePrice(OffSessionPaymentCreateParams.Item.OneTimePrice oneTimePrice) {
        this.oneTimePrice = oneTimePrice;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of item. Currently, only {@code one_time_price} is
       * supported.
       */
      public Builder setType(OffSessionPaymentCreateParams.Item.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OneTimePrice {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The list of one-time prices and quantities the customer will
       * purchase. Contains 1 to 10 items.
       */
      @SerializedName("items")
      List<OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem> items;

      private OneTimePrice(
          Map<String, Object> extraParams,
          List<OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem> items) {
        this.extraParams = extraParams;
        this.items = items;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem> items;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.Item.OneTimePrice build() {
          return new OffSessionPaymentCreateParams.Item.OneTimePrice(this.extraParams, this.items);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCreateParams.Item.OneTimePrice#extraParams} for the
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
         * map. See {@link OffSessionPaymentCreateParams.Item.OneTimePrice#extraParams} for the
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
         * Add an element to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * OffSessionPaymentCreateParams.Item.OneTimePrice#items} for the field documentation.
         */
        public Builder addItem(OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem element) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.add(element);
          return this;
        }

        /**
         * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * OffSessionPaymentCreateParams.Item.OneTimePrice#items} for the field documentation.
         */
        public Builder addAllItem(
            List<OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem> elements) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.addAll(elements);
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class InnerItem {
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
         * The ID of an existing one-time <a href="https://docs.stripe.com/api/prices">Price</a>.
         * Provide exactly one of {@code price} or {@code price_data}.
         */
        @SerializedName("price")
        String price;

        /**
         * Data used to generate a new one-time <a
         * href="https://docs.stripe.com/api/prices">Price</a> object inline. Provide exactly one of
         * {@code price} or {@code price_data}.
         */
        @SerializedName("price_data")
        PriceData priceData;

        /** <strong>Required.</strong> Quantity for this item. */
        @SerializedName("quantity")
        Long quantity;

        private InnerItem(
            Map<String, Object> extraParams, String price, PriceData priceData, Long quantity) {
          this.extraParams = extraParams;
          this.price = price;
          this.priceData = priceData;
          this.quantity = quantity;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          private PriceData priceData;

          private Long quantity;

          /** Finalize and obtain parameter instance from this builder. */
          public OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem build() {
            return new OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem(
                this.extraParams, this.price, this.priceData, this.quantity);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem#extraParams}
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
           * map. See {@link OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem#extraParams}
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
           * The ID of an existing one-time <a href="https://docs.stripe.com/api/prices">Price</a>.
           * Provide exactly one of {@code price} or {@code price_data}.
           */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * Data used to generate a new one-time <a
           * href="https://docs.stripe.com/api/prices">Price</a> object inline. Provide exactly one
           * of {@code price} or {@code price_data}.
           */
          public Builder setPriceData(
              OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData priceData) {
            this.priceData = priceData;
            return this;
          }

          /** <strong>Required.</strong> Quantity for this item. */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PriceData {
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
           * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to. Provide exactly one
           * of {@code product} or {@code product_data}.
           */
          @SerializedName("product")
          String product;

          /**
           * Data used to generate a new <a href="https://docs.stripe.com/api/products">Product</a>
           * object inline. Provide exactly one of {@code product} or {@code product_data}.
           */
          @SerializedName("product_data")
          ProductData productData;

          /**
           * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          /**
           * <strong>Required.</strong> The amount to charge per unit and its currency. Specify
           * {@code value} as a non-negative integer in the currency's minor unit (for example,
           * {@code 100} for USD 1.00).
           */
          @SerializedName("unit_amount")
          Amount unitAmount;

          private PriceData(
              Map<String, Object> extraParams,
              String product,
              ProductData productData,
              TaxBehavior taxBehavior,
              Amount unitAmount) {
            this.extraParams = extraParams;
            this.product = product;
            this.productData = productData;
            this.taxBehavior = taxBehavior;
            this.unitAmount = unitAmount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String product;

            private ProductData productData;

            private TaxBehavior taxBehavior;

            private Amount unitAmount;

            /** Finalize and obtain parameter instance from this builder. */
            public OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData build() {
              return new OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData(
                  this.extraParams,
                  this.product,
                  this.productData,
                  this.taxBehavior,
                  this.unitAmount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData#extraParams} for
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
             * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData#extraParams} for
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
             * The ID of the <a href="https://docs.stripe.com/api/products">Product</a> that this <a
             * href="https://docs.stripe.com/api/prices">Price</a> will belong to. Provide exactly
             * one of {@code product} or {@code product_data}.
             */
            public Builder setProduct(String product) {
              this.product = product;
              return this;
            }

            /**
             * Data used to generate a new <a
             * href="https://docs.stripe.com/api/products">Product</a> object inline. Provide
             * exactly one of {@code product} or {@code product_data}.
             */
            public Builder setProductData(
                OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData
                    productData) {
              this.productData = productData;
              return this;
            }

            /**
             * Specifies whether the price is considered inclusive of taxes or exclusive of taxes.
             * One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
             */
            public Builder setTaxBehavior(
                OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }

            /**
             * <strong>Required.</strong> The amount to charge per unit and its currency. Specify
             * {@code value} as a non-negative integer in the currency's minor unit (for example,
             * {@code 100} for USD 1.00).
             */
            public Builder setUnitAmount(Amount unitAmount) {
              this.unitAmount = unitAmount;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class ProductData {
            /**
             * The product's description, meant to be displayable to the customer. Use this field to
             * optionally store a long form explanation of the product being sold for your own
             * rendering purposes.
             */
            @SerializedName("description")
            String description;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * A list of URLs of images for this product, meant to be displayable to the customer.
             */
            @SerializedName("images")
            List<String> images;

            /**
             * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you
             * can attach to the product. This can be useful for storing additional information
             * about the product in a structured format.
             */
            @SerializedName("metadata")
            Map<String, String> metadata;

            /**
             * <strong>Required.</strong> The product's name, meant to be displayable to the
             * customer.
             */
            @SerializedName("name")
            String name;

            /**
             * Tax details for this product, including the <a
             * href="https://docs.stripe.com/tax/tax-codes">tax code</a> and an optional performance
             * location.
             */
            @SerializedName("tax_details")
            TaxDetails taxDetails;

            /** A label that represents units of this product, such as seats or licenses. */
            @SerializedName("unit_label")
            String unitLabel;

            private ProductData(
                String description,
                Map<String, Object> extraParams,
                List<String> images,
                Map<String, String> metadata,
                String name,
                TaxDetails taxDetails,
                String unitLabel) {
              this.description = description;
              this.extraParams = extraParams;
              this.images = images;
              this.metadata = metadata;
              this.name = name;
              this.taxDetails = taxDetails;
              this.unitLabel = unitLabel;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String description;

              private Map<String, Object> extraParams;

              private List<String> images;

              private Map<String, String> metadata;

              private String name;

              private TaxDetails taxDetails;

              private String unitLabel;

              /** Finalize and obtain parameter instance from this builder. */
              public OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData
                  build() {
                return new OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData
                    .ProductData(
                    this.description,
                    this.extraParams,
                    this.images,
                    this.metadata,
                    this.name,
                    this.taxDetails,
                    this.unitLabel);
              }

              /**
               * The product's description, meant to be displayable to the customer. Use this field
               * to optionally store a long form explanation of the product being sold for your own
               * rendering purposes.
               */
              public Builder setDescription(String description) {
                this.description = description;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#extraParams}
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
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#extraParams}
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
               * Add an element to `images` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#images}
               * for the field documentation.
               */
              public Builder addImage(String element) {
                if (this.images == null) {
                  this.images = new ArrayList<>();
                }
                this.images.add(element);
                return this;
              }

              /**
               * Add all elements to `images` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#images}
               * for the field documentation.
               */
              public Builder addAllImage(List<String> elements) {
                if (this.images == null) {
                  this.images = new ArrayList<>();
                }
                this.images.addAll(elements);
                return this;
              }

              /**
               * Add a key/value pair to `metadata` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#metadata}
               * for the field documentation.
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
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData#metadata}
               * for the field documentation.
               */
              public Builder putAllMetadata(Map<String, String> map) {
                if (this.metadata == null) {
                  this.metadata = new HashMap<>();
                }
                this.metadata.putAll(map);
                return this;
              }

              /**
               * <strong>Required.</strong> The product's name, meant to be displayable to the
               * customer.
               */
              public Builder setName(String name) {
                this.name = name;
                return this;
              }

              /**
               * Tax details for this product, including the <a
               * href="https://docs.stripe.com/tax/tax-codes">tax code</a> and an optional
               * performance location.
               */
              public Builder setTaxDetails(
                  OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData
                          .TaxDetails
                      taxDetails) {
                this.taxDetails = taxDetails;
                return this;
              }

              /** A label that represents units of this product, such as seats or licenses. */
              public Builder setUnitLabel(String unitLabel) {
                this.unitLabel = unitLabel;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class TaxDetails {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * A tax location ID. Depending on the <a
               * href="https://docs.stripe.com/tax/tax-for-tickets/reference/tax-location-performance">tax
               * code</a>, this is required, optional, or not supported.
               */
              @SerializedName("performance_location")
              String performanceLocation;

              /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
              @SerializedName("tax_code")
              String taxCode;

              private TaxDetails(
                  Map<String, Object> extraParams, String performanceLocation, String taxCode) {
                this.extraParams = extraParams;
                this.performanceLocation = performanceLocation;
                this.taxCode = taxCode;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private String performanceLocation;

                private String taxCode;

                /** Finalize and obtain parameter instance from this builder. */
                public OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData
                        .ProductData.TaxDetails
                    build() {
                  return new OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData
                      .ProductData.TaxDetails(
                      this.extraParams, this.performanceLocation, this.taxCode);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData.TaxDetails#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OffSessionPaymentCreateParams.Item.OneTimePrice.InnerItem.PriceData.ProductData.TaxDetails#extraParams}
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
                 * A tax location ID. Depending on the <a
                 * href="https://docs.stripe.com/tax/tax-for-tickets/reference/tax-location-performance">tax
                 * code</a>, this is required, optional, or not supported.
                 */
                public Builder setPerformanceLocation(String performanceLocation) {
                  this.performanceLocation = performanceLocation;
                  return this;
                }

                /** A <a href="https://docs.stripe.com/tax/tax-categories">tax code</a> ID. */
                public Builder setTaxCode(String taxCode) {
                  this.taxCode = taxCode;
                  return this;
                }
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
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("one_time_price")
      ONE_TIME_PRICE("one_time_price");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodData {
    /** Billing information associated with the payment method. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * Contains card details that can be used to create a card PaymentMethod for PCI compliant
     * users.
     */
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

    /**
     * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
     * the PaymentMethod with a name matching this value. It contains additional information
     * specific to the PaymentMethod type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodData(
        BillingDetails billingDetails, Card card, Map<String, Object> extraParams, Type type) {
      this.billingDetails = billingDetails;
      this.card = card;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Card card;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.PaymentMethodData build() {
        return new OffSessionPaymentCreateParams.PaymentMethodData(
            this.billingDetails, this.card, this.extraParams, this.type);
      }

      /** Billing information associated with the payment method. */
      public Builder setBillingDetails(
          OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * Contains card details that can be used to create a card PaymentMethod for PCI compliant
       * users.
       */
      public Builder setCard(OffSessionPaymentCreateParams.PaymentMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.PaymentMethodData#extraParams} for the field
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
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(OffSessionPaymentCreateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails {
      /** Billing address. */
      @SerializedName("address")
      Address address;

      /** Email address. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Full name. */
      @SerializedName("name")
      String name;

      /** Billing phone number (including extension). */
      @SerializedName("phone")
      String phone;

      private BillingDetails(
          Address address,
          String email,
          Map<String, Object> extraParams,
          String name,
          String phone) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private String email;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails build() {
          return new OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** Billing address. */
        public Builder setAddress(
            OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** Email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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
         * OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Full name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Billing phone number (including extension). */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /** Two-letter country code (ISO 3166-1 alpha-2). */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region (ISO 3166-2). */
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
          public OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails.Address build() {
            return new OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /** Two-letter country code (ISO 3166-1 alpha-2). */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * OffSessionPaymentCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region (ISO 3166-2). */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /** <strong>Required.</strong> The card expiration month. */
      @SerializedName("exp_month")
      String expMonth;

      /** <strong>Required.</strong> The card expiration year. */
      @SerializedName("exp_year")
      String expYear;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The last four digits of the underlying card number. */
      @SerializedName("last4")
      String last4;

      /** The network token credential to use with the card. */
      @SerializedName("network_token")
      NetworkToken networkToken;

      /** The card number. */
      @SerializedName("number")
      String number;

      private Card(
          String expMonth,
          String expYear,
          Map<String, Object> extraParams,
          String last4,
          NetworkToken networkToken,
          String number) {
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.extraParams = extraParams;
        this.last4 = last4;
        this.networkToken = networkToken;
        this.number = number;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String expMonth;

        private String expYear;

        private Map<String, Object> extraParams;

        private String last4;

        private NetworkToken networkToken;

        private String number;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.PaymentMethodData.Card build() {
          return new OffSessionPaymentCreateParams.PaymentMethodData.Card(
              this.expMonth,
              this.expYear,
              this.extraParams,
              this.last4,
              this.networkToken,
              this.number);
        }

        /** <strong>Required.</strong> The card expiration month. */
        public Builder setExpMonth(String expMonth) {
          this.expMonth = expMonth;
          return this;
        }

        /** <strong>Required.</strong> The card expiration year. */
        public Builder setExpYear(String expYear) {
          this.expYear = expYear;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OffSessionPaymentCreateParams.PaymentMethodData.Card#extraParams} for the
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
         * map. See {@link OffSessionPaymentCreateParams.PaymentMethodData.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The last four digits of the underlying card number. */
        public Builder setLast4(String last4) {
          this.last4 = last4;
          return this;
        }

        /** The network token credential to use with the card. */
        public Builder setNetworkToken(
            OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken networkToken) {
          this.networkToken = networkToken;
          return this;
        }

        /** The card number. */
        public Builder setNumber(String number) {
          this.number = number;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class NetworkToken {
        /**
         * <strong>Required.</strong> Two-digit number representing the network token's expiration
         * month.
         */
        @SerializedName("exp_month")
        String expMonth;

        /**
         * <strong>Required.</strong> Four-digit number representing the network token's expiration
         * year.
         */
        @SerializedName("exp_year")
        String expYear;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The full network token number. */
        @SerializedName("number")
        String number;

        /**
         * <strong>Required.</strong> The tokenization method used to generate the network token.
         */
        @SerializedName("tokenization_method")
        TokenizationMethod tokenizationMethod;

        private NetworkToken(
            String expMonth,
            String expYear,
            Map<String, Object> extraParams,
            String number,
            TokenizationMethod tokenizationMethod) {
          this.expMonth = expMonth;
          this.expYear = expYear;
          this.extraParams = extraParams;
          this.number = number;
          this.tokenizationMethod = tokenizationMethod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String expMonth;

          private String expYear;

          private Map<String, Object> extraParams;

          private String number;

          private TokenizationMethod tokenizationMethod;

          /** Finalize and obtain parameter instance from this builder. */
          public OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken build() {
            return new OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken(
                this.expMonth,
                this.expYear,
                this.extraParams,
                this.number,
                this.tokenizationMethod);
          }

          /**
           * <strong>Required.</strong> Two-digit number representing the network token's expiration
           * month.
           */
          public Builder setExpMonth(String expMonth) {
            this.expMonth = expMonth;
            return this;
          }

          /**
           * <strong>Required.</strong> Four-digit number representing the network token's
           * expiration year.
           */
          public Builder setExpYear(String expYear) {
            this.expYear = expYear;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken#extraParams} for the
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
           * OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The full network token number. */
          public Builder setNumber(String number) {
            this.number = number;
            return this;
          }

          /**
           * <strong>Required.</strong> The tokenization method used to generate the network token.
           */
          public Builder setTokenizationMethod(
              OffSessionPaymentCreateParams.PaymentMethodData.Card.NetworkToken.TokenizationMethod
                  tokenizationMethod) {
            this.tokenizationMethod = tokenizationMethod;
            return this;
          }
        }

        public enum TokenizationMethod implements ApiRequestParams.EnumParam {
          @SerializedName("apple_pay")
          APPLE_PAY("apple_pay"),

          @SerializedName("google_pay_dpan")
          GOOGLE_PAY_DPAN("google_pay_dpan"),

          @SerializedName("google_pay_ecommerce_token")
          GOOGLE_PAY_ECOMMERCE_TOKEN("google_pay_ecommerce_token");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TokenizationMethod(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("card")
      CARD("card");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
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
       * <strong>Required.</strong> Indicates whether the saved card is used for a recurring or
       * unscheduled payment.
       */
      @SerializedName("stored_credential_usage")
      StoredCredentialUsage storedCredentialUsage;

      private Card(Map<String, Object> extraParams, StoredCredentialUsage storedCredentialUsage) {
        this.extraParams = extraParams;
        this.storedCredentialUsage = storedCredentialUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private StoredCredentialUsage storedCredentialUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public OffSessionPaymentCreateParams.PaymentMethodOptions.Card build() {
          return new OffSessionPaymentCreateParams.PaymentMethodOptions.Card(
              this.extraParams, this.storedCredentialUsage);
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
         * <strong>Required.</strong> Indicates whether the saved card is used for a recurring or
         * unscheduled payment.
         */
        public Builder setStoredCredentialUsage(
            OffSessionPaymentCreateParams.PaymentMethodOptions.Card.StoredCredentialUsage
                storedCredentialUsage) {
          this.storedCredentialUsage = storedCredentialUsage;
          return this;
        }
      }

      public enum StoredCredentialUsage implements ApiRequestParams.EnumParam {
        @SerializedName("recurring")
        RECURRING("recurring"),

        @SerializedName("unscheduled")
        UNSCHEDULED("unscheduled");

        @Getter(onMethod_ = {@Override})
        private final String value;

        StoredCredentialUsage(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RawAmount {
    /** <strong>Required.</strong> The amount to collect and its currency. */
    @SerializedName("amount")
    Amount amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RawAmount(Amount amount, Map<String, Object> extraParams) {
      this.amount = amount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Amount amount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.RawAmount build() {
        return new OffSessionPaymentCreateParams.RawAmount(this.amount, this.extraParams);
      }

      /** <strong>Required.</strong> The amount to collect and its currency. */
      public Builder setAmount(Amount amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.RawAmount#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.RawAmount#extraParams} for the field
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
  public static class Retries {
    /** <strong>Required.</strong> Whether Stripe should retry failed payment attempts. */
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

    private Retries(Boolean enabled, Map<String, Object> extraParams) {
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
      public OffSessionPaymentCreateParams.Retries build() {
        return new OffSessionPaymentCreateParams.Retries(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Whether Stripe should retry failed payment attempts. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.Retries#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.Retries#extraParams} for the field documentation.
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
       * href="https://docs.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
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
}
