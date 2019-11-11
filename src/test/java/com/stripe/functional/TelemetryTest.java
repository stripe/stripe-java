package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.Test;

public class TelemetryTest extends BaseStripeTest {
  @Test
  public void testTelemetryEnabled() throws StripeException, IOException, InterruptedException {
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(
        new MockResponse()
            .setBody("{}")
            .addHeader("Request-Id", "req_1")
            .setBodyDelay(30, TimeUnit.MILLISECONDS));
    server.enqueue(
        new MockResponse()
            .setBody("{}")
            .addHeader("Request-Id", "req_2")
            .setBodyDelay(120, TimeUnit.MILLISECONDS));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_3"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());
    Stripe.enableTelemetry = true;

    Balance.retrieve();
    server.takeRequest();
    // The first request may or may not include a `X-Stripe-Client-Telemetry` header depending on
    // whether this test is the first to run or not. So we don't test the presence or absence of
    // the header for the first request.
    // Ideally we'd have a way of emptying the request metrics queue, but it's private and I don't
    // want to make it public just for tests.

    Balance.retrieve();
    RecordedRequest request2 = server.takeRequest();
    String telemetry1 = request2.getHeader("X-Stripe-Client-Telemetry");
    assertNotNull(telemetry1);
    JsonObject requestMetrics1 =
        JsonParser.parseString(telemetry1)
            .getAsJsonObject()
            .get("last_request_metrics")
            .getAsJsonObject();
    String requestId1 = requestMetrics1.get("request_id").getAsString();
    Long requestDurationMs1 = requestMetrics1.get("request_duration_ms").getAsLong();
    assertEquals("req_1", requestId1);
    assertTrue(requestDurationMs1 > 30);

    Balance.retrieve();
    RecordedRequest request3 = server.takeRequest();
    String telemetry2 = request3.getHeader("X-Stripe-Client-Telemetry");
    assertNotNull(telemetry2);
    JsonObject requestMetrics2 =
        JsonParser.parseString(telemetry2)
            .getAsJsonObject()
            .get("last_request_metrics")
            .getAsJsonObject();
    String requestId2 = requestMetrics2.get("request_id").getAsString();
    Long requestDurationMs2 = requestMetrics2.get("request_duration_ms").getAsLong();
    assertEquals("req_2", requestId2);
    assertTrue(requestDurationMs2 > 30);

    server.shutdown();
  }

  @Test
  public void testTelemetryDisabled() throws StripeException, IOException, InterruptedException {
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_1"));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_2"));
    server.enqueue(new MockResponse().setBody("{}").addHeader("Request-Id", "req_3"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());
    Stripe.enableTelemetry = false;

    Balance.retrieve();
    RecordedRequest request1 = server.takeRequest();
    assertNull(request1.getHeader("X-Stripe-Client-Telemetry"));

    Balance.retrieve();
    RecordedRequest request2 = server.takeRequest();
    assertNull(request2.getHeader("X-Stripe-Client-Telemetry"));

    server.shutdown();
  }

  @Test
  public void testTelemetryWorksWithConcurrentRequests() throws IOException, InterruptedException {
    @Cleanup MockWebServer server = new MockWebServer();

    for (int i = 0; i < 20; i++) {
      server.enqueue(
          new MockResponse()
              .setBody("{}")
              .addHeader("Request-Id", "req_" + i)
              .setBodyDelay(100, TimeUnit.MILLISECONDS));
    }
    server.start();

    Stripe.overrideApiBase(server.url("").toString());
    Stripe.enableTelemetry = true;

    Runnable work =
        new Runnable() {
          @Override
          public void run() {
            try {
              Balance.retrieve();
            } catch (StripeException e) {
              assertNull(e);
            }
          }
        };

    // the first 10 requests will not contain telemetry
    ArrayList<Thread> threads = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(work);
      threads.add(t);
      t.start();
    }
    for (int i = 0; i < 10; i++) {
      threads.get(i).join();
    }
    threads.clear();

    // the following 10 requests will contain telemetry
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(work);
      threads.add(t);
      t.start();
    }
    for (int i = 0; i < 10; i++) {
      threads.get(i).join();
    }

    Set<String> seenRequestIds = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      RecordedRequest request = server.takeRequest();
      assertNull(
          request.getHeader("X-Stripe-Client-Telemetry"),
          String.format("Expected telemetry header to be absent for request #%d", i));
    }

    for (int i = 0; i < 10; i++) {
      RecordedRequest request = server.takeRequest();
      String telemetry = request.getHeader("X-Stripe-Client-Telemetry");
      assertNotNull(telemetry);
      JsonObject requestMetrics =
          JsonParser.parseString(telemetry)
              .getAsJsonObject()
              .get("last_request_metrics")
              .getAsJsonObject();
      String requestId = requestMetrics.get("request_id").getAsString();
      seenRequestIds.add(requestId);
    }

    // check that each telemetry payload corresponds to a unique request id
    assertEquals(10, seenRequestIds.size());

    server.shutdown();
  }
}
