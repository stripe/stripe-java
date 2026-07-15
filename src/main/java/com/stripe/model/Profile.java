// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Stripe profile. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Profile extends StripeObject implements HasId {
  /** Branding information for the Stripe profile. */
  @SerializedName("branding")
  Branding branding;

  /** A description of the business or entity represented by the Stripe profile. */
  @SerializedName("description")
  String description;

  /** The display name shown for the Stripe profile. */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the Stripe profile. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code profile}.
   */
  @SerializedName("object")
  String object;

  /** The external website URL associated with the Stripe profile. */
  @SerializedName("url")
  String url;

  /** The unique username for the Stripe profile. */
  @SerializedName("username")
  String username;

  /**
   * For more details about Branding, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Branding extends StripeObject {
    /** Profile icon image. */
    @SerializedName("icon")
    Icon icon;

    /** Profile logo image. */
    @SerializedName("logo")
    Logo logo;

    /** The primary brand color for the profile. */
    @SerializedName("primary_color")
    String primaryColor;

    /** The secondary brand color for the profile. */
    @SerializedName("secondary_color")
    String secondaryColor;

    /**
     * For more details about Icon, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Icon extends StripeObject {
      /** The original image. */
      @SerializedName("original")
      String original;
    }

    /**
     * For more details about Logo, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Logo extends StripeObject {
      /** The original image. */
      @SerializedName("original")
      String original;
    }
  }
}
