// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Billing Group combines member invoices into a consolidated invoice according to shared grouping
 * behavior.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Group extends StripeObject implements HasId {
  /**
   * The effective billing settings for the group. Returned only when {@code billing_settings} is
   * included in the request.
   */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

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

  /** The ID of the BillingGroup object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The discount rules applied to all invoices for the group's underlying cadence. Returned only
   * when {@code invoice_discount_rules} is included in the request.
   */
  @SerializedName("invoice_discount_rules")
  List<Group.InvoiceDiscountRule> invoiceDiscountRules;

  /** Whether the billing group exists in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * An internal key you can use to find a particular billing group. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object for storing additional structured
   * information.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The date when the billing group will next create a consolidated invoice. */
  @SerializedName("next_billing_date")
  Instant nextBillingDate;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.group}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current status of the billing group.
   *
   * <p>One of {@code active}, or {@code canceled}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for the billing group's status transitions. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The ID of the TestClock object associated with the billing group. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * The effective billing settings for the group. Returned only when {@code billing_settings} is
   * included in the request.
   */
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
         * If true the payment link to hosted invoice page would be included in email and PDF of the
         * invoice.
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
       * Determines if tax is calculated automatically based on a product tax code or manually based
       * on rules defined by the business.
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
         * The time at which the monthly grouping interval begins. Defaults to the time the billing
         * group was created, in UTC.
         */
        @SerializedName("time")
        Time time;

        /**
         * The time at which the monthly grouping interval begins. Defaults to the time the billing
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
       * Percent that is taken off the amount. For example, a percent_off of 50.0 reduces a 100 USD
       * amount to 50 USD.
       */
      @SerializedName("percent_off")
      BigDecimal percentOff;

      /** The maximum applications configuration for this discount. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MaximumApplications extends StripeObject {
        /** The number of times this discount can be applied when the type is {@code times}. */
        @SerializedName("times")
        Long times;

        /**
         * Max applications type of this discount, ex: indefinite.
         *
         * <p>One of {@code indefinite}, or {@code times}.
         */
        @SerializedName("type")
        String type;
      }
    }
  }

  /** Timestamps for the billing group's status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp of when the billing group became active. */
    @SerializedName("activated_at")
    Instant activatedAt;

    /** Timestamp of when the billing group was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;
  }
}
