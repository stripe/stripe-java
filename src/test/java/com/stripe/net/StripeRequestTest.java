package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import com.stripe.param.common.EmptyParam;
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
        StripeRequest.create(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V1);

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
        StripeRequest.create(
            ApiResource.RequestMethod.GET,
            "http://example.com/get?customer=cus_xxx",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V1);

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
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V1);

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
        StripeRequest.create(
            ApiResource.RequestMethod.DELETE,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V1);

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
  public void testCtorV2PostRequest() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V2);

    assertEquals(ApiResource.RequestMethod.POST, request.method());
    assertEquals("http://example.com/post", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertTrue(request.headers().firstValue("Idempotency-Key").isPresent());
    assertFalse(request.headers().firstValue("Stripe-Account").isPresent());
    assertNotNull(request.content());
    assertEquals(
        "{\"string\":\"String!\"}",
        new String(request.content().byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void testCtorV2DeleteRequest() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.DELETE,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V2);

    assertEquals(ApiResource.RequestMethod.DELETE, request.method());
    assertEquals("http://example.com/get?string=String%21", request.url().toString());
    assertEquals("Bearer sk_test_123", request.headers().firstValue("Authorization").orElse(null));
    assertTrue(request.headers().firstValue("Stripe-Version").isPresent());
    assertTrue(request.headers().firstValue("Idempotency-Key").isPresent());
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
        StripeRequest.create(
            ApiResource.RequestMethod.GET, "http://example.com/get", null, options, ApiMode.V1);

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
              StripeRequest.create(
                  ApiResource.RequestMethod.GET,
                  "http://example.com/get",
                  null,
                  RequestOptions.builder().setApiKey(null).build(),
                  ApiMode.V1);
            });
    assertTrue(e.getMessage().contains("No API key provided."));
  }

  @Test
  public void testCtorThrowsOnEmptyApiKey() throws StripeException {
    AuthenticationException e =
        assertThrows(
            AuthenticationException.class,
            () -> {
              StripeRequest.create(
                  ApiResource.RequestMethod.GET,
                  "http://example.com/get",
                  null,
                  RequestOptions.builder().setApiKey("").build(),
                  ApiMode.V1);
            });
    assertTrue(e.getMessage().contains("Your API key is invalid, as it is an empty string."));
  }

  @Test
  public void testCtorThrowsOnApiKeyContainingWhitespace() throws StripeException {
    AuthenticationException e =
        assertThrows(
            AuthenticationException.class,
            () -> {
              StripeRequest.create(
                  ApiResource.RequestMethod.GET,
                  "http://example.com/get",
                  null,
                  RequestOptions.builder().setApiKey("sk_test _123\n").build(),
                  ApiMode.V1);
            });
    assertTrue(e.getMessage().contains("Your API key is invalid, as it contains whitespace."));
  }

  @Test
  public void testWithAdditionalHeader() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            options,
            ApiMode.V1);
    StripeRequest updatedRequest = request.withAdditionalHeader("New-Header", "bar");
    assertTrue(updatedRequest.headers().firstValue("New-Header").isPresent());
    assertEquals("bar", updatedRequest.headers().firstValue("New-Header").get());
  }

  @Test
  public void testBuildContentIsNullWhenRequestIsGet() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            ImmutableMap.of("key", "value!"),
            options,
            ApiMode.V1);

    assertNull(request.content());
  }

  @Test
  public void testBuildContentIsNullWhenRequestIsGetCreateWithStringContent()
      throws StripeException {
    StripeRequest request =
        StripeRequest.createWithStringContent(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            "key=value!",
            options,
            ApiMode.V1);

    assertNull(request.content());
  }

  @Test
  public void testBuildsJsonContentWhenV2Mode() throws StripeException {
    StripeRequest request =
        StripeRequest.createWithStringContent(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            "{\"key\":\"value!\"}",
            options,
            ApiMode.V2);

    assertInstanceOf(HttpContent.class, request.content());
    assertEquals("application/json", request.content().contentType());
    assertArrayEquals(
        "{\"key\":\"value!\"}".getBytes(StandardCharsets.UTF_8),
        request.content().byteArrayContent());
  }

  @Test
  public void testBuildContentHasFormEncodedContentWhenRequestIsPostAndApiVersionV1()
      throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("key", "value!"),
            options,
            ApiMode.V1);

    assertInstanceOf(HttpContent.class, request.content());
    assertEquals(
        "application/x-www-form-urlencoded;charset=UTF-8", request.content().contentType());
    assertArrayEquals(
        "key=value%21".getBytes(StandardCharsets.UTF_8), request.content().byteArrayContent());
  }

  @Test
  public void testBuildHeadersHasStripeAccount() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            null,
            RequestOptions.builder().setStripeAccount("acct").setApiKey("123").build(),
            ApiMode.V2);

    assertEquals("acct", request.headers().firstValue("Stripe-Account").get());
  }

  @Test
  public void testBuildHeadersHasStripeContext() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            null,
            RequestOptions.builder().setStripeContext("ctx").setApiKey("123").build(),
            ApiMode.V2);

    assertEquals("ctx", request.headers().firstValue("Stripe-Context").get());
  }

  @Test
  public void testBuildHeadersIgnoresNullAccount() throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            null,
            RequestOptions.builder().setStripeAccount(null).setApiKey("123").build(),
            ApiMode.V2);

    assertFalse(request.headers().map().containsKey("Stripe-Account"));
  }

  @Test
  public void testBuildContentHasJsonContentWhenRequestIsPostAndApiVersionV2()
      throws StripeException {
    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ImmutableMap.of("key", "value!"),
            options,
            ApiMode.V2);

    assertInstanceOf(HttpContent.class, request.content());
    assertEquals("application/json", request.content().contentType());
    assertEquals("application/json", request.headers().firstValue("Content-Type").get());

    assertArrayEquals(
        "{\"key\":\"value!\"}".getBytes(StandardCharsets.UTF_8),
        request.content().byteArrayContent());
  }

  @Test
  public void testBuildContentEncodesEmptyParamAsNullForV2JsonRequest() throws StripeException {
    TestParams params = new TestParams();
    params.name = EmptyParam.EMPTY;
    params.nested = new NestedParams();
    params.nested.email = EmptyParam.EMPTY;

    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/post",
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V2);

    assertEquals("{\"name\":null,\"nested\":{\"email\":null}}", request.content().stringContent());
  }
}
