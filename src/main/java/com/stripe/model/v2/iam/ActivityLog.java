// File generated from our OpenAPI spec
package com.stripe.model.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An activity log records a single action performed on an account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ActivityLog extends StripeObject implements HasId {
  /** The actor that performed the action. */
  @SerializedName("actor")
  Actor actor;

  /** The account on which the action was performed. */
  @SerializedName("context")
  String context;

  /** Timestamp when the activity log entry was created. */
  @SerializedName("created")
  Instant created;

  /** Action-specific details of the activity log entry. */
  @SerializedName("details")
  Details details;

  /** Unique identifier of the activity log entry. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the action was performed in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.iam.activity_log}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of action that was performed.
   *
   * <p>One of {@code api_key_created}, {@code api_key_deleted}, {@code api_key_updated}, {@code
   * api_key_viewed}, {@code user_access_started}, {@code user_invite_accepted}, {@code
   * user_invite_created}, {@code user_invite_deleted}, {@code user_roles_deleted}, or {@code
   * user_roles_updated}.
   */
  @SerializedName("type")
  String type;

  /** The actor that performed the action. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Actor extends StripeObject {
    /** Set when the actor is an API key. */
    @SerializedName("api_key")
    ApiKey apiKey;

    /**
     * The type of actor.
     *
     * <p>One of {@code api_key}, or {@code user}.
     */
    @SerializedName("type")
    String type;

    /** Set when the actor is a user. */
    @SerializedName("user")
    User user;

    /** Set when the actor is an API key. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApiKey extends StripeObject implements HasId {
      /** Unique identifier of the API key. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;
    }

    /** Set when the actor is a user. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class User extends StripeObject {
      /** Email address of the user. */
      @SerializedName("email")
      String email;
    }
  }

  /** Action-specific details of the activity log entry. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Details extends StripeObject {
    /** Details of an API key action. */
    @SerializedName("api_key")
    ApiKey apiKey;

    /**
     * The action group type of the activity log entry.
     *
     * <p>One of {@code api_key}, {@code user_access}, {@code user_invite}, or {@code user_roles}.
     */
    @SerializedName("type")
    String type;

    /** Details of a user access action. */
    @SerializedName("user_access")
    UserAccess userAccess;

    /** Details of a user invite action. */
    @SerializedName("user_invite")
    UserInvite userInvite;

    /** Details of a user role change action. */
    @SerializedName("user_roles")
    UserRoles userRoles;

    /** Details of an API key action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApiKey extends StripeObject implements HasId {
      /** Timestamp when the API key was created. */
      @SerializedName("created")
      Instant created;

      /** Timestamp when the API key expires. */
      @SerializedName("expires_at")
      Instant expiresAt;

      /** Unique identifier of the API key. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** List of IP addresses allowed to use this API key. */
      @SerializedName("ip_allowlist")
      List<String> ipAllowlist;

      /** Information about the entity managing this API key. */
      @SerializedName("managed_by")
      ManagedBy managedBy;

      /** Name of the API key. */
      @SerializedName("name")
      String name;

      /** Unique identifier of the new API key, set when this key was rotated. */
      @SerializedName("new_key")
      String newKey;

      /** Note or description for the API key. */
      @SerializedName("note")
      String note;

      /**
       * Type of the API key.
       *
       * <p>One of {@code publishable_key}, or {@code secret_key}.
       */
      @SerializedName("type")
      String type;

      /** Information about the entity managing this API key. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ManagedBy extends StripeObject {
        /** An application. */
        @SerializedName("application")
        Application application;

        /**
         * The type of entity.
         *
         * <p>Equal to {@code application}.
         */
        @SerializedName("type")
        String type;

        /** An application. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Application extends StripeObject implements HasId {
          /** Identifier of the application. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }
      }
    }

    /** Details of a user access action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserAccess extends StripeObject {
      /** Authentication details for the user access action. */
      @SerializedName("authentication")
      Authentication authentication;

      /** Dashboard client details for the user access action. */
      @SerializedName("dashboard_client")
      DashboardClient dashboardClient;

      /** Timestamp when the user access expires. */
      @SerializedName("expires_at")
      Instant expiresAt;

      /** Network details for the user access action. */
      @SerializedName("network")
      Network network;

      /** Risk details for the user access action. */
      @SerializedName("risk")
      Risk risk;

      /** Roles associated with the user access action. */
      @SerializedName("roles")
      List<String> roles;

      /** Session fingerprint for the user access action. */
      @SerializedName("session_fingerprint")
      String sessionFingerprint;

      /**
       * Surface where the user access action started.
       *
       * <p>One of {@code dashboard}, or {@code express}.
       */
      @SerializedName("surface")
      String surface;

      /** Authentication details for the user access action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Authentication extends StripeObject {
        /** Primary authentication factor. */
        @SerializedName("primary_factor")
        PrimaryFactor primaryFactor;

        /** Secondary authentication factors. */
        @SerializedName("secondary_factors")
        List<ActivityLog.Details.UserAccess.Authentication.SecondaryFactor> secondaryFactors;

        /** Primary authentication factor. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryFactor extends StripeObject {
          /** SSO provider for the authentication factor. */
          @SerializedName("sso_provider")
          String ssoProvider;

          /**
           * Type of authentication factor.
           *
           * <p>One of {@code backup_code}, {@code email_code}, {@code oauth}, {@code passkey},
           * {@code password}, {@code phone_code}, {@code saml}, {@code sms}, {@code totp}, or
           * {@code web_authn}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about SecondaryFactor, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SecondaryFactor extends StripeObject {
          /** SSO provider for the authentication factor. */
          @SerializedName("sso_provider")
          String ssoProvider;

          /**
           * Type of authentication factor.
           *
           * <p>One of {@code backup_code}, {@code email_code}, {@code oauth}, {@code passkey},
           * {@code password}, {@code phone_code}, {@code saml}, {@code sms}, {@code totp}, or
           * {@code web_authn}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** Dashboard client details for the user access action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DashboardClient extends StripeObject {
        /** Browser used for the user access action. */
        @SerializedName("browser")
        String browser;

        /** Browser version used for the user access action. */
        @SerializedName("browser_version")
        String browserVersion;

        /** Device type used for the user access action. */
        @SerializedName("device_type")
        String deviceType;

        /** Operating system used for the user access action. */
        @SerializedName("os")
        String os;
      }

      /** Network details for the user access action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Network extends StripeObject {
        /** City for the user access action. */
        @SerializedName("city")
        String city;

        /** Country for the user access action. */
        @SerializedName("country")
        String country;

        /** IP address for the user access action. */
        @SerializedName("ip_address")
        String ipAddress;

        /** Region for the user access action. */
        @SerializedName("region")
        String region;
      }

      /** Risk details for the user access action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Risk extends StripeObject {
        /**
         * Risk level for the user access action.
         *
         * <p>One of {@code high}, {@code low}, or {@code medium}.
         */
        @SerializedName("level")
        String level;

        /** Risk signals for the user access action. */
        @SerializedName("signals")
        List<ActivityLog.Details.UserAccess.Risk.Signal> signals;

        /**
         * For more details about Signal, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Signal extends StripeObject {
          /** The user access action used a novel device. */
          @SerializedName("novel_device")
          NovelDevice novelDevice;

          /**
           * Type of risk signal.
           *
           * <p>Equal to {@code novel_device}.
           */
          @SerializedName("type")
          String type;

          /** The user access action used a novel device. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class NovelDevice extends StripeObject {}
        }
      }
    }

    /** Details of a user invite action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserInvite extends StripeObject {
      /** Email address of the invited user. */
      @SerializedName("invited_user_email")
      String invitedUserEmail;

      /** Roles assigned to the invited user. */
      @SerializedName("roles")
      List<String> roles;
    }

    /** Details of a user role change action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserRoles extends StripeObject {
      /** Roles the user has after the change. */
      @SerializedName("new_roles")
      List<String> newRoles;

      /** Roles the user had before the change. */
      @SerializedName("old_roles")
      List<String> oldRoles;

      /**
       * Source of the role change.
       *
       * <p>One of {@code dashboard}, {@code scim}, or {@code sso}.
       */
      @SerializedName("source")
      String source;

      /** Email address of the user whose roles were changed. */
      @SerializedName("user_email")
      String userEmail;
    }
  }
}
