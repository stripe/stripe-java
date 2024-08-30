package com.stripe;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RawRequestTest extends BaseStripeTest {
  private static MockWebServer server;
  private static StripeClient client;
  private StripeResponseGetter responseGetter;

  @BeforeEach
  void setUp() throws IOException {
    server = new MockWebServer();
    server.start();
    Stripe.overrideApiBase(server.url("").toString());
    responseGetter =
        Mockito.spy(
            new LiveStripeResponseGetter(
                StripeClient.builder()
                    .setApiKey(TEST_API_KEY)
                    .setApiBase(server.url("").toString())
                    .buildOptions(),
                new HttpURLConnectionClient()));
    client = new StripeClient(responseGetter);
  }

  @AfterEach
  void tearDown() throws IOException {
    server.shutdown();
  }

  @Test
  public void testStandardRequestGlobal() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        Stripe.rawRequest(
            RequestMethod.POST, "/v1/customers", "description=test+customer", options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    RecordedRequest request = server.takeRequest();
    assertEquals(
        "application/x-www-form-urlencoded;charset=UTF-8", request.getHeader("Content-Type"));
    assertEquals(Stripe.API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals("description=test+customer", request.getBody().readUtf8());
  }

  @Test
  public void testNullOptionsGlobal() throws StripeException, InterruptedException {
    server.enqueue(new MockResponse().setBody("{}"));
    final StripeResponse response =
        Stripe.rawRequest(RequestMethod.POST, "/v1/customers", "description=test+customer", null);
    assertNotNull(response);
  }

  @Test
  public void testPreviewPostRequestGlobal() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody("{\"id\": \"sub_sched_123\",\n  \"object\": \"subscription_schedule\"}"));
    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        Stripe.rawRequest(
            RequestMethod.POST,
            "/v1/subscription_schedules",
            "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}",
            options);

    RecordedRequest request = server.takeRequest();
    assertEquals("application/json", request.getHeader("Content-Type"));
    assertEquals(Stripe.PREVIEW_API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals(
        "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}",
        request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testPreviewGetRequestGlobal() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody("{\"id\": \"sub_sched_123\",\n  \"object\": \"subscription_schedule\"}"));
    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        Stripe.rawRequest(RequestMethod.GET, "/v1/subscription_schedules", "", options);

    RecordedRequest request = server.takeRequest();
    assertEquals(null, request.getHeader("Content-Type"));
    assertEquals(Stripe.PREVIEW_API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals("", request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testAdditionalHeadersGlobal() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    Map<String, String> additionalHeaders = new HashMap<>();

    additionalHeaders.put("foo", "bar");
    final RawRequestOptions options =
        RawRequestOptions.builder().setAdditionalHeaders(additionalHeaders).build();

    assertEquals(additionalHeaders, options.getAdditionalHeaders());

    final StripeResponse response =
        Stripe.rawRequest(RequestMethod.GET, "/v1/customers", null, options);

    RecordedRequest request = server.takeRequest();
    assertEquals("bar", request.getHeader("foo"));

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testDeserializeGlobal() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        Stripe.rawRequest(
            RequestMethod.POST, "/v1/customers", "description=test+customer", options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    Customer customer = (Customer) client.deserialize(response.body());
    assertTrue(customer.getId().startsWith("cus_"));
    assertEquals("test customer", customer.getDescription());
  }

  @Test
  public void testRaisesErrorWhenGetRequestAndContentIsNonNullGlobal() throws StripeException {
    try {
      Stripe.rawRequest(RequestMethod.GET, "/v1/customers", "key=value!", null);
      fail("Expected illegal argument exception.");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("content is not allowed for non-POST requests."));
    }
  }

  @Test
  public void testNullOptionsClient() throws StripeException, InterruptedException {
    server.enqueue(new MockResponse().setBody("{}"));
    final StripeResponse response =
        client.rawRequest(RequestMethod.POST, "/v1/customers", "description=test+customer", null);
    assertNotNull(response);
  }

  @Test
  public void testStandardRequestClient() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        client.rawRequest(
            RequestMethod.POST, "/v1/customers", "description=test+customer", options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    RecordedRequest request = server.takeRequest();
    assertEquals(
        "application/x-www-form-urlencoded;charset=UTF-8", request.getHeader("Content-Type"));
    assertEquals(Stripe.API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals("description=test+customer", request.getBody().readUtf8());
  }

  @Test
  public void testPreviewPostRequestClient() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody("{\"id\": \"sub_sched_123\",\n  \"object\": \"subscription_schedule\"}"));
    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        client.rawRequest(
            RequestMethod.POST,
            "/v1/subscription_schedules",
            "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}",
            options);

    RecordedRequest request = server.takeRequest();
    assertEquals("application/json", request.getHeader("Content-Type"));
    assertEquals(Stripe.PREVIEW_API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals(
        "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}",
        request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testPreviewGetRequestClient() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody("{\"id\": \"sub_sched_123\",\n  \"object\": \"subscription_schedule\"}"));
    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        client.rawRequest(RequestMethod.GET, "/v1/subscription_schedules", "", options);

    RecordedRequest request = server.takeRequest();
    assertEquals(null, request.getHeader("Content-Type"));
    assertEquals(Stripe.PREVIEW_API_VERSION, request.getHeader("Stripe-Version"));
    assertEquals("", request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testAdditionalHeadersClient() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    Map<String, String> additionalHeaders = new HashMap<>();

    additionalHeaders.put("foo", "bar");
    final RawRequestOptions options =
        RawRequestOptions.builder().setAdditionalHeaders(additionalHeaders).build();

    assertEquals(additionalHeaders, options.getAdditionalHeaders());

    final StripeResponse response =
        client.rawRequest(RequestMethod.GET, "/v1/customers", null, options);

    RecordedRequest request = server.takeRequest();
    assertEquals("bar", request.getHeader("foo"));

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testDeserializeClient() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final RawRequestOptions options = RawRequestOptions.builder().setApiKey("sk_123").build();

    final StripeResponse response =
        client.rawRequest(
            RequestMethod.POST, "/v1/customers", "description=test+customer", options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    Customer customer = (Customer) client.deserialize(response.body());
    assertTrue(customer.getId().startsWith("cus_"));
    assertEquals("test customer", customer.getDescription());
    assertTrue(Mockito.mockingDetails(responseGetter).getInvocations().stream().count() > 0);
  }

  @Test
  public void testRaisesErrorWhenGetRequestAndContentIsNonNullClient() throws StripeException {
    try {
      client.rawRequest(RequestMethod.GET, "/v1/customers", "key=value!", null);
      fail("Expected illegal argument exception.");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("content is not allowed for non-POST requests."));
    }
  }
}
