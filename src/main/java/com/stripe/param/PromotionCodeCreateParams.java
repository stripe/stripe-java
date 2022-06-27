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
public class PromotionCodeCreateParams extends ApiRequestParams {
  /**
   * Whether the promotion code is currently active.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for a specific customer. If left blank, we will generate one automatically.
   */
  @SerializedName("code")
  String code;

  /**
   * The coupon for this promotion code.
   */
  @SerializedName("coupon")
  String coupon;

  /**
   * The customer that this promotion code can be used by. If not set, the promotion code can be used by all customers.
   */
  @SerializedName("customer")
  String customer;

  /**
   * Specifies which fields in the response should be expanded.
   */
  @SerializedName("expand")
  List<String> expand;

  /**
   * The timestamp at which this promotion code will expire. If the coupon has specified a {@code redeems_by}, then this value cannot be after the coupon's {@code redeems_by}.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A positive integer specifying the number of times the promotion code can be redeemed. If the coupon has specified a {@code max_redemptions}, then this value cannot be greater than the coupon's {@code max_redemptions}.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Settings that restrict the redemption of the promotion code.
   */
  @SerializedName("restrictions")
  Restrictions restrictions;

  private PromotionCodeCreateParams(
      Boolean active,
      String code,
      String coupon,
      String customer,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      Long maxRedemptions,
      Map<String, String> metadata,
      Restrictions restrictions) {
    this.active = active;
    this.code = code;
    this.coupon = coupon;
    this.customer = customer;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.maxRedemptions = maxRedemptions;
    this.metadata = metadata;
    this.restrictions = restrictions;
  }
  public static Builder builder() {
    return new Builder();
  }
  public static class Builder {
    private Boolean active;

    private String code;

    private String coupon;

    private String customer;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private Long maxRedemptions;

    private Map<String, String> metadata;

    private Restrictions restrictions;

    /**
     * Finalize and obtain parameter instance from this builder.
     */
    public PromotionCodeCreateParams build() {
      return new PromotionCodeCreateParams(
        this.active,
        this.code,
        this.coupon,
        this.customer,
        this.expand,
        this.expiresAt,
        this.extraParams,
        this.maxRedemptions,
        this.metadata,
        this.restrictions
      );
    }

    /**
     * Whether the promotion code is currently active.
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for a specific customer. If left blank, we will generate one automatically.
     */
    public Builder setCode(String code) {
      this.code = code;
      return this;
    }

    /**
     * The coupon for this promotion code.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * The customer that this promotion code can be used by. If not set, the promotion code can be used by all customers.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link PromotionCodeCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link PromotionCodeCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * The timestamp at which this promotion code will expire. If the coupon has specified a {@code redeems_by}, then this value cannot be after the coupon's {@code redeems_by}.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A positive integer specifying the number of times the promotion code can be redeemed. If the coupon has specified a {@code max_redemptions}, then this value cannot be greater than the coupon's {@code max_redemptions}.
     */
    public Builder setMaxRedemptions(Long maxRedemptions) {
      this.maxRedemptions = maxRedemptions;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Settings that restrict the redemption of the promotion code.
     */
    public Builder setRestrictions(Restrictions restrictions) {
      this.restrictions = restrictions;
      return this;
    }
  }
  @Getter
  public static class Restrictions {
    /**
     * Promotion codes defined in each available currency option. Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency_options")
    CurrencyOptions currencyOptions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A Boolean indicating if the Promotion Code should only be redeemed for Customers without any successful payments or invoices.
     */
    @SerializedName("first_time_transaction")
    Boolean firstTimeTransaction;

    /**
     * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
     */
    @SerializedName("minimum_amount")
    Long minimumAmount;

    /**
     * Three-letter <a href="https://stripe.com/docs/currencies">ISO code</a> for minimum_amount
     */
    @SerializedName("minimum_amount_currency")
    String minimumAmountCurrency;

    private Restrictions(
        CurrencyOptions currencyOptions,
        Map<String, Object> extraParams,
        Boolean firstTimeTransaction,
        Long minimumAmount,
        String minimumAmountCurrency) {
      this.currencyOptions = currencyOptions;
      this.extraParams = extraParams;
      this.firstTimeTransaction = firstTimeTransaction;
      this.minimumAmount = minimumAmount;
      this.minimumAmountCurrency = minimumAmountCurrency;
    }
    public static Builder builder() {
      return new Builder();
    }
    public static class Builder {
      private CurrencyOptions currencyOptions;

      private Map<String, Object> extraParams;

      private Boolean firstTimeTransaction;

      private Long minimumAmount;

      private String minimumAmountCurrency;

      /**
       * Finalize and obtain parameter instance from this builder.
       */
      public Restrictions build() {
        return new Restrictions(
          this.currencyOptions,
          this.extraParams,
          this.firstTimeTransaction,
          this.minimumAmount,
          this.minimumAmountCurrency
        );
      }

      /**
       * Promotion codes defined in each available currency option. Each key must be a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrencyOptions(CurrencyOptions currencyOptions) {
        this.currencyOptions = currencyOptions;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A Boolean indicating if the Promotion Code should only be redeemed for Customers without any successful payments or invoices.
       */
      public Builder setFirstTimeTransaction(Boolean firstTimeTransaction) {
        this.firstTimeTransaction = firstTimeTransaction;
        return this;
      }

      /**
       * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
       */
      public Builder setMinimumAmount(Long minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
      }

      /**
       * Three-letter <a href="https://stripe.com/docs/currencies">ISO code</a> for minimum_amount
       */
      public Builder setMinimumAmountCurrency(String minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
        return this;
      }
    }
    @Getter
    public static class CurrencyOptions {
      /**
       * Promotion code defined in AED.
       */
      @SerializedName("aed")
      Aed aed;

      /**
       * Promotion code defined in AFN.
       */
      @SerializedName("afn")
      Afn afn;

      /**
       * Promotion code defined in ALL.
       */
      @SerializedName("all")
      All all;

      /**
       * Promotion code defined in AMD.
       */
      @SerializedName("amd")
      Amd amd;

      /**
       * Promotion code defined in ANG.
       */
      @SerializedName("ang")
      Ang ang;

      /**
       * Promotion code defined in AOA.
       */
      @SerializedName("aoa")
      Aoa aoa;

      /**
       * Promotion code defined in ARS.
       */
      @SerializedName("ars")
      Ars ars;

      /**
       * Promotion code defined in AUD.
       */
      @SerializedName("aud")
      Aud aud;

      /**
       * Promotion code defined in AWG.
       */
      @SerializedName("awg")
      Awg awg;

      /**
       * Promotion code defined in AZN.
       */
      @SerializedName("azn")
      Azn azn;

      /**
       * Promotion code defined in BAM.
       */
      @SerializedName("bam")
      Bam bam;

      /**
       * Promotion code defined in BBD.
       */
      @SerializedName("bbd")
      Bbd bbd;

      /**
       * Promotion code defined in BDT.
       */
      @SerializedName("bdt")
      Bdt bdt;

      /**
       * Promotion code defined in BGN.
       */
      @SerializedName("bgn")
      Bgn bgn;

      /**
       * Promotion code defined in BHD.
       */
      @SerializedName("bhd")
      Bhd bhd;

      /**
       * Promotion code defined in BIF.
       */
      @SerializedName("bif")
      Bif bif;

      /**
       * Promotion code defined in BMD.
       */
      @SerializedName("bmd")
      Bmd bmd;

      /**
       * Promotion code defined in BND.
       */
      @SerializedName("bnd")
      Bnd bnd;

      /**
       * Promotion code defined in BOB.
       */
      @SerializedName("bob")
      Bob bob;

      /**
       * Promotion code defined in BRL.
       */
      @SerializedName("brl")
      Brl brl;

      /**
       * Promotion code defined in BSD.
       */
      @SerializedName("bsd")
      Bsd bsd;

      /**
       * Promotion code defined in BTN.
       */
      @SerializedName("btn")
      Btn btn;

      /**
       * Promotion code defined in BWP.
       */
      @SerializedName("bwp")
      Bwp bwp;

      /**
       * Promotion code defined in BYN.
       */
      @SerializedName("byn")
      Byn byn;

      /**
       * Promotion code defined in BZD.
       */
      @SerializedName("bzd")
      Bzd bzd;

      /**
       * Promotion code defined in CAD.
       */
      @SerializedName("cad")
      Cad cad;

      /**
       * Promotion code defined in CDF.
       */
      @SerializedName("cdf")
      Cdf cdf;

      /**
       * Promotion code defined in CHF.
       */
      @SerializedName("chf")
      Chf chf;

      /**
       * Promotion code defined in CLP.
       */
      @SerializedName("clp")
      Clp clp;

      /**
       * Promotion code defined in CNY.
       */
      @SerializedName("cny")
      Cny cny;

      /**
       * Promotion code defined in COP.
       */
      @SerializedName("cop")
      Cop cop;

      /**
       * Promotion code defined in CRC.
       */
      @SerializedName("crc")
      Crc crc;

      /**
       * Promotion code defined in CVE.
       */
      @SerializedName("cve")
      Cve cve;

      /**
       * Promotion code defined in CZK.
       */
      @SerializedName("czk")
      Czk czk;

      /**
       * Promotion code defined in DJF.
       */
      @SerializedName("djf")
      Djf djf;

      /**
       * Promotion code defined in DKK.
       */
      @SerializedName("dkk")
      Dkk dkk;

      /**
       * Promotion code defined in DOP.
       */
      @SerializedName("dop")
      Dop dop;

      /**
       * Promotion code defined in DZD.
       */
      @SerializedName("dzd")
      Dzd dzd;

      /**
       * Promotion code defined in EGP.
       */
      @SerializedName("egp")
      Egp egp;

      /**
       * Promotion code defined in ETB.
       */
      @SerializedName("etb")
      Etb etb;

      /**
       * Promotion code defined in EUR.
       */
      @SerializedName("eur")
      Eur eur;

      /**
       * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Promotion code defined in FJD.
       */
      @SerializedName("fjd")
      Fjd fjd;

      /**
       * Promotion code defined in FKP.
       */
      @SerializedName("fkp")
      Fkp fkp;

      /**
       * Promotion code defined in GBP.
       */
      @SerializedName("gbp")
      Gbp gbp;

      /**
       * Promotion code defined in GEL.
       */
      @SerializedName("gel")
      Gel gel;

      /**
       * Promotion code defined in GHS.
       */
      @SerializedName("ghs")
      Ghs ghs;

      /**
       * Promotion code defined in GIP.
       */
      @SerializedName("gip")
      Gip gip;

      /**
       * Promotion code defined in GMD.
       */
      @SerializedName("gmd")
      Gmd gmd;

      /**
       * Promotion code defined in GNF.
       */
      @SerializedName("gnf")
      Gnf gnf;

      /**
       * Promotion code defined in GTQ.
       */
      @SerializedName("gtq")
      Gtq gtq;

      /**
       * Promotion code defined in GYD.
       */
      @SerializedName("gyd")
      Gyd gyd;

      /**
       * Promotion code defined in HKD.
       */
      @SerializedName("hkd")
      Hkd hkd;

      /**
       * Promotion code defined in HNL.
       */
      @SerializedName("hnl")
      Hnl hnl;

      /**
       * Promotion code defined in HRK.
       */
      @SerializedName("hrk")
      Hrk hrk;

      /**
       * Promotion code defined in HTG.
       */
      @SerializedName("htg")
      Htg htg;

      /**
       * Promotion code defined in HUF.
       */
      @SerializedName("huf")
      Huf huf;

      /**
       * Promotion code defined in IDR.
       */
      @SerializedName("idr")
      Idr idr;

      /**
       * Promotion code defined in ILS.
       */
      @SerializedName("ils")
      Ils ils;

      /**
       * Promotion code defined in INR.
       */
      @SerializedName("inr")
      Inr inr;

      /**
       * Promotion code defined in ISK.
       */
      @SerializedName("isk")
      Isk isk;

      /**
       * Promotion code defined in JMD.
       */
      @SerializedName("jmd")
      Jmd jmd;

      /**
       * Promotion code defined in JOD.
       */
      @SerializedName("jod")
      Jod jod;

      /**
       * Promotion code defined in JPY.
       */
      @SerializedName("jpy")
      Jpy jpy;

      /**
       * Promotion code defined in KES.
       */
      @SerializedName("kes")
      Kes kes;

      /**
       * Promotion code defined in KGS.
       */
      @SerializedName("kgs")
      Kgs kgs;

      /**
       * Promotion code defined in KHR.
       */
      @SerializedName("khr")
      Khr khr;

      /**
       * Promotion code defined in KMF.
       */
      @SerializedName("kmf")
      Kmf kmf;

      /**
       * Promotion code defined in KRW.
       */
      @SerializedName("krw")
      Krw krw;

      /**
       * Promotion code defined in KWD.
       */
      @SerializedName("kwd")
      Kwd kwd;

      /**
       * Promotion code defined in KYD.
       */
      @SerializedName("kyd")
      Kyd kyd;

      /**
       * Promotion code defined in KZT.
       */
      @SerializedName("kzt")
      Kzt kzt;

      /**
       * Promotion code defined in LAK.
       */
      @SerializedName("lak")
      Lak lak;

      /**
       * Promotion code defined in LBP.
       */
      @SerializedName("lbp")
      Lbp lbp;

      /**
       * Promotion code defined in LKR.
       */
      @SerializedName("lkr")
      Lkr lkr;

      /**
       * Promotion code defined in LRD.
       */
      @SerializedName("lrd")
      Lrd lrd;

      /**
       * Promotion code defined in LSL.
       */
      @SerializedName("lsl")
      Lsl lsl;

      /**
       * Promotion code defined in MAD.
       */
      @SerializedName("mad")
      Mad mad;

      /**
       * Promotion code defined in MDL.
       */
      @SerializedName("mdl")
      Mdl mdl;

      /**
       * Promotion code defined in MGA.
       */
      @SerializedName("mga")
      Mga mga;

      /**
       * Promotion code defined in MKD.
       */
      @SerializedName("mkd")
      Mkd mkd;

      /**
       * Promotion code defined in MMK.
       */
      @SerializedName("mmk")
      Mmk mmk;

      /**
       * Promotion code defined in MNT.
       */
      @SerializedName("mnt")
      Mnt mnt;

      /**
       * Promotion code defined in MOP.
       */
      @SerializedName("mop")
      Mop mop;

      /**
       * Promotion code defined in MRO.
       */
      @SerializedName("mro")
      Mro mro;

      /**
       * Promotion code defined in MUR.
       */
      @SerializedName("mur")
      Mur mur;

      /**
       * Promotion code defined in MVR.
       */
      @SerializedName("mvr")
      Mvr mvr;

      /**
       * Promotion code defined in MWK.
       */
      @SerializedName("mwk")
      Mwk mwk;

      /**
       * Promotion code defined in MXN.
       */
      @SerializedName("mxn")
      Mxn mxn;

      /**
       * Promotion code defined in MYR.
       */
      @SerializedName("myr")
      Myr myr;

      /**
       * Promotion code defined in MZN.
       */
      @SerializedName("mzn")
      Mzn mzn;

      /**
       * Promotion code defined in NAD.
       */
      @SerializedName("nad")
      Nad nad;

      /**
       * Promotion code defined in NGN.
       */
      @SerializedName("ngn")
      Ngn ngn;

      /**
       * Promotion code defined in NIO.
       */
      @SerializedName("nio")
      Nio nio;

      /**
       * Promotion code defined in NOK.
       */
      @SerializedName("nok")
      Nok nok;

      /**
       * Promotion code defined in NPR.
       */
      @SerializedName("npr")
      Npr npr;

      /**
       * Promotion code defined in NZD.
       */
      @SerializedName("nzd")
      Nzd nzd;

      /**
       * Promotion code defined in OMR.
       */
      @SerializedName("omr")
      Omr omr;

      /**
       * Promotion code defined in PAB.
       */
      @SerializedName("pab")
      Pab pab;

      /**
       * Promotion code defined in PEN.
       */
      @SerializedName("pen")
      Pen pen;

      /**
       * Promotion code defined in PGK.
       */
      @SerializedName("pgk")
      Pgk pgk;

      /**
       * Promotion code defined in PHP.
       */
      @SerializedName("php")
      Php php;

      /**
       * Promotion code defined in PKR.
       */
      @SerializedName("pkr")
      Pkr pkr;

      /**
       * Promotion code defined in PLN.
       */
      @SerializedName("pln")
      Pln pln;

      /**
       * Promotion code defined in PYG.
       */
      @SerializedName("pyg")
      Pyg pyg;

      /**
       * Promotion code defined in QAR.
       */
      @SerializedName("qar")
      Qar qar;

      /**
       * Promotion code defined in RON.
       */
      @SerializedName("ron")
      Ron ron;

      /**
       * Promotion code defined in RSD.
       */
      @SerializedName("rsd")
      Rsd rsd;

      /**
       * Promotion code defined in RUB.
       */
      @SerializedName("rub")
      Rub rub;

      /**
       * Promotion code defined in RWF.
       */
      @SerializedName("rwf")
      Rwf rwf;

      /**
       * Promotion code defined in SAR.
       */
      @SerializedName("sar")
      Sar sar;

      /**
       * Promotion code defined in SBD.
       */
      @SerializedName("sbd")
      Sbd sbd;

      /**
       * Promotion code defined in SCR.
       */
      @SerializedName("scr")
      Scr scr;

      /**
       * Promotion code defined in SEK.
       */
      @SerializedName("sek")
      Sek sek;

      /**
       * Promotion code defined in SGD.
       */
      @SerializedName("sgd")
      Sgd sgd;

      /**
       * Promotion code defined in SHP.
       */
      @SerializedName("shp")
      Shp shp;

      /**
       * Promotion code defined in SLL.
       */
      @SerializedName("sll")
      Sll sll;

      /**
       * Promotion code defined in SOS.
       */
      @SerializedName("sos")
      Sos sos;

      /**
       * Promotion code defined in SRD.
       */
      @SerializedName("srd")
      Srd srd;

      /**
       * Promotion code defined in STD.
       */
      @SerializedName("std")
      Std std;

      /**
       * Promotion code defined in SZL.
       */
      @SerializedName("szl")
      Szl szl;

      /**
       * Promotion code defined in THB.
       */
      @SerializedName("thb")
      Thb thb;

      /**
       * Promotion code defined in TJS.
       */
      @SerializedName("tjs")
      Tjs tjs;

      /**
       * Promotion code defined in TND.
       */
      @SerializedName("tnd")
      Tnd tnd;

      /**
       * Promotion code defined in TOP.
       */
      @SerializedName("top")
      Top top;

      /**
       * Promotion code defined in TRY.
       */
      @SerializedName("try")
      Try try;

      /**
       * Promotion code defined in TTD.
       */
      @SerializedName("ttd")
      Ttd ttd;

      /**
       * Promotion code defined in TWD.
       */
      @SerializedName("twd")
      Twd twd;

      /**
       * Promotion code defined in TZS.
       */
      @SerializedName("tzs")
      Tzs tzs;

      /**
       * Promotion code defined in UAH.
       */
      @SerializedName("uah")
      Uah uah;

      /**
       * Promotion code defined in UGX.
       */
      @SerializedName("ugx")
      Ugx ugx;

      /**
       * Promotion code defined in USD.
       */
      @SerializedName("usd")
      Usd usd;

      /**
       * Promotion code defined in USDC.
       */
      @SerializedName("usdc")
      Usdc usdc;

      /**
       * Promotion code defined in UYU.
       */
      @SerializedName("uyu")
      Uyu uyu;

      /**
       * Promotion code defined in UZS.
       */
      @SerializedName("uzs")
      Uzs uzs;

      /**
       * Promotion code defined in VND.
       */
      @SerializedName("vnd")
      Vnd vnd;

      /**
       * Promotion code defined in VUV.
       */
      @SerializedName("vuv")
      Vuv vuv;

      /**
       * Promotion code defined in WST.
       */
      @SerializedName("wst")
      Wst wst;

      /**
       * Promotion code defined in XAF.
       */
      @SerializedName("xaf")
      Xaf xaf;

      /**
       * Promotion code defined in XCD.
       */
      @SerializedName("xcd")
      Xcd xcd;

      /**
       * Promotion code defined in XOF.
       */
      @SerializedName("xof")
      Xof xof;

      /**
       * Promotion code defined in XPF.
       */
      @SerializedName("xpf")
      Xpf xpf;

      /**
       * Promotion code defined in YER.
       */
      @SerializedName("yer")
      Yer yer;

      /**
       * Promotion code defined in ZAR.
       */
      @SerializedName("zar")
      Zar zar;

      /**
       * Promotion code defined in ZMW.
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
         * Promotion code defined in AED.
         */
        public Builder setAed(Aed aed) {
          this.aed = aed;
          return this;
        }

        /**
         * Promotion code defined in AFN.
         */
        public Builder setAfn(Afn afn) {
          this.afn = afn;
          return this;
        }

        /**
         * Promotion code defined in ALL.
         */
        public Builder setAll(All all) {
          this.all = all;
          return this;
        }

        /**
         * Promotion code defined in AMD.
         */
        public Builder setAmd(Amd amd) {
          this.amd = amd;
          return this;
        }

        /**
         * Promotion code defined in ANG.
         */
        public Builder setAng(Ang ang) {
          this.ang = ang;
          return this;
        }

        /**
         * Promotion code defined in AOA.
         */
        public Builder setAoa(Aoa aoa) {
          this.aoa = aoa;
          return this;
        }

        /**
         * Promotion code defined in ARS.
         */
        public Builder setArs(Ars ars) {
          this.ars = ars;
          return this;
        }

        /**
         * Promotion code defined in AUD.
         */
        public Builder setAud(Aud aud) {
          this.aud = aud;
          return this;
        }

        /**
         * Promotion code defined in AWG.
         */
        public Builder setAwg(Awg awg) {
          this.awg = awg;
          return this;
        }

        /**
         * Promotion code defined in AZN.
         */
        public Builder setAzn(Azn azn) {
          this.azn = azn;
          return this;
        }

        /**
         * Promotion code defined in BAM.
         */
        public Builder setBam(Bam bam) {
          this.bam = bam;
          return this;
        }

        /**
         * Promotion code defined in BBD.
         */
        public Builder setBbd(Bbd bbd) {
          this.bbd = bbd;
          return this;
        }

        /**
         * Promotion code defined in BDT.
         */
        public Builder setBdt(Bdt bdt) {
          this.bdt = bdt;
          return this;
        }

        /**
         * Promotion code defined in BGN.
         */
        public Builder setBgn(Bgn bgn) {
          this.bgn = bgn;
          return this;
        }

        /**
         * Promotion code defined in BHD.
         */
        public Builder setBhd(Bhd bhd) {
          this.bhd = bhd;
          return this;
        }

        /**
         * Promotion code defined in BIF.
         */
        public Builder setBif(Bif bif) {
          this.bif = bif;
          return this;
        }

        /**
         * Promotion code defined in BMD.
         */
        public Builder setBmd(Bmd bmd) {
          this.bmd = bmd;
          return this;
        }

        /**
         * Promotion code defined in BND.
         */
        public Builder setBnd(Bnd bnd) {
          this.bnd = bnd;
          return this;
        }

        /**
         * Promotion code defined in BOB.
         */
        public Builder setBob(Bob bob) {
          this.bob = bob;
          return this;
        }

        /**
         * Promotion code defined in BRL.
         */
        public Builder setBrl(Brl brl) {
          this.brl = brl;
          return this;
        }

        /**
         * Promotion code defined in BSD.
         */
        public Builder setBsd(Bsd bsd) {
          this.bsd = bsd;
          return this;
        }

        /**
         * Promotion code defined in BTN.
         */
        public Builder setBtn(Btn btn) {
          this.btn = btn;
          return this;
        }

        /**
         * Promotion code defined in BWP.
         */
        public Builder setBwp(Bwp bwp) {
          this.bwp = bwp;
          return this;
        }

        /**
         * Promotion code defined in BYN.
         */
        public Builder setByn(Byn byn) {
          this.byn = byn;
          return this;
        }

        /**
         * Promotion code defined in BZD.
         */
        public Builder setBzd(Bzd bzd) {
          this.bzd = bzd;
          return this;
        }

        /**
         * Promotion code defined in CAD.
         */
        public Builder setCad(Cad cad) {
          this.cad = cad;
          return this;
        }

        /**
         * Promotion code defined in CDF.
         */
        public Builder setCdf(Cdf cdf) {
          this.cdf = cdf;
          return this;
        }

        /**
         * Promotion code defined in CHF.
         */
        public Builder setChf(Chf chf) {
          this.chf = chf;
          return this;
        }

        /**
         * Promotion code defined in CLP.
         */
        public Builder setClp(Clp clp) {
          this.clp = clp;
          return this;
        }

        /**
         * Promotion code defined in CNY.
         */
        public Builder setCny(Cny cny) {
          this.cny = cny;
          return this;
        }

        /**
         * Promotion code defined in COP.
         */
        public Builder setCop(Cop cop) {
          this.cop = cop;
          return this;
        }

        /**
         * Promotion code defined in CRC.
         */
        public Builder setCrc(Crc crc) {
          this.crc = crc;
          return this;
        }

        /**
         * Promotion code defined in CVE.
         */
        public Builder setCve(Cve cve) {
          this.cve = cve;
          return this;
        }

        /**
         * Promotion code defined in CZK.
         */
        public Builder setCzk(Czk czk) {
          this.czk = czk;
          return this;
        }

        /**
         * Promotion code defined in DJF.
         */
        public Builder setDjf(Djf djf) {
          this.djf = djf;
          return this;
        }

        /**
         * Promotion code defined in DKK.
         */
        public Builder setDkk(Dkk dkk) {
          this.dkk = dkk;
          return this;
        }

        /**
         * Promotion code defined in DOP.
         */
        public Builder setDop(Dop dop) {
          this.dop = dop;
          return this;
        }

        /**
         * Promotion code defined in DZD.
         */
        public Builder setDzd(Dzd dzd) {
          this.dzd = dzd;
          return this;
        }

        /**
         * Promotion code defined in EGP.
         */
        public Builder setEgp(Egp egp) {
          this.egp = egp;
          return this;
        }

        /**
         * Promotion code defined in ETB.
         */
        public Builder setEtb(Etb etb) {
          this.etb = etb;
          return this;
        }

        /**
         * Promotion code defined in EUR.
         */
        public Builder setEur(Eur eur) {
          this.eur = eur;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions#extraParams} for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Promotion code defined in FJD.
         */
        public Builder setFjd(Fjd fjd) {
          this.fjd = fjd;
          return this;
        }

        /**
         * Promotion code defined in FKP.
         */
        public Builder setFkp(Fkp fkp) {
          this.fkp = fkp;
          return this;
        }

        /**
         * Promotion code defined in GBP.
         */
        public Builder setGbp(Gbp gbp) {
          this.gbp = gbp;
          return this;
        }

        /**
         * Promotion code defined in GEL.
         */
        public Builder setGel(Gel gel) {
          this.gel = gel;
          return this;
        }

        /**
         * Promotion code defined in GHS.
         */
        public Builder setGhs(Ghs ghs) {
          this.ghs = ghs;
          return this;
        }

        /**
         * Promotion code defined in GIP.
         */
        public Builder setGip(Gip gip) {
          this.gip = gip;
          return this;
        }

        /**
         * Promotion code defined in GMD.
         */
        public Builder setGmd(Gmd gmd) {
          this.gmd = gmd;
          return this;
        }

        /**
         * Promotion code defined in GNF.
         */
        public Builder setGnf(Gnf gnf) {
          this.gnf = gnf;
          return this;
        }

        /**
         * Promotion code defined in GTQ.
         */
        public Builder setGtq(Gtq gtq) {
          this.gtq = gtq;
          return this;
        }

        /**
         * Promotion code defined in GYD.
         */
        public Builder setGyd(Gyd gyd) {
          this.gyd = gyd;
          return this;
        }

        /**
         * Promotion code defined in HKD.
         */
        public Builder setHkd(Hkd hkd) {
          this.hkd = hkd;
          return this;
        }

        /**
         * Promotion code defined in HNL.
         */
        public Builder setHnl(Hnl hnl) {
          this.hnl = hnl;
          return this;
        }

        /**
         * Promotion code defined in HRK.
         */
        public Builder setHrk(Hrk hrk) {
          this.hrk = hrk;
          return this;
        }

        /**
         * Promotion code defined in HTG.
         */
        public Builder setHtg(Htg htg) {
          this.htg = htg;
          return this;
        }

        /**
         * Promotion code defined in HUF.
         */
        public Builder setHuf(Huf huf) {
          this.huf = huf;
          return this;
        }

        /**
         * Promotion code defined in IDR.
         */
        public Builder setIdr(Idr idr) {
          this.idr = idr;
          return this;
        }

        /**
         * Promotion code defined in ILS.
         */
        public Builder setIls(Ils ils) {
          this.ils = ils;
          return this;
        }

        /**
         * Promotion code defined in INR.
         */
        public Builder setInr(Inr inr) {
          this.inr = inr;
          return this;
        }

        /**
         * Promotion code defined in ISK.
         */
        public Builder setIsk(Isk isk) {
          this.isk = isk;
          return this;
        }

        /**
         * Promotion code defined in JMD.
         */
        public Builder setJmd(Jmd jmd) {
          this.jmd = jmd;
          return this;
        }

        /**
         * Promotion code defined in JOD.
         */
        public Builder setJod(Jod jod) {
          this.jod = jod;
          return this;
        }

        /**
         * Promotion code defined in JPY.
         */
        public Builder setJpy(Jpy jpy) {
          this.jpy = jpy;
          return this;
        }

        /**
         * Promotion code defined in KES.
         */
        public Builder setKes(Kes kes) {
          this.kes = kes;
          return this;
        }

        /**
         * Promotion code defined in KGS.
         */
        public Builder setKgs(Kgs kgs) {
          this.kgs = kgs;
          return this;
        }

        /**
         * Promotion code defined in KHR.
         */
        public Builder setKhr(Khr khr) {
          this.khr = khr;
          return this;
        }

        /**
         * Promotion code defined in KMF.
         */
        public Builder setKmf(Kmf kmf) {
          this.kmf = kmf;
          return this;
        }

        /**
         * Promotion code defined in KRW.
         */
        public Builder setKrw(Krw krw) {
          this.krw = krw;
          return this;
        }

        /**
         * Promotion code defined in KWD.
         */
        public Builder setKwd(Kwd kwd) {
          this.kwd = kwd;
          return this;
        }

        /**
         * Promotion code defined in KYD.
         */
        public Builder setKyd(Kyd kyd) {
          this.kyd = kyd;
          return this;
        }

        /**
         * Promotion code defined in KZT.
         */
        public Builder setKzt(Kzt kzt) {
          this.kzt = kzt;
          return this;
        }

        /**
         * Promotion code defined in LAK.
         */
        public Builder setLak(Lak lak) {
          this.lak = lak;
          return this;
        }

        /**
         * Promotion code defined in LBP.
         */
        public Builder setLbp(Lbp lbp) {
          this.lbp = lbp;
          return this;
        }

        /**
         * Promotion code defined in LKR.
         */
        public Builder setLkr(Lkr lkr) {
          this.lkr = lkr;
          return this;
        }

        /**
         * Promotion code defined in LRD.
         */
        public Builder setLrd(Lrd lrd) {
          this.lrd = lrd;
          return this;
        }

        /**
         * Promotion code defined in LSL.
         */
        public Builder setLsl(Lsl lsl) {
          this.lsl = lsl;
          return this;
        }

        /**
         * Promotion code defined in MAD.
         */
        public Builder setMad(Mad mad) {
          this.mad = mad;
          return this;
        }

        /**
         * Promotion code defined in MDL.
         */
        public Builder setMdl(Mdl mdl) {
          this.mdl = mdl;
          return this;
        }

        /**
         * Promotion code defined in MGA.
         */
        public Builder setMga(Mga mga) {
          this.mga = mga;
          return this;
        }

        /**
         * Promotion code defined in MKD.
         */
        public Builder setMkd(Mkd mkd) {
          this.mkd = mkd;
          return this;
        }

        /**
         * Promotion code defined in MMK.
         */
        public Builder setMmk(Mmk mmk) {
          this.mmk = mmk;
          return this;
        }

        /**
         * Promotion code defined in MNT.
         */
        public Builder setMnt(Mnt mnt) {
          this.mnt = mnt;
          return this;
        }

        /**
         * Promotion code defined in MOP.
         */
        public Builder setMop(Mop mop) {
          this.mop = mop;
          return this;
        }

        /**
         * Promotion code defined in MRO.
         */
        public Builder setMro(Mro mro) {
          this.mro = mro;
          return this;
        }

        /**
         * Promotion code defined in MUR.
         */
        public Builder setMur(Mur mur) {
          this.mur = mur;
          return this;
        }

        /**
         * Promotion code defined in MVR.
         */
        public Builder setMvr(Mvr mvr) {
          this.mvr = mvr;
          return this;
        }

        /**
         * Promotion code defined in MWK.
         */
        public Builder setMwk(Mwk mwk) {
          this.mwk = mwk;
          return this;
        }

        /**
         * Promotion code defined in MXN.
         */
        public Builder setMxn(Mxn mxn) {
          this.mxn = mxn;
          return this;
        }

        /**
         * Promotion code defined in MYR.
         */
        public Builder setMyr(Myr myr) {
          this.myr = myr;
          return this;
        }

        /**
         * Promotion code defined in MZN.
         */
        public Builder setMzn(Mzn mzn) {
          this.mzn = mzn;
          return this;
        }

        /**
         * Promotion code defined in NAD.
         */
        public Builder setNad(Nad nad) {
          this.nad = nad;
          return this;
        }

        /**
         * Promotion code defined in NGN.
         */
        public Builder setNgn(Ngn ngn) {
          this.ngn = ngn;
          return this;
        }

        /**
         * Promotion code defined in NIO.
         */
        public Builder setNio(Nio nio) {
          this.nio = nio;
          return this;
        }

        /**
         * Promotion code defined in NOK.
         */
        public Builder setNok(Nok nok) {
          this.nok = nok;
          return this;
        }

        /**
         * Promotion code defined in NPR.
         */
        public Builder setNpr(Npr npr) {
          this.npr = npr;
          return this;
        }

        /**
         * Promotion code defined in NZD.
         */
        public Builder setNzd(Nzd nzd) {
          this.nzd = nzd;
          return this;
        }

        /**
         * Promotion code defined in OMR.
         */
        public Builder setOmr(Omr omr) {
          this.omr = omr;
          return this;
        }

        /**
         * Promotion code defined in PAB.
         */
        public Builder setPab(Pab pab) {
          this.pab = pab;
          return this;
        }

        /**
         * Promotion code defined in PEN.
         */
        public Builder setPen(Pen pen) {
          this.pen = pen;
          return this;
        }

        /**
         * Promotion code defined in PGK.
         */
        public Builder setPgk(Pgk pgk) {
          this.pgk = pgk;
          return this;
        }

        /**
         * Promotion code defined in PHP.
         */
        public Builder setPhp(Php php) {
          this.php = php;
          return this;
        }

        /**
         * Promotion code defined in PKR.
         */
        public Builder setPkr(Pkr pkr) {
          this.pkr = pkr;
          return this;
        }

        /**
         * Promotion code defined in PLN.
         */
        public Builder setPln(Pln pln) {
          this.pln = pln;
          return this;
        }

        /**
         * Promotion code defined in PYG.
         */
        public Builder setPyg(Pyg pyg) {
          this.pyg = pyg;
          return this;
        }

        /**
         * Promotion code defined in QAR.
         */
        public Builder setQar(Qar qar) {
          this.qar = qar;
          return this;
        }

        /**
         * Promotion code defined in RON.
         */
        public Builder setRon(Ron ron) {
          this.ron = ron;
          return this;
        }

        /**
         * Promotion code defined in RSD.
         */
        public Builder setRsd(Rsd rsd) {
          this.rsd = rsd;
          return this;
        }

        /**
         * Promotion code defined in RUB.
         */
        public Builder setRub(Rub rub) {
          this.rub = rub;
          return this;
        }

        /**
         * Promotion code defined in RWF.
         */
        public Builder setRwf(Rwf rwf) {
          this.rwf = rwf;
          return this;
        }

        /**
         * Promotion code defined in SAR.
         */
        public Builder setSar(Sar sar) {
          this.sar = sar;
          return this;
        }

        /**
         * Promotion code defined in SBD.
         */
        public Builder setSbd(Sbd sbd) {
          this.sbd = sbd;
          return this;
        }

        /**
         * Promotion code defined in SCR.
         */
        public Builder setScr(Scr scr) {
          this.scr = scr;
          return this;
        }

        /**
         * Promotion code defined in SEK.
         */
        public Builder setSek(Sek sek) {
          this.sek = sek;
          return this;
        }

        /**
         * Promotion code defined in SGD.
         */
        public Builder setSgd(Sgd sgd) {
          this.sgd = sgd;
          return this;
        }

        /**
         * Promotion code defined in SHP.
         */
        public Builder setShp(Shp shp) {
          this.shp = shp;
          return this;
        }

        /**
         * Promotion code defined in SLL.
         */
        public Builder setSll(Sll sll) {
          this.sll = sll;
          return this;
        }

        /**
         * Promotion code defined in SOS.
         */
        public Builder setSos(Sos sos) {
          this.sos = sos;
          return this;
        }

        /**
         * Promotion code defined in SRD.
         */
        public Builder setSrd(Srd srd) {
          this.srd = srd;
          return this;
        }

        /**
         * Promotion code defined in STD.
         */
        public Builder setStd(Std std) {
          this.std = std;
          return this;
        }

        /**
         * Promotion code defined in SZL.
         */
        public Builder setSzl(Szl szl) {
          this.szl = szl;
          return this;
        }

        /**
         * Promotion code defined in THB.
         */
        public Builder setThb(Thb thb) {
          this.thb = thb;
          return this;
        }

        /**
         * Promotion code defined in TJS.
         */
        public Builder setTjs(Tjs tjs) {
          this.tjs = tjs;
          return this;
        }

        /**
         * Promotion code defined in TND.
         */
        public Builder setTnd(Tnd tnd) {
          this.tnd = tnd;
          return this;
        }

        /**
         * Promotion code defined in TOP.
         */
        public Builder setTop(Top top) {
          this.top = top;
          return this;
        }

        /**
         * Promotion code defined in TRY.
         */
        public Builder setTry(Try try) {
          this.try = try;
          return this;
        }

        /**
         * Promotion code defined in TTD.
         */
        public Builder setTtd(Ttd ttd) {
          this.ttd = ttd;
          return this;
        }

        /**
         * Promotion code defined in TWD.
         */
        public Builder setTwd(Twd twd) {
          this.twd = twd;
          return this;
        }

        /**
         * Promotion code defined in TZS.
         */
        public Builder setTzs(Tzs tzs) {
          this.tzs = tzs;
          return this;
        }

        /**
         * Promotion code defined in UAH.
         */
        public Builder setUah(Uah uah) {
          this.uah = uah;
          return this;
        }

        /**
         * Promotion code defined in UGX.
         */
        public Builder setUgx(Ugx ugx) {
          this.ugx = ugx;
          return this;
        }

        /**
         * Promotion code defined in USD.
         */
        public Builder setUsd(Usd usd) {
          this.usd = usd;
          return this;
        }

        /**
         * Promotion code defined in USDC.
         */
        public Builder setUsdc(Usdc usdc) {
          this.usdc = usdc;
          return this;
        }

        /**
         * Promotion code defined in UYU.
         */
        public Builder setUyu(Uyu uyu) {
          this.uyu = uyu;
          return this;
        }

        /**
         * Promotion code defined in UZS.
         */
        public Builder setUzs(Uzs uzs) {
          this.uzs = uzs;
          return this;
        }

        /**
         * Promotion code defined in VND.
         */
        public Builder setVnd(Vnd vnd) {
          this.vnd = vnd;
          return this;
        }

        /**
         * Promotion code defined in VUV.
         */
        public Builder setVuv(Vuv vuv) {
          this.vuv = vuv;
          return this;
        }

        /**
         * Promotion code defined in WST.
         */
        public Builder setWst(Wst wst) {
          this.wst = wst;
          return this;
        }

        /**
         * Promotion code defined in XAF.
         */
        public Builder setXaf(Xaf xaf) {
          this.xaf = xaf;
          return this;
        }

        /**
         * Promotion code defined in XCD.
         */
        public Builder setXcd(Xcd xcd) {
          this.xcd = xcd;
          return this;
        }

        /**
         * Promotion code defined in XOF.
         */
        public Builder setXof(Xof xof) {
          this.xof = xof;
          return this;
        }

        /**
         * Promotion code defined in XPF.
         */
        public Builder setXpf(Xpf xpf) {
          this.xpf = xpf;
          return this;
        }

        /**
         * Promotion code defined in YER.
         */
        public Builder setYer(Yer yer) {
          this.yer = yer;
          return this;
        }

        /**
         * Promotion code defined in ZAR.
         */
        public Builder setZar(Zar zar) {
          this.zar = zar;
          return this;
        }

        /**
         * Promotion code defined in ZMW.
         */
        public Builder setZmw(Zmw zmw) {
          this.zmw = zmw;
          return this;
        }
      }
      @Getter
      public static class Aed {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Aed(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aed build() {
            return new Aed(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aed#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aed#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Afn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Afn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Afn build() {
            return new Afn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Afn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Afn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class All {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private All(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public All build() {
            return new All(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.All#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.All#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Amd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Amd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Amd build() {
            return new Amd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Amd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Amd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ang {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ang(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ang build() {
            return new Ang(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ang#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ang#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Aoa {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Aoa(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aoa build() {
            return new Aoa(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aoa#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aoa#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ars {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ars(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ars build() {
            return new Ars(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ars#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ars#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Aud {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Aud(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Aud build() {
            return new Aud(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aud#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Aud#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Awg {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Awg(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Awg build() {
            return new Awg(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Awg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Awg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Azn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Azn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Azn build() {
            return new Azn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Azn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Azn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bam {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bam(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bam build() {
            return new Bam(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bam#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bam#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bbd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bbd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bbd build() {
            return new Bbd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bbd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bbd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bdt {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bdt(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bdt build() {
            return new Bdt(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bdt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bdt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bgn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bgn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bgn build() {
            return new Bgn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bgn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bgn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bhd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bhd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bhd build() {
            return new Bhd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bhd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bhd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bif {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bif(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bif build() {
            return new Bif(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bif#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bif#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bmd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bmd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bmd build() {
            return new Bmd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bnd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bnd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bnd build() {
            return new Bnd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bob {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bob(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bob build() {
            return new Bob(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bob#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bob#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Brl {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Brl(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Brl build() {
            return new Brl(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Brl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Brl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bsd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bsd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bsd build() {
            return new Bsd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bsd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bsd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Btn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Btn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Btn build() {
            return new Btn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Btn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Btn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bwp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bwp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bwp build() {
            return new Bwp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bwp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bwp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Byn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Byn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Byn build() {
            return new Byn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Byn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Byn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Bzd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Bzd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Bzd build() {
            return new Bzd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Bzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Cad {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Cad(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cad build() {
            return new Cad(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Cdf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Cdf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cdf build() {
            return new Cdf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cdf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cdf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Chf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Chf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Chf build() {
            return new Chf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Chf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Chf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Clp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Clp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Clp build() {
            return new Clp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Clp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Clp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Cny {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Cny(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cny build() {
            return new Cny(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cny#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cny#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Cop {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Cop(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cop build() {
            return new Cop(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Crc {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Crc(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Crc build() {
            return new Crc(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Crc#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Crc#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Cve {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Cve(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Cve build() {
            return new Cve(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cve#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Cve#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Czk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Czk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Czk build() {
            return new Czk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Czk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Czk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Djf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Djf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Djf build() {
            return new Djf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Djf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Djf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Dkk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Dkk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dkk build() {
            return new Dkk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dkk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dkk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Dop {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Dop(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dop build() {
            return new Dop(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Dzd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Dzd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Dzd build() {
            return new Dzd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Dzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Egp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Egp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Egp build() {
            return new Egp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Egp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Egp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Etb {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Etb(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Etb build() {
            return new Etb(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Etb#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Etb#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Eur {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Eur(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Eur build() {
            return new Eur(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Eur#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Eur#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Fjd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Fjd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Fjd build() {
            return new Fjd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Fjd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Fjd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Fkp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Fkp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Fkp build() {
            return new Fkp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Fkp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Fkp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gbp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gbp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gbp build() {
            return new Gbp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gbp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gbp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gel {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gel(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gel build() {
            return new Gel(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gel#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gel#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ghs {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ghs(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ghs build() {
            return new Ghs(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ghs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ghs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gip {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gip(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gip build() {
            return new Gip(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gip#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gip#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gmd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gmd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gmd build() {
            return new Gmd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gnf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gnf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gnf build() {
            return new Gnf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gnf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gnf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gtq {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gtq(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gtq build() {
            return new Gtq(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gtq#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gtq#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Gyd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Gyd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Gyd build() {
            return new Gyd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gyd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Gyd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Hkd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Hkd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hkd build() {
            return new Hkd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hkd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hkd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Hnl {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Hnl(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hnl build() {
            return new Hnl(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hnl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hnl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Hrk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Hrk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Hrk build() {
            return new Hrk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hrk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Hrk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Htg {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Htg(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Htg build() {
            return new Htg(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Htg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Htg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Huf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Huf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Huf build() {
            return new Huf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Huf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Huf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Idr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Idr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Idr build() {
            return new Idr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Idr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Idr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ils {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ils(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ils build() {
            return new Ils(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ils#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ils#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Inr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Inr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Inr build() {
            return new Inr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Inr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Inr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Isk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Isk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Isk build() {
            return new Isk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Isk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Isk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Jmd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Jmd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jmd build() {
            return new Jmd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jmd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jmd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Jod {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Jod(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jod build() {
            return new Jod(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jod#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jod#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Jpy {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Jpy(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Jpy build() {
            return new Jpy(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jpy#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Jpy#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kes {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kes(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kes build() {
            return new Kes(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kes#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kes#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kgs {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kgs(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kgs build() {
            return new Kgs(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kgs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kgs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Khr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Khr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Khr build() {
            return new Khr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Khr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Khr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kmf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kmf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kmf build() {
            return new Kmf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kmf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kmf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Krw {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Krw(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Krw build() {
            return new Krw(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Krw#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Krw#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kwd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kwd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kwd build() {
            return new Kwd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kwd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kwd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kyd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kyd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kyd build() {
            return new Kyd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kyd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kyd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Kzt {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Kzt(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Kzt build() {
            return new Kzt(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kzt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Kzt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Lak {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Lak(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lak build() {
            return new Lak(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lak#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lak#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Lbp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Lbp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lbp build() {
            return new Lbp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lbp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lbp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Lkr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Lkr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lkr build() {
            return new Lkr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lkr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lkr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Lrd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Lrd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lrd build() {
            return new Lrd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lrd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lrd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Lsl {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Lsl(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Lsl build() {
            return new Lsl(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lsl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Lsl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mad {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mad(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mad build() {
            return new Mad(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mdl {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mdl(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mdl build() {
            return new Mdl(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mdl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mdl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mga {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mga(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mga build() {
            return new Mga(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mga#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mga#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mkd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mkd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mkd build() {
            return new Mkd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mkd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mkd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mmk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mmk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mmk build() {
            return new Mmk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mmk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mmk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mnt {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mnt(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mnt build() {
            return new Mnt(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mnt#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mnt#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mop {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mop(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mop build() {
            return new Mop(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mop#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mop#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mro {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mro(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mro build() {
            return new Mro(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mro#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mro#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mur {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mur(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mur build() {
            return new Mur(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mur#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mur#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mvr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mvr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mvr build() {
            return new Mvr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mvr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mvr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mwk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mwk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mwk build() {
            return new Mwk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mwk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mwk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mxn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mxn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mxn build() {
            return new Mxn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mxn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mxn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Myr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Myr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Myr build() {
            return new Myr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Myr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Myr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Mzn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Mzn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Mzn build() {
            return new Mzn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mzn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Mzn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Nad {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Nad(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nad build() {
            return new Nad(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nad#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nad#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ngn {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ngn(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ngn build() {
            return new Ngn(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ngn#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ngn#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Nio {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Nio(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nio build() {
            return new Nio(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nio#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nio#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Nok {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Nok(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nok build() {
            return new Nok(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nok#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nok#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Npr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Npr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Npr build() {
            return new Npr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Npr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Npr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Nzd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Nzd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Nzd build() {
            return new Nzd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nzd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Nzd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Omr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Omr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Omr build() {
            return new Omr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Omr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Omr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pab {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pab(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pab build() {
            return new Pab(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pab#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pab#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pen {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pen(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pen build() {
            return new Pen(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pen#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pen#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pgk {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pgk(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pgk build() {
            return new Pgk(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pgk#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pgk#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Php {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Php(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Php build() {
            return new Php(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Php#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Php#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pkr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pkr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pkr build() {
            return new Pkr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pkr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pkr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pln {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pln(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pln build() {
            return new Pln(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pln#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pln#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Pyg {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Pyg(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Pyg build() {
            return new Pyg(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pyg#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Pyg#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Qar {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Qar(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Qar build() {
            return new Qar(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Qar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Qar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ron {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ron(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ron build() {
            return new Ron(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ron#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ron#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Rsd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Rsd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rsd build() {
            return new Rsd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rsd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rsd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Rub {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Rub(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rub build() {
            return new Rub(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rub#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rub#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Rwf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Rwf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Rwf build() {
            return new Rwf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rwf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Rwf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sar {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sar(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sar build() {
            return new Sar(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sbd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sbd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sbd build() {
            return new Sbd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sbd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sbd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Scr {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Scr(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Scr build() {
            return new Scr(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Scr#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Scr#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sek {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sek(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sek build() {
            return new Sek(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sek#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sek#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sgd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sgd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sgd build() {
            return new Sgd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sgd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sgd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Shp {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Shp(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Shp build() {
            return new Shp(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Shp#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Shp#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sll {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sll(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sll build() {
            return new Sll(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sll#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sll#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Sos {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Sos(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Sos build() {
            return new Sos(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sos#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Sos#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Srd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Srd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Srd build() {
            return new Srd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Srd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Srd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Std {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Std(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Std build() {
            return new Std(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Std#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Std#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Szl {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Szl(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Szl build() {
            return new Szl(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Szl#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Szl#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Thb {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Thb(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Thb build() {
            return new Thb(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Thb#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Thb#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Tjs {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Tjs(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tjs build() {
            return new Tjs(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tjs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tjs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Tnd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Tnd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tnd build() {
            return new Tnd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Top {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Top(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Top build() {
            return new Top(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Top#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Top#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Try {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Try(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Try build() {
            return new Try(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Try#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Try#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ttd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ttd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ttd build() {
            return new Ttd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ttd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ttd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Twd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Twd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Twd build() {
            return new Twd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Twd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Twd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Tzs {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Tzs(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Tzs build() {
            return new Tzs(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tzs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Tzs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Uah {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Uah(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uah build() {
            return new Uah(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uah#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uah#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Ugx {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Ugx(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Ugx build() {
            return new Ugx(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ugx#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Ugx#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Usd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Usd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Usd build() {
            return new Usd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Usd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Usd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Usdc {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Usdc(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Usdc build() {
            return new Usdc(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Usdc#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Usdc#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Uyu {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Uyu(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uyu build() {
            return new Uyu(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uyu#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uyu#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Uzs {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Uzs(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Uzs build() {
            return new Uzs(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uzs#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Uzs#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Vnd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Vnd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Vnd build() {
            return new Vnd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Vnd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Vnd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Vuv {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Vuv(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Vuv build() {
            return new Vuv(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Vuv#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Vuv#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Wst {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Wst(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Wst build() {
            return new Wst(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Wst#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Wst#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Xaf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Xaf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xaf build() {
            return new Xaf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xaf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xaf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Xcd {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Xcd(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xcd build() {
            return new Xcd(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xcd#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xcd#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Xof {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Xof(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xof build() {
            return new Xof(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xof#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xof#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Xpf {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Xpf(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Xpf build() {
            return new Xpf(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xpf#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Xpf#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Yer {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Yer(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Yer build() {
            return new Yer(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Yer#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Yer#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Zar {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Zar(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Zar build() {
            return new Zar(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Zar#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Zar#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
      @Getter
      public static class Zmw {
        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        private Zmw(Map<String, Object> extraParams, Long minimumAmount) {
          this.extraParams = extraParams;
          this.minimumAmount = minimumAmount;
        }
        public static Builder builder() {
          return new Builder();
        }
        public static class Builder {
          private Map<String, Object> extraParams;

          private Long minimumAmount;

          /**
           * Finalize and obtain parameter instance from this builder.
           */
          public Zmw build() {
            return new Zmw(this.extraParams, this.minimumAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Zmw#extraParams} for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link PromotionCodeCreateParams.Restrictions.CurrencyOptions.Zmw#extraParams} for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }
        }
      }
    }
  }
}