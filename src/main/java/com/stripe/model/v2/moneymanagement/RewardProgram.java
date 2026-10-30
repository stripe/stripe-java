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
 * A RewardProgram represents shared card-spend cashback reward configuration for Issuing Card-Spend
 * Rewards. It is not scoped to a single Issuer Program or connected account.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RewardProgram extends StripeObject implements HasId {
  /** Time at which the RewardProgram was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Determines who performs reward money movement after rule evaluation. Immutable after creation.
   *
   * <p>Equal to {@code application}.
   */
  @SerializedName("fulfilled_by")
  String fulfilledBy;

  /** Unique identifier for the RewardProgram. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this object exists in livemode or testmode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** Display name for the RewardProgram. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.reward_program}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the RewardProgram. Inactive by default on creation; use activate/deactivate to
   * change.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;
}
