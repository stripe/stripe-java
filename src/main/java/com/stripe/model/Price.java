// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PriceCreateParams;
import com.stripe.param.PriceListParams;
import com.stripe.param.PriceRetrieveParams;
import com.stripe.param.PriceSearchParams;
import com.stripe.param.PriceUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Price extends ApiResource implements HasId, MetadataStore<Price> {
  /**
   * Whether the price can be used for new purchases.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * Describes how to compute the price per period. Either {@code per_unit} or {@code tiered}. {@code per_unit} indicates that the fixed amount (specified in {@code unit_amount} or {@code unit_amount_decimal}) will be charged per unit in {@code quantity} (for prices with {@code usage_type=licensed}), or per unit of total usage (for prices with {@code usage_type=metered}). {@code tiered} indicates that the unit pricing will be computed using a tiering strategy as defined using the {@code tiers} and {@code tiers_mode} attributes.
   *
   * <p>One of {@code per_unit}, or {@code tiered}.
   */
  @SerializedName("billing_scheme")
  String billingScheme;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  @SerializedName("currency_options")
  CurrencyOptions currencyOptions;

  /**
   * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment Links.
   */
  @SerializedName("custom_unit_amount")
  CustomUnitAmount customUnitAmount;

  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;

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
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * A brief description of the price, hidden from customers.
   */
  @SerializedName("nickname")
  String nickname;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code price}.
   */
  @SerializedName("object")
  String object;

  /**
   * The ID of the product this price is associated with.
   */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /**
   * The recurring components of a price such as {@code interval} and {@code usage_type}.
   */
  @SerializedName("recurring")
  Recurring recurring;

  /**
   * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code exclusive}, it cannot be changed.
   */
  @SerializedName("tax_behavior")
  String taxBehavior;

  /**
   * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be set to {@code tiered}. See also the documentation for {@code billing_scheme}.
   */
  @SerializedName("tiers")
  List<Price.Tier> tiers;

  /**
   * Defines if the tiering price should be {@code graduated} or {@code volume} based. In {@code volume}-based tiering, the maximum quantity within a period determines the per unit price. In {@code graduated} tiering, pricing can change as the quantity grows.
   *
   * <p>One of {@code graduated}, or {@code volume}.
   */
  @SerializedName("tiers_mode")
  String tiersMode;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined with {@code tiers}.
   */
  @SerializedName("transform_quantity")
  TransformQuantity transformQuantity;

  /**
   * One of {@code one_time} or {@code recurring} depending on whether the price is for a one-time purchase or a recurring (subscription) purchase.
   */
  @SerializedName("type")
  String type;

  /**
   * The unit amount in %s to be charged, represented as a whole integer if possible. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * The unit amount in %s to be charged, represented as a decimal string with at most 12 decimal places. Only set if {@code billing_scheme=per_unit}.
   */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  /**
   * Get ID of expandable {@code product} object.
   */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /**
   * Get expanded {@code product}.
   */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /**
   * <p>Search for prices you’ve previously created using Stripe’s <a href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   */
  public static PriceSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * <p>Search for prices you’ve previously created using Stripe’s <a href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   */
  public static PriceSearchResult search(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices/search");
    return ApiResource.requestSearchResult(url, params, PriceSearchResult.class, options);
  }

  /**
   * <p>Search for prices you’ve previously created using Stripe’s <a href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   */
  public static PriceSearchResult search(PriceSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * <p>Search for prices you’ve previously created using Stripe’s <a href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   */
  public static PriceSearchResult search(
      PriceSearchParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices/search");
    return ApiResource.requestSearchResult(url, params, PriceSearchResult.class, options);
  }

  /**
   * <p>Returns a list of your prices.</p>
   */
  public static PriceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your prices.</p>
   */
  public static PriceCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices");
    return ApiResource.requestCollection(url, params, PriceCollection.class, options);
  }

  /**
   * <p>Returns a list of your prices.</p>
   */
  public static PriceCollection list(PriceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your prices.</p>
   */
  public static PriceCollection list(
      PriceListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices");
    return ApiResource.requestCollection(url, params, PriceCollection.class, options);
  }

  /**
   * <p>Creates a new price for an existing product. The price can be recurring or one-time.</p>
   */
  public static Price create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new price for an existing product. The price can be recurring or one-time.</p>
   */
  public static Price create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Price.class, options);
  }

  /**
   * <p>Creates a new price for an existing product. The price can be recurring or one-time.</p>
   */
  public static Price create(PriceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new price for an existing product. The price can be recurring or one-time.</p>
   */
  public static Price create(
      PriceCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/prices");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Price.class, options);
  }

  /**
   * <p>Retrieves the price with the given ID.</p>
   */
  public static Price retrieve(String price) throws StripeException {
    return retrieve(price, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves the price with the given ID.</p>
   */
  public static Price retrieve(String price, RequestOptions options) throws StripeException {
    return retrieve(price, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves the price with the given ID.</p>
   */
  public static Price retrieve(
      String price,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/prices/%s", ApiResource.urlEncodeId(price))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Price.class, options);
  }

  /**
   * <p>Retrieves the price with the given ID.</p>
   */
  public static Price retrieve(
      String price,
      PriceRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/prices/%s", ApiResource.urlEncodeId(price))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Price.class, options);
  }

  /**
   * <p>Updates the specified price by setting the values of the parameters passed. Any parameters not provided are left unchanged.</p>
   */
  @Override
  public Price update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the specified price by setting the values of the parameters passed. Any parameters not provided are left unchanged.</p>
   */
  @Override
  public Price update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/prices/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Price.class, options);
  }

  /**
   * <p>Updates the specified price by setting the values of the parameters passed. Any parameters not provided are left unchanged.</p>
   */
  public Price update(PriceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * <p>Updates the specified price by setting the values of the parameters passed. Any parameters not provided are left unchanged.</p>
   */
  public Price update(PriceUpdateParams params, RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/prices/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Price.class, options);
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
       * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment Links.
       */
      @SerializedName("custom_unit_amount")
      CustomUnitAmount customUnitAmount;

      /**
       * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      String taxBehavior;

      /**
       * Each element represents a pricing tier. This parameter requires {@code billing_scheme} to be set to {@code tiered}. See also the documentation for {@code billing_scheme}.
       */
      @SerializedName("tiers")
      List<Price.Tier> tiers;

      /**
       * The unit amount in %s to be charged, represented as a whole integer if possible. Only set if {@code billing_scheme=per_unit}.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * The unit amount in %s to be charged, represented as a decimal string with at most 12 decimal places. Only set if {@code billing_scheme=per_unit}.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomUnitAmount extends StripeObject {
    /**
     * The maximum unit amount the customer can specify for this item.
     */
    @SerializedName("maximum")
    Long maximum;

    /**
     * The minimum unit amount the customer can specify for this item. Must be at least the minimum charge amount.
     */
    @SerializedName("minimum")
    Long minimum;

    /**
     * The starting unit amount which can be updated by the customer.
     */
    @SerializedName("preset")
    Long preset;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Recurring extends StripeObject {
    /**
     * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed values are {@code sum} for summing up all usage during a period, {@code last_during_period} for using the last usage record reported within a period, {@code last_ever} for using the last usage record ever (across period bounds) or {@code max} which uses the usage record with the maximum reported usage during a period. Defaults to {@code sum}.
     *
     * <p>One of {@code last_during_period}, {@code last_ever}, {@code max}, or {@code sum}.
     */
    @SerializedName("aggregate_usage")
    String aggregateUsage;

    /**
     * The frequency at which a subscription is billed. One of {@code day}, {@code week}, {@code month} or {@code year}.
     */
    @SerializedName("interval")
    String interval;

    /**
     * The number of intervals (specified in the {@code interval} attribute) between subscription billings. For example, {@code interval=month} and {@code interval_count=3} bills every 3 months.
     */
    @SerializedName("interval_count")
    Long intervalCount;

    /**
     * Default number of trial days when subscribing a customer to this price using <a href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code trial_from_plan=true}</a>.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    /**
     * Configures how the quantity per period should be determined. Can be either {@code metered} or {@code licensed}. {@code licensed} automatically bills the {@code quantity} set when adding it to a subscription. {@code metered} aggregates the total usage based on usage records. Defaults to {@code licensed}.
     */
    @SerializedName("usage_type")
    String usageType;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tier extends StripeObject {
    /**
     * Price for the entire tier.
     */
    @SerializedName("flat_amount")
    Long flatAmount;

    /**
     * Same as {@code flat_amount}, but contains a decimal value with at most 12 decimal places.
     */
    @SerializedName("flat_amount_decimal")
    BigDecimal flatAmountDecimal;

    /**
     * Per unit price for units relevant to the tier.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but contains a decimal value with at most 12 decimal places.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /**
     * Up to and including to this quantity will be contained in the tier.
     */
    @SerializedName("up_to")
    Long upTo;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransformQuantity extends StripeObject {
    /**
     * Divide usage by this number.
     */
    @SerializedName("divide_by")
    Long divideBy;

    /**
     * After division, either round the result {@code up} or {@code down}.
     *
     * <p>One of {@code down}, or {@code up}.
     */
    @SerializedName("round")
    String round;
  }
}