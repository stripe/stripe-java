package com.stripe.functional;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.ApiResource;
import com.stripe.net.ClientTelemetryPayload;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TelemetryTest extends BaseStripeTest {
  @Test
  public void testTelemetryEnabled() throws StripeException, IOException, InterruptedException {
    MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_1").setBodyDelay(30, TimeUnit.MILLISECONDS));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_2").setBodyDelay(70, TimeUnit.MILLISECONDS));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_3"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());
    Stripe.enableTelemetry = true;

    Balance b1 = Balance.retrieve();
    RecordedRequest request1 = server.takeRequest();
    assertNull(request1.getHeader("X-Stripe-Client-Telemetry"));

    Balance b2 = Balance.retrieve();
    RecordedRequest request2 = server.takeRequest();
    String telemetry1 = request2.getHeader("X-Stripe-Client-Telemetry");
    ClientTelemetryPayload payload1 = ApiResource.GSON.fromJson(telemetry1, ClientTelemetryPayload.class);
    assertEquals(payload1.lastRequestMetrics.requestId, "req_1");
    assertTrue(payload1.lastRequestMetrics.requestDurationMs > 30);
    assertTrue(payload1.lastRequestMetrics.requestDurationMs < 60);

    Balance b3 = Balance.retrieve();
    RecordedRequest request3 = server.takeRequest();
    String telemetry2 = request3.getHeader("X-Stripe-Client-Telemetry");
    ClientTelemetryPayload payload2 = ApiResource.GSON.fromJson(telemetry2, ClientTelemetryPayload.class);
    assertEquals(payload2.lastRequestMetrics.requestId, "req_2");
    assertTrue(payload2.lastRequestMetrics.requestDurationMs > 70);
    assertTrue(payload2.lastRequestMetrics.requestDurationMs < 100);

    server.shutdown();
  }

  @Test
  public void testTelemetryDisabled() throws StripeException, IOException, InterruptedException {
    MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_1"));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_2"));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_3"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());
    Stripe.enableTelemetry = false;

    Balance b1 = Balance.retrieve();
    RecordedRequest request1 = server.takeRequest();
    assertNull(request1.getHeader("X-Stripe-Client-Telemetry"));

    Balance b2 = Balance.retrieve();
    RecordedRequest request2 = server.takeRequest();
    assertNull(request2.getHeader("X-Stripe-Client-Telemetry"));

    server.shutdown();
  }
}
