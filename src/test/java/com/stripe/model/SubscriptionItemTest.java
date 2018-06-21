package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class SubscriptionItemTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/subscription_items/si_123");
    final SubscriptionItem subscriptionItem =
        ApiResource.GSON.fromJson(data, SubscriptionItem.class);
    assertNotNull(subscriptionItem);
    assertNotNull(subscriptionItem.getId());
    assertEquals("subscription_item", subscriptionItem.getObject());
  }
}
