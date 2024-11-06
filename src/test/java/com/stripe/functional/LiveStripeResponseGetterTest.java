package com.stripe.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.ApiException;
import com.stripe.exception.IdempotencyException;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import com.stripe.model.oauth.OAuthError;
import com.stripe.net.ApiResource;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpHeaders;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.util.Collections;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LiveStripeResponseGetterTest extends BaseStripeTest {
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
        new StripeResponse(
            400,
            HttpHeaders.of(Collections.emptyMap()),
            "I am not JSON :)");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    assertThrows(
        StripeException.class,
        () -> {
          Subscription.retrieve("sub_123");
        });
      }
}
