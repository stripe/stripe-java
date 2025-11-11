// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPaymentCaptureParams extends ApiRequestParams {
  /** <strong>Required.</strong> The amount to capture. */
  @SerializedName("amount_to_capture")
  Long amountToCapture;

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

  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private OffSessionPaymentCaptureParams(
      Long amountToCapture,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData) {
    this.amountToCapture = amountToCapture;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amountToCapture;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCaptureParams build() {
      return new OffSessionPaymentCaptureParams(
          this.amountToCapture,
          this.extraParams,
          this.metadata,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData);
    }

    /** <strong>Required.</strong> The amount to capture. */
    public Builder setAmountToCapture(Long amountToCapture) {
      this.amountToCapture = amountToCapture;
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

    /**
     * The data that automatically creates a Transfer after the payment finalizes. Learn more about
     * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
     * accounts</a>.
     */
    public Builder setTransferData(OffSessionPaymentCaptureParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
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
      public OffSessionPaymentCaptureParams.TransferData build() {
        return new OffSessionPaymentCaptureParams.TransferData(
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
