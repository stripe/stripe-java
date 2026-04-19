package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class StripeObjectTest {

  private static final class DecimalStripeObject extends StripeObject {
    BigDecimal amount;
  }

  @Test
  public void toJsonSerializesBigDecimalAsString() {
    DecimalStripeObject object = new DecimalStripeObject();
    object.amount = new BigDecimal("25.50");

    String json = object.toJson();

    JsonObject parsed = JsonParser.parseString(json).getAsJsonObject();
    assertTrue(parsed.get("amount").isJsonPrimitive());
    assertTrue(parsed.get("amount").getAsJsonPrimitive().isString());
    assertEquals("25.50", parsed.get("amount").getAsString());
  }
}
