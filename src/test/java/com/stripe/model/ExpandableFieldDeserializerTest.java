package com.stripe.model;

import com.google.gson.Gson;
import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ExpandableFieldDeserializerTest extends BaseStripeTest {

	private static Gson gson = APIResource.GSON;

	private class TestObject implements HasId {
		String id;
		int bar;
		public String getId() {
			return id;
		}
	}

	@Test
	public void deserializeNull() throws IOException {
		String json = gson.toJson(null);
		//Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate that here:
		ExpandableField out = gson.fromJson(json, new TypeToken<ExpandableField<TestObject>>() {}.getType());
		assertNull(out);
	}

	@Test
	public void deserializeString() throws IOException {
		String json = gson.toJson("just_an_id");
		//Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate that here:
		ExpandableField out = gson.fromJson(json, new TypeToken<ExpandableField<TestObject>>() {}.getType());
		assertEquals(out.getId(), "just_an_id");
		assertFalse(out.isExpanded());
	}

	@Test
	public void deserializeObject() throws IOException {
		Map<String, Object> anObject = new HashMap<String, Object>();
		anObject.put("id", "an_id_here");
		anObject.put("bar", 12);
		String json = gson.toJson(anObject);

		//Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate that here:
		ExpandableField<TestObject> out = gson.fromJson(json, new TypeToken<ExpandableField<TestObject>>() {}.getType());
		assertEquals(out.getId(), "an_id_here");
		assertEquals(out.getExpanded().id, "an_id_here");
		assertEquals(out.getExpanded().bar, 12);
	}
}
