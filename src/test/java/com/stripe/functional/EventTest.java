package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.EventCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class EventTest extends BaseStripeTest {
  public static final String EVENT_ID = "evt_123";

  @Test
  public void testRetrieve() throws StripeException {
    final Event event = Event.retrieve(EVENT_ID);

    assertNotNull(event);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/events/%s", EVENT_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final EventCollection resources = Event.list(params);

    assertNotNull(resources);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/events"),
        params
    );
  }
}
