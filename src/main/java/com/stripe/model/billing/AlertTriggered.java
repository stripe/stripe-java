// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlertTriggered extends StripeObject {
  /** The aggregation period for which this alert triggered. */
  @SerializedName("aggregation_period")
  AggregationPeriod aggregationPeriod;

  /**
   * A billing alert is a resource that notifies you when a certain usage threshold on a meter is
   * crossed. For example, you might create a billing alert to notify you when a certain user made
   * 100 API requests.
   */
  @SerializedName("alert")
  Alert alert;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Currency for the threshold value. */
  @SerializedName("currency")
  String currency;

  /** Custom pricing unit for the threshold value. */
  @SerializedName("custom_pricing_unit")
  String customPricingUnit;

  /** ID of customer for which the alert triggered. */
  @SerializedName("customer")
  String customer;

  /** External customer ID for the customer for which the alert triggered. */
  @SerializedName("external_customer_id")
  String externalCustomerId;

  /**
   * Populated specifically for spend alerts to notify merchants which group_by entity has the
   * exceeded spend.
   */
  @SerializedName("group_by")
  GroupBy groupBy;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert_triggered}.
   */
  @SerializedName("object")
  String object;

  /** Timestamp at which the threshold was crossed. */
  @SerializedName("triggered_at")
  Long triggeredAt;

  /** The value triggering the alert. */
  @SerializedName("value")
  BigDecimal value;

  /**
   * For more details about AggregationPeriod, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AggregationPeriod extends StripeObject {
    /** End time of the aggregation period. */
    @SerializedName("ends_at")
    Long endsAt;

    /** Start time of the aggregation period. */
    @SerializedName("starts_at")
    Long startsAt;
  }

  /**
   * For more details about GroupBy, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GroupBy extends StripeObject {
    /** The billing cadence ID, populated when type is {@code billing_cadence}. */
    @SerializedName("billing_cadence")
    String billingCadence;

    /**
     * The pricing plan subscription ID, populated when type is {@code pricing_plan_subscription}.
     */
    @SerializedName("pricing_plan_subscription")
    String pricingPlanSubscription;

    /**
     * The type of grouping used for this alert notification
     *
     * <p>One of {@code billing_cadence}, or {@code pricing_plan_subscription}.
     */
    @SerializedName("type")
    String type;
  }
}
