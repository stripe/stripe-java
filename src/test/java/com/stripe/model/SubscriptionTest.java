package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import org.junit.Test;

public class SubscriptionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/subscriptions/sub_123");
    final Subscription subscription = APIResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertNotNull(subscription.getId());
    assertEquals("subscription", subscription.getObject());
  }
}
