package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.*;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.util.HashMap;
import java.util.Map;
import lombok.Cleanup;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest extends BaseStripeTest {
  @Test
  public void testApiVersion() throws StripeException {
    final RequestOptions options = RequestOptions.builder().build();
    assertEquals(Stripe.API_VERSION, options.getStripeVersion());
    assertNull(RequestOptions.unsafeGetStripeVersionOverride(options));

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    // stripe-mock doesn't send back a Stripe-Version header in the response.
    // assertEquals(Stripe.API_VERSION, response.headers().get("Stripe-Version"));
  }

  @Test
  public void testIdempotencyKey() throws StripeException {
    final String idempotencyKey = "824d3177-9a1c-4124-a888-2c2fbd5f953a";

    final RequestOptions options =
        RequestOptions.builder().setIdempotencyKey(idempotencyKey).build();

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    assertEquals(idempotencyKey, response.idempotencyKey());
  }

  static class MyResource extends ApiResource {
    @SerializedName("id")
    String id;

    public static MyResource myMethod(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      return getGlobalResponseGetter()
          .request(
              new ApiRequest(
                  BaseAddress.FILES,
                  ApiResource.RequestMethod.POST,
                  "/v1/foo/bar",
                  params,
                  options),
              MyResource.class);
    }
  }

  @Test
  public void testBaseUrl() throws Exception {
    @Cleanup MockWebServer serverDefault = new MockWebServer();

    serverDefault.enqueue(new MockResponse().setBody("{\"id\": \"default\"}"));
    serverDefault.start();
    Stripe.overrideUploadBase(serverDefault.url("").toString());
    MyResource r1 = MyResource.myMethod(new HashMap<>(), RequestOptions.builder().build());
    serverDefault.takeRequest();
    assertEquals("default", r1.id);
    serverDefault.shutdown();

    @Cleanup MockWebServer serverOverride = new MockWebServer();
    serverOverride.enqueue(new MockResponse().setBody("{\"id\": \"override\"}"));
    serverOverride.start();
    MyResource r2 =
        MyResource.myMethod(
            new HashMap<>(),
            RequestOptions.builder().setBaseUrl(serverOverride.url("").toString()).build());
    serverOverride.takeRequest();
    assertEquals("override", r2.id);
    serverOverride.shutdown();
  }

  @Test
  public void testSendsUsageOnUnsafeSetStripeVersionOverride() throws StripeException {
    boolean originalTelemetry = Stripe.enableTelemetry;
    Stripe.enableTelemetry = true;

    RequestOptions options =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(RequestOptions.builder(), "2012-12-21")
            .build();

    Balance.retrieve(options);
    Balance.retrieve(options);

    verifyStripeRequest(
        stripeRequest -> {
          assert (stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").isPresent());
          String usage =
              new Gson()
                  .fromJson(
                      stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").get(),
                      JsonObject.class)
                  .get("last_request_metrics")
                  .getAsJsonObject()
                  .get("usage")
                  .getAsString();
          assertEquals("unsafe_stripe_version_override", usage);
        });

    Stripe.enableTelemetry = originalTelemetry;
  }
}
