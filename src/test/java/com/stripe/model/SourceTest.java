package com.stripe.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class SourceTest extends BaseStripeTest {
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
		HashMap<String, Object> ownerParams = new HashMap<String, Object>();
		ownerParams.put("email", "jenny.rosen@example.com");

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("type", "bitcoin");
		params.put("amount", 1000);
		params.put("currency", "usd");
		params.put("owner", ownerParams);

		Source.create(params);

		verifyPost(Source.class, "https://api.stripe.com/v1/sources", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testRetrieve() throws StripeException {
		Source.retrieve("src_foo");

		verifyGet(Source.class, "https://api.stripe.com/v1/sources/src_foo");
		verifyNoMoreInteractions(networkMock);
	}

	@Test(expected = InvalidRequestException.class)
	public void testDelete() throws StripeException {
		Source src = new Source();
		src.setId("src_test_delete");

		src.delete();
	}

	@Test
	public void testVerify() throws StripeException, IOException {
		String json = resource("source_ach_debit.json");
		Source src = APIResource.GSON.fromJson(json, Source.class);

		Map params = new HashMap<String, Object>();
		Integer[] values = {32, 45};
		params.put("values", values);
		src.verify(params);
		verifyPost(
				Source.class,
				"https://api.stripe.com/v1/sources/src_19LGIDKCFFPkgtRhhqvVrz6T/verify",
				params
		);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testUpdate() throws StripeException {
		Source src = new Source();
		src.setId("src_test_update");

		Map<String, String> metadata = new HashMap<String, String>();
		metadata.put("order_id", "6735");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("metadata", metadata);
		src.update(params);

		verifyPost(Source.class, "https://api.stripe.com/v1/sources/src_test_update", params);
		verifyNoMoreInteractions(networkMock);
	}

	@Test
	public void testDetachAttachedSource() throws StripeException {
		Source src = new Source();
		src.setId("src_test_detach");
		src.setCustomer("cus_test");

		src.detach();
		verifyDelete(
				Source.class,
				"https://api.stripe.com/v1/customers/cus_test/sources/src_test_detach"
		);
		verifyNoMoreInteractions(networkMock);
	}

	@Test(expected = InvalidRequestException.class)
	public void testDetachUnattachedSource() throws StripeException {
		Source src = new Source();
		src.setId("src_test_detach");

		src.detach();
	}
}
