package com.stripe.model.issuing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import org.junit.Test;

public class CardDetailsTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final CardDetails cardDetails = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/issuing/card_details.json"), CardDetails.class);

    assertNotNull(cardDetails);
    assertEquals("issuing.card_details", cardDetails.getObject());
    assertNotNull(cardDetails.getCardObject());
    assertEquals("issuing.card", cardDetails.getCardObject().getObject());
  }
}