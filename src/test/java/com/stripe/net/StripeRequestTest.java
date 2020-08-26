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
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertEquals(Stripe.API_VERSION, request.headers().firstValue("Stripe-Version").get());
    assertFalse(request.headers().firstValue("Idempotency-Key").isPresent());
    assertFalse(request.headers().firstValue("Stripe-Account").isPresent());
    assertNull(request.content());
  }

  @Test
  public void testCtorGetRequestWithQueryString() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.GET,
            "http://example.com/get?customer=cus_xxx",
            ImmutableMap.of("string", "String!"),
            null);

    assertEquals(ApiResource.RequestMethod.GET, request.method());
    assertEquals(
        "http://example.com/get?customer=cus_xxx&string=String%21", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertEquals(Stripe.API_VERSION, request.headers().firstValue("Stripe-Version").get());
    assertFalse(request.headers().firstValue("Idempotency-Key").isPresent());
    assertFalse(request.headers().firstValue("Stripe-Account").isPresent());
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
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertEquals(Stripe.API_VERSION, request.headers().firstValue("Stripe-Version").get());
    assertTrue(request.headers().firstValue("Idempotency-Key").isPresent());
    assertFalse(request.headers().firstValue("Stripe-Account").isPresent());
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
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertEquals(Stripe.API_VERSION, request.headers().firstValue("Stripe-Version").get());
    assertFalse(request.headers().firstValue("Idempotency-Key").isPresent());
    assertFalse(request.headers().firstValue("Stripe-Account").isPresent());
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
    assertEquals("Bearer sk_override", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertEquals("2012-12-21", request.headers().firstValue("Stripe-Version").get());
    assertTrue(request.headers().firstValue("Idempotency-Key").isPresent());
    assertEquals("idempotency_key", request.headers().firstValue("Idempotency-Key").get());
    assertTrue(request.headers().firstValue("Stripe-Account").isPresent());
    assertEquals("acct_456", request.headers().firstValue("Stripe-Account").get());
    assertNull(request.content());
  }

  @Test
  public void testCtorThrowsOnNullApiKey() throws StripeException {
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

  @Test
  public void testCtorThrowsOnEmptyApiKey() throws StripeException {
    String origApiKey = Stripe.apiKey;

    try {
      Stripe.apiKey = "";

      AuthenticationException e =
          assertThrows(
              AuthenticationException.class,
              () -> {
                new StripeRequest(
                    ApiResource.RequestMethod.GET, "http://example.com/get", null, null);
              });
      assertTrue(e.getMessage().contains("Your API key is invalid, as it is an empty string."));
    } finally {
      Stripe.apiKey = origApiKey;
    }
  }

  @Test
  public void testCtorThrowsOnApiKeyContainingWhitespace() throws StripeException {
    String origApiKey = Stripe.apiKey;

    try {
      Stripe.apiKey = "sk_test_123\n";

      AuthenticationException e =
          assertThrows(
              AuthenticationException.class,
              () -> {
                new StripeRequest(
                    ApiResource.RequestMethod.GET, "http://example.com/get", null, null);
              });
      assertTrue(e.getMessage().contains("Your API key is invalid, as it contains whitespace."));
    } finally {
      Stripe.apiKey = origApiKey;
    }
  }

  @Test
  public void testWithAdditionalHeader() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            null);
    StripeRequest updatedRequest = request.withAdditionalHeader("New-Header", "bar");
    assertTrue(updatedRequest.headers().firstValue("New-Header").isPresent());
    assertEquals("bar", updatedRequest.headers().firstValue("New-Header").get());
  }
}
