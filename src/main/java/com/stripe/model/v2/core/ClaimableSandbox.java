// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A claimable sandbox is a Stripe sandbox that a user can claim into a new or existing Stripe
 * account through an onboarding link. You can prefill it with an email address, sandbox name, and
 * country. Claimable sandboxes have 60 days to be claimed. After this expiration time has passed,
 * if the sandbox is not claimed, it will be deleted.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandbox extends StripeObject implements HasId {
  /**
   * The distribution channel used to pre-install your Stripe App on the claimable sandbox. Use
   * {@code testing} to install your app's external test version or {@code public} to install its
   * published version.
   *
   * <p>One of {@code public}, or {@code testing}.
   */
  @SerializedName("channel")
  String channel;

  /**
   * Time at which the sandbox was claimed. Set when the status is {@code claimed} or {@code live}.
   * Represented as an RFC 3339 timestamp in UTC with millisecond precision, for example {@code
   * 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("claimed_at")
  Instant claimedAt;

  /**
   * Time at which the sandbox was created. Represented as an RFC 3339 timestamp in UTC with
   * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /**
   * Time at which the unclaimed sandbox expires. Null when the status is {@code claimed} or {@code
   * live}. Represented as an RFC 3339 timestamp in UTC with millisecond precision, for example
   * {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** Unique identifier for the claimable sandbox. */
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
   * <p>Equal to {@code v2.core.claimable_sandbox}.
   */
  @SerializedName("object")
  String object;

  /**
   * Details about the onboarding link. Null when the sandbox status is {@code live} or {@code
   * expired}.
   */
  @SerializedName("onboarding_link_details")
  OnboardingLinkDetails onboardingLinkDetails;

  /**
   * Details about the live mode owner account of the sandbox. This will be null until the sandbox
   * is claimed.
   */
  @SerializedName("owner_details")
  OwnerDetails ownerDetails;

  /**
   * Values prefilled during the creation of the sandbox. When a user claims the sandbox, they will
   * be able to update these values.
   */
  @SerializedName("prefill")
  Prefill prefill;

  /** Data about the Stripe sandbox object. */
  @SerializedName("sandbox_details")
  SandboxDetails sandboxDetails;

  /**
   * Status of the sandbox.
   *
   * <p>One of {@code claimed}, {@code expired}, {@code live}, or {@code unclaimed}.
   */
  @SerializedName("status")
  String status;

  /**
   * Details about the onboarding link. Null when the sandbox status is {@code live} or {@code
   * expired}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OnboardingLinkDetails extends StripeObject {
    /**
     * Time at which the onboarding link expires. Represented as an RFC 3339 timestamp in UTC with
     * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
     */
    @SerializedName("expires_at")
    Instant expiresAt;

    /**
     * The URL the user will be redirected to if the onboarding link is expired or invalid. The URL
     * specified should attempt to generate a new onboarding link, and re-direct the user to this
     * new onboarding link so that they can proceed with the onboarding flow.
     */
    @SerializedName("refresh_url")
    String refreshUrl;

    /** The URL offered to the user as a way back to your app after they claim the sandbox. */
    @SerializedName("return_url")
    String returnUrl;

    /**
     * The URL that lets a user claim the sandbox or continue onboarding their Stripe account,
     * depending on the sandbox's status.
     */
    @SerializedName("url")
    String url;
  }

  /**
   * Details about the live mode owner account of the sandbox. This will be null until the sandbox
   * is claimed.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OwnerDetails extends StripeObject {
    /**
     * The ID of the live mode Stripe account that owns the sandbox. This field is only set when
     * {@code owner_details.app_install_status} is {@code installed}.
     */
    @SerializedName("account")
    String account;

    /**
     * Indicates whether the platform app is installed on the sandbox’s live mode owner account.
     *
     * <p>One of {@code installed}, {@code pending_install}, or {@code pending_onboarding}.
     */
    @SerializedName("app_install_status")
    String appInstallStatus;
  }

  /**
   * Values prefilled during the creation of the sandbox. When a user claims the sandbox, they will
   * be able to update these values.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Prefill extends StripeObject {
    /**
     * Country in which the account holder resides, or in which the business is legally established.
     * Use two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    String country;

    /**
     * Email address of the user who will claim the sandbox. Stripe sends this address an invitation
     * to claim the sandbox and a reminder before the unclaimed sandbox expires.
     */
    @SerializedName("email")
    String email;

    /** Name for the sandbox. */
    @SerializedName("name")
    String name;
  }

  /** Data about the Stripe sandbox object. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SandboxDetails extends StripeObject {
    /** The sandbox's Stripe account ID. */
    @SerializedName("account")
    String account;

    /**
     * Keys that can be used to set up an integration for this sandbox and operate on the account.
     * Present in the create response. To fetch this field in the retrieve response, pass {@code
     * sandbox_details.api_keys} in the {@code include} parameter.
     */
    @SerializedName("api_keys")
    ApiKeys apiKeys;

    /**
     * Keys that can be used to set up an integration for this sandbox and operate on the account.
     * Present in the create response. To fetch this field in the retrieve response, pass {@code
     * sandbox_details.api_keys} in the {@code include} parameter.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApiKeys extends StripeObject {
      /**
       * Object hash for the sandbox's MCP key. Null unless {@code enable_mcp_access: true} was
       * passed in the creation request.
       */
      @SerializedName("mcp")
      Mcp mcp;

      /** Object hash for the sandbox's publishable key. */
      @SerializedName("publishable")
      Publishable publishable;

      /** Object hash for the sandbox's secret key. */
      @SerializedName("secret")
      Secret secret;

      /**
       * Object hash for the sandbox's MCP key. Null unless {@code enable_mcp_access: true} was
       * passed in the creation request.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Mcp extends StripeObject implements HasId {
        /**
         * Time at which the API key was created. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("created")
        Instant created;

        /**
         * Time at which the API key expires. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** Unique identifier of the API key. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * Token for the secret key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @SerializedName("secret_key")
        SecretKey secretKey;

        /**
         * Current status of the API key.
         *
         * <p>One of {@code active}, or {@code expired}.
         */
        @SerializedName("status")
        String status;

        /**
         * Type of the API key.
         *
         * <p>Equal to {@code secret_key}.
         */
        @SerializedName("type")
        String type;

        /**
         * Token for the secret key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SecretKey extends StripeObject {
          /** The plaintext token for the API key. */
          @SerializedName("token")
          String token;
        }
      }

      /** Object hash for the sandbox's publishable key. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Publishable extends StripeObject implements HasId {
        /**
         * Time at which the API key was created. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("created")
        Instant created;

        /**
         * Time at which the API key expires. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** Unique identifier of the API key. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * Token for the publishable key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @SerializedName("publishable_key")
        PublishableKey publishableKey;

        /**
         * Current status of the API key.
         *
         * <p>One of {@code active}, or {@code expired}.
         */
        @SerializedName("status")
        String status;

        /**
         * Type of the API key.
         *
         * <p>Equal to {@code publishable_key}.
         */
        @SerializedName("type")
        String type;

        /**
         * Token for the publishable key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PublishableKey extends StripeObject {
          /** The plaintext token for the API key. */
          @SerializedName("token")
          String token;
        }
      }

      /** Object hash for the sandbox's secret key. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Secret extends StripeObject implements HasId {
        /**
         * Time at which the API key was created. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("created")
        Instant created;

        /**
         * Time at which the API key expires. Represented as an RFC 3339 timestamp in UTC with
         * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
         */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** Unique identifier of the API key. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /**
         * Token for the secret key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @SerializedName("secret_key")
        SecretKey secretKey;

        /**
         * Current status of the API key.
         *
         * <p>One of {@code active}, or {@code expired}.
         */
        @SerializedName("status")
        String status;

        /**
         * Type of the API key.
         *
         * <p>Equal to {@code secret_key}.
         */
        @SerializedName("type")
        String type;

        /**
         * Token for the secret key. Present only in the create response; null in subsequent
         * retrieve responses.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SecretKey extends StripeObject {
          /** The plaintext token for the API key. */
          @SerializedName("token")
          String token;
        }
      }
    }
  }
}
