// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Account Session grants access to an account through Connect embedded components for a limited
 * time.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountSession extends StripeObject implements HasId {
  /** The ID of the account this Account Session grants access to. */
  @SerializedName("account")
  String account;

  /**
   * The client secret used to initialize Connect embedded components. Do not log it or expose it to
   * anyone other than the intended user.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Settings and scopes for each embedded component in this Account Session. */
  @SerializedName("components")
  Components components;

  /** The time at which the Account Session was created. */
  @SerializedName("created")
  Instant created;

  /** The time at which the Account Session expires. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** Unique identifier for the Account Session. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value true if the object exists in live mode or false if the object exists in test
   * mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.account_session}.
   */
  @SerializedName("object")
  String object;

  /** Settings and scopes for each embedded component in this Account Session. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Components extends StripeObject {
    /** Settings for the Account Management embedded component. */
    @SerializedName("account_management")
    AccountManagement accountManagement;

    /** Settings for the Account Onboarding embedded component. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /** Settings for the Agentic Commerce Settings embedded component. */
    @SerializedName("agentic_commerce_settings")
    AgenticCommerceSettings agenticCommerceSettings;

    /** Settings for the App Install embedded component. */
    @SerializedName("app_install")
    AppInstall appInstall;

    /** Settings for the App Viewport embedded component. */
    @SerializedName("app_viewport")
    AppViewport appViewport;

    /** Settings for the Balance Report embedded component. */
    @SerializedName("balance_report")
    BalanceReport balanceReport;

    /** Settings for the Balances embedded component. */
    @SerializedName("balances")
    Balances balances;

    /** Settings for the Bills embedded component. */
    @SerializedName("bills")
    Bills bills;

    /** Settings for the Capital Financing embedded component. */
    @SerializedName("capital_financing")
    CapitalFinancing capitalFinancing;

    /** Settings for the Capital Financing Application embedded component. */
    @SerializedName("capital_financing_application")
    CapitalFinancingApplication capitalFinancingApplication;

    /** Settings for the Capital Financing Promotion embedded component. */
    @SerializedName("capital_financing_promotion")
    CapitalFinancingPromotion capitalFinancingPromotion;

    /** Settings for the Check Scanning embedded component. */
    @SerializedName("check_scanning")
    CheckScanning checkScanning;

    /** Settings for the Disputes List embedded component. */
    @SerializedName("disputes_list")
    DisputesList disputesList;

    /** Settings for the Documents embedded component. */
    @SerializedName("documents")
    Documents documents;

    /** Settings for the Export Tax Transactions embedded component. */
    @SerializedName("export_tax_transactions")
    ExportTaxTransactions exportTaxTransactions;

    /** Settings for the Financial Account Rewards embedded component. */
    @SerializedName("financial_account_rewards")
    FinancialAccountRewards financialAccountRewards;

    /** Settings for the Financial Accounts embedded component. */
    @SerializedName("financial_accounts")
    FinancialAccounts financialAccounts;

    /** Settings for the Financial Accounts Transactions embedded component. */
    @SerializedName("financial_accounts_transactions")
    FinancialAccountsTransactions financialAccountsTransactions;

    /** Settings for the Instant Payouts Promotion embedded component. */
    @SerializedName("instant_payouts_promotion")
    InstantPayoutsPromotion instantPayoutsPromotion;

    /** Settings for the Invoice History embedded component. */
    @SerializedName("invoice_history")
    InvoiceHistory invoiceHistory;

    /** Settings for the Issuing Card embedded component. */
    @SerializedName("issuing_card")
    IssuingCard issuingCard;

    /** Settings for the Issuing Cards List embedded component. */
    @SerializedName("issuing_cards_list")
    IssuingCardsList issuingCardsList;

    /** Settings for the Network Cost Passthrough Report embedded component. */
    @SerializedName("network_cost_passthrough_report")
    NetworkCostPassthroughReport networkCostPassthroughReport;

    /** Settings for the Notification Banner embedded component. */
    @SerializedName("notification_banner")
    NotificationBanner notificationBanner;

    /** Settings for the Payment Details embedded component. */
    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

    /** Settings for the Payment Disputes embedded component. */
    @SerializedName("payment_disputes")
    PaymentDisputes paymentDisputes;

    /** Settings for the Payment Method Settings embedded component. */
    @SerializedName("payment_method_settings")
    PaymentMethodSettings paymentMethodSettings;

    /** Settings for the Payments embedded component. */
    @SerializedName("payments")
    Payments payments;

    /** Settings for the Payout Details embedded component. */
    @SerializedName("payout_details")
    PayoutDetails payoutDetails;

    /** Settings for the Payout Reconciliation Report embedded component. */
    @SerializedName("payout_reconciliation_report")
    PayoutReconciliationReport payoutReconciliationReport;

    /** Settings for the Payouts embedded component. */
    @SerializedName("payouts")
    Payouts payouts;

    /** Settings for the Payouts List embedded component. */
    @SerializedName("payouts_list")
    PayoutsList payoutsList;

    /** Settings for the Product Tax Code Selector embedded component. */
    @SerializedName("product_tax_code_selector")
    ProductTaxCodeSelector productTaxCodeSelector;

    /** Settings for the Reporting Chart embedded component. */
    @SerializedName("reporting_chart")
    ReportingChart reportingChart;

    /** Settings for the Tax Registrations embedded component. */
    @SerializedName("tax_registrations")
    TaxRegistrations taxRegistrations;

    /** Settings for the Tax Settings embedded component. */
    @SerializedName("tax_settings")
    TaxSettings taxSettings;

    /** Settings for the Tax Threshold Monitoring embedded component. */
    @SerializedName("tax_threshold_monitoring")
    TaxThresholdMonitoring taxThresholdMonitoring;

    /** Settings for the Terminal Hardware Orders embedded component. */
    @SerializedName("terminal_hardware_orders")
    TerminalHardwareOrders terminalHardwareOrders;

    /** Settings for the Terminal Hardware Shop embedded component. */
    @SerializedName("terminal_hardware_shop")
    TerminalHardwareShop terminalHardwareShop;

    /** Settings for the Account Management embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountManagement extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Account Onboarding embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Agentic Commerce Settings embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AgenticCommerceSettings extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the App Install embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AppInstall extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /** The Stripe App IDs allowed in the enabled app components. */
        @SerializedName("allowed_stripe_app_ids")
        List<String> allowedStripeAppIds;
      }
    }

    /** Settings for the App Viewport embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AppViewport extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /** The Stripe App IDs allowed in the enabled app components. */
        @SerializedName("allowed_stripe_app_ids")
        List<String> allowedStripeAppIds;
      }
    }

    /** Settings for the Balance Report embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BalanceReport extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Balances embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balances extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Controls whether creating instant payouts is enabled, disabled, or determined by
         * Dashboard rules.
         *
         * <p>One of {@code disabled}, {@code enabled}, or {@code use_dashboard_rules}.
         */
        @SerializedName("create_instant_payouts")
        String createInstantPayouts;

        /**
         * Whether to allow changing the payout schedule.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_payout_schedule")
        String createPayoutSchedule;

        /**
         * Whether to allow creating standard payouts.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_standard_payouts")
        String createStandardPayouts;

        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Bills embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bills extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow creating outbound payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_outbound_payments")
        String createOutboundPayments;

        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing bills.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_bills")
        String manageBills;
      }
    }

    /** Settings for the Capital Financing embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancing extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Capital Financing Application embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancingApplication extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Capital Financing Promotion embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancingPromotion extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Check Scanning embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckScanning extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow creating US paper checks on the application.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_us_paper_check_on_application")
        String createUsPaperCheckOnApplication;
      }
    }

    /** Settings for the Disputes List embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisputesList extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow capturing payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("capture_payments")
        String capturePayments;

        /**
         * Whether to allow managing destination and on-behalf-of charges.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_destination_on_behalf_of_charges")
        String manageDestinationOnBehalfOfCharges;

        /**
         * Whether to allow managing payment disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payment_disputes")
        String managePaymentDisputes;

        /**
         * Whether to allow refunding payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_refund_payments")
        String manageRefundPayments;

        /**
         * Whether to allow managing Smart Disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_smart_disputes")
        String manageSmartDisputes;
      }
    }

    /** Settings for the Documents embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Documents extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Export Tax Transactions embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExportTaxTransactions extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Financial Account Rewards embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountRewards extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Financial Accounts embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccounts extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow creating outbound payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_outbound_payments")
        String createOutboundPayments;

        /**
         * Whether to allow changing the payout schedule.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_payout_schedule")
        String createPayoutSchedule;

        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing bills.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_bills")
        String manageBills;

        /**
         * Whether to allow managing Issuing cards.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cards")
        String manageIssuingCards;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Financial Accounts Transactions embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountsTransactions extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow capturing payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("capture_payments")
        String capturePayments;

        /**
         * Whether to allow managing destination and on-behalf-of charges.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_destination_on_behalf_of_charges")
        String manageDestinationOnBehalfOfCharges;

        /**
         * Whether to allow managing Issuing cards.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cards")
        String manageIssuingCards;

        /**
         * Whether to allow managing Issuing disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_disputes")
        String manageIssuingDisputes;

        /**
         * Whether to allow managing payment disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payment_disputes")
        String managePaymentDisputes;

        /**
         * Whether to allow refunding payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_refund_payments")
        String manageRefundPayments;
      }
    }

    /** Settings for the Instant Payouts Promotion embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InstantPayoutsPromotion extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Controls whether creating instant payouts is enabled, disabled, or determined by
         * Dashboard rules.
         *
         * <p>One of {@code disabled}, {@code enabled}, or {@code use_dashboard_rules}.
         */
        @SerializedName("create_instant_payouts")
        String createInstantPayouts;

        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Invoice History embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceHistory extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Issuing Card embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCard extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow managing Issuing cardholders.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cardholders")
        String manageIssuingCardholders;

        /**
         * Whether to allow managing Issuing cards.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cards")
        String manageIssuingCards;

        /**
         * Whether to allow managing Issuing disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_disputes")
        String manageIssuingDisputes;

        /**
         * Whether to allow managing Issuing spending controls.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_spending_controls")
        String manageIssuingSpendingControls;
      }
    }

    /** Settings for the Issuing Cards List embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCardsList extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing Issuing cardholders.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cardholders")
        String manageIssuingCardholders;

        /**
         * Whether to allow managing Issuing cards.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_cards")
        String manageIssuingCards;

        /**
         * Whether to allow managing Issuing disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_disputes")
        String manageIssuingDisputes;

        /**
         * Whether to allow managing Issuing spending controls.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_issuing_spending_controls")
        String manageIssuingSpendingControls;
      }
    }

    /** Settings for the Network Cost Passthrough Report embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NetworkCostPassthroughReport extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Notification Banner embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NotificationBanner extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Payment Details embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDetails extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow capturing payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("capture_payments")
        String capturePayments;

        /**
         * Whether to allow managing destination and on-behalf-of charges.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_destination_on_behalf_of_charges")
        String manageDestinationOnBehalfOfCharges;

        /**
         * Whether to allow managing payment disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payment_disputes")
        String managePaymentDisputes;

        /**
         * Whether to allow refunding payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_refund_payments")
        String manageRefundPayments;

        /**
         * Whether to allow managing Smart Disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_smart_disputes")
        String manageSmartDisputes;
      }
    }

    /** Settings for the Payment Disputes embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDisputes extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow managing destination and on-behalf-of charges.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_destination_on_behalf_of_charges")
        String manageDestinationOnBehalfOfCharges;

        /**
         * Whether to allow managing payment disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payment_disputes")
        String managePaymentDisputes;

        /**
         * Whether to allow refunding payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_refund_payments")
        String manageRefundPayments;

        /**
         * Whether to allow managing Smart Disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_smart_disputes")
        String manageSmartDisputes;
      }
    }

    /** Settings for the Payment Method Settings embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodSettings extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;
      }
    }

    /** Settings for the Payments embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Whether to allow capturing payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("capture_payments")
        String capturePayments;

        /**
         * Whether to allow managing destination and on-behalf-of charges.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_destination_on_behalf_of_charges")
        String manageDestinationOnBehalfOfCharges;

        /**
         * Whether to allow managing payment disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payment_disputes")
        String managePaymentDisputes;

        /**
         * Whether to allow refunding payments.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_refund_payments")
        String manageRefundPayments;

        /**
         * Whether to allow managing Smart Disputes.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_smart_disputes")
        String manageSmartDisputes;
      }
    }

    /** Settings for the Payout Details embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutDetails extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Payout Reconciliation Report embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutReconciliationReport extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Payouts embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {
        /**
         * Controls whether creating instant payouts is enabled, disabled, or determined by
         * Dashboard rules.
         *
         * <p>One of {@code disabled}, {@code enabled}, or {@code use_dashboard_rules}.
         */
        @SerializedName("create_instant_payouts")
        String createInstantPayouts;

        /**
         * Whether to allow changing the payout schedule.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_payout_schedule")
        String createPayoutSchedule;

        /**
         * Whether to allow creating standard payouts.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("create_standard_payouts")
        String createStandardPayouts;

        /**
         * Whether to disable Stripe user authentication in the enabled components.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("disable_stripe_user_authentication")
        String disableStripeUserAuthentication;

        /**
         * Whether to allow managing payout methods.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("manage_payout_methods")
        String managePayoutMethods;
      }
    }

    /** Settings for the Payouts List embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutsList extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Product Tax Code Selector embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProductTaxCodeSelector extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Reporting Chart embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ReportingChart extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Tax Registrations embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRegistrations extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Tax Settings embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxSettings extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Tax Threshold Monitoring embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxThresholdMonitoring extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Terminal Hardware Orders embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TerminalHardwareOrders extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }

    /** Settings for the Terminal Hardware Shop embedded component. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TerminalHardwareShop extends StripeObject {
      /** Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /** The scopes available to this embedded component. */
      @SerializedName("scopes")
      Scopes scopes;

      /** The scopes available to this embedded component. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scopes extends StripeObject {}
    }
  }
}
