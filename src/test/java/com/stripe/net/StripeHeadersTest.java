package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.BaseStripeTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class StripeHeadersTest extends BaseStripeTest {

  private Map<String, List<String>> generateHeaderMap() {
    final List<String> multiValueHeader = new ArrayList<>();
    multiValueHeader.add("FirstValue");
    multiValueHeader.add("SecondValue");

    final List<String> requestIdHeader = new ArrayList<>();
    requestIdHeader.add("req_12345");

    final Map<String, List<String>> headerMap = new HashMap<>();
    headerMap.put("Request-Id", requestIdHeader);
    headerMap.put("Multi-Val", multiValueHeader);
    headerMap.put("Empty-Header", new ArrayList<String>());

    return headerMap;
  }

  @Test
  public void testDuplicatedKeyError() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          final Map<String, List<String>> headerMap = new HashMap<>();
          headerMap.put("Request-Id", Arrays.asList("req_123"));
          headerMap.put("request-id", Arrays.asList("req_123"));

          new StripeHeaders(headerMap);
        });
  }

  @Test
  public void testGet() {
    final StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals("req_12345", headers.get("Request-Id"));
    assertEquals("FirstValue", headers.get("Multi-Val"));
  }

  @Test
  public void testGetCaseInsensitive() {
    final StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals("req_12345", headers.get("request-id"));
    assertEquals("FirstValue", headers.get("multi-val"));
  }

  @Test
  public void testValues() {
    final StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals(2, headers.values("Multi-Val").size());
    assertEquals("FirstValue", headers.values("Multi-Val").get(0));
    assertEquals("SecondValue", headers.values("Multi-Val").get(1));
  }

  @Test
  public void testGetEmpty() {
    final StripeHeaders headers = new StripeHeaders(generateHeaderMap());
    assertEquals(null, headers.get("Empty-Header"));
  }
}
