package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.model.Money;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BalanceTest extends BaseStripeTest {
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
		String json = resource("balance.json");
		Balance bal = APIResource.GSON.fromJson(json, Balance.class);

		Money money = bal.getAvailable().get(0);
		assertEquals("usd", money.getCurrency());
		assertEquals(8045512867L, (long) money.getAmount());

		Money.SourceTypes st = new Money.SourceTypes();
		st.alipayAccount = null;
		st.bankAccount = 9008784L;
		st.bitcoinReceiver = 1449199L;
		st.card = 8035054884L;
		assertEquals(st, money.getSourceTypes());

		money = bal.getAvailable().get(1);
		assertEquals("cad", money.getCurrency());
		assertEquals(1023450L, (long) money.getAmount());

		st.alipayAccount = null;
		st.bankAccount = null;
		st.bitcoinReceiver = null;
		st.card = 1023450L;
		assertEquals(st, money.getSourceTypes());

		money = bal.getPending().get(0);
		assertEquals("usd", money.getCurrency());
		assertEquals(1034273583L, (long) money.getAmount());

		st.alipayAccount = null;
		st.bankAccount = 0L;
		st.bitcoinReceiver = 0L;
		st.card = 1034273583L;
		assertEquals(st, money.getSourceTypes());

		money = bal.getPending().get(1);
		assertEquals("cad", money.getCurrency());
		assertEquals(356454L, (long) money.getAmount());

		st.alipayAccount = null;
		st.bankAccount = null;
		st.bitcoinReceiver = null;
		st.card = 356454L;
		assertEquals(st, money.getSourceTypes());
	}

	@Test
	public void testRetrieve() throws StripeException {
		Balance.retrieve();

		verifyGet(Balance.class, "https://api.stripe.com/v1/balance");
		verifyNoMoreInteractions(networkMock);
	}
}
