// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.Event;
import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 *
 * <p>For internal use by Stripe SDK only.
 */
public final class EventDataClassLookup {
  public static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();
  public static final Map<String, Class<? extends Event>> eventClassLookup = new HashMap<>();

  static {
    classLookup.put("billing.meter", com.stripe.model.billing.Meter.class);

    classLookup.put("v2.billing.meter_event", com.stripe.model.v2.billing.MeterEvent.class);
    classLookup.put(
        "v2.billing.meter_event_adjustment",
        com.stripe.model.v2.billing.MeterEventAdjustment.class);
    classLookup.put(
        "v2.billing.meter_event_session", com.stripe.model.v2.billing.MeterEventSession.class);

    classLookup.put("v2.core.account", com.stripe.model.v2.core.Account.class);
    classLookup.put("v2.core.account_link", com.stripe.model.v2.core.AccountLink.class);
    classLookup.put("v2.core.account_person", com.stripe.model.v2.core.AccountPerson.class);
    classLookup.put(
        "v2.core.account_person_token", com.stripe.model.v2.core.AccountPersonToken.class);
    classLookup.put("v2.core.account_token", com.stripe.model.v2.core.AccountToken.class);
    classLookup.put("v2.core.event", com.stripe.model.v2.core.Event.class);
    classLookup.put("v2.core.event_destination", com.stripe.model.v2.core.EventDestination.class);

    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found", com.stripe.events.V1BillingMeterNoMeterFoundEvent.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping", com.stripe.events.V2CoreEventDestinationPingEvent.class);
  }
}
