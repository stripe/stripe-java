package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceCollection;
import com.stripe.net.ApiResource;

import com.stripe.net.RequestOptions;
import com.stripe.param.InvoiceUpcomingParams;
import com.stripe.param.InvoiceUpdateParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;


public class InvoiceTest extends BaseStripeTest {
  public static final String INVOICE_ID = "in_123";

  private Invoice getInvoiceFixture() throws StripeException {
    final Invoice invoice = Invoice.retrieve(INVOICE_ID);
    resetNetworkSpy();
    return invoice;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
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

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
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
  public void testUpdateWithTypeParams() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, String> customField1 = new HashMap<>();
    customField1.put("name", "foo1");
    customField1.put("value", "val1");
    final Map<String, String> customField2 = new HashMap<>();
    customField2.put("name", "foo2");
    customField2.put("value", "val2");

    final Map<String, Object> params = new HashMap<>();
    params.put("custom_fields", Arrays.asList(customField1, customField2));
    params.put("tax_percent", new BigDecimal("12.45333"));
    params.put("metadata", metadata);

    InvoiceUpdateParams.CustomField typedCustomField1 = InvoiceUpdateParams.CustomField.builder()
        .setName("foo1").setValue("val1").build();

    InvoiceUpdateParams.CustomField typedCustomField2 = InvoiceUpdateParams.CustomField.builder()
        .setName("foo2").setValue("val2").build();

    InvoiceUpdateParams typedParams = InvoiceUpdateParams.builder()
        .setCustomFields(Arrays.asList(typedCustomField1, typedCustomField2))
        .setTaxPercent(new BigDecimal("12.45333"))
        .putMetadata("key", "value")
        .build();

    Invoice updatedInvoice = invoice.update(typedParams, RequestOptions.getDefault());

    assertNotNull(updatedInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s", invoice.getId()),
        params
    );

    InvoiceUpdateParams typedParamsWithEmpty = InvoiceUpdateParams.builder()
        .setCustomFields(EmptyParam.EMPTY)
        .setTaxPercent(EmptyParam.EMPTY)
        .build();

    updatedInvoice = invoice.update(typedParamsWithEmpty, RequestOptions.getDefault());

    Map<String, Object> paramsWithEmpty = new HashMap<>();
    paramsWithEmpty.put("custom_fields", null);
    paramsWithEmpty.put("tax_percent", null);

    assertNotNull(updatedInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s", invoice.getId()),
        paramsWithEmpty
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    InvoiceCollection invoices = Invoice.list(params);

    assertNotNull(invoices);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/invoices")
    );
  }

  @Test
  public void testDelete() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice deletedInvoice = invoice.delete();

    assertNotNull(deletedInvoice);
    assertTrue(deletedInvoice.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/invoices/%s", invoice.getId())
    );
  }

  @Test
  public void testFinalizeInvoice() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice finalizedInvoice = invoice.finalizeInvoice();

    assertNotNull(finalizedInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s/finalize", invoice.getId())
    );
  }

  @Test
  public void testMarkUncollectible() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice uncollectibleInvoice = invoice.markUncollectible();

    assertNotNull(uncollectibleInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s/mark_uncollectible", invoice.getId())
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

  @Test
  public void testSendInvoice() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice sentInvoice = invoice.sendInvoice();

    assertNotNull(sentInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s/send", invoice.getId())
    );
  }

  @Test
  public void testUpcoming() throws StripeException {
    Map<String, Object> params = new HashMap<>();
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
  public void testUpcomingWithTypedParams() throws StripeException {
    InvoiceUpcomingParams.InvoiceItem item = InvoiceUpcomingParams.InvoiceItem.builder()
        .setAmount(123L)
        .setCurrency("usd")
        .build();
    InvoiceUpcomingParams.InvoiceItem item2 = InvoiceUpcomingParams.InvoiceItem.builder()
        .setAmount(456L)
        .setCurrency("jpy")
        .build();
    InvoiceUpcomingParams typedParams = InvoiceUpcomingParams.builder()
        .addInvoiceItem(item)
        .addInvoiceItem(item2).build();

    final Invoice upcomingInvoice = Invoice.upcoming(typedParams, RequestOptions.getDefault());

    Map<String, Object> params = new HashMap<>();
    params.put("invoice_items",
        Arrays.asList(
            ImmutableMap.of("amount", 123L, "currency", "usd"),
            ImmutableMap.of("amount", 456L, "currency", "jpy")
        ));

    assertNotNull(upcomingInvoice);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/invoices/upcoming",
        params
    );
  }

  @Test
  public void testVoidInvoice() throws StripeException {
    final Invoice invoice = getInvoiceFixture();

    final Invoice voidInvoice = invoice.voidInvoice();

    assertNotNull(voidInvoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/invoices/%s/void", invoice.getId())
    );
  }
}
