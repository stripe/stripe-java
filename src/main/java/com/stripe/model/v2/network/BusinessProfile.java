// File generated from our OpenAPI spec
package com.stripe.model.v2.network;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The Stripe profile represents a business' public identity on the Stripe network. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BusinessProfile extends StripeObject implements HasId {
  /** Branding data for the business. */
  @SerializedName("branding")
  Branding branding;

  /** The description of the business. */
  @SerializedName("description")
  String description;

  /** The display name of the Stripe profile. */
  @SerializedName("display_name")
  String displayName;

  /**
   * The ID of the Stripe business profile; also known as the Network ID. This is the ID used to
   * identify the business on the Stripe network.
   */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.network.business_profile}.
   */
  @SerializedName("object")
  String object;

  /** The URL of the business. */
  @SerializedName("url")
  String url;

  /** The username of the Stripe profile. */
  @SerializedName("username")
  String username;

  /** Branding data for the business. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Branding extends StripeObject {
    /** URL of the icon for the business. The image will be square and at least 128px x 128px. */
    @SerializedName("icon")
    Icon icon;

    /** URL of the logo for the business. The image will be at least 128px x 128px. */
    @SerializedName("logo")
    Logo logo;

    /** A CSS hex color value representing the primary branding color for this business. */
    @SerializedName("primary_color")
    String primaryColor;

    /** A CSS hex color value representing the secondary branding color for this business. */
    @SerializedName("secondary_color")
    String secondaryColor;

    /** URL of the icon for the business. The image will be square and at least 128px x 128px. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Icon extends StripeObject {
      /** The URL of the image in its original size. */
      @SerializedName("original")
      String original;
    }

    /** URL of the logo for the business. The image will be at least 128px x 128px. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Logo extends StripeObject {
      /** The URL of the image in its original size. */
      @SerializedName("original")
      String original;
    }
  }
}
