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

public class ThreeDSecureTest extends BaseStripeTest {
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
	public void testCreate() throws StripeException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("card", "tok_cardtoken");
		params.put("amount", 1500);
		params.put("currency", "usd");
		params.put("return_url", "https://example.org/3d-secure-result");

		ThreeDSecure tds = ThreeDSecure.create(params);

		verifyPost(ThreeDSecure.class, "https://api.stripe.com/v1/3d_secure", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testRetrieve() throws StripeException {
		ThreeDSecure tds = ThreeDSecure.retrieve("tdsrc_id");

		verifyGet(ThreeDSecure.class, "https://api.stripe.com/v1/3d_secure/tdsrc_id");
		verifyNoMoreInteractions(networkMock);
	}
}
