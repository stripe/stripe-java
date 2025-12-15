// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Account Links let a platform create a temporary, single-use URL that an account can use to access
 * a Stripe-hosted flow for collecting or updating required information.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountLink extends StripeObject {
  /** The ID of the connected account this Account Link applies to. */
  @SerializedName("account")
  String account;

  /** The timestamp at which this Account Link was created. */
  @SerializedName("created")
  Instant created;

  /** The timestamp at which this Account Link will expire. */
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
   * <p>Equal to {@code v2.core.account_link}.
   */
  @SerializedName("object")
  String object;

  /** The URL at which the account can access the Stripe-hosted flow. */
  @SerializedName("url")
  String url;

  /** Hash containing usage options. */
  @SerializedName("use_case")
  UseCase useCase;

  /** Hash containing usage options. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UseCase extends StripeObject {
    /**
     * Hash containing configuration options for an Account Link object that onboards a new account.
     */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /**
     * Hash containing configuration options for an Account Link that updates an existing account.
     */
    @SerializedName("account_update")
    AccountUpdate accountUpdate;

    /**
     * Open Enum. The type of Account Link the user is requesting.
     *
     * <p>One of {@code account_onboarding}, or {@code account_update}.
     */
    @SerializedName("type")
    String type;

    /**
     * Hash containing configuration options for an Account Link object that onboards a new account.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding extends StripeObject {
      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @SerializedName("collection_options")
      CollectionOptions collectionOptions;

      /**
       * Open Enum. A v2/core/account can be configured to enable certain functionality. The
       * configuration param targets the v2/core/account_link to collect information for the
       * specified v2/core/account configuration/s.
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

      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CollectionOptions extends StripeObject {
        /**
         * Specifies whether the platform collects only currently_due requirements ({@code
         * currently_due}) or both currently_due and eventually_due requirements ({@code
         * eventually_due}). If you don’t specify collection_options, the default value is
         * currently_due.
         *
         * <p>One of {@code currently_due}, or {@code eventually_due}.
         */
        @SerializedName("fields")
        String fields;

        /**
         * Specifies whether the platform collects future_requirements in addition to requirements
         * in Connect Onboarding. The default value is {@code omit}.
         *
         * <p>One of {@code include}, or {@code omit}.
         */
        @SerializedName("future_requirements")
        String futureRequirements;
      }
    }

    /**
     * Hash containing configuration options for an Account Link that updates an existing account.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountUpdate extends StripeObject {
      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @SerializedName("collection_options")
      CollectionOptions collectionOptions;

      /**
       * Open Enum. A v2/account can be configured to enable certain functionality. The
       * configuration param targets the v2/account_link to collect information for the specified
       * v2/account configuration/s.
       */
      @SerializedName("configurations")
      List<String> configurations;

      /**
       * The URL the user will be redirected to if the Account Link is expired, has been used, or is
       * otherwise invalid. The URL you specify should attempt to generate a new Account Link with
       * the same parameters used to create the original Account Link, then redirect the user to the
       * new Account Link URL so they can continue the flow. Make sure to authenticate the user
       * before redirecting to the new Account Link, in case the URL leaks to a third party. If a
       * new Account Link can't be generated, or if the redirect fails, you should display a useful
       * error to the user.
       */
      @SerializedName("refresh_url")
      String refreshUrl;

      /** The URL that the user will be redirected to upon completing the linked flow. */
      @SerializedName("return_url")
      String returnUrl;

      /**
       * Specifies the requirements that Stripe collects from v2/core/accounts in the Onboarding
       * flow.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CollectionOptions extends StripeObject {
        /**
         * Specifies whether the platform collects only currently_due requirements ({@code
         * currently_due}) or both currently_due and eventually_due requirements ({@code
         * eventually_due}). The default value is {@code currently_due}.
         *
         * <p>One of {@code currently_due}, or {@code eventually_due}.
         */
        @SerializedName("fields")
        String fields;

        /**
         * Specifies whether the platform collects future_requirements in addition to requirements
         * in Connect Onboarding. The default value is {@code omit}.
         *
         * <p>One of {@code include}, or {@code omit}.
         */
        @SerializedName("future_requirements")
        String futureRequirements;
      }
    }
  }
}
