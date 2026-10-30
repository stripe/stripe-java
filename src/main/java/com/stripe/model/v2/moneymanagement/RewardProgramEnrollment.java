// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A RewardProgramEnrollment represents the binding of a connected account / Issuer Program to a
 * shared RewardProgram. RewardProgramEnrollments are platform-owned canonical objects and are
 * active by default on creation. At most one RewardProgramEnrollment may be active per Issuer
 * Program globally, across all RewardPrograms.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RewardProgramEnrollment extends StripeObject implements HasId {
  /** The connected account enrolled in this RewardProgram. Immutable after creation. */
  @SerializedName("account")
  String account;

  /** Issuing-specific per-enrollment configuration. Immutable after creation. */
  @SerializedName("card_spend")
  CardSpend cardSpend;

  /** Time at which the RewardProgramEnrollment was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the RewardProgramEnrollment. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this object exists in livemode or testmode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.reward_program_enrollment}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the RewardProgram this enrollment belongs to. Immutable after creation. */
  @SerializedName("reward_program")
  String rewardProgram;

  /**
   * The status of the RewardProgramEnrollment. Active by default on creation; use
   * activate/deactivate to change.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** Issuing-specific per-enrollment configuration. Immutable after creation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardSpend extends StripeObject {
    /** The Issuer Program for this connected account. Immutable after creation. */
    @SerializedName("issuer_program")
    String issuerProgram;
  }
}
