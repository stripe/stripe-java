// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
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
  public static class Components {
    /** Configuration for the account management embedded component. */
    @SerializedName("account_management")
    AccountManagement accountManagement;

    /** Configuration for the account onboarding embedded component. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /** Configuration for the app install component. */
    @SerializedName("app_install")
    AppInstall appInstall;

    /** Configuration for the app viewport component. */
    @SerializedName("app_viewport")
    AppViewport appViewport;

    /** Configuration for the balances embedded component. */
    @SerializedName("balances")
    Balances balances;

    @SerializedName("capital_financing_promotion")
    CapitalFinancingPromotion capitalFinancingPromotion;

    /** Configuration for the capital overview embedded component. */
    @SerializedName("capital_overview")
    CapitalOverview capitalOverview;

    /** Configuration for the documents embedded component. */
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

    /** Configuration for the financial account component. */
    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    /** Configuration for the financial account transactions component. */
    @SerializedName("financial_account_transactions")
    FinancialAccountTransactions financialAccountTransactions;

    /** Configuration for the issuing card component. */
    @SerializedName("issuing_card")
    IssuingCard issuingCard;

    /** Configuration for the issuing cards list component. */
    @SerializedName("issuing_cards_list")
    IssuingCardsList issuingCardsList;

    /** Configuration for the notification banner embedded component. */
    @SerializedName("notification_banner")
    NotificationBanner notificationBanner;

    /** Configuration for the payment details embedded component. */
    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

    /** Configuration for the payment method settings embedded component. */
    @SerializedName("payment_method_settings")
    PaymentMethodSettings paymentMethodSettings;

    /** Configuration for the payments embedded component. */
    @SerializedName("payments")
    Payments payments;

    /** Configuration for the payouts embedded component. */
    @SerializedName("payouts")
    Payouts payouts;

    /** Configuration for the payouts list embedded component. */
    @SerializedName("payouts_list")
    PayoutsList payoutsList;

    /** Configuration for the tax registrations embedded component. */
    @SerializedName("tax_registrations")
    TaxRegistrations taxRegistrations;

    /** Configuration for the tax settings embedded component. */
    @SerializedName("tax_settings")
    TaxSettings taxSettings;

    private Components(
        AccountManagement accountManagement,
        AccountOnboarding accountOnboarding,
        AppInstall appInstall,
        AppViewport appViewport,
        Balances balances,
        CapitalFinancingPromotion capitalFinancingPromotion,
        CapitalOverview capitalOverview,
        Documents documents,
        Map<String, Object> extraParams,
        FinancialAccount financialAccount,
        FinancialAccountTransactions financialAccountTransactions,
        IssuingCard issuingCard,
        IssuingCardsList issuingCardsList,
        NotificationBanner notificationBanner,
        PaymentDetails paymentDetails,
        PaymentMethodSettings paymentMethodSettings,
        Payments payments,
        Payouts payouts,
        PayoutsList payoutsList,
        TaxRegistrations taxRegistrations,
        TaxSettings taxSettings) {
      this.accountManagement = accountManagement;
      this.accountOnboarding = accountOnboarding;
      this.appInstall = appInstall;
      this.appViewport = appViewport;
      this.balances = balances;
      this.capitalFinancingPromotion = capitalFinancingPromotion;
      this.capitalOverview = capitalOverview;
      this.documents = documents;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.financialAccountTransactions = financialAccountTransactions;
      this.issuingCard = issuingCard;
      this.issuingCardsList = issuingCardsList;
      this.notificationBanner = notificationBanner;
      this.paymentDetails = paymentDetails;
      this.paymentMethodSettings = paymentMethodSettings;
      this.payments = payments;
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

      private AppInstall appInstall;

      private AppViewport appViewport;

      private Balances balances;

      private CapitalFinancingPromotion capitalFinancingPromotion;

      private CapitalOverview capitalOverview;

      private Documents documents;

      private Map<String, Object> extraParams;

      private FinancialAccount financialAccount;

      private FinancialAccountTransactions financialAccountTransactions;

      private IssuingCard issuingCard;

      private IssuingCardsList issuingCardsList;

      private NotificationBanner notificationBanner;

      private PaymentDetails paymentDetails;

      private PaymentMethodSettings paymentMethodSettings;

      private Payments payments;

      private Payouts payouts;

      private PayoutsList payoutsList;

      private TaxRegistrations taxRegistrations;

      private TaxSettings taxSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSessionCreateParams.Components build() {
        return new AccountSessionCreateParams.Components(
            this.accountManagement,
            this.accountOnboarding,
            this.appInstall,
            this.appViewport,
            this.balances,
            this.capitalFinancingPromotion,
            this.capitalOverview,
            this.documents,
            this.extraParams,
            this.financialAccount,
            this.financialAccountTransactions,
            this.issuingCard,
            this.issuingCardsList,
            this.notificationBanner,
            this.paymentDetails,
            this.paymentMethodSettings,
            this.payments,
            this.payouts,
            this.payoutsList,
            this.taxRegistrations,
            this.taxSettings);
      }

      /** Configuration for the account management embedded component. */
      public Builder setAccountManagement(
          AccountSessionCreateParams.Components.AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
        return this;
      }

      /** Configuration for the account onboarding embedded component. */
      public Builder setAccountOnboarding(
          AccountSessionCreateParams.Components.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /** Configuration for the app install component. */
      public Builder setAppInstall(AccountSessionCreateParams.Components.AppInstall appInstall) {
        this.appInstall = appInstall;
        return this;
      }

      /** Configuration for the app viewport component. */
      public Builder setAppViewport(AccountSessionCreateParams.Components.AppViewport appViewport) {
        this.appViewport = appViewport;
        return this;
      }

      /** Configuration for the balances embedded component. */
      public Builder setBalances(AccountSessionCreateParams.Components.Balances balances) {
        this.balances = balances;
        return this;
      }

      public Builder setCapitalFinancingPromotion(
          AccountSessionCreateParams.Components.CapitalFinancingPromotion
              capitalFinancingPromotion) {
        this.capitalFinancingPromotion = capitalFinancingPromotion;
        return this;
      }

      /** Configuration for the capital overview embedded component. */
      public Builder setCapitalOverview(
          AccountSessionCreateParams.Components.CapitalOverview capitalOverview) {
        this.capitalOverview = capitalOverview;
        return this;
      }

      /** Configuration for the documents embedded component. */
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

      /** Configuration for the financial account component. */
      public Builder setFinancialAccount(
          AccountSessionCreateParams.Components.FinancialAccount financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /** Configuration for the financial account transactions component. */
      public Builder setFinancialAccountTransactions(
          AccountSessionCreateParams.Components.FinancialAccountTransactions
              financialAccountTransactions) {
        this.financialAccountTransactions = financialAccountTransactions;
        return this;
      }

      /** Configuration for the issuing card component. */
      public Builder setIssuingCard(AccountSessionCreateParams.Components.IssuingCard issuingCard) {
        this.issuingCard = issuingCard;
        return this;
      }

      /** Configuration for the issuing cards list component. */
      public Builder setIssuingCardsList(
          AccountSessionCreateParams.Components.IssuingCardsList issuingCardsList) {
        this.issuingCardsList = issuingCardsList;
        return this;
      }

      /** Configuration for the notification banner embedded component. */
      public Builder setNotificationBanner(
          AccountSessionCreateParams.Components.NotificationBanner notificationBanner) {
        this.notificationBanner = notificationBanner;
        return this;
      }

      /** Configuration for the payment details embedded component. */
      public Builder setPaymentDetails(
          AccountSessionCreateParams.Components.PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
      }

      /** Configuration for the payment method settings embedded component. */
      public Builder setPaymentMethodSettings(
          AccountSessionCreateParams.Components.PaymentMethodSettings paymentMethodSettings) {
        this.paymentMethodSettings = paymentMethodSettings;
        return this;
      }

      /** Configuration for the payments embedded component. */
      public Builder setPayments(AccountSessionCreateParams.Components.Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Configuration for the payouts embedded component. */
      public Builder setPayouts(AccountSessionCreateParams.Components.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }

      /** Configuration for the payouts list embedded component. */
      public Builder setPayoutsList(AccountSessionCreateParams.Components.PayoutsList payoutsList) {
        this.payoutsList = payoutsList;
        return this;
      }

      /** Configuration for the tax registrations embedded component. */
      public Builder setTaxRegistrations(
          AccountSessionCreateParams.Components.TaxRegistrations taxRegistrations) {
        this.taxRegistrations = taxRegistrations;
        return this;
      }

      /** Configuration for the tax settings embedded component. */
      public Builder setTaxSettings(AccountSessionCreateParams.Components.TaxSettings taxSettings) {
        this.taxSettings = taxSettings;
        return this;
      }
    }

    @Getter
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
      public static class Features {
        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for custom accounts (or accounts where the
         * platform is compliance owner). Otherwise, bank account collection is determined by
         * compliance requirements.
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

        private Features(Boolean externalAccountCollection, Map<String, Object> extraParams) {
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AccountManagement.Features build() {
            return new AccountSessionCreateParams.Components.AccountManagement.Features(
                this.externalAccountCollection, this.extraParams);
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for custom accounts (or accounts where the
           * platform is compliance owner). Otherwise, bank account collection is determined by
           * compliance requirements.
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
      public static class Features {
        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for custom accounts (or accounts where the
         * platform is compliance owner). Otherwise, bank account collection is determined by
         * compliance requirements.
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

        private Features(Boolean externalAccountCollection, Map<String, Object> extraParams) {
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AccountOnboarding.Features build() {
            return new AccountSessionCreateParams.Components.AccountOnboarding.Features(
                this.externalAccountCollection, this.extraParams);
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for custom accounts (or accounts where the
           * platform is compliance owner). Otherwise, bank account collection is determined by
           * compliance requirements.
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
    public static class AppInstall {
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

      private AppInstall(Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public AccountSessionCreateParams.Components.AppInstall build() {
          return new AccountSessionCreateParams.Components.AppInstall(
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.AppInstall.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      public static class Features {
        /** List of apps allowed to be enabled for this account session. */
        @SerializedName("allowed_apps")
        Object allowedApps;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Object allowedApps, Map<String, Object> extraParams) {
          this.allowedApps = allowedApps;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object allowedApps;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AppInstall.Features build() {
            return new AccountSessionCreateParams.Components.AppInstall.Features(
                this.allowedApps, this.extraParams);
          }

          /**
           * Add an element to `allowedApps` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * AccountSessionCreateParams.Components.AppInstall.Features#allowedApps} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllowedApp(String element) {
            if (this.allowedApps == null || this.allowedApps instanceof EmptyParam) {
              this.allowedApps = new ArrayList<String>();
            }
            ((List<String>) this.allowedApps).add(element);
            return this;
          }

          /**
           * Add all elements to `allowedApps` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountSessionCreateParams.Components.AppInstall.Features#allowedApps} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllAllowedApp(List<String> elements) {
            if (this.allowedApps == null || this.allowedApps instanceof EmptyParam) {
              this.allowedApps = new ArrayList<String>();
            }
            ((List<String>) this.allowedApps).addAll(elements);
            return this;
          }

          /** List of apps allowed to be enabled for this account session. */
          public Builder setAllowedApps(EmptyParam allowedApps) {
            this.allowedApps = allowedApps;
            return this;
          }

          /** List of apps allowed to be enabled for this account session. */
          public Builder setAllowedApps(List<String> allowedApps) {
            this.allowedApps = allowedApps;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.AppInstall.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.AppInstall.Features#extraParams}
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
    public static class AppViewport {
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

      private AppViewport(Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public AccountSessionCreateParams.Components.AppViewport build() {
          return new AccountSessionCreateParams.Components.AppViewport(
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.AppViewport.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      public static class Features {
        /** List of apps allowed to be enabled for this account session. */
        @SerializedName("allowed_apps")
        Object allowedApps;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Features(Object allowedApps, Map<String, Object> extraParams) {
          this.allowedApps = allowedApps;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object allowedApps;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.AppViewport.Features build() {
            return new AccountSessionCreateParams.Components.AppViewport.Features(
                this.allowedApps, this.extraParams);
          }

          /**
           * Add an element to `allowedApps` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * AccountSessionCreateParams.Components.AppViewport.Features#allowedApps} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllowedApp(String element) {
            if (this.allowedApps == null || this.allowedApps instanceof EmptyParam) {
              this.allowedApps = new ArrayList<String>();
            }
            ((List<String>) this.allowedApps).add(element);
            return this;
          }

          /**
           * Add all elements to `allowedApps` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link AccountSessionCreateParams.Components.AppViewport.Features#allowedApps} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllAllowedApp(List<String> elements) {
            if (this.allowedApps == null || this.allowedApps instanceof EmptyParam) {
              this.allowedApps = new ArrayList<String>();
            }
            ((List<String>) this.allowedApps).addAll(elements);
            return this;
          }

          /** List of apps allowed to be enabled for this account session. */
          public Builder setAllowedApps(EmptyParam allowedApps) {
            this.allowedApps = allowedApps;
            return this;
          }

          /** List of apps allowed to be enabled for this account session. */
          public Builder setAllowedApps(List<String> allowedApps) {
            this.allowedApps = allowedApps;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountSessionCreateParams.Components.AppViewport.Features#extraParams}
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
           * map. See {@link AccountSessionCreateParams.Components.AppViewport.Features#extraParams}
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
      public static class Features {
        /**
         * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
         * Loss Liability, default {@code false} otherwise.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for custom accounts (or accounts where the
         * platform is compliance owner). Otherwise, bank account collection is determined by
         * compliance requirements.
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
         * Whether to allow creation of instant payouts. Default {@code true} when Stripe owns Loss
         * Liability, default {@code false} otherwise.
         */
        @SerializedName("instant_payouts")
        Boolean instantPayouts;

        /**
         * Whether to allow creation of standard payouts. Default {@code true} when Stripe owns Loss
         * Liability, default {@code false} otherwise.
         */
        @SerializedName("standard_payouts")
        Boolean standardPayouts;

        private Features(
            Boolean editPayoutSchedule,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean instantPayouts,
            Boolean standardPayouts) {
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
          private Boolean editPayoutSchedule;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean instantPayouts;

          private Boolean standardPayouts;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Balances.Features build() {
            return new AccountSessionCreateParams.Components.Balances.Features(
                this.editPayoutSchedule,
                this.externalAccountCollection,
                this.extraParams,
                this.instantPayouts,
                this.standardPayouts);
          }

          /**
           * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setEditPayoutSchedule(Boolean editPayoutSchedule) {
            this.editPayoutSchedule = editPayoutSchedule;
            return this;
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for custom accounts (or accounts where the
           * platform is compliance owner). Otherwise, bank account collection is determined by
           * compliance requirements.
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
           * Whether to allow creation of instant payouts. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setInstantPayouts(Boolean instantPayouts) {
            this.instantPayouts = instantPayouts;
            return this;
          }

          /**
           * Whether to allow creation of standard payouts. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setStandardPayouts(Boolean standardPayouts) {
            this.standardPayouts = standardPayouts;
            return this;
          }
        }
      }
    }

    @Getter
    public static class CapitalFinancingPromotion {
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

      private CapitalFinancingPromotion(
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
        public AccountSessionCreateParams.Components.CapitalFinancingPromotion build() {
          return new AccountSessionCreateParams.Components.CapitalFinancingPromotion(
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.CapitalFinancingPromotion.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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
          public AccountSessionCreateParams.Components.CapitalFinancingPromotion.Features build() {
            return new AccountSessionCreateParams.Components.CapitalFinancingPromotion.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.CapitalFinancingPromotion.Features#extraParams}
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
           * AccountSessionCreateParams.Components.CapitalFinancingPromotion.Features#extraParams}
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
    public static class CapitalOverview {
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

      private CapitalOverview(Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public AccountSessionCreateParams.Components.CapitalOverview build() {
          return new AccountSessionCreateParams.Components.CapitalOverview(
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
         * map. See {@link AccountSessionCreateParams.Components.CapitalOverview#extraParams} for
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
         * map. See {@link AccountSessionCreateParams.Components.CapitalOverview#extraParams} for
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
            AccountSessionCreateParams.Components.CapitalOverview.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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
          public AccountSessionCreateParams.Components.CapitalOverview.Features build() {
            return new AccountSessionCreateParams.Components.CapitalOverview.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.CapitalOverview.Features#extraParams} for the
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
           * AccountSessionCreateParams.Components.CapitalOverview.Features#extraParams} for the
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

      /** The list of features enabled in the embedded component. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.Documents.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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

        public Builder setFeatures(
            AccountSessionCreateParams.Components.FinancialAccount.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      public static class Features {
        /** Whether to allow external accounts to be linked for money transfer. */
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

        /** Whether to allow money movement features. */
        @SerializedName("money_movement")
        Boolean moneyMovement;

        private Features(
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean moneyMovement) {
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
          this.moneyMovement = moneyMovement;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean moneyMovement;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.FinancialAccount.Features build() {
            return new AccountSessionCreateParams.Components.FinancialAccount.Features(
                this.externalAccountCollection, this.extraParams, this.moneyMovement);
          }

          /** Whether to allow external accounts to be linked for money transfer. */
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

          /** Whether to allow money movement features. */
          public Builder setMoneyMovement(Boolean moneyMovement) {
            this.moneyMovement = moneyMovement;
            return this;
          }
        }
      }
    }

    @Getter
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

        public Builder setFeatures(
            AccountSessionCreateParams.Components.FinancialAccountTransactions.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      public static class Features {
        /** Whether to allow card spend dispute features. */
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

          /** Whether to allow card spend dispute features. */
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
          public AccountSessionCreateParams.Components.IssuingCard.Features build() {
            return new AccountSessionCreateParams.Components.IssuingCard.Features(this.extraParams);
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
        }
      }
    }

    @Getter
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
      public static class Features {
        /** Whether to allow card management features. */
        @SerializedName("card_management")
        Boolean cardManagement;

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

        private Features(
            Boolean cardManagement, Boolean cardholderManagement, Map<String, Object> extraParams) {
          this.cardManagement = cardManagement;
          this.cardholderManagement = cardholderManagement;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean cardManagement;

          private Boolean cardholderManagement;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.IssuingCardsList.Features build() {
            return new AccountSessionCreateParams.Components.IssuingCardsList.Features(
                this.cardManagement, this.cardholderManagement, this.extraParams);
          }

          /** Whether to allow card management features. */
          public Builder setCardManagement(Boolean cardManagement) {
            this.cardManagement = cardManagement;
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
        }
      }
    }

    @Getter
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
      public static class Features {
        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for custom accounts (or accounts where the
         * platform is compliance owner). Otherwise, bank account collection is determined by
         * compliance requirements.
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

        private Features(Boolean externalAccountCollection, Map<String, Object> extraParams) {
          this.externalAccountCollection = externalAccountCollection;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.NotificationBanner.Features build() {
            return new AccountSessionCreateParams.Components.NotificationBanner.Features(
                this.externalAccountCollection, this.extraParams);
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for custom accounts (or accounts where the
           * platform is compliance owner). Otherwise, bank account collection is determined by
           * compliance requirements.
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
      public static class Features {
        /**
         * Whether to allow capturing and cancelling payment intents. This is {@code true} by
         * default.
         */
        @SerializedName("capture_payments")
        Boolean capturePayments;

        /**
         * Whether to allow connected accounts to manage destination charges that are created on
         * behalf of them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether to allow responding to disputes, including submitting evidence and accepting
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
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
           * Whether to allow connected accounts to manage destination charges that are created on
           * behalf of them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether to allow responding to disputes, including submitting evidence and accepting
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

          /** Whether to allow sending refunds. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
    public static class PaymentMethodSettings {
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

      private PaymentMethodSettings(
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
        public AccountSessionCreateParams.Components.PaymentMethodSettings build() {
          return new AccountSessionCreateParams.Components.PaymentMethodSettings(
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PaymentMethodSettings.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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
          public AccountSessionCreateParams.Components.PaymentMethodSettings.Features build() {
            return new AccountSessionCreateParams.Components.PaymentMethodSettings.Features(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountSessionCreateParams.Components.PaymentMethodSettings.Features#extraParams} for
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
           * AccountSessionCreateParams.Components.PaymentMethodSettings.Features#extraParams} for
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
    }

    @Getter
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
      public static class Features {
        /**
         * Whether to allow capturing and cancelling payment intents. This is {@code true} by
         * default.
         */
        @SerializedName("capture_payments")
        Boolean capturePayments;

        /**
         * Whether to allow connected accounts to manage destination charges that are created on
         * behalf of them. This is {@code false} by default.
         */
        @SerializedName("destination_on_behalf_of_charge_management")
        Boolean destinationOnBehalfOfChargeManagement;

        /**
         * Whether to allow responding to disputes, including submitting evidence and accepting
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
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
           * Whether to allow connected accounts to manage destination charges that are created on
           * behalf of them. This is {@code false} by default.
           */
          public Builder setDestinationOnBehalfOfChargeManagement(
              Boolean destinationOnBehalfOfChargeManagement) {
            this.destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement;
            return this;
          }

          /**
           * Whether to allow responding to disputes, including submitting evidence and accepting
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

          /** Whether to allow sending refunds. This is {@code true} by default. */
          public Builder setRefundManagement(Boolean refundManagement) {
            this.refundManagement = refundManagement;
            return this;
          }
        }
      }
    }

    @Getter
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
      public static class Features {
        /**
         * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
         * Loss Liability, default {@code false} otherwise.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for custom accounts (or accounts where the
         * platform is compliance owner). Otherwise, bank account collection is determined by
         * compliance requirements.
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
         * Whether to allow creation of instant payouts. Default {@code true} when Stripe owns Loss
         * Liability, default {@code false} otherwise.
         */
        @SerializedName("instant_payouts")
        Boolean instantPayouts;

        /**
         * Whether to allow creation of standard payouts. Default {@code true} when Stripe owns Loss
         * Liability, default {@code false} otherwise.
         */
        @SerializedName("standard_payouts")
        Boolean standardPayouts;

        private Features(
            Boolean editPayoutSchedule,
            Boolean externalAccountCollection,
            Map<String, Object> extraParams,
            Boolean instantPayouts,
            Boolean standardPayouts) {
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
          private Boolean editPayoutSchedule;

          private Boolean externalAccountCollection;

          private Map<String, Object> extraParams;

          private Boolean instantPayouts;

          private Boolean standardPayouts;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountSessionCreateParams.Components.Payouts.Features build() {
            return new AccountSessionCreateParams.Components.Payouts.Features(
                this.editPayoutSchedule,
                this.externalAccountCollection,
                this.extraParams,
                this.instantPayouts,
                this.standardPayouts);
          }

          /**
           * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setEditPayoutSchedule(Boolean editPayoutSchedule) {
            this.editPayoutSchedule = editPayoutSchedule;
            return this;
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for custom accounts (or accounts where the
           * platform is compliance owner). Otherwise, bank account collection is determined by
           * compliance requirements.
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
           * Whether to allow creation of instant payouts. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setInstantPayouts(Boolean instantPayouts) {
            this.instantPayouts = instantPayouts;
            return this;
          }

          /**
           * Whether to allow creation of standard payouts. Default {@code true} when Stripe owns
           * Loss Liability, default {@code false} otherwise.
           */
          public Builder setStandardPayouts(Boolean standardPayouts) {
            this.standardPayouts = standardPayouts;
            return this;
          }
        }
      }
    }

    @Getter
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

      /** The list of features enabled in the embedded component. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.PayoutsList.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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

      /** The list of features enabled in the embedded component. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.TaxRegistrations.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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

      /** The list of features enabled in the embedded component. */
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

        /** The list of features enabled in the embedded component. */
        public Builder setFeatures(
            AccountSessionCreateParams.Components.TaxSettings.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
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
