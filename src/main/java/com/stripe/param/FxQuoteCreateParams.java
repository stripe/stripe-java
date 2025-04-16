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
public class FxQuoteCreateParams extends ApiRequestParams {
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
   * <strong>Required.</strong> A list of three letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be <a href="https://stripe.com/docs/currencies">supported currencies</a>.
   */
  @SerializedName("from_currencies")
  List<String> fromCurrencies;

  /**
   * <strong>Required.</strong> The duration that you wish the quote to be locked for. The quote
   * will be usable for the duration specified. The default is {@code none}. The maximum is 1 day.
   */
  @SerializedName("lock_duration")
  LockDuration lockDuration;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("to_currency")
  String toCurrency;

  /** The usage specific information for the quote. */
  @SerializedName("usage")
  Usage usage;

  private FxQuoteCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      List<String> fromCurrencies,
      LockDuration lockDuration,
      String toCurrency,
      Usage usage) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.fromCurrencies = fromCurrencies;
    this.lockDuration = lockDuration;
    this.toCurrency = toCurrency;
    this.usage = usage;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<String> fromCurrencies;

    private LockDuration lockDuration;

    private String toCurrency;

    private Usage usage;

    /** Finalize and obtain parameter instance from this builder. */
    public FxQuoteCreateParams build() {
      return new FxQuoteCreateParams(
          this.expand,
          this.extraParams,
          this.fromCurrencies,
          this.lockDuration,
          this.toCurrency,
          this.usage);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FxQuoteCreateParams#expand} for the field documentation.
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
     * FxQuoteCreateParams#expand} for the field documentation.
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
     * FxQuoteCreateParams#extraParams} for the field documentation.
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
     * See {@link FxQuoteCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `fromCurrencies` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * FxQuoteCreateParams#fromCurrencies} for the field documentation.
     */
    public Builder addFromCurrency(String element) {
      if (this.fromCurrencies == null) {
        this.fromCurrencies = new ArrayList<>();
      }
      this.fromCurrencies.add(element);
      return this;
    }

    /**
     * Add all elements to `fromCurrencies` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * FxQuoteCreateParams#fromCurrencies} for the field documentation.
     */
    public Builder addAllFromCurrency(List<String> elements) {
      if (this.fromCurrencies == null) {
        this.fromCurrencies = new ArrayList<>();
      }
      this.fromCurrencies.addAll(elements);
      return this;
    }

    /**
     * <strong>Required.</strong> The duration that you wish the quote to be locked for. The quote
     * will be usable for the duration specified. The default is {@code none}. The maximum is 1 day.
     */
    public Builder setLockDuration(FxQuoteCreateParams.LockDuration lockDuration) {
      this.lockDuration = lockDuration;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setToCurrency(String toCurrency) {
      this.toCurrency = toCurrency;
      return this;
    }

    /** The usage specific information for the quote. */
    public Builder setUsage(FxQuoteCreateParams.Usage usage) {
      this.usage = usage;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Usage {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The payment transaction details that are intended for the FX Quote. */
    @SerializedName("payment")
    Payment payment;

    /** The transfer transaction details that are intended for the FX Quote. */
    @SerializedName("transfer")
    Transfer transfer;

    /**
     * <strong>Required.</strong> Which transaction the FX Quote will be used for
     *
     * <p>Can be “payment” | “transfer”
     */
    @SerializedName("type")
    Type type;

    private Usage(Map<String, Object> extraParams, Payment payment, Transfer transfer, Type type) {
      this.extraParams = extraParams;
      this.payment = payment;
      this.transfer = transfer;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Payment payment;

      private Transfer transfer;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public FxQuoteCreateParams.Usage build() {
        return new FxQuoteCreateParams.Usage(
            this.extraParams, this.payment, this.transfer, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FxQuoteCreateParams.Usage#extraParams} for the field documentation.
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
       * See {@link FxQuoteCreateParams.Usage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The payment transaction details that are intended for the FX Quote. */
      public Builder setPayment(FxQuoteCreateParams.Usage.Payment payment) {
        this.payment = payment;
        return this;
      }

      /** The transfer transaction details that are intended for the FX Quote. */
      public Builder setTransfer(FxQuoteCreateParams.Usage.Transfer transfer) {
        this.transfer = transfer;
        return this;
      }

      /**
       * <strong>Required.</strong> Which transaction the FX Quote will be used for
       *
       * <p>Can be “payment” | “transfer”
       */
      public Builder setType(FxQuoteCreateParams.Usage.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payment {
      /**
       * The Stripe account ID that the funds will be transferred to.
       *
       * <p>This field should match the account ID that would be used in the PaymentIntent’s
       * transfer_data[destination] field.
       */
      @SerializedName("destination")
      String destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The Stripe account ID that these funds are intended for.
       *
       * <p>This field should match the account ID that would be used in the PaymentIntent’s
       * on_behalf_of field.
       */
      @SerializedName("on_behalf_of")
      String onBehalfOf;

      private Payment(String destination, Map<String, Object> extraParams, String onBehalfOf) {
        this.destination = destination;
        this.extraParams = extraParams;
        this.onBehalfOf = onBehalfOf;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String destination;

        private Map<String, Object> extraParams;

        private String onBehalfOf;

        /** Finalize and obtain parameter instance from this builder. */
        public FxQuoteCreateParams.Usage.Payment build() {
          return new FxQuoteCreateParams.Usage.Payment(
              this.destination, this.extraParams, this.onBehalfOf);
        }

        /**
         * The Stripe account ID that the funds will be transferred to.
         *
         * <p>This field should match the account ID that would be used in the PaymentIntent’s
         * transfer_data[destination] field.
         */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FxQuoteCreateParams.Usage.Payment#extraParams} for the field
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
         * map. See {@link FxQuoteCreateParams.Usage.Payment#extraParams} for the field
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
         * The Stripe account ID that these funds are intended for.
         *
         * <p>This field should match the account ID that would be used in the PaymentIntent’s
         * on_behalf_of field.
         */
        public Builder setOnBehalfOf(String onBehalfOf) {
          this.onBehalfOf = onBehalfOf;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Transfer {
      /**
       * <strong>Required.</strong> The Stripe account ID that the funds will be transferred to.
       *
       * <p>This field should match the account ID that would be used in the Transfer’s destination
       * field.
       */
      @SerializedName("destination")
      String destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Transfer(String destination, Map<String, Object> extraParams) {
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public FxQuoteCreateParams.Usage.Transfer build() {
          return new FxQuoteCreateParams.Usage.Transfer(this.destination, this.extraParams);
        }

        /**
         * <strong>Required.</strong> The Stripe account ID that the funds will be transferred to.
         *
         * <p>This field should match the account ID that would be used in the Transfer’s
         * destination field.
         */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link FxQuoteCreateParams.Usage.Transfer#extraParams} for the field
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
         * map. See {@link FxQuoteCreateParams.Usage.Transfer#extraParams} for the field
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

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("payment")
      PAYMENT("payment"),

      @SerializedName("transfer")
      TRANSFER("transfer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum LockDuration implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("five_minutes")
    FIVE_MINUTES("five_minutes"),

    @SerializedName("hour")
    HOUR("hour"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    LockDuration(String value) {
      this.value = value;
    }
  }
}
