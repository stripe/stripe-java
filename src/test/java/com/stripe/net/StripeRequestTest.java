package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;

import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class StripeRequestTest extends BaseStripeTest {
  private final RequestOptions options;

  public StripeRequestTest() {
    options = RequestOptions.builder().setApiKey("sk_test_123").build();
  }

  static class TestParams extends ApiRequestParams {
    @SerializedName("name")
    public Object name;

    @SerializedName("nested")
    public NestedParams nested;
  }

  static class NestedParams {
    @SerializedName("email")
    public Object email;
  }

  @Test
  public void testCtorGetRequest() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            options);

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
            options);

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
            options);

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
            options);

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
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                RequestOptions.builder()
                    .setApiKey("sk_override")
                    .setIdempotencyKey("idempotency_key")
                    .setStripeAccount("acct_456"),
                "2012-12-21")
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
    AuthenticationException e =
        assertThrows(
            AuthenticationException.class,
            () -> {
              new StripeRequest(
                  ApiResource.RequestMethod.GET,
                  "http://example.com/get",
                  null,
                  RequestOptions.builder().build());
            });
    assertTrue(e.getMessage().contains("No API key provided."));
  }

  @Test
  public void testCtorThrowsOnEmptyApiKey() throws StripeException {
    AuthenticationException e =
        assertThrows(
            AuthenticationException.class,
            () -> {
              new StripeRequest(
                  ApiResource.RequestMethod.GET,
                  "http://example.com/get",
                  null,
                  RequestOptions.builder().setApiKey("").build());
            });
    assertTrue(e.getMessage().contains("Your API key is invalid, as it is an empty string."));
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
                    ApiResource.RequestMethod.GET,
                    "http://example.com/get",
                    null,
                    RequestOptions.builder().setApiKey("sk_test _123\n").build());
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
            options);
    StripeRequest updatedRequest = request.withAdditionalHeader("New-Header", "bar");
    assertTrue(updatedRequest.headers().firstValue("New-Header").isPresent());
    assertEquals("bar", updatedRequest.headers().firstValue("New-Header").get());
  }

  @Test
  public void testBuildContentIsNullWhenRequestIsGet() throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("key", "value!"),
            options);
    assertNull(request.content());
  }

  @Test
  public void testBuildContentHasFormEncodedContentWhenRequestIsPostAndApiVersionV1()
      throws StripeException {
    StripeRequest request =
        new StripeRequest(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("key", "value!"),
            options);
    assertInstanceOf(HttpContent.class, request.content());
    assertEquals(
        "application/x-www-form-urlencoded;charset=UTF-8", request.content().contentType());
    assertArrayEquals(
        "key=value%21".getBytes(StandardCharsets.UTF_8), request.content().byteArrayContent());
  }
}
