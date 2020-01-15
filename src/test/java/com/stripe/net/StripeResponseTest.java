package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class StripeResponseTest extends BaseStripeTest {
  private HttpHeaders emptyHeaders = HttpHeaders.of(Collections.emptyMap());

  @Test
  public void testCtorNullHeaders() {
    assertThrows(
        NullPointerException.class,
        () -> {
          new StripeResponse(200, null, "");
        });
  }

  @Test
  public void testCtorNullBody() {
    assertThrows(
        NullPointerException.class,
        () -> {
          new StripeResponse(200, emptyHeaders, null);
        });
  }

  @Test
  public void testCode() {
    StripeResponse stripeResponse = new StripeResponse(200, emptyHeaders, "");
    assertEquals(200, stripeResponse.code());
    stripeResponse = new StripeResponse(201, emptyHeaders, "");
    assertEquals(201, stripeResponse.code());
  }

  @Test
  public void testBody() {
    final StripeResponse stripeResponse = new StripeResponse(200, emptyHeaders, "Response body");
    assertEquals(200, stripeResponse.code());
    assertEquals("Response body", stripeResponse.body());
  }

  @Test
  public void testHeaders() {
    Map<String, List<String>> headerMap =
        ImmutableMap.of("Some-Header", ImmutableList.of("First value", "Second value"));
    final StripeResponse stripeResponse = new StripeResponse(200, HttpHeaders.of(headerMap), "");
    assertNotNull(stripeResponse.headers());
    assertTrue(stripeResponse.headers().firstValue("Some-Header").isPresent());
    assertEquals("First value", stripeResponse.headers().firstValue("Some-Header").get());
  }

  @Test
  public void testDate() {
    Map<String, List<String>> headerMap =
        ImmutableMap.of("Date", ImmutableList.of("Fri, 13 Feb 2009 23:31:30 GMT"));
    final StripeResponse stripeResponse = new StripeResponse(200, HttpHeaders.of(headerMap), "");
    assertEquals(Instant.ofEpochSecond(1234567890), stripeResponse.date());
  }

  @Test
  public void testIdempotencyKey() {
    Map<String, List<String>> headerMap =
        ImmutableMap.of("Idempotency-Key", ImmutableList.of("12345"));
    final StripeResponse stripeResponse = new StripeResponse(200, HttpHeaders.of(headerMap), "");
    assertEquals("12345", stripeResponse.idempotencyKey());
  }

  @Test
  public void testRequestId() {
    Map<String, List<String>> headerMap =
        ImmutableMap.of("Request-Id", ImmutableList.of("req_12345"));
    final StripeResponse stripeResponse = new StripeResponse(200, HttpHeaders.of(headerMap), "");
    assertEquals("req_12345", stripeResponse.requestId());
  }
}
