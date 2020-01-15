package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class HttpHeadersTest extends BaseStripeTest {
  private Map<String, List<String>> headerMap =
      ImmutableMap.of("Some-Header", ImmutableList.of("First value", "Second value"));

  @Test
  public void testOfWithMap() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    assertNotNull(headers);
  }

  @Test
  public void testOfWithNull() {
    assertThrows(
        NullPointerException.class,
        () -> {
          HttpHeaders.of(null);
        });
  }

  @Test
  public void testWithAdditionalHeaderSingleValue() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    HttpHeaders newHeaders = headers.withAdditionalHeader("New-Header", "New value");
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("Some-Header"));
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("some-header"));
    assertEquals(ImmutableList.of("New value"), newHeaders.allValues("New-Header"));
    assertEquals(ImmutableList.of("New value"), newHeaders.allValues("new-header"));
  }

  @Test
  public void testWithAdditionalHeaderMultipleValues() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    HttpHeaders newHeaders =
        headers.withAdditionalHeader("New-Header", ImmutableList.of("New value", "Another value"));
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("Some-Header"));
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("some-header"));
    assertEquals(
        ImmutableList.of("New value", "Another value"), newHeaders.allValues("New-Header"));
    assertEquals(
        ImmutableList.of("New value", "Another value"), newHeaders.allValues("new-header"));
  }

  @Test
  public void testWithAdditionalHeaders() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    HttpHeaders newHeaders =
        headers.withAdditionalHeaders(
            ImmutableMap.of("New-Header", ImmutableList.of("New value", "Another value")));
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("Some-Header"));
    assertEquals(
        ImmutableList.of("First value", "Second value"), newHeaders.allValues("some-header"));
    assertEquals(
        ImmutableList.of("New value", "Another value"), newHeaders.allValues("New-Header"));
    assertEquals(
        ImmutableList.of("New value", "Another value"), newHeaders.allValues("new-header"));
  }

  @Test
  public void testAllValues() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    assertEquals(ImmutableList.of("First value", "Second value"), headers.allValues("Some-Header"));
    assertEquals(ImmutableList.of("First value", "Second value"), headers.allValues("some-header"));
    assertEquals(Collections.emptyList(), headers.allValues("Non-Existent-Header"));
  }

  @Test
  public void testFirstValue() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    assertTrue(headers.firstValue("Some-Header").isPresent());
    assertEquals("First value", headers.firstValue("Some-Header").get());
    assertTrue(headers.firstValue("some-header").isPresent());
    assertEquals("First value", headers.firstValue("some-header").get());
    assertFalse(headers.firstValue("Non-Existent-Header").isPresent());
  }

  @Test
  public void testMap() {
    HttpHeaders headers = HttpHeaders.of(this.headerMap);
    assertEquals(
        ImmutableMap.of("Some-Header", ImmutableList.of("First value", "Second value")),
        headers.map());
  }
}
