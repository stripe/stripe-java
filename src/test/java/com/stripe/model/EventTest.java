package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.model.Event;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventTest extends BaseStripeTest {
	@Test
	public void nestedObjectDeserializesToModel() throws IOException {
		String json = resource("account_event.json");
		Event event = StripeObject.PRETTY_PRINT_GSON.fromJson(json, Event.class);

		// Thanks to some GSON magic, the object nested within the event can be
		// typecast to its expected type.
		Account account = (com.stripe.model.Account)event.getData().getObject();

		assertEquals(account.getEmail(), "test@stripe.com");
	}
}
