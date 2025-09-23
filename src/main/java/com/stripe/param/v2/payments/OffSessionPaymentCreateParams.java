// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPaymentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The “presentment amount” to be collected from the customer. */
  @SerializedName("amount")
  Amount amount;

  /** <strong>Required.</strong> The frequency of the underlying payment. */
  @SerializedName("cadence")
  Cadence cadence;

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
      Cadence cadence,
      String customer,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      RetryDetails retryDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      String testClock,
      TransferData transferData) {
    this.amount = amount;
    this.cadence = cadence;
    this.customer = customer;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
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

    private Cadence cadence;

    private String customer;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private RetryDetails retryDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private String testClock;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCreateParams build() {
      return new OffSessionPaymentCreateParams(
          this.amount,
          this.cadence,
          this.customer,
          this.extraParams,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
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

    /** <strong>Required.</strong> The frequency of the underlying payment. */
    public Builder setCadence(OffSessionPaymentCreateParams.Cadence cadence) {
      this.cadence = cadence;
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
  public static class RetryDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Indicates the strategy for how you want Stripe to retry the
     * payment.
     */
    @SerializedName("retry_strategy")
    RetryStrategy retryStrategy;

    private RetryDetails(Map<String, Object> extraParams, RetryStrategy retryStrategy) {
      this.extraParams = extraParams;
      this.retryStrategy = retryStrategy;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private RetryStrategy retryStrategy;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.RetryDetails build() {
        return new OffSessionPaymentCreateParams.RetryDetails(this.extraParams, this.retryStrategy);
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
      @SerializedName("none")
      NONE("none"),

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
}
