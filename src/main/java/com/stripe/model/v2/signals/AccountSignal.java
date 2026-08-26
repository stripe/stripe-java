// File generated from our OpenAPI spec
package com.stripe.model.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An automatically evaluated signal on an account. Each Account Signal object corresponds to
 * exactly one signal type, indicated by type. Only the type-specific field is populated; other
 * type-specific payload fields are null. If an account has multiple signals, Stripe creates
 * separate account signal objects.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountSignal extends StripeObject implements HasId {
  /** The account or customer this signal is associated with. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /** The account evaluation that produced this signal, if applicable. */
  @SerializedName("account_evaluation")
  String accountEvaluation;

  /** Timestamp at which the signal was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the account signal. */
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
   * <p>Equal to {@code v2.signals.account_signal}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of signal.
   *
   * <p>One of {@code user_account_sharing}, or {@code user_multi_accounting}.
   */
  @SerializedName("type")
  String type;

  /** Data for the user account-sharing signal. Present only when type is user_account_sharing. */
  @SerializedName("user_account_sharing")
  UserAccountSharing userAccountSharing;

  /** Data for the user multi-accounting signal. Present only when type is user_multi_accounting. */
  @SerializedName("user_multi_accounting")
  UserMultiAccounting userMultiAccounting;

  /** The account or customer this signal is associated with. */
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
  }

  /** Data for the user account-sharing signal. Present only when type is user_account_sharing. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserAccountSharing extends StripeObject {
    /**
     * Categorical assessment of the account-sharing risk.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /**
     * The specific risk score for the account, between 0.00 and 100.00. Absent when risk level is
     * not_assessed or unknown, or when the user is not on a product tier that includes numeric
     * scores.
     */
    @SerializedName("score")
    BigDecimal score;
  }

  /** Data for the user multi-accounting signal. Present only when type is user_multi_accounting. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserMultiAccounting extends StripeObject {
    /**
     * Categorical assessment of the multi-accounting risk.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /**
     * The specific risk score for the account, between 0.00 and 100.00. Absent when risk level is
     * not_assessed or unknown, or when the user is not on a product tier that includes numeric
     * scores.
     */
    @SerializedName("score")
    BigDecimal score;
  }
}
