package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

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
  public void testDeserializeWithExpansions() throws Exception {
    // TODO: Add support for expanding "transfer_data.destination" when stripe-mock supports it.
    final String[] expansions = {
      "customer", "default_source", "latest_invoice",
    };
    final String data = getFixture("/v1/subscriptions/sub_123", expansions);
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);

    final Customer customer = subscription.getCustomerObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertEquals(subscription.getCustomer(), customer.getId());

    final PaymentSource defaultSource = subscription.getDefaultSourceObject();
    assertNotNull(defaultSource);
    assertNotNull(defaultSource.getId());
    assertEquals(subscription.getDefaultSource(), defaultSource.getId());

    final Invoice invoice = subscription.getLatestInvoiceObject();
    assertNotNull(invoice);
    assertNotNull(invoice.getId());
    assertEquals(subscription.getLatestInvoice(), invoice.getId());
  }
}
