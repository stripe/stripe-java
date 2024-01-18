package com.stripe.functional;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StripeClientTest extends BaseStripeTest {

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
  public void testReportsStripeClientUsageTelemetry() throws StripeException {
    mockClient.customers().create();
    mockClient.customers().update("cus_xyz");
    verifyStripeRequest(
        (stripeRequest) -> {
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
          assertEquals("stripe_client", usage);
        });
  }

  @Test
  public void testReportsRawRequestUsageTelemetry() throws StripeException {
    mockClient.rawRequest(
        com.stripe.net.ApiResource.RequestMethod.POST, "/v1/customers", "description=foo", null);
    mockClient.rawRequest(
        com.stripe.net.ApiResource.RequestMethod.POST, "/v1/customers", "description=foo", null);
    verifyStripeRequest(
        (stripeRequest) -> {
          assert (stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").isPresent());
          JsonArray usage =
              new Gson()
                  .fromJson(
                      stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").get(),
                      JsonObject.class)
                  .get("last_request_metrics")
                  .getAsJsonObject()
                  .get("usage")
                  .getAsJsonArray();
          assertEquals(2, usage.size());
          assertEquals("stripe_client", usage.get(0).getAsString());
          assertEquals("raw_request", usage.get(1).getAsString());
        });
  }
}
