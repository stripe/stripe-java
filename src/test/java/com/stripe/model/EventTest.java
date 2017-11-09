package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.model.Event;
import com.stripe.net.APIResource;

import com.google.gson.Gson;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventTest extends BaseStripeTest {
	private static Gson gson = APIResource.GSON;

	@Test
	public void nestedObjectDeserializesToModel() throws IOException {
		String json = resource("account_event.json");
		Event event = gson.fromJson(json, Event.class);

		// Thanks to some GSON magic, the object nested within the event can be
		// typecast to its expected type.
		Account account = (com.stripe.model.Account) event.getData().getObject();

		assertEquals(account.getEmail(), "test@stripe.com");
	}

	@Test
	public void serializesToJson() throws IOException {
		String json = resource("account_event.json");
		Event event = gson.fromJson(json, Event.class);

		Event reserializedEvent = gson.fromJson(event.toJson(), Event.class);

		assertEquals(reserializedEvent.getId(), event.getId());
		assertEquals(reserializedEvent.getObject(), event.getObject());
		assertEquals(reserializedEvent.getAccount(), event.getAccount());
		assertEquals(reserializedEvent.getApiVersion(), event.getApiVersion());
		assertEquals(reserializedEvent.getCreated(), event.getCreated());
		assertEquals(reserializedEvent.getLivemode(), event.getLivemode());
		assertEquals(reserializedEvent.getRequest().getId(), event.getRequest().getId());
		assertEquals(reserializedEvent.getRequest().getIdempotencyKey(), event.getRequest().getIdempotencyKey());
		assertEquals(reserializedEvent.getType(), event.getType());
	}

	@Test
	public void supportsOldRequest() throws IOException {
		String json = resource("event_old_request.json");
		Event event = StripeObject.PRETTY_PRINT_GSON.fromJson(json, Event.class);
		assertEquals(event.getRequest().getId(), "req_Ait4gLD2CQhStB");
	}
}
