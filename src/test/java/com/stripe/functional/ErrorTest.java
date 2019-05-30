package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.model.Balance;
import com.stripe.net.OAuth;
import java.io.IOException;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

public class ErrorTest extends BaseStripeTest {
  @Test
  public void testStripeError() throws StripeException, IOException, InterruptedException {
    InvalidRequestException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(
        new MockResponse()
            .setResponseCode(400)
            .setBody(getResourceAsString("/api_fixtures/error_invalid_request.json")));

    Stripe.overrideApiBase(server.url("").toString());

    try {
      Balance.retrieve();
    } catch (InvalidRequestException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertEquals(Integer.valueOf(400), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
    assertEquals("invalid_request_error", exception.getStripeError().getType());
    assertNotNull(exception.getStripeError().getLastResponse());
  }

  @Test
  public void testOAuthError() throws StripeException, IOException, InterruptedException {
    InvalidClientException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(
        new MockResponse()
            .setResponseCode(401)
            .setBody(getResourceAsString("/oauth_fixtures/error_invalid_client.json")));

    Stripe.overrideApiBase(server.url("").toString());

    try {
      OAuth.token(null, null);
    } catch (InvalidClientException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertEquals(Integer.valueOf(401), exception.getStatusCode());
    assertNotNull(exception.getOauthError());
    assertEquals("invalid_client", exception.getOauthError().getError());
    assertNotNull(exception.getOauthError().getLastResponse());
  }
}
