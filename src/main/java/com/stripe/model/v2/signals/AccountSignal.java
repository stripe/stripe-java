// File generated from our OpenAPI spec
package com.stripe.model.v2.signals;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
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

  /** Data for the fraudulent merchant signal. Present only when type is fraudulent_merchant. */
  @SerializedName("fraudulent_merchant")
  FraudulentMerchant fraudulentMerchant;

  /** Data for the fraudulent website signal. Present only when type is fraudulent_website. */
  @SerializedName("fraudulent_website")
  FraudulentWebsite fraudulentWebsite;

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

  /** Data for the merchant delinquency signal. Present only when type is merchant_delinquency. */
  @SerializedName("merchant_delinquency")
  MerchantDelinquency merchantDelinquency;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.signals.account_signal}.
   */
  @SerializedName("object")
  String object;

  /**
   * Data for the payment delinquency exposure signal. Present only when type is
   * payment_delinquency_exposure.
   */
  @SerializedName("payment_delinquency_exposure")
  PaymentDelinquencyExposure paymentDelinquencyExposure;

  /**
   * The type of signal.
   *
   * <p>One of {@code fraudulent_merchant}, {@code fraudulent_website}, {@code
   * merchant_delinquency}, {@code payment_delinquency_exposure}, {@code user_account_sharing}, or
   * {@code user_multi_accounting}.
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

  /** Data for the fraudulent merchant signal. Present only when type is fraudulent_merchant. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudulentMerchant extends StripeObject {
    /**
     * Array of objects representing individual factors that contributed to the calculated
     * probability. Absent when risk level is not_assessed or unknown, or when the user is not on a
     * product tier that includes indicators.
     */
    @SerializedName("indicators")
    List<AccountSignal.FraudulentMerchant.Indicator> indicators;

    /**
     * The probability of the merchant being fraudulent. Can be between 0.00 and 100.00. Absent when
     * risk level is not_assessed or unknown, or when the user is not on a product tier that
     * includes numeric scores.
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

    /**
     * For more details about Indicator, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Indicator extends StripeObject {
      /**
       * A brief explanation of how this indicator contributed to the fraudulent merchant
       * probability.
       */
      @SerializedName("explanation")
      String explanation;

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
       * other_related_accounts}, {@code other_transaction_activity}, or {@code owner_email}.
       */
      @SerializedName("indicator")
      String indicator;
    }
  }

  /** Data for the fraudulent website signal. Present only when type is fraudulent_website. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudulentWebsite extends StripeObject {
    /** Human-readable details about the fraudulent website evaluation. */
    @SerializedName("details")
    String details;

    /**
     * Categorical assessment of the fraudulent website risk.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;
  }

  /** Data for the merchant delinquency signal. Present only when type is merchant_delinquency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantDelinquency extends StripeObject {
    /**
     * Array of objects representing individual factors that contributed to the calculated
     * probability of delinquency. Absent when risk level is not_assessed or unknown, or when the
     * user is not on a product tier that includes indicators.
     */
    @SerializedName("indicators")
    List<AccountSignal.MerchantDelinquency.Indicator> indicators;

    /**
     * The probability of delinquency. Can be between 0.00 and 100.00. Absent when risk level is
     * not_assessed or unknown, or when the user is not on a product tier that includes numeric
     * scores.
     */
    @SerializedName("probability")
    BigDecimal probability;

    /**
     * Categorical assessment of the delinquency risk based on probability.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /**
     * For more details about Indicator, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Indicator extends StripeObject {
      /** A brief explanation of how this indicator contributed to the delinquency probability. */
      @SerializedName("explanation")
      String explanation;

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
       * <p>One of {@code account_balance}, {@code aov}, {@code charge_concentration}, {@code
       * disputes}, {@code dispute_window}, {@code exposure}, {@code firmographic}, {@code
       * lifetime_metrics}, {@code other}, {@code payment_processing}, {@code payment_volume},
       * {@code payouts}, {@code refunds}, {@code related_accounts}, {@code tenure}, or {@code
       * transfers}.
       */
      @SerializedName("indicator")
      String indicator;
    }
  }

  /**
   * Data for the payment delinquency exposure signal. Present only when type is
   * payment_delinquency_exposure.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDelinquencyExposure extends StripeObject {
    /** Additional details about the exposure assessment. */
    @SerializedName("additional_details")
    AdditionalDetails additionalDetails;

    /** The exposure amount if this account becomes delinquent. */
    @SerializedName("exposure_amount")
    ExposureAmount exposureAmount;

    /** Additional details about the exposure assessment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AdditionalDetails extends StripeObject {
      /** Total payments still exposed to dispute or refund risk in the event of delinquency. */
      @SerializedName("gross_exposure_amount")
      GrossExposureAmount grossExposureAmount;

      /**
       * Percentage of Gross Exposure expected to be disputed or refunded and materialize as a loss
       * in the event of delinquency.
       */
      @SerializedName("loss_given_default_in_percentages")
      Long lossGivenDefaultInPercentages;

      /** Predicted window size in days until dispute is raised. */
      @SerializedName("predicted_dispute_window_in_days")
      Long predictedDisputeWindowInDays;

      /** Total payments still exposed to dispute or refund risk in the event of delinquency. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class GrossExposureAmount extends StripeObject {
        /** ISO 4217 currency code. */
        @SerializedName("currency")
        String currency;

        /** Amount in minor units for the given currency. */
        @SerializedName("value")
        @JsonAdapter(StringInt64TypeAdapter.class)
        Long value;
      }
    }

    /** The exposure amount if this account becomes delinquent. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExposureAmount extends StripeObject {
      /** ISO 4217 currency code. */
      @SerializedName("currency")
      String currency;

      /** Amount in minor units for the given currency. */
      @SerializedName("value")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long value;
    }
  }

  /** Data for the user account-sharing signal. Present only when type is user_account_sharing. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserAccountSharing extends StripeObject {
    /**
     * Categorical assessment of the account-sharing risk.
     *
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
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
     * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
     * not_assessed}, or {@code unknown}.
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
