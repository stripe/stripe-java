package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.model.Balance;
import com.stripe.model.StripeError;
import com.stripe.net.*;
import com.stripe.net.ApiMode;
import java.io.IOException;
import java.util.Collections;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class ErrorTest extends BaseStripeTest {

  // ==================== V1 Error Tests ====================

  @Test
  public void testV1Error400InvalidRequest() throws StripeException, IOException, InterruptedException {
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
    assertEquals(ApiMode.V1, exception.getStripeErrorApiMode());
  }

  @Test
  public void testV1Error400IdempotencyError()
      throws StripeException, IOException, InterruptedException {
    IdempotencyException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        400,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"idempotency_error\", \"code\": \"idempotency_key_in_use\", \"message\": \"Keys for idempotent requests can only be used with the same parameters.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (IdempotencyException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(IdempotencyException.class, exception);
    assertEquals(Integer.valueOf(400), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
    assertEquals("idempotency_error", exception.getStripeError().getType());
  }

  @Test
  public void testV1Error401Authentication()
      throws StripeException, IOException, InterruptedException {
    AuthenticationException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        401,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"invalid_request_error\", \"code\": \"api_key_expired\", \"message\": \"Expired API Key provided.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (AuthenticationException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(AuthenticationException.class, exception);
    assertEquals(Integer.valueOf(401), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV1Error402CardError() throws StripeException, IOException, InterruptedException {
    CardException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        402,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"card_error\", \"code\": \"card_declined\", \"message\": \"Your card was declined.\", \"decline_code\": \"generic_decline\", \"param\": \"card_number\", \"charge\": \"ch_123\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (CardException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(CardException.class, exception);
    assertEquals(Integer.valueOf(402), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
    assertEquals("generic_decline", exception.getDeclineCode());
    assertEquals("ch_123", exception.getCharge());
  }

  @Test
  public void testV1Error403Permission()
      throws StripeException, IOException, InterruptedException {
    PermissionException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        403,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"invalid_request_error\", \"code\": \"api_key_permissions\", \"message\": \"The API key does not have permission to perform this action.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (PermissionException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(PermissionException.class, exception);
    assertEquals(Integer.valueOf(403), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV1Error404InvalidRequest()
      throws StripeException, IOException, InterruptedException {
    InvalidRequestException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        404,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"invalid_request_error\", \"code\": \"resource_missing\", \"message\": \"No such customer: cus_nonexistent\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (InvalidRequestException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(InvalidRequestException.class, exception);
    assertEquals(Integer.valueOf(404), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV1Error429RateLimit()
      throws StripeException, IOException, InterruptedException {
    RateLimitException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        429,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"rate_limit_error\", \"code\": \"rate_limit\", \"message\": \"Too many requests hit the API too quickly.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (RateLimitException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(RateLimitException.class, exception);
    assertEquals(Integer.valueOf(429), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV1Error500ApiError() throws StripeException, IOException, InterruptedException {
    ApiException exception = null;
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        500,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"api_error\", \"message\": \"An unexpected error occurred.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());
    try {
      Balance.retrieve();
    } catch (ApiException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(ApiException.class, exception);
    assertEquals(Integer.valueOf(500), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  // ==================== V2 Error Tests ====================

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
    assertEquals("Session expired", exception.getStripeError().getMessage());
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
    assertTrue(exception.getMessage().contains("Invalid response object from API: {}. (HTTP response code was 404)"));
  }

  @Test
  public void testV2UnknownExceptionValidError()
      throws StripeException, IOException, InterruptedException {
    Exception exception = null;
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
    } catch (Exception e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(InvalidRequestException.class, exception);
    InvalidRequestException apiException = (InvalidRequestException) exception;
    assertInstanceOf(StripeError.class, apiException.getStripeError());
    assertNull(apiException.getUserMessage());
    assertEquals("good luck debugging this one; code: some_error_code", apiException.getMessage());
    assertEquals(ApiMode.V2, apiException.getStripeErrorApiMode());
  }

  @Test
  public void testV2Error400IdempotencyError()
      throws StripeException, IOException, InterruptedException {
    IdempotencyException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        400,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"idempotency_error\", \"code\": \"idempotency_key_in_use\", \"message\": \"Keys for idempotent requests can only be used with the same parameters.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (IdempotencyException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(IdempotencyException.class, exception);
    assertEquals(Integer.valueOf(400), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
    assertEquals("idempotency_error", exception.getStripeError().getType());
  }

  @Test
  public void testV2Error401Authentication()
      throws StripeException, IOException, InterruptedException {
    AuthenticationException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        401,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"unknown_v2_type\", \"code\": \"api_key_expired\", \"message\": \"Expired API Key provided.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (AuthenticationException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(AuthenticationException.class, exception);
    assertEquals(Integer.valueOf(401), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV2Error402CardError()
      throws StripeException, IOException, InterruptedException {
    CardException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        402,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"unknown_v2_type\", \"code\": \"card_declined\", \"message\": \"Your card was declined.\", \"decline_code\": \"generic_decline\", \"param\": \"card_number\", \"charge\": \"ch_123\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (CardException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(CardException.class, exception);
    assertEquals(Integer.valueOf(402), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
    assertEquals("generic_decline", exception.getDeclineCode());
    assertEquals("ch_123", exception.getCharge());
  }

  @Test
  public void testV2Error403Permission()
      throws StripeException, IOException, InterruptedException {
    PermissionException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        403,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"unknown_v2_type\", \"code\": \"api_key_permissions\", \"message\": \"The API key does not have permission to perform this action.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (PermissionException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(PermissionException.class, exception);
    assertEquals(Integer.valueOf(403), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV2Error429RateLimit()
      throws StripeException, IOException, InterruptedException {
    RateLimitException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        429,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"unknown_v2_type\", \"code\": \"rate_limit\", \"message\": \"Too many requests hit the API too quickly.\"}}"))
        .when(httpClientSpy)
        .request(Mockito.any());

    Stripe.overrideApiBase(server.url("").toString());

    try {
      mockClient.v2().core().events().retrieve("event_123");
    } catch (RateLimitException e) {
      exception = e;
    }

    assertNotNull(exception);
    assertInstanceOf(RateLimitException.class, exception);
    assertEquals(Integer.valueOf(429), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  @Test
  public void testV2Error500ApiError()
      throws StripeException, IOException, InterruptedException {
    ApiException exception = null;
    @Cleanup MockWebServer server = new MockWebServer();
    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(
                        500,
                        HttpHeaders.of(Collections.emptyMap()),
                        "{\"error\": {\"type\": \"unknown_v2_type\", \"message\": \"An unexpected error occurred.\"}}"))
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
    assertEquals(Integer.valueOf(500), exception.getStatusCode());
    assertNotNull(exception.getStripeError());
  }

  // ==================== OAuth Error Tests ====================

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
