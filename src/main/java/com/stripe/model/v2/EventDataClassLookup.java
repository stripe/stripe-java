// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.StripeObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 */
final class EventDataClassLookup {
  public static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();
  public static final Map<String, Class<? extends Event>> eventClassLookup = new HashMap<>();

  static {
    classLookup.put(
        "billing.meter_event_adjustment_v2",
        com.stripe.model.v2.billing.MeterEventAdjustmentV2.class);
    classLookup.put(
        "billing.meter_event_session", com.stripe.model.v2.billing.MeterEventSession.class);
    classLookup.put("billing.meter_event_v2", com.stripe.model.v2.billing.MeterEventV2.class);

    classLookup.put("event", com.stripe.model.v2.Event.class);
    classLookup.put("event_destination", com.stripe.model.v2.EventDestination.class);

    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found", com.stripe.events.V1BillingMeterNoMeterFoundEvent.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping", com.stripe.events.V2CoreEventDestinationPingEvent.class);
  }
}
