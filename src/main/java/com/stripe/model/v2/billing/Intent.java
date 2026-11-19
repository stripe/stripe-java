// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Billing Intent represents a proposed change to a customer's billing configuration, such as
 * subscribing to a new service, modifying an existing subscription, or canceling service. Intents
 * follow a draft-reserve-commit workflow where they can be previewed before committing, allowing
 * you to see the billing impact before changes take effect.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Intent extends StripeObject implements HasId {
  /** Breakdown of the amount for this Billing Intent. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** ID of an existing Billing Group to use. */
  @SerializedName("billing_group")
  String billingGroup;

  /** Data for creating a new Billing Group. */
  @SerializedName("billing_group_data")
  BillingGroupData billingGroupData;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Three-letter ISO currency code, in lowercase. Must be a supported currency. */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
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
   * <p>Equal to {@code v2.billing.intent}.
   */
  @SerializedName("object")
  String object;

  /**
   * Current status of the Billing Intent.
   *
   * <p>One of {@code canceled}, {@code committed}, {@code draft}, or {@code reserved}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for status transitions of the Billing Intent. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Breakdown of the amount for this Billing Intent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** The outstanding amount after discount, tax, and customer balance application. */
    @SerializedName("amount_due")
    String amountDue;

    /** Three-letter ISO currency code, in lowercase. Must be a supported currency. */
    @SerializedName("currency")
    String currency;

    /** The customer's account balance applied to the amount. */
    @SerializedName("customer_balance_applied")
    String customerBalanceApplied;

    /** Amount of discount applied. */
    @SerializedName("discount")
    String discount;

    /** Amount of shipping charges. */
    @SerializedName("shipping")
    String shipping;

    /** Subtotal amount before tax and discounts. */
    @SerializedName("subtotal")
    String subtotal;

    /** Amount of tax. */
    @SerializedName("tax")
    String tax;

    /** Total amount for the Billing Intent. */
    @SerializedName("total")
    String total;
  }

  /** Data for creating a new Billing Group. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingGroupData extends StripeObject {
    /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
    @SerializedName("billing_settings")
    BillingSettings billingSettings;

    /** The ID of the Customer object whose invoices are grouped. */
    @SerializedName("customer")
    String customer;

    /**
     * The ID of the PaymentMethod object used by default. If unset, the customer's default payment
     * method is used.
     */
    @SerializedName("default_payment_method")
    String defaultPaymentMethod;

    /** The strategy used to group member invoices. */
    @SerializedName("grouping_behavior")
    GroupingBehavior groupingBehavior;

    /**
     * An internal key you can use to find a particular billing group. Maximum length of 200
     * characters.
     */
    @SerializedName("lookup_key")
    String lookupKey;

    /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingSettings extends StripeObject {
      /**
       * How Stripe collects payment.
       *
       * <p>One of {@code charge_automatically}, or {@code send_invoice}.
       */
      @SerializedName("collection_method")
      String collectionMethod;

      /** Email delivery setting. */
      @SerializedName("email_delivery")
      EmailDelivery emailDelivery;

      /** Settings for invoice presentation. */
      @SerializedName("invoice_presentation")
      InvoicePresentation invoicePresentation;

      /** The amount of time until the invoice is overdue for payment. */
      @SerializedName("invoice_time_until_due")
      InvoiceTimeUntilDue invoiceTimeUntilDue;

      /**
       * The ID of the payment method configuration, which controls which payment methods are
       * displayed to your customers.
       */
      @SerializedName("payment_method_configuration")
      String paymentMethodConfiguration;

      /** Payment Method specific configuration to be stored on the object. */
      @SerializedName("payment_method_options")
      PaymentMethodOptions paymentMethodOptions;

      /** Settings for calculating tax. */
      @SerializedName("tax")
      Tax tax;

      /** Email delivery setting. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EmailDelivery extends StripeObject {
        /** Controls emails for when the payment is due. */
        @SerializedName("payment_due")
        PaymentDue paymentDue;

        /** Controls emails for when the payment is due. */
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

      /** Settings for invoice presentation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class InvoicePresentation extends StripeObject {
        /** The ID of the invoice rendering template to be used when generating invoices. */
        @SerializedName("invoice_rendering_template")
        String invoiceRenderingTemplate;
      }

      /** The amount of time until the invoice is overdue for payment. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class InvoiceTimeUntilDue extends StripeObject {
        /**
         * The interval unit for the time until due.
         *
         * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The number of interval units. For example, if interval=day and interval_count=30, the
         * invoice is due in 30 days.
         */
        @SerializedName("interval_count")
        Long intervalCount;
      }

      /** Payment Method specific configuration to be stored on the object. */
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
        Konbini konbini;

        /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
        @SerializedName("sepa_debit")
        SepaDebit sepaDebit;

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
            @JsonAdapter(StringInt64TypeAdapter.class)
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

        /** This sub-hash contains details about the Konbini payment method options. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Konbini extends StripeObject {}

        /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaDebit extends StripeObject {}

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

      /** Settings for calculating tax. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /**
         * Determines if tax is calculated automatically based on a product tax code or manually
         * based on rules defined by the business.
         *
         * <p>One of {@code automatic}, or {@code manual}.
         */
        @SerializedName("type")
        String type;
      }
    }

    /** The strategy used to group member invoices. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GroupingBehavior extends StripeObject {
      /** The cadence configuration when type is {@code by_cadence}. */
      @SerializedName("by_cadence")
      ByCadence byCadence;

      /**
       * The grouping strategy.
       *
       * <p>Equal to {@code by_cadence}.
       */
      @SerializedName("type")
      String type;

      /** The cadence configuration when type is {@code by_cadence}. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ByCadence extends StripeObject {
        /** Timestamp that anchors the recurring grouping cadence. */
        @SerializedName("billing_cycle_anchor")
        Instant billingCycleAnchor;

        /** Daily cadence details. */
        @SerializedName("day")
        Day day;

        /** The number of interval units between groups. */
        @SerializedName("interval_count")
        Long intervalCount;

        /** Monthly cadence details. */
        @SerializedName("month")
        Month month;

        /**
         * The interval unit for the cadence.
         *
         * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
         */
        @SerializedName("type")
        String type;

        /** Weekly cadence details. */
        @SerializedName("week")
        Week week;

        /** Yearly cadence details. */
        @SerializedName("year")
        Year year;

        /** Daily cadence details. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Day extends StripeObject {
          /** The time at which the daily grouping interval begins. */
          @SerializedName("time")
          Time time;

          /** The time at which the daily grouping interval begins. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Time extends StripeObject {
            /** The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** The second, from 0 through 59. Defaults to 0. */
            @SerializedName("second")
            Long second;
          }
        }

        /** Monthly cadence details. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Month extends StripeObject {
          /**
           * The day of month, from 1 through 31. For shorter months, the cadence anchors to the
           * month's last day.
           */
          @SerializedName("day_of_month")
          Long dayOfMonth;

          /** The month of year, from 1 through 12, from which occurrences are calculated. */
          @SerializedName("month_of_year")
          Long monthOfYear;

          /**
           * The time at which the monthly grouping interval begins. Defaults to the time the
           * billing group was created, in UTC.
           */
          @SerializedName("time")
          Time time;

          /**
           * The time at which the monthly grouping interval begins. Defaults to the time the
           * billing group was created, in UTC.
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Time extends StripeObject {
            /** The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** The second, from 0 through 59. Defaults to 0. */
            @SerializedName("second")
            Long second;
          }
        }

        /** Weekly cadence details. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Week extends StripeObject {
          /** The ISO-8601 day of week, from 1 for Monday through 7 for Sunday. */
          @SerializedName("day_of_week")
          Long dayOfWeek;

          /** The time at which the weekly grouping interval begins. */
          @SerializedName("time")
          Time time;

          /** The time at which the weekly grouping interval begins. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Time extends StripeObject {
            /** The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** The second, from 0 through 59. Defaults to 0. */
            @SerializedName("second")
            Long second;
          }
        }

        /** Yearly cadence details. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Year extends StripeObject {
          /**
           * The day of month, from 1 through 31. For shorter months, the cadence anchors to the
           * month's last day.
           */
          @SerializedName("day_of_month")
          Long dayOfMonth;

          /** The month of year, from 1 through 12. */
          @SerializedName("month_of_year")
          Long monthOfYear;

          /**
           * The time at which the yearly grouping interval begins. Defaults to the time the billing
           * group was created, in UTC.
           */
          @SerializedName("time")
          Time time;

          /**
           * The time at which the yearly grouping interval begins. Defaults to the time the billing
           * group was created, in UTC.
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Time extends StripeObject {
            /** The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** The second, from 0 through 59. Defaults to 0. */
            @SerializedName("second")
            Long second;
          }
        }
      }
    }
  }

  /** Timestamps for status transitions of the Billing Intent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Time at which the Billing Intent was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** Time at which the Billing Intent was committed. */
    @SerializedName("committed_at")
    Instant committedAt;

    /** Time at which the Billing Intent was drafted. */
    @SerializedName("drafted_at")
    Instant draftedAt;

    /** Time at which the Billing Intent expires. */
    @SerializedName("expires_at")
    Instant expiresAt;

    /** Time at which the Billing Intent was reserved. */
    @SerializedName("reserved_at")
    Instant reservedAt;
  }
}
