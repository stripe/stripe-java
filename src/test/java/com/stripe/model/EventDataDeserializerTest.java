package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class EventDataDeserializerTest extends BaseStripeTest {

  @Test
  public void testEventAccountApplicationDeauthorized() throws Exception {
    final String data = getResourceAsString("/api_fixtures/account_application_deauthorized.json");
    final Event event = ApiResource.GSON.fromJson(data, Event.class);
    assertNotNull(event);
    assertNotNull(event.getId());
    assertNotNull(event.getData());
    assertNotNull(event.getData().getObject());

    final Application application = (Application) event.getData().getObject();
    assertNotNull(application);
    assertNotNull(application.getId());
  }

}
