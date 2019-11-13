package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class StripeRequestTest extends BaseStripeTest {
  @Test
  public void testCtorGetRequest() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            null);

    assertEquals(ApiResource.RequestMethod.GET, request.method());
    assertEquals("http://example.com/get?string=String%21", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().get("Authorization"));
    assertTrue(request.headers().containsKey("Stripe-Version"));
    assertEquals(Stripe.API_VERSION, request.headers().get("Stripe-Version"));
    assertFalse(request.headers().containsKey("Idempotency-Key"));
    assertFalse(request.headers().containsKey("Stripe-Account"));
    assertNull(request.content());
  }

  @Test
  public void testCtorPostRequest() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("string", "String!"),
            null);

    assertEquals(ApiResource.RequestMethod.POST, request.method());
    assertEquals("http://example.com/post", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().get("Authorization"));
    assertTrue(request.headers().containsKey("Stripe-Version"));
    assertEquals(Stripe.API_VERSION, request.headers().get("Stripe-Version"));
    assertTrue(request.headers().containsKey("Idempotency-Key"));
    assertFalse(request.headers().containsKey("Stripe-Account"));
    assertNotNull(request.content());
    assertEquals(
        "string=String%21",
        new String(request.content().byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void testCtorDeleteRequest() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.DELETE,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            null);

    assertEquals(ApiResource.RequestMethod.DELETE, request.method());
    assertEquals("http://example.com/get?string=String%21", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().get("Authorization"));
    assertTrue(request.headers().containsKey("Stripe-Version"));
    assertEquals(Stripe.API_VERSION, request.headers().get("Stripe-Version"));
    assertFalse(request.headers().containsKey("Idempotency-Key"));
    assertFalse(request.headers().containsKey("Stripe-Account"));
    assertNull(request.content());
  }

  @Test
  public void testCtorRequestOptions() throws StripeException {
    RequestOptions options =
        RequestOptions.builder()
            .setApiKey("sk_override")
            .setIdempotencyKey("idempotency_key")
            .setStripeAccount("acct_456")
            .setStripeVersionOverride("2012-12-21")
            .build();
    StripeRequest request =
        new StripeRequest(ApiResource.RequestMethod.GET, "http://example.com/get", null, options);

    assertEquals(ApiResource.RequestMethod.GET, request.method());
    assertEquals("http://example.com/get", request.url().toString());
    assertEquals("Bearer sk_override", request.headers().get("Authorization"));
    assertTrue(request.headers().containsKey("Stripe-Version"));
    assertEquals("2012-12-21", request.headers().get("Stripe-Version"));
    assertTrue(request.headers().containsKey("Idempotency-Key"));
    assertEquals("idempotency_key", request.headers().get("Idempotency-Key"));
    assertTrue(request.headers().containsKey("Stripe-Account"));
    assertEquals("acct_456", request.headers().get("Stripe-Account"));
    assertNull(request.content());
  }

  @Test
  public void testCtorThrowsOnEmptyApiKey() throws StripeException {
    String origApiKey = Stripe.apiKey;

    try {
      Stripe.apiKey = null;

      AuthenticationException e =
          assertThrows(
              AuthenticationException.class,
              () -> {
                new StripeRequest(
                    ApiResource.RequestMethod.GET, "http://example.com/get", null, null);
              });
      assertTrue(e.getMessage().contains("No API key provided."));
    } finally {
      Stripe.apiKey = origApiKey;
    }
  }
}
