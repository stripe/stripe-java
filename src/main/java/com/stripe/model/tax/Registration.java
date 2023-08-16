// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.RegistrationCreateParams;
import com.stripe.param.tax.RegistrationListParams;
import com.stripe.param.tax.RegistrationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax {@code Registration} lets us know that your business is registered to collect tax on
 * payments within a region, enabling you to <a href="https://stripe.com/docs/tax">automatically
 * collect tax</a>.
 *
 * <p>Stripe doesn't register on your behalf with the relevant authorities when you create a Tax
 * {@code Registration} object. For more information on how to register to collect tax, see <a
 * href="https://stripe.com/docs/tax/registering">our guide</a>.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/tax/registrations-api">Using the Registrations
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
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Registration.class,
            options,
            ApiMode.V1);
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
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Registration.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Tax {@code Registration} objects. */
  public static RegistrationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/registrations";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            RegistrationCollection.class,
            options,
            ApiMode.V1);
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
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            RegistrationCollection.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Registration.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Registration.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CountryOptions extends StripeObject {
    @SerializedName("ae")
    Ae ae;

    @SerializedName("at")
    At at;

    @SerializedName("au")
    Au au;

    @SerializedName("be")
    Be be;

    @SerializedName("bg")
    Bg bg;

    @SerializedName("ca")
    Ca ca;

    @SerializedName("ch")
    Ch ch;

    @SerializedName("cy")
    Cy cy;

    @SerializedName("cz")
    Cz cz;

    @SerializedName("de")
    De de;

    @SerializedName("dk")
    Dk dk;

    @SerializedName("ee")
    Ee ee;

    @SerializedName("es")
    Es es;

    @SerializedName("fi")
    Fi fi;

    @SerializedName("fr")
    Fr fr;

    @SerializedName("gb")
    Gb gb;

    @SerializedName("gr")
    Gr gr;

    @SerializedName("hk")
    Hk hk;

    @SerializedName("hr")
    Hr hr;

    @SerializedName("hu")
    Hu hu;

    @SerializedName("ie")
    Ie ie;

    @SerializedName("is")
    Is is;

    @SerializedName("it")
    It it;

    @SerializedName("jp")
    Jp jp;

    @SerializedName("lt")
    Lt lt;

    @SerializedName("lu")
    Lu lu;

    @SerializedName("lv")
    Lv lv;

    @SerializedName("mt")
    Mt mt;

    @SerializedName("nl")
    Nl nl;

    @SerializedName("no")
    No no;

    @SerializedName("nz")
    Nz nz;

    @SerializedName("pl")
    Pl pl;

    @SerializedName("pt")
    Pt pt;

    @SerializedName("ro")
    Ro ro;

    @SerializedName("se")
    Se se;

    @SerializedName("sg")
    Sg sg;

    @SerializedName("si")
    Si si;

    @SerializedName("sk")
    Sk sk;

    @SerializedName("us")
    Us us;

    @SerializedName("za")
    Za za;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ae extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Au extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ch extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gb extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Hk extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jp extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class No extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Nz extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sg extends StripeObject {
      /**
       * Type of registration in {@code country}.
       *
       * <p>Equal to {@code standard}.
       */
      @SerializedName("type")
      String type;
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Standard extends StripeObject {
        /**
         * Place of supply scheme used in an EU standard registration.
         *
         * <p>One of {@code small_seller}, or {@code standard}.
         */
        @SerializedName("place_of_supply_scheme")
        String placeOfSupplyScheme;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Us extends StripeObject {
      @SerializedName("local_amusement_tax")
      LocalAmusementTax localAmusementTax;

      @SerializedName("local_lease_tax")
      LocalLeaseTax localLeaseTax;

      /**
       * Two-letter US state code (<a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO
       * 3166-2</a>).
       */
      @SerializedName("state")
      String state;

      /**
       * Type of registration in the US.
       *
       * <p>One of {@code local_lease_tax}, or {@code state_sales_tax}.
       */
      @SerializedName("type")
      String type;

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
    }

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
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(countryOptions, responseGetter);
  }
}
