// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The EarnedCredit object. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EarnedCredit extends StripeObject implements HasId {
  /** The amount and currency of the EarnedCredit. */
  @SerializedName("amount")
  Amount amount;

  /** Time at which the EarnedCredit was created. */
  @SerializedName("created")
  Instant created;

  /** Description of the EarnedCredit. */
  @SerializedName("description")
  String description;

  /** The FinancialAccount that earned the credit. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the EarnedCredit. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Has the value true if the object exists in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.earned_credit}.
   */
  @SerializedName("object")
  String object;

  /** The period during which the credit was earned. */
  @SerializedName("period")
  Period period;

  /** Details about the revenue share that caused the EarnedCredit. */
  @SerializedName("revenue_share")
  RevenueShare revenueShare;

  /** Details about the reward that caused the EarnedCredit. */
  @SerializedName("reward")
  Reward reward;

  /**
   * The status of the EarnedCredit.
   *
   * <p>Equal to {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for EarnedCredit status transitions. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The type of flow that caused the EarnedCredit.
   *
   * <p>One of {@code interest}, {@code revenue_share}, or {@code reward}.
   */
  @SerializedName("type")
  String type;

  /** The period during which the credit was earned. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    /** The end date of the period during which the credit was earned, inclusive. */
    @SerializedName("end_date")
    String endDate;

    /** The start date of the period during which the credit was earned, inclusive. */
    @SerializedName("start_date")
    String startDate;
  }

  /** Details about the revenue share that caused the EarnedCredit. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RevenueShare extends StripeObject {
    /**
     * The type of revenue share that caused the EarnedCredit.
     *
     * <p>One of {@code administrative_facilitation_fee}, or {@code savings_referral}.
     */
    @SerializedName("type")
    String type;
  }

  /** Details about the reward that caused the EarnedCredit. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reward extends StripeObject {
    /**
     * The program from which the reward was earned.
     *
     * <p>Equal to {@code platform_cash_rewards}.
     */
    @SerializedName("earned_from")
    String earnedFrom;

    /** The Account that funded the reward. */
    @SerializedName("from_account")
    String fromAccount;

    /** The OutboundPayment that delivered the reward. */
    @SerializedName("outbound_payment")
    String outboundPayment;
  }

  /** Timestamps for EarnedCredit status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time at which the EarnedCredit succeeded. */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }
}
