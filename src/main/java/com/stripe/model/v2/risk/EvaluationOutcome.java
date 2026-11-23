// File generated from our OpenAPI spec
package com.stripe.model.v2.risk;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An immutable, point-in-time risk evaluation result that captures recommended controls and their
 * expected impact. The type identifies the scenario evaluated and its corresponding details.
 * Unavailable optional values are null.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EvaluationOutcome extends StripeObject implements HasId {
  /** Subject of the evaluation. Exactly one of account, customer, or data is provided. */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /** Timestamp when the evaluation was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Recommended controls, expected financial impact, and supporting signals for a delinquency
   * evaluation. Populated when type is delinquency; null otherwise.
   */
  @SerializedName("delinquency")
  Delinquency delinquency;

  /** Unique identifier for the evaluation outcome, prefixed with evalout_. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the evaluation outcome is in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.risk.evaluation_outcome}.
   */
  @SerializedName("object")
  String object;

  /**
   * How the outcome was generated.
   *
   * <p>One of {@code rule_outcome}, or {@code stripe_recommendation}.
   */
  @SerializedName("origin")
  String origin;

  /**
   * Scenario evaluated; determines which type-specific payload is provided.
   *
   * <p>Equal to {@code delinquency}.
   */
  @SerializedName("type")
  String type;

  /** Subject of the evaluation. Exactly one of account, customer, or data is provided. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountDetails extends StripeObject {
    /** Connected account evaluated. */
    @SerializedName("account")
    String account;

    /** Customer evaluated. */
    @SerializedName("customer")
    String customer;

    /** Inline subject data for an evaluation without a Stripe entity. */
    @SerializedName("data")
    Data data;

    /** Inline subject data for an evaluation without a Stripe entity. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject {
      /** Contact email supplied for the evaluation, or null when unavailable. */
      @SerializedName("contact_email")
      String contactEmail;
    }
  }

  /**
   * Recommended controls, expected financial impact, and supporting signals for a delinquency
   * evaluation. Populated when type is delinquency; null otherwise.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Delinquency extends StripeObject {
    /**
     * The objective of the recommendation, with expected financial outcomes for the recommended
     * controls and the current configuration when those outcomes can be quantified.
     */
    @SerializedName("business_objective")
    BusinessObjective businessObjective;

    /** Risk controls recommended to manage the account's delinquency risk. */
    @SerializedName("controls")
    List<EvaluationOutcome.Delinquency.Control> controls;

    /** The balance between loss protection and revenue used to generate this recommendation. */
    @SerializedName("risk_appetite")
    RiskAppetite riskAppetite;

    /**
     * Signals that informed this evaluation, with their values at evaluation time. Null when
     * unavailable.
     */
    @SerializedName("supporting_signals")
    SupportingSignals supportingSignals;

    /**
     * The objective of the recommendation, with expected financial outcomes for the recommended
     * controls and the current configuration when those outcomes can be quantified.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BusinessObjective extends StripeObject {
      /**
       * Expected profitability, revenue, and losses if the current reserve configuration remains
       * unchanged. Provides a comparison for projected_outcome. Null when not reliably
       * quantifiable.
       */
      @SerializedName("baseline_outcome")
      BaselineOutcome baselineOutcome;

      /**
       * Expected profitability, revenue, and losses if the recommended controls are applied. Equals
       * baseline_outcome when the recommendation maintains the current state. Null when not
       * reliably quantifiable.
       */
      @SerializedName("projected_outcome")
      ProjectedOutcome projectedOutcome;

      /**
       * The financial objective the recommended controls are intended to improve.
       *
       * <p>Equal to {@code profitability}.
       */
      @SerializedName("type")
      String type;

      /**
       * Expected profitability, revenue, and losses if the current reserve configuration remains
       * unchanged. Provides a comparison for projected_outcome. Null when not reliably
       * quantifiable.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BaselineOutcome extends StripeObject {
        /**
         * Expected financial loss from delinquency under this reserve configuration, expressed as a
         * negative amount.
         */
        @SerializedName("loss")
        Amount loss;

        /** Expected financial result after accounting for revenue and losses. Can be negative. */
        @SerializedName("profitability")
        Amount profitability;

        /** Expected revenue under this reserve configuration. */
        @SerializedName("revenue")
        Amount revenue;
      }

      /**
       * Expected profitability, revenue, and losses if the recommended controls are applied. Equals
       * baseline_outcome when the recommendation maintains the current state. Null when not
       * reliably quantifiable.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ProjectedOutcome extends StripeObject {
        /**
         * Expected financial loss from delinquency under this reserve configuration, expressed as a
         * negative amount.
         */
        @SerializedName("loss")
        Amount loss;

        /** Expected financial result after accounting for revenue and losses. Can be negative. */
        @SerializedName("profitability")
        Amount profitability;

        /** Expected revenue under this reserve configuration. */
        @SerializedName("revenue")
        Amount revenue;
      }
    }

    /**
     * For more details about Control, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Control extends StripeObject {
      /**
       * The recommended action for funds held in reserve, including a target configuration when
       * updating reserves. Populated when type is risk_reserve; null otherwise.
       */
      @SerializedName("risk_reserve")
      RiskReserve riskReserve;

      /**
       * The kind of control recommended to manage risk.
       *
       * <p>Equal to {@code risk_reserve}.
       */
      @SerializedName("type")
      String type;

      /**
       * The recommended action for funds held in reserve, including a target configuration when
       * updating reserves. Populated when type is risk_reserve; null otherwise.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RiskReserve extends StripeObject {
        /**
         * Whether to update, maintain, or clear reserves.
         *
         * <p>One of {@code clear_reserve}, {@code maintain_current_state}, or {@code
         * update_reserve}.
         */
        @SerializedName("action")
        String action;

        /**
         * Recommended reserve configuration, specifying the percentage of funds to hold, when to
         * release them, and whether to include available funds. Populated for update_reserve; null
         * for maintain_current_state and clear_reserve.
         */
        @SerializedName("target")
        Target target;

        /**
         * Recommended reserve configuration, specifying the percentage of funds to hold, when to
         * release them, and whether to include available funds. Populated for update_reserve; null
         * for maintain_current_state and clear_reserve.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Target extends StripeObject {
          /** Integer percentage of funds to reserve. */
          @SerializedName("percent")
          Long percent;

          /** Integer number of days after which reserved funds are released. */
          @SerializedName("release_after_days")
          Long releaseAfterDays;

          /**
           * How reserved funds are released.
           *
           * <p>Equal to {@code rolling}.
           */
          @SerializedName("release_type")
          String releaseType;

          /** Whether to reserve already available funds as well as future funds. */
          @SerializedName("sweep_available_funds")
          Boolean sweepAvailableFunds;
        }
      }
    }

    /** The balance between loss protection and revenue used to generate this recommendation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RiskAppetite extends StripeObject {
      /**
       * How the recommendation prioritizes protection from losses relative to revenue.
       *
       * <p>One of {@code balanced}, {@code maximize_protection}, or {@code maximize_revenue}.
       */
      @SerializedName("mode")
      String mode;
    }

    /**
     * Signals that informed this evaluation, with their values at evaluation time. Null when
     * unavailable.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SupportingSignals extends StripeObject {
      /**
       * The account's assessed probability and level of delinquency risk. Null when unavailable.
       */
      @SerializedName("merchant_delinquency")
      MerchantDelinquency merchantDelinquency;

      /**
       * The account's assessed financial exposure if it becomes delinquent. Null when unavailable.
       */
      @SerializedName("payment_delinquency_exposure")
      PaymentDelinquencyExposure paymentDelinquencyExposure;

      /**
       * The account's assessed probability and level of delinquency risk. Null when unavailable.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MerchantDelinquency extends StripeObject {
        /** Time the signal was evaluated. */
        @SerializedName("evaluated_at")
        Instant evaluatedAt;

        /**
         * Probability of delinquency, represented as a decimal string. Null when the risk level is
         * unknown or the account signal does not include a numeric score.
         */
        @SerializedName("probability")
        BigDecimal probability;

        /**
         * Assessed risk level.
         *
         * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, or {@code
         * unknown}.
         */
        @SerializedName("risk_level")
        String riskLevel;

        /** ID of the supporting account signal. */
        @SerializedName("signal")
        String signal;
      }

      /**
       * The account's assessed financial exposure if it becomes delinquent. Null when unavailable.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentDelinquencyExposure extends StripeObject {
        /** Time the signal was evaluated. */
        @SerializedName("evaluated_at")
        Instant evaluatedAt;

        /** Exposure if the account becomes delinquent. */
        @SerializedName("exposure_amount")
        Amount exposureAmount;

        /** ID of the supporting account signal. */
        @SerializedName("signal")
        String signal;
      }
    }
  }
}
