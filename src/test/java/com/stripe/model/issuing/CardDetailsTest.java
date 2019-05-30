package com.stripe.model.issuing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class CardDetailsTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final CardDetails cardDetails =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/issuing/card_details.json"), CardDetails.class);

    assertNotNull(cardDetails);
    assertEquals("issuing.card_details", cardDetails.getObject());
    assertNotNull(cardDetails.getCard());
    assertEquals("issuing.card", cardDetails.getCard().getObject());
  }
}
