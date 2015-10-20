package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Refund;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RefundTest extends BaseStripeTest {

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
	public void testRetrieve() throws StripeException {
		Refund.retrieve("re_foo");

		verifyGet(Refund.class, "https://api.stripe.com/v1/refunds/re_foo");
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testAll() throws StripeException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("limit", 3);

		Refund.all(params);

		verifyGet(RefundCollection.class, "https://api.stripe.com/v1/refunds", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testUpdate() throws StripeException {
		Refund refund = new Refund();
		refund.setId("re_foo");

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("reason", "fraudulent");

		refund.update(params);

		verifyPost(Refund.class, "https://api.stripe.com/v1/refunds/re_foo", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testCreate() throws StripeException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("charge", "ch_foo");

		Refund refund = Refund.create(params);

		verifyPost(Refund.class, "https://api.stripe.com/v1/refunds", params);
		verifyNoMoreInteractions(networkMock);
	}
}
