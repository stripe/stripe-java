// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ShippingRateCreateParams;
import com.stripe.param.ShippingRateListParams;
import com.stripe.param.ShippingRateRetrieveParams;
import com.stripe.param.ShippingRateUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ShippingRate extends ApiResource implements HasId, MetadataStore<ShippingRate> {
  /**
   * Whether the shipping rate can be used for new purchases. Defaults to {@code true}.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

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

  @SerializedName("fixed_amount")
  FixedAmount fixedAmount;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code shipping_rate}.
   */
  @SerializedName("object")
  String object;

  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /**
   * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax code is {@code txcd_92010001}.
   */
  @SerializedName("tax_code")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TaxCode> taxCode;

  /**
   * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for now.
   *
   * <p>Equal to {@code fixed_amount}.
   */
  @SerializedName("type")
  String type;

  /**
   * Get ID of expandable {@code taxCode} object.
   */
  public String getTaxCode() {
    return (this.taxCode != null) ? this.taxCode.getId() : null;
  }

  public void setTaxCode(String id) {
    this.taxCode = ApiResource.setExpandableFieldId(id, this.taxCode);
  }

  /**
   * Get expanded {@code taxCode}.
   */
  public TaxCode getTaxCodeObject() {
    return (this.taxCode != null) ? this.taxCode.getExpanded() : null;
  }

  public void setTaxCodeObject(TaxCode expandableObject) {
    this.taxCode = new ExpandableField<TaxCode>(expandableObject.getId(), expandableObject);
  }

  /**
   * <p>Returns a list of your shipping rates.</p>
   */
  public static ShippingRateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your shipping rates.</p>
   */
  public static ShippingRateCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.requestCollection(url, params, ShippingRateCollection.class, options);
  }

  /**
   * <p>Returns a list of your shipping rates.</p>
   */
  public static ShippingRateCollection list(ShippingRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your shipping rates.</p>
   */
  public static ShippingRateCollection list(
      ShippingRateListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.requestCollection(url, params, ShippingRateCollection.class, options);
  }

  /**
   * <p>Returns the shipping rate object with the given ID.</p>
   */
  public static ShippingRate retrieve(String shippingRateToken) throws StripeException {
    return retrieve(shippingRateToken, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Returns the shipping rate object with the given ID.</p>
   */
  public static ShippingRate retrieve(
      String shippingRateToken,
      RequestOptions options) throws StripeException {
    return retrieve(shippingRateToken, (Map<String, Object>) null, options);
  }

  /**
   * <p>Returns the shipping rate object with the given ID.</p>
   */
  public static ShippingRate retrieve(
      String shippingRateToken,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  /**
   * <p>Returns the shipping rate object with the given ID.</p>
   */
  public static ShippingRate retrieve(
      String shippingRateToken,
      ShippingRateRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(shippingRateToken))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  /**
   * <p>Creates a new shipping rate object.</p>
   */
  public static ShippingRate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new shipping rate object.</p>
   */
  public static ShippingRate create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  /**
   * <p>Creates a new shipping rate object.</p>
   */
  public static ShippingRate create(ShippingRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new shipping rate object.</p>
   */
  public static ShippingRate create(
      ShippingRateCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/shipping_rates");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  /**
   * <p>Updates an existing shipping rate object.</p>
   */
  @Override
  public ShippingRate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates an existing shipping rate object.</p>
   */
  @Override
  public ShippingRate update(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  /**
   * <p>Updates an existing shipping rate object.</p>
   */
  public ShippingRate update(ShippingRateUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates an existing shipping rate object.</p>
   */
  public ShippingRate update(
      ShippingRateUpdateParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/shipping_rates/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ShippingRate.class,
      options
    );
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyOptions extends StripeObject {
    @SerializedName("aed")
    CurrencyOption aed;

    @SerializedName("afn")
    CurrencyOption afn;

    @SerializedName("all")
    CurrencyOption all;

    @SerializedName("amd")
    CurrencyOption amd;

    @SerializedName("ang")
    CurrencyOption ang;

    @SerializedName("aoa")
    CurrencyOption aoa;

    @SerializedName("ars")
    CurrencyOption ars;

    @SerializedName("aud")
    CurrencyOption aud;

    @SerializedName("awg")
    CurrencyOption awg;

    @SerializedName("azn")
    CurrencyOption azn;

    @SerializedName("bam")
    CurrencyOption bam;

    @SerializedName("bbd")
    CurrencyOption bbd;

    @SerializedName("bdt")
    CurrencyOption bdt;

    @SerializedName("bgn")
    CurrencyOption bgn;

    @SerializedName("bhd")
    CurrencyOption bhd;

    @SerializedName("bif")
    CurrencyOption bif;

    @SerializedName("bmd")
    CurrencyOption bmd;

    @SerializedName("bnd")
    CurrencyOption bnd;

    @SerializedName("bob")
    CurrencyOption bob;

    @SerializedName("brl")
    CurrencyOption brl;

    @SerializedName("bsd")
    CurrencyOption bsd;

    @SerializedName("btn")
    CurrencyOption btn;

    @SerializedName("bwp")
    CurrencyOption bwp;

    @SerializedName("byn")
    CurrencyOption byn;

    @SerializedName("bzd")
    CurrencyOption bzd;

    @SerializedName("cad")
    CurrencyOption cad;

    @SerializedName("cdf")
    CurrencyOption cdf;

    @SerializedName("chf")
    CurrencyOption chf;

    @SerializedName("clp")
    CurrencyOption clp;

    @SerializedName("cny")
    CurrencyOption cny;

    @SerializedName("cop")
    CurrencyOption cop;

    @SerializedName("crc")
    CurrencyOption crc;

    @SerializedName("cve")
    CurrencyOption cve;

    @SerializedName("czk")
    CurrencyOption czk;

    @SerializedName("djf")
    CurrencyOption djf;

    @SerializedName("dkk")
    CurrencyOption dkk;

    @SerializedName("dop")
    CurrencyOption dop;

    @SerializedName("dzd")
    CurrencyOption dzd;

    @SerializedName("egp")
    CurrencyOption egp;

    @SerializedName("etb")
    CurrencyOption etb;

    @SerializedName("eur")
    CurrencyOption eur;

    @SerializedName("fjd")
    CurrencyOption fjd;

    @SerializedName("fkp")
    CurrencyOption fkp;

    @SerializedName("gbp")
    CurrencyOption gbp;

    @SerializedName("gel")
    CurrencyOption gel;

    @SerializedName("ghs")
    CurrencyOption ghs;

    @SerializedName("gip")
    CurrencyOption gip;

    @SerializedName("gmd")
    CurrencyOption gmd;

    @SerializedName("gnf")
    CurrencyOption gnf;

    @SerializedName("gtq")
    CurrencyOption gtq;

    @SerializedName("gyd")
    CurrencyOption gyd;

    @SerializedName("hkd")
    CurrencyOption hkd;

    @SerializedName("hnl")
    CurrencyOption hnl;

    @SerializedName("hrk")
    CurrencyOption hrk;

    @SerializedName("htg")
    CurrencyOption htg;

    @SerializedName("huf")
    CurrencyOption huf;

    @SerializedName("idr")
    CurrencyOption idr;

    @SerializedName("ils")
    CurrencyOption ils;

    @SerializedName("inr")
    CurrencyOption inr;

    @SerializedName("isk")
    CurrencyOption isk;

    @SerializedName("jmd")
    CurrencyOption jmd;

    @SerializedName("jod")
    CurrencyOption jod;

    @SerializedName("jpy")
    CurrencyOption jpy;

    @SerializedName("kes")
    CurrencyOption kes;

    @SerializedName("kgs")
    CurrencyOption kgs;

    @SerializedName("khr")
    CurrencyOption khr;

    @SerializedName("kmf")
    CurrencyOption kmf;

    @SerializedName("krw")
    CurrencyOption krw;

    @SerializedName("kwd")
    CurrencyOption kwd;

    @SerializedName("kyd")
    CurrencyOption kyd;

    @SerializedName("kzt")
    CurrencyOption kzt;

    @SerializedName("lak")
    CurrencyOption lak;

    @SerializedName("lbp")
    CurrencyOption lbp;

    @SerializedName("lkr")
    CurrencyOption lkr;

    @SerializedName("lrd")
    CurrencyOption lrd;

    @SerializedName("lsl")
    CurrencyOption lsl;

    @SerializedName("mad")
    CurrencyOption mad;

    @SerializedName("mdl")
    CurrencyOption mdl;

    @SerializedName("mga")
    CurrencyOption mga;

    @SerializedName("mkd")
    CurrencyOption mkd;

    @SerializedName("mmk")
    CurrencyOption mmk;

    @SerializedName("mnt")
    CurrencyOption mnt;

    @SerializedName("mop")
    CurrencyOption mop;

    @SerializedName("mro")
    CurrencyOption mro;

    @SerializedName("mur")
    CurrencyOption mur;

    @SerializedName("mvr")
    CurrencyOption mvr;

    @SerializedName("mwk")
    CurrencyOption mwk;

    @SerializedName("mxn")
    CurrencyOption mxn;

    @SerializedName("myr")
    CurrencyOption myr;

    @SerializedName("mzn")
    CurrencyOption mzn;

    @SerializedName("nad")
    CurrencyOption nad;

    @SerializedName("ngn")
    CurrencyOption ngn;

    @SerializedName("nio")
    CurrencyOption nio;

    @SerializedName("nok")
    CurrencyOption nok;

    @SerializedName("npr")
    CurrencyOption npr;

    @SerializedName("nzd")
    CurrencyOption nzd;

    @SerializedName("omr")
    CurrencyOption omr;

    @SerializedName("pab")
    CurrencyOption pab;

    @SerializedName("pen")
    CurrencyOption pen;

    @SerializedName("pgk")
    CurrencyOption pgk;

    @SerializedName("php")
    CurrencyOption php;

    @SerializedName("pkr")
    CurrencyOption pkr;

    @SerializedName("pln")
    CurrencyOption pln;

    @SerializedName("pyg")
    CurrencyOption pyg;

    @SerializedName("qar")
    CurrencyOption qar;

    @SerializedName("ron")
    CurrencyOption ron;

    @SerializedName("rsd")
    CurrencyOption rsd;

    @SerializedName("rub")
    CurrencyOption rub;

    @SerializedName("rwf")
    CurrencyOption rwf;

    @SerializedName("sar")
    CurrencyOption sar;

    @SerializedName("sbd")
    CurrencyOption sbd;

    @SerializedName("scr")
    CurrencyOption scr;

    @SerializedName("sek")
    CurrencyOption sek;

    @SerializedName("sgd")
    CurrencyOption sgd;

    @SerializedName("shp")
    CurrencyOption shp;

    @SerializedName("sll")
    CurrencyOption sll;

    @SerializedName("sos")
    CurrencyOption sos;

    @SerializedName("srd")
    CurrencyOption srd;

    @SerializedName("std")
    CurrencyOption std;

    @SerializedName("szl")
    CurrencyOption szl;

    @SerializedName("thb")
    CurrencyOption thb;

    @SerializedName("tjs")
    CurrencyOption tjs;

    @SerializedName("tnd")
    CurrencyOption tnd;

    @SerializedName("top")
    CurrencyOption top;

    @SerializedName("try")
    CurrencyOption try;

    @SerializedName("ttd")
    CurrencyOption ttd;

    @SerializedName("twd")
    CurrencyOption twd;

    @SerializedName("tzs")
    CurrencyOption tzs;

    @SerializedName("uah")
    CurrencyOption uah;

    @SerializedName("ugx")
    CurrencyOption ugx;

    @SerializedName("usd")
    CurrencyOption usd;

    @SerializedName("usdc")
    CurrencyOption usdc;

    @SerializedName("uyu")
    CurrencyOption uyu;

    @SerializedName("uzs")
    CurrencyOption uzs;

    @SerializedName("vnd")
    CurrencyOption vnd;

    @SerializedName("vuv")
    CurrencyOption vuv;

    @SerializedName("wst")
    CurrencyOption wst;

    @SerializedName("xaf")
    CurrencyOption xaf;

    @SerializedName("xcd")
    CurrencyOption xcd;

    @SerializedName("xof")
    CurrencyOption xof;

    @SerializedName("xpf")
    CurrencyOption xpf;

    @SerializedName("yer")
    CurrencyOption yer;

    @SerializedName("zar")
    CurrencyOption zar;

    @SerializedName("zmw")
    CurrencyOption zmw;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CurrencyOption extends StripeObject {
      /**
       * A non-negative integer in cents representing how much to charge.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      String taxBehavior;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryEstimate extends StripeObject {
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Maximum extends StripeObject {
      /**
       * A unit of time.
       *
       * <p>One of {@code business_day}, {@code day}, {@code hour}, {@code month}, or {@code week}.
       */
      @SerializedName("unit")
      String unit;

      /**
       * Must be greater than 0.
       */
      @SerializedName("value")
      Long value;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Minimum extends StripeObject {
      /**
       * A unit of time.
       *
       * <p>One of {@code business_day}, {@code day}, {@code hour}, {@code month}, or {@code week}.
       */
      @SerializedName("unit")
      String unit;

      /**
       * Must be greater than 0.
       */
      @SerializedName("value")
      Long value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FixedAmount extends StripeObject {
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

    @SerializedName("currency_options")
    CurrencyOptions currencyOptions;
  }
}