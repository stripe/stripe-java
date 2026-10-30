// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A FundingIntent represents the lifecycle of adding funds to a FinancialAccount. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FundingIntent extends StripeObject implements HasId {
  /** The amount to add to the destination. */
  @SerializedName("amount")
  Amount amount;

  /** Whether you can cancel the FundingIntent. */
  @SerializedName("cancelable")
  Boolean cancelable;

  /** Details for a check FundingIntent. */
  @SerializedName("check")
  Check check;

  /**
   * How the FundingIntent is confirmed after validation.
   *
   * <p>One of {@code automatic}, or {@code manual}.
   */
  @SerializedName("confirmation_method")
  String confirmationMethod;

  /** Time at which the FundingIntent was created. */
  @SerializedName("created")
  Instant created;

  /** An arbitrary string attached to the FundingIntent. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the FundingIntent. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Details about the latest underlying money movement attempt. */
  @SerializedName("latest_attempt")
  LatestAttempt latestAttempt;

  /** Whether the FundingIntent exists in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** Set of key-value pairs attached to the FundingIntent. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The action required to continue processing the FundingIntent. */
  @SerializedName("next_action")
  NextAction nextAction;

  /** The information to review before confirming the FundingIntent. */
  @SerializedName("next_confirmation")
  NextConfirmation nextConfirmation;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.funding_intent}.
   */
  @SerializedName("object")
  String object;

  /** Controls when the funds become available after processing. */
  @SerializedName("settlement_timing")
  SettlementTiming settlementTiming;

  /**
   * The current status of the FundingIntent.
   *
   * <p>One of {@code canceled}, {@code processing}, {@code requires_action}, {@code
   * requires_confirmation}, {@code succeeded}, or {@code validating}.
   */
  @SerializedName("status")
  String status;

  /** Additional details about the current status. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Timestamps for the FundingIntent's status transitions. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The destination for the funds. */
  @SerializedName("to")
  To to;

  /**
   * The type of FundingIntent.
   *
   * <p>Equal to {@code check}.
   */
  @SerializedName("type")
  String type;

  /** Details for a check FundingIntent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Check extends StripeObject {
    /** The ID of a File containing the back image of the check. */
    @SerializedName("back_image")
    String backImage;

    /** The ID of a File containing the front image of the check. */
    @SerializedName("front_image")
    String frontImage;
  }

  /** Details about the latest underlying money movement attempt. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LatestAttempt extends StripeObject {
    /** The ID of the InboundFunding created by the attempt. */
    @SerializedName("inbound_funding")
    String inboundFunding;

    /**
     * The type of underlying money movement created by the attempt.
     *
     * <p>Equal to {@code inbound_funding}.
     */
    @SerializedName("type")
    String type;
  }

  /** The action required to continue processing the FundingIntent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    /** Details for handling a failed attempt. */
    @SerializedName("handle_failure")
    HandleFailure handleFailure;

    /** The reason that you must provide a different check. */
    @SerializedName("provide_new_check")
    ProvideNewCheck provideNewCheck;

    /** Issues that require corrected check images or an updated amount. */
    @SerializedName("provide_new_images")
    ProvideNewImages provideNewImages;

    /**
     * The type of action required.
     *
     * <p>One of {@code handle_failure}, {@code provide_new_check}, {@code provide_new_images}, or
     * {@code requires_check_images}.
     */
    @SerializedName("type")
    String type;

    /** Details for handling a failed attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class HandleFailure extends StripeObject {
      /**
       * The reason the attempt failed.
       *
       * <p>One of {@code insufficient_funds}, {@code not_authorized}, or {@code stripe_rejected}.
       */
      @SerializedName("reason")
      String reason;

      /** Whether you can retry the FundingIntent. */
      @SerializedName("retryable")
      Boolean retryable;
    }

    /** The reason that you must provide a different check. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProvideNewCheck extends StripeObject {
      /** A human-readable description of the factor. */
      @SerializedName("description")
      String description;

      /**
       * A machine-readable reason for the factor.
       *
       * <p>One of {@code amount_variance_exceeds_threshold}, {@code
       * amount_variance_nearing_threshold}, {@code back_image_not_processed}, {@code
       * back_looks_like_front}, {@code back_signature_not_detected}, {@code bad_payee_name}, {@code
       * date_invalid}, {@code date_in_future}, {@code date_older_than_one_year}, {@code
       * date_older_than_six_months}, {@code duplicate_check}, {@code endorsement_missing}, {@code
       * folded_or_torn_corners}, {@code front_image_dimension_mismatch}, {@code
       * front_image_not_processed}, {@code front_image_too_dark}, {@code front_image_too_light},
       * {@code front_image_too_small}, {@code front_signature_not_detected}, {@code high_risk},
       * {@code image_cannot_be_processed}, {@code image_out_of_focus}, {@code invalid_check_type},
       * {@code invalid_routing_number}, {@code not_accepted_please_contact}, {@code
       * no_routing_number_detected}, {@code safe_harbor_phrase_missing}, {@code
       * savings_bond_detected}, {@code travelers_check}, or {@code unable_to_read_account_info}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** Issues that require corrected check images or an updated amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProvideNewImages extends StripeObject {
      /** Issues detected in the check amount. */
      @SerializedName("amount_issues")
      List<FundingIntent.NextAction.ProvideNewImages.AmountIssue> amountIssues;

      /** Issues detected in the back image of the check. */
      @SerializedName("back_image")
      List<FundingIntent.NextAction.ProvideNewImages.BackImage> backImage;

      /** Issues detected in the front image of the check. */
      @SerializedName("front_image")
      List<FundingIntent.NextAction.ProvideNewImages.FrontImage> frontImage;

      /**
       * For more details about AmountIssue, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AmountIssue extends StripeObject {
        /** A human-readable description of the factor. */
        @SerializedName("description")
        String description;

        /**
         * A machine-readable reason for the factor.
         *
         * <p>One of {@code amount_variance_exceeds_threshold}, {@code
         * amount_variance_nearing_threshold}, {@code back_image_not_processed}, {@code
         * back_looks_like_front}, {@code back_signature_not_detected}, {@code bad_payee_name},
         * {@code date_invalid}, {@code date_in_future}, {@code date_older_than_one_year}, {@code
         * date_older_than_six_months}, {@code duplicate_check}, {@code endorsement_missing}, {@code
         * folded_or_torn_corners}, {@code front_image_dimension_mismatch}, {@code
         * front_image_not_processed}, {@code front_image_too_dark}, {@code front_image_too_light},
         * {@code front_image_too_small}, {@code front_signature_not_detected}, {@code high_risk},
         * {@code image_cannot_be_processed}, {@code image_out_of_focus}, {@code
         * invalid_check_type}, {@code invalid_routing_number}, {@code not_accepted_please_contact},
         * {@code no_routing_number_detected}, {@code safe_harbor_phrase_missing}, {@code
         * savings_bond_detected}, {@code travelers_check}, or {@code unable_to_read_account_info}.
         */
        @SerializedName("reason")
        String reason;
      }

      /**
       * For more details about BackImage, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BackImage extends StripeObject {
        /** A human-readable description of the factor. */
        @SerializedName("description")
        String description;

        /**
         * A machine-readable reason for the factor.
         *
         * <p>One of {@code amount_variance_exceeds_threshold}, {@code
         * amount_variance_nearing_threshold}, {@code back_image_not_processed}, {@code
         * back_looks_like_front}, {@code back_signature_not_detected}, {@code bad_payee_name},
         * {@code date_invalid}, {@code date_in_future}, {@code date_older_than_one_year}, {@code
         * date_older_than_six_months}, {@code duplicate_check}, {@code endorsement_missing}, {@code
         * folded_or_torn_corners}, {@code front_image_dimension_mismatch}, {@code
         * front_image_not_processed}, {@code front_image_too_dark}, {@code front_image_too_light},
         * {@code front_image_too_small}, {@code front_signature_not_detected}, {@code high_risk},
         * {@code image_cannot_be_processed}, {@code image_out_of_focus}, {@code
         * invalid_check_type}, {@code invalid_routing_number}, {@code not_accepted_please_contact},
         * {@code no_routing_number_detected}, {@code safe_harbor_phrase_missing}, {@code
         * savings_bond_detected}, {@code travelers_check}, or {@code unable_to_read_account_info}.
         */
        @SerializedName("reason")
        String reason;
      }

      /**
       * For more details about FrontImage, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FrontImage extends StripeObject {
        /** A human-readable description of the factor. */
        @SerializedName("description")
        String description;

        /**
         * A machine-readable reason for the factor.
         *
         * <p>One of {@code amount_variance_exceeds_threshold}, {@code
         * amount_variance_nearing_threshold}, {@code back_image_not_processed}, {@code
         * back_looks_like_front}, {@code back_signature_not_detected}, {@code bad_payee_name},
         * {@code date_invalid}, {@code date_in_future}, {@code date_older_than_one_year}, {@code
         * date_older_than_six_months}, {@code duplicate_check}, {@code endorsement_missing}, {@code
         * folded_or_torn_corners}, {@code front_image_dimension_mismatch}, {@code
         * front_image_not_processed}, {@code front_image_too_dark}, {@code front_image_too_light},
         * {@code front_image_too_small}, {@code front_signature_not_detected}, {@code high_risk},
         * {@code image_cannot_be_processed}, {@code image_out_of_focus}, {@code
         * invalid_check_type}, {@code invalid_routing_number}, {@code not_accepted_please_contact},
         * {@code no_routing_number_detected}, {@code safe_harbor_phrase_missing}, {@code
         * savings_bond_detected}, {@code travelers_check}, or {@code unable_to_read_account_info}.
         */
        @SerializedName("reason")
        String reason;
      }
    }
  }

  /** The information to review before confirming the FundingIntent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextConfirmation extends StripeObject {
    /** Factors to review before confirming the FundingIntent. */
    @SerializedName("requires_review")
    RequiresReview requiresReview;

    /**
     * The type of confirmation required.
     *
     * <p>Equal to {@code requires_review}.
     */
    @SerializedName("type")
    String type;

    /** Factors to review before confirming the FundingIntent. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RequiresReview extends StripeObject {
      /** Factors that require review. */
      @SerializedName("factors")
      List<FundingIntent.NextConfirmation.RequiresReview.Factor> factors;

      /**
       * For more details about Factor, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Factor extends StripeObject {
        /** A human-readable description of the factor. */
        @SerializedName("description")
        String description;

        /**
         * A machine-readable reason for the factor.
         *
         * <p>One of {@code amount_variance_exceeds_threshold}, {@code
         * amount_variance_nearing_threshold}, {@code back_image_not_processed}, {@code
         * back_looks_like_front}, {@code back_signature_not_detected}, {@code bad_payee_name},
         * {@code date_invalid}, {@code date_in_future}, {@code date_older_than_one_year}, {@code
         * date_older_than_six_months}, {@code duplicate_check}, {@code endorsement_missing}, {@code
         * folded_or_torn_corners}, {@code front_image_dimension_mismatch}, {@code
         * front_image_not_processed}, {@code front_image_too_dark}, {@code front_image_too_light},
         * {@code front_image_too_small}, {@code front_signature_not_detected}, {@code high_risk},
         * {@code image_cannot_be_processed}, {@code image_out_of_focus}, {@code
         * invalid_check_type}, {@code invalid_routing_number}, {@code not_accepted_please_contact},
         * {@code no_routing_number_detected}, {@code safe_harbor_phrase_missing}, {@code
         * savings_bond_detected}, {@code travelers_check}, or {@code unable_to_read_account_info}.
         */
        @SerializedName("reason")
        String reason;
      }
    }
  }

  /** Controls when the funds become available after processing. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettlementTiming extends StripeObject {
    /** The number of days to delay the availability of funds after processing completes. */
    @SerializedName("delay_days_override")
    Long delayDaysOverride;
  }

  /** Additional details about the current status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details present when the FundingIntent is canceled. */
    @SerializedName("canceled")
    Canceled canceled;

    /** Details present when the FundingIntent is canceled. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /**
       * The reason the FundingIntent was canceled.
       *
       * <p>Equal to {@code canceled_by_user}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Timestamps for the FundingIntent's status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Time at which the FundingIntent entered the {@code canceled} status. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** Time at which the FundingIntent entered the {@code processing} status. */
    @SerializedName("processing_at")
    Instant processingAt;

    /** Time at which the FundingIntent entered the {@code requires_action} status. */
    @SerializedName("requires_action_at")
    Instant requiresActionAt;

    /** Time at which the FundingIntent entered the {@code requires_confirmation} status. */
    @SerializedName("requires_confirmation_at")
    Instant requiresConfirmationAt;

    /** Time at which the FundingIntent entered the {@code succeeded} status. */
    @SerializedName("succeeded_at")
    Instant succeededAt;

    /** Time at which the FundingIntent entered the {@code validating} status. */
    @SerializedName("validating_at")
    Instant validatingAt;
  }

  /** The destination for the funds. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The currency of the destination FinancialAccount balance. */
    @SerializedName("currency")
    String currency;

    /** The ID of the FinancialAccount that receives the funds. */
    @SerializedName("financial_account")
    String financialAccount;
  }
}
