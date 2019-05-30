package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class StripeResponseTest extends BaseStripeTest {
  String chargeBody;

  private Map<String, List<String>> generateHeaderMap() {
    final List<String> idempotencyHeader = new ArrayList<>();
    idempotencyHeader.add("12345");

    final List<String> requestIdHeader = new ArrayList<>();
    requestIdHeader.add("req_12345");

    final Map<String, List<String>> headerMap = new HashMap<>();
    headerMap.put("Idempotency-Key", idempotencyHeader);
    headerMap.put("Request-Id", requestIdHeader);

    return headerMap;
  }

  @Test
  public void testCode() {
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody);
    assertEquals(200, stripeResponse.code());
    stripeResponse = new StripeResponse(201, chargeBody);
    assertEquals(201, stripeResponse.code());
  }

  @Test
  public void testBody() {
    final StripeResponse stripeResponse = new StripeResponse(200, chargeBody);
    assertEquals(200, stripeResponse.code());
    assertEquals(chargeBody, stripeResponse.body());
  }

  @Test
  public void testHeaders() {
    final Map<String, List<String>> headerMap = generateHeaderMap();
    final StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertNotNull(stripeResponse.headers());
  }

  @Test
  public void testNoHeaders() {
    final StripeResponse stripeResponse = new StripeResponse(200, chargeBody);
    assertEquals(stripeResponse.headers(), null);
    assertEquals(stripeResponse.idempotencyKey(), null);
    assertEquals(stripeResponse.requestId(), null);
  }

  @Test
  public void testGetIdempotencyKey() {
    final Map<String, List<String>> headerMap = generateHeaderMap();
    final StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertEquals("12345", stripeResponse.idempotencyKey());
  }

  @Test
  public void testRequestId() {
    final Map<String, List<String>> headerMap = generateHeaderMap();
    final StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertEquals("req_12345", stripeResponse.requestId());
  }
}
