// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A RewardProgramRule defines the matching conditions and cashback reward outcome shared across all
 * active enrollments in a RewardProgram. At most one RewardProgramRule may be active per
 * RewardProgram at a time.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RewardProgramRule extends StripeObject implements HasId {
  /**
   * Conditions that must be true for this rule to match a card transaction. Empty means the rule
   * matches all transactions.
   */
  @SerializedName("condition")
  Condition condition;

  /** Time at which the RewardProgramRule was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the RewardProgramRule. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this object exists in livemode or testmode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** Human-readable name for this rule. Max 250 characters. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.reward_program_rule}.
   */
  @SerializedName("object")
  String object;

  /** The reward to grant when this rule matches. */
  @SerializedName("reward")
  Reward reward;

  /** The ID of the RewardProgram this rule belongs to. Immutable after creation. */
  @SerializedName("reward_program")
  String rewardProgram;

  /**
   * The status of the RewardProgramRule. Inactive by default on creation; use activate/deactivate
   * to change.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /**
   * Conditions that must be true for this rule to match a card transaction. Empty means the rule
   * matches all transactions.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Condition extends StripeObject {
    /** Card-spend specific matching condition. */
    @SerializedName("card_spend")
    CardSpend cardSpend;

    /** Card-spend specific matching condition. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardSpend extends StripeObject {
      /**
       * Merchant Category Code include/exclude configuration. Omitted means the rule matches all
       * MCCs.
       */
      @SerializedName("merchant_category_codes")
      MerchantCategoryCodes merchantCategoryCodes;

      /**
       * Merchant Category Code include/exclude configuration. Omitted means the rule matches all
       * MCCs.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MerchantCategoryCodes extends StripeObject {
        /**
         * Four-digit Merchant Category Codes to explicitly exclude. Takes precedence over {@code
         * included}.
         */
        @SerializedName("excluded")
        List<String> excluded;

        /** Four-digit Merchant Category Codes to include. An empty list matches all MCCs. */
        @SerializedName("included")
        List<String> included;
      }
    }
  }

  /** The reward to grant when this rule matches. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reward extends StripeObject {
    /** Cashback reward configuration. */
    @SerializedName("cashback")
    Cashback cashback;

    /** Cashback reward configuration. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashback extends StripeObject {
      /**
       * Cashback rate as a percentage, represented as a decimal string. For example, {@code "2"}
       * represents 2% and {@code "1.5"} represents 1.5%. Must be greater than {@code "0"} and less
       * than or equal to {@code "100"}.
       */
      @SerializedName("rate")
      BigDecimal rate;
    }
  }
}
