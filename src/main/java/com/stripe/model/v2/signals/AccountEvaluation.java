// File generated from our OpenAPI spec
package com.stripe.model.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Account Evaluation resource for the Signals API. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountEvaluation extends StripeObject implements HasId {
  /** Account activity recorded alongside this evaluation, when applicable. */
  @SerializedName("account_activity_details")
  AccountActivityDetails accountActivityDetails;

  /** The account, customer, or inline account data being evaluated. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /** Timestamp at which the evaluation was created. */
  @SerializedName("created")
  Instant created;

  /** Signal results that are available for the evaluation. */
  @SerializedName("evaluated_signals")
  EvaluatedSignals evaluatedSignals;

  /** Unique identifier for the account evaluation. */
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
   * <p>Equal to {@code v2.signals.account_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** List of signals still pending evaluation. */
  @SerializedName("pending_signals")
  List<String> pendingSignals;

  /** List of signals requested for evaluation. */
  @SerializedName("requested_signals")
  List<String> requestedSignals;

  /** Account activity recorded alongside this evaluation, when applicable. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountActivityDetails extends StripeObject {
    /** The ID of the account activity created or associated with the evaluation. */
    @SerializedName("account_activity")
    String accountActivity;
  }

  /** The account, customer, or inline account data being evaluated. */
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
    }
  }

  /** Signal results that are available for the evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EvaluatedSignals extends StripeObject {
    /** User account-sharing result for the evaluation, when available. */
    @SerializedName("user_account_sharing")
    UserAccountSharing userAccountSharing;

    /** User multi-accounting result for the evaluation, when available. */
    @SerializedName("user_multi_accounting")
    UserMultiAccounting userMultiAccounting;

    /** User account-sharing result for the evaluation, when available. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserAccountSharing extends StripeObject {
      /** Timestamp at which the signal was evaluated. */
      @SerializedName("evaluated_at")
      Instant evaluatedAt;

      /**
       * Categorical assessment of the account-sharing risk.
       *
       * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, or {@code
       * unknown}.
       */
      @SerializedName("risk_level")
      String riskLevel;

      /** The specific risk score for the account, between 0.00 and 100.00, when available. */
      @SerializedName("score")
      BigDecimal score;

      /** The account signal ID containing the full user account-sharing signal result. */
      @SerializedName("signal")
      String signal;
    }

    /** User multi-accounting result for the evaluation, when available. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserMultiAccounting extends StripeObject {
      /** Timestamp at which the signal was evaluated. */
      @SerializedName("evaluated_at")
      Instant evaluatedAt;

      /**
       * Categorical assessment of the multi-accounting risk.
       *
       * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, or {@code
       * unknown}.
       */
      @SerializedName("risk_level")
      String riskLevel;

      /** The specific risk score for the account, between 0.00 and 100.00, when available. */
      @SerializedName("score")
      BigDecimal score;

      /** The account signal ID containing the full user multi-accounting signal result. */
      @SerializedName("signal")
      String signal;
    }
  }
}
