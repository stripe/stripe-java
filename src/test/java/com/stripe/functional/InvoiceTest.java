package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class InvoiceTest extends BaseStripeTest {
  public static final String INVOICE_ID = "in_123";

  private Invoice getInvoiceFixture() throws StripeException {
    final Invoice invoice = Invoice.retrieve(INVOICE_ID);
    resetNetworkSpy();
    return invoice;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final Invoice invoice = Invoice.create(params);

    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Invoice invoice = Invoice.retrieve(INVOICE_ID);

    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/invoices/%s", INVOICE_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Invoice updatedInvoice = invoice.update(params);

    assertNotNull(updatedInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s", invoice.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    InvoiceCollection invoices = Invoice.list(params);

    assertNotNull(invoices);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/invoices")
    );
  }

  @Test
  public void testUpcoming() throws StripeException {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final Invoice upcomingInvoice = Invoice.upcoming(params);

    assertNotNull(upcomingInvoice);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/invoices/upcoming",
        params
    );
  }

  @Test
  public void testPay() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice paidInvoice = invoice.pay();

    assertNotNull(paidInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s/pay", invoice.getId())
    );
  }
}
