// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountSessionCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An AccountSession allows a Connect platform to grant access to a connected account in Connect
 * embedded components.
 *
 * <p>We recommend that you create an AccountSession each time you need to display an embedded
 * component to your user. Do not save AccountSessions to your database as they expire relatively
 * quickly, and cannot be used more than once.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/connect/get-started-connect-embedded-components">Connect embedded
 * components</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountSession extends ApiResource {
  /** The ID of the account the AccountSession was created for. */
  @SerializedName("account")
  String account;

  /**
   * The client secret of this AccountSession. Used on the client to set up secure access to the
   * given {@code account}.
   *
   * <p>The client secret can be used to provide access to {@code account} from your frontend. It
   * should not be stored, logged, or exposed to anyone other than the connected account. Make sure
   * that you have TLS enabled on any page that includes the client secret.
   *
   * <p>Refer to our docs to <a
   * href="https://stripe.com/docs/connect/get-started-connect-embedded-components">setup Connect
   * embedded components</a> and learn about how {@code client_secret} should be handled.
   */
  @SerializedName("client_secret")
  String clientSecret;

  @SerializedName("components")
  Components components;

  /** The timestamp at which this AccountSession will expire. */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code account_session}.
   */
  @SerializedName("object")
  String object;

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, AccountSession.class);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(AccountSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a AccountSession object that includes a single-use token that the platform can use on
   * their front-end to grant client-side API access.
   */
  public static AccountSession create(AccountSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountSession.class);
  }

  /**
   * For more details about Components, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Components extends StripeObject {
    @SerializedName("account_management")
    AccountManagement accountManagement;

    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    @SerializedName("balances")
    Balances balances;

    @SerializedName("disputes_list")
    DisputesList disputesList;

    @SerializedName("documents")
    Documents documents;

    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    @SerializedName("financial_account_transactions")
    FinancialAccountTransactions financialAccountTransactions;

    @SerializedName("issuing_card")
    IssuingCard issuingCard;

    @SerializedName("issuing_cards_list")
    IssuingCardsList issuingCardsList;

    @SerializedName("notification_banner")
    NotificationBanner notificationBanner;

    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

    @SerializedName("payment_disputes")
    PaymentDisputes paymentDisputes;

    @SerializedName("payments")
    Payments payments;

    @SerializedName("payouts")
    Payouts payouts;

    @SerializedName("payouts_list")
    PayoutsList payoutsList;

    @SerializedName("tax_registrations")
    TaxRegistrations taxRegistrations;

    @SerializedName("tax_settings")
    TaxSettings taxSettings;

    /**
     * For more details about AccountManagement, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountManagement extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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
      }
    }

    /**
     * For more details about AccountOnboarding, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AccountOnboarding extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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
      }
    }

    /**
     * For more details about Balances, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balances extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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
      }
    }

    /**
     * For more details about DisputesList, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisputesList extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;
      }
    }

    /**
     * For more details about Documents, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Documents extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {}
    }

    /**
     * For more details about FinancialAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccount extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow sending money. */
        @SerializedName("send_money")
        Boolean sendMoney;

        /** Whether to allow transferring balance. */
        @SerializedName("transfer_balance")
        Boolean transferBalance;
      }
    }

    /**
     * For more details about FinancialAccountTransactions, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccountTransactions extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /** Whether to allow card spend dispute management features. */
        @SerializedName("card_spend_dispute_management")
        Boolean cardSpendDisputeManagement;
      }
    }

    /**
     * For more details about IssuingCard, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCard extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
        /** Whether to allow card management features. */
        @SerializedName("card_management")
        Boolean cardManagement;

        /** Whether to allow card spend dispute management features. */
        @SerializedName("card_spend_dispute_management")
        Boolean cardSpendDisputeManagement;

        /** Whether to allow cardholder management features. */
        @SerializedName("cardholder_management")
        Boolean cardholderManagement;

        /** Whether to allow spend control management features. */
        @SerializedName("spend_control_management")
        Boolean spendControlManagement;
      }
    }

    /**
     * For more details about IssuingCardsList, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuingCardsList extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow spend control management features. */
        @SerializedName("spend_control_management")
        Boolean spendControlManagement;
      }
    }

    /**
     * For more details about NotificationBanner, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NotificationBanner extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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
      }
    }

    /**
     * For more details about PaymentDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDetails extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;
      }
    }

    /**
     * For more details about PaymentDisputes, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDisputes extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;
      }
    }

    /**
     * For more details about Payments, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payments extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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

        /** Whether to allow sending refunds. This is {@code true} by default. */
        @SerializedName("refund_management")
        Boolean refundManagement;
      }
    }

    /**
     * For more details about Payouts, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payouts extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {
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
      }
    }

    /**
     * For more details about PayoutsList, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutsList extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {}
    }

    /**
     * For more details about TaxRegistrations, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRegistrations extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {}
    }

    /**
     * For more details about TaxSettings, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxSettings extends StripeObject {
      /** Whether the embedded component is enabled. */
      @SerializedName("enabled")
      Boolean enabled;

      @SerializedName("features")
      Features features;

      /**
       * For more details about Features, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Features extends StripeObject {}
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(components, responseGetter);
  }
}
