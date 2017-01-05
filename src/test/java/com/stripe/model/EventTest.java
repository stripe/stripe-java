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

	@Test
	public void serializesToJson() throws IOException {
		String json = resource("account_event.json");
		Event event = StripeObject.PRETTY_PRINT_GSON.fromJson(json, Event.class);

		Event reserializedEvent = StripeObject.PRETTY_PRINT_GSON.fromJson(event.toJson(), Event.class);

		assertEquals(reserializedEvent.getId(), event.getId());
		assertEquals(reserializedEvent.getObject(), event.getObject());
		assertEquals(reserializedEvent.getApiVersion(), event.getApiVersion());
		assertEquals(reserializedEvent.getCreated(), event.getCreated());
		assertEquals(reserializedEvent.getLivemode(), event.getLivemode());
		assertEquals(reserializedEvent.getRequest(), event.getRequest());
		assertEquals(reserializedEvent.getType(), event.getType());
		assertEquals(reserializedEvent.getUserId(), event.getUserId());
	}
}
