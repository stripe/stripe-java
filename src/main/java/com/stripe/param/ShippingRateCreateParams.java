// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ShippingRateCreateParams extends ApiRequestParams {
  /**
   * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on CheckoutSessions.
   */
  @SerializedName("delivery_estimate")
  DeliveryEstimate deliveryEstimate;

  /**
   * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
   */
  @SerializedName("display_name")
  String displayName;

  /**
   * Specifies which fields in the response should be expanded.
   */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Describes a fixed amount to charge for shipping. Must be present if type is {@code fixed_amount}.
   */
  @SerializedName("fixed_amount")
  FixedAmount fixedAmount;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /**
   * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax code is {@code txcd_92010001}.
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

    /**
     * Finalize and obtain parameter instance from this builder.
     */
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
        this.type
      );
    }

    /**
     * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on CheckoutSessions.
     */
    public Builder setDeliveryEstimate(DeliveryEstimate deliveryEstimate) {
      this.deliveryEstimate = deliveryEstimate;
      return this;
    }

    /**
     * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ShippingRateCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ShippingRateCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Describes a fixed amount to charge for shipping. Must be present if type is {@code fixed_amount}.
     */
    public Builder setFixedAmount(FixedAmount fixedAmount) {
      this.fixedAmount = fixedAmount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
     */
    public Builder setTaxBehavior(TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax code is {@code txcd_92010001}.
     */
    public Builder setTaxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for now.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }
  @Getter
  public static class DeliveryEstimate {
    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
     */
    @SerializedName("maximum")
    Maximum maximum;

    /**
     * The lower bound of the estimated range. If empty, represents no lower bound.
     */
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

      /**
       * Finalize and obtain parameter instance from this builder.
       */
      public DeliveryEstimate build() {
        return new DeliveryEstimate(this.extraParams, this.maximum, this.minimum);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate#extraParams} for the field documentation.
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

      /**
       * The lower bound of the estimated range. If empty, represents no lower bound.
       */
      public Builder setMinimum(Minimum minimum) {
        this.minimum = minimum;
        return this;
      }
    }
    @Getter
    public static class Maximum {
      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A unit of time.
       */
      @SerializedName("unit")
      Unit unit;

      /**
       * Must be greater than 0.
       */
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

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Maximum build() {
          return new Maximum(this.extraParams, this.unit, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate.Maximum#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate.Maximum#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * A unit of time.
         */
        public Builder setUnit(Unit unit) {
          this.unit = unit;
          return this;
        }

        /**
         * Must be greater than 0.
         */
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
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A unit of time.
       */
      @SerializedName("unit")
      Unit unit;

      /**
       * Must be greater than 0.
       */
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

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Minimum build() {
          return new Minimum(this.extraParams, this.unit, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate.Minimum#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.DeliveryEstimate.Minimum#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * A unit of time.
         */
        public Builder setUnit(Unit unit) {
          this.unit = unit;
          return this;
        }

        /**
         * Must be greater than 0.
         */
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
    /**
     * A non-negative integer in cents representing how much to charge.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Shipping rates defined in each available currency option. Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency_options")
    CurrencyOptions currencyOptions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private FixedAmount(
        Long amount,
        String currency,
        CurrencyOptions currencyOptions,
        Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.currencyOptions = currencyOptions;
      this.extraParams = extraParams;
    }
    public static Builder builder() {
      return new Builder();
    }
    public static class Builder {
      private Long amount;

      private String currency;

      private CurrencyOptions currencyOptions;

      private Map<String, Object> extraParams;

      /**
       * Finalize and obtain parameter instance from this builder.
       */
      public FixedAmount build() {
        return new FixedAmount(this.amount, this.currency, this.currencyOptions, this.extraParams);
      }

      /**
       * A non-negative integer in cents representing how much to charge.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Shipping rates defined in each available currency option. Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrencyOptions(CurrencyOptions currencyOptions) {
        this.currencyOptions = currencyOptions;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount#extraParams} for the field documentation.
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
    public static class CurrencyOptions {
      /**
       * Shipping rate defined in AED.
       */
      @SerializedName("aed")
      Aed aed;

      /**
       * Shipping rate defined in AFN.
       */
      @SerializedName("afn")
      Afn afn;

      /**
       * Shipping rate defined in ALL.
       */
      @SerializedName("all")
      All all;

      /**
       * Shipping rate defined in AMD.
       */
      @SerializedName("amd")
      Amd amd;

      /**
       * Shipping rate defined in ANG.
       */
      @SerializedName("ang")
      Ang ang;

      /**
       * Shipping rate defined in AOA.
       */
      @SerializedName("aoa")
      Aoa aoa;

      /**
       * Shipping rate defined in ARS.
       */
      @SerializedName("ars")
      Ars ars;

      /**
       * Shipping rate defined in AUD.
       */
      @SerializedName("aud")
      Aud aud;

      /**
       * Shipping rate defined in AWG.
       */
      @SerializedName("awg")
      Awg awg;

      /**
       * Shipping rate defined in AZN.
       */
      @SerializedName("azn")
      Azn azn;

      /**
       * Shipping rate defined in BAM.
       */
      @SerializedName("bam")
      Bam bam;

      /**
       * Shipping rate defined in BBD.
       */
      @SerializedName("bbd")
      Bbd bbd;

      /**
       * Shipping rate defined in BDT.
       */
      @SerializedName("bdt")
      Bdt bdt;

      /**
       * Shipping rate defined in BGN.
       */
      @SerializedName("bgn")
      Bgn bgn;

      /**
       * Shipping rate defined in BHD.
       */
      @SerializedName("bhd")
      Bhd bhd;

      /**
       * Shipping rate defined in BIF.
       */
      @SerializedName("bif")
      Bif bif;

      /**
       * Shipping rate defined in BMD.
       */
      @SerializedName("bmd")
      Bmd bmd;

      /**
       * Shipping rate defined in BND.
       */
      @SerializedName("bnd")
      Bnd bnd;

      /**
       * Shipping rate defined in BOB.
       */
      @SerializedName("bob")
      Bob bob;

      /**
       * Shipping rate defined in BRL.
       */
      @SerializedName("brl")
      Brl brl;

      /**
       * Shipping rate defined in BSD.
       */
      @SerializedName("bsd")
      Bsd bsd;

      /**
       * Shipping rate defined in BTN.
       */
      @SerializedName("btn")
      Btn btn;

      /**
       * Shipping rate defined in BWP.
       */
      @SerializedName("bwp")
      Bwp bwp;

      /**
       * Shipping rate defined in BYN.
       */
      @SerializedName("byn")
      Byn byn;

      /**
       * Shipping rate defined in BZD.
       */
      @SerializedName("bzd")
      Bzd bzd;

      /**
       * Shipping rate defined in CAD.
       */
      @SerializedName("cad")
      Cad cad;

      /**
       * Shipping rate defined in CDF.
       */
      @SerializedName("cdf")
      Cdf cdf;

      /**
       * Shipping rate defined in CHF.
       */
      @SerializedName("chf")
      Chf chf;

      /**
       * Shipping rate defined in CLP.
       */
      @SerializedName("clp")
      Clp clp;

      /**
       * Shipping rate defined in CNY.
       */
      @SerializedName("cny")
      Cny cny;

      /**
       * Shipping rate defined in COP.
       */
      @SerializedName("cop")
      Cop cop;

      /**
       * Shipping rate defined in CRC.
       */
      @SerializedName("crc")
      Crc crc;

      /**
       * Shipping rate defined in CVE.
       */
      @SerializedName("cve")
      Cve cve;

      /**
       * Shipping rate defined in CZK.
       */
      @SerializedName("czk")
      Czk czk;

      /**
       * Shipping rate defined in DJF.
       */
      @SerializedName("djf")
      Djf djf;

      /**
       * Shipping rate defined in DKK.
       */
      @SerializedName("dkk")
      Dkk dkk;

      /**
       * Shipping rate defined in DOP.
       */
      @SerializedName("dop")
      Dop dop;

      /**
       * Shipping rate defined in DZD.
       */
      @SerializedName("dzd")
      Dzd dzd;

      /**
       * Shipping rate defined in EGP.
       */
      @SerializedName("egp")
      Egp egp;

      /**
       * Shipping rate defined in ETB.
       */
      @SerializedName("etb")
      Etb etb;

      /**
       * Shipping rate defined in EUR.
       */
      @SerializedName("eur")
      Eur eur;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Shipping rate defined in FJD.
       */
      @SerializedName("fjd")
      Fjd fjd;

      /**
       * Shipping rate defined in FKP.
       */
      @SerializedName("fkp")
      Fkp fkp;

      /**
       * Shipping rate defined in GBP.
       */
      @SerializedName("gbp")
      Gbp gbp;

      /**
       * Shipping rate defined in GEL.
       */
      @SerializedName("gel")
      Gel gel;

      /**
       * Shipping rate defined in GHS.
       */
      @SerializedName("ghs")
      Ghs ghs;

      /**
       * Shipping rate defined in GIP.
       */
      @SerializedName("gip")
      Gip gip;

      /**
       * Shipping rate defined in GMD.
       */
      @SerializedName("gmd")
      Gmd gmd;

      /**
       * Shipping rate defined in GNF.
       */
      @SerializedName("gnf")
      Gnf gnf;

      /**
       * Shipping rate defined in GTQ.
       */
      @SerializedName("gtq")
      Gtq gtq;

      /**
       * Shipping rate defined in GYD.
       */
      @SerializedName("gyd")
      Gyd gyd;

      /**
       * Shipping rate defined in HKD.
       */
      @SerializedName("hkd")
      Hkd hkd;

      /**
       * Shipping rate defined in HNL.
       */
      @SerializedName("hnl")
      Hnl hnl;

      /**
       * Shipping rate defined in HRK.
       */
      @SerializedName("hrk")
      Hrk hrk;

      /**
       * Shipping rate defined in HTG.
       */
      @SerializedName("htg")
      Htg htg;

      /**
       * Shipping rate defined in HUF.
       */
      @SerializedName("huf")
      Huf huf;

      /**
       * Shipping rate defined in IDR.
       */
      @SerializedName("idr")
      Idr idr;

      /**
       * Shipping rate defined in ILS.
       */
      @SerializedName("ils")
      Ils ils;

      /**
       * Shipping rate defined in INR.
       */
      @SerializedName("inr")
      Inr inr;

      /**
       * Shipping rate defined in ISK.
       */
      @SerializedName("isk")
      Isk isk;

      /**
       * Shipping rate defined in JMD.
       */
      @SerializedName("jmd")
      Jmd jmd;

      /**
       * Shipping rate defined in JOD.
       */
      @SerializedName("jod")
      Jod jod;

      /**
       * Shipping rate defined in JPY.
       */
      @SerializedName("jpy")
      Jpy jpy;

      /**
       * Shipping rate defined in KES.
       */
      @SerializedName("kes")
      Kes kes;

      /**
       * Shipping rate defined in KGS.
       */
      @SerializedName("kgs")
      Kgs kgs;

      /**
       * Shipping rate defined in KHR.
       */
      @SerializedName("khr")
      Khr khr;

      /**
       * Shipping rate defined in KMF.
       */
      @SerializedName("kmf")
      Kmf kmf;

      /**
       * Shipping rate defined in KRW.
       */
      @SerializedName("krw")
      Krw krw;

      /**
       * Shipping rate defined in KWD.
       */
      @SerializedName("kwd")
      Kwd kwd;

      /**
       * Shipping rate defined in KYD.
       */
      @SerializedName("kyd")
      Kyd kyd;

      /**
       * Shipping rate defined in KZT.
       */
      @SerializedName("kzt")
      Kzt kzt;

      /**
       * Shipping rate defined in LAK.
       */
      @SerializedName("lak")
      Lak lak;

      /**
       * Shipping rate defined in LBP.
       */
      @SerializedName("lbp")
      Lbp lbp;

      /**
       * Shipping rate defined in LKR.
       */
      @SerializedName("lkr")
      Lkr lkr;

      /**
       * Shipping rate defined in LRD.
       */
      @SerializedName("lrd")
      Lrd lrd;

      /**
       * Shipping rate defined in LSL.
       */
      @SerializedName("lsl")
      Lsl lsl;

      /**
       * Shipping rate defined in MAD.
       */
      @SerializedName("mad")
      Mad mad;

      /**
       * Shipping rate defined in MDL.
       */
      @SerializedName("mdl")
      Mdl mdl;

      /**
       * Shipping rate defined in MGA.
       */
      @SerializedName("mga")
      Mga mga;

      /**
       * Shipping rate defined in MKD.
       */
      @SerializedName("mkd")
      Mkd mkd;

      /**
       * Shipping rate defined in MMK.
       */
      @SerializedName("mmk")
      Mmk mmk;

      /**
       * Shipping rate defined in MNT.
       */
      @SerializedName("mnt")
      Mnt mnt;

      /**
       * Shipping rate defined in MOP.
       */
      @SerializedName("mop")
      Mop mop;

      /**
       * Shipping rate defined in MRO.
       */
      @SerializedName("mro")
      Mro mro;

      /**
       * Shipping rate defined in MUR.
       */
      @SerializedName("mur")
      Mur mur;

      /**
       * Shipping rate defined in MVR.
       */
      @SerializedName("mvr")
      Mvr mvr;

      /**
       * Shipping rate defined in MWK.
       */
      @SerializedName("mwk")
      Mwk mwk;

      /**
       * Shipping rate defined in MXN.
       */
      @SerializedName("mxn")
      Mxn mxn;

      /**
       * Shipping rate defined in MYR.
       */
      @SerializedName("myr")
      Myr myr;

      /**
       * Shipping rate defined in MZN.
       */
      @SerializedName("mzn")
      Mzn mzn;

      /**
       * Shipping rate defined in NAD.
       */
      @SerializedName("nad")
      Nad nad;

      /**
       * Shipping rate defined in NGN.
       */
      @SerializedName("ngn")
      Ngn ngn;

      /**
       * Shipping rate defined in NIO.
       */
      @SerializedName("nio")
      Nio nio;

      /**
       * Shipping rate defined in NOK.
       */
      @SerializedName("nok")
      Nok nok;

      /**
       * Shipping rate defined in NPR.
       */
      @SerializedName("npr")
      Npr npr;

      /**
       * Shipping rate defined in NZD.
       */
      @SerializedName("nzd")
      Nzd nzd;

      /**
       * Shipping rate defined in OMR.
       */
      @SerializedName("omr")
      Omr omr;

      /**
       * Shipping rate defined in PAB.
       */
      @SerializedName("pab")
      Pab pab;

      /**
       * Shipping rate defined in PEN.
       */
      @SerializedName("pen")
      Pen pen;

      /**
       * Shipping rate defined in PGK.
       */
      @SerializedName("pgk")
      Pgk pgk;

      /**
       * Shipping rate defined in PHP.
       */
      @SerializedName("php")
      Php php;

      /**
       * Shipping rate defined in PKR.
       */
      @SerializedName("pkr")
      Pkr pkr;

      /**
       * Shipping rate defined in PLN.
       */
      @SerializedName("pln")
      Pln pln;

      /**
       * Shipping rate defined in PYG.
       */
      @SerializedName("pyg")
      Pyg pyg;

      /**
       * Shipping rate defined in QAR.
       */
      @SerializedName("qar")
      Qar qar;

      /**
       * Shipping rate defined in RON.
       */
      @SerializedName("ron")
      Ron ron;

      /**
       * Shipping rate defined in RSD.
       */
      @SerializedName("rsd")
      Rsd rsd;

      /**
       * Shipping rate defined in RUB.
       */
      @SerializedName("rub")
      Rub rub;

      /**
       * Shipping rate defined in RWF.
       */
      @SerializedName("rwf")
      Rwf rwf;

      /**
       * Shipping rate defined in SAR.
       */
      @SerializedName("sar")
      Sar sar;

      /**
       * Shipping rate defined in SBD.
       */
      @SerializedName("sbd")
      Sbd sbd;

      /**
       * Shipping rate defined in SCR.
       */
      @SerializedName("scr")
      Scr scr;

      /**
       * Shipping rate defined in SEK.
       */
      @SerializedName("sek")
      Sek sek;

      /**
       * Shipping rate defined in SGD.
       */
      @SerializedName("sgd")
      Sgd sgd;

      /**
       * Shipping rate defined in SHP.
       */
      @SerializedName("shp")
      Shp shp;

      /**
       * Shipping rate defined in SLL.
       */
      @SerializedName("sll")
      Sll sll;

      /**
       * Shipping rate defined in SOS.
       */
      @SerializedName("sos")
      Sos sos;

      /**
       * Shipping rate defined in SRD.
       */
      @SerializedName("srd")
      Srd srd;

      /**
       * Shipping rate defined in STD.
       */
      @SerializedName("std")
      Std std;

      /**
       * Shipping rate defined in SZL.
       */
      @SerializedName("szl")
      Szl szl;

      /**
       * Shipping rate defined in THB.
       */
      @SerializedName("thb")
      Thb thb;

      /**
       * Shipping rate defined in TJS.
       */
      @SerializedName("tjs")
      Tjs tjs;

      /**
       * Shipping rate defined in TND.
       */
      @SerializedName("tnd")
      Tnd tnd;

      /**
       * Shipping rate defined in TOP.
       */
      @SerializedName("top")
      Top top;

      /**
       * Shipping rate defined in TRY.
       */
      @SerializedName("try")
      Try try;

      /**
       * Shipping rate defined in TTD.
       */
      @SerializedName("ttd")
      Ttd ttd;

      /**
       * Shipping rate defined in TWD.
       */
      @SerializedName("twd")
      Twd twd;

      /**
       * Shipping rate defined in TZS.
       */
      @SerializedName("tzs")
      Tzs tzs;

      /**
       * Shipping rate defined in UAH.
       */
      @SerializedName("uah")
      Uah uah;

      /**
       * Shipping rate defined in UGX.
       */
      @SerializedName("ugx")
      Ugx ugx;

      /**
       * Shipping rate defined in USD.
       */
      @SerializedName("usd")
      Usd usd;

      /**
       * Shipping rate defined in USDC.
       */
      @SerializedName("usdc")
      Usdc usdc;

      /**
       * Shipping rate defined in UYU.
       */
      @SerializedName("uyu")
      Uyu uyu;

      /**
       * Shipping rate defined in UZS.
       */
      @SerializedName("uzs")
      Uzs uzs;

      /**
       * Shipping rate defined in VND.
       */
      @SerializedName("vnd")
      Vnd vnd;

      /**
       * Shipping rate defined in VUV.
       */
      @SerializedName("vuv")
      Vuv vuv;

      /**
       * Shipping rate defined in WST.
       */
      @SerializedName("wst")
      Wst wst;

      /**
       * Shipping rate defined in XAF.
       */
      @SerializedName("xaf")
      Xaf xaf;

      /**
       * Shipping rate defined in XCD.
       */
      @SerializedName("xcd")
      Xcd xcd;

      /**
       * Shipping rate defined in XOF.
       */
      @SerializedName("xof")
      Xof xof;

      /**
       * Shipping rate defined in XPF.
       */
      @SerializedName("xpf")
      Xpf xpf;

      /**
       * Shipping rate defined in YER.
       */
      @SerializedName("yer")
      Yer yer;

      /**
       * Shipping rate defined in ZAR.
       */
      @SerializedName("zar")
      Zar zar;

      /**
       * Shipping rate defined in ZMW.
       */
      @SerializedName("zmw")
      Zmw zmw;

      private CurrencyOptions(
          Aed aed,
          Afn afn,
          All all,
          Amd amd,
          Ang ang,
          Aoa aoa,
          Ars ars,
          Aud aud,
          Awg awg,
          Azn azn,
          Bam bam,
          Bbd bbd,
          Bdt bdt,
          Bgn bgn,
          Bhd bhd,
          Bif bif,
          Bmd bmd,
          Bnd bnd,
          Bob bob,
          Brl brl,
          Bsd bsd,
          Btn btn,
          Bwp bwp,
          Byn byn,
          Bzd bzd,
          Cad cad,
          Cdf cdf,
          Chf chf,
          Clp clp,
          Cny cny,
          Cop cop,
          Crc crc,
          Cve cve,
          Czk czk,
          Djf djf,
          Dkk dkk,
          Dop dop,
          Dzd dzd,
          Egp egp,
          Etb etb,
          Eur eur,
          Map<String, Object> extraParams,
          Fjd fjd,
          Fkp fkp,
          Gbp gbp,
          Gel gel,
          Ghs ghs,
          Gip gip,
          Gmd gmd,
          Gnf gnf,
          Gtq gtq,
          Gyd gyd,
          Hkd hkd,
          Hnl hnl,
          Hrk hrk,
          Htg htg,
          Huf huf,
          Idr idr,
          Ils ils,
          Inr inr,
          Isk isk,
          Jmd jmd,
          Jod jod,
          Jpy jpy,
          Kes kes,
          Kgs kgs,
          Khr khr,
          Kmf kmf,
          Krw krw,
          Kwd kwd,
          Kyd kyd,
          Kzt kzt,
          Lak lak,
          Lbp lbp,
          Lkr lkr,
          Lrd lrd,
          Lsl lsl,
          Mad mad,
          Mdl mdl,
          Mga mga,
          Mkd mkd,
          Mmk mmk,
          Mnt mnt,
          Mop mop,
          Mro mro,
          Mur mur,
          Mvr mvr,
          Mwk mwk,
          Mxn mxn,
          Myr myr,
          Mzn mzn,
          Nad nad,
          Ngn ngn,
          Nio nio,
          Nok nok,
          Npr npr,
          Nzd nzd,
          Omr omr,
          Pab pab,
          Pen pen,
          Pgk pgk,
          Php php,
          Pkr pkr,
          Pln pln,
          Pyg pyg,
          Qar qar,
          Ron ron,
          Rsd rsd,
          Rub rub,
          Rwf rwf,
          Sar sar,
          Sbd sbd,
          Scr scr,
          Sek sek,
          Sgd sgd,
          Shp shp,
          Sll sll,
          Sos sos,
          Srd srd,
          Std std,
          Szl szl,
          Thb thb,
          Tjs tjs,
          Tnd tnd,
          Top top,
          Try try,
          Ttd ttd,
          Twd twd,
          Tzs tzs,
          Uah uah,
          Ugx ugx,
          Usd usd,
          Usdc usdc,
          Uyu uyu,
          Uzs uzs,
          Vnd vnd,
          Vuv vuv,
          Wst wst,
          Xaf xaf,
          Xcd xcd,
          Xof xof,
          Xpf xpf,
          Yer yer,
          Zar zar,
          Zmw zmw) {
        this.aed = aed;
        this.afn = afn;
        this.all = all;
        this.amd = amd;
        this.ang = ang;
        this.aoa = aoa;
        this.ars = ars;
        this.aud = aud;
        this.awg = awg;
        this.azn = azn;
        this.bam = bam;
        this.bbd = bbd;
        this.bdt = bdt;
        this.bgn = bgn;
        this.bhd = bhd;
        this.bif = bif;
        this.bmd = bmd;
        this.bnd = bnd;
        this.bob = bob;
        this.brl = brl;
        this.bsd = bsd;
        this.btn = btn;
        this.bwp = bwp;
        this.byn = byn;
        this.bzd = bzd;
        this.cad = cad;
        this.cdf = cdf;
        this.chf = chf;
        this.clp = clp;
        this.cny = cny;
        this.cop = cop;
        this.crc = crc;
        this.cve = cve;
        this.czk = czk;
        this.djf = djf;
        this.dkk = dkk;
        this.dop = dop;
        this.dzd = dzd;
        this.egp = egp;
        this.etb = etb;
        this.eur = eur;
        this.extraParams = extraParams;
        this.fjd = fjd;
        this.fkp = fkp;
        this.gbp = gbp;
        this.gel = gel;
        this.ghs = ghs;
        this.gip = gip;
        this.gmd = gmd;
        this.gnf = gnf;
        this.gtq = gtq;
        this.gyd = gyd;
        this.hkd = hkd;
        this.hnl = hnl;
        this.hrk = hrk;
        this.htg = htg;
        this.huf = huf;
        this.idr = idr;
        this.ils = ils;
        this.inr = inr;
        this.isk = isk;
        this.jmd = jmd;
        this.jod = jod;
        this.jpy = jpy;
        this.kes = kes;
        this.kgs = kgs;
        this.khr = khr;
        this.kmf = kmf;
        this.krw = krw;
        this.kwd = kwd;
        this.kyd = kyd;
        this.kzt = kzt;
        this.lak = lak;
        this.lbp = lbp;
        this.lkr = lkr;
        this.lrd = lrd;
        this.lsl = lsl;
        this.mad = mad;
        this.mdl = mdl;
        this.mga = mga;
        this.mkd = mkd;
        this.mmk = mmk;
        this.mnt = mnt;
        this.mop = mop;
        this.mro = mro;
        this.mur = mur;
        this.mvr = mvr;
        this.mwk = mwk;
        this.mxn = mxn;
        this.myr = myr;
        this.mzn = mzn;
        this.nad = nad;
        this.ngn = ngn;
        this.nio = nio;
        this.nok = nok;
        this.npr = npr;
        this.nzd = nzd;
        this.omr = omr;
        this.pab = pab;
        this.pen = pen;
        this.pgk = pgk;
        this.php = php;
        this.pkr = pkr;
        this.pln = pln;
        this.pyg = pyg;
        this.qar = qar;
        this.ron = ron;
        this.rsd = rsd;
        this.rub = rub;
        this.rwf = rwf;
        this.sar = sar;
        this.sbd = sbd;
        this.scr = scr;
        this.sek = sek;
        this.sgd = sgd;
        this.shp = shp;
        this.sll = sll;
        this.sos = sos;
        this.srd = srd;
        this.std = std;
        this.szl = szl;
        this.thb = thb;
        this.tjs = tjs;
        this.tnd = tnd;
        this.top = top;
        this.try = try;
        this.ttd = ttd;
        this.twd = twd;
        this.tzs = tzs;
        this.uah = uah;
        this.ugx = ugx;
        this.usd = usd;
        this.usdc = usdc;
        this.uyu = uyu;
        this.uzs = uzs;
        this.vnd = vnd;
        this.vuv = vuv;
        this.wst = wst;
        this.xaf = xaf;
        this.xcd = xcd;
        this.xof = xof;
        this.xpf = xpf;
        this.yer = yer;
        this.zar = zar;
        this.zmw = zmw;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Aed aed;

        private Afn afn;

        private All all;

        private Amd amd;

        private Ang ang;

        private Aoa aoa;

        private Ars ars;

        private Aud aud;

        private Awg awg;

        private Azn azn;

        private Bam bam;

        private Bbd bbd;

        private Bdt bdt;

        private Bgn bgn;

        private Bhd bhd;

        private Bif bif;

        private Bmd bmd;

        private Bnd bnd;

        private Bob bob;

        private Brl brl;

        private Bsd bsd;

        private Btn btn;

        private Bwp bwp;

        private Byn byn;

        private Bzd bzd;

        private Cad cad;

        private Cdf cdf;

        private Chf chf;

        private Clp clp;

        private Cny cny;

        private Cop cop;

        private Crc crc;

        private Cve cve;

        private Czk czk;

        private Djf djf;

        private Dkk dkk;

        private Dop dop;

        private Dzd dzd;

        private Egp egp;

        private Etb etb;

        private Eur eur;

        private Map<String, Object> extraParams;

        private Fjd fjd;

        private Fkp fkp;

        private Gbp gbp;

        private Gel gel;

        private Ghs ghs;

        private Gip gip;

        private Gmd gmd;

        private Gnf gnf;

        private Gtq gtq;

        private Gyd gyd;

        private Hkd hkd;

        private Hnl hnl;

        private Hrk hrk;

        private Htg htg;

        private Huf huf;

        private Idr idr;

        private Ils ils;

        private Inr inr;

        private Isk isk;

        private Jmd jmd;

        private Jod jod;

        private Jpy jpy;

        private Kes kes;

        private Kgs kgs;

        private Khr khr;

        private Kmf kmf;

        private Krw krw;

        private Kwd kwd;

        private Kyd kyd;

        private Kzt kzt;

        private Lak lak;

        private Lbp lbp;

        private Lkr lkr;

        private Lrd lrd;

        private Lsl lsl;

        private Mad mad;

        private Mdl mdl;

        private Mga mga;

        private Mkd mkd;

        private Mmk mmk;

        private Mnt mnt;

        private Mop mop;

        private Mro mro;

        private Mur mur;

        private Mvr mvr;

        private Mwk mwk;

        private Mxn mxn;

        private Myr myr;

        private Mzn mzn;

        private Nad nad;

        private Ngn ngn;

        private Nio nio;

        private Nok nok;

        private Npr npr;

        private Nzd nzd;

        private Omr omr;

        private Pab pab;

        private Pen pen;

        private Pgk pgk;

        private Php php;

        private Pkr pkr;

        private Pln pln;

        private Pyg pyg;

        private Qar qar;

        private Ron ron;

        private Rsd rsd;

        private Rub rub;

        private Rwf rwf;

        private Sar sar;

        private Sbd sbd;

        private Scr scr;

        private Sek sek;

        private Sgd sgd;

        private Shp shp;

        private Sll sll;

        private Sos sos;

        private Srd srd;

        private Std std;

        private Szl szl;

        private Thb thb;

        private Tjs tjs;

        private Tnd tnd;

        private Top top;

        private Try try;

        private Ttd ttd;

        private Twd twd;

        private Tzs tzs;

        private Uah uah;

        private Ugx ugx;

        private Usd usd;

        private Usdc usdc;

        private Uyu uyu;

        private Uzs uzs;

        private Vnd vnd;

        private Vuv vuv;

        private Wst wst;

        private Xaf xaf;

        private Xcd xcd;

        private Xof xof;

        private Xpf xpf;

        private Yer yer;

        private Zar zar;

        private Zmw zmw;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public CurrencyOptions build() {
          return new CurrencyOptions(
            this.aed,
            this.afn,
            this.all,
            this.amd,
            this.ang,
            this.aoa,
            this.ars,
            this.aud,
            this.awg,
            this.azn,
            this.bam,
            this.bbd,
            this.bdt,
            this.bgn,
            this.bhd,
            this.bif,
            this.bmd,
            this.bnd,
            this.bob,
            this.brl,
            this.bsd,
            this.btn,
            this.bwp,
            this.byn,
            this.bzd,
            this.cad,
            this.cdf,
            this.chf,
            this.clp,
            this.cny,
            this.cop,
            this.crc,
            this.cve,
            this.czk,
            this.djf,
            this.dkk,
            this.dop,
            this.dzd,
            this.egp,
            this.etb,
            this.eur,
            this.extraParams,
            this.fjd,
            this.fkp,
            this.gbp,
            this.gel,
            this.ghs,
            this.gip,
            this.gmd,
            this.gnf,
            this.gtq,
            this.gyd,
            this.hkd,
            this.hnl,
            this.hrk,
            this.htg,
            this.huf,
            this.idr,
            this.ils,
            this.inr,
            this.isk,
            this.jmd,
            this.jod,
            this.jpy,
            this.kes,
            this.kgs,
            this.khr,
            this.kmf,
            this.krw,
            this.kwd,
            this.kyd,
            this.kzt,
            this.lak,
            this.lbp,
            this.lkr,
            this.lrd,
            this.lsl,
            this.mad,
            this.mdl,
            this.mga,
            this.mkd,
            this.mmk,
            this.mnt,
            this.mop,
            this.mro,
            this.mur,
            this.mvr,
            this.mwk,
            this.mxn,
            this.myr,
            this.mzn,
            this.nad,
            this.ngn,
            this.nio,
            this.nok,
            this.npr,
            this.nzd,
            this.omr,
            this.pab,
            this.pen,
            this.pgk,
            this.php,
            this.pkr,
            this.pln,
            this.pyg,
            this.qar,
            this.ron,
            this.rsd,
            this.rub,
            this.rwf,
            this.sar,
            this.sbd,
            this.scr,
            this.sek,
            this.sgd,
            this.shp,
            this.sll,
            this.sos,
            this.srd,
            this.std,
            this.szl,
            this.thb,
            this.tjs,
            this.tnd,
            this.top,
            this.try,
            this.ttd,
            this.twd,
            this.tzs,
            this.uah,
            this.ugx,
            this.usd,
            this.usdc,
            this.uyu,
            this.uzs,
            this.vnd,
            this.vuv,
            this.wst,
            this.xaf,
            this.xcd,
            this.xof,
            this.xpf,
            this.yer,
            this.zar,
            this.zmw
          );
        }

        /**
         * Shipping rate defined in AED.
         */
        public Builder setAed(Aed aed) {
          this.aed = aed;
          return this;
        }

        /**
         * Shipping rate defined in AFN.
         */
        public Builder setAfn(Afn afn) {
          this.afn = afn;
          return this;
        }

        /**
         * Shipping rate defined in ALL.
         */
        public Builder setAll(All all) {
          this.all = all;
          return this;
        }

        /**
         * Shipping rate defined in AMD.
         */
        public Builder setAmd(Amd amd) {
          this.amd = amd;
          return this;
        }

        /**
         * Shipping rate defined in ANG.
         */
        public Builder setAng(Ang ang) {
          this.ang = ang;
          return this;
        }

        /**
         * Shipping rate defined in AOA.
         */
        public Builder setAoa(Aoa aoa) {
          this.aoa = aoa;
          return this;
        }

        /**
         * Shipping rate defined in ARS.
         */
        public Builder setArs(Ars ars) {
          this.ars = ars;
          return this;
        }

        /**
         * Shipping rate defined in AUD.
         */
        public Builder setAud(Aud aud) {
          this.aud = aud;
          return this;
        }

        /**
         * Shipping rate defined in AWG.
         */
        public Builder setAwg(Awg awg) {
          this.awg = awg;
          return this;
        }

        /**
         * Shipping rate defined in AZN.
         */
        public Builder setAzn(Azn azn) {
          this.azn = azn;
          return this;
        }

        /**
         * Shipping rate defined in BAM.
         */
        public Builder setBam(Bam bam) {
          this.bam = bam;
          return this;
        }

        /**
         * Shipping rate defined in BBD.
         */
        public Builder setBbd(Bbd bbd) {
          this.bbd = bbd;
          return this;
        }

        /**
         * Shipping rate defined in BDT.
         */
        public Builder setBdt(Bdt bdt) {
          this.bdt = bdt;
          return this;
        }

        /**
         * Shipping rate defined in BGN.
         */
        public Builder setBgn(Bgn bgn) {
          this.bgn = bgn;
          return this;
        }

        /**
         * Shipping rate defined in BHD.
         */
        public Builder setBhd(Bhd bhd) {
          this.bhd = bhd;
          return this;
        }

        /**
         * Shipping rate defined in BIF.
         */
        public Builder setBif(Bif bif) {
          this.bif = bif;
          return this;
        }

        /**
         * Shipping rate defined in BMD.
         */
        public Builder setBmd(Bmd bmd) {
          this.bmd = bmd;
          return this;
        }

        /**
         * Shipping rate defined in BND.
         */
        public Builder setBnd(Bnd bnd) {
          this.bnd = bnd;
          return this;
        }

        /**
         * Shipping rate defined in BOB.
         */
        public Builder setBob(Bob bob) {
          this.bob = bob;
          return this;
        }

        /**
         * Shipping rate defined in BRL.
         */
        public Builder setBrl(Brl brl) {
          this.brl = brl;
          return this;
        }

        /**
         * Shipping rate defined in BSD.
         */
        public Builder setBsd(Bsd bsd) {
          this.bsd = bsd;
          return this;
        }

        /**
         * Shipping rate defined in BTN.
         */
        public Builder setBtn(Btn btn) {
          this.btn = btn;
          return this;
        }

        /**
         * Shipping rate defined in BWP.
         */
        public Builder setBwp(Bwp bwp) {
          this.bwp = bwp;
          return this;
        }

        /**
         * Shipping rate defined in BYN.
         */
        public Builder setByn(Byn byn) {
          this.byn = byn;
          return this;
        }

        /**
         * Shipping rate defined in BZD.
         */
        public Builder setBzd(Bzd bzd) {
          this.bzd = bzd;
          return this;
        }

        /**
         * Shipping rate defined in CAD.
         */
        public Builder setCad(Cad cad) {
          this.cad = cad;
          return this;
        }

        /**
         * Shipping rate defined in CDF.
         */
        public Builder setCdf(Cdf cdf) {
          this.cdf = cdf;
          return this;
        }

        /**
         * Shipping rate defined in CHF.
         */
        public Builder setChf(Chf chf) {
          this.chf = chf;
          return this;
        }

        /**
         * Shipping rate defined in CLP.
         */
        public Builder setClp(Clp clp) {
          this.clp = clp;
          return this;
        }

        /**
         * Shipping rate defined in CNY.
         */
        public Builder setCny(Cny cny) {
          this.cny = cny;
          return this;
        }

        /**
         * Shipping rate defined in COP.
         */
        public Builder setCop(Cop cop) {
          this.cop = cop;
          return this;
        }

        /**
         * Shipping rate defined in CRC.
         */
        public Builder setCrc(Crc crc) {
          this.crc = crc;
          return this;
        }

        /**
         * Shipping rate defined in CVE.
         */
        public Builder setCve(Cve cve) {
          this.cve = cve;
          return this;
        }

        /**
         * Shipping rate defined in CZK.
         */
        public Builder setCzk(Czk czk) {
          this.czk = czk;
          return this;
        }

        /**
         * Shipping rate defined in DJF.
         */
        public Builder setDjf(Djf djf) {
          this.djf = djf;
          return this;
        }

        /**
         * Shipping rate defined in DKK.
         */
        public Builder setDkk(Dkk dkk) {
          this.dkk = dkk;
          return this;
        }

        /**
         * Shipping rate defined in DOP.
         */
        public Builder setDop(Dop dop) {
          this.dop = dop;
          return this;
        }

        /**
         * Shipping rate defined in DZD.
         */
        public Builder setDzd(Dzd dzd) {
          this.dzd = dzd;
          return this;
        }

        /**
         * Shipping rate defined in EGP.
         */
        public Builder setEgp(Egp egp) {
          this.egp = egp;
          return this;
        }

        /**
         * Shipping rate defined in ETB.
         */
        public Builder setEtb(Etb etb) {
          this.etb = etb;
          return this;
        }

        /**
         * Shipping rate defined in EUR.
         */
        public Builder setEur(Eur eur) {
          this.eur = eur;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Shipping rate defined in FJD.
         */
        public Builder setFjd(Fjd fjd) {
          this.fjd = fjd;
          return this;
        }

        /**
         * Shipping rate defined in FKP.
         */
        public Builder setFkp(Fkp fkp) {
          this.fkp = fkp;
          return this;
        }

        /**
         * Shipping rate defined in GBP.
         */
        public Builder setGbp(Gbp gbp) {
          this.gbp = gbp;
          return this;
        }

        /**
         * Shipping rate defined in GEL.
         */
        public Builder setGel(Gel gel) {
          this.gel = gel;
          return this;
        }

        /**
         * Shipping rate defined in GHS.
         */
        public Builder setGhs(Ghs ghs) {
          this.ghs = ghs;
          return this;
        }

        /**
         * Shipping rate defined in GIP.
         */
        public Builder setGip(Gip gip) {
          this.gip = gip;
          return this;
        }

        /**
         * Shipping rate defined in GMD.
         */
        public Builder setGmd(Gmd gmd) {
          this.gmd = gmd;
          return this;
        }

        /**
         * Shipping rate defined in GNF.
         */
        public Builder setGnf(Gnf gnf) {
          this.gnf = gnf;
          return this;
        }

        /**
         * Shipping rate defined in GTQ.
         */
        public Builder setGtq(Gtq gtq) {
          this.gtq = gtq;
          return this;
        }

        /**
         * Shipping rate defined in GYD.
         */
        public Builder setGyd(Gyd gyd) {
          this.gyd = gyd;
          return this;
        }

        /**
         * Shipping rate defined in HKD.
         */
        public Builder setHkd(Hkd hkd) {
          this.hkd = hkd;
          return this;
        }

        /**
         * Shipping rate defined in HNL.
         */
        public Builder setHnl(Hnl hnl) {
          this.hnl = hnl;
          return this;
        }

        /**
         * Shipping rate defined in HRK.
         */
        public Builder setHrk(Hrk hrk) {
          this.hrk = hrk;
          return this;
        }

        /**
         * Shipping rate defined in HTG.
         */
        public Builder setHtg(Htg htg) {
          this.htg = htg;
          return this;
        }

        /**
         * Shipping rate defined in HUF.
         */
        public Builder setHuf(Huf huf) {
          this.huf = huf;
          return this;
        }

        /**
         * Shipping rate defined in IDR.
         */
        public Builder setIdr(Idr idr) {
          this.idr = idr;
          return this;
        }

        /**
         * Shipping rate defined in ILS.
         */
        public Builder setIls(Ils ils) {
          this.ils = ils;
          return this;
        }

        /**
         * Shipping rate defined in INR.
         */
        public Builder setInr(Inr inr) {
          this.inr = inr;
          return this;
        }

        /**
         * Shipping rate defined in ISK.
         */
        public Builder setIsk(Isk isk) {
          this.isk = isk;
          return this;
        }

        /**
         * Shipping rate defined in JMD.
         */
        public Builder setJmd(Jmd jmd) {
          this.jmd = jmd;
          return this;
        }

        /**
         * Shipping rate defined in JOD.
         */
        public Builder setJod(Jod jod) {
          this.jod = jod;
          return this;
        }

        /**
         * Shipping rate defined in JPY.
         */
        public Builder setJpy(Jpy jpy) {
          this.jpy = jpy;
          return this;
        }

        /**
         * Shipping rate defined in KES.
         */
        public Builder setKes(Kes kes) {
          this.kes = kes;
          return this;
        }

        /**
         * Shipping rate defined in KGS.
         */
        public Builder setKgs(Kgs kgs) {
          this.kgs = kgs;
          return this;
        }

        /**
         * Shipping rate defined in KHR.
         */
        public Builder setKhr(Khr khr) {
          this.khr = khr;
          return this;
        }

        /**
         * Shipping rate defined in KMF.
         */
        public Builder setKmf(Kmf kmf) {
          this.kmf = kmf;
          return this;
        }

        /**
         * Shipping rate defined in KRW.
         */
        public Builder setKrw(Krw krw) {
          this.krw = krw;
          return this;
        }

        /**
         * Shipping rate defined in KWD.
         */
        public Builder setKwd(Kwd kwd) {
          this.kwd = kwd;
          return this;
        }

        /**
         * Shipping rate defined in KYD.
         */
        public Builder setKyd(Kyd kyd) {
          this.kyd = kyd;
          return this;
        }

        /**
         * Shipping rate defined in KZT.
         */
        public Builder setKzt(Kzt kzt) {
          this.kzt = kzt;
          return this;
        }

        /**
         * Shipping rate defined in LAK.
         */
        public Builder setLak(Lak lak) {
          this.lak = lak;
          return this;
        }

        /**
         * Shipping rate defined in LBP.
         */
        public Builder setLbp(Lbp lbp) {
          this.lbp = lbp;
          return this;
        }

        /**
         * Shipping rate defined in LKR.
         */
        public Builder setLkr(Lkr lkr) {
          this.lkr = lkr;
          return this;
        }

        /**
         * Shipping rate defined in LRD.
         */
        public Builder setLrd(Lrd lrd) {
          this.lrd = lrd;
          return this;
        }

        /**
         * Shipping rate defined in LSL.
         */
        public Builder setLsl(Lsl lsl) {
          this.lsl = lsl;
          return this;
        }

        /**
         * Shipping rate defined in MAD.
         */
        public Builder setMad(Mad mad) {
          this.mad = mad;
          return this;
        }

        /**
         * Shipping rate defined in MDL.
         */
        public Builder setMdl(Mdl mdl) {
          this.mdl = mdl;
          return this;
        }

        /**
         * Shipping rate defined in MGA.
         */
        public Builder setMga(Mga mga) {
          this.mga = mga;
          return this;
        }

        /**
         * Shipping rate defined in MKD.
         */
        public Builder setMkd(Mkd mkd) {
          this.mkd = mkd;
          return this;
        }

        /**
         * Shipping rate defined in MMK.
         */
        public Builder setMmk(Mmk mmk) {
          this.mmk = mmk;
          return this;
        }

        /**
         * Shipping rate defined in MNT.
         */
        public Builder setMnt(Mnt mnt) {
          this.mnt = mnt;
          return this;
        }

        /**
         * Shipping rate defined in MOP.
         */
        public Builder setMop(Mop mop) {
          this.mop = mop;
          return this;
        }

        /**
         * Shipping rate defined in MRO.
         */
        public Builder setMro(Mro mro) {
          this.mro = mro;
          return this;
        }

        /**
         * Shipping rate defined in MUR.
         */
        public Builder setMur(Mur mur) {
          this.mur = mur;
          return this;
        }

        /**
         * Shipping rate defined in MVR.
         */
        public Builder setMvr(Mvr mvr) {
          this.mvr = mvr;
          return this;
        }

        /**
         * Shipping rate defined in MWK.
         */
        public Builder setMwk(Mwk mwk) {
          this.mwk = mwk;
          return this;
        }

        /**
         * Shipping rate defined in MXN.
         */
        public Builder setMxn(Mxn mxn) {
          this.mxn = mxn;
          return this;
        }

        /**
         * Shipping rate defined in MYR.
         */
        public Builder setMyr(Myr myr) {
          this.myr = myr;
          return this;
        }

        /**
         * Shipping rate defined in MZN.
         */
        public Builder setMzn(Mzn mzn) {
          this.mzn = mzn;
          return this;
        }

        /**
         * Shipping rate defined in NAD.
         */
        public Builder setNad(Nad nad) {
          this.nad = nad;
          return this;
        }

        /**
         * Shipping rate defined in NGN.
         */
        public Builder setNgn(Ngn ngn) {
          this.ngn = ngn;
          return this;
        }

        /**
         * Shipping rate defined in NIO.
         */
        public Builder setNio(Nio nio) {
          this.nio = nio;
          return this;
        }

        /**
         * Shipping rate defined in NOK.
         */
        public Builder setNok(Nok nok) {
          this.nok = nok;
          return this;
        }

        /**
         * Shipping rate defined in NPR.
         */
        public Builder setNpr(Npr npr) {
          this.npr = npr;
          return this;
        }

        /**
         * Shipping rate defined in NZD.
         */
        public Builder setNzd(Nzd nzd) {
          this.nzd = nzd;
          return this;
        }

        /**
         * Shipping rate defined in OMR.
         */
        public Builder setOmr(Omr omr) {
          this.omr = omr;
          return this;
        }

        /**
         * Shipping rate defined in PAB.
         */
        public Builder setPab(Pab pab) {
          this.pab = pab;
          return this;
        }

        /**
         * Shipping rate defined in PEN.
         */
        public Builder setPen(Pen pen) {
          this.pen = pen;
          return this;
        }

        /**
         * Shipping rate defined in PGK.
         */
        public Builder setPgk(Pgk pgk) {
          this.pgk = pgk;
          return this;
        }

        /**
         * Shipping rate defined in PHP.
         */
        public Builder setPhp(Php php) {
          this.php = php;
          return this;
        }

        /**
         * Shipping rate defined in PKR.
         */
        public Builder setPkr(Pkr pkr) {
          this.pkr = pkr;
          return this;
        }

        /**
         * Shipping rate defined in PLN.
         */
        public Builder setPln(Pln pln) {
          this.pln = pln;
          return this;
        }

        /**
         * Shipping rate defined in PYG.
         */
        public Builder setPyg(Pyg pyg) {
          this.pyg = pyg;
          return this;
        }

        /**
         * Shipping rate defined in QAR.
         */
        public Builder setQar(Qar qar) {
          this.qar = qar;
          return this;
        }

        /**
         * Shipping rate defined in RON.
         */
        public Builder setRon(Ron ron) {
          this.ron = ron;
          return this;
        }

        /**
         * Shipping rate defined in RSD.
         */
        public Builder setRsd(Rsd rsd) {
          this.rsd = rsd;
          return this;
        }

        /**
         * Shipping rate defined in RUB.
         */
        public Builder setRub(Rub rub) {
          this.rub = rub;
          return this;
        }

        /**
         * Shipping rate defined in RWF.
         */
        public Builder setRwf(Rwf rwf) {
          this.rwf = rwf;
          return this;
        }

        /**
         * Shipping rate defined in SAR.
         */
        public Builder setSar(Sar sar) {
          this.sar = sar;
          return this;
        }

        /**
         * Shipping rate defined in SBD.
         */
        public Builder setSbd(Sbd sbd) {
          this.sbd = sbd;
          return this;
        }

        /**
         * Shipping rate defined in SCR.
         */
        public Builder setScr(Scr scr) {
          this.scr = scr;
          return this;
        }

        /**
         * Shipping rate defined in SEK.
         */
        public Builder setSek(Sek sek) {
          this.sek = sek;
          return this;
        }

        /**
         * Shipping rate defined in SGD.
         */
        public Builder setSgd(Sgd sgd) {
          this.sgd = sgd;
          return this;
        }

        /**
         * Shipping rate defined in SHP.
         */
        public Builder setShp(Shp shp) {
          this.shp = shp;
          return this;
        }

        /**
         * Shipping rate defined in SLL.
         */
        public Builder setSll(Sll sll) {
          this.sll = sll;
          return this;
        }

        /**
         * Shipping rate defined in SOS.
         */
        public Builder setSos(Sos sos) {
          this.sos = sos;
          return this;
        }

        /**
         * Shipping rate defined in SRD.
         */
        public Builder setSrd(Srd srd) {
          this.srd = srd;
          return this;
        }

        /**
         * Shipping rate defined in STD.
         */
        public Builder setStd(Std std) {
          this.std = std;
          return this;
        }

        /**
         * Shipping rate defined in SZL.
         */
        public Builder setSzl(Szl szl) {
          this.szl = szl;
          return this;
        }

        /**
         * Shipping rate defined in THB.
         */
        public Builder setThb(Thb thb) {
          this.thb = thb;
          return this;
        }

        /**
         * Shipping rate defined in TJS.
         */
        public Builder setTjs(Tjs tjs) {
          this.tjs = tjs;
          return this;
        }

        /**
         * Shipping rate defined in TND.
         */
        public Builder setTnd(Tnd tnd) {
          this.tnd = tnd;
          return this;
        }

        /**
         * Shipping rate defined in TOP.
         */
        public Builder setTop(Top top) {
          this.top = top;
          return this;
        }

        /**
         * Shipping rate defined in TRY.
         */
        public Builder setTry(Try try) {
          this.try = try;
          return this;
        }

        /**
         * Shipping rate defined in TTD.
         */
        public Builder setTtd(Ttd ttd) {
          this.ttd = ttd;
          return this;
        }

        /**
         * Shipping rate defined in TWD.
         */
        public Builder setTwd(Twd twd) {
          this.twd = twd;
          return this;
        }

        /**
         * Shipping rate defined in TZS.
         */
        public Builder setTzs(Tzs tzs) {
          this.tzs = tzs;
          return this;
        }

        /**
         * Shipping rate defined in UAH.
         */
        public Builder setUah(Uah uah) {
          this.uah = uah;
          return this;
        }

        /**
         * Shipping rate defined in UGX.
         */
        public Builder setUgx(Ugx ugx) {
          this.ugx = ugx;
          return this;
        }

        /**
         * Shipping rate defined in USD.
         */
        public Builder setUsd(Usd usd) {
          this.usd = usd;
          return this;
        }

        /**
         * Shipping rate defined in USDC.
         */
        public Builder setUsdc(Usdc usdc) {
          this.usdc = usdc;
          return this;
        }

        /**
         * Shipping rate defined in UYU.
         */
        public Builder setUyu(Uyu uyu) {
          this.uyu = uyu;
          return this;
        }

        /**
         * Shipping rate defined in UZS.
         */
        public Builder setUzs(Uzs uzs) {
          this.uzs = uzs;
          return this;
        }

        /**
         * Shipping rate defined in VND.
         */
        public Builder setVnd(Vnd vnd) {
          this.vnd = vnd;
          return this;
        }

        /**
         * Shipping rate defined in VUV.
         */
        public Builder setVuv(Vuv vuv) {
          this.vuv = vuv;
          return this;
        }

        /**
         * Shipping rate defined in WST.
         */
        public Builder setWst(Wst wst) {
          this.wst = wst;
          return this;
        }

        /**
         * Shipping rate defined in XAF.
         */
        public Builder setXaf(Xaf xaf) {
          this.xaf = xaf;
          return this;
        }

        /**
         * Shipping rate defined in XCD.
         */
        public Builder setXcd(Xcd xcd) {
          this.xcd = xcd;
          return this;
        }

        /**
         * Shipping rate defined in XOF.
         */
        public Builder setXof(Xof xof) {
          this.xof = xof;
          return this;
        }

        /**
         * Shipping rate defined in XPF.
         */
        public Builder setXpf(Xpf xpf) {
          this.xpf = xpf;
          return this;
        }

        /**
         * Shipping rate defined in YER.
         */
        public Builder setYer(Yer yer) {
          this.yer = yer;
          return this;
        }

        /**
         * Shipping rate defined in ZAR.
         */
        public Builder setZar(Zar zar) {
          this.zar = zar;
          return this;
        }

        /**
         * Shipping rate defined in ZMW.
         */
        public Builder setZmw(Zmw zmw) {
          this.zmw = zmw;
          return this;
        }
      }
      @Getter
      public static class Aed {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Aed(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aed build() {
            return new Aed(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aed#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aed#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Afn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Afn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Afn build() {
            return new Afn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Afn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Afn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class All {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private All(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public All build() {
            return new All(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.All#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.All#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Amd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Amd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Amd build() {
            return new Amd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Amd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Amd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ang {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ang(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ang build() {
            return new Ang(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ang#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ang#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Aoa {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Aoa(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aoa build() {
            return new Aoa(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aoa#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aoa#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ars {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ars(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ars build() {
            return new Ars(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ars#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ars#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Aud {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Aud(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aud build() {
            return new Aud(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aud#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Aud#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Awg {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Awg(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Awg build() {
            return new Awg(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Awg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Awg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Azn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Azn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Azn build() {
            return new Azn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Azn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Azn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bam {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bam(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bam build() {
            return new Bam(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bam#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bam#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bbd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bbd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bbd build() {
            return new Bbd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bbd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bbd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bdt {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bdt(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bdt build() {
            return new Bdt(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bdt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bdt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bgn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bgn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bgn build() {
            return new Bgn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bgn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bgn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bhd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bhd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bhd build() {
            return new Bhd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bhd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bhd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bif {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bif(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bif build() {
            return new Bif(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bif#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bif#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bmd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bmd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bmd build() {
            return new Bmd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bnd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bnd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bnd build() {
            return new Bnd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bob {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bob(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bob build() {
            return new Bob(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bob#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bob#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Brl {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Brl(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Brl build() {
            return new Brl(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Brl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Brl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bsd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bsd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bsd build() {
            return new Bsd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bsd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bsd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Btn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Btn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Btn build() {
            return new Btn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Btn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Btn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bwp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bwp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bwp build() {
            return new Bwp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bwp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bwp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Byn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Byn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Byn build() {
            return new Byn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Byn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Byn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Bzd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Bzd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bzd build() {
            return new Bzd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Bzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Cad {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Cad(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cad build() {
            return new Cad(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Cdf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Cdf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cdf build() {
            return new Cdf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cdf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cdf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Chf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Chf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Chf build() {
            return new Chf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Chf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Chf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Clp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Clp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Clp build() {
            return new Clp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Clp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Clp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Cny {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Cny(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cny build() {
            return new Cny(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cny#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cny#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Cop {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Cop(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cop build() {
            return new Cop(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Crc {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Crc(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Crc build() {
            return new Crc(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Crc#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Crc#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Cve {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Cve(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cve build() {
            return new Cve(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cve#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Cve#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Czk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Czk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Czk build() {
            return new Czk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Czk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Czk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Djf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Djf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Djf build() {
            return new Djf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Djf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Djf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Dkk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Dkk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dkk build() {
            return new Dkk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dkk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dkk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Dop {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Dop(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dop build() {
            return new Dop(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Dzd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Dzd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dzd build() {
            return new Dzd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Dzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Egp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Egp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Egp build() {
            return new Egp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Egp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Egp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Etb {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Etb(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Etb build() {
            return new Etb(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Etb#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Etb#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Eur {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Eur(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Eur build() {
            return new Eur(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Eur#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Eur#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Fjd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Fjd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Fjd build() {
            return new Fjd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Fjd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Fjd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Fkp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Fkp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Fkp build() {
            return new Fkp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Fkp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Fkp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gbp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gbp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gbp build() {
            return new Gbp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gbp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gbp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gel {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gel(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gel build() {
            return new Gel(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gel#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gel#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ghs {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ghs(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ghs build() {
            return new Ghs(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ghs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ghs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gip {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gip(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gip build() {
            return new Gip(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gip#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gip#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gmd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gmd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gmd build() {
            return new Gmd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gnf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gnf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gnf build() {
            return new Gnf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gnf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gnf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gtq {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gtq(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gtq build() {
            return new Gtq(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gtq#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gtq#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Gyd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Gyd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gyd build() {
            return new Gyd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gyd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Gyd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Hkd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Hkd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hkd build() {
            return new Hkd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hkd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hkd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Hnl {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Hnl(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hnl build() {
            return new Hnl(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hnl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hnl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Hrk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Hrk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hrk build() {
            return new Hrk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hrk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Hrk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Htg {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Htg(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Htg build() {
            return new Htg(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Htg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Htg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Huf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Huf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Huf build() {
            return new Huf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Huf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Huf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Idr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Idr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Idr build() {
            return new Idr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Idr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Idr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ils {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ils(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ils build() {
            return new Ils(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ils#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ils#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Inr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Inr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Inr build() {
            return new Inr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Inr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Inr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Isk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Isk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Isk build() {
            return new Isk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Isk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Isk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Jmd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Jmd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jmd build() {
            return new Jmd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Jod {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Jod(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jod build() {
            return new Jod(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jod#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jod#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Jpy {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Jpy(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jpy build() {
            return new Jpy(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jpy#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Jpy#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kes {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kes(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kes build() {
            return new Kes(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kes#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kes#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kgs {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kgs(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kgs build() {
            return new Kgs(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kgs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kgs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Khr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Khr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Khr build() {
            return new Khr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Khr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Khr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kmf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kmf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kmf build() {
            return new Kmf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kmf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kmf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Krw {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Krw(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Krw build() {
            return new Krw(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Krw#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Krw#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kwd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kwd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kwd build() {
            return new Kwd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kwd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kwd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kyd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kyd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kyd build() {
            return new Kyd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kyd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kyd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Kzt {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Kzt(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kzt build() {
            return new Kzt(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kzt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Kzt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Lak {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Lak(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lak build() {
            return new Lak(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lak#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lak#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Lbp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Lbp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lbp build() {
            return new Lbp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lbp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lbp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Lkr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Lkr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lkr build() {
            return new Lkr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lkr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lkr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Lrd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Lrd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lrd build() {
            return new Lrd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lrd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lrd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Lsl {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Lsl(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lsl build() {
            return new Lsl(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lsl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Lsl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mad {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mad(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mad build() {
            return new Mad(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mdl {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mdl(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mdl build() {
            return new Mdl(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mdl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mdl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mga {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mga(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mga build() {
            return new Mga(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mga#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mga#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mkd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mkd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mkd build() {
            return new Mkd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mkd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mkd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mmk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mmk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mmk build() {
            return new Mmk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mmk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mmk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mnt {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mnt(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mnt build() {
            return new Mnt(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mnt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mnt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mop {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mop(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mop build() {
            return new Mop(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mro {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mro(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mro build() {
            return new Mro(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mro#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mro#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mur {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mur(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mur build() {
            return new Mur(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mur#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mur#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mvr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mvr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mvr build() {
            return new Mvr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mvr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mvr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mwk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mwk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mwk build() {
            return new Mwk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mwk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mwk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mxn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mxn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mxn build() {
            return new Mxn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mxn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mxn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Myr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Myr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Myr build() {
            return new Myr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Myr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Myr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Mzn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Mzn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mzn build() {
            return new Mzn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mzn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Mzn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Nad {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Nad(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nad build() {
            return new Nad(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ngn {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ngn(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ngn build() {
            return new Ngn(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ngn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ngn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Nio {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Nio(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nio build() {
            return new Nio(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nio#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nio#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Nok {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Nok(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nok build() {
            return new Nok(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nok#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nok#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Npr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Npr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Npr build() {
            return new Npr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Npr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Npr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Nzd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Nzd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nzd build() {
            return new Nzd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Nzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Omr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Omr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Omr build() {
            return new Omr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Omr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Omr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pab {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pab(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pab build() {
            return new Pab(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pab#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pab#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pen {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pen(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pen build() {
            return new Pen(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pen#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pen#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pgk {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pgk(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pgk build() {
            return new Pgk(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pgk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pgk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Php {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Php(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Php build() {
            return new Php(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Php#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Php#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pkr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pkr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pkr build() {
            return new Pkr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pkr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pkr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pln {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pln(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pln build() {
            return new Pln(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pln#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pln#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Pyg {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Pyg(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pyg build() {
            return new Pyg(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pyg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Pyg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Qar {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Qar(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Qar build() {
            return new Qar(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Qar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Qar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ron {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ron(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ron build() {
            return new Ron(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ron#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ron#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Rsd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Rsd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rsd build() {
            return new Rsd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rsd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rsd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Rub {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Rub(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rub build() {
            return new Rub(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rub#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rub#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Rwf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Rwf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rwf build() {
            return new Rwf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rwf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Rwf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sar {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sar(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sar build() {
            return new Sar(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sbd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sbd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sbd build() {
            return new Sbd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sbd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sbd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Scr {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Scr(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Scr build() {
            return new Scr(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Scr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Scr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sek {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sek(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sek build() {
            return new Sek(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sek#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sek#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sgd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sgd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sgd build() {
            return new Sgd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sgd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sgd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Shp {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Shp(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Shp build() {
            return new Shp(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Shp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Shp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sll {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sll(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sll build() {
            return new Sll(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sll#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sll#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Sos {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Sos(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sos build() {
            return new Sos(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sos#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Sos#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Srd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Srd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Srd build() {
            return new Srd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Srd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Srd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Std {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Std(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Std build() {
            return new Std(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Std#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Std#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Szl {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Szl(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Szl build() {
            return new Szl(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Szl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Szl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Thb {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Thb(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Thb build() {
            return new Thb(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Thb#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Thb#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Tjs {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Tjs(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tjs build() {
            return new Tjs(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tjs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tjs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Tnd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Tnd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tnd build() {
            return new Tnd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Top {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Top(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Top build() {
            return new Top(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Top#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Top#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Try {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Try(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Try build() {
            return new Try(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Try#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Try#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ttd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ttd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ttd build() {
            return new Ttd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ttd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ttd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Twd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Twd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Twd build() {
            return new Twd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Twd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Twd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Tzs {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Tzs(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tzs build() {
            return new Tzs(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tzs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Tzs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Uah {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Uah(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uah build() {
            return new Uah(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uah#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uah#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Ugx {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Ugx(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ugx build() {
            return new Ugx(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ugx#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Ugx#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Usd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Usd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Usd build() {
            return new Usd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Usd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Usd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Usdc {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Usdc(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Usdc build() {
            return new Usdc(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Usdc#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Usdc#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Uyu {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Uyu(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uyu build() {
            return new Uyu(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uyu#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uyu#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Uzs {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Uzs(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uzs build() {
            return new Uzs(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uzs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Uzs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Vnd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Vnd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Vnd build() {
            return new Vnd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Vnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Vnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Vuv {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Vuv(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Vuv build() {
            return new Vuv(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Vuv#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Vuv#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Wst {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Wst(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Wst build() {
            return new Wst(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Wst#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Wst#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Xaf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Xaf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xaf build() {
            return new Xaf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xaf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xaf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Xcd {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Xcd(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xcd build() {
            return new Xcd(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xcd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xcd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Xof {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Xof(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xof build() {
            return new Xof(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xof#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xof#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Xpf {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Xpf(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xpf build() {
            return new Xpf(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xpf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Xpf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Yer {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Yer(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Yer build() {
            return new Yer(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Yer#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Yer#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Zar {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Zar(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Zar build() {
            return new Zar(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Zar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Zar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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
      @Getter
      public static class Zmw {
        /**
         * A non-negative integer in cents representing how much to charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        private Zmw(Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.taxBehavior = taxBehavior;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private TaxBehavior taxBehavior;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Zmw build() {
            return new Zmw(this.amount, this.extraParams, this.taxBehavior);
          }

          /**
           * A non-negative integer in cents representing how much to charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Zmw#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ShippingRateCreateParams.FixedAmount.CurrencyOptions.Zmw#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
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