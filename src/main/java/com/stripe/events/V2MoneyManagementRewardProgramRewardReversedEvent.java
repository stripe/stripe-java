// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.moneymanagement.RewardProgram;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2MoneyManagementRewardProgramRewardReversedEvent extends Event {
  /** Data for the v2.money_management.reward_program.reward_reversed event. */
  @SerializedName("data")
  V2MoneyManagementRewardProgramRewardReversedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The connected account whose reward is reversed. */
    @SerializedName("account")
    String account;
    /** Issuing card spend details for the reversal. */
    @SerializedName("card_spend")
    CardSpend cardSpend;
    /** The reward to debit from the connected account. */
    @SerializedName("reward")
    Reward reward;

    public static final class CardSpend {
      /** The Issuing cardholder whose spend earned the original reward. */
      @SerializedName("cardholder")
      String cardholder;
      /**
       * The Issuing transaction that reversed the reward. Present when the reversal is calculated
       * from a single Issuing transaction.
       */
      @SerializedName("issuing_transaction")
      String issuingTransaction;
      /**
       * The Issuing transaction that earned the original reward. Present when the reversal is
       * calculated from a single Issuing transaction and Stripe can associate it with the original
       * transaction.
       */
      @SerializedName("original_transaction")
      String originalTransaction;
    }

    public static final class Reward {
      /**
       * The reward amount. Always positive; the event type determines whether to credit or debit
       * the connected account.
       */
      @SerializedName("amount")
      Amount amount;
      /**
       * The period over which the reward was earned. Present when the reward is calculated over an
       * earning period rather than from a single Issuing transaction.
       */
      @SerializedName("earning_period")
      EarningPeriod earningPeriod;

      public static final class EarningPeriod {
        /** End of the earning period, exclusive. */
        @SerializedName("end")
        Instant end;
        /** Start of the earning period, inclusive. */
        @SerializedName("start")
        Instant start;
      }
    }
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public RewardProgram fetchRelatedObject() throws StripeException {
    return (RewardProgram) super.fetchRelatedObject(this.relatedObject);
  }
}
