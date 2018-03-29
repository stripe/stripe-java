package com.stripe.net;

import static org.hamcrest.CoreMatchers.instanceOf;

import com.stripe.BaseStripeTest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeHeaders;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StripeResponseTest extends BaseStripeTest {
  String chargeBody;

  @Before
  public void clientId() throws IOException {
    chargeBody = resource("charge.json");
  }

  private Map<String, List<String>> generateHeaderMap () {
    Map<String, List<String>> headerMap = new HashMap<String, List<String>>();
    List<String> idempotencyHeader = new ArrayList<String>();
    idempotencyHeader.add("12345");
    List<String> requestIdHeader = new ArrayList<String>();
    requestIdHeader.add("req_12345");
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
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody);
    assertEquals(200, stripeResponse.code());
    assertEquals(chargeBody, stripeResponse.body());
  }

  @Test
  public void testHeaders() {
    Map<String, List<String>> headerMap = generateHeaderMap();
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertThat(stripeResponse.headers(), instanceOf(StripeHeaders.class));
  }

  @Test
  public void testNoHeaders() {
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody);
    assertEquals(stripeResponse.headers(), null);
    assertEquals(stripeResponse.idempotencyKey(), null);
    assertEquals(stripeResponse.requestId(), null);
  }

  @Test
  public void testGetIdempotencyKey() {
    Map<String, List<String>> headerMap = generateHeaderMap();
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertEquals("12345", stripeResponse.idempotencyKey());
  }

  @Test
  public void testRequestId() {
    Map<String, List<String>> headerMap = generateHeaderMap();
    StripeResponse stripeResponse = new StripeResponse(200, chargeBody, headerMap);
    assertEquals(stripeResponse.requestId(), "req_12345");
  }
}
