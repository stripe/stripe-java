package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.JsonObject;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class StripeErrorTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/error_invalid_request.json");
    final JsonObject jsonObject =
        ApiResource.GSON.fromJson(data, JsonObject.class).getAsJsonObject("error");
    final StripeError error = ApiResource.GSON.fromJson(jsonObject, StripeError.class);
    assertNotNull(error);
    assertEquals("parameter_unknown", error.getCode());
    assertEquals("https://stripe.com/docs/error-codes/parameter-unknown", error.getDocUrl());
    assertEquals("Received unknown parameter: foo", error.getMessage());
    assertEquals("foo", error.getParam());
    assertEquals("invalid_request_error", error.getType());
  }
}
