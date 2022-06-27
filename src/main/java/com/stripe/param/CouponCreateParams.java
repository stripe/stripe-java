// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CouponCreateParams extends ApiRequestParams {
  /**
   * A positive integer representing the amount to subtract from an invoice total (required if {@code percent_off} is not passed).
   */
  @SerializedName("amount_off")
  Long amountOff;

  /**
   * A hash containing directions for what this Coupon will apply discounts to.
   */
  @SerializedName("applies_to")
  AppliesTo appliesTo;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> of the {@code amount_off} parameter (required if {@code amount_off} is passed).
   */
  @SerializedName("currency")
  String currency;

  /**
   * Coupons defined in each available currency option (only supported if {@code amount_off} is passed). Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  CurrencyOptions currencyOptions;

  /**
   * Specifies how long the discount will be in effect if used on a subscription. Can be {@code forever}, {@code once}, or {@code repeating}. Defaults to {@code once}.
   */
  @SerializedName("duration")
  Duration duration;

  /**
   * Required only if {@code duration} is {@code repeating}, in which case it must be a positive integer that specifies the number of months the discount will be in effect.
   */
  @SerializedName("duration_in_months")
  Long durationInMonths;

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
   * Unique string of your choice that will be used to identify this coupon when applying it to a customer. If you don't want to specify a particular code, you can leave the ID blank and we'll generate a random code for you.
   */
  @SerializedName("id")
  String id;

  /**
   * A positive integer specifying the number of times the coupon can be redeemed before it's no longer valid. For example, you might have a 50% off coupon that the first 20 readers of your blog can use.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the {@code id} is shown if {@code name} is not set.
   */
  @SerializedName("name")
  String name;

  /**
   * A positive float larger than 0, and smaller or equal to 100, that represents the discount the coupon will apply (required if {@code amount_off} is not passed).
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /**
   * Unix timestamp specifying the last time at which the coupon can be redeemed. After the redeem_by date, the coupon can no longer be applied to new customers.
   */
  @SerializedName("redeem_by")
  Long redeemBy;

  private CouponCreateParams(
      Long amountOff,
      AppliesTo appliesTo,
      String currency,
      CurrencyOptions currencyOptions,
      Duration duration,
      Long durationInMonths,
      List<String> expand,
      Map<String, Object> extraParams,
      String id,
      Long maxRedemptions,
      Object metadata,
      String name,
      BigDecimal percentOff,
      Long redeemBy) {
    this.amountOff = amountOff;
    this.appliesTo = appliesTo;
    this.currency = currency;
    this.currencyOptions = currencyOptions;
    this.duration = duration;
    this.durationInMonths = durationInMonths;
    this.expand = expand;
    this.extraParams = extraParams;
    this.id = id;
    this.maxRedemptions = maxRedemptions;
    this.metadata = metadata;
    this.name = name;
    this.percentOff = percentOff;
    this.redeemBy = redeemBy;
  }
  public static Builder builder() {
    return new Builder();
  }
  public static class Builder {
    private Long amountOff;

    private AppliesTo appliesTo;

    private String currency;

    private CurrencyOptions currencyOptions;

    private Duration duration;

    private Long durationInMonths;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String id;

    private Long maxRedemptions;

    private Object metadata;

    private String name;

    private BigDecimal percentOff;

    private Long redeemBy;

    /**
     * Finalize and obtain parameter instance from this builder.
     */
    public CouponCreateParams build() {
      return new CouponCreateParams(
        this.amountOff,
        this.appliesTo,
        this.currency,
        this.currencyOptions,
        this.duration,
        this.durationInMonths,
        this.expand,
        this.extraParams,
        this.id,
        this.maxRedemptions,
        this.metadata,
        this.name,
        this.percentOff,
        this.redeemBy
      );
    }

    /**
     * A positive integer representing the amount to subtract from an invoice total (required if {@code percent_off} is not passed).
     */
    public Builder setAmountOff(Long amountOff) {
      this.amountOff = amountOff;
      return this;
    }

    /**
     * A hash containing directions for what this Coupon will apply discounts to.
     */
    public Builder setAppliesTo(AppliesTo appliesTo) {
      this.appliesTo = appliesTo;
      return this;
    }

    /**
     * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> of the {@code amount_off} parameter (required if {@code amount_off} is passed).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Coupons defined in each available currency option (only supported if {@code amount_off} is passed). Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrencyOptions(CurrencyOptions currencyOptions) {
      this.currencyOptions = currencyOptions;
      return this;
    }

    /**
     * Specifies how long the discount will be in effect if used on a subscription. Can be {@code forever}, {@code once}, or {@code repeating}. Defaults to {@code once}.
     */
    public Builder setDuration(Duration duration) {
      this.duration = duration;
      return this;
    }

    /**
     * Required only if {@code duration} is {@code repeating}, in which case it must be a positive integer that specifies the number of months the discount will be in effect.
     */
    public Builder setDurationInMonths(Long durationInMonths) {
      this.durationInMonths = durationInMonths;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CouponCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CouponCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Unique string of your choice that will be used to identify this coupon when applying it to a customer. If you don't want to specify a particular code, you can leave the ID blank and we'll generate a random code for you.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * A positive integer specifying the number of times the coupon can be redeemed before it's no longer valid. For example, you might have a 50% off coupon that the first 20 readers of your blog can use.
     */
    public Builder setMaxRedemptions(Long maxRedemptions) {
      this.maxRedemptions = maxRedemptions;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the {@code id} is shown if {@code name} is not set.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * A positive float larger than 0, and smaller or equal to 100, that represents the discount the coupon will apply (required if {@code amount_off} is not passed).
     */
    public Builder setPercentOff(BigDecimal percentOff) {
      this.percentOff = percentOff;
      return this;
    }

    /**
     * Unix timestamp specifying the last time at which the coupon can be redeemed. After the redeem_by date, the coupon can no longer be applied to new customers.
     */
    public Builder setRedeemBy(Long redeemBy) {
      this.redeemBy = redeemBy;
      return this;
    }
  }
  @Getter
  public static class AppliesTo {
    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * An array of Product IDs that this Coupon will apply to.
     */
    @SerializedName("products")
    List<String> products;

    private AppliesTo(Map<String, Object> extraParams, List<String> products) {
      this.extraParams = extraParams;
      this.products = products;
    }
    public static Builder builder() {
      return new Builder();
    }
    public static class Builder {
      private Map<String, Object> extraParams;

      private List<String> products;

      /**
       * Finalize and obtain parameter instance from this builder.
       */
      public AppliesTo build() {
        return new AppliesTo(this.extraParams, this.products);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.AppliesTo#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.AppliesTo#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `products` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CouponCreateParams.AppliesTo#products} for the field documentation.
       */
      public Builder addProduct(String element) {
        if (this.products == null) {
          this.products = new ArrayList<>();
        }
        this.products.add(element);
        return this;
      }

      /**
       * Add all elements to `products` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CouponCreateParams.AppliesTo#products} for the field documentation.
       */
      public Builder addAllProduct(List<String> elements) {
        if (this.products == null) {
          this.products = new ArrayList<>();
        }
        this.products.addAll(elements);
        return this;
      }
    }
  }
  @Getter
  public static class CurrencyOptions {
    /**
     * Coupon defined in AED.
     */
    @SerializedName("aed")
    Aed aed;

    /**
     * Coupon defined in AFN.
     */
    @SerializedName("afn")
    Afn afn;

    /**
     * Coupon defined in ALL.
     */
    @SerializedName("all")
    All all;

    /**
     * Coupon defined in AMD.
     */
    @SerializedName("amd")
    Amd amd;

    /**
     * Coupon defined in ANG.
     */
    @SerializedName("ang")
    Ang ang;

    /**
     * Coupon defined in AOA.
     */
    @SerializedName("aoa")
    Aoa aoa;

    /**
     * Coupon defined in ARS.
     */
    @SerializedName("ars")
    Ars ars;

    /**
     * Coupon defined in AUD.
     */
    @SerializedName("aud")
    Aud aud;

    /**
     * Coupon defined in AWG.
     */
    @SerializedName("awg")
    Awg awg;

    /**
     * Coupon defined in AZN.
     */
    @SerializedName("azn")
    Azn azn;

    /**
     * Coupon defined in BAM.
     */
    @SerializedName("bam")
    Bam bam;

    /**
     * Coupon defined in BBD.
     */
    @SerializedName("bbd")
    Bbd bbd;

    /**
     * Coupon defined in BDT.
     */
    @SerializedName("bdt")
    Bdt bdt;

    /**
     * Coupon defined in BGN.
     */
    @SerializedName("bgn")
    Bgn bgn;

    /**
     * Coupon defined in BHD.
     */
    @SerializedName("bhd")
    Bhd bhd;

    /**
     * Coupon defined in BIF.
     */
    @SerializedName("bif")
    Bif bif;

    /**
     * Coupon defined in BMD.
     */
    @SerializedName("bmd")
    Bmd bmd;

    /**
     * Coupon defined in BND.
     */
    @SerializedName("bnd")
    Bnd bnd;

    /**
     * Coupon defined in BOB.
     */
    @SerializedName("bob")
    Bob bob;

    /**
     * Coupon defined in BRL.
     */
    @SerializedName("brl")
    Brl brl;

    /**
     * Coupon defined in BSD.
     */
    @SerializedName("bsd")
    Bsd bsd;

    /**
     * Coupon defined in BTN.
     */
    @SerializedName("btn")
    Btn btn;

    /**
     * Coupon defined in BWP.
     */
    @SerializedName("bwp")
    Bwp bwp;

    /**
     * Coupon defined in BYN.
     */
    @SerializedName("byn")
    Byn byn;

    /**
     * Coupon defined in BZD.
     */
    @SerializedName("bzd")
    Bzd bzd;

    /**
     * Coupon defined in CAD.
     */
    @SerializedName("cad")
    Cad cad;

    /**
     * Coupon defined in CDF.
     */
    @SerializedName("cdf")
    Cdf cdf;

    /**
     * Coupon defined in CHF.
     */
    @SerializedName("chf")
    Chf chf;

    /**
     * Coupon defined in CLP.
     */
    @SerializedName("clp")
    Clp clp;

    /**
     * Coupon defined in CNY.
     */
    @SerializedName("cny")
    Cny cny;

    /**
     * Coupon defined in COP.
     */
    @SerializedName("cop")
    Cop cop;

    /**
     * Coupon defined in CRC.
     */
    @SerializedName("crc")
    Crc crc;

    /**
     * Coupon defined in CVE.
     */
    @SerializedName("cve")
    Cve cve;

    /**
     * Coupon defined in CZK.
     */
    @SerializedName("czk")
    Czk czk;

    /**
     * Coupon defined in DJF.
     */
    @SerializedName("djf")
    Djf djf;

    /**
     * Coupon defined in DKK.
     */
    @SerializedName("dkk")
    Dkk dkk;

    /**
     * Coupon defined in DOP.
     */
    @SerializedName("dop")
    Dop dop;

    /**
     * Coupon defined in DZD.
     */
    @SerializedName("dzd")
    Dzd dzd;

    /**
     * Coupon defined in EGP.
     */
    @SerializedName("egp")
    Egp egp;

    /**
     * Coupon defined in ETB.
     */
    @SerializedName("etb")
    Etb etb;

    /**
     * Coupon defined in EUR.
     */
    @SerializedName("eur")
    Eur eur;

    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Coupon defined in FJD.
     */
    @SerializedName("fjd")
    Fjd fjd;

    /**
     * Coupon defined in FKP.
     */
    @SerializedName("fkp")
    Fkp fkp;

    /**
     * Coupon defined in GBP.
     */
    @SerializedName("gbp")
    Gbp gbp;

    /**
     * Coupon defined in GEL.
     */
    @SerializedName("gel")
    Gel gel;

    /**
     * Coupon defined in GHS.
     */
    @SerializedName("ghs")
    Ghs ghs;

    /**
     * Coupon defined in GIP.
     */
    @SerializedName("gip")
    Gip gip;

    /**
     * Coupon defined in GMD.
     */
    @SerializedName("gmd")
    Gmd gmd;

    /**
     * Coupon defined in GNF.
     */
    @SerializedName("gnf")
    Gnf gnf;

    /**
     * Coupon defined in GTQ.
     */
    @SerializedName("gtq")
    Gtq gtq;

    /**
     * Coupon defined in GYD.
     */
    @SerializedName("gyd")
    Gyd gyd;

    /**
     * Coupon defined in HKD.
     */
    @SerializedName("hkd")
    Hkd hkd;

    /**
     * Coupon defined in HNL.
     */
    @SerializedName("hnl")
    Hnl hnl;

    /**
     * Coupon defined in HRK.
     */
    @SerializedName("hrk")
    Hrk hrk;

    /**
     * Coupon defined in HTG.
     */
    @SerializedName("htg")
    Htg htg;

    /**
     * Coupon defined in HUF.
     */
    @SerializedName("huf")
    Huf huf;

    /**
     * Coupon defined in IDR.
     */
    @SerializedName("idr")
    Idr idr;

    /**
     * Coupon defined in ILS.
     */
    @SerializedName("ils")
    Ils ils;

    /**
     * Coupon defined in INR.
     */
    @SerializedName("inr")
    Inr inr;

    /**
     * Coupon defined in ISK.
     */
    @SerializedName("isk")
    Isk isk;

    /**
     * Coupon defined in JMD.
     */
    @SerializedName("jmd")
    Jmd jmd;

    /**
     * Coupon defined in JOD.
     */
    @SerializedName("jod")
    Jod jod;

    /**
     * Coupon defined in JPY.
     */
    @SerializedName("jpy")
    Jpy jpy;

    /**
     * Coupon defined in KES.
     */
    @SerializedName("kes")
    Kes kes;

    /**
     * Coupon defined in KGS.
     */
    @SerializedName("kgs")
    Kgs kgs;

    /**
     * Coupon defined in KHR.
     */
    @SerializedName("khr")
    Khr khr;

    /**
     * Coupon defined in KMF.
     */
    @SerializedName("kmf")
    Kmf kmf;

    /**
     * Coupon defined in KRW.
     */
    @SerializedName("krw")
    Krw krw;

    /**
     * Coupon defined in KWD.
     */
    @SerializedName("kwd")
    Kwd kwd;

    /**
     * Coupon defined in KYD.
     */
    @SerializedName("kyd")
    Kyd kyd;

    /**
     * Coupon defined in KZT.
     */
    @SerializedName("kzt")
    Kzt kzt;

    /**
     * Coupon defined in LAK.
     */
    @SerializedName("lak")
    Lak lak;

    /**
     * Coupon defined in LBP.
     */
    @SerializedName("lbp")
    Lbp lbp;

    /**
     * Coupon defined in LKR.
     */
    @SerializedName("lkr")
    Lkr lkr;

    /**
     * Coupon defined in LRD.
     */
    @SerializedName("lrd")
    Lrd lrd;

    /**
     * Coupon defined in LSL.
     */
    @SerializedName("lsl")
    Lsl lsl;

    /**
     * Coupon defined in MAD.
     */
    @SerializedName("mad")
    Mad mad;

    /**
     * Coupon defined in MDL.
     */
    @SerializedName("mdl")
    Mdl mdl;

    /**
     * Coupon defined in MGA.
     */
    @SerializedName("mga")
    Mga mga;

    /**
     * Coupon defined in MKD.
     */
    @SerializedName("mkd")
    Mkd mkd;

    /**
     * Coupon defined in MMK.
     */
    @SerializedName("mmk")
    Mmk mmk;

    /**
     * Coupon defined in MNT.
     */
    @SerializedName("mnt")
    Mnt mnt;

    /**
     * Coupon defined in MOP.
     */
    @SerializedName("mop")
    Mop mop;

    /**
     * Coupon defined in MRO.
     */
    @SerializedName("mro")
    Mro mro;

    /**
     * Coupon defined in MUR.
     */
    @SerializedName("mur")
    Mur mur;

    /**
     * Coupon defined in MVR.
     */
    @SerializedName("mvr")
    Mvr mvr;

    /**
     * Coupon defined in MWK.
     */
    @SerializedName("mwk")
    Mwk mwk;

    /**
     * Coupon defined in MXN.
     */
    @SerializedName("mxn")
    Mxn mxn;

    /**
     * Coupon defined in MYR.
     */
    @SerializedName("myr")
    Myr myr;

    /**
     * Coupon defined in MZN.
     */
    @SerializedName("mzn")
    Mzn mzn;

    /**
     * Coupon defined in NAD.
     */
    @SerializedName("nad")
    Nad nad;

    /**
     * Coupon defined in NGN.
     */
    @SerializedName("ngn")
    Ngn ngn;

    /**
     * Coupon defined in NIO.
     */
    @SerializedName("nio")
    Nio nio;

    /**
     * Coupon defined in NOK.
     */
    @SerializedName("nok")
    Nok nok;

    /**
     * Coupon defined in NPR.
     */
    @SerializedName("npr")
    Npr npr;

    /**
     * Coupon defined in NZD.
     */
    @SerializedName("nzd")
    Nzd nzd;

    /**
     * Coupon defined in OMR.
     */
    @SerializedName("omr")
    Omr omr;

    /**
     * Coupon defined in PAB.
     */
    @SerializedName("pab")
    Pab pab;

    /**
     * Coupon defined in PEN.
     */
    @SerializedName("pen")
    Pen pen;

    /**
     * Coupon defined in PGK.
     */
    @SerializedName("pgk")
    Pgk pgk;

    /**
     * Coupon defined in PHP.
     */
    @SerializedName("php")
    Php php;

    /**
     * Coupon defined in PKR.
     */
    @SerializedName("pkr")
    Pkr pkr;

    /**
     * Coupon defined in PLN.
     */
    @SerializedName("pln")
    Pln pln;

    /**
     * Coupon defined in PYG.
     */
    @SerializedName("pyg")
    Pyg pyg;

    /**
     * Coupon defined in QAR.
     */
    @SerializedName("qar")
    Qar qar;

    /**
     * Coupon defined in RON.
     */
    @SerializedName("ron")
    Ron ron;

    /**
     * Coupon defined in RSD.
     */
    @SerializedName("rsd")
    Rsd rsd;

    /**
     * Coupon defined in RUB.
     */
    @SerializedName("rub")
    Rub rub;

    /**
     * Coupon defined in RWF.
     */
    @SerializedName("rwf")
    Rwf rwf;

    /**
     * Coupon defined in SAR.
     */
    @SerializedName("sar")
    Sar sar;

    /**
     * Coupon defined in SBD.
     */
    @SerializedName("sbd")
    Sbd sbd;

    /**
     * Coupon defined in SCR.
     */
    @SerializedName("scr")
    Scr scr;

    /**
     * Coupon defined in SEK.
     */
    @SerializedName("sek")
    Sek sek;

    /**
     * Coupon defined in SGD.
     */
    @SerializedName("sgd")
    Sgd sgd;

    /**
     * Coupon defined in SHP.
     */
    @SerializedName("shp")
    Shp shp;

    /**
     * Coupon defined in SLL.
     */
    @SerializedName("sll")
    Sll sll;

    /**
     * Coupon defined in SOS.
     */
    @SerializedName("sos")
    Sos sos;

    /**
     * Coupon defined in SRD.
     */
    @SerializedName("srd")
    Srd srd;

    /**
     * Coupon defined in STD.
     */
    @SerializedName("std")
    Std std;

    /**
     * Coupon defined in SZL.
     */
    @SerializedName("szl")
    Szl szl;

    /**
     * Coupon defined in THB.
     */
    @SerializedName("thb")
    Thb thb;

    /**
     * Coupon defined in TJS.
     */
    @SerializedName("tjs")
    Tjs tjs;

    /**
     * Coupon defined in TND.
     */
    @SerializedName("tnd")
    Tnd tnd;

    /**
     * Coupon defined in TOP.
     */
    @SerializedName("top")
    Top top;

    /**
     * Coupon defined in TRY.
     */
    @SerializedName("try")
    Try try;

    /**
     * Coupon defined in TTD.
     */
    @SerializedName("ttd")
    Ttd ttd;

    /**
     * Coupon defined in TWD.
     */
    @SerializedName("twd")
    Twd twd;

    /**
     * Coupon defined in TZS.
     */
    @SerializedName("tzs")
    Tzs tzs;

    /**
     * Coupon defined in UAH.
     */
    @SerializedName("uah")
    Uah uah;

    /**
     * Coupon defined in UGX.
     */
    @SerializedName("ugx")
    Ugx ugx;

    /**
     * Coupon defined in USD.
     */
    @SerializedName("usd")
    Usd usd;

    /**
     * Coupon defined in USDC.
     */
    @SerializedName("usdc")
    Usdc usdc;

    /**
     * Coupon defined in UYU.
     */
    @SerializedName("uyu")
    Uyu uyu;

    /**
     * Coupon defined in UZS.
     */
    @SerializedName("uzs")
    Uzs uzs;

    /**
     * Coupon defined in VND.
     */
    @SerializedName("vnd")
    Vnd vnd;

    /**
     * Coupon defined in VUV.
     */
    @SerializedName("vuv")
    Vuv vuv;

    /**
     * Coupon defined in WST.
     */
    @SerializedName("wst")
    Wst wst;

    /**
     * Coupon defined in XAF.
     */
    @SerializedName("xaf")
    Xaf xaf;

    /**
     * Coupon defined in XCD.
     */
    @SerializedName("xcd")
    Xcd xcd;

    /**
     * Coupon defined in XOF.
     */
    @SerializedName("xof")
    Xof xof;

    /**
     * Coupon defined in XPF.
     */
    @SerializedName("xpf")
    Xpf xpf;

    /**
     * Coupon defined in YER.
     */
    @SerializedName("yer")
    Yer yer;

    /**
     * Coupon defined in ZAR.
     */
    @SerializedName("zar")
    Zar zar;

    /**
     * Coupon defined in ZMW.
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
       * Coupon defined in AED.
       */
      public Builder setAed(Aed aed) {
        this.aed = aed;
        return this;
      }

      /**
       * Coupon defined in AFN.
       */
      public Builder setAfn(Afn afn) {
        this.afn = afn;
        return this;
      }

      /**
       * Coupon defined in ALL.
       */
      public Builder setAll(All all) {
        this.all = all;
        return this;
      }

      /**
       * Coupon defined in AMD.
       */
      public Builder setAmd(Amd amd) {
        this.amd = amd;
        return this;
      }

      /**
       * Coupon defined in ANG.
       */
      public Builder setAng(Ang ang) {
        this.ang = ang;
        return this;
      }

      /**
       * Coupon defined in AOA.
       */
      public Builder setAoa(Aoa aoa) {
        this.aoa = aoa;
        return this;
      }

      /**
       * Coupon defined in ARS.
       */
      public Builder setArs(Ars ars) {
        this.ars = ars;
        return this;
      }

      /**
       * Coupon defined in AUD.
       */
      public Builder setAud(Aud aud) {
        this.aud = aud;
        return this;
      }

      /**
       * Coupon defined in AWG.
       */
      public Builder setAwg(Awg awg) {
        this.awg = awg;
        return this;
      }

      /**
       * Coupon defined in AZN.
       */
      public Builder setAzn(Azn azn) {
        this.azn = azn;
        return this;
      }

      /**
       * Coupon defined in BAM.
       */
      public Builder setBam(Bam bam) {
        this.bam = bam;
        return this;
      }

      /**
       * Coupon defined in BBD.
       */
      public Builder setBbd(Bbd bbd) {
        this.bbd = bbd;
        return this;
      }

      /**
       * Coupon defined in BDT.
       */
      public Builder setBdt(Bdt bdt) {
        this.bdt = bdt;
        return this;
      }

      /**
       * Coupon defined in BGN.
       */
      public Builder setBgn(Bgn bgn) {
        this.bgn = bgn;
        return this;
      }

      /**
       * Coupon defined in BHD.
       */
      public Builder setBhd(Bhd bhd) {
        this.bhd = bhd;
        return this;
      }

      /**
       * Coupon defined in BIF.
       */
      public Builder setBif(Bif bif) {
        this.bif = bif;
        return this;
      }

      /**
       * Coupon defined in BMD.
       */
      public Builder setBmd(Bmd bmd) {
        this.bmd = bmd;
        return this;
      }

      /**
       * Coupon defined in BND.
       */
      public Builder setBnd(Bnd bnd) {
        this.bnd = bnd;
        return this;
      }

      /**
       * Coupon defined in BOB.
       */
      public Builder setBob(Bob bob) {
        this.bob = bob;
        return this;
      }

      /**
       * Coupon defined in BRL.
       */
      public Builder setBrl(Brl brl) {
        this.brl = brl;
        return this;
      }

      /**
       * Coupon defined in BSD.
       */
      public Builder setBsd(Bsd bsd) {
        this.bsd = bsd;
        return this;
      }

      /**
       * Coupon defined in BTN.
       */
      public Builder setBtn(Btn btn) {
        this.btn = btn;
        return this;
      }

      /**
       * Coupon defined in BWP.
       */
      public Builder setBwp(Bwp bwp) {
        this.bwp = bwp;
        return this;
      }

      /**
       * Coupon defined in BYN.
       */
      public Builder setByn(Byn byn) {
        this.byn = byn;
        return this;
      }

      /**
       * Coupon defined in BZD.
       */
      public Builder setBzd(Bzd bzd) {
        this.bzd = bzd;
        return this;
      }

      /**
       * Coupon defined in CAD.
       */
      public Builder setCad(Cad cad) {
        this.cad = cad;
        return this;
      }

      /**
       * Coupon defined in CDF.
       */
      public Builder setCdf(Cdf cdf) {
        this.cdf = cdf;
        return this;
      }

      /**
       * Coupon defined in CHF.
       */
      public Builder setChf(Chf chf) {
        this.chf = chf;
        return this;
      }

      /**
       * Coupon defined in CLP.
       */
      public Builder setClp(Clp clp) {
        this.clp = clp;
        return this;
      }

      /**
       * Coupon defined in CNY.
       */
      public Builder setCny(Cny cny) {
        this.cny = cny;
        return this;
      }

      /**
       * Coupon defined in COP.
       */
      public Builder setCop(Cop cop) {
        this.cop = cop;
        return this;
      }

      /**
       * Coupon defined in CRC.
       */
      public Builder setCrc(Crc crc) {
        this.crc = crc;
        return this;
      }

      /**
       * Coupon defined in CVE.
       */
      public Builder setCve(Cve cve) {
        this.cve = cve;
        return this;
      }

      /**
       * Coupon defined in CZK.
       */
      public Builder setCzk(Czk czk) {
        this.czk = czk;
        return this;
      }

      /**
       * Coupon defined in DJF.
       */
      public Builder setDjf(Djf djf) {
        this.djf = djf;
        return this;
      }

      /**
       * Coupon defined in DKK.
       */
      public Builder setDkk(Dkk dkk) {
        this.dkk = dkk;
        return this;
      }

      /**
       * Coupon defined in DOP.
       */
      public Builder setDop(Dop dop) {
        this.dop = dop;
        return this;
      }

      /**
       * Coupon defined in DZD.
       */
      public Builder setDzd(Dzd dzd) {
        this.dzd = dzd;
        return this;
      }

      /**
       * Coupon defined in EGP.
       */
      public Builder setEgp(Egp egp) {
        this.egp = egp;
        return this;
      }

      /**
       * Coupon defined in ETB.
       */
      public Builder setEtb(Etb etb) {
        this.etb = etb;
        return this;
      }

      /**
       * Coupon defined in EUR.
       */
      public Builder setEur(Eur eur) {
        this.eur = eur;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Coupon defined in FJD.
       */
      public Builder setFjd(Fjd fjd) {
        this.fjd = fjd;
        return this;
      }

      /**
       * Coupon defined in FKP.
       */
      public Builder setFkp(Fkp fkp) {
        this.fkp = fkp;
        return this;
      }

      /**
       * Coupon defined in GBP.
       */
      public Builder setGbp(Gbp gbp) {
        this.gbp = gbp;
        return this;
      }

      /**
       * Coupon defined in GEL.
       */
      public Builder setGel(Gel gel) {
        this.gel = gel;
        return this;
      }

      /**
       * Coupon defined in GHS.
       */
      public Builder setGhs(Ghs ghs) {
        this.ghs = ghs;
        return this;
      }

      /**
       * Coupon defined in GIP.
       */
      public Builder setGip(Gip gip) {
        this.gip = gip;
        return this;
      }

      /**
       * Coupon defined in GMD.
       */
      public Builder setGmd(Gmd gmd) {
        this.gmd = gmd;
        return this;
      }

      /**
       * Coupon defined in GNF.
       */
      public Builder setGnf(Gnf gnf) {
        this.gnf = gnf;
        return this;
      }

      /**
       * Coupon defined in GTQ.
       */
      public Builder setGtq(Gtq gtq) {
        this.gtq = gtq;
        return this;
      }

      /**
       * Coupon defined in GYD.
       */
      public Builder setGyd(Gyd gyd) {
        this.gyd = gyd;
        return this;
      }

      /**
       * Coupon defined in HKD.
       */
      public Builder setHkd(Hkd hkd) {
        this.hkd = hkd;
        return this;
      }

      /**
       * Coupon defined in HNL.
       */
      public Builder setHnl(Hnl hnl) {
        this.hnl = hnl;
        return this;
      }

      /**
       * Coupon defined in HRK.
       */
      public Builder setHrk(Hrk hrk) {
        this.hrk = hrk;
        return this;
      }

      /**
       * Coupon defined in HTG.
       */
      public Builder setHtg(Htg htg) {
        this.htg = htg;
        return this;
      }

      /**
       * Coupon defined in HUF.
       */
      public Builder setHuf(Huf huf) {
        this.huf = huf;
        return this;
      }

      /**
       * Coupon defined in IDR.
       */
      public Builder setIdr(Idr idr) {
        this.idr = idr;
        return this;
      }

      /**
       * Coupon defined in ILS.
       */
      public Builder setIls(Ils ils) {
        this.ils = ils;
        return this;
      }

      /**
       * Coupon defined in INR.
       */
      public Builder setInr(Inr inr) {
        this.inr = inr;
        return this;
      }

      /**
       * Coupon defined in ISK.
       */
      public Builder setIsk(Isk isk) {
        this.isk = isk;
        return this;
      }

      /**
       * Coupon defined in JMD.
       */
      public Builder setJmd(Jmd jmd) {
        this.jmd = jmd;
        return this;
      }

      /**
       * Coupon defined in JOD.
       */
      public Builder setJod(Jod jod) {
        this.jod = jod;
        return this;
      }

      /**
       * Coupon defined in JPY.
       */
      public Builder setJpy(Jpy jpy) {
        this.jpy = jpy;
        return this;
      }

      /**
       * Coupon defined in KES.
       */
      public Builder setKes(Kes kes) {
        this.kes = kes;
        return this;
      }

      /**
       * Coupon defined in KGS.
       */
      public Builder setKgs(Kgs kgs) {
        this.kgs = kgs;
        return this;
      }

      /**
       * Coupon defined in KHR.
       */
      public Builder setKhr(Khr khr) {
        this.khr = khr;
        return this;
      }

      /**
       * Coupon defined in KMF.
       */
      public Builder setKmf(Kmf kmf) {
        this.kmf = kmf;
        return this;
      }

      /**
       * Coupon defined in KRW.
       */
      public Builder setKrw(Krw krw) {
        this.krw = krw;
        return this;
      }

      /**
       * Coupon defined in KWD.
       */
      public Builder setKwd(Kwd kwd) {
        this.kwd = kwd;
        return this;
      }

      /**
       * Coupon defined in KYD.
       */
      public Builder setKyd(Kyd kyd) {
        this.kyd = kyd;
        return this;
      }

      /**
       * Coupon defined in KZT.
       */
      public Builder setKzt(Kzt kzt) {
        this.kzt = kzt;
        return this;
      }

      /**
       * Coupon defined in LAK.
       */
      public Builder setLak(Lak lak) {
        this.lak = lak;
        return this;
      }

      /**
       * Coupon defined in LBP.
       */
      public Builder setLbp(Lbp lbp) {
        this.lbp = lbp;
        return this;
      }

      /**
       * Coupon defined in LKR.
       */
      public Builder setLkr(Lkr lkr) {
        this.lkr = lkr;
        return this;
      }

      /**
       * Coupon defined in LRD.
       */
      public Builder setLrd(Lrd lrd) {
        this.lrd = lrd;
        return this;
      }

      /**
       * Coupon defined in LSL.
       */
      public Builder setLsl(Lsl lsl) {
        this.lsl = lsl;
        return this;
      }

      /**
       * Coupon defined in MAD.
       */
      public Builder setMad(Mad mad) {
        this.mad = mad;
        return this;
      }

      /**
       * Coupon defined in MDL.
       */
      public Builder setMdl(Mdl mdl) {
        this.mdl = mdl;
        return this;
      }

      /**
       * Coupon defined in MGA.
       */
      public Builder setMga(Mga mga) {
        this.mga = mga;
        return this;
      }

      /**
       * Coupon defined in MKD.
       */
      public Builder setMkd(Mkd mkd) {
        this.mkd = mkd;
        return this;
      }

      /**
       * Coupon defined in MMK.
       */
      public Builder setMmk(Mmk mmk) {
        this.mmk = mmk;
        return this;
      }

      /**
       * Coupon defined in MNT.
       */
      public Builder setMnt(Mnt mnt) {
        this.mnt = mnt;
        return this;
      }

      /**
       * Coupon defined in MOP.
       */
      public Builder setMop(Mop mop) {
        this.mop = mop;
        return this;
      }

      /**
       * Coupon defined in MRO.
       */
      public Builder setMro(Mro mro) {
        this.mro = mro;
        return this;
      }

      /**
       * Coupon defined in MUR.
       */
      public Builder setMur(Mur mur) {
        this.mur = mur;
        return this;
      }

      /**
       * Coupon defined in MVR.
       */
      public Builder setMvr(Mvr mvr) {
        this.mvr = mvr;
        return this;
      }

      /**
       * Coupon defined in MWK.
       */
      public Builder setMwk(Mwk mwk) {
        this.mwk = mwk;
        return this;
      }

      /**
       * Coupon defined in MXN.
       */
      public Builder setMxn(Mxn mxn) {
        this.mxn = mxn;
        return this;
      }

      /**
       * Coupon defined in MYR.
       */
      public Builder setMyr(Myr myr) {
        this.myr = myr;
        return this;
      }

      /**
       * Coupon defined in MZN.
       */
      public Builder setMzn(Mzn mzn) {
        this.mzn = mzn;
        return this;
      }

      /**
       * Coupon defined in NAD.
       */
      public Builder setNad(Nad nad) {
        this.nad = nad;
        return this;
      }

      /**
       * Coupon defined in NGN.
       */
      public Builder setNgn(Ngn ngn) {
        this.ngn = ngn;
        return this;
      }

      /**
       * Coupon defined in NIO.
       */
      public Builder setNio(Nio nio) {
        this.nio = nio;
        return this;
      }

      /**
       * Coupon defined in NOK.
       */
      public Builder setNok(Nok nok) {
        this.nok = nok;
        return this;
      }

      /**
       * Coupon defined in NPR.
       */
      public Builder setNpr(Npr npr) {
        this.npr = npr;
        return this;
      }

      /**
       * Coupon defined in NZD.
       */
      public Builder setNzd(Nzd nzd) {
        this.nzd = nzd;
        return this;
      }

      /**
       * Coupon defined in OMR.
       */
      public Builder setOmr(Omr omr) {
        this.omr = omr;
        return this;
      }

      /**
       * Coupon defined in PAB.
       */
      public Builder setPab(Pab pab) {
        this.pab = pab;
        return this;
      }

      /**
       * Coupon defined in PEN.
       */
      public Builder setPen(Pen pen) {
        this.pen = pen;
        return this;
      }

      /**
       * Coupon defined in PGK.
       */
      public Builder setPgk(Pgk pgk) {
        this.pgk = pgk;
        return this;
      }

      /**
       * Coupon defined in PHP.
       */
      public Builder setPhp(Php php) {
        this.php = php;
        return this;
      }

      /**
       * Coupon defined in PKR.
       */
      public Builder setPkr(Pkr pkr) {
        this.pkr = pkr;
        return this;
      }

      /**
       * Coupon defined in PLN.
       */
      public Builder setPln(Pln pln) {
        this.pln = pln;
        return this;
      }

      /**
       * Coupon defined in PYG.
       */
      public Builder setPyg(Pyg pyg) {
        this.pyg = pyg;
        return this;
      }

      /**
       * Coupon defined in QAR.
       */
      public Builder setQar(Qar qar) {
        this.qar = qar;
        return this;
      }

      /**
       * Coupon defined in RON.
       */
      public Builder setRon(Ron ron) {
        this.ron = ron;
        return this;
      }

      /**
       * Coupon defined in RSD.
       */
      public Builder setRsd(Rsd rsd) {
        this.rsd = rsd;
        return this;
      }

      /**
       * Coupon defined in RUB.
       */
      public Builder setRub(Rub rub) {
        this.rub = rub;
        return this;
      }

      /**
       * Coupon defined in RWF.
       */
      public Builder setRwf(Rwf rwf) {
        this.rwf = rwf;
        return this;
      }

      /**
       * Coupon defined in SAR.
       */
      public Builder setSar(Sar sar) {
        this.sar = sar;
        return this;
      }

      /**
       * Coupon defined in SBD.
       */
      public Builder setSbd(Sbd sbd) {
        this.sbd = sbd;
        return this;
      }

      /**
       * Coupon defined in SCR.
       */
      public Builder setScr(Scr scr) {
        this.scr = scr;
        return this;
      }

      /**
       * Coupon defined in SEK.
       */
      public Builder setSek(Sek sek) {
        this.sek = sek;
        return this;
      }

      /**
       * Coupon defined in SGD.
       */
      public Builder setSgd(Sgd sgd) {
        this.sgd = sgd;
        return this;
      }

      /**
       * Coupon defined in SHP.
       */
      public Builder setShp(Shp shp) {
        this.shp = shp;
        return this;
      }

      /**
       * Coupon defined in SLL.
       */
      public Builder setSll(Sll sll) {
        this.sll = sll;
        return this;
      }

      /**
       * Coupon defined in SOS.
       */
      public Builder setSos(Sos sos) {
        this.sos = sos;
        return this;
      }

      /**
       * Coupon defined in SRD.
       */
      public Builder setSrd(Srd srd) {
        this.srd = srd;
        return this;
      }

      /**
       * Coupon defined in STD.
       */
      public Builder setStd(Std std) {
        this.std = std;
        return this;
      }

      /**
       * Coupon defined in SZL.
       */
      public Builder setSzl(Szl szl) {
        this.szl = szl;
        return this;
      }

      /**
       * Coupon defined in THB.
       */
      public Builder setThb(Thb thb) {
        this.thb = thb;
        return this;
      }

      /**
       * Coupon defined in TJS.
       */
      public Builder setTjs(Tjs tjs) {
        this.tjs = tjs;
        return this;
      }

      /**
       * Coupon defined in TND.
       */
      public Builder setTnd(Tnd tnd) {
        this.tnd = tnd;
        return this;
      }

      /**
       * Coupon defined in TOP.
       */
      public Builder setTop(Top top) {
        this.top = top;
        return this;
      }

      /**
       * Coupon defined in TRY.
       */
      public Builder setTry(Try try) {
        this.try = try;
        return this;
      }

      /**
       * Coupon defined in TTD.
       */
      public Builder setTtd(Ttd ttd) {
        this.ttd = ttd;
        return this;
      }

      /**
       * Coupon defined in TWD.
       */
      public Builder setTwd(Twd twd) {
        this.twd = twd;
        return this;
      }

      /**
       * Coupon defined in TZS.
       */
      public Builder setTzs(Tzs tzs) {
        this.tzs = tzs;
        return this;
      }

      /**
       * Coupon defined in UAH.
       */
      public Builder setUah(Uah uah) {
        this.uah = uah;
        return this;
      }

      /**
       * Coupon defined in UGX.
       */
      public Builder setUgx(Ugx ugx) {
        this.ugx = ugx;
        return this;
      }

      /**
       * Coupon defined in USD.
       */
      public Builder setUsd(Usd usd) {
        this.usd = usd;
        return this;
      }

      /**
       * Coupon defined in USDC.
       */
      public Builder setUsdc(Usdc usdc) {
        this.usdc = usdc;
        return this;
      }

      /**
       * Coupon defined in UYU.
       */
      public Builder setUyu(Uyu uyu) {
        this.uyu = uyu;
        return this;
      }

      /**
       * Coupon defined in UZS.
       */
      public Builder setUzs(Uzs uzs) {
        this.uzs = uzs;
        return this;
      }

      /**
       * Coupon defined in VND.
       */
      public Builder setVnd(Vnd vnd) {
        this.vnd = vnd;
        return this;
      }

      /**
       * Coupon defined in VUV.
       */
      public Builder setVuv(Vuv vuv) {
        this.vuv = vuv;
        return this;
      }

      /**
       * Coupon defined in WST.
       */
      public Builder setWst(Wst wst) {
        this.wst = wst;
        return this;
      }

      /**
       * Coupon defined in XAF.
       */
      public Builder setXaf(Xaf xaf) {
        this.xaf = xaf;
        return this;
      }

      /**
       * Coupon defined in XCD.
       */
      public Builder setXcd(Xcd xcd) {
        this.xcd = xcd;
        return this;
      }

      /**
       * Coupon defined in XOF.
       */
      public Builder setXof(Xof xof) {
        this.xof = xof;
        return this;
      }

      /**
       * Coupon defined in XPF.
       */
      public Builder setXpf(Xpf xpf) {
        this.xpf = xpf;
        return this;
      }

      /**
       * Coupon defined in YER.
       */
      public Builder setYer(Yer yer) {
        this.yer = yer;
        return this;
      }

      /**
       * Coupon defined in ZAR.
       */
      public Builder setZar(Zar zar) {
        this.zar = zar;
        return this;
      }

      /**
       * Coupon defined in ZMW.
       */
      public Builder setZmw(Zmw zmw) {
        this.zmw = zmw;
        return this;
      }
    }
    @Getter
    public static class Aed {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Aed(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Aed build() {
          return new Aed(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aed#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aed#extraParams} for the field documentation.
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
    @Getter
    public static class Afn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Afn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Afn build() {
          return new Afn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Afn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Afn#extraParams} for the field documentation.
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
    @Getter
    public static class All {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private All(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public All build() {
          return new All(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.All#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.All#extraParams} for the field documentation.
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
    @Getter
    public static class Amd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Amd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Amd build() {
          return new Amd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Amd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Amd#extraParams} for the field documentation.
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
    @Getter
    public static class Ang {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ang(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ang build() {
          return new Ang(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ang#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ang#extraParams} for the field documentation.
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
    @Getter
    public static class Aoa {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Aoa(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Aoa build() {
          return new Aoa(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aoa#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aoa#extraParams} for the field documentation.
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
    @Getter
    public static class Ars {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ars(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ars build() {
          return new Ars(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ars#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ars#extraParams} for the field documentation.
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
    @Getter
    public static class Aud {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Aud(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Aud build() {
          return new Aud(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aud#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Aud#extraParams} for the field documentation.
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
    @Getter
    public static class Awg {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Awg(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Awg build() {
          return new Awg(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Awg#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Awg#extraParams} for the field documentation.
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
    @Getter
    public static class Azn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Azn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Azn build() {
          return new Azn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Azn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Azn#extraParams} for the field documentation.
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
    @Getter
    public static class Bam {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bam(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bam build() {
          return new Bam(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bam#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bam#extraParams} for the field documentation.
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
    @Getter
    public static class Bbd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bbd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bbd build() {
          return new Bbd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bbd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bbd#extraParams} for the field documentation.
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
    @Getter
    public static class Bdt {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bdt(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bdt build() {
          return new Bdt(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bdt#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bdt#extraParams} for the field documentation.
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
    @Getter
    public static class Bgn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bgn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bgn build() {
          return new Bgn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bgn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bgn#extraParams} for the field documentation.
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
    @Getter
    public static class Bhd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bhd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bhd build() {
          return new Bhd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bhd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bhd#extraParams} for the field documentation.
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
    @Getter
    public static class Bif {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bif(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bif build() {
          return new Bif(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bif#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bif#extraParams} for the field documentation.
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
    @Getter
    public static class Bmd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bmd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bmd build() {
          return new Bmd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bmd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bmd#extraParams} for the field documentation.
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
    @Getter
    public static class Bnd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bnd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bnd build() {
          return new Bnd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bnd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bnd#extraParams} for the field documentation.
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
    @Getter
    public static class Bob {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bob(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bob build() {
          return new Bob(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bob#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bob#extraParams} for the field documentation.
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
    @Getter
    public static class Brl {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Brl(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Brl build() {
          return new Brl(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Brl#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Brl#extraParams} for the field documentation.
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
    @Getter
    public static class Bsd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bsd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bsd build() {
          return new Bsd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bsd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bsd#extraParams} for the field documentation.
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
    @Getter
    public static class Btn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Btn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Btn build() {
          return new Btn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Btn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Btn#extraParams} for the field documentation.
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
    @Getter
    public static class Bwp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bwp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bwp build() {
          return new Bwp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bwp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bwp#extraParams} for the field documentation.
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
    @Getter
    public static class Byn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Byn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Byn build() {
          return new Byn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Byn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Byn#extraParams} for the field documentation.
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
    @Getter
    public static class Bzd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bzd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Bzd build() {
          return new Bzd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bzd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Bzd#extraParams} for the field documentation.
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
    @Getter
    public static class Cad {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cad(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Cad build() {
          return new Cad(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cad#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cad#extraParams} for the field documentation.
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
    @Getter
    public static class Cdf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cdf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Cdf build() {
          return new Cdf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cdf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cdf#extraParams} for the field documentation.
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
    @Getter
    public static class Chf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Chf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Chf build() {
          return new Chf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Chf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Chf#extraParams} for the field documentation.
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
    @Getter
    public static class Clp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Clp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Clp build() {
          return new Clp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Clp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Clp#extraParams} for the field documentation.
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
    @Getter
    public static class Cny {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cny(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Cny build() {
          return new Cny(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cny#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cny#extraParams} for the field documentation.
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
    @Getter
    public static class Cop {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cop(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Cop build() {
          return new Cop(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cop#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cop#extraParams} for the field documentation.
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
    @Getter
    public static class Crc {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Crc(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Crc build() {
          return new Crc(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Crc#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Crc#extraParams} for the field documentation.
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
    @Getter
    public static class Cve {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cve(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Cve build() {
          return new Cve(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cve#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Cve#extraParams} for the field documentation.
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
    @Getter
    public static class Czk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Czk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Czk build() {
          return new Czk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Czk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Czk#extraParams} for the field documentation.
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
    @Getter
    public static class Djf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Djf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Djf build() {
          return new Djf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Djf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Djf#extraParams} for the field documentation.
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
    @Getter
    public static class Dkk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Dkk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Dkk build() {
          return new Dkk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dkk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dkk#extraParams} for the field documentation.
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
    @Getter
    public static class Dop {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Dop(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Dop build() {
          return new Dop(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dop#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dop#extraParams} for the field documentation.
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
    @Getter
    public static class Dzd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Dzd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Dzd build() {
          return new Dzd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dzd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Dzd#extraParams} for the field documentation.
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
    @Getter
    public static class Egp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Egp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Egp build() {
          return new Egp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Egp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Egp#extraParams} for the field documentation.
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
    @Getter
    public static class Etb {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Etb(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Etb build() {
          return new Etb(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Etb#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Etb#extraParams} for the field documentation.
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
    @Getter
    public static class Eur {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Eur(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Eur build() {
          return new Eur(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Eur#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Eur#extraParams} for the field documentation.
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
    @Getter
    public static class Fjd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Fjd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Fjd build() {
          return new Fjd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Fjd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Fjd#extraParams} for the field documentation.
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
    @Getter
    public static class Fkp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Fkp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Fkp build() {
          return new Fkp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Fkp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Fkp#extraParams} for the field documentation.
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
    @Getter
    public static class Gbp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gbp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gbp build() {
          return new Gbp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gbp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gbp#extraParams} for the field documentation.
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
    @Getter
    public static class Gel {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gel(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gel build() {
          return new Gel(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gel#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gel#extraParams} for the field documentation.
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
    @Getter
    public static class Ghs {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ghs(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ghs build() {
          return new Ghs(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ghs#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ghs#extraParams} for the field documentation.
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
    @Getter
    public static class Gip {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gip(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gip build() {
          return new Gip(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gip#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gip#extraParams} for the field documentation.
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
    @Getter
    public static class Gmd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gmd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gmd build() {
          return new Gmd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gmd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gmd#extraParams} for the field documentation.
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
    @Getter
    public static class Gnf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gnf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gnf build() {
          return new Gnf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gnf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gnf#extraParams} for the field documentation.
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
    @Getter
    public static class Gtq {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gtq(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gtq build() {
          return new Gtq(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gtq#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gtq#extraParams} for the field documentation.
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
    @Getter
    public static class Gyd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gyd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Gyd build() {
          return new Gyd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gyd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Gyd#extraParams} for the field documentation.
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
    @Getter
    public static class Hkd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Hkd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Hkd build() {
          return new Hkd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hkd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hkd#extraParams} for the field documentation.
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
    @Getter
    public static class Hnl {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Hnl(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Hnl build() {
          return new Hnl(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hnl#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hnl#extraParams} for the field documentation.
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
    @Getter
    public static class Hrk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Hrk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Hrk build() {
          return new Hrk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hrk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Hrk#extraParams} for the field documentation.
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
    @Getter
    public static class Htg {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Htg(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Htg build() {
          return new Htg(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Htg#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Htg#extraParams} for the field documentation.
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
    @Getter
    public static class Huf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Huf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Huf build() {
          return new Huf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Huf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Huf#extraParams} for the field documentation.
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
    @Getter
    public static class Idr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Idr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Idr build() {
          return new Idr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Idr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Idr#extraParams} for the field documentation.
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
    @Getter
    public static class Ils {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ils(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ils build() {
          return new Ils(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ils#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ils#extraParams} for the field documentation.
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
    @Getter
    public static class Inr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Inr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Inr build() {
          return new Inr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Inr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Inr#extraParams} for the field documentation.
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
    @Getter
    public static class Isk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Isk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Isk build() {
          return new Isk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Isk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Isk#extraParams} for the field documentation.
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
    @Getter
    public static class Jmd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Jmd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Jmd build() {
          return new Jmd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jmd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jmd#extraParams} for the field documentation.
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
    @Getter
    public static class Jod {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Jod(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Jod build() {
          return new Jod(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jod#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jod#extraParams} for the field documentation.
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
    @Getter
    public static class Jpy {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Jpy(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Jpy build() {
          return new Jpy(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jpy#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Jpy#extraParams} for the field documentation.
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
    @Getter
    public static class Kes {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kes(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kes build() {
          return new Kes(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kes#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kes#extraParams} for the field documentation.
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
    @Getter
    public static class Kgs {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kgs(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kgs build() {
          return new Kgs(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kgs#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kgs#extraParams} for the field documentation.
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
    @Getter
    public static class Khr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Khr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Khr build() {
          return new Khr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Khr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Khr#extraParams} for the field documentation.
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
    @Getter
    public static class Kmf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kmf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kmf build() {
          return new Kmf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kmf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kmf#extraParams} for the field documentation.
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
    @Getter
    public static class Krw {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Krw(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Krw build() {
          return new Krw(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Krw#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Krw#extraParams} for the field documentation.
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
    @Getter
    public static class Kwd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kwd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kwd build() {
          return new Kwd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kwd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kwd#extraParams} for the field documentation.
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
    @Getter
    public static class Kyd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kyd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kyd build() {
          return new Kyd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kyd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kyd#extraParams} for the field documentation.
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
    @Getter
    public static class Kzt {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Kzt(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Kzt build() {
          return new Kzt(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kzt#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Kzt#extraParams} for the field documentation.
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
    @Getter
    public static class Lak {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Lak(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Lak build() {
          return new Lak(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lak#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lak#extraParams} for the field documentation.
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
    @Getter
    public static class Lbp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Lbp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Lbp build() {
          return new Lbp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lbp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lbp#extraParams} for the field documentation.
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
    @Getter
    public static class Lkr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Lkr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Lkr build() {
          return new Lkr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lkr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lkr#extraParams} for the field documentation.
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
    @Getter
    public static class Lrd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Lrd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Lrd build() {
          return new Lrd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lrd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lrd#extraParams} for the field documentation.
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
    @Getter
    public static class Lsl {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Lsl(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Lsl build() {
          return new Lsl(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lsl#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Lsl#extraParams} for the field documentation.
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
    @Getter
    public static class Mad {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mad(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mad build() {
          return new Mad(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mad#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mad#extraParams} for the field documentation.
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
    @Getter
    public static class Mdl {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mdl(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mdl build() {
          return new Mdl(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mdl#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mdl#extraParams} for the field documentation.
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
    @Getter
    public static class Mga {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mga(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mga build() {
          return new Mga(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mga#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mga#extraParams} for the field documentation.
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
    @Getter
    public static class Mkd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mkd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mkd build() {
          return new Mkd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mkd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mkd#extraParams} for the field documentation.
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
    @Getter
    public static class Mmk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mmk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mmk build() {
          return new Mmk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mmk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mmk#extraParams} for the field documentation.
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
    @Getter
    public static class Mnt {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mnt(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mnt build() {
          return new Mnt(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mnt#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mnt#extraParams} for the field documentation.
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
    @Getter
    public static class Mop {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mop(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mop build() {
          return new Mop(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mop#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mop#extraParams} for the field documentation.
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
    @Getter
    public static class Mro {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mro(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mro build() {
          return new Mro(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mro#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mro#extraParams} for the field documentation.
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
    @Getter
    public static class Mur {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mur(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mur build() {
          return new Mur(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mur#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mur#extraParams} for the field documentation.
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
    @Getter
    public static class Mvr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mvr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mvr build() {
          return new Mvr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mvr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mvr#extraParams} for the field documentation.
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
    @Getter
    public static class Mwk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mwk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mwk build() {
          return new Mwk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mwk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mwk#extraParams} for the field documentation.
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
    @Getter
    public static class Mxn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mxn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mxn build() {
          return new Mxn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mxn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mxn#extraParams} for the field documentation.
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
    @Getter
    public static class Myr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Myr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Myr build() {
          return new Myr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Myr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Myr#extraParams} for the field documentation.
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
    @Getter
    public static class Mzn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mzn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Mzn build() {
          return new Mzn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mzn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Mzn#extraParams} for the field documentation.
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
    @Getter
    public static class Nad {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Nad(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Nad build() {
          return new Nad(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nad#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nad#extraParams} for the field documentation.
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
    @Getter
    public static class Ngn {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ngn(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ngn build() {
          return new Ngn(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ngn#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ngn#extraParams} for the field documentation.
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
    @Getter
    public static class Nio {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Nio(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Nio build() {
          return new Nio(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nio#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nio#extraParams} for the field documentation.
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
    @Getter
    public static class Nok {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Nok(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Nok build() {
          return new Nok(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nok#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nok#extraParams} for the field documentation.
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
    @Getter
    public static class Npr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Npr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Npr build() {
          return new Npr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Npr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Npr#extraParams} for the field documentation.
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
    @Getter
    public static class Nzd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Nzd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Nzd build() {
          return new Nzd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nzd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Nzd#extraParams} for the field documentation.
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
    @Getter
    public static class Omr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Omr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Omr build() {
          return new Omr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Omr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Omr#extraParams} for the field documentation.
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
    @Getter
    public static class Pab {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pab(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pab build() {
          return new Pab(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pab#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pab#extraParams} for the field documentation.
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
    @Getter
    public static class Pen {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pen(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pen build() {
          return new Pen(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pen#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pen#extraParams} for the field documentation.
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
    @Getter
    public static class Pgk {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pgk(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pgk build() {
          return new Pgk(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pgk#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pgk#extraParams} for the field documentation.
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
    @Getter
    public static class Php {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Php(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Php build() {
          return new Php(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Php#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Php#extraParams} for the field documentation.
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
    @Getter
    public static class Pkr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pkr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pkr build() {
          return new Pkr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pkr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pkr#extraParams} for the field documentation.
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
    @Getter
    public static class Pln {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pln(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pln build() {
          return new Pln(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pln#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pln#extraParams} for the field documentation.
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
    @Getter
    public static class Pyg {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pyg(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Pyg build() {
          return new Pyg(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pyg#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Pyg#extraParams} for the field documentation.
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
    @Getter
    public static class Qar {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Qar(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Qar build() {
          return new Qar(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Qar#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Qar#extraParams} for the field documentation.
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
    @Getter
    public static class Ron {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ron(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ron build() {
          return new Ron(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ron#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ron#extraParams} for the field documentation.
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
    @Getter
    public static class Rsd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Rsd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Rsd build() {
          return new Rsd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rsd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rsd#extraParams} for the field documentation.
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
    @Getter
    public static class Rub {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Rub(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Rub build() {
          return new Rub(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rub#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rub#extraParams} for the field documentation.
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
    @Getter
    public static class Rwf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Rwf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Rwf build() {
          return new Rwf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rwf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Rwf#extraParams} for the field documentation.
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
    @Getter
    public static class Sar {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sar(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sar build() {
          return new Sar(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sar#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sar#extraParams} for the field documentation.
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
    @Getter
    public static class Sbd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sbd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sbd build() {
          return new Sbd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sbd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sbd#extraParams} for the field documentation.
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
    @Getter
    public static class Scr {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Scr(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Scr build() {
          return new Scr(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Scr#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Scr#extraParams} for the field documentation.
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
    @Getter
    public static class Sek {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sek(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sek build() {
          return new Sek(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sek#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sek#extraParams} for the field documentation.
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
    @Getter
    public static class Sgd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sgd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sgd build() {
          return new Sgd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sgd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sgd#extraParams} for the field documentation.
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
    @Getter
    public static class Shp {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Shp(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Shp build() {
          return new Shp(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Shp#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Shp#extraParams} for the field documentation.
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
    @Getter
    public static class Sll {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sll(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sll build() {
          return new Sll(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sll#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sll#extraParams} for the field documentation.
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
    @Getter
    public static class Sos {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sos(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Sos build() {
          return new Sos(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sos#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Sos#extraParams} for the field documentation.
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
    @Getter
    public static class Srd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Srd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Srd build() {
          return new Srd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Srd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Srd#extraParams} for the field documentation.
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
    @Getter
    public static class Std {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Std(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Std build() {
          return new Std(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Std#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Std#extraParams} for the field documentation.
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
    @Getter
    public static class Szl {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Szl(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Szl build() {
          return new Szl(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Szl#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Szl#extraParams} for the field documentation.
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
    @Getter
    public static class Thb {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Thb(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Thb build() {
          return new Thb(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Thb#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Thb#extraParams} for the field documentation.
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
    @Getter
    public static class Tjs {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Tjs(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Tjs build() {
          return new Tjs(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tjs#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tjs#extraParams} for the field documentation.
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
    @Getter
    public static class Tnd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Tnd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Tnd build() {
          return new Tnd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tnd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tnd#extraParams} for the field documentation.
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
    @Getter
    public static class Top {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Top(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Top build() {
          return new Top(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Top#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Top#extraParams} for the field documentation.
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
    @Getter
    public static class Try {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Try(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Try build() {
          return new Try(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Try#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Try#extraParams} for the field documentation.
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
    @Getter
    public static class Ttd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ttd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ttd build() {
          return new Ttd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ttd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ttd#extraParams} for the field documentation.
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
    @Getter
    public static class Twd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Twd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Twd build() {
          return new Twd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Twd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Twd#extraParams} for the field documentation.
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
    @Getter
    public static class Tzs {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Tzs(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Tzs build() {
          return new Tzs(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tzs#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Tzs#extraParams} for the field documentation.
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
    @Getter
    public static class Uah {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Uah(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Uah build() {
          return new Uah(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uah#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uah#extraParams} for the field documentation.
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
    @Getter
    public static class Ugx {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ugx(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Ugx build() {
          return new Ugx(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ugx#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Ugx#extraParams} for the field documentation.
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
    @Getter
    public static class Usd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Usd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Usd build() {
          return new Usd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Usd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Usd#extraParams} for the field documentation.
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
    @Getter
    public static class Usdc {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Usdc(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Usdc build() {
          return new Usdc(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Usdc#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Usdc#extraParams} for the field documentation.
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
    @Getter
    public static class Uyu {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Uyu(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Uyu build() {
          return new Uyu(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uyu#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uyu#extraParams} for the field documentation.
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
    @Getter
    public static class Uzs {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Uzs(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Uzs build() {
          return new Uzs(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uzs#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Uzs#extraParams} for the field documentation.
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
    @Getter
    public static class Vnd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Vnd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Vnd build() {
          return new Vnd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Vnd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Vnd#extraParams} for the field documentation.
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
    @Getter
    public static class Vuv {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Vuv(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Vuv build() {
          return new Vuv(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Vuv#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Vuv#extraParams} for the field documentation.
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
    @Getter
    public static class Wst {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Wst(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Wst build() {
          return new Wst(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Wst#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Wst#extraParams} for the field documentation.
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
    @Getter
    public static class Xaf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Xaf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Xaf build() {
          return new Xaf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xaf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xaf#extraParams} for the field documentation.
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
    @Getter
    public static class Xcd {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Xcd(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Xcd build() {
          return new Xcd(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xcd#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xcd#extraParams} for the field documentation.
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
    @Getter
    public static class Xof {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Xof(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Xof build() {
          return new Xof(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xof#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xof#extraParams} for the field documentation.
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
    @Getter
    public static class Xpf {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Xpf(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Xpf build() {
          return new Xpf(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xpf#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Xpf#extraParams} for the field documentation.
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
    @Getter
    public static class Yer {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Yer(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Yer build() {
          return new Yer(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Yer#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Yer#extraParams} for the field documentation.
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
    @Getter
    public static class Zar {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Zar(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Zar build() {
          return new Zar(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Zar#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Zar#extraParams} for the field documentation.
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
    @Getter
    public static class Zmw {
      /**
       * A positive integer representing the amount to subtract from an invoice total.
       */
      @SerializedName("amount_off")
      Long amountOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Zmw(Long amountOff, Map<String, Object> extraParams) {
        this.amountOff = amountOff;
        this.extraParams = extraParams;
      }
      public static Builder builder() {
        return new Builder();
      }
      public static class Builder {
        private Long amountOff;

        private Map<String, Object> extraParams;

        /**
         * Finalize and obtain parameter instance from this builder.
         */
        public Zmw build() {
          return new Zmw(this.amountOff, this.extraParams);
        }

        /**
         * A positive integer representing the amount to subtract from an invoice total.
         */
        public Builder setAmountOff(Long amountOff) {
          this.amountOff = amountOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Zmw#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CouponCreateParams.CurrencyOptions.Zmw#extraParams} for the field documentation.
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
  public enum Duration implements ApiRequestParams.EnumParam {
    @SerializedName("forever")
    FOREVER("forever"),

    @SerializedName("once")
    ONCE("once"),

    @SerializedName("repeating")
    REPEATING("repeating");
    @Getter(onMethod_ = {@Override})
    private final String value;
    Duration(String value) {
      this.value = value;
    }
  }
}