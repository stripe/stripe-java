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
    /** Configuration for the account management embedded component. */
    @SerializedName("account_management")
    AccountManagement accountManagement;

    /** Configuration for the account onboarding embedded component. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /** Configuration for the balances embedded component. */
    @SerializedName("balances")
    Balances balances;

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

    /** Configuration for the financial account embedded component. */
    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    /** Configuration for the financial account transactions embedded component. */
    @SerializedName("financial_account_transactions")
    FinancialAccountTransactions financialAccountTransactions;

    /** Configuration for the issuing card embedded component. */
    @SerializedName("issuing_card")
    IssuingCard issuingCard;

    /** Configuration for the issuing cards list embedded component. */
    @SerializedName("issuing_cards_list")
    IssuingCardsList issuingCardsList;

    /** Configuration for the notification banner embedded component. */
    @SerializedName("notification_banner")
    NotificationBanner notificationBanner;

    /** Configuration for the payment details embedded component. */
    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

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
        Balances balances,
        Documents documents,
        Map<String, Object> extraParams,
        FinancialAccount financialAccount,
        FinancialAccountTransactions financialAccountTransactions,
        IssuingCard issuingCard,
        IssuingCardsList issuingCardsList,
        NotificationBanner notificationBanner,
        PaymentDetails paymentDetails,
        Payments payments,
        Payouts payouts,
        PayoutsList payoutsList,
        TaxRegistrations taxRegistrations,
        TaxSettings taxSettings) {
      this.accountManagement = accountManagement;
      this.accountOnboarding = accountOnboarding;
      this.balances = balances;
      this.documents = documents;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
      this.financialAccountTransactions = financialAccountTransactions;
      this.issuingCard = issuingCard;
      this.issuingCardsList = issuingCardsList;
      this.notificationBanner = notificationBanner;
      this.paymentDetails = paymentDetails;
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

      private Balances balances;

      private Documents documents;

      private Map<String, Object> extraParams;

      private FinancialAccount financialAccount;

      private FinancialAccountTransactions financialAccountTransactions;

      private IssuingCard issuingCard;

      private IssuingCardsList issuingCardsList;

      private NotificationBanner notificationBanner;

      private PaymentDetails paymentDetails;

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
            this.balances,
            this.documents,
            this.extraParams,
            this.financialAccount,
            this.financialAccountTransactions,
            this.issuingCard,
            this.issuingCardsList,
            this.notificationBanner,
            this.paymentDetails,
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

      /** Configuration for the balances embedded component. */
      public Builder setBalances(AccountSessionCreateParams.Components.Balances balances) {
        this.balances = balances;
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

      /** Configuration for the financial account embedded component. */
      public Builder setFinancialAccount(
          AccountSessionCreateParams.Components.FinancialAccount financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }

      /** Configuration for the financial account transactions embedded component. */
      public Builder setFinancialAccountTransactions(
          AccountSessionCreateParams.Components.FinancialAccountTransactions
              financialAccountTransactions) {
        this.financialAccountTransactions = financialAccountTransactions;
        return this;
      }

      /** Configuration for the issuing card embedded component. */
      public Builder setIssuingCard(AccountSessionCreateParams.Components.IssuingCard issuingCard) {
        this.issuingCard = issuingCard;
        return this;
      }

      /** Configuration for the issuing cards list embedded component. */
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for accounts where you’re responsible for
         * collecting updated information when requirements are due or change, like custom accounts.
         * Otherwise, bank account collection is determined by compliance requirements. The default
         * value for this feature is {@code true}.
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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for accounts where you’re responsible for
           * collecting updated information when requirements are due or change, like custom
           * accounts. Otherwise, bank account collection is determined by compliance requirements.
           * The default value for this feature is {@code true}.
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for accounts where you’re responsible for
         * collecting updated information when requirements are due or change, like custom accounts.
         * Otherwise, bank account collection is determined by compliance requirements. The default
         * value for this feature is {@code true}.
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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for accounts where you’re responsible for
           * collecting updated information when requirements are due or change, like custom
           * accounts. Otherwise, bank account collection is determined by compliance requirements.
           * The default value for this feature is {@code true}.
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
         * Loss Liability, default {@code false} otherwise.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for accounts where you’re responsible for
         * collecting updated information when requirements are due or change, like custom accounts.
         * Otherwise, bank account collection is determined by compliance requirements. The default
         * value for this feature is {@code true}.
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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
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
           * accounts. This feature can only be false for accounts where you’re responsible for
           * collecting updated information when requirements are due or change, like custom
           * accounts. Otherwise, bank account collection is determined by compliance requirements.
           * The default value for this feature is {@code true}.
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
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
         * Disables Stripe user authentication for this embedded component. This feature can only be
         * false for accounts where you’re responsible for collecting updated information when
         * requirements are due or change, like custom accounts.
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
           * Disables Stripe user authentication for this embedded component. This feature can only
           * be false for accounts where you’re responsible for collecting updated information when
           * requirements are due or change, like custom accounts.
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for accounts where you’re responsible for
         * collecting updated information when requirements are due or change, like custom accounts.
         * Otherwise, bank account collection is determined by compliance requirements. The default
         * value for this feature is {@code true}.
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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
          }

          /**
           * Whether to allow platforms to control bank account collection for their connected
           * accounts. This feature can only be false for accounts where you’re responsible for
           * collecting updated information when requirements are due or change, like custom
           * accounts. Otherwise, bank account collection is determined by compliance requirements.
           * The default value for this feature is {@code true}.
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
         * Disables Stripe user authentication for this embedded component. This value can only be
         * true for accounts where {@code controller.requirement_collection} is {@code application}.
         * The default value is the opposite of the {@code external_account_collection} value. For
         * example, if you don’t set {@code external_account_collection}, it defaults to true and
         * {@code disable_stripe_user_authentication} defaults to false.
         */
        @SerializedName("disable_stripe_user_authentication")
        Boolean disableStripeUserAuthentication;

        /**
         * Whether to allow payout schedule to be changed. Default {@code true} when Stripe owns
         * Loss Liability, default {@code false} otherwise.
         */
        @SerializedName("edit_payout_schedule")
        Boolean editPayoutSchedule;

        /**
         * Whether to allow platforms to control bank account collection for their connected
         * accounts. This feature can only be false for accounts where you’re responsible for
         * collecting updated information when requirements are due or change, like custom accounts.
         * Otherwise, bank account collection is determined by compliance requirements. The default
         * value for this feature is {@code true}.
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
           * Disables Stripe user authentication for this embedded component. This value can only be
           * true for accounts where {@code controller.requirement_collection} is {@code
           * application}. The default value is the opposite of the {@code
           * external_account_collection} value. For example, if you don’t set {@code
           * external_account_collection}, it defaults to true and {@code
           * disable_stripe_user_authentication} defaults to false.
           */
          public Builder setDisableStripeUserAuthentication(
              Boolean disableStripeUserAuthentication) {
            this.disableStripeUserAuthentication = disableStripeUserAuthentication;
            return this;
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
           * accounts. This feature can only be false for accounts where you’re responsible for
           * collecting updated information when requirements are due or change, like custom
           * accounts. Otherwise, bank account collection is determined by compliance requirements.
           * The default value for this feature is {@code true}.
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
