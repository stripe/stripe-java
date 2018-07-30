package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import java.math.BigDecimal;

import org.junit.Test;

public class SubscriptionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/subscriptions/sub_123");
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertNotNull(subscription.getId());
    assertEquals("subscription", subscription.getObject());
  }

  @Test
  public void testDeserializeBigDecimal() {
    final String data = "{\"object\": \"subscription\", \"tax_percent\": 0.3}";
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertNotNull(subscription.getTaxPercent());
    assertTrue(subscription.getTaxPercent().equals(new BigDecimal("0.3")));
  }
}
