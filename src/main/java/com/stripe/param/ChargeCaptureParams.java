// File generated from our OpenAPI spec
package com.stripe.param;

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
public class ChargeCaptureParams extends ApiRequestParams {
  /** The amount to capture, which must be less than or equal to the original amount. */
  @SerializedName("amount")
  Long amount;

  /** An application fee to add on to this charge. */
  @SerializedName("application_fee")
  Long applicationFee;

  /**
   * An application fee amount to add on to this charge, which must be less than or equal to the
   * original amount.
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
   * The email address to send this charge's receipt to. This will override the previously-specified
   * email address for this charge, if one was set. Receipts will not be sent in test mode.
   */
  @SerializedName("receipt_email")
  String receiptEmail;

  /**
   * For a non-card charge, text that appears on the customer's statement as the statement
   * descriptor. This value overrides the account's default statement descriptor. For information
   * about requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   *
   * <p>For a card charge, this value is ignored unless you don't specify a {@code
   * statement_descriptor_suffix}, in which case this value is used as the suffix.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement. If the account has no prefix value, the suffix is concatenated to the account's
   * statement descriptor.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * An optional dictionary including the account to automatically transfer to as part of a
   * destination charge. <a href="https://docs.stripe.com/connect/destination-charges">See the
   * Connect documentation</a> for details.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies this transaction as part of a group. {@code transfer_group} may only
   * be provided if it has not been set. See the <a
   * href="https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options">Connect
   * documentation</a> for details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private ChargeCaptureParams(
      Long amount,
      Long applicationFee,
      Long applicationFeeAmount,
      List<String> expand,
      Map<String, Object> extraParams,
      String receiptEmail,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData,
      String transferGroup) {
    this.amount = amount;
    this.applicationFee = applicationFee;
    this.applicationFeeAmount = applicationFeeAmount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.receiptEmail = receiptEmail;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long applicationFee;

    private Long applicationFeeAmount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String receiptEmail;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public ChargeCaptureParams build() {
      return new ChargeCaptureParams(
          this.amount,
          this.applicationFee,
          this.applicationFeeAmount,
          this.expand,
          this.extraParams,
          this.receiptEmail,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup);
    }

    /** The amount to capture, which must be less than or equal to the original amount. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** An application fee to add on to this charge. */
    public Builder setApplicationFee(Long applicationFee) {
      this.applicationFee = applicationFee;
      return this;
    }

    /**
     * An application fee amount to add on to this charge, which must be less than or equal to the
     * original amount.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeCaptureParams#expand} for the field documentation.
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
     * ChargeCaptureParams#expand} for the field documentation.
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
     * ChargeCaptureParams#extraParams} for the field documentation.
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
     * See {@link ChargeCaptureParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The email address to send this charge's receipt to. This will override the
     * previously-specified email address for this charge, if one was set. Receipts will not be sent
     * in test mode.
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * For a non-card charge, text that appears on the customer's statement as the statement
     * descriptor. This value overrides the account's default statement descriptor. For information
     * about requirements, including the 22-character limit, see <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
     * Descriptor docs</a>.
     *
     * <p>For a card charge, this value is ignored unless you don't specify a {@code
     * statement_descriptor_suffix}, in which case this value is used as the suffix.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Provides information about a card charge. Concatenated to the account's <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
     * descriptor prefix</a> to form the complete statement descriptor that appears on the
     * customer's statement. If the account has no prefix value, the suffix is concatenated to the
     * account's statement descriptor.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * An optional dictionary including the account to automatically transfer to as part of a
     * destination charge. <a href="https://docs.stripe.com/connect/destination-charges">See the
     * Connect documentation</a> for details.
     */
    public Builder setTransferData(ChargeCaptureParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. {@code transfer_group} may only
     * be provided if it has not been set. See the <a
     * href="https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData {
    /**
     * The amount transferred to the destination account, if specified. By default, the entire
     * charge amount is transferred to the destination account.
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
      public ChargeCaptureParams.TransferData build() {
        return new ChargeCaptureParams.TransferData(this.amount, this.extraParams);
      }

      /**
       * The amount transferred to the destination account, if specified. By default, the entire
       * charge amount is transferred to the destination account.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeCaptureParams.TransferData#extraParams} for the field documentation.
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
       * See {@link ChargeCaptureParams.TransferData#extraParams} for the field documentation.
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
