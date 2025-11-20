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
public class Cadence extends StripeObject implements HasId {
  /** The billing cycle is the object that defines future billing cycle dates. */
  @SerializedName("billing_cycle")
  BillingCycle billingCycle;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The discount rules applied to all invoices for the cadence. */
  @SerializedName("invoice_discount_rules")
  List<Cadence.InvoiceDiscountRule> invoiceDiscountRules;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * A lookup key used to retrieve cadences dynamically from a static string. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The date that the billing cadence will next bill. Null if the cadence is not active. */
  @SerializedName("next_billing_date")
  Instant nextBillingDate;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.cadence}.
   */
  @SerializedName("object")
  String object;

  /** The payer determines the entity financially responsible for the bill. */
  @SerializedName("payer")
  Payer payer;

  /** The settings associated with the cadence. */
  @SerializedName("settings")
  Settings settings;

  /** Settings data that contains expanded billing settings configuration with actual values. */
  @SerializedName("settings_data")
  SettingsData settingsData;

  /**
   * The current status of the cadence.
   *
   * <p>One of {@code active}, or {@code canceled}.
   */
  @SerializedName("status")
  String status;

  /** The ID of the Test Clock. */
  @SerializedName("test_clock")
  String testClock;

  /** The billing cycle is the object that defines future billing cycle dates. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingCycle extends StripeObject {
    /** Specific configuration for determining billing dates when type=day. */
    @SerializedName("day")
    Day day;

    /**
     * The number of intervals (specified in the interval attribute) between cadence billings. For
     * example, type=month and interval_count=3 bills every 3 months.
     */
    @SerializedName("interval_count")
    Long intervalCount;

    /** Specific configuration for determining billing dates when type=month. */
    @SerializedName("month")
    Month month;

    /**
     * The frequency at which a cadence bills.
     *
     * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
     */
    @SerializedName("type")
    String type;

    /** Specific configuration for determining billing dates when type=week. */
    @SerializedName("week")
    Week week;

    /** Specific configuration for determining billing dates when type=year. */
    @SerializedName("year")
    Year year;

    /** Specific configuration for determining billing dates when type=day. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Day extends StripeObject {
      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /** The time at which the billing cycle ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Long hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Long minute;

        /**
         * The second at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("second")
        Long second;
      }
    }

    /** Specific configuration for determining billing dates when type=month. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Month extends StripeObject {
      /**
       * The day to anchor the billing on for a type=&quot;month&quot; billing cycle from 1-31. If
       * this number is greater than the number of days in the month being billed, this will anchor
       * to the last day of the month.
       */
      @SerializedName("day_of_month")
      Long dayOfMonth;

      /**
       * The month to anchor the billing on for a type=&quot;month&quot; billing cycle from 1-12.
       * Occurrences are calculated from the month anchor.
       */
      @SerializedName("month_of_year")
      Long monthOfYear;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /** The time at which the billing cycle ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Long hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Long minute;

        /**
         * The second at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("second")
        Long second;
      }
    }

    /** Specific configuration for determining billing dates when type=week. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Week extends StripeObject {
      /**
       * The day of the week to bill the type=week billing cycle on. Numbered from 1-7 for Monday to
       * Sunday respectively, based on the ISO-8601 week day numbering.
       */
      @SerializedName("day_of_week")
      Long dayOfWeek;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /** The time at which the billing cycle ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Long hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Long minute;

        /**
         * The second at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("second")
        Long second;
      }
    }

    /** Specific configuration for determining billing dates when type=year. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Year extends StripeObject {
      /**
       * The day to anchor the billing on for a type=&quot;month&quot; billing cycle from 1-31. If
       * this number is greater than the number of days in the month being billed, this will anchor
       * to the last day of the month.
       */
      @SerializedName("day_of_month")
      Long dayOfMonth;

      /**
       * The month to bill on from 1-12. If not provided, this will default to the month the cadence
       * was created.
       */
      @SerializedName("month_of_year")
      Long monthOfYear;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /** The time at which the billing cycle ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Long hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Long minute;

        /**
         * The second at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("second")
        Long second;
      }
    }
  }

  /**
   * For more details about InvoiceDiscountRule, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceDiscountRule extends StripeObject implements HasId {
    /** Unique identifier for the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Details if the discount is a percentage off. */
    @SerializedName("percent_off")
    PercentOff percentOff;

    /**
     * The type of the discount.
     *
     * <p>Equal to {@code percent_off}.
     */
    @SerializedName("type")
    String type;

    /** Details if the discount is a percentage off. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PercentOff extends StripeObject {
      /** The maximum applications configuration for this discount. */
      @SerializedName("maximum_applications")
      MaximumApplications maximumApplications;

      /**
       * Percent that will be taken off of the amount. For example, percent_off of 50.0 will make
       * $100 amount $50 instead.
       */
      @SerializedName("percent_off")
      String percentOff;

      /** The maximum applications configuration for this discount. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MaximumApplications extends StripeObject {
        /**
         * Max applications type of this discount, ex: indefinite.
         *
         * <p>Equal to {@code indefinite}.
         */
        @SerializedName("type")
        String type;
      }
    }
  }

  /** The payer determines the entity financially responsible for the bill. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer extends StripeObject {
    /** The ID of the Billing Profile object which determines how a bill will be paid. */
    @SerializedName("billing_profile")
    String billingProfile;

    /** The ID of the Customer object. */
    @SerializedName("customer")
    String customer;

    /**
     * A string identifying the type of the payer. Currently the only supported value is {@code
     * customer}.
     *
     * <p>Equal to {@code customer}.
     */
    @SerializedName("type")
    String type;
  }

  /** The settings associated with the cadence. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    /**
     * Settings that configure bills generation, which includes calculating totals, tax, and
     * presenting invoices.
     */
    @SerializedName("bill")
    Bill bill;

    /** Settings that configure and manage the behavior of collecting payments. */
    @SerializedName("collection")
    Collection collection;

    /**
     * Settings that configure bills generation, which includes calculating totals, tax, and
     * presenting invoices.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bill extends StripeObject implements HasId {
      /** The ID of the referenced settings object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** Returns the Settings Version when the cadence is pinned to a specific version. */
      @SerializedName("version")
      String version;
    }

    /** Settings that configure and manage the behavior of collecting payments. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Collection extends StripeObject implements HasId {
      /** The ID of the referenced settings object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** Returns the Settings Version when the cadence is pinned to a specific version. */
      @SerializedName("version")
      String version;
    }
  }

  /** Settings data that contains expanded billing settings configuration with actual values. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SettingsData extends StripeObject {
    /** Expanded bill settings data with actual configuration values. */
    @SerializedName("bill")
    Bill bill;

    /** Expanded collection settings data with actual configuration values. */
    @SerializedName("collection")
    Collection collection;

    /** Expanded bill settings data with actual configuration values. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bill extends StripeObject {
      /** Settings related to calculating a bill. */
      @SerializedName("calculation")
      Calculation calculation;

      /** Settings related to invoice behavior. */
      @SerializedName("invoice")
      Invoice invoice;

      /** The ID of the invoice rendering template to be used when generating invoices. */
      @SerializedName("invoice_rendering_template")
      String invoiceRenderingTemplate;

      /** Settings related to calculating a bill. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Calculation extends StripeObject {
        /** Settings for calculating tax. */
        @SerializedName("tax")
        Tax tax;

        /** Settings for calculating tax. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax extends StripeObject {
          /**
           * Determines if tax will be calculated automatically based on a PTC or manually based on
           * rules defined by the merchant. Defaults to &quot;manual&quot;.
           *
           * <p>One of {@code automatic}, or {@code manual}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** Settings related to invoice behavior. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Invoice extends StripeObject {
        /** The amount of time until the invoice will be overdue for payment. */
        @SerializedName("time_until_due")
        TimeUntilDue timeUntilDue;

        /** The amount of time until the invoice will be overdue for payment. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class TimeUntilDue extends StripeObject {
          /**
           * The interval unit for the time until due.
           *
           * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
           */
          @SerializedName("interval")
          String interval;

          /**
           * The number of interval units. For example, if interval=day and interval_count=30, the
           * invoice will be due in 30 days.
           */
          @SerializedName("interval_count")
          Long intervalCount;
        }
      }
    }

    /** Expanded collection settings data with actual configuration values. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Collection extends StripeObject {
      /**
       * Either automatic, or send_invoice. When charging automatically, Stripe will attempt to pay
       * this bill at the end of the period using the payment method attached to the payer profile.
       * When sending an invoice, Stripe will email your payer profile an invoice with payment
       * instructions. Defaults to automatic.
       *
       * <p>One of {@code automatic}, or {@code send_invoice}.
       */
      @SerializedName("collection_method")
      String collectionMethod;

      /** Email delivery settings. */
      @SerializedName("email_delivery")
      EmailDelivery emailDelivery;

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
         * Controls emails for when the payment is due. For example after the invoice is finalized
         * and transitions to Open state.
         */
        @SerializedName("payment_due")
        PaymentDue paymentDue;

        /**
         * Controls emails for when the payment is due. For example after the invoice is finalized
         * and transitions to Open state.
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PaymentDue extends StripeObject {
          /** If true an email for the invoice would be generated and sent out. */
          @SerializedName("enabled")
          Boolean enabled;

          /**
           * If true the payment link to hosted invoice page would be included in email and PDF of
           * the invoice.
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
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
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
           * Selected network to process the payment on. Depends on the available networks of the
           * card.
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
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Currently the only supported value is {@code bank_transfer}.
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
             * <p>One of {@code eu_bank_transfer}, {@code gb_bank_transfer}, {@code
             * jp_bank_transfer}, {@code mx_bank_transfer}, or {@code us_bank_transfer}.
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
               * <p>One of {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code
               * NL}.
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
  }
}
