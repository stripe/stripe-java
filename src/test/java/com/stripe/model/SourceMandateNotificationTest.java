package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class SourceMandateNotificationTest extends BaseStripeTest {
  private void verifyResource(SourceMandateNotification mandateNotification) {

    assertNotNull(mandateNotification);
    assertEquals("srcmn_123", mandateNotification.getId());
    assertEquals("source_mandate_notification", mandateNotification.getObject());
    assertEquals(1000L, (long) mandateNotification.getAmount());
    assertEquals(1516981090, (long) mandateNotification.getCreated());
    assertEquals(false, mandateNotification.getLivemode());
    assertEquals("debit_initiated", mandateNotification.getReason());
    assertEquals("pending", mandateNotification.getStatus());
    assertEquals("sepa_debit", mandateNotification.getType());
    assertEquals("src_123", mandateNotification.getSource().getId());
    assertEquals("sepa_debit", mandateNotification.getSource().getType());

    final SourceMandateNotification.SepaDebitData typeData = mandateNotification.getSepaDebit();
    assertEquals("OAAAAAAAAAAAAAAO", typeData.getMandateReference());
    assertEquals("3000", typeData.getLast4());
  }

  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/source_mandate_notification.json");
    final SourceMandateNotification resource =
        ApiResource.GSON.fromJson(json, SourceMandateNotification.class);

    verifyResource(resource);
  }

  @Test
  public void testDeserializeEvent() throws Exception {
    final String json = getResourceAsString("/api_fixtures/source_mandate_notification_event.json");
    final Event event = ApiResource.GSON.fromJson(json, Event.class);

    // Using deserializeUnsafe() because the fixture uses an older API version
    final SourceMandateNotification mandateNotification =
        (SourceMandateNotification) event.getDataObjectDeserializer().deserializeUnsafe();

    verifyResource(mandateNotification);
  }
}
