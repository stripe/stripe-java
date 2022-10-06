// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Encodes whether a FinancialAccount has access to a particular Feature, with a {@code status} enum
 * and associated {@code status_details}. Stripe or the platform can control Features via the
 * requested field.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountFeatures extends StripeObject {
  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("card_issuing")
  CardIssuing cardIssuing;

  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("deposit_insurance")
  DepositInsurance depositInsurance;

  /** Settings related to Financial Addresses features on a Financial Account. */
  @SerializedName("financial_addresses")
  FinancialAddresses financialAddresses;

  /** InboundTransfers contains inbound transfers features for a FinancialAccount. */
  @SerializedName("inbound_transfers")
  InboundTransfers inboundTransfers;

  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("intra_stripe_flows")
  IntraStripeFlows intraStripeFlows;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.financial_account_features}.
   */
  @SerializedName("object")
  String object;

  /** Settings related to Outbound Payments features on a Financial Account. */
  @SerializedName("outbound_payments")
  OutboundPayments outboundPayments;

  /** OutboundTransfers contains outbound transfers features for a FinancialAccount. */
  @SerializedName("outbound_transfers")
  OutboundTransfers outboundTransfers;

  /** Toggle settings for enabling/disabling a feature. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardIssuing extends StripeObject {
    /** Whether the FinancialAccount should have the Feature. */
    @SerializedName("requested")
    Boolean requested;

    /**
     * Whether the Feature is operational.
     *
     * <p>One of {@code active}, {@code pending}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;

    /** Additional details; includes at least one entry when the status is not {@code active}. */
    @SerializedName("status_details")
    List<FinancialAccountFeatures.CardIssuing.StatusDetails> statusDetails;

    /** Additional details on the FinancialAccount Features information. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /**
       * Represents the reason why the status is {@code pending} or {@code restricted}.
       *
       * <p>One of {@code activating}, {@code capability_not_requested}, {@code
       * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
       * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
       * restricted_by_platform}, or {@code restricted_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * Represents what the user should do, if anything, to activate the Feature.
       *
       * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
       * remove_restriction}.
       */
      @SerializedName("resolution")
      String resolution;

      /**
       * The {@code platform_restrictions} that are restricting this Feature.
       *
       * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
       */
      @SerializedName("restriction")
      String restriction;
    }
  }

  /** Toggle settings for enabling/disabling a feature. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DepositInsurance extends StripeObject {
    /** Whether the FinancialAccount should have the Feature. */
    @SerializedName("requested")
    Boolean requested;

    /**
     * Whether the Feature is operational.
     *
     * <p>One of {@code active}, {@code pending}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;

    /** Additional details; includes at least one entry when the status is not {@code active}. */
    @SerializedName("status_details")
    List<FinancialAccountFeatures.DepositInsurance.StatusDetails> statusDetails;

    /** Additional details on the FinancialAccount Features information. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /**
       * Represents the reason why the status is {@code pending} or {@code restricted}.
       *
       * <p>One of {@code activating}, {@code capability_not_requested}, {@code
       * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
       * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
       * restricted_by_platform}, or {@code restricted_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * Represents what the user should do, if anything, to activate the Feature.
       *
       * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
       * remove_restriction}.
       */
      @SerializedName("resolution")
      String resolution;

      /**
       * The {@code platform_restrictions} that are restricting this Feature.
       *
       * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
       */
      @SerializedName("restriction")
      String restriction;
    }
  }

  /** Settings related to Financial Addresses features on a Financial Account. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAddresses extends StripeObject {
    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("aba")
    Aba aba;

    /** Toggle settings for enabling/disabling a feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Aba extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.FinancialAddresses.Aba.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }
  }

  /** InboundTransfers contains inbound transfers features for a FinancialAccount. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InboundTransfers extends StripeObject {
    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @SerializedName("ach")
    Ach ach;

    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.InboundTransfers.Ach.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }
  }

  /** Toggle settings for enabling/disabling a feature. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IntraStripeFlows extends StripeObject {
    /** Whether the FinancialAccount should have the Feature. */
    @SerializedName("requested")
    Boolean requested;

    /**
     * Whether the Feature is operational.
     *
     * <p>One of {@code active}, {@code pending}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;

    /** Additional details; includes at least one entry when the status is not {@code active}. */
    @SerializedName("status_details")
    List<FinancialAccountFeatures.IntraStripeFlows.StatusDetails> statusDetails;

    /** Additional details on the FinancialAccount Features information. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /**
       * Represents the reason why the status is {@code pending} or {@code restricted}.
       *
       * <p>One of {@code activating}, {@code capability_not_requested}, {@code
       * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
       * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
       * restricted_by_platform}, or {@code restricted_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * Represents what the user should do, if anything, to activate the Feature.
       *
       * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
       * remove_restriction}.
       */
      @SerializedName("resolution")
      String resolution;

      /**
       * The {@code platform_restrictions} that are restricting this Feature.
       *
       * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
       */
      @SerializedName("restriction")
      String restriction;
    }
  }

  /** Settings related to Outbound Payments features on a Financial Account. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OutboundPayments extends StripeObject {
    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @SerializedName("ach")
    Ach ach;

    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("us_domestic_wire")
    UsDomesticWire usDomesticWire;

    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.OutboundPayments.Ach.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }

    /** Toggle settings for enabling/disabling a feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsDomesticWire extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.OutboundPayments.UsDomesticWire.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }
  }

  /** OutboundTransfers contains outbound transfers features for a FinancialAccount. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OutboundTransfers extends StripeObject {
    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @SerializedName("ach")
    Ach ach;

    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("us_domestic_wire")
    UsDomesticWire usDomesticWire;

    /** Toggle settings for enabling/disabling an ACH specific feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.OutboundTransfers.Ach.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }

    /** Toggle settings for enabling/disabling a feature. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsDomesticWire extends StripeObject {
      /** Whether the FinancialAccount should have the Feature. */
      @SerializedName("requested")
      Boolean requested;

      /**
       * Whether the Feature is operational.
       *
       * <p>One of {@code active}, {@code pending}, or {@code restricted}.
       */
      @SerializedName("status")
      String status;

      /** Additional details; includes at least one entry when the status is not {@code active}. */
      @SerializedName("status_details")
      List<FinancialAccountFeatures.OutboundTransfers.UsDomesticWire.StatusDetails> statusDetails;

      /** Additional details on the FinancialAccount Features information. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StatusDetails extends StripeObject {
        /**
         * Represents the reason why the status is {@code pending} or {@code restricted}.
         *
         * <p>One of {@code activating}, {@code capability_not_requested}, {@code
         * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
         * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
         * restricted_by_platform}, or {@code restricted_other}.
         */
        @SerializedName("code")
        String code;

        /**
         * Represents what the user should do, if anything, to activate the Feature.
         *
         * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
         * remove_restriction}.
         */
        @SerializedName("resolution")
        String resolution;

        /**
         * The {@code platform_restrictions} that are restricting this Feature.
         *
         * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
         */
        @SerializedName("restriction")
        String restriction;
      }
    }
  }

  /** Restrictions that a Connect Platform has placed on this FinancialAccount. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PlatformRestriction extends StripeObject {
    /**
     * Restricts all inbound money movement.
     *
     * <p>One of {@code restricted}, or {@code unrestricted}.
     */
    @SerializedName("inbound_flows")
    String inboundFlows;

    /**
     * Restricts all outbound money movement.
     *
     * <p>One of {@code restricted}, or {@code unrestricted}.
     */
    @SerializedName("outbound_flows")
    String outboundFlows;
  }
}
