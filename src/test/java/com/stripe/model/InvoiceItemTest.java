package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

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
      "customer",
      "invoice",
      "subscription",
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
}
