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
public class CurrencyConversionCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The FinancialAccount id to create the CurrencyConversion on. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * <strong>Required.</strong> From amount object indicating the from currency or optional amount.
   */
  @SerializedName("from")
  From from;

  /** <strong>Required.</strong> To amount object indicating the to currency or optional amount. */
  @SerializedName("to")
  To to;

  private CurrencyConversionCreateParams(
      Map<String, Object> extraParams, String financialAccount, From from, To to) {
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.from = from;
    this.to = to;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String financialAccount;

    private From from;

    private To to;

    /** Finalize and obtain parameter instance from this builder. */
    public CurrencyConversionCreateParams build() {
      return new CurrencyConversionCreateParams(
          this.extraParams, this.financialAccount, this.from, this.to);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CurrencyConversionCreateParams#extraParams} for the field documentation.
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
     * See {@link CurrencyConversionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount id to create the CurrencyConversion on. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * <strong>Required.</strong> From amount object indicating the from currency or optional
     * amount.
     */
    public Builder setFrom(CurrencyConversionCreateParams.From from) {
      this.from = from;
      return this;
    }

    /**
     * <strong>Required.</strong> To amount object indicating the to currency or optional amount.
     */
    public Builder setTo(CurrencyConversionCreateParams.To to) {
      this.to = to;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class From {
    /** Amount object. */
    @SerializedName("amount")
    Amount amount;

    /** A lowercase alpha3 currency code like &quot;usd&quot;. */
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

    private From(Amount amount, String currency, Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Amount amount;

      private String currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CurrencyConversionCreateParams.From build() {
        return new CurrencyConversionCreateParams.From(
            this.amount, this.currency, this.extraParams);
      }

      /** Amount object. */
      public Builder setAmount(CurrencyConversionCreateParams.From.Amount amount) {
        this.amount = amount;
        return this;
      }

      /** A lowercase alpha3 currency code like &quot;usd&quot;. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CurrencyConversionCreateParams.From#extraParams} for the field documentation.
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
       * See {@link CurrencyConversionCreateParams.From#extraParams} for the field documentation.
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
    public static class Amount {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public CurrencyConversionCreateParams.From.Amount build() {
          return new CurrencyConversionCreateParams.From.Amount(
              this.currency, this.extraParams, this.value);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CurrencyConversionCreateParams.From.Amount#extraParams} for the field
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
         * map. See {@link CurrencyConversionCreateParams.From.Amount#extraParams} for the field
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
         * A non-negative integer representing how much to charge in the <a
         * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
         */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class To {
    /** Amount object. */
    @SerializedName("amount")
    Amount amount;

    /** A lowercase alpha3 currency code like &quot;usd&quot;. */
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

    private To(Amount amount, String currency, Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Amount amount;

      private String currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CurrencyConversionCreateParams.To build() {
        return new CurrencyConversionCreateParams.To(this.amount, this.currency, this.extraParams);
      }

      /** Amount object. */
      public Builder setAmount(CurrencyConversionCreateParams.To.Amount amount) {
        this.amount = amount;
        return this;
      }

      /** A lowercase alpha3 currency code like &quot;usd&quot;. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CurrencyConversionCreateParams.To#extraParams} for the field documentation.
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
       * See {@link CurrencyConversionCreateParams.To#extraParams} for the field documentation.
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
    public static class Amount {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public CurrencyConversionCreateParams.To.Amount build() {
          return new CurrencyConversionCreateParams.To.Amount(
              this.currency, this.extraParams, this.value);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CurrencyConversionCreateParams.To.Amount#extraParams} for the field
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
         * map. See {@link CurrencyConversionCreateParams.To.Amount#extraParams} for the field
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
         * A non-negative integer representing how much to charge in the <a
         * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
         */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }
    }
  }
}
