// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * BillSetting is responsible for settings which dictate generating bills, which include settings
 * for calculating totals on bills, tax on bill items, as well as how to generate and present
 * invoices.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BillSetting extends StripeObject implements HasId {
  /** Settings related to calculating a bill. */
  @SerializedName("calculation")
  Calculation calculation;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** An optional field for adding a display name for the BillSetting object. */
  @SerializedName("display_name")
  String displayName;

  /** The ID of the BillSetting object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Settings related to invoice behavior. */
  @SerializedName("invoice")
  Invoice invoice;

  /** The ID of the invoice rendering template to be used when generating invoices. */
  @SerializedName("invoice_rendering_template")
  String invoiceRenderingTemplate;

  /**
   * The latest version of the current settings object. This will be Updated every time an attribute
   * of the settings is updated.
   */
  @SerializedName("latest_version")
  String latestVersion;

  /**
   * The current live version of the settings object. This can be different from latest_version if
   * settings are updated without setting live_version='latest'.
   */
  @SerializedName("live_version")
  String liveVersion;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * A lookup key used to retrieve settings dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.bill_setting}.
   */
  @SerializedName("object")
  String object;

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
