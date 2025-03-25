// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.StripeObject;
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

    classLookup.put("v2.core.event", com.stripe.model.v2.Event.class);
    classLookup.put("v2.core.event_destination", com.stripe.model.v2.EventDestination.class);

    classLookup.put(
        "v2.core.vault.gb_bank_account", com.stripe.model.v2.core.vault.GbBankAccount.class);
    classLookup.put(
        "v2.core.vault.us_bank_account", com.stripe.model.v2.core.vault.UsBankAccount.class);

    classLookup.put(
        "v2.money_management.outbound_setup_intent",
        com.stripe.model.v2.moneymanagement.OutboundSetupIntent.class);
    classLookup.put(
        "v2.money_management.payout_method",
        com.stripe.model.v2.moneymanagement.PayoutMethod.class);
    classLookup.put(
        "v2.money_management.payout_methods_bank_account_spec",
        com.stripe.model.v2.moneymanagement.PayoutMethodsBankAccountSpec.class);

    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found", com.stripe.events.V1BillingMeterNoMeterFoundEvent.class);
  }
}
