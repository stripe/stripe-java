package com.stripe.functional;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeFunctionalTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class InvoiceTest extends BaseStripeFunctionalTest {
    static InvoiceItem createDefaultInvoiceItem(Customer customer)
            throws StripeException {
        Map<String, Object> invoiceItemParams = new HashMap<String, Object>();
        invoiceItemParams.put("amount", 100);
        invoiceItemParams.put("currency", "usd");
        invoiceItemParams.put("customer", customer.getId());
        return InvoiceItem.create(invoiceItemParams);
    }

    static Map<String, Object> getInvoiceItemParams() throws StripeException {
        Map<String, Object> params = new HashMap<String, Object>();
        defaultCustomerParams.put("email", "test@stripe.com");
        Customer customer = Customer.create(defaultCustomerParams);
        params.put("amount", 100);
        params.put("currency", "usd");
        params.put("customer", customer.getId());
        return params;
    }

    // Invoice Tests:
    @Test
    public void testInvoiceItemCreate() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        InvoiceItem invoiceItem = createDefaultInvoiceItem(customer);
        assertTrue(invoiceItem.getAmount() == 100);
    }

    @Test
    public void testInvoiceItemRetrieve() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        InvoiceItem retrievedInvoiceItem = InvoiceItem
                .retrieve(createdInvoiceItem.getId());
        assertEquals(createdInvoiceItem.getId(), retrievedInvoiceItem.getId());
    }

    @Test
    public void testInvoiceItemList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<InvoiceItem> InvoiceItems = InvoiceItem.all(listParams).getData();
        assertEquals(InvoiceItems.size(), 1);
    }

    @Test
    public void testInvoiceItemUpdate() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "Updated Description");
        updateParams.put("amount", 200);
        InvoiceItem updatedInvoiceItem = createdInvoiceItem
                .update(updateParams);
        assertTrue(updatedInvoiceItem.getAmount() == 200);
        assertEquals(updatedInvoiceItem.getDescription(), "Updated Description");
    }

    @Test
    public void testInvoiceItemDelete() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        DeletedInvoiceItem deletedInvoiceItem = createdInvoiceItem.delete();
        assertTrue(deletedInvoiceItem.getDeleted());
        assertEquals(deletedInvoiceItem.getId(), createdInvoiceItem.getId());
    }

    @Test
    public void testInvoiceListAndRetrieve() throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams());
        Customer customer = createDefaultCustomerWithPlan(plan);
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        listParams.put("subscription", customer.getSubscriptions().getData().get(0).getId());
        Invoice createdInvoice = Invoice.all(listParams).getData().get(0);
        Invoice retrievedInvoice = Invoice.retrieve(createdInvoice.getId());
        assertEquals(createdInvoice.getId(), retrievedInvoice.getId());

        InvoiceLineItemCollection lines = retrievedInvoice.getLines().all(
                listParams);
        assertNotNull(lines);
    }

    @Test
    public void testInvoiceRetrieveForCustomer() throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams());
        Customer customer = createDefaultCustomerWithPlan(plan);
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("customer", customer.getId());
        listParams.put("count", 1);
        Invoice invoice = Invoice.all(listParams).getData().get(0);
        assertEquals(invoice.getCustomer(), customer.getId());
    }

    @Test
    public void testInvoiceCreate() throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams());
        Customer customer = createDefaultCustomerWithPlan(plan);
        Map<String, Object> invoiceItem = ImmutableMap.<String, Object>builder()
                .put("customer", customer.getId())
                .put("amount", 100)
                .put("currency", "usd")
                .put("description", "my item")
                .build();
        InvoiceItem createdItem = InvoiceItem.create(invoiceItem);
        assertEquals("my item", createdItem.getDescription());
        Invoice invoice = Invoice.create(ImmutableMap.<String, Object>builder()
                .put("description", "my invoice")
                .put("customer", customer.getId())
                .build());
        assertEquals("my invoice", invoice.getDescription());
    }

    @Test
    public void testUpcomingInvoice() throws Exception {
        Customer customer = Customer.create(defaultCustomerParams);
        createDefaultInvoiceItem(customer);
        Map<String, Object> upcomingParams = new HashMap<String, Object>();
        upcomingParams.put("customer", customer.getId());
        Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
        assertFalse(upcomingInvoice.getAttempted());
    }

    @Test
    public void testUpcomingInvoiceLines() throws Exception {
        Customer customer = Customer.create(defaultCustomerParams);
        InvoiceItem item = createDefaultInvoiceItem(customer);
        Map<String, Object> upcomingParams = new HashMap<String, Object>();
        upcomingParams.put("customer", customer.getId());
        Invoice upcomingInvoice = Invoice.upcoming(upcomingParams);
        assertFalse(upcomingInvoice.getAttempted());

        InvoiceLineItemCollection lines = upcomingInvoice.getLines().all(null);
        assertFalse(lines.getData().isEmpty());
        assertEquals(item.getId(), lines.getData().get(0).getId());

        Map<String, Object> fetchParams = new HashMap<String, Object>();
        fetchParams.put("starting_after", item.getId());
        InvoiceLineItemCollection linesAfterFirst = upcomingInvoice.getLines().all(fetchParams);
        assertTrue(linesAfterFirst.getData().isEmpty());
    }

    @Test
    public void testInvoiceItemCreatePerCallAPIKey() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        InvoiceItem invoiceItem = createDefaultInvoiceItem(customer);
        assertTrue(invoiceItem.getAmount() == 100);
    }

    @Test
    public void testInvoiceItemRetrievePerCallAPIKey() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        InvoiceItem retrievedInvoiceItem = InvoiceItem.retrieve(
                createdInvoiceItem.getId(), Stripe.apiKey);
        assertEquals(createdInvoiceItem.getId(), retrievedInvoiceItem.getId());
    }

    @Test
    public void testInvoiceItemListPerCallAPIKey() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<InvoiceItem> InvoiceItems = InvoiceItem.all(listParams,
                Stripe.apiKey).getData();
        assertEquals(InvoiceItems.size(), 1);
    }

    @Test
    public void testInvoiceItemUpdatePerCallAPIKey() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        Map<String, Object> updateParams = new HashMap<String, Object>();
        updateParams.put("description", "Updated Description");
        updateParams.put("amount", 200);
        InvoiceItem updatedInvoiceItem = createdInvoiceItem.update(
                updateParams, Stripe.apiKey);
        assertTrue(updatedInvoiceItem.getAmount() == 200);
        assertEquals(updatedInvoiceItem.getDescription(), "Updated Description");
    }

    @Test
    public void testInvoiceItemDeletePerCallAPIKey() throws StripeException {
        Customer customer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        InvoiceItem createdInvoiceItem = createDefaultInvoiceItem(customer);
        DeletedInvoiceItem deletedInvoiceItem = createdInvoiceItem
                .delete(Stripe.apiKey);
        assertTrue(deletedInvoiceItem.getDeleted());
        assertEquals(deletedInvoiceItem.getId(), createdInvoiceItem.getId());
    }

    @Test
    public void testInvoiceListAndRetrievePerCallAPIKey()
            throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
        createDefaultCustomerWithPlan(plan);
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        Invoice createdInvoice = Invoice.all(listParams, Stripe.apiKey)
                .getData().get(0);
        Invoice retrievedInvoice = Invoice.retrieve(createdInvoice.getId(),
                Stripe.apiKey);
        assertEquals(createdInvoice.getId(), retrievedInvoice.getId());
    }

    @Test
    public void testInvoiceRetrieveForCustomerPerCallAPIKey()
            throws StripeException {
        Plan plan = Plan.create(getUniquePlanParams(), Stripe.apiKey);
        Customer customer = createDefaultCustomerWithPlan(plan);
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("customer", customer.getId());
        listParams.put("count", 1);
        Invoice invoice = Invoice.all(listParams, Stripe.apiKey).getData()
                .get(0);
        assertEquals(invoice.getCustomer(), customer.getId());
    }

    @Test
    public void testUpcomingInvoicePerCallAPIKey() throws Exception {
        Customer customer = Customer.create(defaultCustomerParams,
                Stripe.apiKey);
        createDefaultInvoiceItem(customer);
        Map<String, Object> upcomingParams = new HashMap<String, Object>();
        upcomingParams.put("customer", customer.getId());
        Invoice upcomingInvoice = Invoice.upcoming(upcomingParams,
                Stripe.apiKey);
        assertFalse(upcomingInvoice.getAttempted());
    }

    @Test
    public void testInvoiceItemMetadata() throws StripeException {
        testMetadata(InvoiceItem.create(getInvoiceItemParams()));
    }

    @Test
    public void testInvoiceMetadata() throws StripeException {
        InvoiceItem invItem = InvoiceItem.create(getInvoiceItemParams());
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("customer", invItem.getCustomer());
        testMetadata(Invoice.create(params));
    }

    @Test
    public void testSendInvoice() throws StripeException {
        InvoiceItem invItem = InvoiceItem.create(getInvoiceItemParams());
        Map<String,Object> params = new HashMap<String,Object>();
        Long dueDate = (System.currentTimeMillis() / 1000) + 600;
        params.put("customer", invItem.getCustomer());
        params.put("billing", "send_invoice");
        params.put("due_date", dueDate);
        Invoice invoice = Invoice.create(params);
        assertEquals("send_invoice", invoice.getBilling());
        assertEquals(dueDate, invoice.getDueDate());

        Map<String,Object> updateParams = new HashMap<String,Object>();
        updateParams.put("paid", true);
        Invoice updatedInvoice = invoice.update(updateParams);
        assertTrue(updatedInvoice.getPaid());
    }
}