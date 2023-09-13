package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class InvoiceItemTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/invoiceitems/ii_123");
    final InvoiceItem invoiceItem = ApiResource.GSON.fromJson(data, InvoiceItem.class);
    assertNotNull(invoiceItem);
    assertNotNull(invoiceItem.getId());
    assertEquals("invoiceitem", invoiceItem.getObject());
    assertNull(invoiceItem.getCustomerObject());
    assertNull(invoiceItem.getInvoiceObject());
    assertNull(invoiceItem.getSubscriptionObject());
  }

  @Test
  public void testDeserializeExpanded() throws Exception {
    final String[] expansions = {
      "customer", "invoice", "subscription",
    };
    final String data = getFixture("/v1/invoiceitems/ii_123", expansions);
    final InvoiceItem invoiceItem = ApiResource.GSON.fromJson(data, InvoiceItem.class);
    assertNotNull(invoiceItem);
    final Customer customer = invoiceItem.getCustomerObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertEquals(invoiceItem.getCustomer(), customer.getId());
    final Invoice invoice = invoiceItem.getInvoiceObject();
    assertNotNull(invoice);
    assertNotNull(invoice.getId());
    assertEquals(invoiceItem.getInvoice(), invoice.getId());
    final Subscription subscription = invoiceItem.getSubscriptionObject();
    assertNotNull(subscription);
    assertNotNull(subscription.getId());
    assertEquals(invoiceItem.getSubscription(), subscription.getId());
  }

  @Test
  public void testDeserializeWithUnexpandedArrayExpansions() throws Exception {
    final String data = getResourceAsString("/api_fixtures/invoiceitem_with_discount_ids.json");
    final InvoiceItem invoiceItem = ApiResource.GSON.fromJson(data, InvoiceItem.class);
    assertNotNull(invoiceItem);
    assertEquals("25_5OFF", invoiceItem.getDiscounts().get(0));
    assertNull(invoiceItem.getDiscountObjects().get(0));
    assertEquals("50_5OFF", invoiceItem.getDiscounts().get(1));
    assertNull(invoiceItem.getDiscountObjects().get(1));
    assertEquals(2, invoiceItem.getDiscounts().size());
    assertEquals(2, invoiceItem.getDiscountObjects().size());
  }

  @Test
  public void testDeserializeWithArrayExpansions() throws Exception {
    final InvoiceItem invoiceItem =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/invoiceitem_with_discount_objects.json"),
            InvoiceItem.class);

    assertEquals(
        invoiceItem,
        ApiResource.GSON.fromJson(ApiResource.GSON.toJson(invoiceItem), InvoiceItem.class));
  }

  @Test
  public void testSetDiscounts() throws Exception {
    final String data = getResourceAsString("/api_fixtures/invoiceitem_with_discount_objects.json");
    final InvoiceItem invoiceItem = ApiResource.GSON.fromJson(data, InvoiceItem.class);
    List<Discount> discounts = invoiceItem.getDiscountObjects();
    List<String> discountIds = discounts.stream().map(x -> x.getId()).collect(Collectors.toList());
    invoiceItem.setDiscounts(discountIds);
    assertEquals(discounts, invoiceItem.getDiscountObjects());
    invoiceItem.setDiscounts(Arrays.asList(discountIds.get(0)));
    assertEquals(invoiceItem.getDiscountObjects().size(), 1);
    assertNull(invoiceItem.getDiscountObjects().get(0));
    invoiceItem.setDiscounts(discountIds);
    assertEquals(Arrays.asList(null, null), invoiceItem.getDiscountObjects());
    invoiceItem.setDiscountObjects(discounts);
    assertEquals(discounts, invoiceItem.getDiscountObjects());
  }
}
