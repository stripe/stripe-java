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
   * api_key_viewed}, {@code user_invite_accepted}, {@code user_invite_created}, {@code
   * user_invite_deleted}, {@code user_roles_deleted}, or {@code user_roles_updated}.
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
     * <p>One of {@code api_key}, {@code user_invite}, or {@code user_roles}.
     */
    @SerializedName("type")
    String type;

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

      /** Email address of the user whose roles were changed. */
      @SerializedName("user_email")
      String userEmail;
    }
  }
}
