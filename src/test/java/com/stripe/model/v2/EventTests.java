package com.stripe.model.v2;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEvent;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EventTests extends BaseStripeTest {
  public static String v2PayloadNoData = null;
  public static String v2PayloadWithData = null;
  public static String v2UnknownEventPayload = null;

  @BeforeEach
  public void setUpFixtures() {
    v2PayloadNoData =
        "{\n"
            + "  \"id\": \"evt_234\",\n"
            + "  \"object\": \"event\",\n"
            + "  \"type\": \"v1.billing.meter.error_report_triggered\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"meter_123\",\n"
            + "    \"type\": \"billing.meter\",\n"
            + "    \"url\": \"/v1/billing/meters/meter_123\",\n"
            + "    \"stripe_context\": \"acct_123\"\n"
            + "  }\n"
            + "}";
    v2PayloadWithData =
        "{\n"
            + "  \"id\": \"evt_234\",\n"
            + "  \"object\": \"event\",\n"
            + "  \"type\": \"v1.billing.meter.error_report_triggered\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"meter_123\",\n"
            + "    \"type\": \"billing.meter\",\n"
            + "    \"url\": \"/v1/billing/meters/meter_123\",\n"
            + "    \"stripe_context\": \"acct_123\"\n"
            + "  },\n"
            + "  \"data\": {\n"
            + "    \"developer_message_summary\": \"foo\"\n"
            + "  }\n"
            + "}";

    // note this is purposefully not correct; don't try and correct it!
    v2UnknownEventPayload =
        "{\n"
            + "  \"id\": \"evt_234\",\n"
            + "  \"object\": \"event\",\n"
            + "  \"type\": \"financial_account.features_updated\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"meter_123\",\n"
            + "    \"type\": \"financial_account\",\n"
            + "    \"url\": \"/v2/financial_accounts/meter_123\",\n"
            + "    \"stripe_context\": \"acct_123\"\n"
            + "  },\n"
            + "  \"data\": {\n"
            + "    \"v1_event_id\": \"evt_789\",\n"
            + "    \"enabled_features\": [\"foo\"]\n"
            + "  }\n"
            + "}";
  }

  @Test
  public void parsesUnknownV2Event() {
    Event event = Event.parse(v2UnknownEventPayload);
    assertEquals("evt_234", event.getId());
    assertEquals("financial_account.features_updated", event.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), event.getCreated());

    // no data or related object on base Event; nothing to check here.
  }

  @Test
  public void parsesV2Event() {
    V1BillingMeterErrorReportTriggeredEvent event =
        (V1BillingMeterErrorReportTriggeredEvent) Event.parse(v2PayloadNoData);
    assertEquals("evt_234", event.getId());
    assertEquals("v1.billing.meter.error_report_triggered", event.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), event.getCreated());

    assertEquals("meter_123", event.getRelatedObject().getId());
    assertEquals("billing.meter", event.getRelatedObject().getType());
    assertEquals("/v1/billing/meters/meter_123", event.getRelatedObject().getUrl());
  }

  @Test
  public void parsesV2EventAndDeserializesEventData() throws StripeException {
    V1BillingMeterErrorReportTriggeredEvent event =
        (V1BillingMeterErrorReportTriggeredEvent) Event.parse(v2PayloadWithData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v2/core/events/%s", event.getId()),
        null,
        Event.class,
        v2PayloadWithData);

    V1BillingMeterErrorReportTriggeredEvent.EventData data = event.getData();

    assertEquals("foo", data.getDeveloperMessageSummary());
  }

  @Test
  public void retrieveObjectFetchesAndDeserializesObject() throws StripeException, IOException {
    V1BillingMeterErrorReportTriggeredEvent event =
        (V1BillingMeterErrorReportTriggeredEvent) Event.parse(v2PayloadNoData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        "/v1/billing/meters/meter_123",
        null,
        Meter.class,
        getResourceAsString("/api_fixtures/billing_meter.json"));

    assertEquals("/v1/billing/meters/meter_123", event.getRelatedObject().url);
    assertEquals("meter_123", event.getRelatedObject().id);
    assertEquals("billing.meter", event.getRelatedObject().type);

    Meter meter = event.fetchRelatedObject();

    assertEquals("meter_123", meter.getId());
    assertEquals("billing.meter", meter.getObject());
    assertEquals(1727303036, meter.getCreated());
    assertEquals("e1", meter.getCustomerMapping().getEventPayloadKey());
    assertEquals("by_id", meter.getCustomerMapping().getType());
    assertEquals("sum", meter.getDefaultAggregation().getFormula());
    assertEquals("API Requests", meter.getDisplayName());
    assertEquals("API Request Made", meter.getEventName());
    assertEquals("day", meter.getEventTimeWindow());
    assertFalse(meter.getLivemode());
    assertEquals("active", meter.getStatus());
    assertNull(meter.getStatusTransitions().getDeactivatedAt());
    assertEquals(1727303036, meter.getUpdated());
  }

  // FIXME (jar) this should no longer be possible; confirm this and remove before merge
  // @Test
  // public void retrieveObjectFetchesAndDeserializesUnknownObject()
  //     throws StripeException, IOException {
  //   FinancialAccountBalanceOpenedEvent event =
  //       (FinancialAccountBalanceOpenedEvent)
  //           Event.parse(v2PayloadNoData.replace("\"type\": \"card\"", "\"type\": \"cardio\""));
  //   event.setResponseGetter(networkSpy);
  //   stubRequest(
  //       ApiResource.RequestMethod.GET,
  //       "/v2/financial_accounts/meter_123",
  //       null,
  //       StripeRawJsonObject.class,
  //       getResourceAsString("/api_fixtures/card.json"));

  //   assertInstanceOf(StripeRawJsonObject.class, event.fetchObject());
  // }
}
