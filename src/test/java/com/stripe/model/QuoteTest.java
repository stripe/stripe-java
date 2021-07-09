package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class QuoteTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/quotes/qt_123");
    final Quote quote = ApiResource.GSON.fromJson(data, Quote.class);
    assertNotNull(quote);
    assertNotNull(quote.getId());
    assertEquals("quote", quote.getObject());
  }
}
