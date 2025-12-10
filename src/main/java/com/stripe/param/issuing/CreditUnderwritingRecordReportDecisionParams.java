// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CreditUnderwritingRecordReportDecisionParams extends ApiRequestParams {
  /** <strong>Required.</strong> Date when a decision was made. */
  @SerializedName("decided_at")
  Long decidedAt;

  /** <strong>Required.</strong> Details about the decision. */
  @SerializedName("decision")
  Decision decision;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * File containing regulatory reporting data for the decision. Required if you are subject to this
   * <a
   * href="https://docs.stripe.com/issuing/credit/report-required-regulatory-data-for-credit-decisions">reporting
   * requirement</a>.
   */
  @SerializedName("regulatory_reporting_file")
  String regulatoryReportingFile;

  /**
   * If an exception to the usual underwriting criteria was made for this decision, details about
   * the exception must be provided. Exceptions should only be granted in rare circumstances, in
   * consultation with Stripe Compliance.
   */
  @SerializedName("underwriting_exception")
  UnderwritingException underwritingException;

  private CreditUnderwritingRecordReportDecisionParams(
      Long decidedAt,
      Decision decision,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String regulatoryReportingFile,
      UnderwritingException underwritingException) {
    this.decidedAt = decidedAt;
    this.decision = decision;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.regulatoryReportingFile = regulatoryReportingFile;
    this.underwritingException = underwritingException;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long decidedAt;

    private Decision decision;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String regulatoryReportingFile;

    private UnderwritingException underwritingException;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditUnderwritingRecordReportDecisionParams build() {
      return new CreditUnderwritingRecordReportDecisionParams(
          this.decidedAt,
          this.decision,
          this.expand,
          this.extraParams,
          this.metadata,
          this.regulatoryReportingFile,
          this.underwritingException);
    }

    /** <strong>Required.</strong> Date when a decision was made. */
    public Builder setDecidedAt(Long decidedAt) {
      this.decidedAt = decidedAt;
      return this;
    }

    /** <strong>Required.</strong> Details about the decision. */
    public Builder setDecision(CreditUnderwritingRecordReportDecisionParams.Decision decision) {
      this.decision = decision;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditUnderwritingRecordReportDecisionParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditUnderwritingRecordReportDecisionParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditUnderwritingRecordReportDecisionParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CreditUnderwritingRecordReportDecisionParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditUnderwritingRecordReportDecisionParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CreditUnderwritingRecordReportDecisionParams#metadata} for the field
     * documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * File containing regulatory reporting data for the decision. Required if you are subject to
     * this <a
     * href="https://docs.stripe.com/issuing/credit/report-required-regulatory-data-for-credit-decisions">reporting
     * requirement</a>.
     */
    public Builder setRegulatoryReportingFile(String regulatoryReportingFile) {
      this.regulatoryReportingFile = regulatoryReportingFile;
      return this;
    }

    /**
     * If an exception to the usual underwriting criteria was made for this decision, details about
     * the exception must be provided. Exceptions should only be granted in rare circumstances, in
     * consultation with Stripe Compliance.
     */
    public Builder setUnderwritingException(
        CreditUnderwritingRecordReportDecisionParams.UnderwritingException underwritingException) {
      this.underwritingException = underwritingException;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Decision {
    /** Details about the application rejection. */
    @SerializedName("application_rejected")
    ApplicationRejected applicationRejected;

    /**
     * Details about the credit limit approved. An approved credit limit is required before you can
     * set a {@code credit_limit_amount} in the <a
     * href="https://docs.stripe.com/api/issuing/credit_policy/">CreditPolicy API</a>
     */
    @SerializedName("credit_limit_approved")
    CreditLimitApproved creditLimitApproved;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Outcome of the decision. */
    @SerializedName("type")
    Type type;

    private Decision(
        ApplicationRejected applicationRejected,
        CreditLimitApproved creditLimitApproved,
        Map<String, Object> extraParams,
        Type type) {
      this.applicationRejected = applicationRejected;
      this.creditLimitApproved = creditLimitApproved;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ApplicationRejected applicationRejected;

      private CreditLimitApproved creditLimitApproved;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditUnderwritingRecordReportDecisionParams.Decision build() {
        return new CreditUnderwritingRecordReportDecisionParams.Decision(
            this.applicationRejected, this.creditLimitApproved, this.extraParams, this.type);
      }

      /** Details about the application rejection. */
      public Builder setApplicationRejected(
          CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected
              applicationRejected) {
        this.applicationRejected = applicationRejected;
        return this;
      }

      /**
       * Details about the credit limit approved. An approved credit limit is required before you
       * can set a {@code credit_limit_amount} in the <a
       * href="https://docs.stripe.com/api/issuing/credit_policy/">CreditPolicy API</a>
       */
      public Builder setCreditLimitApproved(
          CreditUnderwritingRecordReportDecisionParams.Decision.CreditLimitApproved
              creditLimitApproved) {
        this.creditLimitApproved = creditLimitApproved;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditUnderwritingRecordReportDecisionParams.Decision#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CreditUnderwritingRecordReportDecisionParams.Decision#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Outcome of the decision. */
      public Builder setType(CreditUnderwritingRecordReportDecisionParams.Decision.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicationRejected {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details about the {@code reasons.other} when present. */
      @SerializedName("reason_other_explanation")
      String reasonOtherExplanation;

      /**
       * <strong>Required.</strong> List of reasons why the application was rejected, up to 4
       * reasons, in order of importance.
       */
      @SerializedName("reasons")
      List<CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected.Reason>
          reasons;

      private ApplicationRejected(
          Map<String, Object> extraParams,
          String reasonOtherExplanation,
          List<CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected.Reason>
              reasons) {
        this.extraParams = extraParams;
        this.reasonOtherExplanation = reasonOtherExplanation;
        this.reasons = reasons;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String reasonOtherExplanation;

        private List<
                CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected.Reason>
            reasons;

        /** Finalize and obtain parameter instance from this builder. */
        public CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected build() {
          return new CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected(
              this.extraParams, this.reasonOtherExplanation, this.reasons);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details about the {@code reasons.other} when present. */
        public Builder setReasonOtherExplanation(String reasonOtherExplanation) {
          this.reasonOtherExplanation = reasonOtherExplanation;
          return this;
        }

        /**
         * Add an element to `reasons` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected#reasons} for
         * the field documentation.
         */
        public Builder addReason(
            CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected.Reason
                element) {
          if (this.reasons == null) {
            this.reasons = new ArrayList<>();
          }
          this.reasons.add(element);
          return this;
        }

        /**
         * Add all elements to `reasons` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected#reasons} for
         * the field documentation.
         */
        public Builder addAllReason(
            List<CreditUnderwritingRecordReportDecisionParams.Decision.ApplicationRejected.Reason>
                elements) {
          if (this.reasons == null) {
            this.reasons = new ArrayList<>();
          }
          this.reasons.addAll(elements);
          return this;
        }
      }

      public enum Reason implements ApiRequestParams.EnumParam {
        @SerializedName("applicant_is_not_beneficial_owner")
        APPLICANT_IS_NOT_BENEFICIAL_OWNER("applicant_is_not_beneficial_owner"),

        @SerializedName("applicant_too_young")
        APPLICANT_TOO_YOUNG("applicant_too_young"),

        @SerializedName("application_is_not_beneficial_owner")
        APPLICATION_IS_NOT_BENEFICIAL_OWNER("application_is_not_beneficial_owner"),

        @SerializedName("bankruptcy")
        BANKRUPTCY("bankruptcy"),

        @SerializedName("business_size_too_small")
        BUSINESS_SIZE_TOO_SMALL("business_size_too_small"),

        @SerializedName("current_account_tier_ineligible")
        CURRENT_ACCOUNT_TIER_INELIGIBLE("current_account_tier_ineligible"),

        @SerializedName("customer_already_exists")
        CUSTOMER_ALREADY_EXISTS("customer_already_exists"),

        @SerializedName("customer_requested_account_closure")
        CUSTOMER_REQUESTED_ACCOUNT_CLOSURE("customer_requested_account_closure"),

        @SerializedName("debt_to_cash_balance_ratio_too_high")
        DEBT_TO_CASH_BALANCE_RATIO_TOO_HIGH("debt_to_cash_balance_ratio_too_high"),

        @SerializedName("debt_to_equity_ratio_too_high")
        DEBT_TO_EQUITY_RATIO_TOO_HIGH("debt_to_equity_ratio_too_high"),

        @SerializedName("delinquent_credit_obligations")
        DELINQUENT_CREDIT_OBLIGATIONS("delinquent_credit_obligations"),

        @SerializedName("dispute_rate_too_high")
        DISPUTE_RATE_TOO_HIGH("dispute_rate_too_high"),

        @SerializedName("duration_of_residence")
        DURATION_OF_RESIDENCE("duration_of_residence"),

        @SerializedName("excessive_income_or_revenue_obligations")
        EXCESSIVE_INCOME_OR_REVENUE_OBLIGATIONS("excessive_income_or_revenue_obligations"),

        @SerializedName("expenses_to_cash_balance_ratio_too_high")
        EXPENSES_TO_CASH_BALANCE_RATIO_TOO_HIGH("expenses_to_cash_balance_ratio_too_high"),

        @SerializedName("foreclosure_or_repossession")
        FORECLOSURE_OR_REPOSSESSION("foreclosure_or_repossession"),

        @SerializedName("frozen_file_at_credit_bureau")
        FROZEN_FILE_AT_CREDIT_BUREAU("frozen_file_at_credit_bureau"),

        @SerializedName("garnishment_or_attachment")
        GARNISHMENT_OR_ATTACHMENT("garnishment_or_attachment"),

        @SerializedName("government_loan_program_criteria")
        GOVERNMENT_LOAN_PROGRAM_CRITERIA("government_loan_program_criteria"),

        @SerializedName("high_concentration_of_clients")
        HIGH_CONCENTRATION_OF_CLIENTS("high_concentration_of_clients"),

        @SerializedName("high_risk_industry")
        HIGH_RISK_INDUSTRY("high_risk_industry"),

        @SerializedName("incomplete_application")
        INCOMPLETE_APPLICATION("incomplete_application"),

        @SerializedName("inconsistent_monthly_revenues")
        INCONSISTENT_MONTHLY_REVENUES("inconsistent_monthly_revenues"),

        @SerializedName("insufficient_account_history_with_platform")
        INSUFFICIENT_ACCOUNT_HISTORY_WITH_PLATFORM("insufficient_account_history_with_platform"),

        @SerializedName("insufficient_bank_account_history")
        INSUFFICIENT_BANK_ACCOUNT_HISTORY("insufficient_bank_account_history"),

        @SerializedName("insufficient_cash_balance")
        INSUFFICIENT_CASH_BALANCE("insufficient_cash_balance"),

        @SerializedName("insufficient_cash_flow")
        INSUFFICIENT_CASH_FLOW("insufficient_cash_flow"),

        @SerializedName("insufficient_collateral")
        INSUFFICIENT_COLLATERAL("insufficient_collateral"),

        @SerializedName("insufficient_credit_experience")
        INSUFFICIENT_CREDIT_EXPERIENCE("insufficient_credit_experience"),

        @SerializedName("insufficient_deposits")
        INSUFFICIENT_DEPOSITS("insufficient_deposits"),

        @SerializedName("insufficient_income")
        INSUFFICIENT_INCOME("insufficient_income"),

        @SerializedName("insufficient_margin_ratio")
        INSUFFICIENT_MARGIN_RATIO("insufficient_margin_ratio"),

        @SerializedName("insufficient_operating_profit")
        INSUFFICIENT_OPERATING_PROFIT("insufficient_operating_profit"),

        @SerializedName("insufficient_period_in_operation")
        INSUFFICIENT_PERIOD_IN_OPERATION("insufficient_period_in_operation"),

        @SerializedName("insufficient_reserves")
        INSUFFICIENT_RESERVES("insufficient_reserves"),

        @SerializedName("insufficient_revenue")
        INSUFFICIENT_REVENUE("insufficient_revenue"),

        @SerializedName("insufficient_social_media_performance")
        INSUFFICIENT_SOCIAL_MEDIA_PERFORMANCE("insufficient_social_media_performance"),

        @SerializedName("insufficient_time_in_network")
        INSUFFICIENT_TIME_IN_NETWORK("insufficient_time_in_network"),

        @SerializedName("insufficient_trade_credit_insurance")
        INSUFFICIENT_TRADE_CREDIT_INSURANCE("insufficient_trade_credit_insurance"),

        @SerializedName("invalid_business_license")
        INVALID_BUSINESS_LICENSE("invalid_business_license"),

        @SerializedName("lacking_cash_account")
        LACKING_CASH_ACCOUNT("lacking_cash_account"),

        @SerializedName("late_payment_history_reported_to_bureau")
        LATE_PAYMENT_HISTORY_REPORTED_TO_BUREAU("late_payment_history_reported_to_bureau"),

        @SerializedName("lien_collection_action_or_judgement")
        LIEN_COLLECTION_ACTION_OR_JUDGEMENT("lien_collection_action_or_judgement"),

        @SerializedName("negative_public_information")
        NEGATIVE_PUBLIC_INFORMATION("negative_public_information"),

        @SerializedName("no_credit_file")
        NO_CREDIT_FILE("no_credit_file"),

        @SerializedName("other")
        OTHER("other"),

        @SerializedName("outside_supported_country")
        OUTSIDE_SUPPORTED_COUNTRY("outside_supported_country"),

        @SerializedName("outside_supported_state")
        OUTSIDE_SUPPORTED_STATE("outside_supported_state"),

        @SerializedName("poor_payment_history_with_platform")
        POOR_PAYMENT_HISTORY_WITH_PLATFORM("poor_payment_history_with_platform"),

        @SerializedName("prior_or_current_legal_action")
        PRIOR_OR_CURRENT_LEGAL_ACTION("prior_or_current_legal_action"),

        @SerializedName("prohibited_industry")
        PROHIBITED_INDUSTRY("prohibited_industry"),

        @SerializedName("rate_of_cash_balance_fluctuation_too_high")
        RATE_OF_CASH_BALANCE_FLUCTUATION_TOO_HIGH("rate_of_cash_balance_fluctuation_too_high"),

        @SerializedName("recent_inquiries_on_business_credit_report")
        RECENT_INQUIRIES_ON_BUSINESS_CREDIT_REPORT("recent_inquiries_on_business_credit_report"),

        @SerializedName("removal_of_bank_account_connection")
        REMOVAL_OF_BANK_ACCOUNT_CONNECTION("removal_of_bank_account_connection"),

        @SerializedName("revenue_discrepancy")
        REVENUE_DISCREPANCY("revenue_discrepancy"),

        @SerializedName("runway_too_short")
        RUNWAY_TOO_SHORT("runway_too_short"),

        @SerializedName("suspected_fraud")
        SUSPECTED_FRAUD("suspected_fraud"),

        @SerializedName("too_many_non_sufficient_funds_or_overdrafts")
        TOO_MANY_NON_SUFFICIENT_FUNDS_OR_OVERDRAFTS("too_many_non_sufficient_funds_or_overdrafts"),

        @SerializedName("unable_to_verify_address")
        UNABLE_TO_VERIFY_ADDRESS("unable_to_verify_address"),

        @SerializedName("unable_to_verify_identity")
        UNABLE_TO_VERIFY_IDENTITY("unable_to_verify_identity"),

        @SerializedName("unable_to_verify_income_or_revenue")
        UNABLE_TO_VERIFY_INCOME_OR_REVENUE("unable_to_verify_income_or_revenue"),

        @SerializedName("unprofitable")
        UNPROFITABLE("unprofitable"),

        @SerializedName("unsupportable_business_type")
        UNSUPPORTABLE_BUSINESS_TYPE("unsupportable_business_type");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Reason(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CreditLimitApproved {
      /**
       * <strong>Required.</strong> The credit approved, in the currency of the account and <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /** The currency of the credit approved, will default to the Account's Issuing currency. */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CreditLimitApproved(Long amount, String currency, Map<String, Object> extraParams) {
        this.amount = amount;
        this.currency = currency;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String currency;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public CreditUnderwritingRecordReportDecisionParams.Decision.CreditLimitApproved build() {
          return new CreditUnderwritingRecordReportDecisionParams.Decision.CreditLimitApproved(
              this.amount, this.currency, this.extraParams);
        }

        /**
         * <strong>Required.</strong> The credit approved, in the currency of the account and <a
         * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /** The currency of the credit approved, will default to the Account's Issuing currency. */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.CreditLimitApproved#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CreditUnderwritingRecordReportDecisionParams.Decision.CreditLimitApproved#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("additional_information_requested")
      ADDITIONAL_INFORMATION_REQUESTED("additional_information_requested"),

      @SerializedName("application_rejected")
      APPLICATION_REJECTED("application_rejected"),

      @SerializedName("credit_limit_approved")
      CREDIT_LIMIT_APPROVED("credit_limit_approved"),

      @SerializedName("withdrawn_by_applicant")
      WITHDRAWN_BY_APPLICANT("withdrawn_by_applicant");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UnderwritingException {
    /** <strong>Required.</strong> Written explanation for the exception. */
    @SerializedName("explanation")
    String explanation;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The decision before the exception was applied. */
    @SerializedName("original_decision_type")
    OriginalDecisionType originalDecisionType;

    private UnderwritingException(
        String explanation,
        Map<String, Object> extraParams,
        OriginalDecisionType originalDecisionType) {
      this.explanation = explanation;
      this.extraParams = extraParams;
      this.originalDecisionType = originalDecisionType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String explanation;

      private Map<String, Object> extraParams;

      private OriginalDecisionType originalDecisionType;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditUnderwritingRecordReportDecisionParams.UnderwritingException build() {
        return new CreditUnderwritingRecordReportDecisionParams.UnderwritingException(
            this.explanation, this.extraParams, this.originalDecisionType);
      }

      /** <strong>Required.</strong> Written explanation for the exception. */
      public Builder setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditUnderwritingRecordReportDecisionParams.UnderwritingException#extraParams} for the
       * field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CreditUnderwritingRecordReportDecisionParams.UnderwritingException#extraParams}
       * for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The decision before the exception was applied. */
      public Builder setOriginalDecisionType(
          CreditUnderwritingRecordReportDecisionParams.UnderwritingException.OriginalDecisionType
              originalDecisionType) {
        this.originalDecisionType = originalDecisionType;
        return this;
      }
    }

    public enum OriginalDecisionType implements ApiRequestParams.EnumParam {
      @SerializedName("additional_information_requested")
      ADDITIONAL_INFORMATION_REQUESTED("additional_information_requested"),

      @SerializedName("application_rejected")
      APPLICATION_REJECTED("application_rejected"),

      @SerializedName("credit_limit_approved")
      CREDIT_LIMIT_APPROVED("credit_limit_approved"),

      @SerializedName("credit_limit_decreased")
      CREDIT_LIMIT_DECREASED("credit_limit_decreased"),

      @SerializedName("credit_line_closed")
      CREDIT_LINE_CLOSED("credit_line_closed"),

      @SerializedName("no_changes")
      NO_CHANGES("no_changes"),

      @SerializedName("withdrawn_by_applicant")
      WITHDRAWN_BY_APPLICANT("withdrawn_by_applicant");

      @Getter(onMethod_ = {@Override})
      private final String value;

      OriginalDecisionType(String value) {
        this.value = value;
      }
    }
  }
}
