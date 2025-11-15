// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CollectionSettingVersion extends StripeObject implements HasId {
  /**
   * Either automatic, or send_invoice. When charging automatically, Stripe will attempt to pay this
   * bill at the end of the period using the payment method attached to the payer profile. When
   * sending an invoice, Stripe will email your payer profile an invoice with payment instructions.
   * Defaults to automatic.
   *
   * <p>One of {@code automatic}, or {@code send_invoice}.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** Email delivery settings. */
  @SerializedName("email_delivery")
  EmailDelivery emailDelivery;

  /** The ID of the CollectionSettingVersion object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.collection_setting_version}.
   */
  @SerializedName("object")
  String object;

  /**
   * The ID of the PaymentMethodConfiguration object, which controls which payment methods are
   * displayed to your customers.
   */
  @SerializedName("payment_method_configuration")
  String paymentMethodConfiguration;

  /** Payment Method specific configuration stored on the object. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** Email delivery settings. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EmailDelivery extends StripeObject {
    /**
     * Controls emails for when the payment is due. For example after the invoice is finalized and
     * transitions to Open state.
     */
    @SerializedName("payment_due")
    PaymentDue paymentDue;

    /**
     * Controls emails for when the payment is due. For example after the invoice is finalized and
     * transitions to Open state.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDue extends StripeObject {
      /** If true an email for the invoice would be generated and sent out. */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * If true the payment link to hosted invoice page would be included in email and PDF of the
       * invoice.
       */
      @SerializedName("include_payment_link")
      Boolean includePaymentLink;
    }
  }

  /** Payment Method specific configuration stored on the object. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    /**
     * This sub-hash contains details about the Canadian pre-authorized debit payment method
     * options.
     */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /** This sub-hash contains details about the Bancontact payment method. */
    @SerializedName("bancontact")
    Bancontact bancontact;

    /** This sub-hash contains details about the Card payment method options. */
    @SerializedName("card")
    Card card;

    /** This sub-hash contains details about the Bank transfer payment method options. */
    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    /** This sub-hash contains details about the Konbini payment method options. */
    @SerializedName("konbini")
    Map<String, Object> konbini;

    /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
    @SerializedName("sepa_debit")
    Map<String, Object> sepaDebit;

    /** This sub-hash contains details about the ACH direct debit payment method options. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * This sub-hash contains details about the Canadian pre-authorized debit payment method
     * options.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /** Additional fields for Mandate creation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Transaction type of the mandate.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("transaction_type")
        String transactionType;
      }
    }

    /** This sub-hash contains details about the Bancontact payment method. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       *
       * <p>One of {@code de}, {@code en}, {@code fr}, or {@code nl}.
       */
      @SerializedName("preferred_language")
      String preferredLanguage;
    }

    /** This sub-hash contains details about the Card payment method options. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** Configuration options for setting up an eMandate for cards issued in India. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Selected network to process the payment on. Depends on the available networks of the card.
       */
      @SerializedName("network")
      String network;

      /**
       * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
       * automatically prompt your customers for authentication based on risk level and <a
       * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. Read our guide on <a
       * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       *
       * <p>One of {@code any}, {@code automatic}, or {@code challenge}.
       */
      @SerializedName("request_three_d_secure")
      String requestThreeDSecure;

      /** Configuration options for setting up an eMandate for cards issued in India. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /** Amount to be charged for future payments. */
        @SerializedName("amount")
        Long amount;

        /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
        @SerializedName("amount_type")
        String amountType;

        /** A description of the mandate that is meant to be displayed to the customer. */
        @SerializedName("description")
        String description;
      }
    }

    /** This sub-hash contains details about the Bank transfer payment method options. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerBalance extends StripeObject {
      /**
       * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
       * {@code bank_transfer}.
       */
      @SerializedName("bank_transfer")
      BankTransfer bankTransfer;

      /**
       * The funding method type to be used when there are not enough funds in the customer balance.
       * Currently the only supported value is {@code bank_transfer}.
       *
       * <p>Equal to {@code bank_transfer}.
       */
      @SerializedName("funding_type")
      String fundingType;

      /**
       * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
       * {@code bank_transfer}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BankTransfer extends StripeObject {
        /**
         * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
         * {@code eu_bank_transfer}.
         */
        @SerializedName("eu_bank_transfer")
        EuBankTransfer euBankTransfer;

        /**
         * The bank transfer type that can be used for funding.
         *
         * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer},
         * {@code mx_bank_transfer}, or {@code us_bank_transfer}.
         */
        @SerializedName("type")
        String type;

        /**
         * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
         * {@code eu_bank_transfer}.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class EuBankTransfer extends StripeObject {
          /**
           * The desired country code of the bank account information.
           *
           * <p>One of {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code NL}.
           */
          @SerializedName("country")
          String country;
        }
      }
    }

    /** This sub-hash contains details about the ACH direct debit payment method options. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /** Additional fields for Financial Connections Session creation. */
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      /**
       * Verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /** Additional fields for Financial Connections Session creation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FinancialConnections extends StripeObject {
        /**
         * Provide filters for the linked accounts that the customer can select for the payment
         * method.
         */
        @SerializedName("filters")
        Filters filters;

        /**
         * The list of permissions to request. If this parameter is passed, the {@code
         * payment_method} permission must be included.
         */
        @SerializedName("permissions")
        List<String> permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<String> prefetch;

        /**
         * Provide filters for the linked accounts that the customer can select for the payment
         * method.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Filters extends StripeObject {
          /** The account subcategories to use to filter for selectable accounts. */
          @SerializedName("account_subcategories")
          List<String> accountSubcategories;
        }
      }
    }
  }
}
