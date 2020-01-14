package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.withSettings;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.StripeException;
import java.net.ConnectException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HttpClientTest extends BaseStripeTest {
  private HttpClient client;

  private StripeRequest request;

  @BeforeEach
  public void setUpFixtures() throws StripeException {
    this.client =
        Mockito.mock(
            HttpClient.class,
            withSettings().useConstructor(2).defaultAnswer(Mockito.CALLS_REAL_METHODS));
    this.client.networkRetriesSleep = false;

    this.request =
        new StripeRequest(ApiResource.RequestMethod.GET, "http://example.com/get", null, null);
  }

  @Test
  public void testRequestWithRetriesConnectException() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenThrow(new ApiConnectionException("foo", new ConnectException("timeout or something")))
        .thenReturn(new StripeResponse(200, "{}"));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertEquals(1, response.numRetries());
  }

  @Test
  public void testRequestWithRetriesConnectExceptionRethrowAfterAllAttempts()
      throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenThrow(new ApiConnectionException("1", new ConnectException("timeout 1")))
        .thenThrow(new ApiConnectionException("2", new ConnectException("timeout 2")))
        .thenThrow(new ApiConnectionException("3", new ConnectException("timeout 3")));

    ApiConnectionException e =
        assertThrows(
            ApiConnectionException.class,
            () -> {
              this.client.requestWithRetries(this.request);
            });
    assertEquals("3", e.getMessage());
    assertNotNull(e.getCause());
    assertTrue(e.getCause() instanceof ConnectException);
    assertEquals("timeout 3", e.getCause().getMessage());
  }

  @Test
  public void testRequestWithRetriesStripeShouldRetryTrue() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenReturn(
            new StripeResponse(
                400, "{}", ImmutableMap.of("Stripe-Should-Retry", ImmutableList.of("true"))))
        .thenReturn(new StripeResponse(200, "{}"));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertEquals(1, response.numRetries());
  }

  @Test
  public void testRequestWithRetriesStripeShouldRetryFalse() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenReturn(
            new StripeResponse(
                400, "{}", ImmutableMap.of("Stripe-Should-Retry", ImmutableList.of("false"))));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(400, response.code());
    assertEquals(0, response.numRetries());
  }

  @Test
  public void testRequestWithRetriesConflict() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenReturn(new StripeResponse(409, "{}"))
        .thenReturn(new StripeResponse(200, "{}"));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertEquals(1, response.numRetries());
  }

  @Test
  public void testRequestWithRetriesConflictServiceUnavailable() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenReturn(new StripeResponse(503, "{}"))
        .thenReturn(new StripeResponse(200, "{}"));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertEquals(1, response.numRetries());
  }

  @Test
  public void testRequestWithRetriesConflictInternalServerError() throws StripeException {
    Mockito.when(this.client.request(this.request))
        .thenReturn(new StripeResponse(500, "{}"))
        .thenReturn(new StripeResponse(200, "{}"));

    StripeResponse response = this.client.requestWithRetries(this.request);

    assertNotNull(response);
    assertEquals(200, response.code());
    assertEquals(1, response.numRetries());
  }
}
