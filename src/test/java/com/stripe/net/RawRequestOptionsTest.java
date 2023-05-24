package com.stripe.net;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.net.RawRequestOptions.ApiMode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RawRequestOptionsTest extends BaseStripeTest {
  public static MockWebServer server;

  @BeforeEach
  void setUp() throws IOException {
    server = new MockWebServer();
    server.start();
    Stripe.overrideApiBase(server.url("").toString());
  }

  @AfterEach
  void tearDown() throws IOException {
    server.shutdown();
  }

  @Test
  public void testFormEncoding() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final ApiMode apiMode = ApiMode.STANDARD;

    final RawRequestOptions options = RawRequestOptions.builder().setApiMode(apiMode).build();

    assertEquals(apiMode, options.getApiMode());

    final StripeResponse response =
        Stripe.rawRequest(ApiResource.RequestMethod.POST, "/v1/customers", "description=test+customer", options);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    RecordedRequest request = server.takeRequest();
    assertEquals(
        "application/x-www-form-urlencoded;charset=UTF-8", request.getHeader("Content-Type"));
    assertEquals("description=test+customer", request.getBody().readUtf8());

    Customer customer = (Customer) Stripe.deserialize(response.body());
    assertTrue(customer.getId().startsWith("cus_"));
    assertEquals("test customer", customer.getDescription());
  }

  @Test
  public void testJsonEncoding() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));
    final ApiMode apiMode = ApiMode.PREVIEW;
    final RawRequestOptions options = RawRequestOptions.builder().setApiMode(apiMode).build();

    assertEquals(apiMode, options.getApiMode());

    final StripeResponse response =
        Stripe.rawRequest(
            ApiResource.RequestMethod.POST, "/v1/subscription_schedules", "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}", options);

    RecordedRequest request = server.takeRequest();
    assertEquals("application/json", request.getHeader("Content-Type"));
    assertEquals(
        "{\"end_behavior\":\"release\",\"phases\":[{\"items\":[{\"quantity\":1,\"price\":\"price_123\"}],\"iterations\":12}],\"customer\":\"cus_123\",\"start_date\":1683338558}",
        request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }

  @Test
  public void testJsonEncodingComplexParams() throws StripeException, InterruptedException {
    server.enqueue(
        new MockResponse()
            .setBody(
                "{\"id\": \"cus_123\",\n  \"object\": \"customer\",\n  \"description\": \"test customer\"}"));

    final ApiMode apiMode = ApiMode.PREVIEW;
    final RawRequestOptions options = RawRequestOptions.builder().setApiMode(apiMode).build();

    assertEquals(apiMode, options.getApiMode());

    final StripeResponse response =
        Stripe.rawRequest(ApiResource.RequestMethod.POST, "/v1/customers", "{\"description\":\"test customer\"}", options);

    RecordedRequest request = server.takeRequest();
    assertEquals("application/json", request.getHeader("Content-Type"));
    assertEquals("{\"description\":\"test customer\"}", request.getBody().readUtf8());

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);

    Customer customer = (Customer) Stripe.deserialize(response.body());
    assertTrue(customer.getId().startsWith("cus_"));
    assertEquals("test customer", customer.getDescription());
  }

  @Test
  public void testAdditionalHeaders() throws StripeException, InterruptedException {
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
        Stripe.rawRequest(ApiResource.RequestMethod.GET, "/v1/customers", null, options);

    RecordedRequest request = server.takeRequest();
    assertEquals("bar", request.getHeader("foo"));

    assertNotNull(response);
    assertEquals(200, response.code());
    assertTrue(response.body().length() > 0);
  }
}
