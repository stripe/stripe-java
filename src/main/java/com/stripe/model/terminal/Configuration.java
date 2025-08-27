// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ConfigurationCreateParams;
import com.stripe.param.terminal.ConfigurationListParams;
import com.stripe.param.terminal.ConfigurationRetrieveParams;
import com.stripe.param.terminal.ConfigurationUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Configurations object represents how features should be configured for terminal readers. For
 * information about how to use it, see the <a
 * href="https://docs.stripe.com/terminal/fleet/configurations-overview">Terminal configurations
 * documentation</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Configuration extends ApiResource implements HasId {
  @SerializedName("bbpos_wisepos_e")
  BbposWiseposE bbposWiseposE;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this Configuration is the default for your account. */
  @SerializedName("is_account_default")
  Boolean isAccountDefault;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** String indicating the name of the Configuration object, set by the user. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code terminal.configuration}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("offline")
  Offline offline;

  @SerializedName("reader_security")
  ReaderSecurity readerSecurity;

  @SerializedName("reboot_window")
  RebootWindow rebootWindow;

  @SerializedName("stripe_s700")
  StripeS700 stripeS700;

  @SerializedName("tipping")
  Tipping tipping;

  @SerializedName("verifone_p400")
  VerifoneP400 verifoneP400;

  @SerializedName("wifi")
  Wifi wifi;

  /** Creates a new {@code Configuration} object. */
  public static Configuration create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code Configuration} object. */
  public static Configuration create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Configuration.class);
  }

  /** Creates a new {@code Configuration} object. */
  public static Configuration create(ConfigurationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code Configuration} object. */
  public static Configuration create(ConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Configuration.class);
  }

  /** Deletes a {@code Configuration} object. */
  public Configuration delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a {@code Configuration} object. */
  public Configuration delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a {@code Configuration} object. */
  public Configuration delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a {@code Configuration} object. */
  public Configuration delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Configuration.class);
  }

  /** Returns a list of {@code Configuration} objects. */
  public static ConfigurationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Configuration} objects. */
  public static ConfigurationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ConfigurationCollection.class);
  }

  /** Returns a list of {@code Configuration} objects. */
  public static ConfigurationCollection list(ConfigurationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Configuration} objects. */
  public static ConfigurationCollection list(ConfigurationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ConfigurationCollection.class);
  }

  /** Retrieves a {@code Configuration} object. */
  public static Configuration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code Configuration} object. */
  public static Configuration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code Configuration} object. */
  public static Configuration retrieve(
      String configuration, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Configuration.class);
  }

  /** Retrieves a {@code Configuration} object. */
  public static Configuration retrieve(
      String configuration, ConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Configuration.class);
  }

  /** Updates a new {@code Configuration} object. */
  public Configuration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a new {@code Configuration} object. */
  public Configuration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Configuration.class);
  }

  /** Updates a new {@code Configuration} object. */
  public Configuration update(ConfigurationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a new {@code Configuration} object. */
  public Configuration update(ConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Configuration.class);
  }

  /**
   * For more details about BbposWiseposE, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BbposWiseposE extends StripeObject {
    /** A File ID representing an image to display on the reader. */
    @SerializedName("splashscreen")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> splashscreen;

    /** Get ID of expandable {@code splashscreen} object. */
    public String getSplashscreen() {
      return (this.splashscreen != null) ? this.splashscreen.getId() : null;
    }

    public void setSplashscreen(String id) {
      this.splashscreen = ApiResource.setExpandableFieldId(id, this.splashscreen);
    }

    /** Get expanded {@code splashscreen}. */
    public File getSplashscreenObject() {
      return (this.splashscreen != null) ? this.splashscreen.getExpanded() : null;
    }

    public void setSplashscreenObject(File expandableObject) {
      this.splashscreen = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Offline, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Offline extends StripeObject {
    /**
     * Determines whether to allow transactions to be collected while reader is offline. Defaults to
     * false.
     */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /**
   * For more details about ReaderSecurity, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReaderSecurity extends StripeObject {
    /** Passcode used to access a reader's admin menu. */
    @SerializedName("admin_menu_passcode")
    String adminMenuPasscode;
  }

  /**
   * For more details about RebootWindow, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RebootWindow extends StripeObject {
    /**
     * Integer between 0 to 23 that represents the end hour of the reboot time window. The value
     * must be different than the start_hour.
     */
    @SerializedName("end_hour")
    Long endHour;

    /** Integer between 0 to 23 that represents the start hour of the reboot time window. */
    @SerializedName("start_hour")
    Long startHour;
  }

  /**
   * For more details about StripeS700, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StripeS700 extends StripeObject {
    /** A File ID representing an image to display on the reader. */
    @SerializedName("splashscreen")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> splashscreen;

    /** Get ID of expandable {@code splashscreen} object. */
    public String getSplashscreen() {
      return (this.splashscreen != null) ? this.splashscreen.getId() : null;
    }

    public void setSplashscreen(String id) {
      this.splashscreen = ApiResource.setExpandableFieldId(id, this.splashscreen);
    }

    /** Get expanded {@code splashscreen}. */
    public File getSplashscreenObject() {
      return (this.splashscreen != null) ? this.splashscreen.getExpanded() : null;
    }

    public void setSplashscreenObject(File expandableObject) {
      this.splashscreen = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Tipping, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tipping extends StripeObject {
    @SerializedName("aed")
    Aed aed;

    @SerializedName("aud")
    Aud aud;

    @SerializedName("bgn")
    Bgn bgn;

    @SerializedName("cad")
    Cad cad;

    @SerializedName("chf")
    Chf chf;

    @SerializedName("czk")
    Czk czk;

    @SerializedName("dkk")
    Dkk dkk;

    @SerializedName("eur")
    Eur eur;

    @SerializedName("gbp")
    Gbp gbp;

    @SerializedName("hkd")
    Hkd hkd;

    @SerializedName("huf")
    Huf huf;

    @SerializedName("jpy")
    Jpy jpy;

    @SerializedName("mxn")
    Mxn mxn;

    @SerializedName("myr")
    Myr myr;

    @SerializedName("nok")
    Nok nok;

    @SerializedName("nzd")
    Nzd nzd;

    @SerializedName("pln")
    Pln pln;

    @SerializedName("ron")
    Ron ron;

    @SerializedName("sek")
    Sek sek;

    @SerializedName("sgd")
    Sgd sgd;

    @SerializedName("usd")
    Usd usd;

    /**
     * For more details about Aed, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Aed extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Aud, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Aud extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Bgn, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bgn extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Cad, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cad extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Chf, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Chf extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Czk, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Czk extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Dkk, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dkk extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Eur, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eur extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Gbp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gbp extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Hkd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Hkd extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Huf, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Huf extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Jpy, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Jpy extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Mxn, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mxn extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Myr, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Myr extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Nok, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Nok extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Nzd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Nzd extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Pln, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pln extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Ron, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ron extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Sek, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sek extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Sgd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sgd extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }

    /**
     * For more details about Usd, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Usd extends StripeObject {
      /** Fixed amounts displayed when collecting a tip. */
      @SerializedName("fixed_amounts")
      List<Long> fixedAmounts;

      /** Percentages displayed when collecting a tip. */
      @SerializedName("percentages")
      List<Long> percentages;

      /**
       * Below this amount, fixed amounts will be displayed; above it, percentages will be
       * displayed.
       */
      @SerializedName("smart_tip_threshold")
      Long smartTipThreshold;
    }
  }

  /**
   * For more details about VerifoneP400, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerifoneP400 extends StripeObject {
    /** A File ID representing an image to display on the reader. */
    @SerializedName("splashscreen")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> splashscreen;

    /** Get ID of expandable {@code splashscreen} object. */
    public String getSplashscreen() {
      return (this.splashscreen != null) ? this.splashscreen.getId() : null;
    }

    public void setSplashscreen(String id) {
      this.splashscreen = ApiResource.setExpandableFieldId(id, this.splashscreen);
    }

    /** Get expanded {@code splashscreen}. */
    public File getSplashscreenObject() {
      return (this.splashscreen != null) ? this.splashscreen.getExpanded() : null;
    }

    public void setSplashscreenObject(File expandableObject) {
      this.splashscreen = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Wifi, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Wifi extends StripeObject {
    @SerializedName("enterprise_eap_peap")
    EnterpriseEapPeap enterpriseEapPeap;

    @SerializedName("enterprise_eap_tls")
    EnterpriseEapTls enterpriseEapTls;

    @SerializedName("personal_psk")
    PersonalPsk personalPsk;

    /**
     * Security type of the WiFi network. The hash with the corresponding name contains the
     * credentials for this security type.
     *
     * <p>One of {@code enterprise_eap_peap}, {@code enterprise_eap_tls}, or {@code personal_psk}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about EnterpriseEapPeap, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EnterpriseEapPeap extends StripeObject {
      /** A File ID representing a PEM file containing the server certificate. */
      @SerializedName("ca_certificate_file")
      String caCertificateFile;

      /** Password for connecting to the WiFi network. */
      @SerializedName("password")
      String password;

      /** Name of the WiFi network. */
      @SerializedName("ssid")
      String ssid;

      /** Username for connecting to the WiFi network. */
      @SerializedName("username")
      String username;
    }

    /**
     * For more details about EnterpriseEapTls, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EnterpriseEapTls extends StripeObject {
      /** A File ID representing a PEM file containing the server certificate. */
      @SerializedName("ca_certificate_file")
      String caCertificateFile;

      /** A File ID representing a PEM file containing the client certificate. */
      @SerializedName("client_certificate_file")
      String clientCertificateFile;

      /** A File ID representing a PEM file containing the client RSA private key. */
      @SerializedName("private_key_file")
      String privateKeyFile;

      /** Password for the private key file. */
      @SerializedName("private_key_file_password")
      String privateKeyFilePassword;

      /** Name of the WiFi network. */
      @SerializedName("ssid")
      String ssid;
    }

    /**
     * For more details about PersonalPsk, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PersonalPsk extends StripeObject {
      /** Password for connecting to the WiFi network. */
      @SerializedName("password")
      String password;

      /** Name of the WiFi network. */
      @SerializedName("ssid")
      String ssid;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(bbposWiseposE, responseGetter);
    trySetResponseGetter(offline, responseGetter);
    trySetResponseGetter(readerSecurity, responseGetter);
    trySetResponseGetter(rebootWindow, responseGetter);
    trySetResponseGetter(stripeS700, responseGetter);
    trySetResponseGetter(tipping, responseGetter);
    trySetResponseGetter(verifoneP400, responseGetter);
    trySetResponseGetter(wifi, responseGetter);
  }
}
