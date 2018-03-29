package com.stripe.model;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class SourceMandateNotificationTest extends BaseStripeTest {
  private void verifyResource(SourceMandateNotification mandateNotification) {
    Map<String, String> typeData = mandateNotification.getTypeData();

    assertEquals("srcmn_1234", mandateNotification.getId());
    assertEquals("source_mandate_notification", mandateNotification.getObject());
    assertEquals(1000L, (long) mandateNotification.getAmount());
    assertEquals(1516981090, (long) mandateNotification.getCreated());
    assertEquals(false, mandateNotification.getLivemode());
    assertEquals("debit_initiated", mandateNotification.getReason());
    assertEquals("pending", mandateNotification.getStatus());
    assertEquals("sepa_debit", mandateNotification.getType());
    assertEquals("src_123", mandateNotification.getSource().getId());
    assertEquals("sepa_debit", mandateNotification.getSource().getType());

    assertEquals("TEST111111111111111", typeData.get("creditor_identifier"));
    assertEquals("OAAAAAAAAAAAAAAO", typeData.get("mandate_reference"));
    assertEquals("3000", typeData.get("last4"));
  }

  @Test
  public void testDeserializeResource() throws StripeException, IOException {
    String json = resource("source_mandate_notification.json");
    SourceMandateNotification mandateNotification
        = APIResource.GSON.fromJson(json, SourceMandateNotification.class);

    verifyResource(mandateNotification);
  }

  @Test
  public void testDeserializeEvent() throws StripeException, IOException {
    String json = resource("source_mandate_notification_event.json");
    Event event = APIResource.GSON.fromJson(json, Event.class);

    SourceMandateNotification mandateNotification
        = (com.stripe.model.SourceMandateNotification) event.getData().getObject();

    verifyResource(mandateNotification);
  }
}
