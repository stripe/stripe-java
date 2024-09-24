package com.stripe.model.v2;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.ThinEvent;
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
            + "    \"id\": \"ca_123\",\n"
            + "    \"type\": \"card\",\n"
            + "    \"url\": \"/v2/cards/ca_123\",\n"
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
            + "    \"id\": \"ca_123\",\n"
            + "    \"type\": \"card\",\n"
            + "    \"url\": \"/v2/cards/ca_123\",\n"
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
    ThinEvent event = ThinEvent.parse(v2UnknownEventPayload);
    assertEquals("evt_234", event.getId());
    assertEquals("financial_account.features_updated", event.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), event.getCreated());

    assertEquals("fa_123", event.getRelatedObject().getId());
    assertEquals("financial_account", event.getRelatedObject().getType());
    assertEquals("/v2/financial_accounts/fa_123", event.getRelatedObject().getUrl());
  }

  @Test
  public void parsesV2Event() {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) ThinEvent.parse(v2PayloadNoData);
    assertEquals("evt_234", event.getId());
    assertEquals("financial_account.balance.opened", event.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), event.getCreated());

    assertEquals("ca_123", event.getRelatedObject().getId());
    assertEquals("card", event.getRelatedObject().getType());
    assertEquals("/v2/cards/ca_123", event.getRelatedObject().getUrl());
  }

  @Test
  public void retrieveDataFetchesAndDeserializesEventData() throws StripeException {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) ThinEvent.parse(v2PayloadNoData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v2/events/%s", event.getId()),
        null,
        ThinEvent.class,
        v2PayloadWithData);

    FinancialAccountBalanceOpenedEvent.EventData data = event.retrieveData();

    assertEquals("foo", data.getType());
  }

  @Test
  public void retrieveObjectFetchesAndDeserializesObject() throws StripeException, IOException {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent) ThinEvent.parse(v2PayloadNoData);
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        "/v2/cards/ca_123",
        null,
        Card.class,
        getResourceAsString("/api_fixtures/card.json"));

    Card data = (Card) event.retrieveObject();

    assertNotNull(data.getId());
  }

  @Test
  public void retrieveObjectFetchesAndDeserializesUnknownObject()
      throws StripeException, IOException {
    FinancialAccountBalanceOpenedEvent event =
        (FinancialAccountBalanceOpenedEvent)
            ThinEvent.parse(v2PayloadNoData.replace("\"type\": \"card\"", "\"type\": \"cardio\""));
    event.setResponseGetter(networkSpy);
    stubRequest(
        ApiResource.RequestMethod.GET,
        "/v2/cards/ca_123",
        null,
        StripeRawJsonObject.class,
        getResourceAsString("/api_fixtures/card.json"));

    assertInstanceOf(StripeRawJsonObject.class, event.retrieveObject());
  }
}
