package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class InvoiceTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/invoices/in_123");
    final Invoice invoice = ApiResource.GSON.fromJson(data, Invoice.class);
    assertNotNull(invoice);
    assertNotNull(invoice.getId());
    assertEquals("invoice", invoice.getObject());
    assertNull(invoice.getChargeObject());
  }

  @Test
  public void testDeserializeExpanded() throws Exception {
    final String[] expansions = {
      "charge",
    };
    final String data = getFixture("/v1/invoices/in_123", expansions);
    final Invoice invoice = ApiResource.GSON.fromJson(data, Invoice.class);
    assertNotNull(invoice);
    assertNotNull(invoice.getId());
    final Charge charge = invoice.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(invoice.getCharge(), charge.getId());
  }
}
