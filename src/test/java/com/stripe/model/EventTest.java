package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class EventTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/events/evt_123");
    final Event event = ApiResource.GSON.fromJson(data, Event.class);
    assertNotNull(event);
    assertNotNull(event.getId());
    assertEquals("event", event.getObject());

    final Customer customer = (Customer) event.getData().getObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
  }

  @Test
  public void testReserialize() throws Exception {
    final String data = getFixture("/v1/events/evt_123");
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final Event reserializedEvent = ApiResource.GSON.fromJson(event.toJson(), Event.class);

    assertEquals(reserializedEvent.getId(), event.getId());
    assertEquals(reserializedEvent.getObject(), event.getObject());
    assertEquals(reserializedEvent.getAccount(), event.getAccount());
    assertEquals(reserializedEvent.getApiVersion(), event.getApiVersion());
    assertEquals(reserializedEvent.getCreated(), event.getCreated());
    assertEquals(reserializedEvent.getLivemode(), event.getLivemode());
    assertEquals(reserializedEvent.getRequest().getId(), event.getRequest().getId());
    assertEquals(reserializedEvent.getRequest().getIdempotencyKey(),
        event.getRequest().getIdempotencyKey());
    assertEquals(reserializedEvent.getType(), event.getType());
  }
}
