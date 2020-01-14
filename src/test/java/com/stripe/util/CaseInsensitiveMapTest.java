package com.stripe.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.AbstractMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CaseInsensitiveMapTest {
  @Test
  public void testOfWithMap() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertNotNull(map);
  }

  @Test
  public void testOfWithNull() {
    CaseInsensitiveMap<String> map = CaseInsensitiveMap.of(null);
    assertNull(map);
  }

  @Test
  public void testSize() {
    CaseInsensitiveMap<String> map = new CaseInsensitiveMap<>();
    assertEquals(0, map.size());

    map = CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertEquals(1, map.size());

    map =
        CaseInsensitiveMap.of(
            ImmutableMap.of("Some-Key", "Some value!", "Another-Key", "Another value!"));
    assertEquals(2, map.size());
  }

  @Test
  public void testIsEmpty() {
    CaseInsensitiveMap<String> map = new CaseInsensitiveMap<>();
    assertTrue(map.isEmpty());

    map = CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertFalse(map.isEmpty());

    map =
        CaseInsensitiveMap.of(
            ImmutableMap.of("Some-Key", "Some value!", "Another-Key", "Another value!"));
    assertFalse(map.isEmpty());
  }

  @Test
  public void testContainsKey() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertTrue(map.containsKey("Some-Key"));
    assertTrue(map.containsKey("some-key"));
    assertTrue(map.containsKey("SOME-KEY"));
    assertTrue(map.containsKey("sOmE-kEy"));
    assertFalse(map.containsKey("Some_Key"));
    assertFalse(map.containsKey("Some Key"));
  }

  @Test
  public void testContainsValue() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertTrue(map.containsValue("Some value!"));
    assertFalse(map.containsValue("some value!"));
  }

  @Test
  public void testGet() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    assertEquals("Some value!", map.get("Some-Key"));
    assertEquals("Some value!", map.get("some-key"));
    assertEquals("Some value!", map.get("SOME-KEY"));
    assertEquals("Some value!", map.get("sOmE-kEy"));
  }

  @Test
  public void testPut() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    map.put("Another-Key", "Another value!");
    assertEquals("Another value!", map.get("Another-Key"));
    assertEquals("Another value!", map.get("another-key"));
    assertEquals("Another value!", map.get("ANOTHER-KEY"));
    assertEquals("Another value!", map.get("aNoThER-kEy"));
  }

  @Test
  public void testRemove() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    map.remove("some-key");
    assertFalse(map.containsKey("Some-Key"));
    assertFalse(map.containsKey("some-key"));
  }

  @Test
  public void testPutAll() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    map.putAll(
        ImmutableMap.of("Another-Key", "Another value!", "Yet-Another-Key", "Yet another value!"));
    assertEquals("Another value!", map.get("Another-Key"));
    assertEquals("Another value!", map.get("another-key"));
    assertEquals("Yet another value!", map.get("Yet-Another-Key"));
    assertEquals("Yet another value!", map.get("yet-another-key"));
  }

  @Test
  public void testClear() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    map.clear();
    assertFalse(map.containsKey("Some-Key"));
    assertFalse(map.containsKey("some-key"));
    assertEquals(0, map.size());
    assertTrue(map.isEmpty());
  }

  @Test
  public void testKeySet() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(
            ImmutableMap.of("Some-Key", "Some value!", "Another-Key", "Another value!"));
    assertEquals(ImmutableSet.of("Some-Key", "Another-Key"), map.keySet());
  }

  @Test
  public void testValues() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(
            ImmutableMap.of("Some-Key", "Some value!", "Another-Key", "Another value!"));
    assertEquals(ImmutableList.of("Some value!", "Another value!"), map.values());
  }

  @Test
  public void testEntrySet() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(
            ImmutableMap.of("Some-Key", "Some value!", "Another-Key", "Another value!"));
    assertEquals(
        ImmutableSet.of(
            new AbstractMap.SimpleEntry<String, String>("Some-Key", "Some value!"),
            new AbstractMap.SimpleEntry<String, String>("Another-Key", "Another value!")),
        map.entrySet());
  }

  @Test
  public void testEquals() {
    CaseInsensitiveMap<String> ciMap =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));

    Map<String, String> map1 = ImmutableMap.of("Some-Key", "Some value!");
    assertTrue(ciMap.equals(map1));
    assertTrue(map1.equals(ciMap));

    Map<String, String> map2 = ImmutableMap.of("some-key", "Some value!");
    assertFalse(ciMap.equals(map2));
    assertFalse(map2.equals(ciMap));
  }

  @Test
  public void testNullKey() {
    CaseInsensitiveMap<String> map =
        CaseInsensitiveMap.of(ImmutableMap.of("Some-Key", "Some value!"));
    map.put(null, "null key entry");
    assertEquals("null key entry", map.get(null));
  }
}
