package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.EventCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.EventListParams;

import org.junit.jupiter.api.Test;

public class EventServiceTest extends BaseStripeTest {
  public static final String EVENT_ID = "evt_123";

  private EventService service = new EventService();

  @Test
  public void testRetrieve() throws StripeException {
    final Event event = service.retrieve(EVENT_ID, null);

    assertNotNull(event);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/events/%s", EVENT_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    EventListParams params = EventListParams.builder()
        .setLimit(1L)
        .setType("charge.succeeded")
        .build();

    final EventCollection resources = service.list(params);

    assertNotNull(resources);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/events"),
        ImmutableMap.of(
            "limit", 1L,
            "type", "charge.succeeded"
        )
    );
  }
}