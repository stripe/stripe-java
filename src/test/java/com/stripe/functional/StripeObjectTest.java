package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import org.junit.jupiter.api.Test;

public class StripeObjectTest extends BaseStripeTest {
  @Test
  public void testGetRawJsonObject() throws StripeException {
    final Subscription subscription = Subscription.retrieve("sub_123");

    // Access `id`, a string element
    assertEquals(
        subscription.getId(),
        subscription.getRawJsonObject().getAsJsonPrimitive("id").getAsString());

    // Access `created`, a number element
    assertEquals(
        subscription.getCreated(),
        subscription.getRawJsonObject().getAsJsonPrimitive("created").getAsLong());

    // Access `items[data][0][id]`, a deeply nested string element
    assertEquals(
        subscription.getItems().getData().get(0).getId(),
        subscription
            .getRawJsonObject()
            .getAsJsonObject("items")
            .getAsJsonArray("data")
            .get(0)
            .getAsJsonObject()
            .getAsJsonPrimitive("id")
            .getAsString());
  }
}
