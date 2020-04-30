package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

  @Test
  public void testDeserializeWithArrayExpansions() throws Exception {
    final String data =
        getResourceAsString("/api_fixtures/subscription_with_discount_objects.json");
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertNotNull(subscription.getDiscounts().get(1));
    assertEquals(
        subscription.getDiscounts().get(1), subscription.getDiscountObjects().get(1).getId());
  }

  @Test
  public void testDeserializeWithUnexpandedArrayExpansions() throws Exception {
    final String data =
        getResourceAsString("/api_fixtures/subscription_with_discount_ids.json");
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertEquals("bar", subscription.getDiscounts().get(1));
    assertNull(subscription.getDiscountObjects().get(1));
    assertEquals(2, subscription.getDiscounts().size());
    assertEquals(2, subscription.getDiscountObjects().size());
  }

  @Test
  public void testSerializeWithArrayExpansions() throws Exception {
    final Subscription subscription =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/subscription_with_discount_objects.json"),
            Subscription.class);

    assertEquals(
        subscription,
        ApiResource.GSON.fromJson(ApiResource.GSON.toJson(subscription), Subscription.class));
  }

  @Test
  public void testSetDiscounts() throws Exception {
    final String data =
        getResourceAsString("/api_fixtures/subscription_with_discount_objects.json");
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    List<Discount> discounts = subscription.getDiscountObjects();
    List<String> discountIds = discounts.stream().map(x -> x.getId()).collect(Collectors.toList());
    subscription.setDiscounts(discountIds);
    assertEquals(discounts, subscription.getDiscountObjects());
    subscription.setDiscounts(Arrays.asList(discountIds.get(0)));
    assertEquals(subscription.getDiscountObjects().size(), 1);
    assertNull(subscription.getDiscountObjects().get(0));
    subscription.setDiscounts(discountIds);
    assertEquals(Arrays.asList(null, null), subscription.getDiscountObjects());
    subscription.setDiscountObjects(discounts);
    assertEquals(discounts, subscription.getDiscountObjects());
  }

  @Test
  @SuppressWarnings("BigDecimalEquals")
  public void testDeserializeBigDecimal() {
    final String data = "{\"object\": \"subscription\", \"tax_percent\": 0.3}";
    final Subscription subscription = ApiResource.GSON.fromJson(data, Subscription.class);
    assertNotNull(subscription);
    assertNotNull(subscription.getTaxPercent());
    assertTrue(subscription.getTaxPercent().equals(new BigDecimal("0.3")));
  }
}
