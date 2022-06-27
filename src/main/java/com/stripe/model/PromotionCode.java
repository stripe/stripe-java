// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PromotionCodeCreateParams;
import com.stripe.param.PromotionCodeListParams;
import com.stripe.param.PromotionCodeRetrieveParams;
import com.stripe.param.PromotionCodeUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PromotionCode extends ApiResource implements HasId, MetadataStore<PromotionCode> {
  /**
   * Whether the promotion code is currently active. A promotion code is only active if the coupon is also valid.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for each customer.
   */
  @SerializedName("code")
  String code;

  /**
   * A coupon contains information about a percent-off or amount-off discount you might want to apply to a customer. Coupons may be applied to <a href="https://stripe.com/docs/api#subscriptions">subscriptions</a>, <a href="https://stripe.com/docs/api#invoices">invoices</a>, <a href="https://stripe.com/docs/api/checkout/sessions">checkout sessions</a>, <a href="https://stripe.com/docs/api#quotes">quotes</a>, and more. Coupons do not work with conventional one-off <a href="https://stripe.com/docs/api#create_charge">charges</a> or <a href="https://stripe.com/docs/api/payment_intents">payment intents</a>.
   */
  @SerializedName("coupon")
  Coupon coupon;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * The customer that this promotion code can be used by.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * Date at which the promotion code can no longer be redeemed.
   */
  @SerializedName("expires_at")
  Long expiresAt;

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
   * Maximum number of times this promotion code can be redeemed.
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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code promotion_code}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("restrictions")
  Restrictions restrictions;

  /**
   * Number of times this promotion code has been used.
   */
  @SerializedName("times_redeemed")
  Long timesRedeemed;

  /**
   * Get ID of expandable {@code customer} object.
   */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /**
   * Get expanded {@code customer}.
   */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /**
   * <p>Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the customer-facing <code>code</code> use <a href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired <code>code</code>.</p>
   */
  public static PromotionCode retrieve(String promotionCode) throws StripeException {
    return retrieve(promotionCode, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the customer-facing <code>code</code> use <a href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired <code>code</code>.</p>
   */
  public static PromotionCode retrieve(
      String promotionCode,
      RequestOptions options) throws StripeException {
    return retrieve(promotionCode, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the customer-facing <code>code</code> use <a href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired <code>code</code>.</p>
   */
  public static PromotionCode retrieve(
      String promotionCode,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the customer-facing <code>code</code> use <a href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired <code>code</code>.</p>
   */
  public static PromotionCode retrieve(
      String promotionCode,
      PromotionCodeRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>A promotion code points to a coupon. You can optionally restrict the code to a specific customer, redemption limit, and expiration date.</p>
   */
  public static PromotionCode create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>A promotion code points to a coupon. You can optionally restrict the code to a specific customer, redemption limit, and expiration date.</p>
   */
  public static PromotionCode create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/promotion_codes");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>A promotion code points to a coupon. You can optionally restrict the code to a specific customer, redemption limit, and expiration date.</p>
   */
  public static PromotionCode create(PromotionCodeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>A promotion code points to a coupon. You can optionally restrict the code to a specific customer, redemption limit, and expiration date.</p>
   */
  public static PromotionCode create(
      PromotionCodeCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/promotion_codes");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>Updates the specified promotion code by setting the values of the parameters passed. Most fields are, by design, not editable.</p>
   */
  @Override
  public PromotionCode update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the specified promotion code by setting the values of the parameters passed. Most fields are, by design, not editable.</p>
   */
  @Override
  public PromotionCode update(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>Updates the specified promotion code by setting the values of the parameters passed. Most fields are, by design, not editable.</p>
   */
  public PromotionCode update(PromotionCodeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the specified promotion code by setting the values of the parameters passed. Most fields are, by design, not editable.</p>
   */
  public PromotionCode update(
      PromotionCodeUpdateParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      PromotionCode.class,
      options
    );
  }

  /**
   * <p>Returns a list of your promotion codes.</p>
   */
  public static PromotionCodeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your promotion codes.</p>
   */
  public static PromotionCodeCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/promotion_codes");
    return ApiResource.requestCollection(url, params, PromotionCodeCollection.class, options);
  }

  /**
   * <p>Returns a list of your promotion codes.</p>
   */
  public static PromotionCodeCollection list(
      PromotionCodeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your promotion codes.</p>
   */
  public static PromotionCodeCollection list(
      PromotionCodeListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/promotion_codes");
    return ApiResource.requestCollection(url, params, PromotionCodeCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Restrictions extends StripeObject {
    @SerializedName("currency_options")
    CurrencyOptions currencyOptions;

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
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to work).
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;
      }
    }
  }
}