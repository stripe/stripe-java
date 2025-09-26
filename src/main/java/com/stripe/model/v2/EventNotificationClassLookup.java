// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.v2.core.EventNotification;
import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 *
 * <p>For internal use by Stripe SDK only.
 */
public final class EventNotificationClassLookup {
  public static final Map<String, Class<? extends EventNotification>> eventClassLookup =
      new HashMap<>();

  static {
    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found",
        com.stripe.events.V1BillingMeterNoMeterFoundEventNotification.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping",
        com.stripe.events.V2CoreEventDestinationPingEventNotification.class);
  }
}
