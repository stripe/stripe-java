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
        "v2.core.account.closed", com.stripe.events.V2CoreAccountClosedEvent.class);
    eventClassLookup.put(
        "v2.core.account.created", com.stripe.events.V2CoreAccountCreatedEvent.class);
    eventClassLookup.put(
        "v2.core.account.updated", com.stripe.events.V2CoreAccountUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[defaults].updated",
        com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[future_requirements].updated",
        com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[identity].updated",
        com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[requirements].updated",
        com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account_link.returned", com.stripe.events.V2CoreAccountLinkReturnedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.created", com.stripe.events.V2CoreAccountPersonCreatedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.deleted", com.stripe.events.V2CoreAccountPersonDeletedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.updated", com.stripe.events.V2CoreAccountPersonUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping", com.stripe.events.V2CoreEventDestinationPingEvent.class);
  }
}
