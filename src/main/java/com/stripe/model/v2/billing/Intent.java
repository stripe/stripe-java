// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Intent extends StripeObject implements HasId {
  /** Breakdown of the amount for this Billing Intent. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** ID of an existing Cadence to use. */
  @SerializedName("cadence")
  String cadence;

  /** Data for creating a new Cadence. */
  @SerializedName("cadence_data")
  CadenceData cadenceData;

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
    /** Three-letter ISO currency code, in lowercase. Must be a supported currency. */
    @SerializedName("currency")
    String currency;

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

  /** Data for creating a new Cadence. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CadenceData extends StripeObject {
    /** The billing cycle configuration for this Cadence. */
    @SerializedName("billing_cycle")
    BillingCycle billingCycle;

    /** Information about the payer for this Cadence. */
    @SerializedName("payer")
    Payer payer;

    /** Settings for creating the Cadence. */
    @SerializedName("settings")
    Settings settings;

    /** The billing cycle configuration for this Cadence. */
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
         * this number is greater than the number of days in the month being billed, this will
         * anchor to the last day of the month.
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
         * The day of the week to bill the type=week billing cycle on. Numbered from 1-7 for Monday
         * to Sunday respectively, based on the ISO-8601 week day numbering.
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
         * this number is greater than the number of days in the month being billed, this will
         * anchor to the last day of the month.
         */
        @SerializedName("day_of_month")
        Long dayOfMonth;

        /**
         * The month to bill on from 1-12. If not provided, this will default to the month the
         * cadence was created.
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

    /** Information about the payer for this Cadence. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payer extends StripeObject {
      /** The ID of the Billing Profile object which determines how a bill will be paid. */
      @SerializedName("billing_profile")
      String billingProfile;

      /** Data for creating a new profile. */
      @SerializedName("billing_profile_data")
      BillingProfileData billingProfileData;

      /** Data for creating a new profile. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillingProfileData extends StripeObject {
        /** The customer to associate with the profile. */
        @SerializedName("customer")
        String customer;

        /**
         * The default payment method to use when billing this profile. If none is provided, the
         * customer {@code default_payment_method} will be used.
         */
        @SerializedName("default_payment_method")
        String defaultPaymentMethod;
      }
    }

    /** Settings for creating the Cadence. */
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

    /** Time at which the Billing Intent was reserved. */
    @SerializedName("reserved_at")
    Instant reservedAt;
  }
}
