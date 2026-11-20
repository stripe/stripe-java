// File generated from our OpenAPI spec
package com.stripe.model.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
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
   * api_key_deleted}, {@code api_key_updated}, {@code api_key_viewed}, {@code
   * application_authorized}, {@code application_created}, {@code application_deauthorized}, {@code
   * app_installed}, {@code app_uninstalled}, {@code connect_express_branding_updated}, {@code
   * connect_oauth_disabled}, {@code connect_oauth_enabled}, {@code connect_settings_updated},
   * {@code connect_site_link_updated}, {@code data_export_requested}, {@code
   * event_destination_added}, {@code event_destination_removed}, {@code event_destination_updated},
   * {@code issuing_activated}, {@code issuing_balance_transfer_created}, {@code
   * issuing_cardholder_created}, {@code issuing_cardholder_updated}, {@code issuing_card_created},
   * {@code issuing_card_sensitive_details_viewed}, {@code issuing_card_updated}, {@code
   * issuing_dispute_created}, {@code issuing_dispute_submitted}, {@code issuing_dispute_updated},
   * {@code manual_payouts_disabled}, {@code manual_payouts_enabled}, {@code
   * payout_destination_added}, {@code payout_destination_removed}, {@code
   * payout_destination_updated}, {@code payout_schedule_edits_disabled}, {@code
   * payout_schedule_edits_enabled}, {@code payout_schedule_updated}, {@code
   * radar_adaptive_3ds_disabled}, {@code radar_dynamic_risk_thresholds_disabled}, {@code
   * radar_early_fraud_warning_disabled}, {@code radar_for_setup_intents_disabled}, {@code
   * radar_fraud_dispute_protection_disabled}, {@code radar_rule_added}, {@code
   * radar_rule_disabled}, {@code radar_rule_enabled}, {@code radar_rule_removed}, {@code
   * radar_rule_updated}, {@code scim_group_deleted}, {@code scim_group_member_added}, {@code
   * scim_group_member_removed}, {@code scim_group_roles_updated}, {@code scim_group_updated},
   * {@code sso_domain_verified}, {@code sso_settings_created}, {@code sso_settings_deleted}, {@code
   * sso_settings_updated}, {@code stripe_access_started}, {@code
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

    /** Set when a display name is available for an action performed by Stripe. */
    @SerializedName("stripe_action")
    StripeAction stripeAction;

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

    /** Set when a display name is available for an action performed by Stripe. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAction extends StripeObject {
      /** Public display name captured when the action occurs. */
      @SerializedName("display_name")
      String displayName;
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

    /** Details of a Connect action. */
    @SerializedName("connect")
    Connect connect;

    /** Details of a data export action. */
    @SerializedName("data_export")
    DataExport dataExport;

    /** Details of an event destination action. */
    @SerializedName("event_destination")
    EventDestination eventDestination;

    /** Details of a Radar action. */
    @SerializedName("radar")
    Radar radar;

    /** Details of a SCIM action. */
    @SerializedName("scim")
    Scim scim;

    /** Details of an SSO action. */
    @SerializedName("sso")
    Sso sso;

    /** Details of a Stripe access action. */
    @SerializedName("stripe_access")
    StripeAccess stripeAccess;

    /**
     * The action group type of the activity log entry.
     *
     * <p>One of {@code account_security}, {@code api_key}, {@code app}, {@code authentication},
     * {@code connect}, {@code data_export}, {@code event_destination}, {@code issuing}, {@code
     * payout}, {@code radar}, {@code scim}, {@code sso}, {@code stripe_access}, {@code
     * user_access}, {@code user_invite}, {@code user_profile}, or {@code user_roles}.
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

    /** Details of a Connect action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Connect extends StripeObject {
      /** The Connect application. */
      @SerializedName("application")
      Application application;

      /**
       * Express Dashboard branding settings after the change. Set for the
       * connect_express_branding_updated action.
       */
      @SerializedName("new_express_branding_settings")
      NewExpressBrandingSettings newExpressBrandingSettings;

      /** Connect settings after the change. Set for the connect_settings_updated action. */
      @SerializedName("new_settings")
      NewSettings newSettings;

      /**
       * Express Dashboard branding settings before the change. Set for the
       * connect_express_branding_updated action.
       */
      @SerializedName("old_express_branding_settings")
      OldExpressBrandingSettings oldExpressBrandingSettings;

      /** Connect settings before the change. Set for the connect_settings_updated action. */
      @SerializedName("old_settings")
      OldSettings oldSettings;

      /**
       * The site link route. Set for the connect_site_link_updated action.
       *
       * <p>One of {@code account_management}, {@code balances}, {@code documents}, {@code
       * financial_accounts}, {@code issuing_card_transactions}, {@code notification_banner}, {@code
       * payments}, or {@code payouts}.
       */
      @SerializedName("site_link_route")
      String siteLinkRoute;

      /** The Connect application. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Application extends StripeObject implements HasId {
        /** Identifier of the application. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;
      }

      /**
       * Express Dashboard branding settings after the change. Set for the
       * connect_express_branding_updated action.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NewExpressBrandingSettings extends StripeObject {
        /** Border radius for the Express Dashboard. */
        @SerializedName("border_radius")
        String borderRadius;

        /** Primary button background color for the Express Dashboard. */
        @SerializedName("primary_button_background_color")
        String primaryButtonBackgroundColor;

        /** Primary color for the Express Dashboard. */
        @SerializedName("primary_color")
        String primaryColor;

        /** Secondary button background color for the Express Dashboard. */
        @SerializedName("secondary_button_background_color")
        String secondaryButtonBackgroundColor;
      }

      /** Connect settings after the change. Set for the connect_settings_updated action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NewSettings extends StripeObject {
        /**
         * The display name shown on the onboarding experience and Dashboard. This is different from
         * the business legal name.
         */
        @SerializedName("business_name")
        String businessName;

        /**
         * Whether platform branding is copied to new connected accounts. These also appear on
         * invoices, receipts, and other Stripe products.
         */
        @SerializedName("copy_platform_branding_to_new_connected_accounts")
        Boolean copyPlatformBrandingToNewConnectedAccounts;

        /** Whether the support email is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_email")
        Boolean hideOnboardingSupportEmail;

        /** Whether the support phone number is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_phone")
        Boolean hideOnboardingSupportPhone;

        /** Whether the support URL is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_url")
        Boolean hideOnboardingSupportUrl;

        /** Identifier of the icon file (file_* ID). */
        @SerializedName("icon")
        String icon;

        /** Identifier of the logo file (file_* ID). */
        @SerializedName("logo")
        String logo;

        /**
         * The platform's default payout statement descriptor. It appears on the bank statements of
         * the platform's connected accounts for their payouts.
         */
        @SerializedName("payout_statement_descriptor")
        String payoutStatementDescriptor;

        /**
         * A CSS hex color value representing the primary branding color, applied to the onboarding
         * experience and the Stripe Dashboard.
         */
        @SerializedName("primary_color")
        String primaryColor;

        /**
         * A CSS hex color value representing the secondary branding color, applied to the
         * onboarding experience and the Stripe Dashboard.
         */
        @SerializedName("secondary_color")
        String secondaryColor;
      }

      /**
       * Express Dashboard branding settings before the change. Set for the
       * connect_express_branding_updated action.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OldExpressBrandingSettings extends StripeObject {
        /** Border radius for the Express Dashboard. */
        @SerializedName("border_radius")
        String borderRadius;

        /** Primary button background color for the Express Dashboard. */
        @SerializedName("primary_button_background_color")
        String primaryButtonBackgroundColor;

        /** Primary color for the Express Dashboard. */
        @SerializedName("primary_color")
        String primaryColor;

        /** Secondary button background color for the Express Dashboard. */
        @SerializedName("secondary_button_background_color")
        String secondaryButtonBackgroundColor;
      }

      /** Connect settings before the change. Set for the connect_settings_updated action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OldSettings extends StripeObject {
        /**
         * The display name shown on the onboarding experience and Dashboard. This is different from
         * the business legal name.
         */
        @SerializedName("business_name")
        String businessName;

        /**
         * Whether platform branding is copied to new connected accounts. These also appear on
         * invoices, receipts, and other Stripe products.
         */
        @SerializedName("copy_platform_branding_to_new_connected_accounts")
        Boolean copyPlatformBrandingToNewConnectedAccounts;

        /** Whether the support email is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_email")
        Boolean hideOnboardingSupportEmail;

        /** Whether the support phone number is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_phone")
        Boolean hideOnboardingSupportPhone;

        /** Whether the support URL is hidden on onboarding surfaces. */
        @SerializedName("hide_onboarding_support_url")
        Boolean hideOnboardingSupportUrl;

        /** Identifier of the icon file (file_* ID). */
        @SerializedName("icon")
        String icon;

        /** Identifier of the logo file (file_* ID). */
        @SerializedName("logo")
        String logo;

        /**
         * The platform's default payout statement descriptor. It appears on the bank statements of
         * the platform's connected accounts for their payouts.
         */
        @SerializedName("payout_statement_descriptor")
        String payoutStatementDescriptor;

        /**
         * A CSS hex color value representing the primary branding color, applied to the onboarding
         * experience and the Stripe Dashboard.
         */
        @SerializedName("primary_color")
        String primaryColor;

        /**
         * A CSS hex color value representing the secondary branding color, applied to the
         * onboarding experience and the Stripe Dashboard.
         */
        @SerializedName("secondary_color")
        String secondaryColor;
      }
    }

    /** Details of a data export action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DataExport extends StripeObject {
      /** Name of export type. */
      @SerializedName("type")
      String type;
    }

    /** Details of an event destination action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EventDestination extends StripeObject {
      /**
       * Configuration after the change. Set for added and updated actions, absent for removed
       * actions.
       */
      @SerializedName("new_configuration")
      NewConfiguration newConfiguration;

      /**
       * Configuration before the change. Set for updated and removed actions, absent for added
       * actions.
       */
      @SerializedName("old_configuration")
      OldConfiguration oldConfiguration;

      /**
       * Type of the event destination.
       *
       * <p>One of {@code amazon_eventbridge}, {@code azure_event_grid}, or {@code
       * webhook_endpoint}.
       */
      @SerializedName("type")
      String type;

      /**
       * Configuration after the change. Set for added and updated actions, absent for removed
       * actions.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NewConfiguration extends StripeObject {
        /** Amazon EventBridge configuration. */
        @SerializedName("amazon_eventbridge")
        AmazonEventbridge amazonEventbridge;

        /** Azure Event Grid configuration. */
        @SerializedName("azure_event_grid")
        AzureEventGrid azureEventGrid;

        /**
         * Event types subscribed to by the destination. [&quot;*&quot;] subscribes to all V1
         * webhook events.
         */
        @SerializedName("enabled_events")
        List<String> enabledEvents;

        /**
         * Event source selectors: @self, @accounts, @organization_members,
         * or @organization_members/@accounts.
         */
        @SerializedName("events_from")
        List<String> eventsFrom;

        /**
         * Status of the event destination.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("status")
        String status;

        /** Webhook endpoint configuration. */
        @SerializedName("webhook_endpoint")
        WebhookEndpoint webhookEndpoint;

        /** Amazon EventBridge configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmazonEventbridge extends StripeObject {
          /** AWS account ID configured for the event destination. */
          @SerializedName("aws_account_id")
          String awsAccountId;

          /** ARN of the AWS event source configured for the event destination. */
          @SerializedName("aws_event_source_arn")
          String awsEventSourceArn;

          /** AWS region configured for the event destination. */
          @SerializedName("aws_region")
          String awsRegion;
        }

        /** Azure Event Grid configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AzureEventGrid extends StripeObject {
          /** Azure partner topic name configured for the event destination. */
          @SerializedName("azure_partner_topic_name")
          String azurePartnerTopicName;

          /** Azure region configured for the event destination. */
          @SerializedName("azure_region")
          String azureRegion;

          /** Azure resource group name configured for the event destination. */
          @SerializedName("azure_resource_group_name")
          String azureResourceGroupName;

          /** Azure subscription ID configured for the event destination. */
          @SerializedName("azure_subscription_id")
          String azureSubscriptionId;
        }

        /** Webhook endpoint configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class WebhookEndpoint extends StripeObject {
          /** URL configured for the webhook endpoint. */
          @SerializedName("url")
          String url;
        }
      }

      /**
       * Configuration before the change. Set for updated and removed actions, absent for added
       * actions.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OldConfiguration extends StripeObject {
        /** Amazon EventBridge configuration. */
        @SerializedName("amazon_eventbridge")
        AmazonEventbridge amazonEventbridge;

        /** Azure Event Grid configuration. */
        @SerializedName("azure_event_grid")
        AzureEventGrid azureEventGrid;

        /**
         * Event types subscribed to by the destination. [&quot;*&quot;] subscribes to all V1
         * webhook events.
         */
        @SerializedName("enabled_events")
        List<String> enabledEvents;

        /**
         * Event source selectors: @self, @accounts, @organization_members,
         * or @organization_members/@accounts.
         */
        @SerializedName("events_from")
        List<String> eventsFrom;

        /**
         * Status of the event destination.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("status")
        String status;

        /** Webhook endpoint configuration. */
        @SerializedName("webhook_endpoint")
        WebhookEndpoint webhookEndpoint;

        /** Amazon EventBridge configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmazonEventbridge extends StripeObject {
          /** AWS account ID configured for the event destination. */
          @SerializedName("aws_account_id")
          String awsAccountId;

          /** ARN of the AWS event source configured for the event destination. */
          @SerializedName("aws_event_source_arn")
          String awsEventSourceArn;

          /** AWS region configured for the event destination. */
          @SerializedName("aws_region")
          String awsRegion;
        }

        /** Azure Event Grid configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AzureEventGrid extends StripeObject {
          /** Azure partner topic name configured for the event destination. */
          @SerializedName("azure_partner_topic_name")
          String azurePartnerTopicName;

          /** Azure region configured for the event destination. */
          @SerializedName("azure_region")
          String azureRegion;

          /** Azure resource group name configured for the event destination. */
          @SerializedName("azure_resource_group_name")
          String azureResourceGroupName;

          /** Azure subscription ID configured for the event destination. */
          @SerializedName("azure_subscription_id")
          String azureSubscriptionId;
        }

        /** Webhook endpoint configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class WebhookEndpoint extends StripeObject {
          /** URL configured for the webhook endpoint. */
          @SerializedName("url")
          String url;
        }
      }
    }

    /** Details of a Radar action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Radar extends StripeObject {
      /**
       * Risk preference after a preference switch carried by a protection-toggle action.
       *
       * <p>One of {@code balanced}, {@code custom}, {@code high_growth}, or {@code low_risk}.
       */
      @SerializedName("new_risk_preference")
      String newRiskPreference;

      /**
       * Rules after the change. Set for add, update, enable, and disable actions; absent for remove
       * actions.
       */
      @SerializedName("new_rules")
      List<ActivityLog.Details.Radar.NewRule> newRules;

      /**
       * Risk preference before a preference switch carried by a protection-toggle action.
       *
       * <p>One of {@code balanced}, {@code custom}, {@code high_growth}, or {@code low_risk}.
       */
      @SerializedName("old_risk_preference")
      String oldRiskPreference;

      /**
       * Rules before the change. Set for update, removal, enable, and disable actions; absent for
       * add actions.
       */
      @SerializedName("old_rules")
      List<ActivityLog.Details.Radar.OldRule> oldRules;

      /**
       * For more details about NewRule, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NewRule extends StripeObject implements HasId {
        /**
         * Action performed when the rule matches.
         *
         * <p>One of {@code allow}, {@code block}, {@code block_fa_outbound}, {@code manual_review},
         * {@code payout_pause}, {@code raise_review}, {@code request_credentials}, or {@code
         * resolve_dispute}.
         */
        @SerializedName("action")
        String action;

        /** Whether the rule is enabled. */
        @SerializedName("enabled")
        Boolean enabled;

        /** Identifier of the rule. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** Objective of the rule. */
        @SerializedName("objective")
        String objective;

        /** Rule expression evaluated to determine whether the rule matches. */
        @SerializedName("predicate")
        String predicate;

        /**
         * Percentage of matching traffic to which the rule applies, between 0 and 100, serialized
         * as a decimal string.
         */
        @SerializedName("rollout_percentage")
        BigDecimal rolloutPercentage;

        /**
         * Type of entity evaluated by the rule.
         *
         * <p>One of {@code account}, or {@code payment}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about OldRule, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OldRule extends StripeObject implements HasId {
        /**
         * Action performed when the rule matches.
         *
         * <p>One of {@code allow}, {@code block}, {@code block_fa_outbound}, {@code manual_review},
         * {@code payout_pause}, {@code raise_review}, {@code request_credentials}, or {@code
         * resolve_dispute}.
         */
        @SerializedName("action")
        String action;

        /** Whether the rule is enabled. */
        @SerializedName("enabled")
        Boolean enabled;

        /** Identifier of the rule. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** Objective of the rule. */
        @SerializedName("objective")
        String objective;

        /** Rule expression evaluated to determine whether the rule matches. */
        @SerializedName("predicate")
        String predicate;

        /**
         * Percentage of matching traffic to which the rule applies, between 0 and 100, serialized
         * as a decimal string.
         */
        @SerializedName("rollout_percentage")
        BigDecimal rolloutPercentage;

        /**
         * Type of entity evaluated by the rule.
         *
         * <p>One of {@code account}, or {@code payment}.
         */
        @SerializedName("type")
        String type;
      }
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

    /** Details of a Stripe access action. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAccess extends StripeObject {
      /**
       * The level of Dashboard access granted.
       *
       * <p>One of {@code dashboard_read_only}, or {@code dashboard_read_write}.
       */
      @SerializedName("access_type")
      String accessType;

      /** The reason for granting Stripe access. */
      @SerializedName("reason")
      Reason reason;

      /** The reason for granting Stripe access. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Reason extends StripeObject {
        /** Set when access is granted through an access request. */
        @SerializedName("access_request")
        AccessRequest accessRequest;

        /** Set when access is granted through a support relationship. */
        @SerializedName("support_relationship")
        SupportRelationship supportRelationship;

        /** Set when access is granted through a support ticket. */
        @SerializedName("support_ticket")
        SupportTicket supportTicket;

        /**
         * The type of reason for granting access.
         *
         * <p>One of {@code access_request}, {@code support_relationship}, or {@code
         * support_ticket}.
         */
        @SerializedName("type")
        String type;

        /** Set when access is granted through an access request. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AccessRequest extends StripeObject implements HasId {
          /** Identifier of the access request. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }

        /** Set when access is granted through a support relationship. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SupportRelationship extends StripeObject implements HasId {
          /** Identifier of the support relationship. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;

          /** Name of the support contact, when available. */
          @SerializedName("name")
          String name;

          /** Role of the support contact, when available. */
          @SerializedName("role")
          String role;
        }

        /** Set when access is granted through a support ticket. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SupportTicket extends StripeObject implements HasId {
          /** Identifier of the support ticket. */
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

      /**
       * Surface where the user access action started.
       *
       * <p>One of {@code dashboard}, {@code embedded}, or {@code express}.
       */
      @SerializedName("surface")
      String surface;

      /** Dashboard client details for the user access action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DashboardClient extends StripeObject {
        /** User-Agent header for the user access action. */
        @SerializedName("user_agent")
        String userAgent;
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
     * <p>One of {@code apps.install}, {@code balance_transfer}, {@code bank_account}, {@code
     * blockchain_address}, {@code card}, {@code v2.core.event_destination}, {@code issuing.card},
     * {@code issuing.cardholder}, {@code issuing.dispute}, or {@code webhook_endpoint}.
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
