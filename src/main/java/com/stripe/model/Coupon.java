// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CouponCreateParams;
import com.stripe.param.CouponListParams;
import com.stripe.param.CouponRetrieveParams;
import com.stripe.param.CouponUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Coupon extends ApiResource implements HasId, MetadataStore<Coupon> {
  /**
   * Amount (in the {@code currency} specified) that will be taken off the subtotal of any invoices for this customer.
   */
  @SerializedName("amount_off")
  Long amountOff;

  @SerializedName("applies_to")
  AppliesTo appliesTo;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * If {@code amount_off} has been set, the three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> of the amount to take off.
   */
  @SerializedName("currency")
  String currency;

  @SerializedName("currency_options")
  CurrencyOptions currencyOptions;

  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * One of {@code forever}, {@code once}, and {@code repeating}. Describes how long a customer who applies this coupon will get the discount.
   */
  @SerializedName("duration")
  String duration;

  /**
   * If {@code duration} is {@code repeating}, the number of months the coupon applies. Null if coupon {@code duration} is {@code forever} or {@code once}.
   */
  @SerializedName("duration_in_months")
  Long durationInMonths;

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
   * Maximum number of times this coupon can be redeemed, in total, across all customers, before it is no longer valid.
   */
  @SerializedName("max_redemptions")
  Long maxRedemptions;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Name of the coupon displayed to customers on for instance invoices or receipts.
   */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code coupon}.
   */
  @SerializedName("object")
  String object;

  /**
   * Percent that will be taken off the subtotal of any invoices for this customer for the duration of the coupon. For example, a coupon with percent_off of 50 will make a %s100 invoice %s50 instead.
   */
  @SerializedName("percent_off")
  BigDecimal percentOff;

  /**
   * Date after which the coupon can no longer be redeemed.
   */
  @SerializedName("redeem_by")
  Long redeemBy;

  /**
   * Number of times this coupon has been applied to a customer.
   */
  @SerializedName("times_redeemed")
  Long timesRedeemed;

  /**
   * Taking account of the above properties, whether this coupon can still be applied to a customer.
   */
  @SerializedName("valid")
  Boolean valid;

  /**
   * <p>Returns a list of your coupons.</p>
   */
  public static CouponCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your coupons.</p>
   */
  public static CouponCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.requestCollection(url, params, CouponCollection.class, options);
  }

  /**
   * <p>Returns a list of your coupons.</p>
   */
  public static CouponCollection list(CouponListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your coupons.</p>
   */
  public static CouponCollection list(
      CouponListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.requestCollection(url, params, CouponCollection.class, options);
  }

  /**
   * <p>You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if you need to create coupons on the fly.</p>
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of 200 is applied to it.</p>
   */
  public static Coupon create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if you need to create coupons on the fly.</p>
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of 200 is applied to it.</p>
   */
  public static Coupon create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * <p>You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if you need to create coupons on the fly.</p>
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of 200 is applied to it.</p>
   */
  public static Coupon create(CouponCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if you need to create coupons on the fly.</p>
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>currency</code>. If you set an <code>amount_off</code>, that amount will be subtracted from any invoice’s subtotal. For example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an <code>amount_off</code> of 200 is applied to it and an invoice with a subtotal of 300 will have a final total of 100 if a coupon with an <code>amount_off</code> of 200 is applied to it.</p>
   */
  public static Coupon create(
      CouponCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/coupons");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * <p>Retrieves the coupon with the given ID.</p>
   */
  public static Coupon retrieve(String coupon) throws StripeException {
    return retrieve(coupon, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves the coupon with the given ID.</p>
   */
  public static Coupon retrieve(String coupon, RequestOptions options) throws StripeException {
    return retrieve(coupon, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves the coupon with the given ID.</p>
   */
  public static Coupon retrieve(
      String coupon,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Coupon.class, options);
  }

  /**
   * <p>Retrieves the coupon with the given ID.</p>
   */
  public static Coupon retrieve(
      String coupon,
      CouponRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Coupon.class, options);
  }

  /**
   * <p>Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.</p>
   */
  @Override
  public Coupon update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.</p>
   */
  @Override
  public Coupon update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * <p>Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.</p>
   */
  public Coupon update(CouponUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.</p>
   */
  public Coupon update(CouponUpdateParams params, RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Coupon.class, options);
  }

  /**
   * <p>You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any customers who have already applied the coupon; it means that new customers can’t redeem the coupon. You can also delete coupons via the API.</p>
   */
  public Coupon delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any customers who have already applied the coupon; it means that new customers can’t redeem the coupon. You can also delete coupons via the API.</p>
   */
  public Coupon delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * <p>You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any customers who have already applied the coupon; it means that new customers can’t redeem the coupon. You can also delete coupons via the API.</p>
   */
  public Coupon delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * <p>You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any customers who have already applied the coupon; it means that new customers can’t redeem the coupon. You can also delete coupons via the API.</p>
   */
  public Coupon delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/coupons/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.DELETE,
      url,
      params,
      Coupon.class,
      options
    );
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliesTo extends StripeObject {
    /**
     * A list of product IDs this coupon applies to.
     */
    @SerializedName("products")
    List<String> products;
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
       * Amount (in the {@code currency} specified) that will be taken off the subtotal of any invoices for this customer.
       */
      @SerializedName("amount_off")
      Long amountOff;
    }
  }
}