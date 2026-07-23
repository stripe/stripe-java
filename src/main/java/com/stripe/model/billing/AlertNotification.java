// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.billing.AlertNotificationListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlertNotification extends ApiResource implements HasId {
  /**
   * Whether the alert was triggered or recovered.
   *
   * <p>One of {@code recovered}, or {@code triggered}.
   */
  @SerializedName("action")
  String action;

  /**
   * End of the aggregation period for which this notification was sent. Only present for usage
   * threshold alerts.
   */
  @SerializedName("aggregation_period_end")
  Long aggregationPeriodEnd;

  /**
   * Start of the aggregation period for which this notification was sent. Only present for usage
   * threshold alerts.
   */
  @SerializedName("aggregation_period_start")
  Long aggregationPeriodStart;

  /** ID of the billing alert that generated this notification. */
  @SerializedName("alert")
  String alert;

  /**
   * The type of billing alert that generated this notification.
   *
   * <p>One of {@code credit_balance_threshold}, {@code spend_threshold}, or {@code
   * usage_threshold}.
   */
  @SerializedName("alert_type")
  String alertType;

  /**
   * The billing cadence associated with this notification. Only present for spend threshold alerts
   * grouped by billing cadence.
   */
  @SerializedName("cadence")
  String cadence;

  /**
   * Three-letter ISO currency code for the value, in lowercase. Only present for spend and credit
   * balance threshold alerts.
   */
  @SerializedName("currency")
  String currency;

  /** Custom pricing unit for the threshold value. */
  @SerializedName("custom_pricing_unit")
  String customPricingUnit;

  /** ID of the customer for which the alert notification was sent. */
  @SerializedName("customer")
  String customer;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * ID of the billing meter associated with this notification. Only present for usage threshold
   * alerts.
   */
  @SerializedName("meter")
  String meter;

  /**
   * ID of the event delivered for this notification. Retrievable via the Events API for a limited
   * time; for long-term audit scenarios, capture the full event payload at webhook delivery time.
   */
  @SerializedName("notification_event")
  String notificationEvent;

  /** Time at which the notification was sent. Measured in seconds since the Unix epoch. */
  @SerializedName("notified_at")
  Long notifiedAt;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert_notification}.
   */
  @SerializedName("object")
  String object;

  /**
   * ID of the subscription associated with this notification. Only present for spend threshold
   * alerts grouped by subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * The value that triggered the alert. This may be a decimal string for custom pricing unit
   * alerts. For usage threshold alerts, this is the meter event count. For credit balance and spend
   * threshold alerts, this is the amount in the smallest currency unit.
   */
  @SerializedName("value")
  String value;

  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public static AlertNotificationCollection list(String id, Map<String, Object> params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public static AlertNotificationCollection list(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/notifications", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AlertNotificationCollection.class);
  }

  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public static AlertNotificationCollection list(String id, AlertNotificationListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists sent billing alert triggered and recovered notifications for a billing alert. */
  public static AlertNotificationCollection list(
      String id, AlertNotificationListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/notifications", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AlertNotificationCollection.class);
  }
}
