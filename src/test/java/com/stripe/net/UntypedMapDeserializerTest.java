package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class UntypedMapDeserializerTest {

  private UntypedMapDeserializer untypedMapDeserializer = new UntypedMapDeserializer();

  private UntypedMapDeserializer flatteningDeserializer =
      new UntypedMapDeserializer(
          (outerMap, jsonEntry, untypedMapDeserializer) -> {
            JsonElement value = jsonEntry.getValue();
            if (value.isJsonObject()) {
              outerMap.putAll(untypedMapDeserializer.deserialize(value.getAsJsonObject()));
            } else {
              outerMap.put(
                  jsonEntry.getKey(), untypedMapDeserializer.deserializeJsonElement(value));
            }
            return;
          });

  @Test
  @SuppressWarnings("unchecked")
  public void testMapOfArray() {
    JsonObject jsonObject =
        jsonObject("foo_array", jsonArray(jsonString("foo1"), jsonString("foo2")));
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
    jsonObject.add(
        "foo_array",
        jsonArray(jsonObject("foo", jsonNumber(2L)), jsonObject("bar", jsonNumber(3L))));
    Map<String, Object> untyped = untypedMapDeserializer.deserialize(jsonObject);
    List<Object> objects = (List<Object>) untyped.get("foo_array");
    assertEquals(ImmutableMap.of("foo", 2L), objects.get(0));
    assertEquals(ImmutableMap.of("bar", 3L), objects.get(1));
  }

  @Test
  public void tesStrategyFlattenAllSchema() {
    // {"parent": {"child": {"grand_child": 1}}}
    JsonObject jsonObject = new JsonObject();
    jsonObject.add("parent", jsonObject("child", jsonObject("grand_child", jsonNumber(1L))));
    Map<String, Object> untyped = flatteningDeserializer.deserialize(jsonObject);
    // innermost remains
    assertEquals(ImmutableMap.of("grand_child", 1L), untyped);
  }

  @Test
  public void tesStrategyFlattenInArraySchema() {
    JsonArray jsonArray =
        jsonArray(
            jsonObject("child", jsonObject("grand_child", jsonNumber(1L))),
            jsonObject("child", jsonObject("grand_child", jsonNumber(2L))),
            jsonObject("child", jsonObject("grand_child", jsonNumber(3L))));

    Object untyped = flatteningDeserializer.deserializeJsonElement(jsonArray);
    assertEquals(
        Arrays.asList(
            ImmutableMap.of("grand_child", 1L),
            ImmutableMap.of("grand_child", 2L),
            ImmutableMap.of("grand_child", 3L)),
        untyped);
  }

  @Test
  public void tesStrategyRenameKey() {
    UntypedMapDeserializer renamer =
        new UntypedMapDeserializer(
            (outerMap, jsonEntry, untypedMapDeserializer) -> {
              JsonElement value = jsonEntry.getValue();
              outerMap.put(
                  jsonEntry.getKey() + "_foo",
                  untypedMapDeserializer.deserializeJsonElement(value));
            });

    JsonObject jsonObject = new JsonObject();
    jsonObject.add("child", jsonObject("grand_child", jsonNumber(1L)));
    Map<String, Object> untyped = renamer.deserialize(jsonObject);
    assertEquals(untyped, ImmutableMap.of("child_foo", ImmutableMap.of("grand_child_foo", 1L)));
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
