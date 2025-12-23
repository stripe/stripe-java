// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.RegistrationCreateParams;
import com.stripe.param.tax.RegistrationListParams;
import com.stripe.param.tax.RegistrationRetrieveParams;
import com.stripe.param.tax.RegistrationUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax {@code Registration} lets us know that your business is registered to collect tax on
 * payments within a region, enabling you to <a href="https://docs.stripe.com/tax">automatically
 * collect tax</a>.
 *
 * <p>Stripe doesn't register on your behalf with the relevant authorities when you create a Tax
 * {@code Registration} object. For more information on how to register to collect tax, see <a
 * href="https://docs.stripe.com/tax/registering">our guide</a>.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/tax/registrations-api">Using the Registrations
 * API</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Registration extends ApiResource implements HasId {
  /** Time at which the registration becomes active. Measured in seconds since the Unix epoch. */
  @SerializedName("active_from")
  Long activeFrom;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  @SerializedName("country_options")
  CountryOptions countryOptions;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * If set, the registration stops being active at this time. If not set, the registration will be
   * active indefinitely. Measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.registration}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the registration. This field is present for convenience and can be deduced from
   * {@code active_from} and {@code expires_at}.
   *
   * <p>One of {@code active}, {@code expired}, or {@code scheduled}.
   */
  @SerializedName("status")
  String status;

  /** Creates a new Tax {@code Registration} object. */
  public static Registration create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Tax {@code Registration} object. */
  public static Registration create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Registration.class);
  }

  /** Creates a new Tax {@code Registration} object. */
  public static Registration create(RegistrationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Tax {@code Registration} object. */
  public static Registration create(RegistrationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Registration.class);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RegistrationCollection.class);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(RegistrationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(RegistrationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RegistrationCollection.class);
  }

  /** Returns a Tax {@code Registration} object. */
  public static Registration retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Returns a Tax {@code Registration} object. */
  public static Registration retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Returns a Tax {@code Registration} object. */
  public static Registration retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Registration.class);
  }

  /** Returns a Tax {@code Registration} object. */
  public static Registration retrieve(
      String id, RegistrationRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Registration.class);
  }

  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Registration.class);
  }

  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(RegistrationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Tax {@code Registration} object.
   *
   * <p>A registration cannot be deleted after it has been created. If you wish to end a
   * registration you may do so by setting {@code expires_at}.
   */
  public Registration update(RegistrationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax/registrations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Registration.class);
  }

  /**
   * For more details about CountryOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CountryOptions extends StripeObject {
    @SerializedName("ae")
    Ae ae;

    @SerializedName("al")
    Al al;

    @SerializedName("am")
    Am am;

    @SerializedName("ao")
    Ao ao;

    @SerializedName("at")
    At at;

    @SerializedName("au")
    Au au;

    @SerializedName("aw")
    Aw aw;

    @SerializedName("az")
    Az az;

    @SerializedName("ba")
    Ba ba;

    @SerializedName("bb")
    Bb bb;

    @SerializedName("bd")
    Bd bd;

    @SerializedName("be")
    Be be;

    @SerializedName("bf")
    Bf bf;

    @SerializedName("bg")
    Bg bg;

    @SerializedName("bh")
    Bh bh;

    @SerializedName("bj")
    Bj bj;

    @SerializedName("bs")
    Bs bs;

    @SerializedName("by")
    By by;

    @SerializedName("ca")
    Ca ca;

    @SerializedName("cd")
    Cd cd;

    @SerializedName("ch")
    Ch ch;

    @SerializedName("cl")
    Cl cl;

    @SerializedName("cm")
    Cm cm;

    @SerializedName("co")
    Co co;

    @SerializedName("cr")
    Cr cr;

    @SerializedName("cv")
    Cv cv;

    @SerializedName("cy")
    Cy cy;

    @SerializedName("cz")
    Cz cz;

    @SerializedName("de")
    De de;

    @SerializedName("dk")
    Dk dk;

    @SerializedName("ec")
    Ec ec;

    @SerializedName("ee")
    Ee ee;

    @SerializedName("eg")
    Eg eg;

    @SerializedName("es")
    Es es;

    @SerializedName("et")
    Et et;

    @SerializedName("fi")
    Fi fi;

    @SerializedName("fr")
    Fr fr;

    @SerializedName("gb")
    Gb gb;

    @SerializedName("ge")
    Ge ge;

    @SerializedName("gn")
    Gn gn;

    @SerializedName("gr")
    Gr gr;

    @SerializedName("hr")
    Hr hr;

    @SerializedName("hu")
    Hu hu;

    @SerializedName("id")
    Id id;

    @SerializedName("ie")
    Ie ie;

    @SerializedName("in")
    In in;

    @SerializedName("is")
    Is is;

    @SerializedName("it")
    It it;

    @SerializedName("jp")
    Jp jp;

    @SerializedName("ke")
    Ke ke;

    @SerializedName("kg")
    Kg kg;

    @SerializedName("kh")
    Kh kh;

    @SerializedName("kr")
    Kr kr;

    @SerializedName("kz")
    Kz kz;

    @SerializedName("la")
    La la;

    @SerializedName("lt")
    Lt lt;

    @SerializedName("lu")
    Lu lu;

    @SerializedName("lv")
    Lv lv;

    @SerializedName("ma")
    Ma ma;

    @SerializedName("md")
    Md md;

    @SerializedName("me")
    Me me;

    @SerializedName("mk")
    Mk mk;

    @SerializedName("mr")
    Mr mr;

    @SerializedName("mt")
    Mt mt;

    @SerializedName("mx")
    Mx mx;

    @SerializedName("my")
    My my;

    @SerializedName("ng")
    Ng ng;

    @SerializedName("nl")
    Nl nl;

    @SerializedName("no")
    No no;

    @SerializedName("np")
    Np np;

    @SerializedName("nz")
    Nz nz;

    @SerializedName("om")
    Om om;

    @SerializedName("pe")
    Pe pe;

    @SerializedName("ph")
    Ph ph;

    @SerializedName("pl")
    Pl pl;

    @SerializedName("pt")
    Pt pt;

    @SerializedName("ro")
    Ro ro;

    @SerializedName("rs")
    Rs rs;

    @SerializedName("ru")
    Ru ru;

    @SerializedName("sa")
    Sa sa;

    @SerializedName("se")
    Se se;

    @SerializedName("sg")
    Sg sg;

    @SerializedName("si")
    Si si;

    @SerializedName("sk")
    Sk sk;

    @SerializedName("sn")
    Sn sn;

    @SerializedName("sr")
    Sr sr;

    @SerializedName("th")
    Th th;

    @SerializedName("tj")
    Tj tj;

    @SerializedName("tr")
    Tr tr;

    @SerializedName("tw")
    Tw tw;

    @SerializedName("tz")
    Tz tz;

    @SerializedName("ua")
    Ua ua;

    @SerializedName("ug")
    Ug ug;

    @SerializedName("us")
    Us us;

    @SerializedName("uy")
    Uy uy;

    @SerializedName("uz")
    Uz uz;

    @SerializedName("vn")
    Vn vn;

    @SerializedName("za")
    Za za;

    @SerializedName("zm")
    Zm zm;

    @SerializedName("zw")
    Zw zw;

    /**
     * For more details about Ae, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ae extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Al, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Al extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Am, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Am extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ao, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ao extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about At, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class At extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Au, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Au extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Aw, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Aw extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Az, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Az extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ba, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ba extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Bb, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bb extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Bd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bd extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Be, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Be extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Bf, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bf extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Bg, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bg extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Bh, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bh extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Bj, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bj extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Bs, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bs extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about By, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class By extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ca, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ca extends StripeObject {
      @SerializedName("province_standard")
      ProvinceStandard provinceStandard;

      /**
       * Type of registration in Canada.
       *
       * <p>One of {@code province_standard}, {@code simplified}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about ProvinceStandard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ProvinceStandard extends StripeObject {
        /**
         * Two-letter CA province code (<a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO
         * 3166-2</a>).
         */
        @SerializedName("province")
        String province;
      }
    }

    /**
     * For more details about Cd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cd extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ch, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ch extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Cl, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cl extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Cm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cm extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Co, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Co extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Cr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cr extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Cv, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cv extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Cy, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cy extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Cz, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cz extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about De, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class De extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Dk, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dk extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Ec, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ec extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ee, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ee extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Eg, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eg extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Es, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Es extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Et, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Et extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Fi, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fi extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Fr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fr extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Gb, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gb extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Ge, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ge extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Gn, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gn extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Gr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gr extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Hr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Hr extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Hu, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Hu extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Id, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Id extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ie, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ie extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about In, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class In extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Is, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Is extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about It, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class It extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Jp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jp extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Ke, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ke extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Kg, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kg extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Kh, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kh extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Kr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kr extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Kz, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Kz extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about La, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class La extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Lt, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Lt extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Lu, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Lu extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Lv, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Lv extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Ma, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ma extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Md, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Md extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Me, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Me extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Mk, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mk extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Mr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mr extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Mt, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mt extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Mx, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mx extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about My, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class My extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ng, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ng extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Nl, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Nl extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about No, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class No extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Np, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Np extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Nz, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Nz extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Om, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Om extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Pe, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pe extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ph, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ph extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Pl, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pl extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Pt, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pt extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Ro, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ro extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Rs, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rs extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ru, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ru extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Sa, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sa extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Se, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Se extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Sg, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sg extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an Default standard registration.
         *
         * <p>One of {@code inbound_goods}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Si, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Si extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Sk, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sk extends StripeObject {
      @SerializedName("standard")
      Standard standard;

      /**
       * Type of registration in an EU country.
       *
       * <p>One of {@code ioss}, {@code oss_non_union}, {@code oss_union}, or {@code standard}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Standard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code inbound_goods}, {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    /**
     * For more details about Sn, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sn extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Sr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sr extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Th, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Th extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Tj, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tj extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Tr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tr extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Tw, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tw extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Tz, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tz extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ua, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ua extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Ug, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ug extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Us, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Us extends StripeObject {
      @SerializedName("admissions_tax")
      AdmissionsTax admissionsTax;

      @SerializedName("attendance_tax")
      AttendanceTax attendanceTax;

      @SerializedName("entertainment_tax")
      EntertainmentTax entertainmentTax;

      @SerializedName("gross_receipts_tax")
      GrossReceiptsTax grossReceiptsTax;

      @SerializedName("hospitality_tax")
      HospitalityTax hospitalityTax;

      @SerializedName("local_amusement_tax")
      LocalAmusementTax localAmusementTax;

      @SerializedName("local_lease_tax")
      LocalLeaseTax localLeaseTax;

      @SerializedName("luxury_tax")
      LuxuryTax luxuryTax;

      @SerializedName("resort_tax")
      ResortTax resortTax;

      /**
       * Two-letter US state code (<a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO
       * 3166-2</a>).
       */
      @SerializedName("state")
      String state;

      @SerializedName("state_sales_tax")
      StateSalesTax stateSalesTax;

      @SerializedName("tourism_tax")
      TourismTax tourismTax;

      /**
       * Type of registration in the US.
       *
       * <p>One of {@code admissions_tax}, {@code attendance_tax}, {@code entertainment_tax}, {@code
       * gross_receipts_tax}, {@code hospitality_tax}, {@code local_amusement_tax}, {@code
       * local_lease_tax}, {@code luxury_tax}, {@code resort_tax}, {@code state_communications_tax},
       * {@code state_retail_delivery_fee}, {@code state_sales_tax}, or {@code tourism_tax}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about AdmissionsTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AdmissionsTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=admissions_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about AttendanceTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AttendanceTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=attendance_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about EntertainmentTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EntertainmentTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=entertainment_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about GrossReceiptsTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class GrossReceiptsTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=gross_receipts_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about HospitalityTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class HospitalityTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=hospitality_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about LocalAmusementTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class LocalAmusementTax extends StripeObject {
        /**
         * A <a href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
         * representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about LocalLeaseTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class LocalLeaseTax extends StripeObject {
        /**
         * A <a href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
         * representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about LuxuryTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class LuxuryTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=luxury_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about ResortTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ResortTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=resort_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }

      /**
       * For more details about StateSalesTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StateSalesTax extends StripeObject {
        /** Elections for the state sales tax registration. */
        @SerializedName("elections")
        List<Registration.CountryOptions.Us.StateSalesTax.Election> elections;

        /**
         * For more details about Election, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Election extends StripeObject {
          /**
           * A <a href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
           * representing the local jurisdiction.
           */
          @SerializedName("jurisdiction")
          String jurisdiction;

          /**
           * The type of the election for the state sales tax registration.
           *
           * <p>One of {@code local_use_tax}, {@code simplified_sellers_use_tax}, or {@code
           * single_local_use_tax}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /**
       * For more details about TourismTax, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TourismTax extends StripeObject {
        /**
         * A <a
         * href="https://docs.stripe.com/tax/registering?type=tourism_tax#registration-types">jurisdiction
         * code</a> representing the local jurisdiction.
         */
        @SerializedName("jurisdiction")
        String jurisdiction;
      }
    }

    /**
     * For more details about Uy, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Uy extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Uz, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Uz extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Vn, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Vn extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Za, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Za extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Zm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Zm extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code simplified}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Zw, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Zw extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(countryOptions, responseGetter);
  }
}
