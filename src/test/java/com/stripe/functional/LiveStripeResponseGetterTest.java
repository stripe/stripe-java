package com.stripe.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.ApiException;
import com.stripe.exception.IdempotencyException;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpHeaders;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LiveStripeResponseGetterTest extends BaseStripeTest {
  private Logger stripeLogger;
  private CapturingHandler logHandler;

  private static class CapturingHandler extends Handler {
    final List<LogRecord> records = new ArrayList<>();

    @Override
    public void publish(LogRecord record) {
      records.add(record);
    }

    @Override
    public void flush() {}

    @Override
    public void close() {}
  }

  @BeforeEach
  public void setUpLogger() {
    stripeLogger = Logger.getLogger("Stripe");
    logHandler = new CapturingHandler();
    logHandler.setLevel(Level.ALL);
    stripeLogger.addHandler(logHandler);
    stripeLogger.setLevel(Level.ALL);
    stripeLogger.setUseParentHandlers(false);
  }

  @AfterEach
  public void tearDownLogger() {
    stripeLogger.removeHandler(logHandler);
    stripeLogger.setUseParentHandlers(true);
  }

  @Test
  public void testStripeNoticeHeaderEmitsWarning() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setGlobalResponseGetter(srg);
    StripeResponse response =
        new StripeResponse(
            200,
            HttpHeaders.of(
                ImmutableMap.of(
                    "Stripe-Notice",
                    ImmutableList.of("This API version will be deprecated soon."))),
            "{\"id\": \"sub_123\", \"object\": \"subscription\"}");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    Subscription.retrieve("sub_123");

    assertEquals(1, logHandler.records.size());
    assertEquals(Level.WARNING, logHandler.records.get(0).getLevel());
    assertEquals(
        "This API version will be deprecated soon.", logHandler.records.get(0).getMessage());
  }

  @Test
  public void testNoStripeNoticeHeaderEmitsNoWarning() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setGlobalResponseGetter(srg);
    StripeResponse response =
        new StripeResponse(
            200,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"id\": \"sub_123\", \"object\": \"subscription\"}");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    Subscription.retrieve("sub_123");

    assertTrue(logHandler.records.isEmpty());
  }

  @Test
  public void testInvalidJson() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setGlobalResponseGetter(srg);
    StripeResponse response =
        new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), "invalid JSON");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    Exception exception =
        assertThrows(
            ApiException.class,
            () -> {
              Subscription.retrieve("sub_123");
            });
    assertThat(
        exception.getMessage(), CoreMatchers.containsString("Invalid response object from API"));
    assertNotNull(exception.getCause());
    assertThat(exception.getCause(), CoreMatchers.instanceOf(JsonSyntaxException.class));
  }

  @Test
  public void testIdempotencyError() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setGlobalResponseGetter(srg);
    StripeResponse response =
        new StripeResponse(
            400,
            HttpHeaders.of(Collections.emptyMap()),
            "{\"error\": {\"message\": \"idempotency\", \"type\": \"idempotency_error\"}}");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    Exception exception =
        assertThrows(
            IdempotencyException.class,
            () -> {
              Subscription.retrieve("sub_123");
            });
    assertThat(exception.getMessage(), CoreMatchers.containsString("idempotency"));
  }

  @Test
  public void testErrorWithJsonSyntaxException() throws Exception {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setGlobalResponseGetter(srg);
    StripeResponse response =
        new StripeResponse(400, HttpHeaders.of(Collections.emptyMap()), "I am not JSON :)");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    assertThrows(
        StripeException.class,
        () -> {
          Subscription.retrieve("sub_123");
        });
  }
}
