// File generated from our OpenAPI spec
package com.stripe.param;

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
  /** <strong>Required.</strong> The identifier of the account to create an Account Session for. */
  @SerializedName("account")
  String account;

  /**
   * <strong>Required.</strong> Each key of the dictionary represents an embedded component, and
   * each embedded component maps to its configuration (e.g. whether it has been enabled or not).
   */
  @SerializedName("components")
  Components components;

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

  private AccountSessionCreateParams(
      String account, Components components, List<String> expand, Map<String, Object> extraParams) {
    this.account = account;
    this.components = components;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Components components;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountSessionCreateParams build() {
      return new AccountSessionCreateParams(
          this.account, this.components, this.expand, this.extraParams);
    }

    /**
     * <strong>Required.</strong> The identifier of the account to create an Account Session for.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * <strong>Required.</strong> Each key of the dictionary represents an embedded component, and
     * each embedded component maps to its configuration (e.g. whether it has been enabled or not).
     */
    public Builder setComponents(AccountSessionCreateParams.Components components) {
      this.components = components;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountSessionCreateParams#expand} for the field documentation.
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
     * AccountSessionCreateParams#expand} for the field documentation.
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
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Components {
    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/account-management/">account
     * management</a> embedded component.
     */
    @SerializedName("account_management")
    AccountManagement accountManagement;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/account-onboarding/">account
     * onboarding</a> embedded component.
     */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/financial-reports#balance-report">balance
     * report</a> embedded component.
     */
    @SerializedName("balance_report")
    BalanceReport balanceReport;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/balances/">balances</a>
     * embedded component.
     */
    @SerializedName("balances")
    Balances balances;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/disputes-list/">disputes
     * list</a> embedded component.
     */
    @SerializedName("disputes_list")
    DisputesList disputesList;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/documents/">documents</a>
     * embedded component.
     */
    @SerializedName("documents")
    Documents documents;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/financial-account/">financial
     * account</a> embedded component.
     */
    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/financial-account-transactions/">financial
     * account transactions</a> embedded component.
     */
    @SerializedName("financial_account_transactions")
    FinancialAccountTransactions financialAccountTransactions;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/instant-payouts-promotion/">instant
     * payouts promotion</a> embedded component.
     */
    @SerializedName("instant_payouts_promotion")
    InstantPayoutsPromotion instantPayoutsPromotion;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/issuing-card/">issuing
     * card</a> embedded component.
     */
    @SerializedName("issuing_card")
    IssuingCard issuingCard;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/issuing-cards-list/">issuing
     * cards list</a> embedded component.
     */
    @SerializedName("issuing_cards_list")
    IssuingCardsList issuingCardsList;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/notification-banner/">notification
     * banner</a> embedded component.
     */
    @SerializedName("notification_banner")
    NotificationBanner notificationBanner;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payment-details/">payment
     * details</a> embedded component.
     */
    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payment-disputes/">payment
     * disputes</a> embedded component.
     */
    @SerializedName("payment_disputes")
    PaymentDisputes paymentDisputes;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payments/">payments</a>
     * embedded component.
     */
    @SerializedName("payments")
    Payments payments;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payout-details/">payout
     * details</a> embedded component.
     */
    @SerializedName("payout_details")
    PayoutDetails payoutDetails;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/financial-reports#payout-reconciliation-report">payout
     * reconciliation report</a> embedded component.
     */
    @SerializedName("payout_reconciliation_report")
    PayoutReconciliationReport payoutReconciliationReport;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payouts/">payouts</a> embedded
     * component.
     */
    @SerializedName("payouts")
    Payouts payouts;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/payouts-list/">payouts
     * list</a> embedded component.
     */
    @SerializedName("payouts_list")
    PayoutsList payoutsList;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/tax-registrations/">tax
     * registrations</a> embedded component.
     */
    @SerializedName("tax_registrations")
    TaxRegistrations taxRegistrations;

    /**
     * Configuration for the <a
     * href="https://stripe.com/connect/supported-embedded-components/tax-settings/">tax
     * settings</a> embedded component.
     */
    @SerializedName("tax_settings")
    TaxSettings taxSettings;

    private Components(
        AccountManagement accountManagement,
        AccountOnboarding accountOnboarding,
        BalanceReport balanceReport,
        Balances balances,
        DisputesList disputesList,
        Documents documents,
        Map<String, Object> extraParams,
        FinancialAccount financialAccount,
        FinancialAccountTransactions financialAccountTransactions,
        InstantPayoutsPromotion instantPayoutsPromotion,
        IssuingCard issuingCard,
        IssuingCardsList issuingCardsList,
        NotificationBanner notificationBanner,
        PaymentDetails paymentDetails,
        PaymentDisputes paymentDisputes,
        Payments payments,
        PayoutDetails payoutDetails,
        PayoutReconciliationReport payoutReconciliationReport,
        Payouts payouts,
        PayoutsList payoutsList,
        TaxRegistrations taxRegistrations,
        TaxSettings taxSettings) {
      this.accountManagement = accountManagement;
      this.accountOnboarding = accountOnboarding;
      this.balanceReport = balanceReport;
      this.balances = balances;
      this.disputesList = disputesList;
      this.documents = documents;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.financialAccountTransactions = financialAccountTransactions;
      this.instantPayoutsPromotion = instantPayoutsPromotion;
      this.issuingCard = issuingCard;
      this.issuingCardsList = issuingCardsList;
      this.notificationBanner = notificationBanner;
      this.paymentDetails = paymentDetails;
      this.paymentDisputes = paymentDisputes;
      this.payments = payments;
      this.payoutDetails = payoutDetails;
      this.payoutReconciliationReport = payoutReconciliationReport;
      this.payouts = payouts;
      this.payoutsList = payoutsList;
      this.taxRegistrations = taxRegistrations;
      this.taxSettings = taxSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountManagement accountManagement;

      private AccountOnboarding accountOnboarding;

      private BalanceReport balanceReport;

      private Balances balances;

      private DisputesList disputesList;

      private Documents documents;

      private Map<String, Object> extraParams;

      private FinancialAccount financialAccount;

      private FinancialAccountTransactions financialAccountTransactions;

      private InstantPayoutsPromotion instantPayoutsPromotion;

      private IssuingCard issuingCard;

      private IssuingCardsList issuingCardsList;

      private NotificationBanner notificationBanner;

      private PaymentDetails paymentDetails;

      private PaymentDisputes paymentDisputes;

      private Payments payments;

      private PayoutDetails payoutDetails;

      private PayoutReconciliationReport payoutReconciliationReport;

      private Payouts payouts;

      private PayoutsList payoutsList;

      private TaxRegistrations taxRegistrations;

      private TaxSettings taxSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSessionCreateParams.Components build() {
        return new AccountSessionCreateParams.Components(
            this.accountManagement,
            this.accountOnboarding,
            this.balanceReport,
            this.balances,
            this.disputesList,
            this.documents,
            this.extraParams,
            this.financialAccount,
            this.financialAccountTransactions,
            this.instantPayoutsPromotion,
            this.issuingCard,
            this.issuingCardsList,
            this.notificationBanner,
            this.paymentDetails,
            this.paymentDisputes,
            this.payments,
            this.payoutDetails,
            this.payoutReconciliationReport,
            this.payouts,
            this.payoutsList,
            this.taxRegistrations,
            this.taxSettings);
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/account-management/">account
       * management</a> embedded component.
       */
      public Builder setAccountManagement(
          AccountSessionCreateParams.Components.AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/account-onboarding/">account
       * onboarding</a> embedded component.
       */
      public Builder setAccountOnboarding(
          AccountSessionCreateParams.Components.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/financial-reports#balance-report">balance
       * report</a> embedded component.
       */
      public Builder setBalanceReport(
          AccountSessionCreateParams.Components.BalanceReport balanceReport) {
        this.balanceReport = balanceReport;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/balances/">balances</a>
       * embedded component.
       */
      public Builder setBalances(AccountSessionCreateParams.Components.Balances balances) {
        this.balances = balances;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/disputes-list/">disputes
       * list</a> embedded component.
       */
      public Builder setDisputesList(
          AccountSessionCreateParams.Components.DisputesList disputesList) {
        this.disputesList = disputesList;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/documents/">documents</a>
       * embedded component.
       */
      public Builder setDocuments(AccountSessionCreateParams.Components.Documents documents) {
        this.documents = documents;
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

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/financial-account/">financial
       * account</a> embedded component.
       */
      public Builder setFinancialAccount(
          AccountSessionCreateParams.Components.FinancialAccount financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/financial-account-transactions/">financial
       * account transactions</a> embedded component.
       */
      public Builder setFinancialAccountTransactions(
          AccountSessionCreateParams.Components.FinancialAccountTransactions
              financialAccountTransactions) {
        this.financialAccountTransactions = financialAccountTransactions;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/instant-payouts-promotion/">instant
       * payouts promotion</a> embedded component.
       */
      public Builder setInstantPayoutsPromotion(
          AccountSessionCreateParams.Components.InstantPayoutsPromotion instantPayoutsPromotion) {
        this.instantPayoutsPromotion = instantPayoutsPromotion;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/issuing-card/">issuing
       * card</a> embedded component.
       */
      public Builder setIssuingCard(AccountSessionCreateParams.Components.IssuingCard issuingCard) {
        this.issuingCard = issuingCard;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/issuing-cards-list/">issuing
       * cards list</a> embedded component.
       */
      public Builder setIssuingCardsList(
          AccountSessionCreateParams.Components.IssuingCardsList issuingCardsList) {
        this.issuingCardsList = issuingCardsList;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/notification-banner/">notification
       * banner</a> embedded component.
       */
      public Builder setNotificationBanner(
          AccountSessionCreateParams.Components.NotificationBanner notificationBanner) {
        this.notificationBanner = notificationBanner;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payment-details/">payment
       * details</a> embedded component.
       */
      public Builder setPaymentDetails(
          AccountSessionCreateParams.Components.PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payment-disputes/">payment
       * disputes</a> embedded component.
       */
      public Builder setPaymentDisputes(
          AccountSessionCreateParams.Components.PaymentDisputes paymentDisputes) {
        this.paymentDisputes = paymentDisputes;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payments/">payments</a>
       * embedded component.
       */
      public Builder setPayments(AccountSessionCreateParams.Components.Payments payments) {
        this.payments = payments;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payout-details/">payout
       * details</a> embedded component.
       */
      public Builder setPayoutDetails(
          AccountSessionCreateParams.Components.PayoutDetails payoutDetails) {
        this.payoutDetails = payoutDetails;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/financial-reports#payout-reconciliation-report">payout
       * reconciliation report</a> embedded component.
       */
      public Builder setPayoutReconciliationReport(
          AccountSessionCreateParams.Components.PayoutReconciliationReport
              payoutReconciliationReport) {
        this.payoutReconciliationReport = payoutReconciliationReport;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payouts/">payouts</a>
       * embedded component.
       */
      public Builder setPayouts(AccountSessionCreateParams.Components.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/payouts-list/">payouts
       * list</a> embedded component.
       */
      public Builder setPayoutsList(AccountSessionCreateParams.Components.PayoutsList payoutsList) {
        this.payoutsList = payoutsList;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/tax-registrations/">tax
       * registrations</a> embedded component.
       */
      public Builder setTaxRegistrations(
          AccountSessionCreateParams.Components.TaxRegistrations taxRegistrations) {
        this.taxRegistrations = taxRegistrations;
        return this;
      }

      /**
       * Configuration for the <a
       * href="https://stripe.com/connect/supported-embedded-components/tax-settings/">tax
       * settings</a> embedded component.
       */
      public Builder setTaxSettings(AccountSessionCreateParams.Components.TaxSettings taxSettings) {
        this.taxSettings = taxSettings;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountManagement {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private AccountManagement(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AccountManagement build() {
          return new AccountSessionCreateParams.Components.AccountManagement(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.AccountManagement.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AccountManagement.Features build() {
            return new AccountSessionCreateParams.Components.AccountManagement.Features(
                this.disableStripeUserAuthentication,
                this.externalAccountCollection,
                this.extraParams);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.AccountManagement.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.AccountManagement.Features#extraParams} for the
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private AccountOnboarding(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.AccountOnboarding build() {
          return new AccountSessionCreateParams.Components.AccountOnboarding(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.AccountOnboarding.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AccountOnboarding.Features build() {
            return new AccountSessionCreateParams.Components.AccountOnboarding.Features(
                this.disableStripeUserAuthentication,
                this.externalAccountCollection,
                this.extraParams);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.AccountOnboarding.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.AccountOnboarding.Features#extraParams} for the
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BalanceReport {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private BalanceReport(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.BalanceReport build() {
          return new AccountSessionCreateParams.Components.BalanceReport(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.BalanceReport.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.BalanceReport.Features build() {
            return new AccountSessionCreateParams.Components.BalanceReport.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.BalanceReport.Features#extraParams} for the field
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
           * AccountSessionCreateParams.Components.BalanceReport.Features#extraParams} for the field
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Balances {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private Balances(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Balances build() {
          return new AccountSessionCreateParams.Components.Balances(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.Balances.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow payout schedule to be changed. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("instant_payouts")
        Boolean instantPayouts;

        /**
         * Whether to allow creation of standard payouts. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("standard_payouts")
        Boolean standardPayouts;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean editPayoutSchedule,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean instantPayouts,
            Boolean standardPayouts) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.editPayoutSchedule = editPayoutSchedule;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
          this.instantPayouts = instantPayouts;
          this.standardPayouts = standardPayouts;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean editPayoutSchedule;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean instantPayouts;

          private Boolean standardPayouts;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Balances.Features build() {
            return new AccountSessionCreateParams.Components.Balances.Features(
                this.disableStripeUserAuthentication,
                this.editPayoutSchedule,
                this.externalAccountCollection,
                this.extraParams,
                this.instantPayouts,
                this.standardPayouts);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether to allow payout schedule to be changed. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setEditPayoutSchedule(Boolean editPayoutSchedule) {
            this.editPayoutSchedule = editPayoutSchedule;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.Balances.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.Balances.Features#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setInstantPayouts(Boolean instantPayouts) {
            this.instantPayouts = instantPayouts;
            return this;
          }

          /**
           * Whether to allow creation of standard payouts. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setStandardPayouts(Boolean standardPayouts) {
            this.standardPayouts = standardPayouts;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class DisputesList {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private DisputesList(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.DisputesList build() {
          return new AccountSessionCreateParams.Components.DisputesList(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.DisputesList.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether to allow capturing and cancelling payment intents. This is {@code true} by
         * default.
         */
        @SerializedName("capture_payments")
        Boolean capturePayments;

        /**
         * Whether connected accounts can manage destination charges that are created on behalf of
         * them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether responding to disputes is enabled, including submitting evidence and accepting
         * disputes. This is {@code true} by default.
         */
        @SerializedName("dispute_management")
        Boolean disputeManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether sending refunds is enabled. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;

        private Features(
            Boolean capturePayments,
            Boolean destinationOnBehalfOfChargeManagement,
            Boolean disputeManagement,
            Map<String, Object> extraParams,
            Boolean refundManagement) {
          this.capturePayments = capturePayments;
          this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
          this.disputeManagement = disputeManagement;
          this.extraParams = extraParams;
          this.refundManagement = refundManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean capturePayments;

          private Boolean destinationOnBehalfOfChargeManagement;

          private Boolean disputeManagement;

          private Map<String, Object> extraParams;

          private Boolean refundManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.DisputesList.Features build() {
            return new AccountSessionCreateParams.Components.DisputesList.Features(
                this.capturePayments,
                this.destinationOnBehalfOfChargeManagement,
                this.disputeManagement,
                this.extraParams,
                this.refundManagement);
          }

          /**
           * Whether to allow capturing and cancelling payment intents. This is {@code true} by
           * default.
           */
          public Builder setCapturePayments(Boolean capturePayments) {
            this.capturePayments = capturePayments;
            return this;
          }

          /**
           * Whether connected accounts can manage destination charges that are created on behalf of
           * them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether responding to disputes is enabled, including submitting evidence and accepting
           * disputes. This is {@code true} by default.
           */
          public Builder setDisputeManagement(Boolean disputeManagement) {
            this.disputeManagement = disputeManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.DisputesList.Features#extraParams} for the field
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
           * AccountSessionCreateParams.Components.DisputesList.Features#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether sending refunds is enabled. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Documents {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private Documents(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Documents build() {
          return new AccountSessionCreateParams.Components.Documents(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.Documents.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Documents.Features build() {
            return new AccountSessionCreateParams.Components.Documents.Features(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.Documents.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.Documents.Features#extraParams}
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
    public static class FinancialAccount {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private FinancialAccount(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.FinancialAccount build() {
          return new AccountSessionCreateParams.Components.FinancialAccount(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.FinancialAccount#extraParams} for
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
         * map. See {@link AccountSessionCreateParams.Components.FinancialAccount#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.FinancialAccount.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether to allow sending money. */
        @SerializedName("send_money")
        Boolean sendMoney;

        /** Whether to allow transferring balance. */
        @SerializedName("transfer_balance")
        Boolean transferBalance;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean sendMoney,
            Boolean transferBalance) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
          this.sendMoney = sendMoney;
          this.transferBalance = transferBalance;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean sendMoney;

          private Boolean transferBalance;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.FinancialAccount.Features build() {
            return new AccountSessionCreateParams.Components.FinancialAccount.Features(
                this.disableStripeUserAuthentication,
                this.externalAccountCollection,
                this.extraParams,
                this.sendMoney,
                this.transferBalance);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.FinancialAccount.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.FinancialAccount.Features#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether to allow sending money. */
          public Builder setSendMoney(Boolean sendMoney) {
            this.sendMoney = sendMoney;
            return this;
          }

          /** Whether to allow transferring balance. */
          public Builder setTransferBalance(Boolean transferBalance) {
            this.transferBalance = transferBalance;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountTransactions {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private FinancialAccountTransactions(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.FinancialAccountTransactions build() {
          return new AccountSessionCreateParams.Components.FinancialAccountTransactions(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * AccountSessionCreateParams.Components.FinancialAccountTransactions#extraParams} for the
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
         * AccountSessionCreateParams.Components.FinancialAccountTransactions#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.FinancialAccountTransactions.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /** Whether to allow card spend dispute management features. */
        @SerializedName("card_spend_dispute_management")
        Boolean cardSpendDisputeManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Boolean cardSpendDisputeManagement, Map<String, Object> extraParams) {
          this.cardSpendDisputeManagement = cardSpendDisputeManagement;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean cardSpendDisputeManagement;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.FinancialAccountTransactions.Features
              build() {
            return new AccountSessionCreateParams.Components.FinancialAccountTransactions.Features(
                this.cardSpendDisputeManagement, this.extraParams);
          }

          /** Whether to allow card spend dispute management features. */
          public Builder setCardSpendDisputeManagement(Boolean cardSpendDisputeManagement) {
            this.cardSpendDisputeManagement = cardSpendDisputeManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.FinancialAccountTransactions.Features#extraParams}
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
           * AccountSessionCreateParams.Components.FinancialAccountTransactions.Features#extraParams}
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
    public static class InstantPayoutsPromotion {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private InstantPayoutsPromotion(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.InstantPayoutsPromotion build() {
          return new AccountSessionCreateParams.Components.InstantPayoutsPromotion(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.InstantPayoutsPromotion.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("instant_payouts")
        Boolean instantPayouts;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean instantPayouts) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
          this.instantPayouts = instantPayouts;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean instantPayouts;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.InstantPayoutsPromotion.Features build() {
            return new AccountSessionCreateParams.Components.InstantPayoutsPromotion.Features(
                this.disableStripeUserAuthentication,
                this.externalAccountCollection,
                this.extraParams,
                this.instantPayouts);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.InstantPayoutsPromotion.Features#extraParams} for
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
           * map. See {@link
           * AccountSessionCreateParams.Components.InstantPayoutsPromotion.Features#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setInstantPayouts(Boolean instantPayouts) {
            this.instantPayouts = instantPayouts;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCard {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private IssuingCard(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.IssuingCard build() {
          return new AccountSessionCreateParams.Components.IssuingCard(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.IssuingCard.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /** Whether to allow card management features. */
        @SerializedName("card_management")
        Boolean cardManagement;

        /** Whether to allow card spend dispute management features. */
        @SerializedName("card_spend_dispute_management")
        Boolean cardSpendDisputeManagement;

        /** Whether to allow cardholder management features. */
        @SerializedName("cardholder_management")
        Boolean cardholderManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether to allow spend control management features. */
        @SerializedName("spend_control_management")
        Boolean spendControlManagement;

        private Features(
            Boolean cardManagement,
            Boolean cardSpendDisputeManagement,
            Boolean cardholderManagement,
            Map<String, Object> extraParams,
            Boolean spendControlManagement) {
          this.cardManagement = cardManagement;
          this.cardSpendDisputeManagement = cardSpendDisputeManagement;
          this.cardholderManagement = cardholderManagement;
          this.extraParams = extraParams;
          this.spendControlManagement = spendControlManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean cardManagement;

          private Boolean cardSpendDisputeManagement;

          private Boolean cardholderManagement;

          private Map<String, Object> extraParams;

          private Boolean spendControlManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.IssuingCard.Features build() {
            return new AccountSessionCreateParams.Components.IssuingCard.Features(
                this.cardManagement,
                this.cardSpendDisputeManagement,
                this.cardholderManagement,
                this.extraParams,
                this.spendControlManagement);
          }

          /** Whether to allow card management features. */
          public Builder setCardManagement(Boolean cardManagement) {
            this.cardManagement = cardManagement;
            return this;
          }

          /** Whether to allow card spend dispute management features. */
          public Builder setCardSpendDisputeManagement(Boolean cardSpendDisputeManagement) {
            this.cardSpendDisputeManagement = cardSpendDisputeManagement;
            return this;
          }

          /** Whether to allow cardholder management features. */
          public Builder setCardholderManagement(Boolean cardholderManagement) {
            this.cardholderManagement = cardholderManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.IssuingCard.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.IssuingCard.Features#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether to allow spend control management features. */
          public Builder setSpendControlManagement(Boolean spendControlManagement) {
            this.spendControlManagement = spendControlManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCardsList {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private IssuingCardsList(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.IssuingCardsList build() {
          return new AccountSessionCreateParams.Components.IssuingCardsList(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.IssuingCardsList.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /** Whether to allow card management features. */
        @SerializedName("card_management")
        Boolean cardManagement;

        /** Whether to allow card spend dispute management features. */
        @SerializedName("card_spend_dispute_management")
        Boolean cardSpendDisputeManagement;

        /** Whether to allow cardholder management features. */
        @SerializedName("cardholder_management")
        Boolean cardholderManagement;

        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether to allow spend control management features. */
        @SerializedName("spend_control_management")
        Boolean spendControlManagement;

        private Features(
            Boolean cardManagement,
            Boolean cardSpendDisputeManagement,
            Boolean cardholderManagement,
            Boolean disableStripeUserAuthentication,
            Map<String, Object> extraParams,
            Boolean spendControlManagement) {
          this.cardManagement = cardManagement;
          this.cardSpendDisputeManagement = cardSpendDisputeManagement;
          this.cardholderManagement = cardholderManagement;
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.extraParams = extraParams;
          this.spendControlManagement = spendControlManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean cardManagement;

          private Boolean cardSpendDisputeManagement;

          private Boolean cardholderManagement;

          private Boolean disableStripeUserAuthentication;

          private Map<String, Object> extraParams;

          private Boolean spendControlManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.IssuingCardsList.Features build() {
            return new AccountSessionCreateParams.Components.IssuingCardsList.Features(
                this.cardManagement,
                this.cardSpendDisputeManagement,
                this.cardholderManagement,
                this.disableStripeUserAuthentication,
                this.extraParams,
                this.spendControlManagement);
          }

          /** Whether to allow card management features. */
          public Builder setCardManagement(Boolean cardManagement) {
            this.cardManagement = cardManagement;
            return this;
          }

          /** Whether to allow card spend dispute management features. */
          public Builder setCardSpendDisputeManagement(Boolean cardSpendDisputeManagement) {
            this.cardSpendDisputeManagement = cardSpendDisputeManagement;
            return this;
          }

          /** Whether to allow cardholder management features. */
          public Builder setCardholderManagement(Boolean cardholderManagement) {
            this.cardholderManagement = cardholderManagement;
            return this;
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.IssuingCardsList.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.IssuingCardsList.Features#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether to allow spend control management features. */
          public Builder setSpendControlManagement(Boolean spendControlManagement) {
            this.spendControlManagement = spendControlManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NotificationBanner {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private NotificationBanner(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.NotificationBanner build() {
          return new AccountSessionCreateParams.Components.NotificationBanner(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.NotificationBanner.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.NotificationBanner.Features build() {
            return new AccountSessionCreateParams.Components.NotificationBanner.Features(
                this.disableStripeUserAuthentication,
                this.externalAccountCollection,
                this.extraParams);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.NotificationBanner.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.NotificationBanner.Features#extraParams} for the
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDetails {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private PaymentDetails(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PaymentDetails build() {
          return new AccountSessionCreateParams.Components.PaymentDetails(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PaymentDetails.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether to allow capturing and cancelling payment intents. This is {@code true} by
         * default.
         */
        @SerializedName("capture_payments")
        Boolean capturePayments;

        /**
         * Whether connected accounts can manage destination charges that are created on behalf of
         * them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether responding to disputes is enabled, including submitting evidence and accepting
         * disputes. This is {@code true} by default.
         */
        @SerializedName("dispute_management")
        Boolean disputeManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether sending refunds is enabled. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;

        private Features(
            Boolean capturePayments,
            Boolean destinationOnBehalfOfChargeManagement,
            Boolean disputeManagement,
            Map<String, Object> extraParams,
            Boolean refundManagement) {
          this.capturePayments = capturePayments;
          this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
          this.disputeManagement = disputeManagement;
          this.extraParams = extraParams;
          this.refundManagement = refundManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean capturePayments;

          private Boolean destinationOnBehalfOfChargeManagement;

          private Boolean disputeManagement;

          private Map<String, Object> extraParams;

          private Boolean refundManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.PaymentDetails.Features build() {
            return new AccountSessionCreateParams.Components.PaymentDetails.Features(
                this.capturePayments,
                this.destinationOnBehalfOfChargeManagement,
                this.disputeManagement,
                this.extraParams,
                this.refundManagement);
          }

          /**
           * Whether to allow capturing and cancelling payment intents. This is {@code true} by
           * default.
           */
          public Builder setCapturePayments(Boolean capturePayments) {
            this.capturePayments = capturePayments;
            return this;
          }

          /**
           * Whether connected accounts can manage destination charges that are created on behalf of
           * them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether responding to disputes is enabled, including submitting evidence and accepting
           * disputes. This is {@code true} by default.
           */
          public Builder setDisputeManagement(Boolean disputeManagement) {
            this.disputeManagement = disputeManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.PaymentDetails.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.PaymentDetails.Features#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether sending refunds is enabled. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDisputes {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private PaymentDisputes(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PaymentDisputes build() {
          return new AccountSessionCreateParams.Components.PaymentDisputes(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PaymentDisputes.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether connected accounts can manage destination charges that are created on behalf of
         * them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether responding to disputes is enabled, including submitting evidence and accepting
         * disputes. This is {@code true} by default.
         */
        @SerializedName("dispute_management")
        Boolean disputeManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether sending refunds is enabled. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;

        private Features(
            Boolean destinationOnBehalfOfChargeManagement,
            Boolean disputeManagement,
            Map<String, Object> extraParams,
            Boolean refundManagement) {
          this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
          this.disputeManagement = disputeManagement;
          this.extraParams = extraParams;
          this.refundManagement = refundManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean destinationOnBehalfOfChargeManagement;

          private Boolean disputeManagement;

          private Map<String, Object> extraParams;

          private Boolean refundManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.PaymentDisputes.Features build() {
            return new AccountSessionCreateParams.Components.PaymentDisputes.Features(
                this.destinationOnBehalfOfChargeManagement,
                this.disputeManagement,
                this.extraParams,
                this.refundManagement);
          }

          /**
           * Whether connected accounts can manage destination charges that are created on behalf of
           * them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether responding to disputes is enabled, including submitting evidence and accepting
           * disputes. This is {@code true} by default.
           */
          public Builder setDisputeManagement(Boolean disputeManagement) {
            this.disputeManagement = disputeManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.PaymentDisputes.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.PaymentDisputes.Features#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether sending refunds is enabled. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private Payments(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Payments build() {
          return new AccountSessionCreateParams.Components.Payments(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.Payments.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether to allow capturing and cancelling payment intents. This is {@code true} by
         * default.
         */
        @SerializedName("capture_payments")
        Boolean capturePayments;

        /**
         * Whether connected accounts can manage destination charges that are created on behalf of
         * them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether responding to disputes is enabled, including submitting evidence and accepting
         * disputes. This is {@code true} by default.
         */
        @SerializedName("dispute_management")
        Boolean disputeManagement;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether sending refunds is enabled. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;

        private Features(
            Boolean capturePayments,
            Boolean destinationOnBehalfOfChargeManagement,
            Boolean disputeManagement,
            Map<String, Object> extraParams,
            Boolean refundManagement) {
          this.capturePayments = capturePayments;
          this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
          this.disputeManagement = disputeManagement;
          this.extraParams = extraParams;
          this.refundManagement = refundManagement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean capturePayments;

          private Boolean destinationOnBehalfOfChargeManagement;

          private Boolean disputeManagement;

          private Map<String, Object> extraParams;

          private Boolean refundManagement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Payments.Features build() {
            return new AccountSessionCreateParams.Components.Payments.Features(
                this.capturePayments,
                this.destinationOnBehalfOfChargeManagement,
                this.disputeManagement,
                this.extraParams,
                this.refundManagement);
          }

          /**
           * Whether to allow capturing and cancelling payment intents. This is {@code true} by
           * default.
           */
          public Builder setCapturePayments(Boolean capturePayments) {
            this.capturePayments = capturePayments;
            return this;
          }

          /**
           * Whether connected accounts can manage destination charges that are created on behalf of
           * them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether responding to disputes is enabled, including submitting evidence and accepting
           * disputes. This is {@code true} by default.
           */
          public Builder setDisputeManagement(Boolean disputeManagement) {
            this.disputeManagement = disputeManagement;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.Payments.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.Payments.Features#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether sending refunds is enabled. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutDetails {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private PayoutDetails(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutDetails build() {
          return new AccountSessionCreateParams.Components.PayoutDetails(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PayoutDetails.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.PayoutDetails.Features build() {
            return new AccountSessionCreateParams.Components.PayoutDetails.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.PayoutDetails.Features#extraParams} for the field
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
           * AccountSessionCreateParams.Components.PayoutDetails.Features#extraParams} for the field
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutReconciliationReport {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private PayoutReconciliationReport(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutReconciliationReport build() {
          return new AccountSessionCreateParams.Components.PayoutReconciliationReport(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PayoutReconciliationReport.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.PayoutReconciliationReport.Features build() {
            return new AccountSessionCreateParams.Components.PayoutReconciliationReport.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.PayoutReconciliationReport.Features#extraParams}
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
           * AccountSessionCreateParams.Components.PayoutReconciliationReport.Features#extraParams}
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
    public static class Payouts {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** The list of features enabled in the embedded component. */
      @SerializedName("features")
      Features features;

      private Payouts(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.Payouts build() {
          return new AccountSessionCreateParams.Components.Payouts(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.Payouts.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Whether Stripe user authentication is disabled. This value can only be {@code true} for
         * accounts where {@code controller.requirement_collection} is {@code application} for the
         * account. The default value is the opposite of the {@code external_account_collection}
         * value. For example, if you don't set {@code external_account_collection}, it defaults to
         * {@code true} and {@code disable_stripe_user_authentication} defaults to {@code false}.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow payout schedule to be changed. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether external account collection is enabled. This feature can only be {@code false}
         * for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like Custom accounts. The default value for this feature
         * is {@code true}.
         */
        @SerializedName("external_account_collection")
        Boolean externalAccountCollection;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("instant_payouts")
        Boolean instantPayouts;

        /**
         * Whether to allow creation of standard payouts. Defaults to {@code true} when {@code
         * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
         * false}.
         */
        @SerializedName("standard_payouts")
        Boolean standardPayouts;

        private Features(
            Boolean disableStripeUserAuthentication,
            Boolean editPayoutSchedule,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean instantPayouts,
            Boolean standardPayouts) {
          this.disableStripeUserAuthentication = disableStripeUserAuthentication;
          this.editPayoutSchedule = editPayoutSchedule;
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
          this.instantPayouts = instantPayouts;
          this.standardPayouts = standardPayouts;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean disableStripeUserAuthentication;

          private Boolean editPayoutSchedule;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean instantPayouts;

          private Boolean standardPayouts;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Payouts.Features build() {
            return new AccountSessionCreateParams.Components.Payouts.Features(
                this.disableStripeUserAuthentication,
                this.editPayoutSchedule,
                this.externalAccountCollection,
                this.extraParams,
                this.instantPayouts,
                this.standardPayouts);
          }

          /**
           * Whether Stripe user authentication is disabled. This value can only be {@code true} for
           * accounts where {@code controller.requirement_collection} is {@code application} for the
           * account. The default value is the opposite of the {@code external_account_collection}
           * value. For example, if you don't set {@code external_account_collection}, it defaults
           * to {@code true} and {@code disable_stripe_user_authentication} defaults to {@code
           * false}.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether to allow payout schedule to be changed. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setEditPayoutSchedule(Boolean editPayoutSchedule) {
            this.editPayoutSchedule = editPayoutSchedule;
            return this;
          }

          /**
           * Whether external account collection is enabled. This feature can only be {@code false}
           * for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like Custom accounts. The default value for this
           * feature is {@code true}.
           */
          public Builder setExternalAccountCollection(Boolean externalAccountCollection) {
            this.externalAccountCollection = externalAccountCollection;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.Payouts.Features#extraParams} for
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
           * map. See {@link AccountSessionCreateParams.Components.Payouts.Features#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Whether to allow creation of instant payouts. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setInstantPayouts(Boolean instantPayouts) {
            this.instantPayouts = instantPayouts;
            return this;
          }

          /**
           * Whether to allow creation of standard payouts. Defaults to {@code true} when {@code
           * controller.losses.payments} is set to {@code stripe} for the account, otherwise {@code
           * false}.
           */
          public Builder setStandardPayouts(Boolean standardPayouts) {
            this.standardPayouts = standardPayouts;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutsList {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private PayoutsList(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.PayoutsList build() {
          return new AccountSessionCreateParams.Components.PayoutsList(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PayoutsList.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.PayoutsList.Features build() {
            return new AccountSessionCreateParams.Components.PayoutsList.Features(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.PayoutsList.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.PayoutsList.Features#extraParams}
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
    public static class TaxRegistrations {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private TaxRegistrations(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TaxRegistrations build() {
          return new AccountSessionCreateParams.Components.TaxRegistrations(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.TaxRegistrations.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.TaxRegistrations.Features build() {
            return new AccountSessionCreateParams.Components.TaxRegistrations.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.TaxRegistrations.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.TaxRegistrations.Features#extraParams} for the
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxSettings {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      /** An empty list, because this embedded component has no features. */
      @SerializedName("features")
      Features features;

      private TaxSettings(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountSessionCreateParams.Components.TaxSettings build() {
          return new AccountSessionCreateParams.Components.TaxSettings(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

        /** An empty list, because this embedded component has no features. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.TaxSettings.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Features {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.TaxSettings.Features build() {
            return new AccountSessionCreateParams.Components.TaxSettings.Features(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.TaxSettings.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.TaxSettings.Features#extraParams}
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
  }
}
