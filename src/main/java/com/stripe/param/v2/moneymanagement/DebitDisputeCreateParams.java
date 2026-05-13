// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class DebitDisputeCreateParams extends ApiRequestParams {
  /** Parameters for bank transfer disputes. */
  @SerializedName("bank_transfer")
  BankTransfer bankTransfer;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The ID of the ReceivedDebit to dispute. */
  @SerializedName("received_debit")
  String receivedDebit;

  private DebitDisputeCreateParams(
      BankTransfer bankTransfer, Map<String, Object> extraParams, String receivedDebit) {
    this.bankTransfer = bankTransfer;
    this.extraParams = extraParams;
    this.receivedDebit = receivedDebit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BankTransfer bankTransfer;

    private Map<String, Object> extraParams;

    private String receivedDebit;

    /** Finalize and obtain parameter instance from this builder. */
    public DebitDisputeCreateParams build() {
      return new DebitDisputeCreateParams(this.bankTransfer, this.extraParams, this.receivedDebit);
    }

    /** Parameters for bank transfer disputes. */
    public Builder setBankTransfer(DebitDisputeCreateParams.BankTransfer bankTransfer) {
      this.bankTransfer = bankTransfer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * DebitDisputeCreateParams#extraParams} for the field documentation.
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
     * See {@link DebitDisputeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The ID of the ReceivedDebit to dispute. */
    public Builder setReceivedDebit(String receivedDebit) {
      this.receivedDebit = receivedDebit;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BankTransfer {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The reason for the dispute. */
    @SerializedName("reason")
    Reason reason;

    private BankTransfer(Map<String, Object> extraParams, Reason reason) {
      this.extraParams = extraParams;
      this.reason = reason;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Reason reason;

      /** Finalize and obtain parameter instance from this builder. */
      public DebitDisputeCreateParams.BankTransfer build() {
        return new DebitDisputeCreateParams.BankTransfer(this.extraParams, this.reason);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DebitDisputeCreateParams.BankTransfer#extraParams} for the field documentation.
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
       * See {@link DebitDisputeCreateParams.BankTransfer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The reason for the dispute. */
      public Builder setReason(DebitDisputeCreateParams.BankTransfer.Reason reason) {
        this.reason = reason;
        return this;
      }
    }

    public enum Reason implements ApiRequestParams.EnumParam {
      @SerializedName("incorrect_amount_or_date")
      INCORRECT_AMOUNT_OR_DATE("incorrect_amount_or_date"),

      @SerializedName("unauthorized")
      UNAUTHORIZED("unauthorized");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Reason(String value) {
        this.value = value;
      }
    }
  }
}
