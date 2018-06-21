package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Review;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ReviewTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/review.json");
    final Review review = ApiResource.GSON.fromJson(json, Review.class);
    assertNotNull(review);
    assertNotNull(review.getId());
    assertEquals("review", review.getObject());
  }
}
