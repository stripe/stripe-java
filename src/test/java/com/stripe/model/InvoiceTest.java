package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class InvoiceTest extends BaseStripeTest {

	@Before
	public void mockStripeResponseGetter() {
		APIResource.setStripeResponseGetter(networkMock);
	}

	@After
	public void unmockStripeResponseGetter() {
		/* This needs to be done because tests aren't isolated in Java */
		APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
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
}