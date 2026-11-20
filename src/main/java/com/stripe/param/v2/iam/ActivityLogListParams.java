// File generated from our OpenAPI spec
package com.stripe.param.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ActivityLogListParams extends ApiRequestParams {
  /** Filter results to only include activity logs for the specified action group types. */
  @SerializedName("action_groups")
  List<ActivityLogListParams.ActionGroup> actionGroups;

  /** Filter results to only include activity logs for the specified action types. */
  @SerializedName("actions")
  List<ActivityLogListParams.Action> actions;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return per page. */
  @SerializedName("limit")
  Long limit;

  /**
   * Controls which activity logs an organization-level request returns. Specify {@code @self} to
   * return logs recorded in the organization context and {@code @organization_members} to return
   * logs recorded in accounts that belong to the organization. Specify both values to return logs
   * from both sources. Defaults to {@code ["@self"]} when omitted. Cannot be empty.
   */
  @SerializedName("logs_from")
  List<String> logsFrom;

  private ActivityLogListParams(
      List<ActivityLogListParams.ActionGroup> actionGroups,
      List<ActivityLogListParams.Action> actions,
      Map<String, Object> extraParams,
      Long limit,
      List<String> logsFrom) {
    this.actionGroups = actionGroups;
    this.actions = actions;
    this.extraParams = extraParams;
    this.limit = limit;
    this.logsFrom = logsFrom;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<ActivityLogListParams.ActionGroup> actionGroups;

    private List<ActivityLogListParams.Action> actions;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<String> logsFrom;

    /** Finalize and obtain parameter instance from this builder. */
    public ActivityLogListParams build() {
      return new ActivityLogListParams(
          this.actionGroups, this.actions, this.extraParams, this.limit, this.logsFrom);
    }

    /**
     * Add an element to `actionGroups` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actionGroups} for the field documentation.
     */
    public Builder addActionGroup(ActivityLogListParams.ActionGroup element) {
      if (this.actionGroups == null) {
        this.actionGroups = new ArrayList<>();
      }
      this.actionGroups.add(element);
      return this;
    }

    /**
     * Add all elements to `actionGroups` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actionGroups} for the field documentation.
     */
    public Builder addAllActionGroup(List<ActivityLogListParams.ActionGroup> elements) {
      if (this.actionGroups == null) {
        this.actionGroups = new ArrayList<>();
      }
      this.actionGroups.addAll(elements);
      return this;
    }

    /**
     * Add an element to `actions` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actions} for the field documentation.
     */
    public Builder addAction(ActivityLogListParams.Action element) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.add(element);
      return this;
    }

    /**
     * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actions} for the field documentation.
     */
    public Builder addAllAction(List<ActivityLogListParams.Action> elements) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ActivityLogListParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ActivityLogListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return per page. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `logsFrom` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#logsFrom} for the field documentation.
     */
    public Builder addLogsFrom(String element) {
      if (this.logsFrom == null) {
        this.logsFrom = new ArrayList<>();
      }
      this.logsFrom.add(element);
      return this;
    }

    /**
     * Add all elements to `logsFrom` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#logsFrom} for the field documentation.
     */
    public Builder addAllLogsFrom(List<String> elements) {
      if (this.logsFrom == null) {
        this.logsFrom = new ArrayList<>();
      }
      this.logsFrom.addAll(elements);
      return this;
    }
  }

  public enum Action implements ApiRequestParams.EnumParam {
    @SerializedName("anomaly_detection_settings_updated")
    ANOMALY_DETECTION_SETTINGS_UPDATED("anomaly_detection_settings_updated"),

    @SerializedName("api_key_created")
    API_KEY_CREATED("api_key_created"),

    @SerializedName("api_key_deleted")
    API_KEY_DELETED("api_key_deleted"),

    @SerializedName("api_key_updated")
    API_KEY_UPDATED("api_key_updated"),

    @SerializedName("api_key_viewed")
    API_KEY_VIEWED("api_key_viewed"),

    @SerializedName("application_authorized")
    APPLICATION_AUTHORIZED("application_authorized"),

    @SerializedName("application_created")
    APPLICATION_CREATED("application_created"),

    @SerializedName("application_deauthorized")
    APPLICATION_DEAUTHORIZED("application_deauthorized"),

    @SerializedName("app_installed")
    APP_INSTALLED("app_installed"),

    @SerializedName("app_uninstalled")
    APP_UNINSTALLED("app_uninstalled"),

    @SerializedName("connect_express_branding_updated")
    CONNECT_EXPRESS_BRANDING_UPDATED("connect_express_branding_updated"),

    @SerializedName("connect_oauth_disabled")
    CONNECT_OAUTH_DISABLED("connect_oauth_disabled"),

    @SerializedName("connect_oauth_enabled")
    CONNECT_OAUTH_ENABLED("connect_oauth_enabled"),

    @SerializedName("connect_settings_updated")
    CONNECT_SETTINGS_UPDATED("connect_settings_updated"),

    @SerializedName("connect_site_link_updated")
    CONNECT_SITE_LINK_UPDATED("connect_site_link_updated"),

    @SerializedName("data_export_requested")
    DATA_EXPORT_REQUESTED("data_export_requested"),

    @SerializedName("event_destination_added")
    EVENT_DESTINATION_ADDED("event_destination_added"),

    @SerializedName("event_destination_removed")
    EVENT_DESTINATION_REMOVED("event_destination_removed"),

    @SerializedName("event_destination_updated")
    EVENT_DESTINATION_UPDATED("event_destination_updated"),

    @SerializedName("issuing_activated")
    ISSUING_ACTIVATED("issuing_activated"),

    @SerializedName("issuing_balance_transfer_created")
    ISSUING_BALANCE_TRANSFER_CREATED("issuing_balance_transfer_created"),

    @SerializedName("issuing_cardholder_created")
    ISSUING_CARDHOLDER_CREATED("issuing_cardholder_created"),

    @SerializedName("issuing_cardholder_updated")
    ISSUING_CARDHOLDER_UPDATED("issuing_cardholder_updated"),

    @SerializedName("issuing_card_created")
    ISSUING_CARD_CREATED("issuing_card_created"),

    @SerializedName("issuing_card_sensitive_details_viewed")
    ISSUING_CARD_SENSITIVE_DETAILS_VIEWED("issuing_card_sensitive_details_viewed"),

    @SerializedName("issuing_card_updated")
    ISSUING_CARD_UPDATED("issuing_card_updated"),

    @SerializedName("issuing_dispute_created")
    ISSUING_DISPUTE_CREATED("issuing_dispute_created"),

    @SerializedName("issuing_dispute_submitted")
    ISSUING_DISPUTE_SUBMITTED("issuing_dispute_submitted"),

    @SerializedName("issuing_dispute_updated")
    ISSUING_DISPUTE_UPDATED("issuing_dispute_updated"),

    @SerializedName("manual_payouts_disabled")
    MANUAL_PAYOUTS_DISABLED("manual_payouts_disabled"),

    @SerializedName("manual_payouts_enabled")
    MANUAL_PAYOUTS_ENABLED("manual_payouts_enabled"),

    @SerializedName("payout_destination_added")
    PAYOUT_DESTINATION_ADDED("payout_destination_added"),

    @SerializedName("payout_destination_removed")
    PAYOUT_DESTINATION_REMOVED("payout_destination_removed"),

    @SerializedName("payout_destination_updated")
    PAYOUT_DESTINATION_UPDATED("payout_destination_updated"),

    @SerializedName("payout_schedule_edits_disabled")
    PAYOUT_SCHEDULE_EDITS_DISABLED("payout_schedule_edits_disabled"),

    @SerializedName("payout_schedule_edits_enabled")
    PAYOUT_SCHEDULE_EDITS_ENABLED("payout_schedule_edits_enabled"),

    @SerializedName("payout_schedule_updated")
    PAYOUT_SCHEDULE_UPDATED("payout_schedule_updated"),

    @SerializedName("radar_adaptive_3ds_disabled")
    RADAR_ADAPTIVE_3DS_DISABLED("radar_adaptive_3ds_disabled"),

    @SerializedName("radar_dynamic_risk_thresholds_disabled")
    RADAR_DYNAMIC_RISK_THRESHOLDS_DISABLED("radar_dynamic_risk_thresholds_disabled"),

    @SerializedName("radar_early_fraud_warning_disabled")
    RADAR_EARLY_FRAUD_WARNING_DISABLED("radar_early_fraud_warning_disabled"),

    @SerializedName("radar_for_setup_intents_disabled")
    RADAR_FOR_SETUP_INTENTS_DISABLED("radar_for_setup_intents_disabled"),

    @SerializedName("radar_fraud_dispute_protection_disabled")
    RADAR_FRAUD_DISPUTE_PROTECTION_DISABLED("radar_fraud_dispute_protection_disabled"),

    @SerializedName("radar_rule_added")
    RADAR_RULE_ADDED("radar_rule_added"),

    @SerializedName("radar_rule_disabled")
    RADAR_RULE_DISABLED("radar_rule_disabled"),

    @SerializedName("radar_rule_enabled")
    RADAR_RULE_ENABLED("radar_rule_enabled"),

    @SerializedName("radar_rule_removed")
    RADAR_RULE_REMOVED("radar_rule_removed"),

    @SerializedName("radar_rule_updated")
    RADAR_RULE_UPDATED("radar_rule_updated"),

    @SerializedName("scim_group_deleted")
    SCIM_GROUP_DELETED("scim_group_deleted"),

    @SerializedName("scim_group_member_added")
    SCIM_GROUP_MEMBER_ADDED("scim_group_member_added"),

    @SerializedName("scim_group_member_removed")
    SCIM_GROUP_MEMBER_REMOVED("scim_group_member_removed"),

    @SerializedName("scim_group_roles_updated")
    SCIM_GROUP_ROLES_UPDATED("scim_group_roles_updated"),

    @SerializedName("scim_group_updated")
    SCIM_GROUP_UPDATED("scim_group_updated"),

    @SerializedName("sso_domain_verified")
    SSO_DOMAIN_VERIFIED("sso_domain_verified"),

    @SerializedName("sso_settings_created")
    SSO_SETTINGS_CREATED("sso_settings_created"),

    @SerializedName("sso_settings_deleted")
    SSO_SETTINGS_DELETED("sso_settings_deleted"),

    @SerializedName("sso_settings_updated")
    SSO_SETTINGS_UPDATED("sso_settings_updated"),

    @SerializedName("stripe_access_started")
    STRIPE_ACCESS_STARTED("stripe_access_started"),

    @SerializedName("two_step_authentication_mandate_disabled")
    TWO_STEP_AUTHENTICATION_MANDATE_DISABLED("two_step_authentication_mandate_disabled"),

    @SerializedName("two_step_authentication_mandate_enabled")
    TWO_STEP_AUTHENTICATION_MANDATE_ENABLED("two_step_authentication_mandate_enabled"),

    @SerializedName("user_access_started")
    USER_ACCESS_STARTED("user_access_started"),

    @SerializedName("user_auth_challenge_failed")
    USER_AUTH_CHALLENGE_FAILED("user_auth_challenge_failed"),

    @SerializedName("user_email_changed")
    USER_EMAIL_CHANGED("user_email_changed"),

    @SerializedName("user_email_verified")
    USER_EMAIL_VERIFIED("user_email_verified"),

    @SerializedName("user_express_phone_number_changed")
    USER_EXPRESS_PHONE_NUMBER_CHANGED("user_express_phone_number_changed"),

    @SerializedName("user_google_account_connected")
    USER_GOOGLE_ACCOUNT_CONNECTED("user_google_account_connected"),

    @SerializedName("user_google_account_disconnected")
    USER_GOOGLE_ACCOUNT_DISCONNECTED("user_google_account_disconnected"),

    @SerializedName("user_invite_accepted")
    USER_INVITE_ACCEPTED("user_invite_accepted"),

    @SerializedName("user_invite_created")
    USER_INVITE_CREATED("user_invite_created"),

    @SerializedName("user_invite_deleted")
    USER_INVITE_DELETED("user_invite_deleted"),

    @SerializedName("user_passkey_added")
    USER_PASSKEY_ADDED("user_passkey_added"),

    @SerializedName("user_passkey_removed")
    USER_PASSKEY_REMOVED("user_passkey_removed"),

    @SerializedName("user_passkey_updated")
    USER_PASSKEY_UPDATED("user_passkey_updated"),

    @SerializedName("user_passkey_upgraded")
    USER_PASSKEY_UPGRADED("user_passkey_upgraded"),

    @SerializedName("user_password_changed")
    USER_PASSWORD_CHANGED("user_password_changed"),

    @SerializedName("user_password_initialized")
    USER_PASSWORD_INITIALIZED("user_password_initialized"),

    @SerializedName("user_password_reset_failed")
    USER_PASSWORD_RESET_FAILED("user_password_reset_failed"),

    @SerializedName("user_password_reset_requested")
    USER_PASSWORD_RESET_REQUESTED("user_password_reset_requested"),

    @SerializedName("user_password_reset_succeeded")
    USER_PASSWORD_RESET_SUCCEEDED("user_password_reset_succeeded"),

    @SerializedName("user_roles_deleted")
    USER_ROLES_DELETED("user_roles_deleted"),

    @SerializedName("user_roles_updated")
    USER_ROLES_UPDATED("user_roles_updated"),

    @SerializedName("user_two_step_authentication_backup_code_used")
    USER_TWO_STEP_AUTHENTICATION_BACKUP_CODE_USED("user_two_step_authentication_backup_code_used"),

    @SerializedName("user_two_step_authentication_method_added")
    USER_TWO_STEP_AUTHENTICATION_METHOD_ADDED("user_two_step_authentication_method_added"),

    @SerializedName("user_two_step_authentication_method_removed")
    USER_TWO_STEP_AUTHENTICATION_METHOD_REMOVED("user_two_step_authentication_method_removed"),

    @SerializedName("user_two_step_authentication_method_reset")
    USER_TWO_STEP_AUTHENTICATION_METHOD_RESET("user_two_step_authentication_method_reset"),

    @SerializedName("user_two_step_authentication_method_updated")
    USER_TWO_STEP_AUTHENTICATION_METHOD_UPDATED("user_two_step_authentication_method_updated"),

    @SerializedName("user_two_step_authentication_reset_requested")
    USER_TWO_STEP_AUTHENTICATION_RESET_REQUESTED("user_two_step_authentication_reset_requested");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Action(String value) {
      this.value = value;
    }
  }

  public enum ActionGroup implements ApiRequestParams.EnumParam {
    @SerializedName("account_security")
    ACCOUNT_SECURITY("account_security"),

    @SerializedName("api_key")
    API_KEY("api_key"),

    @SerializedName("app")
    APP("app"),

    @SerializedName("authentication")
    AUTHENTICATION("authentication"),

    @SerializedName("connect")
    CONNECT("connect"),

    @SerializedName("data_export")
    DATA_EXPORT("data_export"),

    @SerializedName("event_destination")
    EVENT_DESTINATION("event_destination"),

    @SerializedName("issuing")
    ISSUING("issuing"),

    @SerializedName("payout")
    PAYOUT("payout"),

    @SerializedName("radar")
    RADAR("radar"),

    @SerializedName("scim")
    SCIM("scim"),

    @SerializedName("sso")
    SSO("sso"),

    @SerializedName("stripe_access")
    STRIPE_ACCESS("stripe_access"),

    @SerializedName("user_access")
    USER_ACCESS("user_access"),

    @SerializedName("user_invite")
    USER_INVITE("user_invite"),

    @SerializedName("user_profile")
    USER_PROFILE("user_profile"),

    @SerializedName("user_roles")
    USER_ROLES("user_roles");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ActionGroup(String value) {
      this.value = value;
    }
  }
}
