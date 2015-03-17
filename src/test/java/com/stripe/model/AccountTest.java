package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import com.stripe.net.RequestOptions;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class AccountTest extends BaseStripeTest {
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
		String json = resource("account.json");
		Account acc = APIResource.GSON.fromJson(json, Account.class);

		Account expected = new Account();
		expected.id = "acct_1032D82eZvKYlo2C";
		expected.chargesEnabled = false;
		expected.detailsSubmitted = false;
		expected.transfersEnabled = false;
		expected.currenciesSupported = new LinkedList<String>();
		expected.currenciesSupported.add("usd");
		expected.currenciesSupported.add("aud");
		expected.legalEntity = new LegalEntity();
		expected.legalEntity.type = "company";
		expected.legalEntity.address = new Address();
		expected.legalEntity.address.city = "San Francisco";
		expected.email = "site@stripe.com";
		expected.defaultCurrency = "usd";
		expected.country = "US";
		expected.timezone = "US/Pacific";
		expected.displayName = "Stripe.com";

		assertEquals(expected, acc);
	}

	@Test
	public void testRetrieve() throws StripeException {
		Account.retrieve();

		verifyGet(Account.class, "https://api.stripe.com/v1/account");
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testOverloadedSingleArgumentRetrieve() throws StripeException {
		Account.retrieve("sk_foobar");

		RequestOptions options = (new RequestOptionsBuilder()).setApiKey("sk_foobar").build();
		verifyGet(Account.class, "https://api.stripe.com/v1/account", options);

		Account.retrieve("anything_else");

		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/anything_else");
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testRetrieveAccountWithId() throws StripeException {
		Account.retrieve("acct_something", null);

		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/acct_something");
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testAccountUpdateById() throws StripeException, IOException {
		String json = resource("account.json");
		stubNetwork(Account.class, json);
		Account acc = Account.retrieve("acct_1032D82eZvKYlo2C");
		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C");

		Map<String, Object> params = new HashMap<String, Object>();
		Map<String, Object> legalEntity = new HashMap<String, Object>();
		legalEntity.put("type", "individual");
		params.put("legal_entity", legalEntity);
		acc.update(params);

		verifyPost(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C", params);
		verifyNoMoreInteractions(networkMock);
	}
}
