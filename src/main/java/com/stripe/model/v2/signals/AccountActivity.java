// File generated from our OpenAPI spec
package com.stripe.model.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Account Activity resource for the Signals API. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountActivity extends StripeObject implements HasId {
  /** The account, customer, or inline account data associated with the activity. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /** The account evaluation this activity is associated with, when applicable. */
  @SerializedName("account_evaluation")
  String accountEvaluation;

  /** Timestamp at which the account activity was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the account activity. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Details for the login attempt. Present only when type is login_attempt. */
  @SerializedName("login_attempt")
  LoginAttempt loginAttempt;

  /** Details for the login decision. Present only when type is login_decision. */
  @SerializedName("login_decision")
  LoginDecision loginDecision;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.signals.account_activity}.
   */
  @SerializedName("object")
  String object;

  /** Timestamp at which the activity occurred. Defaults to the created time if not provided. */
  @SerializedName("occurred_at")
  Instant occurredAt;

  /** Details for the registration attempt. Present only when type is registration_attempt. */
  @SerializedName("registration_attempt")
  RegistrationAttempt registrationAttempt;

  /** Details for the registration decision. Present only when type is registration_decision. */
  @SerializedName("registration_decision")
  RegistrationDecision registrationDecision;

  /**
   * The type of activity.
   *
   * <p>One of {@code login_attempt}, {@code login_decision}, {@code registration_attempt}, or
   * {@code registration_decision}.
   */
  @SerializedName("type")
  String type;

  /** The account, customer, or inline account data associated with the activity. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountDetails extends StripeObject {
    /** The v2 account ID of the account. */
    @SerializedName("account")
    String account;

    /** The v1 customer ID of the account, for users not yet migrated to v2/accounts. */
    @SerializedName("customer")
    String customer;

    /** Inline account data to evaluate without creating a v2 account. */
    @SerializedName("data")
    Data data;

    /** Inline account data to evaluate without creating a v2 account. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject {
      /** Default account settings. */
      @SerializedName("defaults")
      Defaults defaults;

      /** Identity data. */
      @SerializedName("identity")
      Identity identity;

      /** Default account settings. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Defaults extends StripeObject {
        /** Account profile data. */
        @SerializedName("profile")
        Profile profile;

        /** Account profile data. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Profile extends StripeObject {
          /** The business URL. */
          @SerializedName("business_url")
          String businessUrl;

          /** Doing business as (DBA) name. */
          @SerializedName("doing_business_as")
          String doingBusinessAs;

          /** Description of the account's product or service. */
          @SerializedName("product_description")
          String productDescription;
        }
      }

      /** Identity data. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Identity extends StripeObject {
        /** Business details for identity data. */
        @SerializedName("business_details")
        BusinessDetails businessDetails;

        /** Business details for identity data. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BusinessDetails extends StripeObject {
          /** Registered business name. */
          @SerializedName("registered_name")
          String registeredName;
        }
      }
    }
  }

  /** Details for the login attempt. Present only when type is login_attempt. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginAttempt extends StripeObject {
    /** Client details captured for the attempt. */
    @SerializedName("client_details")
    ClientDetails clientDetails;

    /** Client details captured for the attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDetails extends StripeObject {
      /** Raw client details for the activity, when a Radar session is not available. */
      @SerializedName("data")
      Data data;

      /** The Radar session ID capturing client details for the activity. */
      @SerializedName("radar_session")
      String radarSession;

      /** Raw client details for the activity, when a Radar session is not available. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Data extends StripeObject {
        /** The IP address associated with the activity. */
        @SerializedName("ip")
        String ip;

        /** The referrer associated with the activity. */
        @SerializedName("referrer")
        String referrer;

        /** The user agent associated with the activity. */
        @SerializedName("user_agent")
        String userAgent;
      }
    }
  }

  /** Details for the login decision. Present only when type is login_decision. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LoginDecision extends StripeObject {
    /**
     * The action the merchant took following the evaluation.
     *
     * <p>One of {@code allowed}, {@code blocked}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;
  }

  /** Details for the registration attempt. Present only when type is registration_attempt. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationAttempt extends StripeObject {
    /** Client details captured for the attempt. */
    @SerializedName("client_details")
    ClientDetails clientDetails;

    /** Client details captured for the attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDetails extends StripeObject {
      /** Raw client details for the activity, when a Radar session is not available. */
      @SerializedName("data")
      Data data;

      /** The Radar session ID capturing client details for the activity. */
      @SerializedName("radar_session")
      String radarSession;

      /** Raw client details for the activity, when a Radar session is not available. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Data extends StripeObject {
        /** The IP address associated with the activity. */
        @SerializedName("ip")
        String ip;

        /** The referrer associated with the activity. */
        @SerializedName("referrer")
        String referrer;

        /** The user agent associated with the activity. */
        @SerializedName("user_agent")
        String userAgent;
      }
    }
  }

  /** Details for the registration decision. Present only when type is registration_decision. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RegistrationDecision extends StripeObject {
    /**
     * The action the merchant took following the evaluation.
     *
     * <p>One of {@code allowed}, {@code blocked}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;
  }
}
