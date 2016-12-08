package com.stripe.model;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;

public class InvoiceTest extends BaseStripeTest {
	Invoice basicInvoice;
	Invoice expandedInvoice;

	@Before
	public void mockStripeResponseGetter() {
		APIResource.setStripeResponseGetter(networkMock);
	}

	@After
	public void unmockStripeResponseGetter() {
		/* This needs to be done because tests aren't isolated in Java */
		APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
	}

	@Before
	public void deserialize() throws IOException {
		String json = resource("invoice.json");
		basicInvoice = APIResource.GSON.fromJson(json, Invoice.class);
		String expandedJson = resource("invoice_expansions.json");
		expandedInvoice = APIResource.GSON.fromJson(expandedJson, Invoice.class);
	}

	@Test
	public void testUpcoming() throws StripeException {
		Map<String, Object> params = new HashMap<String, Object>();
		List<HashMap<String, Object>> items = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> itemA = new HashMap<String, Object>();
		itemA.put("id", "si_kjnkk893jslo");
		itemA.put("quantity", 3);

		HashMap<String, Object> itemB = new HashMap<String, Object>();
		itemB.put("id", "si_kmmkjkjl123x8");
		itemB.put("deleted", true);

		HashMap<String, Object> itemC = new HashMap<String, Object>();
		itemC.put("plan", "silver");
		itemC.put("quantity", 1);

		items.add(itemA);
		items.add(itemB);
		items.add(itemC);

		params.put("subscription_items", items);
		params.put("subscription", "sub_8OgUootyH2faMz");
		params.put("customer", "cus_8OgDDsZEwoTscq");
		Invoice.upcoming(params);

		verifyGet(Invoice.class, "https://api.stripe.com/v1/invoices/upcoming", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testUnexpandedCharge() {
		assertEquals("ch_8vzszxcNLVJXqF", basicInvoice.getCharge());
		assertNull(basicInvoice.getChargeObject());
	}

	@Test
	public void testExpandedCharge() {
		assertEquals("ch_8vzszxcNLVJXqF", expandedInvoice.getCharge());
		Charge charge = expandedInvoice.getChargeObject();
		assertNotNull(charge);
		assertEquals(6000L, (long) charge.getAmount());
		assertEquals("card_8vzsxmT0Ua0lkd", charge.getSource().getId());
	}

}