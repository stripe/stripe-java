package com.stripe.net;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class UntypedMapDeserializerTest {

  private UntypedMapDeserializer untypedMapDeserializer = new UntypedMapDeserializer();

  @Test
  @SuppressWarnings("unchecked")
  public void testMapOfArray() {
    JsonObject jsonObject = jsonObject(
        "foo_array", jsonArray(jsonString("foo1"), jsonString("foo2")));
    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    List<Object> fooArray = (List<Object>) untyped.get("foo_array");
    assertEquals("foo1", fooArray.get(0));
    assertEquals("foo2", fooArray.get(1));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMapOfMap() {
    JsonObject nestedJsonObject = new JsonObject();
    nestedJsonObject.add("inner_foo1", jsonString("foo1"));
    nestedJsonObject.add("inner_foo2", jsonString("foo2"));
    JsonObject jsonObject = jsonObject("foo", nestedJsonObject);

    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    Map<String, Object> innerFoo = (Map<String, Object>) untyped.get("foo");
    assertEquals("foo1", innerFoo.get("inner_foo1"));
    assertEquals("foo2", innerFoo.get("inner_foo2"));
  }

  @Test
  public void testMapOfPrimitive() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.add("foo_long", jsonNumber(123L));
    jsonObject.add("foo_big_decimal", jsonNumber(new BigDecimal("0.33")));
    jsonObject.add("foo_double", jsonNumber(1.0 / 3));
    jsonObject.add("foo_string", jsonString("bar"));
    jsonObject.add("foo_null_instance", JsonNull.INSTANCE);
    jsonObject.add("foo_null", null);

    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    assertEquals(123L, untyped.get("foo_long"));
    assertEquals(new BigDecimal("0.33"), untyped.get("foo_big_decimal"));
    assertEquals(0.3333, (Double) untyped.get("foo_double"), 0.0001);
    assertEquals("bar", untyped.get("foo_string"));
    assertEquals(null, untyped.get("foo_null_instance"));
    assertEquals(null, untyped.get("foo_null"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMapOfEmptyMap() {
    JsonObject jsonObject = new JsonObject();
    JsonObject nestedJsonObject = new JsonObject();
    jsonObject.add("empty_map", nestedJsonObject);

    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    Map<String, Object> emptyMap = (Map<String, Object>) untyped.get("empty_map");
    assertEquals(0, emptyMap.size());
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMapOfArrayOfMap() {
    JsonObject jsonObject = new JsonObject();
    // "array": [{"foo": 2}, {"bar": 3}]
    jsonObject.add("foo_array", jsonArray(
        jsonObject("foo", jsonNumber(2L)),
        jsonObject("bar", jsonNumber(3L)))
    );
    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    List<Object> objects = (List<Object>) untyped.get("foo_array");
    assertEquals(ImmutableMap.of("foo", 2L), objects.get(0));
    assertEquals(ImmutableMap.of("bar", 3L), objects.get(1));
  }

  private JsonArray jsonArray(JsonElement... elements) {
    JsonArray jsonArray = new JsonArray();
    for (JsonElement primitive : elements) {
      jsonArray.add(primitive);
    }
    return jsonArray;
  }

  private JsonPrimitive jsonString(String string) {
    return new JsonPrimitive(string);
  }

  private JsonPrimitive jsonNumber(Number number) {
    return new JsonPrimitive(number);
  }

  private JsonObject jsonObject(String key, JsonElement element) {
    JsonObject jsonObject = new JsonObject();
    jsonObject.add(key, element);
    return jsonObject;
  }
}
