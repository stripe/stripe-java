package com.stripe.model;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CardTest extends BaseStripeTest {
  Card card;

  @Before
  public void deserialize() throws IOException {
    String json = resource("card.json");
    card = APIResource.GSON.fromJson(json, Card.class);
  }

  @Test
  public void testDeserialize() throws IOException {
    assertEquals("bypassed", card.getThreeDSecure().getStatus());
  }
}
