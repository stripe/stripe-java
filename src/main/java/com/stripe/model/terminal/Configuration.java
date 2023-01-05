// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.ConfigurationCreateParams;
import com.stripe.param.terminal.ConfigurationListParams;
import com.stripe.param.terminal.ConfigurationRetrieveParams;
import com.stripe.param.terminal.ConfigurationUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Configurations object represents how features should be configured for terminal readers. */
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

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code terminal.configuration}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("tipping")
  Tipping tipping;

  @SerializedName("verifone_p400")
  VerifoneP400 verifoneP400;

  /** Creates a new <code>Configuration</code> object. */
  public static Configuration create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Configuration</code> object. */
  public static Configuration create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Configuration.class, options);
  }

  /** Creates a new <code>Configuration</code> object. */
  public static Configuration create(ConfigurationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Configuration</code> object. */
  public static Configuration create(ConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Configuration.class, options);
  }

  /** Deletes a <code>Configuration</code> object. */
  public Configuration delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a <code>Configuration</code> object. */
  public Configuration delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a <code>Configuration</code> object. */
  public Configuration delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a <code>Configuration</code> object. */
  public Configuration delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Configuration.class, options);
  }

  /** Returns a list of <code>Configuration</code> objects. */
  public static ConfigurationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Configuration</code> objects. */
  public static ConfigurationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/configurations");
    return ApiResource.requestCollection(url, params, ConfigurationCollection.class, options);
  }

  /** Returns a list of <code>Configuration</code> objects. */
  public static ConfigurationCollection list(ConfigurationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Configuration</code> objects. */
  public static ConfigurationCollection list(ConfigurationListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/configurations");
    return ApiResource.requestCollection(url, params, ConfigurationCollection.class, options);
  }

  /** Retrieves a <code>Configuration</code> object. */
  public static Configuration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>Configuration</code> object. */
  public static Configuration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>Configuration</code> object. */
  public static Configuration retrieve(
      String configuration, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Configuration.class, options);
  }

  /** Retrieves a <code>Configuration</code> object. */
  public static Configuration retrieve(
      String configuration, ConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Configuration.class, options);
  }

  /** Updates a new <code>Configuration</code> object. */
  public Configuration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a new <code>Configuration</code> object. */
  public Configuration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Configuration.class, options);
  }

  /** Updates a new <code>Configuration</code> object. */
  public Configuration update(ConfigurationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a new <code>Configuration</code> object. */
  public Configuration update(ConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Configuration.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BbposWiseposE extends StripeObject {
    /** A File ID representing an image you would like displayed on the reader. */
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tipping extends StripeObject {
    @SerializedName("aud")
    Aud aud;

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

    @SerializedName("myr")
    Myr myr;

    @SerializedName("nok")
    Nok nok;

    @SerializedName("nzd")
    Nzd nzd;

    @SerializedName("sek")
    Sek sek;

    @SerializedName("sgd")
    Sgd sgd;

    @SerializedName("usd")
    Usd usd;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerifoneP400 extends StripeObject {
    /** A File ID representing an image you would like displayed on the reader. */
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
}
