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
public class InboundTransferCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The amount, in specified currency, by which the FinancialAccount
   * balance will increase due to the InboundTransfer.
   */
  @SerializedName("amount")
  Amount amount;

  /** An optional, freeform description field intended to store metadata. */
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

  /**
   * <strong>Required.</strong> Object containing details about where the funds will originate from.
   */
  @SerializedName("from")
  From from;

  /** <strong>Required.</strong> Object containing details about where the funds will land. */
  @SerializedName("to")
  To to;

  private InboundTransferCreateParams(
      Amount amount, String description, Map<String, Object> extraParams, From from, To to) {
    this.amount = amount;
    this.description = description;
    this.extraParams = extraParams;
    this.from = from;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private String description;

    private Map<String, Object> extraParams;

    private From from;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public InboundTransferCreateParams build() {
      return new InboundTransferCreateParams(
          this.amount, this.description, this.extraParams, this.from, this.to);
    }

    /**
     * <strong>Required.</strong> The amount, in specified currency, by which the FinancialAccount
     * balance will increase due to the InboundTransfer.
     */
    public Builder setAmount(InboundTransferCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /** An optional, freeform description field intended to store metadata. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InboundTransferCreateParams#extraParams} for the field documentation.
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
     * See {@link InboundTransferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Object containing details about where the funds will originate
     * from.
     */
    public Builder setFrom(InboundTransferCreateParams.From from) {
      this.from = from;
      return this;
    }

    /** <strong>Required.</strong> Object containing details about where the funds will land. */
    public Builder setTo(InboundTransferCreateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
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
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;

    private Amount(String currency, Map<String, Object> extraParams, Long value) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private Long value;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferCreateParams.Amount build() {
        return new InboundTransferCreateParams.Amount(this.currency, this.extraParams, this.value);
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link InboundTransferCreateParams.Amount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class From {
    /**
     * An optional currency field used to specify which currency is debited from the Payment Method.
     * Since many Payment Methods support only one currency, this field is optional.
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

    /** <strong>Required.</strong> ID of the Payment Method using which IBT will be made. */
    @SerializedName("payment_method")
    String paymentMethod;

    private From(String currency, Map<String, Object> extraParams, String paymentMethod) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.paymentMethod = paymentMethod;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String paymentMethod;

      /** Finalize and obtain parameter instance from this builder. */
      public InboundTransferCreateParams.From build() {
        return new InboundTransferCreateParams.From(
            this.currency, this.extraParams, this.paymentMethod);
      }

      /**
       * An optional currency field used to specify which currency is debited from the Payment
       * Method. Since many Payment Methods support only one currency, this field is optional.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferCreateParams.From#extraParams} for the field documentation.
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
       * See {@link InboundTransferCreateParams.From#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> ID of the Payment Method using which IBT will be made. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class To {
    /** <strong>Required.</strong> The currency in which funds will land in. */
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

    /** <strong>Required.</strong> The FinancialAccount that funds will land in. */
    @SerializedName("financial_account")
    String financialAccount;

    private To(String currency, Map<String, Object> extraParams, String financialAccount) {
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
      public InboundTransferCreateParams.To build() {
        return new InboundTransferCreateParams.To(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> The currency in which funds will land in. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InboundTransferCreateParams.To#extraParams} for the field documentation.
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
       * See {@link InboundTransferCreateParams.To#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The FinancialAccount that funds will land in. */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }
    }
  }
}
