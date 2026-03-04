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
  @SerializedName("branding")
  Branding branding;

  @SerializedName("description")
  String description;

  @SerializedName("display_name")
  String displayName;

  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("object")
  String object;

  @SerializedName("url")
  String url;

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
    @SerializedName("icon")
    Icon icon;

    @SerializedName("logo")
    Logo logo;

    @SerializedName("primary_color")
    String primaryColor;

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
      @SerializedName("original")
      String original;
    }
  }
}
