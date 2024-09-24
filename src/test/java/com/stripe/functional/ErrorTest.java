package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.model.Balance;
import com.stripe.model.StripeError;
import com.stripe.net.*;
import java.io.IOException;
import java.util.Collections;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class ErrorTest extends BaseStripeTest {
  @Test
  public void testStripeError() throws StripeException, IOException, InterruptedException {
    InvalidRequestException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        400,
                        HttpHeaders.of(Collections.emptyMap()),
                        getResourceAsString("/api_fixtures/error_invalid_request.json")))
        .when(httpClientSpy)
        .request(Mockito.any());
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
  public void testV2OutboundPaymentInsufficientFundsError()
      throws StripeException, IOException, InterruptedException {
    TemporarySessionExpiredException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        400,
                        HttpHeaders.of(Collections.emptyMap()),
                        getResourceAsString(
                            "/api_fixtures/error_v2_outbound_payment_insufficient_funds.json")))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (TemporarySessionExpiredException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(TemporarySessionExpiredException.class, exception);
    assertInstanceOf(com.stripe.model.StripeError.class, exception.getStripeError());
    assertEquals(
        "Session expired",
        exception.getMessage());
  }

  @Test
  public void testV2InvalidErrorEmpty() throws StripeException, IOException, InterruptedException {
    ApiException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation -> new StripeResponse(404, HttpHeaders.of(Collections.emptyMap()), "{}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (ApiException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(ApiException.class, exception);
    assertNull(exception.getStripeError());
    assertNull(exception.getUserMessage());
    assertEquals("Unrecognized error type '<no_type>'; code: <no_code>", exception.getMessage());
  }

  @Test
  public void testV2UnknownExceptionValidError()
      throws StripeException, IOException, InterruptedException {
    ApiException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        400,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"ceci_nest_pas_une_error_type\", \"code\": \"some_error_code\", \"message\": \"good luck debugging this one\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (ApiException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(ApiException.class, exception);
    assertInstanceOf(StripeError.class, exception.getStripeError());
    assertNull(exception.getUserMessage());
    assertEquals("good luck debugging this one; code: some_error_code", exception.getMessage());
  }

  @Test
  public void testOAuthError() throws StripeException, IOException, InterruptedException {
    String oldBase = Stripe.getConnectBase();
    try {
      InvalidClientException exception = null;
      @Cleanup MockWebServer server = new MockWebServer();
      server.enqueue(
          new MockResponse()
              .setResponseCode(401)
              .setBody(getResourceAsString("/oauth_fixtures/error_invalid_client.json")));

      Stripe.overrideConnectBase(server.url("").toString());

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
    } finally {
      Stripe.overrideConnectBase(oldBase);
    }
  }
}
