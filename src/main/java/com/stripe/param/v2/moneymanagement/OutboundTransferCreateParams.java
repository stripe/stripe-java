// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OutboundTransferCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The &quot;presentment amount&quot; for the OutboundPayment. */
  @SerializedName("amount")
  Amount amount;

  /** Delivery options to be used to send the OutboundTransfer. */
  @SerializedName("delivery_options")
  DeliveryOptions deliveryOptions;

  /** An arbitrary string attached to the OutboundTransfer. Often useful for displaying to users. */
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

  /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
  @SerializedName("from")
  From from;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> To which payout method to send the OutboundTransfer. */
  @SerializedName("to")
  To to;

  private OutboundTransferCreateParams(
      Amount amount,
      DeliveryOptions deliveryOptions,
      String description,
      Map<String, Object> extraParams,
      From from,
      Map<String, String> metadata,
      To to) {
    this.amount = amount;
    this.deliveryOptions = deliveryOptions;
    this.description = description;
    this.extraParams = extraParams;
    this.from = from;
    this.metadata = metadata;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private DeliveryOptions deliveryOptions;

    private String description;

    private Map<String, Object> extraParams;

    private From from;

    private Map<String, String> metadata;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundTransferCreateParams build() {
      return new OutboundTransferCreateParams(
          this.amount,
          this.deliveryOptions,
          this.description,
          this.extraParams,
          this.from,
          this.metadata,
          this.to);
    }

    /** <strong>Required.</strong> The &quot;presentment amount&quot; for the OutboundPayment. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Delivery options to be used to send the OutboundTransfer. */
    public Builder setDeliveryOptions(
        OutboundTransferCreateParams.DeliveryOptions deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * An arbitrary string attached to the OutboundTransfer. Often useful for displaying to users.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundTransferCreateParams#extraParams} for the field documentation.
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
     * See {@link OutboundTransferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount to pull funds from. */
    public Builder setFrom(OutboundTransferCreateParams.From from) {
      this.from = from;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundTransferCreateParams#metadata} for the field documentation.
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
     * See {@link OutboundTransferCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> To which payout method to send the OutboundTransfer. */
    public Builder setTo(OutboundTransferCreateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryOptions {
    /** Open Enum. Method for bank account. */
    @SerializedName("bank_account")
    BankAccount bankAccount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private DeliveryOptions(BankAccount bankAccount, Map<String, Object> extraParams) {
      this.bankAccount = bankAccount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BankAccount bankAccount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferCreateParams.DeliveryOptions build() {
        return new OutboundTransferCreateParams.DeliveryOptions(this.bankAccount, this.extraParams);
      }

      /** Open Enum. Method for bank account. */
      public Builder setBankAccount(
          OutboundTransferCreateParams.DeliveryOptions.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferCreateParams.DeliveryOptions#extraParams} for the field documentation.
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
       * See {@link OutboundTransferCreateParams.DeliveryOptions#extraParams} for the field
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

    public enum BankAccount implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("local")
      LOCAL("local"),

      @SerializedName("wire")
      WIRE("wire");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BankAccount(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class From {
    /** <strong>Required.</strong> Describes the FinancialAmount's currency drawn from. */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The FinancialAccount that funds were pulled from. */
    @SerializedName("financial_account")
    String financialAccount;

    private From(String currency, Map<String, Object> extraParams, String financialAccount) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String financialAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferCreateParams.From build() {
        return new OutboundTransferCreateParams.From(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> Describes the FinancialAmount's currency drawn from. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferCreateParams.From#extraParams} for the field documentation.
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
       * See {@link OutboundTransferCreateParams.From#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The FinancialAccount that funds were pulled from. */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class To {
    /**
     * Describes the currency to send to the recipient. If included, this currency must match a
     * currency supported by the destination. Can be omitted in the following cases: - destination
     * only supports one currency - destination supports multiple currencies and one of the
     * currencies matches the FA currency - destination supports multiple currencies and one of the
     * currencies matches the presentment currency Note - when both FA currency and presentment
     * currency are supported, we pick the FA currency to minimize FX.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The payout method which the OutboundTransfer uses to send payout.
     */
    @SerializedName("payout_method")
    String payoutMethod;

    private To(String currency, Map<String, Object> extraParams, String payoutMethod) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.payoutMethod = payoutMethod;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String payoutMethod;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferCreateParams.To build() {
        return new OutboundTransferCreateParams.To(
            this.currency, this.extraParams, this.payoutMethod);
      }

      /**
       * Describes the currency to send to the recipient. If included, this currency must match a
       * currency supported by the destination. Can be omitted in the following cases: - destination
       * only supports one currency - destination supports multiple currencies and one of the
       * currencies matches the FA currency - destination supports multiple currencies and one of
       * the currencies matches the presentment currency Note - when both FA currency and
       * presentment currency are supported, we pick the FA currency to minimize FX.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferCreateParams.To#extraParams} for the field documentation.
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
       * See {@link OutboundTransferCreateParams.To#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The payout method which the OutboundTransfer uses to send
       * payout.
       */
      public Builder setPayoutMethod(String payoutMethod) {
        this.payoutMethod = payoutMethod;
        return this;
      }
    }
  }
}
