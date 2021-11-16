// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ShippingRateCreateParams extends ApiRequestParams {
  /**
   * The estimated range for how long shipping will take, meant to be displayable to the customer.
   * This will appear on CheckoutSessions.
   */
  @SerializedName("delivery_estimate")
  DeliveryEstimate deliveryEstimate;

  /**
   * The name of the shipping rate, meant to be displayable to the customer. This will appear on
   * CheckoutSessions.
   */
  @SerializedName("display_name")
  String displayName;

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
   * Describes a fixed amount to charge for shipping. Must be present if type is {@code
   * fixed_amount}.
   */
  @SerializedName("fixed_amount")
  FixedAmount fixedAmount;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
   * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /**
   * A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. The Shipping tax code is
   * {@code txcd_92010001}.
   */
  @SerializedName("tax_code")
  String taxCode;

  /**
   * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for now.
   */
  @SerializedName("type")
  Type type;

  private ShippingRateCreateParams(
      DeliveryEstimate deliveryEstimate,
      String displayName,
      List<String> expand,
      Map<String, Object> extraParams,
      FixedAmount fixedAmount,
      Map<String, String> metadata,
      TaxBehavior taxBehavior,
      String taxCode,
      Type type) {
    this.deliveryEstimate = deliveryEstimate;
    this.displayName = displayName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fixedAmount = fixedAmount;
    this.metadata = metadata;
    this.taxBehavior = taxBehavior;
    this.taxCode = taxCode;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private DeliveryEstimate deliveryEstimate;

    private String displayName;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FixedAmount fixedAmount;

    private Map<String, String> metadata;

    private TaxBehavior taxBehavior;

    private String taxCode;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ShippingRateCreateParams build() {
      return new ShippingRateCreateParams(
          this.deliveryEstimate,
          this.displayName,
          this.expand,
          this.extraParams,
          this.fixedAmount,
          this.metadata,
          this.taxBehavior,
          this.taxCode,
          this.type);
    }

    /**
     * The estimated range for how long shipping will take, meant to be displayable to the customer.
     * This will appear on CheckoutSessions.
     */
    public Builder setDeliveryEstimate(DeliveryEstimate deliveryEstimate) {
      this.deliveryEstimate = deliveryEstimate;
      return this;
    }

    /**
     * The name of the shipping rate, meant to be displayable to the customer. This will appear on
     * CheckoutSessions.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ShippingRateCreateParams#expand} for the field documentation.
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
     * ShippingRateCreateParams#expand} for the field documentation.
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
     * ShippingRateCreateParams#extraParams} for the field documentation.
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
     * See {@link ShippingRateCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Describes a fixed amount to charge for shipping. Must be present if type is {@code
     * fixed_amount}.
     */
    public Builder setFixedAmount(FixedAmount fixedAmount) {
      this.fixedAmount = fixedAmount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ShippingRateCreateParams#metadata} for the field documentation.
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
     * See {@link ShippingRateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
     * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
     */
    public Builder setTaxBehavior(TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * A <a href="https://stripe.com/docs/tax/tax-codes">tax code</a> ID. The Shipping tax code is
     * {@code txcd_92010001}.
     */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for
     * now.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class DeliveryEstimate {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
     */
    @SerializedName("maximum")
    Maximum maximum;

    /** The lower bound of the estimated range. If empty, represents no lower bound. */
    @SerializedName("minimum")
    Minimum minimum;

    private DeliveryEstimate(Map<String, Object> extraParams, Maximum maximum, Minimum minimum) {
      this.extraParams = extraParams;
      this.maximum = maximum;
      this.minimum = minimum;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Maximum maximum;

      private Minimum minimum;

      /** Finalize and obtain parameter instance from this builder. */
      public DeliveryEstimate build() {
        return new DeliveryEstimate(this.extraParams, this.maximum, this.minimum);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ShippingRateCreateParams.DeliveryEstimate#extraParams} for the field documentation.
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
       * See {@link ShippingRateCreateParams.DeliveryEstimate#extraParams} for the field
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
       * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
       */
      public Builder setMaximum(Maximum maximum) {
        this.maximum = maximum;
        return this;
      }

      /** The lower bound of the estimated range. If empty, represents no lower bound. */
      public Builder setMinimum(Minimum minimum) {
        this.minimum = minimum;
        return this;
      }
    }

    @Getter
    public static class Maximum {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A unit of time. */
      @SerializedName("unit")
      Unit unit;

      /** Must be greater than 0. */
      @SerializedName("value")
      Long value;

      private Maximum(Map<String, Object> extraParams, Unit unit, Long value) {
        this.extraParams = extraParams;
        this.unit = unit;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Unit unit;

        private Long value;

        /** Finalize and obtain parameter instance from this builder. */
        public Maximum build() {
          return new Maximum(this.extraParams, this.unit, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ShippingRateCreateParams.DeliveryEstimate.Maximum#extraParams} for the
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
         * map. See {@link ShippingRateCreateParams.DeliveryEstimate.Maximum#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A unit of time. */
        public Builder setUnit(Unit unit) {
          this.unit = unit;
          return this;
        }

        /** Must be greater than 0. */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }

      public enum Unit implements ApiRequestParams.EnumParam {
        @SerializedName("business_day")
        BUSINESS_DAY("business_day"),

        @SerializedName("day")
        DAY("day"),

        @SerializedName("hour")
        HOUR("hour"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Unit(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Minimum {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A unit of time. */
      @SerializedName("unit")
      Unit unit;

      /** Must be greater than 0. */
      @SerializedName("value")
      Long value;

      private Minimum(Map<String, Object> extraParams, Unit unit, Long value) {
        this.extraParams = extraParams;
        this.unit = unit;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Unit unit;

        private Long value;

        /** Finalize and obtain parameter instance from this builder. */
        public Minimum build() {
          return new Minimum(this.extraParams, this.unit, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ShippingRateCreateParams.DeliveryEstimate.Minimum#extraParams} for the
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
         * map. See {@link ShippingRateCreateParams.DeliveryEstimate.Minimum#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A unit of time. */
        public Builder setUnit(Unit unit) {
          this.unit = unit;
          return this;
        }

        /** Must be greater than 0. */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }

      public enum Unit implements ApiRequestParams.EnumParam {
        @SerializedName("business_day")
        BUSINESS_DAY("business_day"),

        @SerializedName("day")
        DAY("day"),

        @SerializedName("hour")
        HOUR("hour"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Unit(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class FixedAmount {
    /** A non-negative integer in cents representing how much to charge. */
    @SerializedName("amount")
    Long amount;

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

    private FixedAmount(Long amount, String currency, Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FixedAmount build() {
        return new FixedAmount(this.amount, this.currency, this.extraParams);
      }

      /** A non-negative integer in cents representing how much to charge. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
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
       * ShippingRateCreateParams.FixedAmount#extraParams} for the field documentation.
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
       * See {@link ShippingRateCreateParams.FixedAmount#extraParams} for the field documentation.
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("fixed_amount")
    FIXED_AMOUNT("fixed_amount");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
