// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
public class AccountSessionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the account to create an Account Session for. */
  @SerializedName("account")
  String account;

  /** <strong>Required.</strong> The embedded components to enable for this Account Session. */
  @SerializedName("components")
  Components components;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Permissions to grant across the enabled components. */
  @SerializedName("scopes")
  Scopes scopes;

  private AccountSessionCreateParams(
      String account, Components components, Map<String, Object> extraParams, Scopes scopes) {
    this.account = account;
    this.components = components;
    this.extraParams = extraParams;
    this.scopes = scopes;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Components components;

    private Map<String, Object> extraParams;

    private Scopes scopes;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountSessionCreateParams build() {
      return new AccountSessionCreateParams(
          this.account, this.components, this.extraParams, this.scopes);
    }

    /** <strong>Required.</strong> The ID of the account to create an Account Session for. */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /** <strong>Required.</strong> The embedded components to enable for this Account Session. */
    public Builder setComponents(AccountSessionCreateParams.Components components) {
      this.components = components;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountSessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Permissions to grant across the enabled components. */
    public Builder setScopes(AccountSessionCreateParams.Scopes scopes) {
      this.scopes = scopes;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Components {
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

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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

    private Components(
        AccountManagement accountManagement,
        AccountOnboarding accountOnboarding,
        AgenticCommerceSettings agenticCommerceSettings,
        AppInstall appInstall,
        AppViewport appViewport,
        BalanceReport balanceReport,
        Balances balances,
        Bills bills,
        CapitalFinancing capitalFinancing,
        CapitalFinancingApplication capitalFinancingApplication,
        CapitalFinancingPromotion capitalFinancingPromotion,
        CheckScanning checkScanning,
        DisputesList disputesList,
        Documents documents,
        ExportTaxTransactions exportTaxTransactions,
        Map<String, Object> extraParams,
        FinancialAccountRewards financialAccountRewards,
        FinancialAccounts financialAccounts,
        FinancialAccountsTransactions financialAccountsTransactions,
        InstantPayoutsPromotion instantPayoutsPromotion,
        InvoiceHistory invoiceHistory,
        IssuingCard issuingCard,
        IssuingCardsList issuingCardsList,
        NetworkCostPassthroughReport networkCostPassthroughReport,
        NotificationBanner notificationBanner,
        PaymentDetails paymentDetails,
        PaymentDisputes paymentDisputes,
        PaymentMethodSettings paymentMethodSettings,
        Payments payments,
        PayoutDetails payoutDetails,
        PayoutReconciliationReport payoutReconciliationReport,
        Payouts payouts,
        PayoutsList payoutsList,
        ProductTaxCodeSelector productTaxCodeSelector,
        ReportingChart reportingChart,
        TaxRegistrations taxRegistrations,
        TaxSettings taxSettings,
        TaxThresholdMonitoring taxThresholdMonitoring,
        TerminalHardwareOrders terminalHardwareOrders,
        TerminalHardwareShop terminalHardwareShop) {
      this.accountManagement = accountManagement;
      this.accountOnboarding = accountOnboarding;
      this.agenticCommerceSettings = agenticCommerceSettings;
      this.appInstall = appInstall;
      this.appViewport = appViewport;
      this.balanceReport = balanceReport;
      this.balances = balances;
      this.bills = bills;
      this.capitalFinancing = capitalFinancing;
      this.capitalFinancingApplication = capitalFinancingApplication;
      this.capitalFinancingPromotion = capitalFinancingPromotion;
      this.checkScanning = checkScanning;
      this.disputesList = disputesList;
      this.documents = documents;
      this.exportTaxTransactions = exportTaxTransactions;
      this.extraParams = extraParams;
      this.financialAccountRewards = financialAccountRewards;
      this.financialAccounts = financialAccounts;
      this.financialAccountsTransactions = financialAccountsTransactions;
      this.instantPayoutsPromotion = instantPayoutsPromotion;
      this.invoiceHistory = invoiceHistory;
      this.issuingCard = issuingCard;
      this.issuingCardsList = issuingCardsList;
      this.networkCostPassthroughReport = networkCostPassthroughReport;
      this.notificationBanner = notificationBanner;
      this.paymentDetails = paymentDetails;
      this.paymentDisputes = paymentDisputes;
      this.paymentMethodSettings = paymentMethodSettings;
      this.payments = payments;
      this.payoutDetails = payoutDetails;
      this.payoutReconciliationReport = payoutReconciliationReport;
      this.payouts = payouts;
      this.payoutsList = payoutsList;
      this.productTaxCodeSelector = productTaxCodeSelector;
      this.reportingChart = reportingChart;
      this.taxRegistrations = taxRegistrations;
      this.taxSettings = taxSettings;
      this.taxThresholdMonitoring = taxThresholdMonitoring;
      this.terminalHardwareOrders = terminalHardwareOrders;
      this.terminalHardwareShop = terminalHardwareShop;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountManagement accountManagement;

      private AccountOnboarding accountOnboarding;

      private AgenticCommerceSettings agenticCommerceSettings;

      private AppInstall appInstall;

      private AppViewport appViewport;

      private BalanceReport balanceReport;

      private Balances balances;

      private Bills bills;

      private CapitalFinancing capitalFinancing;

      private CapitalFinancingApplication capitalFinancingApplication;

      private CapitalFinancingPromotion capitalFinancingPromotion;

      private CheckScanning checkScanning;

      private DisputesList disputesList;

      private Documents documents;

      private ExportTaxTransactions exportTaxTransactions;

      private Map<String, Object> extraParams;

      private FinancialAccountRewards financialAccountRewards;

      private FinancialAccounts financialAccounts;

      private FinancialAccountsTransactions financialAccountsTransactions;

      private InstantPayoutsPromotion instantPayoutsPromotion;

      private InvoiceHistory invoiceHistory;

      private IssuingCard issuingCard;

      private IssuingCardsList issuingCardsList;

      private NetworkCostPassthroughReport networkCostPassthroughReport;

      private NotificationBanner notificationBanner;

      private PaymentDetails paymentDetails;

      private PaymentDisputes paymentDisputes;

      private PaymentMethodSettings paymentMethodSettings;

      private Payments payments;

      private PayoutDetails payoutDetails;

      private PayoutReconciliationReport payoutReconciliationReport;

      private Payouts payouts;

      private PayoutsList payoutsList;

      private ProductTaxCodeSelector productTaxCodeSelector;

      private ReportingChart reportingChart;

      private TaxRegistrations taxRegistrations;

      private TaxSettings taxSettings;

      private TaxThresholdMonitoring taxThresholdMonitoring;

      private TerminalHardwareOrders terminalHardwareOrders;

      private TerminalHardwareShop terminalHardwareShop;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSessionCreateParams.Components build() {
        return new AccountSessionCreateParams.Components(
            this.accountManagement,
            this.accountOnboarding,
            this.agenticCommerceSettings,
            this.appInstall,
            this.appViewport,
            this.balanceReport,
            this.balances,
            this.bills,
            this.capitalFinancing,
            this.capitalFinancingApplication,
            this.capitalFinancingPromotion,
            this.checkScanning,
            this.disputesList,
            this.documents,
            this.exportTaxTransactions,
            this.extraParams,
            this.financialAccountRewards,
            this.financialAccounts,
            this.financialAccountsTransactions,
            this.instantPayoutsPromotion,
            this.invoiceHistory,
            this.issuingCard,
            this.issuingCardsList,
            this.networkCostPassthroughReport,
            this.notificationBanner,
            this.paymentDetails,
            this.paymentDisputes,
            this.paymentMethodSettings,
            this.payments,
            this.payoutDetails,
            this.payoutReconciliationReport,
            this.payouts,
            this.payoutsList,
            this.productTaxCodeSelector,
            this.reportingChart,
            this.taxRegistrations,
            this.taxSettings,
            this.taxThresholdMonitoring,
            this.terminalHardwareOrders,
            this.terminalHardwareShop);
      }

      /** Settings for the Account Management embedded component. */
      public Builder setAccountManagement(
          AccountSessionCreateParams.Components.AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
        return this;
      }

      /** Settings for the Account Onboarding embedded component. */
      public Builder setAccountOnboarding(
          AccountSessionCreateParams.Components.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /** Settings for the Agentic Commerce Settings embedded component. */
      public Builder setAgenticCommerceSettings(
          AccountSessionCreateParams.Components.AgenticCommerceSettings agenticCommerceSettings) {
        this.agenticCommerceSettings = agenticCommerceSettings;
        return this;
      }

      /** Settings for the App Install embedded component. */
      public Builder setAppInstall(AccountSessionCreateParams.Components.AppInstall appInstall) {
        this.appInstall = appInstall;
        return this;
      }

      /** Settings for the App Viewport embedded component. */
      public Builder setAppViewport(AccountSessionCreateParams.Components.AppViewport appViewport) {
        this.appViewport = appViewport;
        return this;
      }

      /** Settings for the Balance Report embedded component. */
      public Builder setBalanceReport(
          AccountSessionCreateParams.Components.BalanceReport balanceReport) {
        this.balanceReport = balanceReport;
        return this;
      }

      /** Settings for the Balances embedded component. */
      public Builder setBalances(AccountSessionCreateParams.Components.Balances balances) {
        this.balances = balances;
        return this;
      }

      /** Settings for the Bills embedded component. */
      public Builder setBills(AccountSessionCreateParams.Components.Bills bills) {
        this.bills = bills;
        return this;
      }

      /** Settings for the Capital Financing embedded component. */
      public Builder setCapitalFinancing(
          AccountSessionCreateParams.Components.CapitalFinancing capitalFinancing) {
        this.capitalFinancing = capitalFinancing;
        return this;
      }

      /** Settings for the Capital Financing Application embedded component. */
      public Builder setCapitalFinancingApplication(
          AccountSessionCreateParams.Components.CapitalFinancingApplication
              capitalFinancingApplication) {
        this.capitalFinancingApplication = capitalFinancingApplication;
        return this;
      }

      /** Settings for the Capital Financing Promotion embedded component. */
      public Builder setCapitalFinancingPromotion(
          AccountSessionCreateParams.Components.CapitalFinancingPromotion
              capitalFinancingPromotion) {
        this.capitalFinancingPromotion = capitalFinancingPromotion;
        return this;
      }

      /** Settings for the Check Scanning embedded component. */
      public Builder setCheckScanning(
          AccountSessionCreateParams.Components.CheckScanning checkScanning) {
        this.checkScanning = checkScanning;
        return this;
      }

      /** Settings for the Disputes List embedded component. */
      public Builder setDisputesList(
          AccountSessionCreateParams.Components.DisputesList disputesList) {
        this.disputesList = disputesList;
        return this;
      }

      /** Settings for the Documents embedded component. */
      public Builder setDocuments(AccountSessionCreateParams.Components.Documents documents) {
        this.documents = documents;
        return this;
      }

      /** Settings for the Export Tax Transactions embedded component. */
      public Builder setExportTaxTransactions(
          AccountSessionCreateParams.Components.ExportTaxTransactions exportTaxTransactions) {
        this.exportTaxTransactions = exportTaxTransactions;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountSessionCreateParams.Components#extraParams} for the field documentation.
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
       * See {@link AccountSessionCreateParams.Components#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings for the Financial Account Rewards embedded component. */
      public Builder setFinancialAccountRewards(
          AccountSessionCreateParams.Components.FinancialAccountRewards financialAccountRewards) {
        this.financialAccountRewards = financialAccountRewards;
        return this;
      }

      /** Settings for the Financial Accounts embedded component. */
      public Builder setFinancialAccounts(
          AccountSessionCreateParams.Components.FinancialAccounts financialAccounts) {
        this.financialAccounts = financialAccounts;
        return this;
      }

      /** Settings for the Financial Accounts Transactions embedded component. */
      public Builder setFinancialAccountsTransactions(
          AccountSessionCreateParams.Components.FinancialAccountsTransactions
              financialAccountsTransactions) {
        this.financialAccountsTransactions = financialAccountsTransactions;
        return this;
      }

      /** Settings for the Instant Payouts Promotion embedded component. */
      public Builder setInstantPayoutsPromotion(
          AccountSessionCreateParams.Components.InstantPayoutsPromotion instantPayoutsPromotion) {
        this.instantPayoutsPromotion = instantPayoutsPromotion;
        return this;
      }

      /** Settings for the Invoice History embedded component. */
      public Builder setInvoiceHistory(
          AccountSessionCreateParams.Components.InvoiceHistory invoiceHistory) {
        this.invoiceHistory = invoiceHistory;
        return this;
      }

      /** Settings for the Issuing Card embedded component. */
      public Builder setIssuingCard(AccountSessionCreateParams.Components.IssuingCard issuingCard) {
        this.issuingCard = issuingCard;
        return this;
      }

      /** Settings for the Issuing Cards List embedded component. */
      public Builder setIssuingCardsList(
          AccountSessionCreateParams.Components.IssuingCardsList issuingCardsList) {
        this.issuingCardsList = issuingCardsList;
        return this;
      }

      /** Settings for the Network Cost Passthrough Report embedded component. */
      public Builder setNetworkCostPassthroughReport(
          AccountSessionCreateParams.Components.NetworkCostPassthroughReport
              networkCostPassthroughReport) {
        this.networkCostPassthroughReport = networkCostPassthroughReport;
        return this;
      }

      /** Settings for the Notification Banner embedded component. */
      public Builder setNotificationBanner(
          AccountSessionCreateParams.Components.NotificationBanner notificationBanner) {
        this.notificationBanner = notificationBanner;
        return this;
      }

      /** Settings for the Payment Details embedded component. */
      public Builder setPaymentDetails(
          AccountSessionCreateParams.Components.PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
      }

      /** Settings for the Payment Disputes embedded component. */
      public Builder setPaymentDisputes(
          AccountSessionCreateParams.Components.PaymentDisputes paymentDisputes) {
        this.paymentDisputes = paymentDisputes;
        return this;
      }

      /** Settings for the Payment Method Settings embedded component. */
      public Builder setPaymentMethodSettings(
          AccountSessionCreateParams.Components.PaymentMethodSettings paymentMethodSettings) {
        this.paymentMethodSettings = paymentMethodSettings;
        return this;
      }

      /** Settings for the Payments embedded component. */
      public Builder setPayments(AccountSessionCreateParams.Components.Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Settings for the Payout Details embedded component. */
      public Builder setPayoutDetails(
          AccountSessionCreateParams.Components.PayoutDetails payoutDetails) {
        this.payoutDetails = payoutDetails;
        return this;
      }

      /** Settings for the Payout Reconciliation Report embedded component. */
      public Builder setPayoutReconciliationReport(
          AccountSessionCreateParams.Components.PayoutReconciliationReport
              payoutReconciliationReport) {
        this.payoutReconciliationReport = payoutReconciliationReport;
        return this;
      }

      /** Settings for the Payouts embedded component. */
      public Builder setPayouts(AccountSessionCreateParams.Components.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /** Settings for the Payouts List embedded component. */
      public Builder setPayoutsList(AccountSessionCreateParams.Components.PayoutsList payoutsList) {
        this.payoutsList = payoutsList;
        return this;
      }

      /** Settings for the Product Tax Code Selector embedded component. */
      public Builder setProductTaxCodeSelector(
          AccountSessionCreateParams.Components.ProductTaxCodeSelector productTaxCodeSelector) {
        this.productTaxCodeSelector = productTaxCodeSelector;
        return this;
      }

      /** Settings for the Reporting Chart embedded component. */
      public Builder setReportingChart(
          AccountSessionCreateParams.Components.ReportingChart reportingChart) {
        this.reportingChart = reportingChart;
        return this;
      }

      /** Settings for the Tax Registrations embedded component. */
      public Builder setTaxRegistrations(
          AccountSessionCreateParams.Components.TaxRegistrations taxRegistrations) {
        this.taxRegistrations = taxRegistrations;
        return this;
      }

      /** Settings for the Tax Settings embedded component. */
      public Builder setTaxSettings(AccountSessionCreateParams.Components.TaxSettings taxSettings) {
        this.taxSettings = taxSettings;
        return this;
      }

      /** Settings for the Tax Threshold Monitoring embedded component. */
      public Builder setTaxThresholdMonitoring(
          AccountSessionCreateParams.Components.TaxThresholdMonitoring taxThresholdMonitoring) {
        this.taxThresholdMonitoring = taxThresholdMonitoring;
        return this;
      }

      /** Settings for the Terminal Hardware Orders embedded component. */
      public Builder setTerminalHardwareOrders(
          AccountSessionCreateParams.Components.TerminalHardwareOrders terminalHardwareOrders) {
        this.terminalHardwareOrders = terminalHardwareOrders;
        return this;
      }

      /** Settings for the Terminal Hardware Shop embedded component. */
      public Builder setTerminalHardwareShop(
          AccountSessionCreateParams.Components.TerminalHardwareShop terminalHardwareShop) {
        this.terminalHardwareShop = terminalHardwareShop;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountManagement {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AccountManagement(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AccountManagement build() {
          return new AccountSessionCreateParams.Components.AccountManagement(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AccountManagement#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.AccountManagement#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AccountOnboarding(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AccountOnboarding build() {
          return new AccountSessionCreateParams.Components.AccountOnboarding(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AccountOnboarding#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.AccountOnboarding#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AgenticCommerceSettings {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AgenticCommerceSettings(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AgenticCommerceSettings build() {
          return new AccountSessionCreateParams.Components.AgenticCommerceSettings(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.AgenticCommerceSettings#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.AgenticCommerceSettings#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AppInstall {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AppInstall(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AppInstall build() {
          return new AccountSessionCreateParams.Components.AppInstall(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AppInstall#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AppInstall#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AppViewport {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AppViewport(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AppViewport build() {
          return new AccountSessionCreateParams.Components.AppViewport(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AppViewport#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AppViewport#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BalanceReport {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BalanceReport(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.BalanceReport build() {
          return new AccountSessionCreateParams.Components.BalanceReport(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.BalanceReport#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.BalanceReport#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Balances {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Balances(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Balances build() {
          return new AccountSessionCreateParams.Components.Balances(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Balances#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Balances#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Bills {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bills(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Bills build() {
          return new AccountSessionCreateParams.Components.Bills(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Bills#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Bills#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancing {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CapitalFinancing(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.CapitalFinancing build() {
          return new AccountSessionCreateParams.Components.CapitalFinancing(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.CapitalFinancing#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.CapitalFinancing#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancingApplication {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CapitalFinancingApplication(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.CapitalFinancingApplication build() {
          return new AccountSessionCreateParams.Components.CapitalFinancingApplication(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.CapitalFinancingApplication#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.CapitalFinancingApplication#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CapitalFinancingPromotion {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CapitalFinancingPromotion(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.CapitalFinancingPromotion build() {
          return new AccountSessionCreateParams.Components.CapitalFinancingPromotion(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.CapitalFinancingPromotion#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.CapitalFinancingPromotion#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckScanning {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CheckScanning(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.CheckScanning build() {
          return new AccountSessionCreateParams.Components.CheckScanning(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.CheckScanning#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.CheckScanning#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class DisputesList {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private DisputesList(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.DisputesList build() {
          return new AccountSessionCreateParams.Components.DisputesList(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.DisputesList#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.DisputesList#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Documents {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Documents(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Documents build() {
          return new AccountSessionCreateParams.Components.Documents(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Documents#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Documents#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ExportTaxTransactions {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private ExportTaxTransactions(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.ExportTaxTransactions build() {
          return new AccountSessionCreateParams.Components.ExportTaxTransactions(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.ExportTaxTransactions#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.ExportTaxTransactions#extraParams}
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountRewards {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private FinancialAccountRewards(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.FinancialAccountRewards build() {
          return new AccountSessionCreateParams.Components.FinancialAccountRewards(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.FinancialAccountRewards#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.FinancialAccountRewards#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccounts {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private FinancialAccounts(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.FinancialAccounts build() {
          return new AccountSessionCreateParams.Components.FinancialAccounts(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.FinancialAccounts#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.FinancialAccounts#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountsTransactions {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private FinancialAccountsTransactions(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.FinancialAccountsTransactions build() {
          return new AccountSessionCreateParams.Components.FinancialAccountsTransactions(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.FinancialAccountsTransactions#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.FinancialAccountsTransactions#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InstantPayoutsPromotion {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InstantPayoutsPromotion(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.InstantPayoutsPromotion build() {
          return new AccountSessionCreateParams.Components.InstantPayoutsPromotion(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.InstantPayoutsPromotion#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.InstantPayoutsPromotion#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceHistory {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoiceHistory(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.InvoiceHistory build() {
          return new AccountSessionCreateParams.Components.InvoiceHistory(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.InvoiceHistory#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.InvoiceHistory#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCard {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private IssuingCard(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.IssuingCard build() {
          return new AccountSessionCreateParams.Components.IssuingCard(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.IssuingCard#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.IssuingCard#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCardsList {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private IssuingCardsList(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.IssuingCardsList build() {
          return new AccountSessionCreateParams.Components.IssuingCardsList(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.IssuingCardsList#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.IssuingCardsList#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NetworkCostPassthroughReport {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private NetworkCostPassthroughReport(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.NetworkCostPassthroughReport build() {
          return new AccountSessionCreateParams.Components.NetworkCostPassthroughReport(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.NetworkCostPassthroughReport#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.NetworkCostPassthroughReport#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NotificationBanner {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private NotificationBanner(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.NotificationBanner build() {
          return new AccountSessionCreateParams.Components.NotificationBanner(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.NotificationBanner#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.NotificationBanner#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDetails {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PaymentDetails(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PaymentDetails build() {
          return new AccountSessionCreateParams.Components.PaymentDetails(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PaymentDetails#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PaymentDetails#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDisputes {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PaymentDisputes(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PaymentDisputes build() {
          return new AccountSessionCreateParams.Components.PaymentDisputes(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PaymentDisputes#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.PaymentDisputes#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodSettings {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PaymentMethodSettings(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PaymentMethodSettings build() {
          return new AccountSessionCreateParams.Components.PaymentMethodSettings(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PaymentMethodSettings#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.PaymentMethodSettings#extraParams}
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Payments(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Payments build() {
          return new AccountSessionCreateParams.Components.Payments(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payments#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payments#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutDetails {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayoutDetails(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutDetails build() {
          return new AccountSessionCreateParams.Components.PayoutDetails(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PayoutDetails#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PayoutDetails#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutReconciliationReport {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayoutReconciliationReport(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutReconciliationReport build() {
          return new AccountSessionCreateParams.Components.PayoutReconciliationReport(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.PayoutReconciliationReport#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.PayoutReconciliationReport#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Payouts(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Payouts build() {
          return new AccountSessionCreateParams.Components.Payouts(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payouts#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payouts#extraParams} for the field
         * documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutsList {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayoutsList(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutsList build() {
          return new AccountSessionCreateParams.Components.PayoutsList(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PayoutsList#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PayoutsList#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ProductTaxCodeSelector {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private ProductTaxCodeSelector(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.ProductTaxCodeSelector build() {
          return new AccountSessionCreateParams.Components.ProductTaxCodeSelector(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.ProductTaxCodeSelector#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.ProductTaxCodeSelector#extraParams}
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ReportingChart {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private ReportingChart(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.ReportingChart build() {
          return new AccountSessionCreateParams.Components.ReportingChart(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.ReportingChart#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.ReportingChart#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRegistrations {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TaxRegistrations(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TaxRegistrations build() {
          return new AccountSessionCreateParams.Components.TaxRegistrations(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TaxRegistrations#extraParams} for
         * the field documentation.
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
         * map. See {@link AccountSessionCreateParams.Components.TaxRegistrations#extraParams} for
         * the field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxSettings {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TaxSettings(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TaxSettings build() {
          return new AccountSessionCreateParams.Components.TaxSettings(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TaxSettings#extraParams} for the
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TaxSettings#extraParams} for the
         * field documentation.
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxThresholdMonitoring {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TaxThresholdMonitoring(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TaxThresholdMonitoring build() {
          return new AccountSessionCreateParams.Components.TaxThresholdMonitoring(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TaxThresholdMonitoring#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.TaxThresholdMonitoring#extraParams}
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TerminalHardwareOrders {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TerminalHardwareOrders(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TerminalHardwareOrders build() {
          return new AccountSessionCreateParams.Components.TerminalHardwareOrders(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TerminalHardwareOrders#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.TerminalHardwareOrders#extraParams}
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TerminalHardwareShop {
      /** <strong>Required.</strong> Whether this embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TerminalHardwareShop(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TerminalHardwareShop build() {
          return new AccountSessionCreateParams.Components.TerminalHardwareShop(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether this embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.TerminalHardwareShop#extraParams}
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
         * map. See {@link AccountSessionCreateParams.Components.TerminalHardwareShop#extraParams}
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
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Scopes {
    /** The Stripe App IDs allowed in the enabled app components. */
    @SerializedName("allowed_stripe_app_ids")
    List<String> allowedStripeAppIds;

    /** Whether to allow capturing payments. */
    @SerializedName("capture_payments")
    CapturePayments capturePayments;

    /**
     * Controls whether creating instant payouts is enabled, disabled, or determined by Dashboard
     * rules.
     */
    @SerializedName("create_instant_payouts")
    CreateInstantPayouts createInstantPayouts;

    /** Whether to allow creating outbound payments. */
    @SerializedName("create_outbound_payments")
    CreateOutboundPayments createOutboundPayments;

    /** Whether to allow changing the payout schedule. */
    @SerializedName("create_payout_schedule")
    CreatePayoutSchedule createPayoutSchedule;

    /** Whether to allow creating standard payouts. */
    @SerializedName("create_standard_payouts")
    CreateStandardPayouts createStandardPayouts;

    /** Whether to allow creating US paper checks on the application. */
    @SerializedName("create_us_paper_check_on_application")
    CreateUsPaperCheckOnApplication createUsPaperCheckOnApplication;

    /** Whether to disable Stripe user authentication in the enabled components. */
    @SerializedName("disable_stripe_user_authentication")
    DisableStripeUserAuthentication disableStripeUserAuthentication;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Whether to allow managing bills. */
    @SerializedName("manage_bills")
    ManageBills manageBills;

    /** Whether to allow managing destination and on-behalf-of charges. */
    @SerializedName("manage_destination_on_behalf_of_charges")
    ManageDestinationOnBehalfOfCharges manageDestinationOnBehalfOfCharges;

    /** Whether to allow managing Issuing cardholders. */
    @SerializedName("manage_issuing_cardholders")
    ManageIssuingCardholders manageIssuingCardholders;

    /** Whether to allow managing Issuing cards. */
    @SerializedName("manage_issuing_cards")
    ManageIssuingCards manageIssuingCards;

    /** Whether to allow managing Issuing disputes. */
    @SerializedName("manage_issuing_disputes")
    ManageIssuingDisputes manageIssuingDisputes;

    /** Whether to allow managing Issuing spending controls. */
    @SerializedName("manage_issuing_spending_controls")
    ManageIssuingSpendingControls manageIssuingSpendingControls;

    /** Whether to allow managing payment disputes. */
    @SerializedName("manage_payment_disputes")
    ManagePaymentDisputes managePaymentDisputes;

    /** Whether to allow managing payout methods. */
    @SerializedName("manage_payout_methods")
    ManagePayoutMethods managePayoutMethods;

    /** Whether to allow refunding payments. */
    @SerializedName("manage_refund_payments")
    ManageRefundPayments manageRefundPayments;

    /** Whether to allow managing Smart Disputes. */
    @SerializedName("manage_smart_disputes")
    ManageSmartDisputes manageSmartDisputes;

    private Scopes(
        List<String> allowedStripeAppIds,
        CapturePayments capturePayments,
        CreateInstantPayouts createInstantPayouts,
        CreateOutboundPayments createOutboundPayments,
        CreatePayoutSchedule createPayoutSchedule,
        CreateStandardPayouts createStandardPayouts,
        CreateUsPaperCheckOnApplication createUsPaperCheckOnApplication,
        DisableStripeUserAuthentication disableStripeUserAuthentication,
        Map<String, Object> extraParams,
        ManageBills manageBills,
        ManageDestinationOnBehalfOfCharges manageDestinationOnBehalfOfCharges,
        ManageIssuingCardholders manageIssuingCardholders,
        ManageIssuingCards manageIssuingCards,
        ManageIssuingDisputes manageIssuingDisputes,
        ManageIssuingSpendingControls manageIssuingSpendingControls,
        ManagePaymentDisputes managePaymentDisputes,
        ManagePayoutMethods managePayoutMethods,
        ManageRefundPayments manageRefundPayments,
        ManageSmartDisputes manageSmartDisputes) {
      this.allowedStripeAppIds = allowedStripeAppIds;
      this.capturePayments = capturePayments;
      this.createInstantPayouts = createInstantPayouts;
      this.createOutboundPayments = createOutboundPayments;
      this.createPayoutSchedule = createPayoutSchedule;
      this.createStandardPayouts = createStandardPayouts;
      this.createUsPaperCheckOnApplication = createUsPaperCheckOnApplication;
      this.disableStripeUserAuthentication = disableStripeUserAuthentication;
      this.extraParams = extraParams;
      this.manageBills = manageBills;
      this.manageDestinationOnBehalfOfCharges = manageDestinationOnBehalfOfCharges;
      this.manageIssuingCardholders = manageIssuingCardholders;
      this.manageIssuingCards = manageIssuingCards;
      this.manageIssuingDisputes = manageIssuingDisputes;
      this.manageIssuingSpendingControls = manageIssuingSpendingControls;
      this.managePaymentDisputes = managePaymentDisputes;
      this.managePayoutMethods = managePayoutMethods;
      this.manageRefundPayments = manageRefundPayments;
      this.manageSmartDisputes = manageSmartDisputes;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> allowedStripeAppIds;

      private CapturePayments capturePayments;

      private CreateInstantPayouts createInstantPayouts;

      private CreateOutboundPayments createOutboundPayments;

      private CreatePayoutSchedule createPayoutSchedule;

      private CreateStandardPayouts createStandardPayouts;

      private CreateUsPaperCheckOnApplication createUsPaperCheckOnApplication;

      private DisableStripeUserAuthentication disableStripeUserAuthentication;

      private Map<String, Object> extraParams;

      private ManageBills manageBills;

      private ManageDestinationOnBehalfOfCharges manageDestinationOnBehalfOfCharges;

      private ManageIssuingCardholders manageIssuingCardholders;

      private ManageIssuingCards manageIssuingCards;

      private ManageIssuingDisputes manageIssuingDisputes;

      private ManageIssuingSpendingControls manageIssuingSpendingControls;

      private ManagePaymentDisputes managePaymentDisputes;

      private ManagePayoutMethods managePayoutMethods;

      private ManageRefundPayments manageRefundPayments;

      private ManageSmartDisputes manageSmartDisputes;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSessionCreateParams.Scopes build() {
        return new AccountSessionCreateParams.Scopes(
            this.allowedStripeAppIds,
            this.capturePayments,
            this.createInstantPayouts,
            this.createOutboundPayments,
            this.createPayoutSchedule,
            this.createStandardPayouts,
            this.createUsPaperCheckOnApplication,
            this.disableStripeUserAuthentication,
            this.extraParams,
            this.manageBills,
            this.manageDestinationOnBehalfOfCharges,
            this.manageIssuingCardholders,
            this.manageIssuingCards,
            this.manageIssuingDisputes,
            this.manageIssuingSpendingControls,
            this.managePaymentDisputes,
            this.managePayoutMethods,
            this.manageRefundPayments,
            this.manageSmartDisputes);
      }

      /**
       * Add an element to `allowedStripeAppIds` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link AccountSessionCreateParams.Scopes#allowedStripeAppIds} for the field documentation.
       */
      public Builder addAllowedStripeAppId(String element) {
        if (this.allowedStripeAppIds == null) {
          this.allowedStripeAppIds = new ArrayList<>();
        }
        this.allowedStripeAppIds.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedStripeAppIds` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link AccountSessionCreateParams.Scopes#allowedStripeAppIds} for the field documentation.
       */
      public Builder addAllAllowedStripeAppId(List<String> elements) {
        if (this.allowedStripeAppIds == null) {
          this.allowedStripeAppIds = new ArrayList<>();
        }
        this.allowedStripeAppIds.addAll(elements);
        return this;
      }

      /** Whether to allow capturing payments. */
      public Builder setCapturePayments(
          AccountSessionCreateParams.Scopes.CapturePayments capturePayments) {
        this.capturePayments = capturePayments;
        return this;
      }

      /**
       * Controls whether creating instant payouts is enabled, disabled, or determined by Dashboard
       * rules.
       */
      public Builder setCreateInstantPayouts(
          AccountSessionCreateParams.Scopes.CreateInstantPayouts createInstantPayouts) {
        this.createInstantPayouts = createInstantPayouts;
        return this;
      }

      /** Whether to allow creating outbound payments. */
      public Builder setCreateOutboundPayments(
          AccountSessionCreateParams.Scopes.CreateOutboundPayments createOutboundPayments) {
        this.createOutboundPayments = createOutboundPayments;
        return this;
      }

      /** Whether to allow changing the payout schedule. */
      public Builder setCreatePayoutSchedule(
          AccountSessionCreateParams.Scopes.CreatePayoutSchedule createPayoutSchedule) {
        this.createPayoutSchedule = createPayoutSchedule;
        return this;
      }

      /** Whether to allow creating standard payouts. */
      public Builder setCreateStandardPayouts(
          AccountSessionCreateParams.Scopes.CreateStandardPayouts createStandardPayouts) {
        this.createStandardPayouts = createStandardPayouts;
        return this;
      }

      /** Whether to allow creating US paper checks on the application. */
      public Builder setCreateUsPaperCheckOnApplication(
          AccountSessionCreateParams.Scopes.CreateUsPaperCheckOnApplication
              createUsPaperCheckOnApplication) {
        this.createUsPaperCheckOnApplication = createUsPaperCheckOnApplication;
        return this;
      }

      /** Whether to disable Stripe user authentication in the enabled components. */
      public Builder setDisableStripeUserAuthentication(
          AccountSessionCreateParams.Scopes.DisableStripeUserAuthentication
              disableStripeUserAuthentication) {
        this.disableStripeUserAuthentication = disableStripeUserAuthentication;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountSessionCreateParams.Scopes#extraParams} for the field documentation.
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
       * See {@link AccountSessionCreateParams.Scopes#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Whether to allow managing bills. */
      public Builder setManageBills(AccountSessionCreateParams.Scopes.ManageBills manageBills) {
        this.manageBills = manageBills;
        return this;
      }

      /** Whether to allow managing destination and on-behalf-of charges. */
      public Builder setManageDestinationOnBehalfOfCharges(
          AccountSessionCreateParams.Scopes.ManageDestinationOnBehalfOfCharges
              manageDestinationOnBehalfOfCharges) {
        this.manageDestinationOnBehalfOfCharges = manageDestinationOnBehalfOfCharges;
        return this;
      }

      /** Whether to allow managing Issuing cardholders. */
      public Builder setManageIssuingCardholders(
          AccountSessionCreateParams.Scopes.ManageIssuingCardholders manageIssuingCardholders) {
        this.manageIssuingCardholders = manageIssuingCardholders;
        return this;
      }

      /** Whether to allow managing Issuing cards. */
      public Builder setManageIssuingCards(
          AccountSessionCreateParams.Scopes.ManageIssuingCards manageIssuingCards) {
        this.manageIssuingCards = manageIssuingCards;
        return this;
      }

      /** Whether to allow managing Issuing disputes. */
      public Builder setManageIssuingDisputes(
          AccountSessionCreateParams.Scopes.ManageIssuingDisputes manageIssuingDisputes) {
        this.manageIssuingDisputes = manageIssuingDisputes;
        return this;
      }

      /** Whether to allow managing Issuing spending controls. */
      public Builder setManageIssuingSpendingControls(
          AccountSessionCreateParams.Scopes.ManageIssuingSpendingControls
              manageIssuingSpendingControls) {
        this.manageIssuingSpendingControls = manageIssuingSpendingControls;
        return this;
      }

      /** Whether to allow managing payment disputes. */
      public Builder setManagePaymentDisputes(
          AccountSessionCreateParams.Scopes.ManagePaymentDisputes managePaymentDisputes) {
        this.managePaymentDisputes = managePaymentDisputes;
        return this;
      }

      /** Whether to allow managing payout methods. */
      public Builder setManagePayoutMethods(
          AccountSessionCreateParams.Scopes.ManagePayoutMethods managePayoutMethods) {
        this.managePayoutMethods = managePayoutMethods;
        return this;
      }

      /** Whether to allow refunding payments. */
      public Builder setManageRefundPayments(
          AccountSessionCreateParams.Scopes.ManageRefundPayments manageRefundPayments) {
        this.manageRefundPayments = manageRefundPayments;
        return this;
      }

      /** Whether to allow managing Smart Disputes. */
      public Builder setManageSmartDisputes(
          AccountSessionCreateParams.Scopes.ManageSmartDisputes manageSmartDisputes) {
        this.manageSmartDisputes = manageSmartDisputes;
        return this;
      }
    }

    public enum CapturePayments implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CapturePayments(String value) {
        this.value = value;
      }
    }

    public enum CreateInstantPayouts implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled"),

      @SerializedName("use_dashboard_rules")
      USE_DASHBOARD_RULES("use_dashboard_rules");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CreateInstantPayouts(String value) {
        this.value = value;
      }
    }

    public enum CreateOutboundPayments implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CreateOutboundPayments(String value) {
        this.value = value;
      }
    }

    public enum CreatePayoutSchedule implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CreatePayoutSchedule(String value) {
        this.value = value;
      }
    }

    public enum CreateStandardPayouts implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CreateStandardPayouts(String value) {
        this.value = value;
      }
    }

    public enum CreateUsPaperCheckOnApplication implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CreateUsPaperCheckOnApplication(String value) {
        this.value = value;
      }
    }

    public enum DisableStripeUserAuthentication implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      DisableStripeUserAuthentication(String value) {
        this.value = value;
      }
    }

    public enum ManageBills implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageBills(String value) {
        this.value = value;
      }
    }

    public enum ManageDestinationOnBehalfOfCharges implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageDestinationOnBehalfOfCharges(String value) {
        this.value = value;
      }
    }

    public enum ManageIssuingCardholders implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageIssuingCardholders(String value) {
        this.value = value;
      }
    }

    public enum ManageIssuingCards implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageIssuingCards(String value) {
        this.value = value;
      }
    }

    public enum ManageIssuingDisputes implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageIssuingDisputes(String value) {
        this.value = value;
      }
    }

    public enum ManageIssuingSpendingControls implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageIssuingSpendingControls(String value) {
        this.value = value;
      }
    }

    public enum ManagePaymentDisputes implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManagePaymentDisputes(String value) {
        this.value = value;
      }
    }

    public enum ManagePayoutMethods implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManagePayoutMethods(String value) {
        this.value = value;
      }
    }

    public enum ManageRefundPayments implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageRefundPayments(String value) {
        this.value = value;
      }
    }

    public enum ManageSmartDisputes implements ApiRequestParams.EnumParam {
      @SerializedName("disabled")
      DISABLED("disabled"),

      @SerializedName("enabled")
      ENABLED("enabled");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ManageSmartDisputes(String value) {
        this.value = value;
      }
    }
  }
}
