package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExternalAccount;
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

public class ExternalAccountTest extends BaseStripeTest {
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
	public void testUnknownExternalAccountRetrieval() throws StripeException, IOException {
		stubNetwork(Customer.class, resource("customer_with_external_account.json"));
		Customer cus = Customer.retrieve("cus_123");
		verifyGet(Customer.class, "https://api.stripe.com/v1/customers/cus_123");
		ExternalAccount ea = cus.getSources().getData().get(0);
		assertEquals(true, ea instanceof ExternalAccount);
		assertEquals("unknown_external_account", ea.getObject());
	}

	@Test
	public void testUnknownExternalAccountDeletion() throws StripeException, IOException {
		stubNetwork(Customer.class, resource("customer_with_external_account.json"));
		Customer cus = Customer.retrieve("cus_123");
		verifyGet(Customer.class, "https://api.stripe.com/v1/customers/cus_123");
		ExternalAccount ea = cus.getSources().getData().get(0);

		stubNetwork(DeletedExternalAccount.class, "{\"id\": \"extacct_123\", \"object\": \"unknown_external_account\"}");
		ea.delete();
		verifyRequest(
			APIResource.RequestMethod.DELETE,
			DeletedExternalAccount.class,
			"https://api.stripe.com/v1/customers/cus_123/sources/extacct_123",
			null, APIResource.RequestType.NORMAL, RequestOptions.getDefault()
		);
	}
}
