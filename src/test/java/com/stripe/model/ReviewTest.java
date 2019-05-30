package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ReviewTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/reviews/prv_123");
    final Review review = ApiResource.GSON.fromJson(data, Review.class);
    assertNotNull(review);
    assertNotNull(review.getId());
    assertEquals("review", review.getObject());
  }
}
