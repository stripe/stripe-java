package com.stripe.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.JsonObject;
import com.stripe.BaseStripeTest;
import com.stripe.model.StripeError;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class StripeExceptionTest extends BaseStripeTest {

  @Test
  public void testSetStripeError() throws IOException {
    final String data = getResourceAsString("/api_fixtures/error_invalid_request.json");
    final JsonObject jsonObject =
        ApiResource.GSON.fromJson(data, JsonObject.class).getAsJsonObject("error");
    final StripeError error = ApiResource.GSON.fromJson(jsonObject, StripeError.class);
    error.setUserMessage("it broke");

    StripeException exception =
        new StripeException(error.getMessage(), "1234", error.getCode(), 400) {};

    exception.setStripeError(error);

    assertNotNull(exception.getStripeError());
    assertEquals(ApiMode.V1, exception.getStripeErrorApiMode());

    assertEquals("parameter_unknown", exception.getCode());
    assertEquals(
        "Received unknown parameter: foo; code: parameter_unknown; request-id: 1234",
        exception.getMessage());
    // v1 errors don't have user messages
    assertEquals(null, exception.getUserMessage());
  }

  @Test
  public void testSetStripeV2Error() throws IOException {
    final String data = getResourceAsString("/api_fixtures/error_invalid_request.json");
    final JsonObject jsonObject =
        ApiResource.GSON.fromJson(data, JsonObject.class).getAsJsonObject("error");
    final StripeError error = ApiResource.GSON.fromJson(jsonObject, StripeError.class);
    StripeException exception =
        new StripeException(error.getMessage(), "1234", error.getCode(), 400) {};
    error.setUserMessage("it broke");

    exception.setStripeV2Error(error);

    assertNotNull(exception.getStripeError());
    assertEquals(ApiMode.V2, exception.getStripeErrorApiMode());

    assertNotNull(error);
    assertEquals("parameter_unknown", exception.getCode());
    assertEquals(
        "Received unknown parameter: foo; code: parameter_unknown; request-id: 1234; user-message: it broke",
        exception.getMessage());
    assertEquals("it broke", exception.getUserMessage());
  }
}
