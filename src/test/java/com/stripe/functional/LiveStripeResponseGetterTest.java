package com.stripe.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.ApiException;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpHeaders;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerUpdateParams;
import java.util.Collections;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LiveStripeResponseGetterTest extends BaseStripeTest {

  @Test
  public void testInvalidJson() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setStripeResponseGetter(srg);
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

  private Boolean originalTelemetry;

  @BeforeEach
  public void setUp() {
    this.originalTelemetry = Stripe.enableTelemetry;
    Stripe.enableTelemetry = true;
  }

  @AfterEach
  public void tearDown() {
    Stripe.enableTelemetry = originalTelemetry;
  }

  @Test
  public void testGlobalClientTelemetryTest() throws StripeException {
    StripeResponseGetter responseGetterSpy =
        Mockito.spy(new LiveStripeResponseGetter(null, httpClientSpy));
    // We need to explicitly override the ApiResource.responseGetter = networkSpy that's set
    // in BaseStripeTest. Unfortunately, BaseStripeTest shares the response getter spy across
    // StripeClient and the Global Client, and so the global client will erroneously report stripe
    // client usage.
    ApiResource.setStripeResponseGetter(responseGetterSpy);
    Customer cus = Customer.create(CustomerCreateParams.builder().build());
    Mockito.reset(httpClientSpy);
    cus.update(CustomerUpdateParams.builder().setDescription("hello").build());
    Mockito.verify(httpClientSpy)
        .request(
            Mockito.argThat(
                stripeRequest -> {
                  JsonObject metrics =
                      new Gson()
                          .fromJson(
                              stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").get(),
                              JsonObject.class)
                          .get("last_request_metrics")
                          .getAsJsonObject();
                  return !metrics.has("usage") && metrics.has("request_duration_ms");
                }));
  }
}
