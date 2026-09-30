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

  /** The object related to the activity log entry. */
  @SerializedName("related_object")
  RelatedObject relatedObject;

  /** The API request that instigated the action. */
  @SerializedName("request")
  Request request;

  /**
   * The type of action that was performed.
   *
   * <p>One of {@code anomaly_detection_settings_updated}, {@code api_key_created}, {@code
   * api_key_deleted}, {@code api_key_updated}, {@code api_key_viewed}, {@code issuing_activated},
   * {@code issuing_balance_transfer_created}, {@code issuing_cardholder_created}, {@code
   * issuing_cardholder_updated}, {@code issuing_card_created}, {@code
   * issuing_card_sensitive_details_viewed}, {@code issuing_card_updated}, {@code
   * issuing_dispute_created}, {@code issuing_dispute_submitted}, {@code issuing_dispute_updated},
   * {@code manual_payouts_disabled}, {@code manual_payouts_enabled}, {@code
   * payout_destination_added}, {@code payout_destination_removed}, {@code
   * payout_destination_updated}, {@code payout_schedule_edits_disabled}, {@code
   * payout_schedule_edits_enabled}, {@code scim_group_deleted}, {@code scim_group_member_added},
   * {@code scim_group_member_removed}, {@code scim_group_roles_updated}, {@code
   * scim_group_updated}, {@code sso_domain_verified}, {@code sso_settings_created}, {@code
   * sso_settings_deleted}, {@code sso_settings_updated}, {@code
   * two_step_authentication_mandate_disabled}, {@code two_step_authentication_mandate_enabled},
   * {@code user_access_started}, {@code user_auth_challenge_failed}, {@code user_email_changed},
   * {@code user_email_verified}, {@code user_express_phone_number_changed}, {@code
   * user_google_account_connected}, {@code user_google_account_disconnected}, {@code
   * user_invite_accepted}, {@code user_invite_created}, {@code user_invite_deleted}, {@code
   * user_passkey_added}, {@code user_passkey_removed}, {@code user_passkey_updated}, {@code
   * user_passkey_upgraded}, {@code user_password_changed}, {@code user_password_initialized},
   * {@code user_password_reset_failed}, {@code user_password_reset_requested}, {@code
   * user_password_reset_succeeded}, {@code user_roles_deleted}, {@code user_roles_updated}, {@code
   * user_two_step_authentication_backup_code_used}, {@code
   * user_two_step_authentication_method_added}, {@code
   * user_two_step_authentication_method_removed}, {@code
   * user_two_step_authentication_method_reset}, {@code
   * user_two_step_authentication_method_updated}, or {@code
   * user_two_step_authentication_reset_requested}.
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
     * <p>One of {@code api_key}, {@code stripe_action}, or {@code user}.
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
    /** Details of an account security action. */
    @SerializedName("account_security")
    AccountSecurity accountSecurity;

    /** Details of an API key action. */
    @SerializedName("api_key")
    ApiKey apiKey;

    /** Details of an authentication action. */
    @SerializedName("authentication")
    Authentication authentication;

    /** Details of a SCIM action. */
    @SerializedName("scim")
    Scim scim;

    /** Details of an SSO action. */
    @SerializedName("sso")
    Sso sso;

    /**
     * The action group type of the activity log entry.
     *
     * <p>One of {@code account_security}, {@code api_key}, {@code authentication}, {@code issuing},
     * {@code payout}, {@code scim}, {@code sso}, {@code user_access}, {@code user_invite}, {@code
     * user_profile}, or {@code user_roles}.
     */
    @SerializedName("type")
    String type;

    /** Details of a user access action. */
    @SerializedName("user_access")
    UserAccess userAccess;

    /** Details of a user invite action. */
    @SerializedName("user_invite")
    UserInvite userInvite;

    /** Details of a user profile action. */
    @SerializedName("user_profile")
    UserProfile userProfile;

    /** Details of a user role change action. */
    @SerializedName("user_roles")
    UserRoles userRoles;

    /** Details of an account security action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountSecurity extends StripeObject {
      /** Anomaly detection settings after the change. */
      @SerializedName("new_anomaly_settings")
      NewAnomalySettings newAnomalySettings;

      /** Anomaly detection settings before the change. */
      @SerializedName("old_anomaly_settings")
      OldAnomalySettings oldAnomalySettings;

      /** Anomaly detection settings after the change. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NewAnomalySettings extends StripeObject {
        /** Whether dormant API key protection is enabled. */
        @SerializedName("dormant_api_key_protection_enabled")
        Boolean dormantApiKeyProtectionEnabled;

        /** Whether money movement anomaly detection is enabled. */
        @SerializedName("money_movement_anomaly_detection_enabled")
        Boolean moneyMovementAnomalyDetectionEnabled;

        /** Whether request-level anomaly detection is enabled. */
        @SerializedName("request_level_anomaly_detection_enabled")
        Boolean requestLevelAnomalyDetectionEnabled;
      }

      /** Anomaly detection settings before the change. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OldAnomalySettings extends StripeObject {
        /** Whether dormant API key protection is enabled. */
        @SerializedName("dormant_api_key_protection_enabled")
        Boolean dormantApiKeyProtectionEnabled;

        /** Whether money movement anomaly detection is enabled. */
        @SerializedName("money_movement_anomaly_detection_enabled")
        Boolean moneyMovementAnomalyDetectionEnabled;

        /** Whether request-level anomaly detection is enabled. */
        @SerializedName("request_level_anomaly_detection_enabled")
        Boolean requestLevelAnomalyDetectionEnabled;
      }
    }

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

    /** Details of an authentication action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Authentication extends StripeObject {
      /** Backup email address involved in the authentication. */
      @SerializedName("backup_email")
      String backupEmail;

      /**
       * Type of challenge used for the authentication.
       *
       * <p>One of {@code external_account_code}, {@code oauth}, {@code previous_account_number},
       * {@code reverse_sms}, {@code sms}, {@code stripe_identity}, {@code totp}, or {@code
       * webauthn}.
       */
      @SerializedName("challenge_type")
      String challengeType;

      /**
       * Surface where the authentication occurred.
       *
       * <p>One of {@code dashboard}, or {@code express}.
       */
      @SerializedName("surface")
      String surface;

      /** Target email address involved in the authentication. */
      @SerializedName("target_email")
      String targetEmail;
    }

    /** Details of a SCIM action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Scim extends StripeObject {
      /** Name of the SCIM group. */
      @SerializedName("group_name")
      String groupName;

      /**
       * Group roles after the change; only set for the group roles-updated action
       * (scim_group_roles_updated).
       */
      @SerializedName("new_roles")
      List<String> newRoles;

      /**
       * Group roles before the change; only set for the group roles-updated action
       * (scim_group_roles_updated).
       */
      @SerializedName("old_roles")
      List<String> oldRoles;

      /** The context the roles were assigned in. */
      @SerializedName("role_assigned_context")
      String roleAssignedContext;

      /** Email address of the affected member. */
      @SerializedName("user_email")
      String userEmail;
    }

    /** Details of an SSO action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sso extends StripeObject {
      /**
       * SSO enforcement level.
       *
       * <p>One of {@code off}, {@code optional}, or {@code required}.
       */
      @SerializedName("mandate")
      String mandate;
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

    /** Details of a user profile action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserProfile extends StripeObject {
      /** Email address after the change. */
      @SerializedName("new_email")
      String newEmail;

      /** Redacted phone number after the change. */
      @SerializedName("new_redacted_phone_number")
      String newRedactedPhoneNumber;

      /** Email address before the change. */
      @SerializedName("old_email")
      String oldEmail;

      /** Redacted phone number before the change. */
      @SerializedName("old_redacted_phone_number")
      String oldRedactedPhoneNumber;
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

  /** The object related to the activity log entry. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RelatedObject extends StripeObject implements HasId {
    /** Unique identifier of the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * Type of the object.
     *
     * <p>One of {@code balance_transfer}, {@code bank_account}, {@code blockchain_address}, {@code
     * card}, {@code issuing.card}, {@code issuing.cardholder}, or {@code issuing.dispute}.
     */
    @SerializedName("type")
    String type;
  }

  /** The API request that instigated the action. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Request extends StripeObject implements HasId {
    /** ID of the API request. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;
  }
}
