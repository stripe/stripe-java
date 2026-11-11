package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.exception.StripeException;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.Test;

public class HttpURLConnectionClientTest {
  private final HttpURLConnectionClient client = new HttpURLConnectionClient();

  @Test
  public void requestWithBareCrInHeaderIsRejected() {
    assertThrowsOnHeaderValue("event=evt_123\rInjected-Header: pwned");
  }

  @Test
  public void requestWithBareLfInHeaderIsRejected() {
    assertThrowsOnHeaderValue("event=evt_123\nInjected-Header: pwned");
  }

  @Test
  public void requestWithCrlfInHeaderIsRejected() {
    assertThrowsOnHeaderValue("event=evt_123\r\nInjected-Header: pwned");
  }

  @Test
  public void requestWithNulByteInHeaderIsRejected() {
    assertThrowsOnHeaderValue("event=evt_123\0Injected: pwned");
  }

  @Test
  public void requestWithOrdinaryHeaderValueSucceeds() throws Exception {
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{}"));
    server.start();

    StripeRequest request = buildRequest(server.url("/test").toString(), "event=evt_123");
    StripeResponse response = client.request(request);

    assertEquals(200, response.code());
    RecordedRequest recorded = server.takeRequest();
    assertEquals("event=evt_123", recorded.getHeader("Stripe-Request-Trigger"));
  }

  private void assertThrowsOnHeaderValue(String headerValue) {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          try {
            // No server needs to be running: the check runs before HttpURLConnection attempts
            // to connect, so a rejected value never gets as far as opening a socket.
            StripeRequest request = buildRequest("http://127.0.0.1:1/test", headerValue);
            client.request(request);
          } catch (StripeException e) {
            throw new AssertionError(e);
          }
        });
  }

  private static StripeRequest buildRequest(String url, String triggerHeaderValue)
      throws StripeException {
    RequestOptions options =
        RequestOptions.builder()
            .setApiKey("sk_test_123")
            .setStripeRequestTrigger(triggerHeaderValue)
            .setConnectTimeout(2000)
            .setReadTimeout(2000)
            .build();
    return StripeRequest.create(ApiResource.RequestMethod.GET, url, null, options, ApiMode.V1);
  }
}
