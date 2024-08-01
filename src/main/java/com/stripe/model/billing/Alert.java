// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing alert is a resource that notifies you when a certain usage threshold on a meter is
 * crossed. For example, you might create a billing alert to notify you when a certain user made 100
 * API requests.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Alert extends StripeObject implements HasId {
  /**
   * Defines the type of the alert.
   *
   * <p>Equal to {@code usage_threshold}.
   */
  @SerializedName("alert_type")
  String alertType;

  /**
   * Limits the scope of the alert to a specific <a
   * href="https://stripe.com/docs/api/customers">customer</a>.
   */
  @SerializedName("filter")
  Filter filter;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the alert. This can be active, inactive or archived.
   *
   * <p>One of {@code active}, {@code archived}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** Title of the alert. */
  @SerializedName("title")
  String title;

  /**
   * Encapsulates configuration of the alert to monitor usage on a specific <a
   * href="https://stripe.com/docs/api/billing/meter">Billing Meter</a>.
   */
  @SerializedName("usage_threshold_config")
  UsageThresholdConfig usageThresholdConfig;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Filter extends StripeObject {
    /** Limit the scope of the alert to this customer ID. */
    @SerializedName("customer")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Customer> customer;

    /** Get ID of expandable {@code customer} object. */
    public String getCustomer() {
      return (this.customer != null) ? this.customer.getId() : null;
    }

    public void setCustomer(String id) {
      this.customer = ApiResource.setExpandableFieldId(id, this.customer);
    }

    /** Get expanded {@code customer}. */
    public Customer getCustomerObject() {
      return (this.customer != null) ? this.customer.getExpanded() : null;
    }

    public void setCustomerObject(Customer expandableObject) {
      this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * The usage threshold alert configuration enables setting up alerts for when a certain usage
   * threshold on a specific meter is crossed.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageThresholdConfig extends StripeObject {
    /** The value at which this alert will trigger. */
    @SerializedName("gte")
    Long gte;

    /**
     * The <a href="https://stripe.com/api/billing/meter">Billing Meter</a> ID whose usage is
     * monitored.
     */
    @SerializedName("meter")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Meter> meter;

    /**
     * Defines how the alert will behave.
     *
     * <p>Equal to {@code one_time}.
     */
    @SerializedName("recurrence")
    String recurrence;

    /** Get ID of expandable {@code meter} object. */
    public String getMeter() {
      return (this.meter != null) ? this.meter.getId() : null;
    }

    public void setMeter(String id) {
      this.meter = ApiResource.setExpandableFieldId(id, this.meter);
    }

    /** Get expanded {@code meter}. */
    public Meter getMeterObject() {
      return (this.meter != null) ? this.meter.getExpanded() : null;
    }

    public void setMeterObject(Meter expandableObject) {
      this.meter = new ExpandableField<Meter>(expandableObject.getId(), expandableObject);
    }
  }
}
