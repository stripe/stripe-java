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
        "v2.core.account.closed", com.stripe.events.V2CoreAccountClosedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account.created", com.stripe.events.V2CoreAccountCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account.updated", com.stripe.events.V2CoreAccountUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[defaults].updated",
        com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[future_requirements].updated",
        com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[identity].updated",
        com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[requirements].updated",
        com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_link.returned",
        com.stripe.events.V2CoreAccountLinkReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.created",
        com.stripe.events.V2CoreAccountPersonCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.deleted",
        com.stripe.events.V2CoreAccountPersonDeletedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.updated",
        com.stripe.events.V2CoreAccountPersonUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping",
        com.stripe.events.V2CoreEventDestinationPingEventNotification.class);
  }
}
