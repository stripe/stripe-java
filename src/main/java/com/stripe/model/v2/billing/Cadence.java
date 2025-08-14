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

  /** The ID of the billing Cadence object. */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
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

  /**
   * The current status of the cadence.
   *
   * <p>One of {@code active}, or {@code canceled}.
   */
  @SerializedName("status")
  String status;

  /** The ID of the TestClock. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * For more details about BillingCycle, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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
    Integer intervalCount;

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

    /**
     * For more details about Day, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Day extends StripeObject {
      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /**
       * For more details about Time, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Integer minute;
      }
    }

    /**
     * For more details about Month, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
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
      Integer dayOfMonth;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /**
       * For more details about Time, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Integer minute;
      }
    }

    /**
     * For more details about Week, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Week extends StripeObject {
      /**
       * The day of the week to bill the type=week billing cycle on. Numbered from 1-7 for Monday to
       * Sunday respectively, based on the ISO-8601 week day numbering.
       */
      @SerializedName("day_of_week")
      Integer dayOfWeek;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /**
       * For more details about Time, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Integer minute;
      }
    }

    /**
     * For more details about Year, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
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
      Integer dayOfMonth;

      /**
       * The month to bill on from 1-12. If not provided, this will default to the month the cadence
       * was created.
       */
      @SerializedName("month_of_year")
      Integer monthOfYear;

      /** The time at which the billing cycle ends. */
      @SerializedName("time")
      Time time;

      /**
       * For more details about Time, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Time extends StripeObject {
        /**
         * The hour at which the billing cycle ends. This must be an integer between 0 and 23,
         * inclusive. 0 represents midnight, and 23 represents 11 PM.
         */
        @SerializedName("hour")
        Integer hour;

        /**
         * The minute at which the billing cycle ends. Must be an integer between 0 and 59,
         * inclusive.
         */
        @SerializedName("minute")
        Integer minute;
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
    /** The ID of the inline discount applied to the cadence. */
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

    /**
     * For more details about PercentOff, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
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

      /**
       * For more details about MaximumApplications, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
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

  /**
   * For more details about Payer, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
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

  /**
   * For more details about Settings, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
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
     * For more details about Bill, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bill extends StripeObject implements HasId {
      /** The ID of the referenced Settings object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** Returns the Settings Version when the cadence is pinned to a specific version. */
      @SerializedName("version")
      String version;
    }

    /**
     * For more details about Collection, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Collection extends StripeObject implements HasId {
      /** The ID of the referenced Settings object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** Returns the Settings Version when the cadence is pinned to a specific version. */
      @SerializedName("version")
      String version;
    }
  }
}
