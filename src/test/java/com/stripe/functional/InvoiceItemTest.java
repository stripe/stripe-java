package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceItem;
import com.stripe.model.InvoiceItemCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class InvoiceItemTest extends BaseStripeTest {
  public static final String INVOICE_ITEM_ID = "ii_123";

  private InvoiceItem getItemFixture() throws StripeException {
    final InvoiceItem item = InvoiceItem.retrieve(INVOICE_ITEM_ID);
    resetNetworkSpy();
    return item;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 100);
    params.put("currency", "usd");
    params.put("customer", "cus_123");

    final InvoiceItem item = InvoiceItem.create(params);

    assertNotNull(item);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoiceitems"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final InvoiceItem item = InvoiceItem.retrieve(INVOICE_ITEM_ID);

    assertNotNull(item);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/invoiceitems/%s", INVOICE_ITEM_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final InvoiceItem resource = getItemFixture();

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final InvoiceItem updatedItem = resource.update(params);

    assertNotNull(updatedItem);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoiceitems/%s", resource.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    InvoiceItemCollection items = InvoiceItem.list(params);

    assertNotNull(items);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/invoiceitems"),
        params
    );
  }
}
