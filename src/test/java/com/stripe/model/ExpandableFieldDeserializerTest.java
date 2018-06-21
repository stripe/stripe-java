package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ExpandableFieldDeserializerTest extends BaseStripeTest {

  private static Gson gson = ApiResource.GSON;

  private static class TestObject implements HasId {
    String id;
    int bar;

    @Override
    public String getId() {
      return id;
    }
  }

  @Test
  public void deserializeNull() throws IOException {
    final String json = gson.toJson(null);
    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final ExpandableField<TestObject> out = gson.fromJson(json,
        new TypeToken<ExpandableField<TestObject>>() {}.getType());
    assertNull(out);
  }

  @Test
  public void deserializeString() throws IOException {
    final String json = gson.toJson("just_an_id");
    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final ExpandableField<TestObject> out = gson.fromJson(json,
        new TypeToken<ExpandableField<TestObject>>() {}.getType());
    assertEquals("just_an_id", out.getId());
    assertFalse(out.isExpanded());
  }

  @Test
  public void deserializeObject() throws IOException {
    final Map<String, Object> anObject = new HashMap<String, Object>();
    anObject.put("id", "an_id_here");
    anObject.put("bar", 12);
    final String json = gson.toJson(anObject);

    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final ExpandableField<TestObject> out = gson.fromJson(json,
        new TypeToken<ExpandableField<TestObject>>() {}.getType());
    assertEquals("an_id_here", out.getId());
    assertEquals("an_id_here", out.getExpanded().id);
    assertEquals(12, out.getExpanded().bar);
  }
}
