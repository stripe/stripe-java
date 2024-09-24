package com.stripe.model.v2;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.events.FinancialAccountBalanceOpenedEvent;
import com.stripe.exception.StripeException;
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
            + "  \"type\": \"financial_account.balance.opened\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"fa_123\",\n"
            + "    \"type\": \"financial_account\",\n"
            + "    \"url\": \"/v2/financial_accounts/fa_123\",\n"
            + "    \"stripe_context\": \"acct_123\"\n"
            + "  }\n"
            + "}";
    v2PayloadWithData =
        "{\n"
            + "  \"id\": \"evt_234\",\n"
            + "  \"object\": \"event\",\n"
            + "  \"type\": \"financial_account.balance.opened\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"fa_123\",\n"
            + "    \"type\": \"financial_account\",\n"
            + "    \"url\": \"/v2/financial_accounts/fa_123\",\n"
            + "    \"stripe_context\": \"acct_123\"\n"
            + "  },\n"
            + "  \"data\": {\n"
            + "    \"type\": \"foo\"\n"
            + "  }\n"
            + "}";
    v2UnknownEventPayload =
        "{\n"
            + "  \"id\": \"evt_234\",\n"
            + "  \"object\": \"event\",\n"
            + "  \"type\": \"financial_account.features_updated\",\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
            + "  \"related_object\": {\n"
            + "    \"id\": \"fa_123\",\n"
            + "    \"type\": \"financial_account\",\n"
            + "    \"url\": \"/v2/financial_accounts/fa_123\",\n"
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
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) Event.parse(v2PayloadNoData);
    assertEquals("evt_234", event.getId());
    assertEquals("financial_account.balance.opened", event.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), event.getCreated());

    assertEquals("fa_123", event.getRelatedObject().getId());
    assertEquals("financial_account", event.getRelatedObject().getType());
    assertEquals("/v2/financial_accounts/fa_123", event.getRelatedObject().getUrl());
  }

  @Test
  public void parsesV2EventAndDeserializesEventData() throws StripeException {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) Event.parse(v2PayloadWithData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v2/events/%s", event.getId()),
        null,
        Event.class,
        v2PayloadWithData);

    FinancialAccountBalanceOpenedEvent.EventData data = event.getData();

    assertEquals("foo", data.getType());
  }

  @Test
  public void retrieveObjectFetchesAndDeserializesObject() throws StripeException, IOException {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) Event.parse(v2PayloadNoData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        "/v2/financial_accounts/fa_123",
        null,
        FinancialAccount.class,
        getResourceAsString("/api_fixtures/financial_account.json"));

    FinancialAccount data = event.fetchRelatedObject();

    assertEquals(data.getId(), event.getRelatedObject().id);
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
  //       "/v2/financial_accounts/fa_123",
  //       null,
  //       StripeRawJsonObject.class,
  //       getResourceAsString("/api_fixtures/card.json"));

  //   assertInstanceOf(StripeRawJsonObject.class, event.fetchObject());
  // }
}
