package com.stripe.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SourceTransactionTest extends BaseStripeTest {
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
	public void testDeserialize() throws StripeException, IOException {
		String json = resource("source_transactions.json");
		SourceTransactionCollection transactions = APIResource.GSON.fromJson(json, SourceTransactionCollection.class);

		assertEquals("/v1/sources/src_1B4r6OKCFFPkgtRhm5thdA7S/source_transactions", transactions.getURL());
		assertEquals(1, transactions.getData().size());

		SourceTransaction transaction = transactions.getData().get(0);
		Map<String, String> typeData = transaction.getTypeData();

		assertEquals("srctxn_1B4r6QKCFFPkgtRhbyo8EK7U", transaction.getId());
		assertEquals("source_transaction", transaction.getObject());
		assertEquals(1000L, (long) transaction.getAmount());
		assertEquals(1506086518L, (long) transaction.getCreated());
		assertEquals("usd", transaction.getCurrency());
		assertEquals(false, transaction.getLivemode());
		assertEquals("src_1B4r6OKCFFPkgtRhm5thdA7S", transaction.getSource());
		assertEquals("ach_credit_transfer", transaction.getType());

		assertEquals("db67", typeData.get("last4"));
		assertEquals("110000000", typeData.get("routing_number"));
		assertEquals("U9AqfhJoSWCOImOv", typeData.get("fingerprint"));
	}

	@Test
	public void testList() throws StripeException {
		Source source = new Source();
		source.setId("src_foo");

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("limit", 3);

		source.sourceTransactions(params);

		verifyGet(SourceTransactionCollection.class, "https://api.stripe.com/v1/sources/src_foo/source_transactions", params);
		verifyNoMoreInteractions(networkMock);
	}
}

