// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ConfigurationCreateParams extends ApiRequestParams {
  /** An object containing device type specific settings for BBPOS WisePOS E readers. */
  @SerializedName("bbpos_wisepos_e")
  BbposWiseposE bbposWiseposE;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Name of the configuration. */
  @SerializedName("name")
  String name;

  /** Configurations for collecting transactions offline. */
  @SerializedName("offline")
  Object offline;

  /** Reboot time settings for readers that support customized reboot time configuration. */
  @SerializedName("reboot_window")
  RebootWindow rebootWindow;

  /** An object containing device type specific settings for Stripe S700 readers. */
  @SerializedName("stripe_s700")
  StripeS700 stripeS700;

  /** Tipping configurations for readers supporting on-reader tips. */
  @SerializedName("tipping")
  Object tipping;

  /** An object containing device type specific settings for Verifone P400 readers. */
  @SerializedName("verifone_p400")
  VerifoneP400 verifoneP400;

  /** Configurations for connecting to a WiFi network. */
  @SerializedName("wifi")
  Object wifi;

  private ConfigurationCreateParams(
      BbposWiseposE bbposWiseposE,
      List<String> expand,
      Map<String, Object> extraParams,
      String name,
      Object offline,
      RebootWindow rebootWindow,
      StripeS700 stripeS700,
      Object tipping,
      VerifoneP400 verifoneP400,
      Object wifi) {
    this.bbposWiseposE = bbposWiseposE;
    this.expand = expand;
    this.extraParams = extraParams;
    this.name = name;
    this.offline = offline;
    this.rebootWindow = rebootWindow;
    this.stripeS700 = stripeS700;
    this.tipping = tipping;
    this.verifoneP400 = verifoneP400;
    this.wifi = wifi;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BbposWiseposE bbposWiseposE;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String name;

    private Object offline;

    private RebootWindow rebootWindow;

    private StripeS700 stripeS700;

    private Object tipping;

    private VerifoneP400 verifoneP400;

    private Object wifi;

    /** Finalize and obtain parameter instance from this builder. */
    public ConfigurationCreateParams build() {
      return new ConfigurationCreateParams(
          this.bbposWiseposE,
          this.expand,
          this.extraParams,
          this.name,
          this.offline,
          this.rebootWindow,
          this.stripeS700,
          this.tipping,
          this.verifoneP400,
          this.wifi);
    }

    /** An object containing device type specific settings for BBPOS WisePOS E readers. */
    public Builder setBbposWiseposE(ConfigurationCreateParams.BbposWiseposE bbposWiseposE) {
      this.bbposWiseposE = bbposWiseposE;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ConfigurationCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ConfigurationCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ConfigurationCreateParams#extraParams} for the field documentation.
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
     * See {@link ConfigurationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Name of the configuration. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Configurations for collecting transactions offline. */
    public Builder setOffline(ConfigurationCreateParams.Offline offline) {
      this.offline = offline;
      return this;
    }

    /** Configurations for collecting transactions offline. */
    public Builder setOffline(EmptyParam offline) {
      this.offline = offline;
      return this;
    }

    /** Reboot time settings for readers that support customized reboot time configuration. */
    public Builder setRebootWindow(ConfigurationCreateParams.RebootWindow rebootWindow) {
      this.rebootWindow = rebootWindow;
      return this;
    }

    /** An object containing device type specific settings for Stripe S700 readers. */
    public Builder setStripeS700(ConfigurationCreateParams.StripeS700 stripeS700) {
      this.stripeS700 = stripeS700;
      return this;
    }

    /** Tipping configurations for readers supporting on-reader tips. */
    public Builder setTipping(ConfigurationCreateParams.Tipping tipping) {
      this.tipping = tipping;
      return this;
    }

    /** Tipping configurations for readers supporting on-reader tips. */
    public Builder setTipping(EmptyParam tipping) {
      this.tipping = tipping;
      return this;
    }

    /** An object containing device type specific settings for Verifone P400 readers. */
    public Builder setVerifoneP400(ConfigurationCreateParams.VerifoneP400 verifoneP400) {
      this.verifoneP400 = verifoneP400;
      return this;
    }

    /** Configurations for connecting to a WiFi network. */
    public Builder setWifi(ConfigurationCreateParams.Wifi wifi) {
      this.wifi = wifi;
      return this;
    }

    /** Configurations for connecting to a WiFi network. */
    public Builder setWifi(EmptyParam wifi) {
      this.wifi = wifi;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BbposWiseposE {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A File ID representing an image to display on the reader. */
    @SerializedName("splashscreen")
    Object splashscreen;

    private BbposWiseposE(Map<String, Object> extraParams, Object splashscreen) {
      this.extraParams = extraParams;
      this.splashscreen = splashscreen;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object splashscreen;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.BbposWiseposE build() {
        return new ConfigurationCreateParams.BbposWiseposE(this.extraParams, this.splashscreen);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.BbposWiseposE#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.BbposWiseposE#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A File ID representing an image to display on the reader. */
      public Builder setSplashscreen(String splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }

      /** A File ID representing an image to display on the reader. */
      public Builder setSplashscreen(EmptyParam splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Offline {
    /**
     * <strong>Required.</strong> Determines whether to allow transactions to be collected while
     * reader is offline. Defaults to false.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Offline(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.Offline build() {
        return new ConfigurationCreateParams.Offline(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Determines whether to allow transactions to be collected while
       * reader is offline. Defaults to false.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.Offline#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.Offline#extraParams} for the field documentation.
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
  @EqualsAndHashCode(callSuper = false)
  public static class RebootWindow {
    /**
     * <strong>Required.</strong> Integer between 0 to 23 that represents the end hour of the reboot
     * time window. The value must be different than the start_hour.
     */
    @SerializedName("end_hour")
    Long endHour;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Integer between 0 to 23 that represents the start hour of the
     * reboot time window.
     */
    @SerializedName("start_hour")
    Long startHour;

    private RebootWindow(Long endHour, Map<String, Object> extraParams, Long startHour) {
      this.endHour = endHour;
      this.extraParams = extraParams;
      this.startHour = startHour;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long endHour;

      private Map<String, Object> extraParams;

      private Long startHour;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.RebootWindow build() {
        return new ConfigurationCreateParams.RebootWindow(
            this.endHour, this.extraParams, this.startHour);
      }

      /**
       * <strong>Required.</strong> Integer between 0 to 23 that represents the end hour of the
       * reboot time window. The value must be different than the start_hour.
       */
      public Builder setEndHour(Long endHour) {
        this.endHour = endHour;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.RebootWindow#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.RebootWindow#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Integer between 0 to 23 that represents the start hour of the
       * reboot time window.
       */
      public Builder setStartHour(Long startHour) {
        this.startHour = startHour;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class StripeS700 {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A File ID representing an image you would like displayed on the reader. */
    @SerializedName("splashscreen")
    Object splashscreen;

    private StripeS700(Map<String, Object> extraParams, Object splashscreen) {
      this.extraParams = extraParams;
      this.splashscreen = splashscreen;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object splashscreen;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.StripeS700 build() {
        return new ConfigurationCreateParams.StripeS700(this.extraParams, this.splashscreen);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.StripeS700#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.StripeS700#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A File ID representing an image you would like displayed on the reader. */
      public Builder setSplashscreen(String splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }

      /** A File ID representing an image you would like displayed on the reader. */
      public Builder setSplashscreen(EmptyParam splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Tipping {
    /** Tipping configuration for AUD. */
    @SerializedName("aud")
    Aud aud;

    /** Tipping configuration for CAD. */
    @SerializedName("cad")
    Cad cad;

    /** Tipping configuration for CHF. */
    @SerializedName("chf")
    Chf chf;

    /** Tipping configuration for CZK. */
    @SerializedName("czk")
    Czk czk;

    /** Tipping configuration for DKK. */
    @SerializedName("dkk")
    Dkk dkk;

    /** Tipping configuration for EUR. */
    @SerializedName("eur")
    Eur eur;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Tipping configuration for GBP. */
    @SerializedName("gbp")
    Gbp gbp;

    /** Tipping configuration for HKD. */
    @SerializedName("hkd")
    Hkd hkd;

    /** Tipping configuration for JPY. */
    @SerializedName("jpy")
    Jpy jpy;

    /** Tipping configuration for MYR. */
    @SerializedName("myr")
    Myr myr;

    /** Tipping configuration for NOK. */
    @SerializedName("nok")
    Nok nok;

    /** Tipping configuration for NZD. */
    @SerializedName("nzd")
    Nzd nzd;

    /** Tipping configuration for PLN. */
    @SerializedName("pln")
    Pln pln;

    /** Tipping configuration for SEK. */
    @SerializedName("sek")
    Sek sek;

    /** Tipping configuration for SGD. */
    @SerializedName("sgd")
    Sgd sgd;

    /** Tipping configuration for USD. */
    @SerializedName("usd")
    Usd usd;

    private Tipping(
        Aud aud,
        Cad cad,
        Chf chf,
        Czk czk,
        Dkk dkk,
        Eur eur,
        Map<String, Object> extraParams,
        Gbp gbp,
        Hkd hkd,
        Jpy jpy,
        Myr myr,
        Nok nok,
        Nzd nzd,
        Pln pln,
        Sek sek,
        Sgd sgd,
        Usd usd) {
      this.aud = aud;
      this.cad = cad;
      this.chf = chf;
      this.czk = czk;
      this.dkk = dkk;
      this.eur = eur;
      this.extraParams = extraParams;
      this.gbp = gbp;
      this.hkd = hkd;
      this.jpy = jpy;
      this.myr = myr;
      this.nok = nok;
      this.nzd = nzd;
      this.pln = pln;
      this.sek = sek;
      this.sgd = sgd;
      this.usd = usd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Aud aud;

      private Cad cad;

      private Chf chf;

      private Czk czk;

      private Dkk dkk;

      private Eur eur;

      private Map<String, Object> extraParams;

      private Gbp gbp;

      private Hkd hkd;

      private Jpy jpy;

      private Myr myr;

      private Nok nok;

      private Nzd nzd;

      private Pln pln;

      private Sek sek;

      private Sgd sgd;

      private Usd usd;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.Tipping build() {
        return new ConfigurationCreateParams.Tipping(
            this.aud,
            this.cad,
            this.chf,
            this.czk,
            this.dkk,
            this.eur,
            this.extraParams,
            this.gbp,
            this.hkd,
            this.jpy,
            this.myr,
            this.nok,
            this.nzd,
            this.pln,
            this.sek,
            this.sgd,
            this.usd);
      }

      /** Tipping configuration for AUD. */
      public Builder setAud(ConfigurationCreateParams.Tipping.Aud aud) {
        this.aud = aud;
        return this;
      }

      /** Tipping configuration for CAD. */
      public Builder setCad(ConfigurationCreateParams.Tipping.Cad cad) {
        this.cad = cad;
        return this;
      }

      /** Tipping configuration for CHF. */
      public Builder setChf(ConfigurationCreateParams.Tipping.Chf chf) {
        this.chf = chf;
        return this;
      }

      /** Tipping configuration for CZK. */
      public Builder setCzk(ConfigurationCreateParams.Tipping.Czk czk) {
        this.czk = czk;
        return this;
      }

      /** Tipping configuration for DKK. */
      public Builder setDkk(ConfigurationCreateParams.Tipping.Dkk dkk) {
        this.dkk = dkk;
        return this;
      }

      /** Tipping configuration for EUR. */
      public Builder setEur(ConfigurationCreateParams.Tipping.Eur eur) {
        this.eur = eur;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.Tipping#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.Tipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Tipping configuration for GBP. */
      public Builder setGbp(ConfigurationCreateParams.Tipping.Gbp gbp) {
        this.gbp = gbp;
        return this;
      }

      /** Tipping configuration for HKD. */
      public Builder setHkd(ConfigurationCreateParams.Tipping.Hkd hkd) {
        this.hkd = hkd;
        return this;
      }

      /** Tipping configuration for JPY. */
      public Builder setJpy(ConfigurationCreateParams.Tipping.Jpy jpy) {
        this.jpy = jpy;
        return this;
      }

      /** Tipping configuration for MYR. */
      public Builder setMyr(ConfigurationCreateParams.Tipping.Myr myr) {
        this.myr = myr;
        return this;
      }

      /** Tipping configuration for NOK. */
      public Builder setNok(ConfigurationCreateParams.Tipping.Nok nok) {
        this.nok = nok;
        return this;
      }

      /** Tipping configuration for NZD. */
      public Builder setNzd(ConfigurationCreateParams.Tipping.Nzd nzd) {
        this.nzd = nzd;
        return this;
      }

      /** Tipping configuration for PLN. */
      public Builder setPln(ConfigurationCreateParams.Tipping.Pln pln) {
        this.pln = pln;
        return this;
      }

      /** Tipping configuration for SEK. */
      public Builder setSek(ConfigurationCreateParams.Tipping.Sek sek) {
        this.sek = sek;
        return this;
      }

      /** Tipping configuration for SGD. */
      public Builder setSgd(ConfigurationCreateParams.Tipping.Sgd sgd) {
        this.sgd = sgd;
        return this;
      }

      /** Tipping configuration for USD. */
      public Builder setUsd(ConfigurationCreateParams.Tipping.Usd usd) {
        this.usd = usd;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Aud {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Aud(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Aud build() {
          return new ConfigurationCreateParams.Tipping.Aud(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Aud#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Aud#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Aud#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Aud#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Aud#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Aud#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Cad {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Cad(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Cad build() {
          return new ConfigurationCreateParams.Tipping.Cad(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Cad#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Cad#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Cad#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Cad#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Cad#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Cad#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Chf {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Chf(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Chf build() {
          return new ConfigurationCreateParams.Tipping.Chf(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Chf#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Chf#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Chf#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Chf#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Chf#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Chf#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Czk {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Czk(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Czk build() {
          return new ConfigurationCreateParams.Tipping.Czk(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Czk#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Czk#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Czk#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Czk#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Czk#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Czk#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Dkk {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Dkk(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Dkk build() {
          return new ConfigurationCreateParams.Tipping.Dkk(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Dkk#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Dkk#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Dkk#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Dkk#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Dkk#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Dkk#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Eur {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Eur(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Eur build() {
          return new ConfigurationCreateParams.Tipping.Eur(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Eur#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Eur#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Eur#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Eur#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Eur#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Eur#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Gbp {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Gbp(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Gbp build() {
          return new ConfigurationCreateParams.Tipping.Gbp(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Gbp#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Gbp#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Gbp#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Gbp#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Gbp#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Gbp#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Hkd {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Hkd(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Hkd build() {
          return new ConfigurationCreateParams.Tipping.Hkd(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Hkd#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Hkd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Hkd#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Hkd#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Hkd#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Hkd#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Jpy {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Jpy(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Jpy build() {
          return new ConfigurationCreateParams.Tipping.Jpy(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Jpy#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Jpy#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Jpy#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Jpy#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Jpy#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Jpy#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Myr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Myr(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Myr build() {
          return new ConfigurationCreateParams.Tipping.Myr(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Myr#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Myr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Myr#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Myr#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Myr#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Myr#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Nok {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Nok(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Nok build() {
          return new ConfigurationCreateParams.Tipping.Nok(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Nok#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Nok#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nok#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nok#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nok#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nok#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Nzd {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Nzd(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Nzd build() {
          return new ConfigurationCreateParams.Tipping.Nzd(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Nzd#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Nzd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nzd#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nzd#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nzd#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Nzd#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Pln {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Pln(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Pln build() {
          return new ConfigurationCreateParams.Tipping.Pln(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Pln#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Pln#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Pln#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Pln#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Pln#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Pln#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Sek {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Sek(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Sek build() {
          return new ConfigurationCreateParams.Tipping.Sek(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Sek#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Sek#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sek#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sek#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sek#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sek#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Sgd {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Sgd(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Sgd build() {
          return new ConfigurationCreateParams.Tipping.Sgd(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Sgd#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Sgd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sgd#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sgd#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sgd#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Sgd#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Usd {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

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

      private Usd(
          Map<String, Object> extraParams,
          List<Long> fixedAmounts,
          List<Long> percentages,
          Long smartTipThreshold) {
        this.extraParams = extraParams;
        this.fixedAmounts = fixedAmounts;
        this.percentages = percentages;
        this.smartTipThreshold = smartTipThreshold;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<Long> fixedAmounts;

        private List<Long> percentages;

        private Long smartTipThreshold;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Tipping.Usd build() {
          return new ConfigurationCreateParams.Tipping.Usd(
              this.extraParams, this.fixedAmounts, this.percentages, this.smartTipThreshold);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Usd#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Tipping.Usd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Usd#fixedAmounts} for the field documentation.
         */
        public Builder addFixedAmount(Long element) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.add(element);
          return this;
        }

        /**
         * Add all elements to `fixedAmounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Usd#fixedAmounts} for the field documentation.
         */
        public Builder addAllFixedAmount(List<Long> elements) {
          if (this.fixedAmounts == null) {
            this.fixedAmounts = new ArrayList<>();
          }
          this.fixedAmounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Usd#percentages} for the field documentation.
         */
        public Builder addPercentage(Long element) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.add(element);
          return this;
        }

        /**
         * Add all elements to `percentages` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ConfigurationCreateParams.Tipping.Usd#percentages} for the field documentation.
         */
        public Builder addAllPercentage(List<Long> elements) {
          if (this.percentages == null) {
            this.percentages = new ArrayList<>();
          }
          this.percentages.addAll(elements);
          return this;
        }

        /**
         * Below this amount, fixed amounts will be displayed; above it, percentages will be
         * displayed.
         */
        public Builder setSmartTipThreshold(Long smartTipThreshold) {
          this.smartTipThreshold = smartTipThreshold;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class VerifoneP400 {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A File ID representing an image you would like displayed on the reader. */
    @SerializedName("splashscreen")
    Object splashscreen;

    private VerifoneP400(Map<String, Object> extraParams, Object splashscreen) {
      this.extraParams = extraParams;
      this.splashscreen = splashscreen;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object splashscreen;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.VerifoneP400 build() {
        return new ConfigurationCreateParams.VerifoneP400(this.extraParams, this.splashscreen);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.VerifoneP400#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.VerifoneP400#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A File ID representing an image you would like displayed on the reader. */
      public Builder setSplashscreen(String splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }

      /** A File ID representing an image you would like displayed on the reader. */
      public Builder setSplashscreen(EmptyParam splashscreen) {
        this.splashscreen = splashscreen;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Wifi {
    /** Credentials for a WPA-Enterprise WiFi network using the EAP-PEAP authentication method. */
    @SerializedName("enterprise_eap_peap")
    EnterpriseEapPeap enterpriseEapPeap;

    /** Credentials for a WPA-Enterprise WiFi network using the EAP-TLS authentication method. */
    @SerializedName("enterprise_eap_tls")
    EnterpriseEapTls enterpriseEapTls;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Credentials for a WPA-Personal WiFi network. */
    @SerializedName("personal_psk")
    PersonalPsk personalPsk;

    /**
     * <strong>Required.</strong> Security type of the WiFi network. Fill out the hash with the
     * corresponding name to provide the set of credentials for this security type.
     */
    @SerializedName("type")
    Type type;

    private Wifi(
        EnterpriseEapPeap enterpriseEapPeap,
        EnterpriseEapTls enterpriseEapTls,
        Map<String, Object> extraParams,
        PersonalPsk personalPsk,
        Type type) {
      this.enterpriseEapPeap = enterpriseEapPeap;
      this.enterpriseEapTls = enterpriseEapTls;
      this.extraParams = extraParams;
      this.personalPsk = personalPsk;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private EnterpriseEapPeap enterpriseEapPeap;

      private EnterpriseEapTls enterpriseEapTls;

      private Map<String, Object> extraParams;

      private PersonalPsk personalPsk;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfigurationCreateParams.Wifi build() {
        return new ConfigurationCreateParams.Wifi(
            this.enterpriseEapPeap,
            this.enterpriseEapTls,
            this.extraParams,
            this.personalPsk,
            this.type);
      }

      /** Credentials for a WPA-Enterprise WiFi network using the EAP-PEAP authentication method. */
      public Builder setEnterpriseEapPeap(
          ConfigurationCreateParams.Wifi.EnterpriseEapPeap enterpriseEapPeap) {
        this.enterpriseEapPeap = enterpriseEapPeap;
        return this;
      }

      /** Credentials for a WPA-Enterprise WiFi network using the EAP-TLS authentication method. */
      public Builder setEnterpriseEapTls(
          ConfigurationCreateParams.Wifi.EnterpriseEapTls enterpriseEapTls) {
        this.enterpriseEapTls = enterpriseEapTls;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfigurationCreateParams.Wifi#extraParams} for the field documentation.
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
       * See {@link ConfigurationCreateParams.Wifi#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Credentials for a WPA-Personal WiFi network. */
      public Builder setPersonalPsk(ConfigurationCreateParams.Wifi.PersonalPsk personalPsk) {
        this.personalPsk = personalPsk;
        return this;
      }

      /**
       * <strong>Required.</strong> Security type of the WiFi network. Fill out the hash with the
       * corresponding name to provide the set of credentials for this security type.
       */
      public Builder setType(ConfigurationCreateParams.Wifi.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EnterpriseEapPeap {
      /** A File ID representing a PEM file containing the server certificate. */
      @SerializedName("ca_certificate_file")
      String caCertificateFile;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Password for connecting to the WiFi network */
      @SerializedName("password")
      String password;

      /** <strong>Required.</strong> Name of the WiFi network */
      @SerializedName("ssid")
      String ssid;

      /** <strong>Required.</strong> Username for connecting to the WiFi network */
      @SerializedName("username")
      String username;

      private EnterpriseEapPeap(
          String caCertificateFile,
          Map<String, Object> extraParams,
          String password,
          String ssid,
          String username) {
        this.caCertificateFile = caCertificateFile;
        this.extraParams = extraParams;
        this.password = password;
        this.ssid = ssid;
        this.username = username;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String caCertificateFile;

        private Map<String, Object> extraParams;

        private String password;

        private String ssid;

        private String username;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Wifi.EnterpriseEapPeap build() {
          return new ConfigurationCreateParams.Wifi.EnterpriseEapPeap(
              this.caCertificateFile, this.extraParams, this.password, this.ssid, this.username);
        }

        /** A File ID representing a PEM file containing the server certificate. */
        public Builder setCaCertificateFile(String caCertificateFile) {
          this.caCertificateFile = caCertificateFile;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.EnterpriseEapPeap#extraParams} for the
         * field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.EnterpriseEapPeap#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Password for connecting to the WiFi network */
        public Builder setPassword(String password) {
          this.password = password;
          return this;
        }

        /** <strong>Required.</strong> Name of the WiFi network */
        public Builder setSsid(String ssid) {
          this.ssid = ssid;
          return this;
        }

        /** <strong>Required.</strong> Username for connecting to the WiFi network */
        public Builder setUsername(String username) {
          this.username = username;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EnterpriseEapTls {
      /** A File ID representing a PEM file containing the server certificate. */
      @SerializedName("ca_certificate_file")
      String caCertificateFile;

      /**
       * <strong>Required.</strong> A File ID representing a PEM file containing the client
       * certificate
       */
      @SerializedName("client_certificate_file")
      String clientCertificateFile;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A File ID representing a PEM file containing the client RSA
       * private key
       */
      @SerializedName("private_key_file")
      String privateKeyFile;

      /** Password for the private key file. */
      @SerializedName("private_key_file_password")
      String privateKeyFilePassword;

      /** <strong>Required.</strong> Name of the WiFi network */
      @SerializedName("ssid")
      String ssid;

      private EnterpriseEapTls(
          String caCertificateFile,
          String clientCertificateFile,
          Map<String, Object> extraParams,
          String privateKeyFile,
          String privateKeyFilePassword,
          String ssid) {
        this.caCertificateFile = caCertificateFile;
        this.clientCertificateFile = clientCertificateFile;
        this.extraParams = extraParams;
        this.privateKeyFile = privateKeyFile;
        this.privateKeyFilePassword = privateKeyFilePassword;
        this.ssid = ssid;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String caCertificateFile;

        private String clientCertificateFile;

        private Map<String, Object> extraParams;

        private String privateKeyFile;

        private String privateKeyFilePassword;

        private String ssid;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Wifi.EnterpriseEapTls build() {
          return new ConfigurationCreateParams.Wifi.EnterpriseEapTls(
              this.caCertificateFile,
              this.clientCertificateFile,
              this.extraParams,
              this.privateKeyFile,
              this.privateKeyFilePassword,
              this.ssid);
        }

        /** A File ID representing a PEM file containing the server certificate. */
        public Builder setCaCertificateFile(String caCertificateFile) {
          this.caCertificateFile = caCertificateFile;
          return this;
        }

        /**
         * <strong>Required.</strong> A File ID representing a PEM file containing the client
         * certificate
         */
        public Builder setClientCertificateFile(String clientCertificateFile) {
          this.clientCertificateFile = clientCertificateFile;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.EnterpriseEapTls#extraParams} for the
         * field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.EnterpriseEapTls#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> A File ID representing a PEM file containing the client RSA
         * private key
         */
        public Builder setPrivateKeyFile(String privateKeyFile) {
          this.privateKeyFile = privateKeyFile;
          return this;
        }

        /** Password for the private key file. */
        public Builder setPrivateKeyFilePassword(String privateKeyFilePassword) {
          this.privateKeyFilePassword = privateKeyFilePassword;
          return this;
        }

        /** <strong>Required.</strong> Name of the WiFi network */
        public Builder setSsid(String ssid) {
          this.ssid = ssid;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PersonalPsk {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Password for connecting to the WiFi network */
      @SerializedName("password")
      String password;

      /** <strong>Required.</strong> Name of the WiFi network */
      @SerializedName("ssid")
      String ssid;

      private PersonalPsk(Map<String, Object> extraParams, String password, String ssid) {
        this.extraParams = extraParams;
        this.password = password;
        this.ssid = ssid;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String password;

        private String ssid;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfigurationCreateParams.Wifi.PersonalPsk build() {
          return new ConfigurationCreateParams.Wifi.PersonalPsk(
              this.extraParams, this.password, this.ssid);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.PersonalPsk#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfigurationCreateParams.Wifi.PersonalPsk#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Password for connecting to the WiFi network */
        public Builder setPassword(String password) {
          this.password = password;
          return this;
        }

        /** <strong>Required.</strong> Name of the WiFi network */
        public Builder setSsid(String ssid) {
          this.ssid = ssid;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("enterprise_eap_peap")
      ENTERPRISE_EAP_PEAP("enterprise_eap_peap"),

      @SerializedName("enterprise_eap_tls")
      ENTERPRISE_EAP_TLS("enterprise_eap_tls"),

      @SerializedName("personal_psk")
      PERSONAL_PSK("personal_psk");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
