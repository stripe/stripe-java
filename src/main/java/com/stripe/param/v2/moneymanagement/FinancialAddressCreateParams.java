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
public class FinancialAddressCreateParams extends ApiRequestParams {
  /** Properties needed to create a FinancialAddress for an FA with USDC currency. */
  @SerializedName("crypto_properties")
  CryptoProperties cryptoProperties;

  /**
   * <strong>Required.</strong> Open Enum. The currency the FinancialAddress should support.
   * Currently, only the {@code usd} and {@code gbp} values are supported.
   */
  @SerializedName("currency")
  Currency currency;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
   * associated with.
   */
  @SerializedName("financial_account")
  String financialAccount;

  private FinancialAddressCreateParams(
      CryptoProperties cryptoProperties,
      Currency currency,
      Map<String, Object> extraParams,
      String financialAccount) {
    this.cryptoProperties = cryptoProperties;
    this.currency = currency;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CryptoProperties cryptoProperties;

    private Currency currency;

    private Map<String, Object> extraParams;

    private String financialAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAddressCreateParams build() {
      return new FinancialAddressCreateParams(
          this.cryptoProperties, this.currency, this.extraParams, this.financialAccount);
    }

    /** Properties needed to create a FinancialAddress for an FA with USDC currency. */
    public Builder setCryptoProperties(
        FinancialAddressCreateParams.CryptoProperties cryptoProperties) {
      this.cryptoProperties = cryptoProperties;
      return this;
    }

    /**
     * <strong>Required.</strong> Open Enum. The currency the FinancialAddress should support.
     * Currently, only the {@code usd} and {@code gbp} values are supported.
     */
    public Builder setCurrency(FinancialAddressCreateParams.Currency currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAddressCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAddressCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The ID of the FinancialAccount the new FinancialAddress should be
     * associated with.
     */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoProperties {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The blockchain network of the crypto wallet. */
    @SerializedName("network")
    Network network;

    private CryptoProperties(Map<String, Object> extraParams, Network network) {
      this.extraParams = extraParams;
      this.network = network;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Network network;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAddressCreateParams.CryptoProperties build() {
        return new FinancialAddressCreateParams.CryptoProperties(this.extraParams, this.network);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAddressCreateParams.CryptoProperties#extraParams} for the field documentation.
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
       * See {@link FinancialAddressCreateParams.CryptoProperties#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The blockchain network of the crypto wallet. */
      public Builder setNetwork(FinancialAddressCreateParams.CryptoProperties.Network network) {
        this.network = network;
        return this;
      }
    }

    public enum Network implements ApiRequestParams.EnumParam {
      @SerializedName("arbitrum")
      ARBITRUM("arbitrum"),

      @SerializedName("avalanche_c_chain")
      AVALANCHE_C_CHAIN("avalanche_c_chain"),

      @SerializedName("base")
      BASE("base"),

      @SerializedName("ethereum")
      ETHEREUM("ethereum"),

      @SerializedName("optimism")
      OPTIMISM("optimism"),

      @SerializedName("polygon")
      POLYGON("polygon"),

      @SerializedName("solana")
      SOLANA("solana"),

      @SerializedName("stellar")
      STELLAR("stellar");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Network(String value) {
        this.value = value;
      }
    }
  }

  public enum Currency implements ApiRequestParams.EnumParam {
    @SerializedName("aed")
    AED("aed"),

    @SerializedName("afn")
    AFN("afn"),

    @SerializedName("all")
    ALL("all"),

    @SerializedName("amd")
    AMD("amd"),

    @SerializedName("ang")
    ANG("ang"),

    @SerializedName("aoa")
    AOA("aoa"),

    @SerializedName("ars")
    ARS("ars"),

    @SerializedName("aud")
    AUD("aud"),

    @SerializedName("awg")
    AWG("awg"),

    @SerializedName("azn")
    AZN("azn"),

    @SerializedName("bam")
    BAM("bam"),

    @SerializedName("bbd")
    BBD("bbd"),

    @SerializedName("bdt")
    BDT("bdt"),

    @SerializedName("bgn")
    BGN("bgn"),

    @SerializedName("bhd")
    BHD("bhd"),

    @SerializedName("bif")
    BIF("bif"),

    @SerializedName("bmd")
    BMD("bmd"),

    @SerializedName("bnd")
    BND("bnd"),

    @SerializedName("bob")
    BOB("bob"),

    @SerializedName("bov")
    BOV("bov"),

    @SerializedName("brl")
    BRL("brl"),

    @SerializedName("bsd")
    BSD("bsd"),

    @SerializedName("btn")
    BTN("btn"),

    @SerializedName("bwp")
    BWP("bwp"),

    @SerializedName("byn")
    BYN("byn"),

    @SerializedName("byr")
    BYR("byr"),

    @SerializedName("bzd")
    BZD("bzd"),

    @SerializedName("cad")
    CAD("cad"),

    @SerializedName("cdf")
    CDF("cdf"),

    @SerializedName("che")
    CHE("che"),

    @SerializedName("chf")
    CHF("chf"),

    @SerializedName("chw")
    CHW("chw"),

    @SerializedName("clf")
    CLF("clf"),

    @SerializedName("clp")
    CLP("clp"),

    @SerializedName("cny")
    CNY("cny"),

    @SerializedName("cop")
    COP("cop"),

    @SerializedName("cou")
    COU("cou"),

    @SerializedName("crc")
    CRC("crc"),

    @SerializedName("cuc")
    CUC("cuc"),

    @SerializedName("cup")
    CUP("cup"),

    @SerializedName("cve")
    CVE("cve"),

    @SerializedName("czk")
    CZK("czk"),

    @SerializedName("djf")
    DJF("djf"),

    @SerializedName("dkk")
    DKK("dkk"),

    @SerializedName("dop")
    DOP("dop"),

    @SerializedName("dzd")
    DZD("dzd"),

    @SerializedName("eek")
    EEK("eek"),

    @SerializedName("egp")
    EGP("egp"),

    @SerializedName("ern")
    ERN("ern"),

    @SerializedName("etb")
    ETB("etb"),

    @SerializedName("eur")
    EUR("eur"),

    @SerializedName("fjd")
    FJD("fjd"),

    @SerializedName("fkp")
    FKP("fkp"),

    @SerializedName("gbp")
    GBP("gbp"),

    @SerializedName("gel")
    GEL("gel"),

    @SerializedName("ghc")
    GHC("ghc"),

    @SerializedName("ghs")
    GHS("ghs"),

    @SerializedName("gip")
    GIP("gip"),

    @SerializedName("gmd")
    GMD("gmd"),

    @SerializedName("gnf")
    GNF("gnf"),

    @SerializedName("gtq")
    GTQ("gtq"),

    @SerializedName("gyd")
    GYD("gyd"),

    @SerializedName("hkd")
    HKD("hkd"),

    @SerializedName("hnl")
    HNL("hnl"),

    @SerializedName("hrk")
    HRK("hrk"),

    @SerializedName("htg")
    HTG("htg"),

    @SerializedName("huf")
    HUF("huf"),

    @SerializedName("idr")
    IDR("idr"),

    @SerializedName("ils")
    ILS("ils"),

    @SerializedName("inr")
    INR("inr"),

    @SerializedName("iqd")
    IQD("iqd"),

    @SerializedName("irr")
    IRR("irr"),

    @SerializedName("isk")
    ISK("isk"),

    @SerializedName("jmd")
    JMD("jmd"),

    @SerializedName("jod")
    JOD("jod"),

    @SerializedName("jpy")
    JPY("jpy"),

    @SerializedName("kes")
    KES("kes"),

    @SerializedName("kgs")
    KGS("kgs"),

    @SerializedName("khr")
    KHR("khr"),

    @SerializedName("kmf")
    KMF("kmf"),

    @SerializedName("kpw")
    KPW("kpw"),

    @SerializedName("krw")
    KRW("krw"),

    @SerializedName("kwd")
    KWD("kwd"),

    @SerializedName("kyd")
    KYD("kyd"),

    @SerializedName("kzt")
    KZT("kzt"),

    @SerializedName("lak")
    LAK("lak"),

    @SerializedName("lbp")
    LBP("lbp"),

    @SerializedName("lkr")
    LKR("lkr"),

    @SerializedName("lrd")
    LRD("lrd"),

    @SerializedName("lsl")
    LSL("lsl"),

    @SerializedName("ltl")
    LTL("ltl"),

    @SerializedName("lvl")
    LVL("lvl"),

    @SerializedName("lyd")
    LYD("lyd"),

    @SerializedName("mad")
    MAD("mad"),

    @SerializedName("mdl")
    MDL("mdl"),

    @SerializedName("mga")
    MGA("mga"),

    @SerializedName("mkd")
    MKD("mkd"),

    @SerializedName("mmk")
    MMK("mmk"),

    @SerializedName("mnt")
    MNT("mnt"),

    @SerializedName("mop")
    MOP("mop"),

    @SerializedName("mro")
    MRO("mro"),

    @SerializedName("mru")
    MRU("mru"),

    @SerializedName("mur")
    MUR("mur"),

    @SerializedName("mvr")
    MVR("mvr"),

    @SerializedName("mwk")
    MWK("mwk"),

    @SerializedName("mxn")
    MXN("mxn"),

    @SerializedName("mxv")
    MXV("mxv"),

    @SerializedName("myr")
    MYR("myr"),

    @SerializedName("mzn")
    MZN("mzn"),

    @SerializedName("nad")
    NAD("nad"),

    @SerializedName("ngn")
    NGN("ngn"),

    @SerializedName("nio")
    NIO("nio"),

    @SerializedName("nok")
    NOK("nok"),

    @SerializedName("npr")
    NPR("npr"),

    @SerializedName("nzd")
    NZD("nzd"),

    @SerializedName("omr")
    OMR("omr"),

    @SerializedName("pab")
    PAB("pab"),

    @SerializedName("pen")
    PEN("pen"),

    @SerializedName("pgk")
    PGK("pgk"),

    @SerializedName("php")
    PHP("php"),

    @SerializedName("pkr")
    PKR("pkr"),

    @SerializedName("pln")
    PLN("pln"),

    @SerializedName("pyg")
    PYG("pyg"),

    @SerializedName("qar")
    QAR("qar"),

    @SerializedName("ron")
    RON("ron"),

    @SerializedName("rsd")
    RSD("rsd"),

    @SerializedName("rub")
    RUB("rub"),

    @SerializedName("rwf")
    RWF("rwf"),

    @SerializedName("sar")
    SAR("sar"),

    @SerializedName("sbd")
    SBD("sbd"),

    @SerializedName("scr")
    SCR("scr"),

    @SerializedName("sdg")
    SDG("sdg"),

    @SerializedName("sek")
    SEK("sek"),

    @SerializedName("sgd")
    SGD("sgd"),

    @SerializedName("shp")
    SHP("shp"),

    @SerializedName("sle")
    SLE("sle"),

    @SerializedName("sll")
    SLL("sll"),

    @SerializedName("sos")
    SOS("sos"),

    @SerializedName("srd")
    SRD("srd"),

    @SerializedName("ssp")
    SSP("ssp"),

    @SerializedName("std")
    STD("std"),

    @SerializedName("stn")
    STN("stn"),

    @SerializedName("svc")
    SVC("svc"),

    @SerializedName("syp")
    SYP("syp"),

    @SerializedName("szl")
    SZL("szl"),

    @SerializedName("thb")
    THB("thb"),

    @SerializedName("tjs")
    TJS("tjs"),

    @SerializedName("tmt")
    TMT("tmt"),

    @SerializedName("tnd")
    TND("tnd"),

    @SerializedName("top")
    TOP("top"),

    @SerializedName("try")
    TRY("try"),

    @SerializedName("ttd")
    TTD("ttd"),

    @SerializedName("twd")
    TWD("twd"),

    @SerializedName("tzs")
    TZS("tzs"),

    @SerializedName("uah")
    UAH("uah"),

    @SerializedName("ugx")
    UGX("ugx"),

    @SerializedName("usd")
    USD("usd"),

    @SerializedName("usdb")
    USDB("usdb"),

    @SerializedName("usdc")
    USDC("usdc"),

    @SerializedName("usn")
    USN("usn"),

    @SerializedName("uyi")
    UYI("uyi"),

    @SerializedName("uyu")
    UYU("uyu"),

    @SerializedName("uzs")
    UZS("uzs"),

    @SerializedName("vef")
    VEF("vef"),

    @SerializedName("ves")
    VES("ves"),

    @SerializedName("vnd")
    VND("vnd"),

    @SerializedName("vuv")
    VUV("vuv"),

    @SerializedName("wst")
    WST("wst"),

    @SerializedName("xaf")
    XAF("xaf"),

    @SerializedName("xcd")
    XCD("xcd"),

    @SerializedName("xcg")
    XCG("xcg"),

    @SerializedName("xof")
    XOF("xof"),

    @SerializedName("xpf")
    XPF("xpf"),

    @SerializedName("yer")
    YER("yer"),

    @SerializedName("zar")
    ZAR("zar"),

    @SerializedName("zmk")
    ZMK("zmk"),

    @SerializedName("zmw")
    ZMW("zmw"),

    @SerializedName("zwd")
    ZWD("zwd"),

    @SerializedName("zwg")
    ZWG("zwg"),

    @SerializedName("zwl")
    ZWL("zwl");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Currency(String value) {
      this.value = value;
    }
  }
}
