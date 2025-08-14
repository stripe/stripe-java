// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountLink extends StripeObject {
  /** The ID of the Account the link was created for. */
  @SerializedName("account")
  String account;

  /** The timestamp at which this AccountLink was created. */
  @SerializedName("created")
  Instant created;

  /** The timestamp at which this AccountLink will expire. */
  @SerializedName("expires_at")
  Instant expiresAt;

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
   * <p>Equal to {@code account_link}.
   */
  @SerializedName("object")
  String object;

  /** The URL for the AccountLink. */
  @SerializedName("url")
  String url;

  /** The use case of AccountLink the user is requesting. */
  @SerializedName("use_case")
  UseCase useCase;

  /**
   * For more details about UseCase, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UseCase extends StripeObject {
    /** Indicates that the AccountLink provided should onboard an account. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /** Indicates that the AccountLink provided should update a previously onboarded account. */
    @SerializedName("account_update")
    AccountUpdate accountUpdate;

    /**
     * Open Enum. The type of AccountLink the user is requesting.
     *
     * <p>One of {@code account_onboarding}, or {@code account_update}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about AccountOnboarding, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding extends StripeObject {
      /**
       * Open Enum. A v2/account can be configured to enable certain functionality. The
       * configuration param targets the v2/account_link to collect information for the specified
       * v2/account configuration/s.
       */
      @SerializedName("configurations")
      List<String> configurations;

      /**
       * The URL the user will be redirected to if the AccountLink is expired, has been used, or is
       * otherwise invalid. The URL you specify should attempt to generate a new AccountLink with
       * the same parameters used to create the original AccountLink, then redirect the user to the
       * new AccountLink’s URL so they can continue the flow. If a new AccountLink cannot be
       * generated or the redirect fails you should display a useful error to the user. Please make
       * sure to implement authentication before redirecting the user in case this URL is leaked to
       * a third party.
       */
      @SerializedName("refresh_url")
      String refreshUrl;

      /** The URL that the user will be redirected to upon completing the linked flow. */
      @SerializedName("return_url")
      String returnUrl;
    }

    /**
     * For more details about AccountUpdate, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountUpdate extends StripeObject {
      /**
       * Open Enum. A v2/account can be configured to enable certain functionality. The
       * configuration param targets the v2/account_link to collect information for the specified
       * v2/account configuration/s.
       */
      @SerializedName("configurations")
      List<String> configurations;

      /**
       * The URL the user will be redirected to if the AccountLink is expired, has been used, or is
       * otherwise invalid. The URL you specify should attempt to generate a new AccountLink with
       * the same parameters used to create the original AccountLink, then redirect the user to the
       * new AccountLink’s URL so they can continue the flow. If a new AccountLink cannot be
       * generated or the redirect fails you should display a useful error to the user. Please make
       * sure to implement authentication before redirecting the user in case this URL is leaked to
       * a third party.
       */
      @SerializedName("refresh_url")
      String refreshUrl;

      /** The URL that the user will be redirected to upon completing the linked flow. */
      @SerializedName("return_url")
      String returnUrl;
    }
  }
}
