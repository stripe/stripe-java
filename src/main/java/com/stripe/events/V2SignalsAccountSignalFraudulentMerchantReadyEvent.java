// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2SignalsAccountSignalFraudulentMerchantReadyEvent extends Event {
  /** Data for the v2.signals.account_signal.fraudulent_merchant_ready event. */
  @SerializedName("data")
  V2SignalsAccountSignalFraudulentMerchantReadyEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Account ID that this signal is associated with. */
    @SerializedName("account")
    String account;
    /** Timestamp when the signal was evaluated. */
    @SerializedName("evaluated_at")
    Instant evaluatedAt;
    /** Fraudulent merchant signal data. Present when type is fraudulent_merchant. */
    @SerializedName("fraudulent_merchant")
    FraudulentMerchant fraudulentMerchant;
    /** Unique identifier for this account signal. */
    @SerializedName("id")
    String id;
    /**
     * The type of account signal. Currently only fraudulent_merchant is supported.
     *
     * <p>Equal to {@code fraudulent_merchant}.
     */
    @SerializedName("type")
    String type;

    public static final class FraudulentMerchant {
      /**
       * Array of objects representing individual factors that contributed to the calculated
       * probability. Maximum of 3.
       */
      @SerializedName("indicators")
      List<
              V2SignalsAccountSignalFraudulentMerchantReadyEvent.EventData.FraudulentMerchant
                  .Indicator>
          indicators;
      /**
       * The probability of the merchant being fraudulent. Can be between 0.00 and 100.00. May be
       * empty if the risk_level is UNKNOWN or NOT_ASSESSED.
       */
      @SerializedName("probability")
      BigDecimal probability;
      /**
       * Categorical assessment of the fraudulent merchant risk based on probability.
       *
       * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
       * not_assessed}, or {@code unknown}.
       */
      @SerializedName("risk_level")
      String riskLevel;

      public static final class Indicator {
        /**
         * A brief explanation of how this indicator contributed to the fraudulent merchant
         * probability.
         */
        @SerializedName("description")
        String description;
        /**
         * The effect this indicator had on the overall risk level.
         *
         * <p>One of {@code decrease}, {@code neutral}, {@code slight_increase}, or {@code
         * strong_increase}.
         */
        @SerializedName("impact")
        String impact;
        /**
         * The name of the specific indicator used in the risk assessment.
         *
         * <p>One of {@code bank_account}, {@code business_information_and_account_activity}, {@code
         * disputes}, {@code failures}, {@code geolocation}, {@code other}, {@code
         * other_related_accounts}, {@code other_transaction_activity}, {@code owner_email}, or
         * {@code web_presence}.
         */
        @SerializedName("indicator")
        String indicator;
      }
    }
  }
}
