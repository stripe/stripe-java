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

		assertEquals("acct_1032D82eZvKYlo2C", acc.getId());
		assertEquals(false, acc.getChargesEnabled());
		assertEquals(false, acc.getDetailsSubmitted());
		assertEquals(false, acc.getTransfersEnabled());
		assertEquals("http://www.business.com", acc.getBusinessURL());
		assertEquals("http://support.business.com", acc.getSupportURL());

		LinkedList<String> cs = new LinkedList<String>();
		cs.add("usd");
		cs.add("aud");
		assertEquals(cs, acc.getCurrenciesSupported());

		LegalEntity le = new LegalEntity();
		le.type = "company";
		le.address = new Address();
		le.address.city = "San Francisco";
		le.businessTaxIdProvided = true;
		le.personalIdNumberProvided = false;
		le.ssnLast4Provided = true;
		LegalEntity.Verification leVerif = new LegalEntity.Verification();
		leVerif.detailsCode = "failed_other";
		leVerif.status = "unverified";
		le.verification = leVerif;
		assertEquals(le, acc.getLegalEntity());

		Account.Verification verif = new Account.Verification();
		verif.disabledReason = "fields_needed";
		verif.dueBy = (long) 1457913600;
		LinkedList<String> fn = new LinkedList<String>();
		fn.add("legal_entity.first_name");
		fn.add("legal_entity.last_name");
		verif.fieldsNeeded = fn;
		assertEquals(verif, acc.getVerification());

		assertEquals("site@stripe.com", acc.getEmail());
		assertEquals("usd", acc.getDefaultCurrency());
		assertEquals("US", acc.getCountry());
		assertEquals("US/Pacific", acc.getTimezone());
		assertEquals("Stripe.com", acc.getDisplayName());
		assertEquals("Stripe.com", acc.getBusinessName());

		assertEquals(true, acc.getExternalAccounts() instanceof ExternalAccountCollection);
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
	public void testAccountReject() throws StripeException, IOException {
		String json = resource("account.json");
		stubNetwork(Account.class, json);
		Account acc = Account.retrieve("acct_1032D82eZvKYlo2C");
		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C");

		Map<String, Object> rejectParams = new HashMap<String, Object>();
		rejectParams.put("reason", "fraud");
		acc.reject(rejectParams);
		verifyPost(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C/reject", rejectParams);

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

	@Test
	public void testAccountCreateExternalAccount() throws StripeException, IOException {
		String json = resource("account.json");
		stubNetwork(Account.class, json);
		Account acc = Account.retrieve("acct_1032D82eZvKYlo2C");
		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("external_account", "tok_1234");
		stubNetwork(Card.class, "{\"id\": \"tok_1234\", \"object\": \"card\", \"last4\": \"1234\"}");
		ExternalAccount ea = acc.getExternalAccounts().create(params);

		assertEquals("card", ea.getObject());
		assertEquals("1234", ((Card)ea).getLast4());

		verifyPost(ExternalAccount.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C/external_accounts", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testAccountDelete() throws StripeException, IOException {
		String json = resource("account.json");
		stubNetwork(Account.class, json);
		Account acc = Account.retrieve("acct_1032D82eZvKYlo2C");
		verifyGet(Account.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C");

		stubNetwork(DeletedAccount.class, "{\"id\": \"acct_1032D82eZvKYlo2C\", \"deleted\": \"true\"}");
		acc.delete();
		verifyDelete(DeletedAccount.class, "https://api.stripe.com/v1/accounts/acct_1032D82eZvKYlo2C");

		verifyNoMoreInteractions(networkMock);
	}
}
